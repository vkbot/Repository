package n8;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o8.f;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d extends AtomicInteger implements x7.d, n9.b {

    /* renamed from: b, reason: collision with root package name */
    public final x7.d f4268b;
    public final p8.b c = new AtomicReference();
    public final AtomicLong d = new AtomicLong();
    public final AtomicReference e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f4269f = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f4270g;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.atomic.AtomicReference, p8.b] */
    public d(x7.d dVar) {
        this.f4268b = dVar;
    }

    @Override // x7.d
    public final void a() {
        this.f4270g = true;
        x7.d dVar = this.f4268b;
        p8.b bVar = this.c;
        if (getAndIncrement() == 0) {
            bVar.getClass();
            Throwable b10 = p8.d.b(bVar);
            if (b10 != null) {
                dVar.onError(b10);
            } else {
                dVar.a();
            }
        }
    }

    @Override // n9.b
    public final void cancel() {
        if (!this.f4270g) {
            f.a(this.e);
        }
    }

    @Override // n9.b
    public final void d(long j10) {
        if (j10 <= 0) {
            cancel();
            onError(new IllegalArgumentException(ai.onnxruntime.a.h(j10, "§3.9 violated: positive request amount required but it was ")));
            return;
        }
        AtomicReference atomicReference = this.e;
        n9.b bVar = (n9.b) atomicReference.get();
        if (bVar != null) {
            bVar.d(j10);
            return;
        }
        if (f.c(j10)) {
            AtomicLong atomicLong = this.d;
            e3.d.a(atomicLong, j10);
            n9.b bVar2 = (n9.b) atomicReference.get();
            if (bVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    bVar2.d(andSet);
                }
            }
        }
    }

    @Override // x7.d
    public final void e(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            x7.d dVar = this.f4268b;
            dVar.e(obj);
            if (decrementAndGet() != 0) {
                p8.b bVar = this.c;
                bVar.getClass();
                Throwable b10 = p8.d.b(bVar);
                if (b10 != null) {
                    dVar.onError(b10);
                } else {
                    dVar.a();
                }
            }
        }
    }

    @Override // x7.d
    public final void f(n9.b bVar) {
        if (this.f4269f.compareAndSet(false, true)) {
            this.f4268b.f(this);
            if (f.b(this.e, bVar)) {
                long andSet = this.d.getAndSet(0L);
                if (andSet != 0) {
                    bVar.d(andSet);
                    return;
                }
                return;
            }
            return;
        }
        bVar.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    @Override // x7.d
    public final void onError(Throwable th) {
        this.f4270g = true;
        x7.d dVar = this.f4268b;
        p8.b bVar = this.c;
        bVar.getClass();
        if (p8.d.a(bVar, th)) {
            if (getAndIncrement() == 0) {
                dVar.onError(p8.d.b(bVar));
                return;
            }
            return;
        }
        a.a.s(th);
    }
}
