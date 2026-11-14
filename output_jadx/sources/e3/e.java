package e3;

import android.support.v4.media.h;
import android.view.View;
import android.view.ViewParent;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends ViewDragHelper.Callback {

    /* renamed from: a, reason: collision with root package name */
    public int f2111a;

    /* renamed from: b, reason: collision with root package name */
    public int f2112b = -1;
    public final /* synthetic */ SwipeDismissBehavior c;

    public e(SwipeDismissBehavior swipeDismissBehavior) {
        this.c = swipeDismissBehavior;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int clampViewPositionHorizontal(View view, int i10, int i11) {
        boolean z9;
        int width;
        int width2;
        if (view.getLayoutDirection() == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i12 = this.c.e;
        if (i12 == 0) {
            width = this.f2111a;
            if (z9) {
                width -= view.getWidth();
                width2 = this.f2111a;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i13 = this.f2111a;
            if (i12 == 1) {
                if (z9) {
                    width2 = view.getWidth() + i13;
                    width = i13;
                } else {
                    width = i13 - view.getWidth();
                    width2 = this.f2111a;
                }
            } else {
                width = i13 - view.getWidth();
                width2 = view.getWidth() + this.f2111a;
            }
        }
        return Math.min(Math.max(width, i10), width2);
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int clampViewPositionVertical(View view, int i10, int i11) {
        return view.getTop();
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int getViewHorizontalDragRange(View view) {
        return view.getWidth();
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewCaptured(View view, int i10) {
        this.f2112b = i10;
        this.f2111a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.c;
            swipeDismissBehavior.d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.d = false;
        }
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewDragStateChanged(int i10) {
        if (this.c.f1215b != null) {
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2) {
                    h.j().p(null);
                    return;
                }
                return;
            }
            h.j().t(null);
        }
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        float f8 = width * swipeDismissBehavior.f1217g;
        float width2 = view.getWidth() * swipeDismissBehavior.f1218h;
        float abs = Math.abs(i10 - this.f2111a);
        if (abs <= f8) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f8) / (width2 - f8))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x004e, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f2111a) >= java.lang.Math.round(r9.getWidth() * r3.f1216f)) goto L27;
     */
    @Override // androidx.customview.widget.ViewDragHelper.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewReleased(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f2112b = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.c
            r4 = 1
            if (r1 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L18
            r5 = r4
            goto L19
        L18:
            r5 = r2
        L19:
            int r6 = r3.e
            r7 = 2
            if (r6 != r7) goto L1f
            goto L50
        L1f:
            if (r6 != 0) goto L2b
            if (r5 == 0) goto L28
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L28:
            if (r1 <= 0) goto L65
            goto L50
        L2b:
            if (r6 != r4) goto L65
            if (r5 == 0) goto L32
            if (r1 <= 0) goto L65
            goto L50
        L32:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L37:
            int r1 = r9.getLeft()
            int r5 = r8.f2111a
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            float r6 = r3.f1216f
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L65
        L50:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5f
            int r10 = r9.getLeft()
            int r0 = r8.f2111a
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L63
        L5f:
            int r10 = r8.f2111a
            int r0 = r10 - r11
        L63:
            r2 = r4
            goto L67
        L65:
            int r0 = r8.f2111a
        L67:
            androidx.customview.widget.ViewDragHelper r10 = r3.f1214a
            int r11 = r9.getTop()
            boolean r10 = r10.settleCapturedViewAt(r0, r11)
            if (r10 == 0) goto L7d
            e3.g r10 = new e3.g
            r11 = 0
            r10.<init>(r3, r9, r2, r11)
            r9.postOnAnimation(r10)
            return
        L7d:
            if (r2 == 0) goto L86
            b4.f r10 = r3.f1215b
            if (r10 == 0) goto L86
            r10.a(r9)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.e.onViewReleased(android.view.View, float, float):void");
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final boolean tryCaptureView(View view, int i10) {
        int i11 = this.f2112b;
        if ((i11 == -1 || i11 == i10) && this.c.a(view)) {
            return true;
        }
        return false;
    }
}
