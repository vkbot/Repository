package c6;

import f6.f;
import r5.c;
import y5.k;
import z5.i;
import z5.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f537g = {3808, 476, 2107, 1799};

    /* renamed from: a, reason: collision with root package name */
    public final f6.b f538a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f539b;
    public int c;
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f540f;

    public b(f6.b bVar) {
        this.f538a = bVar;
    }

    public static o[] b(o[] oVarArr, int i10, int i11) {
        float f8 = i11 / (i10 * 2.0f);
        o oVar = oVarArr[0];
        float f10 = oVar.f6875a;
        o oVar2 = oVarArr[2];
        float f11 = oVar2.f6875a;
        float f12 = f10 - f11;
        float f13 = oVar.f6876b;
        float f14 = oVar2.f6876b;
        float f15 = f13 - f14;
        float f16 = (f10 + f11) / 2.0f;
        float f17 = (f13 + f14) / 2.0f;
        float f18 = f12 * f8;
        float f19 = f15 * f8;
        o oVar3 = new o(f16 + f18, f17 + f19);
        o oVar4 = new o(f16 - f18, f17 - f19);
        o oVar5 = oVarArr[1];
        float f20 = oVar5.f6875a;
        o oVar6 = oVarArr[3];
        float f21 = oVar6.f6875a;
        float f22 = f20 - f21;
        float f23 = oVar5.f6876b;
        float f24 = oVar6.f6876b;
        float f25 = f23 - f24;
        float f26 = (f20 + f21) / 2.0f;
        float f27 = (f23 + f24) / 2.0f;
        float f28 = f22 * f8;
        float f29 = f8 * f25;
        return new o[]{oVar3, new o(f26 + f28, f27 + f29), oVar4, new o(f26 - f28, f27 - f29)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a6.a a(boolean z9) {
        o a10;
        o oVar;
        o oVar2;
        o oVar3;
        char c;
        o a11;
        o a12;
        o oVar4;
        o oVar5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16;
        int i17;
        long j10;
        int i18;
        a aVar;
        f6.b bVar = this.f538a;
        int i19 = -1;
        int i20 = 1;
        int i21 = 0;
        try {
            o[] b10 = new g6.a(bVar).b();
            oVar2 = b10[0];
            oVar3 = b10[1];
            oVar = b10[2];
            a10 = b10[3];
        } catch (i unused) {
            int i22 = bVar.f2343b / 2;
            int i23 = bVar.c / 2;
            int i24 = i22 + 7;
            int i25 = i23 - 7;
            o a13 = e(new a(i24, i25, 0), false, 1, -1).a();
            int i26 = i23 + 7;
            o a14 = e(new a(i24, i26, 0), false, 1, 1).a();
            int i27 = i22 - 7;
            o a15 = e(new a(i27, i26, 0), false, -1, 1).a();
            a10 = e(new a(i27, i25, 0), false, -1, -1).a();
            oVar = a15;
            oVar2 = a13;
            oVar3 = a14;
        }
        int u8 = a.a.u((((oVar2.f6875a + a10.f6875a) + oVar3.f6875a) + oVar.f6875a) / 4.0f);
        int u9 = a.a.u((((oVar2.f6876b + a10.f6876b) + oVar3.f6876b) + oVar.f6876b) / 4.0f);
        char c10 = 15;
        try {
            o[] b11 = new g6.a(bVar, 15, u8, u9).b();
            oVar5 = b11[0];
            oVar4 = b11[1];
            a11 = b11[2];
            a12 = b11[3];
            c = 3;
        } catch (i unused2) {
            int i28 = u8 + 7;
            int i29 = u9 - 7;
            o a16 = e(new a(i28, i29, 0), false, 1, -1).a();
            int i30 = u9 + 7;
            c = 3;
            o a17 = e(new a(i28, i30, 0), false, 1, 1).a();
            int i31 = u8 - 7;
            a11 = e(new a(i31, i30, 0), false, -1, 1).a();
            a12 = e(new a(i31, i29, 0), false, -1, -1).a();
            oVar4 = a17;
            oVar5 = a16;
        }
        a aVar2 = new a(a.a.u((((oVar5.f6875a + a12.f6875a) + oVar4.f6875a) + a11.f6875a) / 4.0f), a.a.u((((oVar5.f6876b + a12.f6876b) + oVar4.f6876b) + a11.f6876b) / 4.0f), 0);
        this.e = 1;
        boolean z11 = true;
        a aVar3 = aVar2;
        a aVar4 = aVar3;
        a aVar5 = aVar4;
        while (true) {
            i10 = aVar5.c;
            i11 = aVar5.f536b;
            i12 = aVar2.c;
            i13 = i21;
            i14 = aVar2.f536b;
            char c11 = c10;
            if (this.e < 9) {
                a e = e(aVar2, z11, i20, i19);
                int i32 = e.c;
                int i33 = e.f536b;
                a e6 = e(aVar3, z11, i20, i20);
                a e10 = e(aVar4, z11, i19, i20);
                a e11 = e(aVar5, z11, i19, i19);
                int i34 = e11.c;
                i15 = i20;
                int i35 = e11.f536b;
                boolean z12 = z11;
                if (this.e > 2) {
                    double h2 = (a.a.h(i35, i34, i33, i32) * this.e) / (a.a.h(i11, i10, i14, i12) * (this.e + 2));
                    if (h2 < 0.75d || h2 > 1.25d) {
                        break;
                    }
                    a aVar6 = new a(i33 - 3, i32 + 3, 0);
                    a aVar7 = new a(e6.f536b - 3, e6.c - 3, 0);
                    aVar = e6;
                    a aVar8 = new a(e10.f536b + 3, e10.c - 3, 0);
                    a aVar9 = new a(i35 + 3, i34 + 3, 0);
                    int c12 = c(aVar9, aVar6);
                    if (c12 == 0 || c(aVar6, aVar7) != c12 || c(aVar7, aVar8) != c12 || c(aVar8, aVar9) != c12) {
                        break;
                    }
                } else {
                    aVar = e6;
                }
                z11 = !z12;
                this.e++;
                aVar4 = e10;
                i21 = i13;
                c10 = c11;
                aVar2 = e;
                i20 = i15;
                aVar5 = e11;
                aVar3 = aVar;
                i19 = -1;
            } else {
                i15 = i20;
                break;
            }
        }
        int i36 = this.e;
        if (i36 != 5 && i36 != 7) {
            throw i.d;
        }
        if (i36 == 5) {
            z10 = i15;
        } else {
            z10 = i13;
        }
        this.f539b = z10;
        int i37 = i36 * 2;
        o[] b12 = b(new o[]{new o(i14 + 0.5f, i12 - 0.5f), new o(aVar3.f536b + 0.5f, aVar3.c + 0.5f), new o(aVar4.f536b - 0.5f, aVar4.c + 0.5f), new o(i11 - 0.5f, i10 - 0.5f)}, i37 - 3, i37);
        if (z9) {
            o oVar6 = b12[i13];
            b12[i13] = b12[2];
            b12[2] = oVar6;
        }
        if (g(b12[i13]) && g(b12[i15]) && g(b12[2]) && g(b12[c])) {
            int i38 = this.e * 2;
            int[] iArr = {h(b12[i13], b12[i15], i38), h(b12[i15], b12[2], i38), h(b12[2], b12[c], i38), h(b12[c], b12[i13], i38)};
            int i39 = i13;
            int i40 = i39;
            while (i39 < 4) {
                int i41 = iArr[i39];
                i40 = (i40 << 3) + ((i41 >> (i38 - 2)) << 1) + (i41 & 1);
                i39++;
            }
            int i42 = ((i40 & 1) << 11) + (i40 >> 1);
            for (int i43 = i13; i43 < 4; i43++) {
                if (Integer.bitCount(f537g[i43] ^ i42) <= 2) {
                    this.f540f = i43;
                    long j11 = 0;
                    int i44 = i13;
                    while (true) {
                        i16 = 10;
                        if (i44 >= 4) {
                            break;
                        }
                        int i45 = iArr[(this.f540f + i44) % 4];
                        if (this.f539b) {
                            j10 = j11 << 7;
                            i18 = (i45 >> 1) & 127;
                        } else {
                            j10 = j11 << 10;
                            i18 = ((i45 >> 2) & 992) + ((i45 >> 1) & 31);
                        }
                        j11 = j10 + i18;
                        i44++;
                    }
                    if (this.f539b) {
                        i16 = 7;
                        i17 = 2;
                    } else {
                        i17 = 4;
                    }
                    int i46 = i16 - i17;
                    int[] iArr2 = new int[i16];
                    for (int i47 = i16 - 1; i47 >= 0; i47--) {
                        iArr2[i47] = ((int) j11) & 15;
                        j11 >>= 4;
                    }
                    try {
                        new c(19, h6.a.f2590k).f(iArr2, i46);
                        int i48 = i13;
                        for (int i49 = i48; i49 < i17; i49++) {
                            i48 = (i48 << 4) + iArr2[i49];
                        }
                        if (this.f539b) {
                            this.c = (i48 >> 6) + 1;
                            this.d = (i48 & 63) + 1;
                        } else {
                            this.c = (i48 >> 11) + 1;
                            this.d = (i48 & 2047) + 1;
                        }
                        int i50 = this.f540f;
                        o oVar7 = b12[i50 % 4];
                        o oVar8 = b12[(i50 + 1) % 4];
                        o oVar9 = b12[(i50 + 2) % 4];
                        o oVar10 = b12[(i50 + 3) % 4];
                        int d = d();
                        float f8 = d / 2.0f;
                        float f10 = this.e;
                        float f11 = f8 - f10;
                        float f12 = f8 + f10;
                        return new a6.a(k.q(bVar, d, d, f.a(f11, f11, f12, f11, f12, f12, f11, f12, oVar7.f6875a, oVar7.f6876b, oVar8.f6875a, oVar8.f6876b, oVar9.f6875a, oVar9.f6876b, oVar10.f6875a, oVar10.f6876b)), b(b12, this.e * 2, d()), this.f539b, this.d, this.c);
                    } catch (h6.c unused3) {
                        throw i.d;
                    }
                }
            }
            throw i.d;
        }
        throw i.d;
    }

    public final int c(a aVar, a aVar2) {
        int i10 = aVar.f536b;
        int i11 = aVar.c;
        float h2 = a.a.h(i10, i11, aVar2.f536b, aVar2.c);
        float f8 = (r1 - i10) / h2;
        float f10 = (r13 - i11) / h2;
        float f11 = i10;
        float f12 = i11;
        f6.b bVar = this.f538a;
        boolean b10 = bVar.b(i10, i11);
        int ceil = (int) Math.ceil(h2);
        boolean z9 = false;
        int i12 = 0;
        for (int i13 = 0; i13 < ceil; i13++) {
            f11 += f8;
            f12 += f10;
            if (bVar.b(a.a.u(f11), a.a.u(f12)) != b10) {
                i12++;
            }
        }
        float f13 = i12 / h2;
        if (f13 > 0.1f && f13 < 0.9f) {
            return 0;
        }
        if (f13 <= 0.1f) {
            z9 = true;
        }
        if (z9 == b10) {
            return 1;
        }
        return -1;
    }

    public final int d() {
        boolean z9 = this.f539b;
        int i10 = this.c;
        if (z9) {
            return (i10 * 4) + 11;
        }
        if (i10 <= 4) {
            return (i10 * 4) + 15;
        }
        return ((((i10 - 4) / 8) + 1) * 2) + (i10 * 4) + 15;
    }

    public final a e(a aVar, boolean z9, int i10, int i11) {
        f6.b bVar;
        int i12 = aVar.f536b + i10;
        int i13 = aVar.c;
        while (true) {
            i13 += i11;
            boolean f8 = f(i12, i13);
            bVar = this.f538a;
            if (!f8 || bVar.b(i12, i13) != z9) {
                break;
            }
            i12 += i10;
        }
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        while (f(i14, i15) && bVar.b(i14, i15) == z9) {
            i14 += i10;
        }
        int i16 = i14 - i10;
        while (f(i16, i15) && bVar.b(i16, i15) == z9) {
            i15 += i11;
        }
        return new a(i16, i15 - i11, 0);
    }

    public final boolean f(int i10, int i11) {
        if (i10 >= 0) {
            f6.b bVar = this.f538a;
            if (i10 < bVar.f2343b && i11 > 0 && i11 < bVar.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean g(o oVar) {
        return f(a.a.u(oVar.f6875a), a.a.u(oVar.f6876b));
    }

    public final int h(o oVar, o oVar2, int i10) {
        float f8 = oVar.f6875a;
        float f10 = oVar.f6876b;
        float f11 = oVar2.f6875a;
        float f12 = oVar2.f6876b;
        float g10 = a.a.g(f8, f10, f11, f12);
        float f13 = g10 / i10;
        float f14 = oVar.f6875a;
        float f15 = ((oVar2.f6875a - f14) * f13) / g10;
        float f16 = ((f12 - f10) * f13) / g10;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            float f17 = i12;
            if (this.f538a.b(a.a.u((f17 * f15) + f14), a.a.u((f17 * f16) + f10))) {
                i11 |= 1 << ((i10 - i12) - 1);
            }
        }
        return i11;
    }
}
