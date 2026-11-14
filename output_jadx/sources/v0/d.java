package v0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.example.navistart.cores.HUDMassageObj;
import com.github.anastr.speedviewlib.ImageSpeedometer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d extends FrameLayout implements h {
    public static int d;
    public static int e;

    /* renamed from: b, reason: collision with root package name */
    public ImageSpeedometer f5915b;
    public ImageSpeedometer c;

    @Override // v0.h
    public final void a() {
        setVisibility(0);
    }

    @Override // v0.h
    public final void b() {
        setVisibility(8);
    }

    @Override // v0.h
    public final void c() {
        h0.b.a();
        h0.b.a();
        int speed = h0.b.d().getSpeed();
        h0.b.a();
        int rpm = h0.b.d().getRPM();
        if (d != speed) {
            d = speed;
            setSpeed(speed);
        }
        if (e != rpm) {
            e = rpm;
            setRPM(rpm);
        }
    }

    @Override // v0.h
    public final int d() {
        return 500;
    }

    @Override // v0.h
    public WindowManager.LayoutParams getLayParams() {
        int i10;
        if (Build.VERSION.SDK_INT >= 26) {
            i10 = 2038;
        } else {
            i10 = 2002;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, i10, 776, -3);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    public void setRPM(int i10) {
        if (this.c != null) {
            new Handler(Looper.getMainLooper()).post(new i7.f(this, i10 / 1000.0f, 2));
        }
    }

    @Override // v0.h
    public void setSpeed(int i10) {
        if (this.f5915b != null) {
            new Handler(Looper.getMainLooper()).post(new a4.c(this, i10, 13));
        }
    }

    @Override // v0.h
    public View getView() {
        return this;
    }

    @Override // v0.h
    public final void e(float f8) {
    }

    @Override // v0.h
    public void setHudMassageObj(HUDMassageObj hUDMassageObj) {
    }
}
