package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.media.h;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b3.a;
import b3.b;
import b3.c;
import b3.e;
import b3.f;
import com.example.navistart.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import j1.i;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c;
    public final RectF d;
    public final RectF e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f1522f;

    /* renamed from: g, reason: collision with root package name */
    public float f1523g;

    /* renamed from: h, reason: collision with root package name */
    public float f1524h;

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f1522f = new int[2];
    }

    public static Pair c(float f8, float f10, boolean z9, h hVar) {
        f d;
        f d10;
        if (f8 != 0.0f && f10 != 0.0f) {
            if ((z9 && f10 < 0.0f) || (!z9 && f10 > 0.0f)) {
                d = ((e) hVar.c).d("translationXCurveUpwards");
                d10 = ((e) hVar.c).d("translationYCurveUpwards");
            } else {
                d = ((e) hVar.c).d("translationXCurveDownwards");
                d10 = ((e) hVar.c).d("translationYCurveDownwards");
            }
        } else {
            d = ((e) hVar.c).d("translationXLinear");
            d10 = ((e) hVar.c).d("translationYLinear");
        }
        return new Pair(d, d10);
    }

    public static float f(h hVar, f fVar, float f8) {
        long j10 = fVar.f346a;
        long j11 = fVar.f347b;
        f d = ((e) hVar.c).d("expansion");
        return a.a(f8, 0.0f, fVar.b().getInterpolation(((float) (((d.f346a + d.f347b) + 17) - j10)) / ((float) j11)));
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet b(View view, View view2, boolean z9, boolean z10) {
        ObjectAnimator ofFloat;
        int i10;
        float f8;
        ObjectAnimator ofFloat2;
        ObjectAnimator ofFloat3;
        ObjectAnimator ofFloat4;
        h h2 = h(view2.getContext(), z9);
        if (z9) {
            this.f1523g = view.getTranslationX();
            this.f1524h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float elevation = view2.getElevation() - view.getElevation();
        if (z9) {
            if (!z10) {
                view2.setTranslationZ(-elevation);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        ((e) h2.c).d("elevation").a(ofFloat);
        arrayList.add(ofFloat);
        float d = d(view, view2, (c5.e) h2.d);
        float e = e(view, view2, (c5.e) h2.d);
        Pair c = c(d, e, z9, h2);
        f fVar = (f) c.first;
        f fVar2 = (f) c.second;
        RectF rectF = this.d;
        if (z9) {
            if (!z10) {
                view2.setTranslationX(-d);
                view2.setTranslationY(-e);
            }
            i10 = 0;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            f8 = 0.0f;
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float f10 = f(h2, fVar, -d);
            float f11 = f(h2, fVar2, -e);
            Rect rect = this.c;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.e;
            g(view2, rectF2);
            rectF2.offset(f10, f11);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
        } else {
            i10 = 0;
            f8 = 0.0f;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -d);
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -e);
        }
        fVar.a(ofFloat2);
        fVar2.a(ofFloat3);
        arrayList.add(ofFloat2);
        arrayList.add(ofFloat3);
        rectF.width();
        rectF.height();
        float d10 = d(view, view2, (c5.e) h2.d);
        float e6 = e(view, view2, (c5.e) h2.d);
        Pair c10 = c(d10, e6, z9, h2);
        f fVar3 = (f) c10.first;
        f fVar4 = (f) c10.second;
        Property property = View.TRANSLATION_X;
        if (!z9) {
            d10 = this.f1523g;
        }
        float[] fArr = new float[1];
        fArr[i10] = d10;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        if (!z9) {
            e6 = this.f1524h;
        }
        float[] fArr2 = new float[1];
        fArr2[i10] = e6;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        fVar3.a(ofFloat5);
        fVar4.a(ofFloat6);
        arrayList.add(ofFloat5);
        arrayList.add(ofFloat6);
        boolean z11 = view2 instanceof ViewGroup;
        if (z11) {
            View findViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = null;
            if (findViewById != null) {
                if (findViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) findViewById;
                }
            } else if (z11) {
                viewGroup = (ViewGroup) view2;
            }
            if (viewGroup != null) {
                if (z9) {
                    if (!z10) {
                        c.f342a.set(viewGroup, Float.valueOf(f8));
                    }
                    c cVar = c.f342a;
                    float[] fArr3 = new float[1];
                    fArr3[i10] = 1.0f;
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, cVar, fArr3);
                } else {
                    c cVar2 = c.f342a;
                    float[] fArr4 = new float[1];
                    fArr4[i10] = f8;
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, cVar2, fArr4);
                }
                ((e) h2.c).d("contentFade").a(ofFloat4);
                arrayList.add(ofFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        b.a(animatorSet, arrayList);
        animatorSet.addListener(new h4.b(z9, view2, view));
        int size = arrayList2.size();
        for (int i11 = i10; i11 < size; i11++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i11));
        }
        return animatorSet;
    }

    public final float d(View view, View view2, c5.e eVar) {
        RectF rectF = this.d;
        g(view, rectF);
        rectF.offset(this.f1523g, this.f1524h);
        RectF rectF2 = this.e;
        g(view2, rectF2);
        eVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float e(View view, View view2, c5.e eVar) {
        RectF rectF = this.d;
        g(view, rectF);
        rectF.offset(this.f1523g, this.f1524h);
        RectF rectF2 = this.e;
        g(view2, rectF2);
        eVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void g(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f1522f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract h h(Context context, boolean z9);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (!(view2 instanceof FloatingActionButton)) {
                return false;
            }
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint != 0 && expandedComponentIdHint != view.getId()) {
                return false;
            }
            return true;
        }
        i.l("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        if (layoutParams.dodgeInsetEdges == 0) {
            layoutParams.dodgeInsetEdges = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f1522f = new int[2];
    }
}
