package l9;

import java.io.IOException;
import kotlin.Unit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class e implements e0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f3568b;
    public final /* synthetic */ e0 c;

    public e(g gVar, e0 e0Var) {
        this.f3568b = gVar;
        this.c = e0Var;
    }

    @Override // l9.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e0 e0Var = this.c;
        g gVar = this.f3568b;
        gVar.enter();
        try {
            e0Var.close();
            Unit unit = Unit.INSTANCE;
            if (!gVar.exit()) {
            } else {
                throw gVar.access$newTimeoutException(null);
            }
        } catch (IOException e) {
            if (!gVar.exit()) {
                throw e;
            }
            throw gVar.access$newTimeoutException(e);
        } finally {
            gVar.exit();
        }
    }

    @Override // l9.e0, java.io.Flushable
    public final void flush() {
        e0 e0Var = this.c;
        g gVar = this.f3568b;
        gVar.enter();
        try {
            e0Var.flush();
            Unit unit = Unit.INSTANCE;
            if (!gVar.exit()) {
            } else {
                throw gVar.access$newTimeoutException(null);
            }
        } catch (IOException e) {
            if (!gVar.exit()) {
                throw e;
            }
            throw gVar.access$newTimeoutException(e);
        } finally {
            gVar.exit();
        }
    }

    @Override // l9.e0
    public final j0 timeout() {
        return this.f3568b;
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.c + ')';
    }

    @Override // l9.e0
    public final void write(l lVar, long j10) {
        lVar.getClass();
        b.d(lVar.c, 0L, j10);
        while (true) {
            long j11 = 0;
            if (j10 > 0) {
                b0 b0Var = lVar.f3577b;
                b0Var.getClass();
                while (true) {
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += b0Var.c - b0Var.f3561b;
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        b0Var = b0Var.f3562f;
                        b0Var.getClass();
                    }
                }
                e0 e0Var = this.c;
                g gVar = this.f3568b;
                gVar.enter();
                try {
                    try {
                        e0Var.write(lVar, j11);
                        Unit unit = Unit.INSTANCE;
                        if (!gVar.exit()) {
                            j10 -= j11;
                        } else {
                            throw gVar.access$newTimeoutException(null);
                        }
                    } catch (IOException e) {
                        if (!gVar.exit()) {
                            throw e;
                        }
                        throw gVar.access$newTimeoutException(e);
                    }
                } catch (Throwable th) {
                    gVar.exit();
                    throw th;
                }
            } else {
                return;
            }
        }
    }
}
