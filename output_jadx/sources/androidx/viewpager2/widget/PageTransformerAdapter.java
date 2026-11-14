package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class PageTransformerAdapter extends ViewPager2.OnPageChangeCallback {
    private final LinearLayoutManager mLayoutManager;
    private ViewPager2.PageTransformer mPageTransformer;

    public PageTransformerAdapter(LinearLayoutManager linearLayoutManager) {
        this.mLayoutManager = linearLayoutManager;
    }

    public ViewPager2.PageTransformer getPageTransformer() {
        return this.mPageTransformer;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int i10, float f8, int i11) {
        if (this.mPageTransformer != null) {
            float f10 = -f8;
            for (int i12 = 0; i12 < this.mLayoutManager.getChildCount(); i12++) {
                View childAt = this.mLayoutManager.getChildAt(i12);
                if (childAt != null) {
                    this.mPageTransformer.transformPage(childAt, (this.mLayoutManager.getPosition(childAt) - i10) + f10);
                } else {
                    Locale locale = Locale.US;
                    throw new IllegalStateException("LayoutManager returned a null child at pos " + i12 + "/" + this.mLayoutManager.getChildCount() + " while transforming pages");
                }
            }
        }
    }

    public void setPageTransformer(@Nullable ViewPager2.PageTransformer pageTransformer) {
        this.mPageTransformer = pageTransformer;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i10) {
    }
}
