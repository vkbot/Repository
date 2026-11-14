package h;

import android.text.TextUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g {
    public static final c5.e e = new c5.e(7);

    /* renamed from: a, reason: collision with root package name */
    public final Object f2523a;

    /* renamed from: b, reason: collision with root package name */
    public final f f2524b;
    public final String c;
    public volatile byte[] d;

    public g(String str, Object obj, f fVar) {
        if (!TextUtils.isEmpty(str)) {
            this.c = str;
            this.f2523a = obj;
            this.f2524b = fVar;
            return;
        }
        j1.i.k("Must not be null or empty");
        throw null;
    }

    public static g a(Object obj, String str) {
        return new g(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.c.equals(((g) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return ai.onnxruntime.a.p(new StringBuilder("Option{key='"), this.c, "'}");
    }
}
