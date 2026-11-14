package c0;

import java.io.FilterInputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public int f442b;

    public m(e eVar) {
        super(eVar);
        this.f442b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i10 = this.f442b;
        if (i10 == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i10, super.available());
    }

    public final long b(long j10) {
        int i10 = this.f442b;
        if (i10 == 0) {
            return -1L;
        }
        if (i10 != Integer.MIN_VALUE && j10 > i10) {
            return i10;
        }
        return j10;
    }

    public final void c(long j10) {
        int i10 = this.f442b;
        if (i10 != Integer.MIN_VALUE && j10 != -1) {
            this.f442b = (int) (i10 - j10);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        super.mark(i10);
        this.f442b = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (b(1L) == -1) {
            return -1;
        }
        int read = super.read();
        c(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f442b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long b10 = b(j10);
        if (b10 == -1) {
            return 0L;
        }
        long skip = super.skip(b10);
        c(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int b10 = (int) b(i11);
        if (b10 == -1) {
            return -1;
        }
        int read = super.read(bArr, i10, b10);
        c(read);
        return read;
    }
}
