package com.woha.wifim;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.manager.r;
import com.example.navistart.R;
import com.example.navistart.mainview.OnOffButton;
import com.google.protobuf.q;
import com.woha.wifim.MainWifiManadger;
import e0.d3;
import e0.m;
import e0.s0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.y0;
import m7.a;
import m7.b;
import m7.c;
import m7.f;
import m7.g;
import m7.k;
import okhttp3.Call;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MainWifiManadger extends AppCompatActivity {

    /* renamed from: v, reason: collision with root package name */
    public static String f1694v;

    /* renamed from: b, reason: collision with root package name */
    public WifiManager f1695b;
    public ArrayList c;
    public f d;
    public g e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1696f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f1697g;

    /* renamed from: h, reason: collision with root package name */
    public ConnectivityManager f1698h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1699i;

    /* renamed from: j, reason: collision with root package name */
    public Button f1700j;

    /* renamed from: k, reason: collision with root package name */
    public OnOffButton f1701k;

    /* renamed from: l, reason: collision with root package name */
    public Button f1702l;

    /* renamed from: m, reason: collision with root package name */
    public Button f1703m;

    /* renamed from: n, reason: collision with root package name */
    public RecyclerView f1704n;

    /* renamed from: p, reason: collision with root package name */
    public AlertDialog f1706p;

    /* renamed from: q, reason: collision with root package name */
    public Call f1707q;

    /* renamed from: o, reason: collision with root package name */
    public String f1705o = "";
    public final Handler r = new Handler(Looper.getMainLooper());

    /* renamed from: s, reason: collision with root package name */
    public final a f1708s = new a(this, 0);
    public final a t = new a(this, 2);

    /* renamed from: u, reason: collision with root package name */
    public final r f1709u = new r(1, this);

    public static boolean u(String str) {
        String str2;
        if (str != null) {
            str2 = str.toUpperCase();
        } else {
            str2 = "";
        }
        if (str2.contains(m.h(new byte[]{-83, -110, 66}, new byte[]{-6, -41, 18, 19, 57, 119, -101, 84})) || str2.contains(m.h(new byte[]{-25, 78, -71}, new byte[]{-73, 29, -14, 85, 44, 38, 53, -52})) || str2.contains(m.h(new byte[]{-10, -100, 22}, new byte[]{-91, -35, 83, -84, 2, 92, 65, 13})) || str2.contains(m.h(new byte[]{-122, -17, 34}, new byte[]{-61, -82, 114, 33, -60, -44, -79, 25}))) {
            if (Build.VERSION.SDK_INT >= 29 && str2.contains(m.h(new byte[]{-97, -48, 49}, new byte[]{-48, -121, 116, 13, -11, -56, 101, 48}))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void A(boolean z9) {
        Button button = this.f1700j;
        if (z9) {
            button.setEnabled(true);
            this.f1702l.setEnabled(true);
            this.f1700j.setText(getResources().getString(R.string.wifi_set_off));
            this.f1700j.setBackgroundColor(-16711936);
            OnOffButton onOffButton = this.f1701k;
            Boolean bool = Boolean.TRUE;
            onOffButton.setEnable(bool);
            this.f1701k.setOnOff(bool);
            this.f1701k.setTextButton(getResources().getString(R.string.wifi_set_off));
            return;
        }
        button.setEnabled(true);
        this.f1702l.setEnabled(true);
        this.f1700j.setText(getResources().getString(R.string.wifi_set_on));
        this.f1700j.setBackgroundColor(SupportMenu.CATEGORY_MASK);
        this.f1701k.setEnable(Boolean.TRUE);
        this.f1701k.setOnOff(Boolean.FALSE);
        this.f1701k.setTextButton(getResources().getString(R.string.wifi_set_on));
    }

    public final void B() {
        if (this.f1695b.isWifiEnabled()) {
            k.c(this, false);
            f fVar = this.d;
            List list = Collections.EMPTY_LIST;
            fVar.a(list, list, "");
        } else {
            k.c(this, true);
        }
        y();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(m.x(context));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        List<WifiConfiguration> list;
        super.onCreate(bundle);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.modern_background));
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.modern_background));
        final int i10 = 0;
        getWindow().getDecorView().setSystemUiVisibility(0);
        setContentView(R.layout.activity_wifim);
        this.f1695b = (WifiManager) getApplicationContext().getSystemService(m.h(new byte[]{-113, 29, -111, 51}, new byte[]{-8, 116, -9, 90, 23, 75, 20, 77}));
        this.f1698h = (ConnectivityManager) getSystemService(m.h(new byte[]{47, -57, -24, 9, 69, 67, 65, -69, 58, -63, -14, 30}, new byte[]{76, -88, -122, 103, 32, 32, 53, -46}));
        this.f1696f = (TextView) findViewById(R.id.currentWifiStatus);
        this.f1697g = (TextView) findViewById(R.id.currentInternetStatus);
        this.f1700j = (Button) findViewById(R.id.wifiToggleButton);
        OnOffButton onOffButton = (OnOffButton) findViewById(R.id.wifiToggleButtonOnOff);
        this.f1701k = onOffButton;
        Button button = (Button) onOffButton.findViewById(R.id.onoff_button);
        button.setBackgroundResource(R.drawable.modern_button_primary);
        button.setBackgroundTintList(null);
        TextView textView = (TextView) this.f1701k.findViewById(R.id.textButton);
        textView.setTextColor(ContextCompat.getColor(this, R.color.modern_text));
        textView.setTextSize(17.0f);
        ((Button) findViewById(R.id.startDefWifiButton)).setOnClickListener(new View.OnClickListener(this) { // from class: m7.d
            public final /* synthetic */ MainWifiManadger c;

            {
                this.c = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x02a4  */
            /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r18) {
                /*
                    Method dump skipped, instructions count: 1578
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m7.d.onClick(android.view.View):void");
            }
        });
        this.f1702l = (Button) findViewById(R.id.refreshWifiButton);
        this.f1704n = (RecyclerView) findViewById(R.id.recyclerView);
        Button button2 = (Button) findViewById(R.id.wifi_acti_back);
        this.f1703m = button2;
        button2.setText(R.string.b_back);
        final int i11 = 1;
        this.f1703m.setOnClickListener(new View.OnClickListener(this) { // from class: m7.d
            public final /* synthetic */ MainWifiManadger c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    */
                /*
                    Method dump skipped, instructions count: 1578
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m7.d.onClick(android.view.View):void");
            }
        });
        this.f1701k.setRunnableOn(new a(this, 3));
        this.f1701k.setRunnableOff(new a(this, 4));
        final int i12 = 2;
        this.f1700j.setOnClickListener(new View.OnClickListener(this) { // from class: m7.d
            public final /* synthetic */ MainWifiManadger c;

            {
                this.c = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r18) {
                /*
                    Method dump skipped, instructions count: 1578
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m7.d.onClick(android.view.View):void");
            }
        });
        final int i13 = 3;
        this.f1702l.setOnClickListener(new View.OnClickListener(this) { // from class: m7.d
            public final /* synthetic */ MainWifiManadger c;

            {
                this.c = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r18) {
                /*
                    Method dump skipped, instructions count: 1578
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m7.d.onClick(android.view.View):void");
            }
        });
        if (ContextCompat.checkSelfPermission(this, m.h(new byte[]{4, -48, -122, -12, 19, -122, 106, 116, 21, -37, -112, -21, 21, -100, 125, 51, 10, -48, -52, -57, 63, -84, 75, 9, 54, -31, -92, -49, 50, -86, 81, 22, 42, -3, -93, -46, 53, -96, 64}, new byte[]{101, -66, -30, -122, 124, -17, 14, 90})) == 0) {
            i10 = 1;
        }
        if (i10 == 0) {
            requestPermissions(new String[]{m.h(new byte[]{121, -16, -106, -121, -75, 6, -66, 113, 104, -5, ByteCompanionObject.MIN_VALUE, -104, -77, 28, -87, 54, 119, -16, -36, -76, -103, 44, -97, 12, 75, -63, -76, -68, -108, 42, -123, 19, 87, -35, -77, -95, -109, 32, -108}, new byte[]{24, -98, -14, -11, -38, 111, -38, 95})}, 1);
        }
        this.f1704n.setLayoutManager(new LinearLayoutManager(this));
        this.e = new g(this.f1695b, new b(this));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(m.h(new byte[]{116, 69, -123, -48, 72, 110, 82, -82, 123, 78, -107, -116, 80, 110, 80, -23, 59, 120, -94, -29, 105, 88, 100, -59, 70, 126, -83, -10, 116}, new byte[]{21, 43, -31, -94, 39, 7, 54, ByteCompanionObject.MIN_VALUE}));
        intentFilter.addAction(m.h(new byte[]{63, -81, 117, 88, -73, -79, 77, -88, 48, -92, 101, 4, -81, -79, 79, -17, 112, -110, 69, 107, -116, -99, 118, -59, 22, ByteCompanionObject.MIN_VALUE, 95, 109, -99}, new byte[]{94, -63, 17, 42, -40, -40, 41, -122}));
        intentFilter.addAction(m.h(new byte[]{94, 72, -41, 76, -2, 74, -9, -99, 81, 67, -57, 16, -26, 74, -11, -38, 17, 113, -6, 120, -40, 124, -64, -25, 126, 114, -10, 97, -46, 107, -46, -3, 120, 99, -9}, new byte[]{63, 38, -77, 62, -111, 35, -109, -77}));
        intentFilter.addAction(m.h(new byte[]{-67, 29, 73, -59, 16, 107, -18, -70, -78, 22, 89, -103, 8, 107, -20, -3, -14, 0, 88, -57, 15, 110, -29, -9, -67, 29, 89, -103, 44, 86, -53, -64, -103, 44, 110, -1, 62, 76, -51, -47}, new byte[]{-36, 115, 45, -73, ByteCompanionObject.MAX_VALUE, 2, -118, -108}));
        registerReceiver(this.e, intentFilter);
        ArrayList arrayList = this.c;
        if (i10 != 0) {
            try {
                list = this.f1695b.getConfiguredNetworks();
                if (list == null) {
                    list = Collections.EMPTY_LIST;
                }
            } catch (SecurityException unused) {
                list = Collections.EMPTY_LIST;
            }
        } else {
            list = Collections.EMPTY_LIST;
        }
        List<WifiConfiguration> list2 = list;
        String str = "";
        if (i10 != 0) {
            try {
                WifiInfo connectionInfo = this.f1695b.getConnectionInfo();
                if (connectionInfo != null && connectionInfo.getSSID() != null) {
                    str = connectionInfo.getSSID();
                }
            } catch (SecurityException unused2) {
            }
        }
        f fVar = new f(arrayList, list2, str, new b(this), new b(this));
        this.d = fVar;
        this.f1704n.setAdapter(fVar);
        v();
        s();
        A(this.f1695b.isWifiEnabled());
        g.c = this;
        ConnectivityManager connectivityManager = this.f1698h;
        if (connectivityManager != null && !this.f1699i) {
            try {
                connectivityManager.registerDefaultNetworkCallback(this.f1709u);
                this.f1699i = true;
            } catch (RuntimeException unused3) {
            }
        }
        z();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        ConnectivityManager connectivityManager;
        super.onDestroy();
        this.r.removeCallbacks(this.f1708s);
        String str = k.f3969a;
        synchronized (k.class) {
            k.d();
        }
        unregisterReceiver(this.e);
        g.c = null;
        AlertDialog alertDialog = this.f1706p;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (this.f1699i && (connectivityManager = this.f1698h) != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this.f1709u);
            } catch (IllegalArgumentException unused) {
            }
            this.f1699i = false;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 1 && iArr.length > 0 && iArr[0] == 0) {
            v();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        s();
        A(this.f1695b.isWifiEnabled());
        v();
        z();
    }

    public final void s() {
        WifiInfo connectionInfo = this.f1695b.getConnectionInfo();
        if (connectionInfo != null && connectionInfo.getNetworkId() != -1) {
            String ssid = connectionInfo.getSSID();
            if (ssid != null && !ssid.equals(m.h(new byte[]{-26, 45, -100, -49, -110, 39, -60, -62, -86, 49, -102, -46, -112, 45, -107, -105}, new byte[]{-60, 17, -23, -95, -7, 73, -85, -75}))) {
                this.f1696f.setText(getString(R.string.wifi_connected_with_signal, ssid.replace(m.h(new byte[]{50}, new byte[]{16, -21, -114, 64, 104, -47, 33, -110}), ""), Integer.valueOf(WifiManager.calculateSignalLevel(connectionInfo.getRssi(), TypedValues.TYPE_TARGET))));
                return;
            } else {
                this.f1696f.setText(getResources().getString(R.string.wifi_not_con));
                return;
            }
        }
        this.f1696f.setText(getResources().getString(R.string.wifi_not_con));
    }

    public final void t(String str, String str2, String str3) {
        String str4;
        int i10;
        int addNetwork;
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        StringBuilder sb = new StringBuilder();
        q.u(new byte[]{-110}, new byte[]{-80, 22, 39, -79, 58, 27, -102, 1}, sb, str);
        wifiConfiguration.SSID = q.i(new byte[]{14}, new byte[]{44, 111, 112, 102, 120, 124, 73, 2}, sb);
        if (str3 != null) {
            str4 = str3.toUpperCase();
        } else {
            str4 = "";
        }
        if (str4.contains(m.h(new byte[]{-53, -115, 5}, new byte[]{-100, -56, 85, -83, 68, 103, -25, -10}))) {
            String[] strArr = wifiConfiguration.wepKeys;
            StringBuilder sb2 = new StringBuilder();
            q.u(new byte[]{-114}, new byte[]{-84, -1, 45, 117, 70, -58, 13, 96}, sb2, str2);
            strArr[0] = q.i(new byte[]{51}, new byte[]{17, 117, -28, -112, -29, 45, 95, 51}, sb2);
            wifiConfiguration.wepTxKeyIndex = 0;
            wifiConfiguration.allowedKeyManagement.set(0);
        } else {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29 && str4.contains(m.h(new byte[]{-21, -23, 25}, new byte[]{-72, -88, 92, 64, 86, -48, 18, 20})) && !str4.contains(m.h(new byte[]{-79, 47, 49}, new byte[]{-31, 124, 122, -72, 1, -26, -66, 59}))) {
                StringBuilder sb3 = new StringBuilder();
                q.u(new byte[]{-17}, new byte[]{-51, -4, 21, -39, -18, -108, 65, 35}, sb3, str2);
                wifiConfiguration.preSharedKey = q.i(new byte[]{87}, new byte[]{117, 34, 123, -77, 119, -38, -8, -124}, sb3);
                wifiConfiguration.allowedKeyManagement.set(8);
            } else if (i11 >= 29 && str4.contains(m.h(new byte[]{57, -69, -5}, new byte[]{118, -20, -66, -36, -66, 38, 96, -81}))) {
                wifiConfiguration.allowedKeyManagement.set(9);
            } else if (u(str4)) {
                wifiConfiguration.allowedKeyManagement.set(0);
            } else {
                StringBuilder sb4 = new StringBuilder();
                q.u(new byte[]{86}, new byte[]{116, 110, -24, -4, 5, -3, 90, 101}, sb4, str2);
                wifiConfiguration.preSharedKey = q.i(new byte[]{109}, new byte[]{79, -91, 8, -46, 103, -39, -9, -87}, sb4);
                wifiConfiguration.allowedKeyManagement.set(1);
            }
        }
        List<WifiConfiguration> configuredNetworks = this.f1695b.getConfiguredNetworks();
        if (configuredNetworks != null) {
            for (WifiConfiguration wifiConfiguration2 : configuredNetworks) {
                String str5 = wifiConfiguration2.SSID;
                if (str5 != null) {
                    StringBuilder sb5 = new StringBuilder();
                    q.u(new byte[]{-113}, new byte[]{-83, 72, 126, 32, 4, 38, -127, -10}, sb5, str);
                    sb5.append(m.h(new byte[]{-16}, new byte[]{-46, 120, 36, -7, 111, -93, 21, -68}));
                    if (str5.equals(sb5.toString())) {
                        i10 = wifiConfiguration2.networkId;
                        break;
                    }
                }
            }
        }
        i10 = -1;
        if (i10 != -1) {
            wifiConfiguration.networkId = i10;
            addNetwork = this.f1695b.updateNetwork(wifiConfiguration);
        } else {
            addNetwork = this.f1695b.addNetwork(wifiConfiguration);
        }
        if (addNetwork != -1) {
            this.f1695b.saveConfiguration();
            this.f1695b.disconnect();
            this.f1695b.enableNetwork(addNetwork, true);
            this.f1695b.reconnect();
            y5.k.x(getApplicationContext(), getResources().getString(R.string.wifi_con_to) + str);
            return;
        }
        y5.k.x(getApplicationContext(), getResources().getString(R.string.wifi_error_conn_to) + str);
    }

    public final void v() {
        if (this.f1695b.isWifiEnabled()) {
            if (ContextCompat.checkSelfPermission(this, m.h(new byte[]{-4, -109, -61, 58, 96, 56, 125, 91, -19, -104, -43, 37, 102, 34, 106, 28, -14, -109, -119, 9, 76, 18, 92, 38, -50, -94, -31, 1, 65, 20, 70, 57, -46, -66, -26, 28, 70, 30, 87}, new byte[]{-99, -3, -89, 72, 15, 81, 25, 117})) != 0) {
                requestPermissions(new String[]{m.h(new byte[]{94, -47, -102, 121, 84, 52, 56, -44, 79, -38, -116, 102, 82, 46, 47, -109, 80, -47, -48, 74, 120, 30, 25, -87, 108, -32, -72, 66, 117, 24, 3, -74, 112, -4, -65, 95, 114, 18, 18}, new byte[]{63, -65, -2, 11, 59, 93, 92, -6})}, 1);
                return;
            }
            try {
                this.f1695b.startScan();
                y5.k.x(getApplicationContext(), getResources().getString(R.string.wifi_search_wifi));
                return;
            } catch (SecurityException unused) {
                return;
            }
        }
        y5.k.x(getApplicationContext(), getResources().getString(R.string.wifi_on_wifi_to_search));
    }

    public final void w(String str, String str2) {
        if (str != null && !str.isEmpty()) {
            AlertDialog alertDialog = this.f1706p;
            if (alertDialog == null || !alertDialog.isShowing()) {
                f1694v = str;
                if (str2 == null) {
                    str2 = "";
                }
                this.f1705o = str2;
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle(getResources().getString(R.string.wifi_error));
                builder.setMessage(getResources().getString(R.string.wifi_set_pass) + str);
                EditText editText = new EditText(this);
                editText.setInputType(129);
                CheckBox checkBox = new CheckBox(this);
                checkBox.setText(getResources().getString(R.string.wifi_pass_show));
                checkBox.setOnCheckedChangeListener(new s0(7, editText));
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(1);
                linearLayout.setPadding(50, 40, 50, 10);
                linearLayout.addView(editText);
                linearLayout.addView(checkBox);
                builder.setView(linearLayout);
                builder.setPositiveButton(getResources().getString(R.string.wifi_set_conn), new y0(this, editText, str, 3));
                builder.setNegativeButton(getResources().getString(R.string.cancel), new d3(1));
                AlertDialog create = builder.create();
                this.f1706p = create;
                create.setOnDismissListener(new c(this, 0));
                this.f1706p.show();
            }
        }
    }

    public final void x(int i10, int i11) {
        TextView textView = this.f1697g;
        if (textView == null) {
            return;
        }
        textView.setText(i10);
        this.f1697g.setTextColor(i11);
    }

    public final void y() {
        Handler handler = this.r;
        a aVar = this.f1708s;
        handler.removeCallbacks(aVar);
        handler.removeCallbacks(this.t);
        Call call = this.f1707q;
        if (call != null) {
            call.cancel();
            this.f1707q = null;
        }
        this.f1700j.setBackgroundColor(-7829368);
        this.f1700j.setEnabled(false);
        this.f1702l.setEnabled(false);
        this.f1700j.setText(getResources().getString(R.string.wifi_ojidat));
        this.f1701k.setEnable(Boolean.FALSE);
        this.f1701k.setTextButton(getResources().getString(R.string.wifi_ojidat));
        handler.postDelayed(aVar, 12000L);
    }

    public final void z() {
        runOnUiThread(new a(this, 1));
    }
}
