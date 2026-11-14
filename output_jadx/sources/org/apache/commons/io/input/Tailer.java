package org.apache.commons.io.input;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.Duration;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.ThreadUtils;
import org.apache.commons.io.build.AbstractOrigin;
import org.apache.commons.io.build.AbstractOriginSupplier;
import org.apache.commons.io.build.AbstractStreamBuilder;
import org.apache.commons.io.file.PathUtils;
import org.apache.commons.io.file.attribute.FileTimes;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class Tailer implements Runnable, AutoCloseable {
    private static final Charset DEFAULT_CHARSET = Charset.defaultCharset();
    private static final int DEFAULT_DELAY_MILLIS = 1000;
    private static final boolean DEFAULT_IGNORE_TOUCH = false;
    private static final String RAF_READ_ONLY_MODE = "r";
    private final Charset charset;
    private final Duration delayDuration;
    private final boolean ignoreTouch;
    private final byte[] inbuf;
    private final TailerListener listener;
    private final boolean reOpen;
    private volatile boolean run;
    private final boolean tailFromEnd;
    private final Tailable tailable;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public interface RandomAccessResourceBridge extends Closeable {
        long getPointer();

        int read(byte[] bArr);

        void seek(long j10);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public interface Tailable {
        RandomAccessResourceBridge getRandomAccess(String str);

        boolean isNewer(FileTime fileTime);

        FileTime lastModifiedFileTime();

        long size();
    }

    private Tailer(Builder builder) {
        this.run = true;
        Tailable tailable = builder.tailable;
        Objects.requireNonNull(tailable, "tailable");
        this.tailable = tailable;
        TailerListener tailerListener = builder.tailerListener;
        Objects.requireNonNull(tailerListener, "listener");
        this.listener = tailerListener;
        this.delayDuration = builder.delayDuration;
        this.tailFromEnd = builder.tailFromEnd;
        this.inbuf = IOUtils.byteArray(builder.getBufferSize());
        tailerListener.init(this);
        this.reOpen = builder.reOpen;
        this.charset = builder.getCharset();
        this.ignoreTouch = builder.ignoreTouch;
    }

    public static Builder builder() {
        return new Builder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public static Tailer create(File file, Charset charset, TailerListener tailerListener, long j10, boolean z9, boolean z10, int i10) {
        Duration ofMillis;
        Builder charset2 = ((Builder) builder().setFile(file)).setTailerListener(tailerListener).setCharset(charset);
        ofMillis = Duration.ofMillis(j10);
        return charset2.setDelayDuration(ofMillis).setTailFromEnd(z9).setReOpen(z10).setBufferSize(i10).get();
    }

    private long readLines(RandomAccessResourceBridge randomAccessResourceBridge) {
        int read;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        try {
            long pointer = randomAccessResourceBridge.getPointer();
            long j10 = pointer;
            boolean z9 = false;
            while (getRun() && (read = randomAccessResourceBridge.read(this.inbuf)) != -1) {
                for (int i10 = 0; i10 < read; i10++) {
                    byte b10 = this.inbuf[i10];
                    if (b10 != 10) {
                        if (b10 != 13) {
                            if (z9) {
                                this.listener.handle(new String(byteArrayOutputStream.toByteArray(), this.charset));
                                byteArrayOutputStream.reset();
                                pointer = i10 + j10 + 1;
                                z9 = false;
                            }
                            byteArrayOutputStream.write(b10);
                        } else {
                            if (z9) {
                                byteArrayOutputStream.write(13);
                            }
                            z9 = true;
                        }
                    } else {
                        this.listener.handle(new String(byteArrayOutputStream.toByteArray(), this.charset));
                        byteArrayOutputStream.reset();
                        pointer = i10 + j10 + 1;
                        z9 = false;
                    }
                }
                j10 = randomAccessResourceBridge.getPointer();
            }
            randomAccessResourceBridge.seek(pointer);
            TailerListener tailerListener = this.listener;
            if (tailerListener instanceof TailerListenerAdapter) {
                ((TailerListenerAdapter) tailerListener).endOfFileReached();
            }
            byteArrayOutputStream.close();
            return pointer;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.run = false;
    }

    @Deprecated
    public long getDelay() {
        long millis;
        millis = this.delayDuration.toMillis();
        return millis;
    }

    public Duration getDelayDuration() {
        return this.delayDuration;
    }

    public File getFile() {
        File file;
        Tailable tailable = this.tailable;
        if (tailable instanceof TailablePath) {
            file = ((TailablePath) tailable).getPath().toFile();
            return file;
        }
        j1.i.l("Cannot extract java.io.File from ".concat(tailable.getClass().getName()));
        return null;
    }

    public boolean getRun() {
        return this.run;
    }

    public Tailable getTailable() {
        return this.tailable;
    }

    @Override // java.lang.Runnable
    public void run() {
        RandomAccessResourceBridge randomAccessResourceBridge;
        RandomAccessResourceBridge randomAccessResourceBridge2 = null;
        try {
            try {
                FileTime fileTime = FileTimes.EPOCH;
                long j10 = 0;
                while (getRun() && randomAccessResourceBridge2 == null) {
                    try {
                        randomAccessResourceBridge2 = this.tailable.getRandomAccess(RAF_READ_ONLY_MODE);
                    } catch (FileNotFoundException unused) {
                        this.listener.fileNotFound();
                    }
                    if (randomAccessResourceBridge2 == null) {
                        ThreadUtils.sleep(this.delayDuration);
                    } else {
                        if (this.tailFromEnd) {
                            j10 = this.tailable.size();
                        } else {
                            j10 = 0;
                        }
                        fileTime = this.tailable.lastModifiedFileTime();
                        randomAccessResourceBridge2.seek(j10);
                    }
                }
                while (getRun()) {
                    boolean isNewer = this.tailable.isNewer(fileTime);
                    long size = this.tailable.size();
                    if (size < j10) {
                        this.listener.fileRotated();
                        try {
                            randomAccessResourceBridge = this.tailable.getRandomAccess(RAF_READ_ONLY_MODE);
                            try {
                                try {
                                    readLines(randomAccessResourceBridge2);
                                } catch (Throwable th) {
                                    th = th;
                                    if (randomAccessResourceBridge2 != null) {
                                        try {
                                            randomAccessResourceBridge2.close();
                                        } catch (Throwable th2) {
                                            try {
                                                th.addSuppressed(th2);
                                            } catch (FileNotFoundException unused2) {
                                                randomAccessResourceBridge2 = randomAccessResourceBridge;
                                                this.listener.fileNotFound();
                                                ThreadUtils.sleep(this.delayDuration);
                                            }
                                        }
                                    }
                                    throw th;
                                    break;
                                }
                            } catch (IOException e) {
                                this.listener.handle(e);
                            }
                            if (randomAccessResourceBridge2 != null) {
                                try {
                                    try {
                                        randomAccessResourceBridge2.close();
                                    } catch (FileNotFoundException unused3) {
                                        j10 = 0;
                                        randomAccessResourceBridge2 = randomAccessResourceBridge;
                                        this.listener.fileNotFound();
                                        ThreadUtils.sleep(this.delayDuration);
                                    }
                                } catch (InterruptedException e6) {
                                    e = e6;
                                    randomAccessResourceBridge2 = randomAccessResourceBridge;
                                    Thread.currentThread().interrupt();
                                    this.listener.handle(e);
                                    IOUtils.close(randomAccessResourceBridge2);
                                    close();
                                } catch (Exception e10) {
                                    e = e10;
                                    randomAccessResourceBridge2 = randomAccessResourceBridge;
                                    this.listener.handle(e);
                                    IOUtils.close(randomAccessResourceBridge2);
                                    close();
                                } catch (Throwable th3) {
                                    th = th3;
                                    randomAccessResourceBridge2 = randomAccessResourceBridge;
                                    try {
                                        IOUtils.close(randomAccessResourceBridge2);
                                    } catch (IOException e11) {
                                        this.listener.handle(e11);
                                    }
                                    close();
                                    throw th;
                                }
                            }
                            j10 = 0;
                            randomAccessResourceBridge2 = randomAccessResourceBridge;
                        } catch (Throwable th4) {
                            th = th4;
                            randomAccessResourceBridge = randomAccessResourceBridge2;
                        }
                    } else {
                        if (size > j10) {
                            j10 = readLines(randomAccessResourceBridge2);
                            fileTime = this.tailable.lastModifiedFileTime();
                        } else if (isNewer) {
                            if (!this.ignoreTouch) {
                                randomAccessResourceBridge2.seek(0L);
                                j10 = readLines(randomAccessResourceBridge2);
                            }
                            fileTime = this.tailable.lastModifiedFileTime();
                        }
                        if (this.reOpen && randomAccessResourceBridge2 != null) {
                            randomAccessResourceBridge2.close();
                        }
                        ThreadUtils.sleep(this.delayDuration);
                        if (getRun() && this.reOpen) {
                            randomAccessResourceBridge2 = this.tailable.getRandomAccess(RAF_READ_ONLY_MODE);
                            randomAccessResourceBridge2.seek(j10);
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (InterruptedException e12) {
            e = e12;
        } catch (Exception e13) {
            e = e13;
        }
        try {
            IOUtils.close(randomAccessResourceBridge2);
        } catch (IOException e14) {
            this.listener.handle(e14);
        }
        close();
    }

    @Deprecated
    public void stop() {
        close();
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static final class RandomAccessFileBridge implements RandomAccessResourceBridge {
        private final RandomAccessFile randomAccessFile;

        private RandomAccessFileBridge(File file, String str) {
            this.randomAccessFile = new RandomAccessFile(file, str);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.randomAccessFile.close();
        }

        @Override // org.apache.commons.io.input.Tailer.RandomAccessResourceBridge
        public long getPointer() {
            return this.randomAccessFile.getFilePointer();
        }

        @Override // org.apache.commons.io.input.Tailer.RandomAccessResourceBridge
        public int read(byte[] bArr) {
            return this.randomAccessFile.read(bArr);
        }

        @Override // org.apache.commons.io.input.Tailer.RandomAccessResourceBridge
        public void seek(long j10) {
            this.randomAccessFile.seek(j10);
        }

        public /* synthetic */ RandomAccessFileBridge(File file, String str, AnonymousClass1 anonymousClass1) {
            this(file, str);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static final class TailablePath implements Tailable {
        private final LinkOption[] linkOptions;
        private final Path path;

        private TailablePath(Path path, LinkOption... linkOptionArr) {
            Objects.requireNonNull(path, "path");
            this.path = kotlin.internal.jdk8.a.m(path);
            this.linkOptions = linkOptionArr;
        }

        public Path getPath() {
            return this.path;
        }

        @Override // org.apache.commons.io.input.Tailer.Tailable
        public RandomAccessResourceBridge getRandomAccess(String str) {
            File file;
            file = this.path.toFile();
            return new RandomAccessFileBridge(file, str);
        }

        @Override // org.apache.commons.io.input.Tailer.Tailable
        public boolean isNewer(FileTime fileTime) {
            return PathUtils.isNewer(this.path, fileTime, this.linkOptions);
        }

        @Override // org.apache.commons.io.input.Tailer.Tailable
        public FileTime lastModifiedFileTime() {
            FileTime lastModifiedTime;
            lastModifiedTime = Files.getLastModifiedTime(this.path, this.linkOptions);
            return lastModifiedTime;
        }

        @Override // org.apache.commons.io.input.Tailer.Tailable
        public long size() {
            long size;
            size = Files.size(this.path);
            return size;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TailablePath [file=");
            sb.append(this.path);
            sb.append(", linkOptions=");
            return ai.onnxruntime.a.p(sb, Arrays.toString(this.linkOptions), "]");
        }

        public /* synthetic */ TailablePath(Path path, LinkOption[] linkOptionArr, AnonymousClass1 anonymousClass1) {
            this(path, linkOptionArr);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends AbstractStreamBuilder<Tailer, Builder> {
        private static final Duration DEFAULT_DELAY_DURATION;
        private boolean reOpen;
        private boolean tailFromEnd;
        private Tailable tailable;
        private TailerListener tailerListener;
        private Duration delayDuration = DEFAULT_DELAY_DURATION;
        private boolean startThread = true;
        private boolean ignoreTouch = false;
        private ExecutorService executorService = Executors.newSingleThreadExecutor(new k(1));

        static {
            Duration ofMillis;
            ofMillis = Duration.ofMillis(1000L);
            DEFAULT_DELAY_DURATION = ofMillis;
        }

        public static Thread newDaemonThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "commons-io-tailer");
            thread.setDaemon(true);
            return thread;
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public Tailer get() {
            Tailer tailer = new Tailer(this);
            if (this.startThread) {
                this.executorService.submit(tailer);
            }
            return tailer;
        }

        public Builder setDelayDuration(Duration duration) {
            if (duration == null) {
                duration = DEFAULT_DELAY_DURATION;
            }
            this.delayDuration = duration;
            return this;
        }

        public Builder setExecutorService(ExecutorService executorService) {
            Objects.requireNonNull(executorService, "executorService");
            this.executorService = executorService;
            return this;
        }

        public Builder setIgnoreTouch(boolean z9) {
            this.ignoreTouch = z9;
            return this;
        }

        @Override // org.apache.commons.io.build.AbstractOriginSupplier
        public Builder setOrigin(AbstractOrigin<?, ?> abstractOrigin) {
            setTailable(new TailablePath(abstractOrigin.getPath(), new LinkOption[0]));
            return (Builder) super.setOrigin(abstractOrigin);
        }

        public Builder setReOpen(boolean z9) {
            this.reOpen = z9;
            return this;
        }

        public Builder setStartThread(boolean z9) {
            this.startThread = z9;
            return this;
        }

        public Builder setTailFromEnd(boolean z9) {
            this.tailFromEnd = z9;
            return this;
        }

        public Builder setTailable(Tailable tailable) {
            Objects.requireNonNull(tailable, "tailable");
            this.tailable = tailable;
            return this;
        }

        public Builder setTailerListener(TailerListener tailerListener) {
            Objects.requireNonNull(tailerListener, "tailerListener");
            this.tailerListener = tailerListener;
            return this;
        }

        @Override // org.apache.commons.io.build.AbstractOriginSupplier
        public /* bridge */ /* synthetic */ AbstractOriginSupplier setOrigin(AbstractOrigin abstractOrigin) {
            return setOrigin((AbstractOrigin<?, ?>) abstractOrigin);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public static Tailer create(File file, TailerListener tailerListener) {
        return ((Builder) builder().setFile(file)).setTailerListener(tailerListener).get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public static Tailer create(File file, TailerListener tailerListener, long j10) {
        Duration ofMillis;
        Builder tailerListener2 = ((Builder) builder().setFile(file)).setTailerListener(tailerListener);
        ofMillis = Duration.ofMillis(j10);
        return tailerListener2.setDelayDuration(ofMillis).get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public static Tailer create(File file, TailerListener tailerListener, long j10, boolean z9) {
        Duration ofMillis;
        Builder tailerListener2 = ((Builder) builder().setFile(file)).setTailerListener(tailerListener);
        ofMillis = Duration.ofMillis(j10);
        return tailerListener2.setDelayDuration(ofMillis).setTailFromEnd(z9).get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public static Tailer create(File file, TailerListener tailerListener, long j10, boolean z9, boolean z10) {
        Duration ofMillis;
        Builder tailerListener2 = ((Builder) builder().setFile(file)).setTailerListener(tailerListener);
        ofMillis = Duration.ofMillis(j10);
        return tailerListener2.setDelayDuration(ofMillis).setTailFromEnd(z9).setReOpen(z10).get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public static Tailer create(File file, TailerListener tailerListener, long j10, boolean z9, boolean z10, int i10) {
        Duration ofMillis;
        Builder tailerListener2 = ((Builder) builder().setFile(file)).setTailerListener(tailerListener);
        ofMillis = Duration.ofMillis(j10);
        return tailerListener2.setDelayDuration(ofMillis).setTailFromEnd(z9).setReOpen(z10).setBufferSize(i10).get();
    }

    public /* synthetic */ Tailer(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Tailer(java.io.File r10, java.nio.charset.Charset r11, org.apache.commons.io.input.TailerListener r12, long r13, boolean r15, boolean r16, int r17) {
        /*
            r9 = this;
            org.apache.commons.io.input.Tailer$TailablePath r1 = new org.apache.commons.io.input.Tailer$TailablePath
            java.nio.file.Path r10 = c5.h.i(r10)
            r0 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            r2 = 0
            r1.<init>(r10, r0)
            java.time.Duration r4 = org.apache.commons.io.file.e.o(r13)
            r8 = 0
            r0 = r9
            r2 = r11
            r3 = r12
            r5 = r15
            r6 = r16
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.Tailer.<init>(java.io.File, java.nio.charset.Charset, org.apache.commons.io.input.TailerListener, long, boolean, boolean, int):void");
    }

    @Deprecated
    public Tailer(File file, TailerListener tailerListener) {
        this(file, tailerListener, 1000L);
    }

    @Deprecated
    public Tailer(File file, TailerListener tailerListener, long j10) {
        this(file, tailerListener, j10, false);
    }

    @Deprecated
    public Tailer(File file, TailerListener tailerListener, long j10, boolean z9) {
        this(file, tailerListener, j10, z9, 8192);
    }

    @Deprecated
    public Tailer(File file, TailerListener tailerListener, long j10, boolean z9, boolean z10) {
        this(file, tailerListener, j10, z9, z10, 8192);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public static Tailer create(File file, TailerListener tailerListener, long j10, boolean z9, int i10) {
        Duration ofMillis;
        Builder tailerListener2 = ((Builder) builder().setFile(file)).setTailerListener(tailerListener);
        ofMillis = Duration.ofMillis(j10);
        return tailerListener2.setDelayDuration(ofMillis).setTailFromEnd(z9).setBufferSize(i10).get();
    }

    @Deprecated
    public Tailer(File file, TailerListener tailerListener, long j10, boolean z9, boolean z10, int i10) {
        this(file, DEFAULT_CHARSET, tailerListener, j10, z9, z10, i10);
    }

    @Deprecated
    public Tailer(File file, TailerListener tailerListener, long j10, boolean z9, int i10) {
        this(file, tailerListener, j10, z9, false, i10);
    }

    private Tailer(Tailable tailable, Charset charset, TailerListener tailerListener, Duration duration, boolean z9, boolean z10, int i10, boolean z11) {
        this.run = true;
        Objects.requireNonNull(tailable, "tailable");
        this.tailable = tailable;
        Objects.requireNonNull(tailerListener, "listener");
        this.listener = tailerListener;
        this.delayDuration = duration;
        this.tailFromEnd = z9;
        this.inbuf = IOUtils.byteArray(i10);
        tailerListener.init(this);
        this.reOpen = z10;
        this.charset = charset;
        this.ignoreTouch = z11;
    }
}
