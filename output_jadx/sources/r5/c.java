package r5;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.content.ContextCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import b1.m;
import b7.n;
import com.bumptech.glide.manager.o;
import com.example.navistart.ModernMainActivity;
import com.example.navistart.R;
import com.example.navistart.TService;
import com.example.navistart.VJCT;
import com.example.navistart.punto;
import com.google.android.material.appbar.AppBarLayout;
import com.google.protobuf.q;
import com.woha.wifim.MainWifiManadger;
import d2.h;
import e0.e2;
import e0.p3;
import e3.d;
import i8.g;
import i8.j;
import j1.i;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.io.encoding.Base64;
import n.c0;
import n.r;
import n.s;
import n.z;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.apache.commons.net.tftp.TFTP;
import org.json.JSONException;
import org.json.JSONObject;
import p2.e;
import x7.f;
import y5.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c implements OnApplyWindowInsetsListener, b8.c, Callback, f2.b, x7.c, h3.b, e5.b, f, k7.c, s {
    public static volatile c d;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5399b;
    public Object c;

    public c(int i10) {
        this.f5399b = i10;
        switch (i10) {
            case 9:
                this.c = new m(2);
                return;
            case 29:
                this.c = new c0(7);
                return;
            default:
                this.c = new HashSet();
                return;
        }
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId;
        String str2 = null;
        if (!str.isEmpty() && (findAccessibilityNodeInfosByViewId = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId(str)) != null && !findAccessibilityNodeInfosByViewId.isEmpty()) {
            for (AccessibilityNodeInfo accessibilityNodeInfo2 : findAccessibilityNodeInfosByViewId) {
                if (accessibilityNodeInfo2 != null) {
                    if (str2 == null) {
                        try {
                            CharSequence text = accessibilityNodeInfo2.getText();
                            if (text == null) {
                                text = accessibilityNodeInfo2.getContentDescription();
                            }
                            if (text != null) {
                                str2 = text.toString();
                            }
                        } catch (Throwable th) {
                            accessibilityNodeInfo2.recycle();
                            throw th;
                        }
                    }
                    accessibilityNodeInfo2.recycle();
                }
            }
        }
        return str2;
    }

    public static String h(String str, String str2) {
        if (str2 != null) {
            String trim = str2.trim();
            if (trim.isEmpty()) {
                return "";
            }
            int indexOf = trim.indexOf(e0.m.h(new byte[]{-110, -3, 95, -71}, new byte[]{-88, -108, 59, -106, 33, -62, 124, -112}));
            if (indexOf >= 0) {
                trim = trim.substring(indexOf + 4);
            }
            if (str != null && !str.trim().isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str.trim());
                return q.l(new byte[]{-59, -47, -93, -61}, new byte[]{-1, -72, -57, -20, 0, -16, 64, 116}, sb, trim);
            }
            return trim;
        }
        return "";
    }

    public static String i() {
        return e0.m.h(new byte[]{-117, -102, 95, 91, 20, -112, 112, -72, -102}, new byte[]{-4, -3, 47, 41, 113, -13, 31, -42});
    }

    @Override // x7.f
    public void a() {
        ((j) this.c).f2851b.a();
    }

    @Override // b8.c
    public Object apply(Object obj) {
        switch (this.f5399b) {
            case 6:
                List list = (List) obj;
                Collections.sort(list, (androidx.constraintlayout.core.utils.a) this.c);
                return list;
            default:
                return ((e) ((g) this.c).d).apply(new Object[]{obj});
        }
    }

    @Override // x7.f
    public void b(z7.a aVar) {
        c8.a.d((j) this.c, aVar);
    }

    @Override // x7.f
    public void c(Object obj) {
        ((j) this.c).f2851b.c(obj);
    }

    @Override // x7.c
    public void d() {
        d.m("Subscribing to analytics events.");
        f5.b bVar = (f5.b) this.c;
        bVar.c = bVar.f2272a.a(new e(6));
    }

    @Override // k7.c
    public k7.b e(String str) {
        String str2;
        k7.c[] cVarArr = (k7.c[]) this.c;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                k7.b e = cVarArr[i10].e(str);
                if (e != null && (str2 = e.f3426b) != null && !str2.isEmpty()) {
                    return e;
                }
            } catch (Exception e6) {
                h0.b.v(e0.m.h(new byte[]{-9, -90, 26, 124, -85, 34, -100, -92, -26, -94, 23, 100, -95, 38, -115, -97, -61, -88, 0, 121, -83, 38, -115, -11, -111}, new byte[]{-79, -57, 118, 16, -55, 67, -1, -49}) + e6.getMessage());
            }
        }
        return null;
    }

    public void f(int[] iArr, int i10) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        int i13;
        h6.a aVar = (h6.a) this.c;
        if (iArr.length != 0) {
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i14 = 1;
                while (i14 < length && iArr[i14] == 0) {
                    i14++;
                }
                if (i14 == length) {
                    iArr2 = new int[]{0};
                } else {
                    int i15 = length - i14;
                    int[] iArr4 = new int[i15];
                    System.arraycopy(iArr, i14, iArr4, 0, i15);
                    iArr2 = iArr4;
                }
            } else {
                iArr2 = iArr;
            }
            int[] iArr5 = new int[i10];
            boolean z9 = true;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = aVar.f2595a[aVar.f2598g + i16];
                if (i17 == 0) {
                    i13 = iArr2[iArr2.length - 1];
                } else {
                    if (i17 == 1) {
                        i12 = 0;
                        for (int i18 : iArr2) {
                            h6.a aVar2 = h6.a.f2587h;
                            i12 ^= i18;
                        }
                    } else {
                        i12 = iArr2[0];
                        int length2 = iArr2.length;
                        for (int i19 = 1; i19 < length2; i19++) {
                            i12 = aVar.c(i17, i12) ^ iArr2[i19];
                        }
                    }
                    i13 = i12;
                }
                iArr5[(i10 - 1) - i16] = i13;
                if (i13 != 0) {
                    z9 = false;
                }
            }
            if (!z9) {
                h6.b bVar = new h6.b(aVar, iArr5);
                h6.b a10 = aVar.a(i10, 1);
                h6.b bVar2 = aVar.c;
                if (a10.d() >= bVar.d()) {
                    a10 = bVar;
                    bVar = a10;
                }
                h6.b bVar3 = aVar.d;
                h6.b bVar4 = a10;
                h6.b bVar5 = bVar;
                h6.b bVar6 = bVar4;
                h6.b bVar7 = bVar2;
                while (bVar6.d() >= i10 / 2) {
                    if (!bVar6.e()) {
                        int b10 = aVar.b(bVar6.c(bVar6.d()));
                        h6.b bVar8 = bVar2;
                        while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                            int d10 = bVar5.d() - bVar6.d();
                            int c = aVar.c(bVar5.c(bVar5.d()), b10);
                            bVar8 = bVar8.a(aVar.a(d10, c));
                            bVar5 = bVar5.a(bVar6.h(d10, c));
                        }
                        h6.b a11 = bVar8.g(bVar3).a(bVar7);
                        if (bVar5.d() < bVar6.d()) {
                            h6.b bVar9 = bVar5;
                            bVar5 = bVar6;
                            bVar6 = bVar9;
                            bVar7 = bVar3;
                            bVar3 = a11;
                        } else {
                            i.l("Division algorithm failed to reduce polynomial?");
                            return;
                        }
                    } else {
                        throw new Exception("r_{i-1} was zero");
                    }
                }
                int c10 = bVar3.c(0);
                if (c10 != 0) {
                    int b11 = aVar.b(c10);
                    h6.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
                    h6.b bVar10 = bVarArr[0];
                    h6.b bVar11 = bVarArr[1];
                    int d11 = bVar10.d();
                    if (d11 == 1) {
                        iArr3 = new int[]{bVar10.c(1)};
                    } else {
                        int[] iArr6 = new int[d11];
                        int i20 = 0;
                        for (int i21 = 1; i21 < aVar.e && i20 < d11; i21++) {
                            if (bVar10.b(i21) == 0) {
                                iArr6[i20] = aVar.b(i21);
                                i20++;
                            }
                        }
                        if (i20 == d11) {
                            iArr3 = iArr6;
                        } else {
                            throw new Exception("Error locator degree does not match number of roots");
                        }
                    }
                    int length3 = iArr3.length;
                    int[] iArr7 = new int[length3];
                    for (int i22 = 0; i22 < length3; i22++) {
                        int b12 = aVar.b(iArr3[i22]);
                        int i23 = 1;
                        for (int i24 = 0; i24 < length3; i24++) {
                            if (i22 != i24) {
                                int c11 = aVar.c(iArr3[i24], b12);
                                if ((c11 & 1) == 0) {
                                    i11 = c11 | 1;
                                } else {
                                    i11 = c11 & (-2);
                                }
                                i23 = aVar.c(i23, i11);
                            }
                        }
                        int c12 = aVar.c(bVar11.b(b12), aVar.b(i23));
                        iArr7[i22] = c12;
                        if (aVar.f2598g != 0) {
                            iArr7[i22] = aVar.c(c12, b12);
                        }
                    }
                    for (int i25 = 0; i25 < iArr3.length; i25++) {
                        int length4 = iArr.length - 1;
                        int i26 = iArr3[i25];
                        if (i26 != 0) {
                            int i27 = length4 - aVar.f2596b[i26];
                            if (i27 >= 0) {
                                iArr[i27] = iArr[i27] ^ iArr7[i25];
                            } else {
                                throw new Exception("Bad error location");
                            }
                        } else {
                            l9.i.a();
                            return;
                        }
                    }
                    return;
                }
                throw new Exception("sigmaTilde(0) was zero");
            }
            return;
        }
        l9.i.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        r1.e(r4, r3);
     */
    /* JADX WARN: Type inference failed for: r1v3, types: [n7.v0, java.lang.Object] */
    @Override // t8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object get() {
        /*
            r8 = this;
            int r0 = r8.f5399b
            switch(r0) {
                case 10: goto L96;
                case 14: goto L86;
                case 16: goto L7a;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r8.c
            f5.l0 r0 = (f5.l0) r0
            n7.h r1 = n7.v0.d
            java.util.BitSet r2 = n7.s0.d
            n7.q0 r2 = new n7.q0
            java.lang.String r3 = "X-Goog-Api-Key"
            r2.<init>(r3, r1)
            n7.q0 r3 = new n7.q0
            java.lang.String r4 = "X-Android-Package"
            r3.<init>(r4, r1)
            n7.q0 r4 = new n7.q0
            java.lang.String r5 = "X-Android-Cert"
            r4.<init>(r5, r1)
            n7.v0 r1 = new n7.v0
            r1.<init>()
            o4.f r0 = r0.f2301a
            r0.a()
            android.content.Context r5 = r0.f4359a
            java.lang.String r6 = r5.getPackageName()
            r0.a()
            o4.h r7 = r0.c
            java.lang.String r7 = r7.f4367a
            r1.e(r2, r7)
            r1.e(r3, r6)
            r0.a()
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r2 = 64
            r3 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r6, r2)     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L74
            android.content.pm.Signature[] r0 = r0.signatures     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L74
            int r2 = r0.length     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L74
            r2 = 0
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L5c
            goto L74
        L5c:
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = "SHA1"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.lang.Throwable -> L74
            byte[] r0 = r2.digest(r0)     // Catch: java.lang.Throwable -> L74
            k4.b r2 = k4.e.e     // Catch: java.lang.Throwable -> L74
            k4.e r2 = r2.h()     // Catch: java.lang.Throwable -> L74
            java.lang.String r3 = r2.c(r0)     // Catch: java.lang.Throwable -> L74
        L74:
            if (r3 == 0) goto L79
            r1.e(r4, r3)
        L79:
            return r1
        L7a:
            java.lang.Object r0 = r8.c
            r5.c r0 = (r5.c) r0
            java.lang.Object r0 = r0.c
            android.app.Application r0 = (android.app.Application) r0
            a.a.e(r0)
            return r0
        L86:
            java.lang.Object r0 = r8.c
            h5.a r0 = (h5.a) r0
            java.lang.Object r0 = r0.get()
            f5.l0 r0 = (f5.l0) r0
            f5.m0 r1 = new f5.m0
            r1.<init>(r0)
            return r1
        L96:
            java.lang.Object r0 = r8.c
            e5.c r0 = (e5.c) r0
            java.lang.Object r0 = r0.c
            android.content.Context r0 = (android.content.Context) r0
            c5.e r1 = new c5.e
            r2 = 15
            r1.<init>(r2)
            z3.f r2 = new z3.f
            r3 = 14
            r2.<init>(r3)
            a5.h r3 = new a5.h
            r4 = 3
            r3.<init>(r0, r1, r2, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.c.get():java.lang.Object");
    }

    @Override // n.s
    public r j(z zVar) {
        return new n.c(1, (c0) this.c);
    }

    public void k() {
        synchronized (((n) this.c).f415h) {
            try {
                n nVar = (n) this.c;
                if (nVar.f414g) {
                    nVar.c.obtainMessage(R.id.zxing_preview_failed).sendToTarget();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(int i10) {
        h hVar = (h) this.c;
        Context context = (Context) hVar.c;
        if (i10 == 3) {
            h0.b.o().saveBoolean(e0.m.h(new byte[]{126, 77, -11, -107, 24, 74, -111, -36, 87, 78, -17, -85, 8, 81, -95, -37, 124, 92, -17, -65, 9}, new byte[]{8, Base64.padSymbol, -101, -54, 122, 37, -2, -88}), true);
        } else {
            h0.b.o().saveBoolean(e0.m.h(new byte[]{-101, -126, 109, 102, 93, -63, -95, -41, -78, -127, 119, 88, 77, -38, -111, -48, -103, -109, 119, 76, 76}, new byte[]{-19, -14, 3, 57, 63, -82, -50, -93}), false);
        }
        if (i10 == 3) {
            VJCT.t(context.getResources().getString(R.string.vikluchit));
            VJCT.s(ContextCompat.getColor(context, R.color.Butt_Color));
            TService.b(Boolean.TRUE);
            VJCT.u("");
            hVar.i();
            hVar.f1740b = ((ScheduledThreadPoolExecutor) hVar.f1739a).scheduleWithFixedDelay(new l7.a(hVar, 2), 0L, TFTP.DEFAULT_TIMEOUT, TimeUnit.MILLISECONDS);
            return;
        }
        VJCT.t(context.getResources().getString(R.string.vkluchit));
        VJCT.s(ContextCompat.getColor(context, R.color.gray));
        TService.b(Boolean.FALSE);
        hVar.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a6.a m(android.view.accessibility.AccessibilityNodeInfo r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.c.m(android.view.accessibility.AccessibilityNodeInfo, java.lang.String):a6.a");
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2;
        boolean z9;
        AppBarLayout appBarLayout = (AppBarLayout) this.c;
        if (appBarLayout.getFitsSystemWindows()) {
            windowInsetsCompat2 = windowInsetsCompat;
        } else {
            windowInsetsCompat2 = null;
        }
        if (!ObjectsCompat.equals(appBarLayout.f1167h, windowInsetsCompat2)) {
            appBarLayout.f1167h = windowInsetsCompat2;
            if (appBarLayout.f1180x != null && appBarLayout.getTopInset() > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            appBarLayout.setWillNotDraw(!z9);
            appBarLayout.requestLayout();
        }
        return windowInsetsCompat;
    }

    @Override // x7.f
    public void onError(Throwable th) {
        ((j) this.c).f2851b.onError(th);
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        boolean z9 = false;
        switch (this.f5399b) {
            case 8:
                punto puntoVar = (punto) this.c;
                String str = punto.r;
                puntoVar.d.post(new c7.e(puntoVar, z9, 5));
                return;
            default:
                MainWifiManadger mainWifiManadger = (MainWifiManadger) this.c;
                mainWifiManadger.r.post(new e2(mainWifiManadger, call, z9, 3));
                return;
        }
    }

    /* JADX INFO: Infinite loop detected, blocks: 2, insns: 0 */
    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        int i10 = 3;
        switch (this.f5399b) {
            case 8:
                punto puntoVar = (punto) this.c;
                try {
                    try {
                        boolean z9 = true;
                        if (response.isSuccessful()) {
                            String str = punto.r;
                            puntoVar.d.post(new c7.e(puntoVar, z9, 5));
                        }
                        if (response.body() != null) {
                            try {
                                JSONObject jSONObject = new JSONObject(response.body().string());
                                byte[] bArr = e0.m.f1973j;
                                String[] strArr = p3.f2001a;
                                if (!jSONObject.isNull(new String(bArr))) {
                                    h0.b.o().saveString(new String(bArr), jSONObject.getString(new String(bArr)));
                                    if (!jSONObject.isNull(e0.m.h(new byte[]{109, -13, -47}, new byte[]{31, -106, -94, 60, -113, 79, -4, -61})) && e0.m.h(new byte[]{-39, 62, -127, 106}, new byte[]{-83, 76, -12, 15, 74, 65, 86, 88}).equals(jSONObject.getString(e0.m.h(new byte[]{25, -7, 22}, new byte[]{107, -100, 101, -101, 93, -59, -89, 12})))) {
                                        h0.b.o().saveBoolean(e0.m.h(new byte[]{72, -123}, new byte[]{41, -16, -123, 5, 34, 102, -35, 114}), true);
                                        k.u(puntoVar.c, new Intent(puntoVar.c, (Class<?>) ModernMainActivity.class).addFlags(268435456), null);
                                        puntoVar.finish();
                                    }
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        response.close();
                    } finally {
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
            default:
                try {
                    boolean isSuccessful = response.isSuccessful();
                    response.close();
                    MainWifiManadger mainWifiManadger = (MainWifiManadger) this.c;
                    mainWifiManadger.r.post(new e2(mainWifiManadger, call, isSuccessful, i10));
                    return;
                } catch (Throwable th) {
                    if (response != null) {
                        try {
                            response.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
        }
    }

    public /* synthetic */ c(int i10, boolean z9) {
        this.f5399b = i10;
    }

    public c(com.bumptech.glide.f fVar) {
        this.f5399b = 5;
        this.c = Collections.unmodifiableMap(new HashMap(fVar.f626a));
    }

    public c(Context context) {
        this.f5399b = 25;
        this.c = new o(context, 2);
    }

    public c(a5.h hVar, h5.a aVar) {
        this.f5399b = 14;
        this.c = aVar;
    }

    public /* synthetic */ c(int i10, Object obj) {
        this.f5399b = i10;
        this.c = obj;
    }
}
