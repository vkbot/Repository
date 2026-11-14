package o7;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g4 extends n7.t {
    public final n7.t d;
    public final /* synthetic */ h4 e;

    public g4(h4 h4Var, n7.t tVar) {
        this.e = h4Var;
        this.d = tVar;
    }

    @Override // n7.t
    public final void i(n7.f1 f1Var) {
        this.d.i(f1Var);
        this.e.d.execute(new f5.j(11, this));
    }

    @Override // n7.t
    public final void j(n7.z0 z0Var) {
        n7.b bVar = z0Var.f4262b;
        IdentityHashMap identityHashMap = bVar.f4158a;
        n7.a aVar = h4.e;
        if (identityHashMap.get(aVar) == null) {
            List list = Collections.EMPTY_LIST;
            n7.b bVar2 = n7.b.f4157b;
            List list2 = z0Var.f4261a;
            n7.y0 y0Var = z0Var.c;
            bVar.getClass();
            f4 f4Var = new f4(this.e);
            IdentityHashMap identityHashMap2 = new IdentityHashMap(1);
            identityHashMap2.put(aVar, f4Var);
            for (Map.Entry entry : bVar.f4158a.entrySet()) {
                if (!identityHashMap2.containsKey(entry.getKey())) {
                    identityHashMap2.put((n7.a) entry.getKey(), entry.getValue());
                }
            }
            this.d.j(new n7.z0(list2, new n7.b(identityHashMap2), y0Var));
            return;
        }
        j1.i.l("RetryingNameResolver can only be used once to wrap a NameResolver");
    }
}
