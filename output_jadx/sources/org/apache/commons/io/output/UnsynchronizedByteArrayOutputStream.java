package org.apache.commons.io.output;

import j1.i;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.build.AbstractStreamBuilder;
import org.apache.commons.io.function.IOSupplier;
import org.apache.commons.io.function.Uncheck;
import org.apache.commons.io.input.UnsynchronizedByteArrayInputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class UnsynchronizedByteArrayOutputStream extends AbstractByteArrayOutputStream<UnsynchronizedByteArrayOutputStream> {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends AbstractStreamBuilder<UnsynchronizedByteArrayOutputStream, Builder> {
        @Override // org.apache.commons.io.function.IOSupplier
        public UnsynchronizedByteArrayOutputStream get() {
            return new UnsynchronizedByteArrayOutputStream(this);
        }
    }

    @Deprecated
    public UnsynchronizedByteArrayOutputStream(int i10) {
        if (i10 >= 0) {
            needNewBuffer(i10);
        } else {
            i.k(ai.onnxruntime.a.e(i10, "Negative initial size: "));
            throw null;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static /* synthetic */ UnsynchronizedByteArrayInputStream lambda$toInputStream$0(byte[] bArr, int i10, int i11) {
        return UnsynchronizedByteArrayInputStream.builder().setByteArray(bArr).setOffset(i10).setLength(i11).get();
    }

    public static /* synthetic */ UnsynchronizedByteArrayInputStream lambda$toInputStream$1(final byte[] bArr, final int i10, final int i11) {
        return (UnsynchronizedByteArrayInputStream) Uncheck.get(new IOSupplier() { // from class: org.apache.commons.io.output.h
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                UnsynchronizedByteArrayInputStream lambda$toInputStream$0;
                lambda$toInputStream$0 = UnsynchronizedByteArrayOutputStream.lambda$toInputStream$0(bArr, i10, i11);
                return lambda$toInputStream$0;
            }
        });
    }

    public static InputStream toBufferedInputStream(InputStream inputStream, int i10) {
        UnsynchronizedByteArrayOutputStream unsynchronizedByteArrayOutputStream = builder().setBufferSize(i10).get();
        try {
            unsynchronizedByteArrayOutputStream.write(inputStream);
            InputStream inputStream2 = unsynchronizedByteArrayOutputStream.toInputStream();
            unsynchronizedByteArrayOutputStream.close();
            return inputStream2;
        } catch (Throwable th) {
            if (unsynchronizedByteArrayOutputStream != null) {
                try {
                    unsynchronizedByteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public void reset() {
        resetImpl();
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public int size() {
        return this.count;
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public byte[] toByteArray() {
        return toByteArrayImpl();
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public InputStream toInputStream() {
        return toInputStream(new n0.b(28));
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        IOUtils.checkFromIndexSize(bArr, i10, i11);
        if (i11 == 0) {
            return;
        }
        writeImpl(bArr, i10, i11);
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public void writeTo(OutputStream outputStream) {
        writeToImpl(outputStream);
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public int write(InputStream inputStream) {
        return writeImpl(inputStream);
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream, java.io.OutputStream
    public void write(int i10) {
        writeImpl(i10);
    }

    @Deprecated
    public UnsynchronizedByteArrayOutputStream() {
        this(1024);
    }

    private UnsynchronizedByteArrayOutputStream(Builder builder) {
        this(builder.getBufferSize());
    }

    public /* synthetic */ UnsynchronizedByteArrayOutputStream(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    public static InputStream toBufferedInputStream(InputStream inputStream) {
        return toBufferedInputStream(inputStream, 1024);
    }
}
