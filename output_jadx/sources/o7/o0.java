package o7;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o0 implements w {

    /* renamed from: b, reason: collision with root package name */
    public final w f4629b;
    public volatile boolean c;
    public List d = new ArrayList();

    public o0(w wVar) {
        this.f4629b = wVar;
    }

    public final void a(Runnable runnable) {
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

    @Override // o7.w
    public final void b(n7.f1 f1Var, v vVar, n7.v0 v0Var) {
        a(new m0.r0(2, this, f1Var, vVar, v0Var));
    }

    @Override // o7.w
    public final void j() {
        if (this.c) {
            this.f4629b.j();
        } else {
            a(new com.bumptech.glide.m(11, this));
        }
    }

    @Override // o7.w
    public final void k(o2 o2Var) {
        if (this.c) {
            this.f4629b.k(o2Var);
        } else {
            a(new e0(11, this, o2Var));
        }
    }

    @Override // o7.w
    public final void l(n7.v0 v0Var) {
        a(new e0(12, this, v0Var));
    }
}
