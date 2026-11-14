package com.google.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f1546a;

    /* renamed from: b, reason: collision with root package name */
    public static final k1 f1547b;
    public static final k1 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.protobuf.k1, java.lang.Object] */
    static {
        Class<?> cls;
        Class<?> cls2;
        k1 k1Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f1546a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                k1Var = (k1) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f1547b = k1Var;
        c = new Object();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += n.a(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static int b(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n.c(i10) + 4) * size;
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n.c(i10) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += n.a(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += n.e(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int intValue = ((Integer) list.get(i11)).intValue();
            i10 += n.d((intValue >> 31) ^ (intValue << 1));
        }
        return i10;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            long longValue = ((Long) list.get(i11)).longValue();
            i10 += n.e((longValue >> 63) ^ (longValue << 1));
        }
        return i10;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += n.d(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += n.e(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static void j(k1 k1Var, Object obj, Object obj2) {
        k1Var.getClass();
        y yVar = (y) obj;
        j1 j1Var = yVar.unknownFields;
        j1 j1Var2 = ((y) obj2).unknownFields;
        j1 j1Var3 = j1.f1583f;
        if (!j1Var3.equals(j1Var2)) {
            if (j1Var3.equals(j1Var)) {
                int i10 = j1Var.f1584a + j1Var2.f1584a;
                int[] copyOf = Arrays.copyOf(j1Var.f1585b, i10);
                System.arraycopy(j1Var2.f1585b, 0, copyOf, j1Var.f1584a, j1Var2.f1584a);
                Object[] copyOf2 = Arrays.copyOf(j1Var.c, i10);
                System.arraycopy(j1Var2.c, 0, copyOf2, j1Var.f1584a, j1Var2.f1584a);
                j1Var = new j1(i10, copyOf, copyOf2, true);
            } else {
                j1Var.getClass();
                if (!j1Var2.equals(j1Var3)) {
                    if (j1Var.e) {
                        int i11 = j1Var.f1584a + j1Var2.f1584a;
                        j1Var.a(i11);
                        System.arraycopy(j1Var2.f1585b, 0, j1Var.f1585b, j1Var.f1584a, j1Var2.f1584a);
                        System.arraycopy(j1Var2.c, 0, j1Var.c, j1Var.f1584a, j1Var2.f1584a);
                        j1Var.f1584a = i11;
                    } else {
                        androidx.navigation.b.a();
                        return;
                    }
                }
            }
        }
        yVar.unknownFields = j1Var;
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void l(int i10, List list, l0 l0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            n nVar = (n) l0Var.f1589a;
            int i11 = 0;
            if (z9) {
                nVar.w(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Boolean) list.get(i13)).getClass();
                    Logger logger = n.f1596b;
                    i12++;
                }
                nVar.y(i12);
                while (i11 < list.size()) {
                    nVar.g(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                nVar.h(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
        }
    }

    public static void m(int i10, List list, l0 l0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            n nVar = (n) l0Var.f1589a;
            int i11 = 0;
            if (z9) {
                nVar.w(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Double) list.get(i13)).getClass();
                    Logger logger = n.f1596b;
                    i12 += 8;
                }
                nVar.y(i12);
                while (i11 < list.size()) {
                    nVar.o(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                double doubleValue = ((Double) list.get(i11)).doubleValue();
                nVar.getClass();
                nVar.n(i10, Double.doubleToRawLongBits(doubleValue));
                i11++;
            }
        }
    }

    public static void n(int i10, List list, l0 l0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            n nVar = (n) l0Var.f1589a;
            int i11 = 0;
            if (z9) {
                nVar.w(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += n.a(((Integer) list.get(i13)).intValue());
                }
                nVar.y(i12);
                while (i11 < list.size()) {
                    nVar.q(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                nVar.p(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void o(int i10, List list, l0 l0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            n nVar = (n) l0Var.f1589a;
            int i11 = 0;
            if (z9) {
                nVar.w(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).getClass();
                    Logger logger = n.f1596b;
                    i12 += 4;
                }
                nVar.y(i12);
                while (i11 < list.size()) {
                    nVar.m(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                nVar.l(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void p(int i10, List list, l0 l0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            n nVar = (n) l0Var.f1589a;
            int i11 = 0;
            if (z9) {
                nVar.w(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).getClass();
                    Logger logger = n.f1596b;
                    i12 += 8;
                }
                nVar.y(i12);
                while (i11 < list.size()) {
                    nVar.o(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                nVar.n(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void q(int i10, List list, l0 l0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            n nVar = (n) l0Var.f1589a;
            int i11 = 0;
            if (z9) {
                nVar.w(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Float) list.get(i13)).getClass();
                    Logger logger = n.f1596b;
                    i12 += 4;
                }
                nVar.y(i12);
                while (i11 < list.size()) {
                    nVar.m(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                float floatValue = ((Float) list.get(i11)).floatValue();
                nVar.getClass();
                nVar.l(i10, Float.floatToRawIntBits(floatValue));
                i11++;
            }
        }
    }

    public static void r(int i10, List list, l0 l0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            n nVar = (n) l0Var.f1589a;
            int i11 = 0;
            if (z9) {
                nVar.w(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += n.a(((Integer) list.get(i13)).intValue());
                }
                nVar.y(i12);
                while (i11 < list.size()) {
                    nVar.q(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                nVar.p(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void s(int i10, List list, l0 l0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            n nVar = (n) l0Var.f1589a;
            int i11 = 0;
            if (z9) {
                nVar.w(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += n.e(((Long) list.get(i13)).longValue());
                }
                nVar.y(i12);
                while (i11 < list.size()) {
                    nVar.A(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                nVar.z(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void t(int i10, List list, l0 l0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            n nVar = (n) l0Var.f1589a;
            int i11 = 0;
            if (z9) {
                nVar.w(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).getClass();
                    Logger logger = n.f1596b;
                    i12 += 4;
                }
                nVar.y(i12);
                while (i11 < list.size()) {
                    nVar.m(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                nVar.l(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void u(int i10, List list, l0 l0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            n nVar = (n) l0Var.f1589a;
            int i11 = 0;
            if (z9) {
                nVar.w(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).getClass();
                    Logger logger = n.f1596b;
                    i12 += 8;
                }
                nVar.y(i12);
                while (i11 < list.size()) {
                    nVar.o(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                nVar.n(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void v(int i10, List list, l0 l0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            n nVar = (n) l0Var.f1589a;
            int i11 = 0;
            if (z9) {
                nVar.w(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    int intValue = ((Integer) list.get(i13)).intValue();
                    i12 += n.d((intValue >> 31) ^ (intValue << 1));
                }
                nVar.y(i12);
                while (i11 < list.size()) {
                    int intValue2 = ((Integer) list.get(i11)).intValue();
                    nVar.y((intValue2 >> 31) ^ (intValue2 << 1));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                int intValue3 = ((Integer) list.get(i11)).intValue();
                nVar.x(i10, (intValue3 >> 31) ^ (intValue3 << 1));
                i11++;
            }
        }
    }

    public static void w(int i10, List list, l0 l0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            n nVar = (n) l0Var.f1589a;
            int i11 = 0;
            if (z9) {
                nVar.w(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    long longValue = ((Long) list.get(i13)).longValue();
                    i12 += n.e((longValue >> 63) ^ (longValue << 1));
                }
                nVar.y(i12);
                while (i11 < list.size()) {
                    long longValue2 = ((Long) list.get(i11)).longValue();
                    nVar.A((longValue2 >> 63) ^ (longValue2 << 1));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                long longValue3 = ((Long) list.get(i11)).longValue();
                nVar.z(i10, (longValue3 >> 63) ^ (longValue3 << 1));
                i11++;
            }
        }
    }

    public static void x(int i10, List list, l0 l0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            n nVar = (n) l0Var.f1589a;
            int i11 = 0;
            if (z9) {
                nVar.w(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += n.d(((Integer) list.get(i13)).intValue());
                }
                nVar.y(i12);
                while (i11 < list.size()) {
                    nVar.y(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                nVar.x(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void y(int i10, List list, l0 l0Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            n nVar = (n) l0Var.f1589a;
            int i11 = 0;
            if (z9) {
                nVar.w(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += n.e(((Long) list.get(i13)).longValue());
                }
                nVar.y(i12);
                while (i11 < list.size()) {
                    nVar.A(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                nVar.z(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }
}
