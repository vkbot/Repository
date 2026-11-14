package com.example.navistart;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.navistart.CarControlActivity;
import com.example.navistart.mainview.HeatingButtonView;
import e0.m;
import e0.n;
import e0.w;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class CarControlActivity extends AppCompatActivity {
    public static final /* synthetic */ int t = 0;
    public ScheduledFuture d;
    public ScheduledFuture e;

    /* renamed from: g, reason: collision with root package name */
    public HeatingButtonView f721g;

    /* renamed from: h, reason: collision with root package name */
    public HeatingButtonView f722h;

    /* renamed from: i, reason: collision with root package name */
    public HeatingButtonView f723i;

    /* renamed from: j, reason: collision with root package name */
    public HeatingButtonView f724j;

    /* renamed from: k, reason: collision with root package name */
    public HeatingButtonView f725k;

    /* renamed from: l, reason: collision with root package name */
    public HeatingButtonView f726l;

    /* renamed from: m, reason: collision with root package name */
    public HeatingButtonView f727m;

    /* renamed from: n, reason: collision with root package name */
    public HeatingButtonView f728n;

    /* renamed from: o, reason: collision with root package name */
    public HeatingButtonView f729o;

    /* renamed from: p, reason: collision with root package name */
    public HeatingButtonView f730p;

    /* renamed from: q, reason: collision with root package name */
    public HeatingButtonView f731q;
    public TextView r;

    /* renamed from: b, reason: collision with root package name */
    public final String f719b = m.h(new byte[]{-49, 40, -90, -124, 92, -125, 100, -34, -29, 37, -107, -92, 71, -124, 102, -59, -8, 48}, new byte[]{-116, 73, -44, -57, 51, -19, 16, -84});
    public final ScheduledThreadPoolExecutor c = w.c(-1, m.h(new byte[]{62, 26, 23, -119, -69, 86, -67, 32, 18, 23, 36, -87, -96, 81, -65, 59, 9, 2}, new byte[]{125, 123, 101, -54, -44, 56, -55, 82}));

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f720f = Boolean.TRUE;

    /* renamed from: s, reason: collision with root package name */
    public final n f732s = new n(this, 0);

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BlackActivity.t(this);
        setContentView(R.layout.activity_car_control);
        final int i10 = 5;
        ((Button) findViewById(R.id.button22)).setOnClickListener(new View.OnClickListener(this) { // from class: e0.o
            public final /* synthetic */ CarControlActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                CarControlActivity carControlActivity = this.c;
                switch (i11) {
                    case 0:
                        int a10 = carControlActivity.f721g.a();
                        if (a10 > 1) {
                            carControlActivity.f722h.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a10, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-72, 57, -58, 46, -100, -52, -127, 104, -81, 23, -38, 57, -125, -21, -118, 51, -5}, new byte[]{-37, 85, -81, 77, -9, -124, -28, 9}) + a10);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 1:
                        int a11 = carControlActivity.f722h.a();
                        if (a11 > 1) {
                            carControlActivity.f721g.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a11, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{35, -74, 104, -26, 74, -9, -2, -118, 52, -104, 116, -15, 85, -48, -11, -47, 96}, new byte[]{64, -38, 1, -123, 33, -65, -101, -21}) + a11);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 2:
                        int a12 = carControlActivity.f723i.a();
                        if (a12 > 1) {
                            carControlActivity.f724j.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a12, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-58, -75, -127, 19, 24, 33, 119, 29, -47, -101, -99, 4, 7, 6, 124, 70, -123}, new byte[]{-91, -39, -24, 112, 115, 105, 18, 124}) + a12);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 3:
                        int a13 = carControlActivity.f724j.a();
                        if (a13 > 1) {
                            carControlActivity.f723i.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a13, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-50, 79, 93, -17, 54, -54, 22, 20, -39, 97, 65, -8, 41, -19, 29, 79, -115}, new byte[]{-83, 35, 52, -116, 93, -126, 115, 117}) + a13);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 4:
                        int a14 = carControlActivity.f728n.a();
                        if (a14 > 1) {
                            carControlActivity.f730p.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(1, a14);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 5:
                        int i12 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 6:
                        int a15 = carControlActivity.f730p.a();
                        if (a15 > 1) {
                            carControlActivity.f728n.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(1, a15);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 7:
                        int a16 = carControlActivity.f729o.a();
                        if (a16 > 1) {
                            carControlActivity.f731q.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(0, a16);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 8:
                        int a17 = carControlActivity.f731q.a();
                        if (a17 > 1) {
                            carControlActivity.f729o.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(0, a17);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 9:
                        int i13 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 10:
                        int a18 = carControlActivity.f725k.a();
                        if (a18 == 3) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.TRUE);
                        } else if (a18 == 1) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 11:
                        int a19 = carControlActivity.f726l.a();
                        if (a19 == 3) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.TRUE);
                        } else if (a19 == 1) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    default:
                        int a20 = carControlActivity.f727m.a();
                        if (a20 == 3) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.TRUE);
                        } else if (a20 == 1) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                }
            }
        });
        final int i11 = 9;
        ((RelativeLayout) findViewById(R.id.carcontrolactivity)).setOnClickListener(new View.OnClickListener(this) { // from class: e0.o
            public final /* synthetic */ CarControlActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                CarControlActivity carControlActivity = this.c;
                switch (i112) {
                    case 0:
                        int a10 = carControlActivity.f721g.a();
                        if (a10 > 1) {
                            carControlActivity.f722h.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a10, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-72, 57, -58, 46, -100, -52, -127, 104, -81, 23, -38, 57, -125, -21, -118, 51, -5}, new byte[]{-37, 85, -81, 77, -9, -124, -28, 9}) + a10);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 1:
                        int a11 = carControlActivity.f722h.a();
                        if (a11 > 1) {
                            carControlActivity.f721g.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a11, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{35, -74, 104, -26, 74, -9, -2, -118, 52, -104, 116, -15, 85, -48, -11, -47, 96}, new byte[]{64, -38, 1, -123, 33, -65, -101, -21}) + a11);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 2:
                        int a12 = carControlActivity.f723i.a();
                        if (a12 > 1) {
                            carControlActivity.f724j.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a12, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-58, -75, -127, 19, 24, 33, 119, 29, -47, -101, -99, 4, 7, 6, 124, 70, -123}, new byte[]{-91, -39, -24, 112, 115, 105, 18, 124}) + a12);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 3:
                        int a13 = carControlActivity.f724j.a();
                        if (a13 > 1) {
                            carControlActivity.f723i.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a13, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-50, 79, 93, -17, 54, -54, 22, 20, -39, 97, 65, -8, 41, -19, 29, 79, -115}, new byte[]{-83, 35, 52, -116, 93, -126, 115, 117}) + a13);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 4:
                        int a14 = carControlActivity.f728n.a();
                        if (a14 > 1) {
                            carControlActivity.f730p.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(1, a14);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 5:
                        int i12 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 6:
                        int a15 = carControlActivity.f730p.a();
                        if (a15 > 1) {
                            carControlActivity.f728n.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(1, a15);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 7:
                        int a16 = carControlActivity.f729o.a();
                        if (a16 > 1) {
                            carControlActivity.f731q.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(0, a16);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 8:
                        int a17 = carControlActivity.f731q.a();
                        if (a17 > 1) {
                            carControlActivity.f729o.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(0, a17);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 9:
                        int i13 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 10:
                        int a18 = carControlActivity.f725k.a();
                        if (a18 == 3) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.TRUE);
                        } else if (a18 == 1) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 11:
                        int a19 = carControlActivity.f726l.a();
                        if (a19 == 3) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.TRUE);
                        } else if (a19 == 1) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    default:
                        int a20 = carControlActivity.f727m.a();
                        if (a20 == 3) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.TRUE);
                        } else if (a20 == 1) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                }
            }
        });
        this.r = (TextView) findViewById(R.id.textView34);
        HeatingButtonView heatingButtonView = (HeatingButtonView) findViewById(R.id.heat_vil_button_view);
        this.f725k = heatingButtonView;
        final int i12 = 10;
        heatingButtonView.getHeatingButton().setOnClickListener(new View.OnClickListener(this) { // from class: e0.o
            public final /* synthetic */ CarControlActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                CarControlActivity carControlActivity = this.c;
                switch (i112) {
                    case 0:
                        int a10 = carControlActivity.f721g.a();
                        if (a10 > 1) {
                            carControlActivity.f722h.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a10, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-72, 57, -58, 46, -100, -52, -127, 104, -81, 23, -38, 57, -125, -21, -118, 51, -5}, new byte[]{-37, 85, -81, 77, -9, -124, -28, 9}) + a10);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 1:
                        int a11 = carControlActivity.f722h.a();
                        if (a11 > 1) {
                            carControlActivity.f721g.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a11, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{35, -74, 104, -26, 74, -9, -2, -118, 52, -104, 116, -15, 85, -48, -11, -47, 96}, new byte[]{64, -38, 1, -123, 33, -65, -101, -21}) + a11);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 2:
                        int a12 = carControlActivity.f723i.a();
                        if (a12 > 1) {
                            carControlActivity.f724j.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a12, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-58, -75, -127, 19, 24, 33, 119, 29, -47, -101, -99, 4, 7, 6, 124, 70, -123}, new byte[]{-91, -39, -24, 112, 115, 105, 18, 124}) + a12);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 3:
                        int a13 = carControlActivity.f724j.a();
                        if (a13 > 1) {
                            carControlActivity.f723i.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a13, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-50, 79, 93, -17, 54, -54, 22, 20, -39, 97, 65, -8, 41, -19, 29, 79, -115}, new byte[]{-83, 35, 52, -116, 93, -126, 115, 117}) + a13);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 4:
                        int a14 = carControlActivity.f728n.a();
                        if (a14 > 1) {
                            carControlActivity.f730p.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(1, a14);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 5:
                        int i122 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 6:
                        int a15 = carControlActivity.f730p.a();
                        if (a15 > 1) {
                            carControlActivity.f728n.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(1, a15);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 7:
                        int a16 = carControlActivity.f729o.a();
                        if (a16 > 1) {
                            carControlActivity.f731q.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(0, a16);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 8:
                        int a17 = carControlActivity.f731q.a();
                        if (a17 > 1) {
                            carControlActivity.f729o.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(0, a17);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 9:
                        int i13 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 10:
                        int a18 = carControlActivity.f725k.a();
                        if (a18 == 3) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.TRUE);
                        } else if (a18 == 1) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 11:
                        int a19 = carControlActivity.f726l.a();
                        if (a19 == 3) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.TRUE);
                        } else if (a19 == 1) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    default:
                        int a20 = carControlActivity.f727m.a();
                        if (a20 == 3) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.TRUE);
                        } else if (a20 == 1) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                }
            }
        });
        HeatingButtonView heatingButtonView2 = (HeatingButtonView) findViewById(R.id.heat_lob_button_view);
        this.f726l = heatingButtonView2;
        final int i13 = 11;
        heatingButtonView2.getHeatingButton().setOnClickListener(new View.OnClickListener(this) { // from class: e0.o
            public final /* synthetic */ CarControlActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i13;
                CarControlActivity carControlActivity = this.c;
                switch (i112) {
                    case 0:
                        int a10 = carControlActivity.f721g.a();
                        if (a10 > 1) {
                            carControlActivity.f722h.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a10, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-72, 57, -58, 46, -100, -52, -127, 104, -81, 23, -38, 57, -125, -21, -118, 51, -5}, new byte[]{-37, 85, -81, 77, -9, -124, -28, 9}) + a10);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 1:
                        int a11 = carControlActivity.f722h.a();
                        if (a11 > 1) {
                            carControlActivity.f721g.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a11, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{35, -74, 104, -26, 74, -9, -2, -118, 52, -104, 116, -15, 85, -48, -11, -47, 96}, new byte[]{64, -38, 1, -123, 33, -65, -101, -21}) + a11);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 2:
                        int a12 = carControlActivity.f723i.a();
                        if (a12 > 1) {
                            carControlActivity.f724j.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a12, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-58, -75, -127, 19, 24, 33, 119, 29, -47, -101, -99, 4, 7, 6, 124, 70, -123}, new byte[]{-91, -39, -24, 112, 115, 105, 18, 124}) + a12);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 3:
                        int a13 = carControlActivity.f724j.a();
                        if (a13 > 1) {
                            carControlActivity.f723i.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a13, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-50, 79, 93, -17, 54, -54, 22, 20, -39, 97, 65, -8, 41, -19, 29, 79, -115}, new byte[]{-83, 35, 52, -116, 93, -126, 115, 117}) + a13);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 4:
                        int a14 = carControlActivity.f728n.a();
                        if (a14 > 1) {
                            carControlActivity.f730p.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(1, a14);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 5:
                        int i122 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 6:
                        int a15 = carControlActivity.f730p.a();
                        if (a15 > 1) {
                            carControlActivity.f728n.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(1, a15);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 7:
                        int a16 = carControlActivity.f729o.a();
                        if (a16 > 1) {
                            carControlActivity.f731q.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(0, a16);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 8:
                        int a17 = carControlActivity.f731q.a();
                        if (a17 > 1) {
                            carControlActivity.f729o.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(0, a17);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 9:
                        int i132 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 10:
                        int a18 = carControlActivity.f725k.a();
                        if (a18 == 3) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.TRUE);
                        } else if (a18 == 1) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 11:
                        int a19 = carControlActivity.f726l.a();
                        if (a19 == 3) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.TRUE);
                        } else if (a19 == 1) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    default:
                        int a20 = carControlActivity.f727m.a();
                        if (a20 == 3) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.TRUE);
                        } else if (a20 == 1) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                }
            }
        });
        HeatingButtonView heatingButtonView3 = (HeatingButtonView) findViewById(R.id.heat_zad_button_view);
        this.f727m = heatingButtonView3;
        final int i14 = 12;
        heatingButtonView3.getHeatingButton().setOnClickListener(new View.OnClickListener(this) { // from class: e0.o
            public final /* synthetic */ CarControlActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i14;
                CarControlActivity carControlActivity = this.c;
                switch (i112) {
                    case 0:
                        int a10 = carControlActivity.f721g.a();
                        if (a10 > 1) {
                            carControlActivity.f722h.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a10, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-72, 57, -58, 46, -100, -52, -127, 104, -81, 23, -38, 57, -125, -21, -118, 51, -5}, new byte[]{-37, 85, -81, 77, -9, -124, -28, 9}) + a10);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 1:
                        int a11 = carControlActivity.f722h.a();
                        if (a11 > 1) {
                            carControlActivity.f721g.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a11, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{35, -74, 104, -26, 74, -9, -2, -118, 52, -104, 116, -15, 85, -48, -11, -47, 96}, new byte[]{64, -38, 1, -123, 33, -65, -101, -21}) + a11);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 2:
                        int a12 = carControlActivity.f723i.a();
                        if (a12 > 1) {
                            carControlActivity.f724j.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a12, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-58, -75, -127, 19, 24, 33, 119, 29, -47, -101, -99, 4, 7, 6, 124, 70, -123}, new byte[]{-91, -39, -24, 112, 115, 105, 18, 124}) + a12);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 3:
                        int a13 = carControlActivity.f724j.a();
                        if (a13 > 1) {
                            carControlActivity.f723i.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a13, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-50, 79, 93, -17, 54, -54, 22, 20, -39, 97, 65, -8, 41, -19, 29, 79, -115}, new byte[]{-83, 35, 52, -116, 93, -126, 115, 117}) + a13);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 4:
                        int a14 = carControlActivity.f728n.a();
                        if (a14 > 1) {
                            carControlActivity.f730p.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(1, a14);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 5:
                        int i122 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 6:
                        int a15 = carControlActivity.f730p.a();
                        if (a15 > 1) {
                            carControlActivity.f728n.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(1, a15);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 7:
                        int a16 = carControlActivity.f729o.a();
                        if (a16 > 1) {
                            carControlActivity.f731q.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(0, a16);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 8:
                        int a17 = carControlActivity.f731q.a();
                        if (a17 > 1) {
                            carControlActivity.f729o.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(0, a17);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 9:
                        int i132 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 10:
                        int a18 = carControlActivity.f725k.a();
                        if (a18 == 3) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.TRUE);
                        } else if (a18 == 1) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 11:
                        int a19 = carControlActivity.f726l.a();
                        if (a19 == 3) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.TRUE);
                        } else if (a19 == 1) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    default:
                        int a20 = carControlActivity.f727m.a();
                        if (a20 == 3) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.TRUE);
                        } else if (a20 == 1) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                }
            }
        });
        HeatingButtonView heatingButtonView4 = (HeatingButtonView) findViewById(R.id.heating_left_button_view);
        this.f721g = heatingButtonView4;
        final int i15 = 0;
        heatingButtonView4.getHeatingButton().setOnClickListener(new View.OnClickListener(this) { // from class: e0.o
            public final /* synthetic */ CarControlActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i15;
                CarControlActivity carControlActivity = this.c;
                switch (i112) {
                    case 0:
                        int a10 = carControlActivity.f721g.a();
                        if (a10 > 1) {
                            carControlActivity.f722h.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a10, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-72, 57, -58, 46, -100, -52, -127, 104, -81, 23, -38, 57, -125, -21, -118, 51, -5}, new byte[]{-37, 85, -81, 77, -9, -124, -28, 9}) + a10);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 1:
                        int a11 = carControlActivity.f722h.a();
                        if (a11 > 1) {
                            carControlActivity.f721g.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a11, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{35, -74, 104, -26, 74, -9, -2, -118, 52, -104, 116, -15, 85, -48, -11, -47, 96}, new byte[]{64, -38, 1, -123, 33, -65, -101, -21}) + a11);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 2:
                        int a12 = carControlActivity.f723i.a();
                        if (a12 > 1) {
                            carControlActivity.f724j.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a12, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-58, -75, -127, 19, 24, 33, 119, 29, -47, -101, -99, 4, 7, 6, 124, 70, -123}, new byte[]{-91, -39, -24, 112, 115, 105, 18, 124}) + a12);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 3:
                        int a13 = carControlActivity.f724j.a();
                        if (a13 > 1) {
                            carControlActivity.f723i.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a13, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-50, 79, 93, -17, 54, -54, 22, 20, -39, 97, 65, -8, 41, -19, 29, 79, -115}, new byte[]{-83, 35, 52, -116, 93, -126, 115, 117}) + a13);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 4:
                        int a14 = carControlActivity.f728n.a();
                        if (a14 > 1) {
                            carControlActivity.f730p.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(1, a14);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 5:
                        int i122 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 6:
                        int a15 = carControlActivity.f730p.a();
                        if (a15 > 1) {
                            carControlActivity.f728n.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(1, a15);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 7:
                        int a16 = carControlActivity.f729o.a();
                        if (a16 > 1) {
                            carControlActivity.f731q.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(0, a16);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 8:
                        int a17 = carControlActivity.f731q.a();
                        if (a17 > 1) {
                            carControlActivity.f729o.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(0, a17);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 9:
                        int i132 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 10:
                        int a18 = carControlActivity.f725k.a();
                        if (a18 == 3) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.TRUE);
                        } else if (a18 == 1) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 11:
                        int a19 = carControlActivity.f726l.a();
                        if (a19 == 3) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.TRUE);
                        } else if (a19 == 1) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    default:
                        int a20 = carControlActivity.f727m.a();
                        if (a20 == 3) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.TRUE);
                        } else if (a20 == 1) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                }
            }
        });
        HeatingButtonView heatingButtonView5 = (HeatingButtonView) findViewById(R.id.vent_left_button_view);
        this.f722h = heatingButtonView5;
        final int i16 = 1;
        heatingButtonView5.getHeatingButton().setOnClickListener(new View.OnClickListener(this) { // from class: e0.o
            public final /* synthetic */ CarControlActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i16;
                CarControlActivity carControlActivity = this.c;
                switch (i112) {
                    case 0:
                        int a10 = carControlActivity.f721g.a();
                        if (a10 > 1) {
                            carControlActivity.f722h.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a10, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-72, 57, -58, 46, -100, -52, -127, 104, -81, 23, -38, 57, -125, -21, -118, 51, -5}, new byte[]{-37, 85, -81, 77, -9, -124, -28, 9}) + a10);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 1:
                        int a11 = carControlActivity.f722h.a();
                        if (a11 > 1) {
                            carControlActivity.f721g.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a11, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{35, -74, 104, -26, 74, -9, -2, -118, 52, -104, 116, -15, 85, -48, -11, -47, 96}, new byte[]{64, -38, 1, -123, 33, -65, -101, -21}) + a11);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 2:
                        int a12 = carControlActivity.f723i.a();
                        if (a12 > 1) {
                            carControlActivity.f724j.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a12, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-58, -75, -127, 19, 24, 33, 119, 29, -47, -101, -99, 4, 7, 6, 124, 70, -123}, new byte[]{-91, -39, -24, 112, 115, 105, 18, 124}) + a12);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 3:
                        int a13 = carControlActivity.f724j.a();
                        if (a13 > 1) {
                            carControlActivity.f723i.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a13, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-50, 79, 93, -17, 54, -54, 22, 20, -39, 97, 65, -8, 41, -19, 29, 79, -115}, new byte[]{-83, 35, 52, -116, 93, -126, 115, 117}) + a13);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 4:
                        int a14 = carControlActivity.f728n.a();
                        if (a14 > 1) {
                            carControlActivity.f730p.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(1, a14);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 5:
                        int i122 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 6:
                        int a15 = carControlActivity.f730p.a();
                        if (a15 > 1) {
                            carControlActivity.f728n.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(1, a15);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 7:
                        int a16 = carControlActivity.f729o.a();
                        if (a16 > 1) {
                            carControlActivity.f731q.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(0, a16);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 8:
                        int a17 = carControlActivity.f731q.a();
                        if (a17 > 1) {
                            carControlActivity.f729o.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(0, a17);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 9:
                        int i132 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 10:
                        int a18 = carControlActivity.f725k.a();
                        if (a18 == 3) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.TRUE);
                        } else if (a18 == 1) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 11:
                        int a19 = carControlActivity.f726l.a();
                        if (a19 == 3) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.TRUE);
                        } else if (a19 == 1) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    default:
                        int a20 = carControlActivity.f727m.a();
                        if (a20 == 3) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.TRUE);
                        } else if (a20 == 1) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                }
            }
        });
        HeatingButtonView heatingButtonView6 = (HeatingButtonView) findViewById(R.id.heating_right_button_view);
        this.f723i = heatingButtonView6;
        final int i17 = 2;
        heatingButtonView6.getHeatingButton().setOnClickListener(new View.OnClickListener(this) { // from class: e0.o
            public final /* synthetic */ CarControlActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i17;
                CarControlActivity carControlActivity = this.c;
                switch (i112) {
                    case 0:
                        int a10 = carControlActivity.f721g.a();
                        if (a10 > 1) {
                            carControlActivity.f722h.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a10, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-72, 57, -58, 46, -100, -52, -127, 104, -81, 23, -38, 57, -125, -21, -118, 51, -5}, new byte[]{-37, 85, -81, 77, -9, -124, -28, 9}) + a10);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 1:
                        int a11 = carControlActivity.f722h.a();
                        if (a11 > 1) {
                            carControlActivity.f721g.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a11, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{35, -74, 104, -26, 74, -9, -2, -118, 52, -104, 116, -15, 85, -48, -11, -47, 96}, new byte[]{64, -38, 1, -123, 33, -65, -101, -21}) + a11);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 2:
                        int a12 = carControlActivity.f723i.a();
                        if (a12 > 1) {
                            carControlActivity.f724j.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a12, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-58, -75, -127, 19, 24, 33, 119, 29, -47, -101, -99, 4, 7, 6, 124, 70, -123}, new byte[]{-91, -39, -24, 112, 115, 105, 18, 124}) + a12);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 3:
                        int a13 = carControlActivity.f724j.a();
                        if (a13 > 1) {
                            carControlActivity.f723i.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a13, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-50, 79, 93, -17, 54, -54, 22, 20, -39, 97, 65, -8, 41, -19, 29, 79, -115}, new byte[]{-83, 35, 52, -116, 93, -126, 115, 117}) + a13);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 4:
                        int a14 = carControlActivity.f728n.a();
                        if (a14 > 1) {
                            carControlActivity.f730p.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(1, a14);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 5:
                        int i122 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 6:
                        int a15 = carControlActivity.f730p.a();
                        if (a15 > 1) {
                            carControlActivity.f728n.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(1, a15);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 7:
                        int a16 = carControlActivity.f729o.a();
                        if (a16 > 1) {
                            carControlActivity.f731q.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(0, a16);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 8:
                        int a17 = carControlActivity.f731q.a();
                        if (a17 > 1) {
                            carControlActivity.f729o.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(0, a17);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 9:
                        int i132 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 10:
                        int a18 = carControlActivity.f725k.a();
                        if (a18 == 3) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.TRUE);
                        } else if (a18 == 1) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 11:
                        int a19 = carControlActivity.f726l.a();
                        if (a19 == 3) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.TRUE);
                        } else if (a19 == 1) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    default:
                        int a20 = carControlActivity.f727m.a();
                        if (a20 == 3) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.TRUE);
                        } else if (a20 == 1) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                }
            }
        });
        HeatingButtonView heatingButtonView7 = (HeatingButtonView) findViewById(R.id.vent_right_button_view);
        this.f724j = heatingButtonView7;
        final int i18 = 3;
        heatingButtonView7.getHeatingButton().setOnClickListener(new View.OnClickListener(this) { // from class: e0.o
            public final /* synthetic */ CarControlActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i18;
                CarControlActivity carControlActivity = this.c;
                switch (i112) {
                    case 0:
                        int a10 = carControlActivity.f721g.a();
                        if (a10 > 1) {
                            carControlActivity.f722h.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a10, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-72, 57, -58, 46, -100, -52, -127, 104, -81, 23, -38, 57, -125, -21, -118, 51, -5}, new byte[]{-37, 85, -81, 77, -9, -124, -28, 9}) + a10);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 1:
                        int a11 = carControlActivity.f722h.a();
                        if (a11 > 1) {
                            carControlActivity.f721g.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a11, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{35, -74, 104, -26, 74, -9, -2, -118, 52, -104, 116, -15, 85, -48, -11, -47, 96}, new byte[]{64, -38, 1, -123, 33, -65, -101, -21}) + a11);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 2:
                        int a12 = carControlActivity.f723i.a();
                        if (a12 > 1) {
                            carControlActivity.f724j.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a12, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-58, -75, -127, 19, 24, 33, 119, 29, -47, -101, -99, 4, 7, 6, 124, 70, -123}, new byte[]{-91, -39, -24, 112, 115, 105, 18, 124}) + a12);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 3:
                        int a13 = carControlActivity.f724j.a();
                        if (a13 > 1) {
                            carControlActivity.f723i.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a13, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-50, 79, 93, -17, 54, -54, 22, 20, -39, 97, 65, -8, 41, -19, 29, 79, -115}, new byte[]{-83, 35, 52, -116, 93, -126, 115, 117}) + a13);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 4:
                        int a14 = carControlActivity.f728n.a();
                        if (a14 > 1) {
                            carControlActivity.f730p.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(1, a14);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 5:
                        int i122 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 6:
                        int a15 = carControlActivity.f730p.a();
                        if (a15 > 1) {
                            carControlActivity.f728n.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(1, a15);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 7:
                        int a16 = carControlActivity.f729o.a();
                        if (a16 > 1) {
                            carControlActivity.f731q.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(0, a16);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 8:
                        int a17 = carControlActivity.f731q.a();
                        if (a17 > 1) {
                            carControlActivity.f729o.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(0, a17);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 9:
                        int i132 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 10:
                        int a18 = carControlActivity.f725k.a();
                        if (a18 == 3) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.TRUE);
                        } else if (a18 == 1) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 11:
                        int a19 = carControlActivity.f726l.a();
                        if (a19 == 3) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.TRUE);
                        } else if (a19 == 1) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    default:
                        int a20 = carControlActivity.f727m.a();
                        if (a20 == 3) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.TRUE);
                        } else if (a20 == 1) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                }
            }
        });
        HeatingButtonView heatingButtonView8 = (HeatingButtonView) findViewById(R.id.heat_zad_seat_r_button_view);
        this.f728n = heatingButtonView8;
        final int i19 = 4;
        heatingButtonView8.getHeatingButton().setOnClickListener(new View.OnClickListener(this) { // from class: e0.o
            public final /* synthetic */ CarControlActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i19;
                CarControlActivity carControlActivity = this.c;
                switch (i112) {
                    case 0:
                        int a10 = carControlActivity.f721g.a();
                        if (a10 > 1) {
                            carControlActivity.f722h.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a10, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-72, 57, -58, 46, -100, -52, -127, 104, -81, 23, -38, 57, -125, -21, -118, 51, -5}, new byte[]{-37, 85, -81, 77, -9, -124, -28, 9}) + a10);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 1:
                        int a11 = carControlActivity.f722h.a();
                        if (a11 > 1) {
                            carControlActivity.f721g.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a11, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{35, -74, 104, -26, 74, -9, -2, -118, 52, -104, 116, -15, 85, -48, -11, -47, 96}, new byte[]{64, -38, 1, -123, 33, -65, -101, -21}) + a11);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 2:
                        int a12 = carControlActivity.f723i.a();
                        if (a12 > 1) {
                            carControlActivity.f724j.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a12, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-58, -75, -127, 19, 24, 33, 119, 29, -47, -101, -99, 4, 7, 6, 124, 70, -123}, new byte[]{-91, -39, -24, 112, 115, 105, 18, 124}) + a12);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 3:
                        int a13 = carControlActivity.f724j.a();
                        if (a13 > 1) {
                            carControlActivity.f723i.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a13, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-50, 79, 93, -17, 54, -54, 22, 20, -39, 97, 65, -8, 41, -19, 29, 79, -115}, new byte[]{-83, 35, 52, -116, 93, -126, 115, 117}) + a13);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 4:
                        int a14 = carControlActivity.f728n.a();
                        if (a14 > 1) {
                            carControlActivity.f730p.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(1, a14);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 5:
                        int i122 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 6:
                        int a15 = carControlActivity.f730p.a();
                        if (a15 > 1) {
                            carControlActivity.f728n.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(1, a15);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 7:
                        int a16 = carControlActivity.f729o.a();
                        if (a16 > 1) {
                            carControlActivity.f731q.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(0, a16);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 8:
                        int a17 = carControlActivity.f731q.a();
                        if (a17 > 1) {
                            carControlActivity.f729o.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(0, a17);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 9:
                        int i132 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 10:
                        int a18 = carControlActivity.f725k.a();
                        if (a18 == 3) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.TRUE);
                        } else if (a18 == 1) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 11:
                        int a19 = carControlActivity.f726l.a();
                        if (a19 == 3) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.TRUE);
                        } else if (a19 == 1) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    default:
                        int a20 = carControlActivity.f727m.a();
                        if (a20 == 3) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.TRUE);
                        } else if (a20 == 1) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                }
            }
        });
        HeatingButtonView heatingButtonView9 = (HeatingButtonView) findViewById(R.id.vent_zad_seat_r_button_view);
        this.f730p = heatingButtonView9;
        final int i20 = 6;
        heatingButtonView9.getHeatingButton().setOnClickListener(new View.OnClickListener(this) { // from class: e0.o
            public final /* synthetic */ CarControlActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i20;
                CarControlActivity carControlActivity = this.c;
                switch (i112) {
                    case 0:
                        int a10 = carControlActivity.f721g.a();
                        if (a10 > 1) {
                            carControlActivity.f722h.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a10, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-72, 57, -58, 46, -100, -52, -127, 104, -81, 23, -38, 57, -125, -21, -118, 51, -5}, new byte[]{-37, 85, -81, 77, -9, -124, -28, 9}) + a10);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 1:
                        int a11 = carControlActivity.f722h.a();
                        if (a11 > 1) {
                            carControlActivity.f721g.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a11, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{35, -74, 104, -26, 74, -9, -2, -118, 52, -104, 116, -15, 85, -48, -11, -47, 96}, new byte[]{64, -38, 1, -123, 33, -65, -101, -21}) + a11);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 2:
                        int a12 = carControlActivity.f723i.a();
                        if (a12 > 1) {
                            carControlActivity.f724j.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a12, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-58, -75, -127, 19, 24, 33, 119, 29, -47, -101, -99, 4, 7, 6, 124, 70, -123}, new byte[]{-91, -39, -24, 112, 115, 105, 18, 124}) + a12);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 3:
                        int a13 = carControlActivity.f724j.a();
                        if (a13 > 1) {
                            carControlActivity.f723i.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a13, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-50, 79, 93, -17, 54, -54, 22, 20, -39, 97, 65, -8, 41, -19, 29, 79, -115}, new byte[]{-83, 35, 52, -116, 93, -126, 115, 117}) + a13);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 4:
                        int a14 = carControlActivity.f728n.a();
                        if (a14 > 1) {
                            carControlActivity.f730p.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(1, a14);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 5:
                        int i122 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 6:
                        int a15 = carControlActivity.f730p.a();
                        if (a15 > 1) {
                            carControlActivity.f728n.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(1, a15);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 7:
                        int a16 = carControlActivity.f729o.a();
                        if (a16 > 1) {
                            carControlActivity.f731q.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(0, a16);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 8:
                        int a17 = carControlActivity.f731q.a();
                        if (a17 > 1) {
                            carControlActivity.f729o.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(0, a17);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 9:
                        int i132 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 10:
                        int a18 = carControlActivity.f725k.a();
                        if (a18 == 3) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.TRUE);
                        } else if (a18 == 1) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 11:
                        int a19 = carControlActivity.f726l.a();
                        if (a19 == 3) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.TRUE);
                        } else if (a19 == 1) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    default:
                        int a20 = carControlActivity.f727m.a();
                        if (a20 == 3) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.TRUE);
                        } else if (a20 == 1) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                }
            }
        });
        HeatingButtonView heatingButtonView10 = (HeatingButtonView) findViewById(R.id.heat_zad_seat_l_button_view);
        this.f729o = heatingButtonView10;
        final int i21 = 7;
        heatingButtonView10.getHeatingButton().setOnClickListener(new View.OnClickListener(this) { // from class: e0.o
            public final /* synthetic */ CarControlActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i21;
                CarControlActivity carControlActivity = this.c;
                switch (i112) {
                    case 0:
                        int a10 = carControlActivity.f721g.a();
                        if (a10 > 1) {
                            carControlActivity.f722h.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a10, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-72, 57, -58, 46, -100, -52, -127, 104, -81, 23, -38, 57, -125, -21, -118, 51, -5}, new byte[]{-37, 85, -81, 77, -9, -124, -28, 9}) + a10);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 1:
                        int a11 = carControlActivity.f722h.a();
                        if (a11 > 1) {
                            carControlActivity.f721g.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a11, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{35, -74, 104, -26, 74, -9, -2, -118, 52, -104, 116, -15, 85, -48, -11, -47, 96}, new byte[]{64, -38, 1, -123, 33, -65, -101, -21}) + a11);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 2:
                        int a12 = carControlActivity.f723i.a();
                        if (a12 > 1) {
                            carControlActivity.f724j.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a12, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-58, -75, -127, 19, 24, 33, 119, 29, -47, -101, -99, 4, 7, 6, 124, 70, -123}, new byte[]{-91, -39, -24, 112, 115, 105, 18, 124}) + a12);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 3:
                        int a13 = carControlActivity.f724j.a();
                        if (a13 > 1) {
                            carControlActivity.f723i.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a13, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-50, 79, 93, -17, 54, -54, 22, 20, -39, 97, 65, -8, 41, -19, 29, 79, -115}, new byte[]{-83, 35, 52, -116, 93, -126, 115, 117}) + a13);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 4:
                        int a14 = carControlActivity.f728n.a();
                        if (a14 > 1) {
                            carControlActivity.f730p.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(1, a14);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 5:
                        int i122 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 6:
                        int a15 = carControlActivity.f730p.a();
                        if (a15 > 1) {
                            carControlActivity.f728n.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(1, a15);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 7:
                        int a16 = carControlActivity.f729o.a();
                        if (a16 > 1) {
                            carControlActivity.f731q.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(0, a16);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 8:
                        int a17 = carControlActivity.f731q.a();
                        if (a17 > 1) {
                            carControlActivity.f729o.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(0, a17);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 9:
                        int i132 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 10:
                        int a18 = carControlActivity.f725k.a();
                        if (a18 == 3) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.TRUE);
                        } else if (a18 == 1) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 11:
                        int a19 = carControlActivity.f726l.a();
                        if (a19 == 3) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.TRUE);
                        } else if (a19 == 1) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    default:
                        int a20 = carControlActivity.f727m.a();
                        if (a20 == 3) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.TRUE);
                        } else if (a20 == 1) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                }
            }
        });
        HeatingButtonView heatingButtonView11 = (HeatingButtonView) findViewById(R.id.vent_zad_seat_l_button_view);
        this.f731q = heatingButtonView11;
        final int i22 = 8;
        heatingButtonView11.getHeatingButton().setOnClickListener(new View.OnClickListener(this) { // from class: e0.o
            public final /* synthetic */ CarControlActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i22;
                CarControlActivity carControlActivity = this.c;
                switch (i112) {
                    case 0:
                        int a10 = carControlActivity.f721g.a();
                        if (a10 > 1) {
                            carControlActivity.f722h.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a10, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-72, 57, -58, 46, -100, -52, -127, 104, -81, 23, -38, 57, -125, -21, -118, 51, -5}, new byte[]{-37, 85, -81, 77, -9, -124, -28, 9}) + a10);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 1:
                        int a11 = carControlActivity.f722h.a();
                        if (a11 > 1) {
                            carControlActivity.f721g.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a11, 1);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{35, -74, 104, -26, 74, -9, -2, -118, 52, -104, 116, -15, 85, -48, -11, -47, 96}, new byte[]{64, -38, 1, -123, 33, -65, -101, -21}) + a11);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 2:
                        int a12 = carControlActivity.f723i.a();
                        if (a12 > 1) {
                            carControlActivity.f724j.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetheat(a12, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-58, -75, -127, 19, 24, 33, 119, 29, -47, -101, -99, 4, 7, 6, 124, 70, -123}, new byte[]{-91, -39, -24, 112, 115, 105, 18, 124}) + a12);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 3:
                        int a13 = carControlActivity.f724j.a();
                        if (a13 > 1) {
                            carControlActivity.f723i.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carsetvent(a13, 2);
                        Log.d(carControlActivity.f719b, m.h(new byte[]{-50, 79, 93, -17, 54, -54, 22, 20, -39, 97, 65, -8, 41, -19, 29, 79, -115}, new byte[]{-83, 35, 52, -116, 93, -126, 115, 117}) + a13);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 4:
                        int a14 = carControlActivity.f728n.a();
                        if (a14 > 1) {
                            carControlActivity.f730p.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(1, a14);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 5:
                        int i122 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 6:
                        int a15 = carControlActivity.f730p.a();
                        if (a15 > 1) {
                            carControlActivity.f728n.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(1, a15);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 7:
                        int a16 = carControlActivity.f729o.a();
                        if (a16 > 1) {
                            carControlActivity.f731q.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatHeat(0, a16);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 8:
                        int a17 = carControlActivity.f731q.a();
                        if (a17 > 1) {
                            carControlActivity.f729o.c(1);
                        }
                        h0.b.a();
                        h0.b.d().carZadSeatVent(0, a17);
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 9:
                        int i132 = CarControlActivity.t;
                        carControlActivity.moveTaskToBack(true);
                        return;
                    case 10:
                        int a18 = carControlActivity.f725k.a();
                        if (a18 == 3) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.TRUE);
                        } else if (a18 == 1) {
                            h0.b.a();
                            h0.b.d().rulheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    case 11:
                        int a19 = carControlActivity.f726l.a();
                        if (a19 == 3) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.TRUE);
                        } else if (a19 == 1) {
                            h0.b.a();
                            h0.b.d().lobheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                    default:
                        int a20 = carControlActivity.f727m.a();
                        if (a20 == 3) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.TRUE);
                        } else if (a20 == 1) {
                            h0.b.a();
                            h0.b.d().zadheatonoff(Boolean.FALSE);
                        }
                        carControlActivity.v();
                        carControlActivity.s();
                        return;
                }
            }
        });
        runOnUiThread(new n(this, 1));
        v();
        s();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        t();
        u();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.d.cancel(true);
        }
        u();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        runOnUiThread(new n(this, 1));
        v();
        s();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        t();
        u();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        t();
        u();
    }

    public final void s() {
        u();
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.e.cancel(true);
        }
        this.e = this.c.schedule(this.f732s, 30000L, TimeUnit.MILLISECONDS);
    }

    public final void t() {
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.d.cancel(true);
        }
    }

    public final void u() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.e.cancel(true);
        }
    }

    public final void v() {
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.d.cancel(true);
        }
        this.d = this.c.scheduleWithFixedDelay(new n(this, 2), 5000L, 5000L, TimeUnit.MILLISECONDS);
    }
}
