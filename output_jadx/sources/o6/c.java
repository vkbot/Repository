package o6;

import z5.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f4376a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4377b;
    public final o[] c;

    public c(int i10, int i11, int i12, int i13, int[] iArr) {
        this.f4376a = i10;
        this.f4377b = iArr;
        float f8 = i13;
        this.c = new o[]{new o(i11, f8), new o(i12, f8)};
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c) || this.f4376a != ((c) obj).f4376a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f4376a;
    }
}
