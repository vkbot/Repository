package o7;

import java.util.Random;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public Random f4687a;

    /* renamed from: b, reason: collision with root package name */
    public long f4688b;
    public double c;
    public double d;
    public long e;

    public final long a() {
        boolean z9;
        long j10 = this.e;
        double d = j10;
        this.e = Math.min((long) (this.c * d), this.f4688b);
        double d10 = this.d;
        double d11 = (-d10) * d;
        double d12 = d10 * d;
        if (d12 >= d11) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.f(z9);
        return j10 + ((long) ((this.f4687a.nextDouble() * (d12 - d11)) + d11));
    }
}
