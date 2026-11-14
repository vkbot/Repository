package z3;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m extends a.a {
    @Override // a.a
    public final void k(y yVar, float f8, float f10) {
        float f11 = f10 * f8;
        yVar.d(f11, 180.0f, 90.0f);
        float f12 = f11 * 2.0f;
        u uVar = new u(0.0f, 0.0f, f12, f12);
        uVar.f6815f = 180.0f;
        uVar.f6816g = 90.0f;
        yVar.f6823f.add(uVar);
        s sVar = new s(uVar);
        yVar.a(180.0f);
        yVar.f6824g.add(sVar);
        yVar.d = 270.0f;
        float f13 = (0.0f + f12) * 0.5f;
        float f14 = (f12 - 0.0f) / 2.0f;
        double d = 270.0f;
        yVar.f6822b = (((float) Math.cos(Math.toRadians(d))) * f14) + f13;
        yVar.c = (f14 * ((float) Math.sin(Math.toRadians(d)))) + f13;
    }
}
