package a9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f68b = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_prev");

    @Volatile
    private volatile Object _next;

    @Volatile
    private volatile Object _prev;

    public e(u uVar) {
        this._prev = uVar;
    }

    public final void a() {
        c.lazySet(this, null);
    }

    public final e b() {
        Object obj = f68b.get(this);
        if (obj == d.f65a) {
            return null;
        }
        return (e) obj;
    }

    public abstract boolean c();

    public final void d() {
        e eVar;
        e b10;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            e eVar2 = (e) atomicReferenceFieldUpdater.get(this);
            while (eVar2 != null && eVar2.c()) {
                eVar2 = (e) atomicReferenceFieldUpdater.get(eVar2);
            }
            e b11 = b();
            b11.getClass();
            while (b11.c() && (b10 = b11.b()) != null) {
                b11 = b10;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b11);
                if (((e) obj) == null) {
                    eVar = null;
                } else {
                    eVar = eVar2;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(b11, obj, eVar)) {
                    if (atomicReferenceFieldUpdater.get(b11) != obj) {
                        break;
                    }
                }
            }
            if (eVar2 != null) {
                f68b.set(eVar2, b11);
            }
            if (!b11.c() || b11.b() == null) {
                if (eVar2 == null || !eVar2.c()) {
                    return;
                }
            }
        }
    }
}
