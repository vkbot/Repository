package h3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.dynamicanimation.animation.SpringForce;
import com.example.navistart.R;
import com.google.android.material.button.MaterialButton;
import z3.b0;
import z3.i;
import z3.k;
import z3.o;
import z3.z;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f2560a;

    /* renamed from: b, reason: collision with root package name */
    public o f2561b;
    public b0 c;
    public SpringForce d;
    public i e;

    /* renamed from: f, reason: collision with root package name */
    public int f2562f;

    /* renamed from: g, reason: collision with root package name */
    public int f2563g;

    /* renamed from: h, reason: collision with root package name */
    public int f2564h;

    /* renamed from: i, reason: collision with root package name */
    public int f2565i;

    /* renamed from: j, reason: collision with root package name */
    public int f2566j;

    /* renamed from: k, reason: collision with root package name */
    public int f2567k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f2568l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f2569m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f2570n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f2571o;

    /* renamed from: p, reason: collision with root package name */
    public k f2572p;
    public boolean t;

    /* renamed from: v, reason: collision with root package name */
    public RippleDrawable f2576v;
    public int w;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2573q = false;
    public boolean r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2574s = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2575u = true;

    public f(MaterialButton materialButton, o oVar) {
        this.f2560a = materialButton;
        this.f2561b = oVar;
    }

    public final k a(boolean z9) {
        RippleDrawable rippleDrawable = this.f2576v;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 0) {
            return (k) ((LayerDrawable) ((InsetDrawable) this.f2576v.getDrawable(0)).getDrawable()).getDrawable(!z9 ? 1 : 0);
        }
        return null;
    }

    public final void b(int i10, int i11) {
        MaterialButton materialButton = this.f2560a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f2564h;
        int i13 = this.f2565i;
        this.f2565i = i11;
        this.f2564h = i10;
        if (!this.r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i10) - i12, paddingEnd, (paddingBottom + i11) - i13);
    }

    public final void c() {
        int i10;
        k kVar = new k(this.f2561b);
        b0 b0Var = this.c;
        if (b0Var != null) {
            kVar.t(b0Var);
        }
        SpringForce springForce = this.d;
        if (springForce != null) {
            kVar.o(springForce);
        }
        i iVar = this.e;
        if (iVar != null) {
            kVar.F = iVar;
        }
        MaterialButton materialButton = this.f2560a;
        kVar.m(materialButton.getContext());
        kVar.setTintList(this.f2569m);
        PorterDuff.Mode mode = this.f2568l;
        if (mode != null) {
            kVar.setTintMode(mode);
        }
        float f8 = this.f2567k;
        ColorStateList colorStateList = this.f2570n;
        kVar.c.f6756k = f8;
        kVar.invalidateSelf();
        z3.h hVar = kVar.c;
        if (hVar.e != colorStateList) {
            hVar.e = colorStateList;
            kVar.onStateChange(kVar.getState());
        }
        k kVar2 = new k(this.f2561b);
        b0 b0Var2 = this.c;
        if (b0Var2 != null) {
            kVar2.t(b0Var2);
        }
        SpringForce springForce2 = this.d;
        if (springForce2 != null) {
            kVar2.o(springForce2);
        }
        kVar2.setTint(0);
        float f10 = this.f2567k;
        if (this.f2573q) {
            i10 = m3.a.a(R.attr.colorSurface, materialButton);
        } else {
            i10 = 0;
        }
        kVar2.c.f6756k = f10;
        kVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        z3.h hVar2 = kVar2.c;
        if (hVar2.e != valueOf) {
            hVar2.e = valueOf;
            kVar2.onStateChange(kVar2.getState());
        }
        k kVar3 = new k(this.f2561b);
        this.f2572p = kVar3;
        b0 b0Var3 = this.c;
        if (b0Var3 != null) {
            kVar3.t(b0Var3);
        }
        SpringForce springForce3 = this.d;
        if (springForce3 != null) {
            this.f2572p.o(springForce3);
        }
        this.f2572p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(x3.a.b(this.f2571o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{kVar2, kVar}), this.f2562f, this.f2564h, this.f2563g, this.f2565i), this.f2572p);
        this.f2576v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        k a10 = a(false);
        if (a10 != null) {
            a10.p(this.w);
            a10.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        z zVar;
        k a10 = a(false);
        if (a10 != null) {
            b0 b0Var = this.c;
            if (b0Var != null) {
                a10.t(b0Var);
            } else {
                a10.setShapeAppearanceModel(this.f2561b);
            }
            SpringForce springForce = this.d;
            if (springForce != null) {
                a10.o(springForce);
            }
        }
        k a11 = a(true);
        if (a11 != null) {
            b0 b0Var2 = this.c;
            if (b0Var2 != null) {
                a11.t(b0Var2);
            } else {
                a11.setShapeAppearanceModel(this.f2561b);
            }
            SpringForce springForce2 = this.d;
            if (springForce2 != null) {
                a11.o(springForce2);
            }
        }
        RippleDrawable rippleDrawable = this.f2576v;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 1) {
            int numberOfLayers = this.f2576v.getNumberOfLayers();
            RippleDrawable rippleDrawable2 = this.f2576v;
            if (numberOfLayers > 2) {
                zVar = (z) rippleDrawable2.getDrawable(2);
            } else {
                zVar = (z) rippleDrawable2.getDrawable(1);
            }
        } else {
            zVar = null;
        }
        if (zVar != null) {
            zVar.setShapeAppearanceModel(this.f2561b);
            if (zVar instanceof k) {
                k kVar = (k) zVar;
                b0 b0Var3 = this.c;
                if (b0Var3 != null) {
                    kVar.t(b0Var3);
                }
                SpringForce springForce3 = this.d;
                if (springForce3 != null) {
                    kVar.o(springForce3);
                }
            }
        }
    }

    public final void e() {
        int i10 = 0;
        k a10 = a(false);
        k a11 = a(true);
        if (a10 != null) {
            float f8 = this.f2567k;
            ColorStateList colorStateList = this.f2570n;
            a10.c.f6756k = f8;
            a10.invalidateSelf();
            z3.h hVar = a10.c;
            if (hVar.e != colorStateList) {
                hVar.e = colorStateList;
                a10.onStateChange(a10.getState());
            }
            if (a11 != null) {
                float f10 = this.f2567k;
                if (this.f2573q) {
                    i10 = m3.a.a(R.attr.colorSurface, this.f2560a);
                }
                a11.c.f6756k = f10;
                a11.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i10);
                z3.h hVar2 = a11.c;
                if (hVar2.e != valueOf) {
                    hVar2.e = valueOf;
                    a11.onStateChange(a11.getState());
                }
            }
        }
    }
}
