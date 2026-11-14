package p0;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.example.navistart.DPups;
import com.example.navistart.MainActivity;
import com.example.navistart.ModernMainActivity;
import e0.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.o2;
import o7.i4;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e {
    public static final String c = m.h(new byte[]{68, -57, -100, -17, -93, -65, 75, 60, 66, -21, -111, -12, -104, -69, 100, 41, 95, -43, -101, -15, -103, -70}, new byte[]{49, -76, -7, -99, -4, -34, 59, 76});
    public static final String d = m.h(new byte[]{118, -67, -84, 27, 80, -34, -75, -30, 112, -111, -95, 0, 107, -38, -102, -30, 98, -83, -94, 8, 104, -38, -74}, new byte[]{3, -50, -55, 105, 15, -65, -59, -110});
    public static final String e = m.h(new byte[]{87, 126, -76, -108, -120, 8, 112, -49, 81, 82, -71, -113, -77, 12, 95, -45, 67, 120, -65, -123, -65, 12, 114, -52}, new byte[]{34, 13, -47, -26, -41, 105, 0, -65});

    /* renamed from: f, reason: collision with root package name */
    public static final String f4965f = m.h(new byte[]{54, -34, -39, -7, 72, 84, -13, 10, 48, -14, -44, -30, 115, 80, -36, 0, 44, -61, -39, -44, 111}, new byte[]{67, -83, -68, -117, 23, 53, -125, 122});

    /* renamed from: g, reason: collision with root package name */
    public static final String f4966g = m.h(new byte[]{94, 44, -55, 16, 38, 72, 101, -61, 88, 0, -60, 11, 29, 76, 74, -55, 68, 49, -55, Base64.padSymbol, 0}, new byte[]{43, 95, -84, 98, 121, 41, 21, -77});

    /* renamed from: h, reason: collision with root package name */
    public static final String f4967h = m.h(new byte[]{-121, -46, 73, -4, 108, 8, -75, -40, -127, -2, 68, -25, 87, 12, -102, -46, -99, -49, 73, -47, 71, 27, -92, -58, -127, -47, 77, -4, 86, 7, -79}, new byte[]{-14, -95, 44, -114, 51, 105, -59, -88});

    /* renamed from: a, reason: collision with root package name */
    public final Context f4968a;

    /* renamed from: b, reason: collision with root package name */
    public final b f4969b;

    public e(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f4968a = applicationContext;
        this.f4969b = new b(applicationContext);
    }

    public static boolean e() {
        return h0.b.o().loadBoolean(c, false);
    }

    public static void h(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ComponentName componentName = (ComponentName) obj;
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(componentName.flattenToString());
        }
        h0.b.o().saveString(e, sb.toString());
    }

    public static void i(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str = (String) obj;
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(str);
        }
        h0.b.o().saveString(d, sb.toString());
    }

    public final ArrayList a() {
        Context context = this.f4968a;
        PackageManager packageManager = context.getPackageManager();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ApplicationInfo applicationInfo : packageManager.getInstalledApplications(0)) {
            if (applicationInfo != null && applicationInfo.packageName != null && !context.getPackageName().equals(applicationInfo.packageName)) {
                int i10 = applicationInfo.flags;
                if ((i10 & 1) == 0 && (i10 & 128) == 0) {
                    linkedHashSet.add(applicationInfo.packageName);
                }
            }
        }
        return new ArrayList(linkedHashSet);
    }

    public final DevicePolicyManager b() {
        return (DevicePolicyManager) this.f4968a.getSystemService(m.h(new byte[]{-47, 65, ByteCompanionObject.MIN_VALUE, 21, 29, 59, 58, -4, -38, 72, -97, 31, 7}, new byte[]{-75, 36, -10, 124, 126, 94, 101, -116}));
    }

    public final boolean c() {
        DevicePolicyManager b10 = b();
        if (b10 == null) {
            return false;
        }
        try {
            return b10.isDeviceOwnerApp(this.f4968a.getPackageName());
        } catch (Exception unused) {
            return false;
        }
    }

    public final i4 d(o2 o2Var) {
        ArrayList arrayList;
        i4 i4Var;
        boolean c10 = c();
        if (c10) {
            arrayList = a();
        } else {
            arrayList = new ArrayList();
        }
        ArrayList c11 = this.f4969b.c(true);
        c cVar = new c(o2Var, c11.size() + arrayList.size());
        if (c10) {
            i4Var = k(arrayList, true, cVar);
        } else {
            i4Var = new i4(true, 0, 0, null);
        }
        i4 j10 = j(c11, false, cVar);
        i4 a10 = i4.a(i4Var, j10);
        if (j10.f4554b > 0 || c11.isEmpty()) {
            i(arrayList);
            h(c11);
            h0.b.o().saveBoolean(c, true);
            h0.b.o().saveBoolean(f4967h, true);
        }
        cVar.c = cVar.f4964b;
        cVar.b();
        return a10;
    }

    public final i4 f(d dVar) {
        synchronized (b.c) {
            try {
                if (b.f(this.f4968a)) {
                    return new i4(false, 0, 1, m.h(new byte[]{-83, -8, 25, 116, -108, 63, 30, 123, -63, -21, 9, 105, -110, 35, 91, 96, -113, -71, 28, 104, -104, 48, 9, 108, -110, -22}, new byte[]{-31, -103, 108, 26, -9, 87, 123, 9}));
                }
                return g(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final i4 g(d dVar) {
        i4 i4Var;
        String loadString = h0.b.o().loadString(d, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Context context = this.f4968a;
        if (loadString != null && !loadString.trim().isEmpty()) {
            for (String str : loadString.split("\n")) {
                String trim = str.trim();
                if (!trim.isEmpty() && !context.getPackageName().equals(trim)) {
                    linkedHashSet.add(trim);
                }
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashSet);
        String loadString2 = h0.b.o().loadString(e, "");
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        if (loadString2 != null && !loadString2.trim().isEmpty()) {
            for (String str2 : loadString2.split("\n")) {
                ComponentName unflattenFromString = ComponentName.unflattenFromString(str2.trim());
                if (unflattenFromString != null && context.getPackageName().equals(unflattenFromString.getPackageName())) {
                    linkedHashSet2.add(unflattenFromString);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(linkedHashSet2);
        b bVar = this.f4969b;
        bVar.getClass();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = bVar.f4962b.iterator();
        while (it.hasNext()) {
            arrayList3.add(((a) it.next()).f4954b);
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new ComponentName(context, (Class<?>) MainActivity.class));
        arrayList4.add(new ComponentName(context, (Class<?>) ModernMainActivity.class));
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ComponentName componentName = (ComponentName) obj;
            if (!arrayList3.contains(componentName) && !arrayList4.contains(componentName)) {
                arrayList4.add(componentName);
            }
        }
        c cVar = new c(dVar, arrayList3.size() + arrayList4.size() + arrayList.size());
        if (c() && !arrayList.isEmpty()) {
            i4Var = k(arrayList, false, cVar);
        } else {
            i4Var = new i4(true, 0, 0, null);
        }
        i4 a10 = i4.a(i4.a(j(arrayList4, true, cVar), j(bVar.c(true), true, cVar)), j(bVar.c(false), false, cVar));
        i4 a11 = i4.a(i4Var, a10);
        if (a10.f4554b > 0 || a10.c == 0) {
            i(new ArrayList());
            h(new ArrayList());
            h0.b.o().saveBoolean(c, false);
            h0.b.o().saveBoolean(f4967h, false);
        }
        cVar.c = cVar.f4964b;
        cVar.b();
        return a11;
    }

    public final i4 j(ArrayList arrayList, boolean z9, c cVar) {
        int i10;
        PackageManager packageManager = this.f4968a.getPackageManager();
        boolean z10 = true;
        if (z9) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        int size = arrayList.size();
        String str = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            try {
                packageManager.setComponentEnabledSetting((ComponentName) obj, i10, 1);
                i12++;
            } catch (Exception e6) {
                i11++;
                if (str == null) {
                    str = e6.getClass().getSimpleName() + m.h(new byte[]{-117, 2}, new byte[]{-79, 34, -113, -1, 38, -62, -101, -48}) + e6.getMessage();
                }
            }
            cVar.c = Math.min(cVar.f4964b, cVar.c + 1);
            cVar.b();
        }
        if (i11 != 0) {
            z10 = false;
        }
        return new i4(z10, i12, i11, str);
    }

    public final i4 k(ArrayList arrayList, boolean z9, c cVar) {
        boolean z10;
        Boolean bool;
        DevicePolicyManager b10 = b();
        ComponentName componentName = new ComponentName(this.f4968a, (Class<?>) DPups.class);
        boolean z11 = false;
        if (b10 == null) {
            return new i4(arrayList.isEmpty(), 0, arrayList.size(), m.h(new byte[]{-68, 21, 62, -71, -78, 121, 39, 104, -108, 25, 43, -87, -100, 125, 25, 102, -97, 21, 58, -16, -72, 111, 87, 105, -115, 28, 36}, new byte[]{-8, 112, 72, -48, -47, 28, 119, 7}));
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        String str = null;
        while (i10 < size) {
            int i13 = i10 + 1;
            String str2 = (String) arrayList.get(i10);
            try {
                boolean applicationHidden = b10.setApplicationHidden(componentName, str2, z9);
                try {
                    bool = Boolean.valueOf(b10.isApplicationHidden(componentName, str2));
                } catch (Exception unused) {
                    bool = null;
                }
                if (bool != null) {
                    if (bool.booleanValue() == z9) {
                        applicationHidden = true;
                    } else {
                        applicationHidden = z11;
                    }
                }
                if (applicationHidden) {
                    i12++;
                } else {
                    i11++;
                    if (str == null) {
                        str = str2 + m.h(new byte[]{12, -20, -8, -92, 109, -2, -37, 34, 70, -96, -1, -82, 125}, new byte[]{54, -52, -106, -53, 25, -34, -70, 82});
                    }
                }
            } catch (Exception e6) {
                i11++;
                if (str == null) {
                    StringBuilder u8 = ai.onnxruntime.a.u(str2);
                    u8.append(m.h(new byte[]{110, 107}, new byte[]{84, 75, -107, 44, -113, -71, 0, 115}));
                    u8.append(e6.getClass().getSimpleName());
                    u8.append(m.h(new byte[]{-125, 85}, new byte[]{-71, 117, -40, 26, -52, 17, 84, 98}));
                    u8.append(e6.getMessage());
                    str = u8.toString();
                }
            }
            cVar.c = Math.min(cVar.f4964b, cVar.c + 1);
            cVar.b();
            i10 = i13;
            z11 = false;
        }
        if (i11 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new i4(z10, i12, i11, str);
    }
}
