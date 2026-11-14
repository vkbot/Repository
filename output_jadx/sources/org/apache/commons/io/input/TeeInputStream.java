package org.apache.commons.io.input;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class TeeInputStream extends ProxyInputStream {
    private final OutputStream branch;
    private final boolean closeBranch;

    public TeeInputStream(InputStream inputStream, OutputStream outputStream, boolean z9) {
        super(inputStream);
        this.branch = outputStream;
        this.closeBranch = z9;
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } finally {
            if (this.closeBranch) {
                this.branch.close();
            }
        }
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        int read = super.read(bArr);
        if (read != -1) {
            this.branch.write(bArr, 0, read);
        }
        return read;
    }

    public TeeInputStream(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, false);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = super.read();
        if (read != -1) {
            this.branch.write(read);
        }
        return read;
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int read = super.read(bArr, i10, i11);
        if (read != -1) {
            this.branch.write(bArr, i10, read);
        }
        return read;
    }
}
