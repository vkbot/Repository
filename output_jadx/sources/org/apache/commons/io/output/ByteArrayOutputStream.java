package org.apache.commons.io.output;

import j1.i;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class ByteArrayOutputStream extends AbstractByteArrayOutputStream<ByteArrayOutputStream> {
    public ByteArrayOutputStream(int i10) {
        if (i10 >= 0) {
            synchronized (this) {
                needNewBuffer(i10);
            }
        } else {
            i.k(ai.onnxruntime.a.e(i10, "Negative initial size: "));
            throw null;
        }
    }

    public static InputStream toBufferedInputStream(InputStream inputStream, int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10);
        try {
            byteArrayOutputStream.write(inputStream);
            InputStream inputStream2 = byteArrayOutputStream.toInputStream();
            byteArrayOutputStream.close();
            return inputStream2;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized void reset() {
        resetImpl();
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized int size() {
        return this.count;
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized byte[] toByteArray() {
        return toByteArrayImpl();
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized InputStream toInputStream() {
        return toInputStream(new n0.b(26));
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        IOUtils.checkFromIndexSize(bArr, i10, i11);
        if (i11 == 0) {
            return;
        }
        synchronized (this) {
            writeImpl(bArr, i10, i11);
        }
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized void writeTo(OutputStream outputStream) {
        writeToImpl(outputStream);
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized int write(InputStream inputStream) {
        return writeImpl(inputStream);
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i10) {
        writeImpl(i10);
    }

    public ByteArrayOutputStream() {
        this(1024);
    }

    public static InputStream toBufferedInputStream(InputStream inputStream) {
        return toBufferedInputStream(inputStream, 1024);
    }
}
