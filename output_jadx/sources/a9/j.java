package a9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.Volatile;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class j extends v8.t implements v8.d0 {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f76f = AtomicIntegerFieldUpdater.newUpdater(j.class, "runningWorkers");

    /* renamed from: b, reason: collision with root package name */
    public final v8.t f77b;
    public final int c;
    public final n d;
    public final Object e;

    @Volatile
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public j(v8.t tVar, int i10) {
        v8.d0 d0Var;
        this.f77b = tVar;
        this.c = i10;
        if (tVar instanceof v8.d0) {
            d0Var = (v8.d0) tVar;
        } else {
            d0Var = null;
        }
        if (d0Var == null) {
            int i11 = v8.c0.f6016a;
        }
        this.d = new n();
        this.e = new Object();
    }

    public final boolean S() {
        synchronized (this.e) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f76f;
            if (atomicIntegerFieldUpdater.get(this) >= this.c) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // v8.t
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable y9;
        this.d.a(runnable);
        if (f76f.get(this) < this.c && S() && (y9 = y()) != null) {
            this.f77b.dispatch(this, new i(0, this, y9));
        }
    }

    @Override // v8.t
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable y9;
        this.d.a(runnable);
        if (f76f.get(this) < this.c && S() && (y9 = y()) != null) {
            this.f77b.dispatchYield(this, new i(0, this, y9));
        }
    }

    @Override // v8.t
    public final v8.t limitedParallelism(int i10) {
        a.a(i10);
        if (i10 >= this.c) {
            return this;
        }
        return super.limitedParallelism(i10);
    }

    public final Runnable y() {
        while (true) {
            Runnable runnable = (Runnable) this.d.d();
            if (runnable == null) {
                synchronized (this.e) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f76f;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.d.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }
}
