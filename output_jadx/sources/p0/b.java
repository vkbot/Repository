package p0;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.example.navistart.HideManager.LauncherShortcutRestoreReceiver;
import com.example.navistart.R;
import e0.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.b3;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static androidx.profileinstaller.c f4955f;

    /* renamed from: g, reason: collision with root package name */
    public static androidx.transition.a f4956g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4961a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4962b;
    public static final String d = m.h(new byte[]{-19, 17, -11, -68, 119, -17, -71, -40, -34, 25, -29, -67, 122, -40, -82, -49, -14, 21, -12}, new byte[]{-127, 112, ByteCompanionObject.MIN_VALUE, -46, 20, -121, -36, -86});

    /* renamed from: h, reason: collision with root package name */
    public static final String f4957h = m.h(new byte[]{-7, 125, -70, 13, 57, 54, 53, -49, -54, 111, -89, 12, 40, 42, 51, -56, -31, 67, -86, 13, 59, 60, 60, -40, -15, 67}, new byte[]{-107, 28, -49, 99, 90, 94, 80, -67});

    /* renamed from: i, reason: collision with root package name */
    public static final String f4958i = m.h(new byte[]{-27, 35, -124, -78, -65, 42, 83, -55, -23, 37, -115, -78, -78, 37, 66, -43, -27, 36, -116, -18, -19, 106, 71, -34, -12, 33, ByteCompanionObject.MIN_VALUE, -17, -83, 45, 88, -43, -88, 30, -84, -35, -102, 27, 100, -2, -46, 24, -96, -46, -103, 23}, new byte[]{-122, 76, -23, -100, -34, 68, 55, -69});

    /* renamed from: j, reason: collision with root package name */
    public static final String f4959j = m.h(new byte[]{-34, -26, 22, 113, -37, -87, 124, 85, -46, -32, 31, 113, -42, -90, 109, 73, -34, -31, 30, 45, -119, -23, 104, 66, -49, -28, 18, 44, -55, -82, 119, 73, -109, -34, 41, 22, -18, -126, 71, 116, -8, -35, 47, 22, -12, ByteCompanionObject.MIN_VALUE, 75}, new byte[]{-67, -119, 123, 95, -70, -57, 24, 39});
    public static final Object c = new Object();
    public static final Handler e = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    public static final Uri f4960k = Uri.parse(m.h(new byte[]{8, -117, 81, 56, -57, 122, 69, 63, 68, -53, 92, 35, -49, 58, 80, 107, 15, -106, 80, 37, -58, 58, 93, 100, 30, -118, 92, 36, -57, 102, 2, 43, 24, -127, 75, 56, -53, 122, 86, 118, 68, -126, 94, 58, -51, 102, 88, 113, 14, -105}, new byte[]{107, -28, 63, 76, -94, 20, 49, 5}));

    public b(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f4961a = applicationContext;
        String packageName = applicationContext.getPackageName();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(m.h(new byte[]{-116, -18, -89, 117}, new byte[]{-31, -113, -50, 27, -71, 63, -28, 95}), b(packageName, m.h(new byte[]{-58, -100, 6, -43, -110, 85, 81, 113, -102, -99, 6, -55, -110, 119, 90, 96, -127, -90, 14, -44, -123}, new byte[]{-24, -48, 103, -96, -4, 54, 57, 20})), R.string.launcher_shortcut_main, true, true));
        arrayList.add(new a(m.h(new byte[]{81, 39, 55, -24}, new byte[]{38, 78, 81, -127, -75, -75, -109, -80}), b(packageName, m.h(new byte[]{93, -3, 101, 72, -126, -91, 114, -119, 1, -26, 109, 91, -123, -121, 121, -104, 26, -57, 109, 73, -107}, new byte[]{115, -79, 4, Base64.padSymbol, -20, -58, 26, -20})), R.string.launcher_shortcut_wifi, true, false));
        arrayList.add(new a(m.h(new byte[]{13, -105, 94, 125, -116, 60}, new byte[]{120, -25, 58, 28, -8, 89, 21, Base64.padSymbol}), b(packageName, m.h(new byte[]{97, -92, 121, -11, 83, -50, 0, 125, Base64.padSymbol, -67, 104, -28, 92, -39, 13, 89, 44, -100, 113, -10, 84, -39, 17}, new byte[]{79, -24, 24, ByteCompanionObject.MIN_VALUE, Base64.padSymbol, -83, 104, 24})), R.string.launcher_shortcut_update, true, false));
        arrayList.add(new a(m.h(new byte[]{-27, 27, 65, 75}, new byte[]{-125, 114, 45, 46, 58, -117, 36, -22}), b(packageName, m.h(new byte[]{-76, 64, 113, 20, 109, 119, -109, 105, -24, 74, 121, 13, 102, 85, -104, 120, -13, 122, 121, 21, 122}, new byte[]{-102, 12, 16, 97, 3, 20, -5, 12})), R.string.launcher_shortcut_file, false, false));
        arrayList.add(new a(m.h(new byte[]{92, 109, -21, -40, 70}, new byte[]{47, 25, -124, -86, 35, 10, 50, 114}), b(packageName, m.h(new byte[]{35, -7, 114, -38, -126, 27, -59, -83, ByteCompanionObject.MAX_VALUE, -26, 103, -64, -98, 29, -20, -85, 121, -36, 101, -58, -104, 1}, new byte[]{13, -75, 19, -81, -20, 120, -83, -56})), R.string.launcher_shortcut_store, false, false));
        arrayList.add(new a(m.h(new byte[]{-127, -27, -79, -107, -48}, new byte[]{-9, -116, -43, -16, -65, ByteCompanionObject.MAX_VALUE, -127, -103}), b(packageName, m.h(new byte[]{-55, 120, -16, -96, -60, 72, -49, -43, -107, 98, -8, -79, -49, 68, -26, -45, -109, 93, -25, -68, -34, 82}, new byte[]{-25, 52, -111, -43, -86, 43, -89, -80})), R.string.video_library, false, false));
        arrayList.add(new a(m.h(new byte[]{-42, 21, 30, 110, -105}, new byte[]{-92, 116, 122, 15, -27, -47, 10, -125}), b(packageName, m.h(new byte[]{-31, 33, 48, -18, 74, -79, 64, -88, -67, 63, 48, -1, 69, -96, 105, -82, -69, 4, 39, -14, 80, -85}, new byte[]{-49, 109, 81, -101, 36, -46, 40, -51})), R.string.launcher_shortcut_radar, false, false));
        this.f4962b = Collections.unmodifiableList(arrayList);
    }

    public static ComponentName b(String str, String str2) {
        return new ComponentName(str, ai.onnxruntime.a.C(str, str2));
    }

    public static void d(Context context, String str) {
        b3 a10;
        ComponentName unflattenFromString;
        int i10;
        SharedPreferences sharedPreferences = context.getSharedPreferences(d, 0);
        String h2 = m.h(new byte[]{-77, -52, -69}, new byte[]{-46, -96, -41, 62, -21, 98, 27, 14});
        Set<String> set = Collections.EMPTY_SET;
        Set<String> stringSet = sharedPreferences.getStringSet(h2, set);
        Set<String> stringSet2 = sharedPreferences.getStringSet(m.h(new byte[]{-50, 18, -120, -13, 8, -92, -115}, new byte[]{-85, 124, -23, -111, 100, -63, -23, -103}), set);
        boolean z9 = true;
        for (String str2 : stringSet) {
            try {
                unflattenFromString = ComponentName.unflattenFromString(str2);
            } catch (RuntimeException e6) {
                if (str == null) {
                    str = e6.getClass().getSimpleName();
                }
                z9 = false;
            }
            if (unflattenFromString != null && context.getPackageName().equals(unflattenFromString.getPackageName())) {
                if (stringSet2.contains(str2)) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                PackageManager packageManager = context.getPackageManager();
                if (packageManager.getComponentEnabledSetting(unflattenFromString) != i10) {
                    packageManager.setComponentEnabledSetting(unflattenFromString, i10, 1);
                }
            } else {
                throw new IllegalStateException(m.h(new byte[]{-32, -35, 51, 4, 44, -34, 78, -100, -5, -42, 38, 10, 54, -46, 88, -59, -87, -48, 42, 8, 48, -40, 68, -39, -25, -57}, new byte[]{-119, -77, 69, 101, 64, -73, 42, -68}));
                break;
            }
        }
        if (z9 && !sharedPreferences.edit().clear().commit()) {
            str = m.h(new byte[]{83, -99, -58, 79, -122, 101, -46, -75, 92, -103, -55, 83, -55, 99, -105, -75, 95, -118, -51, 83, -112, 49, -127, -94, 81, -120, -51}, new byte[]{48, -4, -88, 33, -23, 17, -14, -42});
        }
        androidx.profileinstaller.c cVar = f4955f;
        if (cVar != null) {
            e.removeCallbacks(cVar);
        }
        f4955f = null;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(m.h(new byte[]{106, -113, 67, 36, 35}, new byte[]{11, -29, 34, 86, 78, -102, 91, -68}));
        if (alarmManager != null) {
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) LauncherShortcutRestoreReceiver.class), 201326592));
        }
        androidx.transition.a aVar = f4956g;
        f4956g = null;
        if (aVar != null) {
            if (str == null) {
                a10 = new b3(false, (String) null);
            } else {
                a10 = b3.a(str);
            }
            aVar.c(a10);
        }
    }

    public static boolean e(a aVar) {
        if (aVar.e) {
            return true;
        }
        return h0.b.o().loadBoolean(f4957h + aVar.f4953a, aVar.d);
    }

    public static boolean f(Context context) {
        return context.getSharedPreferences(d, 0).getBoolean(m.h(new byte[]{42, -119, ByteCompanionObject.MAX_VALUE, 62, 49, -71, 104}, new byte[]{90, -20, 17, 90, 88, -41, 15, -119}), false);
    }

    public static void g(Context context, boolean z9) {
        synchronized (c) {
            try {
                if (!f(context)) {
                    return;
                }
                long j10 = context.getSharedPreferences(d, 0).getLong(m.h(new byte[]{-37, 30, -2}, new byte[]{-65, 107, -101, 126, -60, -101, -124, 11}), 0L);
                if (!z9 && j10 > SystemClock.elapsedRealtime()) {
                    try {
                        h(context);
                    } catch (RuntimeException e6) {
                        d(context, e6.getClass().getSimpleName());
                    }
                } else {
                    d(context, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void h(Context context) {
        Context applicationContext = context.getApplicationContext();
        int i10 = 8;
        long max = Math.max(0L, Math.min(5000L, applicationContext.getSharedPreferences(d, 0).getLong(m.h(new byte[]{13, 17, -113}, new byte[]{105, 100, -22, 70, 28, -39, 41, -67}), 0L) - SystemClock.elapsedRealtime()));
        AlarmManager alarmManager = (AlarmManager) applicationContext.getSystemService(m.h(new byte[]{107, -78, 57, -53, -68}, new byte[]{10, -34, 88, -71, -47, 71, -73, 124}));
        if (alarmManager != null) {
            alarmManager.setAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + max, PendingIntent.getBroadcast(applicationContext, 0, new Intent(applicationContext, (Class<?>) LauncherShortcutRestoreReceiver.class), 201326592));
            androidx.profileinstaller.c cVar = f4955f;
            Handler handler = e;
            if (cVar != null) {
                handler.removeCallbacks(cVar);
            }
            androidx.profileinstaller.c cVar2 = new androidx.profileinstaller.c(applicationContext, i10);
            f4955f = cVar2;
            handler.postDelayed(cVar2, max);
            return;
        }
        j1.i.l(m.h(new byte[]{37, -75, 12, 50, 6, 32, -68, 38, 54, -81, 4, 35, 14, 32, -70, 45, 37, -81, 12, 41, 7, 97, -83, 47, 33}, new byte[]{68, -39, 109, 64, 107, 0, -49, 67}));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x015a A[Catch: all -> 0x012a, TRY_LEAVE, TryCatch #0 {all -> 0x012a, blocks: (B:44:0x0112, B:49:0x012f, B:50:0x0154, B:52:0x015a, B:55:0x0165, B:60:0x016f, B:63:0x0176, B:66:0x0181), top: B:41:0x010e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m0.b3 a(android.content.ComponentName r18) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.b.a(android.content.ComponentName):m0.b3");
    }

    public final ArrayList c(boolean z9) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : this.f4962b) {
            boolean z10 = aVar.e;
            if (e(aVar) == z9) {
                arrayList.add(aVar.f4954b);
            }
        }
        return arrayList;
    }
}
