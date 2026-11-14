package p0;

import w0.i0;
import w0.k0;
import w0.l0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4970b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(Object obj, int i10, int i11, int i12) {
        this.f4970b = i12;
        this.e = obj;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4970b) {
            case 0:
                ((j) this.e).i(this.c, this.d);
                return;
            case 1:
                l0 l0Var = (l0) this.e;
                int i10 = this.c;
                int i11 = this.d;
                if (l0Var.y(i10, i11) && l0Var.f6173s == null) {
                    l0Var.b(k0.d, i10, i11);
                    return;
                }
                return;
            default:
                l0 l0Var2 = ((i0) this.e).c;
                int i12 = this.c;
                int i13 = this.d;
                if (l0Var2.y(i12, i13) && l0Var2.r) {
                    l0Var2.b(k0.c, i12, i13);
                    return;
                }
                return;
        }
    }
}
