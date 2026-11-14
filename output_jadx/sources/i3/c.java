package i3;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import com.bumptech.glide.d;
import com.example.navistart.R;
import com.google.android.material.card.MaterialCardView;
import e4.h;
import z3.e;
import z3.k;
import z3.m;
import z3.n;
import z3.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: y, reason: collision with root package name */
    public static final double f2749y = Math.cos(Math.toRadians(45.0d));

    /* renamed from: z, reason: collision with root package name */
    public static final ColorDrawable f2750z;

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f2751a;
    public final k c;
    public final k d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f2753f;

    /* renamed from: g, reason: collision with root package name */
    public int f2754g;

    /* renamed from: h, reason: collision with root package name */
    public int f2755h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f2756i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2757j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f2758k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f2759l;

    /* renamed from: m, reason: collision with root package name */
    public o f2760m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f2761n;

    /* renamed from: o, reason: collision with root package name */
    public RippleDrawable f2762o;

    /* renamed from: p, reason: collision with root package name */
    public LayerDrawable f2763p;

    /* renamed from: q, reason: collision with root package name */
    public k f2764q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2765s;
    public ValueAnimator t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f2766u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2767v;
    public final int w;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f2752b = new Rect();
    public boolean r = false;

    /* renamed from: x, reason: collision with root package name */
    public float f2768x = 0.0f;

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        f2750z = colorDrawable;
    }

    public c(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f2751a = materialCardView;
        k kVar = new k(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.c = kVar;
        kVar.m(materialCardView.getContext());
        kVar.s();
        n g10 = kVar.c.f6749a.g();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, androidx.cardview.R.styleable.CardView, R.attr.materialCardViewStyle, androidx.cardview.R.style.CardView);
        if (obtainStyledAttributes.hasValue(androidx.cardview.R.styleable.CardView_cardCornerRadius)) {
            float dimension = obtainStyledAttributes.getDimension(androidx.cardview.R.styleable.CardView_cardCornerRadius, 0.0f);
            g10.e = new z3.a(dimension);
            g10.f6786f = new z3.a(dimension);
            g10.f6787g = new z3.a(dimension);
            g10.f6788h = new z3.a(dimension);
        }
        this.d = new k();
        h(g10.a());
        this.f2766u = d.r(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, b3.a.f340a);
        this.f2767v = d.q(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.w = d.q(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float b(a.a aVar, float f8) {
        if (aVar instanceof m) {
            return (float) ((1.0d - f2749y) * f8);
        }
        if (aVar instanceof e) {
            return f8 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        float a10;
        float a11;
        float a12;
        a.a aVar = this.f2760m.f6794a;
        k kVar = this.c;
        float b10 = b(aVar, kVar.k());
        a.a aVar2 = this.f2760m.f6795b;
        float[] fArr = kVar.D;
        if (fArr != null) {
            a10 = fArr[0];
        } else {
            a10 = kVar.c.f6749a.f6796f.a(kVar.h());
        }
        float max = Math.max(b10, b(aVar2, a10));
        a.a aVar3 = this.f2760m.c;
        float[] fArr2 = kVar.D;
        if (fArr2 != null) {
            a11 = fArr2[1];
        } else {
            a11 = kVar.c.f6749a.f6797g.a(kVar.h());
        }
        float b11 = b(aVar3, a11);
        a.a aVar4 = this.f2760m.d;
        float[] fArr3 = kVar.D;
        if (fArr3 != null) {
            a12 = fArr3[2];
        } else {
            a12 = kVar.c.f6749a.f6798h.a(kVar.h());
        }
        return Math.max(max, Math.max(b11, b(aVar4, a12)));
    }

    public final LayerDrawable c() {
        if (this.f2762o == null) {
            this.f2764q = new k(this.f2760m);
            this.f2762o = new RippleDrawable(this.f2758k, null, this.f2764q);
        }
        if (this.f2763p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f2762o, this.d, this.f2757j});
            this.f2763p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f2763p;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.graphics.drawable.InsetDrawable, i3.b] */
    public final b d(Drawable drawable) {
        int i10;
        int i11;
        float f8;
        MaterialCardView materialCardView = this.f2751a;
        if (materialCardView.getUseCompatPadding()) {
            float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
            float f10 = 0.0f;
            if (i()) {
                f8 = a();
            } else {
                f8 = 0.0f;
            }
            int ceil = (int) Math.ceil(maxCardElevation + f8);
            float maxCardElevation2 = materialCardView.getMaxCardElevation();
            if (i()) {
                f10 = a();
            }
            i10 = (int) Math.ceil(maxCardElevation2 + f10);
            i11 = ceil;
        } else {
            i10 = 0;
            i11 = 0;
        }
        return new InsetDrawable(drawable, i10, i11, i10, i11);
    }

    public final void e(int i10, int i11) {
        int i12;
        int i13;
        boolean z9;
        int i14;
        boolean z10;
        int i15;
        boolean z11;
        int i16;
        int i17;
        int i18;
        float f8;
        if (this.f2763p != null) {
            MaterialCardView materialCardView = this.f2751a;
            boolean z12 = false;
            if (materialCardView.getUseCompatPadding()) {
                float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
                float f10 = 0.0f;
                if (i()) {
                    f8 = a();
                } else {
                    f8 = 0.0f;
                }
                i12 = (int) Math.ceil((maxCardElevation + f8) * 2.0f);
                float maxCardElevation2 = materialCardView.getMaxCardElevation();
                if (i()) {
                    f10 = a();
                }
                i13 = (int) Math.ceil((maxCardElevation2 + f10) * 2.0f);
            } else {
                i12 = 0;
                i13 = 0;
            }
            int i19 = this.f2754g;
            if ((i19 & GravityCompat.END) == 8388613) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i20 = this.e;
            if (z9) {
                i14 = ((i10 - i20) - this.f2753f) - i13;
            } else {
                i14 = i20;
            }
            if ((i19 & 80) == 80) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i15 = i20;
            } else {
                i15 = ((i11 - i20) - this.f2753f) - i12;
            }
            if ((i19 & GravityCompat.END) == 8388613) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i16 = i20;
            } else {
                i16 = ((i10 - i20) - this.f2753f) - i13;
            }
            if ((i19 & 80) == 80) {
                z12 = true;
            }
            if (z12) {
                i20 = ((i11 - i20) - this.f2753f) - i12;
            }
            int i21 = i20;
            if (materialCardView.getLayoutDirection() == 1) {
                i18 = i16;
                i17 = i14;
            } else {
                i17 = i16;
                i18 = i14;
            }
            this.f2763p.setLayerInset(2, i18, i21, i17, i15);
        }
    }

    public final void f(boolean z9, boolean z10) {
        int i10;
        Drawable drawable = this.f2757j;
        if (drawable != null) {
            int i11 = 0;
            float f8 = 0.0f;
            if (z10) {
                if (z9) {
                    f8 = 1.0f;
                }
                float f10 = this.f2768x;
                if (z9) {
                    f10 = 1.0f - f10;
                }
                ValueAnimator valueAnimator = this.t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.t = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f2768x, f8);
                this.t = ofFloat;
                ofFloat.addUpdateListener(new h(1, this));
                this.t.setInterpolator(this.f2766u);
                ValueAnimator valueAnimator2 = this.t;
                if (z9) {
                    i10 = this.f2767v;
                } else {
                    i10 = this.w;
                }
                valueAnimator2.setDuration(i10 * f10);
                this.t.start();
                return;
            }
            if (z9) {
                i11 = 255;
            }
            drawable.setAlpha(i11);
            if (z9) {
                f8 = 1.0f;
            }
            this.f2768x = f8;
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = DrawableCompat.wrap(drawable).mutate();
            this.f2757j = mutate;
            mutate.setTintList(this.f2759l);
            f(this.f2751a.d, false);
        } else {
            this.f2757j = f2750z;
        }
        LayerDrawable layerDrawable = this.f2763p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f2757j);
        }
    }

    public final void h(o oVar) {
        this.f2760m = oVar;
        k kVar = this.c;
        kVar.setShapeAppearanceModel(oVar);
        kVar.f6781y = !kVar.n();
        k kVar2 = this.d;
        if (kVar2 != null) {
            kVar2.setShapeAppearanceModel(oVar);
        }
        k kVar3 = this.f2764q;
        if (kVar3 != null) {
            kVar3.setShapeAppearanceModel(oVar);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f2751a;
        if (materialCardView.getPreventCornerOverlap() && this.c.n() && materialCardView.getUseCompatPadding()) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        View view = this.f2751a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable;
        Drawable drawable2 = this.f2756i;
        if (j()) {
            drawable = c();
        } else {
            drawable = this.d;
        }
        this.f2756i = drawable;
        if (drawable2 != drawable) {
            MaterialCardView materialCardView = this.f2751a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawable);
            } else {
                materialCardView.setForeground(d(drawable));
            }
        }
    }

    public final void l() {
        float f8;
        MaterialCardView materialCardView = this.f2751a;
        float f10 = 0.0f;
        if ((materialCardView.getPreventCornerOverlap() && !this.c.n()) || i()) {
            f8 = a();
        } else {
            f8 = 0.0f;
        }
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            f10 = (float) ((1.0d - f2749y) * materialCardView.getCardViewRadius());
        }
        int i10 = (int) (f8 - f10);
        Rect rect = this.f2752b;
        materialCardView.b(rect.left + i10, rect.top + i10, rect.right + i10, rect.bottom + i10);
    }

    public final void m() {
        boolean z9 = this.r;
        MaterialCardView materialCardView = this.f2751a;
        if (!z9) {
            materialCardView.setBackgroundInternal(d(this.c));
        }
        materialCardView.setForeground(d(this.f2756i));
    }
}
