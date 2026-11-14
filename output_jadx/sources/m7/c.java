package m7;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.woha.wifim.MainWifiManadger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements DialogInterface.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3949b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ c(KeyEvent.Callback callback, int i10) {
        this.f3949b = i10;
        this.c = callback;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f3949b) {
            case 0:
                ((MainWifiManadger) this.c).f1706p = null;
                return;
            default:
                ((s1.k) this.c).r();
                return;
        }
    }
}
