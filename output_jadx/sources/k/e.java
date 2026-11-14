package k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final f f3357a;

    /* renamed from: b, reason: collision with root package name */
    public int f3358b;
    public Class c;

    public e(f fVar) {
        this.f3357a = fVar;
    }

    @Override // k.i
    public final void a() {
        this.f3357a.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f3358b == eVar.f3358b && this.c == eVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = this.f3358b * 31;
        Class cls = this.c;
        if (cls != null) {
            i10 = cls.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final String toString() {
        return "Key{size=" + this.f3358b + "array=" + this.c + '}';
    }
}
