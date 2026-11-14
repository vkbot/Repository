package w1;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f6300b;

    public /* synthetic */ a(e eVar, int i10) {
        this.f6299a = i10;
        this.f6300b = eVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6299a) {
            case 0:
                e.a(this.f6300b, valueAnimator);
                return;
            default:
                e.b(this.f6300b, valueAnimator);
                return;
        }
    }
}
