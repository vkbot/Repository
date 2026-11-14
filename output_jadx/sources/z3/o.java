package z3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: m, reason: collision with root package name */
    public static final l f6793m = new l(0.5f);

    /* renamed from: a, reason: collision with root package name */
    public a.a f6794a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public a.a f6795b = new Object();
    public a.a c = new Object();
    public a.a d = new Object();
    public d e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public d f6796f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public d f6797g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public d f6798h = new a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public f f6799i;

    /* renamed from: j, reason: collision with root package name */
    public f f6800j;

    /* renamed from: k, reason: collision with root package name */
    public f f6801k;

    /* renamed from: l, reason: collision with root package name */
    public f f6802l;

    /* JADX WARN: Type inference failed for: r0v0, types: [a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [a.a, java.lang.Object] */
    public o() {
        int i10 = 0;
        this.f6799i = new f(i10);
        this.f6800j = new f(i10);
        this.f6801k = new f(i10);
        this.f6802l = new f(i10);
    }

    public static n a(Context context, int i10, int i11) {
        return b(context, i10, i11, new a(0));
    }

    public static n b(Context context, int i10, int i11, d dVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i11, true);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(a3.a.E);
        try {
            int i12 = obtainStyledAttributes.getInt(0, 0);
            int i13 = obtainStyledAttributes.getInt(3, i12);
            int i14 = obtainStyledAttributes.getInt(4, i12);
            int i15 = obtainStyledAttributes.getInt(2, i12);
            int i16 = obtainStyledAttributes.getInt(1, i12);
            d d = d(obtainStyledAttributes, 5, dVar);
            d d10 = d(obtainStyledAttributes, 8, d);
            d d11 = d(obtainStyledAttributes, 9, d);
            d d12 = d(obtainStyledAttributes, 7, d);
            d d13 = d(obtainStyledAttributes, 6, d);
            n nVar = new n();
            nVar.f6784a = b1.u.e(i13);
            nVar.e = d10;
            nVar.f6785b = b1.u.e(i14);
            nVar.f6786f = d11;
            nVar.c = b1.u.e(i15);
            nVar.f6787g = d12;
            nVar.d = b1.u.e(i16);
            nVar.f6788h = d13;
            return nVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static n c(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a3.a.w, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, aVar);
    }

    public static d d(TypedArray typedArray, int i10, d dVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue != null) {
            int i11 = peekValue.type;
            if (i11 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new l(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public final boolean e() {
        if ((this.f6795b instanceof m) && (this.f6794a instanceof m) && (this.c instanceof m) && (this.d instanceof m)) {
            return true;
        }
        return false;
    }

    public final boolean f(RectF rectF) {
        boolean z9;
        boolean z10;
        if (this.f6802l.getClass().equals(f.class) && this.f6800j.getClass().equals(f.class) && this.f6799i.getClass().equals(f.class) && this.f6801k.getClass().equals(f.class)) {
            z9 = true;
        } else {
            z9 = false;
        }
        float a10 = this.e.a(rectF);
        if (this.f6796f.a(rectF) == a10 && this.f6798h.a(rectF) == a10 && this.f6797g.a(rectF) == a10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z9 || !z10 || !e()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z3.n, java.lang.Object] */
    public final n g() {
        ?? obj = new Object();
        obj.f6784a = this.f6794a;
        obj.f6785b = this.f6795b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f6786f = this.f6796f;
        obj.f6787g = this.f6797g;
        obj.f6788h = this.f6798h;
        obj.f6789i = this.f6799i;
        obj.f6790j = this.f6800j;
        obj.f6791k = this.f6801k;
        obj.f6792l = this.f6802l;
        return obj;
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f6796f + ", " + this.f6797g + ", " + this.f6798h + "]";
    }
}
