package d9;

import a9.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import v8.a0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class e extends j implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1862g = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "owner");

    @Volatile
    private volatile Object owner = f.f1863a;

    public e() {
        new d(this);
    }

    public final void c(Object obj) {
        while (Math.max(j.f1868f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1862g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            w wVar = f.f1863a;
            if (obj2 != wVar) {
                if (obj2 != obj && obj != null) {
                    androidx.navigation.b.z("This mutex is locked by ", obj2, ", but ", obj, " is expected");
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, wVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                b();
                return;
            }
        }
        j1.i.l("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(a0.a(this));
        sb.append("[isLocked=");
        boolean z9 = false;
        if (Math.max(j.f1868f.get(this), 0) == 0) {
            z9 = true;
        }
        sb.append(z9);
        sb.append(",owner=");
        sb.append(f1862g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
