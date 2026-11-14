package org.apache.commons.io.input;

import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.Objects;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.build.AbstractStreamBuilder;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class RandomAccessFileInputStream extends AbstractInputStream {
    private final boolean propagateClose;
    private final RandomAccessFile randomAccessFile;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends AbstractStreamBuilder<RandomAccessFileInputStream, Builder> {
        private boolean propagateClose;

        @Override // org.apache.commons.io.function.IOSupplier
        public RandomAccessFileInputStream get() {
            return new RandomAccessFileInputStream(this);
        }

        public Builder setCloseOnClose(boolean z9) {
            this.propagateClose = z9;
            return this;
        }

        @Override // org.apache.commons.io.build.AbstractOriginSupplier
        public Builder setRandomAccessFile(RandomAccessFile randomAccessFile) {
            return (Builder) super.setRandomAccessFile(randomAccessFile);
        }
    }

    @Deprecated
    public RandomAccessFileInputStream(RandomAccessFile randomAccessFile, boolean z9) {
        Objects.requireNonNull(randomAccessFile, "file");
        this.randomAccessFile = randomAccessFile;
        this.propagateClose = z9;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // java.io.InputStream
    public int available() {
        return Math.toIntExact(Math.min(availableLong(), 2147483647L));
    }

    public long availableLong() {
        if (isClosed()) {
            return 0L;
        }
        return this.randomAccessFile.length() - this.randomAccessFile.getFilePointer();
    }

    @Override // org.apache.commons.io.input.AbstractInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        if (this.propagateClose) {
            this.randomAccessFile.close();
        }
    }

    public long copy(long j10, long j11, OutputStream outputStream) {
        this.randomAccessFile.seek(j10);
        return IOUtils.copyLarge(this, outputStream, 0L, j11);
    }

    public RandomAccessFile getRandomAccessFile() {
        return this.randomAccessFile;
    }

    public boolean isCloseOnClose() {
        return this.propagateClose;
    }

    @Override // java.io.InputStream
    public int read() {
        return this.randomAccessFile.read();
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        long filePointer = this.randomAccessFile.getFilePointer();
        long length = this.randomAccessFile.length();
        if (filePointer >= length) {
            return 0L;
        }
        long j11 = j10 + filePointer;
        if (j11 > length) {
            j11 = length - 1;
        }
        if (j11 > 0) {
            this.randomAccessFile.seek(j11);
        }
        return this.randomAccessFile.getFilePointer() - filePointer;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return this.randomAccessFile.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        return this.randomAccessFile.read(bArr, i10, i11);
    }

    private RandomAccessFileInputStream(Builder builder) {
        this(builder.getRandomAccessFile(), builder.propagateClose);
    }

    @Deprecated
    public RandomAccessFileInputStream(RandomAccessFile randomAccessFile) {
        this(randomAccessFile, false);
    }
}
