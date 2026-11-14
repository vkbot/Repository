package c0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public Class f443a;

    /* renamed from: b, reason: collision with root package name */
    public Class f444b;
    public Class c;

    public n(Class cls, Class cls2, Class cls3) {
        this.f443a = cls;
        this.f444b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f443a.equals(nVar.f443a) && this.f444b.equals(nVar.f444b) && p.b(this.c, nVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f444b.hashCode() + (this.f443a.hashCode() * 31)) * 31;
        Class cls = this.c;
        if (cls != null) {
            i10 = cls.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f443a + ", second=" + this.f444b + '}';
    }
}
