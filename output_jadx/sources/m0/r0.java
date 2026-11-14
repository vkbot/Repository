package m0;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.example.navistart.R;
import o7.q4;
import o7.r4;
import o7.s4;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class r0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3847b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3848f;

    public /* synthetic */ r0(int i10, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f3847b = i10;
        this.f3848f = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.f3847b) {
            case 0:
                LinearLayout linearLayout = (LinearLayout) this.e;
                Button button = (Button) this.d;
                View view = (View) this.c;
                s0 s0Var = (s0) this.f3848f;
                if (s0Var.isAdded() && s0Var.getView() == view) {
                    boolean f8 = p0.b.f(s0Var.requireContext());
                    boolean z9 = !f8;
                    button.setEnabled(z9);
                    if (f8) {
                        i10 = R.string.launcher_shortcuts_cleaning;
                    } else {
                        i10 = R.string.launcher_shortcuts_cleanup;
                    }
                    button.setText(i10);
                    for (int i11 = 0; i11 < linearLayout.getChildCount(); i11++) {
                        linearLayout.getChildAt(i11).setEnabled(z9);
                    }
                    view.postDelayed(this, 250L);
                    return;
                }
                return;
            case 1:
                ((o7.b1) this.f3848f).b((n7.f1) this.c, (o7.v) this.d, (n7.v0) this.e);
                return;
            case 2:
                ((o7.o0) this.f3848f).f4629b.b((n7.f1) this.c, (o7.v) this.d, (n7.v0) this.e);
                return;
            case 3:
                o7.v1 v1Var = (o7.v1) this.f3848f;
                v1Var.A = true;
                v1Var.f4750v.b((n7.f1) this.c, (o7.v) this.d, (n7.v0) this.e);
                return;
            default:
                synchronized (((s4) this.f3848f)) {
                    try {
                        if (((q4) this.c).f4686b == 0) {
                            try {
                                ((r4) this.d).p(this.e);
                                ((s4) this.f3848f).f4698a.remove((r4) this.d);
                                if (((s4) this.f3848f).f4698a.isEmpty()) {
                                    ((s4) this.f3848f).c.shutdown();
                                    ((s4) this.f3848f).c = null;
                                }
                            } catch (Throwable th) {
                                ((s4) this.f3848f).f4698a.remove((r4) this.d);
                                if (((s4) this.f3848f).f4698a.isEmpty()) {
                                    ((s4) this.f3848f).c.shutdown();
                                    ((s4) this.f3848f).c = null;
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
