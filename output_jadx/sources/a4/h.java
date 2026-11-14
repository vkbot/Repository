package a4;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.m;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35a;

    /* renamed from: b, reason: collision with root package name */
    public int f36b;
    public boolean c;
    public final Runnable d;
    public final /* synthetic */ CoordinatorLayout.Behavior e;

    public h(BottomSheetBehavior bottomSheetBehavior) {
        this.f35a = 1;
        this.e = bottomSheetBehavior;
        this.d = new m(5, this);
    }

    public final void a(int i10) {
        switch (this.f35a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                WeakReference weakReference = sideSheetBehavior.f1412p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f36b = i10;
                    if (!this.c) {
                        ((View) sideSheetBehavior.f1412p.get()).postOnAnimation((g) this.d);
                        this.c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                WeakReference weakReference2 = bottomSheetBehavior.W;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f36b = i10;
                    if (!this.c) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation((m) this.d);
                        this.c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public h(SideSheetBehavior sideSheetBehavior) {
        this.f35a = 0;
        this.e = sideSheetBehavior;
        this.d = new g(0, this);
    }
}
