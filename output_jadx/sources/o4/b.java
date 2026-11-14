package o4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.view.Display;
import android.view.WindowManager;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import e0.m;
import j1.i;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.ByteCompanionObject;
import q.x;
import t4.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final e9.b A(j9.b r6, kotlin.reflect.KType r7, boolean r8) {
        /*
            kotlin.reflect.KClass r0 = i9.d1.g(r7)
            boolean r1 = r7.isMarkedNullable()
            java.util.List r7 = r7.getArguments()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r7, r3)
            r2.<init>(r3)
            java.util.Iterator r7 = r7.iterator()
        L1b:
            boolean r3 = r7.hasNext()
            r4 = 0
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r7.next()
            kotlin.reflect.KTypeProjection r3 = (kotlin.reflect.KTypeProjection) r3
            r3.getClass()
            kotlin.reflect.KType r5 = r3.getType()
            if (r5 == 0) goto L35
            r2.add(r5)
            goto L1b
        L35:
            java.lang.String r6 = "Star projections in type arguments are not allowed, but had "
            kotlin.reflect.KType r7 = r3.getType()
            l9.i.e(r7, r6)
            return r4
        L3f:
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L5b
            android.support.v4.media.h r7 = e9.l.f2217a
            if (r1 != 0) goto L54
            android.support.v4.media.h r7 = e9.l.f2217a
            e9.b r7 = r7.g(r0)
            if (r7 == 0) goto L52
            goto L75
        L52:
            r7 = r4
            goto L75
        L54:
            android.support.v4.media.h r7 = e9.l.f2218b
            e9.b r7 = r7.g(r0)
            goto L75
        L5b:
            android.support.v4.media.h r7 = e9.l.f2217a
            if (r1 != 0) goto L66
            android.support.v4.media.h r7 = e9.l.c
            java.lang.Object r7 = r7.i(r0, r2)
            goto L6c
        L66:
            android.support.v4.media.h r7 = e9.l.d
            java.lang.Object r7 = r7.i(r0, r2)
        L6c:
            boolean r3 = kotlin.Result.m101isFailureimpl(r7)
            if (r3 == 0) goto L73
            r7 = r4
        L73:
            e9.b r7 = (e9.b) r7
        L75:
            if (r7 == 0) goto L78
            return r7
        L78:
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L98
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            j9.a r6 = (j9.a) r6
            r6.getClass()
            r7.getClass()
            java.util.Map r6 = r6.f3350a
            java.lang.Object r6 = r6.get(r0)
            if (r6 != 0) goto L94
        L92:
            r7 = r4
            goto Lba
        L94:
            n0.b.a()
            return r4
        L98:
            java.util.ArrayList r7 = com.bumptech.glide.d.u(r6, r2, r8)
            if (r7 != 0) goto L9f
            goto Lc4
        L9f:
            e9.d r8 = new e9.d
            r3 = 1
            r8.<init>(r3, r2)
            e9.b r7 = com.bumptech.glide.d.o(r0, r7, r8)
            if (r7 != 0) goto Lba
            j9.a r6 = (j9.a) r6
            java.util.Map r6 = r6.f3350a
            java.lang.Object r6 = r6.get(r0)
            if (r6 != 0) goto Lb6
            goto L92
        Lb6:
            n0.b.a()
            return r4
        Lba:
            if (r7 == 0) goto Lc4
            if (r1 == 0) goto Lc3
            e9.b r6 = f9.a.a(r7)
            return r6
        Lc3:
            return r7
        Lc4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.b.A(j9.b, kotlin.reflect.KType, boolean):e9.b");
    }

    public static String B(String str, String str2, boolean z9) {
        String str3;
        int i10;
        String str4;
        int i11;
        String h2;
        String str5;
        String[] strArr;
        int i12 = 8;
        if (str2 != null && str2.matches(m.h(new byte[]{-85, 30, 121, 15, 7, -123, -91, 113, -35, 102, 11, 8, 77, ByteCompanionObject.MIN_VALUE, -125, 111, -85, 30, 121, 15, 7, -123, -91, 113, -35, 102, 11, 8, 77, -127, -12}, new byte[]{-16, 95, 84, 85, 102, -88, -33, 65}))) {
            String str6 = "";
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            if (y(str3, str2) == z9) {
                return str3;
            }
            ArrayList arrayList = new ArrayList(Arrays.asList(n(str3)));
            int i13 = 0;
            int i14 = 0;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            while (true) {
                int i15 = 1;
                if (i14 >= arrayList.size()) {
                    break;
                }
                String str7 = (String) arrayList.get(i14);
                int indexOf = str7.indexOf(61);
                if (indexOf < 0) {
                    str4 = str6;
                    i10 = i13;
                } else {
                    String substring = str7.substring(i13, indexOf);
                    i10 = i13;
                    byte[] bArr = new byte[i12];
                    // fill-array-data instruction
                    bArr[0] = -31;
                    bArr[1] = 49;
                    bArr[2] = -80;
                    bArr[3] = -23;
                    bArr[4] = -43;
                    bArr[5] = -18;
                    bArr[6] = -60;
                    bArr[7] = -126;
                    if (m.h(new byte[]{-120, 92, -35, -116, -89, -99, -83, -12, -124, 31, -42, -100, -71, -126}, bArr).equals(substring)) {
                        z10 = true;
                    }
                    byte[] bArr2 = new byte[i12];
                    // fill-array-data instruction
                    bArr2[0] = -94;
                    bArr2[1] = -72;
                    bArr2[2] = 92;
                    bArr2[3] = -127;
                    bArr2[4] = 100;
                    bArr2[5] = 117;
                    bArr2[6] = -68;
                    bArr2[7] = -39;
                    if (m.h(new byte[]{-53, -43, 49, -28, 22, 6, -43, -81, -57, -106, 47, -11, 5, 1, -55, -86}, bArr2).equals(substring)) {
                        z11 = true;
                    }
                    byte[] bArr3 = new byte[i12];
                    // fill-array-data instruction
                    bArr3[0] = -46;
                    bArr3[1] = -36;
                    bArr3[2] = -42;
                    bArr3[3] = -19;
                    bArr3[4] = 85;
                    bArr3[5] = 103;
                    bArr3[6] = 33;
                    bArr3[7] = 96;
                    if (m.h(new byte[]{-69, -79, -69, -120, 39, 20, 72, 22, -73, -14, -72, -116, 35, 14, 70, 1, -90, -75, -71, -125}, bArr3).equals(substring)) {
                        z12 = true;
                    }
                    byte[] bArr4 = new byte[i12];
                    // fill-array-data instruction
                    bArr4[0] = -37;
                    bArr4[1] = -49;
                    bArr4[2] = -102;
                    bArr4[3] = -12;
                    bArr4[4] = 25;
                    bArr4[5] = 98;
                    bArr4[6] = 119;
                    bArr4[7] = -36;
                    if (!m.h(new byte[]{-78, -94, -9, -111, 107, 17, 30, -86, -66, -31, -4, -127, 117, 14}, bArr4).equals(substring)) {
                        byte[] bArr5 = new byte[i12];
                        // fill-array-data instruction
                        bArr5[0] = -5;
                        bArr5[1] = -123;
                        bArr5[2] = 12;
                        bArr5[3] = 126;
                        bArr5[4] = 14;
                        bArr5[5] = -22;
                        bArr5[6] = 35;
                        bArr5[7] = 113;
                        if (!m.h(new byte[]{-110, -24, 97, 27, 124, -103, 74, 7, -98, -85, ByteCompanionObject.MAX_VALUE, 10, 111, -98, 86, 2}, bArr5).equals(substring)) {
                            byte[] bArr6 = new byte[i12];
                            // fill-array-data instruction
                            bArr6[0] = -59;
                            bArr6[1] = -68;
                            bArr6[2] = 19;
                            bArr6[3] = -81;
                            bArr6[4] = 15;
                            bArr6[5] = -101;
                            bArr6[6] = 120;
                            bArr6[7] = 82;
                            if (!m.h(new byte[]{-84, -47, 126, -54, 125, -24, 17, 36, -96, -110, 125, -50, 121, -14, 31, 51, -79, -43, 124, -63}, bArr6).equals(substring)) {
                                str4 = str6;
                            }
                        }
                    }
                    StringBuilder u8 = ai.onnxruntime.a.u(substring);
                    byte[] bArr7 = new byte[1];
                    bArr7[i10] = 56;
                    byte[] bArr8 = new byte[i12];
                    // fill-array-data instruction
                    bArr8[0] = 5;
                    bArr8[1] = 6;
                    bArr8[2] = 42;
                    bArr8[3] = -100;
                    bArr8[4] = 71;
                    bArr8[5] = -112;
                    bArr8[6] = 103;
                    bArr8[7] = 7;
                    u8.append(m.h(bArr7, bArr8));
                    String substring2 = str7.substring(indexOf + 1);
                    if (z(substring2, str2) == z9) {
                        str4 = str6;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        byte[] bArr9 = new byte[1];
                        bArr9[i10] = -89;
                        byte[] bArr10 = new byte[i12];
                        // fill-array-data instruction
                        bArr10[0] = -117;
                        bArr10[1] = 77;
                        bArr10[2] = -101;
                        bArr10[3] = 64;
                        bArr10[4] = 92;
                        bArr10[5] = -12;
                        bArr10[6] = 34;
                        bArr10[7] = 28;
                        String[] split = substring2.split(m.h(bArr9, bArr10), -1);
                        int length = split.length;
                        int i16 = i10;
                        while (i16 < length) {
                            String str8 = split[i16];
                            String trim = str8.trim();
                            if (!trim.equals(str2)) {
                                str5 = str6;
                                byte[] bArr11 = new byte[i15];
                                bArr11[i10] = -39;
                                strArr = split;
                                if (!trim.equals(m.h(bArr11, new byte[]{-12, -46, 109, -106, -65, 21, 16, -125}).concat(str2))) {
                                    arrayList2.add(str8);
                                }
                            } else {
                                str5 = str6;
                                strArr = split;
                            }
                            i16++;
                            str6 = str5;
                            split = strArr;
                            i15 = 1;
                        }
                        str4 = str6;
                        byte[] bArr12 = new byte[i15];
                        bArr12[i10] = 47;
                        String h10 = m.h(bArr12, new byte[]{3, 70, 79, 11, -15, 50, -75, -60});
                        StringBuilder sb = new StringBuilder();
                        Iterator it = arrayList2.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                sb.append((CharSequence) it.next());
                                if (!it.hasNext()) {
                                    break;
                                }
                                sb.append((CharSequence) h10);
                            }
                        }
                        substring2 = sb.toString();
                        ArrayList C = C(substring2);
                        byte[] bArr13 = new byte[1];
                        bArr13[i10] = -115;
                        if (!C.contains(m.h(bArr13, new byte[]{-89, -32, 41, 15, -114, -24, -115, 49})) && !C.contains(m.h(new byte[]{-18, -76, -89, -111}, new byte[]{-113, -60, -41, -30, -42, -40, 47, 53}))) {
                            i11 = i10;
                        } else {
                            i11 = 1;
                        }
                        String str9 = null;
                        if (z9) {
                            if (i11 == 0) {
                                str9 = str2;
                            }
                        } else if (i11 != 0) {
                            byte[] bArr14 = new byte[1];
                            bArr14[i10] = -112;
                            str9 = m.h(bArr14, new byte[]{-67, -18, 125, -72, 75, 47, -2, 121}).concat(str2);
                        }
                        if (str9 != null) {
                            StringBuilder u9 = ai.onnxruntime.a.u(substring2);
                            if (substring2.isEmpty()) {
                                h2 = str4;
                            } else {
                                byte[] bArr15 = new byte[1];
                                bArr15[i10] = -97;
                                h2 = m.h(bArr15, new byte[]{-77, 106, -83, -118, -103, -103, -11, 106});
                            }
                            substring2 = ai.onnxruntime.a.p(u9, h2, str9);
                        }
                    }
                    u8.append(substring2);
                    arrayList.set(i14, u8.toString());
                }
                i14++;
                i13 = i10;
                str6 = str4;
                i12 = 8;
            }
            int i17 = i13;
            if (z9 && !z10) {
                if (!z11 && !z12) {
                    arrayList.add(i17, m.h(new byte[]{106, -29, -8, 31, -102, 55, 73, 51, 102, -96, -13, 15, -124, 40, 29}, new byte[]{3, -114, -107, 122, -24, 68, 32, 69}).concat(str2));
                } else if (!z11) {
                    arrayList.add(0, m.h(new byte[]{23, -92, 85, 116, 42, 74, 58, 71, 27, -25, 75, 101, 57, 77, 38, 66, 67}, new byte[]{126, -55, 56, 17, 88, 57, 83, 49}).concat(str2));
                } else if (!z12) {
                    arrayList.add(m.h(new byte[]{-87, -48, 118, -74, -16, 9, -22, -20, -91, -109, 117, -78, -12, 19, -28, -5, -76, -44, 116, -67, -65}, new byte[]{-64, -67, 27, -45, -126, 122, -125, -102}).concat(str2));
                }
            }
            String h11 = m.h(new byte[]{-91}, new byte[]{-97, 75, 121, 121, -44, 125, 85, 126});
            StringBuilder sb2 = new StringBuilder();
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    }
                    sb2.append((CharSequence) h11);
                }
            }
            String sb3 = sb2.toString();
            if (y(sb3, str2) == z9) {
                return sb3;
            }
            i.k(m.h(new byte[]{73, -39, 81, -86, -116, 53, 47, -106, 98, -39, 81, -93, -122, 97, 123, -99, 99, -53, 31, -76, -126, 34, 100, -108, 109, -35, 31, -77, -118, 53, 103, -102, ByteCompanionObject.MAX_VALUE, -52, 31, -89, -117, 32, 97, -110, 99, -42, 88, -28, -116, 53, 103, -112, 120, -104, 94, -76, -109, 50}, new byte[]{10, -72, 63, -60, -29, 65, 15, -11}));
            return null;
        }
        i.k(m.h(new byte[]{-26, -83, -9, -17, 13, 96, 120, -13, -33, -94, -30, -27, 0, 110, 121}, new byte[]{-81, -61, -127, -114, 97, 9, 28, -45}));
        return null;
    }

    public static ArrayList C(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(m.h(new byte[]{18}, new byte[]{62, 113, -126, 120, 63, -52, 112, 120}), -1)) {
            arrayList.add(str2.trim());
        }
        return arrayList;
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static String b(int i10, int i11, String str) {
        if (i10 < 0) {
            return e3.d.l("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return e3.d.l("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        i.k(ai.onnxruntime.a.e(i11, "negative size: "));
        return null;
    }

    public static void c(int i10, String str, boolean z9) {
        if (z9) {
            return;
        }
        i.k(e3.d.l(str, Integer.valueOf(i10)));
    }

    public static void d(String str, boolean z9) {
        if (z9) {
            return;
        }
        i.k(str);
    }

    public static void e(String str, boolean z9, Object obj) {
        if (z9) {
            return;
        }
        i.k(e3.d.l(str, obj));
    }

    public static void f(boolean z9) {
        if (z9) {
            return;
        }
        l9.i.a();
    }

    public static void g(boolean z9, String str, long j10) {
        if (z9) {
            return;
        }
        i.k(e3.d.l(str, Long.valueOf(j10)));
    }

    public static void h(int i10, int i11) {
        String l10;
        if (i10 >= 0 && i10 < i11) {
            return;
        }
        if (i10 >= 0) {
            if (i11 < 0) {
                i.k(ai.onnxruntime.a.e(i11, "negative size: "));
                return;
            }
            l10 = e3.d.l("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        } else {
            l10 = e3.d.l("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(l10);
    }

    public static void i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        n0.b.n(str);
    }

    public static void j(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11) {
        } else {
            throw new IndexOutOfBoundsException(b(i10, i11, "index"));
        }
    }

    public static void k(int i10, int i11, int i12) {
        String b10;
        if (i10 >= 0 && i11 >= i10 && i11 <= i12) {
            return;
        }
        if (i10 >= 0 && i10 <= i12) {
            if (i11 >= 0 && i11 <= i12) {
                b10 = e3.d.l("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                b10 = b(i11, i12, "end index");
            }
        } else {
            b10 = b(i10, i12, "start index");
        }
        throw new IndexOutOfBoundsException(b10);
    }

    public static void l(String str, boolean z9, Object obj) {
        if (z9) {
            return;
        }
        i.l(e3.d.l(str, obj));
    }

    public static void m(boolean z9, String str) {
        if (z9) {
            return;
        }
        i.l(str);
    }

    public static String[] n(String str) {
        if (str != null && !str.isEmpty()) {
            return str.split(m.h(new byte[]{19}, new byte[]{41, -73, 79, 48, 105, -65, -46, -79}), -1);
        }
        return new String[0];
    }

    public static int o(int i10, int i11) {
        int i12 = i10 - i11;
        if (i12 > i11) {
            i12 = i11;
            i11 = i12;
        }
        int i13 = 1;
        int i14 = 1;
        while (i10 > i11) {
            i13 *= i10;
            if (i14 <= i12) {
                i13 /= i14;
                i14++;
            }
            i10--;
        }
        while (i14 <= i12) {
            i13 /= i14;
            i14++;
        }
        return i13;
    }

    public static void p(ArrayList arrayList) {
        boolean z9;
        boolean z10;
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            t4.a aVar = (t4.a) obj;
            t4.f fVar = new t4.f(aVar);
            for (p pVar : aVar.f5796b) {
                if (aVar.e == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t4.g gVar = new t4.g(pVar, !z10);
                if (!hashMap.containsKey(gVar)) {
                    hashMap.put(gVar, new HashSet());
                }
                Set set = (Set) hashMap.get(gVar);
                if (!set.isEmpty() && z10) {
                    androidx.navigation.b.p(pVar, "Multiple components provide ", ".");
                    return;
                }
                set.add(fVar);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (t4.f fVar2 : (Set) it.next()) {
                for (t4.h hVar : fVar2.f5805a.c) {
                    if (hVar.c == 0) {
                        p pVar2 = hVar.f5809a;
                        if (hVar.f5810b == 2) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        Set<t4.f> set2 = (Set) hashMap.get(new t4.g(pVar2, z9));
                        if (set2 != null) {
                            for (t4.f fVar3 : set2) {
                                fVar2.f5806b.add(fVar3);
                                fVar3.c.add(fVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            t4.f fVar4 = (t4.f) it3.next();
            if (fVar4.c.isEmpty()) {
                hashSet2.add(fVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            t4.f fVar5 = (t4.f) hashSet2.iterator().next();
            hashSet2.remove(fVar5);
            i10++;
            Iterator it4 = fVar5.f5806b.iterator();
            while (it4.hasNext()) {
                t4.f fVar6 = (t4.f) it4.next();
                fVar6.c.remove(fVar5);
                if (fVar6.c.isEmpty()) {
                    hashSet2.add(fVar6);
                }
            }
        }
        if (i10 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            t4.f fVar7 = (t4.f) it5.next();
            if (!fVar7.c.isEmpty() && !fVar7.f5806b.isEmpty()) {
                arrayList2.add(fVar7.f5805a);
            }
        }
        throw new a8.a("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()), 4);
    }

    public static Bitmap q(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static String r(Drawable drawable) {
        Bitmap bitmap;
        if (drawable == null) {
            return "";
        }
        Bitmap q8 = q(drawable);
        int width = q8.getWidth();
        int height = q8.getHeight();
        int max = Math.max(width, height);
        if (max > 96) {
            float f8 = 96.0f / max;
            bitmap = Bitmap.createScaledBitmap(q8, Math.max(1, Math.round(width * f8)), Math.max(1, Math.round(height * f8)), true);
        } else {
            bitmap = q8;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        if (bitmap != q8) {
            bitmap.recycle();
        }
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    public static String s(Context context, String str) {
        if (context != null && str != null && !str.trim().isEmpty()) {
            String trim = str.trim();
            Drawable drawable = null;
            if (trim.startsWith(m.h(new byte[]{-24, -21, -48, 33, -94, 105, 34, 58}, new byte[]{-104, -103, -65, 71, -53, 5, 71, 0}))) {
                j0.e b10 = j0.f.b(context, trim);
                if (b10.f3094a == j0.d.e) {
                    drawable = b10.f3100j;
                }
            } else {
                n0.d dVar = (n0.d) com.bumptech.glide.d.i(n0.d.class, trim);
                if (dVar == null) {
                    n0.d[] values = n0.d.values();
                    int length = values.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            break;
                        }
                        n0.d dVar2 = values[i10];
                        if (dVar2.name().equalsIgnoreCase(trim)) {
                            dVar = dVar2;
                            break;
                        }
                        i10++;
                    }
                }
                if (dVar != null) {
                    drawable = context.getDrawable(dVar.c);
                }
            }
            if (drawable != null) {
                return r(drawable);
            }
            return "";
        }
        return "";
    }

    public static int t(List list, InputStream inputStream, k.g gVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new x(inputStream, gVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                int b10 = ((h.d) list.get(i10)).b(inputStream, gVar);
                if (b10 != -1) {
                    return b10;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static int u(int[] iArr, int i10, boolean z9) {
        boolean z10;
        int[] iArr2 = iArr;
        int i11 = 0;
        for (int i12 : iArr2) {
            i11 += i12;
        }
        int length = iArr2.length;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = length - 1;
            if (i13 < i16) {
                int i17 = 1 << i13;
                i15 |= i17;
                int i18 = 1;
                while (i18 < iArr2[i13]) {
                    int i19 = i11 - i18;
                    int i20 = length - i13;
                    int i21 = i20 - 2;
                    int o5 = o(i19 - 1, i21);
                    if (z9 && i15 == 0) {
                        int i22 = i20 - 1;
                        if (i19 - i22 >= i22) {
                            o5 -= o(i19 - i20, i21);
                        }
                    }
                    boolean z11 = true;
                    if (i20 - 1 > 1) {
                        int i23 = i19 - i21;
                        int i24 = 0;
                        while (i23 > i10) {
                            i24 += o((i19 - i23) - 1, i20 - 3);
                            i23--;
                            z11 = z11;
                        }
                        z10 = z11;
                        o5 -= (i16 - i13) * i24;
                    } else {
                        z10 = true;
                        if (i19 > i10) {
                            o5--;
                        }
                    }
                    i14 += o5;
                    i18++;
                    i15 &= ~i17;
                    iArr2 = iArr;
                }
                i11 -= i18;
                i13++;
                iArr2 = iArr;
            } else {
                return i14;
            }
        }
    }

    public static ImageHeaderParser$ImageType v(List list, InputStream inputStream, k.g gVar) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new x(inputStream, gVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser$ImageType c = ((h.d) list.get(i10)).c(inputStream);
                inputStream.reset();
                if (c != ImageHeaderParser$ImageType.UNKNOWN) {
                    return c;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType w(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser$ImageType a10 = ((h.d) list.get(i10)).a(byteBuffer);
                AtomicReference atomicReference = c0.b.f428a;
                if (a10 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return a10;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = c0.b.f428a;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static WindowManager x(int i10) {
        Context h2 = h0.b.h();
        if (h2 != null) {
            Display[] displays = ((DisplayManager) h2.getSystemService(m.h(new byte[]{68, -83, -8, 50, -99, -41, -49}, new byte[]{32, -60, -117, 66, -15, -74, -74, -45}))).getDisplays();
            if (i10 < displays.length) {
                return (WindowManager) h2.createDisplayContext(displays[i10]).getSystemService(m.h(new byte[]{71, 65, -23, 99, -24, 33}, new byte[]{48, 40, -121, 7, -121, 86, 117, 88}));
            }
            return null;
        }
        return null;
    }

    public static boolean y(String str, String str2) {
        String str3 = null;
        String str4 = null;
        for (String str5 : n(str)) {
            int indexOf = str5.indexOf(61);
            if (indexOf >= 0) {
                String substring = str5.substring(0, indexOf);
                String substring2 = str5.substring(indexOf + 1);
                if (m.h(new byte[]{98, 103, -25, -98, 121, -28, -30, 49, 110, 36, -20, -114, 103, -5}, new byte[]{11, 10, -118, -5, 11, -105, -117, 71}).equals(substring)) {
                    str3 = substring2;
                    str4 = str3;
                } else if (m.h(new byte[]{-97, 99, 87, 39, -127, 23, -119, 124, -109, 32, 73, 54, -110, 16, -107, 121}, new byte[]{-10, 14, 58, 66, -13, 100, -32, 10}).equals(substring)) {
                    str3 = substring2;
                } else if (m.h(new byte[]{4, 125, -84, 82, -89, 65, 35, 29, 8, 62, -81, 86, -93, 91, 45, 10, 25, 121, -82, 89}, new byte[]{109, 16, -63, 55, -43, 50, 74, 107}).equals(substring)) {
                    str4 = substring2;
                }
            }
        }
        if (!z(str3, str2) || !z(str4, str2)) {
            return false;
        }
        return true;
    }

    public static boolean z(String str, String str2) {
        if (str != null) {
            ArrayList C = C(str);
            if (!C.contains(m.h(new byte[]{-14}, new byte[]{-33, -101, 1, 19, 109, 65, 116, 41}) + str2) && !C.contains(m.h(new byte[]{-70, -38, 14, -75, -48}, new byte[]{-105, -69, 126, -59, -93, -62, 28, 15})) && !C.contains(m.h(new byte[]{-119, 0}, new byte[]{-92, 42, 22, -77, 14, 51, -113, 108})) && (C.contains(str2) || C.contains(m.h(new byte[]{-94, 11, -48, 115}, new byte[]{-61, 123, -96, 0, -124, -81, 51, 39})) || C.contains(m.h(new byte[]{93}, new byte[]{119, 90, -104, -97, -89, -61, -41, 60})))) {
                return true;
            }
        }
        return false;
    }
}
