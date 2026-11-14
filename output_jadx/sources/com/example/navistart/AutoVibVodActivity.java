package com.example.navistart;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.c;
import com.example.navistart.AutoVibVodActivity;
import com.example.navistart.mainview.HeatingButtonView;
import e0.m;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class AutoVibVodActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f715b = 0;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BlackActivity.t(this);
        final int intExtra = getIntent().getIntExtra(m.h(new byte[]{-104, 67, -123, 53, -41, -83, 108, 16, -99, 73, -107}, new byte[]{-18, 44, -31, 92, -93, -56, 0, 79}), 1);
        setContentView(R.layout.autoviborvoditelact);
        final HeatingButtonView heatingButtonView = (HeatingButtonView) findViewById(R.id.button5);
        heatingButtonView.setButtonText(getResources().getString(R.string.voditel) + " " + intExtra);
        heatingButtonView.getHeatingButton().setOnClickListener(new View.OnClickListener() { // from class: e0.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = AutoVibVodActivity.f715b;
                h0.b.a();
                h0.b.d().carsetvod(intExtra);
                HeatingButtonView heatingButtonView2 = heatingButtonView;
                heatingButtonView2.e = true;
                heatingButtonView2.c(3);
                AutoVibVodActivity.this.finish();
            }
        });
        ((RelativeLayout) findViewById(R.id.auto_vibor_vod_act)).setOnClickListener(new c(4, this));
    }
}
