package com.bumptech.glide;

import ai.onnxruntime.OrtLoggingLevel;
import android.animation.TimeInterpolator;
import android.app.AppOpsManager;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.PathParser;
import com.example.navistart.cores.InterC;
import com.google.protobuf.q;
import e0.g0;
import i9.d1;
import i9.k1;
import i9.l1;
import i9.r1;
import i9.t0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import m0.b3;
import org.json.JSONObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: b, reason: collision with root package name */
    public static Context f616b;
    public static InterC c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f617a = 4;

    public static String b(int i10) {
        return g0.b(f616b).getString(i10);
    }

    public static b3 c(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return new b3(jSONObject.getString(e0.m.h(new byte[]{21, -78, -126, 50, -111, -42, -98}, new byte[]{102, -41, -16, 68, -8, -75, -5, -84})), jSONObject.optBoolean(e0.m.h(new byte[]{21, 14, 43, 34, 56, -72}, new byte[]{116, 109, 95, 75, 78, -35, 4, 114}), false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:331:0x063d, code lost:
    
        if (r8 != false) goto L317;
     */
    /* JADX WARN: Removed duplicated region for block: B:181:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x06c2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static f6.b d(int r30, int r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 2063
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.d(int, int, java.lang.String):f6.b");
    }

    public static String e(String str, boolean z9) {
        return new JSONObject().put(e0.m.h(new byte[]{123, -36, -87, -56, 62, 42, 84}, new byte[]{8, -71, -37, -66, 87, 73, 49, -10}), str).put(e0.m.h(new byte[]{-123, 38, -33, -6, 7, -85}, new byte[]{-28, 69, -85, -109, 113, -50, 103, 83}), z9).toString();
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static String g(long j10) {
        if (j10 <= 0) {
            return e0.m.h(new byte[]{-110, -121, -90}, new byte[]{-94, -89, -28, 74, 51, 110, 112, -55});
        }
        String[] strArr = {e0.m.h(new byte[]{-45}, new byte[]{-111, -72, 41, -56, -46, -19, -2, 43}), e0.m.h(new byte[]{16, -76}, new byte[]{91, -10, 89, 37, -54, -33, 121, -48}), e0.m.h(new byte[]{57, 117}, new byte[]{116, 55, 38, -37, -16, -30, 75, -42}), e0.m.h(new byte[]{26, -50}, new byte[]{93, -116, -36, 8, -55, 56, 67, 28}), e0.m.h(new byte[]{-54, 71}, new byte[]{-98, 5, 37, 91, -123, -31, 52, 59})};
        double d = j10;
        int log10 = (int) (Math.log10(d) / Math.log10(1024.0d));
        return String.format(Locale.US, e0.m.h(new byte[]{-6, 99, -125, 68, ByteCompanionObject.MAX_VALUE, 77, -106}, new byte[]{-33, 77, -79, 34, 95, 104, -27, 118}), Double.valueOf(d / Math.pow(1024.0d, log10)), strArr[log10]);
    }

    public static String[] h(Class cls) {
        Object[] objArr = (Enum[]) cls.getEnumConstants();
        int i10 = 0;
        for (Object obj : objArr) {
            if (((n0.e) obj).a().booleanValue()) {
                i10++;
            }
        }
        String[] strArr = new String[i10];
        int i11 = 0;
        for (Object obj2 : objArr) {
            n0.e eVar = (n0.e) obj2;
            if (eVar.a().booleanValue()) {
                strArr[i11] = eVar.b();
                i11++;
            }
        }
        return strArr;
    }

    public static Enum i(Class cls, String str) {
        try {
            return Enum.valueOf(cls, str);
        } catch (IllegalArgumentException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String[] j(Class cls) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        int i10 = 0;
        for (Object[] objArr : enumArr) {
            if (((n0.e) objArr).a().booleanValue()) {
                i10++;
            }
        }
        String[] strArr = new String[i10];
        int i11 = 0;
        for (OrtLoggingLevel ortLoggingLevel : enumArr) {
            if (((n0.e) ortLoggingLevel).a().booleanValue()) {
                strArr[i11] = ortLoggingLevel.name();
                i11++;
            }
        }
        return strArr;
    }

    public static float k(String[] strArr, int i10) {
        float parseFloat = Float.parseFloat(strArr[i10]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static String l(Context context, d1.a aVar, String str, m0.b bVar, m0.c cVar) {
        String[] strArr = context.getPackageManager().getPackageInfo(str, 4096).requestedPermissions;
        String p9 = p(str);
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            Iterator it = new LinkedHashSet(Arrays.asList(strArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2 != null) {
                    arrayList.add(e0.m.h(new byte[]{-44, 60, -85, 97, -31, -22, -7, -91, -124, 124, -90, 115, -32, -18, -27, -15, -57, 36, -7, 116, -10, -27, -29, -15}, new byte[]{-92, 81, -117, 6, -109, -117, -105, -47}) + p9 + " " + p(str2));
                    String permissionToOp = AppOpsManager.permissionToOp(str2);
                    if (permissionToOp == null) {
                        if (str2.startsWith(e0.m.h(new byte[]{11, 120, 30, -25, 29, -97, ByteCompanionObject.MAX_VALUE, 116, 26, 115, 8, -8, 27, -123, 104, 51, 5, 120, 84}, new byte[]{106, 22, 122, -107, 114, -10, 27, 90}))) {
                            str2 = str2.substring(e0.m.h(new byte[]{-55, 43, 31, 109, -12, 12, 93, 94, -40, 32, 9, 114, -14, 22, 74, 25, -57, 43, 85}, new byte[]{-88, 69, 123, 31, -101, 101, 57, 112}).length());
                        }
                        permissionToOp = str2;
                    }
                    arrayList.add(e0.m.h(new byte[]{-70, -110, -52, 33, 101, 19, 10, -76, -66, -106, -100, 99, 56, 21, 89, -94, -87, -62, -33, 59, 103, 18, 79, -87, -81, -62}, new byte[]{-37, -30, -68, 78, 21, 96, 42, -57}) + p9 + " " + p(permissionToOp) + e0.m.h(new byte[]{-117, 62, 36, -55, -4, -38}, new byte[]{-85, 95, 72, -91, -109, -83, -60, -92}));
                }
            }
        }
        arrayList.add(e0.m.h(new byte[]{14, 126, 32, 90, -102, 89, -2, 125, 14, 118, 45, 30, -110, 89, -88, 99, 5, 122, 48, 31, -110, 85, -5, 96, 77}, new byte[]{109, 19, 68, 122, -2, 60, -120, 20}).concat(p(e0.m.h(new byte[]{-64}, new byte[]{-21, 100, 89, -71, 88, -39, -87, -47}).concat(str))));
        arrayList.add(e0.m.h(new byte[]{7, 8, -26, 10, 83, 74, 78, 59, 7, 24, -3, 19, 67, 86, 84, ByteCompanionObject.MAX_VALUE, 15, 24, -85, 13, 72, 90, 73, 126, 15, 20, -8, 14, 0}, new byte[]{99, 125, -117, 122, 32, 51, Base64.padSymbol, 27}).concat(p(e0.m.h(new byte[]{-114}, new byte[]{-91, -80, -32, 29, 105, 23, 56, -8}).concat(str))));
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            String str3 = (String) obj;
            if (bVar.getAsBoolean()) {
                try {
                    String y9 = aVar.y(str3 + e0.m.h(new byte[]{-122, 74, -53, -119, 21, -85, -95, 51, -44, 17, -101, -37, 66, -80, -90, 31, -56, 29, -115, -58, 80, -83, -92, 48, -6, 22, -46, -113, 6, -76, -66, 97}, new byte[]{-90, 120, -11, -81, 36, -112, -127, 67}));
                    sb.append(str3);
                    sb.append('\n');
                    sb.append(y9);
                    sb.append('\n');
                    i10++;
                    cVar.accept(Integer.valueOf(i10), Integer.valueOf(arrayList.size()));
                } catch (Exception e) {
                    StringBuilder sb2 = new StringBuilder();
                    q.t(new byte[]{-124, 126, 70, 95, -122, -50, 105, 104, -93, 49}, new byte[]{-57, 17, 43, 47, -22, -85, 29, 13}, sb2, i10);
                    sb2.append(e0.m.h(new byte[]{122}, new byte[]{85, -42, -4, -86, -49, -64, -51, 53}));
                    sb2.append(arrayList.size());
                    sb2.append("\n");
                    sb2.append(str3);
                    sb2.append("\n");
                    sb2.append(e.getMessage());
                    throw new IOException(sb2.toString(), e);
                }
            } else {
                throw new CancellationException();
            }
        }
        return sb.toString();
    }

    public static boolean m(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    public static d1.a n(Context context) {
        return new d1.a(context, e0.m.h(new byte[]{4, 64, -71, 56, -73, -4, -100, 74, 4}, new byte[]{53, 114, -114, 22, -121, -46, -84, 100}));
    }

    public static final e9.b o(KClass kClass, ArrayList arrayList, Function0 function0) {
        boolean areEqual;
        boolean areEqual2;
        boolean areEqual3;
        boolean areEqual4;
        boolean areEqual5;
        boolean areEqual6;
        boolean areEqual7;
        e9.b bVar;
        e9.b l1Var;
        kClass.getClass();
        arrayList.getClass();
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Collection.class))) {
            areEqual = true;
        } else {
            areEqual = Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class));
        }
        if (areEqual) {
            areEqual2 = true;
        } else {
            areEqual2 = Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class));
        }
        if (areEqual2) {
            areEqual3 = true;
        } else {
            areEqual3 = Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(ArrayList.class));
        }
        if (areEqual3) {
            bVar = new i9.d((e9.b) arrayList.get(0), 0);
        } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashSet.class))) {
            bVar = new i9.d((e9.b) arrayList.get(0), 1);
        } else {
            if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class))) {
                areEqual4 = true;
            } else {
                areEqual4 = Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class));
            }
            if (areEqual4) {
                areEqual5 = true;
            } else {
                areEqual5 = Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashSet.class));
            }
            if (areEqual5) {
                bVar = new i9.d((e9.b) arrayList.get(0), 2);
            } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashMap.class))) {
                bVar = new i9.g0((e9.b) arrayList.get(0), (e9.b) arrayList.get(1), 0);
            } else {
                if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class))) {
                    areEqual6 = true;
                } else {
                    areEqual6 = Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class));
                }
                if (areEqual6) {
                    areEqual7 = true;
                } else {
                    areEqual7 = Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashMap.class));
                }
                if (areEqual7) {
                    bVar = new i9.g0((e9.b) arrayList.get(0), (e9.b) arrayList.get(1), 1);
                } else {
                    if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.Entry.class))) {
                        e9.b bVar2 = (e9.b) arrayList.get(0);
                        e9.b bVar3 = (e9.b) arrayList.get(1);
                        bVar2.getClass();
                        bVar3.getClass();
                        l1Var = new t0(bVar2, bVar3, 0);
                    } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Pair.class))) {
                        e9.b bVar4 = (e9.b) arrayList.get(0);
                        e9.b bVar5 = (e9.b) arrayList.get(1);
                        bVar4.getClass();
                        bVar5.getClass();
                        l1Var = new t0(bVar4, bVar5, 1);
                    } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Triple.class))) {
                        e9.b bVar6 = (e9.b) arrayList.get(0);
                        e9.b bVar7 = (e9.b) arrayList.get(1);
                        e9.b bVar8 = (e9.b) arrayList.get(2);
                        bVar6.getClass();
                        bVar7.getClass();
                        bVar8.getClass();
                        bVar = new r1(bVar6, bVar7, bVar8);
                    } else if (JvmClassMappingKt.getJavaClass(kClass).isArray()) {
                        Object invoke = function0.invoke();
                        invoke.getClass();
                        e9.b bVar9 = (e9.b) arrayList.get(0);
                        bVar9.getClass();
                        l1Var = new l1((KClass) invoke, bVar9);
                    } else {
                        bVar = null;
                    }
                    bVar = l1Var;
                }
            }
        }
        if (bVar == null) {
            e9.b[] bVarArr = (e9.b[]) arrayList.toArray(new e9.b[0]);
            return d1.d(kClass, (e9.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        }
        return bVar;
    }

    public static String p(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(e0.m.h(new byte[]{78}, new byte[]{105, 20, 19, -8, 72, 60, -112, -102}));
        sb.append(str.replace(e0.m.h(new byte[]{55}, new byte[]{16, -119, 33, -40, 16, 106, 0, -84}), e0.m.h(new byte[]{-25, -105, -19, 101}, new byte[]{-64, -53, -54, 66, -3, 85, -42, -47})));
        return q.i(new byte[]{-12}, new byte[]{-45, -13, 52, 96, 83, 70, 21, 115}, sb);
    }

    public static int q(Context context, int i10, int i11) {
        TypedValue a10 = w3.b.a(i10, context);
        if (a10 != null && a10.type == 16) {
            return a10.data;
        }
        return i11;
    }

    public static TimeInterpolator r(Context context, int i10, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!m(valueOf, "cubic-bezier") && !m(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (m(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return new PathInterpolator(k(split, 0), k(split, 1), k(split, 2), k(split, 3));
                }
                androidx.navigation.b.b(split.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                return null;
            }
            if (m(valueOf, "path")) {
                return new PathInterpolator(PathParser.createPathFromPathData(valueOf.substring(5, valueOf.length() - 1)));
            }
            j1.i.k("Invalid motion easing type: ".concat(valueOf));
            return null;
        }
        j1.i.k("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        return null;
    }

    public static final e9.b s(KClass kClass) {
        kClass.getClass();
        e9.b t = t(kClass);
        if (t != null) {
            return t;
        }
        d1.h(kClass);
        throw null;
    }

    public static final e9.b t(KClass kClass) {
        kClass.getClass();
        e9.b d = d1.d(kClass, new e9.b[0]);
        if (d == null) {
            return (e9.b) k1.f2915a.get(kClass);
        }
        return d;
    }

    public static final ArrayList u(j9.b bVar, List list, boolean z9) {
        bVar.getClass();
        list.getClass();
        if (z9) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                KType kType = (KType) it.next();
                bVar.getClass();
                kType.getClass();
                e9.b A = o4.b.A(bVar, kType, true);
                if (A != null) {
                    arrayList.add(A);
                } else {
                    d1.h(d1.g(kType));
                    throw null;
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            KType kType2 = (KType) it2.next();
            kType2.getClass();
            e9.b A2 = o4.b.A(bVar, kType2, false);
            if (A2 == null) {
                return null;
            }
            arrayList2.add(A2);
        }
        return arrayList2;
    }

    public static void v(Throwable th) {
        if (!(th instanceof VirtualMachineError)) {
            if (!(th instanceof ThreadDeath)) {
                if (!(th instanceof LinkageError)) {
                    return;
                } else {
                    throw ((LinkageError) th);
                }
            }
            throw ((ThreadDeath) th);
        }
        throw ((VirtualMachineError) th);
    }

    public int hashCode() {
        switch (this.f617a) {
            case 4:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f617a) {
            case 4:
                String simpleName = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
                simpleName.getClass();
                return simpleName;
            default:
                return super.toString();
        }
    }
}
