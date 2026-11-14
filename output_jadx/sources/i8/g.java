package i8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g extends x7.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2848b;
    public final Object c;
    public final Object d;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.f2848b = i10;
        this.c = obj;
        this.d = obj2;
    }

    @Override // x7.e
    public final void d(x7.f fVar) {
        boolean z9;
        switch (this.f2848b) {
            case 0:
                ((x7.l) this.c).a(new e(fVar, (b8.d) this.d, 1));
                return;
            default:
                x7.e[] eVarArr = (x7.e[]) this.c;
                int length = eVarArr.length;
                if (length == 1) {
                    eVarArr[0].c(new g8.c(fVar, new r5.c(21, this), 1));
                    return;
                }
                v vVar = new v(fVar, length, (p2.e) this.d);
                fVar.b(vVar);
                for (int i10 = 0; i10 < length; i10++) {
                    if (vVar.get() <= 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9) {
                        x7.e eVar = eVarArr[i10];
                        if (eVar == null) {
                            NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                            if (vVar.getAndSet(0) > 0) {
                                vVar.a(i10);
                                vVar.f2860b.onError(nullPointerException);
                                return;
                            } else {
                                a.a.s(nullPointerException);
                                return;
                            }
                        }
                        eVar.c(vVar.d[i10]);
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
