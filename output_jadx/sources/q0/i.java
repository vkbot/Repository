package q0;

import android.widget.RadioGroup;
import com.example.navistart.R;
import m0.s2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5195b;

    public /* synthetic */ i(int i10, Object obj) {
        this.f5194a = i10;
        this.f5195b = obj;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
        int i11 = this.f5194a;
        Object obj = this.f5195b;
        switch (i11) {
            case 0:
                l lVar = (l) obj;
                if (i10 == R.id.mockGpsSourcePhoneApp) {
                    lVar.t = e0.m.h(new byte[]{56, -29, -11, -67, -78, -109, 101, -96, 56}, new byte[]{72, -117, -102, -45, -41, -52, 4, -48});
                } else if (i10 == R.id.mockGpsSourceIosServer) {
                    lVar.t = e0.m.h(new byte[]{-92, 57, -7, -42, 24, 107, -65, 98, -90, 59, -43, -32, 4, 125}, new byte[]{-61, 73, -118, -119, 107, 14, -51, 20});
                } else if (i10 == R.id.mockGpsSourceUsb) {
                    lVar.t = e0.m.h(new byte[]{77, -40, -81}, new byte[]{56, -85, -51, -88, 117, -65, -51, -117});
                } else if (i10 == R.id.mockGpsSourceModem) {
                    lVar.t = e0.m.h(new byte[]{25, 54, 24, -51, 6}, new byte[]{116, 89, 124, -88, 107, 69, -8, 112});
                }
                lVar.t = l.w(lVar.t);
                lVar.u(false);
                return;
            default:
                ((s2) obj).run();
                return;
        }
    }
}
