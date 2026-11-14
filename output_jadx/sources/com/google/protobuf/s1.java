package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f1612a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f1613b;
    public static final r1 c;
    public static final boolean d;
    public static final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f1614f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f1615g;

    static {
        boolean s5;
        boolean r;
        Unsafe j10 = j();
        f1612a = j10;
        f1613b = c.f1544a;
        boolean f8 = f(Long.TYPE);
        boolean f10 = f(Integer.TYPE);
        r1 r1Var = null;
        if (j10 != null) {
            if (c.a()) {
                if (f8) {
                    r1Var = new p1(j10, 1);
                } else if (f10) {
                    r1Var = new p1(j10, 0);
                }
            } else {
                r1Var = new r1(j10);
            }
        }
        c = r1Var;
        boolean z9 = false;
        if (r1Var == null) {
            s5 = false;
        } else {
            s5 = r1Var.s();
        }
        d = s5;
        if (r1Var == null) {
            r = false;
        } else {
            r = r1Var.r();
        }
        e = r;
        f1614f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field e6 = e();
        if (e6 != null && r1Var != null) {
            r1Var.j(e6);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z9 = true;
        }
        f1615g = z9;
    }

    public static void a(Throwable th) {
        Logger.getLogger(s1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f1612a.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static int c(Class cls) {
        if (e) {
            return c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (e) {
            c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        if (c.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean f(Class cls) {
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f1613b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(byte[] bArr, long j10) {
        return c.d(bArr, f1614f + j10);
    }

    public static byte h(Object obj, long j10) {
        return (byte) ((c.g(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte i(Object obj, long j10) {
        return (byte) ((c.g(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j10, byte b10) {
        c.l(bArr, f1614f + j10, b10);
    }

    public static void l(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int g10 = c.g(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        n(((255 & b10) << i10) | (g10 & (~(255 << i10))), j11, obj);
    }

    public static void m(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        n(((255 & b10) << i10) | (c.g(obj, j11) & (~(255 << i10))), j11, obj);
    }

    public static void n(int i10, long j10, Object obj) {
        c.o(i10, j10, obj);
    }

    public static void o(Object obj, long j10, long j11) {
        c.p(obj, j10, j11);
    }

    public static void p(long j10, Object obj, Object obj2) {
        c.q(j10, obj, obj2);
    }
}
