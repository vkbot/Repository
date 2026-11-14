package o6;

import java.util.ArrayList;
import java.util.Map;
import n6.h;
import okhttp3.internal.ws.WebSocketProtocol;
import z5.i;
import z5.m;
import z5.o;
import z5.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f4378i = {1, 10, 34, 70, WebSocketProtocol.PAYLOAD_SHORT};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f4379j = {4, 20, 48, 81};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f4380k = {0, 161, 961, 2015, 2715};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f4381l = {0, 336, 1036, 1516};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f4382m = {8, 6, 4, 3, 1};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f4383n = {2, 4, 6, 8};

    /* renamed from: o, reason: collision with root package name */
    public static final int[][] f4384o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f4385g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4386h = new ArrayList();

    public static void j(ArrayList arrayList, d dVar) {
        if (dVar == null) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d dVar2 = (d) obj;
            if (dVar2.f4374a == dVar.f4374a) {
                dVar2.d++;
                return;
            }
        }
        arrayList.add(dVar);
    }

    @Override // n6.h
    public final m b(int i10, f6.a aVar, Map map) {
        d l10 = l(aVar, false, i10, map);
        ArrayList arrayList = this.f4385g;
        j(arrayList, l10);
        aVar.i();
        d l11 = l(aVar, true, i10, map);
        ArrayList arrayList2 = this.f4386h;
        j(arrayList2, l11);
        aVar.i();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            d dVar = (d) obj;
            int i12 = dVar.d;
            c cVar = dVar.c;
            if (i12 > 1) {
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList2.get(i13);
                    i13++;
                    d dVar2 = (d) obj2;
                    int i14 = dVar2.d;
                    c cVar2 = dVar2.c;
                    if (i14 > 1) {
                        int i15 = ((dVar2.f4375b * 16) + dVar.f4375b) % 79;
                        int i16 = (cVar.f4376a * 9) + cVar2.f4376a;
                        if (i16 > 72) {
                            i16--;
                        }
                        if (i16 > 8) {
                            i16--;
                        }
                        if (i15 == i16) {
                            String valueOf = String.valueOf((dVar.f4374a * 4537077) + dVar2.f4374a);
                            StringBuilder sb = new StringBuilder(14);
                            for (int length = 13 - valueOf.length(); length > 0; length--) {
                                sb.append('0');
                            }
                            sb.append(valueOf);
                            int i17 = 0;
                            for (int i18 = 0; i18 < 13; i18++) {
                                int charAt = sb.charAt(i18) - '0';
                                if ((i18 & 1) == 0) {
                                    charAt *= 3;
                                }
                                i17 += charAt;
                            }
                            int i19 = 10 - (i17 % 10);
                            if (i19 == 10) {
                                i19 = 0;
                            }
                            sb.append(i19);
                            o[] oVarArr = cVar.c;
                            o[] oVarArr2 = cVar2.c;
                            return new m(sb.toString(), null, new o[]{oVarArr[0], oVarArr[1], oVarArr2[0], oVarArr2[1]}, z5.a.f6844n);
                        }
                    }
                }
            }
        }
        throw i.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0093, code lost:
    
        if (r5 < 4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0095, code lost:
    
        r17 = false;
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x009a, code lost:
    
        r16 = false;
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00b1, code lost:
    
        if (r5 < 4) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o6.b k(f6.a r20, o6.c r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.e.k(f6.a, o6.c, boolean):o6.b");
    }

    public final d l(f6.a aVar, boolean z9, int i10, Map map) {
        p pVar;
        try {
            c n10 = n(aVar, i10, z9, m(aVar, z9));
            if (map == null) {
                pVar = null;
            } else {
                pVar = (p) map.get(z5.d.f6856k);
            }
            if (pVar != null) {
                int[] iArr = n10.f4377b;
                float f8 = ((iArr[0] + iArr[1]) - 1) / 2.0f;
                if (z9) {
                    f8 = (aVar.c - 1) - f8;
                }
                pVar.a(new o(f8, i10));
            }
            b k6 = k(aVar, n10, true);
            b k10 = k(aVar, n10, false);
            return new d((k6.f4374a * 1597) + k10.f4374a, (k10.f4375b * 4) + k6.f4375b, n10);
        } catch (i unused) {
            return null;
        }
    }

    public final int[] m(f6.a aVar, boolean z9) {
        int[] iArr = this.f4371a;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int i10 = aVar.c;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < i10) {
            z10 = !aVar.d(i11);
            if (z9 == z10) {
                break;
            }
            i11++;
        }
        int i12 = 0;
        int i13 = i11;
        while (i11 < i10) {
            if (aVar.d(i11) != z10) {
                iArr[i12] = iArr[i12] + 1;
            } else {
                if (i12 == 3) {
                    if (a.i(iArr)) {
                        return new int[]{i13, i11};
                    }
                    i13 += iArr[0] + iArr[1];
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = 0;
                    iArr[3] = 0;
                    i12--;
                } else {
                    i12++;
                }
                iArr[i12] = 1;
                z10 = !z10;
            }
            i11++;
        }
        throw i.d;
    }

    public final c n(f6.a aVar, int i10, boolean z9, int[] iArr) {
        int i11;
        int i12;
        boolean d = aVar.d(iArr[0]);
        int i13 = iArr[0] - 1;
        while (i13 >= 0 && d != aVar.d(i13)) {
            i13--;
        }
        int i14 = i13 + 1;
        int i15 = iArr[0] - i14;
        int[] iArr2 = this.f4371a;
        System.arraycopy(iArr2, 0, iArr2, 1, iArr2.length - 1);
        iArr2[0] = i15;
        for (int i16 = 0; i16 < 9; i16++) {
            if (h.d(iArr2, f4384o[i16], 0.45f) < 0.2f) {
                int i17 = iArr[1];
                if (z9) {
                    int i18 = aVar.c - 1;
                    i11 = i18 - i17;
                    i12 = i18 - i14;
                } else {
                    i11 = i17;
                    i12 = i14;
                }
                return new c(i16, i12, i11, i10, new int[]{i14, i17});
            }
        }
        throw i.d;
    }

    @Override // n6.h, z5.k
    public final void reset() {
        this.f4385g.clear();
        this.f4386h.clear();
    }
}
