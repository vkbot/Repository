package d2;

import android.os.Process;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1754b;
    public final Runnable c;

    public /* synthetic */ o(Runnable runnable, int i10) {
        this.f1754b = i10;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1754b) {
            case 0:
                try {
                    this.c.run();
                    return;
                } catch (Exception e) {
                    e3.d.f("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                Process.setThreadPriority(10);
                this.c.run();
                return;
            default:
                this.c.run();
                return;
        }
    }

    public String toString() {
        switch (this.f1754b) {
            case 2:
                return this.c.toString();
            default:
                return super.toString();
        }
    }
}
