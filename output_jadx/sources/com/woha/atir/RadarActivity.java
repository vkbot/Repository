package com.woha.atir;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import com.example.navistart.R;
import com.woha.atir.RadarActivity;
import e0.j2;
import kotlin.io.encoding.Base64;
import v1.d;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class RadarActivity extends AppCompatActivity {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f1672h = 0;

    /* renamed from: b, reason: collision with root package name */
    public RadarView f1673b;
    public TextView c;
    public TextView d;
    public TextView e;

    /* renamed from: f, reason: collision with root package name */
    public int f1674f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f1675g = new Handler(Looper.getMainLooper());

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.radaractivity);
        this.f1673b = (RadarView) findViewById(R.id.radarView);
        this.c = (TextView) findViewById(R.id.textView31);
        this.d = (TextView) findViewById(R.id.text_arad_status);
        this.e = (TextView) findViewById(R.id.updateTime);
        final int i10 = 0;
        ((ImageButton) findViewById(R.id.imageButton)).setOnClickListener(new View.OnClickListener(this) { // from class: i7.o
            public final /* synthetic */ RadarActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                RadarActivity radarActivity = this.c;
                switch (i11) {
                    case 0:
                        int i12 = RadarActivity.f1672h;
                        FragmentManager supportFragmentManager = radarActivity.getSupportFragmentManager();
                        v vVar = (v) supportFragmentManager.findFragmentByTag(v.class.getSimpleName());
                        if (vVar != null && vVar.isVisible()) {
                            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                            beginTransaction.remove(vVar);
                            beginTransaction.commit();
                            return;
                        } else {
                            v vVar2 = new v();
                            FragmentTransaction beginTransaction2 = supportFragmentManager.beginTransaction();
                            beginTransaction2.replace(R.id.fragment_container, vVar2, v.class.getSimpleName());
                            beginTransaction2.addToBackStack(null);
                            beginTransaction2.commit();
                            return;
                        }
                    case 1:
                        int i13 = RadarActivity.f1672h;
                        radarActivity.finish();
                        return;
                    default:
                        radarActivity.f1674f++;
                        Handler handler = radarActivity.f1675g;
                        handler.removeCallbacksAndMessages(null);
                        handler.postDelayed(new q(radarActivity, 1), 1000L);
                        if (radarActivity.f1674f >= 10) {
                            radarActivity.f1674f = 0;
                            h0.b.o().saveLong(e0.m.h(new byte[]{-62, -110, 14, 46, -66, 115, 59, -6, -14, -106, 59, Base64.padSymbol, -118, 103, 62, -23, -62, -79}, new byte[]{-122, -13, 122, 79, -21, 3, 95, -101}), 0L);
                            y5.k.x(radarActivity, radarActivity.getResources().getString(R.string.RadarUpdateCam));
                            return;
                        }
                        return;
                }
            }
        });
        final int i11 = 1;
        findViewById(R.id.button36).setOnClickListener(new View.OnClickListener(this) { // from class: i7.o
            public final /* synthetic */ RadarActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                RadarActivity radarActivity = this.c;
                switch (i112) {
                    case 0:
                        int i12 = RadarActivity.f1672h;
                        FragmentManager supportFragmentManager = radarActivity.getSupportFragmentManager();
                        v vVar = (v) supportFragmentManager.findFragmentByTag(v.class.getSimpleName());
                        if (vVar != null && vVar.isVisible()) {
                            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                            beginTransaction.remove(vVar);
                            beginTransaction.commit();
                            return;
                        } else {
                            v vVar2 = new v();
                            FragmentTransaction beginTransaction2 = supportFragmentManager.beginTransaction();
                            beginTransaction2.replace(R.id.fragment_container, vVar2, v.class.getSimpleName());
                            beginTransaction2.addToBackStack(null);
                            beginTransaction2.commit();
                            return;
                        }
                    case 1:
                        int i13 = RadarActivity.f1672h;
                        radarActivity.finish();
                        return;
                    default:
                        radarActivity.f1674f++;
                        Handler handler = radarActivity.f1675g;
                        handler.removeCallbacksAndMessages(null);
                        handler.postDelayed(new q(radarActivity, 1), 1000L);
                        if (radarActivity.f1674f >= 10) {
                            radarActivity.f1674f = 0;
                            h0.b.o().saveLong(e0.m.h(new byte[]{-62, -110, 14, 46, -66, 115, 59, -6, -14, -106, 59, Base64.padSymbol, -118, 103, 62, -23, -62, -79}, new byte[]{-122, -13, 122, 79, -21, 3, 95, -101}), 0L);
                            y5.k.x(radarActivity, radarActivity.getResources().getString(R.string.RadarUpdateCam));
                            return;
                        }
                        return;
                }
            }
        });
        final int i12 = 2;
        ((LinearLayout) findViewById(R.id.linearLayout3)).setOnClickListener(new View.OnClickListener(this) { // from class: i7.o
            public final /* synthetic */ RadarActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                RadarActivity radarActivity = this.c;
                switch (i112) {
                    case 0:
                        int i122 = RadarActivity.f1672h;
                        FragmentManager supportFragmentManager = radarActivity.getSupportFragmentManager();
                        v vVar = (v) supportFragmentManager.findFragmentByTag(v.class.getSimpleName());
                        if (vVar != null && vVar.isVisible()) {
                            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                            beginTransaction.remove(vVar);
                            beginTransaction.commit();
                            return;
                        } else {
                            v vVar2 = new v();
                            FragmentTransaction beginTransaction2 = supportFragmentManager.beginTransaction();
                            beginTransaction2.replace(R.id.fragment_container, vVar2, v.class.getSimpleName());
                            beginTransaction2.addToBackStack(null);
                            beginTransaction2.commit();
                            return;
                        }
                    case 1:
                        int i13 = RadarActivity.f1672h;
                        radarActivity.finish();
                        return;
                    default:
                        radarActivity.f1674f++;
                        Handler handler = radarActivity.f1675g;
                        handler.removeCallbacksAndMessages(null);
                        handler.postDelayed(new q(radarActivity, 1), 1000L);
                        if (radarActivity.f1674f >= 10) {
                            radarActivity.f1674f = 0;
                            h0.b.o().saveLong(e0.m.h(new byte[]{-62, -110, 14, 46, -66, 115, 59, -6, -14, -106, 59, Base64.padSymbol, -118, 103, 62, -23, -62, -79}, new byte[]{-122, -13, 122, 79, -21, 3, 95, -101}), 0L);
                            y5.k.x(radarActivity, radarActivity.getResources().getString(R.string.RadarUpdateCam));
                            return;
                        }
                        return;
                }
            }
        });
        final int i13 = 0;
        d.a().c().f2825a.observe(this, new Observer(this) { // from class: i7.r

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RadarActivity f2824b;

            {
                this.f2824b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i14 = i13;
                final int i15 = 0;
                final RadarActivity radarActivity = this.f2824b;
                switch (i14) {
                    case 0:
                        final String str = (String) obj;
                        int i16 = RadarActivity.f1672h;
                        if (str != null) {
                            final int i17 = 2;
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: i7.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            TextView textView = radarActivity.e;
                                            if (textView != null) {
                                                textView.setText(str);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            TextView textView2 = radarActivity.d;
                                            if (textView2 != null) {
                                                textView2.setText(str);
                                                return;
                                            }
                                            return;
                                        default:
                                            RadarActivity radarActivity2 = radarActivity;
                                            TextView textView3 = radarActivity2.c;
                                            if (textView3 != null) {
                                                textView3.setVisibility(0);
                                                radarActivity2.c.setText(str);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    case 1:
                        final String str2 = (String) obj;
                        int i18 = RadarActivity.f1672h;
                        if (str2 != null) {
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: i7.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            TextView textView = radarActivity.e;
                                            if (textView != null) {
                                                textView.setText(str2);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            TextView textView2 = radarActivity.d;
                                            if (textView2 != null) {
                                                textView2.setText(str2);
                                                return;
                                            }
                                            return;
                                        default:
                                            RadarActivity radarActivity2 = radarActivity;
                                            TextView textView3 = radarActivity2.c;
                                            if (textView3 != null) {
                                                textView3.setVisibility(0);
                                                radarActivity2.c.setText(str2);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    case 2:
                        final String str3 = (String) obj;
                        int i19 = RadarActivity.f1672h;
                        if (str3 != null) {
                            final int i20 = 1;
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: i7.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i20) {
                                        case 0:
                                            TextView textView = radarActivity.e;
                                            if (textView != null) {
                                                textView.setText(str3);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            TextView textView2 = radarActivity.d;
                                            if (textView2 != null) {
                                                textView2.setText(str3);
                                                return;
                                            }
                                            return;
                                        default:
                                            RadarActivity radarActivity2 = radarActivity;
                                            TextView textView3 = radarActivity2.c;
                                            if (textView3 != null) {
                                                textView3.setVisibility(0);
                                                radarActivity2.c.setText(str3);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    case 3:
                        int i21 = RadarActivity.f1672h;
                        if (((Boolean) obj).booleanValue()) {
                            new Handler(Looper.getMainLooper()).post(new q(radarActivity, i15));
                            return;
                        }
                        return;
                    default:
                        n nVar = (n) obj;
                        if (nVar != null) {
                            if (radarActivity.f1673b != null) {
                                new Handler(Looper.getMainLooper()).post(new j2(9, radarActivity, nVar));
                                return;
                            }
                            return;
                        }
                        int i22 = RadarActivity.f1672h;
                        return;
                }
            }
        });
        final int i14 = 1;
        d.a().c().f2826b.observe(this, new Observer(this) { // from class: i7.r

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RadarActivity f2824b;

            {
                this.f2824b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i142 = i14;
                final int i15 = 0;
                final RadarActivity radarActivity = this.f2824b;
                switch (i142) {
                    case 0:
                        final String str = (String) obj;
                        int i16 = RadarActivity.f1672h;
                        if (str != null) {
                            final int i17 = 2;
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: i7.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            TextView textView = radarActivity.e;
                                            if (textView != null) {
                                                textView.setText(str);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            TextView textView2 = radarActivity.d;
                                            if (textView2 != null) {
                                                textView2.setText(str);
                                                return;
                                            }
                                            return;
                                        default:
                                            RadarActivity radarActivity2 = radarActivity;
                                            TextView textView3 = radarActivity2.c;
                                            if (textView3 != null) {
                                                textView3.setVisibility(0);
                                                radarActivity2.c.setText(str);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    case 1:
                        final String str2 = (String) obj;
                        int i18 = RadarActivity.f1672h;
                        if (str2 != null) {
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: i7.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            TextView textView = radarActivity.e;
                                            if (textView != null) {
                                                textView.setText(str2);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            TextView textView2 = radarActivity.d;
                                            if (textView2 != null) {
                                                textView2.setText(str2);
                                                return;
                                            }
                                            return;
                                        default:
                                            RadarActivity radarActivity2 = radarActivity;
                                            TextView textView3 = radarActivity2.c;
                                            if (textView3 != null) {
                                                textView3.setVisibility(0);
                                                radarActivity2.c.setText(str2);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    case 2:
                        final String str3 = (String) obj;
                        int i19 = RadarActivity.f1672h;
                        if (str3 != null) {
                            final int i20 = 1;
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: i7.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i20) {
                                        case 0:
                                            TextView textView = radarActivity.e;
                                            if (textView != null) {
                                                textView.setText(str3);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            TextView textView2 = radarActivity.d;
                                            if (textView2 != null) {
                                                textView2.setText(str3);
                                                return;
                                            }
                                            return;
                                        default:
                                            RadarActivity radarActivity2 = radarActivity;
                                            TextView textView3 = radarActivity2.c;
                                            if (textView3 != null) {
                                                textView3.setVisibility(0);
                                                radarActivity2.c.setText(str3);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    case 3:
                        int i21 = RadarActivity.f1672h;
                        if (((Boolean) obj).booleanValue()) {
                            new Handler(Looper.getMainLooper()).post(new q(radarActivity, i15));
                            return;
                        }
                        return;
                    default:
                        n nVar = (n) obj;
                        if (nVar != null) {
                            if (radarActivity.f1673b != null) {
                                new Handler(Looper.getMainLooper()).post(new j2(9, radarActivity, nVar));
                                return;
                            }
                            return;
                        }
                        int i22 = RadarActivity.f1672h;
                        return;
                }
            }
        });
        final int i15 = 2;
        d.a().c().d.observe(this, new Observer(this) { // from class: i7.r

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RadarActivity f2824b;

            {
                this.f2824b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i142 = i15;
                final int i152 = 0;
                final RadarActivity radarActivity = this.f2824b;
                switch (i142) {
                    case 0:
                        final String str = (String) obj;
                        int i16 = RadarActivity.f1672h;
                        if (str != null) {
                            final int i17 = 2;
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: i7.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            TextView textView = radarActivity.e;
                                            if (textView != null) {
                                                textView.setText(str);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            TextView textView2 = radarActivity.d;
                                            if (textView2 != null) {
                                                textView2.setText(str);
                                                return;
                                            }
                                            return;
                                        default:
                                            RadarActivity radarActivity2 = radarActivity;
                                            TextView textView3 = radarActivity2.c;
                                            if (textView3 != null) {
                                                textView3.setVisibility(0);
                                                radarActivity2.c.setText(str);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    case 1:
                        final String str2 = (String) obj;
                        int i18 = RadarActivity.f1672h;
                        if (str2 != null) {
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: i7.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i152) {
                                        case 0:
                                            TextView textView = radarActivity.e;
                                            if (textView != null) {
                                                textView.setText(str2);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            TextView textView2 = radarActivity.d;
                                            if (textView2 != null) {
                                                textView2.setText(str2);
                                                return;
                                            }
                                            return;
                                        default:
                                            RadarActivity radarActivity2 = radarActivity;
                                            TextView textView3 = radarActivity2.c;
                                            if (textView3 != null) {
                                                textView3.setVisibility(0);
                                                radarActivity2.c.setText(str2);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    case 2:
                        final String str3 = (String) obj;
                        int i19 = RadarActivity.f1672h;
                        if (str3 != null) {
                            final int i20 = 1;
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: i7.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i20) {
                                        case 0:
                                            TextView textView = radarActivity.e;
                                            if (textView != null) {
                                                textView.setText(str3);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            TextView textView2 = radarActivity.d;
                                            if (textView2 != null) {
                                                textView2.setText(str3);
                                                return;
                                            }
                                            return;
                                        default:
                                            RadarActivity radarActivity2 = radarActivity;
                                            TextView textView3 = radarActivity2.c;
                                            if (textView3 != null) {
                                                textView3.setVisibility(0);
                                                radarActivity2.c.setText(str3);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    case 3:
                        int i21 = RadarActivity.f1672h;
                        if (((Boolean) obj).booleanValue()) {
                            new Handler(Looper.getMainLooper()).post(new q(radarActivity, i152));
                            return;
                        }
                        return;
                    default:
                        n nVar = (n) obj;
                        if (nVar != null) {
                            if (radarActivity.f1673b != null) {
                                new Handler(Looper.getMainLooper()).post(new j2(9, radarActivity, nVar));
                                return;
                            }
                            return;
                        }
                        int i22 = RadarActivity.f1672h;
                        return;
                }
            }
        });
        final int i16 = 3;
        d.a().c().c.observe(this, new Observer(this) { // from class: i7.r

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RadarActivity f2824b;

            {
                this.f2824b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i142 = i16;
                final int i152 = 0;
                final RadarActivity radarActivity = this.f2824b;
                switch (i142) {
                    case 0:
                        final String str = (String) obj;
                        int i162 = RadarActivity.f1672h;
                        if (str != null) {
                            final int i17 = 2;
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: i7.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            TextView textView = radarActivity.e;
                                            if (textView != null) {
                                                textView.setText(str);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            TextView textView2 = radarActivity.d;
                                            if (textView2 != null) {
                                                textView2.setText(str);
                                                return;
                                            }
                                            return;
                                        default:
                                            RadarActivity radarActivity2 = radarActivity;
                                            TextView textView3 = radarActivity2.c;
                                            if (textView3 != null) {
                                                textView3.setVisibility(0);
                                                radarActivity2.c.setText(str);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    case 1:
                        final String str2 = (String) obj;
                        int i18 = RadarActivity.f1672h;
                        if (str2 != null) {
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: i7.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i152) {
                                        case 0:
                                            TextView textView = radarActivity.e;
                                            if (textView != null) {
                                                textView.setText(str2);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            TextView textView2 = radarActivity.d;
                                            if (textView2 != null) {
                                                textView2.setText(str2);
                                                return;
                                            }
                                            return;
                                        default:
                                            RadarActivity radarActivity2 = radarActivity;
                                            TextView textView3 = radarActivity2.c;
                                            if (textView3 != null) {
                                                textView3.setVisibility(0);
                                                radarActivity2.c.setText(str2);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    case 2:
                        final String str3 = (String) obj;
                        int i19 = RadarActivity.f1672h;
                        if (str3 != null) {
                            final int i20 = 1;
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: i7.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i20) {
                                        case 0:
                                            TextView textView = radarActivity.e;
                                            if (textView != null) {
                                                textView.setText(str3);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            TextView textView2 = radarActivity.d;
                                            if (textView2 != null) {
                                                textView2.setText(str3);
                                                return;
                                            }
                                            return;
                                        default:
                                            RadarActivity radarActivity2 = radarActivity;
                                            TextView textView3 = radarActivity2.c;
                                            if (textView3 != null) {
                                                textView3.setVisibility(0);
                                                radarActivity2.c.setText(str3);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    case 3:
                        int i21 = RadarActivity.f1672h;
                        if (((Boolean) obj).booleanValue()) {
                            new Handler(Looper.getMainLooper()).post(new q(radarActivity, i152));
                            return;
                        }
                        return;
                    default:
                        n nVar = (n) obj;
                        if (nVar != null) {
                            if (radarActivity.f1673b != null) {
                                new Handler(Looper.getMainLooper()).post(new j2(9, radarActivity, nVar));
                                return;
                            }
                            return;
                        }
                        int i22 = RadarActivity.f1672h;
                        return;
                }
            }
        });
        final int i17 = 4;
        d.a().c().e.observe(this, new Observer(this) { // from class: i7.r

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RadarActivity f2824b;

            {
                this.f2824b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i142 = i17;
                final int i152 = 0;
                final RadarActivity radarActivity = this.f2824b;
                switch (i142) {
                    case 0:
                        final String str = (String) obj;
                        int i162 = RadarActivity.f1672h;
                        if (str != null) {
                            final int i172 = 2;
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: i7.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i172) {
                                        case 0:
                                            TextView textView = radarActivity.e;
                                            if (textView != null) {
                                                textView.setText(str);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            TextView textView2 = radarActivity.d;
                                            if (textView2 != null) {
                                                textView2.setText(str);
                                                return;
                                            }
                                            return;
                                        default:
                                            RadarActivity radarActivity2 = radarActivity;
                                            TextView textView3 = radarActivity2.c;
                                            if (textView3 != null) {
                                                textView3.setVisibility(0);
                                                radarActivity2.c.setText(str);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    case 1:
                        final String str2 = (String) obj;
                        int i18 = RadarActivity.f1672h;
                        if (str2 != null) {
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: i7.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i152) {
                                        case 0:
                                            TextView textView = radarActivity.e;
                                            if (textView != null) {
                                                textView.setText(str2);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            TextView textView2 = radarActivity.d;
                                            if (textView2 != null) {
                                                textView2.setText(str2);
                                                return;
                                            }
                                            return;
                                        default:
                                            RadarActivity radarActivity2 = radarActivity;
                                            TextView textView3 = radarActivity2.c;
                                            if (textView3 != null) {
                                                textView3.setVisibility(0);
                                                radarActivity2.c.setText(str2);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    case 2:
                        final String str3 = (String) obj;
                        int i19 = RadarActivity.f1672h;
                        if (str3 != null) {
                            final int i20 = 1;
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: i7.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i20) {
                                        case 0:
                                            TextView textView = radarActivity.e;
                                            if (textView != null) {
                                                textView.setText(str3);
                                                return;
                                            }
                                            return;
                                        case 1:
                                            TextView textView2 = radarActivity.d;
                                            if (textView2 != null) {
                                                textView2.setText(str3);
                                                return;
                                            }
                                            return;
                                        default:
                                            RadarActivity radarActivity2 = radarActivity;
                                            TextView textView3 = radarActivity2.c;
                                            if (textView3 != null) {
                                                textView3.setVisibility(0);
                                                radarActivity2.c.setText(str3);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    case 3:
                        int i21 = RadarActivity.f1672h;
                        if (((Boolean) obj).booleanValue()) {
                            new Handler(Looper.getMainLooper()).post(new q(radarActivity, i152));
                            return;
                        }
                        return;
                    default:
                        n nVar = (n) obj;
                        if (nVar != null) {
                            if (radarActivity.f1673b != null) {
                                new Handler(Looper.getMainLooper()).post(new j2(9, radarActivity, nVar));
                                return;
                            }
                            return;
                        }
                        int i22 = RadarActivity.f1672h;
                        return;
                }
            }
        });
    }
}
