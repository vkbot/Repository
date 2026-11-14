package r2;

import android.text.TextUtils;
import j1.i;
import n0.b;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f5348a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f5349b;
    public static int c;

    public static void a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        i.k(str2);
    }

    public static void b(Object obj) {
        if (obj != null) {
            return;
        }
        b.n("null reference");
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        b.n(str);
    }

    public static boolean d(Object obj, String str) {
        if (obj != str) {
            if (obj == null || !obj.equals(str)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
