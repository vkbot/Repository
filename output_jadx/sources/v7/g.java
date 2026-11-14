package v7;

import java.util.IdentityHashMap;
import java.util.Map;
import n7.i0;
import n7.j0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g extends b {
    public final n7.t d;
    public final i0 e;

    public g(n7.t tVar, i0 i0Var) {
        o4.b.i(tVar, "delegate");
        this.d = tVar;
        o4.b.i(i0Var, "healthListener");
        this.e = i0Var;
    }

    @Override // n7.t
    public final n7.b d() {
        n7.b d = this.d.d();
        d.getClass();
        Boolean bool = Boolean.TRUE;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(j0.d, bool);
        for (Map.Entry entry : d.f4158a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((n7.a) entry.getKey(), entry.getValue());
            }
        }
        return new n7.b(identityHashMap);
    }

    @Override // n7.t
    public final void p(i0 i0Var) {
        this.d.p(new f(this, i0Var, 0));
    }

    @Override // v7.b
    public final n7.t r() {
        return this.d;
    }
}
