package p2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;
import androidx.fragment.app.FragmentActivity;
import com.example.navistart.MainActivity;
import com.example.navistart.MyA11yService;
import com.example.navistart.PermActivity;
import com.example.navistart.boot;
import com.example.navistart.cores.CarCmdProxy;
import com.example.navistart.cores.ColorText;
import com.example.navistart.cores.InterB;
import com.example.navistart.cores.ProBroProxy;
import com.example.navistart.cores.ProLanProxy;
import com.example.navistart.cores.SettingsdProxy;
import com.example.navistart.punto;
import e0.m;
import e0.n3;
import e0.x1;
import j1.w;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import n.b0;
import n.r;
import n.s;
import n.z;
import okhttp3.OkHttpClient;
import q.e0;
import q.p;
import y5.k;
import z3.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e implements com.bumptech.glide.manager.g, b8.c, b8.b, InterB, w, z0.a, s, p, e0, v2.b {
    public static e c;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4989b;

    public e(e0.g gVar) {
        this.f4989b = 4;
    }

    public static e n(int i10, Context context) {
        boolean z9;
        if (i10 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        Preconditions.checkArgument(z9, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, a3.a.r);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        w3.c.a(context, obtainStyledAttributes, 4);
        w3.c.a(context, obtainStyledAttributes, 9);
        w3.c.a(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        o.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)).a();
        obtainStyledAttributes.recycle();
        e eVar = new e(3);
        Preconditions.checkArgumentNonnegative(rect.left);
        Preconditions.checkArgumentNonnegative(rect.top);
        Preconditions.checkArgumentNonnegative(rect.right);
        Preconditions.checkArgumentNonnegative(rect.bottom);
        return eVar;
    }

    public static final g o(PackageInfo packageInfo, g... gVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            h hVar = new h(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < gVarArr.length; i10++) {
                if (gVarArr[i10].equals(hVar)) {
                    return gVarArr[i10];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean p(android.content.pm.PackageInfo r4) {
        /*
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L2c
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1c
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L19
            goto L1c
        L19:
            r2 = r4
        L1a:
            r3 = r0
            goto L2e
        L1c:
            android.content.pm.ApplicationInfo r2 = r4.applicationInfo
            if (r2 != 0) goto L22
        L20:
            r2 = r1
            goto L29
        L22:
            int r2 = r2.flags
            r2 = r2 & 129(0x81, float:1.81E-43)
            if (r2 == 0) goto L20
            r2 = r0
        L29:
            r3 = r2
            r2 = r4
            goto L2e
        L2c:
            r2 = 0
            goto L1a
        L2e:
            if (r4 == 0) goto L4c
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L4c
            if (r3 == 0) goto L3d
            p2.g[] r4 = p2.i.f4991a
            p2.g r4 = o(r2, r4)
            goto L49
        L3d:
            p2.g[] r4 = p2.i.f4991a
            r4 = r4[r1]
            p2.g[] r4 = new p2.g[]{r4}
            p2.g r4 = o(r2, r4)
        L49:
            if (r4 == 0) goto L4c
            return r0
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.e.p(android.content.pm.PackageInfo):boolean");
    }

    @Override // v2.b
    public int a(Context context) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors.com.google.android.gms.providerinstaller.dynamite.ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!r2.a.d(declaredField.get(null), "com.google.android.gms.providerinstaller.dynamite")) {
                Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id 'com.google.android.gms.providerinstaller.dynamite'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for com.google.android.gms.providerinstaller.dynamite not found.");
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    @Override // b8.b
    public void accept(Object obj) {
        a.a.s(new a8.e((Throwable) obj));
    }

    @Override // b8.c
    public Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length == 2) {
            return new f5.d((String) objArr[0], (l5.a) objArr[1]);
        }
        androidx.navigation.b.b(objArr.length, "Array of size 2 expected but got ");
        return null;
    }

    @Override // com.example.navistart.cores.InterB
    public void bind(String str) {
        x1.f2066q = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x017a, code lost:
    
        if (r3 != false) goto L101;
     */
    @Override // v2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c(android.content.Context r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.e.c(android.content.Context, boolean):int");
    }

    @Override // com.example.navistart.cores.InterB
    public void e(String str, Context context) {
        if (str != null) {
            if (context == null) {
                h0.b.a();
                context = h0.b.h();
            }
            String trim = str.trim();
            if (trim.length() != 0) {
                try {
                    j0.e b10 = j0.f.b(context, trim);
                    if (j0.f.d(b10)) {
                        h0.b.a();
                        h0.b.f().j(b10, null);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // z0.a
    public WindowManager f(View view, WindowManager.LayoutParams layoutParams) {
        switch (this.f4989b) {
            case 14:
                return null;
            default:
                return g(view, 0, layoutParams);
        }
    }

    @Override // com.example.navistart.cores.InterB
    public void fuul(Context context) {
        n3.e.execute(new androidx.profileinstaller.c(context, 7));
    }

    @Override // z0.a
    public WindowManager g(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        WindowManager windowManager = null;
        switch (this.f4989b) {
            default:
                if (MyA11yService.f() && h0.b.o().loadBoolean(m.h(new byte[]{46, -110, 72, 12, -1, 112, -4, -81, 54, -115, 73, 25, -59, 119, -10, -125, 45, -98, 65}, new byte[]{89, -5, 44, 107, -102, 4, -113, -16}), false)) {
                    MyA11yService myA11yService = MyA11yService.c;
                    if (myA11yService != null) {
                        windowManager = (WindowManager) myA11yService.getSystemService(m.h(new byte[]{-97, 39, -12, -35, 93, -111}, new byte[]{-24, 78, -102, -71, 50, -26, -121, -112}));
                    }
                } else {
                    windowManager = o4.b.x(0);
                }
                if (windowManager != null) {
                    try {
                        windowManager.addView(view, layoutParams);
                    } catch (Exception e) {
                        h0.b.w(m.h(new byte[]{-20, -16, 28, -37, 2, 0, -26, -20, -51, -44, 7, -47, 7, 0, -86, -88}, new byte[]{-87, -126, 110, -76, 112, 32, -121, -120}) + e.getMessage(), ColorText.RED);
                    }
                }
                break;
            case 14:
                return windowManager;
        }
    }

    @Override // com.example.navistart.cores.InterB
    public CarCmdProxy gcmdp() {
        h0.b.a();
        return h0.b.d();
    }

    @Override // com.example.navistart.cores.InterB
    public Class getA(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.example.navistart.cores.InterB
    public String getK() {
        return n3.d;
    }

    @Override // com.example.navistart.cores.InterB
    public int getR(String str) {
        h0.b.a();
        Context h2 = h0.b.h();
        if (str == null) {
            return 0;
        }
        String replace = str.replace(m.h(new byte[]{5, 117}, new byte[]{87, 91, 14, 35, -9, -55, 52, 84}), "").replace(m.h(new byte[]{-7, -106, 94, 71, 35, -24, -56, 108}, new byte[]{-104, -8, 58, 53, 76, -127, -84, 66}), "");
        if (replace.contains(m.h(new byte[]{-21}, new byte[]{-60, -32, -47, -115, 73, 19, -57, 53}))) {
            String[] split = replace.split(m.h(new byte[]{-77}, new byte[]{-100, -28, 57, 87, 19, -102, 79, -88}));
            if (split.length == 2) {
                return h2.getResources().getIdentifier(split[1], split[0], h2.getPackageName());
            }
        }
        if (replace.contains(m.h(new byte[]{-109}, new byte[]{-67, 112, 1, -3, -92, 1, 43, 29}))) {
            String[] split2 = replace.split(m.h(new byte[]{33, 39}, new byte[]{125, 9, 9, 111, -92, 11, -55, -36}));
            if (split2.length >= 2) {
                return h2.getResources().getIdentifier(split2[split2.length - 1], split2[split2.length - 2], h2.getPackageName());
            }
        }
        return h2.getResources().getIdentifier(replace, null, h2.getPackageName());
    }

    @Override // com.example.navistart.cores.InterB
    public ScheduledThreadPoolExecutor getScheduler(String str) {
        return e0.w.c(-1, str);
    }

    @Override // com.example.navistart.cores.InterB
    public String getbind() {
        return x1.f2066q;
    }

    @Override // com.example.navistart.cores.InterB
    public long getl() {
        boolean z9 = boot.f953u;
        throw null;
    }

    @Override // com.example.navistart.cores.InterB
    public byte[] getmir() {
        return m.f1970g;
    }

    @Override // com.example.navistart.cores.InterB
    public byte[] getmiru() {
        return m.f1969f;
    }

    @Override // com.example.navistart.cores.InterB
    public byte[] getmur() {
        return m.f1973j;
    }

    @Override // com.example.navistart.cores.InterB
    public byte[] getp2() {
        return m.f1972i;
    }

    @Override // com.example.navistart.cores.InterB
    public SettingsdProxy getsettingsd() {
        return h0.b.o();
    }

    @Override // com.example.navistart.cores.InterB
    public ProBroProxy gprobrop() {
        h0.b.a();
        return h0.b.r();
    }

    @Override // com.example.navistart.cores.InterB
    public ProLanProxy gprolanp() {
        h0.b.a();
        return h0.b.n();
    }

    @Override // q.e0
    public void h(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // j1.w
    public void i(Context context) {
        if (h0.b.o().loadBoolean(m.h(new byte[]{-76, 94, -52, 106, -90, 55, 48, -92, -98, 90, -33, 113, -87, 51, 26, -125, -102, 90, -35}, new byte[]{-5, 40, -87, 24, -54, 86, 73, -9}), false) && ContextCompat.checkSelfPermission(context, m.h(new byte[]{-94, 122, -72, 119, -24, -113, 77, 101, -77, 113, -82, 104, -18, -107, 90, 34, -84, 122, -14, 87, -62, -91, 102, 25, -121, 75, -99, 80, -61, -81, 102}, new byte[]{-61, 20, -36, 5, -121, -26, 41, 75})) != 0) {
            String[] strArr = {m.h(new byte[]{-62, -78, -18, 123, -43, -117, 87, -66, -45, -71, -8, 100, -45, -111, 64, -7, -52, -78, -92, 91, -1, -95, 124, -62, -25, -125, -53, 92, -2, -85, 124}, new byte[]{-93, -36, -118, 9, -70, -30, 51, -112})};
            String str = PermActivity.c;
            Intent intent = new Intent(context, (Class<?>) PermActivity.class);
            intent.putExtra(PermActivity.d, strArr);
            k.u(context, intent.addFlags(268435456), null);
        }
    }

    @Override // n.s
    public r j(z zVar) {
        return new b0(zVar.b(n.g.class, InputStream.class), 1);
    }

    @Override // j1.w
    public void k(AccessibilityEvent accessibilityEvent, AccessibilityNodeInfo accessibilityNodeInfo) {
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId;
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText;
        if (accessibilityEvent != null && accessibilityNodeInfo != null && accessibilityEvent.getEventType() == 32) {
            String valueOf = String.valueOf(accessibilityEvent.getPackageName());
            String valueOf2 = String.valueOf(accessibilityEvent.getClassName());
            if (valueOf.contains(m.h(new byte[]{-78, 119, -1, -100, 86, 48, -66, -63, -83, 124, -18, -98, 81, 55, -65, -57, -82, 126, -24, -125}, new byte[]{-62, 18, -115, -15, 63, 67, -51, -88})) && valueOf2.contains(m.h(new byte[]{5, 43, 81, 70, -100, 35, 19, 54, 47, 48, 67, 91, -127, 28, 24, 55, 3, 58, 68, 65, -98, 26, 2, Base64.padSymbol}, new byte[]{66, 89, 48, 40, -24, 115, 118, 68})) && (findAccessibilityNodeInfosByViewId = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId(m.h(new byte[]{-29, 36, 6, -74, -91, 73, 26, -110, -17, 34, 15, -74, -76, 66, 12, -115, -23, 56, 24, -15, -85, 73, 29, -113, -18, 63, 25, -9, -88, 75, 27, -110, -70, 34, 15, -73, -80, 81, 33, -108, -23, 63, 7, -3}, new byte[]{ByteCompanionObject.MIN_VALUE, 75, 107, -104, -60, 39, 126, -32}))) != null && !findAccessibilityNodeInfosByViewId.isEmpty()) {
                String valueOf3 = String.valueOf(findAccessibilityNodeInfosByViewId.get(0).getText());
                if ((valueOf3.contains(m.h(new byte[]{-17, 35, 96, -69, -23, -121, -67, -3, -42}, new byte[]{-91, 96, 1, -55, -67, -24, -46, -111})) || valueOf3.contains(m.h(new byte[]{-54, -26, 46, 52, -13, -101, -24, -27, -54, -56, 46, 52, -14, -85, -24, -29, -53, -5}, new byte[]{26, 123, -2, -124, 35, 41, 56, 93}))) && (findAccessibilityNodeInfosByText = accessibilityNodeInfo.findAccessibilityNodeInfosByText(m.h(new byte[]{-94, -79, 71, 110, -54, 64, 105, 9, -93, -92, 71, 108, -53, 121, 105, 11}, new byte[]{114, 35, -105, -44, 26, -5, -72, -121}))) != null && !findAccessibilityNodeInfosByText.isEmpty()) {
                    for (AccessibilityNodeInfo accessibilityNodeInfo2 : findAccessibilityNodeInfosByText) {
                        if (m.h(new byte[]{108, 0, 79, 123, 81, 88, -19, 89, 122, 7, 79, 110, 91, 69, -89, 53, 120, 26, 95, 102, 80}, new byte[]{13, 110, 43, 9, 62, 49, -119, 119}).equals(accessibilityNodeInfo2.getClassName()) || m.h(new byte[]{53, 68, 77, -87, 73, 110, -107, 72, 35, 67, 77, -68, 67, 115, -33, 52, 53, 78, 64, -76, 100, 114, -123, 18, 59, 68}, new byte[]{84, 42, 41, -37, 38, 7, -15, 102}).equals(accessibilityNodeInfo2.getClassName())) {
                            if (accessibilityNodeInfo2.performAction(16)) {
                                new Handler(Looper.getMainLooper()).post(new f5.j(4, accessibilityNodeInfo2));
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.example.navistart.cores.InterB
    public void l(String str) {
        v1.d.a().d().e.postValue(str);
    }

    @Override // com.example.navistart.cores.InterB
    public void li(String str) {
        h0.b.v(str);
    }

    @Override // z0.a
    public int m() {
        switch (this.f4989b) {
            case 14:
                return 2038;
            default:
                if (MyA11yService.f() && h0.b.o().loadBoolean(m.h(new byte[]{67, -126, -97, 31, -90, 41, -97, -49, 91, -99, -98, 10, -100, 46, -107, -29, 64, -114, -106}, new byte[]{52, -21, -5, 120, -61, 93, -20, -112}), false)) {
                    return 2032;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    return 2038;
                }
                return 2002;
        }
    }

    @Override // com.example.navistart.cores.InterB
    public void mb() {
        h0.b.a();
        h0.b.k().c(n0.g.e);
    }

    @Override // com.example.navistart.cores.InterB
    public void mn() {
        h0.b.a();
        h0.b.k().c(n0.g.d);
    }

    @Override // com.example.navistart.cores.InterB
    public void mpa() {
        h0.b.a();
        h0.b.k().c(n0.g.c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.ContextWrapper, h0.c] */
    @Override // com.example.navistart.cores.InterB
    public void pc() {
        ?? r02 = h0.b.f2544q;
        if (r02 != 0) {
            r02.d();
        }
    }

    @Override // com.example.navistart.cores.InterB
    public void setMediaVolumePercent(int i10, Context context) {
        if (context == null) {
            h0.b.a();
            context = h0.b.h();
        }
        k.t(i10, context);
    }

    @Override // com.example.navistart.cores.InterB
    public void li(String str, ColorText colorText) {
        h0.b.w(str, colorText);
    }

    @Override // com.example.navistart.cores.InterB
    public ScheduledExecutorService getScheduler(String str, int i10) {
        return e0.w.b(i10, str);
    }

    public /* synthetic */ e(int i10) {
        this.f4989b = i10;
    }

    @Override // com.example.navistart.cores.InterB
    public OkHttpClient h() {
        h0.b.a();
        return h0.b.m();
    }

    @Override // q.p
    public void l(Bitmap bitmap, k.b bVar) {
    }

    @Override // q.p
    public void d() {
    }

    @Override // com.example.navistart.cores.InterB
    public void ss() {
    }

    @Override // com.bumptech.glide.manager.g
    public void b(FragmentActivity fragmentActivity) {
    }

    @Override // com.example.navistart.cores.InterB
    public void setMO(boolean z9) {
    }

    @Override // q.e0
    public void e(MediaExtractor mediaExtractor, Object obj) {
        mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // com.example.navistart.cores.InterB
    public void lf(Context context, Class cls, Bundle bundle) {
    }

    @Override // com.example.navistart.cores.InterB
    public void a(Boolean bool, String str, Long l10, Long l11) {
        if (bool != null) {
            punto.t = bool;
        }
        if (str != null) {
            punto.f1064s = str;
        }
        if (l10 != null) {
            MainActivity.f754j1 = l10;
        }
    }
}
