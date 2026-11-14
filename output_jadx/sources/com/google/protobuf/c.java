package com.google.protobuf;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f1544a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f1545b;

    static {
        Class<?> cls;
        boolean z9;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f1544a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        f1545b = z9;
    }

    public static boolean a() {
        if (f1544a != null && !f1545b) {
            return true;
        }
        return false;
    }
}
