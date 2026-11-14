package d4;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c implements ViewPager.OnAdapterChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TabLayout f1800b;

    public c(TabLayout tabLayout) {
        this.f1800b = tabLayout;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
    public final void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        TabLayout tabLayout = this.f1800b;
        if (tabLayout.Q == viewPager) {
            tabLayout.m(pagerAdapter2, this.f1799a);
        }
    }
}
