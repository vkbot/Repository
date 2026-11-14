package m7;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import com.woha.wifim.MainWifiManadger;
import e0.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainWifiManadger f3948a;

    public /* synthetic */ b(MainWifiManadger mainWifiManadger) {
        this.f3948a = mainWifiManadger;
    }

    public void a(List list) {
        List<WifiConfiguration> list2;
        String str;
        ScanResult scanResult;
        MainWifiManadger mainWifiManadger = this.f3948a;
        if (mainWifiManadger.f1695b.isWifiEnabled() && mainWifiManadger.d != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            for (ScanResult scanResult2 : list) {
                String str2 = scanResult2.SSID;
                if (str2 != null && !str2.isEmpty() && !scanResult2.SSID.equals(m.h(new byte[]{-60, 10, -80, 60, 96, -11, -93, 123, -40, 12, -83, 62, 106, -92}, new byte[]{-8, ByteCompanionObject.MAX_VALUE, -34, 87, 14, -102, -44, 21})) && ((scanResult = (ScanResult) linkedHashMap.get(scanResult2.SSID)) == null || scanResult2.level > scanResult.level)) {
                    linkedHashMap.put(scanResult2.SSID, scanResult2);
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.values());
            mainWifiManadger.c = arrayList;
            arrayList.sort(new androidx.constraintlayout.core.utils.a(11));
            try {
                list2 = mainWifiManadger.f1695b.getConfiguredNetworks();
                if (list2 == null) {
                    list2 = Collections.EMPTY_LIST;
                }
            } catch (SecurityException unused) {
                list2 = Collections.EMPTY_LIST;
            }
            WifiInfo connectionInfo = mainWifiManadger.f1695b.getConnectionInfo();
            if (connectionInfo != null) {
                str = connectionInfo.getSSID();
            } else {
                str = "";
            }
            mainWifiManadger.d.a(mainWifiManadger.c, list2, str);
        }
    }
}
