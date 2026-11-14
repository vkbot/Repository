package d8;

import c5.e;
import w7.c;
import z3.f;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class b {
    public static final c c;
    public static final f d;

    /* renamed from: a, reason: collision with root package name */
    public static final e f1857a = new e(5);

    /* renamed from: b, reason: collision with root package name */
    public static final b4.e f1858b = new b4.e(1);
    public static final p2.e e = new p2.e(5);

    static {
        int i10 = 4;
        c = new c(i10);
        d = new f(i10);
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        n0.b.n(str);
    }

    public static void b(int i10, String str) {
        if (i10 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i10);
    }
}
