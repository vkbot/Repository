package h8;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class h extends AtomicLong implements n9.b {

    /* renamed from: b, reason: collision with root package name */
    public final x7.d f2666b;
    public final c8.d c = new c8.d(0);

    public h(x7.d dVar) {
        this.f2666b = dVar;
    }

    public final void a() {
        c8.d dVar = this.c;
        if (dVar.c()) {
            return;
        }
        try {
            this.f2666b.a();
        } finally {
            dVar.dispose();
        }
    }

    public final boolean b(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        c8.d dVar = this.c;
        if (dVar.c()) {
            return false;
        }
        try {
            this.f2666b.onError(th);
            dVar.dispose();
            return true;
        } catch (Throwable th2) {
            dVar.dispose();
            throw th2;
        }
    }

    @Override // n9.b
    public final void cancel() {
        c8.d dVar = this.c;
        dVar.getClass();
        c8.a.a(dVar);
        e();
    }

    @Override // n9.b
    public final void d(long j10) {
        if (o8.f.c(j10)) {
            e3.d.a(this, j10);
            c();
        }
    }

    public boolean f(Throwable th) {
        return b(th);
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return getClass().getSimpleName() + "{" + super.toString() + "}";
    }

    public void c() {
    }

    public void e() {
    }
}
