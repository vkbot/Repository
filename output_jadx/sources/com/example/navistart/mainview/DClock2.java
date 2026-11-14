package com.example.navistart.mainview;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.example.navistart.R;
import java.time.LocalDateTime;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class DClock2 extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f995b;
    public boolean c;
    public LocalDateTime d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f996f;

    /* renamed from: g, reason: collision with root package name */
    public int f997g;

    /* renamed from: h, reason: collision with root package name */
    public int f998h;

    /* renamed from: i, reason: collision with root package name */
    public int f999i;

    /* renamed from: j, reason: collision with root package name */
    public ImageView f1000j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f1001k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f1002l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView f1003m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView f1004n;

    /* renamed from: o, reason: collision with root package name */
    public ImageView f1005o;

    /* renamed from: p, reason: collision with root package name */
    public ImageView f1006p;

    /* renamed from: q, reason: collision with root package name */
    public ImageView f1007q;
    public ImageView r;

    /* renamed from: s, reason: collision with root package name */
    public ImageView f1008s;

    public DClock2(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, R.layout.digitalclock2, this);
        a();
    }

    public final void a() {
        ArrayList arrayList = new ArrayList();
        this.f995b = arrayList;
        arrayList.add(Integer.valueOf(R.drawable.digital_zero));
        this.f995b.add(Integer.valueOf(R.drawable.digital_one));
        this.f995b.add(Integer.valueOf(R.drawable.digital_two));
        this.f995b.add(Integer.valueOf(R.drawable.digital_three));
        this.f995b.add(Integer.valueOf(R.drawable.digital_four));
        this.f995b.add(Integer.valueOf(R.drawable.digital_five));
        this.f995b.add(Integer.valueOf(R.drawable.digital_six));
        this.f995b.add(Integer.valueOf(R.drawable.digital_seven));
        this.f995b.add(Integer.valueOf(R.drawable.digital_eight));
        this.f995b.add(Integer.valueOf(R.drawable.digital_nine));
        this.f1000j = (ImageView) findViewById(R.id.ivDigitalHH);
        this.f1001k = (ImageView) findViewById(R.id.ivDigitalH);
        this.f1002l = (ImageView) findViewById(R.id.ivDigitalMM);
        this.f1003m = (ImageView) findViewById(R.id.ivDigitalM);
        this.f1005o = (ImageView) findViewById(R.id.dD);
        this.f1004n = (ImageView) findViewById(R.id.dDD);
        this.f1006p = (ImageView) findViewById(R.id.dM);
        this.f1007q = (ImageView) findViewById(R.id.dMM);
        this.r = (ImageView) findViewById(R.id.dG);
        this.f1008s = (ImageView) findViewById(R.id.dGG);
        setWillNotDraw(false);
        this.c = true;
    }

    public final void b(ImageView imageView, ImageView imageView2, int i10) {
        imageView.setImageResource(((Integer) this.f995b.get(i10 / 10)).intValue());
        imageView2.setImageResource(((Integer) this.f995b.get(i10 % 10)).intValue());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        LocalDateTime now;
        int hour;
        int minute;
        int dayOfMonth;
        int monthValue;
        int year;
        super.onDraw(canvas);
        if (!this.c) {
            a();
        }
        System.currentTimeMillis();
        if (Build.VERSION.SDK_INT >= 26) {
            now = LocalDateTime.now();
            this.d = now;
            hour = now.getHour();
            this.e = hour;
            minute = this.d.getMinute();
            this.f996f = minute;
            dayOfMonth = this.d.getDayOfMonth();
            this.f997g = dayOfMonth;
            monthValue = this.d.getMonthValue();
            this.f998h = monthValue;
            year = this.d.getYear();
            this.f999i = Integer.valueOf(String.valueOf(year).substring(2, 4)).intValue();
        }
        b(this.f1000j, this.f1001k, this.e);
        b(this.f1002l, this.f1003m, this.f996f);
        b(this.f1004n, this.f1005o, this.f997g);
        b(this.f1007q, this.f1006p, this.f998h);
        b(this.f1008s, this.r, this.f999i);
        postInvalidateDelayed(5000L);
    }
}
