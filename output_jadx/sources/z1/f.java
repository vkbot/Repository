package z1;

import android.animation.ValueAnimator;
import android.graphics.Color;
import com.github.clans.fab.FloatingActionMenu;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6706b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ FloatingActionMenu e;

    public /* synthetic */ f(FloatingActionMenu floatingActionMenu, int i10, int i11, int i12, int i13) {
        this.f6705a = i13;
        this.e = floatingActionMenu;
        this.f6706b = i10;
        this.c = i11;
        this.d = i12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6705a) {
            case 0:
                this.e.setBackgroundColor(Color.argb(((Integer) valueAnimator.getAnimatedValue()).intValue(), this.f6706b, this.c, this.d));
                return;
            default:
                this.e.setBackgroundColor(Color.argb(((Integer) valueAnimator.getAnimatedValue()).intValue(), this.f6706b, this.c, this.d));
                return;
        }
    }
}
