package c0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final f f433a = new f(0);

    /* renamed from: b, reason: collision with root package name */
    public static final f f434b = new f(1);

    public static void a(String str, boolean z9) {
        if (z9) {
            return;
        }
        j1.i.k(str);
    }

    public static void b(Object obj) {
        c(obj, "Argument must not be null");
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        n0.b.n(str);
    }
}
