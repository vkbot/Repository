package v8;

import kotlin.collections.ArrayDeque;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class l0 extends t {

    /* renamed from: b, reason: collision with root package name */
    public long f6040b;
    public boolean c;
    public ArrayDeque d;

    public final void S(boolean z9) {
        long j10;
        long j11 = this.f6040b;
        if (z9) {
            j10 = 4294967296L;
        } else {
            j10 = 1;
        }
        this.f6040b = j10 + j11;
        if (!z9) {
            this.c = true;
        }
    }

    public final boolean V() {
        f0 f0Var;
        ArrayDeque arrayDeque = this.d;
        if (arrayDeque == null || (f0Var = (f0) arrayDeque.removeFirstOrNull()) == null) {
            return false;
        }
        f0Var.run();
        return true;
    }

    @Override // v8.t
    public final t limitedParallelism(int i10) {
        a9.a.a(i10);
        return this;
    }

    public abstract void shutdown();

    public final void y() {
        long j10 = this.f6040b - 4294967296L;
        this.f6040b = j10;
        if (j10 <= 0 && this.c) {
            shutdown();
        }
    }
}
