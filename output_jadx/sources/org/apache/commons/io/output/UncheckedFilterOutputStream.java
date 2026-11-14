package org.apache.commons.io.output;

import java.io.FilterOutputStream;
import org.apache.commons.io.build.AbstractStreamBuilder;
import org.apache.commons.io.function.Uncheck;
import org.apache.commons.io.input.j;
import org.apache.commons.io.input.m;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class UncheckedFilterOutputStream extends FilterOutputStream {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public static class Builder extends AbstractStreamBuilder<UncheckedFilterOutputStream, Builder> {
        @Override // org.apache.commons.io.function.IOSupplier
        public UncheckedFilterOutputStream get() {
            return new UncheckedFilterOutputStream(this);
        }
    }

    private UncheckedFilterOutputStream(Builder builder) {
        super(builder.getOutputStream());
    }

    public static Builder builder() {
        return new Builder();
    }

    public /* synthetic */ void lambda$close$0() {
        super.close();
    }

    public /* synthetic */ void lambda$flush$1() {
        super.flush();
    }

    public /* synthetic */ void lambda$write$2(byte[] bArr) {
        super.write(bArr);
    }

    public /* synthetic */ void lambda$write$3(byte[] bArr, int i10, int i11) {
        super.write(bArr, i10, i11);
    }

    public /* synthetic */ void lambda$write$4(int i10) {
        super.write(i10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Uncheck.run(new d(this, 1));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        Uncheck.run(new d(this, 0));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        Uncheck.accept(new androidx.fragment.app.h(28, this), bArr, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public /* synthetic */ UncheckedFilterOutputStream(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        Uncheck.accept(new j(8, this), bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) {
        Uncheck.accept(new m(this, 2), i10);
    }
}
