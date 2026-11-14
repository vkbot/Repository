package org.apache.commons.io.input;

import e0.j2;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.UByte;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.build.AbstractStreamBuilder;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class ReadAheadInputStream extends FilterInputStream {
    private static final ThreadLocal<byte[]> BYTE_ARRAY_1 = new androidx.emoji2.text.flatbuffer.b(new androidx.emoji2.text.flatbuffer.a(6), 1);
    private ByteBuffer activeBuffer;
    private final Condition asyncReadComplete;
    private boolean endOfStream;
    private final ExecutorService executorService;
    private boolean isClosed;
    private boolean isReading;
    private boolean isUnderlyingInputStreamBeingClosed;
    private final AtomicBoolean isWaiting;
    private boolean readAborted;
    private ByteBuffer readAheadBuffer;
    private Throwable readException;
    private boolean readInProgress;
    private final boolean shutdownExecutorService;
    private final ReentrantLock stateChangeLock;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends AbstractStreamBuilder<ReadAheadInputStream, Builder> {
        private ExecutorService executorService;

        @Override // org.apache.commons.io.function.IOSupplier
        public ReadAheadInputStream get() {
            return new ReadAheadInputStream(this);
        }

        public Builder setExecutorService(ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ReadAheadInputStream(InputStream inputStream, int i10, ExecutorService executorService, boolean z9) {
        super(inputStream);
        Objects.requireNonNull(inputStream, "inputStream");
        ReentrantLock reentrantLock = new ReentrantLock();
        this.stateChangeLock = reentrantLock;
        this.isWaiting = new AtomicBoolean();
        this.asyncReadComplete = reentrantLock.newCondition();
        if (i10 > 0) {
            Objects.requireNonNull(executorService, "executorService");
            this.executorService = executorService;
            this.shutdownExecutorService = z9;
            this.activeBuffer = ByteBuffer.allocate(i10);
            this.readAheadBuffer = ByteBuffer.allocate(i10);
            this.activeBuffer.flip();
            this.readAheadBuffer.flip();
            return;
        }
        n0.b.v("bufferSizeInBytes <= 0, bufferSizeInBytes = %,d", new Object[]{Integer.valueOf(i10)});
        throw null;
    }

    public static Builder builder() {
        return new Builder();
    }

    private void checkReadException() {
        if (this.readAborted) {
            Throwable th = this.readException;
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            throw new IOException(th);
        }
    }

    private void closeUnderlyingInputStreamIfNecessary() {
        this.stateChangeLock.lock();
        boolean z9 = false;
        try {
            this.isReading = false;
            if (this.isClosed) {
                if (!this.isUnderlyingInputStreamBeingClosed) {
                    z9 = true;
                }
            }
            if (z9) {
                try {
                    super.close();
                } catch (IOException unused) {
                }
            }
        } finally {
            this.stateChangeLock.unlock();
        }
    }

    private boolean isEndOfStream() {
        if (!this.activeBuffer.hasRemaining() && !this.readAheadBuffer.hasRemaining() && this.endOfStream) {
            return true;
        }
        return false;
    }

    public /* synthetic */ void lambda$readAsync$1(byte[] bArr) {
        this.stateChangeLock.lock();
        try {
            if (this.isClosed) {
                this.readInProgress = false;
                return;
            }
            this.isReading = true;
            this.stateChangeLock.unlock();
            int length = bArr.length;
            int i10 = 0;
            int i11 = 0;
            do {
                try {
                    i11 = ((FilterInputStream) this).in.read(bArr, i10, length);
                    if (i11 > 0) {
                        i10 += i11;
                        length -= i11;
                        if (length <= 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    try {
                        if (!(th instanceof Error)) {
                            this.stateChangeLock.lock();
                            try {
                                this.readAheadBuffer.limit(i10);
                                if (i11 >= 0 && !(th instanceof EOFException)) {
                                    this.readAborted = true;
                                    this.readException = th;
                                    this.readInProgress = false;
                                    signalAsyncReadComplete();
                                    this.stateChangeLock.unlock();
                                    closeUnderlyingInputStreamIfNecessary();
                                    return;
                                }
                                this.endOfStream = true;
                                this.readInProgress = false;
                                signalAsyncReadComplete();
                                this.stateChangeLock.unlock();
                                closeUnderlyingInputStreamIfNecessary();
                                return;
                            } finally {
                            }
                        }
                        throw th;
                    } catch (Throwable th2) {
                        this.stateChangeLock.lock();
                        try {
                            this.readAheadBuffer.limit(i10);
                            if (i11 >= 0 && !(th instanceof EOFException)) {
                                this.readAborted = true;
                                this.readException = th;
                            } else {
                                this.endOfStream = true;
                            }
                            this.readInProgress = false;
                            signalAsyncReadComplete();
                            this.stateChangeLock.unlock();
                            closeUnderlyingInputStreamIfNecessary();
                            throw th2;
                        } finally {
                        }
                    }
                }
            } while (!this.isWaiting.get());
            this.stateChangeLock.lock();
            try {
                this.readAheadBuffer.limit(i10);
                if (i11 < 0) {
                    this.endOfStream = true;
                }
                this.readInProgress = false;
                signalAsyncReadComplete();
                this.stateChangeLock.unlock();
                closeUnderlyingInputStreamIfNecessary();
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ byte[] lambda$static$0() {
        return new byte[1];
    }

    public static Thread newDaemonThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "commons-io-read-ahead");
        thread.setDaemon(true);
        return thread;
    }

    private static ExecutorService newExecutorService() {
        return Executors.newSingleThreadExecutor(new k(0));
    }

    private void readAsync() {
        this.stateChangeLock.lock();
        try {
            byte[] array = this.readAheadBuffer.array();
            if (!this.endOfStream && !this.readInProgress) {
                checkReadException();
                this.readAheadBuffer.position(0);
                this.readAheadBuffer.flip();
                this.readInProgress = true;
                this.stateChangeLock.unlock();
                this.executorService.execute(new j2(22, this, array));
            }
        } finally {
            this.stateChangeLock.unlock();
        }
    }

    private void signalAsyncReadComplete() {
        this.stateChangeLock.lock();
        try {
            this.asyncReadComplete.signalAll();
        } finally {
            this.stateChangeLock.unlock();
        }
    }

    private long skipInternal(long j10) {
        if (this.stateChangeLock.isLocked()) {
            waitForAsyncReadComplete();
            if (isEndOfStream()) {
                return 0L;
            }
            if (available() >= j10) {
                int remaining = ((int) j10) - this.activeBuffer.remaining();
                if (remaining > 0) {
                    this.activeBuffer.position(0);
                    this.activeBuffer.flip();
                    ByteBuffer byteBuffer = this.readAheadBuffer;
                    byteBuffer.position(byteBuffer.position() + remaining);
                    swapBuffers();
                    readAsync();
                    return j10;
                }
                j1.i.l(ai.onnxruntime.a.e(remaining, "Expected toSkip > 0, actual: "));
                return 0L;
            }
            long available = available();
            this.activeBuffer.position(0);
            this.activeBuffer.flip();
            this.readAheadBuffer.position(0);
            this.readAheadBuffer.flip();
            long skip = ((FilterInputStream) this).in.skip(j10 - available);
            readAsync();
            return available + skip;
        }
        j1.i.l("Expected stateChangeLock to be locked");
        return 0L;
    }

    private void swapBuffers() {
        ByteBuffer byteBuffer = this.activeBuffer;
        this.activeBuffer = this.readAheadBuffer;
        this.readAheadBuffer = byteBuffer;
    }

    private void waitForAsyncReadComplete() {
        this.stateChangeLock.lock();
        try {
            try {
                this.isWaiting.set(true);
                while (this.readInProgress) {
                    this.asyncReadComplete.await();
                }
                try {
                    this.isWaiting.set(false);
                    this.stateChangeLock.unlock();
                    checkReadException();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    this.isWaiting.set(false);
                    throw th;
                } finally {
                }
            }
        } catch (InterruptedException e) {
            InterruptedIOException interruptedIOException = new InterruptedIOException(e.getMessage());
            interruptedIOException.initCause(e);
            throw interruptedIOException;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        this.stateChangeLock.lock();
        try {
            return (int) Math.min(2147483647L, this.activeBuffer.remaining() + this.readAheadBuffer.remaining());
        } finally {
            this.stateChangeLock.unlock();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.stateChangeLock.lock();
        try {
            if (this.isClosed) {
                return;
            }
            boolean z9 = true;
            this.isClosed = true;
            if (!this.isReading) {
                this.isUnderlyingInputStreamBeingClosed = true;
            } else {
                z9 = false;
            }
            this.stateChangeLock.unlock();
            if (this.shutdownExecutorService) {
                try {
                    try {
                        this.executorService.shutdownNow();
                        this.executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
                    } catch (InterruptedException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException(e.getMessage());
                        interruptedIOException.initCause(e);
                        throw interruptedIOException;
                    }
                } finally {
                    if (z9) {
                        super.close();
                    }
                }
            }
        } finally {
            this.stateChangeLock.unlock();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        IOUtils.checkFromIndexSize(bArr, i10, i11);
        if (i11 == 0) {
            return 0;
        }
        if (!this.activeBuffer.hasRemaining()) {
            this.stateChangeLock.lock();
            try {
                waitForAsyncReadComplete();
                if (!this.readAheadBuffer.hasRemaining()) {
                    readAsync();
                    waitForAsyncReadComplete();
                    if (isEndOfStream()) {
                        this.stateChangeLock.unlock();
                        return -1;
                    }
                }
                swapBuffers();
                readAsync();
            } finally {
                this.stateChangeLock.unlock();
            }
        }
        int min = Math.min(i11, this.activeBuffer.remaining());
        this.activeBuffer.get(bArr, i10, min);
        return min;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 <= this.activeBuffer.remaining()) {
            ByteBuffer byteBuffer = this.activeBuffer;
            byteBuffer.position(byteBuffer.position() + ((int) j10));
            return j10;
        }
        this.stateChangeLock.lock();
        try {
            return skipInternal(j10);
        } finally {
            this.stateChangeLock.unlock();
        }
    }

    private ReadAheadInputStream(Builder builder) {
        this(builder.getInputStream(), builder.getBufferSize(), builder.executorService != null ? builder.executorService : newExecutorService(), builder.executorService == null);
    }

    @Deprecated
    public ReadAheadInputStream(InputStream inputStream, int i10) {
        this(inputStream, i10, newExecutorService(), true);
    }

    @Deprecated
    public ReadAheadInputStream(InputStream inputStream, int i10, ExecutorService executorService) {
        this(inputStream, i10, executorService, false);
    }

    public /* synthetic */ ReadAheadInputStream(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        byte b10;
        if (this.activeBuffer.hasRemaining()) {
            b10 = this.activeBuffer.get();
        } else {
            byte[] bArr = BYTE_ARRAY_1.get();
            bArr[0] = 0;
            if (read(bArr, 0, 1) == -1) {
                return -1;
            }
            b10 = bArr[0];
        }
        return b10 & UByte.MAX_VALUE;
    }
}
