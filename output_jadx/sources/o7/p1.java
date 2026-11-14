package o7;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f4653a;

    /* renamed from: b, reason: collision with root package name */
    public final i4.f f4654b;
    public final n.p c;
    public int d;
    public ScheduledFuture e;

    /* renamed from: f, reason: collision with root package name */
    public ScheduledFuture f4655f;

    /* renamed from: g, reason: collision with root package name */
    public final q1 f4656g;

    /* renamed from: h, reason: collision with root package name */
    public final q1 f4657h;

    /* renamed from: i, reason: collision with root package name */
    public final long f4658i;

    /* renamed from: j, reason: collision with root package name */
    public final long f4659j;

    /* JADX WARN: Type inference failed for: r0v0, types: [i4.f, java.lang.Object] */
    public p1(n.p pVar, ScheduledExecutorService scheduledExecutorService, long j10, long j11) {
        ?? obj = new Object();
        this.d = 1;
        this.f4656g = new q1(new n1(this, 0));
        this.f4657h = new q1(new n1(this, 1));
        this.c = pVar;
        o4.b.i(scheduledExecutorService, "scheduler");
        this.f4653a = scheduledExecutorService;
        this.f4654b = obj;
        this.f4658i = j10;
        this.f4659j = j11;
        obj.f2774a = false;
        obj.b();
    }

    public final synchronized void a() {
        try {
            i4.f fVar = this.f4654b;
            boolean z9 = false;
            fVar.f2774a = false;
            fVar.b();
            int i10 = this.d;
            if (i10 == 2) {
                this.d = 3;
            } else if (i10 == 4 || i10 == 5) {
                ScheduledFuture scheduledFuture = this.e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.d == 5) {
                    this.d = 1;
                    return;
                }
                this.d = 2;
                if (this.f4655f == null) {
                    z9 = true;
                }
                o4.b.m(z9, "There should be no outstanding pingFuture");
                this.f4655f = this.f4653a.schedule(this.f4657h, this.f4658i, TimeUnit.NANOSECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            int i10 = this.d;
            if (i10 == 1) {
                this.d = 2;
                if (this.f4655f == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f4653a;
                    q1 q1Var = this.f4657h;
                    long j10 = this.f4658i;
                    i4.f fVar = this.f4654b;
                    this.f4655f = scheduledExecutorService.schedule(q1Var, j10 - fVar.a(), TimeUnit.NANOSECONDS);
                }
            } else if (i10 == 5) {
                this.d = 4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
