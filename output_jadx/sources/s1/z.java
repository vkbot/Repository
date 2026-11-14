package s1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5647b;
    public final /* synthetic */ q0 c;
    public final /* synthetic */ m0 d;

    public /* synthetic */ z(q0 q0Var, m0 m0Var, int i10) {
        this.f5647b = i10;
        this.c = q0Var;
        this.d = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5647b) {
            case 0:
                m0 m0Var = m0.c;
                q0 q0Var = this.c;
                m0 m0Var2 = this.d;
                if (m0Var2 == m0Var) {
                    q0Var.f5600z = false;
                }
                if (m0Var2 == m0.d) {
                    q0Var.A = false;
                }
                if (q0Var.isAttachedToWindow()) {
                    q0Var.B(m0Var2);
                    return;
                }
                return;
            default:
                this.c.B(this.d);
                return;
        }
    }
}
