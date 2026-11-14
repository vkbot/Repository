package t4;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Class f5819a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f5820b;

    public p(Class cls, Class cls2) {
        this.f5819a = cls;
        this.f5820b = cls2;
    }

    public static p a(Class cls) {
        return new p(o.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f5820b.equals(pVar.f5820b)) {
                return this.f5819a.equals(pVar.f5819a);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5819a.hashCode() + (this.f5820b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f5820b;
        Class cls2 = this.f5819a;
        if (cls2 == o.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
