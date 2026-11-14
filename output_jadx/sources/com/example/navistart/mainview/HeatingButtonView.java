package com.example.navistart.mainview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.navistart.R;
import e0.l2;
import e0.m;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class HeatingButtonView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public int f1028b;
    public int c;
    public final int d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public int f1029f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageButton f1030g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f1031h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f1032i;

    /* renamed from: j, reason: collision with root package name */
    public final ImageView f1033j;

    /* renamed from: k, reason: collision with root package name */
    public final ImageView f1034k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f1035l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1036m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1037n;

    public HeatingButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1028b = 0;
        this.c = 1;
        this.d = 0;
        this.e = false;
        this.f1029f = 0;
        this.f1036m = R.drawable.lamp_off2;
        this.f1037n = R.drawable.lamp_on2;
        View.inflate(context, R.layout.view_heating_button2, this);
        this.f1030g = (ImageButton) findViewById(R.id.heating_button);
        this.f1035l = (TextView) findViewById(R.id.heating_button_text);
        this.f1031h = (ImageView) findViewById(R.id.lamp1);
        this.f1032i = (ImageView) findViewById(R.id.lamp2);
        this.f1033j = (ImageView) findViewById(R.id.lamp3);
        this.f1034k = (ImageView) findViewById(R.id.heating_button_ico);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, l2.d, 0, 0);
            try {
                this.f1028b = attributeSet.getAttributeIntValue(m.h(new byte[]{-28, -63, -115, -28, 83, -41, 106, 100, -17, -35, -100, -7, 8, -117, 107, 118, -30, -47, -117, -5, 0, -100, 107, 116, -29, -40, -42, -11, 25, -109, 106, 101, -23, -58, -44, -11, 28, -116, 42}, new byte[]{-116, -75, -7, -108, 105, -8, 69, 23}), m.h(new byte[]{24, 38, 92, -14, -76, 50, 23, -25, 30, 54}, new byte[]{122, 83, 40, -122, -37, 92, 90, -120}), 0);
                this.f1029f = obtainStyledAttributes.getResourceId(2, -1);
                this.d = obtainStyledAttributes.getInteger(1, -1);
                int resourceId = obtainStyledAttributes.getResourceId(3, -1);
                if (resourceId != -1) {
                    this.f1034k.setImageResource(resourceId);
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        b();
    }

    private void setButtonText(int i10) {
        if (i10 > -1) {
            this.f1029f = i10;
            this.f1035l.setText(getResources().getString(this.f1029f));
        }
        if (this.d == 1) {
            this.f1035l.setVisibility(0);
        }
    }

    public final int a() {
        int i10 = this.f1028b;
        if (i10 == 0) {
            boolean z9 = this.e;
            this.e = !z9;
            if (!z9) {
                c(3);
            } else {
                c(1);
            }
            if (!this.e) {
                return 1;
            }
            return 3;
        }
        if (i10 == 1) {
            int i11 = (this.c % 4) + 1;
            this.c = i11;
            c(i11);
            return this.c;
        }
        return 0;
    }

    public final void b() {
        setButtonText(this.f1029f);
        int i10 = this.f1028b;
        if (i10 == 0) {
            this.f1031h.setVisibility(4);
            this.f1032i.setVisibility(0);
            this.f1033j.setVisibility(4);
        } else if (i10 == 1) {
            this.f1031h.setVisibility(0);
            this.f1032i.setVisibility(0);
            this.f1033j.setVisibility(0);
        }
    }

    public final void c(int i10) {
        this.c = i10;
        int i11 = this.f1036m;
        if (i10 != 1) {
            int i12 = this.f1037n;
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                    this.f1031h.setImageResource(i12);
                    this.f1032i.setImageResource(i12);
                    this.f1033j.setImageResource(i12);
                    return;
                }
                this.f1031h.setImageResource(i12);
                this.f1032i.setImageResource(i12);
                this.f1033j.setImageResource(i11);
                return;
            }
            this.f1031h.setImageResource(i12);
            this.f1032i.setImageResource(i11);
            this.f1033j.setImageResource(i11);
            return;
        }
        this.f1031h.setImageResource(i11);
        this.f1032i.setImageResource(i11);
        this.f1033j.setImageResource(i11);
    }

    public final void d(Boolean bool) {
        int i10;
        boolean booleanValue = bool.booleanValue();
        this.e = booleanValue;
        if (booleanValue) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        c(i10);
    }

    public int getButtonMode() {
        return this.f1028b;
    }

    public Boolean getEnabled() {
        return Boolean.valueOf(this.e);
    }

    public ImageButton getHeatingButton() {
        return this.f1030g;
    }

    public void setButtonMode(int i10) {
        this.f1028b = i10;
        b();
    }

    public void setButtonText(String str) {
        this.f1035l.setText(str);
    }
}
