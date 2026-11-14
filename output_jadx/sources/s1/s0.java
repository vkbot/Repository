package s1;

import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5612b;
    public final /* synthetic */ u0 c;

    public /* synthetic */ s0(u0 u0Var, int i10) {
        this.f5612b = i10;
        this.c = u0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12 = this.f5612b;
        u0 u0Var = this.c;
        switch (i12) {
            case 0:
                u0Var.l();
                return;
            case 1:
                u0Var.f5629q = null;
                u0Var.i();
                u0Var.n();
                return;
            default:
                u0Var.f5629q = null;
                LinearLayout linearLayout = u0Var.d;
                ArrayList arrayList = u0Var.f5621i;
                if (!u0Var.f5618f) {
                    WindowManager.LayoutParams layoutParams = u0Var.f5625m;
                    if (layoutParams == null) {
                        i10 = 0;
                    } else {
                        i10 = layoutParams.x;
                    }
                    u0Var.f5619g = i10;
                    if (layoutParams == null) {
                        i11 = 0;
                    } else {
                        i11 = layoutParams.y;
                    }
                    u0Var.f5620h = i11;
                    u0Var.f5618f = true;
                    arrayList.clear();
                }
                u0Var.f5617b.setVisibility(8);
                u0Var.e.setVisibility(0);
                u0Var.h();
                u0Var.i();
                if (!arrayList.isEmpty()) {
                    u0Var.j();
                    return;
                }
                int i13 = u0Var.f5628p + 1;
                u0Var.f5628p = i13;
                linearLayout.removeAllViews();
                linearLayout.addView(u0Var.k(e0.m.h(new byte[]{30, -73, -72, -107, 5, 84, 76, 118, 31, -93, -72, -110, 5, 93, 77, 70, -18, -16, -41, -12, 85, 55, 37, 38, 117, -16, -42, -11, 99, 55, 40, 38, 115, -16, -48, -11, 108, 5, 29, 80}, new byte[]{-50, 32, 104, 37, -43, -25, -99, -10})));
                ExecutorService executorService = u0Var.f5623k;
                if (executorService != null) {
                    executorService.execute(new a4.c(u0Var, i13, 11));
                    return;
                }
                return;
        }
    }
}
