package u4;

import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import n.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h extends AbstractResolvableFuture implements ScheduledFuture {

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledFuture f5879b;

    public h(g gVar) {
        this.f5879b = gVar.a(new p(12, this));
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public final void afterDone() {
        this.f5879b.cancel(wasInterrupted());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f5879b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f5879b.getDelay(timeUnit);
    }
}
