package u7;

import m4.m;
import n7.f1;
import n7.h1;
import n7.v0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d extends n7.e {

    /* renamed from: b, reason: collision with root package name */
    public final a f5903b;
    public Object c;
    public boolean d = false;

    public d(a aVar) {
        this.f5903b = aVar;
    }

    @Override // n7.e
    public final void o(f1 f1Var, v0 v0Var) {
        boolean f8 = f1Var.f();
        a aVar = this.f5903b;
        if (f8) {
            if (!this.d) {
                if (m.f3929g.d(aVar, null, new m4.c(new h1(f1.f4200l.h("No value received for unary call"), v0Var)))) {
                    m.c(aVar, false);
                }
            }
            Object obj = this.c;
            if (obj == null) {
                obj = m.f3930h;
            }
            if (m.f3929g.d(aVar, null, obj)) {
                m.c(aVar, false);
                return;
            }
            return;
        }
        if (m.f3929g.d(aVar, null, new m4.c(new h1(f1Var, v0Var)))) {
            m.c(aVar, false);
        }
    }

    @Override // n7.e
    public final void q(Object obj) {
        if (!this.d) {
            this.c = obj;
            this.d = true;
            return;
        }
        throw f1.f4200l.h("More than one value received for unary call").a();
    }

    @Override // n7.e
    public final void p(v0 v0Var) {
    }
}
