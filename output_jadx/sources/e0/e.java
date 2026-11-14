package e0;

import android.widget.ScrollView;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1905b;
    public final /* synthetic */ s1.u0 c;

    public /* synthetic */ e(s1.u0 u0Var, int i10) {
        this.f1905b = i10;
        this.c = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        float f8;
        switch (this.f1905b) {
            case 0:
                s1.u0 u0Var = this.c;
                boolean z9 = u0Var.f5626n;
                u0Var.f5626n = !z9;
                if (!z9) {
                    u0Var.l();
                } else {
                    u0Var.g();
                }
                ScrollView scrollView = u0Var.c;
                if (u0Var.f5626n) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                scrollView.setVisibility(i10);
                u0Var.c();
                u0Var.h();
                return;
            case 1:
                s1.u0 u0Var2 = this.c;
                u0Var2.h();
                if (u0Var2.f5626n) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.5f;
                }
                u0Var2.setAlpha(f8);
                return;
            case 2:
                this.c.h();
                return;
            default:
                s1.u0 u0Var3 = this.c;
                u0Var3.h();
                if (u0Var3.f5618f && !u0Var3.f5621i.isEmpty()) {
                    u0Var3.j();
                    return;
                }
                return;
        }
    }
}
