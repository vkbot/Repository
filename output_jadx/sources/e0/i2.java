package e0;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.example.navistart.PermActivity;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class i2 implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1941b;
    public final /* synthetic */ PermActivity c;

    public /* synthetic */ i2(PermActivity permActivity, int i10) {
        this.f1941b = i10;
        this.c = permActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f1941b;
        PermActivity permActivity = this.c;
        switch (i11) {
            case 0:
                String str = PermActivity.c;
                permActivity.x();
                return;
            default:
                String str2 = PermActivity.c;
                Intent intent = new Intent(m.h(new byte[]{122, -106, 10, -38, 25, -36, 47, 105, 104, -99, 26, -36, 31, -37, 44, 52, 53, -71, 62, -8, 58, -4, 8, 6, 79, -79, 33, -26, 41, -15, 14, 19, 90, -79, 34, -5, 41, -26, 14, 19, 79, -79, 32, -17, 37}, new byte[]{27, -8, 110, -88, 118, -75, 75, 71}));
                intent.setData(Uri.fromParts(m.h(new byte[]{-103, -54, 24, -24, 73, 53, 57}, new byte[]{-23, -85, 123, -125, 40, 82, 92, 126}), permActivity.getPackageName(), null));
                y5.k.u(permActivity, intent, null);
                return;
        }
    }
}
