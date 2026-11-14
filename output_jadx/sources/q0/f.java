package q0;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.example.navistart.MockGPS.MockGpsService;
import com.example.navistart.R;
import com.example.navistart.home.WebLauncherActivity;
import kotlin.jvm.internal.ByteCompanionObject;
import s1.f0;
import s1.l0;
import s1.q0;
import s1.w;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements w, OnApplyWindowInsetsListener, t4.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5191b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, Object obj) {
        this.f5191b = i10;
        this.c = obj;
    }

    @Override // t4.c
    public Object a(d2.h hVar) {
        return this.c;
    }

    @Override // s1.w
    public void b(String str, boolean z9) {
        long j10;
        long min;
        int i10 = 0;
        switch (this.f5191b) {
            case 1:
                s1.b bVar = (s1.b) this.c;
                bVar.f5473n = false;
                if (!bVar.f5469j) {
                    bVar.f5472m = !z9;
                    if (z9) {
                        bVar.e.setVisibility(8);
                        return;
                    }
                    bVar.f(e0.m.h(new byte[]{-27, -29, 100, 73, 68, -27, -62, 43, -127, -82, 4, 44, -33, -28, -1, 42, -76, -81, 56, -36, -76, -118, -112, 121, -27, -60, 101, 124, -75, -65, -112, 121, -28, -14, -108, 44, -37, -27, -63, 43, -115, -82, 15, 44, -38, -28, -9, 43, ByteCompanionObject.MIN_VALUE, -82, 9, 44, -36, -28, -12, -15}, new byte[]{53, 126, -76, -4, 100, 52, 65, -5}) + str);
                    return;
                }
                return;
            default:
                f0 f0Var = (f0) this.c;
                if (!f0Var.c.E) {
                    if (z9) {
                        j10 = 60000;
                    } else {
                        j10 = f0Var.c.f5592o;
                    }
                    q0 q0Var = f0Var.c;
                    if (z9) {
                        min = 15000;
                    } else {
                        min = Math.min(300000L, q0Var.f5592o * 2);
                    }
                    q0Var.f5592o = min;
                    while (true) {
                        int childCount = f0Var.c.e.getChildCount();
                        q0 q0Var2 = f0Var.c;
                        if (i10 < childCount) {
                            s1.b bVar2 = ((l0) q0Var2.e.getChildAt(i10)).f5536f;
                            if (bVar2 != null) {
                                bVar2.e(z9);
                            }
                            i10++;
                        } else {
                            q0Var2.r.removeCallbacks(q0Var2.f5593p);
                            q0 q0Var3 = f0Var.c;
                            if (q0Var3.f5591n && q0Var3.isAttachedToWindow()) {
                                q0 q0Var4 = f0Var.c;
                                q0Var4.r.postDelayed(q0Var4.f5593p, j10);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
        }
    }

    public void c(boolean z9) {
        MockGpsService mockGpsService = (MockGpsService) this.c;
        if (MockGpsService.t.get() && MockGpsService.f823z) {
            mockGpsService.e = z9;
            if (!z9) {
                e eVar = mockGpsService.f824b;
                if (eVar != null) {
                    eVar.d();
                }
                MockGpsService.l(mockGpsService.getString(R.string.mock_gps_mock_system));
            }
            h hVar = mockGpsService.c;
            if (hVar instanceof p) {
                p pVar = (p) hVar;
                pVar.f5231j = z9;
                pVar.e();
            }
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        WebLauncherActivity webLauncherActivity = (WebLauncherActivity) this.c;
        String str = WebLauncherActivity.f972l;
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        webLauncherActivity.f980k = insets;
        s1.k kVar = webLauncherActivity.d;
        if (insets == null) {
            kVar.getClass();
            insets = Insets.NONE;
        }
        kVar.f5521h = insets;
        kVar.d();
        webLauncherActivity.s();
        return windowInsetsCompat;
    }
}
