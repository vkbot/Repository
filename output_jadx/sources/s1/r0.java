package s1;

import android.view.View;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5609b;
    public final /* synthetic */ u0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ r0(u0 u0Var, String str, int i10) {
        this.f5609b = i10;
        this.c = u0Var;
        this.d = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5609b) {
            case 0:
                u0 u0Var = this.c;
                if (!u0Var.f5627o) {
                    String str = u0Var.f5629q;
                    String str2 = this.d;
                    if (str != null && !str.equals(str2)) {
                        u0Var.f(new e4.o(u0Var.f5629q, str2, u0Var.r, u0Var.f5630s));
                        return;
                    }
                    if (u0Var.f5629q != null) {
                        str2 = null;
                    }
                    u0Var.f5629q = str2;
                    u0Var.i();
                    u0Var.n();
                    return;
                }
                return;
            default:
                this.c.f(new e4.o(this.d, null, 2, 50));
                return;
        }
    }
}
