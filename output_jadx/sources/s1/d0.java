package s1;

import android.view.View;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements View.OnLongClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5481b;
    public final /* synthetic */ q0 c;

    public /* synthetic */ d0(q0 q0Var, int i10) {
        this.f5481b = i10;
        this.c = q0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f5481b) {
            case 0:
                this.c.m();
                return true;
            default:
                q0 q0Var = this.c;
                if (!q0Var.f5595s) {
                    q0Var.m();
                }
                q0Var.f5597v = ((l0) view).f5535b.f5511a;
                q0Var.A();
                return true;
        }
    }
}
