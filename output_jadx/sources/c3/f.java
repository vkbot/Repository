package c3;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class f extends h {
    public e c;
    public OverScroller d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public int f515f;

    /* renamed from: g, reason: collision with root package name */
    public int f516g;

    /* renamed from: h, reason: collision with root package name */
    public int f517h;

    /* renamed from: i, reason: collision with root package name */
    public VelocityTracker f518i;

    public abstract int c();

    public abstract int d(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);

    public final void e(CoordinatorLayout coordinatorLayout, View view, int i10) {
        d(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z9;
        View view2;
        int findPointerIndex;
        if (this.f517h < 0) {
            this.f517h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.e) {
            int i10 = this.f515f;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y9 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y9 - this.f516g) > this.f517h) {
                this.f516g = y9;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f515f = -1;
            int x9 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).f1187n;
            if ((weakReference == null || ((view2 = (View) weakReference.get()) != null && view2.isShown() && !view2.canScrollVertically(-1))) && coordinatorLayout.isPointInChildBounds(view, x9, y10)) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.e = z9;
            if (z9) {
                this.f516g = y10;
                this.f515f = motionEvent.getPointerId(0);
                if (this.f518i == null) {
                    this.f518i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f518i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00eb  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r21, android.view.View r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.f.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }
}
