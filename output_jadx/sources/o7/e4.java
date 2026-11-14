package o7;

import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4476a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4477b;
    public final long c;
    public final double d;
    public final Long e;

    /* renamed from: f, reason: collision with root package name */
    public final j4.g f4478f;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r1.h() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e4(int r1, long r2, long r4, double r6, java.lang.Long r8, java.util.Set r9) {
        /*
            r0 = this;
            r0.<init>()
            r0.f4476a = r1
            r0.f4477b = r2
            r0.c = r4
            r0.d = r6
            r0.e = r8
            int r1 = j4.g.d
            boolean r1 = r9 instanceof j4.g
            if (r1 == 0) goto L21
            boolean r1 = r9 instanceof java.util.SortedSet
            if (r1 != 0) goto L21
            r1 = r9
            j4.g r1 = (j4.g) r1
            boolean r2 = r1.h()
            if (r2 != 0) goto L21
            goto L2a
        L21:
            java.lang.Object[] r1 = r9.toArray()
            int r2 = r1.length
            j4.g r1 = j4.g.j(r2, r1)
        L2a:
            r0.f4478f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.e4.<init>(int, long, long, double, java.lang.Long, java.util.Set):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e4) {
            e4 e4Var = (e4) obj;
            if (this.f4476a == e4Var.f4476a && this.f4477b == e4Var.f4477b && this.c == e4Var.c && Double.compare(this.d, e4Var.d) == 0 && com.bumptech.glide.d.f(this.e, e4Var.e) && com.bumptech.glide.d.f(this.f4478f, e4Var.f4478f)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4476a), Long.valueOf(this.f4477b), Long.valueOf(this.c), Double.valueOf(this.d), this.e, this.f4478f});
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.e("maxAttempts", String.valueOf(this.f4476a));
        t.b(this.f4477b, "initialBackoffNanos");
        t.b(this.c, "maxBackoffNanos");
        t.e("backoffMultiplier", String.valueOf(this.d));
        t.c(this.e, "perAttemptRecvTimeoutNanos");
        t.c(this.f4478f, "retryableStatusCodes");
        return t.toString();
    }
}
