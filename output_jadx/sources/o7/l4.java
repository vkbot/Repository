package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l4 extends p4 {
    @Override // o7.p4
    public final boolean p(m4 m4Var) {
        synchronized (m4Var) {
            try {
                if (m4Var.d == 0) {
                    m4Var.d = -1;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o7.p4
    public final void q(m4 m4Var) {
        synchronized (m4Var) {
            m4Var.d = 0;
        }
    }
}
