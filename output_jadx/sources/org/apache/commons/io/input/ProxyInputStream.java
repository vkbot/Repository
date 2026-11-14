package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.build.AbstractStreamBuilder;
import org.apache.commons.io.function.IOIntConsumer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class ProxyInputStream extends FilterInputStream {
    private final IOIntConsumer afterRead;
    private volatile boolean closed;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBuilder<T, B extends AbstractStreamBuilder<T, B>> extends AbstractStreamBuilder<T, B> {
        private IOIntConsumer afterRead;

        public IOIntConsumer getAfterRead() {
            return this.afterRead;
        }

        public B setAfterRead(IOIntConsumer iOIntConsumer) {
            this.afterRead = iOIntConsumer;
            return (B) asThis();
        }
    }

    public ProxyInputStream(InputStream inputStream, AbstractBuilder<?, ?> abstractBuilder) {
        super(inputStream);
        IOIntConsumer iOIntConsumer;
        if (abstractBuilder.getAfterRead() != null) {
            iOIntConsumer = abstractBuilder.getAfterRead();
        } else {
            iOIntConsumer = IOIntConsumer.NOOP;
        }
        this.afterRead = iOIntConsumer;
    }

    public void afterRead(int i10) {
        this.afterRead.accept(i10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        if (((FilterInputStream) this).in != null && !isClosed()) {
            try {
                return ((FilterInputStream) this).in.available();
            } catch (IOException e) {
                handleIOException(e);
                return 0;
            }
        }
        return 0;
    }

    public void checkOpen() {
        Input.checkOpen(!isClosed());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IOUtils.close(((FilterInputStream) this).in, new j(1, this));
        this.closed = true;
    }

    public boolean isClosed() {
        return this.closed;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        if (((FilterInputStream) this).in != null) {
            ((FilterInputStream) this).in.mark(i10);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        if (((FilterInputStream) this).in != null && ((FilterInputStream) this).in.markSupported()) {
            return true;
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i10 = 1;
        try {
            beforeRead(1);
            int read = ((FilterInputStream) this).in.read();
            if (read == -1) {
                i10 = -1;
            }
            afterRead(i10);
            return read;
        } catch (IOException e) {
            handleIOException(e);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    public ProxyInputStream setReference(InputStream inputStream) {
        ((FilterInputStream) this).in = inputStream;
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        try {
            return ((FilterInputStream) this).in.skip(j10);
        } catch (IOException e) {
            handleIOException(e);
            return 0L;
        }
    }

    public InputStream unwrap() {
        return ((FilterInputStream) this).in;
    }

    public ProxyInputStream(InputStream inputStream) {
        super(inputStream);
        this.afterRead = IOIntConsumer.NOOP;
    }

    public ProxyInputStream(AbstractBuilder<?, ?> abstractBuilder) {
        this(abstractBuilder.getInputStream(), abstractBuilder);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        try {
            beforeRead(IOUtils.length(bArr));
            int read = ((FilterInputStream) this).in.read(bArr);
            afterRead(read);
            return read;
        } catch (IOException e) {
            handleIOException(e);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        try {
            beforeRead(i11);
            int read = ((FilterInputStream) this).in.read(bArr, i10, i11);
            afterRead(read);
            return read;
        } catch (IOException e) {
            handleIOException(e);
            return -1;
        }
    }

    public void beforeRead(int i10) {
    }

    public void handleIOException(IOException iOException) {
        throw iOException;
    }
}
