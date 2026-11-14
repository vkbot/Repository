package y7;

import android.os.Handler;
import i8.p;
import java.util.concurrent.TimeUnit;
import x7.j;
import x7.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f6645a;

    public e(Handler handler) {
        this.f6645a = handler;
    }

    @Override // x7.k
    public final j a() {
        return new c(this.f6645a);
    }

    @Override // x7.k
    public final z7.a c(p pVar) {
        if (TimeUnit.NANOSECONDS != null) {
            Handler handler = this.f6645a;
            d dVar = new d(handler, pVar);
            handler.postDelayed(dVar, 0L);
            return dVar;
        }
        n0.b.n("unit == null");
        return null;
    }
}
