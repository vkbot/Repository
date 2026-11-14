package o2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public int f4323b;
    public int c;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        int i10 = this.c;
        int i11 = dVar.c;
        if (i10 != i11) {
            return i10 - i11;
        }
        return this.f4323b - dVar.f4323b;
    }

    public final String toString() {
        return "Order{order=" + this.c + ", index=" + this.f4323b + '}';
    }
}
