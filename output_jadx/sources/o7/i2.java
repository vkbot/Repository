package o7;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i2 extends n7.m0 {

    /* renamed from: b, reason: collision with root package name */
    public static final ReferenceQueue f4550b = new ReferenceQueue();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final Logger d = Logger.getLogger(i2.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final f2 f4551a;

    public i2(f2 f2Var) {
        this.f4551a = f2Var;
        new h2(this, f2Var, f4550b, c);
    }

    @Override // n7.d
    public final String e() {
        return this.f4551a.t.e();
    }

    @Override // n7.d
    public final n7.t f(n7.x0 x0Var, n7.c cVar) {
        return this.f4551a.t.f(x0Var, cVar);
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(this.f4551a, "delegate");
        return t.toString();
    }
}
