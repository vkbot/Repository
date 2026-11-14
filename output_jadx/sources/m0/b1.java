package m0;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import com.example.navistart.DPups;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3609b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ String d;

    public /* synthetic */ b1(w1 w1Var, Context context, String str) {
        this.f3609b = 2;
        this.c = context;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3609b) {
            case 0:
                y5.k.x(this.c, this.d);
                return;
            case 1:
                y5.k.x(this.c, this.d);
                return;
            default:
                String str = this.d;
                Context context = this.c;
                DevicePolicyManager u8 = w1.u(context);
                if (u8 != null) {
                    try {
                        u8.setApplicationHidden(new ComponentName(context, (Class<?>) DPups.class), str, false);
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ b1(Context context, String str, int i10) {
        this.f3609b = i10;
        this.c = context;
        this.d = str;
    }
}
