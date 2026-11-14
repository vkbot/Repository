package l9;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class u implements g0 {

    /* renamed from: b, reason: collision with root package name */
    public final a0 f3583b;
    public final Inflater c;
    public int d;
    public boolean e;

    public u(a0 a0Var, Inflater inflater) {
        this.f3583b = a0Var;
        this.c = inflater;
    }

    public final long b(l lVar, long j10) {
        Inflater inflater = this.c;
        lVar.getClass();
        if (j10 >= 0) {
            if (!this.e) {
                if (j10 != 0) {
                    try {
                        b0 k02 = lVar.k0(1);
                        int min = (int) Math.min(j10, 8192 - k02.c);
                        boolean needsInput = inflater.needsInput();
                        a0 a0Var = this.f3583b;
                        if (needsInput && !a0Var.k()) {
                            b0 b0Var = a0Var.c.f3577b;
                            b0Var.getClass();
                            int i10 = b0Var.c;
                            int i11 = b0Var.f3561b;
                            int i12 = i10 - i11;
                            this.d = i12;
                            inflater.setInput(b0Var.f3560a, i11, i12);
                        }
                        int inflate = inflater.inflate(k02.f3560a, k02.c, min);
                        int i13 = this.d;
                        if (i13 != 0) {
                            int remaining = i13 - inflater.getRemaining();
                            this.d -= remaining;
                            a0Var.skip(remaining);
                        }
                        if (inflate > 0) {
                            k02.c += inflate;
                            long j11 = inflate;
                            lVar.c += j11;
                            return j11;
                        }
                        if (k02.f3561b == k02.c) {
                            lVar.f3577b = k02.a();
                            c0.a(k02);
                        }
                    } catch (DataFormatException e) {
                        throw new IOException(e);
                    }
                }
                return 0L;
            }
            j1.i.l("closed");
            return 0L;
        }
        i.d(ai.onnxruntime.a.h(j10, "byteCount < 0: "));
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.c.end();
        this.e = true;
        this.f3583b.close();
    }

    @Override // l9.g0
    public final long read(l lVar, long j10) {
        lVar.getClass();
        do {
            long b10 = b(lVar, j10);
            if (b10 > 0) {
                return b10;
            }
            Inflater inflater = this.c;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f3583b.k());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // l9.g0
    public final j0 timeout() {
        return this.f3583b.f3558b.timeout();
    }
}
