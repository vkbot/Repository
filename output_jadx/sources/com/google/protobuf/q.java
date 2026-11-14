package com.google.protobuf;

import android.util.Base64;
import com.example.navistart.MainActivity;
import com.example.navistart.boot;
import com.example.navistart.cores.InterC;
import com.google.android.material.materialswitch.MaterialSwitch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class q {
    public static int a(int i10, int i11, int i12, int i13) {
        return n.d(i10) + i11 + i12 + i13;
    }

    public static int b(UInt uInt, int i10) {
        return UInt.m190constructorimpl(uInt.getData() + i10);
    }

    public static int c(IntRange intRange, int i10) {
        return intRange.getEndInclusive().intValue() + i10;
    }

    public static long d(long j10, InterC interC) {
        return interC.l(Long.valueOf(j10)).longValue();
    }

    public static Object e(long[] jArr, int i10, Function1 function1) {
        return function1.invoke(ULong.m263boximpl(ULongArray.m329getsVKNKU(jArr, i10)));
    }

    public static Object f(short[] sArr, int i10, Function1 function1) {
        return function1.invoke(UShort.m370boximpl(UShortArray.m434getMh2AYeg(sArr, i10)));
    }

    public static String g(StringBuilder sb, String str) {
        sb.append(str);
        return boot.e(sb.toString());
    }

    public static String h(byte[] bArr, u0.a aVar, String str) {
        return aVar.loadString(str, new String(bArr));
    }

    public static String i(byte[] bArr, byte[] bArr2, StringBuilder sb) {
        sb.append(e0.m.h(bArr, bArr2));
        return sb.toString();
    }

    public static String j(byte[] bArr, byte[] bArr2, StringBuilder sb, int i10) {
        sb.append(e0.m.h(bArr, bArr2));
        sb.append(i10);
        return sb.toString();
    }

    public static String k(byte[] bArr, byte[] bArr2, StringBuilder sb, MainActivity mainActivity) {
        sb.append(e0.m.h(bArr, bArr2));
        sb.append(mainActivity.A());
        return sb.toString();
    }

    public static String l(byte[] bArr, byte[] bArr2, StringBuilder sb, String str) {
        sb.append(e0.m.h(bArr, bArr2));
        sb.append(str);
        return sb.toString();
    }

    public static ArrayList m(LinkedHashMap linkedHashMap, Object obj) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(obj, arrayList);
        return arrayList;
    }

    public static ArrayList n(Map map, Object obj) {
        ArrayList arrayList = new ArrayList();
        map.put(obj, arrayList);
        return arrayList;
    }

    public static Iterator o(Iterable iterable, Function1 function1) {
        iterable.getClass();
        function1.getClass();
        return iterable.iterator();
    }

    public static /* synthetic */ void p(int i10, String str) {
        if (i10 != 0) {
            return;
        }
        n0.b.n(str);
    }

    public static /* synthetic */ void q(Object obj) {
        if (obj == null) {
            return;
        }
        n0.b.a();
    }

    public static void r(byte[] bArr, StringBuilder sb) {
        sb.append(new String(bArr));
    }

    public static void s(byte[] bArr, u0.a aVar, String str, StringBuilder sb) {
        sb.append(aVar.loadString(new String(bArr), str));
    }

    public static void t(byte[] bArr, byte[] bArr2, StringBuilder sb, int i10) {
        sb.append(e0.m.h(bArr, bArr2));
        sb.append(i10);
    }

    public static void u(byte[] bArr, byte[] bArr2, StringBuilder sb, String str) {
        sb.append(e0.m.h(bArr, bArr2));
        sb.append(str);
    }

    public static void v(byte[] bArr, byte[] bArr2, u0.a aVar, boolean z9, MaterialSwitch materialSwitch) {
        materialSwitch.setChecked(aVar.loadBoolean(e0.m.h(bArr, bArr2), z9));
    }

    public static boolean w(byte[] bArr, u0.a aVar, String str, String str2) {
        return str2.equals(aVar.loadString(new String(bArr), str));
    }

    public static byte[] x(byte[] bArr, byte[] bArr2, u0.a aVar, String str, int i10) {
        return Base64.decode(aVar.loadString(str, e0.m.h(bArr, bArr2)), i10);
    }

    public static /* synthetic */ String y(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return "null";
                        }
                        return "MEMORY_CACHE";
                    }
                    return "RESOURCE_DISK_CACHE";
                }
                return "DATA_DISK_CACHE";
            }
            return "REMOTE";
        }
        return "LOCAL";
    }

    public static /* synthetic */ String z(int i10) {
        switch (i10) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }
}
