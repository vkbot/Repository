package o7;

import androidx.core.app.NotificationCompat;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k extends u0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f4565a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f4566b = new AtomicInteger(-2147483647);
    public volatile n7.f1 c;

    public k(l lVar, c0 c0Var, String str) {
        new u2(this);
        o4.b.i(c0Var, "delegate");
        this.f4565a = c0Var;
    }

    @Override // o7.u0, o7.n2
    public final void a(n7.f1 f1Var) {
        o4.b.i(f1Var, NotificationCompat.CATEGORY_STATUS);
        synchronized (this) {
            try {
                if (this.f4566b.get() < 0) {
                    this.c = f1Var;
                    this.f4566b.addAndGet(Integer.MAX_VALUE);
                    if (this.f4566b.get() != 0) {
                        return;
                    }
                    super.a(f1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o7.x
    public final u d(n7.x0 x0Var, n7.v0 v0Var, n7.c cVar, n7.e[] eVarArr) {
        cVar.getClass();
        if (this.f4566b.get() >= 0) {
            return new s0(this.c, v.f4733b, eVarArr);
        }
        return this.f4565a.d(x0Var, v0Var, cVar, eVarArr);
    }

    @Override // o7.u0
    public final c0 e() {
        return this.f4565a;
    }
}
