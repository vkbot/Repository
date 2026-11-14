package e0;

import android.view.View;
import com.example.navistart.ModernMainActivity;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class l1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1960b;
    public final /* synthetic */ ModernMainActivity c;
    public final /* synthetic */ View d;

    public /* synthetic */ l1(ModernMainActivity modernMainActivity, View view, int i10) {
        this.f1960b = i10;
        this.c = modernMainActivity;
        this.d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1960b;
        View view = this.d;
        ModernMainActivity modernMainActivity = this.c;
        switch (i10) {
            case 0:
                String str = ModernMainActivity.B1;
                modernMainActivity.T(view);
                return;
            case 1:
                String str2 = ModernMainActivity.B1;
                modernMainActivity.R(view.getWidth(), view.getHeight());
                modernMainActivity.T(view);
                return;
            default:
                String str3 = ModernMainActivity.B1;
                modernMainActivity.R(view.getWidth(), view.getHeight());
                return;
        }
    }
}
