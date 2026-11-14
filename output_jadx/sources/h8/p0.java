package h8;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p0 extends x7.b {
    public final x7.b c;
    public final AtomicReference d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final m0 f2709f;

    public p0(m0 m0Var, x7.b bVar, AtomicReference atomicReference, int i10) {
        this.f2709f = m0Var;
        this.c = bVar;
        this.d = atomicReference;
        this.e = i10;
    }

    @Override // x7.b
    public final void e(x7.d dVar) {
        this.f2709f.a(dVar);
    }

    public final void f() {
        o0 o0Var;
        loop0: while (true) {
            AtomicReference atomicReference = this.d;
            o0Var = (o0) atomicReference.get();
            if (o0Var != null && !o0Var.d()) {
                break;
            }
            o0 o0Var2 = new o0(atomicReference, this.e);
            while (!atomicReference.compareAndSet(o0Var, o0Var2)) {
                if (atomicReference.get() != o0Var) {
                    break;
                }
            }
            o0Var = o0Var2;
            break loop0;
        }
        AtomicBoolean atomicBoolean = o0Var.e;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            this.c.d(o0Var);
        }
    }
}
