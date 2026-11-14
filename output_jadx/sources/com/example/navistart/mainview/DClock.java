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
public class DClock extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f981b;
    public boolean c;
    public LocalDateTime d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f982f;

    /* renamed from: g, reason: collision with root package name */
    public int f983g;

    /* renamed from: h, reason: collision with root package name */
    public int f984h;

    /* renamed from: i, reason: collision with root package name */
    public int f985i;

    /* renamed from: j, reason: collision with root package name */
    public ImageView f986j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f987k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f988l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView f989m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView f990n;

    /* renamed from: o, reason: collision with root package name */
    public ImageView f991o;

    /* renamed from: p, reason: collision with root package name */
    public ImageView f992p;

    /* renamed from: q, reason: collision with root package name */
    public ImageView f993q;
    public ImageView r;

    /* renamed from: s, reason: collision with root package name */
    public ImageView f994s;

    public DClock(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, R.layout.digitalclock, this);
        a();
    }

    public final void a() {
        ArrayList arrayList = new ArrayList();
        this.f981b = arrayList;
        arrayList.add(Integer.valueOf(R.drawable.digital_zero));
        this.f981b.add(Integer.valueOf(R.drawable.digital_one));
        this.f981b.add(Integer.valueOf(R.drawable.digital_two));
        this.f981b.add(Integer.valueOf(R.drawable.digital_three));
        this.f981b.add(Integer.valueOf(R.drawable.digital_four));
        this.f981b.add(Integer.valueOf(R.drawable.digital_five));
        this.f981b.add(Integer.valueOf(R.drawable.digital_six));
        this.f981b.add(Integer.valueOf(R.drawable.digital_seven));
        this.f981b.add(Integer.valueOf(R.drawable.digital_eight));
        this.f981b.add(Integer.valueOf(R.drawable.digital_nine));
        this.f986j = (ImageView) findViewById(R.id.ivDigitalHH);
        this.f987k = (ImageView) findViewById(R.id.ivDigitalH);
        this.f988l = (ImageView) findViewById(R.id.ivDigitalMM);
        this.f989m = (ImageView) findViewById(R.id.ivDigitalM);
        this.f991o = (ImageView) findViewById(R.id.dD);
        this.f990n = (ImageView) findViewById(R.id.dDD);
        this.f992p = (ImageView) findViewById(R.id.dM);
        this.f993q = (ImageView) findViewById(R.id.dMM);
        this.r = (ImageView) findViewById(R.id.dG);
        this.f994s = (ImageView) findViewById(R.id.dGG);
        setWillNotDraw(false);
        this.c = true;
    }

    public final void b(ImageView imageView, ImageView imageView2, int i10) {
        imageView.setImageResource(((Integer) this.f981b.get(i10 / 10)).intValue());
        imageView2.setImageResource(((Integer) this.f981b.get(i10 % 10)).intValue());
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
            this.f982f = minute;
            dayOfMonth = this.d.getDayOfMonth();
            this.f983g = dayOfMonth;
            monthValue = this.d.getMonthValue();
            this.f984h = monthValue;
            year = this.d.getYear();
            this.f985i = Integer.valueOf(String.valueOf(year).substring(2, 4)).intValue();
        }
        b(this.f986j, this.f987k, this.e);
        b(this.f988l, this.f989m, this.f982f);
        b(this.f990n, this.f991o, this.f983g);
        b(this.f993q, this.f992p, this.f984h);
        b(this.f994s, this.r, this.f985i);
        postInvalidateDelayed(5000L);
    }
}
