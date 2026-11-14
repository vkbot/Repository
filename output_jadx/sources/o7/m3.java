package o7;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4616b;
    public final /* synthetic */ n3 c;

    public /* synthetic */ m3(n3 n3Var, int i10) {
        this.f4616b = i10;
        this.c = n3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4616b) {
            case 0:
                n3 n3Var = this.c;
                if (!n3Var.f4623f) {
                    n3Var.f4624g = null;
                    return;
                }
                long a10 = n3Var.e - n3Var.d.a();
                if (a10 > 0) {
                    n3Var.f4624g = n3Var.f4621a.schedule(new m3(n3Var, 1), a10, TimeUnit.NANOSECONDS);
                    return;
                }
                n3Var.f4623f = false;
                n3Var.f4624g = null;
                n3Var.c.run();
                return;
            default:
                n3 n3Var2 = this.c;
                n3Var2.f4622b.execute(new m3(n3Var2, 0));
                return;
        }
    }
}
