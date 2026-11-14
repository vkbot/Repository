package w3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.Xml;
import androidx.appcompat.R;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f6363a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6364b;
    public final String c;
    public final int d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6365f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6366g;

    /* renamed from: h, reason: collision with root package name */
    public final float f6367h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6368i;

    /* renamed from: j, reason: collision with root package name */
    public final float f6369j;

    /* renamed from: k, reason: collision with root package name */
    public final ColorStateList f6370k;

    /* renamed from: l, reason: collision with root package name */
    public float f6371l;

    /* renamed from: m, reason: collision with root package name */
    public final int f6372m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6373n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6374o = false;

    /* renamed from: p, reason: collision with root package name */
    public Typeface f6375p;

    public f(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, R.styleable.TextAppearance);
        this.f6371l = obtainStyledAttributes.getDimension(R.styleable.TextAppearance_android_textSize, 0.0f);
        this.f6370k = c.a(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColor);
        c.a(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColorHint);
        c.a(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColorLink);
        this.d = obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_textStyle, 0);
        this.e = obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_typeface, 1);
        int i11 = R.styleable.TextAppearance_fontFamily;
        i11 = obtainStyledAttributes.hasValue(i11) ? i11 : R.styleable.TextAppearance_android_fontFamily;
        this.f6372m = obtainStyledAttributes.getResourceId(i11, 0);
        this.f6364b = obtainStyledAttributes.getString(i11);
        obtainStyledAttributes.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
        this.f6363a = c.a(context, obtainStyledAttributes, R.styleable.TextAppearance_android_shadowColor);
        this.f6365f = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.f6366g = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.f6367h = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, a3.a.f26z);
        this.f6368i = obtainStyledAttributes2.hasValue(0);
        this.f6369j = obtainStyledAttributes2.getFloat(0, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.c = obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
        }
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f6375p;
        int i10 = this.d;
        if (typeface == null && (str = this.f6364b) != null) {
            this.f6375p = Typeface.create(str, i10);
        }
        if (this.f6375p == null) {
            int i11 = this.e;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        this.f6375p = Typeface.DEFAULT;
                    } else {
                        this.f6375p = Typeface.MONOSPACE;
                    }
                } else {
                    this.f6375p = Typeface.SERIF;
                }
            } else {
                this.f6375p = Typeface.SANS_SERIF;
            }
            this.f6375p = Typeface.create(this.f6375p, i10);
        }
    }

    public final void b(Context context, g gVar) {
        if (!c(context)) {
            a();
        }
        int i10 = this.f6372m;
        if (i10 == 0) {
            this.f6373n = true;
        }
        if (this.f6373n) {
            gVar.b(this.f6375p, true);
            return;
        }
        try {
            ResourcesCompat.getFont(context, i10, new d(this, gVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f6373n = true;
            gVar.a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f6364b, e);
            this.f6373n = true;
            gVar.a(-3);
        }
    }

    public final boolean c(Context context) {
        String str;
        Typeface create;
        if (this.f6373n) {
            return true;
        }
        int i10 = this.f6372m;
        if (i10 != 0) {
            Typeface cachedFont = ResourcesCompat.getCachedFont(context, i10);
            if (cachedFont != null) {
                this.f6375p = cachedFont;
                this.f6373n = true;
                return true;
            }
            Typeface typeface = null;
            if (!this.f6374o) {
                this.f6374o = true;
                Resources resources = context.getResources();
                if (i10 != 0 && resources.getResourceTypeName(i10).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i10);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), androidx.core.R.styleable.FontFamily);
                                str = obtainAttributes.getString(androidx.core.R.styleable.FontFamily_fontProviderSystemFontFamily);
                                obtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                }
                str = null;
                if (str != null && (create = Typeface.create(str, 0)) != Typeface.DEFAULT) {
                    typeface = Typeface.create(create, this.d);
                }
            }
            if (typeface != null) {
                this.f6375p = typeface;
                this.f6373n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, g gVar) {
        int i10;
        int i11;
        e(context, textPaint, gVar);
        ColorStateList colorStateList = this.f6370k;
        if (colorStateList != null) {
            i10 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i10 = ViewCompat.MEASURED_STATE_MASK;
        }
        textPaint.setColor(i10);
        ColorStateList colorStateList2 = this.f6363a;
        if (colorStateList2 != null) {
            i11 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i11 = 0;
        }
        textPaint.setShadowLayer(this.f6367h, this.f6365f, this.f6366g, i11);
    }

    public final void e(Context context, TextPaint textPaint, g gVar) {
        Typeface typeface;
        if (c(context) && this.f6373n && (typeface = this.f6375p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.f6375p);
        b(context, new e(this, context, textPaint, gVar));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z9;
        float f8;
        Typeface a10 = i.a(context.getResources().getConfiguration(), typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.d;
        if ((i10 & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        textPaint.setFakeBoldText(z9);
        if ((i10 & 2) != 0) {
            f8 = -0.25f;
        } else {
            f8 = 0.0f;
        }
        textPaint.setTextSkewX(f8);
        textPaint.setTextSize(this.f6371l);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.c);
        }
        if (this.f6368i) {
            textPaint.setLetterSpacing(this.f6369j);
        }
    }
}
