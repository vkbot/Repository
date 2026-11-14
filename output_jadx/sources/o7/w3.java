package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class w3 extends n7.e {

    /* renamed from: b, reason: collision with root package name */
    public final c4 f4765b;
    public long c;
    public final /* synthetic */ v1 d;

    public w3(v1 v1Var, c4 c4Var) {
        this.d = v1Var;
        this.f4765b = c4Var;
    }

    @Override // n7.e
    public final void w(long j10) {
        p3 p3Var;
        if (this.d.f4746p.f4800f == null) {
            synchronized (this.d.f4740j) {
                try {
                    if (this.d.f4746p.f4800f == null) {
                        c4 c4Var = this.f4765b;
                        if (!c4Var.f4449b) {
                            long j11 = this.c + j10;
                            this.c = j11;
                            v1 v1Var = this.d;
                            long j12 = v1Var.f4749u;
                            if (j11 <= j12) {
                                return;
                            }
                            if (j11 > v1Var.f4742l) {
                                c4Var.c = true;
                            } else {
                                long addAndGet = v1Var.f4741k.f4479a.addAndGet(j11 - j12);
                                v1 v1Var2 = this.d;
                                v1Var2.f4749u = this.c;
                                if (addAndGet > v1Var2.f4743m) {
                                    this.f4765b.c = true;
                                }
                            }
                            c4 c4Var2 = this.f4765b;
                            if (c4Var2.c) {
                                p3Var = this.d.j(c4Var2);
                            } else {
                                p3Var = null;
                            }
                            if (p3Var != null) {
                                p3Var.run();
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }
}
