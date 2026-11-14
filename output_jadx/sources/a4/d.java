package a4;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.math.MathUtils;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d extends ViewDragHelper.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f31a;

    public d(SideSheetBehavior sideSheetBehavior) {
        this.f31a = sideSheetBehavior;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int clampViewPositionHorizontal(View view, int i10, int i11) {
        SideSheetBehavior sideSheetBehavior = this.f31a;
        return MathUtils.clamp(i10, sideSheetBehavior.f1400a.m(), sideSheetBehavior.f1400a.l());
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int clampViewPositionVertical(View view, int i10, int i11) {
        return view.getTop();
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final int getViewHorizontalDragRange(View view) {
        SideSheetBehavior sideSheetBehavior = this.f31a;
        return sideSheetBehavior.f1408l + sideSheetBehavior.f1411o;
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewDragStateChanged(int i10) {
        if (i10 == 1) {
            SideSheetBehavior sideSheetBehavior = this.f31a;
            if (sideSheetBehavior.f1403g) {
                sideSheetBehavior.a(1);
            }
        }
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SideSheetBehavior sideSheetBehavior = this.f31a;
        WeakReference weakReference = sideSheetBehavior.f1413q;
        if (weakReference != null) {
            view2 = (View) weakReference.get();
        } else {
            view2 = null;
        }
        if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
            sideSheetBehavior.f1400a.C(marginLayoutParams, view.getLeft(), view.getRight());
            view2.setLayoutParams(marginLayoutParams);
        }
        LinkedHashSet linkedHashSet = sideSheetBehavior.f1415u;
        if (!linkedHashSet.isEmpty()) {
            sideSheetBehavior.f1400a.b(i10);
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw com.bumptech.glide.g.b(it);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (java.lang.Math.abs(r4 - r0.f1400a.j()) < java.lang.Math.abs(r4 - r0.f1400a.k())) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r0.f1400a.t(r3) == false) goto L19;
     */
    @Override // androidx.customview.widget.ViewDragHelper.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewReleased(android.view.View r3, float r4, float r5) {
        /*
            r2 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r2.f31a
            b1.u r1 = r0.f1400a
            boolean r1 = r1.s(r4)
            if (r1 == 0) goto Lb
            goto L53
        Lb:
            b1.u r1 = r0.f1400a
            boolean r1 = r1.x(r3, r4)
            if (r1 == 0) goto L24
            b1.u r1 = r0.f1400a
            boolean r4 = r1.u(r4, r5)
            if (r4 != 0) goto L55
            b1.u r4 = r0.f1400a
            boolean r4 = r4.t(r3)
            if (r4 == 0) goto L53
            goto L55
        L24:
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L36
            float r4 = java.lang.Math.abs(r4)
            float r5 = java.lang.Math.abs(r5)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L36
            goto L55
        L36:
            int r4 = r3.getLeft()
            b1.u r5 = r0.f1400a
            int r5 = r5.j()
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            b1.u r1 = r0.f1400a
            int r1 = r1.k()
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r5 >= r4) goto L55
        L53:
            r4 = 3
            goto L56
        L55:
            r4 = 5
        L56:
            r5 = 1
            r0.c(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.d.onViewReleased(android.view.View, float, float):void");
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final boolean tryCaptureView(View view, int i10) {
        WeakReference weakReference;
        SideSheetBehavior sideSheetBehavior = this.f31a;
        if (sideSheetBehavior.f1404h != 1 && (weakReference = sideSheetBehavior.f1412p) != null && weakReference.get() == view) {
            return true;
        }
        return false;
    }
}
