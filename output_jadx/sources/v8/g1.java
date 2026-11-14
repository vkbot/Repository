package v8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class g1 extends a9.b {

    /* renamed from: b, reason: collision with root package name */
    public final d1 f6028b;
    public j1 c;
    public final /* synthetic */ h1 d;
    public final /* synthetic */ u0 e;

    public g1(d1 d1Var, h1 h1Var, u0 u0Var) {
        this.d = h1Var;
        this.e = u0Var;
        this.f6028b = d1Var;
    }

    @Override // a9.b
    public final void a(Object obj, Object obj2) {
        boolean z9;
        Object obj3;
        a9.m mVar = (a9.m) obj;
        if (obj2 == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        d1 d1Var = this.f6028b;
        if (z9) {
            obj3 = d1Var;
        } else {
            obj3 = this.c;
        }
        if (obj3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a9.m.f78b;
            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, this, obj3)) {
                if (atomicReferenceFieldUpdater.get(mVar) != this) {
                    return;
                }
            }
            if (z9) {
                j1 j1Var = this.c;
                j1Var.getClass();
                d1Var.e(j1Var);
            }
        }
    }

    @Override // a9.b
    public final a9.w c(Object obj) {
        if (this.d.w() == this.e) {
            return null;
        }
        return a9.a.d;
    }
}
