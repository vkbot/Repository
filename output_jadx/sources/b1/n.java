package b1;

import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.MyA11yService;
import com.example.navistart.MyCarReceiver;
import com.example.navistart.R;
import com.example.navistart.cores.ColorText;
import com.example.navistart.home.WebLauncherActivity;
import e0.j2;
import e0.x1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.b3;
import m0.c3;
import m0.i1;
import m0.j3;
import m0.s2;
import org.json.JSONObject;
import s1.h0;
import s1.i0;
import s1.q0;
import s1.w;
import s1.x;
import w0.a0;
import w0.k1;
import w0.l1;
import w0.u0;
import w0.v0;
import w0.z;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f306b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n(MyA11yService myA11yService, AccessibilityNodeInfo accessibilityNodeInfo, String str, String str2) {
        this.f306b = 2;
        this.c = accessibilityNodeInfo;
        this.d = str;
        this.e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String h2;
        String message;
        String str;
        File file;
        String str2;
        b3 a10;
        String message2;
        String message3;
        int i10;
        final int i11 = 1;
        File file2 = null;
        int i12 = 9;
        final int i13 = 0;
        switch (this.f306b) {
            case 0:
                r rVar = (r) this.c;
                String str3 = (String) this.d;
                String str4 = (String) this.e;
                if (rVar.c != null) {
                    StringBuilder sb = new StringBuilder();
                    com.google.protobuf.q.u(new byte[]{-115, 64, -117, -45, 25, -99, 68, 52, -108, 104, -117, -45, 4, -123, 3, 63, -65, 95, ByteCompanionObject.MIN_VALUE, -39, 2, -54, 76, 125, -38, 94, -116, -39, 18, -123, 29, 117, -107, 71, -92, -39, 18, -104, 5, 50, -98, 108, -109, -46, 24, -98, 66, 124}, new byte[]{-6, 41, -27, -73, 118, -22, 106, 91}, sb, str3);
                    com.google.protobuf.q.u(new byte[]{-102, -27, 22}, new byte[]{-67, -55, 54, 80, -47, -47, -68, -19}, sb, str4);
                    String i14 = com.google.protobuf.q.i(new byte[]{-120, 44}, new byte[]{-95, 23, 75, 108, -8, 8, -19, 125}, sb);
                    try {
                        if (rVar.f315b) {
                            rVar.c.post(new a1.a(i12, rVar, i14));
                            return;
                        }
                        return;
                    } catch (NullPointerException unused) {
                        return;
                    }
                }
                return;
            case 1:
                x1 x1Var = (x1) this.c;
                MediaController mediaController = (MediaController) this.d;
                MediaController mediaController2 = (MediaController) this.e;
                if (x1Var.f2078o) {
                    x1Var.f2078o = false;
                    if (mediaController != null) {
                        x1Var.e(mediaController);
                        x1Var.f2078o = true;
                        return;
                    }
                    if (mediaController2 != null) {
                        mediaController2.registerCallback(x1Var);
                    }
                    x1.d(mediaController2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e0.m.h(new byte[]{-75, -58, 28, 18, 36, 35, -4, 107, -116, -47, 23, 23, 41, 5, -31, 37, -43, -125}, new byte[]{-8, -93, 120, 123, 69, 96, -109, 5}));
                    if (mediaController2 != null) {
                        h2 = mediaController2.getPackageName();
                    } else {
                        h2 = e0.m.h(new byte[]{-126, -6, -100, 1}, new byte[]{-20, -113, -16, 109, -39, 44, 125, -121});
                    }
                    sb2.append(h2);
                    h0.b.w(sb2.toString(), ColorText.RED);
                    x1Var.f2078o = true;
                    return;
                }
                return;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo = (AccessibilityNodeInfo) this.c;
                String str5 = (String) this.d;
                String str6 = (String) this.e;
                MyA11yService myA11yService = MyA11yService.c;
                StringBuilder u8 = ai.onnxruntime.a.u(str5);
                u8.append(e0.m.h(new byte[]{30, -71, 13, 54, -44, 19, 91, -112, 78, -88, 9, 58, -1, 47, 69, -100, 93, -90, 85}, new byte[]{62, -51, 104, 78, -96, 76, 41, -11}));
                u8.append(str6);
                MyA11yService.c(accessibilityNodeInfo, u8.toString());
                return;
            case 3:
                MyCarReceiver myCarReceiver = (MyCarReceiver) this.c;
                Context context = (Context) this.d;
                Intent intent = (Intent) this.e;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = MyCarReceiver.c;
                myCarReceiver.onReceive(context, intent);
                return;
            case 4:
                MyCarReceiver myCarReceiver2 = (MyCarReceiver) this.c;
                a1.a aVar = (a1.a) this.e;
                String str7 = (String) this.d;
                ConcurrentHashMap concurrentHashMap = myCarReceiver2.f852a;
                try {
                    aVar.run();
                    return;
                } finally {
                    concurrentHashMap.remove(str7);
                }
            case 5:
                f1.e eVar = (f1.e) this.c;
                JSONObject v9 = f1.e.v((String) this.d, (JSONObject) this.e);
                if (v9 == null || !v9.optBoolean(e0.m.h(new byte[]{99, 15, -37, -120, 69, -120, -93}, new byte[]{16, 122, -72, -21, 32, -5, -48, -10}), false)) {
                    eVar.f2253b.post(new a4.g(28, eVar));
                    return;
                }
                return;
            case 6:
                h7.k kVar = (h7.k) this.c;
                String str8 = (String) this.d;
                Context context2 = (Context) this.e;
                kVar.getClass();
                Log.d(h7.k.f2614k, e0.m.h(new byte[]{-3, 15, 57, -66, 94, -113, 16, -65, -21, 15, 51, -83, 66, -103, 28, -65, -8, 12, 33, -70, 85, -54}, new byte[]{-103, 106, 85, -33, 39, -22, 116, -97}) + str8);
                kVar.o(context2);
                return;
            case 7:
                Bundle bundle = (Bundle) this.c;
                Context context3 = (Context) this.d;
                Intent intent2 = (Intent) this.e;
                try {
                    if (bundle != null) {
                        context3.startActivity(intent2, bundle);
                    } else {
                        context3.startActivity(intent2);
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 8:
                i1 i1Var = (i1) this.c;
                RecyclerView recyclerView = (RecyclerView) this.d;
                Runnable runnable = (Runnable) this.e;
                String str9 = i1.f3734i;
                if (i1Var.isAdded() && recyclerView != null && i1Var.f3741b == recyclerView) {
                    runnable.run();
                    return;
                }
                return;
            case 9:
                c3 c3Var = (c3) this.c;
                String str10 = (String) this.d;
                File file3 = (File) this.e;
                c3Var.H(null, false);
                if (str10 == null) {
                    File file4 = c3Var.f3638u;
                    if (file4 != null && c3.G(file4).equals(c3.G(file3))) {
                        c3Var.f3638u = null;
                        c3Var.K();
                    }
                    c3Var.v();
                    c3Var.I(c3Var.getString(R.string.user_file_manager_delete_done, file3.getName()));
                    c3Var.D(c3Var.t);
                    return;
                }
                c3Var.I(c3Var.getString(R.string.user_file_manager_delete_error, str10));
                return;
            case 10:
                c3 c3Var2 = (c3) this.c;
                File file5 = (File) this.d;
                File file6 = (File) this.e;
                try {
                    File u9 = c3.u(file5, file6.getName());
                    try {
                        if (file6.isDirectory()) {
                            String G = c3.G(file6);
                            String G2 = c3.G(file5);
                            if (!G2.equals(G)) {
                                if (!G2.startsWith(G + File.separator)) {
                                }
                            }
                            try {
                                str2 = c3Var2.getString(R.string.user_file_manager_same_place_error);
                            } catch (Exception unused3) {
                                str2 = "";
                            }
                            throw new IOException(str2);
                        }
                        c3.x(file6, u9);
                        file = u9;
                        str = null;
                    } catch (Exception e) {
                        e = e;
                        file2 = u9;
                        if (e.getMessage() == null) {
                            message = e.getClass().getSimpleName();
                        } else {
                            message = e.getMessage();
                        }
                        str = message;
                        file = file2;
                        c3Var2.F(new s2(0, c3Var2, str, file, file5));
                        return;
                    }
                } catch (Exception e6) {
                    e = e6;
                }
                c3Var2.F(new s2(0, c3Var2, str, file, file5));
                return;
            case 11:
                p0.b bVar = (p0.b) this.c;
                ComponentName componentName = (ComponentName) this.d;
                f5.f fVar = (f5.f) this.e;
                try {
                    synchronized (p0.b.c) {
                        a10 = bVar.a(componentName);
                    }
                } catch (SecurityException unused4) {
                    a10 = new b3(true, (String) null);
                } catch (Exception e10) {
                    a10 = b3.a(e10.getClass().getSimpleName());
                }
                new Handler(Looper.getMainLooper()).post(new j2(23, fVar, a10));
                return;
            case 12:
                x xVar = (x) this.c;
                String str11 = (String) this.d;
                w wVar = (w) this.e;
                String c = xVar.c(str11);
                if (!e0.m.h(new byte[]{-73, 125}, new byte[]{-8, 54, -28, -103, -1, 9, -120, -13}).equals(c)) {
                    Log.w(e0.m.h(new byte[]{68, 38, 22, -10, 117, -60, -126, 99, 73, 55, 19, -49, ByteCompanionObject.MAX_VALUE, -62, -125, 126, ByteCompanionObject.MAX_VALUE}, new byte[]{8, 71, 99, -104, 22, -84, -25, 17}), str11.split(" ")[0] + e0.m.h(new byte[]{-120, 105, -15, 43, -27, 16, 29, 63, -120}, new byte[]{-88, 15, -112, 66, -119, 117, 121, 5}) + c);
                }
                xVar.c.post(new j2(27, wVar, c));
                return;
            case 13:
                q0 q0Var = (q0) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                if (!q0Var.E && q0Var.f5595s && q0Var.isAttachedToWindow()) {
                    if (arrayList.isEmpty()) {
                        y5.k.x(q0Var.getContext(), e0.m.h(new byte[]{0, 64, 26, -46, -71, 23, -56, 5, 100, 13, 116, -74, -23, 68, 106, 4, 83, 13, 117, -73, -43, 68, 99, 4, 85, -3, 26, -40, -71, 21, 56, 109, 0, 102, 26, -39, -72, 35, 56, 96, 0, 96, 26, -33, -72, 44}, new byte[]{-48, -35, -54, 103, 104, -107, -24, -43}));
                        return;
                    }
                    LinearLayout j10 = q0Var.j();
                    TextView P = q0Var.P(e0.m.h(new byte[]{-54, 80, -96, -61, 53, -45, 71, -43, -54, 113, -95, -11, 53, -34, 71, -45, -54, 119, -95, -10, -59, -69, 37, 78, -54, 113, -95, -7, 53, -42, 71, -37}, new byte[]{26, -49, 113, 67, -27, 107, -105, 110}), 25, -1);
                    P.setTypeface(Typeface.DEFAULT_BOLD);
                    P.setMaxLines(1);
                    j10.addView(P);
                    j10.addView(q0Var.k(e0.m.h(new byte[]{75, 63, -81, -39, 87, -122, 84, -6, 74, 45, -82, -22, 86, -75, 84, -6, -69, 125, -63, -125, 7, -25, 60, -97, 32, 125, -64, -126, 49, -25, 49, -97, 38, 125, -58, -126, 50, 23, 84, -5, 75, 22, -81, -35, -89, -25, 51, -97, 43, 125, -63, -125, 4, -26, 5, -97, 33, 125, -50, 114, 87, -123, -92, -97, 37, 125, -60, -126, 58, -25, 49}, new byte[]{-101, -83, 126, 82, -121, 55, -124, 79})));
                    EditText editText = new EditText(q0Var.getContext());
                    editText.setSingleLine(true);
                    editText.setTextSize(16.0f);
                    editText.setTextColor(-1);
                    editText.setHintTextColor(-8218712);
                    editText.setHint(e0.m.h(new byte[]{57, -94, -116, -72, 14, -95, -5, 48, 57, -121, 124, -42, 97, -55, -108, -111, 57, ByteCompanionObject.MIN_VALUE, -116, -74, 14, -82, -6, 3, 57, -115, -116, -69, 14, -95, -5, 63}, new byte[]{-23, Base64.padSymbol, 92, 6, -34, 25, 42, -79}));
                    editText.setPadding(q0Var.l(18), 0, q0Var.l(18), 0);
                    editText.setBackground(q0Var.G(-15721692, 15, -13547174));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, q0Var.l(54));
                    layoutParams.topMargin = q0Var.l(14);
                    layoutParams.bottomMargin = q0Var.l(12);
                    j10.addView(editText, layoutParams);
                    ListView listView = new ListView(q0Var.getContext());
                    listView.setDivider(null);
                    listView.setDividerHeight(0);
                    listView.setCacheColorHint(0);
                    listView.setBackgroundColor(0);
                    i0 i0Var = new i0(q0Var, arrayList);
                    listView.setAdapter((ListAdapter) i0Var);
                    j10.addView(listView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
                    Button R = q0Var.R(e0.m.h(new byte[]{-87, 75, -114, 42, 112, -37, 82, 75, -87, 104, -113, 24}, new byte[]{121, -43, 95, -88, -96, 103, -126, -2}), false);
                    R.setTextSize(16.0f);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(q0Var.l(170), q0Var.l(50));
                    layoutParams2.gravity = 5;
                    layoutParams2.topMargin = q0Var.l(12);
                    j10.addView(R, layoutParams2);
                    AlertDialog create = new AlertDialog.Builder(q0Var.getContext()).setView(j10).create();
                    listView.setOnItemClickListener(new j3(q0Var, arrayList, i0Var, arrayList2, create, 1));
                    editText.addTextChangedListener(new h0(i0Var, 0));
                    R.setOnClickListener(new r0.d(create, 2));
                    q0Var.N(create, 820);
                    return;
                }
                return;
            case 14:
                WebLauncherActivity webLauncherActivity = (WebLauncherActivity) this.c;
                String str12 = (String) this.d;
                String str13 = (String) this.e;
                WebView webView = webLauncherActivity.e;
                if (webView != null) {
                    StringBuilder sb3 = new StringBuilder();
                    com.google.protobuf.q.u(new byte[]{-76, -114, 3, 3, -20, 39, -94, -83, -83, -90, 3, 3, -15, 63, -27, -90, -122, -111, 8, 9, -9, 118, -86, -75, -86, -119, 9, 8, -12, 126, -29, -84, -126, -119, 9, 21, -20, 57, -24, -121, -75, -126, 3, 19, -85}, new byte[]{-61, -25, 109, 103, -125, 80, -116, -62}, sb3, str12);
                    com.google.protobuf.q.u(new byte[]{-1}, new byte[]{-45, -119, -71, 64, -75, -29, -30, 116}, sb3, str13);
                    sb3.append(e0.m.h(new byte[]{-18, -33}, new byte[]{-57, -28, -90, -46, -18, -43, -66, 10}));
                    webView.evaluateJavascript(sb3.toString(), null);
                    return;
                }
                return;
            case 15:
                final v0 v0Var = (v0) this.c;
                Context context4 = (Context) this.d;
                k1 k1Var = (k1) this.e;
                try {
                    a0.b();
                    l1.f(context4, k1Var, new u0(v0Var));
                    h0.b.o().saveString(e0.m.h(new byte[]{-125, 25, -84, 30, -106, 111, 45, 62, -110, 3, -66, 18, -84, 92, 33, 63, -111, 19, -77}, new byte[]{-11, 118, -33, 117, -55, 3, 76, 80}), k1Var.name());
                    synchronized (a0.class) {
                        try {
                            a0.b();
                            if (a0.d instanceof w0.x) {
                                ((w0.x) a0.d).t();
                            }
                            a0.d = null;
                            a0.g(context4.getApplicationContext());
                        } finally {
                        }
                    }
                    final String string = context4.getString(R.string.vosk_model_installed, context4.getString(k1Var.f6155b));
                    if (v0Var.isAdded()) {
                        v0Var.requireActivity().runOnUiThread(new Runnable() { // from class: w0.r0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        String str14 = string;
                                        v0 v0Var2 = v0Var;
                                        v0Var2.f6252l.setText(str14);
                                        v0Var2.t(true);
                                        return;
                                    default:
                                        String str15 = string;
                                        v0 v0Var3 = v0Var;
                                        v0Var3.f6249i.setText(str15);
                                        v0Var3.f6248h.setEnabled(true);
                                        v0Var3.f6247g.setEnabled(true);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    a0.g(context4);
                    if (e11.getMessage() == null) {
                        message2 = e11.getClass().getSimpleName();
                    } else {
                        message2 = e11.getMessage();
                    }
                    final String string2 = context4.getString(R.string.vosk_model_install_error, message2);
                    if (v0Var.isAdded()) {
                        v0Var.requireActivity().runOnUiThread(new Runnable() { // from class: w0.r0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        String str14 = string2;
                                        v0 v0Var2 = v0Var;
                                        v0Var2.f6252l.setText(str14);
                                        v0Var2.t(true);
                                        return;
                                    default:
                                        String str15 = string2;
                                        v0 v0Var3 = v0Var;
                                        v0Var3.f6249i.setText(str15);
                                        v0Var3.f6248h.setEnabled(true);
                                        v0Var3.f6247g.setEnabled(true);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
            default:
                final v0 v0Var2 = (v0) this.c;
                Context context5 = (Context) this.d;
                z zVar = (z) this.e;
                try {
                    w0.a.e(context5, new u0(v0Var2));
                    a0.h(context5, zVar);
                    if (zVar == z.d) {
                        i10 = R.string.voice_engine_free_active;
                    } else {
                        i10 = R.string.voice_engine_advanced_ready;
                    }
                    final String string3 = context5.getString(i10);
                    if (v0Var2.isAdded()) {
                        v0Var2.requireActivity().runOnUiThread(new Runnable() { // from class: w0.r0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        String str14 = string3;
                                        v0 v0Var22 = v0Var2;
                                        v0Var22.f6252l.setText(str14);
                                        v0Var22.t(true);
                                        return;
                                    default:
                                        String str15 = string3;
                                        v0 v0Var3 = v0Var2;
                                        v0Var3.f6249i.setText(str15);
                                        v0Var3.f6248h.setEnabled(true);
                                        v0Var3.f6247g.setEnabled(true);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    a0.h(context5, z.f6297b);
                    if (e12.getMessage() == null) {
                        message3 = e12.getClass().getSimpleName();
                    } else {
                        message3 = e12.getMessage();
                    }
                    final String string4 = context5.getString(R.string.voice_engine_install_error, message3);
                    if (v0Var2.isAdded()) {
                        v0Var2.requireActivity().runOnUiThread(new Runnable() { // from class: w0.r0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        String str14 = string4;
                                        v0 v0Var22 = v0Var2;
                                        v0Var22.f6252l.setText(str14);
                                        v0Var22.t(true);
                                        return;
                                    default:
                                        String str15 = string4;
                                        v0 v0Var3 = v0Var2;
                                        v0Var3.f6249i.setText(str15);
                                        v0Var3.f6248h.setEnabled(true);
                                        v0Var3.f6247g.setEnabled(true);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ n(MyCarReceiver myCarReceiver, a1.a aVar, String str) {
        this.f306b = 4;
        this.c = myCarReceiver;
        this.e = aVar;
        this.d = str;
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i10) {
        this.f306b = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
