package g6;

import f6.b;
import z5.i;
import z5.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f2470a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2471b;
    public final int c;
    public final int d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2472f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2473g;

    public a(b bVar, int i10, int i11, int i12) {
        this.f2470a = bVar;
        int i13 = bVar.c;
        this.f2471b = i13;
        int i14 = bVar.f2343b;
        this.c = i14;
        int i15 = i10 / 2;
        int i16 = i11 - i15;
        this.d = i16;
        int i17 = i11 + i15;
        this.e = i17;
        int i18 = i12 - i15;
        this.f2473g = i18;
        int i19 = i12 + i15;
        this.f2472f = i19;
        if (i18 >= 0 && i16 >= 0 && i19 < i13 && i17 < i14) {
        } else {
            throw i.d;
        }
    }

    public final boolean a(int i10, int i11, int i12, boolean z9) {
        b bVar = this.f2470a;
        if (z9) {
            while (i10 <= i11) {
                if (!bVar.b(i10, i12)) {
                    i10++;
                } else {
                    return true;
                }
            }
            return false;
        }
        while (i10 <= i11) {
            if (bVar.b(i12, i10)) {
                return true;
            }
            i10++;
        }
        return false;
    }

    public final o[] b() {
        int i10;
        int i11;
        int i12 = this.d;
        int i13 = this.e;
        int i14 = this.f2473g;
        int i15 = this.f2472f;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = true;
        do {
            i10 = this.c;
            if (!z14) {
                break;
            }
            boolean z15 = false;
            boolean z16 = true;
            while (true) {
                if ((z16 || !z10) && i13 < i10) {
                    z16 = a(i14, i15, i13, false);
                    if (z16) {
                        i13++;
                        z10 = true;
                        z15 = true;
                    } else if (!z10) {
                        i13++;
                    }
                }
            }
            if (i13 >= i10) {
                break;
            }
            boolean z17 = true;
            while (true) {
                i11 = this.f2471b;
                if ((z17 || !z11) && i15 < i11) {
                    z17 = a(i12, i13, i15, true);
                    if (z17) {
                        i15++;
                        z11 = true;
                        z15 = true;
                    } else if (!z11) {
                        i15++;
                    }
                }
            }
            if (i15 >= i11) {
                break;
            }
            boolean z18 = true;
            while (true) {
                if ((z18 || !z12) && i12 >= 0) {
                    z18 = a(i14, i15, i12, false);
                    if (z18) {
                        i12--;
                        z12 = true;
                        z15 = true;
                    } else if (!z12) {
                        i12--;
                    }
                }
            }
            if (i12 < 0) {
                break;
            }
            z14 = z15;
            boolean z19 = true;
            while (true) {
                if ((z19 || !z13) && i14 >= 0) {
                    z19 = a(i12, i13, i14, true);
                    if (z19) {
                        i14--;
                        z14 = true;
                        z13 = true;
                    } else if (!z13) {
                        i14--;
                    }
                }
            }
        } while (i14 >= 0);
        z9 = true;
        if (!z9) {
            int i16 = i13 - i12;
            o oVar = null;
            o oVar2 = null;
            for (int i17 = 1; oVar2 == null && i17 < i16; i17++) {
                oVar2 = c(i12, i15 - i17, i12 + i17, i15);
            }
            if (oVar2 != null) {
                o oVar3 = null;
                for (int i18 = 1; oVar3 == null && i18 < i16; i18++) {
                    oVar3 = c(i12, i14 + i18, i12 + i18, i14);
                }
                if (oVar3 != null) {
                    o oVar4 = null;
                    for (int i19 = 1; oVar4 == null && i19 < i16; i19++) {
                        oVar4 = c(i13, i14 + i19, i13 - i19, i14);
                    }
                    if (oVar4 != null) {
                        for (int i20 = 1; oVar == null && i20 < i16; i20++) {
                            oVar = c(i13, i15 - i20, i13 - i20, i15);
                        }
                        if (oVar != null) {
                            float f8 = oVar.f6875a;
                            float f10 = oVar.f6876b;
                            float f11 = oVar2.f6875a;
                            float f12 = oVar2.f6876b;
                            float f13 = oVar4.f6875a;
                            float f14 = oVar4.f6876b;
                            float f15 = oVar3.f6875a;
                            float f16 = oVar3.f6876b;
                            if (f8 < i10 / 2.0f) {
                                return new o[]{new o(f15 - 1.0f, f16 + 1.0f), new o(f11 + 1.0f, f12 + 1.0f), new o(f13 - 1.0f, f14 - 1.0f), new o(f8 + 1.0f, f10 - 1.0f)};
                            }
                            return new o[]{new o(f15 + 1.0f, f16 + 1.0f), new o(f11 + 1.0f, f12 - 1.0f), new o(f13 - 1.0f, f14 + 1.0f), new o(f8 - 1.0f, f10 - 1.0f)};
                        }
                        throw i.d;
                    }
                    throw i.d;
                }
                throw i.d;
            }
            throw i.d;
        }
        throw i.d;
    }

    public final o c(float f8, float f10, float f11, float f12) {
        int u8 = a.a.u(a.a.g(f8, f10, f11, f12));
        float f13 = u8;
        float f14 = (f11 - f8) / f13;
        float f15 = (f12 - f10) / f13;
        for (int i10 = 0; i10 < u8; i10++) {
            float f16 = i10;
            int u9 = a.a.u((f16 * f14) + f8);
            int u10 = a.a.u((f16 * f15) + f10);
            if (this.f2470a.b(u9, u10)) {
                return new o(u9, u10);
            }
        }
        return null;
    }

    public a(b bVar) {
        this(bVar, 10, bVar.f2343b / 2, bVar.c / 2);
    }
}
