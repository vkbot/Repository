package h8;

import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class w extends a {
    public final /* synthetic */ int d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a0 a0Var) {
        super(a0Var);
        this.d = 2;
        this.e = p8.a.f5113b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [x7.d, o8.c] */
    @Override // x7.b
    public final void e(x7.d dVar) {
        switch (this.d) {
            case 0:
                b8.d dVar2 = (b8.d) this.e;
                boolean z9 = dVar instanceof e8.a;
                x7.b bVar = this.c;
                if (z9) {
                    bVar.d(new u((e8.a) dVar, dVar2, 0));
                    return;
                } else {
                    bVar.d(new v(dVar, dVar2));
                    return;
                }
            case 1:
                r5.c cVar = (r5.c) this.e;
                boolean z10 = dVar instanceof e8.a;
                x7.b bVar2 = this.c;
                if (z10) {
                    bVar2.d(new u((e8.a) dVar, cVar, 1));
                    return;
                } else {
                    bVar2.d(new g0(dVar, cVar));
                    return;
                }
            default:
                try {
                    ((p8.a) this.e).getClass();
                    ArrayList arrayList = new ArrayList();
                    ?? cVar2 = new o8.c(dVar);
                    cVar2.c = arrayList;
                    this.c.d(cVar2);
                    return;
                } catch (Throwable th) {
                    com.bumptech.glide.d.v(th);
                    o8.d.b(th, dVar);
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x7.b bVar, Object obj, int i10) {
        super(bVar);
        this.d = i10;
        this.e = obj;
    }
}
