package s1;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5480b;
    public final /* synthetic */ k c;

    public /* synthetic */ d(k kVar, int i10) {
        this.f5480b = i10;
        this.c = kVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f5480b) {
            case 0:
                this.c.r();
                return false;
            case 1:
                this.c.r();
                return false;
            default:
                k kVar = this.c;
                Button button = kVar.f5519f;
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    return true;
                }
                if (actionMasked == 2) {
                    kVar.A(motionEvent);
                    return true;
                }
                if (actionMasked == 1) {
                    kVar.A(motionEvent);
                    button.setTranslationX(0.0f);
                    button.setTranslationY(0.0f);
                    kVar.d();
                    return true;
                }
                if (actionMasked == 3) {
                    button.setTranslationX(0.0f);
                    button.setTranslationY(0.0f);
                    kVar.d();
                    return true;
                }
                return false;
        }
    }
}
