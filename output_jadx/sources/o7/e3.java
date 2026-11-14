package o7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e3 extends n7.j0 {

    /* renamed from: f, reason: collision with root package name */
    public final n7.e f4473f;

    /* renamed from: g, reason: collision with root package name */
    public n7.t f4474g;

    /* renamed from: h, reason: collision with root package name */
    public n7.j f4475h = n7.j.e;

    public e3(n7.e eVar) {
        this.f4473f = eVar;
    }

    @Override // n7.j0
    public final n7.f1 a(n7.g0 g0Var) {
        Boolean bool;
        List list = g0Var.f4206a;
        if (list.isEmpty()) {
            n7.f1 h2 = n7.f1.f4201m.h("NameResolver returned no usable address. addrs=" + list + ", attrs=" + g0Var.f4207b);
            c(h2);
            return h2;
        }
        Object obj = g0Var.c;
        if ((obj instanceof c3) && (bool = ((c3) obj).f4447a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        n7.t tVar = this.f4474g;
        if (tVar == null) {
            n7.e0 d = n7.e0.d();
            d.e(list);
            n7.e0 b10 = d.b();
            n7.e eVar = this.f4473f;
            n7.t b11 = eVar.b(b10);
            b11.p(new b3(this, b11));
            this.f4474g = b11;
            d3 d3Var = new d3(n7.f0.b(b11, null));
            n7.j jVar = n7.j.f4214b;
            this.f4475h = jVar;
            eVar.D(jVar, d3Var);
            b11.l();
        } else {
            tVar.q(list);
        }
        return n7.f1.e;
    }

    @Override // n7.j0
    public final void c(n7.f1 f1Var) {
        n7.t tVar = this.f4474g;
        if (tVar != null) {
            tVar.n();
            this.f4474g = null;
        }
        d3 d3Var = new d3(n7.f0.a(f1Var));
        n7.j jVar = n7.j.d;
        this.f4475h = jVar;
        this.f4473f.D(jVar, d3Var);
    }

    @Override // n7.j0
    public final void e() {
        n7.t tVar = this.f4474g;
        if (tVar != null) {
            tVar.l();
        }
    }

    @Override // n7.j0
    public final void f() {
        n7.t tVar = this.f4474g;
        if (tVar != null) {
            tVar.n();
        }
    }
}
