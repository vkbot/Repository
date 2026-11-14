package l9;

import java.io.IOException;
import java.util.zip.Deflater;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class p implements e0 {

    /* renamed from: b, reason: collision with root package name */
    public final z f3579b;
    public final Deflater c;
    public boolean d;

    public p(l lVar, Deflater deflater) {
        this.f3579b = new z(lVar);
        this.c = deflater;
    }

    public final void b(boolean z9) {
        b0 k02;
        int deflate;
        z zVar = this.f3579b;
        l lVar = zVar.c;
        while (true) {
            k02 = lVar.k0(1);
            byte[] bArr = k02.f3560a;
            int i10 = k02.c;
            Deflater deflater = this.c;
            if (z9) {
                try {
                    deflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                deflate = deflater.deflate(bArr, i10, 8192 - i10);
            }
            if (deflate > 0) {
                k02.c += deflate;
                lVar.c += deflate;
                zVar.n();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (k02.f3561b == k02.c) {
            lVar.f3577b = k02.a();
            c0.a(k02);
        }
    }

    @Override // l9.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Deflater deflater = this.c;
        if (!this.d) {
            try {
                deflater.finish();
                b(false);
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                deflater.end();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            try {
                this.f3579b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.d = true;
            if (th == null) {
            } else {
                throw th;
            }
        }
    }

    @Override // l9.e0, java.io.Flushable
    public final void flush() {
        b(true);
        this.f3579b.flush();
    }

    @Override // l9.e0
    public final j0 timeout() {
        return this.f3579b.f3590b.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f3579b + ')';
    }

    @Override // l9.e0
    public final void write(l lVar, long j10) {
        lVar.getClass();
        b.d(lVar.c, 0L, j10);
        while (j10 > 0) {
            b0 b0Var = lVar.f3577b;
            b0Var.getClass();
            int min = (int) Math.min(j10, b0Var.c - b0Var.f3561b);
            this.c.setInput(b0Var.f3560a, b0Var.f3561b, min);
            b(false);
            long j11 = min;
            lVar.c -= j11;
            int i10 = b0Var.f3561b + min;
            b0Var.f3561b = i10;
            if (i10 == b0Var.c) {
                lVar.f3577b = b0Var.a();
                c0.a(b0Var);
            }
            j10 -= j11;
        }
    }
}
