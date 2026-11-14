package s3;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicCompat;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.GravityCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int[] M;
    public boolean N;
    public final TextPaint O;
    public final TextPaint P;
    public TimeInterpolator Q;
    public TimeInterpolator R;
    public float S;
    public float T;
    public float U;
    public ColorStateList V;
    public float W;
    public float X;
    public float Y;
    public StaticLayout Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f5656a;

    /* renamed from: a0, reason: collision with root package name */
    public float f5657a0;

    /* renamed from: b, reason: collision with root package name */
    public float f5658b;

    /* renamed from: b0, reason: collision with root package name */
    public float f5659b0;
    public final Rect c;

    /* renamed from: c0, reason: collision with root package name */
    public float f5660c0;
    public final Rect d;

    /* renamed from: d0, reason: collision with root package name */
    public CharSequence f5661d0;
    public final RectF e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f5671j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f5673k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f5674k0;

    /* renamed from: l, reason: collision with root package name */
    public int f5675l;

    /* renamed from: m, reason: collision with root package name */
    public float f5676m;

    /* renamed from: n, reason: collision with root package name */
    public float f5677n;

    /* renamed from: o, reason: collision with root package name */
    public float f5678o;

    /* renamed from: p, reason: collision with root package name */
    public float f5679p;

    /* renamed from: q, reason: collision with root package name */
    public float f5680q;
    public float r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f5681s;
    public Typeface t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f5682u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f5683v;
    public Typeface w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f5684x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f5685y;

    /* renamed from: z, reason: collision with root package name */
    public w3.a f5686z;

    /* renamed from: f, reason: collision with root package name */
    public int f5663f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f5665g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f5667h = 15.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f5669i = 15.0f;
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public final boolean E = true;

    /* renamed from: e0, reason: collision with root package name */
    public int f5662e0 = 1;

    /* renamed from: f0, reason: collision with root package name */
    public int f5664f0 = 1;

    /* renamed from: g0, reason: collision with root package name */
    public final float f5666g0 = 1.0f;

    /* renamed from: h0, reason: collision with root package name */
    public final int f5668h0 = 1;

    /* renamed from: i0, reason: collision with root package name */
    public int f5670i0 = -1;

    /* renamed from: j0, reason: collision with root package name */
    public int f5672j0 = -1;

    public c(TextInputLayout textInputLayout) {
        this.f5656a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.d = new Rect();
        this.c = new Rect();
        this.e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i10, int i11, float f8) {
        float f10 = 1.0f - f8;
        return Color.argb(Math.round((Color.alpha(i11) * f8) + (Color.alpha(i10) * f10)), Math.round((Color.red(i11) * f8) + (Color.red(i10) * f10)), Math.round((Color.green(i11) * f8) + (Color.green(i10) * f10)), Math.round((Color.blue(i11) * f8) + (Color.blue(i10) * f10)));
    }

    public static float h(float f8, float f10, float f11, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f11 = timeInterpolator.getInterpolation(f11);
        }
        return b3.a.a(f8, f10, f11);
    }

    public final void b() {
        float f8 = this.f5658b;
        float f10 = this.c.left;
        Rect rect = this.d;
        float h2 = h(f10, rect.left, f8, this.Q);
        RectF rectF = this.e;
        rectF.left = h2;
        rectF.top = h(this.f5676m, this.f5677n, f8, this.Q);
        rectF.right = h(r1.right, rect.right, f8, this.Q);
        rectF.bottom = h(r1.bottom, rect.bottom, f8, this.Q);
        this.f5680q = h(this.f5678o, this.f5679p, f8, this.Q);
        this.r = h(this.f5676m, this.f5677n, f8, this.Q);
        d(f8, false);
        TextInputLayout textInputLayout = this.f5656a;
        textInputLayout.postInvalidateOnAnimation();
        FastOutSlowInInterpolator fastOutSlowInInterpolator = b3.a.f341b;
        this.f5659b0 = 1.0f - h(0.0f, 1.0f, 1.0f - f8, fastOutSlowInInterpolator);
        textInputLayout.postInvalidateOnAnimation();
        this.f5660c0 = h(1.0f, 0.0f, f8, fastOutSlowInInterpolator);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f5673k;
        ColorStateList colorStateList2 = this.f5671j;
        TextPaint textPaint = this.O;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(g(colorStateList2), g(this.f5673k), f8));
        } else {
            textPaint.setColor(g(colorStateList));
        }
        float f11 = this.W;
        float f12 = this.X;
        if (f11 != f12) {
            textPaint.setLetterSpacing(h(f12, f11, f8, fastOutSlowInInterpolator));
        } else {
            textPaint.setLetterSpacing(f11);
        }
        this.H = b3.a.a(0.0f, this.S, f8);
        this.I = b3.a.a(0.0f, this.T, f8);
        this.J = b3.a.a(0.0f, this.U, f8);
        int a10 = a(0, g(this.V), f8);
        this.K = a10;
        textPaint.setShadowLayer(this.H, this.I, this.J, a10);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat;
        boolean z9 = true;
        if (this.f5656a.getLayoutDirection() != 1) {
            z9 = false;
        }
        if (this.E) {
            if (z9) {
                textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL;
            } else {
                textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
            }
            return textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
        }
        return z9;
    }

    public final void d(float f8, boolean z9) {
        float f10;
        Typeface typeface;
        float f11;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        float h2;
        if (this.B != null) {
            float width = this.d.width();
            float width2 = this.c.width();
            float f12 = 1.0f;
            if (Math.abs(f8 - 1.0f) < 1.0E-5f) {
                if (o()) {
                    f10 = this.f5669i;
                } else {
                    f10 = this.f5667h;
                }
                if (o()) {
                    f11 = this.W;
                } else {
                    f11 = this.X;
                }
                if (o()) {
                    h2 = 1.0f;
                } else {
                    h2 = h(this.f5667h, this.f5669i, f8, this.R) / this.f5667h;
                }
                this.F = h2;
                if (!o()) {
                    width = width2;
                }
                typeface = this.f5681s;
                width2 = width;
            } else {
                f10 = this.f5667h;
                float f13 = this.X;
                typeface = this.f5683v;
                if (Math.abs(f8 - 0.0f) < 1.0E-5f) {
                    this.F = 1.0f;
                } else {
                    this.F = h(this.f5667h, this.f5669i, f8, this.R) / this.f5667h;
                }
                float f14 = this.f5669i / this.f5667h;
                float f15 = width2 * f14;
                if (!z9 && f15 > width && o()) {
                    width2 = Math.min(width / f14, width2);
                }
                f11 = f13;
            }
            if (f8 < 0.5f) {
                i10 = this.f5662e0;
            } else {
                i10 = this.f5664f0;
            }
            TextPaint textPaint = this.O;
            boolean z16 = false;
            if (width2 > 0.0f) {
                if (this.G != f10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.Y != f11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f5685y != typeface) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (this.Z != null && width2 != r12.getWidth()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.L != i10) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z10 && !z11 && !z13 && !z12 && !z14 && !this.N) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                this.G = f10;
                this.Y = f11;
                this.f5685y = typeface;
                this.N = false;
                this.L = i10;
                if (this.F != 1.0f) {
                    z16 = true;
                }
                textPaint.setLinearText(z16);
                z16 = z15;
            }
            if (this.C != null && !z16) {
                return;
            }
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f5685y);
            textPaint.setLetterSpacing(this.Y);
            boolean c = c(this.B);
            this.D = c;
            if ((this.f5662e0 <= 1 && this.f5664f0 <= 1) || c) {
                i11 = 1;
            } else {
                i11 = i10;
            }
            CharSequence charSequence = this.B;
            if (!o()) {
                f12 = this.F;
            }
            StaticLayout e = e(i11, textPaint, charSequence, width2 * f12, this.D);
            this.Z = e;
            this.C = e.getText();
        }
    }

    public final StaticLayout e(int i10, TextPaint textPaint, CharSequence charSequence, float f8, boolean z9) {
        Layout.Alignment alignment;
        if (i10 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f5663f, this.D ? 1 : 0) & 7;
            if (absoluteGravity != 1) {
                boolean z10 = this.D;
                if (absoluteGravity != 5) {
                    if (z10) {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    } else {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    }
                } else if (z10) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
        }
        h hVar = new h(charSequence, textPaint, (int) f8);
        hVar.f5700l = this.A;
        hVar.f5699k = z9;
        hVar.e = alignment;
        hVar.f5698j = false;
        hVar.f5694f = i10;
        hVar.f5695g = 0.0f;
        hVar.f5696h = this.f5666g0;
        hVar.f5697i = this.f5668h0;
        hVar.f5701m = null;
        return (StaticLayout) Preconditions.checkNotNull(hVar.a());
    }

    public final float f() {
        int i10 = this.f5670i0;
        if (i10 != -1) {
            return i10;
        }
        float f8 = this.f5669i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f8);
        textPaint.setTypeface(this.f5681s);
        textPaint.setLetterSpacing(this.W);
        return -textPaint.ascent();
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.M;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f5682u;
            if (typeface != null) {
                this.t = w3.i.a(configuration, typeface);
            }
            Typeface typeface2 = this.f5684x;
            if (typeface2 != null) {
                this.w = w3.i.a(configuration, typeface2);
            }
            Typeface typeface3 = this.t;
            if (typeface3 == null) {
                typeface3 = this.f5682u;
            }
            this.f5681s = typeface3;
            Typeface typeface4 = this.w;
            if (typeface4 == null) {
                typeface4 = this.f5684x;
            }
            this.f5683v = typeface4;
            j(true);
        }
    }

    public final void j(boolean z9) {
        float f8;
        float f10;
        int i10;
        TextInputLayout textInputLayout = this.f5656a;
        if ((textInputLayout.getHeight() > 0 && textInputLayout.getWidth() > 0) || z9) {
            d(1.0f, z9);
            CharSequence charSequence = this.C;
            TextPaint textPaint = this.O;
            if (charSequence != null && this.Z != null) {
                boolean o5 = o();
                CharSequence charSequence2 = this.C;
                if (o5) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint, this.Z.getWidth(), this.A);
                }
                this.f5661d0 = charSequence2;
            }
            CharSequence charSequence3 = this.f5661d0;
            float f11 = 0.0f;
            if (charSequence3 != null) {
                this.f5657a0 = textPaint.measureText(charSequence3, 0, charSequence3.length());
            } else {
                this.f5657a0 = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f5665g, this.D ? 1 : 0);
            int i11 = absoluteGravity & 112;
            Rect rect = this.d;
            if (i11 != 48) {
                if (i11 != 80) {
                    this.f5677n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
                } else {
                    this.f5677n = textPaint.ascent() + rect.bottom;
                }
            } else {
                this.f5677n = rect.top;
            }
            int i12 = absoluteGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
            if (i12 != 1) {
                if (i12 != 5) {
                    this.f5679p = rect.left;
                } else {
                    this.f5679p = rect.right - this.f5657a0;
                }
            } else {
                this.f5679p = rect.centerX() - (this.f5657a0 / 2.0f);
            }
            if (this.f5657a0 <= rect.width()) {
                float f12 = this.f5679p;
                float max = Math.max(0.0f, rect.left - f12) + f12;
                this.f5679p = max;
                this.f5679p = Math.min(0.0f, rect.right - (this.f5657a0 + max)) + max;
            }
            float f13 = this.f5669i;
            TextPaint textPaint2 = this.P;
            textPaint2.setTextSize(f13);
            textPaint2.setTypeface(this.f5681s);
            textPaint2.setLetterSpacing(this.W);
            if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
                float f14 = this.f5677n;
                float max2 = Math.max(0.0f, rect.top - f14) + f14;
                this.f5677n = max2;
                this.f5677n = Math.min(0.0f, rect.bottom - (f() + max2)) + max2;
            }
            d(0.0f, z9);
            StaticLayout staticLayout = this.Z;
            if (staticLayout != null) {
                f8 = staticLayout.getHeight();
            } else {
                f8 = 0.0f;
            }
            StaticLayout staticLayout2 = this.Z;
            if (staticLayout2 != null && this.f5662e0 > 1) {
                f10 = staticLayout2.getWidth();
            } else {
                CharSequence charSequence4 = this.C;
                if (charSequence4 != null) {
                    f10 = textPaint.measureText(charSequence4, 0, charSequence4.length());
                } else {
                    f10 = 0.0f;
                }
            }
            StaticLayout staticLayout3 = this.Z;
            if (staticLayout3 != null) {
                i10 = staticLayout3.getLineCount();
            } else {
                i10 = 0;
            }
            this.f5675l = i10;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f5663f, this.D ? 1 : 0);
            int i13 = absoluteGravity2 & 112;
            Rect rect2 = this.c;
            if (i13 != 48) {
                if (i13 != 80) {
                    this.f5676m = rect2.centerY() - (f8 / 2.0f);
                } else {
                    float f15 = rect2.bottom - f8;
                    if (this.f5674k0) {
                        f11 = textPaint.descent();
                    }
                    this.f5676m = f15 + f11;
                }
            } else {
                this.f5676m = rect2.top;
            }
            int i14 = absoluteGravity2 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
            if (i14 != 1) {
                if (i14 != 5) {
                    this.f5678o = rect2.left;
                } else {
                    this.f5678o = rect2.right - f10;
                }
            } else {
                this.f5678o = rect2.centerX() - (f10 / 2.0f);
            }
            d(this.f5658b, false);
            textInputLayout.postInvalidateOnAnimation();
            b();
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f5673k == colorStateList && this.f5671j == colorStateList) {
            return;
        }
        this.f5673k = colorStateList;
        this.f5671j = colorStateList;
        j(false);
    }

    public final boolean l(Typeface typeface) {
        w3.a aVar = this.f5686z;
        if (aVar != null) {
            aVar.c = true;
        }
        if (this.f5682u != typeface) {
            this.f5682u = typeface;
            Typeface a10 = w3.i.a(this.f5656a.getContext().getResources().getConfiguration(), typeface);
            this.t = a10;
            if (a10 == null) {
                a10 = this.f5682u;
            }
            this.f5681s = a10;
            return true;
        }
        return false;
    }

    public final void m(float f8) {
        float clamp = MathUtils.clamp(f8, 0.0f, 1.0f);
        if (clamp != this.f5658b) {
            this.f5658b = clamp;
            b();
        }
    }

    public final void n(Typeface typeface) {
        boolean z9;
        boolean l10 = l(typeface);
        if (this.f5684x != typeface) {
            this.f5684x = typeface;
            Typeface a10 = w3.i.a(this.f5656a.getContext().getResources().getConfiguration(), typeface);
            this.w = a10;
            if (a10 == null) {
                a10 = this.f5684x;
            }
            this.f5683v = a10;
            z9 = true;
        } else {
            z9 = false;
        }
        if (!l10 && !z9) {
            return;
        }
        j(false);
    }

    public final boolean o() {
        if (this.f5664f0 == 1) {
            return true;
        }
        return false;
    }
}
