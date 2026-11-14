package e4;

import android.animation.ValueAnimator;
import com.example.navistart.mainview.DownloadButton;
import com.example.navistart.mainview.FireballView;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2131b;

    public /* synthetic */ h(int i10, Object obj) {
        this.f2130a = i10;
        this.f2131b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f2130a;
        Object obj = this.f2131b;
        switch (i10) {
            case 0:
                ((l) obj).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                i3.c cVar = (i3.c) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cVar.f2757j.setAlpha((int) (255.0f * floatValue));
                cVar.f2768x = floatValue;
                return;
            case 2:
                o0.d dVar = (o0.d) obj;
                dVar.f4301n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar.invalidate();
                return;
            case 3:
                int i11 = DownloadButton.f1009f;
                ((DownloadButton) obj).d.setLevel(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                FireballView fireballView = (FireballView) obj;
                int i12 = FireballView.f1011g;
                fireballView.f1013f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fireballView.invalidate();
                return;
        }
    }
}
