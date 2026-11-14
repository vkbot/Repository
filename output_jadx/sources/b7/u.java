package b7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class u implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final int f424b;
    public final int c;

    public u(int i10, int i11) {
        this.f424b = i10;
        this.c = i11;
    }

    public final u a(u uVar) {
        int i10 = uVar.c;
        int i11 = this.f424b;
        int i12 = i11 * i10;
        int i13 = uVar.f424b;
        int i14 = this.c;
        if (i12 <= i13 * i14) {
            return new u(i13, (i14 * i13) / i11);
        }
        return new u((i11 * i10) / i14, i10);
    }

    public final u b(u uVar) {
        int i10 = uVar.c;
        int i11 = this.f424b;
        int i12 = i11 * i10;
        int i13 = uVar.f424b;
        int i14 = this.c;
        if (i12 >= i13 * i14) {
            return new u(i13, (i14 * i13) / i11);
        }
        return new u((i11 * i10) / i14, i10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        u uVar = (u) obj;
        int i10 = this.c * this.f424b;
        int i11 = uVar.c * uVar.f424b;
        if (i11 < i10) {
            return 1;
        }
        if (i11 > i10) {
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f424b == uVar.f424b && this.c == uVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f424b * 31) + this.c;
    }

    public final String toString() {
        return this.f424b + "x" + this.c;
    }
}
