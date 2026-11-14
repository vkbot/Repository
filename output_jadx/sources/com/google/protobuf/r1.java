package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f1608a;

    public r1(Unsafe unsafe) {
        this.f1608a = unsafe;
    }

    public final int a(Class cls) {
        return this.f1608a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f1608a.arrayIndexScale(cls);
    }

    public abstract boolean c(Object obj, long j10);

    public abstract byte d(Object obj, long j10);

    public abstract double e(Object obj, long j10);

    public abstract float f(Object obj, long j10);

    public final int g(Object obj, long j10) {
        return this.f1608a.getInt(obj, j10);
    }

    public final long h(Object obj, long j10) {
        return this.f1608a.getLong(obj, j10);
    }

    public final Object i(Object obj, long j10) {
        return this.f1608a.getObject(obj, j10);
    }

    public final long j(Field field) {
        return this.f1608a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j10, boolean z9);

    public abstract void l(Object obj, long j10, byte b10);

    public abstract void m(Object obj, long j10, double d);

    public abstract void n(Object obj, long j10, float f8);

    public final void o(int i10, long j10, Object obj) {
        this.f1608a.putInt(obj, j10, i10);
    }

    public final void p(Object obj, long j10, long j11) {
        this.f1608a.putLong(obj, j10, j11);
    }

    public final void q(long j10, Object obj, Object obj2) {
        this.f1608a.putObject(obj, j10, obj2);
    }

    public boolean r() {
        Unsafe unsafe = this.f1608a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            s1.a(th);
            return false;
        }
    }

    public abstract boolean s();
}
