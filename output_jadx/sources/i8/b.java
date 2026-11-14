package i8;

import h8.z;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends AtomicReference implements z7.a, x7.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2844b = 1;
    public final Object c;

    public b(x7.f fVar) {
        this.c = fVar;
    }

    @Override // x7.f
    public final void a() {
        z7.a aVar;
        switch (this.f2844b) {
            case 0:
                Object obj = get();
                c8.a aVar2 = c8.a.f577b;
                if (obj != aVar2 && (aVar = (z7.a) getAndSet(aVar2)) != aVar2) {
                    try {
                        ((x7.f) this.c).a();
                        if (aVar != null) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        if (aVar != null) {
                            aVar.dispose();
                        }
                    }
                }
                return;
            default:
                z zVar = (z) this.c;
                int i10 = zVar.c;
                AtomicInteger atomicInteger = zVar.f2735f;
                zVar.e.b(this);
                if (zVar.get() == 0) {
                    boolean z9 = false;
                    if (zVar.compareAndSet(0, 1)) {
                        if (atomicInteger.decrementAndGet() == 0) {
                            z9 = true;
                        }
                        l8.b bVar = (l8.b) zVar.f2738i.get();
                        if (z9 && (bVar == null || bVar.isEmpty())) {
                            p8.b bVar2 = zVar.f2736g;
                            bVar2.getClass();
                            Throwable b10 = p8.d.b(bVar2);
                            x7.d dVar = zVar.f2734b;
                            if (b10 != null) {
                                dVar.onError(b10);
                                return;
                            } else {
                                dVar.a();
                                return;
                            }
                        }
                        if (i10 != Integer.MAX_VALUE) {
                            zVar.f2739j.d(1L);
                        }
                        if (zVar.decrementAndGet() != 0) {
                            zVar.h();
                            return;
                        }
                        return;
                    }
                }
                atomicInteger.decrementAndGet();
                if (i10 != Integer.MAX_VALUE) {
                    zVar.f2739j.d(1L);
                }
                zVar.c();
                return;
        }
    }

    @Override // x7.f
    public void b(z7.a aVar) {
        c8.a.d(this, aVar);
    }

    @Override // x7.f
    public void c(Object obj) {
        z zVar = (z) this.c;
        zVar.e.b(this);
        if (zVar.get() == 0) {
            boolean z9 = false;
            if (zVar.compareAndSet(0, 1)) {
                if (zVar.f2735f.decrementAndGet() == 0) {
                    z9 = true;
                }
                if (zVar.d.get() != 0) {
                    zVar.f2734b.e(obj);
                    l8.b bVar = (l8.b) zVar.f2738i.get();
                    if (z9 && (bVar == null || bVar.isEmpty())) {
                        p8.b bVar2 = zVar.f2736g;
                        bVar2.getClass();
                        Throwable b10 = p8.d.b(bVar2);
                        x7.d dVar = zVar.f2734b;
                        if (b10 != null) {
                            dVar.onError(b10);
                            return;
                        } else {
                            dVar.a();
                            return;
                        }
                    }
                    e3.d.p(zVar.d, 1L);
                    if (zVar.c != Integer.MAX_VALUE) {
                        zVar.f2739j.d(1L);
                    }
                } else {
                    l8.b i10 = zVar.i();
                    synchronized (i10) {
                        i10.offer(obj);
                    }
                }
                if (zVar.decrementAndGet() == 0) {
                    return;
                }
                zVar.h();
            }
        }
        l8.b i11 = zVar.i();
        synchronized (i11) {
            i11.offer(obj);
        }
        zVar.f2735f.decrementAndGet();
        if (zVar.getAndIncrement() != 0) {
            return;
        }
        zVar.h();
    }

    @Override // z7.a
    public final void dispose() {
        switch (this.f2844b) {
            case 0:
                c8.a.a(this);
                return;
            default:
                c8.a.a(this);
                return;
        }
    }

    @Override // x7.f
    public final void onError(Throwable th) {
        z7.a aVar;
        switch (this.f2844b) {
            case 0:
                Object obj = get();
                c8.a aVar2 = c8.a.f577b;
                if (obj != aVar2 && (aVar = (z7.a) getAndSet(aVar2)) != aVar2) {
                    try {
                        ((x7.f) this.c).onError(th);
                        if (aVar != null) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        if (aVar != null) {
                            aVar.dispose();
                        }
                    }
                }
                a.a.s(th);
                return;
            default:
                z zVar = (z) this.c;
                c8.c cVar = zVar.e;
                cVar.b(this);
                p8.b bVar = zVar.f2736g;
                bVar.getClass();
                if (p8.d.a(bVar, th)) {
                    zVar.f2739j.cancel();
                    cVar.dispose();
                    zVar.f2735f.decrementAndGet();
                    zVar.c();
                    return;
                }
                a.a.s(th);
                return;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.f2844b) {
            case 0:
                return b.class.getSimpleName() + "{" + super.toString() + "}";
            default:
                return super.toString();
        }
    }

    public b(z zVar) {
        this.c = zVar;
    }
}
