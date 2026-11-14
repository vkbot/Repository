package n8;

import o8.f;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class a implements e8.a, e8.d {

    /* renamed from: b, reason: collision with root package name */
    public final e8.a f4263b;
    public n9.b c;
    public e8.d d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public int f4264f;

    public a(e8.a aVar) {
        this.f4263b = aVar;
    }

    @Override // x7.d
    public void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f4263b.a();
    }

    public final void b(Throwable th) {
        com.bumptech.glide.d.v(th);
        this.c.cancel();
        onError(th);
    }

    @Override // n9.b
    public final void cancel() {
        this.c.cancel();
    }

    @Override // e8.g
    public final void clear() {
        this.d.clear();
    }

    @Override // n9.b
    public final void d(long j10) {
        this.c.d(j10);
    }

    @Override // x7.d
    public final void f(n9.b bVar) {
        if (f.e(this.c, bVar)) {
            this.c = bVar;
            if (bVar instanceof e8.d) {
                this.d = (e8.d) bVar;
            }
            this.f4263b.f(this);
        }
    }

    @Override // e8.c
    public int h(int i10) {
        e8.d dVar = this.d;
        if (dVar != null && (i10 & 4) == 0) {
            int h2 = dVar.h(i10);
            if (h2 != 0) {
                this.f4264f = h2;
                return h2;
            }
            return h2;
        }
        return 0;
    }

    @Override // e8.g
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // e8.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // x7.d
    public void onError(Throwable th) {
        if (this.e) {
            a.a.s(th);
        } else {
            this.e = true;
            this.f4263b.onError(th);
        }
    }
}
