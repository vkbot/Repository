package o7;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p2 extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public final int f4660b;
    public final t4 c;
    public long d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public long f4661f;

    public p2(InputStream inputStream, int i10, t4 t4Var) {
        super(inputStream);
        this.f4661f = -1L;
        this.f4660b = i10;
        this.c = t4Var;
    }

    public final void b() {
        long j10 = this.e;
        long j11 = this.d;
        if (j10 > j11) {
            long j12 = j10 - j11;
            for (n7.e eVar : this.c.f4728a) {
                eVar.k(j12);
            }
            this.d = this.e;
        }
    }

    public final void c() {
        long j10 = this.e;
        int i10 = this.f4660b;
        if (j10 <= i10) {
            return;
        }
        throw n7.f1.f4198j.h("Decompressed gRPC message exceeds maximum size " + i10).a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        this.f4661f = this.e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.e++;
        }
        c();
        b();
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.f4661f != -1) {
                ((FilterInputStream) this).in.reset();
                this.e = this.f4661f;
            } else {
                throw new IOException("Mark not set");
            }
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long skip = ((FilterInputStream) this).in.skip(j10);
        this.e += skip;
        c();
        b();
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int read = ((FilterInputStream) this).in.read(bArr, i10, i11);
        if (read != -1) {
            this.e += read;
        }
        c();
        b();
        return read;
    }
}
