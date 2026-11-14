package u4;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import n.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5873b;
    public final /* synthetic */ f c;
    public final /* synthetic */ Runnable d;
    public final /* synthetic */ long e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f5874f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f5875g;

    public /* synthetic */ c(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f5873b = i10;
        this.c = fVar;
        this.d = runnable;
        this.e = j10;
        this.f5874f = j11;
        this.f5875g = timeUnit;
    }

    @Override // u4.g
    public final ScheduledFuture a(p pVar) {
        switch (this.f5873b) {
            case 0:
                f fVar = this.c;
                return fVar.c.scheduleAtFixedRate(new d(fVar, this.d, pVar, 0), this.e, this.f5874f, this.f5875g);
            default:
                f fVar2 = this.c;
                return fVar2.c.scheduleWithFixedDelay(new d(fVar2, this.d, pVar, 2), this.e, this.f5874f, this.f5875g);
        }
    }
}
