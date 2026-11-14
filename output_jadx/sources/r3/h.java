package r3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.util.Preconditions;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import com.example.navistart.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import n.p;
import z3.o;
import z3.z;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public o f5376a;

    /* renamed from: b, reason: collision with root package name */
    public g f5377b;
    public RippleDrawable c;
    public b d;
    public RippleDrawable e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5378f;

    /* renamed from: h, reason: collision with root package name */
    public float f5380h;

    /* renamed from: i, reason: collision with root package name */
    public float f5381i;

    /* renamed from: j, reason: collision with root package name */
    public float f5382j;

    /* renamed from: k, reason: collision with root package name */
    public int f5383k;

    /* renamed from: l, reason: collision with root package name */
    public StateListAnimator f5384l;

    /* renamed from: m, reason: collision with root package name */
    public Animator f5385m;

    /* renamed from: n, reason: collision with root package name */
    public b3.e f5386n;

    /* renamed from: o, reason: collision with root package name */
    public b3.e f5387o;

    /* renamed from: q, reason: collision with root package name */
    public int f5389q;

    /* renamed from: s, reason: collision with root package name */
    public final FloatingActionButton f5390s;
    public final p t;

    /* renamed from: y, reason: collision with root package name */
    public static final FastOutLinearInInterpolator f5374y = b3.a.c;

    /* renamed from: z, reason: collision with root package name */
    public static final int f5375z = R.attr.motionDurationLong2;
    public static final int A = R.attr.motionEasingEmphasizedInterpolator;
    public static final int B = R.attr.motionDurationMedium1;
    public static final int C = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] D = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] E = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] F = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] G = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] H = {android.R.attr.state_enabled};
    public static final int[] I = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f5379g = true;

    /* renamed from: p, reason: collision with root package name */
    public float f5388p = 1.0f;
    public int r = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f5391u = new Rect();

    /* renamed from: v, reason: collision with root package name */
    public final RectF f5392v = new RectF();
    public final RectF w = new RectF();

    /* renamed from: x, reason: collision with root package name */
    public final Matrix f5393x = new Matrix();

    public h(FloatingActionButton floatingActionButton, p pVar) {
        this.f5390s = floatingActionButton;
        this.t = pVar;
    }

    public final void a(float f8, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f5390s.getDrawable();
        if (drawable != null && this.f5389q != 0) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            RectF rectF = this.f5392v;
            rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            float f10 = this.f5389q;
            RectF rectF2 = this.w;
            rectF2.set(0.0f, 0.0f, f10, f10);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            float f11 = this.f5389q / 2.0f;
            matrix.postScale(f8, f8, f11, f11);
        }
    }

    public final AnimatorSet b(b3.e eVar, float f8, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f8};
        FloatingActionButton floatingActionButton = this.f5390s;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        eVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f10);
        eVar.d("scale").a(ofFloat2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26) {
            ofFloat2.setEvaluator(new f());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f10);
        eVar.d("scale").a(ofFloat3);
        if (i10 == 26) {
            ofFloat3.setEvaluator(new f());
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.f5393x;
        a(f11, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new b3.d(), new e(this), new Matrix(matrix));
        eVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        b3.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(final float f8, int i10, int i11, final float f10, final float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f5390s;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f12 = this.f5388p;
        final Matrix matrix = new Matrix(this.f5393x);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r3.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h hVar = h.this;
                FloatingActionButton floatingActionButton2 = hVar.f5390s;
                floatingActionButton2.setAlpha(b3.a.b(alpha, f8, 0.0f, 0.2f, floatValue));
                float f13 = scaleX;
                float f14 = f10;
                floatingActionButton2.setScaleX(b3.a.a(f13, f14, floatValue));
                floatingActionButton2.setScaleY(b3.a.a(scaleY, f14, floatValue));
                float f15 = f12;
                float f16 = f11;
                hVar.f5388p = b3.a.a(f15, f16, floatValue);
                float a10 = b3.a.a(f15, f16, floatValue);
                Matrix matrix2 = matrix;
                hVar.a(a10, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(ofFloat);
        b3.b.a(animatorSet, arrayList);
        animatorSet.setDuration(com.bumptech.glide.d.q(floatingActionButton.getContext(), i10, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(com.bumptech.glide.d.r(floatingActionButton.getContext(), i11, b3.a.f341b));
        return animatorSet;
    }

    public final AnimatorSet d(float f8, float f10) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f8};
        FloatingActionButton floatingActionButton = this.f5390s;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f10).setDuration(100L));
        animatorSet.setInterpolator(f5374y);
        return animatorSet;
    }

    public final void e(float f8, float f10, float f11) {
        FloatingActionButton floatingActionButton = this.f5390s;
        if (floatingActionButton.getStateListAnimator() == this.f5384l) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(D, d(f8, f11));
            stateListAnimator.addState(E, d(f8, f10));
            stateListAnimator.addState(F, d(f8, f10));
            stateListAnimator.addState(G, d(f8, f10));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f8).setDuration(0L));
            if (Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(f5374y);
            stateListAnimator.addState(H, animatorSet);
            stateListAnimator.addState(I, d(0.0f, 0.0f));
            this.f5384l = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (!((FloatingActionButton) this.t.c).f1365l && (!this.f5378f || floatingActionButton.getSizeDimension() >= this.f5383k)) {
            return;
        }
        h();
    }

    public final void g(o oVar) {
        this.f5376a = oVar;
        g gVar = this.f5377b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(oVar);
        }
        Drawable.Callback callback = this.c;
        if (callback instanceof z) {
            ((z) callback).setShapeAppearanceModel(oVar);
        }
        b bVar = this.d;
        if (bVar != null) {
            bVar.f5363o = oVar;
            bVar.invalidateSelf();
        }
    }

    public final void h() {
        float f8;
        p pVar = this.t;
        FloatingActionButton floatingActionButton = (FloatingActionButton) pVar.c;
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) pVar.c;
        boolean z9 = floatingActionButton.f1365l;
        boolean z10 = this.f5378f;
        Rect rect = this.f5391u;
        FloatingActionButton floatingActionButton3 = this.f5390s;
        int i10 = 0;
        if (z9) {
            if (z10) {
                i10 = Math.max((this.f5383k - floatingActionButton3.getSizeDimension()) / 2, 0);
            }
            if (this.f5379g) {
                f8 = floatingActionButton3.getElevation() + this.f5382j;
            } else {
                f8 = 0.0f;
            }
            int max = Math.max(i10, (int) Math.ceil(f8));
            int max2 = Math.max(i10, (int) Math.ceil(f8 * 1.5f));
            rect.set(max, max2, max, max2);
        } else {
            if (z10) {
                int sizeDimension = floatingActionButton3.getSizeDimension();
                int i11 = this.f5383k;
                if (sizeDimension < i11) {
                    int sizeDimension2 = (i11 - floatingActionButton3.getSizeDimension()) / 2;
                    rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                }
            }
            rect.set(0, 0, 0, 0);
        }
        Preconditions.checkNotNull(this.e, "Didn't initialize content background");
        if (((FloatingActionButton) pVar.c).f1365l || (this.f5378f && floatingActionButton3.getSizeDimension() < this.f5383k)) {
            super/*android.view.View*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            RippleDrawable rippleDrawable = this.e;
            if (rippleDrawable != null) {
                super/*android.view.View*/.setBackgroundDrawable(rippleDrawable);
            }
        }
        int i12 = rect.left;
        int i13 = rect.top;
        int i14 = rect.right;
        int i15 = rect.bottom;
        floatingActionButton2.f1366m.set(i12, i13, i14, i15);
        int i16 = floatingActionButton2.f1363j;
        floatingActionButton2.setPadding(i12 + i16, i13 + i16, i14 + i16, i15 + i16);
    }

    public final void f() {
    }
}
