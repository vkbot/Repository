package p6;

import a5.h;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.location.LocationRequestCompat;
import j1.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.imap.IMAP;
import org.apache.commons.net.nntp.NNTP;
import org.apache.commons.net.nntp.NNTPReply;
import z5.m;
import z5.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends o6.a {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f5009k = {7, 5, 4, 3, 1};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f5010l = {4, 20, 52, LocationRequestCompat.QUALITY_LOW_POWER, 204};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f5011m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n, reason: collision with root package name */
    public static final int[][] f5012n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o, reason: collision with root package name */
    public static final int[][] f5013o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, IMAP.DEFAULT_PORT, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, NNTPReply.CLOSING_CONNECTION}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{FTPReply.FILE_STATUS_OK, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, NNTP.DEFAULT_PORT, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 116, 137, 200, 178, 112, FTPReply.DATA_CONNECTION_ALREADY_OPEN, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{FTPReply.SERVICE_NOT_READY, 149, 25, 75, 14, 42, WebSocketProtocol.PAYLOAD_SHORT, 167}, new int[]{79, 26, 78, 23, 69, 207, NNTPReply.DEBUG_OUTPUT, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p, reason: collision with root package name */
    public static final int[][] f5014p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f5015g = new ArrayList(11);

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f5016h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final int[] f5017i = new int[2];

    /* renamed from: j, reason: collision with root package name */
    public boolean f5018j;

    public static m m(List list) {
        o.b aVar;
        int size = list.size() << 1;
        int i10 = size - 1;
        if (((a) list.get(list.size() - 1)).f5006b == null) {
            i10 = size - 2;
        }
        f6.a aVar2 = new f6.a(i10 * 12);
        int i11 = ((a) list.get(0)).f5006b.f4374a;
        int i12 = 0;
        for (int i13 = 11; i13 >= 0; i13--) {
            if (((1 << i13) & i11) != 0) {
                aVar2.j(i12);
            }
            i12++;
        }
        for (int i14 = 1; i14 < list.size(); i14++) {
            a aVar3 = (a) list.get(i14);
            int i15 = aVar3.f5005a.f4374a;
            for (int i16 = 11; i16 >= 0; i16--) {
                if (((1 << i16) & i15) != 0) {
                    aVar2.j(i12);
                }
                i12++;
            }
            o6.b bVar = aVar3.f5006b;
            if (bVar != null) {
                int i17 = bVar.f4374a;
                for (int i18 = 11; i18 >= 0; i18--) {
                    if (((1 << i18) & i17) != 0) {
                        aVar2.j(i12);
                    }
                    i12++;
                }
            }
        }
        if (aVar2.d(1)) {
            aVar = new q6.b(aVar2, 2);
        } else if (!aVar2.d(2)) {
            aVar = new o.b(aVar2);
        } else {
            int h2 = h.h(1, 4, aVar2);
            if (h2 != 4) {
                if (h2 != 5) {
                    int h10 = h.h(1, 5, aVar2);
                    if (h10 != 12) {
                        if (h10 != 13) {
                            switch (h.h(1, 7, aVar2)) {
                                case 56:
                                    aVar = new q6.c(aVar2, "310", "11");
                                    break;
                                case 57:
                                    aVar = new q6.c(aVar2, "320", "11");
                                    break;
                                case 58:
                                    aVar = new q6.c(aVar2, "310", "13");
                                    break;
                                case 59:
                                    aVar = new q6.c(aVar2, "320", "13");
                                    break;
                                case 60:
                                    aVar = new q6.c(aVar2, "310", "15");
                                    break;
                                case 61:
                                    aVar = new q6.c(aVar2, "320", "15");
                                    break;
                                case 62:
                                    aVar = new q6.c(aVar2, "310", "17");
                                    break;
                                case 63:
                                    aVar = new q6.c(aVar2, "320", "17");
                                    break;
                                default:
                                    i.l("unknown decoder: ".concat(String.valueOf(aVar2)));
                                    return null;
                            }
                        } else {
                            aVar = new q6.b(aVar2, 1);
                        }
                    } else {
                        aVar = new q6.b(aVar2, 0);
                    }
                } else {
                    aVar = new q6.a(aVar2, 1);
                }
            } else {
                aVar = new q6.a(aVar2, 0);
            }
        }
        String a10 = aVar.a();
        o[] oVarArr = ((a) list.get(0)).c.c;
        o[] oVarArr2 = ((a) list.get(list.size() - 1)).c.c;
        return new m(a10, null, new o[]{oVarArr[0], oVarArr[1], oVarArr2[0], oVarArr2[1]}, z5.a.f6845o);
    }

    @Override // n6.h
    public final m b(int i10, f6.a aVar, Map map) {
        ArrayList arrayList = this.f5015g;
        arrayList.clear();
        this.f5018j = false;
        try {
            return m(o(aVar, i10));
        } catch (z5.i unused) {
            arrayList.clear();
            this.f5018j = true;
            return m(o(aVar, i10));
        }
    }

    public final boolean j() {
        ArrayList arrayList = this.f5015g;
        a aVar = (a) arrayList.get(0);
        o6.b bVar = aVar.f5005a;
        o6.b bVar2 = aVar.f5006b;
        if (bVar2 != null) {
            int i10 = bVar2.f4375b;
            int i11 = 2;
            for (int i12 = 1; i12 < arrayList.size(); i12++) {
                a aVar2 = (a) arrayList.get(i12);
                i10 += aVar2.f5005a.f4375b;
                int i13 = i11 + 1;
                o6.b bVar3 = aVar2.f5006b;
                if (bVar3 != null) {
                    i10 += bVar3.f4375b;
                    i11 += 2;
                } else {
                    i11 = i13;
                }
            }
            if (((i11 - 4) * 211) + (i10 % 211) == bVar.f4374a) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (j() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        r1 = new java.util.ArrayList(r9);
        r1.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        return k(r1, r10 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List k(java.util.ArrayList r9, int r10) {
        /*
            r8 = this;
        L0:
            java.util.ArrayList r0 = r8.f5016h
            int r1 = r0.size()
            if (r10 >= r1) goto L73
            java.lang.Object r0 = r0.get(r10)
            p6.b r0 = (p6.b) r0
            java.util.ArrayList r1 = r8.f5015g
            r1.clear()
            int r2 = r9.size()
            r3 = 0
            r4 = r3
        L19:
            if (r4 >= r2) goto L29
            java.lang.Object r5 = r9.get(r4)
            int r4 = r4 + 1
            p6.b r5 = (p6.b) r5
            java.util.ArrayList r5 = r5.f5007a
            r1.addAll(r5)
            goto L19
        L29:
            java.util.ArrayList r2 = r0.f5007a
            r1.addAll(r2)
            r2 = r3
        L2f:
            r4 = 10
            if (r2 >= r4) goto L70
            int[][] r4 = p6.c.f5014p
            r4 = r4[r2]
            int r5 = r1.size()
            int r6 = r4.length
            if (r5 > r6) goto L6d
            r5 = r3
        L3f:
            int r6 = r1.size()
            if (r5 >= r6) goto L57
            java.lang.Object r6 = r1.get(r5)
            p6.a r6 = (p6.a) r6
            o6.c r6 = r6.c
            int r6 = r6.f4376a
            r7 = r4[r5]
            if (r6 == r7) goto L54
            goto L6d
        L54:
            int r5 = r5 + 1
            goto L3f
        L57:
            boolean r2 = r8.j()
            if (r2 == 0) goto L5e
            return r1
        L5e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r9)
            r1.add(r0)
            int r0 = r10 + 1
            java.util.List r9 = r8.k(r1, r0)     // Catch: z5.i -> L70
            return r9
        L6d:
            int r2 = r2 + 1
            goto L2f
        L70:
            int r10 = r10 + 1
            goto L0
        L73:
            z5.i r9 = z5.i.d
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.c.k(java.util.ArrayList, int):java.util.List");
    }

    public final List l(boolean z9) {
        ArrayList arrayList = this.f5016h;
        List list = null;
        if (arrayList.size() > 25) {
            arrayList.clear();
            return null;
        }
        this.f5015g.clear();
        if (z9) {
            Collections.reverse(arrayList);
        }
        try {
            list = k(new ArrayList(), 0);
        } catch (z5.i unused) {
        }
        if (z9) {
            Collections.reverse(arrayList);
        }
        return list;
    }

    public final o6.b n(f6.a aVar, o6.c cVar, boolean z9, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10;
        int[][] iArr;
        int[] iArr2 = this.f4372b;
        Arrays.fill(iArr2, 0);
        if (z10) {
            n6.h.f(cVar.f4377b[0], aVar, iArr2);
        } else {
            n6.h.e(cVar.f4377b[1], aVar, iArr2);
            int i11 = 0;
            for (int length = iArr2.length - 1; i11 < length; length--) {
                int i12 = iArr2[i11];
                iArr2[i11] = iArr2[length];
                iArr2[length] = i12;
                i11++;
            }
        }
        float x9 = a.a.x(iArr2) / 17.0f;
        int[] iArr3 = cVar.f4377b;
        int i13 = cVar.f4376a;
        float f8 = (iArr3[1] - iArr3[0]) / 15.0f;
        if (Math.abs(x9 - f8) / f8 <= 0.3f) {
            int i14 = 0;
            while (true) {
                int length2 = iArr2.length;
                float[] fArr = this.d;
                float[] fArr2 = this.c;
                int[] iArr4 = this.f4373f;
                int[] iArr5 = this.e;
                if (i14 < length2) {
                    float f10 = (iArr2[i14] * 1.0f) / x9;
                    int i15 = (int) (0.5f + f10);
                    if (i15 <= 0) {
                        if (f10 >= 0.3f) {
                            i15 = 1;
                        } else {
                            throw z5.i.d;
                        }
                    } else if (i15 > 8) {
                        if (f10 <= 8.7f) {
                            i15 = 8;
                        } else {
                            throw z5.i.d;
                        }
                    }
                    int i16 = i14 / 2;
                    if ((i14 & 1) == 0) {
                        iArr5[i16] = i15;
                        fArr2[i16] = f10 - i15;
                    } else {
                        iArr4[i16] = i15;
                        fArr[i16] = f10 - i15;
                    }
                    i14++;
                } else {
                    int x10 = a.a.x(iArr5);
                    int x11 = a.a.x(iArr4);
                    if (x10 > 13) {
                        z11 = false;
                        z12 = true;
                    } else if (x10 < 4) {
                        z12 = false;
                        z11 = true;
                    } else {
                        z11 = false;
                        z12 = false;
                    }
                    if (x11 > 13) {
                        z13 = false;
                        z14 = true;
                    } else if (x11 < 4) {
                        z14 = false;
                        z13 = true;
                    } else {
                        z13 = false;
                        z14 = false;
                    }
                    int i17 = (x10 + x11) - 17;
                    if ((x10 & 1) == 1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if ((x11 & 1) == 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z17 = z11;
                    boolean z18 = z12;
                    boolean z19 = z13;
                    boolean z20 = z14;
                    if (i17 != -1) {
                        if (i17 != 0) {
                            if (i17 == 1) {
                                if (z15) {
                                    if (!z16) {
                                        z18 = true;
                                        z17 = z11;
                                        z19 = z13;
                                        z20 = z14;
                                    } else {
                                        throw z5.i.d;
                                    }
                                } else if (z16) {
                                    z20 = true;
                                    z17 = z11;
                                    z18 = z12;
                                    z19 = z13;
                                } else {
                                    throw z5.i.d;
                                }
                            } else {
                                throw z5.i.d;
                            }
                        } else if (z15) {
                            if (z16) {
                                if (x10 < x11) {
                                    z17 = true;
                                    z20 = true;
                                    z18 = z12;
                                    z19 = z13;
                                } else {
                                    z18 = true;
                                    z19 = true;
                                    z17 = z11;
                                    z20 = z14;
                                }
                            } else {
                                throw z5.i.d;
                            }
                        } else if (z16) {
                            throw z5.i.d;
                        }
                    } else if (z15) {
                        if (!z16) {
                            z17 = true;
                            z18 = z12;
                            z19 = z13;
                            z20 = z14;
                        } else {
                            throw z5.i.d;
                        }
                    } else if (z16) {
                        z19 = true;
                        z17 = z11;
                        z18 = z12;
                        z20 = z14;
                    } else {
                        throw z5.i.d;
                    }
                    if (z17) {
                        if (!z18) {
                            o6.a.h(iArr5, fArr2);
                        } else {
                            throw z5.i.d;
                        }
                    }
                    if (z18) {
                        o6.a.g(iArr5, fArr2);
                    }
                    if (z19) {
                        if (!z20) {
                            o6.a.h(iArr4, fArr2);
                        } else {
                            throw z5.i.d;
                        }
                    }
                    if (z20) {
                        o6.a.g(iArr4, fArr);
                    }
                    int i18 = i13 * 4;
                    if (z9) {
                        i10 = 0;
                    } else {
                        i10 = 2;
                    }
                    int i19 = ((i18 + i10) + (!z10 ? 1 : 0)) - 1;
                    int length3 = iArr5.length - 1;
                    int i20 = 0;
                    int i21 = 0;
                    while (true) {
                        iArr = f5013o;
                        if (length3 < 0) {
                            break;
                        }
                        if (i13 != 0 || !z9 || !z10) {
                            i20 += iArr5[length3] * iArr[i19][length3 * 2];
                        }
                        i21 += iArr5[length3];
                        length3--;
                    }
                    int i22 = 0;
                    for (int length4 = iArr4.length - 1; length4 >= 0; length4--) {
                        if (i13 != 0 || !z9 || !z10) {
                            i22 += iArr4[length4] * iArr[i19][(length4 * 2) + 1];
                        }
                    }
                    int i23 = i20 + i22;
                    if ((i21 & 1) == 0 && i21 <= 13 && i21 >= 4) {
                        int i24 = (13 - i21) / 2;
                        int i25 = f5009k[i24];
                        int i26 = 9 - i25;
                        return new o6.b((o4.b.u(iArr5, i25, true) * f5010l[i24]) + o4.b.u(iArr4, i26, false) + f5011m[i24], i23);
                    }
                    throw z5.i.d;
                }
            }
        } else {
            throw z5.i.d;
        }
    }

    public final List o(f6.a aVar, int i10) {
        boolean z9;
        boolean z10;
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.f5015g;
            if (!z11) {
                try {
                    arrayList.add(p(aVar, arrayList, i10));
                } catch (z5.i e) {
                    if (!arrayList.isEmpty()) {
                        z11 = true;
                    } else {
                        throw e;
                    }
                }
            } else {
                if (j()) {
                    return arrayList;
                }
                ArrayList arrayList2 = this.f5016h;
                boolean isEmpty = arrayList2.isEmpty();
                int i11 = 0;
                boolean z12 = false;
                while (true) {
                    if (i11 < arrayList2.size()) {
                        b bVar = (b) arrayList2.get(i11);
                        int i12 = bVar.f5008b;
                        ArrayList arrayList3 = bVar.f5007a;
                        if (i12 > i10) {
                            z9 = arrayList3.equals(arrayList);
                            break;
                        }
                        z12 = arrayList3.equals(arrayList);
                        i11++;
                    } else {
                        z9 = false;
                        break;
                    }
                }
                if (!z9 && !z12) {
                    int size = arrayList2.size();
                    int i13 = 0;
                    loop2: while (true) {
                        if (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            b bVar2 = (b) obj;
                            int size2 = arrayList.size();
                            int i14 = 0;
                            while (i14 < size2) {
                                Object obj2 = arrayList.get(i14);
                                i14++;
                                a aVar2 = (a) obj2;
                                ArrayList arrayList4 = bVar2.f5007a;
                                int size3 = arrayList4.size();
                                int i15 = 0;
                                while (i15 < size3) {
                                    Object obj3 = arrayList4.get(i15);
                                    i15++;
                                    if (aVar2.equals((a) obj3)) {
                                        break;
                                    }
                                }
                            }
                            z10 = true;
                            break loop2;
                        }
                        z10 = false;
                        break;
                    }
                    if (!z10) {
                        arrayList2.add(i11, new b(arrayList, i10));
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            b bVar3 = (b) it.next();
                            if (bVar3.f5007a.size() != arrayList.size()) {
                                ArrayList arrayList5 = bVar3.f5007a;
                                int size4 = arrayList5.size();
                                int i16 = 0;
                                while (true) {
                                    if (i16 < size4) {
                                        Object obj4 = arrayList5.get(i16);
                                        i16++;
                                        if (!arrayList.contains((a) obj4)) {
                                            break;
                                        }
                                    } else {
                                        it.remove();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (!isEmpty) {
                    List l10 = l(false);
                    if (l10 != null) {
                        return l10;
                    }
                    List l11 = l(true);
                    if (l11 != null) {
                        return l11;
                    }
                }
                throw z5.i.d;
            }
        }
    }

    public final a p(f6.a aVar, ArrayList arrayList, int i10) {
        boolean z9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int f8;
        int i16;
        o6.c cVar;
        int f10;
        int[][] iArr;
        int i17;
        int i18 = 2;
        int i19 = 0;
        int i20 = 1;
        if (arrayList.size() % 2 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f5018j) {
            z9 = !z9;
        }
        int i21 = -1;
        boolean z10 = true;
        while (true) {
            int[] iArr2 = this.f4371a;
            iArr2[i19] = i19;
            iArr2[i20] = i19;
            iArr2[i18] = i19;
            int i22 = 3;
            iArr2[3] = i19;
            int i23 = aVar.c;
            if (i21 >= 0) {
                i11 = i21;
            } else if (arrayList.isEmpty()) {
                i11 = i19;
            } else {
                i11 = ((a) arrayList.get(arrayList.size() - i20)).c.f4377b[i20];
            }
            if (arrayList.size() % i18 != 0) {
                i12 = i20;
            } else {
                i12 = i19;
            }
            if (this.f5018j) {
                i12 ^= 1;
            }
            boolean z11 = i19;
            while (true) {
                if (i11 >= i23) {
                    break;
                }
                boolean d = aVar.d(i11);
                boolean z12 = !d;
                if (!d) {
                    i11++;
                    z11 = z12;
                } else {
                    z11 = z12;
                    break;
                }
            }
            int i24 = i18;
            int i25 = i19;
            boolean z13 = z11;
            int i26 = i11;
            while (i11 < i23) {
                int i27 = i19;
                if (aVar.d(i11) != z13) {
                    iArr2[i25] = iArr2[i25] + i20;
                    i13 = i20;
                    i14 = i22;
                } else {
                    if (i25 == i22) {
                        if (i12 != 0) {
                            int length = iArr2.length;
                            i14 = i22;
                            int i28 = i27;
                            while (true) {
                                i15 = i20;
                                if (i28 >= length / 2) {
                                    break;
                                }
                                int i29 = iArr2[i28];
                                int i30 = (length - i28) - 1;
                                iArr2[i28] = iArr2[i30];
                                iArr2[i30] = i29;
                                i28++;
                                i20 = i15;
                            }
                        } else {
                            i15 = i20;
                            i14 = i22;
                        }
                        if (o6.a.i(iArr2)) {
                            int[] iArr3 = this.f5017i;
                            iArr3[i27] = i26;
                            iArr3[i15] = i11;
                            if (z9) {
                                int i31 = i26 - 1;
                                while (i31 >= 0 && !aVar.d(i31)) {
                                    i31--;
                                }
                                i26 = i31 + 1;
                                i16 = iArr3[i27] - i26;
                                f8 = iArr3[i15];
                            } else {
                                f8 = aVar.f(i11 + 1);
                                i16 = f8 - iArr3[i15];
                            }
                            int i32 = f8;
                            int i33 = i26;
                            System.arraycopy(iArr2, i27, iArr2, i15, iArr2.length - 1);
                            iArr2[i27] = i16;
                            o6.b bVar = null;
                            try {
                                iArr = f5012n;
                            } catch (z5.i unused) {
                                cVar = null;
                            }
                            for (i17 = 0; i17 < 6; i17++) {
                                if (n6.h.d(iArr2, iArr[i17], 0.45f) < 0.2f) {
                                    cVar = new o6.c(i17, i33, i32, i10, new int[]{i33, i32});
                                    if (cVar == null) {
                                        int i34 = iArr3[0];
                                        if (aVar.d(i34)) {
                                            f10 = aVar.e(aVar.f(i34));
                                        } else {
                                            f10 = aVar.f(aVar.e(i34));
                                        }
                                        i21 = f10;
                                    } else {
                                        z10 = false;
                                    }
                                    if (!z10) {
                                        o6.b n10 = n(aVar, cVar, z9, true);
                                        if (!arrayList.isEmpty() && ((a) arrayList.get(arrayList.size() - 1)).f5006b == null) {
                                            throw z5.i.d;
                                        }
                                        try {
                                            bVar = n(aVar, cVar, z9, false);
                                        } catch (z5.i unused2) {
                                        }
                                        return new a(n10, bVar, cVar);
                                    }
                                    i18 = i24;
                                    i19 = 0;
                                    i20 = 1;
                                }
                            }
                            throw z5.i.d;
                            break;
                        }
                        if (i12 != 0) {
                            int length2 = iArr2.length;
                            for (int i35 = 0; i35 < length2 / 2; i35++) {
                                int i36 = iArr2[i35];
                                int i37 = (length2 - i35) - 1;
                                iArr2[i35] = iArr2[i37];
                                iArr2[i37] = i36;
                            }
                        }
                        i13 = 1;
                        i27 = 0;
                        i26 += iArr2[0] + iArr2[1];
                        iArr2[0] = iArr2[i24];
                        iArr2[1] = iArr2[i14];
                        iArr2[i24] = 0;
                        iArr2[i14] = 0;
                        i25--;
                    } else {
                        i13 = i20;
                        i14 = i22;
                        i25++;
                    }
                    iArr2[i25] = i13;
                    z13 = !z13;
                }
                i11++;
                i19 = i27;
                i22 = i14;
                i20 = i13;
            }
            throw z5.i.d;
        }
    }

    @Override // n6.h, z5.k
    public final void reset() {
        this.f5015g.clear();
        this.f5016h.clear();
    }
}
