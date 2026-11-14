package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4444b = 0;
    public final /* synthetic */ o1 c;

    public c1(o1 o1Var, long j10) {
        this.c = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4444b) {
            case 0:
                this.c.getClass();
                return;
            default:
                ((p7.n) this.c.f4630a.c).q(n7.f1.f4201m.h("Keepalive failed. The connection is likely gone"));
                return;
        }
    }

    public c1(o1 o1Var, Throwable th) {
        this.c = o1Var;
    }
}
