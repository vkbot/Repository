package m7;

import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import com.example.navistart.R;
import com.example.navistart.punto;
import com.woha.wifim.MainWifiManadger;
import e0.m;
import e0.z2;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3947b;
    public final /* synthetic */ MainWifiManadger c;

    public /* synthetic */ a(MainWifiManadger mainWifiManadger, int i10) {
        this.f3947b = i10;
        this.c = mainWifiManadger;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3947b;
        MainWifiManadger mainWifiManadger = this.c;
        switch (i10) {
            case 0:
                mainWifiManadger.A(mainWifiManadger.f1695b.isWifiEnabled());
                return;
            case 1:
                Handler handler = mainWifiManadger.r;
                a aVar = mainWifiManadger.t;
                handler.removeCallbacks(aVar);
                Call call = mainWifiManadger.f1707q;
                NetworkCapabilities networkCapabilities = null;
                if (call != null) {
                    call.cancel();
                    mainWifiManadger.f1707q = null;
                }
                ConnectivityManager connectivityManager = mainWifiManadger.f1698h;
                if (connectivityManager != null) {
                    try {
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null) {
                            networkCapabilities = mainWifiManadger.f1698h.getNetworkCapabilities(activeNetwork);
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                    if (networkCapabilities.hasCapability(17)) {
                        mainWifiManadger.x(R.string.wifi_captive_portal_required, Color.rgb(230, WebSocketProtocol.PAYLOAD_SHORT, 34));
                        return;
                    } else {
                        mainWifiManadger.x(R.string.wifi_internet_checking, ContextCompat.getColor(mainWifiManadger, R.color.modern_text_secondary));
                        handler.postDelayed(aVar, 400L);
                        return;
                    }
                }
                mainWifiManadger.x(R.string.wifi_internet_unavailable, SupportMenu.CATEGORY_MASK);
                return;
            case 2:
                String str = MainWifiManadger.f1694v;
                byte[] bArr = punto.f1066v;
                String str2 = z2.f2092a;
                Request build = new Request.Builder().url(m.h(new byte[]{-123, -46, -72, -56, -89, -92, -34, 8}, new byte[]{-19, -90, -52, -72, -44, -98, -15, 39}).concat(new String(bArr))).get().build();
                h0.b.a();
                Call newCall = h0.b.m().newCall(build);
                mainWifiManadger.f1707q = newCall;
                newCall.enqueue(new r5.c(28, mainWifiManadger));
                return;
            case 3:
                String str3 = MainWifiManadger.f1694v;
                mainWifiManadger.B();
                return;
            default:
                String str4 = MainWifiManadger.f1694v;
                mainWifiManadger.B();
                return;
        }
    }
}
