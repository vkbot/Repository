package l9;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class s extends j0 {

    /* renamed from: a, reason: collision with root package name */
    public j0 f3580a;

    public s(j0 j0Var) {
        j0Var.getClass();
        this.f3580a = j0Var;
    }

    @Override // l9.j0
    public final j0 clearDeadline() {
        return this.f3580a.clearDeadline();
    }

    @Override // l9.j0
    public final j0 clearTimeout() {
        return this.f3580a.clearTimeout();
    }

    @Override // l9.j0
    public final long deadlineNanoTime() {
        return this.f3580a.deadlineNanoTime();
    }

    @Override // l9.j0
    public final boolean hasDeadline() {
        return this.f3580a.hasDeadline();
    }

    @Override // l9.j0
    public final void throwIfReached() {
        this.f3580a.throwIfReached();
    }

    @Override // l9.j0
    public final j0 timeout(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f3580a.timeout(j10, timeUnit);
    }

    @Override // l9.j0
    public final long timeoutNanos() {
        return this.f3580a.timeoutNanos();
    }

    @Override // l9.j0
    public final j0 deadlineNanoTime(long j10) {
        return this.f3580a.deadlineNanoTime(j10);
    }
}
