package org.apache.commons.io.input.buffer;

import ai.onnxruntime.a;
import j1.i;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Objects;
import kotlin.UByte;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class CircularBufferInputStream extends FilterInputStream {
    protected final CircularByteBuffer buffer;
    protected final int bufferSize;
    private boolean eof;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularBufferInputStream(InputStream inputStream, int i10) {
        super(inputStream);
        Objects.requireNonNull(inputStream, "inputStream");
        if (i10 > 0) {
            this.buffer = new CircularByteBuffer(i10);
            this.bufferSize = i10;
            this.eof = false;
            return;
        }
        i.k(a.e(i10, "Illegal bufferSize: "));
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        this.eof = true;
        this.buffer.clear();
    }

    public void fillBuffer() {
        if (!this.eof) {
            int space = this.buffer.getSpace();
            byte[] byteArray = IOUtils.byteArray(space);
            while (space > 0) {
                int read = ((FilterInputStream) this).in.read(byteArray, 0, space);
                if (read == -1) {
                    this.eof = true;
                    return;
                } else if (read > 0) {
                    this.buffer.add(byteArray, 0, read);
                    space -= read;
                }
            }
        }
    }

    public boolean haveBytes(int i10) {
        if (this.buffer.getCurrentNumberOfBytes() < i10) {
            fillBuffer();
        }
        return this.buffer.hasBytes();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        IOUtils.checkFromIndexSize(bArr, i10, i11);
        if (i11 == 0) {
            return 0;
        }
        if (!haveBytes(i11)) {
            return -1;
        }
        int min = Math.min(i11, this.buffer.getCurrentNumberOfBytes());
        for (int i12 = 0; i12 < min; i12++) {
            bArr[i10 + i12] = this.buffer.read();
        }
        return min;
    }

    public CircularBufferInputStream(InputStream inputStream) {
        this(inputStream, 8192);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (haveBytes(1)) {
            return this.buffer.read() & UByte.MAX_VALUE;
        }
        return -1;
    }
}
