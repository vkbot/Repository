package h8;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n0 extends AtomicLong implements n9.b {

    /* renamed from: b, reason: collision with root package name */
    public final x7.d f2698b;
    public volatile o0 c;
    public long d;

    public n0(x7.d dVar) {
        this.f2698b = dVar;
    }

    @Override // n9.b
    public final void cancel() {
        o0 o0Var;
        if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE && (o0Var = this.c) != null) {
            o0Var.h(this);
            o0Var.c();
        }
    }

    @Override // n9.b
    public final void d(long j10) {
        long j11;
        if (!o8.f.c(j10)) {
            return;
        }
        do {
            j11 = get();
            if (j11 == Long.MIN_VALUE || j11 == Long.MAX_VALUE) {
                break;
            }
        } while (!compareAndSet(j11, e3.d.b(j11, j10)));
        o0 o0Var = this.c;
        if (o0Var != null) {
            o0Var.c();
        }
    }
}
