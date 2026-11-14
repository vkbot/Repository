package n6;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import z5.l;
import z5.m;
import z5.n;
import z5.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class h implements z5.k {
    public static float d(int[] iArr, int[] iArr2, float f8) {
        float f10;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = i10;
        float f12 = f11 / i11;
        float f13 = f8 * f12;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            float f15 = iArr2[i13] * f12;
            float f16 = iArr[i13];
            if (f16 > f15) {
                f10 = f16 - f15;
            } else {
                f10 = f15 - f16;
            }
            if (f10 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f10;
        }
        return f14 / f11;
    }

    public static void e(int i10, f6.a aVar, int[] iArr) {
        int length = iArr.length;
        int i11 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int i12 = aVar.c;
        if (i10 < i12) {
            boolean z9 = !aVar.d(i10);
            while (i10 < i12) {
                if (aVar.d(i10) != z9) {
                    iArr[i11] = iArr[i11] + 1;
                } else {
                    i11++;
                    if (i11 == length) {
                        break;
                    }
                    iArr[i11] = 1;
                    z9 = !z9;
                }
                i10++;
            }
            if (i11 != length) {
                if (i11 != length - 1 || i10 != i12) {
                    throw z5.i.d;
                }
                return;
            }
            return;
        }
        throw z5.i.d;
    }

    public static void f(int i10, f6.a aVar, int[] iArr) {
        int length = iArr.length;
        boolean d = aVar.d(i10);
        while (i10 > 0 && length >= 0) {
            i10--;
            if (aVar.d(i10) != d) {
                length--;
                d = !d;
            }
        }
        if (length < 0) {
            e(i10 + 1, aVar, iArr);
            return;
        }
        throw z5.i.d;
    }

    @Override // z5.k
    public m a(z5.b bVar, Map map) {
        try {
            return c(bVar, map);
        } catch (z5.i e) {
            if (map != null && map.containsKey(z5.d.e) && bVar.f6849a.f2350a.c()) {
                z5.g d = bVar.f6849a.f2350a.d();
                m c = c(new z5.b(new f6.e(d)), map);
                Map map2 = c.e;
                n nVar = n.f6867b;
                int i10 = 270;
                if (map2 != null && map2.containsKey(nVar)) {
                    i10 = (((Integer) map2.get(nVar)).intValue() + 270) % 360;
                }
                c.b(nVar, Integer.valueOf(i10));
                o[] oVarArr = c.c;
                if (oVarArr != null) {
                    int i11 = d.f6861b;
                    for (int i12 = 0; i12 < oVarArr.length; i12++) {
                        o oVar = oVarArr[i12];
                        oVarArr[i12] = new o((i11 - oVar.f6876b) - 1.0f, oVar.f6875a);
                    }
                }
                return c;
            }
            throw e;
        }
    }

    public abstract m b(int i10, f6.a aVar, Map map);

    public final m c(z5.b bVar, Map map) {
        boolean z9;
        int i10;
        int i11;
        Map map2;
        int i12;
        z5.b bVar2 = bVar;
        Map map3 = map;
        z5.g gVar = bVar2.f6849a.f2350a;
        int i13 = gVar.f6860a;
        int i14 = gVar.f6861b;
        f6.a aVar = new f6.a(i13);
        int i15 = 1;
        if (map3 != null && map3.containsKey(z5.d.e)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i10 = 8;
        } else {
            i10 = 5;
        }
        int max = Math.max(1, i14 >> i10);
        if (z9) {
            i11 = i14;
        } else {
            i11 = 15;
        }
        int i16 = i14 / 2;
        int i17 = 0;
        while (i17 < i11) {
            int i18 = i17 + 1;
            int i19 = i18 / 2;
            if ((i17 & 1) != 0) {
                i19 = -i19;
            }
            int i20 = (i19 * max) + i16;
            if (i20 < 0 || i20 >= i14) {
                break;
            }
            try {
                aVar = bVar2.b(aVar, i20);
                int i21 = 0;
                while (i21 < 2) {
                    if (i21 == i15) {
                        aVar.i();
                        if (map3 != null) {
                            z5.d dVar = z5.d.f6856k;
                            if (map3.containsKey(dVar)) {
                                EnumMap enumMap = new EnumMap(z5.d.class);
                                enumMap.putAll(map3);
                                enumMap.remove(dVar);
                                map3 = enumMap;
                            }
                        }
                    }
                    try {
                        m b10 = b(i20, aVar, map3);
                        if (i21 == i15) {
                            try {
                                b10.b(n.f6867b, 180);
                                o[] oVarArr = b10.c;
                                if (oVarArr != null) {
                                    i12 = i15;
                                    float f8 = i13;
                                    try {
                                        o oVar = oVarArr[0];
                                        map2 = map3;
                                        try {
                                            oVarArr[0] = new o((f8 - oVar.f6875a) - 1.0f, oVar.f6876b);
                                            o oVar2 = oVarArr[i12];
                                            oVarArr[i12] = new o((f8 - oVar2.f6875a) - 1.0f, oVar2.f6876b);
                                        } catch (l unused) {
                                            continue;
                                            i21++;
                                            map3 = map2;
                                            i15 = i12;
                                        }
                                    } catch (l unused2) {
                                        map2 = map3;
                                    }
                                }
                            } catch (l unused3) {
                                map2 = map3;
                                i12 = i15;
                            }
                        }
                        return b10;
                    } catch (l unused4) {
                        map2 = map3;
                        i12 = i15;
                    }
                }
            } catch (z5.i unused5) {
            }
            bVar2 = bVar;
            i17 = i18;
            i15 = i15;
        }
        throw z5.i.d;
    }

    @Override // z5.k
    public void reset() {
    }
}
