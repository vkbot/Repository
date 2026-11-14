package com.bumptech.glide;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ViewDragHelper;
import com.example.navistart.DialogUni.Fragmenti.ExlantixTelemetryFragment;
import com.example.navistart.MainActivity;
import com.example.navistart.R;
import com.example.navistart.SystemMessageReceiver;
import com.example.navistart.boot;
import com.example.navistart.cores.ColorText;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import e0.g0;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.m2;
import n7.f1;
import n7.q0;
import n7.t;
import o7.a3;
import o7.a4;
import o7.b1;
import o7.c2;
import o7.c4;
import o7.e0;
import o7.e1;
import o7.e2;
import o7.f2;
import o7.h4;
import o7.i0;
import o7.k1;
import o7.l0;
import o7.n2;
import o7.o0;
import o7.q2;
import o7.v1;
import o7.y1;
import o7.y2;
import org.json.JSONObject;
import q0.s;
import s1.n0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f658b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(int i10, Object obj) {
        this.f658b = i10;
        this.c = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.f658b) {
            case 0:
                p pVar = (p) this.c;
                pVar.d.a(pVar);
                return;
            case 1:
                SystemMessageReceiver systemMessageReceiver = (SystemMessageReceiver) this.c;
                if (MainActivity.w() && systemMessageReceiver.c.booleanValue()) {
                    throw null;
                }
                if (MainActivity.v(systemMessageReceiver.f906b.getApplicationContext()) && systemMessageReceiver.c.booleanValue()) {
                    throw null;
                }
                return;
            case 2:
                h0.b.w(e0.m.h(new byte[]{23, 21, -6, -95}, new byte[]{90, 116, -119, -55, 37, -15, -120, 35}), ColorText.RED);
                h0.b.a().u();
                boot bootVar = (boot) this.c;
                boolean z9 = boot.f953u;
                bootVar.f();
                if (h0.b.a().e().c.booleanValue()) {
                    i10 = 50000;
                } else {
                    i10 = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
                }
                bootVar.e = bootVar.d.f2052b.schedule(this, i10, TimeUnit.MILLISECONDS);
                return;
            case 3:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.c).d.f2154h;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 4:
                f1.e eVar = (f1.e) this.c;
                if (eVar.f2263o) {
                    eVar.c.execute(new a4.g(29, this));
                    return;
                }
                return;
            case 5:
                a4.h hVar = (a4.h) this.c;
                hVar.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) hVar.e;
                ViewDragHelper viewDragHelper = bottomSheetBehavior.O;
                if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                    hVar.a(hVar.f36b);
                    return;
                } else {
                    if (bottomSheetBehavior.N == 2) {
                        bottomSheetBehavior.l(hVar.f36b);
                        return;
                    }
                    return;
                }
            case 6:
                b1.m mVar = (b1.m) this.c;
                while (true) {
                    try {
                        mVar.b((j.b) ((ReferenceQueue) mVar.e).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            case 7:
                ExlantixTelemetryFragment exlantixTelemetryFragment = (ExlantixTelemetryFragment) this.c;
                if (ExlantixTelemetryFragment.v(exlantixTelemetryFragment)) {
                    if (!ExlantixTelemetryFragment.K(exlantixTelemetryFragment)) {
                        ExlantixTelemetryFragment.L(exlantixTelemetryFragment, null);
                        ExlantixTelemetryFragment.G(exlantixTelemetryFragment).setText(e0.m.h(new byte[]{-71, -72, 98, 59, -21, 44, 11, -1, -72, -86, 99, 8, -22, 31, 11, -1, 73, -6, 12, 97, -69, 77, 101, -101, -19, -6, 11, 96, ByteCompanionObject.MIN_VALUE, 76, 87, 106, 44, 82, -33, -47, 85, -23, -78, 50, 73, 111, -25}, new byte[]{105, 42, -77, -80, 59, -99, -37, 74}));
                        return;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (ExlantixTelemetryFragment.C(exlantixTelemetryFragment) == 0 || elapsedRealtime - ExlantixTelemetryFragment.C(exlantixTelemetryFragment) > 5000) {
                        ExlantixTelemetryFragment.L(exlantixTelemetryFragment, null);
                    }
                    if (ExlantixTelemetryFragment.x(exlantixTelemetryFragment).compareAndSet(false, true)) {
                        ExlantixTelemetryFragment.H(exlantixTelemetryFragment).execute(new a4.c(this, ExlantixTelemetryFragment.z(exlantixTelemetryFragment), 7));
                    }
                    if (ExlantixTelemetryFragment.y(exlantixTelemetryFragment) != null) {
                        ExlantixTelemetryFragment.y(exlantixTelemetryFragment).invalidate();
                    }
                    ExlantixTelemetryFragment.D(exlantixTelemetryFragment).postDelayed(this, 1000L);
                    return;
                }
                return;
            case 8:
                m2 m2Var = (m2) this.c;
                String str = m2.f3783m;
                m2Var.t();
                m2Var.c.postDelayed(this, 1000L);
                return;
            case 9:
                b1 b1Var = (b1) this.c;
                try {
                    w7.b.c();
                    try {
                        w7.a aVar = w7.b.f6413a;
                        aVar.getClass();
                        q2 q2Var = b1Var.f4414a;
                        if (!q2Var.isClosed()) {
                            q2Var.f4678n += 2;
                            q2Var.b();
                        }
                        aVar.getClass();
                        return;
                    } finally {
                    }
                } catch (Throwable th) {
                    ((p7.j) b1Var).m(th);
                    return;
                }
            case 10:
                ((i0) this.c).f4548b.r();
                return;
            case 11:
                ((o0) this.c).f4629b.j();
                return;
            case 12:
                k1 k1Var = (k1) ((e0) this.c).c;
                n2 n2Var = k1Var.r;
                k1Var.f4590q = null;
                k1Var.r = null;
                n2Var.a(f1.f4201m.h("InternalSubchannel closed transport due to address change"));
                return;
            case 13:
                ((f2) ((c0.h) this.c).f435b).h();
                return;
            case 14:
                f2 f2Var = (f2) this.c;
                if (f2Var.f4508x != null) {
                    f2Var.k(true);
                    l0 l0Var = f2Var.E;
                    l0Var.g(null);
                    f2Var.N.m(2, "Entering IDLE state");
                    f2Var.r.c(n7.j.e);
                    e1 e1Var = f2Var.Y;
                    Object[] objArr = {f2Var.C, l0Var};
                    e1Var.getClass();
                    for (int i11 = 0; i11 < 2; i11++) {
                        if (((Set) e1Var.f3353b).contains(objArr[i11])) {
                            f2Var.h();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 15:
                f2 f2Var2 = ((y1) this.c).c;
                f2Var2.f4500m.d();
                if (f2Var2.w) {
                    f2Var2.f4507v.x();
                    return;
                }
                return;
            case 16:
                ((c2) this.c).d.h();
                return;
            case 17:
                k1 k1Var2 = ((e2) this.c).f4468i;
                k1Var2.f4584k.execute(new e0(15, k1Var2, f2.f4485f0));
                return;
            case 18:
                a3 a3Var = (a3) this.c;
                a3Var.f4398k = null;
                if (a3Var.f4395h.b()) {
                    a3Var.e();
                    return;
                }
                return;
            case 19:
                ((t) ((y2) this.c).c).l();
                return;
            case 20:
                v1 v1Var = (v1) this.c;
                if (!v1Var.A) {
                    v1Var.f4750v.j();
                    return;
                }
                return;
            case 21:
                a4 a4Var = (a4) this.c;
                v1 v1Var2 = (v1) a4Var.d.d;
                c4 c4Var = a4Var.c;
                q0 q0Var = v1.F;
                v1Var2.p(c4Var);
                return;
            case 22:
                ((h4) this.c).x();
                return;
            case 23:
                p7.c cVar = (p7.c) this.c;
                p7.n nVar = cVar.e;
                try {
                    l9.e0 e0Var = cVar.f5025j;
                    if (e0Var != null) {
                        l9.l lVar = cVar.c;
                        long j10 = lVar.c;
                        if (j10 > 0) {
                            e0Var.write(lVar, j10);
                        }
                    }
                } catch (IOException e) {
                    nVar.n(e);
                }
                try {
                    l9.e0 e0Var2 = cVar.f5025j;
                    if (e0Var2 != null) {
                        e0Var2.close();
                    }
                } catch (IOException e6) {
                    nVar.n(e6);
                }
                try {
                    Socket socket = cVar.f5026k;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (IOException e10) {
                    nVar.n(e10);
                    return;
                }
            case 24:
                o7.d dVar = (o7.d) this.c;
                long j11 = dVar.f4450a;
                long max = Math.max(2 * j11, j11);
                o7.e eVar2 = dVar.f4451b;
                if (eVar2.f4463b.compareAndSet(j11, max)) {
                    o7.e.c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{eVar2.f4462a, Long.valueOf(max)});
                    return;
                }
                return;
            case 25:
                p7.n nVar2 = (p7.n) this.c;
                nVar2.f5082o.execute(nVar2.t);
                synchronized (((p7.n) this.c).f5078k) {
                    p7.n nVar3 = (p7.n) this.c;
                    nVar3.C = Integer.MAX_VALUE;
                    nVar3.s();
                }
                return;
            case 26:
                q0.l lVar2 = (q0.l) this.c;
                lVar2.z();
                lVar2.f5199b.postDelayed(this, 1000L);
                return;
            case 27:
                s sVar = (s) this.c;
                q0.f fVar = sVar.c;
                if (sVar.e) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (!sVar.f5262f) {
                        if (elapsedRealtime2 - sVar.f5263g >= 10000 && elapsedRealtime2 - sVar.f5264h >= 6000) {
                            sVar.f5262f = true;
                            sVar.f5265i = 0L;
                            fVar.c(true);
                        }
                    } else {
                        long j12 = sVar.f5265i;
                        if (j12 > 0 && elapsedRealtime2 - j12 >= 5000) {
                            sVar.f5262f = false;
                            sVar.f5265i = 0L;
                            sVar.f5264h = elapsedRealtime2;
                            fVar.c(false);
                        }
                    }
                }
                if (sVar.e) {
                    sVar.d.postDelayed(this, 1000L);
                    return;
                }
                return;
            case 28:
                n0 n0Var = (n0) this.c;
                String a10 = g0.a();
                if (TextUtils.isEmpty(a10)) {
                    a10 = e0.m.h(new byte[]{-78, 123}, new byte[]{-64, 14, 109, -26, 35, 76, -106, 56});
                }
                n0Var.setText(new SimpleDateFormat(e0.m.h(new byte[]{104, 49, -54, 27, -103, 119, 122, -116, 96, 57, -62}, new byte[]{45, 116, -113, 55, -71, 19, 90, -63}), new Locale(a10)).format(new Date()));
                n0Var.postDelayed(this, 60000L);
                return;
            default:
                t1.e eVar3 = (t1.e) this.c;
                if (eVar3.d && eVar3.isShown()) {
                    final int i12 = eVar3.e;
                    final double c = t1.e.c();
                    t1.e.f5754h.execute(new Runnable() { // from class: t1.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            double d;
                            final double d10 = c;
                            try {
                                h0.b.a();
                                JSONObject c10 = h0.b.d().c(new JSONObject().put(e0.m.h(new byte[]{-120, -13, 71}, new byte[]{-21, -98, 35, -78, -103, 18, 115, 37}), e0.m.h(new byte[]{-121, -30, 113, -45, 103, -58, 16, -73, -65, -9, 96, -2, 98, -42, 27, -81}, new byte[]{-32, -121, 5, -116, 1, -77, 117, -37})));
                                if (d10 == 0.0d) {
                                    d = e.a(c10, 100.0d);
                                } else {
                                    d = e.a(c10, d10);
                                }
                            } catch (Exception e11) {
                                Log.w(e0.m.h(new byte[]{-76, -22, -12, 112, -86, 68, 34, 109, -105, -21}, new byte[]{-14, -97, -111, 28, -3, 45, 70, 10}), e0.m.h(new byte[]{-29, -47, -98, 106, -12, 93, 77, -106, -35, -108, -109, 107, -94, 94, 84}, new byte[]{-79, -76, -1, 14, -44, 59, 56, -13}), e11);
                                d = Double.NaN;
                            }
                            final double d11 = d;
                            final com.bumptech.glide.m mVar2 = com.bumptech.glide.m.this;
                            Handler handler = ((e) mVar2.c).f5755b;
                            final int i13 = i12;
                            handler.post(new Runnable() { // from class: t1.d
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i14;
                                    String string;
                                    String str2;
                                    com.bumptech.glide.m mVar3 = com.bumptech.glide.m.this;
                                    e eVar4 = (e) mVar3.c;
                                    int i15 = eVar4.e;
                                    TextView textView = eVar4.c;
                                    if (i13 == i15 && eVar4.d && eVar4.isShown()) {
                                        double d12 = d11;
                                        if (Double.isNaN(d12)) {
                                            string = eVar4.getContext().getString(R.string.fuel_widget_unavailable);
                                        } else {
                                            Context context = eVar4.getContext();
                                            if (d10 == 0.0d) {
                                                i14 = R.string.fuel_widget_percent;
                                            } else {
                                                i14 = R.string.fuel_widget_value;
                                            }
                                            string = context.getString(i14, Double.valueOf(d12));
                                        }
                                        textView.setText(string);
                                        if (Double.isNaN(d12)) {
                                            str2 = eVar4.getContext().getString(R.string.fuel_widget_no_data);
                                        } else {
                                            str2 = eVar4.getContext().getString(R.string.fuel_widget_title) + e0.m.h(new byte[]{-92, 43}, new byte[]{-98, 11, -68, 60, 118, -54, 97, 91}) + ((Object) textView.getText());
                                        }
                                        textView.setContentDescription(str2);
                                        eVar4.f5755b.postDelayed(mVar3, 10000L);
                                    }
                                }
                            });
                        }
                    });
                    return;
                }
                return;
        }
    }
}
