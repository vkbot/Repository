package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class q1 extends r1 {
    @Override // com.google.protobuf.r1
    public final boolean c(Object obj, long j10) {
        return this.f1608a.getBoolean(obj, j10);
    }

    @Override // com.google.protobuf.r1
    public final byte d(Object obj, long j10) {
        return this.f1608a.getByte(obj, j10);
    }

    @Override // com.google.protobuf.r1
    public final double e(Object obj, long j10) {
        return this.f1608a.getDouble(obj, j10);
    }

    @Override // com.google.protobuf.r1
    public final float f(Object obj, long j10) {
        return this.f1608a.getFloat(obj, j10);
    }

    @Override // com.google.protobuf.r1
    public final void k(Object obj, long j10, boolean z9) {
        this.f1608a.putBoolean(obj, j10, z9);
    }

    @Override // com.google.protobuf.r1
    public final void l(Object obj, long j10, byte b10) {
        this.f1608a.putByte(obj, j10, b10);
    }

    @Override // com.google.protobuf.r1
    public final void m(Object obj, long j10, double d) {
        this.f1608a.putDouble(obj, j10, d);
    }

    @Override // com.google.protobuf.r1
    public final void n(Object obj, long j10, float f8) {
        this.f1608a.putFloat(obj, j10, f8);
    }

    @Override // com.google.protobuf.r1
    public final boolean r() {
        if (!super.r()) {
            return false;
        }
        try {
            Class<?> cls = this.f1608a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            s1.a(th);
            return false;
        }
    }

    @Override // com.google.protobuf.r1
    public final boolean s() {
        Unsafe unsafe = this.f1608a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (s1.e() != null) {
                    try {
                        Class<?> cls3 = this.f1608a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        s1.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                s1.a(th2);
            }
        }
        return false;
    }
}
