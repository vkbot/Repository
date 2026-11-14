package x0;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import java.util.function.Consumer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public float f6426b;
    public float c;
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f6428g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f6429h;

    public b(c cVar, m mVar) {
        this.f6429h = cVar;
        this.f6428g = mVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Consumer consumer;
        int b10;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        c cVar = this.f6429h;
        if (actionMasked == 0) {
            this.f6426b = motionEvent.getRawX();
            this.c = motionEvent.getRawY();
            this.f6427f = false;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            this.d = layoutParams.leftMargin;
            this.e = layoutParams.topMargin;
            cVar.getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        m mVar = this.f6428g;
        if (actionMasked2 == 2) {
            if (Math.hypot(motionEvent.getRawX() - this.f6426b, motionEvent.getRawY() - this.c) > ViewConfiguration.get(cVar.getContext()).getScaledTouchSlop()) {
                this.f6427f = true;
            }
            if (this.f6427f) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
                float o5 = cVar.o() * cVar.getResources().getDisplayMetrics().density;
                int round = Math.round((((motionEvent.getRawX() + this.d) - this.f6426b) / o5) / 8.0f) * 8;
                int c = cVar.c();
                int i11 = 64;
                if (mVar == null) {
                    b10 = 64;
                } else {
                    b10 = mVar.b();
                }
                int a10 = o.a(round, 0, c - b10);
                int round2 = Math.round((((motionEvent.getRawY() + this.e) - this.c) / o5) / 8.0f) * 8;
                if (cVar.e) {
                    i10 = 40;
                } else {
                    i10 = 0;
                }
                int b11 = cVar.b();
                if (mVar != null) {
                    i11 = mVar.a();
                }
                int a11 = o.a(round2, i10, b11 - i11);
                layoutParams2.leftMargin = cVar.p(a10);
                layoutParams2.topMargin = cVar.p(a11);
                view.setLayoutParams(layoutParams2);
                if (mVar == null) {
                    o oVar = cVar.c;
                    oVar.f6480n = a10;
                    oVar.f6481o = a11;
                    oVar.t = false;
                    return true;
                }
                if (cVar.e) {
                    mVar.f6463g = a10;
                    mVar.f6464h = a11;
                    return true;
                }
                mVar.f6465i = a10;
                mVar.f6466j = a11;
                return true;
            }
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            cVar.getParent().requestDisallowInterceptTouchEvent(false);
            if (motionEvent.getActionMasked() == 1 && !this.f6427f && mVar != null && (consumer = cVar.f6440n) != null) {
                consumer.accept(mVar);
            }
            Runnable runnable = cVar.f6439m;
            if (runnable != null) {
                runnable.run();
            }
        }
        return true;
    }
}
