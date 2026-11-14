package e0;

import android.content.DialogInterface;
import android.widget.TextView;
import com.example.navistart.VJCT;
import com.woha.wifim.MainWifiManadger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class d3 implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1904b;

    public /* synthetic */ d3(int i10) {
        this.f1904b = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f1904b) {
            case 0:
                TextView textView = VJCT.f941g;
                dialogInterface.dismiss();
                return;
            case 1:
                String str = MainWifiManadger.f1694v;
                dialogInterface.cancel();
                return;
            default:
                String str2 = MainWifiManadger.f1694v;
                dialogInterface.dismiss();
                return;
        }
    }
}
