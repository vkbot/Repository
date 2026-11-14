package b1;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.example.navistart.cores.HUDMassageObj;
import e0.p3;
import e0.w;
import e0.x1;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class r implements s, e {

    /* renamed from: s, reason: collision with root package name */
    public static final ScheduledThreadPoolExecutor f314s;
    public WebView c;
    public h d;
    public final Context e;

    /* renamed from: g, reason: collision with root package name */
    public f f317g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f318h;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f320j;

    /* renamed from: k, reason: collision with root package name */
    public long f321k;

    /* renamed from: l, reason: collision with root package name */
    public long f322l;

    /* renamed from: m, reason: collision with root package name */
    public long f323m;

    /* renamed from: n, reason: collision with root package name */
    public long f324n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f325o;

    /* renamed from: p, reason: collision with root package name */
    public long f326p;
    public boolean r;

    /* renamed from: b, reason: collision with root package name */
    public boolean f315b = false;

    /* renamed from: f, reason: collision with root package name */
    public String f316f = "";

    /* renamed from: i, reason: collision with root package name */
    public final Object f319i = new Object();

    /* renamed from: q, reason: collision with root package name */
    public int f327q = Integer.MIN_VALUE;

    static {
        e0.m.h(new byte[]{77, 54, -97, -96, -82, -107, 43, 4, 81, 56, -103, -69, -93, -30, 68, 98, 43}, new byte[]{30, 115, -36, -11, -4, -48, 116, 80});
        f314s = w.c(1, e0.m.h(new byte[]{-18, -94, 113, -7, -56, 78, 76, 83, -51, -111, 122, -53, -42}, new byte[]{-71, -57, 19, -82, -95, 42, 43, 54}));
    }

    public r(Context context, WebView webView, t tVar) {
        this.e = context;
        String str = tVar.f329b;
        String str2 = tVar.c;
        this.c = webView;
        webView.setBackgroundColor(0);
        this.c.setLayerType(2, null);
        WebSettings settings = this.c.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setBlockNetworkLoads(false);
        settings.setBlockNetworkImage(false);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        this.c.setWebChromeClient(new WebChromeClient());
        this.c.setWebViewClient(new WebViewClient());
        WebView webView2 = this.c;
        String h2 = e0.m.h(new byte[]{66, -97, Base64.padSymbol, -75, -58, -80, 26, -10, 94, -111, 59, -82, -53, -57, 117, -112, 36}, new byte[]{17, -38, 126, -32, -108, -11, 69, -94});
        h0.b.a();
        webView2.addJavascriptInterface(new l(h2, h0.b.f(), this), e0.m.h(new byte[]{-114, -117, -8, -120, 54, -36, 123, -7, -97, -116}, new byte[]{-17, -27, -100, -6, 89, -75, 31, -72}));
        File file = new File(context.getFilesDir(), tVar.f328a);
        h0.b.a();
        String loadString = h0.b.o().loadString(str, str2);
        File file2 = new File(file, loadString);
        if (!new File(file2, e0.m.h(new byte[]{-36, -106, -107, 59, -75, 122, 126, -69, -40, -108}, new byte[]{-75, -8, -15, 94, -51, 84, 22, -49})).isFile()) {
            file2 = new File(file, str2);
        } else {
            str2 = loadString;
        }
        if (!new File(file2, e0.m.h(new byte[]{-14, -7, -45, -65, -100, -8, 77, -93, -10, -5}, new byte[]{-101, -105, -73, -38, -28, -42, 37, -41})).isFile() && (e0.m.h(new byte[]{56, -51, -62, -111, -65, 18, -57, -68, 43, -51, -58, -81, -88, 18, -46, ByteCompanionObject.MIN_VALUE, 55}, new byte[]{92, -88, -92, -16, -54, 126, -77, -29}).equals(str2) || e0.m.h(new byte[]{-104, -53, 23, 102, -111, 54, 38, -107, -108, -37, 21}, new byte[]{-4, -82, 113, 7, -28, 90, 82, -54}).equals(str2))) {
            try {
                new m(context, str2 + e0.m.h(new byte[]{-4, -67, 8, 29}, new byte[]{-46, -57, 97, 109, 83, -26, 51, -110}), file, str2).g();
            } catch (IOException e) {
                Log.e(e0.m.h(new byte[]{116, -92, 30, -60, 29, 53, -70, -60, 87, -105, 21, -10, 3}, new byte[]{35, -63, 124, -109, 116, 81, -35, -95}), e0.m.h(new byte[]{75, -38, 99, 42, 14, ByteCompanionObject.MAX_VALUE, 9, -7, 122, -34, 125, 37, 19, 110, 9}, new byte[]{8, -69, 13, 68, 97, 11, 41, -119}) + file2, e);
            }
        }
        String str3 = e0.m.h(new byte[]{-32, 118, -3, 28, 86, -34, -4}, new byte[]{-122, 31, -111, 121, 108, -15, -45, Base64.padSymbol}) + new File(file2, e0.m.h(new byte[]{104, -18, 84, -95, 41, -72, 116, 8, 108, -20}, new byte[]{1, ByteCompanionObject.MIN_VALUE, 48, -60, 81, -106, 28, 124})).getAbsolutePath();
        new File(str3).exists();
        this.c.loadUrl(str3);
    }

    public static void d(final r rVar) {
        byte[] bArr;
        long j10;
        long j11;
        long j12;
        long j13;
        String h2;
        StringBuilder sb;
        synchronized (rVar.f319i) {
            boolean z9 = false;
            if (rVar.f318h && (bArr = rVar.f320j) != null) {
                long j14 = rVar.f321k;
                long j15 = rVar.f324n;
                rVar.f320j = null;
                rVar.f321k = 0L;
                rVar.f322l = j14;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                final long j16 = rVar.f326p + 1;
                rVar.f326p = j16;
                if (j16 % 10 == 0) {
                    z9 = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    String h10 = e0.m.h(new byte[]{96, -58, 84, 79, 80}, new byte[]{9, -85, 53, 40, 53, -123, -70, -112});
                    StringBuilder sb2 = new StringBuilder();
                    final boolean z10 = z9;
                    sb2.append(e0.m.h(new byte[]{48, -22, 92, -68, -70, -108, 120, 36, 51, -18, 7, -73, -16, -104, 114, 126, 54, -22, 91, -72, -74, -55, 57}, new byte[]{84, -117, 40, -35, ByteCompanionObject.MIN_VALUE, -3, 21, 69}));
                    sb2.append(android.util.Base64.encodeToString(bArr, 2));
                    jSONObject.put(h10, sb2.toString());
                    jSONObject.put(e0.m.h(new byte[]{77, -94, 56, 65, 19, -40, 112, 126, 73}, new byte[]{57, -53, 85, 36, 96, -84, 17, 19}), j14);
                    final String str = e0.m.h(new byte[]{-62, -68, -16, -116, -63, 107, -85, -114, -37, -108, -16, -116, -36, 115, -20, -123, -16, -93, -5, -122, -38, 60, -93, -57, -107, -94, -9, -122, -54, 115, -14, -49, -38, -69, -33, -122, -54, 110, -22, -120, -47, -112, -24, -115, -64, 104, -83, -58, -40, -68, -16, -127, -29, 125, -11, -89, -57, -76, -13, -115, -119, 48, -91}, new byte[]{-75, -43, -98, -24, -82, 28, -123, -31}) + jSONObject + e0.m.h(new byte[]{63, 46}, new byte[]{22, 21, 68, 102, 7, -47, 107, -77});
                    if (z10) {
                        try {
                            h2 = e0.m.h(new byte[]{126, 35, -114, 8, -101, 109, 67, 122, 86, 56, -122}, new byte[]{51, 74, -32, 97, -42, 12, 51, 42});
                            sb = new StringBuilder();
                            sb.append(e0.m.h(new byte[]{-84, 104, -27, -55, -65, 19, 57, -8, -81, 116, -25, -53, -66, 75}, new byte[]{-55, 6, -122, -90, -37, 118, 93, -40}));
                            sb.append(j16);
                            sb.append(e0.m.h(new byte[]{-66, 64, 113, -62, 88, -51, 120}, new byte[]{-98, 33, 22, -89, 21, -66, 69, -51}));
                            j12 = j14;
                            j13 = j15;
                        } catch (JSONException unused) {
                            j12 = j14;
                            j13 = j15;
                        }
                        try {
                            sb.append(Math.max(0L, SystemClock.elapsedRealtime() - j12));
                            sb.append(e0.m.h(new byte[]{-90, 111, -42, 97, 83, -3, -45, 96, -11, 55}, new byte[]{-122, 10, -72, 2, 60, -103, -74, 45}));
                            sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                            sb.append(e0.m.h(new byte[]{49, -125, -73, 64, 57, 125, -117}, new byte[]{17, -31, -50, 52, 92, 14, -74, 89}));
                            sb.append(bArr.length);
                            Log.i(h2, sb.toString());
                        } catch (JSONException unused2) {
                            j11 = j13;
                            j10 = j12;
                            rVar.g(j10, j11, false);
                            return;
                        }
                    } else {
                        j12 = j14;
                        j13 = j15;
                    }
                    final WebView webView = rVar.c;
                    if (f().booleanValue() && rVar.f315b && webView != null) {
                        final long j17 = j13;
                        final long j18 = j12;
                        if (!webView.post(new Runnable() { // from class: b1.p
                            @Override // java.lang.Runnable
                            public final void run() {
                                r rVar2;
                                long j19;
                                long j20;
                                ValueCallback<String> valueCallback;
                                final r rVar3 = r.this;
                                final long j21 = j17;
                                final long j22 = j18;
                                WebView webView2 = webView;
                                String str2 = str;
                                final boolean z11 = z10;
                                final long j23 = j16;
                                synchronized (rVar3.f319i) {
                                    if (rVar3.f318h && j21 == rVar3.f324n && j22 > rVar3.f323m) {
                                        if (rVar3.c == webView2 && rVar3.f315b) {
                                            try {
                                                valueCallback = new ValueCallback() { // from class: b1.q
                                                    @Override // android.webkit.ValueCallback
                                                    public final void onReceiveValue(Object obj) {
                                                        boolean z12 = z11;
                                                        long j24 = j22;
                                                        if (z12) {
                                                            Log.i(e0.m.h(new byte[]{ByteCompanionObject.MIN_VALUE, -91, -7, 110, 72, 91, -127, 59, -88, -66, -15}, new byte[]{-51, -52, -105, 7, 5, 58, -15, 107}), e0.m.h(new byte[]{60, -103, 35, -49, -93, -82, -38, -28, 41, -99, 34, -124, -32, -87, -60, -23, 38, -103, 124}, new byte[]{75, -4, 65, -17, -64, -49, -74, -120}) + j23 + e0.m.h(new byte[]{102, 71, 66, 48, -69, ByteCompanionObject.MAX_VALUE, 81}, new byte[]{70, 38, 37, 85, -10, 12, 108, 71}) + Math.max(0L, SystemClock.elapsedRealtime() - j24));
                                                        }
                                                        r.this.g(j24, j21, true);
                                                    }
                                                };
                                                rVar2 = rVar3;
                                                j19 = j22;
                                                j20 = j21;
                                            } catch (RuntimeException unused3) {
                                                rVar2 = rVar3;
                                                j19 = j22;
                                                j20 = j21;
                                            }
                                            try {
                                                webView2.evaluateJavascript(str2, valueCallback);
                                                return;
                                            } catch (RuntimeException unused4) {
                                                rVar2.g(j19, j20, false);
                                                return;
                                            }
                                        }
                                        rVar3.g(j22, j21, false);
                                        return;
                                    }
                                    rVar3.g(j22, j21, false);
                                }
                            }
                        })) {
                            rVar.g(j18, j17, false);
                            return;
                        }
                        return;
                    }
                    rVar.g(j12, j13, false);
                    return;
                } catch (JSONException unused3) {
                    j10 = j14;
                    j11 = j15;
                }
            }
            rVar.f325o = false;
            rVar.f322l = 0L;
        }
    }

    public static Boolean f() {
        StringBuilder sb = new StringBuilder();
        u0.a o5 = h0.b.o();
        byte[] bArr = e0.m.f1973j;
        String[] strArr = p3.f2001a;
        com.google.protobuf.q.s(bArr, o5, "", sb);
        com.google.protobuf.q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        String g10 = com.google.protobuf.q.g(sb, x1.f2066q);
        u0.a o9 = h0.b.o();
        byte[] bArr2 = e0.m.f1969f;
        if (com.google.protobuf.q.w(bArr2, o9, "", g10)) {
            boolean z9 = true;
            if (com.google.protobuf.q.d(Long.MAX_VALUE, h0.b.a().j()) >= Long.parseLong(new String(com.google.protobuf.q.x(new byte[]{87}, new byte[]{103, 69, -18, -39, 7, 112, -49, -1}, h0.b.o(), com.google.protobuf.q.h(e0.m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            return Boolean.valueOf(z9);
        }
        return Boolean.FALSE;
    }

    @Override // b1.s
    public final void a() {
        this.f315b = true;
        e(e0.m.h(new byte[]{97, -3, 13, 40, -103}, new byte[]{21, -107, 104, 69, -4, 102, -124, -92}), e0.m.h(new byte[]{46, 50, 106, -101, 18, 30, -21, 17, 111, 50, 106}, new byte[]{85, 18, 72, -10, 125, 122, -114, 51}) + this.f316f + e0.m.h(new byte[]{96, -97, 47}, new byte[]{66, -65, 82, -25, -24, 101, -85, 68}));
    }

    @Override // b1.s
    public final void b() {
        h hVar = this.d;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override // b1.s
    public final void c() {
        h hVar = this.d;
        if (hVar != null) {
            hVar.c();
        }
    }

    @Override // b1.s
    public final void e(String str, String str2) {
        if (f().booleanValue()) {
            f314s.execute(new n(this, str, str2, 0));
        }
    }

    public final void g(long j10, long j11, boolean z9) {
        boolean z10;
        synchronized (this.f319i) {
            try {
                if (j11 != this.f324n) {
                    return;
                }
                if (z9 && j10 > this.f323m) {
                    this.f323m = j10;
                }
                this.f322l = 0L;
                if (this.f318h && this.f320j != null) {
                    z10 = true;
                } else {
                    z10 = false;
                    this.f325o = false;
                }
                if (z10) {
                    f314s.execute(new o(this, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(HUDMassageObj hUDMassageObj) {
        if (hUDMassageObj == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(e0.m.h(new byte[]{76, 27, 109, 76, 12, -62, 0, -37, 83, 92, 119, 109, 17, -31, 0, -105, 13, 27}, new byte[]{55, 57, 5, 57, 104, -111, 101, -75}));
        sb.append(hUDMassageObj.hudSenderType.name());
        sb.append(e0.m.h(new byte[]{-51, -95, -89, -52, -49, 20, 79, 43, -99, -62, -21, -113, -121}, new byte[]{-17, -115, -123, -83, -67, 117, 43, 74}));
        sb.append(hUDMassageObj.AradarOn);
        sb.append(e0.m.h(new byte[]{83, -98, 112, -21, -3, -59, -90, -8, 93, -122}, new byte[]{ByteCompanionObject.MAX_VALUE, -68, 30, -118, -117, -84, -23, -106}));
        sb.append(hUDMassageObj.NaviOn);
        sb.append(e0.m.h(new byte[]{-50, 35, 2, -98, -127, -97, 60, -113, -110, 100, 84, -47}, new byte[]{-30, 1, 118, -21, -13, -15, 104, -10}));
        sb.append(hUDMassageObj.v_mTurnType);
        sb.append(e0.m.h(new byte[]{8, 33, 120, -24, -32, 4, -103, -45, 87, 119, 46, -89}, new byte[]{36, 3, 12, -99, -110, 106, -35, -70}));
        sb.append(hUDMassageObj.v_mTurnDis);
        sb.append(e0.m.h(new byte[]{26, 6, 76, 119, 125, -85, 66, 75, 114, 77, 77, 102, 50, -16}, new byte[]{54, 36, 62, 18, 16, -54, 43, 37}));
        sb.append(hUDMassageObj.v_mRemainDis);
        sb.append(e0.m.h(new byte[]{-13, 93, 42, 11, 35, -4, 40, 101, -66, 27, 102, 84, 121}, new byte[]{-33, ByteCompanionObject.MAX_VALUE, 68, 110, 91, -120, 122, 10}));
        sb.append(hUDMassageObj.v_mNextRoad);
        sb.append(e0.m.h(new byte[]{-13, 117, -54, 86, -48, -52, 64, -1, -99, 48, -123, 76, -44, -117, 31}, new byte[]{-47, 89, -24, 37, -96, -87, 37, -101}));
        sb.append(hUDMassageObj.getSpeedlimit());
        e(e0.m.h(new byte[]{69, 17, 91}, new byte[]{45, 100, 63, 114, -54, 81, 29, 86}), com.google.protobuf.q.i(new byte[]{-39}, new byte[]{-92, 76, 96, 11, -57, -31, -101, -52}, sb));
    }

    public final void i(Location location) {
        StringBuilder sb = new StringBuilder();
        sb.append(e0.m.h(new byte[]{-10, -96, 59, -13, 29, -44, 99}, new byte[]{-115, -126, 87, -110, 105, -10, 89, 108}));
        sb.append(location.getLatitude());
        sb.append(e0.m.h(new byte[]{12, -55, 47, 59, 84, 46, -111}, new byte[]{32, -21, 67, 84, 58, 12, -85, 27}));
        sb.append(location.getLongitude());
        sb.append(e0.m.h(new byte[]{16, -110, -96, -109, -102, 51, 123, -117, 6}, new byte[]{60, -80, -45, -29, -1, 86, 31, -87}));
        sb.append(location.getSpeed());
        sb.append(e0.m.h(new byte[]{103, 2, 80, -126, 32, 104, 29, ByteCompanionObject.MIN_VALUE, 44, 2, 2}, new byte[]{75, 32, 56, -25, 65, 12, 116, -18}));
        sb.append(location.getBearing());
        e(e0.m.h(new byte[]{-58, -31, 112}, new byte[]{-95, -111, 3, 35, -109, -27, -101, -32}), com.google.protobuf.q.i(new byte[]{-9}, new byte[]{-118, 81, 44, 107, -15, -71, 19, -52}, sb));
    }

    @Override // b1.s
    public final void j(boolean z9) {
        if (z9 != this.f318h) {
            this.f318h = z9;
            synchronized (this.f319i) {
                this.f324n++;
                this.f320j = null;
                this.f321k = 0L;
                this.f322l = 0L;
                this.f323m = 0L;
                this.f325o = false;
            }
            final f fVar = this.f317g;
            if (z9) {
                if (fVar == null) {
                    this.f317g = f.b(this.e);
                }
                final f fVar2 = this.f317g;
                final int i10 = 1;
                fVar2.f274b.post(new Runnable() { // from class: b1.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                f fVar3 = fVar2;
                                fVar3.e.remove(this);
                                if (fVar3.e.isEmpty()) {
                                    fVar3.f274b.removeCallbacks(fVar3.f284o);
                                    fVar3.f274b.removeCallbacks(fVar3.f285p);
                                    fVar3.c();
                                    if (fVar3.f283n) {
                                        try {
                                            fVar3.f273a.unregisterReceiver(fVar3.f286q);
                                        } catch (IllegalArgumentException unused) {
                                        }
                                        fVar3.f283n = false;
                                    }
                                    fVar3.f277h = null;
                                    fVar3.f278i = 0L;
                                    return;
                                }
                                return;
                            default:
                                f fVar4 = fVar2;
                                r rVar = this;
                                boolean isEmpty = fVar4.e.isEmpty();
                                if (fVar4.e.size() != 1 || !fVar4.e.contains(rVar)) {
                                    int size = fVar4.e.size();
                                    fVar4.e.clear();
                                    fVar4.e.add(rVar);
                                    if (size > 0) {
                                        Log.i(f.f269s, e0.m.h(new byte[]{34, 83, -64, -127, -68, -71, 59, 59, 80, 69, -60, -116, -79, -65, 126, 50, 25, 88, -39, -64, -80, -69, 46, ByteCompanionObject.MAX_VALUE, 28, 95, -61, -103, -72, -76, 59, 45, 3, 11}, new byte[]{112, 54, -80, -19, -35, -38, 94, 95}) + size);
                                    }
                                    byte[] bArr = fVar4.f277h;
                                    if (bArr != null) {
                                        try {
                                            rVar.k(bArr, fVar4.f278i);
                                        } catch (RuntimeException e) {
                                            Log.w(f.f269s, e0.m.h(new byte[]{26, 119, -127, 8, -116, 80, -94, 88, 119, 114, -122, 18, -43, 88, -83, 77, 37, 62, -99, 4, -53, 88, -96, 92, 50, 122, -49, 2, -64, 94, -85, 77, 51, 62, -119, 19, -64, 80, -90}, new byte[]{87, 30, -17, 97, -95, Base64.padSymbol, -61, 40}), e);
                                        }
                                    }
                                    if (isEmpty) {
                                        c cVar = fVar4.f286q;
                                        if (!fVar4.f283n) {
                                            IntentFilter intentFilter = new IntentFilter(f.w);
                                            int i11 = Build.VERSION.SDK_INT;
                                            Context context = fVar4.f273a;
                                            if (i11 >= 33) {
                                                context.registerReceiver(cVar, intentFilter, 2);
                                            } else {
                                                context.registerReceiver(cVar, intentFilter);
                                            }
                                            fVar4.f283n = true;
                                        }
                                    }
                                    fVar4.d();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            }
            if (fVar != null) {
                final int i11 = 0;
                fVar.f274b.post(new Runnable() { // from class: b1.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                f fVar3 = fVar;
                                fVar3.e.remove(this);
                                if (fVar3.e.isEmpty()) {
                                    fVar3.f274b.removeCallbacks(fVar3.f284o);
                                    fVar3.f274b.removeCallbacks(fVar3.f285p);
                                    fVar3.c();
                                    if (fVar3.f283n) {
                                        try {
                                            fVar3.f273a.unregisterReceiver(fVar3.f286q);
                                        } catch (IllegalArgumentException unused) {
                                        }
                                        fVar3.f283n = false;
                                    }
                                    fVar3.f277h = null;
                                    fVar3.f278i = 0L;
                                    return;
                                }
                                return;
                            default:
                                f fVar4 = fVar;
                                r rVar = this;
                                boolean isEmpty = fVar4.e.isEmpty();
                                if (fVar4.e.size() != 1 || !fVar4.e.contains(rVar)) {
                                    int size = fVar4.e.size();
                                    fVar4.e.clear();
                                    fVar4.e.add(rVar);
                                    if (size > 0) {
                                        Log.i(f.f269s, e0.m.h(new byte[]{34, 83, -64, -127, -68, -71, 59, 59, 80, 69, -60, -116, -79, -65, 126, 50, 25, 88, -39, -64, -80, -69, 46, ByteCompanionObject.MAX_VALUE, 28, 95, -61, -103, -72, -76, 59, 45, 3, 11}, new byte[]{112, 54, -80, -19, -35, -38, 94, 95}) + size);
                                    }
                                    byte[] bArr = fVar4.f277h;
                                    if (bArr != null) {
                                        try {
                                            rVar.k(bArr, fVar4.f278i);
                                        } catch (RuntimeException e) {
                                            Log.w(f.f269s, e0.m.h(new byte[]{26, 119, -127, 8, -116, 80, -94, 88, 119, 114, -122, 18, -43, 88, -83, 77, 37, 62, -99, 4, -53, 88, -96, 92, 50, 122, -49, 2, -64, 94, -85, 77, 51, 62, -119, 19, -64, 80, -90}, new byte[]{87, 30, -17, 97, -95, Base64.padSymbol, -61, 40}), e);
                                        }
                                    }
                                    if (isEmpty) {
                                        c cVar = fVar4.f286q;
                                        if (!fVar4.f283n) {
                                            IntentFilter intentFilter = new IntentFilter(f.w);
                                            int i112 = Build.VERSION.SDK_INT;
                                            Context context = fVar4.f273a;
                                            if (i112 >= 33) {
                                                context.registerReceiver(cVar, intentFilter, 2);
                                            } else {
                                                context.registerReceiver(cVar, intentFilter);
                                            }
                                            fVar4.f283n = true;
                                        }
                                    }
                                    fVar4.d();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        }
    }

    public final void k(byte[] bArr, long j10) {
        boolean z9;
        if (this.f318h && bArr != null && bArr.length != 0) {
            synchronized (this.f319i) {
                try {
                    if (j10 <= Math.max(this.f323m, Math.max(this.f322l, this.f321k))) {
                        return;
                    }
                    this.f320j = bArr;
                    this.f321k = j10;
                    if (!this.f325o) {
                        z9 = true;
                        this.f325o = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        f314s.execute(new o(this, 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // b1.s
    public final void n(String str) {
        if (this.f317g == null) {
            this.f317g = f.b(this.e);
        }
        f fVar = this.f317g;
        fVar.getClass();
        int i10 = 1;
        if (!e0.m.h(new byte[]{-94, 21, -31, 56, -99}, new byte[]{-52, 124, -122, 80, -23, 39, -109, -13}).equalsIgnoreCase(str)) {
            i10 = 0;
        }
        fVar.f274b.post(new a4.c(fVar, i10, 2));
    }

    @Override // b1.s
    public final void p(String str, String str2, String str3) {
        h0.b.a().j().lo(str, str2, str3);
    }
}
