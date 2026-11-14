package a9;

import androidx.core.internal.view.SupportMenu;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.Volatile;
import v8.l1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class u extends e implements l1 {
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers");

    @Volatile
    private volatile int cleanedAndPointers;
    public final long d;

    public u(long j10, u uVar, int i10) {
        super(uVar);
        this.d = j10;
        this.cleanedAndPointers = i10 << 16;
    }

    @Override // a9.e
    public final boolean c() {
        if (e.get(this) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (e.addAndGet(this, SupportMenu.CATEGORY_MASK) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public abstract int f();

    public abstract void g(int i10, CoroutineContext coroutineContext);

    public final void h() {
        if (e.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = e;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
