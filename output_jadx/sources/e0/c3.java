package e0;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.VpnService;
import android.os.Handler;
import android.os.Looper;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import com.example.navistart.MyA11yService;
import com.example.navistart.R;
import com.example.navistart.SuperWidgets.WidgetBuilderFragment;
import com.example.navistart.TService;
import com.example.navistart.VJCT;
import java.io.IOException;
import java.util.Objects;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class c3 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1897b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c3(int i10, Object obj, Object obj2) {
        this.f1896a = i10;
        this.f1897b = obj;
        this.c = obj2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, final boolean z9) {
        String str;
        int i10 = 0;
        switch (this.f1896a) {
            case 0:
                VJCT vjct = (VJCT) this.f1897b;
                Switch r12 = (Switch) this.c;
                if (z9) {
                    Intent prepare = VpnService.prepare(vjct.f945b);
                    if (prepare != null) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(vjct);
                        vjct.f946f = builder;
                        builder.setTitle(m.h(new byte[]{-53, 86, -1, 72, -31, 117, -29, 102, -53, 116, -1, 72, -31, 117, -29, 111, 58}, new byte[]{27, -60, 47, -11, 49, -51, 51, -38}));
                        vjct.f946f.setMessage(vjct.getResources().getString(R.string.vpn_start_not_perm));
                        vjct.f946f.setPositiveButton(m.h(new byte[]{-41, 41, 94, 9}, new byte[]{7, -73, -114, -109, 115, 117, 18, 37}), new d3(i10));
                        vjct.f946f.show();
                        try {
                            vjct.startActivityForResult(prepare, 15);
                        } catch (ActivityNotFoundException unused) {
                            Toast.makeText(vjct, m.h(new byte[]{-19, -104, 78, 103, 1, -117, Base64.padSymbol, 90, -19, -116, 78, 99, 0, -73, 60, 102, -19, -116, -66, 15, 110, -38, 86, 8, ByteCompanionObject.MIN_VALUE, -23, 32, -1, 0, -75, 60, 102, -19, -115, 79, 93, 0, -72, 60, 109, -20, -71, 78, 105, 0, -66, 60, 109, -19, -124, 78, 103, 1, -123, -52, -114, 109, 119, -66, 15, 109, -38, 89, 8, -119, -23, 32, 14, 81, -37, 110, 9, -66, -23, 33, 15, 109, -38, 82}, new byte[]{Base64.padSymbol, 57, -98, -33, -48, 10, -20, -40}), 1).show();
                        }
                        vjct.e.setChecked(false);
                        return;
                    }
                    vjct.d.setVisibility(0);
                    TService.c(vjct);
                } else {
                    TextView textView = VJCT.f941g;
                    r12.setChecked(false);
                    vjct.d.setVisibility(8);
                    d2.h hVar = TService.c;
                    vjct.stopService(new Intent(vjct.getApplicationContext(), (Class<?>) TService.class));
                }
                h0.b.o().saveBoolean(m.h(new byte[]{101, 41, -43, 50, -83, 103, -109, -19, 122, 58, -34, 30, -127, 113, -107, -6, 97, 45}, new byte[]{19, 89, -69, 109, -34, 2, -31, -101}), z9);
                return;
            case 1:
                m0.m0 m0Var = (m0.m0) this.f1897b;
                final m0.k0 k0Var = (m0.k0) this.c;
                compoundButton.setOnCheckedChangeListener(null);
                compoundButton.setChecked(o4.b.y(m0Var.f3781b.e, k0Var.f3758a));
                final m0.n0 n0Var = m0Var.f3781b;
                if (!n0Var.d) {
                    n0Var.d = true;
                    final int i11 = n0Var.c;
                    final Context applicationContext = n0Var.requireContext().getApplicationContext();
                    n0Var.f3799h.setVisibility(0);
                    n0Var.f3798g.setVisibility(0);
                    n0Var.f3798g.setText(R.string.fullscreen_apps_saving);
                    n0Var.f3801j.notifyDataSetChanged();
                    w.c(-1, m0.n0.f3795k).execute(new Runnable() { // from class: m0.i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z10;
                            final boolean z11;
                            final String str2;
                            final boolean z12;
                            d1.a n10;
                            d1.a n11;
                            boolean z13;
                            String str3;
                            final n0 n0Var2 = n0.this;
                            Context context = applicationContext;
                            final int i12 = i11;
                            k0 k0Var2 = k0Var;
                            boolean z14 = z9;
                            String str4 = n0.f3795k;
                            String str5 = null;
                            try {
                                n11 = com.bumptech.glide.d.n(context);
                            } catch (Exception unused2) {
                                z10 = false;
                            }
                            try {
                                if (i12 == n0Var2.c) {
                                    String c = d1.d.c(new androidx.fragment.app.h(19, n11));
                                    String B = o4.b.B(c, k0Var2.f3758a, z14);
                                    SharedPreferences sharedPreferences = context.getSharedPreferences(e0.m.h(new byte[]{5, 15, 125, ByteCompanionObject.MAX_VALUE, -121, 50, 43, 121, 6, 20, 78, 114, -124, 33, 42}, new byte[]{99, 122, 17, 19, -12, 81, 89, 28}), 0);
                                    if (!sharedPreferences.contains(e0.m.h(new byte[]{-19, 75, 70, -90, -104, 115, -1, 118, -35, 74, 78, -73, -108, 121}, new byte[]{-126, 57, 47, -63, -15, 29, -98, 26}))) {
                                        SharedPreferences.Editor putBoolean = sharedPreferences.edit().putBoolean(e0.m.h(new byte[]{44, -39, -84, -127, 99, 43, 105, 99, 28, -40, -92, -112, 111, 33}, new byte[]{67, -85, -59, -26, 10, 69, 8, 15}), true);
                                        String h2 = e0.m.h(new byte[]{16, -102, -89, -87, 76, -60, -63, -15, 32, -119, -84, -67, 64, -60, -44}, new byte[]{ByteCompanionObject.MAX_VALUE, -24, -50, -50, 37, -86, -96, -99});
                                        if (c == null) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        SharedPreferences.Editor putBoolean2 = putBoolean.putBoolean(h2, z13);
                                        String h10 = e0.m.h(new byte[]{-79, -105, -50, 71, 44, 88, 30, -101, -127, -107, -56, 76, 44, 85, 6}, new byte[]{-34, -27, -89, 32, 69, 54, ByteCompanionObject.MAX_VALUE, -9});
                                        if (c == null) {
                                            str3 = "";
                                        } else {
                                            str3 = c;
                                        }
                                        if (!putBoolean2.putString(h10, str3).commit()) {
                                            throw new IOException(e0.m.h(new byte[]{63, 77, -110, 82, -41, -125, 32, -97, 28, 69, -99, 92, -58}, new byte[]{125, 44, -15, 57, -94, -13, 0, -7}));
                                        }
                                    }
                                    if (i12 == n0Var2.c) {
                                        str5 = d1.d.d(new androidx.fragment.app.h(19, n11), c, B);
                                        try {
                                            n11.close();
                                            z12 = true;
                                            z11 = true;
                                        } catch (Exception unused3) {
                                            z10 = true;
                                            try {
                                                n10 = com.bumptech.glide.d.n(context);
                                            } catch (Exception unused4) {
                                                z11 = z10;
                                                str2 = str5;
                                                z12 = false;
                                            }
                                            try {
                                                str5 = d1.d.c(new androidx.fragment.app.h(19, n10));
                                                n10.close();
                                                z11 = z10;
                                                z12 = true;
                                                str2 = str5;
                                                n0Var2.f3796b.post(new Runnable() { // from class: m0.j0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        String str6 = n0.f3795k;
                                                        n0 n0Var3 = n0.this;
                                                        int i13 = i12;
                                                        if (!n0Var3.t(i13)) {
                                                            return;
                                                        }
                                                        if (!z12) {
                                                            n0Var3.u(i13);
                                                            return;
                                                        }
                                                        n0Var3.e = str2;
                                                        int i14 = 0;
                                                        n0Var3.d = false;
                                                        n0Var3.f3799h.setVisibility(8);
                                                        TextView textView2 = n0Var3.f3798g;
                                                        if (z11) {
                                                            i14 = 8;
                                                        }
                                                        textView2.setVisibility(i14);
                                                        n0Var3.f3798g.setText(R.string.fullscreen_apps_save_error);
                                                        n0Var3.f3801j.notifyDataSetChanged();
                                                    }
                                                });
                                                return;
                                            } finally {
                                            }
                                        }
                                        str2 = str5;
                                        n0Var2.f3796b.post(new Runnable() { // from class: m0.j0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                String str6 = n0.f3795k;
                                                n0 n0Var3 = n0.this;
                                                int i13 = i12;
                                                if (!n0Var3.t(i13)) {
                                                    return;
                                                }
                                                if (!z12) {
                                                    n0Var3.u(i13);
                                                    return;
                                                }
                                                n0Var3.e = str2;
                                                int i14 = 0;
                                                n0Var3.d = false;
                                                n0Var3.f3799h.setVisibility(8);
                                                TextView textView2 = n0Var3.f3798g;
                                                if (z11) {
                                                    i14 = 8;
                                                }
                                                textView2.setVisibility(i14);
                                                n0Var3.f3798g.setText(R.string.fullscreen_apps_save_error);
                                                n0Var3.f3801j.notifyDataSetChanged();
                                            }
                                        });
                                        return;
                                    }
                                }
                                n11.close();
                            } finally {
                            }
                        }
                    });
                    return;
                }
                return;
            case 2:
                m0.q1 q1Var = (m0.q1) this.f1897b;
                w0.o0 o0Var = (w0.o0) this.c;
                if (o0Var.c != z9) {
                    o0Var.c = z9;
                    f5.j jVar = q1Var.d;
                    if (jVar != null) {
                        jVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                o0.a aVar = (o0.a) this.f1897b;
                o0.f fVar = (o0.f) this.c;
                aVar.f4284b.f4304a.edit().putBoolean(m.h(new byte[]{88, -82, 126, -83, -32, 73, -66, 5}, new byte[]{Base64.padSymbol, -64, 31, -49, -116, 44, -38, 90}) + fVar.name(), z9).apply();
                if (MyA11yService.d != null) {
                    Handler handler = new Handler(Looper.getMainLooper());
                    d2.h hVar2 = MyA11yService.d;
                    Objects.requireNonNull(hVar2);
                    handler.post(new a4.g(14, hVar2));
                    return;
                }
                return;
            case 4:
                x0.c cVar = (x0.c) this.f1897b;
                x0.m mVar = (x0.m) this.c;
                cVar.f6437k.put(mVar.f6460a, Boolean.valueOf(z9));
                h0.b.o().saveBoolean(m.h(new byte[]{77, -110, -43, 38, -50, -89, 33, 24, 87, -109, -58, 43, -29}, new byte[]{62, -25, -91, 67, -68, -8, 82, 111}) + cVar.c.f6470a + mVar.f6460a, z9);
                if (z9) {
                    str = mVar.d;
                } else {
                    str = mVar.e;
                }
                cVar.m(j0.f.b(cVar.getContext(), str));
                return;
            default:
                ((WidgetBuilderFragment) this.f1897b).lambda$library$4((x0.o) this.c, compoundButton, z9);
                return;
        }
    }
}
