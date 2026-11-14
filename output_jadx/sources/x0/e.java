package x0;

import android.view.View;
import com.example.navistart.SuperWidgets.WidgetBuilderFragment;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6448b;
    public final /* synthetic */ WidgetBuilderFragment c;

    public /* synthetic */ e(WidgetBuilderFragment widgetBuilderFragment, int i10) {
        this.f6448b = i10;
        this.c = widgetBuilderFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6448b) {
            case 0:
                WidgetBuilderFragment.Y(this.c, view);
                return;
            case 1:
                WidgetBuilderFragment.a0(this.c, view);
                return;
            case 2:
                WidgetBuilderFragment.A(this.c, view);
                return;
            case 3:
                WidgetBuilderFragment.R(this.c, view);
                return;
            case 4:
                WidgetBuilderFragment.W(this.c, view);
                return;
            case 5:
                WidgetBuilderFragment.F(this.c, view);
                return;
            case 6:
                WidgetBuilderFragment.w(this.c, view);
                return;
            default:
                WidgetBuilderFragment.D(this.c, view);
                return;
        }
    }
}
