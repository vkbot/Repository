package l9;

import java.io.OutputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class x implements e0 {

    /* renamed from: b, reason: collision with root package name */
    public final OutputStream f3586b;
    public final j0 c;

    public x(OutputStream outputStream, j0 j0Var) {
        outputStream.getClass();
        this.f3586b = outputStream;
        this.c = j0Var;
    }

    @Override // l9.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3586b.close();
    }

    @Override // l9.e0, java.io.Flushable
    public final void flush() {
        this.f3586b.flush();
    }

    @Override // l9.e0
    public final j0 timeout() {
        return this.c;
    }

    public final String toString() {
        return "sink(" + this.f3586b + ')';
    }

    @Override // l9.e0
    public final void write(l lVar, long j10) {
        lVar.getClass();
        b.d(lVar.c, 0L, j10);
        while (j10 > 0) {
            this.c.throwIfReached();
            b0 b0Var = lVar.f3577b;
            b0Var.getClass();
            int min = (int) Math.min(j10, b0Var.c - b0Var.f3561b);
            this.f3586b.write(b0Var.f3560a, b0Var.f3561b, min);
            int i10 = b0Var.f3561b + min;
            b0Var.f3561b = i10;
            long j11 = min;
            j10 -= j11;
            lVar.c -= j11;
            if (i10 == b0Var.c) {
                lVar.f3577b = b0Var.a();
                c0.a(b0Var);
            }
        }
    }
}
