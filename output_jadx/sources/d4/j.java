package d4;

import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j implements ViewPager.OnPageChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f1810a;

    /* renamed from: b, reason: collision with root package name */
    public int f1811b;
    public int c;

    public j(TabLayout tabLayout) {
        this.f1810a = new WeakReference(tabLayout);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i10) {
        this.f1811b = this.c;
        this.c = i10;
        TabLayout tabLayout = (TabLayout) this.f1810a.get();
        if (tabLayout != null) {
            tabLayout.W = this.c;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i10, float f8, int i11) {
        boolean z9;
        TabLayout tabLayout = (TabLayout) this.f1810a.get();
        if (tabLayout != null) {
            int i12 = this.c;
            boolean z10 = true;
            if (i12 == 2 && this.f1811b != 1) {
                z9 = true;
                z10 = false;
            } else {
                z9 = true;
            }
            if (i12 == 2 && this.f1811b == 0) {
                z9 = false;
            }
            tabLayout.n(i10, f8, z10, z9, false);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i10) {
        boolean z9;
        i iVar;
        TabLayout tabLayout = (TabLayout) this.f1810a.get();
        if (tabLayout != null && tabLayout.getSelectedTabPosition() != i10 && i10 < tabLayout.getTabCount()) {
            int i11 = this.c;
            if (i11 != 0 && (i11 != 2 || this.f1811b != 0)) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (i10 >= 0 && i10 < tabLayout.getTabCount()) {
                iVar = (i) tabLayout.c.get(i10);
            } else {
                iVar = null;
            }
            tabLayout.l(iVar, z9);
        }
    }
}
