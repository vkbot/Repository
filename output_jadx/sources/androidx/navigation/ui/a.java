package androidx.navigation.ui;

import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.h;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;
import b1.m;
import com.example.navistart.DialogUni.Fragmenti.ExlantixTelemetryFragment;
import com.example.navistart.MainActivity;
import com.example.navistart.Notik;
import com.example.navistart.PermActivity;
import com.example.navistart.TestSpaceActivity;
import com.example.navistart.W;
import com.example.navistart.mainview.HeatManSetView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.protobuf.q;
import com.woha.wifim.MainWifiManadger;
import e0.j2;
import e0.p3;
import e0.x1;
import g0.d;
import g0.e;
import h0.b;
import j0.c;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.c3;
import m0.e2;
import m0.f1;
import m0.g1;
import m0.h1;
import m0.i1;
import m0.k0;
import m0.k2;
import m0.k3;
import m0.l;
import m0.l3;
import m0.m0;
import m0.n;
import m0.n0;
import m0.n1;
import m0.n3;
import m0.o;
import m0.s1;
import m0.t0;
import m0.t2;
import m0.u0;
import m0.v0;
import m0.v1;
import m0.w1;
import m0.x2;
import m0.y0;
import m0.z0;
import m7.f;
import okhttp3.Call;
import okhttp3.Request;
import org.json.JSONException;
import ru.transfer.MessageData;
import s1.r;
import t1.g;
import w0.p0;
import w0.q0;
import y5.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f244b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f244b = i10;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [m0.e1, java.lang.Object, okhttp3.Callback] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Notik notik;
        int i10;
        Boolean bool;
        Display[] displayArr;
        int i11;
        Class cls;
        MessageData c;
        int i12 = this.f244b;
        int i13 = 14;
        int i14 = 2;
        int i15 = 0;
        int i16 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i12) {
            case 0:
                NavigationUI.a((NavController) obj2, (AppBarConfiguration) obj, view);
                return;
            case 1:
                String str = MainActivity.f750e1;
                ((MainActivity) obj2).O((MaterialSwitch) obj);
                return;
            case 2:
                PermActivity permActivity = (PermActivity) obj2;
                Intent intent = (Intent) obj;
                String str2 = PermActivity.c;
                try {
                    permActivity.startActivityForResult(intent, 0);
                    return;
                } catch (ActivityNotFoundException unused) {
                    return;
                }
            case 3:
                String str3 = PermActivity.c;
                ActivityCompat.requestPermissions((PermActivity) obj2, new String[]{(String) obj}, 1);
                return;
            case 4:
                TestSpaceActivity testSpaceActivity = (TestSpaceActivity) obj2;
                Button button = (Button) obj;
                if (testSpaceActivity.e) {
                    b.a().j().sl(null);
                    button.setBackgroundResource(com.example.navistart.R.drawable.modern_button_primary);
                    testSpaceActivity.f911f.setVisibility(8);
                    testSpaceActivity.e = false;
                    return;
                }
                button.setBackgroundResource(com.example.navistart.R.drawable.modern_button_danger);
                testSpaceActivity.f911f.setVisibility(0);
                testSpaceActivity.e = true;
                b.a().j().sl(testSpaceActivity.f912g);
                return;
            case 5:
                m mVar = (m) obj2;
                e eVar = (e) obj;
                mVar.getClass();
                eVar.getMsg();
                ((LinearLayout) mVar.d).removeView(eVar);
                return;
            case 6:
                e eVar2 = (e) obj2;
                MessageData messageData = (MessageData) obj;
                d dVar = eVar2.f2423i;
                if (dVar != null && (notik = (Notik) ((m) dVar).e) != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(messageData);
                    Notik.f(notik, arrayList);
                }
                eVar2.setVisibility(8);
                return;
            case 7:
                String str4 = ((l) obj).f3771b;
                o oVar = ((n) obj2).f3794a;
                try {
                    Intent launchIntentForPackage = oVar.requireContext().getPackageManager().getLaunchIntentForPackage(str4);
                    if (launchIntentForPackage == null || (i10 = oVar.e) < 0 || i10 >= oVar.f3822f.length) {
                        return;
                    }
                    ActivityOptions launchDisplayId = Build.VERSION.SDK_INT >= 26 ? ActivityOptions.makeBasic().setLaunchDisplayId(oVar.f3822f[oVar.e].getDisplayId()) : null;
                    launchIntentForPackage.addFlags(402685952);
                    if (oVar.u().booleanValue()) {
                        if (launchDisplayId != null) {
                            k.u(oVar.requireContext(), launchIntentForPackage, launchDisplayId.toBundle());
                        } else {
                            k.u(oVar.requireContext(), launchIntentForPackage, null);
                        }
                        o.t(oVar, str4);
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 8:
                ExlantixTelemetryFragment.u((LinearLayout) obj2, (Button) obj, view);
                return;
            case 9:
                k0 k0Var = (k0) obj;
                n0 n0Var = ((m0) obj2).f3781b;
                if (n0Var.d) {
                    return;
                }
                try {
                    Intent launchIntentForPackage2 = n0Var.requireContext().getPackageManager().getLaunchIntentForPackage(k0Var.f3758a);
                    if (launchIntentForPackage2 != null) {
                        n0Var.startActivity(launchIntentForPackage2);
                        return;
                    }
                    throw new IllegalStateException();
                } catch (Exception unused3) {
                    Toast.makeText(n0Var.requireContext(), com.example.navistart.R.string.fullscreen_apps_launch_error, 0).show();
                    return;
                }
            case 10:
                v0 v0Var = (v0) obj2;
                int bindingAdapterPosition = ((u0) obj).getBindingAdapterPosition();
                if (bindingAdapterPosition != -1) {
                    z0 z0Var = (z0) v0Var.f3881b.c;
                    ArrayList arrayList2 = z0Var.f3907b;
                    if (bindingAdapterPosition < 0 || bindingAdapterPosition >= arrayList2.size()) {
                        return;
                    }
                    t0 t0Var = (t0) arrayList2.get(bindingAdapterPosition);
                    Spinner spinner = new Spinner(z0Var.requireContext(), 0);
                    String str5 = c.c;
                    int i17 = (int) (16 * Resources.getSystem().getDisplayMetrics().density);
                    spinner.setPadding(i17, i17, i17, i17);
                    b.a();
                    b.f().n(spinner, t0Var.f3859b);
                    new AlertDialog.Builder(z0Var.requireContext()).setTitle(com.example.navistart.R.string.log_keycode_choose_action).setView(spinner).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(android.R.string.ok, new y0(z0Var, spinner, t0Var, false ? 1 : 0)).show();
                    return;
                }
                return;
            case 11:
                g1 g1Var = (g1) obj2;
                int bindingAdapterPosition2 = ((f1) obj).getBindingAdapterPosition();
                h hVar = g1Var.f3701a;
                if (hVar == null || bindingAdapterPosition2 == -1) {
                    return;
                }
                h1 h1Var = (h1) g1Var.f3702b.get(bindingAdapterPosition2);
                i1 i1Var = (i1) hVar.c;
                String str6 = i1.f3734i;
                Context applicationContext = i1Var.requireContext().getApplicationContext();
                RecyclerView recyclerView = i1Var.f3741b;
                String str7 = i1Var.f3743g;
                String string = i1Var.getString(com.example.navistart.R.string.install_error);
                String string2 = i1Var.getString(com.example.navistart.R.string.install_done);
                h1Var.f3716i = true;
                h1Var.f3717j = e0.m.h(new byte[]{-11, -24}, new byte[]{-59, -51, -47, -107, -109, -110, -74, 69});
                i1Var.f3741b.getAdapter().notifyItemChanged(bindingAdapterPosition2);
                Request build = new Request.Builder().url(h1Var.f3715h.trim()).build();
                b.a();
                Call newCall = b.m().newCall(build);
                ?? obj3 = new Object();
                obj3.f3675i = i1Var;
                obj3.c = recyclerView;
                obj3.d = h1Var;
                obj3.e = string;
                obj3.f3671b = bindingAdapterPosition2;
                obj3.f3674h = applicationContext;
                obj3.f3672f = str7;
                obj3.f3673g = string2;
                newCall.enqueue(obj3);
                return;
            case 12:
                s1 s1Var = (s1) obj;
                w1 w1Var = ((v1) obj2).f3882a;
                StringBuilder sb = new StringBuilder();
                u0.a o5 = b.o();
                byte[] bArr = e0.m.f1973j;
                String[] strArr = p3.f2001a;
                q.s(bArr, o5, "", sb);
                q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
                String g10 = q.g(sb, x1.f2066q);
                u0.a o9 = b.o();
                byte[] bArr2 = e0.m.f1969f;
                if (q.w(bArr2, o9, "", g10)) {
                    b.a();
                    bool = Boolean.valueOf(q.d(Long.MAX_VALUE, b.a().j()) < Long.parseLong(new String(q.x(new byte[]{108}, new byte[]{92, 67, -91, 60, 124, -112, -2, 7}, b.o(), q.h(e0.m.f1970g, b.o(), new String(bArr2)), 0))));
                } else {
                    bool = Boolean.FALSE;
                }
                if (bool.booleanValue()) {
                    try {
                        Intent launchIntentForPackage3 = w1Var.requireContext().getPackageManager().getLaunchIntentForPackage(s1Var.f3854b);
                        if (launchIntentForPackage3 != null && (displayArr = w1Var.f3890j) != null && (i11 = w1Var.f3889i) >= 0 && i11 < displayArr.length) {
                            ActivityOptions launchDisplayId2 = Build.VERSION.SDK_INT >= 26 ? ActivityOptions.makeBasic().setLaunchDisplayId(w1Var.f3890j[w1Var.f3889i].getDisplayId()) : null;
                            launchIntentForPackage3.addFlags(268435456);
                            launchIntentForPackage3.addFlags(131072);
                            launchIntentForPackage3.addFlags(2097152);
                            if (launchDisplayId2 != null) {
                                k.u(w1Var.requireContext(), launchIntentForPackage3, launchDisplayId2.toBundle());
                            } else {
                                k.u(w1Var.requireContext(), launchIntentForPackage3, null);
                            }
                            if (!(w1Var.getParentFragment() instanceof l0.a)) {
                                return;
                            } else {
                                ((l0.a) w1Var.getParentFragment()).dismissAllowingStateLoss();
                            }
                        }
                        return;
                    } catch (Exception unused4) {
                        return;
                    }
                }
                return;
            case 13:
                String str8 = e2.f3676j;
                new Handler().postDelayed((e0.v0) obj2, 3000L);
                new Handler().postDelayed((e0.v0) obj, 1L);
                return;
            case 14:
                String str9 = e2.f3676j;
                new Handler().postDelayed((e0.v0) obj2, 1L);
                new Handler().postDelayed((e0.v0) obj, 3000L);
                return;
            case 15:
                File file = (File) obj;
                c3 c3Var = ((x2) obj2).f3897a;
                if (c3Var.f3639v) {
                    return;
                }
                if (file.isDirectory()) {
                    c3Var.D(file);
                    return;
                }
                if (c3Var.f3639v || !file.exists() || file.isDirectory()) {
                    return;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (c3.B(file)) {
                    arrayList3.add(c3Var.getString(com.example.navistart.R.string.install));
                    arrayList4.add(new t2(c3Var, file, i16));
                } else {
                    arrayList3.add(c3Var.getString(com.example.navistart.R.string.user_file_manager_open_builtin));
                    arrayList4.add(new t2(c3Var, file, i14));
                }
                arrayList3.add(c3Var.getString(com.example.navistart.R.string.user_file_manager_open_external));
                arrayList4.add(new t2(c3Var, file, 3));
                new AlertDialog.Builder(c3Var.requireContext(), com.example.navistart.R.style.ThemeOverlay_JCarTools_ModernAlert).setTitle(c3Var.getString(com.example.navistart.R.string.user_file_manager_actions_title, file.getName())).setItems((CharSequence[]) arrayList3.toArray(new String[0]), new b7.h(i14, arrayList4)).setNegativeButton(com.example.navistart.R.string.cancel, (DialogInterface.OnClickListener) null).show();
                return;
            case 16:
                k3 k3Var = (k3) obj;
                n3 n3Var = ((l3) obj2).f3777b;
                try {
                    if (n3.t().booleanValue()) {
                        Context requireContext = n3Var.requireContext();
                        File file2 = k3Var.e;
                        String str10 = k3Var.f3768a;
                        if (file2.isFile() && file2.canRead()) {
                            Uri d = n3Var.f3813n.d(file2);
                            Intent putExtra = new Intent(e0.m.h(new byte[]{-20, 24, 7, 76, -92, -99, 109, 63, -28, 24, 23, 91, -91, ByteCompanionObject.MIN_VALUE, 39, 112, -18, 2, 10, 81, -91, -38, 95, 88, -56, 33}, new byte[]{-115, 118, 99, 62, -53, -12, 9, 17})).setPackage(e0.m.h(new byte[]{-18, -106, 80, -54, 36, -14, 21, -45, -18, -120, 86, -118, 124, -19, 29, -43}, new byte[]{-127, -28, 55, -28, 82, -101, 113, -74})).setDataAndType(d, e0.m.h(new byte[]{40, 42, 46, -16, 36, 42, -2}, new byte[]{94, 67, 74, -107, 75, 5, -44, 27})).addFlags(1).putExtra(e0.m.h(new byte[]{34, 74, 14, -70, -1}, new byte[]{86, 35, 122, -42, -102, 105, -38, -16}), str10);
                            putExtra.setClipData(ClipData.newUri(requireContext.getContentResolver(), str10, d));
                            n3Var.startActivity(putExtra);
                        }
                        Toast.makeText(requireContext, com.example.navistart.R.string.video_file_missing, 1).show();
                    }
                    return;
                } catch (ActivityNotFoundException unused5) {
                    Toast.makeText(n3Var.requireContext(), com.example.navistart.R.string.video_vlc_missing, 1).show();
                    return;
                } catch (Exception unused6) {
                    Toast.makeText(n3Var.requireContext(), com.example.navistart.R.string.video_open_error, 1).show();
                    return;
                }
            case 17:
                ScanResult scanResult = (ScanResult) obj;
                MainWifiManadger mainWifiManadger = ((f) obj2).d.f3948a;
                String str11 = MainWifiManadger.f1694v;
                String str12 = scanResult.SSID;
                MainWifiManadger.f1694v = str12;
                String str13 = scanResult.capabilities;
                if (str13 == null) {
                    str13 = "";
                }
                mainWifiManadger.f1705o = str13;
                List<WifiConfiguration> configuredNetworks = mainWifiManadger.f1695b.getConfiguredNetworks();
                if (configuredNetworks != null) {
                    for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                        String str14 = wifiConfiguration.SSID;
                        if (str14 != null) {
                            StringBuilder sb2 = new StringBuilder();
                            q.u(new byte[]{-22}, new byte[]{-56, 80, 20, 101, -65, 68, 51, -35}, sb2, str12);
                            sb2.append(e0.m.h(new byte[]{-113}, new byte[]{-83, 110, -108, 91, 31, 76, 70, -25}));
                            if (str14.equals(sb2.toString())) {
                                mainWifiManadger.f1695b.disconnect();
                                mainWifiManadger.f1695b.enableNetwork(wifiConfiguration.networkId, true);
                                mainWifiManadger.f1695b.reconnect();
                                k.x(mainWifiManadger.getApplicationContext(), mainWifiManadger.getResources().getString(com.example.navistart.R.string.wifi_con_to) + str12);
                                return;
                            }
                        }
                    }
                }
                boolean u8 = MainWifiManadger.u(mainWifiManadger.f1705o);
                String str15 = mainWifiManadger.f1705o;
                if (u8) {
                    mainWifiManadger.t(str12, "", str15);
                    return;
                } else if (str15 != null && str15.toUpperCase().contains(e0.m.h(new byte[]{38, -17, -107}, new byte[]{99, -82, -59, -70, 27, 119, 91, -27}))) {
                    k.x(mainWifiManadger.getApplicationContext(), mainWifiManadger.getString(com.example.navistart.R.string.wifi_enterprise_not_supported));
                    return;
                } else {
                    mainWifiManadger.w(str12, mainWifiManadger.f1705o);
                    return;
                }
            case 18:
                s1.n nVar = (s1.n) obj2;
                r rVar = nVar.f5560b;
                j0.e eVar3 = (j0.e) obj;
                nVar.j();
                if (eVar3.f3094a == j0.d.f3092b && eVar3.f3095b != null) {
                    Bundle bundle = new Bundle();
                    String h2 = e0.m.h(new byte[]{34, 30, 89}, new byte[]{70, 119, 42, -103, -6, -88, 87, -36});
                    b.a();
                    bundle.putInt(h2, b.n().getGuDisplayID());
                    n0.d dVar2 = eVar3.f3095b;
                    if (dVar2 == n0.d.f4087l) {
                        cls = o.class;
                    } else if (dVar2 == n0.d.f4080h0) {
                        cls = k2.class;
                    } else if (dVar2 == n0.d.A0) {
                        bundle.putBoolean(e0.m.h(new byte[]{-121, 67, 16, 79, 99, 19, 70, ByteCompanionObject.MIN_VALUE, -70, 65, 24, 81, 109, 20, 119, -116, -116, 70, 18, 83}, new byte[]{-27, 34, 119, Base64.padSymbol, 2, 102, 40, -28}), true);
                        cls = w1.class;
                    }
                    Intent intent2 = new Intent(nVar.getContext(), (Class<?>) W.class);
                    intent2.putExtra(e0.m.h(new byte[]{21, 40, -79, -61, -122, 29, 36, -57, 44, 8, -123, -22, -76, 44, 19, -29, 54}, new byte[]{115, 90, -48, -92, -21, 120, 74, -77}), e0.m.h(new byte[]{11, -117, -102, -92, -76, 93, 8, 15, 22, -103, -117, -82, -66, 93}, new byte[]{89, -34, -44, -5, -16, 20, 73, 67}));
                    intent2.putExtra(e0.m.h(new byte[]{100, -102, -95, 12, -10, -8, -5, -71, 93, -117, -84, 10, -24, -18}, new byte[]{2, -24, -64, 107, -101, -99, -107, -51}), cls.getName());
                    intent2.putExtra(e0.m.h(new byte[]{-122, -22, -44, -32, 80, 96, -93, 18, -65, -7, -57, -32, 78}, new byte[]{-32, -104, -75, -121, Base64.padSymbol, 5, -51, 102}), bundle);
                    intent2.addFlags(402653184);
                    nVar.getContext().startActivity(intent2);
                    if (rVar.f5608a.getBoolean(r.f5604h, true)) {
                        nVar.m(false);
                    }
                    nVar.l();
                    return;
                }
                new Thread(new j2(25, nVar, eVar3), e0.m.h(new byte[]{2, -118, -36, -26, -36, -30, -14, 24, 8, -121, -58, -23, -53, -29, -7, 13, 5, -123, -57, -18, -57, -27}, new byte[]{68, -26, -77, -121, -88, -117, -100, ByteCompanionObject.MAX_VALUE})).start();
                if (rVar.f5608a.getBoolean(r.f5604h, true)) {
                    nVar.m(false);
                }
                nVar.l();
                return;
            case 19:
                ((s1.u0) obj2).f((e4.o) obj);
                return;
            case 20:
                t0.d dVar3 = (t0.d) obj2;
                List list = dVar3.f5744a;
                int adapterPosition = ((t0.c) obj).getAdapterPosition();
                if (adapterPosition != -1) {
                    list.remove(adapterPosition);
                    dVar3.notifyItemRemoved(adapterPosition);
                    dVar3.notifyItemRangeChanged(adapterPosition, list.size());
                    return;
                }
                return;
            case 21:
                HeatManSetView heatManSetView = (HeatManSetView) obj2;
                int i18 = HeatManSetView.t;
                new AlertDialog.Builder((Context) obj).setTitle(heatManSetView.f1024o).setMessage(heatManSetView.f1025p).setCancelable(true).setIcon(com.example.navistart.R.drawable.baseline_help_24).show();
                return;
            case 22:
                t1.h hVar2 = (t1.h) obj2;
                MessageData messageData2 = (MessageData) obj;
                String obj4 = hVar2.f5761g.getText().toString();
                if (hVar2.f5765k == null || obj4.isEmpty()) {
                    return;
                }
                g gVar = hVar2.f5765k;
                MessageData messageData3 = new MessageData(messageData2.getKey(), messageData2.gethasReply(), messageData2.getPackageName(), messageData2.getSender(), obj4, (Drawable) null);
                ((n1) gVar).getClass();
                Notik notik2 = n1.e;
                if (notik2 != null) {
                    ConcurrentHashMap concurrentHashMap = notik2.e;
                    if (messageData3.gethasReply() && (c = notik2.c(messageData3.getKey())) != null) {
                        Notik.f855l.remove(c);
                        concurrentHashMap.put(messageData3.getKey(), c);
                        try {
                            notik2.f859f.y(e0.m.h(new byte[]{-116, -76, 2, 40, 115, 107, -87, 50, -49, -93, 20, 43, 126, 117}, new byte[]{-31, -47, 113, 91, 18, 12, -52, 65}), com.bumptech.glide.c.i(messageData3));
                        } catch (RuntimeException | JSONException e) {
                            concurrentHashMap.remove(messageData3.getKey());
                            notik2.a(c);
                            Log.w(e0.m.h(new byte[]{95, 92, 30, -40, -17}, new byte[]{17, 51, 106, -79, -124, 103, -97, -118}), e0.m.h(new byte[]{-87, 50, 105, 26, 70, 121, 95, 48, -109, 124, 123, 29, 68, 120, 95, 41, -103, 47, 123, 25, 77, 121, 95, 54, -103, 44, 100, 1}, new byte[]{-4, 92, 8, 120, 42, 28, ByteCompanionObject.MAX_VALUE, 68}), e);
                        }
                    }
                }
                ViewParent parent = hVar2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(hVar2);
                    return;
                }
                return;
            case 23:
                q0 q0Var = (q0) obj2;
                List list2 = q0Var.f6222a;
                int adapterPosition2 = ((p0) obj).getAdapterPosition();
                if (adapterPosition2 != -1) {
                    list2.remove(adapterPosition2);
                    q0Var.notifyItemRemoved(adapterPosition2);
                    q0Var.notifyItemRangeChanged(adapterPosition2, list2.size());
                    return;
                }
                return;
            case 24:
                ((x0.c) obj2).m((j0.e) obj);
                return;
            default:
                x0.c cVar = (x0.c) obj2;
                x0.m mVar2 = (x0.m) obj;
                HashMap hashMap = cVar.f6435i;
                int intValue = (((Integer) hashMap.getOrDefault(mVar2.f6460a, 0)).intValue() + 1) % 4;
                hashMap.put(mVar2.f6460a, Integer.valueOf(intValue));
                if (intValue > 0) {
                    ArrayList arrayList5 = cVar.c.f6485u;
                    int size = arrayList5.size();
                    while (i15 < size) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        x0.m mVar3 = (x0.m) obj5;
                        if (x0.c.i(mVar3) && x0.c.n(mVar3) == x0.c.n(mVar2) && x0.c.h(mVar3) != x0.c.h(mVar2)) {
                            hashMap.put(mVar3.f6460a, 0);
                        }
                    }
                }
                cVar.j();
                cVar.f6433g++;
                x0.c.f6430s.execute(new androidx.activity.f(cVar, intValue, mVar2, i13));
                return;
        }
    }
}
