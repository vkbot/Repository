package y2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import p2.d;
import v2.c;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final p2.a f6622a = p2.a.f4987b;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f6623b = new Object();
    public static Method c;
    public static Method d;

    public static void a(Context context) {
        Context context2;
        Context context3;
        r2.a.c(context, "Context must not be null");
        f6622a.getClass();
        AtomicBoolean atomicBoolean = d.f4988a;
        p2.a.f4987b.getClass();
        int a10 = p2.a.a(11925000, context);
        Intent intent = null;
        if (a10 != 0) {
            if (a10 != 1 && a10 != 2) {
                if (a10 == 3) {
                    Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
                    intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(fromParts);
                }
            } else if (!s2.a.b(context)) {
                StringBuilder sb = new StringBuilder("gcore_");
                sb.append(p2.a.f4986a);
                sb.append("-");
                if (!TextUtils.isEmpty("e")) {
                    sb.append("e");
                }
                sb.append("-");
                sb.append(context.getPackageName());
                sb.append("-");
                try {
                    sb.append(t2.a.a(context).c.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                String sb2 = sb.toString();
                intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(sb2)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
            } else {
                intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
                intent.setPackage("com.google.android.wearable.app");
            }
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + a10);
            if (intent == null) {
                throw new Exception();
            }
            throw new Exception("Google Play Services not available");
        }
        synchronized (f6623b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = c.a(context, c.f5929b).f5937a;
            } catch (v2.a e) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                b(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            try {
                context3 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused2) {
                context3 = null;
            }
            if (context3 != null) {
                try {
                    if (d == null) {
                        Class cls = Long.TYPE;
                        d = context3.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("reportRequestStats", Context.class, cls, cls);
                    }
                    d.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
                } catch (Exception e6) {
                    Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e6.getMessage())));
                }
            }
            if (context3 != null) {
                b(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new Exception();
            }
        }
    }

    public static void b(Context context, String str) {
        String message;
        try {
            if (c == null) {
                c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            c.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                if (cause == null) {
                    message = e.getMessage();
                } else {
                    message = cause.getMessage();
                }
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(message)));
            }
            throw new Exception();
        }
    }
}
