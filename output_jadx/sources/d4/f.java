package d4;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TabLayout f1801a;

    public f(TabLayout tabLayout) {
        this.f1801a = tabLayout;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f1801a.j();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f1801a.j();
    }
}
