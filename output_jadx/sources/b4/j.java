package b4;

import android.os.Handler;
import android.os.Looper;
import android.view.animation.LinearInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f359b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f360a;

    static {
        FastOutSlowInInterpolator fastOutSlowInInterpolator = b3.a.f341b;
        LinearInterpolator linearInterpolator = b3.a.f340a;
        LinearOutSlowInInterpolator linearOutSlowInInterpolator = b3.a.d;
        f359b = new Handler(Looper.getMainLooper(), new c(0));
    }

    public abstract void a(int i10);

    public abstract void b();

    public abstract void c();

    public abstract void d();
}
