package j8;

import a9.w;
import x7.m;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements x7.h, z7.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3324b;
    public final w c;
    public z7.a d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3325f;

    public /* synthetic */ b(Object obj, w wVar, int i10) {
        this.f3324b = i10;
        this.f3325f = obj;
        this.c = wVar;
    }

    @Override // x7.h
    public final void a() {
        switch (this.f3324b) {
            case 0:
                x7.h hVar = (x7.h) this.f3325f;
                if (!this.e) {
                    this.e = true;
                    hVar.e(Boolean.FALSE);
                    hVar.a();
                    return;
                }
                return;
            default:
                if (!this.e) {
                    this.e = true;
                    ((m) this.f3325f).c(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    @Override // x7.h
    public final void b(z7.a aVar) {
        switch (this.f3324b) {
            case 0:
                if (c8.a.e(this.d, aVar)) {
                    this.d = aVar;
                    ((x7.h) this.f3325f).b(this);
                    return;
                }
                return;
            default:
                if (c8.a.e(this.d, aVar)) {
                    this.d = aVar;
                    ((m) this.f3325f).b(this);
                    return;
                }
                return;
        }
    }

    @Override // z7.a
    public final void dispose() {
        switch (this.f3324b) {
            case 0:
                this.d.dispose();
                return;
            default:
                this.d.dispose();
                return;
        }
    }

    @Override // x7.h
    public final void e(Object obj) {
        switch (this.f3324b) {
            case 0:
                x7.h hVar = (x7.h) this.f3325f;
                if (!this.e) {
                    try {
                        if (this.c.test(obj)) {
                            this.e = true;
                            this.d.dispose();
                            hVar.e(Boolean.TRUE);
                            hVar.a();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        com.bumptech.glide.d.v(th);
                        this.d.dispose();
                        onError(th);
                        return;
                    }
                }
                return;
            default:
                if (!this.e) {
                    try {
                        if (this.c.test(obj)) {
                            this.e = true;
                            this.d.dispose();
                            ((m) this.f3325f).c(Boolean.TRUE);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        com.bumptech.glide.d.v(th2);
                        this.d.dispose();
                        onError(th2);
                        return;
                    }
                }
                return;
        }
    }

    @Override // x7.h
    public final void onError(Throwable th) {
        switch (this.f3324b) {
            case 0:
                if (this.e) {
                    a.a.s(th);
                    return;
                } else {
                    this.e = true;
                    ((x7.h) this.f3325f).onError(th);
                    return;
                }
            default:
                if (this.e) {
                    a.a.s(th);
                    return;
                } else {
                    this.e = true;
                    ((m) this.f3325f).onError(th);
                    return;
                }
        }
    }
}
