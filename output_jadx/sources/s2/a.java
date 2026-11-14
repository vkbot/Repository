package s2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f5649a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f5650b;
    public static Boolean c;
    public static Boolean d;
    public static String e;

    /* renamed from: f, reason: collision with root package name */
    public static int f5651f;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r3 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = "/proc/"
            java.lang.String r1 = s2.a.e
            if (r1 != 0) goto L68
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L13
            java.lang.String r0 = q.c.i()
            s2.a.e = r0
            goto L68
        L13:
            int r1 = s2.a.f5651f
            if (r1 != 0) goto L1d
            int r1 = android.os.Process.myPid()
            s2.a.f5651f = r1
        L1d:
            r2 = 0
            if (r1 > 0) goto L21
            goto L66
        L21:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            r3.append(r1)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            java.lang.String r0 = "/cmdline"
            r3.append(r0)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L57
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L57
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L57
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L57
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L63
            r2.a.b(r0)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L63
            java.lang.String r2 = r0.trim()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L63
        L4e:
            r3.close()     // Catch: java.io.IOException -> L66
            goto L66
        L52:
            r0 = move-exception
            r2 = r3
            goto L5c
        L55:
            r0 = move-exception
            goto L5c
        L57:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
            throw r0     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L62
        L5c:
            if (r2 == 0) goto L61
            r2.close()     // Catch: java.io.IOException -> L61
        L61:
            throw r0
        L62:
            r3 = r2
        L63:
            if (r3 == 0) goto L66
            goto L4e
        L66:
            s2.a.e = r2
        L68:
            java.lang.String r0 = s2.a.e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.a.a():java.lang.String");
    }

    public static boolean b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f5650b == null) {
            f5650b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f5650b.booleanValue();
        if (c == null) {
            c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (c.booleanValue()) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 26 || i10 >= 30) {
                return true;
            }
            return false;
        }
        return false;
    }
}
