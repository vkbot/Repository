package g3;

import android.os.SystemClock;
import android.view.View;
import androidx.core.math.MathUtils;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends ViewDragHelper.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f2445a;

    public c(BottomSheetBehavior bottomSheetBehavior) {
        this.f2445a = bottomSheetBehavior;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int clampViewPositionHorizontal(View view, int i10, int i11) {
        return view.getLeft();
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int clampViewPositionVertical(View view, int i10, int i11) {
        return MathUtils.clamp(i10, this.f2445a.g(), getViewVerticalDragRange(view));
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int getViewVerticalDragRange(View view) {
        BottomSheetBehavior bottomSheetBehavior = this.f2445a;
        if (bottomSheetBehavior.I) {
            return bottomSheetBehavior.V;
        }
        return bottomSheetBehavior.G;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewDragStateChanged(int i10) {
        if (i10 == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f2445a;
            if (bottomSheetBehavior.K) {
                bottomSheetBehavior.l(1);
            }
        }
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
        this.f2445a.d(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r7 > r4.E) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.g()) < java.lang.Math.abs(r6.getTop() - r4.E)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        if (java.lang.Math.abs(r7 - r4.E) < java.lang.Math.abs(r7 - r4.G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
    
        if (java.lang.Math.abs(r7 - r4.D) < java.lang.Math.abs(r7 - r4.G)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r7 < java.lang.Math.abs(r7 - r4.G)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
    
        if (java.lang.Math.abs(r7 - r8) < java.lang.Math.abs(r7 - r4.G)) goto L50;
     */
    @Override // androidx.customview.widget.ViewDragHelper.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewReleased(android.view.View r6, float r7, float r8) {
        /*
            r5 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 6
            r3 = 3
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r5.f2445a
            if (r1 >= 0) goto L1d
            boolean r7 = r4.f1223b
            if (r7 == 0) goto L10
        Ld:
            r2 = r3
            goto Ld4
        L10:
            int r7 = r6.getTop()
            android.os.SystemClock.uptimeMillis()
            int r8 = r4.E
            if (r7 <= r8) goto Ld
            goto Ld4
        L1d:
            boolean r1 = r4.I
            if (r1 == 0) goto L6c
            boolean r1 = r4.m(r6, r8)
            if (r1 == 0) goto L6c
            float r7 = java.lang.Math.abs(r7)
            float r0 = java.lang.Math.abs(r8)
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L3a
            int r7 = r4.d
            float r7 = (float) r7
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 > 0) goto L49
        L3a:
            int r7 = r6.getTop()
            int r8 = r4.V
            int r0 = r4.g()
            int r0 = r0 + r8
            int r0 = r0 / 2
            if (r7 <= r0) goto L4c
        L49:
            r2 = 5
            goto Ld4
        L4c:
            boolean r7 = r4.f1223b
            if (r7 == 0) goto L51
            goto Ld
        L51:
            int r7 = r6.getTop()
            int r8 = r4.g()
            int r7 = r7 - r8
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6.getTop()
            int r0 = r4.E
            int r8 = r8 - r0
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto Ld4
            goto Ld
        L6c:
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 4
            if (r0 == 0) goto L9a
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L7e
            goto L9a
        L7e:
            boolean r7 = r4.f1223b
            if (r7 == 0) goto L84
        L82:
            r2 = r1
            goto Ld4
        L84:
            int r7 = r6.getTop()
            int r8 = r4.E
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r4.G
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L82
            goto Ld4
        L9a:
            int r7 = r6.getTop()
            boolean r8 = r4.f1223b
            if (r8 == 0) goto Lb5
            int r8 = r4.D
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r4.G
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L82
            goto Ld
        Lb5:
            int r8 = r4.E
            if (r7 >= r8) goto Lc5
            int r8 = r4.G
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto Ld4
            goto Ld
        Lc5:
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r0 = r4.G
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L82
        Ld4:
            r7 = 1
            r4.n(r6, r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.c.onViewReleased(android.view.View, float, float):void");
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final boolean tryCaptureView(View view, int i10) {
        View view2;
        BottomSheetBehavior bottomSheetBehavior = this.f2445a;
        int i11 = bottomSheetBehavior.N;
        if (i11 != 1 && !bottomSheetBehavior.f1225c0) {
            if (i11 == 3 && bottomSheetBehavior.f1222a0 == i10) {
                WeakReference weakReference = bottomSheetBehavior.X;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            SystemClock.uptimeMillis();
            WeakReference weakReference2 = bottomSheetBehavior.W;
            if (weakReference2 != null && weakReference2.get() == view) {
                return true;
            }
            return false;
        }
        return false;
    }
}
