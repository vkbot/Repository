package y7;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import x7.j;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends j {

    /* renamed from: b, reason: collision with root package name */
    public final Handler f6643b;
    public volatile boolean c;

    public c(Handler handler) {
        this.f6643b = handler;
    }

    @Override // x7.j
    public final z7.a a(Runnable runnable, TimeUnit timeUnit) {
        c8.b bVar = c8.b.f578b;
        if (TimeUnit.NANOSECONDS != null) {
            if (this.c) {
                return bVar;
            }
            Handler handler = this.f6643b;
            d dVar = new d(handler, runnable);
            Message obtain = Message.obtain(handler, dVar);
            obtain.obj = this;
            this.f6643b.sendMessageDelayed(obtain, 0L);
            if (this.c) {
                this.f6643b.removeCallbacks(dVar);
                return bVar;
            }
            return dVar;
        }
        n0.b.n("unit == null");
        return null;
    }

    @Override // z7.a
    public final void dispose() {
        this.c = true;
        this.f6643b.removeCallbacksAndMessages(this);
    }
}
