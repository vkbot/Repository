package e0;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.fragment.app.FragmentActivity;
import com.example.navistart.OverlayService;
import com.example.navistart.R;
import com.example.navistart.boot;
import com.example.navistart.cores.InterC;
import com.woha.wifim.MainWifiManadger;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;
import o7.i4;
import okhttp3.Call;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class e2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1908b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e2(Object obj, Object obj2, boolean z9, int i10) {
        this.f1908b = i10;
        this.d = obj;
        this.e = obj2;
        this.c = z9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [m0.o2] */
    @Override // java.lang.Runnable
    public final void run() {
        Boolean bool;
        t1.a aVar;
        final i4 i4Var;
        i4 d;
        int i10;
        int i11;
        boolean z9 = false;
        Object[] objArr = 0;
        final int i12 = 1;
        switch (this.f1908b) {
            case 0:
                OverlayService overlayService = (OverlayService) this.d;
                boolean z10 = this.c;
                String str = (String) this.e;
                OverlayService overlayService2 = OverlayService.f865f;
                if (z10 == w0.a0.e()) {
                    if (z10) {
                        if (OverlayService.f866g && (aVar = overlayService.f869b) != null) {
                            aVar.setText(str);
                            return;
                        }
                        return;
                    }
                    String lowerCase = str.toLowerCase();
                    h0.b.a();
                    h0.b.f().getClass();
                    if (lowerCase.contains(j0.c.f().toLowerCase())) {
                        overlayService.b();
                    }
                    if (OverlayService.f866g) {
                        overlayService.f869b.setText(str);
                        h0.b.a();
                        j0.e d10 = h0.b.f().d(lowerCase);
                        if (j0.f.d(d10)) {
                            overlayService.d();
                            overlayService.a();
                            StringBuilder sb = new StringBuilder();
                            u0.a o5 = h0.b.o();
                            byte[] bArr = m.f1973j;
                            String[] strArr = p3.f2001a;
                            com.google.protobuf.q.s(bArr, o5, "", sb);
                            com.google.protobuf.q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
                            String g10 = com.google.protobuf.q.g(sb, x1.f2066q);
                            u0.a o9 = h0.b.o();
                            byte[] bArr2 = m.f1969f;
                            if (com.google.protobuf.q.w(bArr2, o9, "", g10)) {
                                if (com.google.protobuf.q.d(Long.MAX_VALUE, h0.b.a().j()) < Long.parseLong(new String(com.google.protobuf.q.x(new byte[]{-19}, new byte[]{-35, -83, 2, -42, -39, -55, 96, -28}, h0.b.o(), com.google.protobuf.q.h(m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                                    z9 = true;
                                }
                                bool = Boolean.valueOf(z9);
                            } else {
                                bool = Boolean.FALSE;
                            }
                            if (bool.booleanValue()) {
                                h0.b.a();
                                h0.b.f().j(d10, null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                h0.b bVar = (h0.b) this.d;
                Context context = (Context) this.e;
                boolean z11 = this.c;
                h0.a aVar2 = h0.b.f2535h;
                n0.c cVar = bVar.f2547a.f1995a;
                InterC j10 = bVar.j();
                synchronized (aVar2) {
                    if (!cVar.equals(aVar2.f2531h) || z11) {
                        aVar2.a(cVar, j10, context);
                    }
                }
                return;
            case 2:
                final m0.q2 q2Var = (m0.q2) this.d;
                final boolean z12 = this.c;
                final Context context2 = (Context) this.e;
                p0.e eVar = q2Var.f3839b;
                try {
                    if (z12) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        d = eVar.f(new p0.d() { // from class: m0.o2
                            @Override // p0.d
                            public final void b(int i13, int i14) {
                                switch (objArr2) {
                                    case 0:
                                        q2 q2Var2 = q2Var;
                                        q2Var2.f3843i.post(new e0.s1(q2Var2, i13, i14, true));
                                        return;
                                    default:
                                        q2 q2Var3 = q2Var;
                                        q2Var3.f3843i.post(new e0.s1(q2Var3, i13, i14, false));
                                        return;
                                }
                            }
                        });
                    } else {
                        ?? r1 = new p0.d() { // from class: m0.o2
                            @Override // p0.d
                            public final void b(int i13, int i14) {
                                switch (i12) {
                                    case 0:
                                        q2 q2Var2 = q2Var;
                                        q2Var2.f3843i.post(new e0.s1(q2Var2, i13, i14, true));
                                        return;
                                    default:
                                        q2 q2Var3 = q2Var;
                                        q2Var3.f3843i.post(new e0.s1(q2Var3, i13, i14, false));
                                        return;
                                }
                            }
                        };
                        eVar.getClass();
                        synchronized (p0.b.c) {
                            try {
                                if (p0.b.f(eVar.f4968a)) {
                                    d = new i4(false, 0, 1, m.h(new byte[]{123, -1, -54, -35, -57, -112, 107, 110, 23, -20, -38, -64, -63, -116, 46, 117, 89, -66, -49, -63, -53, -97, 124, 121, 68, -19}, new byte[]{55, -98, -65, -77, -92, -8, 14, 28}));
                                } else {
                                    d = eVar.d(r1);
                                }
                            } finally {
                            }
                        }
                    }
                    i4Var = d;
                } catch (Exception e) {
                    i4Var = new i4(false, 0, 1, e.getClass().getSimpleName() + m.h(new byte[]{75, 16}, new byte[]{113, 48, 51, 118, 106, -66, -44, -120}) + e.getMessage());
                }
                q2Var.f3839b.getClass();
                final boolean e6 = p0.e.e();
                q2Var.f3843i.post(new Runnable() { // from class: m0.p2
                    @Override // java.lang.Runnable
                    public final void run() {
                        TextView textView;
                        int i13;
                        String concat;
                        q2 q2Var2 = q2.this;
                        if (q2Var2.f3842h != null && (textView = q2Var2.f3840f) != null) {
                            StringBuilder sb2 = new StringBuilder();
                            i4 i4Var2 = i4Var;
                            int i14 = i4Var2.c;
                            String str2 = (String) i4Var2.d;
                            if (i14 == 0) {
                                i13 = R.string.user_apps_hide_result_ok;
                            } else {
                                i13 = R.string.user_apps_hide_result_partial;
                            }
                            sb2.append(q2Var2.getString(i13, Integer.valueOf(i4Var2.f4554b), Integer.valueOf(i14)));
                            if (str2 == null) {
                                concat = "";
                            } else {
                                concat = "\n".concat(str2);
                            }
                            sb2.append(concat);
                            textView.setText(sb2.toString());
                            if (!z12 && e6 && i14 == 0) {
                                ProgressBar progressBar = q2Var2.f3841g;
                                if (progressBar != null) {
                                    progressBar.setProgress(100);
                                }
                                Context context3 = context2;
                                Intent intent = new Intent(context3, (Class<?>) boot.class);
                                intent.putExtra(e0.m.h(new byte[]{56}, new byte[]{92, 119, -25, -90, 86, Base64.padSymbol, -12, -91}), -1);
                                if (Build.VERSION.SDK_INT >= 26) {
                                    context3.startForegroundService(intent);
                                } else {
                                    context3.startService(intent);
                                }
                                if (q2Var2.getParentFragment() instanceof l0.a) {
                                    ((l0.a) q2Var2.getParentFragment()).dismissAllowingStateLoss();
                                }
                                FragmentActivity activity = q2Var2.getActivity();
                                if (activity != null) {
                                    activity.finishAndRemoveTask();
                                    return;
                                }
                                return;
                            }
                            q2Var2.f3845k = false;
                            q2Var2.v();
                        }
                    }
                });
                return;
            case 3:
                MainWifiManadger mainWifiManadger = (MainWifiManadger) this.d;
                Call call = (Call) this.e;
                boolean z13 = this.c;
                if (mainWifiManadger.f1707q == call && !mainWifiManadger.isFinishing() && !mainWifiManadger.isDestroyed()) {
                    mainWifiManadger.f1707q = null;
                    if (z13) {
                        i10 = R.string.wifi_internet_available;
                    } else {
                        i10 = R.string.wifi_internet_unavailable;
                    }
                    if (z13) {
                        i11 = ContextCompat.getColor(mainWifiManadger, R.color.modern_success);
                    } else {
                        i11 = SupportMenu.CATEGORY_MASK;
                    }
                    mainWifiManadger.x(i10, i11);
                    return;
                }
                return;
            case 4:
                ((q0.f) this.d).b((String) this.e, this.c);
                return;
            case 5:
                s1.q0 q0Var = (s1.q0) this.d;
                Bitmap bitmap = (Bitmap) this.e;
                boolean z14 = this.c;
                if (!q0Var.E) {
                    q0Var.c.setImageBitmap(bitmap);
                    if (z14) {
                        y5.k.x(q0Var.getContext(), m.h(new byte[]{-114, 42, -85, 67, -17, 31, -44, 11, -32, 94, -54, 45, -126, 114, 74, 11, -20, 94, -64, 44, -82, 114, 73}, new byte[]{94, -114, 123, -3, 63, -94, -12, -37}));
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ((s1.q0) this.d).M((ArrayList) this.e, this.c, null);
                return;
            default:
                s1.u0 u0Var = (s1.u0) this.d;
                boolean z15 = this.c;
                e4.o oVar = (e4.o) this.e;
                ArrayList arrayList = u0Var.f5622j;
                u0Var.f5627o = false;
                if (u0Var.isAttachedToWindow()) {
                    if (z15) {
                        arrayList.remove(oVar.a());
                        arrayList.add(0, oVar.a());
                        while (arrayList.size() > 20) {
                            arrayList.remove(arrayList.size() - 1);
                        }
                        h0.b.o().saveString(s1.u0.f5616u, TextUtils.join(m.h(new byte[]{-37}, new byte[]{-32, 14, 93, -99, 41, -13, 121, 39}), arrayList));
                        u0Var.l();
                        return;
                    }
                    Toast.makeText(u0Var.getContext(), R.string.single_window_failed, 1).show();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ e2(Object obj, boolean z9, Object obj2, int i10) {
        this.f1908b = i10;
        this.d = obj;
        this.c = z9;
        this.e = obj2;
    }
}
