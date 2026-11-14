package e0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f1983b;
    public volatile String c;

    public n2(Runnable runnable) {
        this.f1983b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c = Thread.currentThread().getName();
        this.f1983b.run();
    }
}
