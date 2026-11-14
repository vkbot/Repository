package o7;

import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4389a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4390b;
    public final j4.g c;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r1.h() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a1(int r1, long r2, java.util.Set r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f4389a = r1
            r0.f4390b = r2
            int r1 = j4.g.d
            boolean r1 = r4 instanceof j4.g
            if (r1 == 0) goto L1b
            boolean r1 = r4 instanceof java.util.SortedSet
            if (r1 != 0) goto L1b
            r1 = r4
            j4.g r1 = (j4.g) r1
            boolean r2 = r1.h()
            if (r2 != 0) goto L1b
            goto L24
        L1b:
            java.lang.Object[] r1 = r4.toArray()
            int r2 = r1.length
            j4.g r1 = j4.g.j(r2, r1)
        L24:
            r0.c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.a1.<init>(int, long, java.util.Set):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a1.class == obj.getClass()) {
                a1 a1Var = (a1) obj;
                if (this.f4389a == a1Var.f4389a && this.f4390b == a1Var.f4390b && com.bumptech.glide.d.f(this.c, a1Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4389a), Long.valueOf(this.f4390b), this.c});
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.e("maxAttempts", String.valueOf(this.f4389a));
        t.b(this.f4390b, "hedgingDelayNanos");
        t.c(this.c, "nonFatalStatusCodes");
        return t.toString();
    }
}
