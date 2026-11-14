package o7;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i0 extends n7.e {

    /* renamed from: b, reason: collision with root package name */
    public final n7.e f4548b;
    public volatile boolean c;
    public List d = new ArrayList();

    public i0(n7.e eVar) {
        this.f4548b = eVar;
    }

    public final void E(Runnable runnable) {
        synchronized (this) {
            try {
                if (!this.c) {
                    this.d.add(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n7.e
    public final void o(n7.f1 f1Var, n7.v0 v0Var) {
        E(new c3.e(this, f1Var, v0Var, 3));
    }

    @Override // n7.e
    public final void p(n7.v0 v0Var) {
        if (this.c) {
            this.f4548b.p(v0Var);
        } else {
            E(new e0(3, this, v0Var));
        }
    }

    @Override // n7.e
    public final void q(Object obj) {
        if (this.c) {
            this.f4548b.q(obj);
        } else {
            E(new e0(4, this, obj));
        }
    }

    @Override // n7.e
    public final void r() {
        if (this.c) {
            this.f4548b.r();
        } else {
            E(new com.bumptech.glide.m(10, this));
        }
    }
}
