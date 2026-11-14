package d0;

import android.util.Log;
import androidx.core.util.Pools;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements Pools.Pool {

    /* renamed from: a, reason: collision with root package name */
    public final c f1710a;

    /* renamed from: b, reason: collision with root package name */
    public final f f1711b;
    public final Pools.SynchronizedPool c;

    public d(Pools.SynchronizedPool synchronizedPool, c cVar, f fVar) {
        this.c = synchronizedPool;
        this.f1710a = cVar;
        this.f1711b = fVar;
    }

    @Override // androidx.core.util.Pools.Pool
    public final Object acquire() {
        Object acquire = this.c.acquire();
        if (acquire == null) {
            acquire = this.f1710a.create();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + acquire.getClass());
            }
        }
        if (acquire instanceof e) {
            ((e) acquire).c().f1713a = false;
        }
        return acquire;
    }

    @Override // androidx.core.util.Pools.Pool
    public final boolean release(Object obj) {
        if (obj instanceof e) {
            ((e) obj).c().f1713a = true;
        }
        this.f1711b.a(obj);
        return this.c.release(obj);
    }
}
