package c7;

import android.content.res.ColorStateList;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.AllWidgetServices;
import com.example.navistart.ModernMainActivity;
import com.example.navistart.R;
import com.example.navistart.home.WebLauncherActivity;
import com.example.navistart.punto;
import e0.e2;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import m0.e0;
import s1.c0;
import s1.q0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f548b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(boolean z9, CountDownLatch countDownLatch) {
        this.f548b = 6;
        this.c = z9;
        this.d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i12 = 1;
        switch (this.f548b) {
            case 0:
                ((g) this.d).c.d(this.c);
                return;
            case 1:
                ((d6.a) this.d).f1839a.d(this.c);
                return;
            case 2:
                b1.c cVar = (b1.c) this.d;
                boolean z9 = this.c;
                d6.g gVar = (d6.g) cVar.f267b;
                gVar.f1849f = z9;
                if (gVar.c) {
                    Handler handler = gVar.d;
                    handler.removeCallbacksAndMessages(null);
                    if (gVar.f1849f) {
                        handler.postDelayed(gVar.e, 300000L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                AllWidgetServices allWidgetServices = (AllWidgetServices) this.d;
                boolean z10 = this.c;
                AllWidgetServices allWidgetServices2 = AllWidgetServices.f693g;
                allWidgetServices.e(e0.h.f1928h, z10);
                return;
            case 4:
                ModernMainActivity modernMainActivity = (ModernMainActivity) this.d;
                boolean z11 = this.c;
                String str = ModernMainActivity.B1;
                TextView textView = (TextView) modernMainActivity.findViewById(R.id.modern_install_service_status);
                View findViewById = modernMainActivity.findViewById(R.id.modern_install_service_indicator);
                if (textView != null && findViewById != null) {
                    if (z11) {
                        i10 = R.string.modern_service_running;
                    } else {
                        i10 = R.string.modern_service_stopped;
                    }
                    textView.setText(i10);
                    if (z11) {
                        i11 = R.color.modern_success;
                    } else {
                        i11 = R.color.modern_text_secondary;
                    }
                    int color = ContextCompat.getColor(modernMainActivity, i11);
                    textView.setTextColor(color);
                    findViewById.setBackgroundTintList(ColorStateList.valueOf(color));
                    return;
                }
                return;
            case 5:
                punto puntoVar = (punto) this.d;
                boolean z12 = this.c;
                ImageView imageView = puntoVar.f1077o;
                if (z12) {
                    imageView.setImageResource(R.drawable.connected);
                    puntoVar.f1077o.clearAnimation();
                    puntoVar.f1071i.setVisibility(8);
                    return;
                }
                imageView.setImageResource(R.drawable.disconnected);
                puntoVar.f1071i.setVisibility(0);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 1.0f);
                alphaAnimation.setDuration(500L);
                alphaAnimation.setRepeatMode(2);
                alphaAnimation.setRepeatCount(-1);
                puntoVar.f1077o.startAnimation(alphaAnimation);
                return;
            case 6:
                boolean z13 = this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                try {
                    synchronized (h0.b.f2545s) {
                        try {
                            if (h0.b.f2533f == null) {
                                h0.b.f2533f = new h0.b(h0.b.h(), z13);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } finally {
                    h0.b.f2546u = false;
                    countDownLatch.countDown();
                }
            case 7:
                e0 e0Var = (e0) this.d;
                boolean z14 = this.c;
                RecyclerView recyclerView = e0Var.f3659l;
                if (recyclerView != null) {
                    recyclerView.requestLayout();
                    if (e0Var.f3659l.getParent() instanceof View) {
                        ((View) e0Var.f3659l.getParent()).requestLayout();
                    }
                    if (z14 && (arrayList = e0Var.f3661n) != null && arrayList.size() > 0) {
                        e0Var.f3659l.scrollToPosition(e0Var.f3661n.size() - 1);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                q0 q0Var = (q0) this.d;
                boolean z15 = this.c;
                try {
                    arrayList2 = new j0.c(q0Var.getContext().getApplicationContext()).e();
                } catch (RuntimeException unused) {
                    arrayList2 = new ArrayList();
                }
                q0Var.r.post(new e2(q0Var, arrayList2, z15, 6));
                return;
            case 9:
                WebLauncherActivity webLauncherActivity = (WebLauncherActivity) this.d;
                if (this.c) {
                    q0 q0Var2 = webLauncherActivity.f978i;
                    if (q0Var2 != null) {
                        q0Var2.f5589l.execute(new c0(q0Var2, i12));
                    }
                    y5.k.x(webLauncherActivity, e0.m.h(new byte[]{-34, -63, -116, 75, 24, 77, 73, -82, 46, -79, -40, 41, 118, 35, 36, 55, -33, -29, -115, 120, 25, 113, 73, -89, -34, -35, -116, 71, 24, 65, 73, -84, -34, -43, -116, 68}, new byte[]{14, 96, 92, -7, -56, -13, -103, 23}));
                    return;
                }
                String str2 = WebLauncherActivity.f972l;
                y5.k.x(webLauncherActivity, e0.m.h(new byte[]{47, 109, 64, -55, -9, -70, 39, -38, 75, 32, 32, -84, 108, -69, 26, -37, 126, 33, 28, 92, 7, -43, 117, -120, 47, 74, 65, -4, 6, -32, 117, -120, 46, 124, -80, -84, 101, -70, 47, -38, 78, 33, 16, -84, 103, -69, 25, -38, 66, 33, 19, -83, 89, 75, 116, -80, 47, 64, 65, -4, 6, -23, 116, -78, 47, 77, 64, -58, 6, -24}, new byte[]{-1, -16, -112, 124, -41, 107, -92, 10}));
                return;
            default:
                t1.a aVar = (t1.a) this.d;
                boolean z16 = this.c;
                LinearLayout linearLayout = aVar.c;
                if (z16) {
                    linearLayout.setAlpha(0.0f);
                    linearLayout.setTranslationY(50.0f);
                    linearLayout.setVisibility(0);
                    linearLayout.animate().alpha(1.0f).translationY(0.0f).setDuration(600).start();
                    return;
                }
                linearLayout.animate().alpha(0.0f).translationY(50.0f).setDuration(600).withEndAction(new f5.j(18, aVar)).start();
                return;
        }
    }

    public /* synthetic */ e(Object obj, boolean z9, int i10) {
        this.f548b = i10;
        this.d = obj;
        this.c = z9;
    }
}
