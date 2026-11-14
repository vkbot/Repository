package l;

import c0.l;
import j.d0;
import j.r;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f extends l {
    public r d;

    @Override // c0.l
    public final int b(Object obj) {
        d0 d0Var = (d0) obj;
        if (d0Var == null) {
            return 1;
        }
        return d0Var.b();
    }

    @Override // c0.l
    public final void c(Object obj, Object obj2) {
        d0 d0Var = (d0) obj2;
        r rVar = this.d;
        if (rVar != null && d0Var != null) {
            rVar.e.b(d0Var, true);
        }
    }
}
