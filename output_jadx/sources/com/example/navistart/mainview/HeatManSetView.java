package com.example.navistart.mainview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.navigation.c;
import androidx.navigation.ui.a;
import com.example.navistart.R;
import com.google.protobuf.q;
import com.h6ah4i.android.widget.verticalseekbar.VerticalSeekBar;
import e0.l2;
import e0.m;
import kotlin.jvm.internal.ByteCompanionObject;
import t1.f;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class HeatManSetView extends CardView {
    public static final /* synthetic */ int t = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1014b;
    public final String c;
    public final int d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public int f1015f;

    /* renamed from: g, reason: collision with root package name */
    public final VerticalSeekBar f1016g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1017h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1018i;

    /* renamed from: j, reason: collision with root package name */
    public int f1019j;

    /* renamed from: k, reason: collision with root package name */
    public final VerticalSeekBar f1020k;

    /* renamed from: l, reason: collision with root package name */
    public int f1021l;

    /* renamed from: m, reason: collision with root package name */
    public final ProgressBar f1022m;

    /* renamed from: n, reason: collision with root package name */
    public final String f1023n;

    /* renamed from: o, reason: collision with root package name */
    public final String f1024o;

    /* renamed from: p, reason: collision with root package name */
    public final String f1025p;

    /* renamed from: q, reason: collision with root package name */
    public Runnable f1026q;
    public Runnable r;

    /* renamed from: s, reason: collision with root package name */
    public Runnable f1027s;

    public HeatManSetView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10 = 0;
        this.f1014b = false;
        this.c = "";
        this.f1023n = "";
        this.f1024o = "";
        this.f1025p = "";
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, l2.c, 0, 0);
        try {
            this.f1023n = obtainStyledAttributes.getString(0);
            int i11 = 1;
            this.c = obtainStyledAttributes.getString(1);
            this.f1015f = obtainStyledAttributes.getInteger(13, 0);
            this.d = obtainStyledAttributes.getInteger(10, 0);
            this.e = obtainStyledAttributes.getInteger(12, 20);
            obtainStyledAttributes.getInteger(11, 1);
            this.f1017h = obtainStyledAttributes.getInteger(6, -40);
            this.f1018i = obtainStyledAttributes.getInteger(8, 40);
            this.f1019j = obtainStyledAttributes.getInteger(9, 0);
            obtainStyledAttributes.getInteger(7, 1);
            this.f1021l = obtainStyledAttributes.getInteger(3, 1);
            this.f1024o = obtainStyledAttributes.getString(14);
            this.f1025p = obtainStyledAttributes.getString(15);
            obtainStyledAttributes.recycle();
            LayoutInflater.from(context).inflate(R.layout.car_heat_cardview, (ViewGroup) this, true);
            ((TextView) findViewById(R.id.centerLabel)).setText(this.c);
            ImageView imageView = (ImageView) findViewById(R.id.seatIcon);
            this.f1022m = (ProgressBar) findViewById(R.id.seatIconProgress);
            setLevel(this.f1021l);
            ImageView imageView2 = (ImageView) findViewById(R.id.temperatureSign);
            String str = this.f1023n;
            switch (str.hashCode()) {
                case -2059447509:
                    if (str.equals(m.h(new byte[]{70, -126, -35, -14, 116, -123, 74, -16, 98}, new byte[]{14, -25, -68, -122, 35, -19, 47, -107}))) {
                        imageView.setImageResource(R.drawable.car_heat_wheel);
                        imageView2.setImageResource(R.drawable.baseline_keyboard_arrow_left_24);
                        this.f1022m.setMax(1);
                        this.f1022m.setMin(0);
                        setLevel(this.f1021l);
                        break;
                    }
                    break;
                case -2034667398:
                    if (str.equals(m.h(new byte[]{72, -5, -95, -82, 74, 72, -108, 56}, new byte[]{30, -98, -49, -38, 25, 45, -11, 76}))) {
                        imageView.setImageResource(R.drawable.car_seat_vent2);
                        imageView2.setImageResource(R.drawable.baseline_keyboard_arrow_right_24);
                        this.f1022m.setProgressTintList(ContextCompat.getColorStateList(context, R.color.ventProgressColor));
                        break;
                    }
                    break;
                case -1036387275:
                    if (str.equals(m.h(new byte[]{-75, -64, -126, 106, -17, 87, 94, -126}, new byte[]{-3, -91, -29, 30, -68, 50, 63, -10}))) {
                        imageView.setImageResource(R.drawable.car_seat_heat_l);
                        imageView2.setImageResource(R.drawable.baseline_keyboard_arrow_left_24);
                        this.f1022m.setProgressTintList(ContextCompat.getColorStateList(context, R.color.heatProgressColor));
                        break;
                    }
                    break;
                case -303926367:
                    if (str.equals(m.h(new byte[]{-38, 33, 122, 68, 111, -93, -83, 62, -31, 44, 114, 85, 84, -82}, new byte[]{-110, 68, 27, 48, 56, -54, -61, 90}))) {
                        imageView.setImageResource(R.drawable.car_windshield_heat_3);
                        imageView2.setImageResource(R.drawable.baseline_keyboard_arrow_left_24);
                        this.f1022m.setMax(1);
                        this.f1022m.setMin(0);
                        setLevel(this.f1021l);
                        break;
                    }
                    break;
                case 2056863413:
                    if (str.equals(m.h(new byte[]{70, -77, 103, -115, -103, -72, 11, 97, 102}, new byte[]{18, -38, 10, -24, -21, -16, 110, 0}))) {
                        imageView.setImageResource(R.drawable.ico_temp_datch);
                        this.f1022m.setMax(1);
                        this.f1022m.setMin(0);
                        setLevel(this.f1021l);
                        break;
                    }
                    break;
                case 2087531716:
                    if (str.equals(m.h(new byte[]{-74, -68, 73, 84, 86, 12, -54, 107, -119, -80, 70, 68, 107, 30}, new byte[]{-2, -39, 40, 32, 4, 105, -85, 25}))) {
                        imageView.setImageResource(R.drawable.car_rearwindow_heat_2);
                        imageView2.setImageResource(R.drawable.baseline_keyboard_arrow_left_24);
                        this.f1022m.setMax(1);
                        this.f1022m.setMin(0);
                        setLevel(this.f1021l);
                        break;
                    }
                    break;
            }
            imageView.setOnClickListener(new c(19, this));
            VerticalSeekBar verticalSeekBar = (VerticalSeekBar) findViewById(R.id.timeSlider);
            this.f1016g = verticalSeekBar;
            verticalSeekBar.setMin(this.d);
            this.f1016g.setMax(this.e);
            setTimeValue(this.f1015f);
            TextView textView = (TextView) findViewById(R.id.timeSliderValue);
            boolean equals = m.h(new byte[]{62, -60, -60, 98, -65, 68, 105, -60, 30}, new byte[]{106, -83, -87, 7, -51, 12, 12, -91}).equals(this.f1023n);
            int i12 = this.f1015f;
            if (equals) {
                textView.setText(b(i12));
            } else {
                textView.setText(i12 + m.h(new byte[]{96, -15}, new byte[]{64, -100, 101, 50, 85, 77, -104, 12}));
            }
            this.f1016g.setOnSeekBarChangeListener(new f(this, textView, i10));
            VerticalSeekBar verticalSeekBar2 = (VerticalSeekBar) findViewById(R.id.tempSlider);
            this.f1020k = verticalSeekBar2;
            verticalSeekBar2.setMin(this.f1017h);
            this.f1020k.setMax(this.f1018i);
            setTemperatureValue(this.f1019j);
            TextView textView2 = (TextView) findViewById(R.id.temperatureValue);
            boolean equals2 = m.h(new byte[]{94, -20, 40, -124, -38, 67, -39, -102, 126}, new byte[]{10, -123, 69, -31, -88, 11, -68, -5}).equals(this.f1023n);
            int i13 = this.f1019j;
            if (equals2) {
                textView2.setText(b(i13));
            } else {
                textView2.setText(a(i13));
            }
            this.f1020k.setOnSeekBarChangeListener(new f(this, textView2, i11));
            setOnClickListener(new a(21, this, context));
            setSaveEnabled(false);
            setSaveFromParentEnabled(false);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static String a(int i10) {
        StringBuilder sb = new StringBuilder();
        sb.append(i10);
        return q.i(new byte[]{126, 85}, new byte[]{-68, -27, 29, -79, ByteCompanionObject.MIN_VALUE, 28, 122, 23}, sb);
    }

    public static String b(int i10) {
        StringBuilder sb = new StringBuilder();
        sb.append(i10);
        return q.i(new byte[]{109}, new byte[]{0, -124, -93, 23, -21, 122, -83, 51}, sb);
    }

    public int getLevel() {
        return this.f1021l;
    }

    public int getTemperatureValue() {
        return this.f1019j;
    }

    public int getTimeValue() {
        return this.f1015f;
    }

    public Boolean getisEnable() {
        return Boolean.valueOf(this.f1014b);
    }

    public void setLevel(int i10) {
        if (i10 <= this.f1022m.getMax()) {
            this.f1022m.setProgress(i10);
            this.f1021l = i10;
            if (i10 > 0) {
                this.f1014b = true;
            } else {
                this.f1014b = false;
            }
        }
    }

    public void setLevelRun(Runnable runnable) {
        this.f1026q = runnable;
    }

    public void setTempRun(Runnable runnable) {
        this.f1027s = runnable;
    }

    public void setTempSliderEnable(boolean z9) {
        VerticalSeekBar verticalSeekBar = this.f1020k;
        verticalSeekBar.setEnabled(z9);
        if (z9) {
            verticalSeekBar.setBackgroundColor(0);
        } else {
            verticalSeekBar.setBackgroundColor(Color.parseColor(m.h(new byte[]{53, -62, 59, -83, -101, 51, 33, 123, 87}, new byte[]{22, -6, 3, -20, -38, 114, 96, 58})));
        }
    }

    public void setTemperatureValue(int i10) {
        int min;
        int min2;
        if (Build.VERSION.SDK_INT >= 26) {
            if (i10 <= this.f1020k.getMax()) {
                min2 = this.f1020k.getMin();
                if (i10 >= min2) {
                    this.f1019j = i10;
                    this.f1020k.setProgress(i10);
                    return;
                }
            }
            min = this.f1020k.getMin();
            this.f1019j = min;
            this.f1020k.setProgress(min);
        }
    }

    public void setTimeRun(Runnable runnable) {
        this.r = runnable;
    }

    public void setTimeValue(int i10) {
        int min;
        int min2;
        if (Build.VERSION.SDK_INT >= 26) {
            if (i10 <= this.f1016g.getMax()) {
                min2 = this.f1016g.getMin();
                if (i10 >= min2) {
                    this.f1015f = i10;
                    this.f1016g.setProgress(i10);
                    return;
                }
            }
            min = this.f1016g.getMin();
            this.f1015f = min;
            this.f1016g.setProgress(min);
        }
    }

    public void setisEnable(Boolean bool) {
        if (bool.booleanValue()) {
            setLevel(1);
        } else {
            setLevel(0);
        }
    }
}
