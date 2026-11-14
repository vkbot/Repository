package w0;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class a0 {
    public static boolean c;
    public static volatile y d;

    /* renamed from: a, reason: collision with root package name */
    public static final String f6061a = e0.m.h(new byte[]{-14, 45, 67, 114, -93, -80, 76, 10, -29, 43, 68, 116, -103, -124, 64, 10, -32}, new byte[]{-124, 66, 42, 17, -58, -17, 41, 100});

    /* renamed from: b, reason: collision with root package name */
    public static volatile z f6062b = z.f6297b;
    public static final ArrayList e = new ArrayList();

    public static y a(Context context) {
        f();
        int ordinal = f6062b.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return new g(context);
            }
            if (a.f(context)) {
                return new x(context);
            }
            f6062b = z.f6297b;
            return new g(context);
        }
        if (a.f(context)) {
            return new o(context);
        }
        f6062b = z.f6297b;
        return new g(context);
    }

    public static synchronized void b() {
        synchronized (a0.class) {
            if (d != null) {
                d.b();
            }
        }
    }

    public static synchronized y c(Context context) {
        y yVar;
        synchronized (a0.class) {
            try {
                if (d == null) {
                    d = a(context.getApplicationContext());
                    g(context);
                }
                yVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return yVar;
    }

    public static synchronized z d() {
        z zVar;
        synchronized (a0.class) {
            f();
            zVar = f6062b;
        }
        return zVar;
    }

    public static boolean e() {
        if (f6062b == z.d) {
            return true;
        }
        return false;
    }

    public static void f() {
        if (c) {
            return;
        }
        try {
            f6062b = z.valueOf(h0.b.o().loadString(f6061a, z.f6297b.name()));
        } catch (IllegalArgumentException unused) {
            f6062b = z.f6297b;
        }
        c = true;
    }

    public static synchronized void g(Context context) {
        synchronized (a0.class) {
            b();
            if (!h0.b.o().loadBoolean(e0.m.h(new byte[]{-32, 120, -117, 84, -25, 52, 108, 107, -27, 105, -106, 110, -39, 44, 111, 93, -64, 95}, new byte[]{-109, 8, -30, 11, -122, 95, 24, 2}), false)) {
                c(context).c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0031 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:8:0x0007, B:10:0x000b, B:13:0x001a, B:15:0x001e, B:17:0x0022, B:21:0x0028, B:23:0x0031, B:24:0x0038, B:28:0x0012, B:30:0x0018), top: B:7:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void h(android.content.Context r3, w0.z r4) {
        /*
            java.lang.Class<w0.a0> r0 = w0.a0.class
            monitor-enter(r0)
            if (r4 != 0) goto L7
            monitor-exit(r0)
            return
        L7:
            w0.z r1 = w0.z.c     // Catch: java.lang.Throwable -> L10
            if (r4 == r1) goto L12
            w0.z r1 = w0.z.d     // Catch: java.lang.Throwable -> L10
            if (r4 != r1) goto L1a
            goto L12
        L10:
            r3 = move-exception
            goto L52
        L12:
            boolean r1 = w0.a.f(r3)     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L1a
            w0.z r4 = w0.z.f6297b     // Catch: java.lang.Throwable -> L10
        L1a:
            boolean r1 = w0.a0.c     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L28
            w0.z r1 = w0.a0.f6062b     // Catch: java.lang.Throwable -> L10
            if (r1 != r4) goto L28
            w0.y r1 = w0.a0.d     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L28
            monitor-exit(r0)
            return
        L28:
            b()     // Catch: java.lang.Throwable -> L10
            w0.y r1 = w0.a0.d     // Catch: java.lang.Throwable -> L10
            boolean r1 = r1 instanceof w0.x     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L38
            w0.y r1 = w0.a0.d     // Catch: java.lang.Throwable -> L10
            w0.x r1 = (w0.x) r1     // Catch: java.lang.Throwable -> L10
            r1.t()     // Catch: java.lang.Throwable -> L10
        L38:
            w0.a0.f6062b = r4     // Catch: java.lang.Throwable -> L10
            r1 = 1
            w0.a0.c = r1     // Catch: java.lang.Throwable -> L10
            u0.a r1 = h0.b.o()     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = w0.a0.f6061a     // Catch: java.lang.Throwable -> L10
            java.lang.String r4 = r4.name()     // Catch: java.lang.Throwable -> L10
            r1.saveString(r2, r4)     // Catch: java.lang.Throwable -> L10
            r4 = 0
            w0.a0.d = r4     // Catch: java.lang.Throwable -> L10
            g(r3)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.a0.h(android.content.Context, w0.z):void");
    }
}
