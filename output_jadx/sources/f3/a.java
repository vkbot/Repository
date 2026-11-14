package f3;

import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar$Behavior f2266a;

    public a(BottomAppBar$Behavior bottomAppBar$Behavior) {
        this.f2266a = bottomAppBar$Behavior;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (this.f2266a.f1220l.get() == null) {
            view.removeOnLayoutChangeListener(this);
        } else {
            n0.b.a();
        }
    }
}
