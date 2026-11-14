package m0;

import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3833b;
    public final /* synthetic */ v c;

    public /* synthetic */ q(v vVar, int i10) {
        this.f3833b = i10;
        this.c = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList B;
        String jSONObject;
        int i10 = this.f3833b;
        v vVar = this.c;
        switch (i10) {
            case 0:
                String str = v.f3873h;
                new ArrayList();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(e0.m.h(new byte[]{-120, -76, 94, -41, -96, 38}, new byte[]{-4, -43, 44, -80, -59, 82, -33, 10}), e0.m.h(new byte[]{26, -83, -97, -11, -89, -39, 27, 0, 30}, new byte[]{123, -35, -17, -86, -44, -83, 116, 114}));
                    jSONObject2.put(e0.m.h(new byte[]{104, 44, -46}, new byte[]{11, 65, -74, -97, -38, 125, -87, -93}), e0.m.h(new byte[]{-16, -118, 13, -62, 39, 58, -119, 19}, new byte[]{-105, -17, 121, -99, 75, 83, -6, 103}));
                    JSONObject tx = h0.b.a().j().tx(jSONObject2);
                    if (tx == null) {
                        jSONObject = null;
                    } else {
                        jSONObject = tx.toString();
                    }
                    B = v.B(jSONObject);
                    if (B.isEmpty()) {
                        B = v.B(v.z());
                    } else if (!TextUtils.isEmpty(jSONObject)) {
                        try {
                            h0.b.o().saveString(v.f3874i, v.x(jSONObject));
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                    B = v.B(v.z());
                }
                FragmentActivity activity = vVar.getActivity();
                if (activity != null) {
                    activity.runOnUiThread(new e0.j2(16, vVar, B));
                    return;
                }
                return;
            case 1:
                String str2 = v.f3873h;
                FragmentActivity activity2 = vVar.getActivity();
                if (activity2 != null) {
                    activity2.runOnUiThread(new q(vVar, 2));
                    return;
                }
                return;
            default:
                String str3 = v.f3873h;
                if (vVar.isAdded()) {
                    vVar.C();
                    return;
                }
                return;
        }
    }
}
