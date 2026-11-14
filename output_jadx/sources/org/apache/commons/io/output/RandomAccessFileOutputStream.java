package org.apache.commons.io.output;

import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.file.StandardOpenOption;
import org.apache.commons.io.build.AbstractStreamBuilder;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class RandomAccessFileOutputStream extends OutputStream {
    private final RandomAccessFile randomAccessFile;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static final class Builder extends AbstractStreamBuilder<RandomAccessFileOutputStream, Builder> {
        private Builder() {
            StandardOpenOption standardOpenOption;
            standardOpenOption = StandardOpenOption.WRITE;
            setOpenOptions(standardOpenOption);
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public RandomAccessFileOutputStream get() {
            return new RandomAccessFileOutputStream(this);
        }
    }

    private RandomAccessFileOutputStream(Builder builder) {
        this.randomAccessFile = builder.getRandomAccessFile();
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.randomAccessFile.close();
        super.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.randomAccessFile.getChannel().force(true);
        super.flush();
    }

    public RandomAccessFile getRandomAccessFile() {
        return this.randomAccessFile;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.randomAccessFile.write(i10);
    }
}
