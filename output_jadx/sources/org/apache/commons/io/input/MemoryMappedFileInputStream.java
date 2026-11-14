package org.apache.commons.io.input;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import kotlin.UShort;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.build.AbstractStreamBuilder;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class MemoryMappedFileInputStream extends AbstractInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 262144;
    private static final ByteBuffer EMPTY_BUFFER = ByteBuffer.wrap(new byte[0]).asReadOnlyBuffer();
    private ByteBuffer buffer;
    private final int bufferSize;
    private final FileChannel channel;
    private long nextBufferPosition;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends AbstractStreamBuilder<MemoryMappedFileInputStream, Builder> {
        public Builder() {
            setBufferSizeDefault(262144);
            setBufferSize(262144);
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public MemoryMappedFileInputStream get() {
            return new MemoryMappedFileInputStream(this);
        }
    }

    private MemoryMappedFileInputStream(Builder builder) {
        StandardOpenOption standardOpenOption;
        FileChannel open;
        this.buffer = EMPTY_BUFFER;
        this.bufferSize = builder.getBufferSize();
        Path path = builder.getPath();
        standardOpenOption = StandardOpenOption.READ;
        open = FileChannel.open(path, standardOpenOption);
        this.channel = open;
    }

    public static Builder builder() {
        return new Builder();
    }

    private void cleanBuffer() {
        if (ByteBufferCleaner.isSupported() && this.buffer.isDirect()) {
            ByteBufferCleaner.clean(this.buffer);
        }
    }

    private void nextBuffer() {
        long size = this.channel.size() - this.nextBufferPosition;
        if (size > 0) {
            long min = Math.min(size, this.bufferSize);
            cleanBuffer();
            this.buffer = this.channel.map(FileChannel.MapMode.READ_ONLY, this.nextBufferPosition, min);
            this.nextBufferPosition += min;
            return;
        }
        this.buffer = EMPTY_BUFFER;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.buffer.remaining();
    }

    @Override // org.apache.commons.io.input.AbstractInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!isClosed()) {
            cleanBuffer();
            this.buffer = EMPTY_BUFFER;
            this.channel.close();
            super.close();
        }
    }

    public int getBufferSize() {
        return this.bufferSize;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        IOUtils.checkFromIndexSize(bArr, i10, i11);
        if (i11 == 0) {
            return 0;
        }
        checkOpen();
        if (!this.buffer.hasRemaining()) {
            nextBuffer();
            if (!this.buffer.hasRemaining()) {
                return -1;
            }
        }
        int min = Math.min(this.buffer.remaining(), i11);
        this.buffer.get(bArr, i10, min);
        return min;
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        checkOpen();
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 <= this.buffer.remaining()) {
            this.buffer.position((int) (r0.position() + j10));
            return j10;
        }
        long min = Math.min(this.channel.size() - this.nextBufferPosition, j10 - this.buffer.remaining()) + this.buffer.remaining();
        this.nextBufferPosition = (min - this.buffer.remaining()) + this.nextBufferPosition;
        nextBuffer();
        return min;
    }

    @Override // java.io.InputStream
    public int read() {
        checkOpen();
        if (!this.buffer.hasRemaining()) {
            nextBuffer();
            if (!this.buffer.hasRemaining()) {
                return -1;
            }
        }
        return this.buffer.get() & UShort.MAX_VALUE;
    }
}
