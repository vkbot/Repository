package b7;

import android.content.DialogInterface;
import com.example.navistart.SuperWidgets.WidgetBuilderFragment;
import java.util.ArrayList;
import m0.n3;
import m0.q2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f395b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(int i10, Object obj) {
        this.f395b = i10;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f395b) {
            case 0:
                ((j) this.c).f398a.finish();
                return;
            case 1:
                ((q2) this.c).t();
                return;
            case 2:
                ((Runnable) ((ArrayList) this.c).get(i10)).run();
                return;
            case 3:
                n3 n3Var = (n3) this.c;
                n3Var.f3812m = n3Var.r;
                n3Var.w();
                return;
            default:
                ((WidgetBuilderFragment) this.c).lambda$editor$27(dialogInterface, i10);
                return;
        }
    }
}
