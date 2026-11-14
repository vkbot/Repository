package e4;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import e0.j2;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2132b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(int i10, Object obj) {
        this.f2132b = i10;
        this.c = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f2132b) {
            case 0:
                l lVar = (l) this.c;
                if (motionEvent.getAction() == 1) {
                    long uptimeMillis = SystemClock.uptimeMillis() - lVar.f2144o;
                    if (uptimeMillis < 0 || uptimeMillis > 300) {
                        lVar.f2142m = false;
                    }
                    lVar.t();
                    lVar.f2142m = true;
                    lVar.f2144o = SystemClock.uptimeMillis();
                }
                return false;
            case 1:
                s1.b bVar = (s1.b) this.c;
                if (bVar.f5471l || !bVar.f5470k || bVar.f5474o <= 0 || !bVar.f5465f.f5640f) {
                    return false;
                }
                int actionMasked = motionEvent.getActionMasked();
                if (motionEvent.getPointerCount() == 1 && actionMasked <= 3 && (actionMasked != 2 || motionEvent.getEventTime() - bVar.f5475p >= 16)) {
                    bVar.f5475p = motionEvent.getEventTime();
                    s1.x xVar = bVar.f5465f;
                    String str = e0.m.h(new byte[]{14, -15, 58, 28, -103, 73}, new byte[]{90, -66, 111, 95, -47, 105, 54, 21}) + bVar.f5474o + " " + actionMasked + " " + motionEvent.getX() + " " + motionEvent.getY() + " " + motionEvent.getDownTime() + " " + motionEvent.getEventTime();
                    xVar.getClass();
                    try {
                        xVar.e.execute(new j2(28, xVar, str));
                    } catch (RejectedExecutionException unused) {
                        xVar.f5640f = false;
                    }
                }
                return true;
            default:
                s1.n nVar = (s1.n) this.c;
                if (motionEvent.getActionMasked() == 0) {
                    nVar.j();
                }
                if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                    nVar.l();
                }
                return false;
        }
    }
}
