package h4;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2578b;
    public final /* synthetic */ int c;
    public final /* synthetic */ q3.a d;
    public final /* synthetic */ ExpandableBehavior e;

    public a(ExpandableBehavior expandableBehavior, View view, int i10, q3.a aVar) {
        this.e = expandableBehavior;
        this.f2578b = view;
        this.c = i10;
        this.d = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f2578b;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.e;
        if (expandableBehavior.f1520a == this.c) {
            Object obj = this.d;
            expandableBehavior.a((View) obj, view, ((FloatingActionButton) obj).f1369p.c, false);
        }
        return false;
    }
}
