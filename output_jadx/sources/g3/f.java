package g3;

import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f extends WindowInsetsAnimationCompat.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final View f2450a;

    /* renamed from: b, reason: collision with root package name */
    public int f2451b;
    public int c;
    public final int[] d;

    public f(View view) {
        super(0);
        this.d = new int[2];
        this.f2450a = view;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.f2450a.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        View view = this.f2450a;
        int[] iArr = this.d;
        view.getLocationOnScreen(iArr);
        this.f2451b = iArr[1];
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((WindowInsetsAnimationCompat) it.next()).getTypeMask() & WindowInsetsCompat.Type.ime()) != 0) {
                this.f2450a.setTranslationY(b3.a.c(r0.getInterpolatedFraction(), this.c, 0));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        View view = this.f2450a;
        int[] iArr = this.d;
        view.getLocationOnScreen(iArr);
        int i10 = this.f2451b - iArr[1];
        this.c = i10;
        view.setTranslationY(i10);
        return boundsCompat;
    }
}
