package com.bumptech.glide.manager;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.woha.wifim.MainWifiManadger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class r extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f672a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f673b;

    public /* synthetic */ r(int i10, Object obj) {
        this.f672a = i10;
        this.f673b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        switch (this.f672a) {
            case 0:
                c0.p.f().post(new q(this, true, 0));
                return;
            default:
                MainWifiManadger mainWifiManadger = (MainWifiManadger) this.f673b;
                String str = MainWifiManadger.f1694v;
                mainWifiManadger.z();
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f672a) {
            case 1:
                MainWifiManadger mainWifiManadger = (MainWifiManadger) this.f673b;
                String str = MainWifiManadger.f1694v;
                mainWifiManadger.z();
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f672a) {
            case 0:
                c0.p.f().post(new q(this, false, 0));
                return;
            default:
                MainWifiManadger mainWifiManadger = (MainWifiManadger) this.f673b;
                String str = MainWifiManadger.f1694v;
                mainWifiManadger.z();
                return;
        }
    }
}
