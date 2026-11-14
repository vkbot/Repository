package s6;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends l.d {
    public final boolean e;

    public e(c cVar, boolean z9) {
        super(cVar);
        this.e = z9;
    }

    public final a S() {
        a[] aVarArr = (a[]) this.d;
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        b bVar4 = new b();
        for (a aVar : aVarArr) {
            if (aVar != null) {
                aVar.b();
                int i10 = aVar.e % 30;
                int i11 = aVar.f5714f;
                if (!this.e) {
                    i11 += 2;
                }
                int i12 = i11 % 3;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            bVar.b(i10 + 1);
                        }
                    } else {
                        bVar4.b(i10 / 3);
                        bVar3.b(i10 % 3);
                    }
                } else {
                    bVar2.b((i10 * 3) + 1);
                }
            }
        }
        if (bVar.a().length != 0 && bVar2.a().length != 0 && bVar3.a().length != 0 && bVar4.a().length != 0 && bVar.a()[0] > 0 && bVar2.a()[0] + bVar3.a()[0] >= 3 && bVar2.a()[0] + bVar3.a()[0] <= 90) {
            a aVar2 = new a(bVar.a()[0], bVar2.a()[0], bVar3.a()[0], bVar4.a()[0], 0);
            T(aVarArr, aVar2);
            return aVar2;
        }
        return null;
    }

    public final void T(a[] aVarArr, a aVar) {
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            a aVar2 = aVarArr[i10];
            if (aVar2 != null) {
                int i11 = aVar2.e % 30;
                int i12 = aVar2.f5714f;
                if (i12 > aVar.f5714f) {
                    aVarArr[i10] = null;
                } else {
                    if (!this.e) {
                        i12 += 2;
                    }
                    int i13 = i12 % 3;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 == 2 && i11 + 1 != aVar.f5713b) {
                                aVarArr[i10] = null;
                            }
                        } else if (i11 / 3 != aVar.c || i11 % 3 != aVar.e) {
                            aVarArr[i10] = null;
                        }
                    } else if ((i11 * 3) + 1 != aVar.d) {
                        aVarArr[i10] = null;
                    }
                }
            }
        }
    }

    @Override // l.d
    public final String toString() {
        return "IsLeft: " + this.e + '\n' + super.toString();
    }
}
