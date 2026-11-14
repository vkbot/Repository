package n7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f4219b;
    public boolean c;
    public boolean d;

    public j1(Runnable runnable) {
        this.f4219b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.c) {
            this.d = true;
            this.f4219b.run();
        }
    }
}
