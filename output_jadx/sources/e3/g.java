package e3;

import android.view.View;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.behavior.SwipeDismissBehavior;
import o7.g1;
import o7.k1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2114b;
    public final boolean c;
    public final Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g(Object obj, Object obj2, boolean z9, int i10) {
        this.f2114b = i10;
        this.e = obj;
        this.d = obj2;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b4.f fVar;
        switch (this.f2114b) {
            case 0:
                View view = (View) this.d;
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.e;
                ViewDragHelper viewDragHelper = swipeDismissBehavior.f1214a;
                if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                    view.postOnAnimation(this);
                    return;
                } else {
                    if (this.c && (fVar = swipeDismissBehavior.f1215b) != null) {
                        fVar.a(view);
                        return;
                    }
                    return;
                }
            default:
                ((k1) this.e).t.d((g1) this.d, this.c);
                return;
        }
    }
}
