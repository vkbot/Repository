package j1;

import android.content.Context;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public interface v {
    void a(Context context, i0.a aVar);

    z0.a b();

    default boolean c() {
        return false;
    }

    w d();

    default t[] e() {
        return new t[0];
    }

    default boolean f() {
        return true;
    }

    default t g(String str) {
        if (str != null) {
            String trim = str.trim();
            for (t tVar : e()) {
                if (tVar != null && trim.equals(tVar.f3238a)) {
                    return tVar;
                }
            }
            return null;
        }
        return null;
    }

    default boolean h() {
        return false;
    }
}
