package z3;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class h extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public o f6749a;

    /* renamed from: b, reason: collision with root package name */
    public b0 f6750b;
    public p3.a c;
    public ColorStateList d;
    public ColorStateList e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f6751f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f6752g;

    /* renamed from: h, reason: collision with root package name */
    public Rect f6753h;

    /* renamed from: i, reason: collision with root package name */
    public final float f6754i;

    /* renamed from: j, reason: collision with root package name */
    public float f6755j;

    /* renamed from: k, reason: collision with root package name */
    public float f6756k;

    /* renamed from: l, reason: collision with root package name */
    public int f6757l;

    /* renamed from: m, reason: collision with root package name */
    public float f6758m;

    /* renamed from: n, reason: collision with root package name */
    public float f6759n;

    /* renamed from: o, reason: collision with root package name */
    public int f6760o;

    /* renamed from: p, reason: collision with root package name */
    public int f6761p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint.Style f6762q;

    public h(h hVar) {
        this.d = null;
        this.e = null;
        this.f6751f = null;
        this.f6752g = PorterDuff.Mode.SRC_IN;
        this.f6753h = null;
        this.f6754i = 1.0f;
        this.f6755j = 1.0f;
        this.f6757l = 255;
        this.f6758m = 0.0f;
        this.f6759n = 0.0f;
        this.f6760o = 0;
        this.f6761p = 0;
        this.f6762q = Paint.Style.FILL_AND_STROKE;
        this.f6749a = hVar.f6749a;
        this.f6750b = hVar.f6750b;
        this.c = hVar.c;
        this.f6756k = hVar.f6756k;
        this.d = hVar.d;
        this.e = hVar.e;
        this.f6752g = hVar.f6752g;
        this.f6751f = hVar.f6751f;
        this.f6757l = hVar.f6757l;
        this.f6754i = hVar.f6754i;
        this.f6761p = hVar.f6761p;
        this.f6755j = hVar.f6755j;
        this.f6758m = hVar.f6758m;
        this.f6759n = hVar.f6759n;
        this.f6760o = hVar.f6760o;
        this.f6762q = hVar.f6762q;
        if (hVar.f6753h != null) {
            this.f6753h = new Rect(hVar.f6753h);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        k kVar = new k(this);
        kVar.f6766g = true;
        kVar.f6767h = true;
        return kVar;
    }

    public h(o oVar) {
        this.d = null;
        this.e = null;
        this.f6751f = null;
        this.f6752g = PorterDuff.Mode.SRC_IN;
        this.f6753h = null;
        this.f6754i = 1.0f;
        this.f6755j = 1.0f;
        this.f6757l = 255;
        this.f6758m = 0.0f;
        this.f6759n = 0.0f;
        this.f6760o = 0;
        this.f6761p = 0;
        this.f6762q = Paint.Style.FILL_AND_STROKE;
        this.f6749a = oVar;
        this.c = null;
    }
}
