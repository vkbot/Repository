package g3;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2442b;
    public final /* synthetic */ int c;
    public final /* synthetic */ BottomSheetBehavior d;

    public a(BottomSheetBehavior bottomSheetBehavior, View view, int i10) {
        this.d = bottomSheetBehavior;
        this.f2442b = view;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.n(this.f2442b, this.c, false);
    }
}
