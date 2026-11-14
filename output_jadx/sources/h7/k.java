package h7;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.util.Log;
import b1.n;
import com.google.protobuf.q;
import e0.m;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: k, reason: collision with root package name */
    public static final String f2614k = m.h(new byte[]{-6, 38, 44, -12, -96, -31, -28, -99, -61, 38, 43, -5, -77, -31, -51, -95, -39, 32, 45, -11, -90}, new byte[]{-73, 73, 89, -102, -44, -124, ByteCompanionObject.MIN_VALUE, -50});

    /* renamed from: l, reason: collision with root package name */
    public static final String f2615l = m.h(new byte[]{-59, -122, -92, 92, -118, -13, 109, -106, -38, -122, -66, 70, -115}, new byte[]{-88, -23, -47, 50, -2, -106, 9, -55});

    /* renamed from: m, reason: collision with root package name */
    public static final String f2616m = m.h(new byte[]{73, -119, -48, -24, -116, 119, -112, 44, 81, -107, -57, -39, -100, 119, -126, 26, 71, -125, -42}, new byte[]{36, -26, -91, -122, -8, 18, -12, 115});

    /* renamed from: n, reason: collision with root package name */
    public static final long[] f2617n = {1000, 3000, 6000, 12000, 18000};

    /* renamed from: o, reason: collision with root package name */
    public static final k f2618o = new k();

    /* renamed from: a, reason: collision with root package name */
    public final Object f2619a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Handler f2620b = new Handler(Looper.getMainLooper());
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final h e = new h(this, 0);

    /* renamed from: f, reason: collision with root package name */
    public final h f2621f = new h(this, 1);

    /* renamed from: g, reason: collision with root package name */
    public Context f2622g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2623h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2624i;

    /* renamed from: j, reason: collision with root package name */
    public int f2625j;

    public static void a(ArrayList arrayList, HashSet hashSet) {
        File[] fileArr;
        String[] strArr = {m.h(new byte[]{80, -17, 20, -13, 94, -80, 32, 36}, new byte[]{ByteCompanionObject.MAX_VALUE, -100, 96, -100, 44, -47, 71, 65}), m.h(new byte[]{47, 0, 66, -22, -13, 110, 33, 4, 105, 12, 115, -20, -85}, new byte[]{0, 109, 44, -98, -36, 3, 68, 96}), m.h(new byte[]{59, 36, -82, 19, 53, 118, -85, 79, 75, 58, -76, 8, 104, 98, -65, 72}, new byte[]{20, 73, -64, 103, 26, 3, -40, 45}), m.h(new byte[]{23, -74, 107, 31, 70, 56, -92, 7, 23, -80, 108, 18, 107, 42, -73, 13, 74, -92, 120, 21}, new byte[]{56, -59, 31, 112, 52, 89, -61, 98}), m.h(new byte[]{-78, -34, -29, -81, -43, -100, 6, 121}, new byte[]{-99, -77, -115, -37, -6, -23, 117, 27}), m.h(new byte[]{83, 39, 118, 78, -109, 34, 119, -114, 83, 33, 113, 67}, new byte[]{124, 84, 2, 33, -31, 67, 16, -21}), m.h(new byte[]{-24, -94, -36, -43, -72, 102, -121, -95, -76, -92}, new byte[]{-57, -49, -78, -95, -105, 19, -29, -56}), m.h(new byte[]{20, -70, 74, -16, -39, 5, 44, 69, 20, -68, 90, -10, -40, 15}, new byte[]{59, -55, 62, -97, -85, 100, 75, 32}), m.h(new byte[]{-18, 71, -4, -122, 4, -54, -81, -53, -75, 67, -1, -105, 4, -36, -65, -61, -96, 95, -2, -122}, new byte[]{-63, 42, -110, -14, 43, -72, -38, -91}), m.h(new byte[]{89, 88, -93, -15, 91, 37, 83, -61, 2, 92, -96, -32, 91, 37, 67, -52, 18}, new byte[]{118, 53, -51, -123, 116, 87, 38, -83}), m.h(new byte[]{-67, -49, -75, 59, 14, 102, -14, -70, -26, -53, -74, 42, 14, 99, -11, -67, -26, -57}, new byte[]{-110, -94, -37, 79, 33, 20, -121, -44}), m.h(new byte[]{-12, -19, 52, -53, -94, -84, -93, -125, -12, -5, 56, -48, -125, -87, -121, -121, -87, -6}, new byte[]{-37, -98, 64, -92, -48, -51, -60, -26}), m.h(new byte[]{-3, 57, -53, -3, -44, 62, -57, 33, -3, 57, -37, -15, -57, 45, -60, 117}, new byte[]{-46, 74, -65, -110, -90, 95, -96, 68}), m.h(new byte[]{93, -62, -88, 95, 13, -117, 115, -22, 1, -53}, new byte[]{114, -81, -58, 43, 34, -18, 11, -98}), m.h(new byte[]{-53, -20, -38, -101, 10, 85, 78, -91, -127, -13, -38, -114, 73, 111, 69, -75}, new byte[]{-28, -127, -76, -17, 37, 48, 54, -47})};
        for (int i10 = 0; i10 < 15; i10++) {
            try {
                fileArr = new File(strArr[i10]).listFiles();
            } catch (Exception unused) {
                fileArr = null;
            }
            if (fileArr != null) {
                for (File file : fileArr) {
                    file.getName();
                    b(arrayList, hashSet, file, m.h(new byte[]{117, -118, -24, -53, 1, -75, -109}, new byte[]{24, -27, -99, -91, 117, -48, -9, 35}), m.h(new byte[]{63, 46, -90, 3, 95, -110, 40, 7, 51, 47}, new byte[]{82, 65, -45, 109, 43, -65, 91, 100}));
                }
            }
        }
    }

    public static void b(ArrayList arrayList, HashSet hashSet, File file, String str, String str2) {
        if (file != null) {
            try {
                String absolutePath = file.getAbsolutePath();
                String name = file.getName();
                if (file.isDirectory() && !absolutePath.contains(m.h(new byte[]{-97, 4, 26, 59, -72, -43, 124, -59, -44}, new byte[]{-80, 97, 119, 78, -44, -76, 8, -96})) && !absolutePath.endsWith(m.h(new byte[]{-119, -67, 43, -19, -54, 50, -90, -8, -62}, new byte[]{-90, -40, 70, -104, -90, 83, -46, -99})) && !absolutePath.contains(m.h(new byte[]{101, 122, -102, -23, 85}, new byte[]{74, 9, -1, -123, 51, 46, -99, 64})) && !absolutePath.endsWith(m.h(new byte[]{14, -64, 123, 9, -23}, new byte[]{33, -77, 30, 101, -113, -113, 47, 67})) && name != null && name.length() != 0) {
                    if (file.listFiles() != null) {
                        String absolutePath2 = file.getAbsolutePath();
                        if (hashSet.add(absolutePath2)) {
                            arrayList.add(new i(file));
                            StringBuilder sb = new StringBuilder();
                            q.u(new byte[]{-17, -46, 47, -91, 19, 79, 47, 31, -15, -55, 53, -71, 6, 77, 46, 5, -94}, new byte[]{-126, -67, 90, -53, 103, 42, 75, 63}, sb, absolutePath2);
                            q.u(new byte[]{121, -101, 107, 93, -122, -45, 10, -87}, new byte[]{89, -24, 4, 40, -12, -80, 111, -108}, sb, str2);
                            sb.append(m.h(new byte[]{73, 4, -4, -40, -6, -76, 19}, new byte[]{105, 119, -120, -71, -114, -47, 46, -113}));
                            sb.append(str);
                            Log.d(f2614k, sb.toString());
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void c(ArrayList arrayList, HashSet hashSet, File file, String str, String str2, String str3) {
        b(arrayList, hashSet, file, str2, str3);
        if (str != null && str.length() > 0) {
            b(arrayList, hashSet, new File(m.h(new byte[]{123, -91, 34, -6, -126, -68, 107, -67}, new byte[]{84, -42, 86, -107, -16, -35, 12, -40}), str), str2, str3.concat(m.h(new byte[]{-84, -111, -27, 79, -48, -64, 28, -65, -13}, new byte[]{-106, -66, -106, 59, -65, -78, 125, -40})));
            b(arrayList, hashSet, new File(m.h(new byte[]{-112, 107, -99, -77, -91, 12, 123, 125, -42, 103, -84, -75, -3}, new byte[]{-65, 6, -13, -57, -118, 97, 30, 25}), str), str2, str3.concat(m.h(new byte[]{105, -111, -91, -81, 76, -54, 66, 115, 55, -41, -87, -98, 74, -110}, new byte[]{83, -66, -56, -63, 56, -27, 47, 22})));
        }
    }

    public static String d(String... strArr) {
        for (String str : strArr) {
            if (str != null && str.trim().length() > 0) {
                return str;
            }
        }
        return null;
    }

    public static Object g(Object obj, String str) {
        Method method;
        if (str != null) {
            try {
                Class<?> cls = obj.getClass();
                Class<?> cls2 = cls;
                while (true) {
                    if (cls2 != null) {
                        try {
                            method = cls2.getDeclaredMethod(str, null);
                            break;
                        } catch (NoSuchMethodException unused) {
                            cls2 = cls2.getSuperclass();
                        }
                    } else {
                        method = cls.getMethod(str, null);
                        break;
                    }
                }
                method.setAccessible(true);
                return method.invoke(obj, null);
            } catch (Exception unused2) {
                return null;
            }
        }
        return null;
    }

    public static boolean h(String str) {
        if (!m.h(new byte[]{117, -72, 112, -10, 87, -89, 120}, new byte[]{24, -41, 5, -104, 35, -62, 28, 124}).equals(str) && !m.h(new byte[]{-119, 54, -79, 1, 86, -87, 94, 106, -106, 54}, new byte[]{-28, 89, -60, 111, 34, -52, 58, 53}).equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean i(String str) {
        if (!m.h(new byte[]{-119, -108, -76, 70, -114, -19, -49, 18, ByteCompanionObject.MIN_VALUE, -101, -94, 80, -106, -27, -39, 89, -58, -113, -93, 86, -49, -27, -56, 72, -127, -107, -66, 26, -76, -41, -23, 99, -84, -65, -122, 125, -94, -63, -12, 125, -68, -82, -111, 119, -87, -63, -17}, new byte[]{-24, -6, -48, 52, -31, -124, -85, 60}).equals(str) && !m.h(new byte[]{-15, -64, -44, -48, -22, 120, -79, -59, -8, -49, -62, -58, -14, 112, -89, -114, -66, -37, -61, -64, -85, 112, -74, -97, -7, -63, -34, -116, -48, 66, -105, -76, -44, -21, -26, -21, -58, 84, -118, -81, -43, -6, -15, -31, -51, 84, -111}, new byte[]{-112, -82, -80, -94, -123, 17, -43, -21}).equals(str) && !m.h(new byte[]{125, -22, -110, -77, 4, 66, -106, -107, 116, -27, -124, -91, 28, 74, ByteCompanionObject.MIN_VALUE, -34, 50, -15, -123, -93, 69, 74, -111, -49, 117, -21, -104, -17, 62, 120, -80, -28, 93, -57, -75, -124, 56, 120, -67, -23, 69, -37, -73, -107, 63, 106, -79, -13, 89, -64}, new byte[]{28, -124, -10, -63, 107, 43, -14, -69}).equals(str) && !m.h(new byte[]{57, 14, -63, 10, 105, 1, 28, 53, 48, 1, -41, 28, 113, 9, 10, 126, 118, 21, -42, 26, 40, 9, 27, 111, 49, 15, -53, 86, 83, 59, 58, 68, 25, 35, -26, Base64.padSymbol, 85, 59, 55, 73, 1, 63, -31, Base64.padSymbol, 82, 41, 59, 83, 29, 36}, new byte[]{88, 96, -91, 120, 6, 104, 120, 27}).equals(str)) {
            return false;
        }
        return true;
    }

    public static List j(Context context) {
        if (context == null) {
            return Collections.EMPTY_LIST;
        }
        String loadString = h0.b.o().loadString(f2615l, "");
        if (loadString != null && loadString.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : loadString.split(m.h(new byte[]{-70, -124}, new byte[]{-26, -22, 69, 6, 49, -72, 56, 94}))) {
                if (str != null && str.trim().length() > 0) {
                    arrayList.add(new File(str.trim()));
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public static Object k(Object obj, String str) {
        try {
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                try {
                    Field declaredField = cls.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    return declaredField.get(obj);
                } catch (NoSuchFieldException unused) {
                }
            }
            throw new NoSuchFieldException(str);
        } catch (Exception unused2) {
            return null;
        }
    }

    public static int l(Object obj, String str, String str2) {
        Object g10 = g(obj, str);
        if (g10 instanceof Number) {
            return ((Number) g10).intValue();
        }
        Object k6 = k(obj, str2);
        if (k6 instanceof Number) {
            return ((Number) k6).intValue();
        }
        return -1;
    }

    public static File m(Object obj, String str, String str2) {
        Object obj2;
        File file;
        if (str != null) {
            obj2 = g(obj, str);
        } else {
            obj2 = null;
        }
        if (obj2 instanceof File) {
            file = (File) obj2;
        } else {
            if (obj2 instanceof String) {
                String str3 = (String) obj2;
                if (str3.length() > 0) {
                    file = new File(str3);
                }
            }
            file = null;
        }
        if (file != null) {
            return file;
        }
        Object k6 = k(obj, str2);
        if (k6 instanceof File) {
            return (File) k6;
        }
        if (k6 instanceof String) {
            String str4 = (String) k6;
            if (str4.length() > 0) {
                return new File(str4);
            }
        }
        return null;
    }

    public static String n(Object obj, String str) {
        Method method;
        try {
            Class<?> cls = obj.getClass();
            Class<?> cls2 = cls;
            while (true) {
                if (cls2 != null) {
                    try {
                        method = cls2.getDeclaredMethod(str, null);
                        break;
                    } catch (NoSuchMethodException unused) {
                        cls2 = cls2.getSuperclass();
                    }
                } else {
                    method = cls.getMethod(str, null);
                    break;
                }
            }
            method.setAccessible(true);
            Object invoke = method.invoke(obj, null);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File s(java.lang.Object r5) {
        /*
            boolean r0 = r5 instanceof android.os.storage.StorageVolume
            if (r0 == 0) goto L14
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L14
            r0 = r5
            android.os.storage.StorageVolume r0 = (android.os.storage.StorageVolume) r0     // Catch: java.lang.Exception -> L14
            java.io.File r0 = androidx.core.view.accessibility.b.f(r0)     // Catch: java.lang.Exception -> L14
            if (r0 == 0) goto L14
            return r0
        L14:
            r0 = 11
            byte[] r0 = new byte[r0]
            r0 = {x0072: FILL_ARRAY_DATA , data: [61, 127, 87, -55, -118, 105, -71, 67, 51, 118, 70} // fill-array
            r1 = 8
            byte[] r2 = new byte[r1]
            r2 = {x007c: FILL_ARRAY_DATA , data: [90, 26, 35, -103, -21, 29, -47, 5} // fill-array
            java.lang.String r0 = e0.m.h(r0, r2)
            r2 = 0
            java.lang.Class r3 = r5.getClass()     // Catch: java.lang.Exception -> L4b
            r4 = r3
        L2c:
            if (r4 == 0) goto L38
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r0, r2)     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.Exception -> L4b
            goto L3c
        L33:
            java.lang.Class r4 = r4.getSuperclass()     // Catch: java.lang.Exception -> L4b
            goto L2c
        L38:
            java.lang.reflect.Method r0 = r3.getMethod(r0, r2)     // Catch: java.lang.Exception -> L4b
        L3c:
            r3 = 1
            r0.setAccessible(r3)     // Catch: java.lang.Exception -> L4b
            java.lang.Object r0 = r0.invoke(r5, r2)     // Catch: java.lang.Exception -> L4b
            boolean r3 = r0 instanceof java.io.File     // Catch: java.lang.Exception -> L4b
            if (r3 == 0) goto L4b
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Exception -> L4b
            goto L4c
        L4b:
            r0 = r2
        L4c:
            if (r0 == 0) goto L4f
            return r0
        L4f:
            r0 = 7
            byte[] r0 = new byte[r0]
            r0 = {x0084: FILL_ARRAY_DATA , data: [-81, 123, -9, -114, -18, 33, 19} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x008c: FILL_ARRAY_DATA , data: [-56, 30, -125, -34, -113, 85, 123, -33} // fill-array
            java.lang.String r0 = e0.m.h(r0, r1)
            java.lang.String r5 = n(r5, r0)
            if (r5 == 0) goto L70
            int r0 = r5.length()
            if (r0 <= 0) goto L70
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            return r0
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.k.s(java.lang.Object):java.io.File");
    }

    public static ArrayList t(Context context) {
        String str;
        int l10;
        int l11;
        File file;
        File file2;
        String h2;
        Object g10;
        String str2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StorageManager storageManager = (StorageManager) context.getSystemService(m.h(new byte[]{47, -13, -98, -8, 22, -89, -5}, new byte[]{92, -121, -15, -118, 119, -64, -98, -83}));
        if (storageManager != null) {
            try {
                for (StorageVolume storageVolume : storageManager.getStorageVolumes()) {
                    if (storageVolume != null && storageVolume.isRemovable()) {
                        try {
                            str = storageVolume.getState();
                        } catch (Exception unused) {
                            str = null;
                        }
                        if (h(str)) {
                            String uuid = storageVolume.getUuid();
                            try {
                                storageVolume.getDescription(context);
                            } catch (Exception unused2) {
                            }
                            File s5 = s(storageVolume);
                            if (uuid != null) {
                                b(arrayList, hashSet, new File(m.h(new byte[]{56, -75, -108, 121, 119, -120, 68, -50}, new byte[]{23, -58, -32, 22, 5, -23, 35, -85}), uuid), str, m.h(new byte[]{124, -2, 81, 46, -62, 21, 112, -89, 78, -28, 95, 59, -58, 0, 47, -59, 92, -2, 81, 46, -62, 21, 112}, new byte[]{47, -118, 62, 92, -93, 114, 21, -22}));
                            }
                            b(arrayList, hashSet, s5, str, m.h(new byte[]{52, 5, -66, Base64.padSymbol, -122, -9, -114, 113, 6, 31, -80, 40, -126, -30}, new byte[]{103, 113, -47, 79, -25, -112, -21, 60}));
                            if (uuid != null) {
                                b(arrayList, hashSet, new File(m.h(new byte[]{8, -118, -80, 123, -68, 39, -61, -3, 78, -122, -127, 125, -28}, new byte[]{39, -25, -34, 15, -109, 74, -90, -103}), uuid), str, m.h(new byte[]{24, -37, 81, -118, -113, 126, -54, -83, 42, -63, 95, -97, -117, 107, -107, -49, 38, -63, 74, -41, -125, 124, -53, -119, 42, -16, 76, -113}, new byte[]{75, -81, 62, -8, -18, 25, -81, -32}));
                            }
                        }
                    }
                }
            } catch (Exception e) {
                Log.w(f2614k, m.h(new byte[]{-87, -81, -42, 116, -70, -84, 109, -61, -87, -81, -12, 72, -94, -74, 114, -57, -67, -22, -60, 70, -89, -81, 122, -58}, new byte[]{-50, -54, -94, 39, -50, -61, 31, -94}), e);
            }
        }
        StorageManager storageManager2 = (StorageManager) context.getSystemService(m.h(new byte[]{77, -96, -85, 54, -67, 96, -50}, new byte[]{62, -44, -60, 68, -36, 7, -85, -13}));
        int i10 = 5;
        if (storageManager2 != null && (g10 = g(storageManager2, m.h(new byte[]{83, 46, -50, 7, 38, 4, 24, 39, 81, 7, -45, 34, Base64.padSymbol}, new byte[]{52, 75, -70, 81, 73, 104, 109, 74}))) != null && g10.getClass().isArray()) {
            int length = Array.getLength(g10);
            int i11 = 0;
            while (i11 < length) {
                Object obj = Array.get(g10, i11);
                if (obj != null) {
                    String n10 = n(obj, m.h(new byte[]{86, -18, -62, -75, 81, -70, 104, -114}, new byte[]{49, -117, -74, -26, 37, -37, 28, -21}));
                    if (h(n10)) {
                        Object g11 = g(obj, m.h(new byte[]{-90, -50, -34, 80, -17, -24, 39, 100, -83, -47, -23}, new byte[]{-49, -67, -116, 53, -126, -121, 81, 5}));
                        boolean booleanValue = g11 instanceof Boolean ? ((Boolean) g11).booleanValue() : true;
                        File s9 = s(obj);
                        if (!booleanValue) {
                            if (s9 != null) {
                                String absolutePath = s9.getAbsolutePath();
                                if (!absolutePath.startsWith(m.h(new byte[]{-36, -99, 72, 85, 67, -75, -30, -52, -36}, new byte[]{-13, -18, 60, 58, 49, -44, -123, -87})) && !absolutePath.startsWith(m.h(new byte[]{121, -46, -73, -98, 126, 96, -6, -24, 63, -34, -122, -104, 38, 34}, new byte[]{86, -65, -39, -22, 81, 13, -97, -116})) && !absolutePath.startsWith(m.h(new byte[]{78, -99, 81, -80, 103, 43, 5, 85, 21, -103, 82, -95, 103}, new byte[]{97, -16, 63, -60, 72, 89, 112, 59})) && !absolutePath.startsWith(m.h(new byte[]{60, -109, -32, -83, -91, 119, -13, -117}, new byte[]{19, -2, -114, -39, -118, 2, ByteCompanionObject.MIN_VALUE, -23})) && !absolutePath.startsWith(m.h(new byte[]{5, 113, -115, -95, -96, -109, -109, 73, 5, 119, -118, -84}, new byte[]{42, 2, -7, -50, -46, -14, -12, 44})) && !absolutePath.startsWith(m.h(new byte[]{19, 40, -19, -114, -34, -115, -20, 38, 79, 46}, new byte[]{60, 69, -125, -6, -15, -8, -120, 79})) && !absolutePath.startsWith(m.h(new byte[]{-89, -71, -59, -83, -108, -53, -41, -19, -89, -65, -43, -85, -107, -63}, new byte[]{-120, -54, -79, -62, -26, -86, -80, -120})) && !absolutePath.startsWith(m.h(new byte[]{121, 63, -95, -2, 112, 40, 5, 110, 121, 41, -83, -27}, new byte[]{86, 76, -43, -111, 2, 73, 98, 11})) && !absolutePath.startsWith(m.h(new byte[]{46, -33, -21, -36, 108, -95, -78, -95}, new byte[]{1, -78, -123, -88, 67, -60, -54, -43})) && !absolutePath.startsWith(m.h(new byte[]{-96, 5, 91, -31, 111, 17, -5, -41, -96, 5, 75, -19, 124, 2, -8}, new byte[]{-113, 118, 47, -114, 29, 112, -100, -78}))) {
                                }
                            }
                        }
                        byte[] bArr = new byte[i10];
                        // fill-array-data instruction
                        bArr[0] = 119;
                        bArr[1] = 66;
                        bArr[2] = 45;
                        bArr[3] = -11;
                        bArr[4] = -11;
                        String d = d(n(obj, m.h(new byte[]{41, 29, 103, -98, 21, -15, -39}, new byte[]{78, 120, 19, -53, 96, -104, -67, 13})), n(obj, m.h(bArr, new byte[]{16, 39, 89, -68, -111, 37, 83, -2})));
                        if (obj instanceof StorageVolume) {
                            try {
                                str2 = ((StorageVolume) obj).getDescription(context);
                            } catch (Exception unused3) {
                            }
                        } else {
                            Method method = obj.getClass().getMethod(m.h(new byte[]{-116, -109, 5, -8, -85, -90, -14, 86, -126, -122, 5, -43, -95, -69}, new byte[]{-21, -10, 113, -68, -50, -43, -111, 36}), Context.class);
                            method.setAccessible(true);
                            Object invoke = method.invoke(obj, context);
                            if (invoke instanceof String) {
                                str2 = (String) invoke;
                            }
                            str2 = null;
                        }
                        d(str2, d, s9 != null ? s9.getName() : null);
                        c(arrayList, hashSet, s9, d, n10, m.h(new byte[]{-84, 11, -122, 1, 63, -70, -50, 6, -98, 17, -120, 20, 59, -81, -111, 44, -102, 11, -65, 28, 50, -88, -58, 46, -77, 22, -102, 7}, new byte[]{-1, ByteCompanionObject.MAX_VALUE, -23, 115, 94, -35, -85, 75}));
                    }
                }
                i11++;
                i10 = 5;
            }
        }
        StorageManager storageManager3 = (StorageManager) context.getSystemService(m.h(new byte[]{6, -1, -13, 91, 4, -26, -70}, new byte[]{117, -117, -100, 41, 101, -127, -33, -97}));
        if (storageManager3 != null) {
            Object g12 = g(storageManager3, m.h(new byte[]{83, 30, -41, -93, 55, -69, 60, -90, 81, 8}, new byte[]{52, 123, -93, -11, 88, -41, 73, -53}));
            if (g12 instanceof List) {
                for (Object obj2 : (List) g12) {
                    if (obj2 != null && ((l10 = l(obj2, m.h(new byte[]{49, 66, -15, -15, 82, 7, 84}, new byte[]{86, 39, -123, -91, 43, 119, 49, 83}), m.h(new byte[]{-29, 88, -33, -73}, new byte[]{-105, 33, -81, -46, -76, -94, -40, -80}))) == -1 || l10 == 0)) {
                        Object g13 = g(obj2, m.h(new byte[]{-114, 97, 53, -28, 2, -3, 113, 40, -125, 64, 29, -22, 19, -14, 103, 33, -126}, new byte[]{-25, 18, 120, -117, 119, -109, 5, 77}));
                        if (((g13 instanceof Boolean) && ((Boolean) g13).booleanValue()) || (l11 = l(obj2, m.h(new byte[]{-37, -4, -81, 3, 17, -22, 88, 39}, new byte[]{-68, -103, -37, 80, 101, -117, 44, 66}), m.h(new byte[]{-87, -25, 70, 45, -43}, new byte[]{-38, -109, 39, 89, -80, -34, 97, 2}))) == 2 || l11 == 3) {
                            File[] fileArr = {m(obj2, m.h(new byte[]{-75, -40, -40, -44, 75, -49, -87}, new byte[]{-46, -67, -84, -124, 42, -69, -63, 87}), m.h(new byte[]{-72, -110, 3, 53}, new byte[]{-56, -13, 119, 93, -61, -124, 90, 53})), m(obj2, null, m.h(new byte[]{-5, -11, -90, -37}, new byte[]{-117, -108, -46, -77, -9, Base64.padSymbol, -55, 34}))};
                            int i12 = 0;
                            while (true) {
                                if (i12 >= 2) {
                                    file = null;
                                    break;
                                }
                                file = fileArr[i12];
                                if (file != null) {
                                    break;
                                }
                                i12++;
                            }
                            File[] fileArr2 = {m(obj2, m.h(new byte[]{-68, 90, -113, 84, 120, -110, -77, 121, -75, 94, -105, 77, 119, -110, -66}, new byte[]{-37, 63, -5, 29, 22, -26, -42, 11}), m.h(new byte[]{1, -8, 80, -53, 67, -104, -12, 91, 56, -9, 80, -58}, new byte[]{104, -106, 36, -82, 49, -10, -107, 55})), m(obj2, null, m.h(new byte[]{57, 85, -117, 62, -76, -78, 83, -64, 0, 90, -117, 51}, new byte[]{80, 59, -1, 91, -58, -36, 50, -84}))};
                            int i13 = 0;
                            while (true) {
                                if (i13 >= 2) {
                                    file2 = null;
                                    break;
                                }
                                file2 = fileArr2[i13];
                                if (file2 != null) {
                                    break;
                                }
                                i13++;
                            }
                            String n11 = n(obj2, m.h(new byte[]{-112, -45, -97, -111, 55, -75, -18, 60, -109}, new byte[]{-9, -74, -21, -41, 68, -32, -101, 85}));
                            Object k6 = k(obj2, m.h(new byte[]{-74, 110, -11, -115, 44, -88}, new byte[]{-48, 29, -96, -8, 69, -52, 113, 76}));
                            String str3 = k6 instanceof String ? (String) k6 : null;
                            String n12 = n(obj2, m.h(new byte[]{73, 62, 58, -95, -12}, new byte[]{46, 91, 78, -24, -112, 44, -99, -123}));
                            Object k10 = k(obj2, m.h(new byte[]{78, -126}, new byte[]{39, -26, 35, -63, -1, 32, -125, -4}));
                            String d10 = d(n11, str3, n12, k10 instanceof String ? (String) k10 : null);
                            String n13 = n(obj2, m.h(new byte[]{-47, -120, 7, -78, -46, 64, 46, -84, -45, -127}, new byte[]{-74, -19, 115, -12, -95, 12, 79, -50}));
                            Object k11 = k(obj2, m.h(new byte[]{-112, -79, -122, 70, 118, -6, -24}, new byte[]{-10, -62, -54, 39, 20, -97, -124, 100}));
                            d(n13, k11 instanceof String ? (String) k11 : null, d10, file != null ? file.getName() : null);
                            if (l(obj2, m.h(new byte[]{ByteCompanionObject.MAX_VALUE, 0, -50, -29, -4, 28, 121, 59}, new byte[]{24, 101, -70, -80, -120, 125, 13, 94}), m.h(new byte[]{-68, -27, 84, 76, -93}, new byte[]{-49, -111, 53, 56, -58, -31, 74, -75})) == 3) {
                                h2 = m.h(new byte[]{-84, 18, -120, 2, -121, -37, 98, 104, -77, 18}, new byte[]{-63, 125, -3, 108, -13, -66, 6, 55});
                            } else {
                                h2 = m.h(new byte[]{-67, -116, -123, -5, 97, -34, -120}, new byte[]{-48, -29, -16, -107, 21, -69, -20, -71});
                            }
                            String str4 = h2;
                            ArrayList arrayList2 = arrayList;
                            HashSet hashSet2 = hashSet;
                            c(arrayList2, hashSet2, file, d10, str4, m.h(new byte[]{105, -92, 49, 102, Base64.padSymbol, -90, -23, -50, 91, -66, 63, 115, 57, -77, -74, -28, 95, -92, 8, 123, 48, -76, -31, -26, 73, -22, 46, 117, 40, -87}, new byte[]{58, -48, 94, 20, 92, -63, -116, -125}));
                            c(arrayList2, hashSet2, file2, d10, str4, m.h(new byte[]{-22, 14, 68, 2, -68, 110, 22, 19, -40, 20, 74, 23, -72, 123, 73, 57, -36, 14, 125, 31, -79, 124, 30, 59, -54, 64, 66, 30, -87, 108, 1, 48, -40, 22, 123, 17, -87, 97}, new byte[]{-71, 122, 43, 112, -35, 9, 115, 94}));
                            hashSet = hashSet2;
                            arrayList = arrayList2;
                        }
                    }
                }
            }
        }
        ArrayList arrayList3 = arrayList;
        a(arrayList3, hashSet);
        Collections.sort(arrayList3, new androidx.constraintlayout.core.utils.a(6));
        return arrayList3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        if (r7.trim().length() > 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r7.trim().length() > 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList u(android.content.Context r19) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.k.u(android.content.Context):java.util.ArrayList");
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        synchronized (this.f2619a) {
            try {
                ArrayList arrayList2 = this.c;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    File file = ((i) obj).f2611a;
                    if (file != null && hashSet.add(file.getAbsolutePath())) {
                        arrayList.add(file);
                    }
                }
                Context context = this.f2622g;
                if (context != null) {
                    for (File file2 : j(context)) {
                        if (file2 != null && hashSet.add(file2.getAbsolutePath())) {
                            arrayList.add(file2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final void f(Context context, Intent intent) {
        File file;
        File file2;
        String path;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            String action = intent.getAction();
            Uri data = intent.getData();
            File file3 = null;
            if (data != null && m.h(new byte[]{8, -110, -126, 120}, new byte[]{110, -5, -18, 29, -28, -97, 95, 107}).equals(data.getScheme()) && (path = data.getPath()) != null && path.length() != 0) {
                file3 = new File(path);
            }
            if (i(action) || m.h(new byte[]{108, 10, -99, 94, 100, -4, 51, -103, 100, 10, -115, 73, 101, -31, 121, -42, 110, 16, -112, 67, 101, -69, 21, -8, 66, 48, -90, 111, 68, -40, 7, -5, 72, 48, -68, 104}, new byte[]{13, 100, -7, 44, 11, -107, 87, -73}).equals(action)) {
                r(applicationContext, u(applicationContext));
            }
            ArrayList t = t(applicationContext);
            HashSet hashSet = new HashSet();
            int size = t.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = t.get(i10);
                i10++;
                i iVar = (i) obj;
                if (iVar != null && (file2 = iVar.f2611a) != null) {
                    hashSet.add(file2.getAbsolutePath());
                }
            }
            if (m.h(new byte[]{-52, 94, -52, 27, 73, -111, -39, -61, -60, 94, -36, 12, 72, -116, -109, -116, -50, 68, -63, 6, 72, -42, -16, -88, -23, 121, -23, 54, 107, -73, -24, -93, -7, 117, -20}, new byte[]{-83, 48, -88, 105, 38, -8, -67, -19}).equals(action) && file3 != null) {
                file3.getName();
                b(t, hashSet, file3, m.h(new byte[]{-4, -110, -92, 75, 81, 103, -87}, new byte[]{-111, -3, -47, 37, 37, 2, -51, -31}), q.l(new byte[]{-30, 104, -86, 70, -89, 74, 20, -80, -12, 32}, new byte[]{ByteCompanionObject.MIN_VALUE, 26, -59, 39, -61, 41, 117, -61}, new StringBuilder(), action));
            } else if ((m.h(new byte[]{-8, -12, 53, -44, 5, -120, 31, 19, -16, -12, 37, -61, 4, -107, 85, 92, -6, -18, 56, -55, 4, -49, 54, 120, -35, -45, 16, -7, 63, -81, 54, 114, -52, -44, 5, -29, 46}, new byte[]{-103, -102, 81, -90, 106, -31, 123, Base64.padSymbol}).equals(action) || m.h(new byte[]{-76, -10, 49, 110, -60, 88, -125, 94, -68, -10, 33, 121, -59, 69, -55, 17, -74, -20, 60, 115, -59, 31, -86, 53, -111, -47, 20, 67, -18, 123, -94, 51, -127}, new byte[]{-43, -104, 85, 28, -85, 49, -25, 112}).equals(action) || m.h(new byte[]{-122, -60, -56, -61, -113, 91, -107, -65, -114, -60, -40, -44, -114, 70, -33, -16, -124, -34, -59, -34, -114, 28, -68, -44, -93, -29, -19, -18, -78, 119, -68, -34, -79, -17, -24}, new byte[]{-25, -86, -84, -79, -32, 50, -15, -111}).equals(action) || m.h(new byte[]{80, 104, 71, -88, -38, -20, -62, -32, 88, 104, 87, -65, -37, -15, -120, -81, 82, 114, 74, -75, -37, -85, -21, -117, 117, 79, 98, -123, -9, -60, -30, -111, 99, 67, 110, -107, -29, -60, -22}, new byte[]{49, 6, 35, -38, -75, -123, -90, -50}).equals(action)) && file3 != null) {
                String absolutePath = file3.getAbsolutePath();
                String name = file3.getName();
                for (int size2 = t.size() - 1; size2 >= 0; size2--) {
                    i iVar2 = (i) t.get(size2);
                    if (iVar2 != null && (file = iVar2.f2611a) != null && (file.getAbsolutePath().equals(absolutePath) || (name != null && name.length() > 0 && name.equals(file.getName())))) {
                        t.remove(size2);
                    }
                }
            }
            Collections.sort(t, new androidx.constraintlayout.core.utils.a(5));
            q(applicationContext, t);
            if (i(action) || m.h(new byte[]{-98, -78, 32, -18, -107, 84, -59, -34, -106, -78, 48, -7, -108, 73, -113, -111, -100, -88, 45, -13, -108, 19, -29, -65, -80, -120, 27, -33, -75, 112, -15, -68, -70, -120, 1, -40}, new byte[]{-1, -36, 68, -100, -6, Base64.padSymbol, -95, -16}).equals(action) || m.h(new byte[]{-101, -116, -116, -85, 115, -121, -62, 18, -109, -116, -100, -68, 114, -102, -120, 93, -103, -106, -127, -74, 114, -64, -21, 121, -66, -85, -87, -122, 95, -90, -29, ByteCompanionObject.MAX_VALUE, -79, -85, -90, -98}, new byte[]{-6, -30, -24, -39, 28, -18, -90, 60}).equals(action) || m.h(new byte[]{114, -75, -54, -61, -73, -23, -19, 5, 122, -75, -38, -44, -74, -12, -89, 74, 112, -81, -57, -34, -74, -82, -60, 110, 87, -110, -17, -18, -107, -49, -36, 101, 71, -98, -22}, new byte[]{19, -37, -82, -79, -40, ByteCompanionObject.MIN_VALUE, -119, 43}).equals(action)) {
                Context applicationContext2 = applicationContext.getApplicationContext();
                for (long j10 : f2617n) {
                    this.f2620b.postDelayed(new n(this, action, applicationContext2, 6), j10);
                }
            }
        }
    }

    public final void o(Context context) {
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        r(applicationContext, u(applicationContext));
        q(applicationContext, t(applicationContext));
    }

    public final void p(Context context) {
        if (!this.f2623h) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(m.h(new byte[]{20, -27, -90, -1, -34, -40, 21, 91, 28, -27, -74, -24, -33, -59, 95, 20, 22, -1, -85, -30, -33, -97, 60, 48, 49, -62, -125, -46, -14, -7, 52, 54, 62, -62, -116, -54}, new byte[]{117, -117, -62, -115, -79, -79, 113, 117}));
            intentFilter.addAction(m.h(new byte[]{-78, 19, 124, 49, 24, 118, 60, -16, -70, 19, 108, 38, 25, 107, 118, -65, -80, 9, 113, 44, 25, 49, 21, -101, -105, 52, 89, 28, 58, 80, 13, -112, -121, 56, 92}, new byte[]{-45, 125, 24, 67, 119, 31, 88, -34}));
            intentFilter.addAction(m.h(new byte[]{102, -57, 15, 41, -62, 44, -64, 46, 110, -57, 31, 62, -61, 49, -118, 97, 100, -35, 2, 52, -61, 107, -23, 69, 67, -32, 42, 4, -8, 11, -23, 79, 82, -25, 63, 30, -23}, new byte[]{7, -87, 107, 91, -83, 69, -92, 0}));
            intentFilter.addAction(m.h(new byte[]{-48, -9, -108, 72, -28, 122, 51, -106, -40, -9, -124, 95, -27, 103, 121, -39, -46, -19, -103, 85, -27, Base64.padSymbol, 26, -3, -11, -48, -79, 101, -50, 89, 18, -5, -27}, new byte[]{-79, -103, -16, 58, -117, 19, 87, -72}));
            intentFilter.addAction(m.h(new byte[]{-32, -20, -87, -112, 84, 20, 58, -12, -24, -20, -71, -121, 85, 9, 112, -69, -30, -10, -92, -115, 85, 83, 19, -97, -59, -53, -116, -67, 105, 56, 19, -107, -41, -57, -119}, new byte[]{-127, -126, -51, -30, 59, 125, 94, -38}));
            intentFilter.addAction(m.h(new byte[]{-55, 74, -72, -13, 71, 99, -114, 123, -63, 74, -88, -28, 70, 126, -60, 52, -53, 80, -75, -18, 70, 36, -89, 16, -20, 109, -99, -34, 106, 75, -82, 10, -6, 97, -111, -50, 126, 75, -90}, new byte[]{-88, 36, -36, -127, 40, 10, -22, 85}));
            intentFilter.addDataScheme(m.h(new byte[]{-78, 76, 18, -72}, new byte[]{-44, 37, 126, -35, -122, 22, -94, -34}));
            int i10 = Build.VERSION.SDK_INT;
            h hVar = this.e;
            if (i10 >= 33) {
                context.registerReceiver(hVar, intentFilter, 2);
            } else {
                context.registerReceiver(hVar, intentFilter);
            }
            this.f2623h = true;
        }
        if (!this.f2624i) {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction(m.h(new byte[]{110, 26, 39, 17, 122, -70, 38, 28, 103, 21, 49, 7, 98, -78, 48, 87, 33, 1, 48, 1, 59, -78, 33, 70, 102, 27, 45, 77, 64, ByteCompanionObject.MIN_VALUE, 0, 109, 75, 49, 21, 42, 86, -106, 29, 115, 91, 32, 2, 32, 93, -106, 6}, new byte[]{15, 116, 67, 99, 21, -45, 66, 50}));
            intentFilter2.addAction(m.h(new byte[]{-77, 50, -27, 82, 125, 106, -29, -59, -70, Base64.padSymbol, -13, 68, 101, 98, -11, -114, -4, 41, -14, 66, 60, 98, -28, -97, -69, 51, -17, 14, 71, 80, -59, -76, -106, 25, -41, 105, 81, 70, -40, -81, -105, 8, -64, 99, 90, 70, -61}, new byte[]{-46, 92, -127, 32, 18, 3, -121, -21}));
            intentFilter2.addAction(m.h(new byte[]{7, -1, 71, 77, 64, 5, -68, -74, 14, -16, 81, 91, 88, 13, -86, -3, 72, -28, 80, 93, 1, 13, -69, -20, 15, -2, 77, 17, 122, 63, -102, -57, 39, -46, 96, 122, 124, 63, -105, -54, 63, -50, 98, 107, 123, 45, -101, -48, 35, -43}, new byte[]{102, -111, 35, 63, 47, 108, -40, -104}));
            intentFilter2.addAction(m.h(new byte[]{52, 48, 9, -99, -98, 86, -9, 84, Base64.padSymbol, 63, 31, -117, -122, 94, -31, 31, 123, 43, 30, -115, -33, 94, -16, 14, 60, 49, 3, -63, -92, 108, -47, 37, 20, 29, 46, -86, -94, 108, -36, 40, 12, 1, 41, -86, -91, 126, -48, 50, 16, 26}, new byte[]{85, 94, 109, -17, -15, 63, -109, 122}));
            int i11 = Build.VERSION.SDK_INT;
            h hVar2 = this.f2621f;
            if (i11 >= 33) {
                context.registerReceiver(hVar2, intentFilter2, 2);
            } else {
                context.registerReceiver(hVar2, intentFilter2);
            }
            this.f2624i = true;
        }
    }

    public final void q(Context context, ArrayList arrayList) {
        File file;
        synchronized (this.f2619a) {
            this.f2622g = context;
            this.c.clear();
            this.c.addAll(arrayList);
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i iVar = (i) obj;
            if (iVar != null && (file = iVar.f2611a) != null) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(file.getAbsolutePath());
            }
        }
        h0.b.o().saveString(f2615l, sb.toString());
    }

    public final void r(Context context, ArrayList arrayList) {
        synchronized (this.f2619a) {
            this.f2622g = context;
            this.d.clear();
            this.d.addAll(arrayList);
        }
        if (context != null) {
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                j jVar = (j) obj;
                if (jVar != null) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(jVar.f2612a);
                    sb.append('|');
                    String str = jVar.f2613b;
                    if (str == null) {
                        str = "";
                    }
                    sb.append(str);
                    sb.append('|');
                    sb.append(jVar.c);
                    sb.append('|');
                    sb.append(jVar.d);
                    sb.append('|');
                    sb.append(jVar.e);
                }
            }
            h0.b.o().saveString(f2616m, sb.toString());
        }
    }

    public final void v(Context context) {
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        synchronized (this.f2619a) {
            try {
                this.f2622g = applicationContext;
                this.f2625j++;
                if (this.f2623h) {
                    if (!this.f2624i) {
                    }
                }
                p(applicationContext);
            } catch (Throwable th) {
                throw th;
            }
        }
        o(applicationContext);
    }

    public final void w() {
        Context context;
        synchronized (this.f2619a) {
            try {
                int i10 = this.f2625j;
                if (i10 > 0) {
                    this.f2625j = i10 - 1;
                }
                if (this.f2625j == 0 && (context = this.f2622g) != null) {
                    if (this.f2623h) {
                        try {
                            context.unregisterReceiver(this.e);
                        } catch (IllegalArgumentException unused) {
                        }
                        this.f2623h = false;
                    }
                    if (this.f2624i) {
                        try {
                            this.f2622g.unregisterReceiver(this.f2621f);
                        } catch (IllegalArgumentException unused2) {
                        }
                        this.f2624i = false;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
