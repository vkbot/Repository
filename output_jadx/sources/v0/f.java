package v0;

import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import com.example.navistart.SpeedBoardService;
import com.example.navistart.cores.HUDMassageObj;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f implements h {

    /* renamed from: b, reason: collision with root package name */
    public final View f5917b;

    public f(SpeedBoardService speedBoardService) {
        this.f5917b = new View(speedBoardService);
    }

    @Override // v0.h
    public final int d() {
        return 600;
    }

    @Override // v0.h
    public final WindowManager.LayoutParams getLayParams() {
        int i10;
        if (Build.VERSION.SDK_INT >= 26) {
            i10 = 2038;
        } else {
            i10 = 2002;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, i10, 776, -3);
        layoutParams.gravity = 81;
        layoutParams.x = 0;
        layoutParams.y = 30;
        return layoutParams;
    }

    @Override // v0.h
    public final View getView() {
        return this.f5917b;
    }

    @Override // v0.h
    public final void a() {
    }

    @Override // v0.h
    public final void b() {
    }

    @Override // v0.h
    public final void c() {
    }

    @Override // v0.h
    public final void e(float f8) {
    }

    @Override // v0.h
    public final void setBackgroundColor(int i10) {
    }

    @Override // v0.h
    public final void setHudMassageObj(HUDMassageObj hUDMassageObj) {
    }

    @Override // v0.h
    public final void setSpeed(int i10) {
    }
}
