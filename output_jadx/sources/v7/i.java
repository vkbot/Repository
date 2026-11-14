package v7;

import n7.h0;
import n7.k0;
import o7.f3;
import o7.t1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final j f5958a;

    /* renamed from: b, reason: collision with root package name */
    public final e f5959b;
    public final k0 c;
    public n7.j d;
    public h0 e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5960f = false;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f5961g;

    public i(x xVar, j jVar, f3 f3Var, t1 t1Var) {
        this.f5961g = xVar;
        this.f5958a = jVar;
        this.c = f3Var;
        this.e = t1Var;
        e eVar = new e(new h(1, this));
        this.f5959b = eVar;
        this.d = n7.j.f4214b;
        eVar.i(f3Var);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address = ");
        sb.append(this.f5958a);
        sb.append(", state = ");
        sb.append(this.d);
        sb.append(", picker type: ");
        sb.append(this.e.getClass());
        sb.append(", lb: ");
        sb.append(this.f5959b.g().getClass());
        if (this.f5960f) {
            str = ", deactivated";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
