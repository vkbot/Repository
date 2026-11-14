package p0;

import android.widget.TextView;
import com.example.navistart.R;
import e0.j2;
import e0.m;
import m0.q2;
import o7.i4;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4971b;
    public final /* synthetic */ j c;

    public /* synthetic */ g(j jVar, int i10) {
        this.f4971b = i10;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i4 i4Var;
        int i10 = this.f4971b;
        j jVar = this.c;
        switch (i10) {
            case 0:
                jVar.f4984j = 0;
                jVar.e();
                return;
            case 1:
                try {
                    i4Var = jVar.f4979b.f(new androidx.fragment.app.h(29, jVar));
                } catch (Exception e) {
                    i4Var = new i4(false, 0, 1, e.getClass().getSimpleName() + m.h(new byte[]{-120, -12}, new byte[]{-78, -44, -117, 77, -24, 50, -21, 81}) + e.getMessage());
                }
                jVar.d.post(new j2(24, jVar, i4Var));
                return;
            case 2:
                q2 q2Var = jVar.c;
                if (q2Var != null) {
                    TextView textView = q2Var.f3840f;
                    if (textView != null) {
                        textView.setText(R.string.user_apps_hide_result_restored_by_zone);
                    }
                    q2Var.v();
                    jVar.e();
                    return;
                }
                jVar.a();
                return;
            default:
                jVar.e();
                return;
        }
    }
}
