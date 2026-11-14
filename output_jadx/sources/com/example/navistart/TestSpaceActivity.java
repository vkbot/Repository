package com.example.navistart;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.h;
import androidx.navigation.ui.a;
import com.example.navistart.R;
import com.example.navistart.TestSpaceActivity;
import e0.k0;
import e0.m;
import e0.o1;
import h0.b;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class TestSpaceActivity extends AppCompatActivity {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f909h = 0;

    /* renamed from: b, reason: collision with root package name */
    public TextView f910b;
    public ScrollView c;
    public SwitchCompat d;
    public boolean e = false;

    /* renamed from: f, reason: collision with root package name */
    public EditText f911f;

    /* renamed from: g, reason: collision with root package name */
    public h f912g;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.testspaceactivity);
        Button button = (Button) findViewById(R.id.btn_start_tests);
        Button button2 = (Button) findViewById(R.id.btn_stop_tests);
        this.f910b = (TextView) findViewById(R.id.log_text_view);
        this.c = (ScrollView) findViewById(R.id.log_scroll_view);
        final int i10 = 0;
        ((Button) findViewById(R.id.button30)).setOnClickListener(new View.OnClickListener(this) { // from class: e0.u2
            public final /* synthetic */ TestSpaceActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                TestSpaceActivity testSpaceActivity = this.c;
                switch (i11) {
                    case 0:
                        int i12 = TestSpaceActivity.f909h;
                        testSpaceActivity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new u1.d()).addToBackStack(null).commit();
                        return;
                    case 1:
                        int i13 = TestSpaceActivity.f909h;
                        testSpaceActivity.finish();
                        return;
                    default:
                        int i14 = TestSpaceActivity.f909h;
                        h0.b.v(m.h(new byte[]{59, 57, -120, 29, 64, 84, 86, -20, -53, 75, -17, 120, 33, 5, 56, -65, 104, 74, -47, 120, 36, 5, 58}, new byte[]{-21, -101, 88, -88, -111, -43, -121, 110}));
                        w.c(-1, m.h(new byte[]{19, -17, -24, 48, -10, -40, 11, -47, 34}, new byte[]{71, -118, -101, 68, -91, -88, 106, -78}));
                        l0.a.t(m0.n0.class, null).show(testSpaceActivity.getSupportFragmentManager(), m.h(new byte[]{-57, -122, -85, -99, -15, 68, -118, 6, -56, -106, -106, -74, -9, 91, -105}, new byte[]{-90, -30, -55, -62, -110, 40, -29, 99}));
                        return;
                }
            }
        });
        final int i11 = 1;
        findViewById(R.id.button31).setOnClickListener(new View.OnClickListener(this) { // from class: e0.u2
            public final /* synthetic */ TestSpaceActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                TestSpaceActivity testSpaceActivity = this.c;
                switch (i112) {
                    case 0:
                        int i12 = TestSpaceActivity.f909h;
                        testSpaceActivity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new u1.d()).addToBackStack(null).commit();
                        return;
                    case 1:
                        int i13 = TestSpaceActivity.f909h;
                        testSpaceActivity.finish();
                        return;
                    default:
                        int i14 = TestSpaceActivity.f909h;
                        h0.b.v(m.h(new byte[]{59, 57, -120, 29, 64, 84, 86, -20, -53, 75, -17, 120, 33, 5, 56, -65, 104, 74, -47, 120, 36, 5, 58}, new byte[]{-21, -101, 88, -88, -111, -43, -121, 110}));
                        w.c(-1, m.h(new byte[]{19, -17, -24, 48, -10, -40, 11, -47, 34}, new byte[]{71, -118, -101, 68, -91, -88, 106, -78}));
                        l0.a.t(m0.n0.class, null).show(testSpaceActivity.getSupportFragmentManager(), m.h(new byte[]{-57, -122, -85, -99, -15, 68, -118, 6, -56, -106, -106, -74, -9, 91, -105}, new byte[]{-90, -30, -55, -62, -110, 40, -29, 99}));
                        return;
                }
            }
        });
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.sw_auto_scroll);
        this.d = switchCompat;
        switchCompat.setChecked(b.o().loadBoolean(m.h(new byte[]{-24, -5, 19, -54, -91, 114, -84, 56, -39, -9, 21, -47, -90, 115, -84, 50, -24, -20}, new byte[]{-101, -104, 97, -91, -55, 30, -8, 87}), true));
        this.d.setOnCheckedChangeListener(new k0(28));
        final int i12 = 2;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: e0.u2
            public final /* synthetic */ TestSpaceActivity c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                TestSpaceActivity testSpaceActivity = this.c;
                switch (i112) {
                    case 0:
                        int i122 = TestSpaceActivity.f909h;
                        testSpaceActivity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new u1.d()).addToBackStack(null).commit();
                        return;
                    case 1:
                        int i13 = TestSpaceActivity.f909h;
                        testSpaceActivity.finish();
                        return;
                    default:
                        int i14 = TestSpaceActivity.f909h;
                        h0.b.v(m.h(new byte[]{59, 57, -120, 29, 64, 84, 86, -20, -53, 75, -17, 120, 33, 5, 56, -65, 104, 74, -47, 120, 36, 5, 58}, new byte[]{-21, -101, 88, -88, -111, -43, -121, 110}));
                        w.c(-1, m.h(new byte[]{19, -17, -24, 48, -10, -40, 11, -47, 34}, new byte[]{71, -118, -101, 68, -91, -88, 106, -78}));
                        l0.a.t(m0.n0.class, null).show(testSpaceActivity.getSupportFragmentManager(), m.h(new byte[]{-57, -122, -85, -99, -15, 68, -118, 6, -56, -106, -106, -74, -9, 91, -105}, new byte[]{-90, -30, -55, -62, -110, 40, -29, 99}));
                        return;
                }
            }
        });
        button2.setOnClickListener(new o1(this));
        this.f911f = (EditText) findViewById(R.id.filter_LogAll);
        this.f912g = new h(7, this);
        Button button3 = (Button) findViewById(R.id.btn_LogAll);
        button3.setOnClickListener(new a(4, this, button3));
        b.a().b().f1739a = this;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (this.e) {
            b.a().j().sl(null);
            this.e = false;
        }
        this.f912g = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        b.a().b().f1739a = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        b.a().b().f1739a = this;
        b.a();
        b.f2537j.o();
    }
}
