package x8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import v8.u1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class m extends b {

    /* renamed from: l, reason: collision with root package name */
    public final int f6540l;

    public m(int i10, int i11) {
        super(i10);
        this.f6540l = i11;
        if (i11 != 1) {
            if (i10 >= 1) {
                return;
            }
            l9.i.d(ai.onnxruntime.a.f(i10, "Buffered channel capacity must be at least 1, but ", " was specified"));
            throw null;
        }
        ai.onnxruntime.b.v(Reflection.getOrCreateKotlinClass(b.class).getSimpleName(), "This implementation does not support suspension for senders, use ", " instead");
        throw null;
    }

    public final Object B(Object obj, boolean z9) {
        u1 u1Var;
        if (this.f6540l == 3) {
            Object e = super.e(obj);
            if ((e instanceof i) && !(e instanceof h)) {
                return Unit.INSTANCE;
            }
            return e;
        }
        b8.d dVar = d.d;
        k kVar = (k) b.f6511g.get(this);
        while (true) {
            long andIncrement = b.c.getAndIncrement(this);
            long j10 = 1152921504606846975L & andIncrement;
            boolean q8 = q(andIncrement, false);
            int i10 = d.f6519b;
            long j11 = i10;
            long j12 = j10 / j11;
            int i11 = (int) (j10 % j11);
            if (kVar.d != j12) {
                k a10 = b.a(this, j12, kVar);
                if (a10 == null) {
                    if (q8) {
                        return new h(n());
                    }
                } else {
                    kVar = a10;
                }
            }
            int d = b.d(this, kVar, i11, obj, j10, dVar, q8);
            if (d != 0) {
                if (d != 1) {
                    if (d != 2) {
                        if (d != 3) {
                            if (d != 4) {
                                if (d == 5) {
                                    kVar.a();
                                }
                            } else {
                                if (j10 < b.d.get(this)) {
                                    kVar.a();
                                }
                                return new h(n());
                            }
                        } else {
                            j1.i.l("unexpected");
                            return null;
                        }
                    } else {
                        if (q8) {
                            kVar.h();
                            return new h(n());
                        }
                        if (dVar instanceof u1) {
                            u1Var = (u1) dVar;
                        } else {
                            u1Var = null;
                        }
                        if (u1Var != null) {
                            u1Var.b(kVar, i11 + i10);
                        }
                        j((kVar.d * j11) + i11);
                        return Unit.INSTANCE;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            } else {
                kVar.a();
                return Unit.INSTANCE;
            }
        }
    }

    @Override // x8.b, x8.r
    public final Object e(Object obj) {
        return B(obj, false);
    }

    @Override // x8.b, x8.r
    public final Object f(Object obj, Continuation continuation) {
        if (!(B(obj, true) instanceof h)) {
            return Unit.INSTANCE;
        }
        throw n();
    }

    @Override // x8.b
    public final boolean s() {
        if (this.f6540l == 2) {
            return true;
        }
        return false;
    }
}
