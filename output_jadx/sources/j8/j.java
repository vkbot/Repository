package j8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j implements x7.h, e8.b {

    /* renamed from: b, reason: collision with root package name */
    public final x7.h f3347b;
    public z7.a c;
    public e8.b d;
    public boolean e;

    public j(x7.h hVar, e0.g gVar) {
        this.f3347b = hVar;
    }

    @Override // x7.h
    public final void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f3347b.a();
    }

    @Override // x7.h
    public final void b(z7.a aVar) {
        if (c8.a.e(this.c, aVar)) {
            this.c = aVar;
            if (aVar instanceof e8.b) {
                this.d = (e8.b) aVar;
            }
            this.f3347b.b(this);
        }
    }

    @Override // e8.g
    public final void clear() {
        this.d.clear();
    }

    @Override // z7.a
    public final void dispose() {
        this.c.dispose();
    }

    @Override // x7.h
    public final void e(Object obj) {
        if (this.e) {
            return;
        }
        try {
            String n10 = ((y5.a) obj).n();
            d8.b.a(n10, "The mapper function returned a null value.");
            this.f3347b.e(n10);
        } catch (Throwable th) {
            com.bumptech.glide.d.v(th);
            this.c.dispose();
            onError(th);
        }
    }

    @Override // e8.c
    public final int h(int i10) {
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

    @Override // x7.h
    public final void onError(Throwable th) {
        if (this.e) {
            a.a.s(th);
        } else {
            this.e = true;
            this.f3347b.onError(th);
        }
    }

    @Override // e8.g
    public final Object poll() {
        Object poll = this.d.poll();
        if (poll != null) {
            String n10 = ((y5.a) poll).n();
            d8.b.a(n10, "The mapper function returned a null value.");
            return n10;
        }
        return null;
    }
}
