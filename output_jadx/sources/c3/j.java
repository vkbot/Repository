package c3;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f524a = {R.attr.stateListAnimator};

    public static void a(AppBarLayout appBarLayout, float f8) {
        int integer = appBarLayout.getResources().getInteger(com.example.navistart.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.example.navistart.R.attr.state_liftable, -2130904331}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j10));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f8).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }
}
