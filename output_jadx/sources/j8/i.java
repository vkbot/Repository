package j8;

import java.util.Iterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i implements e8.b {

    /* renamed from: b, reason: collision with root package name */
    public final x7.h f3344b;
    public final Iterator c;
    public volatile boolean d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3345f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3346g;

    public i(x7.h hVar, Iterator it) {
        this.f3344b = hVar;
        this.c = it;
    }

    @Override // e8.g
    public final void clear() {
        this.f3345f = true;
    }

    @Override // z7.a
    public final void dispose() {
        this.d = true;
    }

    @Override // e8.c
    public final int h(int i10) {
        this.e = true;
        return 1;
    }

    @Override // e8.g
    public final boolean isEmpty() {
        return this.f3345f;
    }

    @Override // e8.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // e8.g
    public final Object poll() {
        if (this.f3345f) {
            return null;
        }
        boolean z9 = this.f3346g;
        Iterator it = this.c;
        if (z9) {
            if (!it.hasNext()) {
                this.f3345f = true;
                return null;
            }
        } else {
            this.f3346g = true;
        }
        Object next = it.next();
        d8.b.a(next, "The iterator returned a null value");
        return next;
    }
}
