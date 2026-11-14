package s6;

import z5.i;
import z5.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final f6.b f5716a;

    /* renamed from: b, reason: collision with root package name */
    public final o f5717b;
    public final o c;
    public final o d;
    public final o e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5718f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5719g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5720h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5721i;

    public c(f6.b bVar, o oVar, o oVar2, o oVar3, o oVar4) {
        boolean z9;
        if (oVar != null && oVar2 != null) {
            z9 = false;
        } else {
            z9 = true;
        }
        boolean z10 = oVar3 == null || oVar4 == null;
        if (z9 && z10) {
            throw i.d;
        }
        if (z9) {
            oVar = new o(0.0f, oVar3.f6876b);
            oVar2 = new o(0.0f, oVar4.f6876b);
        } else if (z10) {
            int i10 = bVar.f2343b;
            oVar3 = new o(i10 - 1, oVar.f6876b);
            oVar4 = new o(i10 - 1, oVar2.f6876b);
        }
        this.f5716a = bVar;
        this.f5717b = oVar;
        this.c = oVar2;
        this.d = oVar3;
        this.e = oVar4;
        this.f5718f = (int) Math.min(oVar.f6875a, oVar2.f6875a);
        this.f5719g = (int) Math.max(oVar3.f6875a, oVar4.f6875a);
        this.f5720h = (int) Math.min(oVar.f6876b, oVar3.f6876b);
        this.f5721i = (int) Math.max(oVar2.f6876b, oVar4.f6876b);
    }

    public c(c cVar) {
        this.f5716a = cVar.f5716a;
        this.f5717b = cVar.f5717b;
        this.c = cVar.c;
        this.d = cVar.d;
        this.e = cVar.e;
        this.f5718f = cVar.f5718f;
        this.f5719g = cVar.f5719g;
        this.f5720h = cVar.f5720h;
        this.f5721i = cVar.f5721i;
    }
}
