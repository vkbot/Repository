package z5;

import java.lang.reflect.Array;
import kotlin.UByte;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final f6.e f6849a;

    /* renamed from: b, reason: collision with root package name */
    public f6.b f6850b;

    public b(f6.e eVar) {
        this.f6849a = eVar;
    }

    public final f6.b a() {
        int[] iArr;
        int min;
        int min2;
        if (this.f6850b == null) {
            f6.e eVar = this.f6849a;
            f6.b bVar = eVar.d;
            if (bVar == null) {
                g gVar = eVar.f2350a;
                int i10 = gVar.f6860a;
                int i11 = gVar.f6861b;
                boolean z9 = true;
                int i12 = 0;
                if (i10 >= 40 && i11 >= 40) {
                    byte[] a10 = gVar.a();
                    int i13 = i10 >> 3;
                    if ((i10 & 7) != 0) {
                        i13++;
                    }
                    int i14 = i11 >> 3;
                    if ((i11 & 7) != 0) {
                        i14++;
                    }
                    int i15 = i11 - 8;
                    int i16 = i10 - 8;
                    int i17 = 2;
                    int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i14, i13);
                    int i18 = 0;
                    while (true) {
                        int i19 = 8;
                        if (i18 >= i14) {
                            break;
                        }
                        boolean z10 = z9;
                        int i20 = i18 << 3;
                        if (i20 > i15) {
                            i20 = i15;
                        }
                        int i21 = i12;
                        while (i12 < i13) {
                            int i22 = i17;
                            int i23 = i12 << 3;
                            if (i23 > i16) {
                                i23 = i16;
                            }
                            int i24 = (i20 * i10) + i23;
                            int i25 = i21;
                            int i26 = i25;
                            int i27 = i26;
                            int i28 = 255;
                            while (i25 < i19) {
                                byte[] bArr = a10;
                                int i29 = i20;
                                int i30 = i21;
                                int i31 = i27;
                                int i32 = i28;
                                while (i30 < i19) {
                                    int i33 = i30;
                                    int i34 = bArr[i24 + i30] & UByte.MAX_VALUE;
                                    i26 += i34;
                                    if (i34 < i32) {
                                        i32 = i34;
                                    }
                                    if (i34 > i31) {
                                        i31 = i34;
                                    }
                                    i30 = i33 + 1;
                                    i19 = 8;
                                }
                                if (i31 - i32 > 24) {
                                    while (true) {
                                        i25++;
                                        i24 += i10;
                                        if (i25 < 8) {
                                            int i35 = i21;
                                            for (int i36 = 8; i35 < i36; i36 = 8) {
                                                i26 += bArr[i24 + i35] & UByte.MAX_VALUE;
                                                i35++;
                                                i32 = i32;
                                            }
                                        }
                                    }
                                }
                                i25++;
                                i24 += i10;
                                i28 = i32;
                                a10 = bArr;
                                i20 = i29;
                                i19 = 8;
                                i27 = i31;
                            }
                            byte[] bArr2 = a10;
                            int i37 = i20;
                            int i38 = i26 >> 6;
                            int i39 = i28;
                            if (i27 - i39 <= 24) {
                                i38 = i39 / 2;
                                if (i18 > 0 && i12 > 0) {
                                    int[] iArr3 = iArr2[i18 - 1];
                                    int i40 = i12 - 1;
                                    int i41 = (((iArr2[i18][i40] * 2) + iArr3[i12]) + iArr3[i40]) / 4;
                                    if (i39 < i41) {
                                        i38 = i41;
                                    }
                                }
                            }
                            iArr2[i18][i12] = i38;
                            i12++;
                            i17 = i22;
                            a10 = bArr2;
                            i20 = i37;
                            i19 = 8;
                        }
                        i18++;
                        z9 = z10;
                        i12 = i21;
                    }
                    byte[] bArr3 = a10;
                    int i42 = i12;
                    int i43 = i17;
                    f6.b bVar2 = new f6.b(i10, i11);
                    int i44 = i42;
                    while (i44 < i14) {
                        int i45 = i44 << 3;
                        if (i45 > i15) {
                            i45 = i15;
                        }
                        int i46 = i14 - 3;
                        if (i44 < i43) {
                            min = 2;
                        } else {
                            min = Math.min(i44, i46);
                        }
                        int i47 = i42;
                        while (i47 < i13) {
                            int i48 = i47 << 3;
                            if (i48 > i16) {
                                i48 = i16;
                            }
                            int i49 = i13 - 3;
                            if (i47 < 2) {
                                min2 = 2;
                            } else {
                                min2 = Math.min(i47, i49);
                            }
                            int i50 = i44;
                            int i51 = -2;
                            int i52 = i42;
                            for (int i53 = 2; i51 <= i53; i53 = 2) {
                                int[] iArr4 = iArr2[min + i51];
                                i52 = iArr4[min2 - 2] + iArr4[min2 - 1] + iArr4[min2] + iArr4[min2 + 1] + iArr4[min2 + 2] + i52;
                                i51++;
                            }
                            int i54 = i52 / 25;
                            int i55 = (i45 * i10) + i48;
                            int i56 = i45;
                            int i57 = i42;
                            while (true) {
                                if (i57 < 8) {
                                    int i58 = i47;
                                    int i59 = i42;
                                    for (int i60 = 8; i59 < i60; i60 = 8) {
                                        int i61 = i59;
                                        if ((bArr3[i55 + i59] & UByte.MAX_VALUE) <= i54) {
                                            bVar2.f(i48 + i61, i56 + i57);
                                        }
                                        i59 = i61 + 1;
                                    }
                                    i57++;
                                    i55 += i10;
                                    i47 = i58;
                                }
                            }
                            i47++;
                            i45 = i56;
                            i44 = i50;
                        }
                        i43 = 2;
                        i44++;
                    }
                    eVar.d = bVar2;
                } else {
                    f6.b bVar3 = new f6.b(i10, i11);
                    if (eVar.f2351b.length < i10) {
                        eVar.f2351b = new byte[i10];
                    }
                    int i62 = 0;
                    while (true) {
                        iArr = eVar.c;
                        if (i62 >= 32) {
                            break;
                        }
                        iArr[i62] = 0;
                        i62++;
                    }
                    for (int i63 = 1; i63 < 5; i63++) {
                        byte[] b10 = gVar.b((i11 * i63) / 5, eVar.f2351b);
                        int i64 = (i10 << 2) / 5;
                        for (int i65 = i10 / 5; i65 < i64; i65++) {
                            int i66 = (b10[i65] & UByte.MAX_VALUE) >> 3;
                            iArr[i66] = iArr[i66] + 1;
                        }
                    }
                    int a11 = f6.e.a(iArr);
                    byte[] a12 = gVar.a();
                    for (int i67 = 0; i67 < i11; i67++) {
                        int i68 = i67 * i10;
                        for (int i69 = 0; i69 < i10; i69++) {
                            if ((a12[i68 + i69] & UByte.MAX_VALUE) < a11) {
                                bVar3.f(i69, i67);
                            }
                        }
                    }
                    eVar.d = bVar3;
                }
                bVar = eVar.d;
            }
            this.f6850b = bVar;
        }
        return this.f6850b;
    }

    public final f6.a b(f6.a aVar, int i10) {
        f6.e eVar = this.f6849a;
        int[] iArr = eVar.c;
        g gVar = eVar.f2350a;
        int i11 = gVar.f6860a;
        if (aVar.c < i11) {
            aVar = new f6.a(i11);
        } else {
            int length = aVar.f2342b.length;
            for (int i12 = 0; i12 < length; i12++) {
                aVar.f2342b[i12] = 0;
            }
        }
        if (eVar.f2351b.length < i11) {
            eVar.f2351b = new byte[i11];
        }
        for (int i13 = 0; i13 < 32; i13++) {
            iArr[i13] = 0;
        }
        byte[] b10 = gVar.b(i10, eVar.f2351b);
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = (b10[i14] & UByte.MAX_VALUE) >> 3;
            iArr[i15] = iArr[i15] + 1;
        }
        int a10 = f6.e.a(iArr);
        if (i11 < 3) {
            for (int i16 = 0; i16 < i11; i16++) {
                if ((b10[i16] & UByte.MAX_VALUE) < a10) {
                    aVar.j(i16);
                }
            }
        } else {
            int i17 = b10[0] & UByte.MAX_VALUE;
            int i18 = b10[1] & UByte.MAX_VALUE;
            int i19 = 1;
            while (i19 < i11 - 1) {
                int i20 = i19 + 1;
                int i21 = b10[i20] & UByte.MAX_VALUE;
                if ((((i18 << 2) - i17) - i21) / 2 < a10) {
                    aVar.j(i19);
                }
                i17 = i18;
                i19 = i20;
                i18 = i21;
            }
        }
        return aVar;
    }

    public final String toString() {
        try {
            return a().toString();
        } catch (i unused) {
            return "";
        }
    }
}
