package e0;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.example.navistart.ModernMainActivity;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class q1 implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2007b;

    public /* synthetic */ q1(int i10, Object obj) {
        this.f2006a = i10;
        this.f2007b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = this.f2006a;
        Object obj = this.f2007b;
        switch (i18) {
            case 0:
                String str = ModernMainActivity.B1;
                ((ModernMainActivity) obj).R(i12 - i10, i13 - i11);
                return;
            case 1:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i12 - i10 != i16 - i14 || i13 - i11 != i17 - i15) {
                    view.post(new f5.j(6, carouselLayoutManager));
                    return;
                }
                return;
            default:
                GridLayoutManager gridLayoutManager = (GridLayoutManager) obj;
                int max = Math.max(1, (int) ((i12 - i10) / (view.getResources().getDisplayMetrics().density * 220.0f)));
                if (max != gridLayoutManager.getSpanCount()) {
                    gridLayoutManager.setSpanCount(max);
                    return;
                }
                return;
        }
    }
}
