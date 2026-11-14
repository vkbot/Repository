package a9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f79a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_cur");

    @Volatile
    private volatile Object _cur = new p(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f79a;
            p pVar = (p) atomicReferenceFieldUpdater.get(this);
            int a10 = pVar.a(runnable);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                if (a10 == 2) {
                    return false;
                }
            } else {
                p c = pVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, pVar, c) && atomicReferenceFieldUpdater.get(this) == pVar) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f79a;
            p pVar = (p) atomicReferenceFieldUpdater.get(this);
            if (pVar.b()) {
                return;
            }
            p c = pVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, pVar, c) && atomicReferenceFieldUpdater.get(this) == pVar) {
            }
        }
    }

    public final int c() {
        p pVar = (p) f79a.get(this);
        pVar.getClass();
        long j10 = p.f81f.get(pVar);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f79a;
            p pVar = (p) atomicReferenceFieldUpdater.get(this);
            Object d = pVar.d();
            if (d != p.f82g) {
                return d;
            }
            p c = pVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, pVar, c) && atomicReferenceFieldUpdater.get(this) == pVar) {
            }
        }
    }
}
