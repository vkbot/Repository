package o7;

import java.io.InputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i3 extends InputStream implements n7.d0 {

    /* renamed from: b, reason: collision with root package name */
    public c f4552b;

    @Override // java.io.InputStream
    public final int available() {
        return this.f4552b.f0();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4552b.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f4552b.c();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f4552b.y();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        c cVar = this.f4552b;
        if (cVar.f0() == 0) {
            return -1;
        }
        int min = Math.min(cVar.f0(), i11);
        cVar.d0(bArr, i10, min);
        return min;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f4552b.g0();
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        c cVar = this.f4552b;
        int min = (int) Math.min(cVar.f0(), j10);
        cVar.h0(min);
        return min;
    }

    @Override // java.io.InputStream
    public final int read() {
        c cVar = this.f4552b;
        if (cVar.f0() == 0) {
            return -1;
        }
        return cVar.e0();
    }
}
