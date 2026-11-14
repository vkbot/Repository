package com.example.navistart;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.example.navistart.R;
import com.example.navistart.VJCT;
import com.example.navistart.boot;
import com.example.navistart.punto;
import com.wireguard.android.backend.GoBackend;
import d2.h;
import e0.a2;
import e0.c3;
import e0.f3;
import e0.m;
import e0.o1;
import e0.p3;
import h0.b;
import r5.c;
import u0.a;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class VJCT extends AppCompatActivity {

    /* renamed from: g, reason: collision with root package name */
    public static TextView f941g;

    /* renamed from: h, reason: collision with root package name */
    public static TextView f942h;

    /* renamed from: i, reason: collision with root package name */
    public static Button f943i;

    /* renamed from: j, reason: collision with root package name */
    public static TextView f944j;

    /* renamed from: b, reason: collision with root package name */
    public VJCT f945b;
    public ProgressBar c;
    public LinearLayout d;
    public Switch e;

    /* renamed from: f, reason: collision with root package name */
    public AlertDialog.Builder f946f;

    public static void s(final int i10) {
        Button button = f943i;
        if (button != null) {
            button.post(new Runnable() { // from class: e0.a3
                @Override // java.lang.Runnable
                public final void run() {
                    int i11;
                    Context context = VJCT.f943i.getContext();
                    if (i10 == ContextCompat.getColor(context, R.color.gray)) {
                        i11 = R.color.modern_surface_high;
                    } else {
                        i11 = R.color.modern_primary_dark;
                    }
                    VJCT.f943i.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(context, i11)));
                }
            });
        }
    }

    public static void t(String str) {
        Button button = f943i;
        if (button != null) {
            button.post(new a2(str, 4));
        }
    }

    public static void u(String str) {
        TextView textView = f942h;
        if (textView != null) {
            textView.post(new a2(str, 5));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 15 && i11 == -1) {
            this.e.setChecked(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, android.widget.CompoundButton$OnCheckedChangeListener] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_vjct);
        this.f945b = this;
        f942h = (TextView) findViewById(R.id.vkluchit_text);
        this.c = (ProgressBar) findViewById(R.id.progressBar_v);
        f944j = (TextView) findViewById(R.id.vpn_turn2_status);
        final int i10 = 0;
        ((Button) findViewById(R.id.button25)).setOnClickListener(new View.OnClickListener(this) { // from class: e0.b3
            public final /* synthetic */ VJCT c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                VJCT vjct = this.c;
                switch (i11) {
                    case 0:
                        TextView textView = VJCT.f941g;
                        vjct.finish();
                        return;
                    case 1:
                        String t = punto.t(vjct.f945b);
                        String w = punto.w(Settings.Secure.getString(vjct.f945b.getContentResolver(), m.h(new byte[]{90, -27, -109, -20, -56, -110, -6, 39, 82, -17}, new byte[]{59, -117, -9, -98, -89, -5, -98, 120})));
                        u0.a o5 = h0.b.o();
                        byte[] bArr = m.f1973j;
                        String[] strArr = p3.f2001a;
                        String loadString = o5.loadString(new String(bArr), "");
                        String e = boot.e(h0.b.o().loadString(punto.t(vjct.f945b), "") + punto.t(vjct.f945b));
                        f3 f3Var = new f3(0);
                        f3Var.f1914b = new StringBuilder();
                        f3Var.c = -1;
                        f3Var.d = vjct;
                        f3Var.execute(t, w, loadString, e);
                        return;
                    default:
                        Intent launchIntentForPackage = vjct.f945b.getPackageManager().getLaunchIntentForPackage(m.h(new byte[]{-96, 29, 91, -50, 66, 118, -124, 90, -92, 7, 87, -110, 81, 49, -105, 81, -89, 0, 89, -119, 81}, new byte[]{-61, 114, 54, -32, 53, 31, -10, 63}));
                        if (launchIntentForPackage != null) {
                            y5.k.u(vjct, launchIntentForPackage, null);
                            return;
                        } else {
                            VJCT.f941g.setText(vjct.getResources().getString(R.string.vpn_shag2_error));
                            return;
                        }
                }
            }
        });
        final int i11 = 1;
        ((Button) findViewById(R.id.button26)).setOnClickListener(new View.OnClickListener(this) { // from class: e0.b3
            public final /* synthetic */ VJCT c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                VJCT vjct = this.c;
                switch (i112) {
                    case 0:
                        TextView textView = VJCT.f941g;
                        vjct.finish();
                        return;
                    case 1:
                        String t = punto.t(vjct.f945b);
                        String w = punto.w(Settings.Secure.getString(vjct.f945b.getContentResolver(), m.h(new byte[]{90, -27, -109, -20, -56, -110, -6, 39, 82, -17}, new byte[]{59, -117, -9, -98, -89, -5, -98, 120})));
                        u0.a o5 = h0.b.o();
                        byte[] bArr = m.f1973j;
                        String[] strArr = p3.f2001a;
                        String loadString = o5.loadString(new String(bArr), "");
                        String e = boot.e(h0.b.o().loadString(punto.t(vjct.f945b), "") + punto.t(vjct.f945b));
                        f3 f3Var = new f3(0);
                        f3Var.f1914b = new StringBuilder();
                        f3Var.c = -1;
                        f3Var.d = vjct;
                        f3Var.execute(t, w, loadString, e);
                        return;
                    default:
                        Intent launchIntentForPackage = vjct.f945b.getPackageManager().getLaunchIntentForPackage(m.h(new byte[]{-96, 29, 91, -50, 66, 118, -124, 90, -92, 7, 87, -110, 81, 49, -105, 81, -89, 0, 89, -119, 81}, new byte[]{-61, 114, 54, -32, 53, 31, -10, 63}));
                        if (launchIntentForPackage != null) {
                            y5.k.u(vjct, launchIntentForPackage, null);
                            return;
                        } else {
                            VJCT.f941g.setText(vjct.getResources().getString(R.string.vpn_shag2_error));
                            return;
                        }
                }
            }
        });
        Button button = (Button) findViewById(R.id.vpn_vkluchit);
        f943i = button;
        final int i12 = 2;
        button.setOnClickListener(new o1(i12));
        f941g = (TextView) findViewById(R.id.textView43);
        ((Button) findViewById(R.id.button_openvpn_client)).setOnClickListener(new View.OnClickListener(this) { // from class: e0.b3
            public final /* synthetic */ VJCT c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                VJCT vjct = this.c;
                switch (i112) {
                    case 0:
                        TextView textView = VJCT.f941g;
                        vjct.finish();
                        return;
                    case 1:
                        String t = punto.t(vjct.f945b);
                        String w = punto.w(Settings.Secure.getString(vjct.f945b.getContentResolver(), m.h(new byte[]{90, -27, -109, -20, -56, -110, -6, 39, 82, -17}, new byte[]{59, -117, -9, -98, -89, -5, -98, 120})));
                        u0.a o5 = h0.b.o();
                        byte[] bArr = m.f1973j;
                        String[] strArr = p3.f2001a;
                        String loadString = o5.loadString(new String(bArr), "");
                        String e = boot.e(h0.b.o().loadString(punto.t(vjct.f945b), "") + punto.t(vjct.f945b));
                        f3 f3Var = new f3(0);
                        f3Var.f1914b = new StringBuilder();
                        f3Var.c = -1;
                        f3Var.d = vjct;
                        f3Var.execute(t, w, loadString, e);
                        return;
                    default:
                        Intent launchIntentForPackage = vjct.f945b.getPackageManager().getLaunchIntentForPackage(m.h(new byte[]{-96, 29, 91, -50, 66, 118, -124, 90, -92, 7, 87, -110, 81, 49, -105, 81, -89, 0, 89, -119, 81}, new byte[]{-61, 114, 54, -32, 53, 31, -10, 63}));
                        if (launchIntentForPackage != null) {
                            y5.k.u(vjct, launchIntentForPackage, null);
                            return;
                        } else {
                            VJCT.f941g.setText(vjct.getResources().getString(R.string.vpn_shag2_error));
                            return;
                        }
                }
            }
        });
        Switch r62 = (Switch) findViewById(R.id.vpn_boot_start);
        r62.setChecked(b.o().loadBoolean(m.h(new byte[]{84, -87, 16, -115, 43, -16, -126, 47, 125, -86, 10, -77, 59, -21}, new byte[]{34, -39, 126, -46, 73, -97, -19, 91}), false));
        r62.setOnCheckedChangeListener(new Object());
        boolean loadBoolean = b.o().loadBoolean(m.h(new byte[]{-104, -38, -105, 95, -119, -28, -94, 108, -121, -55, -100, 115, -91, -14, -92, 123, -100, -34}, new byte[]{-18, -86, -7, 0, -6, -127, -48, 26}), false);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.vpn_start_lay);
        this.d = linearLayout;
        if (loadBoolean) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
        Switch r22 = (Switch) findViewById(R.id.vpn_services_start);
        this.e = r22;
        r22.setChecked(loadBoolean);
        this.e.setOnCheckedChangeListener(new c3(i10, this, r62));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        h hVar = TService.c;
        if (hVar != null) {
            try {
                GoBackend goBackend = (GoBackend) hVar.d;
                if (goBackend != null) {
                    if (goBackend.c == ((c) hVar.f1741f)) {
                        t(getResources().getString(R.string.vikluchit));
                        s(ContextCompat.getColor(this.f945b, R.color.Butt_Color));
                    }
                }
            } catch (Exception unused) {
            }
            t(getResources().getString(R.string.vkluchit));
            s(ContextCompat.getColor(this.f945b, R.color.gray));
        }
        f3 f3Var = new f3(1);
        f3Var.f1914b = new StringBuilder();
        f3Var.c = -1;
        f3Var.d = this;
        String t = punto.t(this.f945b);
        String w = punto.w(Settings.Secure.getString(this.f945b.getContentResolver(), m.h(new byte[]{-43, -78, -56, 58, 57, -63, -46, 51, -35, -72}, new byte[]{-76, -36, -84, 72, 86, -88, -74, 108})));
        a o5 = b.o();
        byte[] bArr = m.f1973j;
        String[] strArr = p3.f2001a;
        f3Var.execute(t, w, o5.loadString(new String(bArr), ""), boot.e(b.o().loadString(punto.t(this.f945b), "") + punto.t(this.f945b)));
    }
}
