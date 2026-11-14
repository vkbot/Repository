package com.example.navistart.home;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.Observer;
import b1.n;
import b1.r;
import b1.s;
import c7.e;
import com.example.navistart.AllWidgetServices;
import com.example.navistart.SystemMessageReceiver;
import com.example.navistart.W;
import com.example.navistart.cores.HUDMassageObj;
import com.example.navistart.home.WebLauncherActivity;
import com.google.protobuf.q;
import e0.m;
import h0.b;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.ByteCompanionObject;
import n.p;
import n0.g;
import org.json.JSONObject;
import q0.f;
import s0.a;
import s1.k;
import s1.m0;
import s1.o;
import s1.q0;
import s1.v0;
import s1.x0;
import s1.y0;
import v1.c;
import v1.d;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class WebLauncherActivity extends AppCompatActivity implements s {

    /* renamed from: l, reason: collision with root package name */
    public static final String f972l = m.h(new byte[]{-83, ByteCompanionObject.MAX_VALUE, -79, -5, 39, 112, -43, -85, -84, 108, -68, -16, 10, 67, -57, -69, -74, 123, -67, -5, 31, 111}, new byte[]{-62, 15, -44, -107, 120, 28, -76, -34});

    /* renamed from: m, reason: collision with root package name */
    public static final String f973m = m.h(new byte[]{51, -114, -120, 26, 82, 126, 46, -44, 47, ByteCompanionObject.MIN_VALUE, -114, 1, 95, 9, 65, -78, 85}, new byte[]{96, -53, -53, 79, 0, 59, 113, ByteCompanionObject.MIN_VALUE});

    /* renamed from: b, reason: collision with root package name */
    public FrameLayout f974b;
    public FrameLayout c;
    public k d;
    public WebView e;

    /* renamed from: f, reason: collision with root package name */
    public String f975f;

    /* renamed from: g, reason: collision with root package name */
    public String f976g;

    /* renamed from: h, reason: collision with root package name */
    public String f977h;

    /* renamed from: i, reason: collision with root package name */
    public q0 f978i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f979j;

    /* renamed from: k, reason: collision with root package name */
    public Insets f980k = Insets.NONE;

    public final void A(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(m.h(new byte[]{109, -94, -59, -42, 75}, new byte[]{27, -61, -87, -93, 46, 4, 17, 45}), str);
            e(m.h(new byte[]{16, -95, -89, -84, 111, 64, 90}, new byte[]{92, -50, -64, -24, 14, 52, 59, -51}), jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public final void B(a aVar) {
        String name;
        q0 q0Var = this.f978i;
        if (q0Var != null) {
            q0Var.f5599y = aVar;
            q0Var.I(m0.d);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            String h2 = m.h(new byte[]{-80, 1, -105, 78, -110, 59, 75, 32}, new byte[]{-32, 109, -10, 55, -63, 79, 42, 84});
            g gVar = aVar.f5453a;
            String str = "";
            if (gVar == null) {
                name = "";
            } else {
                name = gVar.name();
            }
            jSONObject.put(h2, name);
            jSONObject.put(m.h(new byte[]{-15, -43, 108, 81, 82, -30, 4, -71}, new byte[]{-94, -70, 2, 54, 28, -125, 105, -36}), aVar.f5454b);
            jSONObject.put(m.h(new byte[]{-75, 44, -97, -109, -3, -81, 46, -117, -107, 55}, new byte[]{-26, 67, -15, -12, -68, -35, 90, -30}), aVar.c);
            jSONObject.put(m.h(new byte[]{93, -95, -107, -9, 80, -19, 69, 40, 99}, new byte[]{14, -50, -5, -112, 17, -127, 39, 93}), aVar.d);
            String h10 = m.h(new byte[]{-22, 43, -121, 94, -119, -22, 90, 22, -44, 20, ByteCompanionObject.MIN_VALUE, 90, -68, -13, 74, 6}, new byte[]{-71, 68, -23, 57, -56, -122, 56, 99});
            Bitmap bitmap = aVar.e;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = r.f314s;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 30, byteArrayOutputStream);
                str = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            }
            jSONObject.put(h10, str);
            jSONObject.put(m.h(new byte[]{117, 45, 26, 46, -73}, new byte[]{33, 95, 106, 65, -60, 62, -17, 126}), aVar.f5455f);
            jSONObject.put(m.h(new byte[]{-91, -9, 82, -96, 80}, new byte[]{-15, -123, 54, -43, 34, 13, kotlin.io.encoding.Base64.padSymbol, -14}), aVar.f5456g);
            e(m.h(new byte[]{-61, -44, -118, 36, 50, -86, -127, -76, -63}, new byte[]{-82, -95, -7, 77, 81, -29, -17, -46}), jSONObject.toString());
        } catch (Exception e) {
            Log.w(m.h(new byte[]{25, 102, -59, 26, -48, 49, -86, 104, 38, 102, -43, 23, -46, 48, -83, 125, 39, 119, -34}, new byte[]{78, 3, -89, 86, -79, 68, -60, 11}), m.h(new byte[]{98, 44, 4, -55, 73, ByteCompanionObject.MAX_VALUE, 88, -126, 88, 98, 21, -34, 71, 118, 17, -123, 95, 98, 8, -34, 86, 115, 27, -42, 83, 35, 17, -54}, new byte[]{55, 66, 101, -85, 37, 26, 120, -10}), e);
        }
    }

    public final void C(int i10) {
        String h2 = m.h(new byte[]{50, 79, 98}, new byte[]{64, 63, 15, 41, 65, -33, 30, 81});
        StringBuilder sb = new StringBuilder();
        q.t(new byte[]{102, -96, 100, -34, -83, 15, 42, -23, 39}, new byte[]{29, -126, 18, -65, -63, 122, 79, -53}, sb, i10);
        sb.append(m.h(new byte[]{43}, new byte[]{86, 123, 68, 67, 87, -54, 81, -113}));
        e(h2, sb.toString());
    }

    public final void D(Insets insets) {
        WebView webView = this.e;
        u(insets);
        if (webView == null) {
            return;
        }
        float f8 = getResources().getDisplayMetrics().density;
        webView.evaluateJavascript(m.h(new byte[]{-123, 33, 100, 106, -101, 113, 20, -92, -111, 60, 67, 96, -121, 99, 78, -99, -44, 110, 125, 103, -102, 98, 85, -103, -36, 2, 105, 122, -67, 104, 73, -117, -122, 59, 34}, new byte[]{-14, 72, 10, 14, -12, 6, 58, -18}) + (insets.left / f8) + m.h(new byte[]{-60}, new byte[]{-24, -18, 41, 42, -114, 77, -71, 80}) + (insets.top / f8) + m.h(new byte[]{91}, new byte[]{119, 51, -55, 22, -71, -78, 101, -100}) + (insets.right / f8) + m.h(new byte[]{-56}, new byte[]{-28, 86, 56, 43, 76, 89, 99, -1}) + (insets.bottom / f8) + m.h(new byte[]{24, -67}, new byte[]{49, -122, -92, 122, -117, -9, 101, -4}), null);
    }

    public final void E(int i10) {
        String h2 = m.h(new byte[]{-13, -55, 4, -50, 77}, new byte[]{ByteCompanionObject.MIN_VALUE, -71, 97, -85, 41, -10, -114, 110});
        StringBuilder sb = new StringBuilder();
        q.t(new byte[]{-62, -49, -72, 46, 85, 65, -3, -126, -125}, new byte[]{-71, -19, -50, 79, 57, 52, -104, -96}, sb, i10);
        sb.append(m.h(new byte[]{-65}, new byte[]{-62, -16, kotlin.io.encoding.Base64.padSymbol, 99, -1, 100, -32, -38}));
        e(h2, sb.toString());
    }

    public final void F(int i10, String str) {
        String str2;
        q0 q0Var = this.f978i;
        if (q0Var != null) {
            if (TextUtils.isEmpty(str)) {
                str2 = m.h(new byte[]{99, 41, 109, -17, 29}, new byte[]{-127, -87, -7, 45, -83, ByteCompanionObject.MAX_VALUE, -21, 32});
            } else {
                str2 = str;
            }
            q0Var.w = str2;
            q0Var.f5598x = i10;
            q0Var.I(m0.c);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(m.h(new byte[]{-52, -104, 102, 6}, new byte[]{-72, -3, 11, 118, -59, -29, 92, -19}), str);
            jSONObject.put(m.h(new byte[]{-8, -80, kotlin.io.encoding.Base64.padSymbol, 71}, new byte[]{-111, -45, 82, 41, 15, -25, -69, -81}), i10);
            e(m.h(new byte[]{-110, -11, 43, -2, -16, 68, -45}, new byte[]{-27, -112, 74, -118, -104, 33, -95, -14}), jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public final void G(Class cls, Bundle bundle) {
        if (!isFinishing() && !isDestroyed()) {
            Intent intent = new Intent(this, (Class<?>) W.class);
            intent.putExtra(m.h(new byte[]{17, 103, 20, 86, -15, -90, -24, 85, 40, 71, 32, ByteCompanionObject.MAX_VALUE, -61, -105, -33, 113, 50}, new byte[]{119, 21, 117, 49, -100, -61, -122, 33}), m.h(new byte[]{108, 73, 117, -103, 53, 15, -113, -28, 113, 91, 100, -109, 63, 15}, new byte[]{62, 28, 59, -58, 113, 70, -50, -88}));
            intent.putExtra(m.h(new byte[]{-86, -3, -8, 44, 114, 84, 87, -55, -109, -20, -11, 42, 108, 66}, new byte[]{-52, -113, -103, 75, 31, 49, 57, -67}), cls.getName());
            intent.putExtra(m.h(new byte[]{-75, 14, -28, -79, -33, -43, -94, 116, -116, 29, -9, -79, -63}, new byte[]{-45, 124, -123, -42, -78, -80, -52, 0}), bundle);
            intent.addFlags(134217728);
            startActivity(intent);
        }
    }

    public final void H(String str) {
        String str2;
        v();
        if (s1.s.c.equals(s1.s.a())) {
            str2 = m.h(new byte[]{4, -72, -91, -27, -60, -32, 76, -21, 23, -72, -95, -37, -35, -19, 77, -38, 3, -75, -90, -10}, new byte[]{96, -35, -61, -124, -79, -116, 56, -76});
        } else {
            str2 = this.f977h;
        }
        this.f976g = str2;
        q0 q0Var = this.f978i;
        if (q0Var != null) {
            q0Var.D();
        }
        q0 q0Var2 = new q0(this, new p(9, this));
        this.c.removeAllViews();
        this.c.addView(q0Var2, new FrameLayout.LayoutParams(-1, -1));
        this.f978i = q0Var2;
        u(J());
        x();
        if (str != null) {
            y5.k.x(this, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.navistart.home.WebLauncherActivity.I():void");
    }

    public final Insets J() {
        k kVar = this.d;
        if (kVar != null && kVar.getVisibility() == 0 && !kVar.f5518b.f()) {
            int ordinal = this.d.k().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            Insets insets = this.f980k;
                            return Insets.of(insets.left, insets.top, insets.right, 0);
                        }
                        throw new IncompatibleClassChangeError();
                    }
                    Insets insets2 = this.f980k;
                    return Insets.of(insets2.left, 0, insets2.right, insets2.bottom);
                }
                Insets insets3 = this.f980k;
                return Insets.of(insets3.left, insets3.top, 0, insets3.bottom);
            }
            Insets insets4 = this.f980k;
            return Insets.of(0, insets4.top, insets4.right, insets4.bottom);
        }
        return this.f980k;
    }

    @Override // b1.s
    public final void a() {
        WebView webView = this.e;
        if (webView != null) {
            webView.post(new v0(this, 1));
        }
    }

    @Override // b1.s
    public final void e(String str, String str2) {
        WebView webView = this.e;
        if (webView == null) {
            return;
        }
        String quote = JSONObject.quote(str);
        if (str2 == null || str2.trim().isEmpty()) {
            str2 = m.h(new byte[]{120, 105}, new byte[]{3, 20, ByteCompanionObject.MIN_VALUE, -106, 38, 43, -103, 10});
        }
        webView.post(new n(this, quote, str2, 14));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        String stringExtra;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 7412 && i11 == -1 && intent != null && (stringExtra = intent.getStringExtra(m.h(new byte[]{-49, 87, 28, 5, 35, 119, -44, -126, -29, 84, 25, 12, 37}, new byte[]{-68, 50, 112, 96, 64, 3, -79, -26}))) != null) {
            new Thread(new x0(1, this, stringExtra), m.h(new byte[]{2, 122, -51, -13, 28, 114, -41, 58, 32, 119, -55, -5, 26, 114, -14, 18, 33, 107, -42, -24, 30}, new byte[]{76, 27, -71, -102, 106, 23, ByteCompanionObject.MIN_VALUE, 91})).start();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            new SystemMessageReceiver().onReceive(getApplicationContext(), new Intent(m.h(new byte[]{-20, -17, -20, 22, -124, -74, -48, 89, -28, -17, -4, 1, -123, -85, -102, 22, -18, -11, -31, 11, -123, -15, -10, 56, -62, -43, -41, 39, -92, -110, -28, 59, -56, -43, -51, 32}, new byte[]{-115, -127, -120, 100, -21, -33, -76, 119})));
        } catch (RuntimeException e) {
            Log.e(m.h(new byte[]{30, 29, -116, -6, 41, -111, -43, -73, 33, 29, -100, -9, 43, -112, -46, -94, 32, 12, -105}, new byte[]{73, 120, -18, -74, 72, -28, -69, -44}), m.h(new byte[]{-57, 6, 96, 42, -92, 17, -119, -24, -3, 72, 114, 60, -87, 6, -35, -68, -13, 24, 113, 36, -95, 23, -56, -24, -5, 7, 111, 104, -69, 17, -37, -22, -5, 11, 100, 59}, new byte[]{-110, 104, 1, 72, -56, 116, -87, -100}), e);
        }
        c d = d.a().d();
        final int i10 = 3;
        d.f5923a.observe(this, new Observer(this) { // from class: s1.w0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebLauncherActivity f5636b;

            {
                this.f5636b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i11 = i10;
                WebLauncherActivity webLauncherActivity = this.f5636b;
                switch (i11) {
                    case 0:
                        String str = (String) obj;
                        String str2 = WebLauncherActivity.f972l;
                        if (str != null) {
                            webLauncherActivity.A(str);
                            return;
                        }
                        return;
                    case 1:
                        s0.a aVar = (s0.a) obj;
                        String str3 = WebLauncherActivity.f972l;
                        if (aVar != null) {
                            webLauncherActivity.B(aVar);
                            return;
                        }
                        return;
                    case 2:
                        Location location = (Location) obj;
                        String str4 = WebLauncherActivity.f972l;
                        if (location != null) {
                            webLauncherActivity.z(location);
                            return;
                        }
                        return;
                    case 3:
                        Integer num = (Integer) obj;
                        String str5 = WebLauncherActivity.f972l;
                        if (num != null) {
                            webLauncherActivity.E(num.intValue());
                            return;
                        }
                        return;
                    case 4:
                        Integer num2 = (Integer) obj;
                        String str6 = WebLauncherActivity.f972l;
                        if (num2 != null) {
                            webLauncherActivity.C(num2.intValue());
                            return;
                        }
                        return;
                    case 5:
                        k7.b bVar = (k7.b) obj;
                        String str7 = WebLauncherActivity.f972l;
                        if (bVar != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar.f3426b);
                            webLauncherActivity.F(bVar.d, com.google.protobuf.q.i(new byte[]{-92, 54}, new byte[]{102, -122, 52, 2, -22, -70, -11, 15}, sb));
                            return;
                        }
                        return;
                    default:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        String str8 = WebLauncherActivity.f972l;
                        if (hUDMassageObj != null) {
                            webLauncherActivity.y(hUDMassageObj);
                            return;
                        }
                        return;
                }
            }
        });
        final int i11 = 4;
        d.f5924b.observe(this, new Observer(this) { // from class: s1.w0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebLauncherActivity f5636b;

            {
                this.f5636b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i112 = i11;
                WebLauncherActivity webLauncherActivity = this.f5636b;
                switch (i112) {
                    case 0:
                        String str = (String) obj;
                        String str2 = WebLauncherActivity.f972l;
                        if (str != null) {
                            webLauncherActivity.A(str);
                            return;
                        }
                        return;
                    case 1:
                        s0.a aVar = (s0.a) obj;
                        String str3 = WebLauncherActivity.f972l;
                        if (aVar != null) {
                            webLauncherActivity.B(aVar);
                            return;
                        }
                        return;
                    case 2:
                        Location location = (Location) obj;
                        String str4 = WebLauncherActivity.f972l;
                        if (location != null) {
                            webLauncherActivity.z(location);
                            return;
                        }
                        return;
                    case 3:
                        Integer num = (Integer) obj;
                        String str5 = WebLauncherActivity.f972l;
                        if (num != null) {
                            webLauncherActivity.E(num.intValue());
                            return;
                        }
                        return;
                    case 4:
                        Integer num2 = (Integer) obj;
                        String str6 = WebLauncherActivity.f972l;
                        if (num2 != null) {
                            webLauncherActivity.C(num2.intValue());
                            return;
                        }
                        return;
                    case 5:
                        k7.b bVar = (k7.b) obj;
                        String str7 = WebLauncherActivity.f972l;
                        if (bVar != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar.f3426b);
                            webLauncherActivity.F(bVar.d, com.google.protobuf.q.i(new byte[]{-92, 54}, new byte[]{102, -122, 52, 2, -22, -70, -11, 15}, sb));
                            return;
                        }
                        return;
                    default:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        String str8 = WebLauncherActivity.f972l;
                        if (hUDMassageObj != null) {
                            webLauncherActivity.y(hUDMassageObj);
                            return;
                        }
                        return;
                }
            }
        });
        final int i12 = 5;
        d.c.observe(this, new Observer(this) { // from class: s1.w0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebLauncherActivity f5636b;

            {
                this.f5636b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i112 = i12;
                WebLauncherActivity webLauncherActivity = this.f5636b;
                switch (i112) {
                    case 0:
                        String str = (String) obj;
                        String str2 = WebLauncherActivity.f972l;
                        if (str != null) {
                            webLauncherActivity.A(str);
                            return;
                        }
                        return;
                    case 1:
                        s0.a aVar = (s0.a) obj;
                        String str3 = WebLauncherActivity.f972l;
                        if (aVar != null) {
                            webLauncherActivity.B(aVar);
                            return;
                        }
                        return;
                    case 2:
                        Location location = (Location) obj;
                        String str4 = WebLauncherActivity.f972l;
                        if (location != null) {
                            webLauncherActivity.z(location);
                            return;
                        }
                        return;
                    case 3:
                        Integer num = (Integer) obj;
                        String str5 = WebLauncherActivity.f972l;
                        if (num != null) {
                            webLauncherActivity.E(num.intValue());
                            return;
                        }
                        return;
                    case 4:
                        Integer num2 = (Integer) obj;
                        String str6 = WebLauncherActivity.f972l;
                        if (num2 != null) {
                            webLauncherActivity.C(num2.intValue());
                            return;
                        }
                        return;
                    case 5:
                        k7.b bVar = (k7.b) obj;
                        String str7 = WebLauncherActivity.f972l;
                        if (bVar != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar.f3426b);
                            webLauncherActivity.F(bVar.d, com.google.protobuf.q.i(new byte[]{-92, 54}, new byte[]{102, -122, 52, 2, -22, -70, -11, 15}, sb));
                            return;
                        }
                        return;
                    default:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        String str8 = WebLauncherActivity.f972l;
                        if (hUDMassageObj != null) {
                            webLauncherActivity.y(hUDMassageObj);
                            return;
                        }
                        return;
                }
            }
        });
        final int i13 = 6;
        d.d.observe(this, new Observer(this) { // from class: s1.w0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebLauncherActivity f5636b;

            {
                this.f5636b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i112 = i13;
                WebLauncherActivity webLauncherActivity = this.f5636b;
                switch (i112) {
                    case 0:
                        String str = (String) obj;
                        String str2 = WebLauncherActivity.f972l;
                        if (str != null) {
                            webLauncherActivity.A(str);
                            return;
                        }
                        return;
                    case 1:
                        s0.a aVar = (s0.a) obj;
                        String str3 = WebLauncherActivity.f972l;
                        if (aVar != null) {
                            webLauncherActivity.B(aVar);
                            return;
                        }
                        return;
                    case 2:
                        Location location = (Location) obj;
                        String str4 = WebLauncherActivity.f972l;
                        if (location != null) {
                            webLauncherActivity.z(location);
                            return;
                        }
                        return;
                    case 3:
                        Integer num = (Integer) obj;
                        String str5 = WebLauncherActivity.f972l;
                        if (num != null) {
                            webLauncherActivity.E(num.intValue());
                            return;
                        }
                        return;
                    case 4:
                        Integer num2 = (Integer) obj;
                        String str6 = WebLauncherActivity.f972l;
                        if (num2 != null) {
                            webLauncherActivity.C(num2.intValue());
                            return;
                        }
                        return;
                    case 5:
                        k7.b bVar = (k7.b) obj;
                        String str7 = WebLauncherActivity.f972l;
                        if (bVar != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar.f3426b);
                            webLauncherActivity.F(bVar.d, com.google.protobuf.q.i(new byte[]{-92, 54}, new byte[]{102, -122, 52, 2, -22, -70, -11, 15}, sb));
                            return;
                        }
                        return;
                    default:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        String str8 = WebLauncherActivity.f972l;
                        if (hUDMassageObj != null) {
                            webLauncherActivity.y(hUDMassageObj);
                            return;
                        }
                        return;
                }
            }
        });
        final int i14 = 0;
        d.e.observe(this, new Observer(this) { // from class: s1.w0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebLauncherActivity f5636b;

            {
                this.f5636b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i112 = i14;
                WebLauncherActivity webLauncherActivity = this.f5636b;
                switch (i112) {
                    case 0:
                        String str = (String) obj;
                        String str2 = WebLauncherActivity.f972l;
                        if (str != null) {
                            webLauncherActivity.A(str);
                            return;
                        }
                        return;
                    case 1:
                        s0.a aVar = (s0.a) obj;
                        String str3 = WebLauncherActivity.f972l;
                        if (aVar != null) {
                            webLauncherActivity.B(aVar);
                            return;
                        }
                        return;
                    case 2:
                        Location location = (Location) obj;
                        String str4 = WebLauncherActivity.f972l;
                        if (location != null) {
                            webLauncherActivity.z(location);
                            return;
                        }
                        return;
                    case 3:
                        Integer num = (Integer) obj;
                        String str5 = WebLauncherActivity.f972l;
                        if (num != null) {
                            webLauncherActivity.E(num.intValue());
                            return;
                        }
                        return;
                    case 4:
                        Integer num2 = (Integer) obj;
                        String str6 = WebLauncherActivity.f972l;
                        if (num2 != null) {
                            webLauncherActivity.C(num2.intValue());
                            return;
                        }
                        return;
                    case 5:
                        k7.b bVar = (k7.b) obj;
                        String str7 = WebLauncherActivity.f972l;
                        if (bVar != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar.f3426b);
                            webLauncherActivity.F(bVar.d, com.google.protobuf.q.i(new byte[]{-92, 54}, new byte[]{102, -122, 52, 2, -22, -70, -11, 15}, sb));
                            return;
                        }
                        return;
                    default:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        String str8 = WebLauncherActivity.f972l;
                        if (hUDMassageObj != null) {
                            webLauncherActivity.y(hUDMassageObj);
                            return;
                        }
                        return;
                }
            }
        });
        final int i15 = 1;
        d.f5925f.observe(this, new Observer(this) { // from class: s1.w0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebLauncherActivity f5636b;

            {
                this.f5636b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i112 = i15;
                WebLauncherActivity webLauncherActivity = this.f5636b;
                switch (i112) {
                    case 0:
                        String str = (String) obj;
                        String str2 = WebLauncherActivity.f972l;
                        if (str != null) {
                            webLauncherActivity.A(str);
                            return;
                        }
                        return;
                    case 1:
                        s0.a aVar = (s0.a) obj;
                        String str3 = WebLauncherActivity.f972l;
                        if (aVar != null) {
                            webLauncherActivity.B(aVar);
                            return;
                        }
                        return;
                    case 2:
                        Location location = (Location) obj;
                        String str4 = WebLauncherActivity.f972l;
                        if (location != null) {
                            webLauncherActivity.z(location);
                            return;
                        }
                        return;
                    case 3:
                        Integer num = (Integer) obj;
                        String str5 = WebLauncherActivity.f972l;
                        if (num != null) {
                            webLauncherActivity.E(num.intValue());
                            return;
                        }
                        return;
                    case 4:
                        Integer num2 = (Integer) obj;
                        String str6 = WebLauncherActivity.f972l;
                        if (num2 != null) {
                            webLauncherActivity.C(num2.intValue());
                            return;
                        }
                        return;
                    case 5:
                        k7.b bVar = (k7.b) obj;
                        String str7 = WebLauncherActivity.f972l;
                        if (bVar != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar.f3426b);
                            webLauncherActivity.F(bVar.d, com.google.protobuf.q.i(new byte[]{-92, 54}, new byte[]{102, -122, 52, 2, -22, -70, -11, 15}, sb));
                            return;
                        }
                        return;
                    default:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        String str8 = WebLauncherActivity.f972l;
                        if (hUDMassageObj != null) {
                            webLauncherActivity.y(hUDMassageObj);
                            return;
                        }
                        return;
                }
            }
        });
        final int i16 = 2;
        d.f5926g.observe(this, new Observer(this) { // from class: s1.w0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WebLauncherActivity f5636b;

            {
                this.f5636b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i112 = i16;
                WebLauncherActivity webLauncherActivity = this.f5636b;
                switch (i112) {
                    case 0:
                        String str = (String) obj;
                        String str2 = WebLauncherActivity.f972l;
                        if (str != null) {
                            webLauncherActivity.A(str);
                            return;
                        }
                        return;
                    case 1:
                        s0.a aVar = (s0.a) obj;
                        String str3 = WebLauncherActivity.f972l;
                        if (aVar != null) {
                            webLauncherActivity.B(aVar);
                            return;
                        }
                        return;
                    case 2:
                        Location location = (Location) obj;
                        String str4 = WebLauncherActivity.f972l;
                        if (location != null) {
                            webLauncherActivity.z(location);
                            return;
                        }
                        return;
                    case 3:
                        Integer num = (Integer) obj;
                        String str5 = WebLauncherActivity.f972l;
                        if (num != null) {
                            webLauncherActivity.E(num.intValue());
                            return;
                        }
                        return;
                    case 4:
                        Integer num2 = (Integer) obj;
                        String str6 = WebLauncherActivity.f972l;
                        if (num2 != null) {
                            webLauncherActivity.C(num2.intValue());
                            return;
                        }
                        return;
                    case 5:
                        k7.b bVar = (k7.b) obj;
                        String str7 = WebLauncherActivity.f972l;
                        if (bVar != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar.f3426b);
                            webLauncherActivity.F(bVar.d, com.google.protobuf.q.i(new byte[]{-92, 54}, new byte[]{102, -122, 52, 2, -22, -70, -11, 15}, sb));
                            return;
                        }
                        return;
                    default:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        String str8 = WebLauncherActivity.f972l;
                        if (hUDMassageObj != null) {
                            webLauncherActivity.y(hUDMassageObj);
                            return;
                        }
                        return;
                }
            }
        });
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        FrameLayout frameLayout = new FrameLayout(this);
        this.f974b = frameLayout;
        frameLayout.setBackgroundColor(Color.rgb(8, 12, 18));
        setContentView(this.f974b);
        FrameLayout frameLayout2 = new FrameLayout(this);
        this.c = frameLayout2;
        this.f974b.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        k kVar = new k(this);
        this.d = kVar;
        this.f974b.addView(kVar, new FrameLayout.LayoutParams(-1, -1));
        k kVar2 = this.d;
        v0 v0Var = new v0(this, i14);
        kVar2.f5529p = v0Var;
        kVar2.removeCallbacks(v0Var);
        kVar2.post(v0Var);
        this.d.f5530q = new v0(this, i10);
        getOnBackPressedDispatcher().addCallback(this, new y0(this));
        ViewCompat.setOnApplyWindowInsetsListener(this.f974b, new f(i10, this));
        I();
        ViewCompat.requestApplyInsets(this.f974b);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        q0 q0Var = this.f978i;
        if (q0Var != null) {
            q0Var.D();
        }
        v();
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        I();
        q0 q0Var = this.f978i;
        if (q0Var != null) {
            q0Var.x(true);
        }
        t();
        k kVar = this.d;
        if (kVar != null && kVar.f5522i) {
            kVar.n();
        }
        Intent intent = getIntent();
        if (intent != null) {
            String str = f972l;
            if (intent.getBooleanExtra(str, false)) {
                intent.removeExtra(str);
                k kVar2 = this.d;
                if (kVar2 != null) {
                    kVar2.post(new s1.f(kVar2, 2));
                }
            }
        }
        try {
            b.a();
            b.d().c(new JSONObject().put(m.h(new byte[]{18, 29, 85}, new byte[]{113, 112, 49, -109, -86, 44, -115, -21}), m.h(new byte[]{16, -19, -58, 108, 123, -90, -1, 98, 35, -2, -42, 99, 124, -73}, new byte[]{124, -116, -77, 2, 24, -50, -102, 16})));
        } catch (Exception e) {
            Log.w(m.h(new byte[]{60, 60, 109, -115, -12, -48, -88, 113, 3, 60, 125, ByteCompanionObject.MIN_VALUE, -10, -47, -81, 100, 2, 45, 118}, new byte[]{107, 89, 15, -63, -107, -91, -58, 18}), m.h(new byte[]{-114, 91, -45, -127, -26, -104, -111, -88, -94, 78, -44, -119, -16, -52, -35, -89, -72, 84, -34, -121, -20, -98, -111, -76, -88, 91, -39, -106}, new byte[]{-51, 58, -67, -17, -119, -20, -79, -58}), e);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        q0 q0Var = this.f978i;
        if (q0Var != null) {
            q0Var.x(false);
        }
        if (!isChangingConfigurations()) {
            boolean z9 = true;
            AllWidgetServices.f694h = true;
            AllWidgetServices allWidgetServices = AllWidgetServices.f693g;
            if (allWidgetServices == null) {
                AllWidgetServices.c(this);
            } else {
                allWidgetServices.f696b.post(new e(allWidgetServices, z9, 3));
            }
        }
        super.onStop();
    }

    @Override // b1.s
    public final void p(String str, String str2, String str3) {
        b.a().j().lo(str, str2, str3);
    }

    public final void s() {
        k kVar;
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.c != null && (kVar = this.d) != null) {
            int i14 = 0;
            if (kVar.getVisibility() == 0 && !kVar.f5518b.f()) {
                k kVar2 = this.d;
                o k6 = kVar2.k();
                if (k6 != o.d && k6 != o.e) {
                    i10 = kVar2.e.getMeasuredWidth();
                } else {
                    i10 = kVar2.d.getMeasuredHeight();
                }
            } else {
                i10 = 0;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
            if (i10 > 0) {
                int ordinal = this.d.k().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                i13 = i10 + this.f980k.bottom;
                                i11 = 0;
                                i12 = 0;
                            }
                        } else {
                            i11 = i10 + this.f980k.top;
                            i12 = 0;
                            i13 = i12;
                        }
                    } else {
                        i12 = i10 + this.f980k.right;
                        i11 = 0;
                        i13 = 0;
                    }
                } else {
                    i12 = 0;
                    i13 = 0;
                    i14 = i10 + this.f980k.left;
                    i11 = 0;
                }
                if (layoutParams.leftMargin != i14 && layoutParams.topMargin == i11 && layoutParams.rightMargin == i12 && layoutParams.bottomMargin == i13) {
                    D(J());
                    return;
                }
                layoutParams.setMargins(i14, i11, i12, i13);
                this.c.setLayoutParams(layoutParams);
                D(J());
            }
            i11 = 0;
            i12 = 0;
            i13 = i12;
            if (layoutParams.leftMargin != i14) {
            }
            layoutParams.setMargins(i14, i11, i12, i13);
            this.c.setLayoutParams(layoutParams);
            D(J());
        }
    }

    public final void t() {
        int i10;
        boolean z9 = new s1.r(this).f5608a.getBoolean(s1.r.f5605i, true);
        AllWidgetServices.f694h = z9;
        AllWidgetServices allWidgetServices = AllWidgetServices.f693g;
        if (allWidgetServices == null) {
            AllWidgetServices.c(this);
        } else {
            allWidgetServices.f696b.post(new e(allWidgetServices, z9, 3));
        }
        k kVar = this.d;
        if (kVar != null) {
            if (!z9 && !this.f979j) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            kVar.setVisibility(i10);
        }
        s();
    }

    public final void u(Insets insets) {
        q0 q0Var = this.f978i;
        if (q0Var != null) {
            q0Var.setPadding(w(24) + insets.left, w(20) + insets.top, w(24) + insets.right, w(24) + insets.bottom);
        }
    }

    public final void v() {
        WebView webView = this.e;
        this.e = null;
        this.f975f = null;
        if (webView != null) {
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                frameLayout.removeView(webView);
            }
            webView.stopLoading();
            webView.setWebViewClient(null);
            webView.loadUrl(m.h(new byte[]{112, 104, -116, -126, 34, -57, -114, 106, 112, 100, -120}, new byte[]{17, 10, -29, -9, 86, -3, -20, 6}));
            webView.clearHistory();
            webView.removeAllViews();
            webView.destroy();
        }
    }

    public final int w(int i10) {
        return Math.round(i10 * getResources().getDisplayMetrics().density);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x() {
        c d = d.a().d();
        Integer num = (Integer) d.f5923a.getValue();
        Integer num2 = (Integer) d.f5924b.getValue();
        k7.b bVar = (k7.b) d.c.getValue();
        HUDMassageObj hUDMassageObj = (HUDMassageObj) d.d.getValue();
        String str = (String) d.e.getValue();
        a aVar = (a) d.f5925f.getValue();
        Location location = (Location) d.f5926g.getValue();
        if (num != null) {
            E(num.intValue());
        }
        if (num2 != null) {
            C(num2.intValue());
        }
        if (bVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(bVar.f3426b);
            F(bVar.d, q.i(new byte[]{29, ByteCompanionObject.MIN_VALUE}, new byte[]{-33, 48, -23, -16, 118, 12, 73, 23}, sb));
        }
        if (hUDMassageObj != null) {
            y(hUDMassageObj);
        }
        if (str != null) {
            A(str);
        }
        if (aVar != null) {
            B(aVar);
        }
        if (location != null) {
            z(location);
        }
    }

    public final void y(HUDMassageObj hUDMassageObj) {
        String name;
        try {
            JSONObject jSONObject = new JSONObject();
            String h2 = m.h(new byte[]{-125, -92, -83, -34, 16, -47, 46, -82, -103, -123, -80, -3, 16}, new byte[]{-21, -47, -55, -115, 117, -65, 74, -53});
            HUDMassageObj.HudSenderType hudSenderType = hUDMassageObj.hudSenderType;
            if (hudSenderType == null) {
                name = "";
            } else {
                name = hudSenderType.name();
            }
            jSONObject.put(h2, name);
            jSONObject.put(m.h(new byte[]{-105, 95, 121, -70, 28, 82, -126, 53}, new byte[]{-10, 45, 24, -34, 125, 32, -51, 91}), hUDMassageObj.AradarOn);
            jSONObject.put(m.h(new byte[]{123, -27, -13, 30, 85, -70}, new byte[]{21, -124, -123, 119, 26, -44, -9, 0}), hUDMassageObj.NaviOn);
            jSONObject.put(m.h(new byte[]{86, -97, -127, 121, 8, 11, -85, -30}, new byte[]{34, -22, -13, 23, 92, 114, -37, -121}), hUDMassageObj.v_mTurnType);
            jSONObject.put(m.h(new byte[]{99, -33, 123, 64, -21, -72, ByteCompanionObject.MIN_VALUE, -23}, new byte[]{23, -86, 9, 46, -81, -47, -13, -99}), hUDMassageObj.v_mTurnDis);
            jSONObject.put(m.h(new byte[]{-19, -109, 100, -54, 72, -89, -31, 11, -20, -126}, new byte[]{-97, -10, 9, -85, 33, -55, -91, 98}), hUDMassageObj.v_mRemainDis);
            jSONObject.put(m.h(new byte[]{58, -75, -113, -2, 94, -37, -22, 54}, new byte[]{84, -48, -9, -118, 12, -76, -117, 82}), hUDMassageObj.v_mNextRoad);
            jSONObject.put(m.h(new byte[]{32, 52, 44, 0, 4, -44, 52, 79, 58, 48}, new byte[]{83, 68, 73, 101, 96, -104, 93, 34}), hUDMassageObj.getSpeedlimit());
            e(m.h(new byte[]{-65, -35, -39}, new byte[]{-41, -88, -67, -35, 39, -72, -7, -45}), jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public final void z(Location location) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(m.h(new byte[]{-112, -90, -69}, new byte[]{-4, -57, -49, -23, -55, -11, -78, kotlin.io.encoding.Base64.padSymbol}), location.getLatitude());
            jSONObject.put(m.h(new byte[]{-60, 88, 73}, new byte[]{-88, 55, 39, 39, 8, -121, 33, 111}), location.getLongitude());
            jSONObject.put(m.h(new byte[]{22, -71, -106, -102, -106}, new byte[]{101, -55, -13, -1, -14, -39, -12, 105}), location.getSpeed());
            jSONObject.put(m.h(new byte[]{-118, -66, 84, 88, -123, 42, -76}, new byte[]{-30, -37, 53, 60, -20, 68, -45, 15}), location.getBearing());
            e(m.h(new byte[]{-6, 10, -94}, new byte[]{-99, 122, -47, -83, 112, 90, -51, 65}), jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    @Override // androidx.core.app.ComponentActivity, b1.s
    public final void b() {
    }

    @Override // b1.s
    public final void c() {
    }
}
