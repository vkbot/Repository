package v8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class e0 extends a9.t {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f6021f = AtomicIntegerFieldUpdater.newUpdater(e0.class, "_decision");

    @Volatile
    @JvmField
    private volatile int _decision;

    @Override // a9.t, v8.h1
    public final void i(Object obj) {
        j(obj);
    }

    @Override // a9.t, v8.h1
    public final void j(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f6021f;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    a9.a.f(m.a(obj), IntrinsicsKt.intercepted(this.e));
                    return;
                } else {
                    j1.i.l("Already resumed");
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
