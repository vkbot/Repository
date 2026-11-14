package e0;

import com.example.navistart.MockGPS.MockGpsService;
import com.example.navistart.Notik;
import com.example.navistart.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1903b;

    public /* synthetic */ d2(int i10, Object obj) {
        this.f1902a = i10;
        this.f1903b = obj;
    }

    public final void a(boolean z9) {
        switch (this.f1902a) {
            case 0:
                Notik notik = (Notik) this.f1903b;
                ArrayList arrayList = Notik.f855l;
                if (z9) {
                    notik.b(true);
                    return;
                }
                return;
            default:
                q0.p pVar = (q0.p) this.f1903b;
                if (pVar.d.get()) {
                    pVar.f5227f = z9;
                    pVar.f5228g = false;
                    pVar.f5229h = 0L;
                    pVar.f5230i = false;
                    if (z9) {
                        pVar.d(true);
                        pVar.e();
                        MockGpsService mockGpsService = pVar.f5226b;
                        String string = pVar.f5225a.getString(R.string.mock_gps_connecting);
                        String a10 = pVar.a();
                        mockGpsService.getClass();
                        MockGpsService.j(string, a10, true);
                        return;
                    }
                    MockGpsService mockGpsService2 = pVar.f5226b;
                    String string2 = pVar.f5225a.getString(R.string.mock_gps_connecting);
                    String a11 = pVar.a();
                    mockGpsService2.getClass();
                    MockGpsService.j(string2, a11, false);
                    pVar.f5226b.h();
                    return;
                }
                return;
        }
    }
}
