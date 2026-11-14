package s1;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k0 implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public float f5531b;
    public float c;
    public float d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5532f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q0 f5533g;

    public k0(q0 q0Var) {
        this.f5533g = q0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        q0 q0Var = this.f5533g;
        o0 o0Var = q0Var.e;
        if (q0Var.f5595s) {
            if (!(view instanceof l0) && (view.getParent() instanceof l0)) {
                view = (View) view.getParent();
            }
            j0 j0Var = ((l0) view).f5535b;
            if (motionEvent.getActionMasked() == 0) {
                q0Var.f5597v = j0Var.f5511a;
                q0Var.U();
                for (int i10 = 0; i10 < o0Var.getChildCount(); i10++) {
                    View childAt = o0Var.getChildAt(i10);
                    if (childAt instanceof l0) {
                        q0Var.e((l0) childAt);
                    }
                }
                this.f5531b = motionEvent.getRawX();
                this.c = motionEvent.getRawY();
                this.d = view.getX();
                this.e = view.getY();
                this.f5532f = false;
                return true;
            }
            if (motionEvent.getActionMasked() == 2) {
                float rawX = motionEvent.getRawX() - this.f5531b;
                float rawY = motionEvent.getRawY() - this.c;
                if (Math.abs(rawX) > q0Var.l(4) || Math.abs(rawY) > q0Var.l(4)) {
                    this.f5532f = true;
                }
                view.setX(q0.g(this.d + rawX, 0.0f, o0Var.getWidth() - view.getWidth()));
                view.setY(q0.g(this.e + rawY, 0.0f, o0Var.getHeight() - view.getHeight()));
                return true;
            }
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                if (o0Var.getWidth() > 0 && o0Var.getHeight() > 0) {
                    j0Var.c = view.getX() / o0Var.getWidth();
                    j0Var.d = view.getY() / o0Var.getHeight();
                    if (q0Var.t) {
                        q0.O(j0Var);
                    }
                }
                q0Var.y();
                if (!this.f5532f) {
                    q0Var.A();
                    return true;
                }
                q0Var.s();
                return true;
            }
        }
        return false;
    }
}
