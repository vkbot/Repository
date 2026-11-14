package v0;

import android.location.Location;
import android.view.View;
import android.view.WindowManager;
import com.example.navistart.cores.HUDMassageObj;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public interface h {
    void a();

    void b();

    void c();

    int d();

    void e(float f8);

    WindowManager.LayoutParams getLayParams();

    View getView();

    void setBackgroundColor(int i10);

    void setHudMassageObj(HUDMassageObj hUDMassageObj);

    void setSpeed(int i10);

    default void f(Location location) {
    }
}
