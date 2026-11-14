package v7;

import n7.v0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class r extends n7.g {

    /* renamed from: a, reason: collision with root package name */
    public final k f5978a;

    /* renamed from: b, reason: collision with root package name */
    public final n7.g f5979b;

    public r(k kVar, n7.g gVar) {
        this.f5978a = kVar;
        this.f5979b = gVar;
    }

    @Override // n7.g
    public final n7.e a(j4.b bVar, v0 v0Var) {
        n7.g gVar = this.f5979b;
        if (gVar != null) {
            return new p(this, gVar.a(bVar, v0Var));
        }
        return new q(this);
    }
}
