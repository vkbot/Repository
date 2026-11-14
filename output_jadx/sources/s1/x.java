package s1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.io.encoding.Base64;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: k, reason: collision with root package name */
    public static x f5637k;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5638a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5639b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final ExecutorService d = Executors.newSingleThreadExecutor();
    public final ThreadPoolExecutor e = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(128), new ThreadPoolExecutor.AbortPolicy());

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f5640f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5641g;

    /* renamed from: h, reason: collision with root package name */
    public Socket f5642h;

    /* renamed from: i, reason: collision with root package name */
    public BufferedReader f5643i;

    /* renamed from: j, reason: collision with root package name */
    public PrintWriter f5644j;

    public x(Context context) {
        this.f5638a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences(e0.m.h(new byte[]{-78, 35, -73, -9, -37, 51, 4, -31, -127, 53, -85, -9, -36, 52, 22, -52, -68, 48, -85, -3, -33, 62}, new byte[]{-34, 66, -62, -103, -72, 91, 97, -109}), 0);
        String string = sharedPreferences.getString(e0.m.h(new byte[]{-109, -31, -47, 119, 14}, new byte[]{-25, -114, -70, 18, 96, -46, 85, -79}), null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            sharedPreferences.edit().putString(e0.m.h(new byte[]{-50, -126, Base64.padSymbol, 106, -59}, new byte[]{-70, -19, 86, 15, -85, -23, -124, -113}), string).apply();
        }
        this.f5639b = string;
    }

    public static synchronized x a(Context context) {
        x xVar;
        synchronized (x.class) {
            try {
                if (f5637k == null) {
                    f5637k = new x(context.getApplicationContext());
                }
                xVar = f5637k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xVar;
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(e0.m.h(new byte[]{-10}, new byte[]{-47, -92, -98, -12, 66, 22, -8, 15}));
        sb.append(str.replace(e0.m.h(new byte[]{-56}, new byte[]{-17, 89, 125, 69, -100, 12, 17, -54}), e0.m.h(new byte[]{60, 18, 105, 47}, new byte[]{27, 78, 78, 8, -90, -85, 8, 108})));
        return com.google.protobuf.q.i(new byte[]{82}, new byte[]{117, -85, 11, -68, 68, 14, 30, 88}, sb);
    }

    public final synchronized String c(String str) {
        String d;
        try {
            d = d(str);
            if (this.f5642h == null && !str.startsWith(e0.m.h(new byte[]{90, -121, -49, 38, 63, 1}, new byte[]{14, -56, -102, 101, 119, 33, 70, -116}))) {
                d = d(str);
            }
            if (e0.m.h(new byte[]{-63, 10}, new byte[]{-114, 65, 98, -3, -33, 69, -82, -65}).equals(d)) {
                this.f5640f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa A[Catch: Exception -> 0x000d, TryCatch #0 {Exception -> 0x000d, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x009c, B:12:0x00aa, B:13:0x00bf, B:14:0x0010, B:16:0x00c0, B:17:0x00d5), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.x.d(java.lang.String):java.lang.String");
    }
}
