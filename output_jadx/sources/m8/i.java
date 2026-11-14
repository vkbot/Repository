package m8;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i extends x7.k {

    /* renamed from: b, reason: collision with root package name */
    public static final k f3983b = new k("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f3984a = f3983b;

    @Override // x7.k
    public final x7.j a() {
        return new j(this.f3984a);
    }
}
