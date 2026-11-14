package m4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends com.bumptech.glide.c {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3921b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3922f;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3921b = atomicReferenceFieldUpdater;
        this.c = atomicReferenceFieldUpdater2;
        this.d = atomicReferenceFieldUpdater3;
        this.e = atomicReferenceFieldUpdater4;
        this.f3922f = atomicReferenceFieldUpdater5;
    }

    @Override // com.bumptech.glide.c
    public final boolean c(m mVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(mVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(mVar) == dVar);
        return false;
    }

    @Override // com.bumptech.glide.c
    public final boolean d(m mVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3922f;
            if (atomicReferenceFieldUpdater.compareAndSet(mVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(mVar) == obj);
        return false;
    }

    @Override // com.bumptech.glide.c
    public final boolean e(m mVar, l lVar, l lVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(mVar, lVar, lVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(mVar) == lVar);
        return false;
    }

    @Override // com.bumptech.glide.c
    public final d k(m mVar) {
        return (d) this.e.getAndSet(mVar, d.d);
    }

    @Override // com.bumptech.glide.c
    public final l l(m mVar) {
        return (l) this.d.getAndSet(mVar, l.c);
    }

    @Override // com.bumptech.glide.c
    public final void q(l lVar, l lVar2) {
        this.c.lazySet(lVar, lVar2);
    }

    @Override // com.bumptech.glide.c
    public final void r(l lVar, Thread thread) {
        this.f3921b.lazySet(lVar, thread);
    }
}
