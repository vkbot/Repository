package v0;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import com.example.navistart.R;
import com.example.navistart.SpeedBoard.PPSView;
import com.example.navistart.cores.HUDMassageObj;
import com.github.anastr.speedviewlib.ImageSpeedometer;
import com.woha.pogoda.WeatherService;
import e0.m;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class e extends Fragment implements g {

    /* renamed from: b, reason: collision with root package name */
    public PPSView f5916b;
    public RelativeLayout c;

    @Override // v0.g
    public final void d(int i10) {
        new Handler(Looper.getMainLooper()).post(new a4.c(this, i10, 14));
    }

    @Override // v0.g
    public final void g(int i10, String str) {
        View view;
        PPSView pPSView = this.f5916b;
        if (pPSView != null && (view = pPSView.d) != null) {
            view.setVisibility(0);
            pPSView.f881m.setText(str);
            pPSView.c.setImageResource(i10);
        }
    }

    @Override // v0.g
    public final void h() {
        this.c.setBackgroundColor(Color.parseColor(m.h(new byte[]{98, 66, 14, 18, 3, -45, 108}, new byte[]{65, 7, 62, 87, 51, -106, 92, -99})));
        this.f5916b.setBackgroundColor(0);
        this.f5916b.setTexColor(ViewCompat.MEASURED_STATE_MASK);
        PPSView pPSView = this.f5916b;
        ImageSpeedometer imageSpeedometer = pPSView.e;
        if (imageSpeedometer != null) {
            imageSpeedometer.setMaxSpeed(220);
            pPSView.e.setStartDegree(132);
            pPSView.e.setEndDegree(396);
            pPSView.e.setImageSpeedometer(R.drawable.my_speed_bg13);
        }
    }

    @Override // v0.g
    public final void o(HUDMassageObj hUDMassageObj) {
        PPSView pPSView = this.f5916b;
        if (pPSView != null) {
            pPSView.setHudMassageObj(hUDMassageObj);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.speedboard2, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f5916b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (WeatherService.f1686f) {
            PPSView pPSView = this.f5916b;
            String str = WeatherService.c().f3426b;
            int i10 = WeatherService.c().d;
            View view = pPSView.d;
            if (view != null) {
                view.setVisibility(0);
                pPSView.f881m.setText(str);
                pPSView.c.setImageResource(i10);
            }
        }
        this.f5916b.setScaleX(0.0f);
        this.f5916b.setScaleY(0.0f);
        this.f5916b.setAlpha(0.0f);
        this.f5916b.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(1000L).setInterpolator(new OvershootInterpolator()).start();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f5916b = (PPSView) view.findViewById(R.id.speedView);
        this.c = (RelativeLayout) view.findViewById(R.id.SpeedBoardActiBackground);
    }

    @Override // v0.g
    public final void r() {
        this.c.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f5916b.setBackgroundColor(0);
        this.f5916b.setTexColor(-1);
        PPSView pPSView = this.f5916b;
        ImageSpeedometer imageSpeedometer = pPSView.e;
        if (imageSpeedometer != null) {
            imageSpeedometer.setMaxSpeed(220);
            pPSView.e.setStartDegree(132);
            pPSView.e.setEndDegree(396);
            pPSView.e.setImageSpeedometer(R.drawable.my_speed_bg14);
        }
    }

    @Override // v0.g
    public final void a() {
    }

    @Override // v0.g
    public final void q() {
    }

    @Override // v0.g
    public final void f(String str) {
    }

    @Override // v0.g
    public final void k(s0.a aVar) {
    }

    @Override // v0.g
    public final void l(int i10) {
    }
}
