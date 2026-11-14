package x8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i f6537a = new Object();

    public static b a(int i10, int i11) {
        if (i10 != -2) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != Integer.MAX_VALUE) {
                        if (i11 == 1) {
                            return new b(i10);
                        }
                        return new m(i10, i11);
                    }
                    return new b(Integer.MAX_VALUE);
                }
                if (i11 == 1) {
                    return new b(0);
                }
                return new m(1, i11);
            }
            if (i11 == 1) {
                return new m(1, 2);
            }
            j1.i.k("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i11 == 1) {
            f.f6535a.getClass();
            return new b(e.f6534b);
        }
        return new m(1, i11);
    }
}
