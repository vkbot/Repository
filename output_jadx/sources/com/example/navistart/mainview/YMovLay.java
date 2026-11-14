package com.example.navistart.mainview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.example.navistart.ModernMainActivity;
import com.example.navistart.R;
import com.google.android.material.datepicker.m;
import com.google.android.material.textfield.TextInputEditText;
import e0.l2;
import t1.o;
import t1.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class YMovLay extends CardView {

    /* renamed from: b, reason: collision with root package name */
    public final int f1048b;
    public final int c;
    public final String d;
    public final ImageButton e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageButton f1049f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageButton f1050g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageButton f1051h;

    /* renamed from: i, reason: collision with root package name */
    public final TextInputEditText f1052i;

    /* renamed from: j, reason: collision with root package name */
    public final TextInputEditText f1053j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1054k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1055l;

    /* renamed from: m, reason: collision with root package name */
    public final SeekBar f1056m;

    /* renamed from: n, reason: collision with root package name */
    public final SeekBar f1057n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f1058o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f1059p;

    /* renamed from: q, reason: collision with root package name */
    public final View f1060q;
    public int r;

    /* renamed from: s, reason: collision with root package name */
    public int f1061s;
    public int t;

    /* renamed from: u, reason: collision with root package name */
    public int f1062u;

    /* renamed from: v, reason: collision with root package name */
    public p f1063v;

    public YMovLay(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        String str;
        this.f1048b = R.layout.ymovdispley;
        this.d = "";
        this.r = -500;
        this.f1061s = 2500;
        this.t = -500;
        this.f1062u = 2500;
        boolean z9 = context instanceof ModernMainActivity;
        this.f1055l = z9;
        if (z9) {
            this.f1048b = R.layout.modern_ymovdispley;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, l2.f1964g, 0, 0);
            try {
                this.c = obtainStyledAttributes.getResourceId(2, 0);
                this.d = obtainStyledAttributes.getString(0);
                this.f1054k = obtainStyledAttributes.getInt(1, 2);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        LayoutInflater.from(context).inflate(this.f1048b, this);
        TextView textView = (TextView) findViewById(R.id.NameLayMov);
        if (textView != null && (str = this.d) != null) {
            textView.setText(str);
        }
        ImageView imageView = (ImageView) findViewById(R.id.imgResurceMove);
        if (imageView != null && (i10 = this.c) != 0) {
            imageView.setImageResource(i10);
        }
        this.f1052i = (TextInputEditText) findViewById(R.id.YLayMovX);
        this.f1053j = (TextInputEditText) findViewById(R.id.YLayMovY);
        TextView textView2 = (TextView) findViewById(R.id.textView40);
        this.e = (ImageButton) findViewById(R.id.movL);
        this.f1049f = (ImageButton) findViewById(R.id.movR);
        this.f1050g = (ImageButton) findViewById(R.id.movU);
        this.f1051h = (ImageButton) findViewById(R.id.movD);
        if (this.f1055l) {
            this.f1056m = (SeekBar) findViewById(R.id.modern_slider_x);
            this.f1057n = (SeekBar) findViewById(R.id.modern_slider_y);
            this.f1058o = (TextView) findViewById(R.id.modern_slider_x_value);
            this.f1059p = (TextView) findViewById(R.id.modern_slider_y_value);
            this.f1060q = findViewById(R.id.modern_slider_y_row);
            this.f1056m.setOnSeekBarChangeListener(new o(this, true, this.f1058o));
            this.f1057n.setOnSeekBarChangeListener(new o(this, false, this.f1059p));
        }
        int i11 = this.f1054k;
        if (i11 == 1) {
            textView2.setVisibility(8);
            this.f1053j.setVisibility(8);
            this.f1050g.setVisibility(8);
            this.f1051h.setVisibility(8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1052i.getLayoutParams();
            layoutParams.width = -2;
            this.f1052i.setLayoutParams(layoutParams);
            if (this.f1055l) {
                this.f1060q.setVisibility(8);
                ((TextView) findViewById(R.id.modern_slider_x_label)).setText(R.string.modern_map_scale);
                return;
            }
            return;
        }
        if (i11 == 2) {
            textView2.setVisibility(0);
            this.f1053j.setVisibility(0);
        }
    }

    public static void b(ImageButton imageButton, Runnable runnable) {
        imageButton.setVisibility(0);
        imageButton.setOnClickListener(new m(1, runnable));
    }

    public final void a(int i10, int i11, int i12, int i13) {
        if (!this.f1055l) {
            return;
        }
        this.r = i10;
        this.f1061s = i11;
        this.t = i12;
        this.f1062u = i13;
        this.f1056m.setMax(Math.max(1, i11 - i10));
        this.f1057n.setMax(Math.max(1, i13 - i12));
        setYLayMovX(getYLayMovX());
        setYLayMovY(getYLayMovY());
    }

    public String getYLayMovX() {
        return this.f1052i.getText().toString();
    }

    public String getYLayMovY() {
        return this.f1053j.getText().toString();
    }

    public void setOnSliderValueChangeListener(p pVar) {
        this.f1063v = pVar;
    }

    public void setYLayMovX(String str) {
        int i10;
        this.f1052i.setText(str);
        if (this.f1055l) {
            try {
                i10 = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                i10 = 0;
            }
            int i11 = this.r;
            int i12 = this.f1061s;
            int max = Math.max(i11, Math.min(i12, i10));
            int max2 = Math.max(1, i12 - i11);
            SeekBar seekBar = this.f1056m;
            seekBar.setMax(max2);
            seekBar.setProgress(max - i11);
            this.f1058o.setText(String.valueOf(i10));
        }
    }

    public void setYLayMovY(String str) {
        int i10;
        this.f1053j.setText(str);
        if (this.f1055l) {
            try {
                i10 = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                i10 = 0;
            }
            int i11 = this.t;
            int i12 = this.f1062u;
            int max = Math.max(i11, Math.min(i12, i10));
            int max2 = Math.max(1, i12 - i11);
            SeekBar seekBar = this.f1057n;
            seekBar.setMax(max2);
            seekBar.setProgress(max - i11);
            this.f1059p.setText(String.valueOf(i10));
        }
    }

    public void setmovD(Runnable runnable) {
        b(this.f1051h, runnable);
    }

    public void setmovL(Runnable runnable) {
        b(this.e, runnable);
    }

    public void setmovR(Runnable runnable) {
        b(this.f1049f, runnable);
    }

    public void setmovU(Runnable runnable) {
        b(this.f1050g, runnable);
    }
}
