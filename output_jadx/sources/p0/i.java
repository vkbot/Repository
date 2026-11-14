package p0;

import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import e0.m;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public float f4973b;
    public float c;
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4974f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f4975g;

    public i(j jVar) {
        this.f4975g = jVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        j jVar = this.f4975g;
        e eVar = jVar.f4979b;
        int i10 = 1;
        if (!jVar.f4985k) {
            WindowManager windowManager = jVar.f4981g;
            WindowManager.LayoutParams layoutParams = jVar.f4982h;
            boolean z9 = false;
            if (windowManager != null && layoutParams != null) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked == 2) {
                            layoutParams.x = Math.max(0, Math.round(motionEvent.getRawX() - this.f4973b) + this.d);
                            layoutParams.y = Math.max(0, Math.round(motionEvent.getRawY() - this.c) + this.e);
                            windowManager.updateViewLayout(view, layoutParams);
                            if (this.f4974f || Math.abs(motionEvent.getRawX() - this.f4973b) > jVar.c(4) || Math.abs(motionEvent.getRawY() - this.c) > jVar.c(4)) {
                                z9 = true;
                            }
                            this.f4974f = z9;
                            return true;
                        }
                    } else {
                        int i11 = layoutParams.x;
                        int i12 = layoutParams.y;
                        eVar.getClass();
                        h0.b.o().saveInt(e.f4965f, Math.max(0, i11));
                        h0.b.o().saveInt(e.f4966g, Math.max(0, i12));
                        if (!this.f4974f) {
                            Handler handler = jVar.d;
                            g gVar = jVar.f4980f;
                            handler.removeCallbacks(gVar);
                            jVar.f4984j++;
                            Log.i(j.f4976l, m.h(new byte[]{-100, 80, -124, 105, -109, 64, -50, -94, -123, 84, -54, 111, -36, 86, -52, -65, -37}, new byte[]{-26, 63, -22, 12, -77, 35, -94, -53}) + jVar.f4984j);
                            if (jVar.f4983i != null) {
                                eVar.getClass();
                                if (e.e() && jVar.f4984j >= 4) {
                                    jVar.f4983i.animate().cancel();
                                    jVar.f4983i.animate().alpha((Math.min(1.0f, Math.max(0, jVar.f4984j - 4) / Math.max(1, 10)) * 0.56000006f) + 0.16f).setDuration(160L).start();
                                    jVar.g(m.h(new byte[]{-23, 83, -118, -39, 106, 90, -93, -8, -5}, new byte[]{-54, 18, -53, -24, 91, 107, -110, -55}));
                                }
                            }
                            if (jVar.f4984j >= 14) {
                                eVar.getClass();
                                if (e.e()) {
                                    if (!jVar.f4985k) {
                                        jVar.f4985k = true;
                                        handler.removeCallbacks(gVar);
                                        jVar.i(0, 1);
                                        jVar.e.execute(new g(jVar, i10));
                                        return true;
                                    }
                                }
                            }
                            handler.postDelayed(gVar, 1300L);
                        }
                    }
                } else {
                    this.f4973b = motionEvent.getRawX();
                    this.c = motionEvent.getRawY();
                    this.d = layoutParams.x;
                    this.e = layoutParams.y;
                    this.f4974f = false;
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
