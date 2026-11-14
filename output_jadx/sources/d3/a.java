package d3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.example.navistart.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import s3.i;
import s3.j;
import s3.l;
import w3.f;
import z3.k;
import z3.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends Drawable implements i {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f1759b;
    public final k c;
    public final j d;
    public final Rect e;

    /* renamed from: f, reason: collision with root package name */
    public final c f1760f;

    /* renamed from: g, reason: collision with root package name */
    public float f1761g;

    /* renamed from: h, reason: collision with root package name */
    public float f1762h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1763i;

    /* renamed from: j, reason: collision with root package name */
    public float f1764j;

    /* renamed from: k, reason: collision with root package name */
    public float f1765k;

    /* renamed from: l, reason: collision with root package name */
    public float f1766l;

    /* renamed from: m, reason: collision with root package name */
    public WeakReference f1767m;

    /* renamed from: n, reason: collision with root package name */
    public WeakReference f1768n;

    public a(Context context) {
        int intValue;
        int intValue2;
        FrameLayout frameLayout;
        f fVar;
        WeakReference weakReference = new WeakReference(context);
        this.f1759b = weakReference;
        l.c(context, l.f5707b, "Theme.MaterialComponents");
        this.e = new Rect();
        j jVar = new j(this);
        this.d = jVar;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = jVar.f5702a;
        textPaint.setTextAlign(align);
        c cVar = new c(context);
        this.f1760f = cVar;
        boolean f8 = f();
        b bVar = cVar.f1789b;
        if (f8) {
            intValue = bVar.f1772h.intValue();
        } else {
            intValue = bVar.f1770f.intValue();
        }
        if (f()) {
            intValue2 = bVar.f1773i.intValue();
        } else {
            intValue2 = bVar.f1771g.intValue();
        }
        k kVar = new k(o.a(context, intValue, intValue2).a());
        this.c = kVar;
        h();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && jVar.f5705g != (fVar = new f(context2, bVar.e.intValue()))) {
            jVar.b(fVar, context2);
            textPaint.setColor(bVar.d.intValue());
            invalidateSelf();
            j();
            invalidateSelf();
        }
        int i10 = bVar.f1777m;
        if (i10 != -2) {
            this.f1763i = ((int) Math.pow(10.0d, i10 - 1.0d)) - 1;
        } else {
            this.f1763i = bVar.f1778n;
        }
        jVar.e = true;
        j();
        invalidateSelf();
        jVar.e = true;
        h();
        j();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(bVar.c.intValue());
        if (kVar.c.d != valueOf) {
            kVar.q(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(bVar.d.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f1767m;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f1767m.get();
            WeakReference weakReference3 = this.f1768n;
            if (weakReference3 != null) {
                frameLayout = (FrameLayout) weakReference3.get();
            } else {
                frameLayout = null;
            }
            i(view, frameLayout);
        }
        j();
        setVisible(bVar.f1783u.booleanValue(), false);
    }

    @Override // s3.i
    public final void a() {
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.ViewParent] */
    public final void b(View view, View view2) {
        float f8;
        float f10;
        View view3;
        boolean z9;
        FrameLayout d = d();
        if (d == null) {
            float y9 = view.getY();
            f10 = view.getX();
            view3 = view.getParent();
            f8 = y9;
        } else {
            f8 = 0.0f;
            f10 = 0.0f;
            view3 = d;
        }
        while (true) {
            z9 = view3 instanceof View;
            if (!z9 || view3 == view2) {
                break;
            }
            ViewParent parent = view3.getParent();
            if (!(parent instanceof ViewGroup) || ((ViewGroup) parent).getClipChildren()) {
                break;
            }
            View view4 = view3;
            f8 += view4.getY();
            f10 += view4.getX();
            view3 = view3.getParent();
        }
        if (z9) {
            float f11 = (this.f1762h - this.f1766l) + f8;
            float f12 = (this.f1761g - this.f1765k) + f10;
            View view5 = view3;
            float height = ((this.f1762h + this.f1766l) - view5.getHeight()) + f8;
            float width = ((this.f1761g + this.f1765k) - view5.getWidth()) + f10;
            if (f11 < 0.0f) {
                this.f1762h = Math.abs(f11) + this.f1762h;
            }
            if (f12 < 0.0f) {
                this.f1761g = Math.abs(f12) + this.f1761g;
            }
            if (height > 0.0f) {
                this.f1762h -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.f1761g -= Math.abs(width);
            }
        }
    }

    public final String c() {
        c cVar = this.f1760f;
        b bVar = cVar.f1789b;
        b bVar2 = cVar.f1789b;
        String str = bVar.f1775k;
        WeakReference weakReference = this.f1759b;
        if (str != null) {
            int i10 = bVar.f1777m;
            if (i10 != -2 && str != null && str.length() > i10) {
                Context context = (Context) weakReference.get();
                if (context != null) {
                    return String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i10 - 1), "…");
                }
                return "";
            }
            return str;
        }
        if (g()) {
            if (this.f1763i != -2 && e() > this.f1763i) {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    return "";
                }
                return String.format(bVar2.f1779o, context2.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f1763i), "+");
            }
            return NumberFormat.getInstance(bVar2.f1779o).format(e());
        }
        return null;
    }

    public final FrameLayout d() {
        WeakReference weakReference = this.f1768n;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String c;
        int round;
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.c.draw(canvas);
            if (f() && (c = c()) != null) {
                Rect rect = new Rect();
                j jVar = this.d;
                jVar.f5702a.getTextBounds(c, 0, c.length(), rect);
                float exactCenterY = this.f1762h - rect.exactCenterY();
                float f8 = this.f1761g;
                if (rect.bottom <= 0) {
                    round = (int) exactCenterY;
                } else {
                    round = Math.round(exactCenterY);
                }
                canvas.drawText(c, f8, round, jVar.f5702a);
            }
        }
    }

    public final int e() {
        int i10 = this.f1760f.f1789b.f1776l;
        if (i10 != -1) {
            return i10;
        }
        return 0;
    }

    public final boolean f() {
        if (this.f1760f.f1789b.f1775k != null || g()) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        b bVar = this.f1760f.f1789b;
        if (bVar.f1775k == null && bVar.f1776l != -1) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f1760f.f1789b.f1774j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.e.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.e.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        int intValue;
        int intValue2;
        Context context = (Context) this.f1759b.get();
        if (context == null) {
            return;
        }
        boolean f8 = f();
        c cVar = this.f1760f;
        if (f8) {
            intValue = cVar.f1789b.f1772h.intValue();
        } else {
            intValue = cVar.f1789b.f1770f.intValue();
        }
        if (f()) {
            intValue2 = cVar.f1789b.f1773i.intValue();
        } else {
            intValue2 = cVar.f1789b.f1771g.intValue();
        }
        this.c.setShapeAppearanceModel(o.a(context, intValue, intValue2).a());
        invalidateSelf();
    }

    public final void i(View view, FrameLayout frameLayout) {
        this.f1767m = new WeakReference(view);
        this.f1768n = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.a.j():void");
    }

    @Override // android.graphics.drawable.Drawable, s3.i
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        c cVar = this.f1760f;
        cVar.f1788a.f1774j = i10;
        cVar.f1789b.f1774j = i10;
        this.d.f5702a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
