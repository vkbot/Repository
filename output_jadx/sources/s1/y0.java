package s1;

import androidx.activity.OnBackPressedCallback;
import com.example.navistart.home.WebLauncherActivity;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class y0 extends OnBackPressedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebLauncherActivity f5646a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(WebLauncherActivity webLauncherActivity) {
        super(true);
        this.f5646a = webLauncherActivity;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        WebLauncherActivity webLauncherActivity = this.f5646a;
        q0 q0Var = webLauncherActivity.f978i;
        if (q0Var != null && q0Var.f5595s) {
            String str = q0Var.f5596u;
            if (str == null) {
                str = "";
            }
            q0Var.u(str);
            q0Var.y();
            q0Var.f5595s = false;
            q0Var.f5597v = null;
            q0Var.f5596u = null;
            q0Var.f5583f.setVisibility(8);
            q0Var.A();
            q0Var.F();
            WebLauncherActivity webLauncherActivity2 = (WebLauncherActivity) q0Var.f5582b.c;
            webLauncherActivity2.f979j = false;
            webLauncherActivity2.t();
            return;
        }
        k kVar = webLauncherActivity.d;
        if (kVar != null) {
            if (kVar.f5523j) {
                kVar.j(false);
            } else if (kVar.f5518b.f() && kVar.f5522i) {
                kVar.l();
            }
        }
    }
}
