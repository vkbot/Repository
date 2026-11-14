package com.example.navistart;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.activity.f;
import androidx.appcompat.app.AppCompatActivity;
import com.example.navistart.MainActivity;
import com.example.navistart.VibVodActivity;
import com.example.navistart.mainview.HeatingButtonView;
import com.google.protobuf.q;
import e0.d0;
import e0.g3;
import e0.m;
import e0.p3;
import e0.w;
import e0.x1;
import h0.b;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.ByteCompanionObject;
import u0.a;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class VibVodActivity extends AppCompatActivity {

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f947g = Boolean.FALSE;
    public HeatingButtonView c;
    public HeatingButtonView d;
    public HeatingButtonView e;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f948b = w.c(-1, m.h(new byte[]{113, -84, 54, -85, -38, ByteCompanionObject.MIN_VALUE, -74, -92, 83, -84, 34, -108, -63, -99}, new byte[]{39, -59, 84, -3, -75, -28, -9, -57}));

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f949f = Boolean.TRUE;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BlackActivity.t(this);
        setContentView(R.layout.activity_vibor_vod);
        d0.d(this);
        boolean w = MainActivity.w();
        Boolean bool = this.f949f;
        if (w && bool.booleanValue()) {
            throw null;
        }
        if (MainActivity.v(this) && bool.booleanValue()) {
            throw null;
        }
        final int i10 = 0;
        ((RelativeLayout) findViewById(R.id.vibvodactivity)).setOnClickListener(new View.OnClickListener(this) { // from class: e0.h3
            public final /* synthetic */ VibVodActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                VibVodActivity vibVodActivity = this.c;
                switch (i11) {
                    case 0:
                        Boolean bool2 = VibVodActivity.f947g;
                        vibVodActivity.finish();
                        return;
                    case 1:
                        Boolean bool3 = vibVodActivity.f949f;
                        d0.d(vibVodActivity);
                        if (MainActivity.w() && bool3.booleanValue()) {
                            throw null;
                        }
                        if (MainActivity.v(vibVodActivity) && bool3.booleanValue()) {
                            throw null;
                        }
                        vibVodActivity.s(1);
                        if (vibVodActivity.t().booleanValue()) {
                            h0.b.a();
                            h0.b.d().carsetvod(1);
                            h0.b.a().e().e = 1;
                        }
                        vibVodActivity.f948b.schedule(new g3(vibVodActivity, 1), 300L, timeUnit);
                        return;
                    case 2:
                        Boolean bool4 = vibVodActivity.f949f;
                        d0.d(vibVodActivity);
                        if (MainActivity.w() && bool4.booleanValue()) {
                            throw null;
                        }
                        if (MainActivity.v(vibVodActivity) && bool4.booleanValue()) {
                            throw null;
                        }
                        vibVodActivity.s(2);
                        if (vibVodActivity.t().booleanValue()) {
                            h0.b.a();
                            h0.b.d().carsetvod(2);
                            h0.b.a().e().e = 2;
                        }
                        vibVodActivity.f948b.schedule(new g3(vibVodActivity, 1), 300L, timeUnit);
                        return;
                    default:
                        Boolean bool5 = vibVodActivity.f949f;
                        d0.d(vibVodActivity);
                        if (MainActivity.w() && bool5.booleanValue()) {
                            throw null;
                        }
                        if (MainActivity.v(vibVodActivity) && bool5.booleanValue()) {
                            throw null;
                        }
                        vibVodActivity.s(3);
                        if (vibVodActivity.t().booleanValue()) {
                            h0.b.a();
                            h0.b.d().carsetvod(3);
                            h0.b.a().e().e = 3;
                        }
                        vibVodActivity.f948b.schedule(new g3(vibVodActivity, 1), 300L, timeUnit);
                        return;
                }
            }
        });
        HeatingButtonView heatingButtonView = (HeatingButtonView) findViewById(R.id.vibvod_1_button_view);
        this.c = heatingButtonView;
        final int i11 = 1;
        heatingButtonView.getHeatingButton().setOnClickListener(new View.OnClickListener(this) { // from class: e0.h3
            public final /* synthetic */ VibVodActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                VibVodActivity vibVodActivity = this.c;
                switch (i112) {
                    case 0:
                        Boolean bool2 = VibVodActivity.f947g;
                        vibVodActivity.finish();
                        return;
                    case 1:
                        Boolean bool3 = vibVodActivity.f949f;
                        d0.d(vibVodActivity);
                        if (MainActivity.w() && bool3.booleanValue()) {
                            throw null;
                        }
                        if (MainActivity.v(vibVodActivity) && bool3.booleanValue()) {
                            throw null;
                        }
                        vibVodActivity.s(1);
                        if (vibVodActivity.t().booleanValue()) {
                            h0.b.a();
                            h0.b.d().carsetvod(1);
                            h0.b.a().e().e = 1;
                        }
                        vibVodActivity.f948b.schedule(new g3(vibVodActivity, 1), 300L, timeUnit);
                        return;
                    case 2:
                        Boolean bool4 = vibVodActivity.f949f;
                        d0.d(vibVodActivity);
                        if (MainActivity.w() && bool4.booleanValue()) {
                            throw null;
                        }
                        if (MainActivity.v(vibVodActivity) && bool4.booleanValue()) {
                            throw null;
                        }
                        vibVodActivity.s(2);
                        if (vibVodActivity.t().booleanValue()) {
                            h0.b.a();
                            h0.b.d().carsetvod(2);
                            h0.b.a().e().e = 2;
                        }
                        vibVodActivity.f948b.schedule(new g3(vibVodActivity, 1), 300L, timeUnit);
                        return;
                    default:
                        Boolean bool5 = vibVodActivity.f949f;
                        d0.d(vibVodActivity);
                        if (MainActivity.w() && bool5.booleanValue()) {
                            throw null;
                        }
                        if (MainActivity.v(vibVodActivity) && bool5.booleanValue()) {
                            throw null;
                        }
                        vibVodActivity.s(3);
                        if (vibVodActivity.t().booleanValue()) {
                            h0.b.a();
                            h0.b.d().carsetvod(3);
                            h0.b.a().e().e = 3;
                        }
                        vibVodActivity.f948b.schedule(new g3(vibVodActivity, 1), 300L, timeUnit);
                        return;
                }
            }
        });
        HeatingButtonView heatingButtonView2 = (HeatingButtonView) findViewById(R.id.vibvod_2_button_view);
        this.d = heatingButtonView2;
        final int i12 = 2;
        heatingButtonView2.getHeatingButton().setOnClickListener(new View.OnClickListener(this) { // from class: e0.h3
            public final /* synthetic */ VibVodActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                VibVodActivity vibVodActivity = this.c;
                switch (i112) {
                    case 0:
                        Boolean bool2 = VibVodActivity.f947g;
                        vibVodActivity.finish();
                        return;
                    case 1:
                        Boolean bool3 = vibVodActivity.f949f;
                        d0.d(vibVodActivity);
                        if (MainActivity.w() && bool3.booleanValue()) {
                            throw null;
                        }
                        if (MainActivity.v(vibVodActivity) && bool3.booleanValue()) {
                            throw null;
                        }
                        vibVodActivity.s(1);
                        if (vibVodActivity.t().booleanValue()) {
                            h0.b.a();
                            h0.b.d().carsetvod(1);
                            h0.b.a().e().e = 1;
                        }
                        vibVodActivity.f948b.schedule(new g3(vibVodActivity, 1), 300L, timeUnit);
                        return;
                    case 2:
                        Boolean bool4 = vibVodActivity.f949f;
                        d0.d(vibVodActivity);
                        if (MainActivity.w() && bool4.booleanValue()) {
                            throw null;
                        }
                        if (MainActivity.v(vibVodActivity) && bool4.booleanValue()) {
                            throw null;
                        }
                        vibVodActivity.s(2);
                        if (vibVodActivity.t().booleanValue()) {
                            h0.b.a();
                            h0.b.d().carsetvod(2);
                            h0.b.a().e().e = 2;
                        }
                        vibVodActivity.f948b.schedule(new g3(vibVodActivity, 1), 300L, timeUnit);
                        return;
                    default:
                        Boolean bool5 = vibVodActivity.f949f;
                        d0.d(vibVodActivity);
                        if (MainActivity.w() && bool5.booleanValue()) {
                            throw null;
                        }
                        if (MainActivity.v(vibVodActivity) && bool5.booleanValue()) {
                            throw null;
                        }
                        vibVodActivity.s(3);
                        if (vibVodActivity.t().booleanValue()) {
                            h0.b.a();
                            h0.b.d().carsetvod(3);
                            h0.b.a().e().e = 3;
                        }
                        vibVodActivity.f948b.schedule(new g3(vibVodActivity, 1), 300L, timeUnit);
                        return;
                }
            }
        });
        HeatingButtonView heatingButtonView3 = (HeatingButtonView) findViewById(R.id.vibvod_3_button_view);
        this.e = heatingButtonView3;
        final int i13 = 3;
        heatingButtonView3.getHeatingButton().setOnClickListener(new View.OnClickListener(this) { // from class: e0.h3
            public final /* synthetic */ VibVodActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i13;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                VibVodActivity vibVodActivity = this.c;
                switch (i112) {
                    case 0:
                        Boolean bool2 = VibVodActivity.f947g;
                        vibVodActivity.finish();
                        return;
                    case 1:
                        Boolean bool3 = vibVodActivity.f949f;
                        d0.d(vibVodActivity);
                        if (MainActivity.w() && bool3.booleanValue()) {
                            throw null;
                        }
                        if (MainActivity.v(vibVodActivity) && bool3.booleanValue()) {
                            throw null;
                        }
                        vibVodActivity.s(1);
                        if (vibVodActivity.t().booleanValue()) {
                            h0.b.a();
                            h0.b.d().carsetvod(1);
                            h0.b.a().e().e = 1;
                        }
                        vibVodActivity.f948b.schedule(new g3(vibVodActivity, 1), 300L, timeUnit);
                        return;
                    case 2:
                        Boolean bool4 = vibVodActivity.f949f;
                        d0.d(vibVodActivity);
                        if (MainActivity.w() && bool4.booleanValue()) {
                            throw null;
                        }
                        if (MainActivity.v(vibVodActivity) && bool4.booleanValue()) {
                            throw null;
                        }
                        vibVodActivity.s(2);
                        if (vibVodActivity.t().booleanValue()) {
                            h0.b.a();
                            h0.b.d().carsetvod(2);
                            h0.b.a().e().e = 2;
                        }
                        vibVodActivity.f948b.schedule(new g3(vibVodActivity, 1), 300L, timeUnit);
                        return;
                    default:
                        Boolean bool5 = vibVodActivity.f949f;
                        d0.d(vibVodActivity);
                        if (MainActivity.w() && bool5.booleanValue()) {
                            throw null;
                        }
                        if (MainActivity.v(vibVodActivity) && bool5.booleanValue()) {
                            throw null;
                        }
                        vibVodActivity.s(3);
                        if (vibVodActivity.t().booleanValue()) {
                            h0.b.a();
                            h0.b.d().carsetvod(3);
                            h0.b.a().e().e = 3;
                        }
                        vibVodActivity.f948b.schedule(new g3(vibVodActivity, 1), 300L, timeUnit);
                        return;
                }
            }
        });
        final int i14 = 0;
        this.c.getHeatingButton().setOnLongClickListener(new View.OnLongClickListener(this) { // from class: e0.i3
            public final /* synthetic */ VibVodActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i15 = i14;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                VibVodActivity vibVodActivity = this.c;
                switch (i15) {
                    case 0:
                        Boolean bool2 = VibVodActivity.f947g;
                        vibVodActivity.u(1, Boolean.TRUE);
                        vibVodActivity.f948b.schedule(new g3(vibVodActivity, 3), 500L, timeUnit);
                        if (vibVodActivity.t().booleanValue()) {
                            h0.b.a();
                            h0.b.d().carsavvod(1);
                        }
                        return true;
                    case 1:
                        Boolean bool3 = VibVodActivity.f947g;
                        vibVodActivity.u(2, Boolean.TRUE);
                        vibVodActivity.f948b.schedule(new g3(vibVodActivity, 2), 500L, timeUnit);
                        if (vibVodActivity.t().booleanValue()) {
                            h0.b.a();
                            h0.b.d().carsavvod(2);
                        }
                        return true;
                    default:
                        Boolean bool4 = VibVodActivity.f947g;
                        vibVodActivity.u(3, Boolean.TRUE);
                        vibVodActivity.f948b.schedule(new g3(vibVodActivity, 4), 500L, timeUnit);
                        if (vibVodActivity.t().booleanValue()) {
                            h0.b.a();
                            h0.b.d().carsavvod(3);
                        }
                        return true;
                }
            }
        });
        final int i15 = 1;
        this.d.getHeatingButton().setOnLongClickListener(new View.OnLongClickListener(this) { // from class: e0.i3
            public final /* synthetic */ VibVodActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i152 = i15;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                VibVodActivity vibVodActivity = this.c;
                switch (i152) {
                    case 0:
                        Boolean bool2 = VibVodActivity.f947g;
                        vibVodActivity.u(1, Boolean.TRUE);
                        vibVodActivity.f948b.schedule(new g3(vibVodActivity, 3), 500L, timeUnit);
                        if (vibVodActivity.t().booleanValue()) {
                            h0.b.a();
                            h0.b.d().carsavvod(1);
                        }
                        return true;
                    case 1:
                        Boolean bool3 = VibVodActivity.f947g;
                        vibVodActivity.u(2, Boolean.TRUE);
                        vibVodActivity.f948b.schedule(new g3(vibVodActivity, 2), 500L, timeUnit);
                        if (vibVodActivity.t().booleanValue()) {
                            h0.b.a();
                            h0.b.d().carsavvod(2);
                        }
                        return true;
                    default:
                        Boolean bool4 = VibVodActivity.f947g;
                        vibVodActivity.u(3, Boolean.TRUE);
                        vibVodActivity.f948b.schedule(new g3(vibVodActivity, 4), 500L, timeUnit);
                        if (vibVodActivity.t().booleanValue()) {
                            h0.b.a();
                            h0.b.d().carsavvod(3);
                        }
                        return true;
                }
            }
        });
        final int i16 = 2;
        this.e.getHeatingButton().setOnLongClickListener(new View.OnLongClickListener(this) { // from class: e0.i3
            public final /* synthetic */ VibVodActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i152 = i16;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                VibVodActivity vibVodActivity = this.c;
                switch (i152) {
                    case 0:
                        Boolean bool2 = VibVodActivity.f947g;
                        vibVodActivity.u(1, Boolean.TRUE);
                        vibVodActivity.f948b.schedule(new g3(vibVodActivity, 3), 500L, timeUnit);
                        if (vibVodActivity.t().booleanValue()) {
                            h0.b.a();
                            h0.b.d().carsavvod(1);
                        }
                        return true;
                    case 1:
                        Boolean bool3 = VibVodActivity.f947g;
                        vibVodActivity.u(2, Boolean.TRUE);
                        vibVodActivity.f948b.schedule(new g3(vibVodActivity, 2), 500L, timeUnit);
                        if (vibVodActivity.t().booleanValue()) {
                            h0.b.a();
                            h0.b.d().carsavvod(2);
                        }
                        return true;
                    default:
                        Boolean bool4 = VibVodActivity.f947g;
                        vibVodActivity.u(3, Boolean.TRUE);
                        vibVodActivity.f948b.schedule(new g3(vibVodActivity, 4), 500L, timeUnit);
                        if (vibVodActivity.t().booleanValue()) {
                            h0.b.a();
                            h0.b.d().carsavvod(3);
                        }
                        return true;
                }
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        runOnUiThread(new g3(this, 0));
    }

    public final void s(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                HeatingButtonView heatingButtonView = this.c;
                heatingButtonView.getClass();
                heatingButtonView.e = false;
                heatingButtonView.c(1);
                HeatingButtonView heatingButtonView2 = this.d;
                heatingButtonView2.getClass();
                heatingButtonView2.e = false;
                heatingButtonView2.c(1);
                HeatingButtonView heatingButtonView3 = this.e;
                heatingButtonView3.getClass();
                heatingButtonView3.e = true;
                heatingButtonView3.c(3);
                return;
            }
            HeatingButtonView heatingButtonView4 = this.c;
            heatingButtonView4.getClass();
            heatingButtonView4.e = false;
            heatingButtonView4.c(1);
            HeatingButtonView heatingButtonView5 = this.d;
            heatingButtonView5.getClass();
            heatingButtonView5.e = true;
            heatingButtonView5.c(3);
            HeatingButtonView heatingButtonView6 = this.e;
            heatingButtonView6.getClass();
            heatingButtonView6.e = false;
            heatingButtonView6.c(1);
            return;
        }
        HeatingButtonView heatingButtonView7 = this.c;
        heatingButtonView7.getClass();
        heatingButtonView7.e = true;
        heatingButtonView7.c(3);
        HeatingButtonView heatingButtonView8 = this.d;
        heatingButtonView8.getClass();
        heatingButtonView8.e = false;
        heatingButtonView8.c(1);
        HeatingButtonView heatingButtonView9 = this.e;
        heatingButtonView9.getClass();
        heatingButtonView9.e = false;
        heatingButtonView9.c(1);
    }

    public final Boolean t() {
        StringBuilder sb = new StringBuilder();
        a o5 = b.o();
        byte[] bArr = m.f1973j;
        String[] strArr = p3.f2001a;
        q.s(bArr, o5, "", sb);
        q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        String g10 = q.g(sb, x1.f2066q);
        a o9 = b.o();
        byte[] bArr2 = m.f1969f;
        if (q.w(bArr2, o9, "", g10)) {
            boolean z9 = true;
            if (q.d(Long.MAX_VALUE, b.a().j()) >= Long.parseLong(new String(q.x(new byte[]{50}, new byte[]{2, 73, 88, 107, -60, 126, 112, -97}, b.o(), q.h(m.f1970g, b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            return Boolean.valueOf(z9);
        }
        return Boolean.FALSE;
    }

    public final void u(int i10, Boolean bool) {
        runOnUiThread(new f(this, bool, i10, 3));
    }
}
