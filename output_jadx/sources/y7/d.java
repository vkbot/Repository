package y7;

import android.os.Handler;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements Runnable, z7.a {

    /* renamed from: b, reason: collision with root package name */
    public final Handler f6644b;
    public final Runnable c;

    public d(Handler handler, Runnable runnable) {
        this.f6644b = handler;
        this.c = runnable;
    }

    @Override // z7.a
    public final void dispose() {
        this.f6644b.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.c.run();
        } catch (Throwable th) {
            a.a.s(th);
        }
    }
}
