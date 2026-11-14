package d3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.example.navistart.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import s3.l;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f1788a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1789b = new b();
    public final float c;
    public final float d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1790f;

    /* renamed from: g, reason: collision with root package name */
    public final float f1791g;

    /* renamed from: h, reason: collision with root package name */
    public final float f1792h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1793i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1794j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1795k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1796l;

    public c(Context context) {
        AttributeSet attributeSet;
        int i10;
        boolean z9;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        int intValue7;
        int intValue8;
        int intValue9;
        int intValue10;
        int intValue11;
        int intValue12;
        int intValue13;
        int intValue14;
        int intValue15;
        int intValue16;
        boolean booleanValue;
        int next;
        b bVar = new b();
        int i11 = bVar.f1769b;
        if (i11 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i11);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    if (TextUtils.equals(xml.getName(), "badge")) {
                        attributeSet = Xml.asAttributeSet(xml);
                        i10 = attributeSet.getStyleAttribute();
                    } else {
                        throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i11));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i10 = 0;
        }
        TypedArray d = l.d(context, attributeSet, a3.a.c, R.attr.badgeStyle, i10 == 0 ? R.style.Widget_MaterialComponents_Badge : i10, new int[0]);
        Resources resources = context.getResources();
        this.c = d.getDimensionPixelSize(5, -1);
        this.f1793i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f1794j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = d.getDimensionPixelSize(15, -1);
        this.e = d.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.f1791g = d.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f1790f = d.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.f1792h = d.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f1795k = d.getInt(25, 1);
        this.f1796l = d.getInt(2, 0);
        b bVar2 = this.f1789b;
        int i12 = bVar.f1774j;
        bVar2.f1774j = i12 == -2 ? 255 : i12;
        int i13 = bVar.f1776l;
        if (i13 != -2) {
            bVar2.f1776l = i13;
        } else {
            boolean hasValue = d.hasValue(24);
            b bVar3 = this.f1789b;
            if (hasValue) {
                bVar3.f1776l = d.getInt(24, 0);
            } else {
                bVar3.f1776l = -1;
            }
        }
        String str = bVar.f1775k;
        if (str != null) {
            this.f1789b.f1775k = str;
        } else if (d.hasValue(8)) {
            this.f1789b.f1775k = d.getString(8);
        }
        b bVar4 = this.f1789b;
        bVar4.f1780p = bVar.f1780p;
        CharSequence charSequence = bVar.f1781q;
        bVar4.f1781q = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        b bVar5 = this.f1789b;
        int i14 = bVar.r;
        bVar5.r = i14 == 0 ? R.plurals.mtrl_badge_content_description : i14;
        int i15 = bVar.f1782s;
        bVar5.f1782s = i15 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i15;
        Boolean bool = bVar.f1783u;
        if (bool != null && !bool.booleanValue()) {
            z9 = false;
        } else {
            z9 = true;
        }
        bVar5.f1783u = Boolean.valueOf(z9);
        b bVar6 = this.f1789b;
        int i16 = bVar.f1777m;
        bVar6.f1777m = i16 == -2 ? d.getInt(22, -2) : i16;
        b bVar7 = this.f1789b;
        int i17 = bVar.f1778n;
        bVar7.f1778n = i17 == -2 ? d.getInt(23, -2) : i17;
        b bVar8 = this.f1789b;
        Integer num = bVar.f1770f;
        if (num == null) {
            intValue = d.getResourceId(6, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            intValue = num.intValue();
        }
        bVar8.f1770f = Integer.valueOf(intValue);
        b bVar9 = this.f1789b;
        Integer num2 = bVar.f1771g;
        if (num2 == null) {
            intValue2 = d.getResourceId(7, 0);
        } else {
            intValue2 = num2.intValue();
        }
        bVar9.f1771g = Integer.valueOf(intValue2);
        b bVar10 = this.f1789b;
        Integer num3 = bVar.f1772h;
        if (num3 == null) {
            intValue3 = d.getResourceId(16, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            intValue3 = num3.intValue();
        }
        bVar10.f1772h = Integer.valueOf(intValue3);
        b bVar11 = this.f1789b;
        Integer num4 = bVar.f1773i;
        if (num4 == null) {
            intValue4 = d.getResourceId(17, 0);
        } else {
            intValue4 = num4.intValue();
        }
        bVar11.f1773i = Integer.valueOf(intValue4);
        b bVar12 = this.f1789b;
        Integer num5 = bVar.c;
        if (num5 == null) {
            intValue5 = w3.c.a(context, d, 1).getDefaultColor();
        } else {
            intValue5 = num5.intValue();
        }
        bVar12.c = Integer.valueOf(intValue5);
        b bVar13 = this.f1789b;
        Integer num6 = bVar.e;
        if (num6 == null) {
            intValue6 = d.getResourceId(9, R.style.TextAppearance_MaterialComponents_Badge);
        } else {
            intValue6 = num6.intValue();
        }
        bVar13.e = Integer.valueOf(intValue6);
        Integer num7 = bVar.d;
        if (num7 != null) {
            this.f1789b.d = num7;
        } else {
            boolean hasValue2 = d.hasValue(10);
            b bVar14 = this.f1789b;
            if (hasValue2) {
                bVar14.d = Integer.valueOf(w3.c.a(context, d, 10).getDefaultColor());
            } else {
                int intValue17 = bVar14.e.intValue();
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue17, androidx.appcompat.R.styleable.TextAppearance);
                obtainStyledAttributes.getDimension(androidx.appcompat.R.styleable.TextAppearance_android_textSize, 0.0f);
                ColorStateList a10 = w3.c.a(context, obtainStyledAttributes, androidx.appcompat.R.styleable.TextAppearance_android_textColor);
                w3.c.a(context, obtainStyledAttributes, androidx.appcompat.R.styleable.TextAppearance_android_textColorHint);
                w3.c.a(context, obtainStyledAttributes, androidx.appcompat.R.styleable.TextAppearance_android_textColorLink);
                obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.TextAppearance_android_textStyle, 0);
                obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.TextAppearance_android_typeface, 1);
                int i18 = androidx.appcompat.R.styleable.TextAppearance_fontFamily;
                i18 = obtainStyledAttributes.hasValue(i18) ? i18 : androidx.appcompat.R.styleable.TextAppearance_android_fontFamily;
                obtainStyledAttributes.getResourceId(i18, 0);
                obtainStyledAttributes.getString(i18);
                obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.TextAppearance_textAllCaps, false);
                w3.c.a(context, obtainStyledAttributes, androidx.appcompat.R.styleable.TextAppearance_android_shadowColor);
                obtainStyledAttributes.getFloat(androidx.appcompat.R.styleable.TextAppearance_android_shadowDx, 0.0f);
                obtainStyledAttributes.getFloat(androidx.appcompat.R.styleable.TextAppearance_android_shadowDy, 0.0f);
                obtainStyledAttributes.getFloat(androidx.appcompat.R.styleable.TextAppearance_android_shadowRadius, 0.0f);
                obtainStyledAttributes.recycle();
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue17, a3.a.f26z);
                obtainStyledAttributes2.hasValue(0);
                obtainStyledAttributes2.getFloat(0, 0.0f);
                if (Build.VERSION.SDK_INT >= 26) {
                    obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
                }
                obtainStyledAttributes2.recycle();
                this.f1789b.d = Integer.valueOf(a10.getDefaultColor());
            }
        }
        b bVar15 = this.f1789b;
        Integer num8 = bVar.t;
        if (num8 == null) {
            intValue7 = d.getInt(3, 8388661);
        } else {
            intValue7 = num8.intValue();
        }
        bVar15.t = Integer.valueOf(intValue7);
        b bVar16 = this.f1789b;
        Integer num9 = bVar.f1784v;
        if (num9 == null) {
            intValue8 = d.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        } else {
            intValue8 = num9.intValue();
        }
        bVar16.f1784v = Integer.valueOf(intValue8);
        b bVar17 = this.f1789b;
        Integer num10 = bVar.w;
        if (num10 == null) {
            intValue9 = d.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding));
        } else {
            intValue9 = num10.intValue();
        }
        bVar17.w = Integer.valueOf(intValue9);
        b bVar18 = this.f1789b;
        Integer num11 = bVar.f1785x;
        if (num11 == null) {
            intValue10 = d.getDimensionPixelOffset(19, 0);
        } else {
            intValue10 = num11.intValue();
        }
        bVar18.f1785x = Integer.valueOf(intValue10);
        b bVar19 = this.f1789b;
        Integer num12 = bVar.f1786y;
        if (num12 == null) {
            intValue11 = d.getDimensionPixelOffset(26, 0);
        } else {
            intValue11 = num12.intValue();
        }
        bVar19.f1786y = Integer.valueOf(intValue11);
        b bVar20 = this.f1789b;
        Integer num13 = bVar.f1787z;
        if (num13 == null) {
            intValue12 = d.getDimensionPixelOffset(20, bVar20.f1785x.intValue());
        } else {
            intValue12 = num13.intValue();
        }
        bVar20.f1787z = Integer.valueOf(intValue12);
        b bVar21 = this.f1789b;
        Integer num14 = bVar.A;
        if (num14 == null) {
            intValue13 = d.getDimensionPixelOffset(27, bVar21.f1786y.intValue());
        } else {
            intValue13 = num14.intValue();
        }
        bVar21.A = Integer.valueOf(intValue13);
        b bVar22 = this.f1789b;
        Integer num15 = bVar.D;
        if (num15 == null) {
            intValue14 = d.getDimensionPixelOffset(21, 0);
        } else {
            intValue14 = num15.intValue();
        }
        bVar22.D = Integer.valueOf(intValue14);
        b bVar23 = this.f1789b;
        Integer num16 = bVar.B;
        if (num16 == null) {
            intValue15 = 0;
        } else {
            intValue15 = num16.intValue();
        }
        bVar23.B = Integer.valueOf(intValue15);
        b bVar24 = this.f1789b;
        Integer num17 = bVar.C;
        if (num17 == null) {
            intValue16 = 0;
        } else {
            intValue16 = num17.intValue();
        }
        bVar24.C = Integer.valueOf(intValue16);
        b bVar25 = this.f1789b;
        Boolean bool2 = bVar.E;
        if (bool2 == null) {
            booleanValue = d.getBoolean(0, false);
        } else {
            booleanValue = bool2.booleanValue();
        }
        bVar25.E = Boolean.valueOf(booleanValue);
        d.recycle();
        Locale locale = bVar.f1779o;
        b bVar26 = this.f1789b;
        if (locale == null) {
            bVar26.f1779o = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            bVar26.f1779o = locale;
        }
        this.f1788a = bVar;
    }
}
