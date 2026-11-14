package org.apache.commons.io.input;

import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import kotlin.UByte;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.build.AbstractStreamBuilder;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class BufferedFileChannelInputStream extends InputStream {
    private final ByteBuffer byteBuffer;
    private final FileChannel fileChannel;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends AbstractStreamBuilder<BufferedFileChannelInputStream, Builder> {
        private FileChannel fileChannel;

        @Override // org.apache.commons.io.function.IOSupplier
        public BufferedFileChannelInputStream get() {
            return new BufferedFileChannelInputStream(this);
        }

        public Builder setFileChannel(FileChannel fileChannel) {
            this.fileChannel = fileChannel;
            return this;
        }
    }

    private BufferedFileChannelInputStream(Builder builder) {
        StandardOpenOption standardOpenOption;
        FileChannel open;
        if (builder.fileChannel != null) {
            open = builder.fileChannel;
        } else {
            Path path = builder.getPath();
            standardOpenOption = StandardOpenOption.READ;
            open = FileChannel.open(path, standardOpenOption);
        }
        this.fileChannel = open;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(builder.getBufferSize());
        this.byteBuffer = allocateDirect;
        allocateDirect.flip();
    }

    public static Builder builder() {
        return new Builder();
    }

    private void clean(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            cleanDirectBuffer(byteBuffer);
        }
    }

    private void cleanDirectBuffer(ByteBuffer byteBuffer) {
        if (ByteBufferCleaner.isSupported()) {
            ByteBufferCleaner.clean(byteBuffer);
        }
    }

    private boolean refill() {
        Input.checkOpen(this.fileChannel.isOpen());
        if (this.byteBuffer.hasRemaining()) {
            return true;
        }
        this.byteBuffer.clear();
        int i10 = 0;
        while (i10 == 0) {
            i10 = this.fileChannel.read(this.byteBuffer);
        }
        this.byteBuffer.flip();
        if (i10 >= 0) {
            return true;
        }
        return false;
    }

    private long skipFromFileChannel(long j10) {
        long position = this.fileChannel.position();
        long size = this.fileChannel.size();
        long j11 = size - position;
        FileChannel fileChannel = this.fileChannel;
        if (j10 > j11) {
            fileChannel.position(size);
            return j11;
        }
        fileChannel.position(position + j10);
        return j10;
    }

    @Override // java.io.InputStream
    public synchronized int available() {
        if (!this.fileChannel.isOpen()) {
            return 0;
        }
        if (!refill()) {
            return 0;
        }
        return this.byteBuffer.remaining();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.fileChannel.close();
        } finally {
            clean(this.byteBuffer);
        }
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        IOUtils.checkFromIndexSize(bArr, i10, i11);
        if (i11 == 0) {
            return 0;
        }
        if (!refill()) {
            return -1;
        }
        int min = Math.min(i11, this.byteBuffer.remaining());
        this.byteBuffer.get(bArr, i10, min);
        return min;
    }

    @Override // java.io.InputStream
    public synchronized long skip(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        long remaining = this.byteBuffer.remaining();
        ByteBuffer byteBuffer = this.byteBuffer;
        if (remaining >= j10) {
            byteBuffer.position(byteBuffer.position() + ((int) j10));
            return j10;
        }
        long remaining2 = byteBuffer.remaining();
        this.byteBuffer.position(0);
        this.byteBuffer.flip();
        return remaining2 + skipFromFileChannel(j10 - remaining2);
    }

    @Override // java.io.InputStream
    public synchronized int read() {
        if (!refill()) {
            return -1;
        }
        return this.byteBuffer.get() & UByte.MAX_VALUE;
    }

    @Deprecated
    public BufferedFileChannelInputStream(File file) {
        this(file, 8192);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BufferedFileChannelInputStream(java.io.File r1, int r2) {
        /*
            r0 = this;
            java.nio.file.Path r1 = c5.h.i(r1)
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.BufferedFileChannelInputStream.<init>(java.io.File, int):void");
    }

    @Deprecated
    public BufferedFileChannelInputStream(Path path) {
        this(path, 8192);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public BufferedFileChannelInputStream(Path path, int i10) {
        this(((Builder) builder().setPath(path)).setBufferSize(i10));
    }
}
