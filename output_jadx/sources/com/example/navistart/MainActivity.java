package com.example.navistart;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.pm.PackageInfoCompat;
import androidx.core.os.ConfigurationCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Observer;
import androidx.navigation.c;
import b1.u;
import com.bumptech.glide.d;
import com.example.navistart.AllWidgetServices;
import com.example.navistart.LounchB;
import com.example.navistart.MainActivity;
import com.example.navistart.MockGPS.MockGpsService;
import com.example.navistart.Notik;
import com.example.navistart.OverlayService;
import com.example.navistart.Si;
import com.example.navistart.SpeedBoardService;
import com.example.navistart.SystemMessageReceiver;
import com.example.navistart.TService;
import com.example.navistart.cores.BezFunEnum;
import com.example.navistart.cores.HFunEnum;
import com.example.navistart.mainview.HeatManSetView;
import com.example.navistart.mainview.MainView;
import com.example.navistart.mainview.MainWidjet;
import com.example.navistart.mainview.YMovLay;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.google.protobuf.q;
import com.woha.atir.RadarActivity;
import com.woha.pogoda.WeatherService;
import com.woha.wifim.MainWifiManadger;
import e0.b1;
import e0.d0;
import e0.d1;
import e0.e1;
import e0.f1;
import e0.g;
import e0.g0;
import e0.i1;
import e0.j1;
import e0.k0;
import e0.m;
import e0.m0;
import e0.n0;
import e0.n3;
import e0.p0;
import e0.p3;
import e0.q0;
import e0.s0;
import e0.t0;
import e0.w;
import e0.y2;
import e0.z0;
import e0.z2;
import h0.b;
import j1.x;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import n0.f;
import s1.a1;
import u0.a;
import y5.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MainActivity extends AppCompatActivity {
    public static AllWidgetServices i1;
    public MaterialSwitch A;
    public Spinner A0;
    public MaterialSwitch B;
    public Spinner B0;
    public MaterialSwitch C;
    public Spinner C0;
    public HeatManSetView D;
    public Spinner D0;
    public HeatManSetView E;
    public Spinner E0;
    public HeatManSetView F;
    public Spinner F0;
    public HeatManSetView G;
    public Spinner G0;
    public HeatManSetView H;
    public Spinner H0;
    public HeatManSetView I;
    public Spinner I0;
    public HeatManSetView J;
    public Spinner J0;
    public HeatManSetView K;
    public Spinner K0;
    public CardView L;
    public Spinner L0;
    public CardView M;
    public Spinner M0;
    public CardView N;
    public Spinner N0;
    public CardView O;
    public Spinner O0;
    public CardView P;
    public Spinner P0;
    public CardView Q;
    public TextInputLayout Q0;
    public CardView R;
    public YMovLay R0;
    public CardView S;
    public YMovLay S0;
    public LinearLayout T;
    public YMovLay T0;
    public LinearLayout U;
    public YMovLay U0;
    public LinearLayout V;
    public YMovLay V0;
    public LinearLayout W;
    public CardView W0;
    public LinearLayout X;
    public ImageView X0;
    public LinearLayout Y;
    public CardView Y0;
    public LinearLayout Z;
    public LinearLayout Z0;

    /* renamed from: a0, reason: collision with root package name */
    public LinearLayout f757a0;

    /* renamed from: a1, reason: collision with root package name */
    public MainWidjet f758a1;

    /* renamed from: b0, reason: collision with root package name */
    public View f760b0;

    /* renamed from: b1, reason: collision with root package name */
    public Button f761b1;
    public TextView c;

    /* renamed from: c0, reason: collision with root package name */
    public View f762c0;

    /* renamed from: c1, reason: collision with root package name */
    public MainView f763c1;

    /* renamed from: d0, reason: collision with root package name */
    public View f764d0;

    /* renamed from: e0, reason: collision with root package name */
    public MaterialSwitch f766e0;

    /* renamed from: f0, reason: collision with root package name */
    public MaterialSwitch f768f0;

    /* renamed from: g0, reason: collision with root package name */
    public MaterialSwitch f770g0;

    /* renamed from: h0, reason: collision with root package name */
    public MaterialSwitch f772h0;

    /* renamed from: i0, reason: collision with root package name */
    public MaterialSwitch f774i0;

    /* renamed from: j0, reason: collision with root package name */
    public MaterialSwitch f776j0;

    /* renamed from: k0, reason: collision with root package name */
    public MaterialSwitch f778k0;

    /* renamed from: l0, reason: collision with root package name */
    public MaterialSwitch f780l0;

    /* renamed from: m0, reason: collision with root package name */
    public MaterialSwitch f782m0;

    /* renamed from: n0, reason: collision with root package name */
    public MaterialSwitch f784n0;

    /* renamed from: o0, reason: collision with root package name */
    public MaterialSwitch f786o0;

    /* renamed from: p0, reason: collision with root package name */
    public MaterialSwitch f788p0;

    /* renamed from: q0, reason: collision with root package name */
    public MaterialSwitch f790q0;

    /* renamed from: r0, reason: collision with root package name */
    public MaterialSwitch f791r0;

    /* renamed from: s0, reason: collision with root package name */
    public FlexboxLayout f793s0;
    public String[] t;

    /* renamed from: t0, reason: collision with root package name */
    public MaterialSwitch f794t0;

    /* renamed from: u, reason: collision with root package name */
    public String[] f795u;

    /* renamed from: u0, reason: collision with root package name */
    public MaterialSwitch f796u0;

    /* renamed from: v, reason: collision with root package name */
    public String[] f797v;

    /* renamed from: v0, reason: collision with root package name */
    public MaterialSwitch f798v0;

    /* renamed from: w0, reason: collision with root package name */
    public MaterialSwitch f799w0;

    /* renamed from: x, reason: collision with root package name */
    public TabLayout f800x;

    /* renamed from: x0, reason: collision with root package name */
    public MaterialSwitch f801x0;

    /* renamed from: y, reason: collision with root package name */
    public MaterialSwitch f802y;

    /* renamed from: y0, reason: collision with root package name */
    public MaterialSwitch f803y0;

    /* renamed from: z, reason: collision with root package name */
    public MaterialSwitch f804z;

    /* renamed from: z0, reason: collision with root package name */
    public Spinner f805z0;

    /* renamed from: e1, reason: collision with root package name */
    public static final String f750e1 = m.h(new byte[]{-94, 118, -39, 111, 110, -2, -40, 49, -88, 45, -114, 119, 97, -12, -39, 44, -66, 98, -127, ByteCompanionObject.MAX_VALUE}, new byte[]{-48, 3, -9, 22, 15, -112, -68, 84});

    /* renamed from: f1, reason: collision with root package name */
    public static final String f751f1 = m.h(new byte[]{87, -59, -4}, new byte[]{39, -82, -101, 10, -44, 14, -67, -117});

    /* renamed from: g1, reason: collision with root package name */
    public static final String f752g1 = m.h(new byte[]{43, 108, -4, -30, 48, -96, -20, -44, 4, 89, -34, -30, 34, -91, -15, -43, 53, 79, -40, -36, 49, -92, -38, -35, 31}, new byte[]{106, 60, -84, -67, 67, -48, -123, -70});

    /* renamed from: h1, reason: collision with root package name */
    public static final String f753h1 = m.h(new byte[]{8, -65, -126, ByteCompanionObject.MIN_VALUE, -80, 43, 23, 70, 2, -73, -97, -115, -65, 19, 59, 95, 2, -74, -124, -123, -114, 23, 11, 92, 19, -96, -126, -120, -114, 16, 13, 65, 6, -80, -127, -127, -75}, new byte[]{103, -46, -19, -28, -47, 116, 100, 50});

    /* renamed from: j1, reason: collision with root package name */
    public static Long f754j1 = -1L;

    /* renamed from: k1, reason: collision with root package name */
    public static final String[] f755k1 = {m.h(new byte[]{58, 118, 67, 99, -58, -90, -5}, new byte[]{99, 59, 28, 81, -10, -120, -55, -3}), m.h(new byte[]{46, 10, -62, 27, -42, -111}, new byte[]{119, 68, -99, 42, -8, -89, 121, 102}), m.h(new byte[]{-46, -44, 17, 45, 77, -13}, new byte[]{-117, -102, 78, 26, 99, -62, 24, -41}), m.h(new byte[]{13, 117, 24, -55}, new byte[]{122, 20, 98, -84, -78, 29, 34, -102}), m.h(new byte[]{113, 50, -58, -8, -32, 2, -109, 84, 92, 26, -22, -66}, new byte[]{40, ByteCompanionObject.MAX_VALUE, -103, -54, -48, 44, -95, 11})};

    /* renamed from: l1, reason: collision with root package name */
    public static Boolean f756l1 = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f759b = true;
    public int d = 0;
    public final Handler e = new Handler(Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public String f767f = p3.b(2) + p3.b(4) + p3.a(6) + p3.a(0) + m.h(new byte[]{29}, new byte[]{51, 24, 58, -13, 46, 124, Base64.padSymbol, -60}) + p3.c(5) + p3.c(7);

    /* renamed from: g, reason: collision with root package name */
    public final String f769g = m.h(new byte[]{47, -89, -126, 20, -84, -118, 113, 102, 9, -122, -70, 17, -89}, new byte[]{104, -12, -35, 120, -55, -20, 5, 43});

    /* renamed from: h, reason: collision with root package name */
    public final String f771h = m.h(new byte[]{117, 59, -96, -30, -67, -116, -104, -104, 64, 15, -106, -8}, new byte[]{50, 104, -1, -106, -46, -4, -43, -7});

    /* renamed from: i, reason: collision with root package name */
    public final String f773i = m.h(new byte[]{-122, -97, 65, 92}, new byte[]{-73, -84, 116, 108, -30, -39, 87, 11});

    /* renamed from: j, reason: collision with root package name */
    public final String f775j = m.h(new byte[]{-106, -91, -54}, new byte[]{-94, -107, -6, -92, 19, -70, 87, 1});

    /* renamed from: k, reason: collision with root package name */
    public final String f777k = m.h(new byte[]{46, -90, 118, -38, -117, -111, -13, 28, 12, -103, 78, -33, ByteCompanionObject.MIN_VALUE}, new byte[]{109, -21, 41, -74, -18, -9, -121, 81});

    /* renamed from: l, reason: collision with root package name */
    public final String f779l = m.h(new byte[]{118, -109, 103, -29, 47, -91, -52, 114, 71, -71, 81, -7}, new byte[]{53, -34, 56, -105, 64, -43, -127, 19});

    /* renamed from: m, reason: collision with root package name */
    public final String f781m = m.h(new byte[]{52, 76, -21, -85}, new byte[]{5, 120, -37, -101, 1, 37, -13, -62});

    /* renamed from: n, reason: collision with root package name */
    public final String f783n = m.h(new byte[]{-16, -62, 106}, new byte[]{-62, -9, 90, 54, -68, -70, -53, -76});

    /* renamed from: o, reason: collision with root package name */
    public final String f785o = m.h(new byte[]{112, 98, 63, 54, 11, -90, -59, 18, 87, 83, 7, 51, 0}, new byte[]{54, 33, 96, 90, 110, -64, -79, 95});

    /* renamed from: p, reason: collision with root package name */
    public final String f787p = m.h(new byte[]{36, 69, 103, 15, -108, 97, -77, 92, 15, 75, 89, 31, -100, 124, -87}, new byte[]{98, 6, 56, 109, -5, 21, -57, 51});

    /* renamed from: q, reason: collision with root package name */
    public final String f789q = m.h(new byte[]{-106, -35, -126}, new byte[]{-95, -24, -78, 67, 43, 40, -3, -78});
    public final String r = m.h(new byte[]{-33, -33, -58}, new byte[]{-18, -22, -10, -15, 18, 111, 80, -86});

    /* renamed from: s, reason: collision with root package name */
    public final String f792s = m.h(new byte[]{-23, -123, -8}, new byte[]{-40, -77, -56, -25, -67, 29, -28, -44});
    public String w = "";

    /* renamed from: d1, reason: collision with root package name */
    public final HashMap f765d1 = new HashMap();

    public static String B(String str) {
        Class<?> cls = Class.forName(m.h(new byte[]{-16, 31, 20, 14, -3, 15, 93, 112, -2, 2, 94, 47, -21, 21, 77, 59, -4, 33, 2, 19, -30, 3, 75, 42, -8, 20, 3}, new byte[]{-111, 113, 112, 124, -110, 102, 57, 94}));
        return (String) cls.getMethod(m.h(new byte[]{ByteCompanionObject.MAX_VALUE, -97, 56}, new byte[]{24, -6, 76, -114, 9, 66, -21, 58}), String.class).invoke(cls, str);
    }

    public static void s(MainActivity mainActivity) {
        if (ContextCompat.checkSelfPermission(mainActivity, m.h(new byte[]{-7, -23, -80, 56, 15, -13, 6, 24, -24, -30, -90, 39, 9, -23, 17, 95, -9, -23, -6, 11, 35, -39, 39, 101, -53, -40, -110, 3, 46, -33, Base64.padSymbol, 122, -41, -60, -107, 30, 41, -43, 44}, new byte[]{-104, -121, -44, 74, 96, -102, 98, 54})) == 0) {
            if (Build.VERSION.SDK_INT >= 29 && ContextCompat.checkSelfPermission(mainActivity, m.h(new byte[]{100, 107, 76, 18, 84, 20, 77, 35, 117, 96, 90, 13, 82, 14, 90, 100, 106, 107, 6, 33, 120, 62, 108, 94, 86, 90, 106, 33, 120, 54, 110, 95, 74, 80, 102, 36, 100, 49, 102, 78, 68, 81, 97, 47, 117}, new byte[]{5, 5, 40, 96, 59, 125, 41, 13})) != 0) {
                ActivityCompat.requestPermissions(mainActivity, new String[]{m.h(new byte[]{-7, 0, -82, 106, -35, 5, -87, -63, -24, 11, -72, 117, -37, 31, -66, -122, -9, 0, -28, 89, -15, 47, -120, -68, -53, 49, -120, 89, -15, 39, -118, -67, -41, 59, -124, 92, -19, 32, -126, -84, -39, 58, -125, 87, -4}, new byte[]{-104, 110, -54, 24, -78, 108, -51, -17})}, 100);
                return;
            }
            return;
        }
        ActivityCompat.requestPermissions(mainActivity, new String[]{m.h(new byte[]{ByteCompanionObject.MAX_VALUE, -68, -30, 120, 57, -47, -79, -127, 110, -73, -12, 103, 63, -53, -90, -58, 113, -68, -88, 75, 21, -5, -112, -4, 77, -115, -64, 67, 24, -3, -118, -29, 81, -111, -57, 94, 31, -9, -101}, new byte[]{30, -46, -122, 10, 86, -72, -43, -81})}, 100);
    }

    public static boolean v(Context context) {
        if ((context.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public static boolean w() {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean x9;
        try {
            String[] strArr = p3.f2001a;
            String B = B(u.g(strArr[0]));
            String B2 = B(u.g(strArr[1]));
            String B3 = B(u.g(strArr[2]));
            if (B != null && (B.contains(u.g(strArr[3])) || B.contains(u.g(strArr[4])))) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (B2 != null && B2.equals(m.h(new byte[]{118}, new byte[]{71, 77, -16, 84, -89, -23, -54, 69}))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (B3 != null && (B3.contains(u.g(strArr[5])) || B3.contains(u.g(strArr[6])))) {
                z11 = true;
            } else {
                z11 = false;
            }
            x9 = x();
        } catch (Exception unused) {
        }
        if (!z9 && !z10 && !z11 && !x9) {
            return false;
        }
        return true;
    }

    public static boolean x() {
        Boolean bool = f756l1;
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = p3.f2001a;
        String[] strArr2 = {u.g(strArr[7]), u.g(strArr[8]), u.g(strArr[9]), u.g(strArr[10])};
        for (int i10 = 0; i10 < 4; i10++) {
            if (new File(strArr2[i10]).exists()) {
                f756l1 = Boolean.TRUE;
                return true;
            }
        }
        f756l1 = Boolean.FALSE;
        return false;
    }

    public static int y(String str, ArrayList arrayList) {
        if (str != null && !str.isEmpty()) {
            for (int i10 = 1; i10 < arrayList.size(); i10++) {
                if (str.equals(((j1) arrayList.get(i10)).f1946a)) {
                    return i10;
                }
            }
            return 0;
        }
        return 0;
    }

    public final int A() {
        return this.f800x.getSelectedTabPosition() + 1;
    }

    public final void C() {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rg_phev_drive_mode);
        int i10 = 0;
        int loadInt = b.o().loadInt(m.h(new byte[]{-101, 114, 20, 15, 72, 94, 96, -126, -101, 101, 34, 10, 72, 109, 104, -114, -117, 105, 18, 23}, new byte[]{-1, 0, 125, 121, 45, 1, 13, -19}), 0);
        if (loadInt == 1) {
            radioGroup.check(R.id.rb_phev_drive_mode_eco);
        } else if (loadInt == 2) {
            radioGroup.check(R.id.rb_phev_drive_mode_normal);
        } else if (loadInt == 3) {
            radioGroup.check(R.id.rb_phev_drive_mode_sport);
        } else {
            radioGroup.check(R.id.rb_phev_drive_mode_not_set);
        }
        radioGroup.setOnCheckedChangeListener(new p0(this, i10));
    }

    public final void D() {
        int i10;
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rg_exlantix_drive_mode);
        final int[] iArr = {R.id.rb_exlantix_drive_mode_not_set, R.id.rb_exlantix_drive_mode_eco, R.id.rb_exlantix_drive_mode_comfort, R.id.rb_exlantix_drive_mode_sport, R.id.rb_exlantix_drive_mode_manual};
        int i11 = 0;
        int loadInt = b.o().loadInt(m.h(new byte[]{-48, 63, 77, 82, -101, 96, -88, -6, -22, 35, 83, 90, -125, 113, -98, -17, -38, 35, 68, 108, -122, 113, -83, -25, -42, 51, 72, 92, -101}, new byte[]{-75, 71, 33, 51, -11, 20, -63, -126}), 0);
        final View findViewById = findViewById(R.id.lay_exlantix_manual_config);
        if (loadInt == 4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        findViewById.setVisibility(i10);
        E(R.id.rg_exlantix_manual_engine, new int[]{R.id.ex_manual_engine_unset, R.id.ex_manual_engine_comfort, R.id.ex_manual_engine_standard, R.id.ex_manual_engine_sport}, new int[]{0, 1, 2, 3}, m.h(new byte[]{66, -113, -121, 12, -99, 40, -18, 77, 120, -102, -118, 3, -122, Base64.padSymbol, -21, 106, 66, -103, -116, 4, -99, 57}, new byte[]{39, -9, -21, 109, -13, 92, -121, 53}), m.h(new byte[]{-16, 91, -22, 63, -66, -78}, new byte[]{-107, 53, -115, 86, -48, -41, 35, -83}));
        E(R.id.rg_exlantix_manual_steering, new int[]{R.id.ex_manual_steering_unset, R.id.ex_manual_steering_comfort, R.id.ex_manual_steering_sport}, new int[]{0, 1, 2}, m.h(new byte[]{-89, 90, -37, 5, -125, 17, -93, -17, -99, 79, -42, 10, -104, 4, -90, -56, -79, 86, -46, 1, -97, 12, -92, -16}, new byte[]{-62, 34, -73, 100, -19, 101, -54, -105}), m.h(new byte[]{-115, -121, 76, 78, -45, -38, -20, 108}, new byte[]{-2, -13, 41, 43, -95, -77, -126, 11}));
        E(R.id.rg_exlantix_manual_damping, new int[]{R.id.ex_manual_damping_unset, R.id.ex_manual_damping_soft, R.id.ex_manual_damping_hard}, new int[]{0, 1, 3}, m.h(new byte[]{-45, -49, 53, 16, 78, -115, 82, -20, -23, -38, 56, 31, 85, -104, 87, -53, -59, -62, 42, 1, 69, -105, 72, -3, -39, -39, 6, 21, 65, -108, 75, -3, -40, -48}, new byte[]{-74, -73, 89, 113, 32, -7, 59, -108}), m.h(new byte[]{-23, -57, 110, 3, 82, -35, -37, 94, -11, -36, 66, 23, 86, -34, -40, 94, -12, -43}, new byte[]{-102, -78, 29, 115, 55, -77, -88, 55}));
        if (loadInt >= 0 && loadInt < 5) {
            i11 = loadInt;
        }
        radioGroup.check(iArr[i11]);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: e0.r0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i12) {
                String str = MainActivity.f750e1;
                int i13 = 8;
                if (n0.c.B.name().equals(h0.b.o().loadString(m.h(new byte[]{53, -13, -78, -17, 11, 44, 46, -120, 26, -41}, new byte[]{118, -78, -32, -65, 121, 67, 72, -31}), ""))) {
                    for (int i14 = 0; i14 < 5; i14++) {
                        if (iArr[i14] == i12) {
                            h0.b.o().saveInt(m.h(new byte[]{36, 34, 15, -89, -117, 60, 79, 68, 30, 62, 17, -81, -109, 45, 121, 81, 46, 62, 6, -103, -106, 45, 74, 89, 34, 46, 10, -87, -117}, new byte[]{65, 90, 99, -58, -27, 72, 38, 60}), i14);
                            if (i14 == 4) {
                                i13 = 0;
                            }
                            findViewById.setVisibility(i13);
                            x.a();
                            return;
                        }
                    }
                }
            }
        });
    }

    public final void E(int i10, final int[] iArr, final int[] iArr2, final String str, final String str2) {
        RadioGroup radioGroup = (RadioGroup) findViewById(i10);
        int loadInt = b.o().loadInt(str, 0);
        int i11 = iArr[0];
        for (int i12 = 0; i12 < iArr2.length; i12++) {
            if (iArr2[i12] == loadInt) {
                i11 = iArr[i12];
            }
        }
        radioGroup.check(i11);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: e0.u0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i13) {
                String str3 = MainActivity.f750e1;
                if (x.b()) {
                    int i14 = 0;
                    while (true) {
                        int[] iArr3 = iArr;
                        if (i14 < iArr3.length) {
                            if (i13 == iArr3[i14]) {
                                u0.a o5 = h0.b.o();
                                int[] iArr4 = iArr2;
                                o5.saveInt(str, iArr4[i14]);
                                int i15 = iArr4[i14];
                                if (x.b() && h0.b.o().loadInt(x.f2062a, 0) == 4) {
                                    String str4 = str2;
                                    if (x.d(i15, str4)) {
                                        x.c(i15, str4);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i14++;
                        } else {
                            return;
                        }
                    }
                }
            }
        });
    }

    public final void F() {
        HFunEnum hFunEnum = HFunEnum.ID_VCU_DISCHARGE_SWITCH;
        MaterialSwitch materialSwitch = (MaterialSwitch) findViewById(R.id.sw_jaecoo_discharge_v2l);
        materialSwitch.setChecked(b.o().loadBoolean(hFunEnum.name(), false));
        materialSwitch.setOnCheckedChangeListener(new s0(this, hFunEnum));
        HFunEnum hFunEnum2 = HFunEnum.ID_VCU_ELECTRONIC_LOCKING_UNLOCKS;
        MaterialSwitch materialSwitch2 = (MaterialSwitch) findViewById(R.id.sw_jaecoo_charge_discharge_gun_locked);
        materialSwitch2.setChecked(b.o().loadBoolean(hFunEnum2.name(), false));
        materialSwitch2.setOnCheckedChangeListener(new s0(this, hFunEnum2));
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rg_jaecoo_power_mode);
        int loadInt = b.o().loadInt(m.h(new byte[]{-23, -105, 66, 88, -32, 10, -7, 17, -20, -127, 66, 73, -48, 8, -55, 5, -26}, new byte[]{-125, -10, 39, 59, -113, 101, -90, 97}), 0);
        int i10 = 2;
        int i11 = 1;
        if (loadInt == 1) {
            radioGroup.check(R.id.rb_jaecoo_power_mode_ev);
        } else if (loadInt == 2) {
            radioGroup.check(R.id.rb_jaecoo_power_mode_hev);
        } else {
            radioGroup.check(R.id.rb_jaecoo_power_mode_not_set);
        }
        radioGroup.setOnCheckedChangeListener(new p0(this, i11));
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.rg_jaecoo_energy_recycle);
        int loadInt2 = b.o().loadInt(m.h(new byte[]{-6, 36, 21, -114, 115, 63, 107, -92, -2, 32, 2, -118, 101, 15, 70, -92, -13, 60, 19, -127, 121, 15, 88, -92, -26, 32, 28}, new byte[]{-112, 69, 112, -19, 28, 80, 52, -63}), 0);
        if (loadInt2 == 0) {
            radioGroup2.check(R.id.rb_jaecoo_energy_recycle_not_set);
        } else if (loadInt2 == 1) {
            radioGroup2.check(R.id.rb_jaecoo_energy_recycle_low);
        } else if (loadInt2 == 2) {
            radioGroup2.check(R.id.rb_jaecoo_energy_recycle_medium);
        } else if (loadInt2 == 3) {
            radioGroup2.check(R.id.rb_jaecoo_energy_recycle_high);
        } else {
            radioGroup2.check(R.id.rb_jaecoo_energy_recycle_not_set);
        }
        radioGroup2.setOnCheckedChangeListener(new p0(this, i10));
        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.rg_jaecoo_battery_protection);
        int loadInt3 = b.o().loadInt(m.h(new byte[]{24, -97, 126, 70, -125, 87, 68, 24, 19, -118, 111, 64, -98, 65, 68, 10, 0, -111, 111, 64, -113, 76, 114, 21, 28, -95, 118, 74, -120, 93}, new byte[]{114, -2, 27, 37, -20, 56, 27, 122}), 0);
        if (loadInt3 == 0) {
            radioGroup3.check(R.id.rb_jaecoo_battery_not_set);
        } else if (loadInt3 == 1) {
            radioGroup3.check(R.id.rb_jaecoo_battery_initial);
        } else if (loadInt3 == 2) {
            radioGroup3.check(R.id.rb_jaecoo_battery_smart);
        } else if (loadInt3 == 4) {
            radioGroup3.check(R.id.rb_jaecoo_battery_forced);
        } else {
            radioGroup3.check(R.id.rb_jaecoo_battery_not_set);
        }
        radioGroup3.setOnCheckedChangeListener(new p0(this, 3));
    }

    public final void G(int i10, String str) {
        MaterialSwitch materialSwitch = (MaterialSwitch) findViewById(i10);
        materialSwitch.setChecked(b.o().loadBoolean(str, false));
        materialSwitch.setOnCheckedChangeListener(new t0(this, str, materialSwitch, 0));
    }

    public final void I() {
        this.R0.setYLayMovX(b.o().loadString(this.f769g, this.f773i));
        this.R0.setYLayMovY(b.o().loadString(this.f771h, this.f775j));
        this.S0.setYLayMovX(b.o().loadString(this.f777k, this.f781m));
        this.S0.setYLayMovY(b.o().loadString(this.f779l, this.f783n));
        this.T0.setYLayMovX(b.o().loadString(this.f785o, this.f789q));
        this.T0.setYLayMovY(b.o().loadString(this.f787p, this.r));
        YMovLay yMovLay = this.U0;
        a o5 = b.o();
        String h2 = m.h(new byte[]{-30, 21, -1, -84, -26, -97, 84, -92, -39, 29, -5, -118, -8, -72, 112, -124}, new byte[]{-81, 116, -113, -13, -89, -4, 32, -51});
        String str = this.f792s;
        yMovLay.setYLayMovX(o5.loadString(h2, str));
        this.V0.setYLayMovX(b.o().loadString(m.h(new byte[]{-56, -101, 28, 88, 112, -69, 120, 81, -13, -109, 24, 126, 110, -100, 92, 113, -38, -67, 57}, new byte[]{-123, -6, 108, 7, 49, -40, 12, 56}), str));
    }

    public void J(boolean z9) {
        ColorMatrixColorFilter colorMatrixColorFilter;
        if (this.X0 != null) {
            if (z9) {
                colorMatrixColorFilter = null;
            } else {
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(0.0f);
                colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
            }
            new Handler(Looper.getMainLooper()).post(new a1.a(16, this, colorMatrixColorFilter));
        }
    }

    public final void K(String str) {
        MaterialSwitch materialSwitch = (MaterialSwitch) findViewById(R.id.sw_tracker_map);
        materialSwitch.setChecked(b.o().loadBoolean(str, false));
        materialSwitch.setOnCheckedChangeListener(new s0(0, str));
    }

    public final void L(boolean z9) {
        this.D.setTempSliderEnable(z9);
        this.E.setTempSliderEnable(z9);
        this.F.setTempSliderEnable(z9);
        this.G.setTempSliderEnable(z9);
        this.H.setTempSliderEnable(z9);
        this.I.setTempSliderEnable(z9);
        this.J.setTempSliderEnable(z9);
    }

    public final void M(Spinner spinner, ArrayList arrayList, String str, boolean z9) {
        i1 i1Var = new i1(this, arrayList);
        spinner.setAdapter((SpinnerAdapter) i1Var);
        spinner.setPrompt(getString(R.string.select_application));
        int y9 = y(b.o().loadString(str, ""), arrayList);
        if (y9 == 0) {
            y9 = y(f750e1, arrayList);
        }
        String str2 = ((j1) arrayList.get(y9)).f1946a;
        b.o().saveString(str, str2);
        if (z9) {
            this.w = str2;
        }
        spinner.setSelection(y9, false);
        spinner.setOnItemSelectedListener(new z0(this, i1Var, str, z9));
    }

    public final void N() {
        this.F.setLevel(b.o().loadInt(q.k(new byte[]{23, -61, -102, 46, 85, -56, 34, 121, 12, -50, -109, 40, 70, -59, 46, 120, 31, -45, -102, 59, 81, -44, 41, 116, 18, -58, -111, 36, 91, -44, 34, 112, 17, -44, -115}, new byte[]{94, -121, -59, 109, 20, -102, 125, Base64.padSymbol}, new StringBuilder(), this), 0));
        this.D.setLevel(b.o().loadInt(q.k(new byte[]{-104, -44, -2, -55, -95, -35, -125, -23, -125, -39, -9, -49, -78, -48, -113, -24, -112, -60, -2, -62, -91, -50, -120, -14, -100, -33, -14, -62}, new byte[]{-47, -112, -95, -118, -32, -113, -36, -83}, new StringBuilder(), this), 0));
        this.E.setLevel(b.o().loadInt(q.k(new byte[]{-106, -73, 102, -2, 23, -107, ByteCompanionObject.MAX_VALUE, -122, -112, -93, 112, -15, 25, -109, ByteCompanionObject.MAX_VALUE, -106, -102, -78, 109, -30, 30, -126, 97, -111, ByteCompanionObject.MIN_VALUE, -66, 118, -18, 30}, new byte[]{-33, -13, 57, -67, 86, -57, 32, -59}, new StringBuilder(), this), 0));
        this.G.setLevel(b.o().loadInt(q.k(new byte[]{101, -117, 94, 78, 101, -32, -54, -55, 99, -97, 72, 65, 107, -26, -54, -39, 105, -114, 85, 82, 114, -9, -37, -34, 101, -125, 64, 89, 109, -3, -37, -43, 97, ByteCompanionObject.MIN_VALUE, 82, 69}, new byte[]{44, -49, 1, 13, 36, -78, -107, -118}, new StringBuilder(), this), 0));
        this.H.setisEnable(Boolean.valueOf(b.o().loadBoolean(q.k(new byte[]{50, 81, 88, -3, -31, 122, 33, -69, 47, 80, 66, -20, -1, ByteCompanionObject.MAX_VALUE, 54, -83, 62, 89, 88, -10, -27, 105, 42}, new byte[]{123, 21, 7, -66, -96, 40, 126, -24}, new StringBuilder(), this), false)));
        this.I.setisEnable(Boolean.valueOf(b.o().loadBoolean(q.k(new byte[]{72, 1, -89, 10, 17, -40, 79, 27, 78, 11, -84, 20, 21, -53, 72, 26, 82, 26, -80, 14, 19, -45}, new byte[]{1, 69, -8, 75, 82, -121, 9, 73}, new StringBuilder(), this), false)));
        this.J.setisEnable(Boolean.valueOf(b.o().loadBoolean(q.k(new byte[]{80, 70, -17, 14, -47, 22, -54, 25, 88, 80, -17, 11, -41, 15, -54, 19, 74, 86}, new byte[]{25, 2, -80, 79, -110, 73, -104, 92}, new StringBuilder(), this), false)));
        this.K.setisEnable(Boolean.valueOf(b.o().loadBoolean(q.k(new byte[]{-13, -35, 26, -72, -79, -36, 12, -122, -34, -4, 18, -68, -127, -30, 4, -122, -45, -41, 31, -76, -98, -45, 1, -107, -46, -45, 40, -110, -69}, new byte[]{-89, -76, 119, -35, -11, -67, 96, -25}, new StringBuilder(), this), true)));
        L(this.K.getisEnable().booleanValue());
        this.F.setTemperatureValue(b.o().loadInt(q.k(new byte[]{-100, 109, -71, -11, 114, -43, 3, -94, -121, 96, -80, -13, 97, -40, 15, -93, -108, 125, -71, -32, 118, -55, 8, -81, -103, 104, -78, -1, 124, -55, 3, -78, -112, 100, -74}, new byte[]{-43, 41, -26, -74, 51, -121, 92, -26}, new StringBuilder(), this), 20));
        this.D.setTemperatureValue(b.o().loadInt(q.k(new byte[]{-76, 106, 83, 4, -17, -81, -115, 24, -81, 103, 90, 2, -4, -94, -127, 25, -68, 122, 83, 15, -21, -68, -122, 3, -87, 107, 65, 23}, new byte[]{-3, 46, 12, 71, -82, -3, -46, 92}, new StringBuilder(), this), -5));
        this.E.setTemperatureValue(b.o().loadInt(q.k(new byte[]{81, 82, 58, -111, -55, 1, -61, 95, 87, 70, 44, -98, -57, 7, -61, 79, 93, 87, 49, -115, -64, 22, -35, 72, 71, 66, 32, -97, -40}, new byte[]{24, 22, 101, -46, -120, 83, -100, 28}, new StringBuilder(), this), -5));
        this.G.setTemperatureValue(b.o().loadInt(q.k(new byte[]{-92, 56, -126, 2, 11, -67, 112, -31, -94, 44, -108, 13, 5, -69, 112, -15, -88, Base64.padSymbol, -119, 30, 28, -86, 97, -10, -92, 48, -100, 21, 3, -96, 97, -3, -71, 57, -112, 17}, new byte[]{-19, 124, -35, 65, 74, -17, 47, -94}, new StringBuilder(), this), 20));
        this.H.setTemperatureValue(b.o().loadInt(q.k(new byte[]{-49, 105, 92, 78, 27, 17, -60, -91, -46, 104, 70, 95, 5, 20, -45, -77, -61, 97, 92, 69, 31, 2, -49, -87, -46, 104, 78, 93}, new byte[]{-122, 45, 3, 13, 90, 67, -101, -10}, new StringBuilder(), this), -5));
        this.I.setTemperatureValue(b.o().loadInt(q.k(new byte[]{81, -96, 55, 20, 35, -126, 49, -13, 87, -86, 60, 10, 39, -111, 54, -14, 75, -69, 32, 16, 33, -119, 40, -11, 93, -87, 56}, new byte[]{24, -28, 104, 85, 96, -35, 119, -95}, new StringBuilder(), this), -5));
        this.J.setTemperatureValue(b.o().loadInt(q.k(new byte[]{-99, 63, 118, -122, 76, -101, -5, 20, -107, 41, 118, -125, 74, -126, -5, 30, -121, 47, 118, -109, 74, -119, -7}, new byte[]{-44, 123, 41, -57, 15, -60, -87, 81}, new StringBuilder(), this), -5));
        this.K.setTemperatureValue(b.o().loadInt(q.k(new byte[]{57, -107, -39, -15, 79, 1, 51, -37, 20, -76, -47, -11, ByteCompanionObject.MAX_VALUE, 63, 48, -50, 50, -97, -43, -26, 120, 20, 62, -56, 25}, new byte[]{109, -4, -76, -108, 11, 96, 95, -70}, new StringBuilder(), this), 0));
        this.F.setTimeValue(b.o().loadInt(q.k(new byte[]{-33, 1, 84, 60, -127, -115, 37, 126, -60, 12, 93, 58, -110, ByteCompanionObject.MIN_VALUE, 41, ByteCompanionObject.MAX_VALUE, -41, 17, 84, 41, -123, -111, 46, 115, -38, 4, 95, 54, -113, -111, 37, 78, -1, 40, 110, 32, -92, -70, 22, 91, -17, 26, 68, 57, -122}, new byte[]{-106, 69, 11, ByteCompanionObject.MAX_VALUE, -64, -33, 122, 58}, new StringBuilder(), this), 0));
        this.D.setTimeValue(b.o().loadInt(q.k(new byte[]{9, 78, 24, 89, 120, -34, 43, 118, 18, 67, 17, 95, 107, -45, 39, 119, 1, 94, 24, 82, 124, -51, 32, 109, 52, 99, 42, ByteCompanionObject.MAX_VALUE, 102, -24, 17, 94, 33, 115, 24, 85, ByteCompanionObject.MAX_VALUE, -54}, new byte[]{64, 10, 71, 26, 57, -116, 116, 50}, new StringBuilder(), this), 0));
        this.E.setTimeValue(b.o().loadInt(q.k(new byte[]{-52, 74, -115, 64, -57, -62, 71, 120, -54, 94, -101, 79, -55, -60, 71, 104, -64, 79, -122, 92, -50, -43, 89, 111, -38, 122, -69, 110, -29, -49, 124, 94, -23, 111, -85, 92, -55, -42, 94}, new byte[]{-123, 14, -46, 3, -122, -112, 24, 59}, new StringBuilder(), this), 0));
        this.G.setTimeValue(b.o().loadInt(q.k(new byte[]{-59, -3, -118, -84, 19, 7, 0, 112, -61, -23, -100, -93, 29, 1, 0, 96, -55, -8, -127, -80, 4, 16, 17, 103, -59, -11, -108, -69, 27, 26, 17, 108, -8, -48, -72, -118, 13, 49, 58, 95, -19, -64, -118, -96, 20, 19}, new byte[]{-116, -71, -43, -17, 82, 85, 95, 51}, new StringBuilder(), this), 0));
        this.H.setTimeValue(b.o().loadInt(q.k(new byte[]{-78, 62, 45, -21, -77, -67, -16, -2, -81, 63, 55, -6, -83, -72, -25, -24, -66, 54, 45, -32, -73, -82, -5, -14, -113, 19, 31, -51, -83, -117, -54, -63, -102, 3, 45, -25, -76, -87}, new byte[]{-5, 122, 114, -88, -14, -17, -81, -83}, new StringBuilder(), this), 0));
        this.I.setTimeValue(b.o().loadInt(q.k(new byte[]{51, -79, 95, -11, 62, 18, 111, -96, 53, -69, 84, -21, 58, 1, 104, -95, 41, -86, 72, -15, 60, 25, 118, -122, 19, -104, 101, -21, 25, 40, 69, -109, 3, -86, 79, -14, 59}, new byte[]{122, -11, 0, -76, 125, 77, 41, -14}, new StringBuilder(), this), 0));
        this.J.setTimeValue(b.o().loadInt(q.k(new byte[]{0, -114, 63, 77, -85, -103, 3, -104, 8, -104, 63, 72, -83, ByteCompanionObject.MIN_VALUE, 3, -110, 26, -98, 63, 120, -127, -85, 52, -126, 45, -81, 12, 109, -111, -103, 30, -101, 15}, new byte[]{73, -54, 96, 12, -24, -58, 81, -35}, new StringBuilder(), this), 0));
        this.K.setTimeValue(b.o().loadInt(q.k(new byte[]{-63, -57, -46, 45, -101, -17, -117, -15, -20, -15, -16, 38, ByteCompanionObject.MIN_VALUE, -63, -127, -10, -54, -3, -4, 26, -102, -53, -87}, new byte[]{-107, -82, -65, 72, -33, -114, -25, -112}, new StringBuilder(), this), 0));
        this.f766e0.setChecked(b.o().loadBoolean(q.k(new byte[]{-106, -19, -15, 49, -73, 5, -64, -64, -118, -25, -3, 58, -73, 19, -38}, new byte[]{-33, -87, -82, 114, -10, 87, -97, -109}, new StringBuilder(), this), false));
        byte[] bArr = {-27, -65, -28, -87, 97, -52, -22, -69, -51, -90, -33, -96, 87};
        byte[] bArr2 = {-92, -54, -112, -58, 49, -66, -123, -35};
        q.v(bArr, bArr2, b.o(), false, this.f768f0);
        byte[] bArr3 = {115, -90, -74, -74, 58, -119, 37, 22, 109, -77, -86, -116, 59, -112, 48, 59};
        byte[] bArr4 = {0, -46, -60, -23, 78, -26, 85, 73};
        q.v(bArr3, bArr4, b.o(), true, this.f770g0);
        byte[] bArr5 = {112, -14, -93, -48, 20, -98, -124, -6, 126, -9, -85};
        byte[] bArr6 = {28, -101, -50, -113, 98, -9, -9, -109};
        q.v(bArr5, bArr6, b.o(), false, this.f772h0);
    }

    public final void O(MaterialSwitch materialSwitch) {
        View inflate = getLayoutInflater().inflate(R.layout.dialog_launcher_default, (ViewGroup) null, false);
        final AlertDialog create = new AlertDialog.Builder(this).setView(inflate).create();
        inflate.findViewById(R.id.button_launcher_android_method).setOnClickListener(new n0(this, create, materialSwitch, 0));
        inflate.findViewById(R.id.button_launcher_dialog_close).setOnClickListener(new c(5, create));
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: e0.o0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                String str = MainActivity.f750e1;
                AlertDialog alertDialog = create;
                if (alertDialog.getWindow() == null) {
                    return;
                }
                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                alertDialog.getWindow().setLayout((int) (MainActivity.this.getResources().getDisplayMetrics().widthPixels * 0.9f), -2);
            }
        });
        create.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, android.widget.AdapterView$OnItemSelectedListener] */
    public final void P() {
        int loadInt;
        int i10;
        String str;
        String str2;
        Drawable defaultActivityIcon;
        int i11 = 1;
        this.f800x.a(new d4.m(i11, this));
        this.F.setTempRun(new m0(this, i11));
        this.D.setTempRun(new m0(this, 8));
        this.E.setTempRun(new m0(this, 9));
        this.G.setTempRun(new m0(this, 10));
        this.H.setTempRun(new m0(this, 11));
        this.I.setTempRun(new m0(this, 12));
        this.J.setTempRun(new m0(this, 13));
        this.K.setTimeRun(new m0(this, 14));
        this.F.setTimeRun(new m0(this, 15));
        this.D.setTimeRun(new m0(this, 16));
        int i12 = 2;
        this.E.setTimeRun(new m0(this, i12));
        this.G.setTimeRun(new m0(this, 3));
        this.H.setTimeRun(new m0(this, 4));
        this.I.setTimeRun(new m0(this, 5));
        this.J.setTimeRun(new m0(this, 6));
        this.K.setTempRun(new m0(this, 7));
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_text, this.f795u);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown);
        Spinner spinner = (Spinner) findViewById(R.id.spinner25);
        this.L0 = spinner;
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        this.L0.setPrompt(m.h(new byte[]{44, -43, -4, 24, -49}, new byte[]{120, -68, -120, 116, -86, -30, 106, -3}));
        int i13 = 0;
        this.L0.setSelection(0);
        this.L0.setOnItemSelectedListener(new b1(this, i13));
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner14);
        this.C0 = spinner2;
        spinner2.setOnItemSelectedListener(new b1(this, i11));
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, R.layout.spinner_text, this.t);
        arrayAdapter2.setDropDownViewResource(R.layout.simple_spinner_dropdown);
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner13);
        this.B0 = spinner3;
        spinner3.setAdapter((SpinnerAdapter) arrayAdapter2);
        this.B0.setPrompt(m.h(new byte[]{94, 56, 12, -16, 14}, new byte[]{10, 81, 120, -100, 107, -8, 51, 100}));
        this.B0.setSelection(0);
        this.B0.setOnItemSelectedListener(new b1(this, i12));
        u();
        this.D0 = (Spinner) findViewById(R.id.spinner15);
        b.a();
        b.f().m(this.D0, m.h(new byte[]{-121, -84, 44, 109, -90, -95, -82, 71, -48, -124}, new byte[]{-75, -13, 72, 2, -47, -49, -15, 41}));
        this.E0 = (Spinner) findViewById(R.id.spinner16);
        b.a();
        b.f().m(this.E0, m.h(new byte[]{11, 69, -92, -82, 104, 43, 98, -13, 93, 109}, new byte[]{56, 26, -64, -63, 31, 69, Base64.padSymbol, -99}));
        this.F0 = (Spinner) findViewById(R.id.spinner17);
        b.a();
        b.f().m(this.F0, m.h(new byte[]{-57, 95, 25, -52, 29, Base64.padSymbol, -89, Base64.padSymbol, -112, 119}, new byte[]{-11, 0, 117, -87, 123, 73, -8, 83}));
        this.G0 = (Spinner) findViewById(R.id.spinner18);
        b.a();
        b.f().m(this.G0, m.h(new byte[]{-97, -13, -98, -68, 3, -5, -50, -66, -55, -37}, new byte[]{-84, -84, -14, -39, 101, -113, -111, -48}));
        this.H0 = (Spinner) findViewById(R.id.spinner19);
        b.a();
        b.f().m(this.H0, m.h(new byte[]{-70, -8, 33, -12, -84, -97, 96, -33, -26, -62, 36}, new byte[]{-120, -89, 83, -99, -53, -9, 20, ByteCompanionObject.MIN_VALUE}));
        this.I0 = (Spinner) findViewById(R.id.spinner20);
        b.a();
        b.f().m(this.I0, m.h(new byte[]{-41, -108, 84, -67, -29, -4, -49, -74, -118, -82, 81}, new byte[]{-28, -53, 38, -44, -124, -108, -69, -23}));
        this.J0 = (Spinner) findViewById(R.id.spinner21);
        b.a();
        b.f().m(this.J0, m.h(new byte[]{-52, 56, 8, 41, 120, 122, 85, -95}, new byte[]{-2, 103, 125, 89, 39, 20, 48, -42}));
        this.K0 = (Spinner) findViewById(R.id.spinner22);
        b.a();
        b.f().m(this.K0, m.h(new byte[]{-2, -49, -100, 14, 66, -4, 97, -95}, new byte[]{-51, -112, -23, 126, 29, -110, 4, -42}));
        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this, R.layout.spinner_text, this.f797v);
        arrayAdapter3.setDropDownViewResource(R.layout.simple_spinner_dropdown);
        Spinner spinner4 = (Spinner) findViewById(R.id.spinner8);
        this.A0 = spinner4;
        spinner4.setAdapter((SpinnerAdapter) arrayAdapter3);
        this.A0.setPrompt(m.h(new byte[]{2, 79, -44, 101, -47}, new byte[]{86, 38, -96, 9, -76, -40, 31, 13}));
        if (this.f797v.length - 1 < b.o().loadInt(m.h(new byte[]{70, 110, -81, -125, 36, -55, 28, Base64.padSymbol, 107}, new byte[]{31, 35, -50, -13, 87, -123, 117, 78}), 0)) {
            loadInt = 0;
        } else {
            loadInt = b.o().loadInt(m.h(new byte[]{29, 85, 21, 108, 77, 3, -32, -77, 48}, new byte[]{68, 24, 116, 28, 62, 79, -119, -64}), 0);
        }
        this.A0.setSelection(loadInt);
        this.A0.setOnItemSelectedListener(new Object());
        String[] h2 = d.h(n0.c.class);
        String[] j10 = d.j(n0.c.class);
        ArrayAdapter arrayAdapter4 = new ArrayAdapter(this, R.layout.spinner_text, h2);
        arrayAdapter4.setDropDownViewResource(R.layout.simple_spinner_dropdown);
        Spinner spinner5 = (Spinner) findViewById(R.id.spinner26);
        this.M0 = spinner5;
        spinner5.setAdapter((SpinnerAdapter) arrayAdapter4);
        this.M0.setPrompt(m.h(new byte[]{101, 126, -18, -16, -124}, new byte[]{49, 23, -102, -100, -31, 63, -7, 71}));
        String loadString = b.o().loadString(m.h(new byte[]{-94, 104, -60, 66, -12, 120, -104, 115, -115, 76}, new byte[]{-31, 41, -106, 18, -122, 23, -2, 26}), null);
        if (loadString == null || loadString.isEmpty()) {
            loadString = n0.c.values()[0].name();
        }
        int indexOf = Arrays.asList(j10).indexOf(loadString);
        Spinner spinner6 = this.M0;
        if (indexOf != -1) {
            i10 = indexOf;
        } else {
            i10 = 0;
        }
        spinner6.setSelection(i10);
        this.M0.setSelection(indexOf);
        this.M0.setOnItemSelectedListener(new d1(i13, this, j10));
        this.N0 = (Spinner) findViewById(R.id.spinner27);
        b.a();
        b.f().m(this.N0, m.h(new byte[]{42, 88, 21, -126, 41, 50, -92, 34, 21, 82, 20, -77, 36, 63, -111}, new byte[]{102, 55, 96, -20, 74, 90, -26, 125}));
        View findViewById = findViewById(R.id.button_open_antiradar);
        findViewById.setOnClickListener(new q0(this, i13));
        String h10 = m.h(new byte[]{-91, -31, 39, -84, -7, -51, -29, 15, -73, -29, 47, -90, -10, -38, -50, 32, -92, -2}, new byte[]{-42, -111, 78, -62, -105, -88, -111, 80});
        androidx.core.view.inputmethod.a aVar = new androidx.core.view.inputmethod.a(findViewById);
        String[] h11 = d.h(n0.a.class);
        String[] j11 = d.j(n0.a.class);
        ArrayAdapter arrayAdapter5 = new ArrayAdapter(this, R.layout.spinner_text, h11);
        arrayAdapter5.setDropDownViewResource(R.layout.simple_spinner_dropdown);
        Spinner spinner7 = (Spinner) findViewById(R.id.spinner_aradar);
        spinner7.setAdapter((SpinnerAdapter) arrayAdapter5);
        spinner7.setPrompt(m.h(new byte[]{84, -13, -95, -31, -7}, new byte[]{0, -102, -43, -115, -100, 10, 27, -33}));
        String loadString2 = b.o().loadString(h10, null);
        if (loadString2 == null || loadString2.isEmpty()) {
            loadString2 = ((Enum[]) n0.a.class.getEnumConstants())[0].name();
        }
        int indexOf2 = Arrays.asList(j11).indexOf(loadString2);
        if (indexOf2 == -1) {
            indexOf2 = 0;
        }
        spinner7.setSelection(indexOf2);
        spinner7.setOnItemSelectedListener(new f1(j11, h10, aVar));
        String[] h12 = d.h(f.class);
        String[] j12 = d.j(f.class);
        ArrayAdapter arrayAdapter6 = new ArrayAdapter(this, R.layout.spinner_text, h12);
        arrayAdapter6.setDropDownViewResource(R.layout.simple_spinner_dropdown);
        Spinner spinner8 = (Spinner) findViewById(R.id.spinner_pogoda_widg);
        this.O0 = spinner8;
        spinner8.setAdapter((SpinnerAdapter) arrayAdapter6);
        this.O0.setPrompt(m.h(new byte[]{-74, -14, 17, 6, 35}, new byte[]{-30, -101, 101, 106, 70, 8, -70, 122}));
        String loadString3 = b.o().loadString(m.h(new byte[]{114, 102, -33, -89, 115, 38, -118, 34, 113, 121, -47, -90, 121, 34, -89, 10, 104, 114, -47, -106, 109, 49, -105}, new byte[]{1, 22, -74, -55, 29, 67, -8, 125}), null);
        if (loadString3 == null || loadString3.isEmpty()) {
            loadString3 = f.values()[0].name();
        }
        int indexOf3 = Arrays.asList(j12).indexOf(loadString3);
        Spinner spinner9 = this.O0;
        if (indexOf3 == -1) {
            indexOf3 = 0;
        }
        spinner9.setSelection(indexOf3);
        this.O0.setOnItemSelectedListener(new e1(i13, j12));
        this.f805z0 = (Spinner) findViewById(R.id.spinner5);
        this.P0 = (Spinner) findViewById(R.id.spinner_auto_start_gu);
        PackageManager packageManager = getPackageManager();
        Intent intent = new Intent(m.h(new byte[]{-45, -122, 2, -123, -105, 42, -48, -10, -37, -122, 18, -110, -106, 55, -102, -71, -47, -100, 15, -104, -106, 109, -7, -103, -5, -90}, new byte[]{-78, -24, 102, -9, -8, 67, -76, -40}));
        intent.addCategory(m.h(new byte[]{-20, 116, 42, -80, 56, 112, -99, 33, -28, 116, 58, -89, 57, 109, -41, 108, -20, 110, 43, -91, 56, 107, ByteCompanionObject.MIN_VALUE, 33, -63, 91, 27, -116, 20, 81, -68, 93}, new byte[]{-115, 26, 78, -62, 87, 25, -7, 15}));
        HashMap hashMap = new HashMap();
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo != null && (str = activityInfo.packageName) != null && !hashMap.containsKey(str)) {
                CharSequence loadLabel = resolveInfo.loadLabel(packageManager);
                if (loadLabel != null && loadLabel.length() != 0) {
                    str2 = loadLabel.toString();
                } else {
                    str2 = str;
                }
                try {
                    defaultActivityIcon = resolveInfo.loadIcon(packageManager);
                } catch (RuntimeException unused) {
                    defaultActivityIcon = packageManager.getDefaultActivityIcon();
                }
                hashMap.put(str, new j1(str, str2, defaultActivityIcon));
            }
        }
        ArrayList arrayList = new ArrayList(hashMap.values());
        arrayList.sort(new androidx.constraintlayout.core.utils.a(i11));
        arrayList.add(0, new j1("", getString(R.string.select_application), packageManager.getDefaultActivityIcon()));
        M(this.f805z0, arrayList, f751f1, true);
        M(this.P0, arrayList, f752g1, false);
    }

    public final void Q(MainActivity mainActivity) {
        Intent intent = new Intent(mainActivity.getApplicationContext(), (Class<?>) boot.class);
        intent.putExtra(m.h(new byte[]{-7}, new byte[]{-99, 79, 77, 106, -62, -121, 24, -103}), -1);
        startService(intent);
    }

    public native boolean isEmulator();

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z9;
        super.onCreate(bundle);
        this.t = new String[]{getResources().getString(R.string.voditel1), getResources().getString(R.string.voditel2), getResources().getString(R.string.voditel3)};
        final int i10 = 9;
        final int i11 = 8;
        int i12 = 18;
        final int i13 = 10;
        this.f795u = new String[]{getResources().getString(R.string.vibrat_profil), m.h(new byte[]{66, 123, 76, -83, 51, -92, -70, 42, 63}, new byte[]{8, 26, 41, -50, 92, -53, -102, 96}), m.h(new byte[]{12, 52, -40, 64, -37, 96, -8, 72, 126, 122, -8, 91, -47, 106, -68, 34, 20, 13}, new byte[]{70, 85, -67, 35, -76, 15, -40, 2}), m.h(new byte[]{-18, -81, -38, 123, 72, 13, -110, -94, -102, -2}, new byte[]{-70, -58, -67, 28, 39, 45, -91, -114}), m.h(new byte[]{-44, -85, 108, -24, 50, 2, 73, -95, -84}, new byte[]{-98, -50, 24, -121, 71, 112, 105, -11})};
        this.f797v = new String[]{getResources().getString(R.string.name_karti_20_uni), getResources().getString(R.string.name_navi_ari), getResources().getString(R.string.name_navi_uni7), m.h(new byte[]{-66, 76, 75, 105}, new byte[]{-23, 45, 49, 12, -96, -122, 122, 103})};
        final int i14 = 1;
        AppCompatDelegate.setDefaultNightMode(1);
        byte[] bArr = punto.f1066v;
        String str = z2.f2092a;
        punto.f1065u = new String(bArr);
        d0.d(this);
        this.f767f = new String(punto.w);
        setContentView(z());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), new g(5));
        new HashMap();
        int i15 = 2;
        boolean loadBoolean = b.o().loadBoolean(m.h(new byte[]{-108, 64}, new byte[]{-11, 53, -104, 86, 97, -114, 90, -51}), false);
        if (loadBoolean) {
            this.e.post(new m0(this, i12));
        }
        d0.d(this);
        if (!loadBoolean) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) punto.class);
            if (Build.VERSION.SDK_INT >= 34) {
                intent.addFlags(268435456);
            }
            k.v(this, intent);
            finish();
        } else {
            m.c();
            setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayShowTitleEnabled(false);
            }
            isEmulator();
            d0.d(this);
            this.f802y = (MaterialSwitch) findViewById(R.id.switch1);
            this.f804z = (MaterialSwitch) findViewById(R.id.switch2);
            this.A = (MaterialSwitch) findViewById(R.id.switch3);
            this.B = (MaterialSwitch) findViewById(R.id.switch4);
            this.f766e0 = (MaterialSwitch) findViewById(R.id.switch8);
            this.f768f0 = (MaterialSwitch) findViewById(R.id.switch9);
            this.f770g0 = (MaterialSwitch) findViewById(R.id.switch10);
            this.f772h0 = (MaterialSwitch) findViewById(R.id.switch11);
            this.f786o0 = (MaterialSwitch) findViewById(R.id.switch15);
            this.Z0 = (LinearLayout) findViewById(R.id.Dashboard);
            this.f758a1 = (MainWidjet) findViewById(R.id.MainWidjet);
            this.f763c1 = (MainView) findViewById(R.id.main_lounchb);
            this.c = (TextView) findViewById(R.id.textview_tek_temp_za_bort);
            this.V = (LinearLayout) findViewById(R.id.lay_start_stop_off);
            this.W = (LinearLayout) findViewById(R.id.lay_speed_limit_alarm_off);
            this.X = (LinearLayout) findViewById(R.id.lay_fiksik_on_off);
            this.Z = (LinearLayout) findViewById(R.id.lay_exlantix_physical_buttons);
            this.f757a0 = (LinearLayout) findViewById(R.id.lay_omoda_steering_media_control);
            this.f760b0 = findViewById(R.id.lay_jaecoo_phev_modes);
            this.f762c0 = findViewById(R.id.lay_phev_drive_mode);
            this.f764d0 = findViewById(R.id.lay_exlantix_drive_mode);
            MaterialSwitch materialSwitch = (MaterialSwitch) findViewById(R.id.sw_omoda_disable_steering_media_control);
            materialSwitch.setChecked(b.o().loadBoolean(f753h1, true));
            materialSwitch.setOnCheckedChangeListener(new k0(11));
            MaterialSwitch materialSwitch2 = (MaterialSwitch) findViewById(R.id.sw_start_stop_off);
            this.f801x0 = materialSwitch2;
            q.v(new byte[]{119, -31, 41, -32, -71, 3, 9, -74, 91, -27, 2, -4, -67, Base64.padSymbol, 20, -92, 98}, new byte[]{4, -106, 118, -109, -51, 98, 123, -62}, b.o(), false, materialSwitch2);
            this.f801x0.setOnCheckedChangeListener(new k0(17));
            MaterialSwitch materialSwitch3 = (MaterialSwitch) findViewById(R.id.sw_speed_limit_alarm_off);
            this.f803y0 = materialSwitch3;
            q.v(new byte[]{112, -9, 60, 118, 85, -42, -61, -53, 92, -20, 10, 104, 76, -57, -7, -50, 111, -31, 17, 104, 122, -36, -64, -55}, new byte[]{3, ByteCompanionObject.MIN_VALUE, 99, 5, 37, -77, -90, -81}, b.o(), false, materialSwitch3);
            int i16 = 19;
            this.f803y0.setOnCheckedChangeListener(new k0(i16));
            MaterialSwitch materialSwitch4 = (MaterialSwitch) findViewById(R.id.HUDNaviOnOff);
            this.f774i0 = materialSwitch4;
            final int i17 = 12;
            q.v(new byte[]{-40, -102, 108, 88, 91, -125, 25, -58, -2, ByteCompanionObject.MIN_VALUE, 78, 112}, new byte[]{-112, -49, 40, 22, 58, -11, 112, -119}, b.o(), true, materialSwitch4);
            this.f774i0.setOnCheckedChangeListener(new k0(22));
            MaterialSwitch materialSwitch5 = (MaterialSwitch) findViewById(R.id.switch_map_activity_fullscreen_gu);
            this.f782m0 = materialSwitch5;
            int i18 = 26;
            q.v(new byte[]{-119, 79, -68, 44, 12, 95, 9, 96, -78, 71, -72, 10, 18, 122, 40, 69, -120, 125, -113, 33, 8, 121, 51, 86, -125, 123}, new byte[]{-60, 46, -52, 115, 77, 60, 125, 9}, b.o(), true, materialSwitch5);
            final int i19 = 13;
            this.f782m0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: e0.l0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MainActivity f1959b;

                {
                    this.f1959b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    RelativeLayout relativeLayout;
                    RelativeLayout relativeLayout2;
                    int i20;
                    switch (i19) {
                        case 0:
                            MainActivity mainActivity = this.f1959b;
                            String str2 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-60, -53, 107, 79, -77, 24, -89, 15, -6, -47, 123}, new byte[]{-120, -92, 30, 33, -48, 112, -27, 91}), z10);
                            boolean loadBoolean2 = h0.b.o().loadBoolean(m.h(new byte[]{-19, -62, -4, -76, -87, -9, 82, 0, -63, -41, -42, -83, -88, -12, 72}, new byte[]{-98, -75, -93, -39, -36, -101, 38, 105}), false);
                            if (z10) {
                                LounchB.c(mainActivity);
                                r5.c cVar = LounchB.f747h;
                                if (cVar != null && (relativeLayout2 = ((LounchB) cVar.c).f748b) != null) {
                                    relativeLayout2.setVisibility(0);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean2) {
                                r5.c cVar2 = LounchB.f747h;
                                if (cVar2 != null && (relativeLayout = ((LounchB) cVar2.c).f748b) != null) {
                                    relativeLayout.setVisibility(8);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager = LounchB.f746g;
                            mainActivity.stopService(new Intent(mainActivity, (Class<?>) LounchB.class));
                            return;
                        case 1:
                            MainActivity mainActivity2 = this.f1959b;
                            String str3 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{105, -56, -43, 92, 59, -26, -126, 121, 69, -35, -1, 69, 58, -27, -104}, new byte[]{26, -65, -118, 49, 78, -118, -10, 16}), z10);
                            boolean loadBoolean3 = h0.b.o().loadBoolean(m.h(new byte[]{34, -97, -78, -81, 126, -63, 107, -8, 28, -123, -94}, new byte[]{110, -16, -57, -63, 29, -87, 41, -84}), false);
                            if (z10) {
                                LounchB.c(mainActivity2);
                                r5.c cVar3 = LounchB.f747h;
                                if (cVar3 != null) {
                                    ((LounchB) cVar3.c).b(true);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean3) {
                                r5.c cVar4 = LounchB.f747h;
                                if (cVar4 != null) {
                                    ((LounchB) cVar4.c).b(false);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager2 = LounchB.f746g;
                            mainActivity2.stopService(new Intent(mainActivity2, (Class<?>) LounchB.class));
                            return;
                        case 2:
                            MainActivity mainActivity3 = this.f1959b;
                            String str4 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{22, 10, -105, -66, -75, -9, -93, 15, 4, 34, -65, -89, -66, -9, -109, 4, 11, 18, -82, -88}, new byte[]{101, 125, -56, -50, -38, -112, -52, 107}), z10);
                            if (z10) {
                                WeatherService.e(mainActivity3);
                                return;
                            } else {
                                boolean z11 = WeatherService.f1686f;
                                mainActivity3.stopService(new Intent(mainActivity3, (Class<?>) WeatherService.class));
                                return;
                            }
                        case 3:
                            MainActivity mainActivity4 = this.f1959b;
                            String str5 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-116, 46, -84, -101, 100, 117, -91, 13, -98, 42, -99, -106, 114, 123}, new byte[]{-1, 89, -13, -7, 1, 15, -54, 125}), z10);
                            FlexboxLayout flexboxLayout = mainActivity4.f793s0;
                            for (int i21 = 0; i21 < flexboxLayout.getChildCount(); i21++) {
                                flexboxLayout.getChildAt(i21).setEnabled(z10);
                            }
                            if (!z10) {
                                FlexboxLayout flexboxLayout2 = mainActivity4.f793s0;
                                for (int i22 = 0; i22 < flexboxLayout2.getChildCount(); i22++) {
                                    ((MaterialSwitch) flexboxLayout2.getChildAt(i22)).setChecked(false);
                                }
                                h0.b.o().saveBoolean(m.h(new byte[]{68, 18, -70, 67, 56, 122, -80, 114}, new byte[]{55, 101, -27, 48, 76, 21, -36, 25}), false);
                                return;
                            }
                            return;
                        case 4:
                            MainActivity mainActivity5 = this.f1959b;
                            String str6 = MainActivity.f750e1;
                            String h2 = m.h(new byte[]{-50, -81, 29, 122, 103, 126, 25, 32, -46, -91, 17, 113, 103, 104, 3}, new byte[]{-121, -21, 66, 57, 38, 44, 70, 115});
                            u0.a o5 = h0.b.o();
                            StringBuilder u8 = ai.onnxruntime.a.u(h2);
                            u8.append(mainActivity5.A());
                            o5.saveBoolean(u8.toString(), z10);
                            return;
                        case 5:
                            MainActivity mainActivity6 = this.f1959b;
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-97, -7, 52, -80, -63, 54, 57, -61, -75, -3, 39, -85, -50, 50, 19, -28, -79, -3, 37}, new byte[]{-48, -113, 81, -62, -83, 87, 64, -112}), z10);
                            if (z10) {
                                OverlayService.c(mainActivity6);
                                return;
                            }
                            OverlayService overlayService = OverlayService.f865f;
                            mainActivity6.stopService(new Intent(mainActivity6.getApplicationContext(), (Class<?>) OverlayService.class));
                            boolean z12 = Si.d;
                            Context applicationContext = mainActivity6.getApplicationContext();
                            applicationContext.stopService(new Intent(applicationContext, (Class<?>) Si.class));
                            return;
                        case 6:
                            MainActivity mainActivity7 = this.f1959b;
                            String str8 = MainActivity.f750e1;
                            try {
                                h0.b.o().saveBoolean(MockGpsService.r, z10);
                            } catch (Exception unused) {
                            }
                            if (z10) {
                                MockGpsService.m(mainActivity7);
                                return;
                            } else {
                                MockGpsService.b(mainActivity7);
                                mainActivity7.stopService(new Intent(mainActivity7, (Class<?>) MockGpsService.class));
                                return;
                            }
                        case 7:
                            MainActivity mainActivity8 = this.f1959b;
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(Notik.f856m, z10);
                            if (z10) {
                                Notik.g(mainActivity8);
                                return;
                            } else {
                                mainActivity8.getApplicationContext().stopService(new Intent(mainActivity8.getApplicationContext(), (Class<?>) Notik.class));
                                return;
                            }
                        case 8:
                            MainActivity mainActivity9 = this.f1959b;
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(SpeedBoardService.f890k, z10);
                            if (z10) {
                                SpeedBoardService.b(mainActivity9.getApplicationContext());
                                return;
                            } else {
                                Context applicationContext2 = mainActivity9.getApplicationContext();
                                applicationContext2.stopService(new Intent(applicationContext2.getApplicationContext(), (Class<?>) SpeedBoardService.class));
                                return;
                            }
                        case 9:
                            MainActivity mainActivity10 = this.f1959b;
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-41, -101, -118, -81, 87, -106, 41, 34, -9, -72, -86, -98, 87, -109, 37, 53, -10, -114, -65, -110, 123, -84, 46, 60, -28}, new byte[]{-127, -47, -55, -5, 8, -59, 76, 80}), z10);
                            if (z10) {
                                h0.b.o().saveBoolean(m.h(new byte[]{-55, -94, Base64.padSymbol, -120, -39, 119, 3, 91, -42, -79, 54, -92, -11, 97, 5, 76, -51, -90}, new byte[]{-65, -46, 83, -41, -86, 18, 113, 45}), true);
                                TService.c(mainActivity10.getApplicationContext());
                                TService.a(Boolean.TRUE);
                                return;
                            }
                            TService.a(Boolean.FALSE);
                            return;
                        case 10:
                            MainActivity mainActivity11 = this.f1959b;
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{41, -104, -57, -91, 108, 113, -79, 0, 49, -121, -58, -80, 86, 118, -69, 44, 42, -108, -50}, new byte[]{94, -15, -93, -62, 9, 5, -62, 95}), z10);
                            new SystemMessageReceiver().onReceive(mainActivity11.getApplicationContext(), new Intent(m.h(new byte[]{42, 46, -109, -91, -102, 9, 5, -100, 34, 46, -125, -78, -101, 20, 79, -45, 40, 52, -98, -72, -101, 78, 35, -3, 4, 20, -88, -108, -70, 45, 49, -2, 14, 20, -78, -109}, new byte[]{75, 64, -9, -41, -11, 96, 97, -78})));
                            return;
                        case 11:
                            MainActivity mainActivity12 = this.f1959b;
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{114, 109, -96, 86, 11, 40, ByteCompanionObject.MAX_VALUE, -101, 71, 82, -87, 115, 20, 37, 123, -101, 64, 94, -97, 104, 12, 43, 116, -101, 100, 104, -94, 101, 13, 59, 71, -79, 93}, new byte[]{51, 1, -52, 1, 98, 76, 24, -2}), z10);
                            h hVar = h.f1929i;
                            AllWidgetServices allWidgetServices = MainActivity.i1;
                            if (allWidgetServices != null) {
                                allWidgetServices.e(hVar, z10);
                            }
                            if (z10 && MainActivity.i1 == null) {
                                AllWidgetServices.c(mainActivity12);
                                return;
                            }
                            return;
                        case 12:
                            MainActivity mainActivity13 = this.f1959b;
                            String str14 = MainActivity.f750e1;
                            String str15 = s1.a1.f5463a;
                            ComponentName componentName = new ComponentName(mainActivity13.getPackageName(), s1.a1.f5463a);
                            PackageManager packageManager = mainActivity13.getPackageManager();
                            if (z10) {
                                i20 = 1;
                            } else {
                                i20 = 2;
                            }
                            packageManager.setComponentEnabledSetting(componentName, i20, 1);
                            return;
                        case 13:
                            MainActivity mainActivity14 = this.f1959b;
                            String str16 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{97, -20, 2, 79, 40, 84, -127, -32, 90, -28, 6, 105, 54, 113, -96, -59, 96, -34, 49, 66, 44, 114, -69, -42, 107, -40}, new byte[]{44, -115, 114, 16, 105, 55, -11, -119}), z10);
                            n3.a(mainActivity14);
                            return;
                        default:
                            MainActivity mainActivity15 = this.f1959b;
                            String str17 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{89, -93, 75, 63, 70, 93, -107, -66, 98, -85, 79, 25, 88, 115, -96, -113, 75, -110, 126, 50, 65, 113, -77, -102, 85, -116, 120, 37}, new byte[]{20, -62, 59, 96, 7, 62, -31, -41}), z10);
                            n3.a(mainActivity15);
                            return;
                    }
                }
            });
            MaterialSwitch materialSwitch6 = (MaterialSwitch) findViewById(R.id.switch_map_activity_max_performance);
            this.f784n0 = materialSwitch6;
            q.v(new byte[]{109, 67, 123, 1, 40, -75, 6, -58, 86, 75, ByteCompanionObject.MAX_VALUE, 39, 54, -101, 51, -9, ByteCompanionObject.MAX_VALUE, 114, 78, 12, 47, -103, 32, -30, 97, 108, 72, 27}, new byte[]{32, 34, 11, 94, 105, -42, 114, -81}, b.o(), false, materialSwitch6);
            final int i20 = 14;
            this.f784n0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: e0.l0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MainActivity f1959b;

                {
                    this.f1959b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    RelativeLayout relativeLayout;
                    RelativeLayout relativeLayout2;
                    int i202;
                    switch (i20) {
                        case 0:
                            MainActivity mainActivity = this.f1959b;
                            String str2 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-60, -53, 107, 79, -77, 24, -89, 15, -6, -47, 123}, new byte[]{-120, -92, 30, 33, -48, 112, -27, 91}), z10);
                            boolean loadBoolean2 = h0.b.o().loadBoolean(m.h(new byte[]{-19, -62, -4, -76, -87, -9, 82, 0, -63, -41, -42, -83, -88, -12, 72}, new byte[]{-98, -75, -93, -39, -36, -101, 38, 105}), false);
                            if (z10) {
                                LounchB.c(mainActivity);
                                r5.c cVar = LounchB.f747h;
                                if (cVar != null && (relativeLayout2 = ((LounchB) cVar.c).f748b) != null) {
                                    relativeLayout2.setVisibility(0);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean2) {
                                r5.c cVar2 = LounchB.f747h;
                                if (cVar2 != null && (relativeLayout = ((LounchB) cVar2.c).f748b) != null) {
                                    relativeLayout.setVisibility(8);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager = LounchB.f746g;
                            mainActivity.stopService(new Intent(mainActivity, (Class<?>) LounchB.class));
                            return;
                        case 1:
                            MainActivity mainActivity2 = this.f1959b;
                            String str3 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{105, -56, -43, 92, 59, -26, -126, 121, 69, -35, -1, 69, 58, -27, -104}, new byte[]{26, -65, -118, 49, 78, -118, -10, 16}), z10);
                            boolean loadBoolean3 = h0.b.o().loadBoolean(m.h(new byte[]{34, -97, -78, -81, 126, -63, 107, -8, 28, -123, -94}, new byte[]{110, -16, -57, -63, 29, -87, 41, -84}), false);
                            if (z10) {
                                LounchB.c(mainActivity2);
                                r5.c cVar3 = LounchB.f747h;
                                if (cVar3 != null) {
                                    ((LounchB) cVar3.c).b(true);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean3) {
                                r5.c cVar4 = LounchB.f747h;
                                if (cVar4 != null) {
                                    ((LounchB) cVar4.c).b(false);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager2 = LounchB.f746g;
                            mainActivity2.stopService(new Intent(mainActivity2, (Class<?>) LounchB.class));
                            return;
                        case 2:
                            MainActivity mainActivity3 = this.f1959b;
                            String str4 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{22, 10, -105, -66, -75, -9, -93, 15, 4, 34, -65, -89, -66, -9, -109, 4, 11, 18, -82, -88}, new byte[]{101, 125, -56, -50, -38, -112, -52, 107}), z10);
                            if (z10) {
                                WeatherService.e(mainActivity3);
                                return;
                            } else {
                                boolean z11 = WeatherService.f1686f;
                                mainActivity3.stopService(new Intent(mainActivity3, (Class<?>) WeatherService.class));
                                return;
                            }
                        case 3:
                            MainActivity mainActivity4 = this.f1959b;
                            String str5 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-116, 46, -84, -101, 100, 117, -91, 13, -98, 42, -99, -106, 114, 123}, new byte[]{-1, 89, -13, -7, 1, 15, -54, 125}), z10);
                            FlexboxLayout flexboxLayout = mainActivity4.f793s0;
                            for (int i21 = 0; i21 < flexboxLayout.getChildCount(); i21++) {
                                flexboxLayout.getChildAt(i21).setEnabled(z10);
                            }
                            if (!z10) {
                                FlexboxLayout flexboxLayout2 = mainActivity4.f793s0;
                                for (int i22 = 0; i22 < flexboxLayout2.getChildCount(); i22++) {
                                    ((MaterialSwitch) flexboxLayout2.getChildAt(i22)).setChecked(false);
                                }
                                h0.b.o().saveBoolean(m.h(new byte[]{68, 18, -70, 67, 56, 122, -80, 114}, new byte[]{55, 101, -27, 48, 76, 21, -36, 25}), false);
                                return;
                            }
                            return;
                        case 4:
                            MainActivity mainActivity5 = this.f1959b;
                            String str6 = MainActivity.f750e1;
                            String h2 = m.h(new byte[]{-50, -81, 29, 122, 103, 126, 25, 32, -46, -91, 17, 113, 103, 104, 3}, new byte[]{-121, -21, 66, 57, 38, 44, 70, 115});
                            u0.a o5 = h0.b.o();
                            StringBuilder u8 = ai.onnxruntime.a.u(h2);
                            u8.append(mainActivity5.A());
                            o5.saveBoolean(u8.toString(), z10);
                            return;
                        case 5:
                            MainActivity mainActivity6 = this.f1959b;
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-97, -7, 52, -80, -63, 54, 57, -61, -75, -3, 39, -85, -50, 50, 19, -28, -79, -3, 37}, new byte[]{-48, -113, 81, -62, -83, 87, 64, -112}), z10);
                            if (z10) {
                                OverlayService.c(mainActivity6);
                                return;
                            }
                            OverlayService overlayService = OverlayService.f865f;
                            mainActivity6.stopService(new Intent(mainActivity6.getApplicationContext(), (Class<?>) OverlayService.class));
                            boolean z12 = Si.d;
                            Context applicationContext = mainActivity6.getApplicationContext();
                            applicationContext.stopService(new Intent(applicationContext, (Class<?>) Si.class));
                            return;
                        case 6:
                            MainActivity mainActivity7 = this.f1959b;
                            String str8 = MainActivity.f750e1;
                            try {
                                h0.b.o().saveBoolean(MockGpsService.r, z10);
                            } catch (Exception unused) {
                            }
                            if (z10) {
                                MockGpsService.m(mainActivity7);
                                return;
                            } else {
                                MockGpsService.b(mainActivity7);
                                mainActivity7.stopService(new Intent(mainActivity7, (Class<?>) MockGpsService.class));
                                return;
                            }
                        case 7:
                            MainActivity mainActivity8 = this.f1959b;
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(Notik.f856m, z10);
                            if (z10) {
                                Notik.g(mainActivity8);
                                return;
                            } else {
                                mainActivity8.getApplicationContext().stopService(new Intent(mainActivity8.getApplicationContext(), (Class<?>) Notik.class));
                                return;
                            }
                        case 8:
                            MainActivity mainActivity9 = this.f1959b;
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(SpeedBoardService.f890k, z10);
                            if (z10) {
                                SpeedBoardService.b(mainActivity9.getApplicationContext());
                                return;
                            } else {
                                Context applicationContext2 = mainActivity9.getApplicationContext();
                                applicationContext2.stopService(new Intent(applicationContext2.getApplicationContext(), (Class<?>) SpeedBoardService.class));
                                return;
                            }
                        case 9:
                            MainActivity mainActivity10 = this.f1959b;
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-41, -101, -118, -81, 87, -106, 41, 34, -9, -72, -86, -98, 87, -109, 37, 53, -10, -114, -65, -110, 123, -84, 46, 60, -28}, new byte[]{-127, -47, -55, -5, 8, -59, 76, 80}), z10);
                            if (z10) {
                                h0.b.o().saveBoolean(m.h(new byte[]{-55, -94, Base64.padSymbol, -120, -39, 119, 3, 91, -42, -79, 54, -92, -11, 97, 5, 76, -51, -90}, new byte[]{-65, -46, 83, -41, -86, 18, 113, 45}), true);
                                TService.c(mainActivity10.getApplicationContext());
                                TService.a(Boolean.TRUE);
                                return;
                            }
                            TService.a(Boolean.FALSE);
                            return;
                        case 10:
                            MainActivity mainActivity11 = this.f1959b;
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{41, -104, -57, -91, 108, 113, -79, 0, 49, -121, -58, -80, 86, 118, -69, 44, 42, -108, -50}, new byte[]{94, -15, -93, -62, 9, 5, -62, 95}), z10);
                            new SystemMessageReceiver().onReceive(mainActivity11.getApplicationContext(), new Intent(m.h(new byte[]{42, 46, -109, -91, -102, 9, 5, -100, 34, 46, -125, -78, -101, 20, 79, -45, 40, 52, -98, -72, -101, 78, 35, -3, 4, 20, -88, -108, -70, 45, 49, -2, 14, 20, -78, -109}, new byte[]{75, 64, -9, -41, -11, 96, 97, -78})));
                            return;
                        case 11:
                            MainActivity mainActivity12 = this.f1959b;
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{114, 109, -96, 86, 11, 40, ByteCompanionObject.MAX_VALUE, -101, 71, 82, -87, 115, 20, 37, 123, -101, 64, 94, -97, 104, 12, 43, 116, -101, 100, 104, -94, 101, 13, 59, 71, -79, 93}, new byte[]{51, 1, -52, 1, 98, 76, 24, -2}), z10);
                            h hVar = h.f1929i;
                            AllWidgetServices allWidgetServices = MainActivity.i1;
                            if (allWidgetServices != null) {
                                allWidgetServices.e(hVar, z10);
                            }
                            if (z10 && MainActivity.i1 == null) {
                                AllWidgetServices.c(mainActivity12);
                                return;
                            }
                            return;
                        case 12:
                            MainActivity mainActivity13 = this.f1959b;
                            String str14 = MainActivity.f750e1;
                            String str15 = s1.a1.f5463a;
                            ComponentName componentName = new ComponentName(mainActivity13.getPackageName(), s1.a1.f5463a);
                            PackageManager packageManager = mainActivity13.getPackageManager();
                            if (z10) {
                                i202 = 1;
                            } else {
                                i202 = 2;
                            }
                            packageManager.setComponentEnabledSetting(componentName, i202, 1);
                            return;
                        case 13:
                            MainActivity mainActivity14 = this.f1959b;
                            String str16 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{97, -20, 2, 79, 40, 84, -127, -32, 90, -28, 6, 105, 54, 113, -96, -59, 96, -34, 49, 66, 44, 114, -69, -42, 107, -40}, new byte[]{44, -115, 114, 16, 105, 55, -11, -119}), z10);
                            n3.a(mainActivity14);
                            return;
                        default:
                            MainActivity mainActivity15 = this.f1959b;
                            String str17 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{89, -93, 75, 63, 70, 93, -107, -66, 98, -85, 79, 25, 88, 115, -96, -113, 75, -110, 126, 50, 65, 113, -77, -102, 85, -116, 120, 37}, new byte[]{20, -62, 59, 96, 7, 62, -31, -41}), z10);
                            n3.a(mainActivity15);
                            return;
                    }
                }
            });
            MaterialSwitch materialSwitch7 = (MaterialSwitch) findViewById(R.id.sw_CustomPPStart);
            this.f776j0 = materialSwitch7;
            q.v(new byte[]{8, -123, 98, -8, -43, 62, 100, -8, 22, -94, 109, -24, -44, 44, 98, -29}, new byte[]{123, -14, Base64.padSymbol, -69, -96, 77, 16, -105}, b.o(), false, materialSwitch7);
            this.f776j0.setOnCheckedChangeListener(new k0(i18));
            MaterialSwitch materialSwitch8 = (MaterialSwitch) findViewById(R.id.sw_AppPPFullscreen);
            this.f778k0 = materialSwitch8;
            q.v(new byte[]{-61, 15, -39, 115, -91, -42, 83, 40, -10, 13, -22, 94, -90, -59, 113, 29, -43, 22}, new byte[]{-80, 120, -122, 50, -43, -90, 3, 120}, b.o(), false, materialSwitch8);
            this.f778k0.setOnCheckedChangeListener(new k0(6));
            MaterialSwitch materialSwitch9 = (MaterialSwitch) findViewById(R.id.sw_CustomPPFullscreen);
            this.f780l0 = materialSwitch9;
            q.v(new byte[]{-21, -72, -56, -91, 92, 122, -56, 108, -11, -97, -57, -96, 92, 101, -48, 112, -5, -67, -14, -125, 71}, new byte[]{-104, -49, -105, -26, 41, 9, -68, 3}, b.o(), false, materialSwitch9);
            this.f780l0.setOnCheckedChangeListener(new k0(i11));
            Button button = (Button) findViewById(R.id.b_settings_kastomnaya_pri);
            this.f761b1 = button;
            button.setOnClickListener(new q0(this, i14));
            findViewById(R.id.button_setting_speech).setOnClickListener(new q0(this, i15));
            MaterialSwitch materialSwitch10 = (MaterialSwitch) findViewById(R.id.sw_speech_button);
            materialSwitch10.setChecked(b.o().loadBoolean(m.h(new byte[]{67, 54, 67, 52, 81, 31, -7, -42, 105, 50, 80, 47, 94, 27, -45, -15, 109, 50, 82}, new byte[]{12, 64, 38, 70, Base64.padSymbol, 126, ByteCompanionObject.MIN_VALUE, -123}), false));
            final int i21 = 5;
            materialSwitch10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: e0.l0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MainActivity f1959b;

                {
                    this.f1959b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    RelativeLayout relativeLayout;
                    RelativeLayout relativeLayout2;
                    int i202;
                    switch (i21) {
                        case 0:
                            MainActivity mainActivity = this.f1959b;
                            String str2 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-60, -53, 107, 79, -77, 24, -89, 15, -6, -47, 123}, new byte[]{-120, -92, 30, 33, -48, 112, -27, 91}), z10);
                            boolean loadBoolean2 = h0.b.o().loadBoolean(m.h(new byte[]{-19, -62, -4, -76, -87, -9, 82, 0, -63, -41, -42, -83, -88, -12, 72}, new byte[]{-98, -75, -93, -39, -36, -101, 38, 105}), false);
                            if (z10) {
                                LounchB.c(mainActivity);
                                r5.c cVar = LounchB.f747h;
                                if (cVar != null && (relativeLayout2 = ((LounchB) cVar.c).f748b) != null) {
                                    relativeLayout2.setVisibility(0);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean2) {
                                r5.c cVar2 = LounchB.f747h;
                                if (cVar2 != null && (relativeLayout = ((LounchB) cVar2.c).f748b) != null) {
                                    relativeLayout.setVisibility(8);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager = LounchB.f746g;
                            mainActivity.stopService(new Intent(mainActivity, (Class<?>) LounchB.class));
                            return;
                        case 1:
                            MainActivity mainActivity2 = this.f1959b;
                            String str3 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{105, -56, -43, 92, 59, -26, -126, 121, 69, -35, -1, 69, 58, -27, -104}, new byte[]{26, -65, -118, 49, 78, -118, -10, 16}), z10);
                            boolean loadBoolean3 = h0.b.o().loadBoolean(m.h(new byte[]{34, -97, -78, -81, 126, -63, 107, -8, 28, -123, -94}, new byte[]{110, -16, -57, -63, 29, -87, 41, -84}), false);
                            if (z10) {
                                LounchB.c(mainActivity2);
                                r5.c cVar3 = LounchB.f747h;
                                if (cVar3 != null) {
                                    ((LounchB) cVar3.c).b(true);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean3) {
                                r5.c cVar4 = LounchB.f747h;
                                if (cVar4 != null) {
                                    ((LounchB) cVar4.c).b(false);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager2 = LounchB.f746g;
                            mainActivity2.stopService(new Intent(mainActivity2, (Class<?>) LounchB.class));
                            return;
                        case 2:
                            MainActivity mainActivity3 = this.f1959b;
                            String str4 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{22, 10, -105, -66, -75, -9, -93, 15, 4, 34, -65, -89, -66, -9, -109, 4, 11, 18, -82, -88}, new byte[]{101, 125, -56, -50, -38, -112, -52, 107}), z10);
                            if (z10) {
                                WeatherService.e(mainActivity3);
                                return;
                            } else {
                                boolean z11 = WeatherService.f1686f;
                                mainActivity3.stopService(new Intent(mainActivity3, (Class<?>) WeatherService.class));
                                return;
                            }
                        case 3:
                            MainActivity mainActivity4 = this.f1959b;
                            String str5 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-116, 46, -84, -101, 100, 117, -91, 13, -98, 42, -99, -106, 114, 123}, new byte[]{-1, 89, -13, -7, 1, 15, -54, 125}), z10);
                            FlexboxLayout flexboxLayout = mainActivity4.f793s0;
                            for (int i212 = 0; i212 < flexboxLayout.getChildCount(); i212++) {
                                flexboxLayout.getChildAt(i212).setEnabled(z10);
                            }
                            if (!z10) {
                                FlexboxLayout flexboxLayout2 = mainActivity4.f793s0;
                                for (int i22 = 0; i22 < flexboxLayout2.getChildCount(); i22++) {
                                    ((MaterialSwitch) flexboxLayout2.getChildAt(i22)).setChecked(false);
                                }
                                h0.b.o().saveBoolean(m.h(new byte[]{68, 18, -70, 67, 56, 122, -80, 114}, new byte[]{55, 101, -27, 48, 76, 21, -36, 25}), false);
                                return;
                            }
                            return;
                        case 4:
                            MainActivity mainActivity5 = this.f1959b;
                            String str6 = MainActivity.f750e1;
                            String h2 = m.h(new byte[]{-50, -81, 29, 122, 103, 126, 25, 32, -46, -91, 17, 113, 103, 104, 3}, new byte[]{-121, -21, 66, 57, 38, 44, 70, 115});
                            u0.a o5 = h0.b.o();
                            StringBuilder u8 = ai.onnxruntime.a.u(h2);
                            u8.append(mainActivity5.A());
                            o5.saveBoolean(u8.toString(), z10);
                            return;
                        case 5:
                            MainActivity mainActivity6 = this.f1959b;
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-97, -7, 52, -80, -63, 54, 57, -61, -75, -3, 39, -85, -50, 50, 19, -28, -79, -3, 37}, new byte[]{-48, -113, 81, -62, -83, 87, 64, -112}), z10);
                            if (z10) {
                                OverlayService.c(mainActivity6);
                                return;
                            }
                            OverlayService overlayService = OverlayService.f865f;
                            mainActivity6.stopService(new Intent(mainActivity6.getApplicationContext(), (Class<?>) OverlayService.class));
                            boolean z12 = Si.d;
                            Context applicationContext = mainActivity6.getApplicationContext();
                            applicationContext.stopService(new Intent(applicationContext, (Class<?>) Si.class));
                            return;
                        case 6:
                            MainActivity mainActivity7 = this.f1959b;
                            String str8 = MainActivity.f750e1;
                            try {
                                h0.b.o().saveBoolean(MockGpsService.r, z10);
                            } catch (Exception unused) {
                            }
                            if (z10) {
                                MockGpsService.m(mainActivity7);
                                return;
                            } else {
                                MockGpsService.b(mainActivity7);
                                mainActivity7.stopService(new Intent(mainActivity7, (Class<?>) MockGpsService.class));
                                return;
                            }
                        case 7:
                            MainActivity mainActivity8 = this.f1959b;
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(Notik.f856m, z10);
                            if (z10) {
                                Notik.g(mainActivity8);
                                return;
                            } else {
                                mainActivity8.getApplicationContext().stopService(new Intent(mainActivity8.getApplicationContext(), (Class<?>) Notik.class));
                                return;
                            }
                        case 8:
                            MainActivity mainActivity9 = this.f1959b;
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(SpeedBoardService.f890k, z10);
                            if (z10) {
                                SpeedBoardService.b(mainActivity9.getApplicationContext());
                                return;
                            } else {
                                Context applicationContext2 = mainActivity9.getApplicationContext();
                                applicationContext2.stopService(new Intent(applicationContext2.getApplicationContext(), (Class<?>) SpeedBoardService.class));
                                return;
                            }
                        case 9:
                            MainActivity mainActivity10 = this.f1959b;
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-41, -101, -118, -81, 87, -106, 41, 34, -9, -72, -86, -98, 87, -109, 37, 53, -10, -114, -65, -110, 123, -84, 46, 60, -28}, new byte[]{-127, -47, -55, -5, 8, -59, 76, 80}), z10);
                            if (z10) {
                                h0.b.o().saveBoolean(m.h(new byte[]{-55, -94, Base64.padSymbol, -120, -39, 119, 3, 91, -42, -79, 54, -92, -11, 97, 5, 76, -51, -90}, new byte[]{-65, -46, 83, -41, -86, 18, 113, 45}), true);
                                TService.c(mainActivity10.getApplicationContext());
                                TService.a(Boolean.TRUE);
                                return;
                            }
                            TService.a(Boolean.FALSE);
                            return;
                        case 10:
                            MainActivity mainActivity11 = this.f1959b;
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{41, -104, -57, -91, 108, 113, -79, 0, 49, -121, -58, -80, 86, 118, -69, 44, 42, -108, -50}, new byte[]{94, -15, -93, -62, 9, 5, -62, 95}), z10);
                            new SystemMessageReceiver().onReceive(mainActivity11.getApplicationContext(), new Intent(m.h(new byte[]{42, 46, -109, -91, -102, 9, 5, -100, 34, 46, -125, -78, -101, 20, 79, -45, 40, 52, -98, -72, -101, 78, 35, -3, 4, 20, -88, -108, -70, 45, 49, -2, 14, 20, -78, -109}, new byte[]{75, 64, -9, -41, -11, 96, 97, -78})));
                            return;
                        case 11:
                            MainActivity mainActivity12 = this.f1959b;
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{114, 109, -96, 86, 11, 40, ByteCompanionObject.MAX_VALUE, -101, 71, 82, -87, 115, 20, 37, 123, -101, 64, 94, -97, 104, 12, 43, 116, -101, 100, 104, -94, 101, 13, 59, 71, -79, 93}, new byte[]{51, 1, -52, 1, 98, 76, 24, -2}), z10);
                            h hVar = h.f1929i;
                            AllWidgetServices allWidgetServices = MainActivity.i1;
                            if (allWidgetServices != null) {
                                allWidgetServices.e(hVar, z10);
                            }
                            if (z10 && MainActivity.i1 == null) {
                                AllWidgetServices.c(mainActivity12);
                                return;
                            }
                            return;
                        case 12:
                            MainActivity mainActivity13 = this.f1959b;
                            String str14 = MainActivity.f750e1;
                            String str15 = s1.a1.f5463a;
                            ComponentName componentName = new ComponentName(mainActivity13.getPackageName(), s1.a1.f5463a);
                            PackageManager packageManager = mainActivity13.getPackageManager();
                            if (z10) {
                                i202 = 1;
                            } else {
                                i202 = 2;
                            }
                            packageManager.setComponentEnabledSetting(componentName, i202, 1);
                            return;
                        case 13:
                            MainActivity mainActivity14 = this.f1959b;
                            String str16 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{97, -20, 2, 79, 40, 84, -127, -32, 90, -28, 6, 105, 54, 113, -96, -59, 96, -34, 49, 66, 44, 114, -69, -42, 107, -40}, new byte[]{44, -115, 114, 16, 105, 55, -11, -119}), z10);
                            n3.a(mainActivity14);
                            return;
                        default:
                            MainActivity mainActivity15 = this.f1959b;
                            String str17 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{89, -93, 75, 63, 70, 93, -107, -66, 98, -85, 79, 25, 88, 115, -96, -113, 75, -110, 126, 50, 65, 113, -77, -102, 85, -116, 120, 37}, new byte[]{20, -62, 59, 96, 7, 62, -31, -41}), z10);
                            n3.a(mainActivity15);
                            return;
                    }
                }
            });
            MaterialSwitch materialSwitch11 = (MaterialSwitch) findViewById(R.id.sw_fiksik_on_off);
            this.f798v0 = materialSwitch11;
            q.v(new byte[]{-49, -65, 33, -79, -47, 45, 125, 27, -41, -105, 17, -71, -25, 41, 104, 20}, new byte[]{-68, -56, 126, -41, -72, 70, 14, 114}, b.o(), false, materialSwitch11);
            this.f798v0.setOnCheckedChangeListener(new k0(i10));
            ((Button) findViewById(R.id.b_fiksik_on)).setOnClickListener(new q0(this, 3));
            ((Button) findViewById(R.id.b_fiksik_off)).setOnClickListener(new q0(this, 4));
            this.Y = (LinearLayout) findViewById(R.id.lay_autolink_mediadebug);
            MaterialSwitch materialSwitch12 = (MaterialSwitch) findViewById(R.id.sw_autolink_mediadebug);
            materialSwitch12.setChecked(b.o().loadBoolean(x.d, false));
            materialSwitch12.setOnCheckedChangeListener(new k0(i13));
            K(m.h(new byte[]{-28, -28, 24, -92, -20, 53, -84, 13, -47, -21, 12, -72, -42, 15, -102, Base64.padSymbol, -26}, new byte[]{-93, -76, 75, -9, -119, 91, -56, 104}));
            C();
            D();
            F();
            ((Button) findViewById(R.id.b_tracker_map_open)).setOnClickListener(new q0(this, 5));
            MaterialSwitch materialSwitch13 = (MaterialSwitch) findViewById(R.id.sw_mock_gps_service);
            try {
                z9 = b.o().loadBoolean(MockGpsService.r, false);
            } catch (Exception unused) {
                z9 = false;
            }
            materialSwitch13.setChecked(z9);
            final int i22 = 6;
            materialSwitch13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: e0.l0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MainActivity f1959b;

                {
                    this.f1959b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    RelativeLayout relativeLayout;
                    RelativeLayout relativeLayout2;
                    int i202;
                    switch (i22) {
                        case 0:
                            MainActivity mainActivity = this.f1959b;
                            String str2 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-60, -53, 107, 79, -77, 24, -89, 15, -6, -47, 123}, new byte[]{-120, -92, 30, 33, -48, 112, -27, 91}), z10);
                            boolean loadBoolean2 = h0.b.o().loadBoolean(m.h(new byte[]{-19, -62, -4, -76, -87, -9, 82, 0, -63, -41, -42, -83, -88, -12, 72}, new byte[]{-98, -75, -93, -39, -36, -101, 38, 105}), false);
                            if (z10) {
                                LounchB.c(mainActivity);
                                r5.c cVar = LounchB.f747h;
                                if (cVar != null && (relativeLayout2 = ((LounchB) cVar.c).f748b) != null) {
                                    relativeLayout2.setVisibility(0);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean2) {
                                r5.c cVar2 = LounchB.f747h;
                                if (cVar2 != null && (relativeLayout = ((LounchB) cVar2.c).f748b) != null) {
                                    relativeLayout.setVisibility(8);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager = LounchB.f746g;
                            mainActivity.stopService(new Intent(mainActivity, (Class<?>) LounchB.class));
                            return;
                        case 1:
                            MainActivity mainActivity2 = this.f1959b;
                            String str3 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{105, -56, -43, 92, 59, -26, -126, 121, 69, -35, -1, 69, 58, -27, -104}, new byte[]{26, -65, -118, 49, 78, -118, -10, 16}), z10);
                            boolean loadBoolean3 = h0.b.o().loadBoolean(m.h(new byte[]{34, -97, -78, -81, 126, -63, 107, -8, 28, -123, -94}, new byte[]{110, -16, -57, -63, 29, -87, 41, -84}), false);
                            if (z10) {
                                LounchB.c(mainActivity2);
                                r5.c cVar3 = LounchB.f747h;
                                if (cVar3 != null) {
                                    ((LounchB) cVar3.c).b(true);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean3) {
                                r5.c cVar4 = LounchB.f747h;
                                if (cVar4 != null) {
                                    ((LounchB) cVar4.c).b(false);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager2 = LounchB.f746g;
                            mainActivity2.stopService(new Intent(mainActivity2, (Class<?>) LounchB.class));
                            return;
                        case 2:
                            MainActivity mainActivity3 = this.f1959b;
                            String str4 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{22, 10, -105, -66, -75, -9, -93, 15, 4, 34, -65, -89, -66, -9, -109, 4, 11, 18, -82, -88}, new byte[]{101, 125, -56, -50, -38, -112, -52, 107}), z10);
                            if (z10) {
                                WeatherService.e(mainActivity3);
                                return;
                            } else {
                                boolean z11 = WeatherService.f1686f;
                                mainActivity3.stopService(new Intent(mainActivity3, (Class<?>) WeatherService.class));
                                return;
                            }
                        case 3:
                            MainActivity mainActivity4 = this.f1959b;
                            String str5 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-116, 46, -84, -101, 100, 117, -91, 13, -98, 42, -99, -106, 114, 123}, new byte[]{-1, 89, -13, -7, 1, 15, -54, 125}), z10);
                            FlexboxLayout flexboxLayout = mainActivity4.f793s0;
                            for (int i212 = 0; i212 < flexboxLayout.getChildCount(); i212++) {
                                flexboxLayout.getChildAt(i212).setEnabled(z10);
                            }
                            if (!z10) {
                                FlexboxLayout flexboxLayout2 = mainActivity4.f793s0;
                                for (int i222 = 0; i222 < flexboxLayout2.getChildCount(); i222++) {
                                    ((MaterialSwitch) flexboxLayout2.getChildAt(i222)).setChecked(false);
                                }
                                h0.b.o().saveBoolean(m.h(new byte[]{68, 18, -70, 67, 56, 122, -80, 114}, new byte[]{55, 101, -27, 48, 76, 21, -36, 25}), false);
                                return;
                            }
                            return;
                        case 4:
                            MainActivity mainActivity5 = this.f1959b;
                            String str6 = MainActivity.f750e1;
                            String h2 = m.h(new byte[]{-50, -81, 29, 122, 103, 126, 25, 32, -46, -91, 17, 113, 103, 104, 3}, new byte[]{-121, -21, 66, 57, 38, 44, 70, 115});
                            u0.a o5 = h0.b.o();
                            StringBuilder u8 = ai.onnxruntime.a.u(h2);
                            u8.append(mainActivity5.A());
                            o5.saveBoolean(u8.toString(), z10);
                            return;
                        case 5:
                            MainActivity mainActivity6 = this.f1959b;
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-97, -7, 52, -80, -63, 54, 57, -61, -75, -3, 39, -85, -50, 50, 19, -28, -79, -3, 37}, new byte[]{-48, -113, 81, -62, -83, 87, 64, -112}), z10);
                            if (z10) {
                                OverlayService.c(mainActivity6);
                                return;
                            }
                            OverlayService overlayService = OverlayService.f865f;
                            mainActivity6.stopService(new Intent(mainActivity6.getApplicationContext(), (Class<?>) OverlayService.class));
                            boolean z12 = Si.d;
                            Context applicationContext = mainActivity6.getApplicationContext();
                            applicationContext.stopService(new Intent(applicationContext, (Class<?>) Si.class));
                            return;
                        case 6:
                            MainActivity mainActivity7 = this.f1959b;
                            String str8 = MainActivity.f750e1;
                            try {
                                h0.b.o().saveBoolean(MockGpsService.r, z10);
                            } catch (Exception unused2) {
                            }
                            if (z10) {
                                MockGpsService.m(mainActivity7);
                                return;
                            } else {
                                MockGpsService.b(mainActivity7);
                                mainActivity7.stopService(new Intent(mainActivity7, (Class<?>) MockGpsService.class));
                                return;
                            }
                        case 7:
                            MainActivity mainActivity8 = this.f1959b;
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(Notik.f856m, z10);
                            if (z10) {
                                Notik.g(mainActivity8);
                                return;
                            } else {
                                mainActivity8.getApplicationContext().stopService(new Intent(mainActivity8.getApplicationContext(), (Class<?>) Notik.class));
                                return;
                            }
                        case 8:
                            MainActivity mainActivity9 = this.f1959b;
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(SpeedBoardService.f890k, z10);
                            if (z10) {
                                SpeedBoardService.b(mainActivity9.getApplicationContext());
                                return;
                            } else {
                                Context applicationContext2 = mainActivity9.getApplicationContext();
                                applicationContext2.stopService(new Intent(applicationContext2.getApplicationContext(), (Class<?>) SpeedBoardService.class));
                                return;
                            }
                        case 9:
                            MainActivity mainActivity10 = this.f1959b;
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-41, -101, -118, -81, 87, -106, 41, 34, -9, -72, -86, -98, 87, -109, 37, 53, -10, -114, -65, -110, 123, -84, 46, 60, -28}, new byte[]{-127, -47, -55, -5, 8, -59, 76, 80}), z10);
                            if (z10) {
                                h0.b.o().saveBoolean(m.h(new byte[]{-55, -94, Base64.padSymbol, -120, -39, 119, 3, 91, -42, -79, 54, -92, -11, 97, 5, 76, -51, -90}, new byte[]{-65, -46, 83, -41, -86, 18, 113, 45}), true);
                                TService.c(mainActivity10.getApplicationContext());
                                TService.a(Boolean.TRUE);
                                return;
                            }
                            TService.a(Boolean.FALSE);
                            return;
                        case 10:
                            MainActivity mainActivity11 = this.f1959b;
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{41, -104, -57, -91, 108, 113, -79, 0, 49, -121, -58, -80, 86, 118, -69, 44, 42, -108, -50}, new byte[]{94, -15, -93, -62, 9, 5, -62, 95}), z10);
                            new SystemMessageReceiver().onReceive(mainActivity11.getApplicationContext(), new Intent(m.h(new byte[]{42, 46, -109, -91, -102, 9, 5, -100, 34, 46, -125, -78, -101, 20, 79, -45, 40, 52, -98, -72, -101, 78, 35, -3, 4, 20, -88, -108, -70, 45, 49, -2, 14, 20, -78, -109}, new byte[]{75, 64, -9, -41, -11, 96, 97, -78})));
                            return;
                        case 11:
                            MainActivity mainActivity12 = this.f1959b;
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{114, 109, -96, 86, 11, 40, ByteCompanionObject.MAX_VALUE, -101, 71, 82, -87, 115, 20, 37, 123, -101, 64, 94, -97, 104, 12, 43, 116, -101, 100, 104, -94, 101, 13, 59, 71, -79, 93}, new byte[]{51, 1, -52, 1, 98, 76, 24, -2}), z10);
                            h hVar = h.f1929i;
                            AllWidgetServices allWidgetServices = MainActivity.i1;
                            if (allWidgetServices != null) {
                                allWidgetServices.e(hVar, z10);
                            }
                            if (z10 && MainActivity.i1 == null) {
                                AllWidgetServices.c(mainActivity12);
                                return;
                            }
                            return;
                        case 12:
                            MainActivity mainActivity13 = this.f1959b;
                            String str14 = MainActivity.f750e1;
                            String str15 = s1.a1.f5463a;
                            ComponentName componentName = new ComponentName(mainActivity13.getPackageName(), s1.a1.f5463a);
                            PackageManager packageManager = mainActivity13.getPackageManager();
                            if (z10) {
                                i202 = 1;
                            } else {
                                i202 = 2;
                            }
                            packageManager.setComponentEnabledSetting(componentName, i202, 1);
                            return;
                        case 13:
                            MainActivity mainActivity14 = this.f1959b;
                            String str16 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{97, -20, 2, 79, 40, 84, -127, -32, 90, -28, 6, 105, 54, 113, -96, -59, 96, -34, 49, 66, 44, 114, -69, -42, 107, -40}, new byte[]{44, -115, 114, 16, 105, 55, -11, -119}), z10);
                            n3.a(mainActivity14);
                            return;
                        default:
                            MainActivity mainActivity15 = this.f1959b;
                            String str17 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{89, -93, 75, 63, 70, 93, -107, -66, 98, -85, 79, 25, 88, 115, -96, -113, 75, -110, 126, 50, 65, 113, -77, -102, 85, -116, 120, 37}, new byte[]{20, -62, 59, 96, 7, 62, -31, -41}), z10);
                            n3.a(mainActivity15);
                            return;
                    }
                }
            });
            ((Button) findViewById(R.id.b_mock_gps_settings)).setOnClickListener(new q0(this, i22));
            findViewById(R.id.JCT_Store_app).setOnClickListener(new q0(this, 7));
            findViewById(R.id.JCT_Video_Library).setOnClickListener(new q0(this, i11));
            findViewById(R.id.JCT_File_Manager).setOnClickListener(new q0(this, i10));
            findViewById(R.id.JCT_User_Apps_Hide).setOnClickListener(new q0(this, i13));
            this.L = (CardView) findViewById(R.id.MainStartProHUD);
            this.M = (CardView) findViewById(R.id.mainStartProGu);
            this.N = (CardView) findViewById(R.id.main_auto_vod);
            this.O = (CardView) findViewById(R.id.main_auto_heat);
            this.P = (CardView) findViewById(R.id.mainStartProPri);
            this.Q = (CardView) findViewById(R.id.main_karti);
            this.R = (CardView) findViewById(R.id.main_other);
            this.S = (CardView) findViewById(R.id.main_car_settings);
            MaterialSwitch materialSwitch14 = (MaterialSwitch) findViewById(R.id.SendMsg_Start);
            materialSwitch14.setChecked(b.o().loadBoolean(Notik.f856m, false));
            final int i23 = 7;
            materialSwitch14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: e0.l0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MainActivity f1959b;

                {
                    this.f1959b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    RelativeLayout relativeLayout;
                    RelativeLayout relativeLayout2;
                    int i202;
                    switch (i23) {
                        case 0:
                            MainActivity mainActivity = this.f1959b;
                            String str2 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-60, -53, 107, 79, -77, 24, -89, 15, -6, -47, 123}, new byte[]{-120, -92, 30, 33, -48, 112, -27, 91}), z10);
                            boolean loadBoolean2 = h0.b.o().loadBoolean(m.h(new byte[]{-19, -62, -4, -76, -87, -9, 82, 0, -63, -41, -42, -83, -88, -12, 72}, new byte[]{-98, -75, -93, -39, -36, -101, 38, 105}), false);
                            if (z10) {
                                LounchB.c(mainActivity);
                                r5.c cVar = LounchB.f747h;
                                if (cVar != null && (relativeLayout2 = ((LounchB) cVar.c).f748b) != null) {
                                    relativeLayout2.setVisibility(0);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean2) {
                                r5.c cVar2 = LounchB.f747h;
                                if (cVar2 != null && (relativeLayout = ((LounchB) cVar2.c).f748b) != null) {
                                    relativeLayout.setVisibility(8);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager = LounchB.f746g;
                            mainActivity.stopService(new Intent(mainActivity, (Class<?>) LounchB.class));
                            return;
                        case 1:
                            MainActivity mainActivity2 = this.f1959b;
                            String str3 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{105, -56, -43, 92, 59, -26, -126, 121, 69, -35, -1, 69, 58, -27, -104}, new byte[]{26, -65, -118, 49, 78, -118, -10, 16}), z10);
                            boolean loadBoolean3 = h0.b.o().loadBoolean(m.h(new byte[]{34, -97, -78, -81, 126, -63, 107, -8, 28, -123, -94}, new byte[]{110, -16, -57, -63, 29, -87, 41, -84}), false);
                            if (z10) {
                                LounchB.c(mainActivity2);
                                r5.c cVar3 = LounchB.f747h;
                                if (cVar3 != null) {
                                    ((LounchB) cVar3.c).b(true);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean3) {
                                r5.c cVar4 = LounchB.f747h;
                                if (cVar4 != null) {
                                    ((LounchB) cVar4.c).b(false);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager2 = LounchB.f746g;
                            mainActivity2.stopService(new Intent(mainActivity2, (Class<?>) LounchB.class));
                            return;
                        case 2:
                            MainActivity mainActivity3 = this.f1959b;
                            String str4 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{22, 10, -105, -66, -75, -9, -93, 15, 4, 34, -65, -89, -66, -9, -109, 4, 11, 18, -82, -88}, new byte[]{101, 125, -56, -50, -38, -112, -52, 107}), z10);
                            if (z10) {
                                WeatherService.e(mainActivity3);
                                return;
                            } else {
                                boolean z11 = WeatherService.f1686f;
                                mainActivity3.stopService(new Intent(mainActivity3, (Class<?>) WeatherService.class));
                                return;
                            }
                        case 3:
                            MainActivity mainActivity4 = this.f1959b;
                            String str5 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-116, 46, -84, -101, 100, 117, -91, 13, -98, 42, -99, -106, 114, 123}, new byte[]{-1, 89, -13, -7, 1, 15, -54, 125}), z10);
                            FlexboxLayout flexboxLayout = mainActivity4.f793s0;
                            for (int i212 = 0; i212 < flexboxLayout.getChildCount(); i212++) {
                                flexboxLayout.getChildAt(i212).setEnabled(z10);
                            }
                            if (!z10) {
                                FlexboxLayout flexboxLayout2 = mainActivity4.f793s0;
                                for (int i222 = 0; i222 < flexboxLayout2.getChildCount(); i222++) {
                                    ((MaterialSwitch) flexboxLayout2.getChildAt(i222)).setChecked(false);
                                }
                                h0.b.o().saveBoolean(m.h(new byte[]{68, 18, -70, 67, 56, 122, -80, 114}, new byte[]{55, 101, -27, 48, 76, 21, -36, 25}), false);
                                return;
                            }
                            return;
                        case 4:
                            MainActivity mainActivity5 = this.f1959b;
                            String str6 = MainActivity.f750e1;
                            String h2 = m.h(new byte[]{-50, -81, 29, 122, 103, 126, 25, 32, -46, -91, 17, 113, 103, 104, 3}, new byte[]{-121, -21, 66, 57, 38, 44, 70, 115});
                            u0.a o5 = h0.b.o();
                            StringBuilder u8 = ai.onnxruntime.a.u(h2);
                            u8.append(mainActivity5.A());
                            o5.saveBoolean(u8.toString(), z10);
                            return;
                        case 5:
                            MainActivity mainActivity6 = this.f1959b;
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-97, -7, 52, -80, -63, 54, 57, -61, -75, -3, 39, -85, -50, 50, 19, -28, -79, -3, 37}, new byte[]{-48, -113, 81, -62, -83, 87, 64, -112}), z10);
                            if (z10) {
                                OverlayService.c(mainActivity6);
                                return;
                            }
                            OverlayService overlayService = OverlayService.f865f;
                            mainActivity6.stopService(new Intent(mainActivity6.getApplicationContext(), (Class<?>) OverlayService.class));
                            boolean z12 = Si.d;
                            Context applicationContext = mainActivity6.getApplicationContext();
                            applicationContext.stopService(new Intent(applicationContext, (Class<?>) Si.class));
                            return;
                        case 6:
                            MainActivity mainActivity7 = this.f1959b;
                            String str8 = MainActivity.f750e1;
                            try {
                                h0.b.o().saveBoolean(MockGpsService.r, z10);
                            } catch (Exception unused2) {
                            }
                            if (z10) {
                                MockGpsService.m(mainActivity7);
                                return;
                            } else {
                                MockGpsService.b(mainActivity7);
                                mainActivity7.stopService(new Intent(mainActivity7, (Class<?>) MockGpsService.class));
                                return;
                            }
                        case 7:
                            MainActivity mainActivity8 = this.f1959b;
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(Notik.f856m, z10);
                            if (z10) {
                                Notik.g(mainActivity8);
                                return;
                            } else {
                                mainActivity8.getApplicationContext().stopService(new Intent(mainActivity8.getApplicationContext(), (Class<?>) Notik.class));
                                return;
                            }
                        case 8:
                            MainActivity mainActivity9 = this.f1959b;
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(SpeedBoardService.f890k, z10);
                            if (z10) {
                                SpeedBoardService.b(mainActivity9.getApplicationContext());
                                return;
                            } else {
                                Context applicationContext2 = mainActivity9.getApplicationContext();
                                applicationContext2.stopService(new Intent(applicationContext2.getApplicationContext(), (Class<?>) SpeedBoardService.class));
                                return;
                            }
                        case 9:
                            MainActivity mainActivity10 = this.f1959b;
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-41, -101, -118, -81, 87, -106, 41, 34, -9, -72, -86, -98, 87, -109, 37, 53, -10, -114, -65, -110, 123, -84, 46, 60, -28}, new byte[]{-127, -47, -55, -5, 8, -59, 76, 80}), z10);
                            if (z10) {
                                h0.b.o().saveBoolean(m.h(new byte[]{-55, -94, Base64.padSymbol, -120, -39, 119, 3, 91, -42, -79, 54, -92, -11, 97, 5, 76, -51, -90}, new byte[]{-65, -46, 83, -41, -86, 18, 113, 45}), true);
                                TService.c(mainActivity10.getApplicationContext());
                                TService.a(Boolean.TRUE);
                                return;
                            }
                            TService.a(Boolean.FALSE);
                            return;
                        case 10:
                            MainActivity mainActivity11 = this.f1959b;
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{41, -104, -57, -91, 108, 113, -79, 0, 49, -121, -58, -80, 86, 118, -69, 44, 42, -108, -50}, new byte[]{94, -15, -93, -62, 9, 5, -62, 95}), z10);
                            new SystemMessageReceiver().onReceive(mainActivity11.getApplicationContext(), new Intent(m.h(new byte[]{42, 46, -109, -91, -102, 9, 5, -100, 34, 46, -125, -78, -101, 20, 79, -45, 40, 52, -98, -72, -101, 78, 35, -3, 4, 20, -88, -108, -70, 45, 49, -2, 14, 20, -78, -109}, new byte[]{75, 64, -9, -41, -11, 96, 97, -78})));
                            return;
                        case 11:
                            MainActivity mainActivity12 = this.f1959b;
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{114, 109, -96, 86, 11, 40, ByteCompanionObject.MAX_VALUE, -101, 71, 82, -87, 115, 20, 37, 123, -101, 64, 94, -97, 104, 12, 43, 116, -101, 100, 104, -94, 101, 13, 59, 71, -79, 93}, new byte[]{51, 1, -52, 1, 98, 76, 24, -2}), z10);
                            h hVar = h.f1929i;
                            AllWidgetServices allWidgetServices = MainActivity.i1;
                            if (allWidgetServices != null) {
                                allWidgetServices.e(hVar, z10);
                            }
                            if (z10 && MainActivity.i1 == null) {
                                AllWidgetServices.c(mainActivity12);
                                return;
                            }
                            return;
                        case 12:
                            MainActivity mainActivity13 = this.f1959b;
                            String str14 = MainActivity.f750e1;
                            String str15 = s1.a1.f5463a;
                            ComponentName componentName = new ComponentName(mainActivity13.getPackageName(), s1.a1.f5463a);
                            PackageManager packageManager = mainActivity13.getPackageManager();
                            if (z10) {
                                i202 = 1;
                            } else {
                                i202 = 2;
                            }
                            packageManager.setComponentEnabledSetting(componentName, i202, 1);
                            return;
                        case 13:
                            MainActivity mainActivity14 = this.f1959b;
                            String str16 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{97, -20, 2, 79, 40, 84, -127, -32, 90, -28, 6, 105, 54, 113, -96, -59, 96, -34, 49, 66, 44, 114, -69, -42, 107, -40}, new byte[]{44, -115, 114, 16, 105, 55, -11, -119}), z10);
                            n3.a(mainActivity14);
                            return;
                        default:
                            MainActivity mainActivity15 = this.f1959b;
                            String str17 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{89, -93, 75, 63, 70, 93, -107, -66, 98, -85, 79, 25, 88, 115, -96, -113, 75, -110, 126, 50, 65, 113, -77, -102, 85, -116, 120, 37}, new byte[]{20, -62, 59, 96, 7, 62, -31, -41}), z10);
                            n3.a(mainActivity15);
                            return;
                    }
                }
            });
            ((Button) findViewById(R.id.SendMsg_Start_Settings)).setOnClickListener(new q0(this, 11));
            ((Button) findViewById(R.id.button_HUD_Custom_Settins)).setOnClickListener(new q0(this, i17));
            MaterialSwitch materialSwitch15 = (MaterialSwitch) findViewById(R.id.sw_start_app_hud);
            materialSwitch15.setChecked(b.o().loadBoolean(SpeedBoardService.f890k, false));
            materialSwitch15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: e0.l0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MainActivity f1959b;

                {
                    this.f1959b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    RelativeLayout relativeLayout;
                    RelativeLayout relativeLayout2;
                    int i202;
                    switch (i11) {
                        case 0:
                            MainActivity mainActivity = this.f1959b;
                            String str2 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-60, -53, 107, 79, -77, 24, -89, 15, -6, -47, 123}, new byte[]{-120, -92, 30, 33, -48, 112, -27, 91}), z10);
                            boolean loadBoolean2 = h0.b.o().loadBoolean(m.h(new byte[]{-19, -62, -4, -76, -87, -9, 82, 0, -63, -41, -42, -83, -88, -12, 72}, new byte[]{-98, -75, -93, -39, -36, -101, 38, 105}), false);
                            if (z10) {
                                LounchB.c(mainActivity);
                                r5.c cVar = LounchB.f747h;
                                if (cVar != null && (relativeLayout2 = ((LounchB) cVar.c).f748b) != null) {
                                    relativeLayout2.setVisibility(0);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean2) {
                                r5.c cVar2 = LounchB.f747h;
                                if (cVar2 != null && (relativeLayout = ((LounchB) cVar2.c).f748b) != null) {
                                    relativeLayout.setVisibility(8);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager = LounchB.f746g;
                            mainActivity.stopService(new Intent(mainActivity, (Class<?>) LounchB.class));
                            return;
                        case 1:
                            MainActivity mainActivity2 = this.f1959b;
                            String str3 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{105, -56, -43, 92, 59, -26, -126, 121, 69, -35, -1, 69, 58, -27, -104}, new byte[]{26, -65, -118, 49, 78, -118, -10, 16}), z10);
                            boolean loadBoolean3 = h0.b.o().loadBoolean(m.h(new byte[]{34, -97, -78, -81, 126, -63, 107, -8, 28, -123, -94}, new byte[]{110, -16, -57, -63, 29, -87, 41, -84}), false);
                            if (z10) {
                                LounchB.c(mainActivity2);
                                r5.c cVar3 = LounchB.f747h;
                                if (cVar3 != null) {
                                    ((LounchB) cVar3.c).b(true);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean3) {
                                r5.c cVar4 = LounchB.f747h;
                                if (cVar4 != null) {
                                    ((LounchB) cVar4.c).b(false);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager2 = LounchB.f746g;
                            mainActivity2.stopService(new Intent(mainActivity2, (Class<?>) LounchB.class));
                            return;
                        case 2:
                            MainActivity mainActivity3 = this.f1959b;
                            String str4 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{22, 10, -105, -66, -75, -9, -93, 15, 4, 34, -65, -89, -66, -9, -109, 4, 11, 18, -82, -88}, new byte[]{101, 125, -56, -50, -38, -112, -52, 107}), z10);
                            if (z10) {
                                WeatherService.e(mainActivity3);
                                return;
                            } else {
                                boolean z11 = WeatherService.f1686f;
                                mainActivity3.stopService(new Intent(mainActivity3, (Class<?>) WeatherService.class));
                                return;
                            }
                        case 3:
                            MainActivity mainActivity4 = this.f1959b;
                            String str5 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-116, 46, -84, -101, 100, 117, -91, 13, -98, 42, -99, -106, 114, 123}, new byte[]{-1, 89, -13, -7, 1, 15, -54, 125}), z10);
                            FlexboxLayout flexboxLayout = mainActivity4.f793s0;
                            for (int i212 = 0; i212 < flexboxLayout.getChildCount(); i212++) {
                                flexboxLayout.getChildAt(i212).setEnabled(z10);
                            }
                            if (!z10) {
                                FlexboxLayout flexboxLayout2 = mainActivity4.f793s0;
                                for (int i222 = 0; i222 < flexboxLayout2.getChildCount(); i222++) {
                                    ((MaterialSwitch) flexboxLayout2.getChildAt(i222)).setChecked(false);
                                }
                                h0.b.o().saveBoolean(m.h(new byte[]{68, 18, -70, 67, 56, 122, -80, 114}, new byte[]{55, 101, -27, 48, 76, 21, -36, 25}), false);
                                return;
                            }
                            return;
                        case 4:
                            MainActivity mainActivity5 = this.f1959b;
                            String str6 = MainActivity.f750e1;
                            String h2 = m.h(new byte[]{-50, -81, 29, 122, 103, 126, 25, 32, -46, -91, 17, 113, 103, 104, 3}, new byte[]{-121, -21, 66, 57, 38, 44, 70, 115});
                            u0.a o5 = h0.b.o();
                            StringBuilder u8 = ai.onnxruntime.a.u(h2);
                            u8.append(mainActivity5.A());
                            o5.saveBoolean(u8.toString(), z10);
                            return;
                        case 5:
                            MainActivity mainActivity6 = this.f1959b;
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-97, -7, 52, -80, -63, 54, 57, -61, -75, -3, 39, -85, -50, 50, 19, -28, -79, -3, 37}, new byte[]{-48, -113, 81, -62, -83, 87, 64, -112}), z10);
                            if (z10) {
                                OverlayService.c(mainActivity6);
                                return;
                            }
                            OverlayService overlayService = OverlayService.f865f;
                            mainActivity6.stopService(new Intent(mainActivity6.getApplicationContext(), (Class<?>) OverlayService.class));
                            boolean z12 = Si.d;
                            Context applicationContext = mainActivity6.getApplicationContext();
                            applicationContext.stopService(new Intent(applicationContext, (Class<?>) Si.class));
                            return;
                        case 6:
                            MainActivity mainActivity7 = this.f1959b;
                            String str8 = MainActivity.f750e1;
                            try {
                                h0.b.o().saveBoolean(MockGpsService.r, z10);
                            } catch (Exception unused2) {
                            }
                            if (z10) {
                                MockGpsService.m(mainActivity7);
                                return;
                            } else {
                                MockGpsService.b(mainActivity7);
                                mainActivity7.stopService(new Intent(mainActivity7, (Class<?>) MockGpsService.class));
                                return;
                            }
                        case 7:
                            MainActivity mainActivity8 = this.f1959b;
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(Notik.f856m, z10);
                            if (z10) {
                                Notik.g(mainActivity8);
                                return;
                            } else {
                                mainActivity8.getApplicationContext().stopService(new Intent(mainActivity8.getApplicationContext(), (Class<?>) Notik.class));
                                return;
                            }
                        case 8:
                            MainActivity mainActivity9 = this.f1959b;
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(SpeedBoardService.f890k, z10);
                            if (z10) {
                                SpeedBoardService.b(mainActivity9.getApplicationContext());
                                return;
                            } else {
                                Context applicationContext2 = mainActivity9.getApplicationContext();
                                applicationContext2.stopService(new Intent(applicationContext2.getApplicationContext(), (Class<?>) SpeedBoardService.class));
                                return;
                            }
                        case 9:
                            MainActivity mainActivity10 = this.f1959b;
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-41, -101, -118, -81, 87, -106, 41, 34, -9, -72, -86, -98, 87, -109, 37, 53, -10, -114, -65, -110, 123, -84, 46, 60, -28}, new byte[]{-127, -47, -55, -5, 8, -59, 76, 80}), z10);
                            if (z10) {
                                h0.b.o().saveBoolean(m.h(new byte[]{-55, -94, Base64.padSymbol, -120, -39, 119, 3, 91, -42, -79, 54, -92, -11, 97, 5, 76, -51, -90}, new byte[]{-65, -46, 83, -41, -86, 18, 113, 45}), true);
                                TService.c(mainActivity10.getApplicationContext());
                                TService.a(Boolean.TRUE);
                                return;
                            }
                            TService.a(Boolean.FALSE);
                            return;
                        case 10:
                            MainActivity mainActivity11 = this.f1959b;
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{41, -104, -57, -91, 108, 113, -79, 0, 49, -121, -58, -80, 86, 118, -69, 44, 42, -108, -50}, new byte[]{94, -15, -93, -62, 9, 5, -62, 95}), z10);
                            new SystemMessageReceiver().onReceive(mainActivity11.getApplicationContext(), new Intent(m.h(new byte[]{42, 46, -109, -91, -102, 9, 5, -100, 34, 46, -125, -78, -101, 20, 79, -45, 40, 52, -98, -72, -101, 78, 35, -3, 4, 20, -88, -108, -70, 45, 49, -2, 14, 20, -78, -109}, new byte[]{75, 64, -9, -41, -11, 96, 97, -78})));
                            return;
                        case 11:
                            MainActivity mainActivity12 = this.f1959b;
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{114, 109, -96, 86, 11, 40, ByteCompanionObject.MAX_VALUE, -101, 71, 82, -87, 115, 20, 37, 123, -101, 64, 94, -97, 104, 12, 43, 116, -101, 100, 104, -94, 101, 13, 59, 71, -79, 93}, new byte[]{51, 1, -52, 1, 98, 76, 24, -2}), z10);
                            h hVar = h.f1929i;
                            AllWidgetServices allWidgetServices = MainActivity.i1;
                            if (allWidgetServices != null) {
                                allWidgetServices.e(hVar, z10);
                            }
                            if (z10 && MainActivity.i1 == null) {
                                AllWidgetServices.c(mainActivity12);
                                return;
                            }
                            return;
                        case 12:
                            MainActivity mainActivity13 = this.f1959b;
                            String str14 = MainActivity.f750e1;
                            String str15 = s1.a1.f5463a;
                            ComponentName componentName = new ComponentName(mainActivity13.getPackageName(), s1.a1.f5463a);
                            PackageManager packageManager = mainActivity13.getPackageManager();
                            if (z10) {
                                i202 = 1;
                            } else {
                                i202 = 2;
                            }
                            packageManager.setComponentEnabledSetting(componentName, i202, 1);
                            return;
                        case 13:
                            MainActivity mainActivity14 = this.f1959b;
                            String str16 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{97, -20, 2, 79, 40, 84, -127, -32, 90, -28, 6, 105, 54, 113, -96, -59, 96, -34, 49, 66, 44, 114, -69, -42, 107, -40}, new byte[]{44, -115, 114, 16, 105, 55, -11, -119}), z10);
                            n3.a(mainActivity14);
                            return;
                        default:
                            MainActivity mainActivity15 = this.f1959b;
                            String str17 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{89, -93, 75, 63, 70, 93, -107, -66, 98, -85, 79, 25, 88, 115, -96, -113, 75, -110, 126, 50, 65, 113, -77, -102, 85, -116, 120, 37}, new byte[]{20, -62, 59, 96, 7, 62, -31, -41}), z10);
                            n3.a(mainActivity15);
                            return;
                    }
                }
            });
            this.F = (HeatManSetView) findViewById(R.id.DriverVentSeat);
            this.D = (HeatManSetView) findViewById(R.id.DriverHeatSeat);
            this.E = (HeatManSetView) findViewById(R.id.ShturmanHeatSeat);
            this.G = (HeatManSetView) findViewById(R.id.ShturmanVentSeat);
            this.H = (HeatManSetView) findViewById(R.id.HeatWheel);
            this.I = (HeatManSetView) findViewById(R.id.HeatWindshield);
            this.J = (HeatManSetView) findViewById(R.id.HeatRearwomdpw);
            this.K = (HeatManSetView) findViewById(R.id.TimeDalayHeat);
            ((Button) findViewById(R.id.swipe_setting_button)).setOnClickListener(new q0(this, i19));
            MaterialSwitch materialSwitch16 = (MaterialSwitch) findViewById(R.id.VJCT_Service_View_visible);
            this.C = materialSwitch16;
            int i24 = 25;
            q.v(new byte[]{-17, -27, 45, 34, 3, 39, 67, -21, -49, -58, 13, 19, 3, 34, 79, -4, -50, -16, 24, 31, 47, 29, 68, -11, -36}, new byte[]{-71, -81, 110, 118, 92, 116, 38, -103}, b.o(), false, materialSwitch16);
            this.C.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: e0.l0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MainActivity f1959b;

                {
                    this.f1959b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    RelativeLayout relativeLayout;
                    RelativeLayout relativeLayout2;
                    int i202;
                    switch (i10) {
                        case 0:
                            MainActivity mainActivity = this.f1959b;
                            String str2 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-60, -53, 107, 79, -77, 24, -89, 15, -6, -47, 123}, new byte[]{-120, -92, 30, 33, -48, 112, -27, 91}), z10);
                            boolean loadBoolean2 = h0.b.o().loadBoolean(m.h(new byte[]{-19, -62, -4, -76, -87, -9, 82, 0, -63, -41, -42, -83, -88, -12, 72}, new byte[]{-98, -75, -93, -39, -36, -101, 38, 105}), false);
                            if (z10) {
                                LounchB.c(mainActivity);
                                r5.c cVar = LounchB.f747h;
                                if (cVar != null && (relativeLayout2 = ((LounchB) cVar.c).f748b) != null) {
                                    relativeLayout2.setVisibility(0);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean2) {
                                r5.c cVar2 = LounchB.f747h;
                                if (cVar2 != null && (relativeLayout = ((LounchB) cVar2.c).f748b) != null) {
                                    relativeLayout.setVisibility(8);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager = LounchB.f746g;
                            mainActivity.stopService(new Intent(mainActivity, (Class<?>) LounchB.class));
                            return;
                        case 1:
                            MainActivity mainActivity2 = this.f1959b;
                            String str3 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{105, -56, -43, 92, 59, -26, -126, 121, 69, -35, -1, 69, 58, -27, -104}, new byte[]{26, -65, -118, 49, 78, -118, -10, 16}), z10);
                            boolean loadBoolean3 = h0.b.o().loadBoolean(m.h(new byte[]{34, -97, -78, -81, 126, -63, 107, -8, 28, -123, -94}, new byte[]{110, -16, -57, -63, 29, -87, 41, -84}), false);
                            if (z10) {
                                LounchB.c(mainActivity2);
                                r5.c cVar3 = LounchB.f747h;
                                if (cVar3 != null) {
                                    ((LounchB) cVar3.c).b(true);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean3) {
                                r5.c cVar4 = LounchB.f747h;
                                if (cVar4 != null) {
                                    ((LounchB) cVar4.c).b(false);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager2 = LounchB.f746g;
                            mainActivity2.stopService(new Intent(mainActivity2, (Class<?>) LounchB.class));
                            return;
                        case 2:
                            MainActivity mainActivity3 = this.f1959b;
                            String str4 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{22, 10, -105, -66, -75, -9, -93, 15, 4, 34, -65, -89, -66, -9, -109, 4, 11, 18, -82, -88}, new byte[]{101, 125, -56, -50, -38, -112, -52, 107}), z10);
                            if (z10) {
                                WeatherService.e(mainActivity3);
                                return;
                            } else {
                                boolean z11 = WeatherService.f1686f;
                                mainActivity3.stopService(new Intent(mainActivity3, (Class<?>) WeatherService.class));
                                return;
                            }
                        case 3:
                            MainActivity mainActivity4 = this.f1959b;
                            String str5 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-116, 46, -84, -101, 100, 117, -91, 13, -98, 42, -99, -106, 114, 123}, new byte[]{-1, 89, -13, -7, 1, 15, -54, 125}), z10);
                            FlexboxLayout flexboxLayout = mainActivity4.f793s0;
                            for (int i212 = 0; i212 < flexboxLayout.getChildCount(); i212++) {
                                flexboxLayout.getChildAt(i212).setEnabled(z10);
                            }
                            if (!z10) {
                                FlexboxLayout flexboxLayout2 = mainActivity4.f793s0;
                                for (int i222 = 0; i222 < flexboxLayout2.getChildCount(); i222++) {
                                    ((MaterialSwitch) flexboxLayout2.getChildAt(i222)).setChecked(false);
                                }
                                h0.b.o().saveBoolean(m.h(new byte[]{68, 18, -70, 67, 56, 122, -80, 114}, new byte[]{55, 101, -27, 48, 76, 21, -36, 25}), false);
                                return;
                            }
                            return;
                        case 4:
                            MainActivity mainActivity5 = this.f1959b;
                            String str6 = MainActivity.f750e1;
                            String h2 = m.h(new byte[]{-50, -81, 29, 122, 103, 126, 25, 32, -46, -91, 17, 113, 103, 104, 3}, new byte[]{-121, -21, 66, 57, 38, 44, 70, 115});
                            u0.a o5 = h0.b.o();
                            StringBuilder u8 = ai.onnxruntime.a.u(h2);
                            u8.append(mainActivity5.A());
                            o5.saveBoolean(u8.toString(), z10);
                            return;
                        case 5:
                            MainActivity mainActivity6 = this.f1959b;
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-97, -7, 52, -80, -63, 54, 57, -61, -75, -3, 39, -85, -50, 50, 19, -28, -79, -3, 37}, new byte[]{-48, -113, 81, -62, -83, 87, 64, -112}), z10);
                            if (z10) {
                                OverlayService.c(mainActivity6);
                                return;
                            }
                            OverlayService overlayService = OverlayService.f865f;
                            mainActivity6.stopService(new Intent(mainActivity6.getApplicationContext(), (Class<?>) OverlayService.class));
                            boolean z12 = Si.d;
                            Context applicationContext = mainActivity6.getApplicationContext();
                            applicationContext.stopService(new Intent(applicationContext, (Class<?>) Si.class));
                            return;
                        case 6:
                            MainActivity mainActivity7 = this.f1959b;
                            String str8 = MainActivity.f750e1;
                            try {
                                h0.b.o().saveBoolean(MockGpsService.r, z10);
                            } catch (Exception unused2) {
                            }
                            if (z10) {
                                MockGpsService.m(mainActivity7);
                                return;
                            } else {
                                MockGpsService.b(mainActivity7);
                                mainActivity7.stopService(new Intent(mainActivity7, (Class<?>) MockGpsService.class));
                                return;
                            }
                        case 7:
                            MainActivity mainActivity8 = this.f1959b;
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(Notik.f856m, z10);
                            if (z10) {
                                Notik.g(mainActivity8);
                                return;
                            } else {
                                mainActivity8.getApplicationContext().stopService(new Intent(mainActivity8.getApplicationContext(), (Class<?>) Notik.class));
                                return;
                            }
                        case 8:
                            MainActivity mainActivity9 = this.f1959b;
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(SpeedBoardService.f890k, z10);
                            if (z10) {
                                SpeedBoardService.b(mainActivity9.getApplicationContext());
                                return;
                            } else {
                                Context applicationContext2 = mainActivity9.getApplicationContext();
                                applicationContext2.stopService(new Intent(applicationContext2.getApplicationContext(), (Class<?>) SpeedBoardService.class));
                                return;
                            }
                        case 9:
                            MainActivity mainActivity10 = this.f1959b;
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-41, -101, -118, -81, 87, -106, 41, 34, -9, -72, -86, -98, 87, -109, 37, 53, -10, -114, -65, -110, 123, -84, 46, 60, -28}, new byte[]{-127, -47, -55, -5, 8, -59, 76, 80}), z10);
                            if (z10) {
                                h0.b.o().saveBoolean(m.h(new byte[]{-55, -94, Base64.padSymbol, -120, -39, 119, 3, 91, -42, -79, 54, -92, -11, 97, 5, 76, -51, -90}, new byte[]{-65, -46, 83, -41, -86, 18, 113, 45}), true);
                                TService.c(mainActivity10.getApplicationContext());
                                TService.a(Boolean.TRUE);
                                return;
                            }
                            TService.a(Boolean.FALSE);
                            return;
                        case 10:
                            MainActivity mainActivity11 = this.f1959b;
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{41, -104, -57, -91, 108, 113, -79, 0, 49, -121, -58, -80, 86, 118, -69, 44, 42, -108, -50}, new byte[]{94, -15, -93, -62, 9, 5, -62, 95}), z10);
                            new SystemMessageReceiver().onReceive(mainActivity11.getApplicationContext(), new Intent(m.h(new byte[]{42, 46, -109, -91, -102, 9, 5, -100, 34, 46, -125, -78, -101, 20, 79, -45, 40, 52, -98, -72, -101, 78, 35, -3, 4, 20, -88, -108, -70, 45, 49, -2, 14, 20, -78, -109}, new byte[]{75, 64, -9, -41, -11, 96, 97, -78})));
                            return;
                        case 11:
                            MainActivity mainActivity12 = this.f1959b;
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{114, 109, -96, 86, 11, 40, ByteCompanionObject.MAX_VALUE, -101, 71, 82, -87, 115, 20, 37, 123, -101, 64, 94, -97, 104, 12, 43, 116, -101, 100, 104, -94, 101, 13, 59, 71, -79, 93}, new byte[]{51, 1, -52, 1, 98, 76, 24, -2}), z10);
                            h hVar = h.f1929i;
                            AllWidgetServices allWidgetServices = MainActivity.i1;
                            if (allWidgetServices != null) {
                                allWidgetServices.e(hVar, z10);
                            }
                            if (z10 && MainActivity.i1 == null) {
                                AllWidgetServices.c(mainActivity12);
                                return;
                            }
                            return;
                        case 12:
                            MainActivity mainActivity13 = this.f1959b;
                            String str14 = MainActivity.f750e1;
                            String str15 = s1.a1.f5463a;
                            ComponentName componentName = new ComponentName(mainActivity13.getPackageName(), s1.a1.f5463a);
                            PackageManager packageManager = mainActivity13.getPackageManager();
                            if (z10) {
                                i202 = 1;
                            } else {
                                i202 = 2;
                            }
                            packageManager.setComponentEnabledSetting(componentName, i202, 1);
                            return;
                        case 13:
                            MainActivity mainActivity14 = this.f1959b;
                            String str16 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{97, -20, 2, 79, 40, 84, -127, -32, 90, -28, 6, 105, 54, 113, -96, -59, 96, -34, 49, 66, 44, 114, -69, -42, 107, -40}, new byte[]{44, -115, 114, 16, 105, 55, -11, -119}), z10);
                            n3.a(mainActivity14);
                            return;
                        default:
                            MainActivity mainActivity15 = this.f1959b;
                            String str17 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{89, -93, 75, 63, 70, 93, -107, -66, 98, -85, 79, 25, 88, 115, -96, -113, 75, -110, 126, 50, 65, 113, -77, -102, 85, -116, 120, 37}, new byte[]{20, -62, 59, 96, 7, 62, -31, -41}), z10);
                            n3.a(mainActivity15);
                            return;
                    }
                }
            });
            ((Button) findViewById(R.id.VJCT_Service_settings)).setOnClickListener(new q0(this, 14));
            MaterialSwitch materialSwitch17 = (MaterialSwitch) findViewById(R.id.widgets_over_system);
            materialSwitch17.setChecked(b.o().loadBoolean(m.h(new byte[]{-42, -78, -82, -112, 46, -17, -71, 25, -50, -83, -81, -123, 20, -24, -77, 53, -43, -66, -89}, new byte[]{-95, -37, -54, -9, 75, -101, -54, 70}), false));
            materialSwitch17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: e0.l0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MainActivity f1959b;

                {
                    this.f1959b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    RelativeLayout relativeLayout;
                    RelativeLayout relativeLayout2;
                    int i202;
                    switch (i13) {
                        case 0:
                            MainActivity mainActivity = this.f1959b;
                            String str2 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-60, -53, 107, 79, -77, 24, -89, 15, -6, -47, 123}, new byte[]{-120, -92, 30, 33, -48, 112, -27, 91}), z10);
                            boolean loadBoolean2 = h0.b.o().loadBoolean(m.h(new byte[]{-19, -62, -4, -76, -87, -9, 82, 0, -63, -41, -42, -83, -88, -12, 72}, new byte[]{-98, -75, -93, -39, -36, -101, 38, 105}), false);
                            if (z10) {
                                LounchB.c(mainActivity);
                                r5.c cVar = LounchB.f747h;
                                if (cVar != null && (relativeLayout2 = ((LounchB) cVar.c).f748b) != null) {
                                    relativeLayout2.setVisibility(0);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean2) {
                                r5.c cVar2 = LounchB.f747h;
                                if (cVar2 != null && (relativeLayout = ((LounchB) cVar2.c).f748b) != null) {
                                    relativeLayout.setVisibility(8);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager = LounchB.f746g;
                            mainActivity.stopService(new Intent(mainActivity, (Class<?>) LounchB.class));
                            return;
                        case 1:
                            MainActivity mainActivity2 = this.f1959b;
                            String str3 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{105, -56, -43, 92, 59, -26, -126, 121, 69, -35, -1, 69, 58, -27, -104}, new byte[]{26, -65, -118, 49, 78, -118, -10, 16}), z10);
                            boolean loadBoolean3 = h0.b.o().loadBoolean(m.h(new byte[]{34, -97, -78, -81, 126, -63, 107, -8, 28, -123, -94}, new byte[]{110, -16, -57, -63, 29, -87, 41, -84}), false);
                            if (z10) {
                                LounchB.c(mainActivity2);
                                r5.c cVar3 = LounchB.f747h;
                                if (cVar3 != null) {
                                    ((LounchB) cVar3.c).b(true);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean3) {
                                r5.c cVar4 = LounchB.f747h;
                                if (cVar4 != null) {
                                    ((LounchB) cVar4.c).b(false);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager2 = LounchB.f746g;
                            mainActivity2.stopService(new Intent(mainActivity2, (Class<?>) LounchB.class));
                            return;
                        case 2:
                            MainActivity mainActivity3 = this.f1959b;
                            String str4 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{22, 10, -105, -66, -75, -9, -93, 15, 4, 34, -65, -89, -66, -9, -109, 4, 11, 18, -82, -88}, new byte[]{101, 125, -56, -50, -38, -112, -52, 107}), z10);
                            if (z10) {
                                WeatherService.e(mainActivity3);
                                return;
                            } else {
                                boolean z11 = WeatherService.f1686f;
                                mainActivity3.stopService(new Intent(mainActivity3, (Class<?>) WeatherService.class));
                                return;
                            }
                        case 3:
                            MainActivity mainActivity4 = this.f1959b;
                            String str5 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-116, 46, -84, -101, 100, 117, -91, 13, -98, 42, -99, -106, 114, 123}, new byte[]{-1, 89, -13, -7, 1, 15, -54, 125}), z10);
                            FlexboxLayout flexboxLayout = mainActivity4.f793s0;
                            for (int i212 = 0; i212 < flexboxLayout.getChildCount(); i212++) {
                                flexboxLayout.getChildAt(i212).setEnabled(z10);
                            }
                            if (!z10) {
                                FlexboxLayout flexboxLayout2 = mainActivity4.f793s0;
                                for (int i222 = 0; i222 < flexboxLayout2.getChildCount(); i222++) {
                                    ((MaterialSwitch) flexboxLayout2.getChildAt(i222)).setChecked(false);
                                }
                                h0.b.o().saveBoolean(m.h(new byte[]{68, 18, -70, 67, 56, 122, -80, 114}, new byte[]{55, 101, -27, 48, 76, 21, -36, 25}), false);
                                return;
                            }
                            return;
                        case 4:
                            MainActivity mainActivity5 = this.f1959b;
                            String str6 = MainActivity.f750e1;
                            String h2 = m.h(new byte[]{-50, -81, 29, 122, 103, 126, 25, 32, -46, -91, 17, 113, 103, 104, 3}, new byte[]{-121, -21, 66, 57, 38, 44, 70, 115});
                            u0.a o5 = h0.b.o();
                            StringBuilder u8 = ai.onnxruntime.a.u(h2);
                            u8.append(mainActivity5.A());
                            o5.saveBoolean(u8.toString(), z10);
                            return;
                        case 5:
                            MainActivity mainActivity6 = this.f1959b;
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-97, -7, 52, -80, -63, 54, 57, -61, -75, -3, 39, -85, -50, 50, 19, -28, -79, -3, 37}, new byte[]{-48, -113, 81, -62, -83, 87, 64, -112}), z10);
                            if (z10) {
                                OverlayService.c(mainActivity6);
                                return;
                            }
                            OverlayService overlayService = OverlayService.f865f;
                            mainActivity6.stopService(new Intent(mainActivity6.getApplicationContext(), (Class<?>) OverlayService.class));
                            boolean z12 = Si.d;
                            Context applicationContext = mainActivity6.getApplicationContext();
                            applicationContext.stopService(new Intent(applicationContext, (Class<?>) Si.class));
                            return;
                        case 6:
                            MainActivity mainActivity7 = this.f1959b;
                            String str8 = MainActivity.f750e1;
                            try {
                                h0.b.o().saveBoolean(MockGpsService.r, z10);
                            } catch (Exception unused2) {
                            }
                            if (z10) {
                                MockGpsService.m(mainActivity7);
                                return;
                            } else {
                                MockGpsService.b(mainActivity7);
                                mainActivity7.stopService(new Intent(mainActivity7, (Class<?>) MockGpsService.class));
                                return;
                            }
                        case 7:
                            MainActivity mainActivity8 = this.f1959b;
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(Notik.f856m, z10);
                            if (z10) {
                                Notik.g(mainActivity8);
                                return;
                            } else {
                                mainActivity8.getApplicationContext().stopService(new Intent(mainActivity8.getApplicationContext(), (Class<?>) Notik.class));
                                return;
                            }
                        case 8:
                            MainActivity mainActivity9 = this.f1959b;
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(SpeedBoardService.f890k, z10);
                            if (z10) {
                                SpeedBoardService.b(mainActivity9.getApplicationContext());
                                return;
                            } else {
                                Context applicationContext2 = mainActivity9.getApplicationContext();
                                applicationContext2.stopService(new Intent(applicationContext2.getApplicationContext(), (Class<?>) SpeedBoardService.class));
                                return;
                            }
                        case 9:
                            MainActivity mainActivity10 = this.f1959b;
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-41, -101, -118, -81, 87, -106, 41, 34, -9, -72, -86, -98, 87, -109, 37, 53, -10, -114, -65, -110, 123, -84, 46, 60, -28}, new byte[]{-127, -47, -55, -5, 8, -59, 76, 80}), z10);
                            if (z10) {
                                h0.b.o().saveBoolean(m.h(new byte[]{-55, -94, Base64.padSymbol, -120, -39, 119, 3, 91, -42, -79, 54, -92, -11, 97, 5, 76, -51, -90}, new byte[]{-65, -46, 83, -41, -86, 18, 113, 45}), true);
                                TService.c(mainActivity10.getApplicationContext());
                                TService.a(Boolean.TRUE);
                                return;
                            }
                            TService.a(Boolean.FALSE);
                            return;
                        case 10:
                            MainActivity mainActivity11 = this.f1959b;
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{41, -104, -57, -91, 108, 113, -79, 0, 49, -121, -58, -80, 86, 118, -69, 44, 42, -108, -50}, new byte[]{94, -15, -93, -62, 9, 5, -62, 95}), z10);
                            new SystemMessageReceiver().onReceive(mainActivity11.getApplicationContext(), new Intent(m.h(new byte[]{42, 46, -109, -91, -102, 9, 5, -100, 34, 46, -125, -78, -101, 20, 79, -45, 40, 52, -98, -72, -101, 78, 35, -3, 4, 20, -88, -108, -70, 45, 49, -2, 14, 20, -78, -109}, new byte[]{75, 64, -9, -41, -11, 96, 97, -78})));
                            return;
                        case 11:
                            MainActivity mainActivity12 = this.f1959b;
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{114, 109, -96, 86, 11, 40, ByteCompanionObject.MAX_VALUE, -101, 71, 82, -87, 115, 20, 37, 123, -101, 64, 94, -97, 104, 12, 43, 116, -101, 100, 104, -94, 101, 13, 59, 71, -79, 93}, new byte[]{51, 1, -52, 1, 98, 76, 24, -2}), z10);
                            h hVar = h.f1929i;
                            AllWidgetServices allWidgetServices = MainActivity.i1;
                            if (allWidgetServices != null) {
                                allWidgetServices.e(hVar, z10);
                            }
                            if (z10 && MainActivity.i1 == null) {
                                AllWidgetServices.c(mainActivity12);
                                return;
                            }
                            return;
                        case 12:
                            MainActivity mainActivity13 = this.f1959b;
                            String str14 = MainActivity.f750e1;
                            String str15 = s1.a1.f5463a;
                            ComponentName componentName = new ComponentName(mainActivity13.getPackageName(), s1.a1.f5463a);
                            PackageManager packageManager = mainActivity13.getPackageManager();
                            if (z10) {
                                i202 = 1;
                            } else {
                                i202 = 2;
                            }
                            packageManager.setComponentEnabledSetting(componentName, i202, 1);
                            return;
                        case 13:
                            MainActivity mainActivity14 = this.f1959b;
                            String str16 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{97, -20, 2, 79, 40, 84, -127, -32, 90, -28, 6, 105, 54, 113, -96, -59, 96, -34, 49, 66, 44, 114, -69, -42, 107, -40}, new byte[]{44, -115, 114, 16, 105, 55, -11, -119}), z10);
                            n3.a(mainActivity14);
                            return;
                        default:
                            MainActivity mainActivity15 = this.f1959b;
                            String str17 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{89, -93, 75, 63, 70, 93, -107, -66, 98, -85, 79, 25, 88, 115, -96, -113, 75, -110, 126, 50, 65, 113, -77, -102, 85, -116, 120, 37}, new byte[]{20, -62, 59, 96, 7, 62, -31, -41}), z10);
                            n3.a(mainActivity15);
                            return;
                    }
                }
            });
            MaterialSwitch materialSwitch18 = (MaterialSwitch) findViewById(R.id.AllWidgetServices_dClock);
            materialSwitch18.setChecked(b.o().loadBoolean(m.h(new byte[]{121, 42, -120, 58, -59, -101, -81, -15, 76, 21, -127, 31, -38, -106, -85, -15, 75, 25, ByteCompanionObject.MIN_VALUE, 46, -64, -112, -85, -1, 103, 9, -118}, new byte[]{56, 70, -28, 109, -84, -1, -56, -108}), false));
            materialSwitch18.setOnCheckedChangeListener(new k0(i17));
            MaterialSwitch materialSwitch19 = (MaterialSwitch) findViewById(R.id.AllWidgetServices_TemperaturaMashView);
            materialSwitch19.setChecked(b.o().loadBoolean(m.h(new byte[]{-71, -65, 80, -2, -50, -119, 38, -113, -116, ByteCompanionObject.MIN_VALUE, 89, -37, -47, -124, 34, -113, -117, -116, 104, -52, -54, -99, 36, -104, -103, -89, 73, -37, -58, -96, 32, -103, -112, -123, 85, -52, -48, -78, 14, -124}, new byte[]{-8, -45, 60, -87, -89, -19, 65, -22}), false));
            materialSwitch19.setOnCheckedChangeListener(new k0(i19));
            MaterialSwitch materialSwitch20 = (MaterialSwitch) findViewById(R.id.AllWidgetServices_FuelRemainingView);
            materialSwitch20.setChecked(b.o().loadBoolean(m.h(new byte[]{122, 18, -72, -98, 21, -122, -102, 28, 79, 45, -79, -69, 10, -117, -98, 28, 72, 33, -110, -68, 25, -114, -81, 28, 86, 31, -67, -89, 21, -116, -102, 47, 82, 27, -93, -106, 51, -116}, new byte[]{59, 126, -44, -55, 124, -30, -3, 121}), false));
            materialSwitch20.setOnCheckedChangeListener(new k0(14));
            int i25 = 15;
            findViewById(R.id.fuel_widget_settings).setOnClickListener(new q0(this, i25));
            MaterialSwitch materialSwitch21 = (MaterialSwitch) findViewById(R.id.AllWidgetServices_StorageFreeView);
            materialSwitch21.setChecked(b.o().loadBoolean(m.h(new byte[]{18, 37, 101, 107, 45, 44, -20, -91, 39, 26, 108, 78, 50, 33, -24, -91, 32, 22, 90, 72, 43, 58, -22, -89, 54, 15, 123, 89, 33, 30, -30, -91, 36, 22, 70, 82}, new byte[]{83, 73, 9, 60, 68, 72, -117, -64}), false));
            materialSwitch21.setOnCheckedChangeListener(new k0(i25));
            MaterialSwitch materialSwitch22 = (MaterialSwitch) findViewById(R.id.AllWidgetServices_SingleWindow);
            materialSwitch22.setChecked(b.o().loadBoolean(m.h(new byte[]{73, 2, 65, -44, 14, 113, 67, 19, 124, Base64.padSymbol, 72, -15, 17, 124, 71, 19, 123, 49, 126, -22, 9, 114, 72, 19, 95, 7, 67, -25, 8, 98, 123, 57, 102}, new byte[]{8, 110, 45, -125, 103, 21, 36, 118}), false));
            final int i26 = 11;
            materialSwitch22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: e0.l0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MainActivity f1959b;

                {
                    this.f1959b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    RelativeLayout relativeLayout;
                    RelativeLayout relativeLayout2;
                    int i202;
                    switch (i26) {
                        case 0:
                            MainActivity mainActivity = this.f1959b;
                            String str2 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-60, -53, 107, 79, -77, 24, -89, 15, -6, -47, 123}, new byte[]{-120, -92, 30, 33, -48, 112, -27, 91}), z10);
                            boolean loadBoolean2 = h0.b.o().loadBoolean(m.h(new byte[]{-19, -62, -4, -76, -87, -9, 82, 0, -63, -41, -42, -83, -88, -12, 72}, new byte[]{-98, -75, -93, -39, -36, -101, 38, 105}), false);
                            if (z10) {
                                LounchB.c(mainActivity);
                                r5.c cVar = LounchB.f747h;
                                if (cVar != null && (relativeLayout2 = ((LounchB) cVar.c).f748b) != null) {
                                    relativeLayout2.setVisibility(0);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean2) {
                                r5.c cVar2 = LounchB.f747h;
                                if (cVar2 != null && (relativeLayout = ((LounchB) cVar2.c).f748b) != null) {
                                    relativeLayout.setVisibility(8);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager = LounchB.f746g;
                            mainActivity.stopService(new Intent(mainActivity, (Class<?>) LounchB.class));
                            return;
                        case 1:
                            MainActivity mainActivity2 = this.f1959b;
                            String str3 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{105, -56, -43, 92, 59, -26, -126, 121, 69, -35, -1, 69, 58, -27, -104}, new byte[]{26, -65, -118, 49, 78, -118, -10, 16}), z10);
                            boolean loadBoolean3 = h0.b.o().loadBoolean(m.h(new byte[]{34, -97, -78, -81, 126, -63, 107, -8, 28, -123, -94}, new byte[]{110, -16, -57, -63, 29, -87, 41, -84}), false);
                            if (z10) {
                                LounchB.c(mainActivity2);
                                r5.c cVar3 = LounchB.f747h;
                                if (cVar3 != null) {
                                    ((LounchB) cVar3.c).b(true);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean3) {
                                r5.c cVar4 = LounchB.f747h;
                                if (cVar4 != null) {
                                    ((LounchB) cVar4.c).b(false);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager2 = LounchB.f746g;
                            mainActivity2.stopService(new Intent(mainActivity2, (Class<?>) LounchB.class));
                            return;
                        case 2:
                            MainActivity mainActivity3 = this.f1959b;
                            String str4 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{22, 10, -105, -66, -75, -9, -93, 15, 4, 34, -65, -89, -66, -9, -109, 4, 11, 18, -82, -88}, new byte[]{101, 125, -56, -50, -38, -112, -52, 107}), z10);
                            if (z10) {
                                WeatherService.e(mainActivity3);
                                return;
                            } else {
                                boolean z11 = WeatherService.f1686f;
                                mainActivity3.stopService(new Intent(mainActivity3, (Class<?>) WeatherService.class));
                                return;
                            }
                        case 3:
                            MainActivity mainActivity4 = this.f1959b;
                            String str5 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-116, 46, -84, -101, 100, 117, -91, 13, -98, 42, -99, -106, 114, 123}, new byte[]{-1, 89, -13, -7, 1, 15, -54, 125}), z10);
                            FlexboxLayout flexboxLayout = mainActivity4.f793s0;
                            for (int i212 = 0; i212 < flexboxLayout.getChildCount(); i212++) {
                                flexboxLayout.getChildAt(i212).setEnabled(z10);
                            }
                            if (!z10) {
                                FlexboxLayout flexboxLayout2 = mainActivity4.f793s0;
                                for (int i222 = 0; i222 < flexboxLayout2.getChildCount(); i222++) {
                                    ((MaterialSwitch) flexboxLayout2.getChildAt(i222)).setChecked(false);
                                }
                                h0.b.o().saveBoolean(m.h(new byte[]{68, 18, -70, 67, 56, 122, -80, 114}, new byte[]{55, 101, -27, 48, 76, 21, -36, 25}), false);
                                return;
                            }
                            return;
                        case 4:
                            MainActivity mainActivity5 = this.f1959b;
                            String str6 = MainActivity.f750e1;
                            String h2 = m.h(new byte[]{-50, -81, 29, 122, 103, 126, 25, 32, -46, -91, 17, 113, 103, 104, 3}, new byte[]{-121, -21, 66, 57, 38, 44, 70, 115});
                            u0.a o5 = h0.b.o();
                            StringBuilder u8 = ai.onnxruntime.a.u(h2);
                            u8.append(mainActivity5.A());
                            o5.saveBoolean(u8.toString(), z10);
                            return;
                        case 5:
                            MainActivity mainActivity6 = this.f1959b;
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-97, -7, 52, -80, -63, 54, 57, -61, -75, -3, 39, -85, -50, 50, 19, -28, -79, -3, 37}, new byte[]{-48, -113, 81, -62, -83, 87, 64, -112}), z10);
                            if (z10) {
                                OverlayService.c(mainActivity6);
                                return;
                            }
                            OverlayService overlayService = OverlayService.f865f;
                            mainActivity6.stopService(new Intent(mainActivity6.getApplicationContext(), (Class<?>) OverlayService.class));
                            boolean z12 = Si.d;
                            Context applicationContext = mainActivity6.getApplicationContext();
                            applicationContext.stopService(new Intent(applicationContext, (Class<?>) Si.class));
                            return;
                        case 6:
                            MainActivity mainActivity7 = this.f1959b;
                            String str8 = MainActivity.f750e1;
                            try {
                                h0.b.o().saveBoolean(MockGpsService.r, z10);
                            } catch (Exception unused2) {
                            }
                            if (z10) {
                                MockGpsService.m(mainActivity7);
                                return;
                            } else {
                                MockGpsService.b(mainActivity7);
                                mainActivity7.stopService(new Intent(mainActivity7, (Class<?>) MockGpsService.class));
                                return;
                            }
                        case 7:
                            MainActivity mainActivity8 = this.f1959b;
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(Notik.f856m, z10);
                            if (z10) {
                                Notik.g(mainActivity8);
                                return;
                            } else {
                                mainActivity8.getApplicationContext().stopService(new Intent(mainActivity8.getApplicationContext(), (Class<?>) Notik.class));
                                return;
                            }
                        case 8:
                            MainActivity mainActivity9 = this.f1959b;
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(SpeedBoardService.f890k, z10);
                            if (z10) {
                                SpeedBoardService.b(mainActivity9.getApplicationContext());
                                return;
                            } else {
                                Context applicationContext2 = mainActivity9.getApplicationContext();
                                applicationContext2.stopService(new Intent(applicationContext2.getApplicationContext(), (Class<?>) SpeedBoardService.class));
                                return;
                            }
                        case 9:
                            MainActivity mainActivity10 = this.f1959b;
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-41, -101, -118, -81, 87, -106, 41, 34, -9, -72, -86, -98, 87, -109, 37, 53, -10, -114, -65, -110, 123, -84, 46, 60, -28}, new byte[]{-127, -47, -55, -5, 8, -59, 76, 80}), z10);
                            if (z10) {
                                h0.b.o().saveBoolean(m.h(new byte[]{-55, -94, Base64.padSymbol, -120, -39, 119, 3, 91, -42, -79, 54, -92, -11, 97, 5, 76, -51, -90}, new byte[]{-65, -46, 83, -41, -86, 18, 113, 45}), true);
                                TService.c(mainActivity10.getApplicationContext());
                                TService.a(Boolean.TRUE);
                                return;
                            }
                            TService.a(Boolean.FALSE);
                            return;
                        case 10:
                            MainActivity mainActivity11 = this.f1959b;
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{41, -104, -57, -91, 108, 113, -79, 0, 49, -121, -58, -80, 86, 118, -69, 44, 42, -108, -50}, new byte[]{94, -15, -93, -62, 9, 5, -62, 95}), z10);
                            new SystemMessageReceiver().onReceive(mainActivity11.getApplicationContext(), new Intent(m.h(new byte[]{42, 46, -109, -91, -102, 9, 5, -100, 34, 46, -125, -78, -101, 20, 79, -45, 40, 52, -98, -72, -101, 78, 35, -3, 4, 20, -88, -108, -70, 45, 49, -2, 14, 20, -78, -109}, new byte[]{75, 64, -9, -41, -11, 96, 97, -78})));
                            return;
                        case 11:
                            MainActivity mainActivity12 = this.f1959b;
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{114, 109, -96, 86, 11, 40, ByteCompanionObject.MAX_VALUE, -101, 71, 82, -87, 115, 20, 37, 123, -101, 64, 94, -97, 104, 12, 43, 116, -101, 100, 104, -94, 101, 13, 59, 71, -79, 93}, new byte[]{51, 1, -52, 1, 98, 76, 24, -2}), z10);
                            h hVar = h.f1929i;
                            AllWidgetServices allWidgetServices = MainActivity.i1;
                            if (allWidgetServices != null) {
                                allWidgetServices.e(hVar, z10);
                            }
                            if (z10 && MainActivity.i1 == null) {
                                AllWidgetServices.c(mainActivity12);
                                return;
                            }
                            return;
                        case 12:
                            MainActivity mainActivity13 = this.f1959b;
                            String str14 = MainActivity.f750e1;
                            String str15 = s1.a1.f5463a;
                            ComponentName componentName = new ComponentName(mainActivity13.getPackageName(), s1.a1.f5463a);
                            PackageManager packageManager = mainActivity13.getPackageManager();
                            if (z10) {
                                i202 = 1;
                            } else {
                                i202 = 2;
                            }
                            packageManager.setComponentEnabledSetting(componentName, i202, 1);
                            return;
                        case 13:
                            MainActivity mainActivity14 = this.f1959b;
                            String str16 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{97, -20, 2, 79, 40, 84, -127, -32, 90, -28, 6, 105, 54, 113, -96, -59, 96, -34, 49, 66, 44, 114, -69, -42, 107, -40}, new byte[]{44, -115, 114, 16, 105, 55, -11, -119}), z10);
                            n3.a(mainActivity14);
                            return;
                        default:
                            MainActivity mainActivity15 = this.f1959b;
                            String str17 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{89, -93, 75, 63, 70, 93, -107, -66, 98, -85, 79, 25, 88, 115, -96, -113, 75, -110, 126, 50, 65, 113, -77, -102, 85, -116, 120, 37}, new byte[]{20, -62, 59, 96, 7, 62, -31, -41}), z10);
                            n3.a(mainActivity15);
                            return;
                    }
                }
            });
            MaterialSwitch materialSwitch23 = (MaterialSwitch) findViewById(R.id.AllWidgetServices_MediaControlView);
            materialSwitch23.setChecked(b.o().loadBoolean(m.h(new byte[]{88, 84, -29, 118, ByteCompanionObject.MIN_VALUE, 87, -96, -3, 109, 107, -22, 83, -97, 90, -92, -3, 106, 103, -30, 68, -115, 90, -90, -37, 118, 86, -5, 83, -122, 95, -111, -15, 124, 79, -48, 110, -121}, new byte[]{25, 56, -113, 33, -23, 51, -57, -104}), false));
            int i27 = 16;
            materialSwitch23.setOnCheckedChangeListener(new k0(i27));
            ((Button) findViewById(R.id.install_AuroraStore)).setOnClickListener(new q0(this, i27));
            ((Button) findViewById(R.id.install_RuStore)).setOnClickListener(new q0(this, 17));
            ((Button) findViewById(R.id.install_AptoideStore)).setOnClickListener(new q0(this, i12));
            ((Button) findViewById(R.id.install_unistall_app)).setOnClickListener(new q0(this, i16));
            this.f800x = (TabLayout) findViewById(R.id.tabsSwitcher);
            N();
            P();
            MaterialSwitch materialSwitch24 = (MaterialSwitch) findViewById(R.id.sw_pogoda_widg);
            this.f796u0 = materialSwitch24;
            int i28 = 20;
            q.v(new byte[]{82, 71, 18, 58, -122, -70, 6, 17, 64, 111, 58, 35, -115, -70, 54, 26, 79, 95, 43, 44}, new byte[]{33, 48, 77, 74, -23, -35, 105, 117}, b.o(), false, materialSwitch24);
            MaterialSwitch materialSwitch25 = (MaterialSwitch) findViewById(R.id.switch_auto_to_start_engine);
            this.f799w0 = materialSwitch25;
            q.v(new byte[]{-28, -68, -33, 5, -60, 65, -53, -67, -30, -74, -31, 16, -18, 65, -53, -67, -21, -90, -12, 11, -18, 70, -48, -125, -8, -89, -33, 1, -33, 82, -51, -116, -17}, new byte[]{-118, -45, ByteCompanionObject.MIN_VALUE, 100, -79, 53, -92, -30}, b.o(), true, materialSwitch25);
            m.h(new byte[]{8, 124, 102, 17, 125, 122, -75, -67, 0, 118}, new byte[]{105, 18, 2, 99, 18, 19, -47, -30});
            q.v(new byte[]{96, -102, -92, -42}, new byte[]{2, -11, -53, -94, 1, -113, -37, 93}, b.o(), false, this.f802y);
            MaterialSwitch materialSwitch26 = (MaterialSwitch) findViewById(R.id.sw_auto_start_app_gu);
            materialSwitch26.setChecked(b.o().loadBoolean(m.h(new byte[]{8, -38, 23, 28, -97, -75, 69, 88, 36, -35, 58, 0, -76, -77, 66}, new byte[]{123, -83, 72, 111, -21, -44, 55, 44}), false));
            materialSwitch26.setOnCheckedChangeListener(new k0(i12));
            MaterialSwitch materialSwitch27 = (MaterialSwitch) findViewById(R.id.sw_enable_web_launcher);
            String str2 = a1.f5463a;
            materialSwitch27.setChecked(getPackageManager().getComponentEnabledSetting(new ComponentName(getPackageName(), a1.f5463a)) == 1);
            materialSwitch27.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: e0.l0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MainActivity f1959b;

                {
                    this.f1959b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    RelativeLayout relativeLayout;
                    RelativeLayout relativeLayout2;
                    int i202;
                    switch (i17) {
                        case 0:
                            MainActivity mainActivity = this.f1959b;
                            String str22 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-60, -53, 107, 79, -77, 24, -89, 15, -6, -47, 123}, new byte[]{-120, -92, 30, 33, -48, 112, -27, 91}), z10);
                            boolean loadBoolean2 = h0.b.o().loadBoolean(m.h(new byte[]{-19, -62, -4, -76, -87, -9, 82, 0, -63, -41, -42, -83, -88, -12, 72}, new byte[]{-98, -75, -93, -39, -36, -101, 38, 105}), false);
                            if (z10) {
                                LounchB.c(mainActivity);
                                r5.c cVar = LounchB.f747h;
                                if (cVar != null && (relativeLayout2 = ((LounchB) cVar.c).f748b) != null) {
                                    relativeLayout2.setVisibility(0);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean2) {
                                r5.c cVar2 = LounchB.f747h;
                                if (cVar2 != null && (relativeLayout = ((LounchB) cVar2.c).f748b) != null) {
                                    relativeLayout.setVisibility(8);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager = LounchB.f746g;
                            mainActivity.stopService(new Intent(mainActivity, (Class<?>) LounchB.class));
                            return;
                        case 1:
                            MainActivity mainActivity2 = this.f1959b;
                            String str3 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{105, -56, -43, 92, 59, -26, -126, 121, 69, -35, -1, 69, 58, -27, -104}, new byte[]{26, -65, -118, 49, 78, -118, -10, 16}), z10);
                            boolean loadBoolean3 = h0.b.o().loadBoolean(m.h(new byte[]{34, -97, -78, -81, 126, -63, 107, -8, 28, -123, -94}, new byte[]{110, -16, -57, -63, 29, -87, 41, -84}), false);
                            if (z10) {
                                LounchB.c(mainActivity2);
                                r5.c cVar3 = LounchB.f747h;
                                if (cVar3 != null) {
                                    ((LounchB) cVar3.c).b(true);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean3) {
                                r5.c cVar4 = LounchB.f747h;
                                if (cVar4 != null) {
                                    ((LounchB) cVar4.c).b(false);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager2 = LounchB.f746g;
                            mainActivity2.stopService(new Intent(mainActivity2, (Class<?>) LounchB.class));
                            return;
                        case 2:
                            MainActivity mainActivity3 = this.f1959b;
                            String str4 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{22, 10, -105, -66, -75, -9, -93, 15, 4, 34, -65, -89, -66, -9, -109, 4, 11, 18, -82, -88}, new byte[]{101, 125, -56, -50, -38, -112, -52, 107}), z10);
                            if (z10) {
                                WeatherService.e(mainActivity3);
                                return;
                            } else {
                                boolean z11 = WeatherService.f1686f;
                                mainActivity3.stopService(new Intent(mainActivity3, (Class<?>) WeatherService.class));
                                return;
                            }
                        case 3:
                            MainActivity mainActivity4 = this.f1959b;
                            String str5 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-116, 46, -84, -101, 100, 117, -91, 13, -98, 42, -99, -106, 114, 123}, new byte[]{-1, 89, -13, -7, 1, 15, -54, 125}), z10);
                            FlexboxLayout flexboxLayout = mainActivity4.f793s0;
                            for (int i212 = 0; i212 < flexboxLayout.getChildCount(); i212++) {
                                flexboxLayout.getChildAt(i212).setEnabled(z10);
                            }
                            if (!z10) {
                                FlexboxLayout flexboxLayout2 = mainActivity4.f793s0;
                                for (int i222 = 0; i222 < flexboxLayout2.getChildCount(); i222++) {
                                    ((MaterialSwitch) flexboxLayout2.getChildAt(i222)).setChecked(false);
                                }
                                h0.b.o().saveBoolean(m.h(new byte[]{68, 18, -70, 67, 56, 122, -80, 114}, new byte[]{55, 101, -27, 48, 76, 21, -36, 25}), false);
                                return;
                            }
                            return;
                        case 4:
                            MainActivity mainActivity5 = this.f1959b;
                            String str6 = MainActivity.f750e1;
                            String h2 = m.h(new byte[]{-50, -81, 29, 122, 103, 126, 25, 32, -46, -91, 17, 113, 103, 104, 3}, new byte[]{-121, -21, 66, 57, 38, 44, 70, 115});
                            u0.a o5 = h0.b.o();
                            StringBuilder u8 = ai.onnxruntime.a.u(h2);
                            u8.append(mainActivity5.A());
                            o5.saveBoolean(u8.toString(), z10);
                            return;
                        case 5:
                            MainActivity mainActivity6 = this.f1959b;
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-97, -7, 52, -80, -63, 54, 57, -61, -75, -3, 39, -85, -50, 50, 19, -28, -79, -3, 37}, new byte[]{-48, -113, 81, -62, -83, 87, 64, -112}), z10);
                            if (z10) {
                                OverlayService.c(mainActivity6);
                                return;
                            }
                            OverlayService overlayService = OverlayService.f865f;
                            mainActivity6.stopService(new Intent(mainActivity6.getApplicationContext(), (Class<?>) OverlayService.class));
                            boolean z12 = Si.d;
                            Context applicationContext = mainActivity6.getApplicationContext();
                            applicationContext.stopService(new Intent(applicationContext, (Class<?>) Si.class));
                            return;
                        case 6:
                            MainActivity mainActivity7 = this.f1959b;
                            String str8 = MainActivity.f750e1;
                            try {
                                h0.b.o().saveBoolean(MockGpsService.r, z10);
                            } catch (Exception unused2) {
                            }
                            if (z10) {
                                MockGpsService.m(mainActivity7);
                                return;
                            } else {
                                MockGpsService.b(mainActivity7);
                                mainActivity7.stopService(new Intent(mainActivity7, (Class<?>) MockGpsService.class));
                                return;
                            }
                        case 7:
                            MainActivity mainActivity8 = this.f1959b;
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(Notik.f856m, z10);
                            if (z10) {
                                Notik.g(mainActivity8);
                                return;
                            } else {
                                mainActivity8.getApplicationContext().stopService(new Intent(mainActivity8.getApplicationContext(), (Class<?>) Notik.class));
                                return;
                            }
                        case 8:
                            MainActivity mainActivity9 = this.f1959b;
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(SpeedBoardService.f890k, z10);
                            if (z10) {
                                SpeedBoardService.b(mainActivity9.getApplicationContext());
                                return;
                            } else {
                                Context applicationContext2 = mainActivity9.getApplicationContext();
                                applicationContext2.stopService(new Intent(applicationContext2.getApplicationContext(), (Class<?>) SpeedBoardService.class));
                                return;
                            }
                        case 9:
                            MainActivity mainActivity10 = this.f1959b;
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-41, -101, -118, -81, 87, -106, 41, 34, -9, -72, -86, -98, 87, -109, 37, 53, -10, -114, -65, -110, 123, -84, 46, 60, -28}, new byte[]{-127, -47, -55, -5, 8, -59, 76, 80}), z10);
                            if (z10) {
                                h0.b.o().saveBoolean(m.h(new byte[]{-55, -94, Base64.padSymbol, -120, -39, 119, 3, 91, -42, -79, 54, -92, -11, 97, 5, 76, -51, -90}, new byte[]{-65, -46, 83, -41, -86, 18, 113, 45}), true);
                                TService.c(mainActivity10.getApplicationContext());
                                TService.a(Boolean.TRUE);
                                return;
                            }
                            TService.a(Boolean.FALSE);
                            return;
                        case 10:
                            MainActivity mainActivity11 = this.f1959b;
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{41, -104, -57, -91, 108, 113, -79, 0, 49, -121, -58, -80, 86, 118, -69, 44, 42, -108, -50}, new byte[]{94, -15, -93, -62, 9, 5, -62, 95}), z10);
                            new SystemMessageReceiver().onReceive(mainActivity11.getApplicationContext(), new Intent(m.h(new byte[]{42, 46, -109, -91, -102, 9, 5, -100, 34, 46, -125, -78, -101, 20, 79, -45, 40, 52, -98, -72, -101, 78, 35, -3, 4, 20, -88, -108, -70, 45, 49, -2, 14, 20, -78, -109}, new byte[]{75, 64, -9, -41, -11, 96, 97, -78})));
                            return;
                        case 11:
                            MainActivity mainActivity12 = this.f1959b;
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{114, 109, -96, 86, 11, 40, ByteCompanionObject.MAX_VALUE, -101, 71, 82, -87, 115, 20, 37, 123, -101, 64, 94, -97, 104, 12, 43, 116, -101, 100, 104, -94, 101, 13, 59, 71, -79, 93}, new byte[]{51, 1, -52, 1, 98, 76, 24, -2}), z10);
                            h hVar = h.f1929i;
                            AllWidgetServices allWidgetServices = MainActivity.i1;
                            if (allWidgetServices != null) {
                                allWidgetServices.e(hVar, z10);
                            }
                            if (z10 && MainActivity.i1 == null) {
                                AllWidgetServices.c(mainActivity12);
                                return;
                            }
                            return;
                        case 12:
                            MainActivity mainActivity13 = this.f1959b;
                            String str14 = MainActivity.f750e1;
                            String str15 = s1.a1.f5463a;
                            ComponentName componentName = new ComponentName(mainActivity13.getPackageName(), s1.a1.f5463a);
                            PackageManager packageManager = mainActivity13.getPackageManager();
                            if (z10) {
                                i202 = 1;
                            } else {
                                i202 = 2;
                            }
                            packageManager.setComponentEnabledSetting(componentName, i202, 1);
                            return;
                        case 13:
                            MainActivity mainActivity14 = this.f1959b;
                            String str16 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{97, -20, 2, 79, 40, 84, -127, -32, 90, -28, 6, 105, 54, 113, -96, -59, 96, -34, 49, 66, 44, 114, -69, -42, 107, -40}, new byte[]{44, -115, 114, 16, 105, 55, -11, -119}), z10);
                            n3.a(mainActivity14);
                            return;
                        default:
                            MainActivity mainActivity15 = this.f1959b;
                            String str17 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{89, -93, 75, 63, 70, 93, -107, -66, 98, -85, 79, 25, 88, 115, -96, -113, 75, -110, 126, 50, 65, 113, -77, -102, 85, -116, 120, 37}, new byte[]{20, -62, 59, 96, 7, 62, -31, -41}), z10);
                            n3.a(mainActivity15);
                            return;
                    }
                }
            });
            ((Button) findViewById(R.id.button_start_web_launcher)).setOnClickListener(new q0(this, i28));
            ((Button) findViewById(R.id.button_make_default_web_launcher)).setOnClickListener(new androidx.navigation.ui.a(i14, this, materialSwitch27));
            final MaterialSwitch materialSwitch28 = (MaterialSwitch) findViewById(R.id.sw_auto_start_web_launcher);
            final MaterialSwitch materialSwitch29 = (MaterialSwitch) findViewById(R.id.sw_auto_start_black);
            materialSwitch28.setChecked(b.o().loadBoolean(m.h(new byte[]{57, -52, 84, 82, 8, 112, -84, -61, 57, -49, 106, 65, 9, 91, -76, -7, 40, -28, 103, 82, 8, 106, -96, -12, 47, -55}, new byte[]{74, -69, 11, 51, 125, 4, -61, -100}), false));
            materialSwitch29.setChecked(b.o().loadBoolean(m.h(new byte[]{-60, -18, -97, -67, 84, -88, -125, -11, -60, -19, -95, -82, 85, -125, -114, -58, -42, -6, -85}, new byte[]{-73, -103, -64, -36, 33, -36, -20, -86}), false));
            final int i29 = 0;
            materialSwitch28.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: e0.w0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    int i30 = i29;
                    MaterialSwitch materialSwitch30 = materialSwitch29;
                    switch (i30) {
                        case 0:
                            String str3 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{100, ByteCompanionObject.MIN_VALUE, -120, 116, 22, -11, 34, -89, 100, -125, -74, 103, 23, -34, 58, -99, 117, -88, -69, 116, 22, -17, 46, -112, 114, -123}, new byte[]{23, -9, -41, 21, 99, -127, 77, -8}), z10);
                            if (z10 && materialSwitch30.isChecked()) {
                                materialSwitch30.setChecked(false);
                                return;
                            }
                            return;
                        default:
                            String str4 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-35, 24, 28, -87, 91, -48, 70, -85, -35, 27, 34, -70, 90, -5, 75, -104, -49, 12, 40}, new byte[]{-82, 111, 67, -56, 46, -92, 41, -12}), z10);
                            if (z10 && materialSwitch30.isChecked()) {
                                materialSwitch30.setChecked(false);
                                return;
                            }
                            return;
                    }
                }
            });
            materialSwitch29.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: e0.w0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    int i30 = i14;
                    MaterialSwitch materialSwitch30 = materialSwitch28;
                    switch (i30) {
                        case 0:
                            String str3 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{100, ByteCompanionObject.MIN_VALUE, -120, 116, 22, -11, 34, -89, 100, -125, -74, 103, 23, -34, 58, -99, 117, -88, -69, 116, 22, -17, 46, -112, 114, -123}, new byte[]{23, -9, -41, 21, 99, -127, 77, -8}), z10);
                            if (z10 && materialSwitch30.isChecked()) {
                                materialSwitch30.setChecked(false);
                                return;
                            }
                            return;
                        default:
                            String str4 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-35, 24, 28, -87, 91, -48, 70, -85, -35, 27, 34, -70, 90, -5, 75, -104, -49, 12, 40}, new byte[]{-82, 111, 67, -56, 46, -92, 41, -12}), z10);
                            if (z10 && materialSwitch30.isChecked()) {
                                materialSwitch30.setChecked(false);
                                return;
                            }
                            return;
                    }
                }
            });
            ((Button) findViewById(R.id.button_start_black_Settins)).setOnClickListener(new q0(this, 21));
            MaterialSwitch materialSwitch30 = (MaterialSwitch) findViewById(R.id.sw_run_app_more);
            materialSwitch30.setChecked(b.o().loadBoolean(m.h(new byte[]{-44, -97, 67, 78, -94, -33, 48, 102, -41, -104, 67, 81, -72, -61, 10}, new byte[]{-89, -24, 28, 60, -41, -79, 111, 7}), false));
            materialSwitch30.setOnCheckedChangeListener(new k0(i28));
            ((Button) findViewById(R.id.button_run_app_more_Settins)).setOnClickListener(new q0(this, 22));
            ((Button) findViewById(R.id.button_exlantix_physical_buttons_settings)).setOnClickListener(new q0(this, 23));
            ((Button) findViewById(R.id.button_log_keycode_settings)).setOnClickListener(new q0(this, 24));
            MaterialSwitch materialSwitch31 = (MaterialSwitch) findViewById(R.id.sw_black_top_auto_click_install);
            materialSwitch31.setChecked(b.o().loadBoolean(m.h(new byte[]{-118, -107, -122, -52, -76, -42, 126, -53, -104, -90, -114, -63, -84, -3, 107, -56, -124, -90, -112, -58, -79, -42, 105, -56, -127, -102, -116}, new byte[]{-24, -7, -25, -81, -33, -119, 10, -92}), true));
            materialSwitch31.setOnCheckedChangeListener(new k0(21));
            this.X0 = (ImageView) findViewById(R.id.ind_black_top_auto_click_install);
            final int i30 = 0;
            ((v1.b) v1.d.a().f5928a.get(v1.b.class)).b().observe(this, new Observer(this) { // from class: e0.x0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MainActivity f2065b;

                {
                    this.f2065b = this;
                }

                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    int i31 = i30;
                    MainActivity mainActivity = this.f2065b;
                    switch (i31) {
                        case 0:
                            mainActivity.J(((Boolean) obj).booleanValue());
                            return;
                        default:
                            p pVar = (p) obj;
                            String str3 = MainActivity.f750e1;
                            if (pVar != null) {
                                int i32 = pVar.e;
                                ViewGroup viewGroup = (ViewGroup) mainActivity.f800x.getChildAt(0);
                                View childAt = viewGroup.getChildAt(0);
                                View childAt2 = viewGroup.getChildAt(1);
                                View childAt3 = viewGroup.getChildAt(2);
                                if (i32 != 1) {
                                    if (i32 != 2) {
                                        if (i32 == 3) {
                                            childAt.setBackgroundColor(0);
                                            childAt2.setBackgroundColor(0);
                                            childAt3.setBackgroundColor(Color.parseColor(m.h(new byte[]{1, -27, -63, 113, 17, 96, 82, -33, 99}, new byte[]{34, -35, -7, 48, 80, 33, 19, -98})));
                                        }
                                    } else {
                                        childAt.setBackgroundColor(0);
                                        childAt2.setBackgroundColor(Color.parseColor(m.h(new byte[]{-2, -97, -53, -78, 28, -59, 69, -116, -100}, new byte[]{-35, -89, -13, -13, 93, -124, 4, -51})));
                                        childAt3.setBackgroundColor(0);
                                    }
                                } else {
                                    childAt.setBackgroundColor(Color.parseColor(m.h(new byte[]{35, 92, 72, 107, 108, -64, 0, -45, 65}, new byte[]{0, 100, 112, 42, 45, -127, 65, -110})));
                                    childAt2.setBackgroundColor(0);
                                    childAt3.setBackgroundColor(0);
                                }
                                mainActivity.c.setText(pVar.d + m.h(new byte[]{79, 86, 64}, new byte[]{-115, -26, 3, -26, -48, -85, 102, 72}));
                                return;
                            }
                            return;
                    }
                }
            });
            ((v1.b) v1.d.a().f5928a.get(v1.b.class)).a().observe(this, new Observer(this) { // from class: e0.x0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MainActivity f2065b;

                {
                    this.f2065b = this;
                }

                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    int i31 = i14;
                    MainActivity mainActivity = this.f2065b;
                    switch (i31) {
                        case 0:
                            mainActivity.J(((Boolean) obj).booleanValue());
                            return;
                        default:
                            p pVar = (p) obj;
                            String str3 = MainActivity.f750e1;
                            if (pVar != null) {
                                int i32 = pVar.e;
                                ViewGroup viewGroup = (ViewGroup) mainActivity.f800x.getChildAt(0);
                                View childAt = viewGroup.getChildAt(0);
                                View childAt2 = viewGroup.getChildAt(1);
                                View childAt3 = viewGroup.getChildAt(2);
                                if (i32 != 1) {
                                    if (i32 != 2) {
                                        if (i32 == 3) {
                                            childAt.setBackgroundColor(0);
                                            childAt2.setBackgroundColor(0);
                                            childAt3.setBackgroundColor(Color.parseColor(m.h(new byte[]{1, -27, -63, 113, 17, 96, 82, -33, 99}, new byte[]{34, -35, -7, 48, 80, 33, 19, -98})));
                                        }
                                    } else {
                                        childAt.setBackgroundColor(0);
                                        childAt2.setBackgroundColor(Color.parseColor(m.h(new byte[]{-2, -97, -53, -78, 28, -59, 69, -116, -100}, new byte[]{-35, -89, -13, -13, 93, -124, 4, -51})));
                                        childAt3.setBackgroundColor(0);
                                    }
                                } else {
                                    childAt.setBackgroundColor(Color.parseColor(m.h(new byte[]{35, 92, 72, 107, 108, -64, 0, -45, 65}, new byte[]{0, 100, 112, 42, 45, -127, 65, -110})));
                                    childAt2.setBackgroundColor(0);
                                    childAt3.setBackgroundColor(0);
                                }
                                mainActivity.c.setText(pVar.d + m.h(new byte[]{79, 86, 64}, new byte[]{-115, -26, 3, -26, -48, -85, 102, 72}));
                                return;
                            }
                            return;
                    }
                }
            });
            q.v(new byte[]{-120, -121, 15, -35, -64, 86, 102}, new byte[]{-5, -13, 125, -72, -84, Base64.padSymbol, 7, 64}, b.o(), true, this.f804z);
            d0.d(this);
            q.v(new byte[]{-116, -89, -32, 116, 84, 82, 95, 109, -98, -65, -2}, new byte[]{-1, -45, -110, 17, 56, 57, 62, 50}, b.o(), false, this.A);
            q.v(new byte[]{79, -63, 96, -11, 44, 3, 50, 15, 100, -48, 100, -5, 31, 3, 55, 3, 116, -1, 96}, new byte[]{22, -109, 5, -106, 73, 106, 68, 106}, b.o(), false, this.B);
            q.v(new byte[]{-118, -3, 66, -37, 117, -87, -82}, new byte[]{-56, -111, 55, -124, 3, -58, -54, 82}, b.o(), false, this.f786o0);
            this.f788p0 = (MaterialSwitch) findViewById(R.id.switch20);
            SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.sw_multi_button);
            this.f794t0 = (MaterialSwitch) findViewById(R.id.switch30);
            this.Q0 = (TextInputLayout) findViewById(R.id.textField13);
            d0.d(this);
            this.f790q0 = (MaterialSwitch) findViewById(R.id.sw_bez);
            this.f793s0 = (FlexboxLayout) findViewById(R.id.bez_aw_layFlex);
            MaterialSwitch materialSwitch32 = (MaterialSwitch) findViewById(R.id.sw_stolk);
            this.f791r0 = materialSwitch32;
            q.v(new byte[]{-28, Base64.padSymbol, -36, -60, 47, 47, 27, ByteCompanionObject.MAX_VALUE}, new byte[]{-105, 74, -125, -73, 91, 64, 119, 20}, b.o(), false, materialSwitch32);
            q.v(new byte[]{-23, -84, -17, 36, 25, 56, -27, -16, -5, -88, -34, 41, 15, 54}, new byte[]{-102, -37, -80, 70, 124, 66, -118, ByteCompanionObject.MIN_VALUE}, b.o(), false, this.f790q0);
            this.f791r0.setEnabled(this.f790q0.isChecked());
            FlexboxLayout flexboxLayout = this.f793s0;
            boolean isChecked = this.f790q0.isChecked();
            for (int i31 = 0; i31 < flexboxLayout.getChildCount(); i31++) {
                flexboxLayout.getChildAt(i31).setEnabled(isChecked);
            }
            G(R.id.ID_CAR_SPD_LIMIT_WARN_SET, m.h(new byte[]{102, -106, 20, 9, 79, -20, 25, -29, ByteCompanionObject.MAX_VALUE, -106, 20, 6, 71, -13, 15, -28, 112, -123, 10, 24, 64, -31, 21, -11, 123}, new byte[]{47, -46, 75, 74, 14, -66, 70, -80}));
            G(R.id.ID_SPD_LIMIT_VALUE_CHANGE, m.h(new byte[]{79, 71, 124, -110, 73, 98, -75, 65, 79, 78, 106, -107, 70, 112, -85, 65, 83, 70, 124, -126, 81, 103, -92, 74, 67}, new byte[]{6, 3, 35, -63, 25, 38, -22, 13}));
            G(R.id.ID_CAR_LDW, m.h(new byte[]{52, 67, -104, 80, 52, -92, 3, 116, 57, 80}, new byte[]{125, 7, -57, 19, 117, -10, 92, 56}));
            G(R.id.ID_CAR_FCM_FRM_DAI_ON_OF, m.h(new byte[]{-48, -97, -3, 7, -58, 104, 8, 37, -38, -106, -3, 2, -43, 119, 8, 39, -40, -110, -3, 11, -55, 101, 24, 37}, new byte[]{-103, -37, -94, 68, -121, 58, 87, 99}));
            G(R.id.ID_CAR_FCM_INHIBIT, m.h(new byte[]{30, -55, ByteCompanionObject.MAX_VALUE, -57, -93, -47, -126, -100, 20, -64, ByteCompanionObject.MAX_VALUE, -51, -84, -53, -108, -104, 30, -39}, new byte[]{87, -115, 32, -124, -30, -125, -35, -38}));
            G(R.id.ID_CAR_FCM_IES_ON_OFF, m.h(new byte[]{6, -111, 36, 73, 26, 16, -51, 88, 12, -104, 36, 67, 30, 17, -51, 81, 1, -118, 52, 76, 29}, new byte[]{79, -43, 123, 10, 91, 66, -110, 30}));
            G(R.id.ID_CAR_FCM_EMERGENCY_KEEY, m.h(new byte[]{63, 8, 6, 79, -73, 111, 82, -10, 53, 1, 6, 73, -69, 120, 95, -9, 51, 2, 26, 85, -87, 118, 72, -11, 47}, new byte[]{118, 76, 89, 12, -10, Base64.padSymbol, 13, -80}));
            G(R.id.ID_CAR_CIR_ENA_STS, m.h(new byte[]{96, 78, -114, -89, 99, 12, -101, -14, 96, 88, -114, -95, 108, 31, -101, -30, 125, 89}, new byte[]{41, 10, -47, -28, 34, 94, -60, -79}));
            G(R.id.ID_CAR_OPPOSITION_SWITCH, m.h(new byte[]{74, -19, 79, 120, -96, 50, -69, 36, 83, -7, 95, 104, -88, 52, -83, 36, 77, -10, 67, 108, -88, 52, -89, 35}, new byte[]{3, -87, 16, 59, -31, 96, -28, 107}));
            G(R.id.Driver_Monitoring_System, m.h(new byte[]{-51, -121, 3, -69, -110, 72, -33, 13, -26, -101, 3, -71, -104, 72, -23, 46, -18, -86, 57, -76, -124, 78, -27, 45}, new byte[]{-119, -11, 106, -51, -9, 58, ByteCompanionObject.MIN_VALUE, 64}));
            d0.d(this);
            this.f788p0.setChecked(b.o().loadBoolean(m.h(new byte[]{103, -4, 79, -45, 71, 26, 124, 99, 89, -26, 95}, new byte[]{43, -109, 58, -67, 36, 114, 62, 55}), false));
            switchCompat.setChecked(b.o().loadBoolean(m.h(new byte[]{-121, -48, -94, 24, -104, -18, -99, -122, -85, -59, -120, 1, -103, -19, -121}, new byte[]{-12, -89, -3, 117, -19, -126, -23, -17}), false));
            ((Button) findViewById(R.id.button_setting_multubutton)).setOnClickListener(new q0(this, i24));
            q.v(new byte[]{-56, 45, 31, -108, 32, -121, -5, -74, -41, 34, 62, -113, 4, -105, -21}, new byte[]{-104, 76, 109, -1, 97, -14, -113, -39}, b.o(), false, this.f794t0);
            d0.d(this);
            d0.d(this);
            this.Y0 = (CardView) findViewById(R.id.Lay_strelka);
            TextView textView = (TextView) findViewById(R.id.MainPayViewLabel);
            u();
            d0.d(this);
            textView.setOnClickListener(new q0(this, i18));
            d0.d(this);
            u();
            ((Button) findViewById(R.id.button3)).setOnClickListener(new q0(this, 27));
            EditText editText = this.Q0.getEditText();
            Objects.requireNonNull(editText);
            editText.setText(String.valueOf(b.o().loadInt(m.h(new byte[]{-21, 36, -17, -94, -50, -46, -44, -37, -34, 32, -7, -97, -32, -48, -14, -50}, new byte[]{-69, 69, -99, -55, -127, -68, -121, -85}), 0)));
            d0.d(this);
            this.Q0.getEditText().addTextChangedListener(new e0.a1(0, this));
            d0.d(this);
            this.R0 = (YMovLay) findViewById(R.id.blok_lim_speed);
            this.S0 = (YMovLay) findViewById(R.id.blok_man_help);
            this.T0 = (YMovLay) findViewById(R.id.blok_prog);
            this.U0 = (YMovLay) findViewById(R.id.blok_dpi_pp);
            this.V0 = (YMovLay) findViewById(R.id.blok_dpi_gu);
            this.T = (LinearLayout) findViewById(R.id.len_jesti2);
            this.U = (LinearLayout) findViewById(R.id.len_jesti3);
            I();
            d0.d(this);
            this.R0.setmovL(new m0(this, i16));
            this.R0.setmovR(new m0(this, i28));
            this.R0.setmovU(new m0(this, 21));
            this.R0.setmovD(new m0(this, 22));
            this.S0.setmovL(new m0(this, 23));
            this.S0.setmovR(new m0(this, 24));
            this.S0.setmovU(new m0(this, i24));
            this.S0.setmovD(new m0(this, i18));
            this.T0.setmovL(new m0(this, 27));
            this.T0.setmovR(new m0(this, 28));
            this.T0.setmovU(new m0(this, 29));
            final int i32 = 0;
            this.T0.setmovD(new Runnable(this) { // from class: e0.y0
                public final /* synthetic */ MainActivity c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i33 = i32;
                    MainActivity mainActivity = this.c;
                    switch (i33) {
                        case 0:
                            String valueOf = String.valueOf(Integer.parseInt(mainActivity.T0.getYLayMovY()) - 1);
                            h0.b.o().saveString(mainActivity.f787p, valueOf);
                            mainActivity.T0.setYLayMovY(valueOf);
                            n3.a(mainActivity);
                            return;
                        case 1:
                            String str3 = MainActivity.f750e1;
                            String valueOf2 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{14, 116, -109, 67, 113, -16, 57, -52, 53, 124, -105, 101, 111, -41, 29, -20}, new byte[]{67, 21, -29, 28, 48, -109, 77, -91}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{-111, 102, 107, 75, 53, 120, 75, 67, -86, 110, 111, 109, 43, 95, 111, 99}, new byte[]{-36, 7, 27, 20, 116, 27, 63, 42}), valueOf2);
                            mainActivity.U0.setYLayMovX(valueOf2);
                            n3.a(mainActivity);
                            return;
                        case 2:
                            String str4 = MainActivity.f750e1;
                            String valueOf3 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-23, -60, -4, -127, 101, 54, -102, 16, -46, -52, -8, -89, 123, 17, -66, 48}, new byte[]{-92, -91, -116, -34, 36, 85, -18, 121}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-66, -70, -81, -63, 42, -44, 16, -18, -123, -78, -85, -25, 52, -13, 52, -50}, new byte[]{-13, -37, -33, -98, 107, -73, 100, -121}), valueOf3);
                            mainActivity.U0.setYLayMovX(valueOf3);
                            n3.a(mainActivity);
                            return;
                        case 3:
                            String str5 = MainActivity.f750e1;
                            String valueOf4 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-50, 2, 110, -35, 99, 41, -71, 88, -11, 10, 106, -5, 125, 14, -99, 120, -36, 36, 75}, new byte[]{-125, 99, 30, -126, 34, 74, -51, 49}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{78, -57, 104, 72, -38, 118, -74, -105, 117, -49, 108, 110, -60, 81, -110, -73, 92, -31, 77}, new byte[]{3, -90, 24, 23, -101, 21, -62, -2}), valueOf4);
                            mainActivity.V0.setYLayMovX(valueOf4);
                            n3.a(mainActivity);
                            return;
                        case 4:
                            String str6 = MainActivity.f750e1;
                            String valueOf5 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{9, 14, -71, 59, 29, -6, -36, -79, 50, 6, -67, 29, 3, -35, -8, -111, 27, 40, -100}, new byte[]{68, 111, -55, 100, 92, -103, -88, -40}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-6, -123, -102, 59, 29, -39, 59, 123, -63, -115, -98, 29, 3, -2, 31, 91, -24, -93, -65}, new byte[]{-73, -28, -22, 100, 92, -70, 79, 18}), valueOf5);
                            mainActivity.V0.setYLayMovX(valueOf5);
                            n3.a(mainActivity);
                            return;
                        case 5:
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{63, -39, 57, 81, -26, 25, -125, -93, 36, -44, 48, 87, -11, 20, -113, -94, 55, -55, 57, 68, -30, 5, -120, -82, 58, -36, 50, 91, -24, 5}, new byte[]{118, -99, 102, 18, -89, 75, -36, -25}, new StringBuilder(), mainActivity), mainActivity.F.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{39, 15, 115, 78, -36, 23, 125, 117, 60, 2, 122, 72, -49, 26, 113, 116, 47, 31, 115, 91, -40, 11, 118, 120, 34, 10, 120, 68, -46, 11, 125, 124, 33, 24, 100}, new byte[]{110, 75, 44, 13, -99, 69, 34, 49}, new StringBuilder(), mainActivity), mainActivity.F.getLevel());
                            return;
                        case 6:
                            String str8 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{124, 117, -28, -97, -11, -64, 27, -76, 103, 120, -19, -103, -26, -51, 23, -75, 116, 101, -28, -108, -15, -45, 16}, new byte[]{53, 49, -69, -36, -76, -110, 68, -16}, new StringBuilder(), mainActivity), mainActivity.D.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-87, 65, -112, 30, -125, 121, -84, -88, -78, 76, -103, 24, -112, 116, -96, -87, -95, 81, -112, 21, -121, 106, -89, -77, -83, 74, -100, 21}, new byte[]{-32, 5, -49, 93, -62, 43, -13, -20}, new StringBuilder(), mainActivity), mainActivity.D.getLevel());
                            return;
                        case 7:
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-43, -46, -119, -64, -118, 76, -33, 120, -45, -58, -97, -49, -124, 74, -33, 104, -39, -41, -126, -36, -125, 91, -63, 111}, new byte[]{-100, -106, -42, -125, -53, 30, ByteCompanionObject.MIN_VALUE, 59}, new StringBuilder(), mainActivity), mainActivity.E.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-54, 108, 111, 56, -100, -25, 14, -123, -52, 120, 121, 55, -110, -31, 14, -107, -58, 105, 100, 36, -107, -16, 16, -110, -36, 101, ByteCompanionObject.MAX_VALUE, 40, -107}, new byte[]{-125, 40, 48, 123, -35, -75, 81, -58}, new StringBuilder(), mainActivity), mainActivity.E.getLevel());
                            return;
                        case 8:
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{20, -55, -61, 106, ByteCompanionObject.MAX_VALUE, 69, 62, -65, 18, -35, -43, 101, 113, 67, 62, -81, 24, -52, -56, 118, 104, 82, 47, -88, 20, -63, -35, 125, 119, 88, 47}, new byte[]{93, -115, -100, 41, 62, 23, 97, -4}, new StringBuilder(), mainActivity), mainActivity.G.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-28, 51, -66, 50, -107, 44, -118, 28, -30, 39, -88, Base64.padSymbol, -101, 42, -118, 12, -24, 54, -75, 46, -126, 59, -101, 11, -28, 59, -96, 37, -99, 49, -101, 0, -32, 56, -78, 57}, new byte[]{-83, 119, -31, 113, -44, 126, -43, 95}, new StringBuilder(), mainActivity), mainActivity.G.getLevel());
                            return;
                        case 9:
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-23, 64, -79, -89, -123, -65, 40, 16, -12, 65, -85, -74, -101, -70, 63, 6, -27, 72, -79, -84, -127, -84, 35}, new byte[]{-96, 4, -18, -28, -60, -19, 119, 67}, new StringBuilder(), mainActivity), mainActivity.H.getisEnable().booleanValue());
                            return;
                        case 10:
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-117, -25, 3, 60, 62, -6, 126, -28, -115, -19, 8, 34, 58, -23, 121, -27, -111, -4, 20, 56, 60, -15}, new byte[]{-62, -93, 92, 125, 125, -91, 56, -74}, new StringBuilder(), mainActivity), mainActivity.I.getisEnable().booleanValue());
                            return;
                        case 11:
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{97, 113, -17, -35, 0, 107, 25, 19, 105, 103, -17, -40, 6, 114, 25, 25, 123, 97}, new byte[]{40, 53, -80, -100, 67, 52, 75, 86}, new StringBuilder(), mainActivity), mainActivity.J.getisEnable().booleanValue());
                            return;
                        default:
                            String str14 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-119, 1, 94, -57, 53, -27, -40, 126, -92, 32, 86, -61, 5, -37, -48, 126, -87, 11, 91, -53, 26, -22, -43, 109, -88, 15, 108, -19, 63}, new byte[]{-35, 104, 51, -94, 113, -124, -76, 31}, new StringBuilder(), mainActivity), mainActivity.K.getisEnable().booleanValue());
                            mainActivity.L(mainActivity.K.getisEnable().booleanValue());
                            return;
                    }
                }
            });
            this.U0.setmovL(new Runnable(this) { // from class: e0.y0
                public final /* synthetic */ MainActivity c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i33 = i14;
                    MainActivity mainActivity = this.c;
                    switch (i33) {
                        case 0:
                            String valueOf = String.valueOf(Integer.parseInt(mainActivity.T0.getYLayMovY()) - 1);
                            h0.b.o().saveString(mainActivity.f787p, valueOf);
                            mainActivity.T0.setYLayMovY(valueOf);
                            n3.a(mainActivity);
                            return;
                        case 1:
                            String str3 = MainActivity.f750e1;
                            String valueOf2 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{14, 116, -109, 67, 113, -16, 57, -52, 53, 124, -105, 101, 111, -41, 29, -20}, new byte[]{67, 21, -29, 28, 48, -109, 77, -91}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{-111, 102, 107, 75, 53, 120, 75, 67, -86, 110, 111, 109, 43, 95, 111, 99}, new byte[]{-36, 7, 27, 20, 116, 27, 63, 42}), valueOf2);
                            mainActivity.U0.setYLayMovX(valueOf2);
                            n3.a(mainActivity);
                            return;
                        case 2:
                            String str4 = MainActivity.f750e1;
                            String valueOf3 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-23, -60, -4, -127, 101, 54, -102, 16, -46, -52, -8, -89, 123, 17, -66, 48}, new byte[]{-92, -91, -116, -34, 36, 85, -18, 121}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-66, -70, -81, -63, 42, -44, 16, -18, -123, -78, -85, -25, 52, -13, 52, -50}, new byte[]{-13, -37, -33, -98, 107, -73, 100, -121}), valueOf3);
                            mainActivity.U0.setYLayMovX(valueOf3);
                            n3.a(mainActivity);
                            return;
                        case 3:
                            String str5 = MainActivity.f750e1;
                            String valueOf4 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-50, 2, 110, -35, 99, 41, -71, 88, -11, 10, 106, -5, 125, 14, -99, 120, -36, 36, 75}, new byte[]{-125, 99, 30, -126, 34, 74, -51, 49}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{78, -57, 104, 72, -38, 118, -74, -105, 117, -49, 108, 110, -60, 81, -110, -73, 92, -31, 77}, new byte[]{3, -90, 24, 23, -101, 21, -62, -2}), valueOf4);
                            mainActivity.V0.setYLayMovX(valueOf4);
                            n3.a(mainActivity);
                            return;
                        case 4:
                            String str6 = MainActivity.f750e1;
                            String valueOf5 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{9, 14, -71, 59, 29, -6, -36, -79, 50, 6, -67, 29, 3, -35, -8, -111, 27, 40, -100}, new byte[]{68, 111, -55, 100, 92, -103, -88, -40}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-6, -123, -102, 59, 29, -39, 59, 123, -63, -115, -98, 29, 3, -2, 31, 91, -24, -93, -65}, new byte[]{-73, -28, -22, 100, 92, -70, 79, 18}), valueOf5);
                            mainActivity.V0.setYLayMovX(valueOf5);
                            n3.a(mainActivity);
                            return;
                        case 5:
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{63, -39, 57, 81, -26, 25, -125, -93, 36, -44, 48, 87, -11, 20, -113, -94, 55, -55, 57, 68, -30, 5, -120, -82, 58, -36, 50, 91, -24, 5}, new byte[]{118, -99, 102, 18, -89, 75, -36, -25}, new StringBuilder(), mainActivity), mainActivity.F.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{39, 15, 115, 78, -36, 23, 125, 117, 60, 2, 122, 72, -49, 26, 113, 116, 47, 31, 115, 91, -40, 11, 118, 120, 34, 10, 120, 68, -46, 11, 125, 124, 33, 24, 100}, new byte[]{110, 75, 44, 13, -99, 69, 34, 49}, new StringBuilder(), mainActivity), mainActivity.F.getLevel());
                            return;
                        case 6:
                            String str8 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{124, 117, -28, -97, -11, -64, 27, -76, 103, 120, -19, -103, -26, -51, 23, -75, 116, 101, -28, -108, -15, -45, 16}, new byte[]{53, 49, -69, -36, -76, -110, 68, -16}, new StringBuilder(), mainActivity), mainActivity.D.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-87, 65, -112, 30, -125, 121, -84, -88, -78, 76, -103, 24, -112, 116, -96, -87, -95, 81, -112, 21, -121, 106, -89, -77, -83, 74, -100, 21}, new byte[]{-32, 5, -49, 93, -62, 43, -13, -20}, new StringBuilder(), mainActivity), mainActivity.D.getLevel());
                            return;
                        case 7:
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-43, -46, -119, -64, -118, 76, -33, 120, -45, -58, -97, -49, -124, 74, -33, 104, -39, -41, -126, -36, -125, 91, -63, 111}, new byte[]{-100, -106, -42, -125, -53, 30, ByteCompanionObject.MIN_VALUE, 59}, new StringBuilder(), mainActivity), mainActivity.E.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-54, 108, 111, 56, -100, -25, 14, -123, -52, 120, 121, 55, -110, -31, 14, -107, -58, 105, 100, 36, -107, -16, 16, -110, -36, 101, ByteCompanionObject.MAX_VALUE, 40, -107}, new byte[]{-125, 40, 48, 123, -35, -75, 81, -58}, new StringBuilder(), mainActivity), mainActivity.E.getLevel());
                            return;
                        case 8:
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{20, -55, -61, 106, ByteCompanionObject.MAX_VALUE, 69, 62, -65, 18, -35, -43, 101, 113, 67, 62, -81, 24, -52, -56, 118, 104, 82, 47, -88, 20, -63, -35, 125, 119, 88, 47}, new byte[]{93, -115, -100, 41, 62, 23, 97, -4}, new StringBuilder(), mainActivity), mainActivity.G.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-28, 51, -66, 50, -107, 44, -118, 28, -30, 39, -88, Base64.padSymbol, -101, 42, -118, 12, -24, 54, -75, 46, -126, 59, -101, 11, -28, 59, -96, 37, -99, 49, -101, 0, -32, 56, -78, 57}, new byte[]{-83, 119, -31, 113, -44, 126, -43, 95}, new StringBuilder(), mainActivity), mainActivity.G.getLevel());
                            return;
                        case 9:
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-23, 64, -79, -89, -123, -65, 40, 16, -12, 65, -85, -74, -101, -70, 63, 6, -27, 72, -79, -84, -127, -84, 35}, new byte[]{-96, 4, -18, -28, -60, -19, 119, 67}, new StringBuilder(), mainActivity), mainActivity.H.getisEnable().booleanValue());
                            return;
                        case 10:
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-117, -25, 3, 60, 62, -6, 126, -28, -115, -19, 8, 34, 58, -23, 121, -27, -111, -4, 20, 56, 60, -15}, new byte[]{-62, -93, 92, 125, 125, -91, 56, -74}, new StringBuilder(), mainActivity), mainActivity.I.getisEnable().booleanValue());
                            return;
                        case 11:
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{97, 113, -17, -35, 0, 107, 25, 19, 105, 103, -17, -40, 6, 114, 25, 25, 123, 97}, new byte[]{40, 53, -80, -100, 67, 52, 75, 86}, new StringBuilder(), mainActivity), mainActivity.J.getisEnable().booleanValue());
                            return;
                        default:
                            String str14 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-119, 1, 94, -57, 53, -27, -40, 126, -92, 32, 86, -61, 5, -37, -48, 126, -87, 11, 91, -53, 26, -22, -43, 109, -88, 15, 108, -19, 63}, new byte[]{-35, 104, 51, -94, 113, -124, -76, 31}, new StringBuilder(), mainActivity), mainActivity.K.getisEnable().booleanValue());
                            mainActivity.L(mainActivity.K.getisEnable().booleanValue());
                            return;
                    }
                }
            });
            final int i33 = 2;
            this.U0.setmovR(new Runnable(this) { // from class: e0.y0
                public final /* synthetic */ MainActivity c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i332 = i33;
                    MainActivity mainActivity = this.c;
                    switch (i332) {
                        case 0:
                            String valueOf = String.valueOf(Integer.parseInt(mainActivity.T0.getYLayMovY()) - 1);
                            h0.b.o().saveString(mainActivity.f787p, valueOf);
                            mainActivity.T0.setYLayMovY(valueOf);
                            n3.a(mainActivity);
                            return;
                        case 1:
                            String str3 = MainActivity.f750e1;
                            String valueOf2 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{14, 116, -109, 67, 113, -16, 57, -52, 53, 124, -105, 101, 111, -41, 29, -20}, new byte[]{67, 21, -29, 28, 48, -109, 77, -91}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{-111, 102, 107, 75, 53, 120, 75, 67, -86, 110, 111, 109, 43, 95, 111, 99}, new byte[]{-36, 7, 27, 20, 116, 27, 63, 42}), valueOf2);
                            mainActivity.U0.setYLayMovX(valueOf2);
                            n3.a(mainActivity);
                            return;
                        case 2:
                            String str4 = MainActivity.f750e1;
                            String valueOf3 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-23, -60, -4, -127, 101, 54, -102, 16, -46, -52, -8, -89, 123, 17, -66, 48}, new byte[]{-92, -91, -116, -34, 36, 85, -18, 121}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-66, -70, -81, -63, 42, -44, 16, -18, -123, -78, -85, -25, 52, -13, 52, -50}, new byte[]{-13, -37, -33, -98, 107, -73, 100, -121}), valueOf3);
                            mainActivity.U0.setYLayMovX(valueOf3);
                            n3.a(mainActivity);
                            return;
                        case 3:
                            String str5 = MainActivity.f750e1;
                            String valueOf4 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-50, 2, 110, -35, 99, 41, -71, 88, -11, 10, 106, -5, 125, 14, -99, 120, -36, 36, 75}, new byte[]{-125, 99, 30, -126, 34, 74, -51, 49}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{78, -57, 104, 72, -38, 118, -74, -105, 117, -49, 108, 110, -60, 81, -110, -73, 92, -31, 77}, new byte[]{3, -90, 24, 23, -101, 21, -62, -2}), valueOf4);
                            mainActivity.V0.setYLayMovX(valueOf4);
                            n3.a(mainActivity);
                            return;
                        case 4:
                            String str6 = MainActivity.f750e1;
                            String valueOf5 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{9, 14, -71, 59, 29, -6, -36, -79, 50, 6, -67, 29, 3, -35, -8, -111, 27, 40, -100}, new byte[]{68, 111, -55, 100, 92, -103, -88, -40}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-6, -123, -102, 59, 29, -39, 59, 123, -63, -115, -98, 29, 3, -2, 31, 91, -24, -93, -65}, new byte[]{-73, -28, -22, 100, 92, -70, 79, 18}), valueOf5);
                            mainActivity.V0.setYLayMovX(valueOf5);
                            n3.a(mainActivity);
                            return;
                        case 5:
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{63, -39, 57, 81, -26, 25, -125, -93, 36, -44, 48, 87, -11, 20, -113, -94, 55, -55, 57, 68, -30, 5, -120, -82, 58, -36, 50, 91, -24, 5}, new byte[]{118, -99, 102, 18, -89, 75, -36, -25}, new StringBuilder(), mainActivity), mainActivity.F.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{39, 15, 115, 78, -36, 23, 125, 117, 60, 2, 122, 72, -49, 26, 113, 116, 47, 31, 115, 91, -40, 11, 118, 120, 34, 10, 120, 68, -46, 11, 125, 124, 33, 24, 100}, new byte[]{110, 75, 44, 13, -99, 69, 34, 49}, new StringBuilder(), mainActivity), mainActivity.F.getLevel());
                            return;
                        case 6:
                            String str8 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{124, 117, -28, -97, -11, -64, 27, -76, 103, 120, -19, -103, -26, -51, 23, -75, 116, 101, -28, -108, -15, -45, 16}, new byte[]{53, 49, -69, -36, -76, -110, 68, -16}, new StringBuilder(), mainActivity), mainActivity.D.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-87, 65, -112, 30, -125, 121, -84, -88, -78, 76, -103, 24, -112, 116, -96, -87, -95, 81, -112, 21, -121, 106, -89, -77, -83, 74, -100, 21}, new byte[]{-32, 5, -49, 93, -62, 43, -13, -20}, new StringBuilder(), mainActivity), mainActivity.D.getLevel());
                            return;
                        case 7:
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-43, -46, -119, -64, -118, 76, -33, 120, -45, -58, -97, -49, -124, 74, -33, 104, -39, -41, -126, -36, -125, 91, -63, 111}, new byte[]{-100, -106, -42, -125, -53, 30, ByteCompanionObject.MIN_VALUE, 59}, new StringBuilder(), mainActivity), mainActivity.E.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-54, 108, 111, 56, -100, -25, 14, -123, -52, 120, 121, 55, -110, -31, 14, -107, -58, 105, 100, 36, -107, -16, 16, -110, -36, 101, ByteCompanionObject.MAX_VALUE, 40, -107}, new byte[]{-125, 40, 48, 123, -35, -75, 81, -58}, new StringBuilder(), mainActivity), mainActivity.E.getLevel());
                            return;
                        case 8:
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{20, -55, -61, 106, ByteCompanionObject.MAX_VALUE, 69, 62, -65, 18, -35, -43, 101, 113, 67, 62, -81, 24, -52, -56, 118, 104, 82, 47, -88, 20, -63, -35, 125, 119, 88, 47}, new byte[]{93, -115, -100, 41, 62, 23, 97, -4}, new StringBuilder(), mainActivity), mainActivity.G.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-28, 51, -66, 50, -107, 44, -118, 28, -30, 39, -88, Base64.padSymbol, -101, 42, -118, 12, -24, 54, -75, 46, -126, 59, -101, 11, -28, 59, -96, 37, -99, 49, -101, 0, -32, 56, -78, 57}, new byte[]{-83, 119, -31, 113, -44, 126, -43, 95}, new StringBuilder(), mainActivity), mainActivity.G.getLevel());
                            return;
                        case 9:
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-23, 64, -79, -89, -123, -65, 40, 16, -12, 65, -85, -74, -101, -70, 63, 6, -27, 72, -79, -84, -127, -84, 35}, new byte[]{-96, 4, -18, -28, -60, -19, 119, 67}, new StringBuilder(), mainActivity), mainActivity.H.getisEnable().booleanValue());
                            return;
                        case 10:
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-117, -25, 3, 60, 62, -6, 126, -28, -115, -19, 8, 34, 58, -23, 121, -27, -111, -4, 20, 56, 60, -15}, new byte[]{-62, -93, 92, 125, 125, -91, 56, -74}, new StringBuilder(), mainActivity), mainActivity.I.getisEnable().booleanValue());
                            return;
                        case 11:
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{97, 113, -17, -35, 0, 107, 25, 19, 105, 103, -17, -40, 6, 114, 25, 25, 123, 97}, new byte[]{40, 53, -80, -100, 67, 52, 75, 86}, new StringBuilder(), mainActivity), mainActivity.J.getisEnable().booleanValue());
                            return;
                        default:
                            String str14 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-119, 1, 94, -57, 53, -27, -40, 126, -92, 32, 86, -61, 5, -37, -48, 126, -87, 11, 91, -53, 26, -22, -43, 109, -88, 15, 108, -19, 63}, new byte[]{-35, 104, 51, -94, 113, -124, -76, 31}, new StringBuilder(), mainActivity), mainActivity.K.getisEnable().booleanValue());
                            mainActivity.L(mainActivity.K.getisEnable().booleanValue());
                            return;
                    }
                }
            });
            final int i34 = 3;
            this.V0.setmovL(new Runnable(this) { // from class: e0.y0
                public final /* synthetic */ MainActivity c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i332 = i34;
                    MainActivity mainActivity = this.c;
                    switch (i332) {
                        case 0:
                            String valueOf = String.valueOf(Integer.parseInt(mainActivity.T0.getYLayMovY()) - 1);
                            h0.b.o().saveString(mainActivity.f787p, valueOf);
                            mainActivity.T0.setYLayMovY(valueOf);
                            n3.a(mainActivity);
                            return;
                        case 1:
                            String str3 = MainActivity.f750e1;
                            String valueOf2 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{14, 116, -109, 67, 113, -16, 57, -52, 53, 124, -105, 101, 111, -41, 29, -20}, new byte[]{67, 21, -29, 28, 48, -109, 77, -91}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{-111, 102, 107, 75, 53, 120, 75, 67, -86, 110, 111, 109, 43, 95, 111, 99}, new byte[]{-36, 7, 27, 20, 116, 27, 63, 42}), valueOf2);
                            mainActivity.U0.setYLayMovX(valueOf2);
                            n3.a(mainActivity);
                            return;
                        case 2:
                            String str4 = MainActivity.f750e1;
                            String valueOf3 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-23, -60, -4, -127, 101, 54, -102, 16, -46, -52, -8, -89, 123, 17, -66, 48}, new byte[]{-92, -91, -116, -34, 36, 85, -18, 121}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-66, -70, -81, -63, 42, -44, 16, -18, -123, -78, -85, -25, 52, -13, 52, -50}, new byte[]{-13, -37, -33, -98, 107, -73, 100, -121}), valueOf3);
                            mainActivity.U0.setYLayMovX(valueOf3);
                            n3.a(mainActivity);
                            return;
                        case 3:
                            String str5 = MainActivity.f750e1;
                            String valueOf4 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-50, 2, 110, -35, 99, 41, -71, 88, -11, 10, 106, -5, 125, 14, -99, 120, -36, 36, 75}, new byte[]{-125, 99, 30, -126, 34, 74, -51, 49}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{78, -57, 104, 72, -38, 118, -74, -105, 117, -49, 108, 110, -60, 81, -110, -73, 92, -31, 77}, new byte[]{3, -90, 24, 23, -101, 21, -62, -2}), valueOf4);
                            mainActivity.V0.setYLayMovX(valueOf4);
                            n3.a(mainActivity);
                            return;
                        case 4:
                            String str6 = MainActivity.f750e1;
                            String valueOf5 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{9, 14, -71, 59, 29, -6, -36, -79, 50, 6, -67, 29, 3, -35, -8, -111, 27, 40, -100}, new byte[]{68, 111, -55, 100, 92, -103, -88, -40}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-6, -123, -102, 59, 29, -39, 59, 123, -63, -115, -98, 29, 3, -2, 31, 91, -24, -93, -65}, new byte[]{-73, -28, -22, 100, 92, -70, 79, 18}), valueOf5);
                            mainActivity.V0.setYLayMovX(valueOf5);
                            n3.a(mainActivity);
                            return;
                        case 5:
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{63, -39, 57, 81, -26, 25, -125, -93, 36, -44, 48, 87, -11, 20, -113, -94, 55, -55, 57, 68, -30, 5, -120, -82, 58, -36, 50, 91, -24, 5}, new byte[]{118, -99, 102, 18, -89, 75, -36, -25}, new StringBuilder(), mainActivity), mainActivity.F.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{39, 15, 115, 78, -36, 23, 125, 117, 60, 2, 122, 72, -49, 26, 113, 116, 47, 31, 115, 91, -40, 11, 118, 120, 34, 10, 120, 68, -46, 11, 125, 124, 33, 24, 100}, new byte[]{110, 75, 44, 13, -99, 69, 34, 49}, new StringBuilder(), mainActivity), mainActivity.F.getLevel());
                            return;
                        case 6:
                            String str8 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{124, 117, -28, -97, -11, -64, 27, -76, 103, 120, -19, -103, -26, -51, 23, -75, 116, 101, -28, -108, -15, -45, 16}, new byte[]{53, 49, -69, -36, -76, -110, 68, -16}, new StringBuilder(), mainActivity), mainActivity.D.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-87, 65, -112, 30, -125, 121, -84, -88, -78, 76, -103, 24, -112, 116, -96, -87, -95, 81, -112, 21, -121, 106, -89, -77, -83, 74, -100, 21}, new byte[]{-32, 5, -49, 93, -62, 43, -13, -20}, new StringBuilder(), mainActivity), mainActivity.D.getLevel());
                            return;
                        case 7:
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-43, -46, -119, -64, -118, 76, -33, 120, -45, -58, -97, -49, -124, 74, -33, 104, -39, -41, -126, -36, -125, 91, -63, 111}, new byte[]{-100, -106, -42, -125, -53, 30, ByteCompanionObject.MIN_VALUE, 59}, new StringBuilder(), mainActivity), mainActivity.E.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-54, 108, 111, 56, -100, -25, 14, -123, -52, 120, 121, 55, -110, -31, 14, -107, -58, 105, 100, 36, -107, -16, 16, -110, -36, 101, ByteCompanionObject.MAX_VALUE, 40, -107}, new byte[]{-125, 40, 48, 123, -35, -75, 81, -58}, new StringBuilder(), mainActivity), mainActivity.E.getLevel());
                            return;
                        case 8:
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{20, -55, -61, 106, ByteCompanionObject.MAX_VALUE, 69, 62, -65, 18, -35, -43, 101, 113, 67, 62, -81, 24, -52, -56, 118, 104, 82, 47, -88, 20, -63, -35, 125, 119, 88, 47}, new byte[]{93, -115, -100, 41, 62, 23, 97, -4}, new StringBuilder(), mainActivity), mainActivity.G.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-28, 51, -66, 50, -107, 44, -118, 28, -30, 39, -88, Base64.padSymbol, -101, 42, -118, 12, -24, 54, -75, 46, -126, 59, -101, 11, -28, 59, -96, 37, -99, 49, -101, 0, -32, 56, -78, 57}, new byte[]{-83, 119, -31, 113, -44, 126, -43, 95}, new StringBuilder(), mainActivity), mainActivity.G.getLevel());
                            return;
                        case 9:
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-23, 64, -79, -89, -123, -65, 40, 16, -12, 65, -85, -74, -101, -70, 63, 6, -27, 72, -79, -84, -127, -84, 35}, new byte[]{-96, 4, -18, -28, -60, -19, 119, 67}, new StringBuilder(), mainActivity), mainActivity.H.getisEnable().booleanValue());
                            return;
                        case 10:
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-117, -25, 3, 60, 62, -6, 126, -28, -115, -19, 8, 34, 58, -23, 121, -27, -111, -4, 20, 56, 60, -15}, new byte[]{-62, -93, 92, 125, 125, -91, 56, -74}, new StringBuilder(), mainActivity), mainActivity.I.getisEnable().booleanValue());
                            return;
                        case 11:
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{97, 113, -17, -35, 0, 107, 25, 19, 105, 103, -17, -40, 6, 114, 25, 25, 123, 97}, new byte[]{40, 53, -80, -100, 67, 52, 75, 86}, new StringBuilder(), mainActivity), mainActivity.J.getisEnable().booleanValue());
                            return;
                        default:
                            String str14 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-119, 1, 94, -57, 53, -27, -40, 126, -92, 32, 86, -61, 5, -37, -48, 126, -87, 11, 91, -53, 26, -22, -43, 109, -88, 15, 108, -19, 63}, new byte[]{-35, 104, 51, -94, 113, -124, -76, 31}, new StringBuilder(), mainActivity), mainActivity.K.getisEnable().booleanValue());
                            mainActivity.L(mainActivity.K.getisEnable().booleanValue());
                            return;
                    }
                }
            });
            final int i35 = 4;
            this.V0.setmovR(new Runnable(this) { // from class: e0.y0
                public final /* synthetic */ MainActivity c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i332 = i35;
                    MainActivity mainActivity = this.c;
                    switch (i332) {
                        case 0:
                            String valueOf = String.valueOf(Integer.parseInt(mainActivity.T0.getYLayMovY()) - 1);
                            h0.b.o().saveString(mainActivity.f787p, valueOf);
                            mainActivity.T0.setYLayMovY(valueOf);
                            n3.a(mainActivity);
                            return;
                        case 1:
                            String str3 = MainActivity.f750e1;
                            String valueOf2 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{14, 116, -109, 67, 113, -16, 57, -52, 53, 124, -105, 101, 111, -41, 29, -20}, new byte[]{67, 21, -29, 28, 48, -109, 77, -91}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{-111, 102, 107, 75, 53, 120, 75, 67, -86, 110, 111, 109, 43, 95, 111, 99}, new byte[]{-36, 7, 27, 20, 116, 27, 63, 42}), valueOf2);
                            mainActivity.U0.setYLayMovX(valueOf2);
                            n3.a(mainActivity);
                            return;
                        case 2:
                            String str4 = MainActivity.f750e1;
                            String valueOf3 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-23, -60, -4, -127, 101, 54, -102, 16, -46, -52, -8, -89, 123, 17, -66, 48}, new byte[]{-92, -91, -116, -34, 36, 85, -18, 121}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-66, -70, -81, -63, 42, -44, 16, -18, -123, -78, -85, -25, 52, -13, 52, -50}, new byte[]{-13, -37, -33, -98, 107, -73, 100, -121}), valueOf3);
                            mainActivity.U0.setYLayMovX(valueOf3);
                            n3.a(mainActivity);
                            return;
                        case 3:
                            String str5 = MainActivity.f750e1;
                            String valueOf4 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-50, 2, 110, -35, 99, 41, -71, 88, -11, 10, 106, -5, 125, 14, -99, 120, -36, 36, 75}, new byte[]{-125, 99, 30, -126, 34, 74, -51, 49}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{78, -57, 104, 72, -38, 118, -74, -105, 117, -49, 108, 110, -60, 81, -110, -73, 92, -31, 77}, new byte[]{3, -90, 24, 23, -101, 21, -62, -2}), valueOf4);
                            mainActivity.V0.setYLayMovX(valueOf4);
                            n3.a(mainActivity);
                            return;
                        case 4:
                            String str6 = MainActivity.f750e1;
                            String valueOf5 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{9, 14, -71, 59, 29, -6, -36, -79, 50, 6, -67, 29, 3, -35, -8, -111, 27, 40, -100}, new byte[]{68, 111, -55, 100, 92, -103, -88, -40}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-6, -123, -102, 59, 29, -39, 59, 123, -63, -115, -98, 29, 3, -2, 31, 91, -24, -93, -65}, new byte[]{-73, -28, -22, 100, 92, -70, 79, 18}), valueOf5);
                            mainActivity.V0.setYLayMovX(valueOf5);
                            n3.a(mainActivity);
                            return;
                        case 5:
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{63, -39, 57, 81, -26, 25, -125, -93, 36, -44, 48, 87, -11, 20, -113, -94, 55, -55, 57, 68, -30, 5, -120, -82, 58, -36, 50, 91, -24, 5}, new byte[]{118, -99, 102, 18, -89, 75, -36, -25}, new StringBuilder(), mainActivity), mainActivity.F.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{39, 15, 115, 78, -36, 23, 125, 117, 60, 2, 122, 72, -49, 26, 113, 116, 47, 31, 115, 91, -40, 11, 118, 120, 34, 10, 120, 68, -46, 11, 125, 124, 33, 24, 100}, new byte[]{110, 75, 44, 13, -99, 69, 34, 49}, new StringBuilder(), mainActivity), mainActivity.F.getLevel());
                            return;
                        case 6:
                            String str8 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{124, 117, -28, -97, -11, -64, 27, -76, 103, 120, -19, -103, -26, -51, 23, -75, 116, 101, -28, -108, -15, -45, 16}, new byte[]{53, 49, -69, -36, -76, -110, 68, -16}, new StringBuilder(), mainActivity), mainActivity.D.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-87, 65, -112, 30, -125, 121, -84, -88, -78, 76, -103, 24, -112, 116, -96, -87, -95, 81, -112, 21, -121, 106, -89, -77, -83, 74, -100, 21}, new byte[]{-32, 5, -49, 93, -62, 43, -13, -20}, new StringBuilder(), mainActivity), mainActivity.D.getLevel());
                            return;
                        case 7:
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-43, -46, -119, -64, -118, 76, -33, 120, -45, -58, -97, -49, -124, 74, -33, 104, -39, -41, -126, -36, -125, 91, -63, 111}, new byte[]{-100, -106, -42, -125, -53, 30, ByteCompanionObject.MIN_VALUE, 59}, new StringBuilder(), mainActivity), mainActivity.E.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-54, 108, 111, 56, -100, -25, 14, -123, -52, 120, 121, 55, -110, -31, 14, -107, -58, 105, 100, 36, -107, -16, 16, -110, -36, 101, ByteCompanionObject.MAX_VALUE, 40, -107}, new byte[]{-125, 40, 48, 123, -35, -75, 81, -58}, new StringBuilder(), mainActivity), mainActivity.E.getLevel());
                            return;
                        case 8:
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{20, -55, -61, 106, ByteCompanionObject.MAX_VALUE, 69, 62, -65, 18, -35, -43, 101, 113, 67, 62, -81, 24, -52, -56, 118, 104, 82, 47, -88, 20, -63, -35, 125, 119, 88, 47}, new byte[]{93, -115, -100, 41, 62, 23, 97, -4}, new StringBuilder(), mainActivity), mainActivity.G.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-28, 51, -66, 50, -107, 44, -118, 28, -30, 39, -88, Base64.padSymbol, -101, 42, -118, 12, -24, 54, -75, 46, -126, 59, -101, 11, -28, 59, -96, 37, -99, 49, -101, 0, -32, 56, -78, 57}, new byte[]{-83, 119, -31, 113, -44, 126, -43, 95}, new StringBuilder(), mainActivity), mainActivity.G.getLevel());
                            return;
                        case 9:
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-23, 64, -79, -89, -123, -65, 40, 16, -12, 65, -85, -74, -101, -70, 63, 6, -27, 72, -79, -84, -127, -84, 35}, new byte[]{-96, 4, -18, -28, -60, -19, 119, 67}, new StringBuilder(), mainActivity), mainActivity.H.getisEnable().booleanValue());
                            return;
                        case 10:
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-117, -25, 3, 60, 62, -6, 126, -28, -115, -19, 8, 34, 58, -23, 121, -27, -111, -4, 20, 56, 60, -15}, new byte[]{-62, -93, 92, 125, 125, -91, 56, -74}, new StringBuilder(), mainActivity), mainActivity.I.getisEnable().booleanValue());
                            return;
                        case 11:
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{97, 113, -17, -35, 0, 107, 25, 19, 105, 103, -17, -40, 6, 114, 25, 25, 123, 97}, new byte[]{40, 53, -80, -100, 67, 52, 75, 86}, new StringBuilder(), mainActivity), mainActivity.J.getisEnable().booleanValue());
                            return;
                        default:
                            String str14 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-119, 1, 94, -57, 53, -27, -40, 126, -92, 32, 86, -61, 5, -37, -48, 126, -87, 11, 91, -53, 26, -22, -43, 109, -88, 15, 108, -19, 63}, new byte[]{-35, 104, 51, -94, 113, -124, -76, 31}, new StringBuilder(), mainActivity), mainActivity.K.getisEnable().booleanValue());
                            mainActivity.L(mainActivity.K.getisEnable().booleanValue());
                            return;
                    }
                }
            });
            d0.d(this);
            ((Button) findViewById(R.id.button)).setOnClickListener(new q0(this, 28));
            ((Button) findViewById(R.id.button2)).setOnClickListener(new q0(this, 29));
            final int i36 = 5;
            this.F.setLevelRun(new Runnable(this) { // from class: e0.y0
                public final /* synthetic */ MainActivity c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i332 = i36;
                    MainActivity mainActivity = this.c;
                    switch (i332) {
                        case 0:
                            String valueOf = String.valueOf(Integer.parseInt(mainActivity.T0.getYLayMovY()) - 1);
                            h0.b.o().saveString(mainActivity.f787p, valueOf);
                            mainActivity.T0.setYLayMovY(valueOf);
                            n3.a(mainActivity);
                            return;
                        case 1:
                            String str3 = MainActivity.f750e1;
                            String valueOf2 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{14, 116, -109, 67, 113, -16, 57, -52, 53, 124, -105, 101, 111, -41, 29, -20}, new byte[]{67, 21, -29, 28, 48, -109, 77, -91}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{-111, 102, 107, 75, 53, 120, 75, 67, -86, 110, 111, 109, 43, 95, 111, 99}, new byte[]{-36, 7, 27, 20, 116, 27, 63, 42}), valueOf2);
                            mainActivity.U0.setYLayMovX(valueOf2);
                            n3.a(mainActivity);
                            return;
                        case 2:
                            String str4 = MainActivity.f750e1;
                            String valueOf3 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-23, -60, -4, -127, 101, 54, -102, 16, -46, -52, -8, -89, 123, 17, -66, 48}, new byte[]{-92, -91, -116, -34, 36, 85, -18, 121}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-66, -70, -81, -63, 42, -44, 16, -18, -123, -78, -85, -25, 52, -13, 52, -50}, new byte[]{-13, -37, -33, -98, 107, -73, 100, -121}), valueOf3);
                            mainActivity.U0.setYLayMovX(valueOf3);
                            n3.a(mainActivity);
                            return;
                        case 3:
                            String str5 = MainActivity.f750e1;
                            String valueOf4 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-50, 2, 110, -35, 99, 41, -71, 88, -11, 10, 106, -5, 125, 14, -99, 120, -36, 36, 75}, new byte[]{-125, 99, 30, -126, 34, 74, -51, 49}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{78, -57, 104, 72, -38, 118, -74, -105, 117, -49, 108, 110, -60, 81, -110, -73, 92, -31, 77}, new byte[]{3, -90, 24, 23, -101, 21, -62, -2}), valueOf4);
                            mainActivity.V0.setYLayMovX(valueOf4);
                            n3.a(mainActivity);
                            return;
                        case 4:
                            String str6 = MainActivity.f750e1;
                            String valueOf5 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{9, 14, -71, 59, 29, -6, -36, -79, 50, 6, -67, 29, 3, -35, -8, -111, 27, 40, -100}, new byte[]{68, 111, -55, 100, 92, -103, -88, -40}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-6, -123, -102, 59, 29, -39, 59, 123, -63, -115, -98, 29, 3, -2, 31, 91, -24, -93, -65}, new byte[]{-73, -28, -22, 100, 92, -70, 79, 18}), valueOf5);
                            mainActivity.V0.setYLayMovX(valueOf5);
                            n3.a(mainActivity);
                            return;
                        case 5:
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{63, -39, 57, 81, -26, 25, -125, -93, 36, -44, 48, 87, -11, 20, -113, -94, 55, -55, 57, 68, -30, 5, -120, -82, 58, -36, 50, 91, -24, 5}, new byte[]{118, -99, 102, 18, -89, 75, -36, -25}, new StringBuilder(), mainActivity), mainActivity.F.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{39, 15, 115, 78, -36, 23, 125, 117, 60, 2, 122, 72, -49, 26, 113, 116, 47, 31, 115, 91, -40, 11, 118, 120, 34, 10, 120, 68, -46, 11, 125, 124, 33, 24, 100}, new byte[]{110, 75, 44, 13, -99, 69, 34, 49}, new StringBuilder(), mainActivity), mainActivity.F.getLevel());
                            return;
                        case 6:
                            String str8 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{124, 117, -28, -97, -11, -64, 27, -76, 103, 120, -19, -103, -26, -51, 23, -75, 116, 101, -28, -108, -15, -45, 16}, new byte[]{53, 49, -69, -36, -76, -110, 68, -16}, new StringBuilder(), mainActivity), mainActivity.D.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-87, 65, -112, 30, -125, 121, -84, -88, -78, 76, -103, 24, -112, 116, -96, -87, -95, 81, -112, 21, -121, 106, -89, -77, -83, 74, -100, 21}, new byte[]{-32, 5, -49, 93, -62, 43, -13, -20}, new StringBuilder(), mainActivity), mainActivity.D.getLevel());
                            return;
                        case 7:
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-43, -46, -119, -64, -118, 76, -33, 120, -45, -58, -97, -49, -124, 74, -33, 104, -39, -41, -126, -36, -125, 91, -63, 111}, new byte[]{-100, -106, -42, -125, -53, 30, ByteCompanionObject.MIN_VALUE, 59}, new StringBuilder(), mainActivity), mainActivity.E.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-54, 108, 111, 56, -100, -25, 14, -123, -52, 120, 121, 55, -110, -31, 14, -107, -58, 105, 100, 36, -107, -16, 16, -110, -36, 101, ByteCompanionObject.MAX_VALUE, 40, -107}, new byte[]{-125, 40, 48, 123, -35, -75, 81, -58}, new StringBuilder(), mainActivity), mainActivity.E.getLevel());
                            return;
                        case 8:
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{20, -55, -61, 106, ByteCompanionObject.MAX_VALUE, 69, 62, -65, 18, -35, -43, 101, 113, 67, 62, -81, 24, -52, -56, 118, 104, 82, 47, -88, 20, -63, -35, 125, 119, 88, 47}, new byte[]{93, -115, -100, 41, 62, 23, 97, -4}, new StringBuilder(), mainActivity), mainActivity.G.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-28, 51, -66, 50, -107, 44, -118, 28, -30, 39, -88, Base64.padSymbol, -101, 42, -118, 12, -24, 54, -75, 46, -126, 59, -101, 11, -28, 59, -96, 37, -99, 49, -101, 0, -32, 56, -78, 57}, new byte[]{-83, 119, -31, 113, -44, 126, -43, 95}, new StringBuilder(), mainActivity), mainActivity.G.getLevel());
                            return;
                        case 9:
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-23, 64, -79, -89, -123, -65, 40, 16, -12, 65, -85, -74, -101, -70, 63, 6, -27, 72, -79, -84, -127, -84, 35}, new byte[]{-96, 4, -18, -28, -60, -19, 119, 67}, new StringBuilder(), mainActivity), mainActivity.H.getisEnable().booleanValue());
                            return;
                        case 10:
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-117, -25, 3, 60, 62, -6, 126, -28, -115, -19, 8, 34, 58, -23, 121, -27, -111, -4, 20, 56, 60, -15}, new byte[]{-62, -93, 92, 125, 125, -91, 56, -74}, new StringBuilder(), mainActivity), mainActivity.I.getisEnable().booleanValue());
                            return;
                        case 11:
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{97, 113, -17, -35, 0, 107, 25, 19, 105, 103, -17, -40, 6, 114, 25, 25, 123, 97}, new byte[]{40, 53, -80, -100, 67, 52, 75, 86}, new StringBuilder(), mainActivity), mainActivity.J.getisEnable().booleanValue());
                            return;
                        default:
                            String str14 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-119, 1, 94, -57, 53, -27, -40, 126, -92, 32, 86, -61, 5, -37, -48, 126, -87, 11, 91, -53, 26, -22, -43, 109, -88, 15, 108, -19, 63}, new byte[]{-35, 104, 51, -94, 113, -124, -76, 31}, new StringBuilder(), mainActivity), mainActivity.K.getisEnable().booleanValue());
                            mainActivity.L(mainActivity.K.getisEnable().booleanValue());
                            return;
                    }
                }
            });
            final int i37 = 6;
            this.D.setLevelRun(new Runnable(this) { // from class: e0.y0
                public final /* synthetic */ MainActivity c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i332 = i37;
                    MainActivity mainActivity = this.c;
                    switch (i332) {
                        case 0:
                            String valueOf = String.valueOf(Integer.parseInt(mainActivity.T0.getYLayMovY()) - 1);
                            h0.b.o().saveString(mainActivity.f787p, valueOf);
                            mainActivity.T0.setYLayMovY(valueOf);
                            n3.a(mainActivity);
                            return;
                        case 1:
                            String str3 = MainActivity.f750e1;
                            String valueOf2 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{14, 116, -109, 67, 113, -16, 57, -52, 53, 124, -105, 101, 111, -41, 29, -20}, new byte[]{67, 21, -29, 28, 48, -109, 77, -91}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{-111, 102, 107, 75, 53, 120, 75, 67, -86, 110, 111, 109, 43, 95, 111, 99}, new byte[]{-36, 7, 27, 20, 116, 27, 63, 42}), valueOf2);
                            mainActivity.U0.setYLayMovX(valueOf2);
                            n3.a(mainActivity);
                            return;
                        case 2:
                            String str4 = MainActivity.f750e1;
                            String valueOf3 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-23, -60, -4, -127, 101, 54, -102, 16, -46, -52, -8, -89, 123, 17, -66, 48}, new byte[]{-92, -91, -116, -34, 36, 85, -18, 121}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-66, -70, -81, -63, 42, -44, 16, -18, -123, -78, -85, -25, 52, -13, 52, -50}, new byte[]{-13, -37, -33, -98, 107, -73, 100, -121}), valueOf3);
                            mainActivity.U0.setYLayMovX(valueOf3);
                            n3.a(mainActivity);
                            return;
                        case 3:
                            String str5 = MainActivity.f750e1;
                            String valueOf4 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-50, 2, 110, -35, 99, 41, -71, 88, -11, 10, 106, -5, 125, 14, -99, 120, -36, 36, 75}, new byte[]{-125, 99, 30, -126, 34, 74, -51, 49}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{78, -57, 104, 72, -38, 118, -74, -105, 117, -49, 108, 110, -60, 81, -110, -73, 92, -31, 77}, new byte[]{3, -90, 24, 23, -101, 21, -62, -2}), valueOf4);
                            mainActivity.V0.setYLayMovX(valueOf4);
                            n3.a(mainActivity);
                            return;
                        case 4:
                            String str6 = MainActivity.f750e1;
                            String valueOf5 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{9, 14, -71, 59, 29, -6, -36, -79, 50, 6, -67, 29, 3, -35, -8, -111, 27, 40, -100}, new byte[]{68, 111, -55, 100, 92, -103, -88, -40}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-6, -123, -102, 59, 29, -39, 59, 123, -63, -115, -98, 29, 3, -2, 31, 91, -24, -93, -65}, new byte[]{-73, -28, -22, 100, 92, -70, 79, 18}), valueOf5);
                            mainActivity.V0.setYLayMovX(valueOf5);
                            n3.a(mainActivity);
                            return;
                        case 5:
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{63, -39, 57, 81, -26, 25, -125, -93, 36, -44, 48, 87, -11, 20, -113, -94, 55, -55, 57, 68, -30, 5, -120, -82, 58, -36, 50, 91, -24, 5}, new byte[]{118, -99, 102, 18, -89, 75, -36, -25}, new StringBuilder(), mainActivity), mainActivity.F.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{39, 15, 115, 78, -36, 23, 125, 117, 60, 2, 122, 72, -49, 26, 113, 116, 47, 31, 115, 91, -40, 11, 118, 120, 34, 10, 120, 68, -46, 11, 125, 124, 33, 24, 100}, new byte[]{110, 75, 44, 13, -99, 69, 34, 49}, new StringBuilder(), mainActivity), mainActivity.F.getLevel());
                            return;
                        case 6:
                            String str8 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{124, 117, -28, -97, -11, -64, 27, -76, 103, 120, -19, -103, -26, -51, 23, -75, 116, 101, -28, -108, -15, -45, 16}, new byte[]{53, 49, -69, -36, -76, -110, 68, -16}, new StringBuilder(), mainActivity), mainActivity.D.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-87, 65, -112, 30, -125, 121, -84, -88, -78, 76, -103, 24, -112, 116, -96, -87, -95, 81, -112, 21, -121, 106, -89, -77, -83, 74, -100, 21}, new byte[]{-32, 5, -49, 93, -62, 43, -13, -20}, new StringBuilder(), mainActivity), mainActivity.D.getLevel());
                            return;
                        case 7:
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-43, -46, -119, -64, -118, 76, -33, 120, -45, -58, -97, -49, -124, 74, -33, 104, -39, -41, -126, -36, -125, 91, -63, 111}, new byte[]{-100, -106, -42, -125, -53, 30, ByteCompanionObject.MIN_VALUE, 59}, new StringBuilder(), mainActivity), mainActivity.E.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-54, 108, 111, 56, -100, -25, 14, -123, -52, 120, 121, 55, -110, -31, 14, -107, -58, 105, 100, 36, -107, -16, 16, -110, -36, 101, ByteCompanionObject.MAX_VALUE, 40, -107}, new byte[]{-125, 40, 48, 123, -35, -75, 81, -58}, new StringBuilder(), mainActivity), mainActivity.E.getLevel());
                            return;
                        case 8:
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{20, -55, -61, 106, ByteCompanionObject.MAX_VALUE, 69, 62, -65, 18, -35, -43, 101, 113, 67, 62, -81, 24, -52, -56, 118, 104, 82, 47, -88, 20, -63, -35, 125, 119, 88, 47}, new byte[]{93, -115, -100, 41, 62, 23, 97, -4}, new StringBuilder(), mainActivity), mainActivity.G.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-28, 51, -66, 50, -107, 44, -118, 28, -30, 39, -88, Base64.padSymbol, -101, 42, -118, 12, -24, 54, -75, 46, -126, 59, -101, 11, -28, 59, -96, 37, -99, 49, -101, 0, -32, 56, -78, 57}, new byte[]{-83, 119, -31, 113, -44, 126, -43, 95}, new StringBuilder(), mainActivity), mainActivity.G.getLevel());
                            return;
                        case 9:
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-23, 64, -79, -89, -123, -65, 40, 16, -12, 65, -85, -74, -101, -70, 63, 6, -27, 72, -79, -84, -127, -84, 35}, new byte[]{-96, 4, -18, -28, -60, -19, 119, 67}, new StringBuilder(), mainActivity), mainActivity.H.getisEnable().booleanValue());
                            return;
                        case 10:
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-117, -25, 3, 60, 62, -6, 126, -28, -115, -19, 8, 34, 58, -23, 121, -27, -111, -4, 20, 56, 60, -15}, new byte[]{-62, -93, 92, 125, 125, -91, 56, -74}, new StringBuilder(), mainActivity), mainActivity.I.getisEnable().booleanValue());
                            return;
                        case 11:
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{97, 113, -17, -35, 0, 107, 25, 19, 105, 103, -17, -40, 6, 114, 25, 25, 123, 97}, new byte[]{40, 53, -80, -100, 67, 52, 75, 86}, new StringBuilder(), mainActivity), mainActivity.J.getisEnable().booleanValue());
                            return;
                        default:
                            String str14 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-119, 1, 94, -57, 53, -27, -40, 126, -92, 32, 86, -61, 5, -37, -48, 126, -87, 11, 91, -53, 26, -22, -43, 109, -88, 15, 108, -19, 63}, new byte[]{-35, 104, 51, -94, 113, -124, -76, 31}, new StringBuilder(), mainActivity), mainActivity.K.getisEnable().booleanValue());
                            mainActivity.L(mainActivity.K.getisEnable().booleanValue());
                            return;
                    }
                }
            });
            final int i38 = 7;
            this.E.setLevelRun(new Runnable(this) { // from class: e0.y0
                public final /* synthetic */ MainActivity c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i332 = i38;
                    MainActivity mainActivity = this.c;
                    switch (i332) {
                        case 0:
                            String valueOf = String.valueOf(Integer.parseInt(mainActivity.T0.getYLayMovY()) - 1);
                            h0.b.o().saveString(mainActivity.f787p, valueOf);
                            mainActivity.T0.setYLayMovY(valueOf);
                            n3.a(mainActivity);
                            return;
                        case 1:
                            String str3 = MainActivity.f750e1;
                            String valueOf2 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{14, 116, -109, 67, 113, -16, 57, -52, 53, 124, -105, 101, 111, -41, 29, -20}, new byte[]{67, 21, -29, 28, 48, -109, 77, -91}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{-111, 102, 107, 75, 53, 120, 75, 67, -86, 110, 111, 109, 43, 95, 111, 99}, new byte[]{-36, 7, 27, 20, 116, 27, 63, 42}), valueOf2);
                            mainActivity.U0.setYLayMovX(valueOf2);
                            n3.a(mainActivity);
                            return;
                        case 2:
                            String str4 = MainActivity.f750e1;
                            String valueOf3 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-23, -60, -4, -127, 101, 54, -102, 16, -46, -52, -8, -89, 123, 17, -66, 48}, new byte[]{-92, -91, -116, -34, 36, 85, -18, 121}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-66, -70, -81, -63, 42, -44, 16, -18, -123, -78, -85, -25, 52, -13, 52, -50}, new byte[]{-13, -37, -33, -98, 107, -73, 100, -121}), valueOf3);
                            mainActivity.U0.setYLayMovX(valueOf3);
                            n3.a(mainActivity);
                            return;
                        case 3:
                            String str5 = MainActivity.f750e1;
                            String valueOf4 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-50, 2, 110, -35, 99, 41, -71, 88, -11, 10, 106, -5, 125, 14, -99, 120, -36, 36, 75}, new byte[]{-125, 99, 30, -126, 34, 74, -51, 49}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{78, -57, 104, 72, -38, 118, -74, -105, 117, -49, 108, 110, -60, 81, -110, -73, 92, -31, 77}, new byte[]{3, -90, 24, 23, -101, 21, -62, -2}), valueOf4);
                            mainActivity.V0.setYLayMovX(valueOf4);
                            n3.a(mainActivity);
                            return;
                        case 4:
                            String str6 = MainActivity.f750e1;
                            String valueOf5 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{9, 14, -71, 59, 29, -6, -36, -79, 50, 6, -67, 29, 3, -35, -8, -111, 27, 40, -100}, new byte[]{68, 111, -55, 100, 92, -103, -88, -40}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-6, -123, -102, 59, 29, -39, 59, 123, -63, -115, -98, 29, 3, -2, 31, 91, -24, -93, -65}, new byte[]{-73, -28, -22, 100, 92, -70, 79, 18}), valueOf5);
                            mainActivity.V0.setYLayMovX(valueOf5);
                            n3.a(mainActivity);
                            return;
                        case 5:
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{63, -39, 57, 81, -26, 25, -125, -93, 36, -44, 48, 87, -11, 20, -113, -94, 55, -55, 57, 68, -30, 5, -120, -82, 58, -36, 50, 91, -24, 5}, new byte[]{118, -99, 102, 18, -89, 75, -36, -25}, new StringBuilder(), mainActivity), mainActivity.F.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{39, 15, 115, 78, -36, 23, 125, 117, 60, 2, 122, 72, -49, 26, 113, 116, 47, 31, 115, 91, -40, 11, 118, 120, 34, 10, 120, 68, -46, 11, 125, 124, 33, 24, 100}, new byte[]{110, 75, 44, 13, -99, 69, 34, 49}, new StringBuilder(), mainActivity), mainActivity.F.getLevel());
                            return;
                        case 6:
                            String str8 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{124, 117, -28, -97, -11, -64, 27, -76, 103, 120, -19, -103, -26, -51, 23, -75, 116, 101, -28, -108, -15, -45, 16}, new byte[]{53, 49, -69, -36, -76, -110, 68, -16}, new StringBuilder(), mainActivity), mainActivity.D.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-87, 65, -112, 30, -125, 121, -84, -88, -78, 76, -103, 24, -112, 116, -96, -87, -95, 81, -112, 21, -121, 106, -89, -77, -83, 74, -100, 21}, new byte[]{-32, 5, -49, 93, -62, 43, -13, -20}, new StringBuilder(), mainActivity), mainActivity.D.getLevel());
                            return;
                        case 7:
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-43, -46, -119, -64, -118, 76, -33, 120, -45, -58, -97, -49, -124, 74, -33, 104, -39, -41, -126, -36, -125, 91, -63, 111}, new byte[]{-100, -106, -42, -125, -53, 30, ByteCompanionObject.MIN_VALUE, 59}, new StringBuilder(), mainActivity), mainActivity.E.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-54, 108, 111, 56, -100, -25, 14, -123, -52, 120, 121, 55, -110, -31, 14, -107, -58, 105, 100, 36, -107, -16, 16, -110, -36, 101, ByteCompanionObject.MAX_VALUE, 40, -107}, new byte[]{-125, 40, 48, 123, -35, -75, 81, -58}, new StringBuilder(), mainActivity), mainActivity.E.getLevel());
                            return;
                        case 8:
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{20, -55, -61, 106, ByteCompanionObject.MAX_VALUE, 69, 62, -65, 18, -35, -43, 101, 113, 67, 62, -81, 24, -52, -56, 118, 104, 82, 47, -88, 20, -63, -35, 125, 119, 88, 47}, new byte[]{93, -115, -100, 41, 62, 23, 97, -4}, new StringBuilder(), mainActivity), mainActivity.G.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-28, 51, -66, 50, -107, 44, -118, 28, -30, 39, -88, Base64.padSymbol, -101, 42, -118, 12, -24, 54, -75, 46, -126, 59, -101, 11, -28, 59, -96, 37, -99, 49, -101, 0, -32, 56, -78, 57}, new byte[]{-83, 119, -31, 113, -44, 126, -43, 95}, new StringBuilder(), mainActivity), mainActivity.G.getLevel());
                            return;
                        case 9:
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-23, 64, -79, -89, -123, -65, 40, 16, -12, 65, -85, -74, -101, -70, 63, 6, -27, 72, -79, -84, -127, -84, 35}, new byte[]{-96, 4, -18, -28, -60, -19, 119, 67}, new StringBuilder(), mainActivity), mainActivity.H.getisEnable().booleanValue());
                            return;
                        case 10:
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-117, -25, 3, 60, 62, -6, 126, -28, -115, -19, 8, 34, 58, -23, 121, -27, -111, -4, 20, 56, 60, -15}, new byte[]{-62, -93, 92, 125, 125, -91, 56, -74}, new StringBuilder(), mainActivity), mainActivity.I.getisEnable().booleanValue());
                            return;
                        case 11:
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{97, 113, -17, -35, 0, 107, 25, 19, 105, 103, -17, -40, 6, 114, 25, 25, 123, 97}, new byte[]{40, 53, -80, -100, 67, 52, 75, 86}, new StringBuilder(), mainActivity), mainActivity.J.getisEnable().booleanValue());
                            return;
                        default:
                            String str14 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-119, 1, 94, -57, 53, -27, -40, 126, -92, 32, 86, -61, 5, -37, -48, 126, -87, 11, 91, -53, 26, -22, -43, 109, -88, 15, 108, -19, 63}, new byte[]{-35, 104, 51, -94, 113, -124, -76, 31}, new StringBuilder(), mainActivity), mainActivity.K.getisEnable().booleanValue());
                            mainActivity.L(mainActivity.K.getisEnable().booleanValue());
                            return;
                    }
                }
            });
            this.G.setLevelRun(new Runnable(this) { // from class: e0.y0
                public final /* synthetic */ MainActivity c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i332 = i11;
                    MainActivity mainActivity = this.c;
                    switch (i332) {
                        case 0:
                            String valueOf = String.valueOf(Integer.parseInt(mainActivity.T0.getYLayMovY()) - 1);
                            h0.b.o().saveString(mainActivity.f787p, valueOf);
                            mainActivity.T0.setYLayMovY(valueOf);
                            n3.a(mainActivity);
                            return;
                        case 1:
                            String str3 = MainActivity.f750e1;
                            String valueOf2 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{14, 116, -109, 67, 113, -16, 57, -52, 53, 124, -105, 101, 111, -41, 29, -20}, new byte[]{67, 21, -29, 28, 48, -109, 77, -91}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{-111, 102, 107, 75, 53, 120, 75, 67, -86, 110, 111, 109, 43, 95, 111, 99}, new byte[]{-36, 7, 27, 20, 116, 27, 63, 42}), valueOf2);
                            mainActivity.U0.setYLayMovX(valueOf2);
                            n3.a(mainActivity);
                            return;
                        case 2:
                            String str4 = MainActivity.f750e1;
                            String valueOf3 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-23, -60, -4, -127, 101, 54, -102, 16, -46, -52, -8, -89, 123, 17, -66, 48}, new byte[]{-92, -91, -116, -34, 36, 85, -18, 121}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-66, -70, -81, -63, 42, -44, 16, -18, -123, -78, -85, -25, 52, -13, 52, -50}, new byte[]{-13, -37, -33, -98, 107, -73, 100, -121}), valueOf3);
                            mainActivity.U0.setYLayMovX(valueOf3);
                            n3.a(mainActivity);
                            return;
                        case 3:
                            String str5 = MainActivity.f750e1;
                            String valueOf4 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-50, 2, 110, -35, 99, 41, -71, 88, -11, 10, 106, -5, 125, 14, -99, 120, -36, 36, 75}, new byte[]{-125, 99, 30, -126, 34, 74, -51, 49}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{78, -57, 104, 72, -38, 118, -74, -105, 117, -49, 108, 110, -60, 81, -110, -73, 92, -31, 77}, new byte[]{3, -90, 24, 23, -101, 21, -62, -2}), valueOf4);
                            mainActivity.V0.setYLayMovX(valueOf4);
                            n3.a(mainActivity);
                            return;
                        case 4:
                            String str6 = MainActivity.f750e1;
                            String valueOf5 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{9, 14, -71, 59, 29, -6, -36, -79, 50, 6, -67, 29, 3, -35, -8, -111, 27, 40, -100}, new byte[]{68, 111, -55, 100, 92, -103, -88, -40}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-6, -123, -102, 59, 29, -39, 59, 123, -63, -115, -98, 29, 3, -2, 31, 91, -24, -93, -65}, new byte[]{-73, -28, -22, 100, 92, -70, 79, 18}), valueOf5);
                            mainActivity.V0.setYLayMovX(valueOf5);
                            n3.a(mainActivity);
                            return;
                        case 5:
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{63, -39, 57, 81, -26, 25, -125, -93, 36, -44, 48, 87, -11, 20, -113, -94, 55, -55, 57, 68, -30, 5, -120, -82, 58, -36, 50, 91, -24, 5}, new byte[]{118, -99, 102, 18, -89, 75, -36, -25}, new StringBuilder(), mainActivity), mainActivity.F.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{39, 15, 115, 78, -36, 23, 125, 117, 60, 2, 122, 72, -49, 26, 113, 116, 47, 31, 115, 91, -40, 11, 118, 120, 34, 10, 120, 68, -46, 11, 125, 124, 33, 24, 100}, new byte[]{110, 75, 44, 13, -99, 69, 34, 49}, new StringBuilder(), mainActivity), mainActivity.F.getLevel());
                            return;
                        case 6:
                            String str8 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{124, 117, -28, -97, -11, -64, 27, -76, 103, 120, -19, -103, -26, -51, 23, -75, 116, 101, -28, -108, -15, -45, 16}, new byte[]{53, 49, -69, -36, -76, -110, 68, -16}, new StringBuilder(), mainActivity), mainActivity.D.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-87, 65, -112, 30, -125, 121, -84, -88, -78, 76, -103, 24, -112, 116, -96, -87, -95, 81, -112, 21, -121, 106, -89, -77, -83, 74, -100, 21}, new byte[]{-32, 5, -49, 93, -62, 43, -13, -20}, new StringBuilder(), mainActivity), mainActivity.D.getLevel());
                            return;
                        case 7:
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-43, -46, -119, -64, -118, 76, -33, 120, -45, -58, -97, -49, -124, 74, -33, 104, -39, -41, -126, -36, -125, 91, -63, 111}, new byte[]{-100, -106, -42, -125, -53, 30, ByteCompanionObject.MIN_VALUE, 59}, new StringBuilder(), mainActivity), mainActivity.E.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-54, 108, 111, 56, -100, -25, 14, -123, -52, 120, 121, 55, -110, -31, 14, -107, -58, 105, 100, 36, -107, -16, 16, -110, -36, 101, ByteCompanionObject.MAX_VALUE, 40, -107}, new byte[]{-125, 40, 48, 123, -35, -75, 81, -58}, new StringBuilder(), mainActivity), mainActivity.E.getLevel());
                            return;
                        case 8:
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{20, -55, -61, 106, ByteCompanionObject.MAX_VALUE, 69, 62, -65, 18, -35, -43, 101, 113, 67, 62, -81, 24, -52, -56, 118, 104, 82, 47, -88, 20, -63, -35, 125, 119, 88, 47}, new byte[]{93, -115, -100, 41, 62, 23, 97, -4}, new StringBuilder(), mainActivity), mainActivity.G.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-28, 51, -66, 50, -107, 44, -118, 28, -30, 39, -88, Base64.padSymbol, -101, 42, -118, 12, -24, 54, -75, 46, -126, 59, -101, 11, -28, 59, -96, 37, -99, 49, -101, 0, -32, 56, -78, 57}, new byte[]{-83, 119, -31, 113, -44, 126, -43, 95}, new StringBuilder(), mainActivity), mainActivity.G.getLevel());
                            return;
                        case 9:
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-23, 64, -79, -89, -123, -65, 40, 16, -12, 65, -85, -74, -101, -70, 63, 6, -27, 72, -79, -84, -127, -84, 35}, new byte[]{-96, 4, -18, -28, -60, -19, 119, 67}, new StringBuilder(), mainActivity), mainActivity.H.getisEnable().booleanValue());
                            return;
                        case 10:
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-117, -25, 3, 60, 62, -6, 126, -28, -115, -19, 8, 34, 58, -23, 121, -27, -111, -4, 20, 56, 60, -15}, new byte[]{-62, -93, 92, 125, 125, -91, 56, -74}, new StringBuilder(), mainActivity), mainActivity.I.getisEnable().booleanValue());
                            return;
                        case 11:
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{97, 113, -17, -35, 0, 107, 25, 19, 105, 103, -17, -40, 6, 114, 25, 25, 123, 97}, new byte[]{40, 53, -80, -100, 67, 52, 75, 86}, new StringBuilder(), mainActivity), mainActivity.J.getisEnable().booleanValue());
                            return;
                        default:
                            String str14 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-119, 1, 94, -57, 53, -27, -40, 126, -92, 32, 86, -61, 5, -37, -48, 126, -87, 11, 91, -53, 26, -22, -43, 109, -88, 15, 108, -19, 63}, new byte[]{-35, 104, 51, -94, 113, -124, -76, 31}, new StringBuilder(), mainActivity), mainActivity.K.getisEnable().booleanValue());
                            mainActivity.L(mainActivity.K.getisEnable().booleanValue());
                            return;
                    }
                }
            });
            final int i39 = 9;
            this.H.setLevelRun(new Runnable(this) { // from class: e0.y0
                public final /* synthetic */ MainActivity c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i332 = i39;
                    MainActivity mainActivity = this.c;
                    switch (i332) {
                        case 0:
                            String valueOf = String.valueOf(Integer.parseInt(mainActivity.T0.getYLayMovY()) - 1);
                            h0.b.o().saveString(mainActivity.f787p, valueOf);
                            mainActivity.T0.setYLayMovY(valueOf);
                            n3.a(mainActivity);
                            return;
                        case 1:
                            String str3 = MainActivity.f750e1;
                            String valueOf2 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{14, 116, -109, 67, 113, -16, 57, -52, 53, 124, -105, 101, 111, -41, 29, -20}, new byte[]{67, 21, -29, 28, 48, -109, 77, -91}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{-111, 102, 107, 75, 53, 120, 75, 67, -86, 110, 111, 109, 43, 95, 111, 99}, new byte[]{-36, 7, 27, 20, 116, 27, 63, 42}), valueOf2);
                            mainActivity.U0.setYLayMovX(valueOf2);
                            n3.a(mainActivity);
                            return;
                        case 2:
                            String str4 = MainActivity.f750e1;
                            String valueOf3 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-23, -60, -4, -127, 101, 54, -102, 16, -46, -52, -8, -89, 123, 17, -66, 48}, new byte[]{-92, -91, -116, -34, 36, 85, -18, 121}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-66, -70, -81, -63, 42, -44, 16, -18, -123, -78, -85, -25, 52, -13, 52, -50}, new byte[]{-13, -37, -33, -98, 107, -73, 100, -121}), valueOf3);
                            mainActivity.U0.setYLayMovX(valueOf3);
                            n3.a(mainActivity);
                            return;
                        case 3:
                            String str5 = MainActivity.f750e1;
                            String valueOf4 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-50, 2, 110, -35, 99, 41, -71, 88, -11, 10, 106, -5, 125, 14, -99, 120, -36, 36, 75}, new byte[]{-125, 99, 30, -126, 34, 74, -51, 49}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{78, -57, 104, 72, -38, 118, -74, -105, 117, -49, 108, 110, -60, 81, -110, -73, 92, -31, 77}, new byte[]{3, -90, 24, 23, -101, 21, -62, -2}), valueOf4);
                            mainActivity.V0.setYLayMovX(valueOf4);
                            n3.a(mainActivity);
                            return;
                        case 4:
                            String str6 = MainActivity.f750e1;
                            String valueOf5 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{9, 14, -71, 59, 29, -6, -36, -79, 50, 6, -67, 29, 3, -35, -8, -111, 27, 40, -100}, new byte[]{68, 111, -55, 100, 92, -103, -88, -40}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-6, -123, -102, 59, 29, -39, 59, 123, -63, -115, -98, 29, 3, -2, 31, 91, -24, -93, -65}, new byte[]{-73, -28, -22, 100, 92, -70, 79, 18}), valueOf5);
                            mainActivity.V0.setYLayMovX(valueOf5);
                            n3.a(mainActivity);
                            return;
                        case 5:
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{63, -39, 57, 81, -26, 25, -125, -93, 36, -44, 48, 87, -11, 20, -113, -94, 55, -55, 57, 68, -30, 5, -120, -82, 58, -36, 50, 91, -24, 5}, new byte[]{118, -99, 102, 18, -89, 75, -36, -25}, new StringBuilder(), mainActivity), mainActivity.F.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{39, 15, 115, 78, -36, 23, 125, 117, 60, 2, 122, 72, -49, 26, 113, 116, 47, 31, 115, 91, -40, 11, 118, 120, 34, 10, 120, 68, -46, 11, 125, 124, 33, 24, 100}, new byte[]{110, 75, 44, 13, -99, 69, 34, 49}, new StringBuilder(), mainActivity), mainActivity.F.getLevel());
                            return;
                        case 6:
                            String str8 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{124, 117, -28, -97, -11, -64, 27, -76, 103, 120, -19, -103, -26, -51, 23, -75, 116, 101, -28, -108, -15, -45, 16}, new byte[]{53, 49, -69, -36, -76, -110, 68, -16}, new StringBuilder(), mainActivity), mainActivity.D.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-87, 65, -112, 30, -125, 121, -84, -88, -78, 76, -103, 24, -112, 116, -96, -87, -95, 81, -112, 21, -121, 106, -89, -77, -83, 74, -100, 21}, new byte[]{-32, 5, -49, 93, -62, 43, -13, -20}, new StringBuilder(), mainActivity), mainActivity.D.getLevel());
                            return;
                        case 7:
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-43, -46, -119, -64, -118, 76, -33, 120, -45, -58, -97, -49, -124, 74, -33, 104, -39, -41, -126, -36, -125, 91, -63, 111}, new byte[]{-100, -106, -42, -125, -53, 30, ByteCompanionObject.MIN_VALUE, 59}, new StringBuilder(), mainActivity), mainActivity.E.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-54, 108, 111, 56, -100, -25, 14, -123, -52, 120, 121, 55, -110, -31, 14, -107, -58, 105, 100, 36, -107, -16, 16, -110, -36, 101, ByteCompanionObject.MAX_VALUE, 40, -107}, new byte[]{-125, 40, 48, 123, -35, -75, 81, -58}, new StringBuilder(), mainActivity), mainActivity.E.getLevel());
                            return;
                        case 8:
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{20, -55, -61, 106, ByteCompanionObject.MAX_VALUE, 69, 62, -65, 18, -35, -43, 101, 113, 67, 62, -81, 24, -52, -56, 118, 104, 82, 47, -88, 20, -63, -35, 125, 119, 88, 47}, new byte[]{93, -115, -100, 41, 62, 23, 97, -4}, new StringBuilder(), mainActivity), mainActivity.G.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-28, 51, -66, 50, -107, 44, -118, 28, -30, 39, -88, Base64.padSymbol, -101, 42, -118, 12, -24, 54, -75, 46, -126, 59, -101, 11, -28, 59, -96, 37, -99, 49, -101, 0, -32, 56, -78, 57}, new byte[]{-83, 119, -31, 113, -44, 126, -43, 95}, new StringBuilder(), mainActivity), mainActivity.G.getLevel());
                            return;
                        case 9:
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-23, 64, -79, -89, -123, -65, 40, 16, -12, 65, -85, -74, -101, -70, 63, 6, -27, 72, -79, -84, -127, -84, 35}, new byte[]{-96, 4, -18, -28, -60, -19, 119, 67}, new StringBuilder(), mainActivity), mainActivity.H.getisEnable().booleanValue());
                            return;
                        case 10:
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-117, -25, 3, 60, 62, -6, 126, -28, -115, -19, 8, 34, 58, -23, 121, -27, -111, -4, 20, 56, 60, -15}, new byte[]{-62, -93, 92, 125, 125, -91, 56, -74}, new StringBuilder(), mainActivity), mainActivity.I.getisEnable().booleanValue());
                            return;
                        case 11:
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{97, 113, -17, -35, 0, 107, 25, 19, 105, 103, -17, -40, 6, 114, 25, 25, 123, 97}, new byte[]{40, 53, -80, -100, 67, 52, 75, 86}, new StringBuilder(), mainActivity), mainActivity.J.getisEnable().booleanValue());
                            return;
                        default:
                            String str14 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-119, 1, 94, -57, 53, -27, -40, 126, -92, 32, 86, -61, 5, -37, -48, 126, -87, 11, 91, -53, 26, -22, -43, 109, -88, 15, 108, -19, 63}, new byte[]{-35, 104, 51, -94, 113, -124, -76, 31}, new StringBuilder(), mainActivity), mainActivity.K.getisEnable().booleanValue());
                            mainActivity.L(mainActivity.K.getisEnable().booleanValue());
                            return;
                    }
                }
            });
            this.I.setLevelRun(new Runnable(this) { // from class: e0.y0
                public final /* synthetic */ MainActivity c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i332 = i13;
                    MainActivity mainActivity = this.c;
                    switch (i332) {
                        case 0:
                            String valueOf = String.valueOf(Integer.parseInt(mainActivity.T0.getYLayMovY()) - 1);
                            h0.b.o().saveString(mainActivity.f787p, valueOf);
                            mainActivity.T0.setYLayMovY(valueOf);
                            n3.a(mainActivity);
                            return;
                        case 1:
                            String str3 = MainActivity.f750e1;
                            String valueOf2 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{14, 116, -109, 67, 113, -16, 57, -52, 53, 124, -105, 101, 111, -41, 29, -20}, new byte[]{67, 21, -29, 28, 48, -109, 77, -91}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{-111, 102, 107, 75, 53, 120, 75, 67, -86, 110, 111, 109, 43, 95, 111, 99}, new byte[]{-36, 7, 27, 20, 116, 27, 63, 42}), valueOf2);
                            mainActivity.U0.setYLayMovX(valueOf2);
                            n3.a(mainActivity);
                            return;
                        case 2:
                            String str4 = MainActivity.f750e1;
                            String valueOf3 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-23, -60, -4, -127, 101, 54, -102, 16, -46, -52, -8, -89, 123, 17, -66, 48}, new byte[]{-92, -91, -116, -34, 36, 85, -18, 121}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-66, -70, -81, -63, 42, -44, 16, -18, -123, -78, -85, -25, 52, -13, 52, -50}, new byte[]{-13, -37, -33, -98, 107, -73, 100, -121}), valueOf3);
                            mainActivity.U0.setYLayMovX(valueOf3);
                            n3.a(mainActivity);
                            return;
                        case 3:
                            String str5 = MainActivity.f750e1;
                            String valueOf4 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-50, 2, 110, -35, 99, 41, -71, 88, -11, 10, 106, -5, 125, 14, -99, 120, -36, 36, 75}, new byte[]{-125, 99, 30, -126, 34, 74, -51, 49}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{78, -57, 104, 72, -38, 118, -74, -105, 117, -49, 108, 110, -60, 81, -110, -73, 92, -31, 77}, new byte[]{3, -90, 24, 23, -101, 21, -62, -2}), valueOf4);
                            mainActivity.V0.setYLayMovX(valueOf4);
                            n3.a(mainActivity);
                            return;
                        case 4:
                            String str6 = MainActivity.f750e1;
                            String valueOf5 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{9, 14, -71, 59, 29, -6, -36, -79, 50, 6, -67, 29, 3, -35, -8, -111, 27, 40, -100}, new byte[]{68, 111, -55, 100, 92, -103, -88, -40}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-6, -123, -102, 59, 29, -39, 59, 123, -63, -115, -98, 29, 3, -2, 31, 91, -24, -93, -65}, new byte[]{-73, -28, -22, 100, 92, -70, 79, 18}), valueOf5);
                            mainActivity.V0.setYLayMovX(valueOf5);
                            n3.a(mainActivity);
                            return;
                        case 5:
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{63, -39, 57, 81, -26, 25, -125, -93, 36, -44, 48, 87, -11, 20, -113, -94, 55, -55, 57, 68, -30, 5, -120, -82, 58, -36, 50, 91, -24, 5}, new byte[]{118, -99, 102, 18, -89, 75, -36, -25}, new StringBuilder(), mainActivity), mainActivity.F.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{39, 15, 115, 78, -36, 23, 125, 117, 60, 2, 122, 72, -49, 26, 113, 116, 47, 31, 115, 91, -40, 11, 118, 120, 34, 10, 120, 68, -46, 11, 125, 124, 33, 24, 100}, new byte[]{110, 75, 44, 13, -99, 69, 34, 49}, new StringBuilder(), mainActivity), mainActivity.F.getLevel());
                            return;
                        case 6:
                            String str8 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{124, 117, -28, -97, -11, -64, 27, -76, 103, 120, -19, -103, -26, -51, 23, -75, 116, 101, -28, -108, -15, -45, 16}, new byte[]{53, 49, -69, -36, -76, -110, 68, -16}, new StringBuilder(), mainActivity), mainActivity.D.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-87, 65, -112, 30, -125, 121, -84, -88, -78, 76, -103, 24, -112, 116, -96, -87, -95, 81, -112, 21, -121, 106, -89, -77, -83, 74, -100, 21}, new byte[]{-32, 5, -49, 93, -62, 43, -13, -20}, new StringBuilder(), mainActivity), mainActivity.D.getLevel());
                            return;
                        case 7:
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-43, -46, -119, -64, -118, 76, -33, 120, -45, -58, -97, -49, -124, 74, -33, 104, -39, -41, -126, -36, -125, 91, -63, 111}, new byte[]{-100, -106, -42, -125, -53, 30, ByteCompanionObject.MIN_VALUE, 59}, new StringBuilder(), mainActivity), mainActivity.E.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-54, 108, 111, 56, -100, -25, 14, -123, -52, 120, 121, 55, -110, -31, 14, -107, -58, 105, 100, 36, -107, -16, 16, -110, -36, 101, ByteCompanionObject.MAX_VALUE, 40, -107}, new byte[]{-125, 40, 48, 123, -35, -75, 81, -58}, new StringBuilder(), mainActivity), mainActivity.E.getLevel());
                            return;
                        case 8:
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{20, -55, -61, 106, ByteCompanionObject.MAX_VALUE, 69, 62, -65, 18, -35, -43, 101, 113, 67, 62, -81, 24, -52, -56, 118, 104, 82, 47, -88, 20, -63, -35, 125, 119, 88, 47}, new byte[]{93, -115, -100, 41, 62, 23, 97, -4}, new StringBuilder(), mainActivity), mainActivity.G.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-28, 51, -66, 50, -107, 44, -118, 28, -30, 39, -88, Base64.padSymbol, -101, 42, -118, 12, -24, 54, -75, 46, -126, 59, -101, 11, -28, 59, -96, 37, -99, 49, -101, 0, -32, 56, -78, 57}, new byte[]{-83, 119, -31, 113, -44, 126, -43, 95}, new StringBuilder(), mainActivity), mainActivity.G.getLevel());
                            return;
                        case 9:
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-23, 64, -79, -89, -123, -65, 40, 16, -12, 65, -85, -74, -101, -70, 63, 6, -27, 72, -79, -84, -127, -84, 35}, new byte[]{-96, 4, -18, -28, -60, -19, 119, 67}, new StringBuilder(), mainActivity), mainActivity.H.getisEnable().booleanValue());
                            return;
                        case 10:
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-117, -25, 3, 60, 62, -6, 126, -28, -115, -19, 8, 34, 58, -23, 121, -27, -111, -4, 20, 56, 60, -15}, new byte[]{-62, -93, 92, 125, 125, -91, 56, -74}, new StringBuilder(), mainActivity), mainActivity.I.getisEnable().booleanValue());
                            return;
                        case 11:
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{97, 113, -17, -35, 0, 107, 25, 19, 105, 103, -17, -40, 6, 114, 25, 25, 123, 97}, new byte[]{40, 53, -80, -100, 67, 52, 75, 86}, new StringBuilder(), mainActivity), mainActivity.J.getisEnable().booleanValue());
                            return;
                        default:
                            String str14 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-119, 1, 94, -57, 53, -27, -40, 126, -92, 32, 86, -61, 5, -37, -48, 126, -87, 11, 91, -53, 26, -22, -43, 109, -88, 15, 108, -19, 63}, new byte[]{-35, 104, 51, -94, 113, -124, -76, 31}, new StringBuilder(), mainActivity), mainActivity.K.getisEnable().booleanValue());
                            mainActivity.L(mainActivity.K.getisEnable().booleanValue());
                            return;
                    }
                }
            });
            final int i40 = 11;
            this.J.setLevelRun(new Runnable(this) { // from class: e0.y0
                public final /* synthetic */ MainActivity c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i332 = i40;
                    MainActivity mainActivity = this.c;
                    switch (i332) {
                        case 0:
                            String valueOf = String.valueOf(Integer.parseInt(mainActivity.T0.getYLayMovY()) - 1);
                            h0.b.o().saveString(mainActivity.f787p, valueOf);
                            mainActivity.T0.setYLayMovY(valueOf);
                            n3.a(mainActivity);
                            return;
                        case 1:
                            String str3 = MainActivity.f750e1;
                            String valueOf2 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{14, 116, -109, 67, 113, -16, 57, -52, 53, 124, -105, 101, 111, -41, 29, -20}, new byte[]{67, 21, -29, 28, 48, -109, 77, -91}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{-111, 102, 107, 75, 53, 120, 75, 67, -86, 110, 111, 109, 43, 95, 111, 99}, new byte[]{-36, 7, 27, 20, 116, 27, 63, 42}), valueOf2);
                            mainActivity.U0.setYLayMovX(valueOf2);
                            n3.a(mainActivity);
                            return;
                        case 2:
                            String str4 = MainActivity.f750e1;
                            String valueOf3 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-23, -60, -4, -127, 101, 54, -102, 16, -46, -52, -8, -89, 123, 17, -66, 48}, new byte[]{-92, -91, -116, -34, 36, 85, -18, 121}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-66, -70, -81, -63, 42, -44, 16, -18, -123, -78, -85, -25, 52, -13, 52, -50}, new byte[]{-13, -37, -33, -98, 107, -73, 100, -121}), valueOf3);
                            mainActivity.U0.setYLayMovX(valueOf3);
                            n3.a(mainActivity);
                            return;
                        case 3:
                            String str5 = MainActivity.f750e1;
                            String valueOf4 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-50, 2, 110, -35, 99, 41, -71, 88, -11, 10, 106, -5, 125, 14, -99, 120, -36, 36, 75}, new byte[]{-125, 99, 30, -126, 34, 74, -51, 49}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{78, -57, 104, 72, -38, 118, -74, -105, 117, -49, 108, 110, -60, 81, -110, -73, 92, -31, 77}, new byte[]{3, -90, 24, 23, -101, 21, -62, -2}), valueOf4);
                            mainActivity.V0.setYLayMovX(valueOf4);
                            n3.a(mainActivity);
                            return;
                        case 4:
                            String str6 = MainActivity.f750e1;
                            String valueOf5 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{9, 14, -71, 59, 29, -6, -36, -79, 50, 6, -67, 29, 3, -35, -8, -111, 27, 40, -100}, new byte[]{68, 111, -55, 100, 92, -103, -88, -40}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-6, -123, -102, 59, 29, -39, 59, 123, -63, -115, -98, 29, 3, -2, 31, 91, -24, -93, -65}, new byte[]{-73, -28, -22, 100, 92, -70, 79, 18}), valueOf5);
                            mainActivity.V0.setYLayMovX(valueOf5);
                            n3.a(mainActivity);
                            return;
                        case 5:
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{63, -39, 57, 81, -26, 25, -125, -93, 36, -44, 48, 87, -11, 20, -113, -94, 55, -55, 57, 68, -30, 5, -120, -82, 58, -36, 50, 91, -24, 5}, new byte[]{118, -99, 102, 18, -89, 75, -36, -25}, new StringBuilder(), mainActivity), mainActivity.F.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{39, 15, 115, 78, -36, 23, 125, 117, 60, 2, 122, 72, -49, 26, 113, 116, 47, 31, 115, 91, -40, 11, 118, 120, 34, 10, 120, 68, -46, 11, 125, 124, 33, 24, 100}, new byte[]{110, 75, 44, 13, -99, 69, 34, 49}, new StringBuilder(), mainActivity), mainActivity.F.getLevel());
                            return;
                        case 6:
                            String str8 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{124, 117, -28, -97, -11, -64, 27, -76, 103, 120, -19, -103, -26, -51, 23, -75, 116, 101, -28, -108, -15, -45, 16}, new byte[]{53, 49, -69, -36, -76, -110, 68, -16}, new StringBuilder(), mainActivity), mainActivity.D.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-87, 65, -112, 30, -125, 121, -84, -88, -78, 76, -103, 24, -112, 116, -96, -87, -95, 81, -112, 21, -121, 106, -89, -77, -83, 74, -100, 21}, new byte[]{-32, 5, -49, 93, -62, 43, -13, -20}, new StringBuilder(), mainActivity), mainActivity.D.getLevel());
                            return;
                        case 7:
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-43, -46, -119, -64, -118, 76, -33, 120, -45, -58, -97, -49, -124, 74, -33, 104, -39, -41, -126, -36, -125, 91, -63, 111}, new byte[]{-100, -106, -42, -125, -53, 30, ByteCompanionObject.MIN_VALUE, 59}, new StringBuilder(), mainActivity), mainActivity.E.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-54, 108, 111, 56, -100, -25, 14, -123, -52, 120, 121, 55, -110, -31, 14, -107, -58, 105, 100, 36, -107, -16, 16, -110, -36, 101, ByteCompanionObject.MAX_VALUE, 40, -107}, new byte[]{-125, 40, 48, 123, -35, -75, 81, -58}, new StringBuilder(), mainActivity), mainActivity.E.getLevel());
                            return;
                        case 8:
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{20, -55, -61, 106, ByteCompanionObject.MAX_VALUE, 69, 62, -65, 18, -35, -43, 101, 113, 67, 62, -81, 24, -52, -56, 118, 104, 82, 47, -88, 20, -63, -35, 125, 119, 88, 47}, new byte[]{93, -115, -100, 41, 62, 23, 97, -4}, new StringBuilder(), mainActivity), mainActivity.G.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-28, 51, -66, 50, -107, 44, -118, 28, -30, 39, -88, Base64.padSymbol, -101, 42, -118, 12, -24, 54, -75, 46, -126, 59, -101, 11, -28, 59, -96, 37, -99, 49, -101, 0, -32, 56, -78, 57}, new byte[]{-83, 119, -31, 113, -44, 126, -43, 95}, new StringBuilder(), mainActivity), mainActivity.G.getLevel());
                            return;
                        case 9:
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-23, 64, -79, -89, -123, -65, 40, 16, -12, 65, -85, -74, -101, -70, 63, 6, -27, 72, -79, -84, -127, -84, 35}, new byte[]{-96, 4, -18, -28, -60, -19, 119, 67}, new StringBuilder(), mainActivity), mainActivity.H.getisEnable().booleanValue());
                            return;
                        case 10:
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-117, -25, 3, 60, 62, -6, 126, -28, -115, -19, 8, 34, 58, -23, 121, -27, -111, -4, 20, 56, 60, -15}, new byte[]{-62, -93, 92, 125, 125, -91, 56, -74}, new StringBuilder(), mainActivity), mainActivity.I.getisEnable().booleanValue());
                            return;
                        case 11:
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{97, 113, -17, -35, 0, 107, 25, 19, 105, 103, -17, -40, 6, 114, 25, 25, 123, 97}, new byte[]{40, 53, -80, -100, 67, 52, 75, 86}, new StringBuilder(), mainActivity), mainActivity.J.getisEnable().booleanValue());
                            return;
                        default:
                            String str14 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-119, 1, 94, -57, 53, -27, -40, 126, -92, 32, 86, -61, 5, -37, -48, 126, -87, 11, 91, -53, 26, -22, -43, 109, -88, 15, 108, -19, 63}, new byte[]{-35, 104, 51, -94, 113, -124, -76, 31}, new StringBuilder(), mainActivity), mainActivity.K.getisEnable().booleanValue());
                            mainActivity.L(mainActivity.K.getisEnable().booleanValue());
                            return;
                    }
                }
            });
            final int i41 = 12;
            this.K.setLevelRun(new Runnable(this) { // from class: e0.y0
                public final /* synthetic */ MainActivity c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i332 = i41;
                    MainActivity mainActivity = this.c;
                    switch (i332) {
                        case 0:
                            String valueOf = String.valueOf(Integer.parseInt(mainActivity.T0.getYLayMovY()) - 1);
                            h0.b.o().saveString(mainActivity.f787p, valueOf);
                            mainActivity.T0.setYLayMovY(valueOf);
                            n3.a(mainActivity);
                            return;
                        case 1:
                            String str3 = MainActivity.f750e1;
                            String valueOf2 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{14, 116, -109, 67, 113, -16, 57, -52, 53, 124, -105, 101, 111, -41, 29, -20}, new byte[]{67, 21, -29, 28, 48, -109, 77, -91}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{-111, 102, 107, 75, 53, 120, 75, 67, -86, 110, 111, 109, 43, 95, 111, 99}, new byte[]{-36, 7, 27, 20, 116, 27, 63, 42}), valueOf2);
                            mainActivity.U0.setYLayMovX(valueOf2);
                            n3.a(mainActivity);
                            return;
                        case 2:
                            String str4 = MainActivity.f750e1;
                            String valueOf3 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-23, -60, -4, -127, 101, 54, -102, 16, -46, -52, -8, -89, 123, 17, -66, 48}, new byte[]{-92, -91, -116, -34, 36, 85, -18, 121}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-66, -70, -81, -63, 42, -44, 16, -18, -123, -78, -85, -25, 52, -13, 52, -50}, new byte[]{-13, -37, -33, -98, 107, -73, 100, -121}), valueOf3);
                            mainActivity.U0.setYLayMovX(valueOf3);
                            n3.a(mainActivity);
                            return;
                        case 3:
                            String str5 = MainActivity.f750e1;
                            String valueOf4 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{-50, 2, 110, -35, 99, 41, -71, 88, -11, 10, 106, -5, 125, 14, -99, 120, -36, 36, 75}, new byte[]{-125, 99, 30, -126, 34, 74, -51, 49}), mainActivity.f792s)) - 1);
                            h0.b.o().saveString(m.h(new byte[]{78, -57, 104, 72, -38, 118, -74, -105, 117, -49, 108, 110, -60, 81, -110, -73, 92, -31, 77}, new byte[]{3, -90, 24, 23, -101, 21, -62, -2}), valueOf4);
                            mainActivity.V0.setYLayMovX(valueOf4);
                            n3.a(mainActivity);
                            return;
                        case 4:
                            String str6 = MainActivity.f750e1;
                            String valueOf5 = String.valueOf(Integer.parseInt(h0.b.o().loadString(m.h(new byte[]{9, 14, -71, 59, 29, -6, -36, -79, 50, 6, -67, 29, 3, -35, -8, -111, 27, 40, -100}, new byte[]{68, 111, -55, 100, 92, -103, -88, -40}), mainActivity.f792s)) + 1);
                            h0.b.o().saveString(m.h(new byte[]{-6, -123, -102, 59, 29, -39, 59, 123, -63, -115, -98, 29, 3, -2, 31, 91, -24, -93, -65}, new byte[]{-73, -28, -22, 100, 92, -70, 79, 18}), valueOf5);
                            mainActivity.V0.setYLayMovX(valueOf5);
                            n3.a(mainActivity);
                            return;
                        case 5:
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{63, -39, 57, 81, -26, 25, -125, -93, 36, -44, 48, 87, -11, 20, -113, -94, 55, -55, 57, 68, -30, 5, -120, -82, 58, -36, 50, 91, -24, 5}, new byte[]{118, -99, 102, 18, -89, 75, -36, -25}, new StringBuilder(), mainActivity), mainActivity.F.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{39, 15, 115, 78, -36, 23, 125, 117, 60, 2, 122, 72, -49, 26, 113, 116, 47, 31, 115, 91, -40, 11, 118, 120, 34, 10, 120, 68, -46, 11, 125, 124, 33, 24, 100}, new byte[]{110, 75, 44, 13, -99, 69, 34, 49}, new StringBuilder(), mainActivity), mainActivity.F.getLevel());
                            return;
                        case 6:
                            String str8 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{124, 117, -28, -97, -11, -64, 27, -76, 103, 120, -19, -103, -26, -51, 23, -75, 116, 101, -28, -108, -15, -45, 16}, new byte[]{53, 49, -69, -36, -76, -110, 68, -16}, new StringBuilder(), mainActivity), mainActivity.D.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-87, 65, -112, 30, -125, 121, -84, -88, -78, 76, -103, 24, -112, 116, -96, -87, -95, 81, -112, 21, -121, 106, -89, -77, -83, 74, -100, 21}, new byte[]{-32, 5, -49, 93, -62, 43, -13, -20}, new StringBuilder(), mainActivity), mainActivity.D.getLevel());
                            return;
                        case 7:
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-43, -46, -119, -64, -118, 76, -33, 120, -45, -58, -97, -49, -124, 74, -33, 104, -39, -41, -126, -36, -125, 91, -63, 111}, new byte[]{-100, -106, -42, -125, -53, 30, ByteCompanionObject.MIN_VALUE, 59}, new StringBuilder(), mainActivity), mainActivity.E.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-54, 108, 111, 56, -100, -25, 14, -123, -52, 120, 121, 55, -110, -31, 14, -107, -58, 105, 100, 36, -107, -16, 16, -110, -36, 101, ByteCompanionObject.MAX_VALUE, 40, -107}, new byte[]{-125, 40, 48, 123, -35, -75, 81, -58}, new StringBuilder(), mainActivity), mainActivity.E.getLevel());
                            return;
                        case 8:
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{20, -55, -61, 106, ByteCompanionObject.MAX_VALUE, 69, 62, -65, 18, -35, -43, 101, 113, 67, 62, -81, 24, -52, -56, 118, 104, 82, 47, -88, 20, -63, -35, 125, 119, 88, 47}, new byte[]{93, -115, -100, 41, 62, 23, 97, -4}, new StringBuilder(), mainActivity), mainActivity.G.getisEnable().booleanValue());
                            h0.b.o().saveInt(com.google.protobuf.q.k(new byte[]{-28, 51, -66, 50, -107, 44, -118, 28, -30, 39, -88, Base64.padSymbol, -101, 42, -118, 12, -24, 54, -75, 46, -126, 59, -101, 11, -28, 59, -96, 37, -99, 49, -101, 0, -32, 56, -78, 57}, new byte[]{-83, 119, -31, 113, -44, 126, -43, 95}, new StringBuilder(), mainActivity), mainActivity.G.getLevel());
                            return;
                        case 9:
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-23, 64, -79, -89, -123, -65, 40, 16, -12, 65, -85, -74, -101, -70, 63, 6, -27, 72, -79, -84, -127, -84, 35}, new byte[]{-96, 4, -18, -28, -60, -19, 119, 67}, new StringBuilder(), mainActivity), mainActivity.H.getisEnable().booleanValue());
                            return;
                        case 10:
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-117, -25, 3, 60, 62, -6, 126, -28, -115, -19, 8, 34, 58, -23, 121, -27, -111, -4, 20, 56, 60, -15}, new byte[]{-62, -93, 92, 125, 125, -91, 56, -74}, new StringBuilder(), mainActivity), mainActivity.I.getisEnable().booleanValue());
                            return;
                        case 11:
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{97, 113, -17, -35, 0, 107, 25, 19, 105, 103, -17, -40, 6, 114, 25, 25, 123, 97}, new byte[]{40, 53, -80, -100, 67, 52, 75, 86}, new StringBuilder(), mainActivity), mainActivity.J.getisEnable().booleanValue());
                            return;
                        default:
                            String str14 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(com.google.protobuf.q.k(new byte[]{-119, 1, 94, -57, 53, -27, -40, 126, -92, 32, 86, -61, 5, -37, -48, 126, -87, 11, 91, -53, 26, -22, -43, 109, -88, 15, 108, -19, 63}, new byte[]{-35, 104, 51, -94, 113, -124, -76, 31}, new StringBuilder(), mainActivity), mainActivity.K.getisEnable().booleanValue());
                            mainActivity.L(mainActivity.K.getisEnable().booleanValue());
                            return;
                    }
                }
            });
            this.f802y.setOnCheckedChangeListener(new k0(23));
            this.f786o0.setOnCheckedChangeListener(new k0(24));
            this.f804z.setOnCheckedChangeListener(new k0(i24));
            final int i42 = 0;
            this.A.setOnCheckedChangeListener(new k0(i42));
            this.B.setOnCheckedChangeListener(new k0(i14));
            this.f788p0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: e0.l0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MainActivity f1959b;

                {
                    this.f1959b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    RelativeLayout relativeLayout;
                    RelativeLayout relativeLayout2;
                    int i202;
                    switch (i42) {
                        case 0:
                            MainActivity mainActivity = this.f1959b;
                            String str22 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-60, -53, 107, 79, -77, 24, -89, 15, -6, -47, 123}, new byte[]{-120, -92, 30, 33, -48, 112, -27, 91}), z10);
                            boolean loadBoolean2 = h0.b.o().loadBoolean(m.h(new byte[]{-19, -62, -4, -76, -87, -9, 82, 0, -63, -41, -42, -83, -88, -12, 72}, new byte[]{-98, -75, -93, -39, -36, -101, 38, 105}), false);
                            if (z10) {
                                LounchB.c(mainActivity);
                                r5.c cVar = LounchB.f747h;
                                if (cVar != null && (relativeLayout2 = ((LounchB) cVar.c).f748b) != null) {
                                    relativeLayout2.setVisibility(0);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean2) {
                                r5.c cVar2 = LounchB.f747h;
                                if (cVar2 != null && (relativeLayout = ((LounchB) cVar2.c).f748b) != null) {
                                    relativeLayout.setVisibility(8);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager = LounchB.f746g;
                            mainActivity.stopService(new Intent(mainActivity, (Class<?>) LounchB.class));
                            return;
                        case 1:
                            MainActivity mainActivity2 = this.f1959b;
                            String str3 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{105, -56, -43, 92, 59, -26, -126, 121, 69, -35, -1, 69, 58, -27, -104}, new byte[]{26, -65, -118, 49, 78, -118, -10, 16}), z10);
                            boolean loadBoolean3 = h0.b.o().loadBoolean(m.h(new byte[]{34, -97, -78, -81, 126, -63, 107, -8, 28, -123, -94}, new byte[]{110, -16, -57, -63, 29, -87, 41, -84}), false);
                            if (z10) {
                                LounchB.c(mainActivity2);
                                r5.c cVar3 = LounchB.f747h;
                                if (cVar3 != null) {
                                    ((LounchB) cVar3.c).b(true);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean3) {
                                r5.c cVar4 = LounchB.f747h;
                                if (cVar4 != null) {
                                    ((LounchB) cVar4.c).b(false);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager2 = LounchB.f746g;
                            mainActivity2.stopService(new Intent(mainActivity2, (Class<?>) LounchB.class));
                            return;
                        case 2:
                            MainActivity mainActivity3 = this.f1959b;
                            String str4 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{22, 10, -105, -66, -75, -9, -93, 15, 4, 34, -65, -89, -66, -9, -109, 4, 11, 18, -82, -88}, new byte[]{101, 125, -56, -50, -38, -112, -52, 107}), z10);
                            if (z10) {
                                WeatherService.e(mainActivity3);
                                return;
                            } else {
                                boolean z11 = WeatherService.f1686f;
                                mainActivity3.stopService(new Intent(mainActivity3, (Class<?>) WeatherService.class));
                                return;
                            }
                        case 3:
                            MainActivity mainActivity4 = this.f1959b;
                            String str5 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-116, 46, -84, -101, 100, 117, -91, 13, -98, 42, -99, -106, 114, 123}, new byte[]{-1, 89, -13, -7, 1, 15, -54, 125}), z10);
                            FlexboxLayout flexboxLayout2 = mainActivity4.f793s0;
                            for (int i212 = 0; i212 < flexboxLayout2.getChildCount(); i212++) {
                                flexboxLayout2.getChildAt(i212).setEnabled(z10);
                            }
                            if (!z10) {
                                FlexboxLayout flexboxLayout22 = mainActivity4.f793s0;
                                for (int i222 = 0; i222 < flexboxLayout22.getChildCount(); i222++) {
                                    ((MaterialSwitch) flexboxLayout22.getChildAt(i222)).setChecked(false);
                                }
                                h0.b.o().saveBoolean(m.h(new byte[]{68, 18, -70, 67, 56, 122, -80, 114}, new byte[]{55, 101, -27, 48, 76, 21, -36, 25}), false);
                                return;
                            }
                            return;
                        case 4:
                            MainActivity mainActivity5 = this.f1959b;
                            String str6 = MainActivity.f750e1;
                            String h2 = m.h(new byte[]{-50, -81, 29, 122, 103, 126, 25, 32, -46, -91, 17, 113, 103, 104, 3}, new byte[]{-121, -21, 66, 57, 38, 44, 70, 115});
                            u0.a o5 = h0.b.o();
                            StringBuilder u8 = ai.onnxruntime.a.u(h2);
                            u8.append(mainActivity5.A());
                            o5.saveBoolean(u8.toString(), z10);
                            return;
                        case 5:
                            MainActivity mainActivity6 = this.f1959b;
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-97, -7, 52, -80, -63, 54, 57, -61, -75, -3, 39, -85, -50, 50, 19, -28, -79, -3, 37}, new byte[]{-48, -113, 81, -62, -83, 87, 64, -112}), z10);
                            if (z10) {
                                OverlayService.c(mainActivity6);
                                return;
                            }
                            OverlayService overlayService = OverlayService.f865f;
                            mainActivity6.stopService(new Intent(mainActivity6.getApplicationContext(), (Class<?>) OverlayService.class));
                            boolean z12 = Si.d;
                            Context applicationContext = mainActivity6.getApplicationContext();
                            applicationContext.stopService(new Intent(applicationContext, (Class<?>) Si.class));
                            return;
                        case 6:
                            MainActivity mainActivity7 = this.f1959b;
                            String str8 = MainActivity.f750e1;
                            try {
                                h0.b.o().saveBoolean(MockGpsService.r, z10);
                            } catch (Exception unused2) {
                            }
                            if (z10) {
                                MockGpsService.m(mainActivity7);
                                return;
                            } else {
                                MockGpsService.b(mainActivity7);
                                mainActivity7.stopService(new Intent(mainActivity7, (Class<?>) MockGpsService.class));
                                return;
                            }
                        case 7:
                            MainActivity mainActivity8 = this.f1959b;
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(Notik.f856m, z10);
                            if (z10) {
                                Notik.g(mainActivity8);
                                return;
                            } else {
                                mainActivity8.getApplicationContext().stopService(new Intent(mainActivity8.getApplicationContext(), (Class<?>) Notik.class));
                                return;
                            }
                        case 8:
                            MainActivity mainActivity9 = this.f1959b;
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(SpeedBoardService.f890k, z10);
                            if (z10) {
                                SpeedBoardService.b(mainActivity9.getApplicationContext());
                                return;
                            } else {
                                Context applicationContext2 = mainActivity9.getApplicationContext();
                                applicationContext2.stopService(new Intent(applicationContext2.getApplicationContext(), (Class<?>) SpeedBoardService.class));
                                return;
                            }
                        case 9:
                            MainActivity mainActivity10 = this.f1959b;
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-41, -101, -118, -81, 87, -106, 41, 34, -9, -72, -86, -98, 87, -109, 37, 53, -10, -114, -65, -110, 123, -84, 46, 60, -28}, new byte[]{-127, -47, -55, -5, 8, -59, 76, 80}), z10);
                            if (z10) {
                                h0.b.o().saveBoolean(m.h(new byte[]{-55, -94, Base64.padSymbol, -120, -39, 119, 3, 91, -42, -79, 54, -92, -11, 97, 5, 76, -51, -90}, new byte[]{-65, -46, 83, -41, -86, 18, 113, 45}), true);
                                TService.c(mainActivity10.getApplicationContext());
                                TService.a(Boolean.TRUE);
                                return;
                            }
                            TService.a(Boolean.FALSE);
                            return;
                        case 10:
                            MainActivity mainActivity11 = this.f1959b;
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{41, -104, -57, -91, 108, 113, -79, 0, 49, -121, -58, -80, 86, 118, -69, 44, 42, -108, -50}, new byte[]{94, -15, -93, -62, 9, 5, -62, 95}), z10);
                            new SystemMessageReceiver().onReceive(mainActivity11.getApplicationContext(), new Intent(m.h(new byte[]{42, 46, -109, -91, -102, 9, 5, -100, 34, 46, -125, -78, -101, 20, 79, -45, 40, 52, -98, -72, -101, 78, 35, -3, 4, 20, -88, -108, -70, 45, 49, -2, 14, 20, -78, -109}, new byte[]{75, 64, -9, -41, -11, 96, 97, -78})));
                            return;
                        case 11:
                            MainActivity mainActivity12 = this.f1959b;
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{114, 109, -96, 86, 11, 40, ByteCompanionObject.MAX_VALUE, -101, 71, 82, -87, 115, 20, 37, 123, -101, 64, 94, -97, 104, 12, 43, 116, -101, 100, 104, -94, 101, 13, 59, 71, -79, 93}, new byte[]{51, 1, -52, 1, 98, 76, 24, -2}), z10);
                            h hVar = h.f1929i;
                            AllWidgetServices allWidgetServices = MainActivity.i1;
                            if (allWidgetServices != null) {
                                allWidgetServices.e(hVar, z10);
                            }
                            if (z10 && MainActivity.i1 == null) {
                                AllWidgetServices.c(mainActivity12);
                                return;
                            }
                            return;
                        case 12:
                            MainActivity mainActivity13 = this.f1959b;
                            String str14 = MainActivity.f750e1;
                            String str15 = s1.a1.f5463a;
                            ComponentName componentName = new ComponentName(mainActivity13.getPackageName(), s1.a1.f5463a);
                            PackageManager packageManager = mainActivity13.getPackageManager();
                            if (z10) {
                                i202 = 1;
                            } else {
                                i202 = 2;
                            }
                            packageManager.setComponentEnabledSetting(componentName, i202, 1);
                            return;
                        case 13:
                            MainActivity mainActivity14 = this.f1959b;
                            String str16 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{97, -20, 2, 79, 40, 84, -127, -32, 90, -28, 6, 105, 54, 113, -96, -59, 96, -34, 49, 66, 44, 114, -69, -42, 107, -40}, new byte[]{44, -115, 114, 16, 105, 55, -11, -119}), z10);
                            n3.a(mainActivity14);
                            return;
                        default:
                            MainActivity mainActivity15 = this.f1959b;
                            String str17 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{89, -93, 75, 63, 70, 93, -107, -66, 98, -85, 79, 25, 88, 115, -96, -113, 75, -110, 126, 50, 65, 113, -77, -102, 85, -116, 120, 37}, new byte[]{20, -62, 59, 96, 7, 62, -31, -41}), z10);
                            n3.a(mainActivity15);
                            return;
                    }
                }
            });
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: e0.l0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MainActivity f1959b;

                {
                    this.f1959b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    RelativeLayout relativeLayout;
                    RelativeLayout relativeLayout2;
                    int i202;
                    switch (i14) {
                        case 0:
                            MainActivity mainActivity = this.f1959b;
                            String str22 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-60, -53, 107, 79, -77, 24, -89, 15, -6, -47, 123}, new byte[]{-120, -92, 30, 33, -48, 112, -27, 91}), z10);
                            boolean loadBoolean2 = h0.b.o().loadBoolean(m.h(new byte[]{-19, -62, -4, -76, -87, -9, 82, 0, -63, -41, -42, -83, -88, -12, 72}, new byte[]{-98, -75, -93, -39, -36, -101, 38, 105}), false);
                            if (z10) {
                                LounchB.c(mainActivity);
                                r5.c cVar = LounchB.f747h;
                                if (cVar != null && (relativeLayout2 = ((LounchB) cVar.c).f748b) != null) {
                                    relativeLayout2.setVisibility(0);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean2) {
                                r5.c cVar2 = LounchB.f747h;
                                if (cVar2 != null && (relativeLayout = ((LounchB) cVar2.c).f748b) != null) {
                                    relativeLayout.setVisibility(8);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager = LounchB.f746g;
                            mainActivity.stopService(new Intent(mainActivity, (Class<?>) LounchB.class));
                            return;
                        case 1:
                            MainActivity mainActivity2 = this.f1959b;
                            String str3 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{105, -56, -43, 92, 59, -26, -126, 121, 69, -35, -1, 69, 58, -27, -104}, new byte[]{26, -65, -118, 49, 78, -118, -10, 16}), z10);
                            boolean loadBoolean3 = h0.b.o().loadBoolean(m.h(new byte[]{34, -97, -78, -81, 126, -63, 107, -8, 28, -123, -94}, new byte[]{110, -16, -57, -63, 29, -87, 41, -84}), false);
                            if (z10) {
                                LounchB.c(mainActivity2);
                                r5.c cVar3 = LounchB.f747h;
                                if (cVar3 != null) {
                                    ((LounchB) cVar3.c).b(true);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean3) {
                                r5.c cVar4 = LounchB.f747h;
                                if (cVar4 != null) {
                                    ((LounchB) cVar4.c).b(false);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager2 = LounchB.f746g;
                            mainActivity2.stopService(new Intent(mainActivity2, (Class<?>) LounchB.class));
                            return;
                        case 2:
                            MainActivity mainActivity3 = this.f1959b;
                            String str4 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{22, 10, -105, -66, -75, -9, -93, 15, 4, 34, -65, -89, -66, -9, -109, 4, 11, 18, -82, -88}, new byte[]{101, 125, -56, -50, -38, -112, -52, 107}), z10);
                            if (z10) {
                                WeatherService.e(mainActivity3);
                                return;
                            } else {
                                boolean z11 = WeatherService.f1686f;
                                mainActivity3.stopService(new Intent(mainActivity3, (Class<?>) WeatherService.class));
                                return;
                            }
                        case 3:
                            MainActivity mainActivity4 = this.f1959b;
                            String str5 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-116, 46, -84, -101, 100, 117, -91, 13, -98, 42, -99, -106, 114, 123}, new byte[]{-1, 89, -13, -7, 1, 15, -54, 125}), z10);
                            FlexboxLayout flexboxLayout2 = mainActivity4.f793s0;
                            for (int i212 = 0; i212 < flexboxLayout2.getChildCount(); i212++) {
                                flexboxLayout2.getChildAt(i212).setEnabled(z10);
                            }
                            if (!z10) {
                                FlexboxLayout flexboxLayout22 = mainActivity4.f793s0;
                                for (int i222 = 0; i222 < flexboxLayout22.getChildCount(); i222++) {
                                    ((MaterialSwitch) flexboxLayout22.getChildAt(i222)).setChecked(false);
                                }
                                h0.b.o().saveBoolean(m.h(new byte[]{68, 18, -70, 67, 56, 122, -80, 114}, new byte[]{55, 101, -27, 48, 76, 21, -36, 25}), false);
                                return;
                            }
                            return;
                        case 4:
                            MainActivity mainActivity5 = this.f1959b;
                            String str6 = MainActivity.f750e1;
                            String h2 = m.h(new byte[]{-50, -81, 29, 122, 103, 126, 25, 32, -46, -91, 17, 113, 103, 104, 3}, new byte[]{-121, -21, 66, 57, 38, 44, 70, 115});
                            u0.a o5 = h0.b.o();
                            StringBuilder u8 = ai.onnxruntime.a.u(h2);
                            u8.append(mainActivity5.A());
                            o5.saveBoolean(u8.toString(), z10);
                            return;
                        case 5:
                            MainActivity mainActivity6 = this.f1959b;
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-97, -7, 52, -80, -63, 54, 57, -61, -75, -3, 39, -85, -50, 50, 19, -28, -79, -3, 37}, new byte[]{-48, -113, 81, -62, -83, 87, 64, -112}), z10);
                            if (z10) {
                                OverlayService.c(mainActivity6);
                                return;
                            }
                            OverlayService overlayService = OverlayService.f865f;
                            mainActivity6.stopService(new Intent(mainActivity6.getApplicationContext(), (Class<?>) OverlayService.class));
                            boolean z12 = Si.d;
                            Context applicationContext = mainActivity6.getApplicationContext();
                            applicationContext.stopService(new Intent(applicationContext, (Class<?>) Si.class));
                            return;
                        case 6:
                            MainActivity mainActivity7 = this.f1959b;
                            String str8 = MainActivity.f750e1;
                            try {
                                h0.b.o().saveBoolean(MockGpsService.r, z10);
                            } catch (Exception unused2) {
                            }
                            if (z10) {
                                MockGpsService.m(mainActivity7);
                                return;
                            } else {
                                MockGpsService.b(mainActivity7);
                                mainActivity7.stopService(new Intent(mainActivity7, (Class<?>) MockGpsService.class));
                                return;
                            }
                        case 7:
                            MainActivity mainActivity8 = this.f1959b;
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(Notik.f856m, z10);
                            if (z10) {
                                Notik.g(mainActivity8);
                                return;
                            } else {
                                mainActivity8.getApplicationContext().stopService(new Intent(mainActivity8.getApplicationContext(), (Class<?>) Notik.class));
                                return;
                            }
                        case 8:
                            MainActivity mainActivity9 = this.f1959b;
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(SpeedBoardService.f890k, z10);
                            if (z10) {
                                SpeedBoardService.b(mainActivity9.getApplicationContext());
                                return;
                            } else {
                                Context applicationContext2 = mainActivity9.getApplicationContext();
                                applicationContext2.stopService(new Intent(applicationContext2.getApplicationContext(), (Class<?>) SpeedBoardService.class));
                                return;
                            }
                        case 9:
                            MainActivity mainActivity10 = this.f1959b;
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-41, -101, -118, -81, 87, -106, 41, 34, -9, -72, -86, -98, 87, -109, 37, 53, -10, -114, -65, -110, 123, -84, 46, 60, -28}, new byte[]{-127, -47, -55, -5, 8, -59, 76, 80}), z10);
                            if (z10) {
                                h0.b.o().saveBoolean(m.h(new byte[]{-55, -94, Base64.padSymbol, -120, -39, 119, 3, 91, -42, -79, 54, -92, -11, 97, 5, 76, -51, -90}, new byte[]{-65, -46, 83, -41, -86, 18, 113, 45}), true);
                                TService.c(mainActivity10.getApplicationContext());
                                TService.a(Boolean.TRUE);
                                return;
                            }
                            TService.a(Boolean.FALSE);
                            return;
                        case 10:
                            MainActivity mainActivity11 = this.f1959b;
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{41, -104, -57, -91, 108, 113, -79, 0, 49, -121, -58, -80, 86, 118, -69, 44, 42, -108, -50}, new byte[]{94, -15, -93, -62, 9, 5, -62, 95}), z10);
                            new SystemMessageReceiver().onReceive(mainActivity11.getApplicationContext(), new Intent(m.h(new byte[]{42, 46, -109, -91, -102, 9, 5, -100, 34, 46, -125, -78, -101, 20, 79, -45, 40, 52, -98, -72, -101, 78, 35, -3, 4, 20, -88, -108, -70, 45, 49, -2, 14, 20, -78, -109}, new byte[]{75, 64, -9, -41, -11, 96, 97, -78})));
                            return;
                        case 11:
                            MainActivity mainActivity12 = this.f1959b;
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{114, 109, -96, 86, 11, 40, ByteCompanionObject.MAX_VALUE, -101, 71, 82, -87, 115, 20, 37, 123, -101, 64, 94, -97, 104, 12, 43, 116, -101, 100, 104, -94, 101, 13, 59, 71, -79, 93}, new byte[]{51, 1, -52, 1, 98, 76, 24, -2}), z10);
                            h hVar = h.f1929i;
                            AllWidgetServices allWidgetServices = MainActivity.i1;
                            if (allWidgetServices != null) {
                                allWidgetServices.e(hVar, z10);
                            }
                            if (z10 && MainActivity.i1 == null) {
                                AllWidgetServices.c(mainActivity12);
                                return;
                            }
                            return;
                        case 12:
                            MainActivity mainActivity13 = this.f1959b;
                            String str14 = MainActivity.f750e1;
                            String str15 = s1.a1.f5463a;
                            ComponentName componentName = new ComponentName(mainActivity13.getPackageName(), s1.a1.f5463a);
                            PackageManager packageManager = mainActivity13.getPackageManager();
                            if (z10) {
                                i202 = 1;
                            } else {
                                i202 = 2;
                            }
                            packageManager.setComponentEnabledSetting(componentName, i202, 1);
                            return;
                        case 13:
                            MainActivity mainActivity14 = this.f1959b;
                            String str16 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{97, -20, 2, 79, 40, 84, -127, -32, 90, -28, 6, 105, 54, 113, -96, -59, 96, -34, 49, 66, 44, 114, -69, -42, 107, -40}, new byte[]{44, -115, 114, 16, 105, 55, -11, -119}), z10);
                            n3.a(mainActivity14);
                            return;
                        default:
                            MainActivity mainActivity15 = this.f1959b;
                            String str17 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{89, -93, 75, 63, 70, 93, -107, -66, 98, -85, 79, 25, 88, 115, -96, -113, 75, -110, 126, 50, 65, 113, -77, -102, 85, -116, 120, 37}, new byte[]{20, -62, 59, 96, 7, 62, -31, -41}), z10);
                            n3.a(mainActivity15);
                            return;
                    }
                }
            });
            final int i43 = 2;
            this.f796u0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: e0.l0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MainActivity f1959b;

                {
                    this.f1959b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    RelativeLayout relativeLayout;
                    RelativeLayout relativeLayout2;
                    int i202;
                    switch (i43) {
                        case 0:
                            MainActivity mainActivity = this.f1959b;
                            String str22 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-60, -53, 107, 79, -77, 24, -89, 15, -6, -47, 123}, new byte[]{-120, -92, 30, 33, -48, 112, -27, 91}), z10);
                            boolean loadBoolean2 = h0.b.o().loadBoolean(m.h(new byte[]{-19, -62, -4, -76, -87, -9, 82, 0, -63, -41, -42, -83, -88, -12, 72}, new byte[]{-98, -75, -93, -39, -36, -101, 38, 105}), false);
                            if (z10) {
                                LounchB.c(mainActivity);
                                r5.c cVar = LounchB.f747h;
                                if (cVar != null && (relativeLayout2 = ((LounchB) cVar.c).f748b) != null) {
                                    relativeLayout2.setVisibility(0);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean2) {
                                r5.c cVar2 = LounchB.f747h;
                                if (cVar2 != null && (relativeLayout = ((LounchB) cVar2.c).f748b) != null) {
                                    relativeLayout.setVisibility(8);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager = LounchB.f746g;
                            mainActivity.stopService(new Intent(mainActivity, (Class<?>) LounchB.class));
                            return;
                        case 1:
                            MainActivity mainActivity2 = this.f1959b;
                            String str3 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{105, -56, -43, 92, 59, -26, -126, 121, 69, -35, -1, 69, 58, -27, -104}, new byte[]{26, -65, -118, 49, 78, -118, -10, 16}), z10);
                            boolean loadBoolean3 = h0.b.o().loadBoolean(m.h(new byte[]{34, -97, -78, -81, 126, -63, 107, -8, 28, -123, -94}, new byte[]{110, -16, -57, -63, 29, -87, 41, -84}), false);
                            if (z10) {
                                LounchB.c(mainActivity2);
                                r5.c cVar3 = LounchB.f747h;
                                if (cVar3 != null) {
                                    ((LounchB) cVar3.c).b(true);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean3) {
                                r5.c cVar4 = LounchB.f747h;
                                if (cVar4 != null) {
                                    ((LounchB) cVar4.c).b(false);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager2 = LounchB.f746g;
                            mainActivity2.stopService(new Intent(mainActivity2, (Class<?>) LounchB.class));
                            return;
                        case 2:
                            MainActivity mainActivity3 = this.f1959b;
                            String str4 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{22, 10, -105, -66, -75, -9, -93, 15, 4, 34, -65, -89, -66, -9, -109, 4, 11, 18, -82, -88}, new byte[]{101, 125, -56, -50, -38, -112, -52, 107}), z10);
                            if (z10) {
                                WeatherService.e(mainActivity3);
                                return;
                            } else {
                                boolean z11 = WeatherService.f1686f;
                                mainActivity3.stopService(new Intent(mainActivity3, (Class<?>) WeatherService.class));
                                return;
                            }
                        case 3:
                            MainActivity mainActivity4 = this.f1959b;
                            String str5 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-116, 46, -84, -101, 100, 117, -91, 13, -98, 42, -99, -106, 114, 123}, new byte[]{-1, 89, -13, -7, 1, 15, -54, 125}), z10);
                            FlexboxLayout flexboxLayout2 = mainActivity4.f793s0;
                            for (int i212 = 0; i212 < flexboxLayout2.getChildCount(); i212++) {
                                flexboxLayout2.getChildAt(i212).setEnabled(z10);
                            }
                            if (!z10) {
                                FlexboxLayout flexboxLayout22 = mainActivity4.f793s0;
                                for (int i222 = 0; i222 < flexboxLayout22.getChildCount(); i222++) {
                                    ((MaterialSwitch) flexboxLayout22.getChildAt(i222)).setChecked(false);
                                }
                                h0.b.o().saveBoolean(m.h(new byte[]{68, 18, -70, 67, 56, 122, -80, 114}, new byte[]{55, 101, -27, 48, 76, 21, -36, 25}), false);
                                return;
                            }
                            return;
                        case 4:
                            MainActivity mainActivity5 = this.f1959b;
                            String str6 = MainActivity.f750e1;
                            String h2 = m.h(new byte[]{-50, -81, 29, 122, 103, 126, 25, 32, -46, -91, 17, 113, 103, 104, 3}, new byte[]{-121, -21, 66, 57, 38, 44, 70, 115});
                            u0.a o5 = h0.b.o();
                            StringBuilder u8 = ai.onnxruntime.a.u(h2);
                            u8.append(mainActivity5.A());
                            o5.saveBoolean(u8.toString(), z10);
                            return;
                        case 5:
                            MainActivity mainActivity6 = this.f1959b;
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-97, -7, 52, -80, -63, 54, 57, -61, -75, -3, 39, -85, -50, 50, 19, -28, -79, -3, 37}, new byte[]{-48, -113, 81, -62, -83, 87, 64, -112}), z10);
                            if (z10) {
                                OverlayService.c(mainActivity6);
                                return;
                            }
                            OverlayService overlayService = OverlayService.f865f;
                            mainActivity6.stopService(new Intent(mainActivity6.getApplicationContext(), (Class<?>) OverlayService.class));
                            boolean z12 = Si.d;
                            Context applicationContext = mainActivity6.getApplicationContext();
                            applicationContext.stopService(new Intent(applicationContext, (Class<?>) Si.class));
                            return;
                        case 6:
                            MainActivity mainActivity7 = this.f1959b;
                            String str8 = MainActivity.f750e1;
                            try {
                                h0.b.o().saveBoolean(MockGpsService.r, z10);
                            } catch (Exception unused2) {
                            }
                            if (z10) {
                                MockGpsService.m(mainActivity7);
                                return;
                            } else {
                                MockGpsService.b(mainActivity7);
                                mainActivity7.stopService(new Intent(mainActivity7, (Class<?>) MockGpsService.class));
                                return;
                            }
                        case 7:
                            MainActivity mainActivity8 = this.f1959b;
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(Notik.f856m, z10);
                            if (z10) {
                                Notik.g(mainActivity8);
                                return;
                            } else {
                                mainActivity8.getApplicationContext().stopService(new Intent(mainActivity8.getApplicationContext(), (Class<?>) Notik.class));
                                return;
                            }
                        case 8:
                            MainActivity mainActivity9 = this.f1959b;
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(SpeedBoardService.f890k, z10);
                            if (z10) {
                                SpeedBoardService.b(mainActivity9.getApplicationContext());
                                return;
                            } else {
                                Context applicationContext2 = mainActivity9.getApplicationContext();
                                applicationContext2.stopService(new Intent(applicationContext2.getApplicationContext(), (Class<?>) SpeedBoardService.class));
                                return;
                            }
                        case 9:
                            MainActivity mainActivity10 = this.f1959b;
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-41, -101, -118, -81, 87, -106, 41, 34, -9, -72, -86, -98, 87, -109, 37, 53, -10, -114, -65, -110, 123, -84, 46, 60, -28}, new byte[]{-127, -47, -55, -5, 8, -59, 76, 80}), z10);
                            if (z10) {
                                h0.b.o().saveBoolean(m.h(new byte[]{-55, -94, Base64.padSymbol, -120, -39, 119, 3, 91, -42, -79, 54, -92, -11, 97, 5, 76, -51, -90}, new byte[]{-65, -46, 83, -41, -86, 18, 113, 45}), true);
                                TService.c(mainActivity10.getApplicationContext());
                                TService.a(Boolean.TRUE);
                                return;
                            }
                            TService.a(Boolean.FALSE);
                            return;
                        case 10:
                            MainActivity mainActivity11 = this.f1959b;
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{41, -104, -57, -91, 108, 113, -79, 0, 49, -121, -58, -80, 86, 118, -69, 44, 42, -108, -50}, new byte[]{94, -15, -93, -62, 9, 5, -62, 95}), z10);
                            new SystemMessageReceiver().onReceive(mainActivity11.getApplicationContext(), new Intent(m.h(new byte[]{42, 46, -109, -91, -102, 9, 5, -100, 34, 46, -125, -78, -101, 20, 79, -45, 40, 52, -98, -72, -101, 78, 35, -3, 4, 20, -88, -108, -70, 45, 49, -2, 14, 20, -78, -109}, new byte[]{75, 64, -9, -41, -11, 96, 97, -78})));
                            return;
                        case 11:
                            MainActivity mainActivity12 = this.f1959b;
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{114, 109, -96, 86, 11, 40, ByteCompanionObject.MAX_VALUE, -101, 71, 82, -87, 115, 20, 37, 123, -101, 64, 94, -97, 104, 12, 43, 116, -101, 100, 104, -94, 101, 13, 59, 71, -79, 93}, new byte[]{51, 1, -52, 1, 98, 76, 24, -2}), z10);
                            h hVar = h.f1929i;
                            AllWidgetServices allWidgetServices = MainActivity.i1;
                            if (allWidgetServices != null) {
                                allWidgetServices.e(hVar, z10);
                            }
                            if (z10 && MainActivity.i1 == null) {
                                AllWidgetServices.c(mainActivity12);
                                return;
                            }
                            return;
                        case 12:
                            MainActivity mainActivity13 = this.f1959b;
                            String str14 = MainActivity.f750e1;
                            String str15 = s1.a1.f5463a;
                            ComponentName componentName = new ComponentName(mainActivity13.getPackageName(), s1.a1.f5463a);
                            PackageManager packageManager = mainActivity13.getPackageManager();
                            if (z10) {
                                i202 = 1;
                            } else {
                                i202 = 2;
                            }
                            packageManager.setComponentEnabledSetting(componentName, i202, 1);
                            return;
                        case 13:
                            MainActivity mainActivity14 = this.f1959b;
                            String str16 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{97, -20, 2, 79, 40, 84, -127, -32, 90, -28, 6, 105, 54, 113, -96, -59, 96, -34, 49, 66, 44, 114, -69, -42, 107, -40}, new byte[]{44, -115, 114, 16, 105, 55, -11, -119}), z10);
                            n3.a(mainActivity14);
                            return;
                        default:
                            MainActivity mainActivity15 = this.f1959b;
                            String str17 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{89, -93, 75, 63, 70, 93, -107, -66, 98, -85, 79, 25, 88, 115, -96, -113, 75, -110, 126, 50, 65, 113, -77, -102, 85, -116, 120, 37}, new byte[]{20, -62, 59, 96, 7, 62, -31, -41}), z10);
                            n3.a(mainActivity15);
                            return;
                    }
                }
            });
            this.f799w0.setOnCheckedChangeListener(new k0(i43));
            final int i44 = 3;
            this.f794t0.setOnCheckedChangeListener(new k0(i44));
            this.f790q0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: e0.l0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MainActivity f1959b;

                {
                    this.f1959b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    RelativeLayout relativeLayout;
                    RelativeLayout relativeLayout2;
                    int i202;
                    switch (i44) {
                        case 0:
                            MainActivity mainActivity = this.f1959b;
                            String str22 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-60, -53, 107, 79, -77, 24, -89, 15, -6, -47, 123}, new byte[]{-120, -92, 30, 33, -48, 112, -27, 91}), z10);
                            boolean loadBoolean2 = h0.b.o().loadBoolean(m.h(new byte[]{-19, -62, -4, -76, -87, -9, 82, 0, -63, -41, -42, -83, -88, -12, 72}, new byte[]{-98, -75, -93, -39, -36, -101, 38, 105}), false);
                            if (z10) {
                                LounchB.c(mainActivity);
                                r5.c cVar = LounchB.f747h;
                                if (cVar != null && (relativeLayout2 = ((LounchB) cVar.c).f748b) != null) {
                                    relativeLayout2.setVisibility(0);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean2) {
                                r5.c cVar2 = LounchB.f747h;
                                if (cVar2 != null && (relativeLayout = ((LounchB) cVar2.c).f748b) != null) {
                                    relativeLayout.setVisibility(8);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager = LounchB.f746g;
                            mainActivity.stopService(new Intent(mainActivity, (Class<?>) LounchB.class));
                            return;
                        case 1:
                            MainActivity mainActivity2 = this.f1959b;
                            String str3 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{105, -56, -43, 92, 59, -26, -126, 121, 69, -35, -1, 69, 58, -27, -104}, new byte[]{26, -65, -118, 49, 78, -118, -10, 16}), z10);
                            boolean loadBoolean3 = h0.b.o().loadBoolean(m.h(new byte[]{34, -97, -78, -81, 126, -63, 107, -8, 28, -123, -94}, new byte[]{110, -16, -57, -63, 29, -87, 41, -84}), false);
                            if (z10) {
                                LounchB.c(mainActivity2);
                                r5.c cVar3 = LounchB.f747h;
                                if (cVar3 != null) {
                                    ((LounchB) cVar3.c).b(true);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean3) {
                                r5.c cVar4 = LounchB.f747h;
                                if (cVar4 != null) {
                                    ((LounchB) cVar4.c).b(false);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager2 = LounchB.f746g;
                            mainActivity2.stopService(new Intent(mainActivity2, (Class<?>) LounchB.class));
                            return;
                        case 2:
                            MainActivity mainActivity3 = this.f1959b;
                            String str4 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{22, 10, -105, -66, -75, -9, -93, 15, 4, 34, -65, -89, -66, -9, -109, 4, 11, 18, -82, -88}, new byte[]{101, 125, -56, -50, -38, -112, -52, 107}), z10);
                            if (z10) {
                                WeatherService.e(mainActivity3);
                                return;
                            } else {
                                boolean z11 = WeatherService.f1686f;
                                mainActivity3.stopService(new Intent(mainActivity3, (Class<?>) WeatherService.class));
                                return;
                            }
                        case 3:
                            MainActivity mainActivity4 = this.f1959b;
                            String str5 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-116, 46, -84, -101, 100, 117, -91, 13, -98, 42, -99, -106, 114, 123}, new byte[]{-1, 89, -13, -7, 1, 15, -54, 125}), z10);
                            FlexboxLayout flexboxLayout2 = mainActivity4.f793s0;
                            for (int i212 = 0; i212 < flexboxLayout2.getChildCount(); i212++) {
                                flexboxLayout2.getChildAt(i212).setEnabled(z10);
                            }
                            if (!z10) {
                                FlexboxLayout flexboxLayout22 = mainActivity4.f793s0;
                                for (int i222 = 0; i222 < flexboxLayout22.getChildCount(); i222++) {
                                    ((MaterialSwitch) flexboxLayout22.getChildAt(i222)).setChecked(false);
                                }
                                h0.b.o().saveBoolean(m.h(new byte[]{68, 18, -70, 67, 56, 122, -80, 114}, new byte[]{55, 101, -27, 48, 76, 21, -36, 25}), false);
                                return;
                            }
                            return;
                        case 4:
                            MainActivity mainActivity5 = this.f1959b;
                            String str6 = MainActivity.f750e1;
                            String h2 = m.h(new byte[]{-50, -81, 29, 122, 103, 126, 25, 32, -46, -91, 17, 113, 103, 104, 3}, new byte[]{-121, -21, 66, 57, 38, 44, 70, 115});
                            u0.a o5 = h0.b.o();
                            StringBuilder u8 = ai.onnxruntime.a.u(h2);
                            u8.append(mainActivity5.A());
                            o5.saveBoolean(u8.toString(), z10);
                            return;
                        case 5:
                            MainActivity mainActivity6 = this.f1959b;
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-97, -7, 52, -80, -63, 54, 57, -61, -75, -3, 39, -85, -50, 50, 19, -28, -79, -3, 37}, new byte[]{-48, -113, 81, -62, -83, 87, 64, -112}), z10);
                            if (z10) {
                                OverlayService.c(mainActivity6);
                                return;
                            }
                            OverlayService overlayService = OverlayService.f865f;
                            mainActivity6.stopService(new Intent(mainActivity6.getApplicationContext(), (Class<?>) OverlayService.class));
                            boolean z12 = Si.d;
                            Context applicationContext = mainActivity6.getApplicationContext();
                            applicationContext.stopService(new Intent(applicationContext, (Class<?>) Si.class));
                            return;
                        case 6:
                            MainActivity mainActivity7 = this.f1959b;
                            String str8 = MainActivity.f750e1;
                            try {
                                h0.b.o().saveBoolean(MockGpsService.r, z10);
                            } catch (Exception unused2) {
                            }
                            if (z10) {
                                MockGpsService.m(mainActivity7);
                                return;
                            } else {
                                MockGpsService.b(mainActivity7);
                                mainActivity7.stopService(new Intent(mainActivity7, (Class<?>) MockGpsService.class));
                                return;
                            }
                        case 7:
                            MainActivity mainActivity8 = this.f1959b;
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(Notik.f856m, z10);
                            if (z10) {
                                Notik.g(mainActivity8);
                                return;
                            } else {
                                mainActivity8.getApplicationContext().stopService(new Intent(mainActivity8.getApplicationContext(), (Class<?>) Notik.class));
                                return;
                            }
                        case 8:
                            MainActivity mainActivity9 = this.f1959b;
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(SpeedBoardService.f890k, z10);
                            if (z10) {
                                SpeedBoardService.b(mainActivity9.getApplicationContext());
                                return;
                            } else {
                                Context applicationContext2 = mainActivity9.getApplicationContext();
                                applicationContext2.stopService(new Intent(applicationContext2.getApplicationContext(), (Class<?>) SpeedBoardService.class));
                                return;
                            }
                        case 9:
                            MainActivity mainActivity10 = this.f1959b;
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-41, -101, -118, -81, 87, -106, 41, 34, -9, -72, -86, -98, 87, -109, 37, 53, -10, -114, -65, -110, 123, -84, 46, 60, -28}, new byte[]{-127, -47, -55, -5, 8, -59, 76, 80}), z10);
                            if (z10) {
                                h0.b.o().saveBoolean(m.h(new byte[]{-55, -94, Base64.padSymbol, -120, -39, 119, 3, 91, -42, -79, 54, -92, -11, 97, 5, 76, -51, -90}, new byte[]{-65, -46, 83, -41, -86, 18, 113, 45}), true);
                                TService.c(mainActivity10.getApplicationContext());
                                TService.a(Boolean.TRUE);
                                return;
                            }
                            TService.a(Boolean.FALSE);
                            return;
                        case 10:
                            MainActivity mainActivity11 = this.f1959b;
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{41, -104, -57, -91, 108, 113, -79, 0, 49, -121, -58, -80, 86, 118, -69, 44, 42, -108, -50}, new byte[]{94, -15, -93, -62, 9, 5, -62, 95}), z10);
                            new SystemMessageReceiver().onReceive(mainActivity11.getApplicationContext(), new Intent(m.h(new byte[]{42, 46, -109, -91, -102, 9, 5, -100, 34, 46, -125, -78, -101, 20, 79, -45, 40, 52, -98, -72, -101, 78, 35, -3, 4, 20, -88, -108, -70, 45, 49, -2, 14, 20, -78, -109}, new byte[]{75, 64, -9, -41, -11, 96, 97, -78})));
                            return;
                        case 11:
                            MainActivity mainActivity12 = this.f1959b;
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{114, 109, -96, 86, 11, 40, ByteCompanionObject.MAX_VALUE, -101, 71, 82, -87, 115, 20, 37, 123, -101, 64, 94, -97, 104, 12, 43, 116, -101, 100, 104, -94, 101, 13, 59, 71, -79, 93}, new byte[]{51, 1, -52, 1, 98, 76, 24, -2}), z10);
                            h hVar = h.f1929i;
                            AllWidgetServices allWidgetServices = MainActivity.i1;
                            if (allWidgetServices != null) {
                                allWidgetServices.e(hVar, z10);
                            }
                            if (z10 && MainActivity.i1 == null) {
                                AllWidgetServices.c(mainActivity12);
                                return;
                            }
                            return;
                        case 12:
                            MainActivity mainActivity13 = this.f1959b;
                            String str14 = MainActivity.f750e1;
                            String str15 = s1.a1.f5463a;
                            ComponentName componentName = new ComponentName(mainActivity13.getPackageName(), s1.a1.f5463a);
                            PackageManager packageManager = mainActivity13.getPackageManager();
                            if (z10) {
                                i202 = 1;
                            } else {
                                i202 = 2;
                            }
                            packageManager.setComponentEnabledSetting(componentName, i202, 1);
                            return;
                        case 13:
                            MainActivity mainActivity14 = this.f1959b;
                            String str16 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{97, -20, 2, 79, 40, 84, -127, -32, 90, -28, 6, 105, 54, 113, -96, -59, 96, -34, 49, 66, 44, 114, -69, -42, 107, -40}, new byte[]{44, -115, 114, 16, 105, 55, -11, -119}), z10);
                            n3.a(mainActivity14);
                            return;
                        default:
                            MainActivity mainActivity15 = this.f1959b;
                            String str17 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{89, -93, 75, 63, 70, 93, -107, -66, 98, -85, 79, 25, 88, 115, -96, -113, 75, -110, 126, 50, 65, 113, -77, -102, 85, -116, 120, 37}, new byte[]{20, -62, 59, 96, 7, 62, -31, -41}), z10);
                            n3.a(mainActivity15);
                            return;
                    }
                }
            });
            final int i45 = 4;
            this.f791r0.setOnCheckedChangeListener(new k0(i45));
            this.f766e0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: e0.l0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MainActivity f1959b;

                {
                    this.f1959b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    RelativeLayout relativeLayout;
                    RelativeLayout relativeLayout2;
                    int i202;
                    switch (i45) {
                        case 0:
                            MainActivity mainActivity = this.f1959b;
                            String str22 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-60, -53, 107, 79, -77, 24, -89, 15, -6, -47, 123}, new byte[]{-120, -92, 30, 33, -48, 112, -27, 91}), z10);
                            boolean loadBoolean2 = h0.b.o().loadBoolean(m.h(new byte[]{-19, -62, -4, -76, -87, -9, 82, 0, -63, -41, -42, -83, -88, -12, 72}, new byte[]{-98, -75, -93, -39, -36, -101, 38, 105}), false);
                            if (z10) {
                                LounchB.c(mainActivity);
                                r5.c cVar = LounchB.f747h;
                                if (cVar != null && (relativeLayout2 = ((LounchB) cVar.c).f748b) != null) {
                                    relativeLayout2.setVisibility(0);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean2) {
                                r5.c cVar2 = LounchB.f747h;
                                if (cVar2 != null && (relativeLayout = ((LounchB) cVar2.c).f748b) != null) {
                                    relativeLayout.setVisibility(8);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager = LounchB.f746g;
                            mainActivity.stopService(new Intent(mainActivity, (Class<?>) LounchB.class));
                            return;
                        case 1:
                            MainActivity mainActivity2 = this.f1959b;
                            String str3 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{105, -56, -43, 92, 59, -26, -126, 121, 69, -35, -1, 69, 58, -27, -104}, new byte[]{26, -65, -118, 49, 78, -118, -10, 16}), z10);
                            boolean loadBoolean3 = h0.b.o().loadBoolean(m.h(new byte[]{34, -97, -78, -81, 126, -63, 107, -8, 28, -123, -94}, new byte[]{110, -16, -57, -63, 29, -87, 41, -84}), false);
                            if (z10) {
                                LounchB.c(mainActivity2);
                                r5.c cVar3 = LounchB.f747h;
                                if (cVar3 != null) {
                                    ((LounchB) cVar3.c).b(true);
                                    return;
                                }
                                return;
                            }
                            if (loadBoolean3) {
                                r5.c cVar4 = LounchB.f747h;
                                if (cVar4 != null) {
                                    ((LounchB) cVar4.c).b(false);
                                    return;
                                }
                                return;
                            }
                            WindowManager windowManager2 = LounchB.f746g;
                            mainActivity2.stopService(new Intent(mainActivity2, (Class<?>) LounchB.class));
                            return;
                        case 2:
                            MainActivity mainActivity3 = this.f1959b;
                            String str4 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{22, 10, -105, -66, -75, -9, -93, 15, 4, 34, -65, -89, -66, -9, -109, 4, 11, 18, -82, -88}, new byte[]{101, 125, -56, -50, -38, -112, -52, 107}), z10);
                            if (z10) {
                                WeatherService.e(mainActivity3);
                                return;
                            } else {
                                boolean z11 = WeatherService.f1686f;
                                mainActivity3.stopService(new Intent(mainActivity3, (Class<?>) WeatherService.class));
                                return;
                            }
                        case 3:
                            MainActivity mainActivity4 = this.f1959b;
                            String str5 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-116, 46, -84, -101, 100, 117, -91, 13, -98, 42, -99, -106, 114, 123}, new byte[]{-1, 89, -13, -7, 1, 15, -54, 125}), z10);
                            FlexboxLayout flexboxLayout2 = mainActivity4.f793s0;
                            for (int i212 = 0; i212 < flexboxLayout2.getChildCount(); i212++) {
                                flexboxLayout2.getChildAt(i212).setEnabled(z10);
                            }
                            if (!z10) {
                                FlexboxLayout flexboxLayout22 = mainActivity4.f793s0;
                                for (int i222 = 0; i222 < flexboxLayout22.getChildCount(); i222++) {
                                    ((MaterialSwitch) flexboxLayout22.getChildAt(i222)).setChecked(false);
                                }
                                h0.b.o().saveBoolean(m.h(new byte[]{68, 18, -70, 67, 56, 122, -80, 114}, new byte[]{55, 101, -27, 48, 76, 21, -36, 25}), false);
                                return;
                            }
                            return;
                        case 4:
                            MainActivity mainActivity5 = this.f1959b;
                            String str6 = MainActivity.f750e1;
                            String h2 = m.h(new byte[]{-50, -81, 29, 122, 103, 126, 25, 32, -46, -91, 17, 113, 103, 104, 3}, new byte[]{-121, -21, 66, 57, 38, 44, 70, 115});
                            u0.a o5 = h0.b.o();
                            StringBuilder u8 = ai.onnxruntime.a.u(h2);
                            u8.append(mainActivity5.A());
                            o5.saveBoolean(u8.toString(), z10);
                            return;
                        case 5:
                            MainActivity mainActivity6 = this.f1959b;
                            String str7 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-97, -7, 52, -80, -63, 54, 57, -61, -75, -3, 39, -85, -50, 50, 19, -28, -79, -3, 37}, new byte[]{-48, -113, 81, -62, -83, 87, 64, -112}), z10);
                            if (z10) {
                                OverlayService.c(mainActivity6);
                                return;
                            }
                            OverlayService overlayService = OverlayService.f865f;
                            mainActivity6.stopService(new Intent(mainActivity6.getApplicationContext(), (Class<?>) OverlayService.class));
                            boolean z12 = Si.d;
                            Context applicationContext = mainActivity6.getApplicationContext();
                            applicationContext.stopService(new Intent(applicationContext, (Class<?>) Si.class));
                            return;
                        case 6:
                            MainActivity mainActivity7 = this.f1959b;
                            String str8 = MainActivity.f750e1;
                            try {
                                h0.b.o().saveBoolean(MockGpsService.r, z10);
                            } catch (Exception unused2) {
                            }
                            if (z10) {
                                MockGpsService.m(mainActivity7);
                                return;
                            } else {
                                MockGpsService.b(mainActivity7);
                                mainActivity7.stopService(new Intent(mainActivity7, (Class<?>) MockGpsService.class));
                                return;
                            }
                        case 7:
                            MainActivity mainActivity8 = this.f1959b;
                            String str9 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(Notik.f856m, z10);
                            if (z10) {
                                Notik.g(mainActivity8);
                                return;
                            } else {
                                mainActivity8.getApplicationContext().stopService(new Intent(mainActivity8.getApplicationContext(), (Class<?>) Notik.class));
                                return;
                            }
                        case 8:
                            MainActivity mainActivity9 = this.f1959b;
                            String str10 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(SpeedBoardService.f890k, z10);
                            if (z10) {
                                SpeedBoardService.b(mainActivity9.getApplicationContext());
                                return;
                            } else {
                                Context applicationContext2 = mainActivity9.getApplicationContext();
                                applicationContext2.stopService(new Intent(applicationContext2.getApplicationContext(), (Class<?>) SpeedBoardService.class));
                                return;
                            }
                        case 9:
                            MainActivity mainActivity10 = this.f1959b;
                            String str11 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{-41, -101, -118, -81, 87, -106, 41, 34, -9, -72, -86, -98, 87, -109, 37, 53, -10, -114, -65, -110, 123, -84, 46, 60, -28}, new byte[]{-127, -47, -55, -5, 8, -59, 76, 80}), z10);
                            if (z10) {
                                h0.b.o().saveBoolean(m.h(new byte[]{-55, -94, Base64.padSymbol, -120, -39, 119, 3, 91, -42, -79, 54, -92, -11, 97, 5, 76, -51, -90}, new byte[]{-65, -46, 83, -41, -86, 18, 113, 45}), true);
                                TService.c(mainActivity10.getApplicationContext());
                                TService.a(Boolean.TRUE);
                                return;
                            }
                            TService.a(Boolean.FALSE);
                            return;
                        case 10:
                            MainActivity mainActivity11 = this.f1959b;
                            String str12 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{41, -104, -57, -91, 108, 113, -79, 0, 49, -121, -58, -80, 86, 118, -69, 44, 42, -108, -50}, new byte[]{94, -15, -93, -62, 9, 5, -62, 95}), z10);
                            new SystemMessageReceiver().onReceive(mainActivity11.getApplicationContext(), new Intent(m.h(new byte[]{42, 46, -109, -91, -102, 9, 5, -100, 34, 46, -125, -78, -101, 20, 79, -45, 40, 52, -98, -72, -101, 78, 35, -3, 4, 20, -88, -108, -70, 45, 49, -2, 14, 20, -78, -109}, new byte[]{75, 64, -9, -41, -11, 96, 97, -78})));
                            return;
                        case 11:
                            MainActivity mainActivity12 = this.f1959b;
                            String str13 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{114, 109, -96, 86, 11, 40, ByteCompanionObject.MAX_VALUE, -101, 71, 82, -87, 115, 20, 37, 123, -101, 64, 94, -97, 104, 12, 43, 116, -101, 100, 104, -94, 101, 13, 59, 71, -79, 93}, new byte[]{51, 1, -52, 1, 98, 76, 24, -2}), z10);
                            h hVar = h.f1929i;
                            AllWidgetServices allWidgetServices = MainActivity.i1;
                            if (allWidgetServices != null) {
                                allWidgetServices.e(hVar, z10);
                            }
                            if (z10 && MainActivity.i1 == null) {
                                AllWidgetServices.c(mainActivity12);
                                return;
                            }
                            return;
                        case 12:
                            MainActivity mainActivity13 = this.f1959b;
                            String str14 = MainActivity.f750e1;
                            String str15 = s1.a1.f5463a;
                            ComponentName componentName = new ComponentName(mainActivity13.getPackageName(), s1.a1.f5463a);
                            PackageManager packageManager = mainActivity13.getPackageManager();
                            if (z10) {
                                i202 = 1;
                            } else {
                                i202 = 2;
                            }
                            packageManager.setComponentEnabledSetting(componentName, i202, 1);
                            return;
                        case 13:
                            MainActivity mainActivity14 = this.f1959b;
                            String str16 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{97, -20, 2, 79, 40, 84, -127, -32, 90, -28, 6, 105, 54, 113, -96, -59, 96, -34, 49, 66, 44, 114, -69, -42, 107, -40}, new byte[]{44, -115, 114, 16, 105, 55, -11, -119}), z10);
                            n3.a(mainActivity14);
                            return;
                        default:
                            MainActivity mainActivity15 = this.f1959b;
                            String str17 = MainActivity.f750e1;
                            h0.b.o().saveBoolean(m.h(new byte[]{89, -93, 75, 63, 70, 93, -107, -66, 98, -85, 79, 25, 88, 115, -96, -113, 75, -110, 126, 50, 65, 113, -77, -102, 85, -116, 120, 37}, new byte[]{20, -62, 59, 96, 7, 62, -31, -41}), z10);
                            n3.a(mainActivity15);
                            return;
                    }
                }
            });
            this.f768f0.setOnCheckedChangeListener(new k0(27));
            this.f770g0.setOnCheckedChangeListener(new k0(5));
            this.f772h0.setOnCheckedChangeListener(new k0(7));
            t(b.o().loadString(m.h(new byte[]{110, 69, -96, 14, 62, -2, -12, 99, 65, 97}, new byte[]{45, 4, -14, 94, 76, -111, -110, 10}), null));
            Q(this);
        }
        d0.d(this);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        PackageInfo packageInfo;
        long j10;
        PackageInfo packageInfo2;
        int itemId = menuItem.getItemId();
        TextView textView = (TextView) findViewById(R.id.textView);
        int i10 = 10;
        if (itemId == R.id.menu_VDisplay) {
            Display[] displays = ((DisplayManager) getApplicationContext().getSystemService(m.h(new byte[]{29, 66, -20, ByteCompanionObject.MIN_VALUE, 98, -97, 18}, new byte[]{121, 43, -97, -16, 14, -2, 107, 36}))).getDisplays();
            StringBuilder sb = new StringBuilder();
            sb.append(m.h(new byte[]{-122, 10, 106, -30, -97, -89, 49, -59, -8, 67}, new byte[]{-62, 99, 25, -110, -13, -58, 72, -74}));
            String o5 = ai.onnxruntime.a.o(sb, " ", displays.length);
            String str = "";
            for (Display display : displays) {
                StringBuilder u8 = ai.onnxruntime.a.u(str);
                u8.append(display.toString());
                str = q.i(new byte[]{11}, new byte[]{39, -1, -37, 60, 15, -28, -6, 14}, u8);
            }
            textView.setText(o5.concat(str));
            return true;
        }
        if (itemId == R.id.menu_about) {
            String str2 = getResources().getString(R.string.lorem_ipsum) + getResources().getString(R.string.lorem_ipsum_new);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(getResources().getString(R.string.app_name)).setMessage(str2);
            builder.create().show();
            return true;
        }
        if (itemId == R.id.menu_broadcast) {
            b1.c cVar = new b1.c();
            String h2 = m.h(new byte[]{37, -117, -88, 3, -36, 119, -97, 54, 45, -117, -72, 20, -35, 106, -43, 121, 39, -111, -91, 30, -35, 48, -104, 121, 54, -70, -65, 8, -64, 106, -98, 117, 27, -126, -87, 2, -57, 107, -119, 125, 27, -120, -93, 21, -42}, new byte[]{68, -27, -52, 113, -77, 30, -5, 24});
            if (Build.VERSION.SDK_INT >= 33) {
                registerReceiver(cVar, new IntentFilter(h2), 2);
                return true;
            }
            registerReceiver(cVar, new IntentFilter(h2));
            return true;
        }
        if (itemId == R.id.menu_update) {
            getPackageManager().getInstalledPackages(128);
            try {
                packageInfo = getApplicationContext().getPackageManager().getPackageInfo(getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                j10 = PackageInfoCompat.getLongVersionCode(packageInfo);
            } else {
                j10 = packageInfo.versionCode;
            }
            if (j10 < Long.valueOf(z2.f2092a).longValue()) {
                new y2(m.h(new byte[]{-4, -10}, new byte[]{-78, -91, -3, 80, -107, 15, -101, 87}), this);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getResources().getString(R.string.not_update));
                getPackageManager().getInstalledPackages(128);
                try {
                    packageInfo2 = getApplicationContext().getPackageManager().getPackageInfo(getPackageName(), 0);
                } catch (PackageManager.NameNotFoundException unused2) {
                    packageInfo2 = null;
                }
                sb2.append(packageInfo2.versionName);
                String sb3 = sb2.toString();
                AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
                builder2.setTitle(getResources().getString(R.string.app_name)).setMessage(sb3);
                AlertDialog create = builder2.create();
                create.show();
                new Handler().postDelayed(new a4.g(i10, create), 26000L);
            }
        }
        if (itemId == R.id.au) {
            k.u(this, new Intent(getApplicationContext(), (Class<?>) punto.class), null);
        }
        if (itemId == R.id.menu_perm) {
            k.u(this, new Intent(getApplicationContext(), (Class<?>) TestSpaceActivity.class).addFlags(268435456), null);
        }
        if (itemId == R.id.menu_wifi) {
            k.u(this, new Intent(this, (Class<?>) MainWifiManadger.class), null);
        }
        if (itemId == R.id.menu_arad) {
            k.u(this, new Intent(this, (Class<?>) RadarActivity.class), null);
        }
        if (itemId == R.id.aupdate) {
            k.u(this, new Intent(this, (Class<?>) UpdateActivity.class), null);
        }
        if (itemId == R.id.menu_vpn) {
            k.u(this, new Intent(this, (Class<?>) VJCT.class), null);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 100 && iArr.length > 0 && iArr[0] == 0 && Build.VERSION.SDK_INT >= 29 && ContextCompat.checkSelfPermission(this, m.h(new byte[]{-105, -108, -63, -28, -54, -77, 33, -11, -122, -97, -41, -5, -52, -87, 54, -78, -103, -108, -117, -41, -26, -103, 0, -120, -91, -91, -25, -41, -26, -111, 2, -119, -71, -81, -21, -46, -6, -106, 10, -104, -73, -82, -20, -39, -21}, new byte[]{-10, -6, -91, -106, -91, -38, 69, -37})) != 0) {
            ActivityCompat.requestPermissions(this, new String[]{m.h(new byte[]{Base64.padSymbol, 48, -40, 29, -12, 58, 20, 3, 44, 59, -50, 2, -14, 32, 3, 68, 51, 48, -110, 46, -40, 16, 53, 126, 15, 1, -2, 46, -40, 24, 55, ByteCompanionObject.MAX_VALUE, 19, 11, -14, 43, -60, 31, 63, 110, 29, 10, -11, 32, -43}, new byte[]{92, 94, -68, 111, -101, 83, 112, 45})}, 100);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        String str = g0.f1916a;
        a o5 = b.o();
        String str2 = g0.f1916a;
        String str3 = g0.f1917b;
        String loadString = o5.loadString(str2, str3);
        int i10 = 0;
        String language = ConfigurationCompat.getLocales(getResources().getConfiguration()).get(0).getLanguage();
        String language2 = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration()).get(0).getLanguage();
        if (loadString.equals(str3)) {
            if (!language.equals(language2)) {
                g0.c(this, str3);
                recreate();
            }
        } else if (!language.equals(loadString)) {
            g0.c(this, loadString);
            recreate();
        }
        AppCompatDelegate.setDefaultNightMode(1);
        String language3 = Locale.getDefault().getLanguage();
        TextView textView = (TextView) findViewById(R.id.Pay_text);
        ImageView imageView = (ImageView) findViewById(R.id.QRPAY);
        if (m.h(new byte[]{-7, -64}, new byte[]{-117, -75, -33, 22, -72, 106, -107, 46}).equals(language3)) {
            textView.setText(m.h(new byte[]{-22, 28, 126, -110, -69, -30, 56, -69, -21, 10, -108}, new byte[]{58, -120, -82, 44, 107, 95, -24, 11}));
            Bitmap i11 = e3.d.i(this);
            if (i11 != null) {
                imageView.setImageBitmap(i11);
            }
        } else {
            textView.setText(m.h(new byte[]{16, -123, 94, -3, 12, 8, -125, 14, 51, -109, 11}, new byte[]{82, -22, 49, -114, 120, 113, -93, 94}));
            imageView.setImageResource(R.drawable.woha_donate);
        }
        d0.d(this);
        if (this.f759b) {
            this.e.post(new m0(this, 18));
            this.f759b = false;
        }
        if (!b.o().loadBoolean(m.h(new byte[]{-39, 30}, new byte[]{-72, 107, 64, -127, -120, -118, 78, 40}), false)) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) punto.class);
            if (Build.VERSION.SDK_INT >= 34) {
                intent.addFlags(268435456);
            }
            k.u(this, intent, null);
            finish();
            return;
        }
        I();
        w.c(-1, null).execute(new m0(this, i10));
        m.c();
        u();
        N();
        Long l10 = f754j1;
        String str4 = punto.r;
        if (l10.longValue() >= 0 && Long.valueOf((l10.longValue() - (System.currentTimeMillis() / 1000)) / 86400).intValue() < 0) {
            String string = getResources().getString(R.string.punto_lic_null);
            if (m.h(new byte[]{105, 85}, new byte[]{27, 32, -91, -118, -127, -125, -45, -51}).equals(language3)) {
                ImageView imageView2 = new ImageView(this);
                Bitmap i12 = e3.d.i(this);
                if (i12 != null) {
                    imageView2.setImageBitmap(i12);
                }
                new AlertDialog.Builder(this).setTitle(getString(R.string.app_name)).setMessage(string).setView(imageView2).setPositiveButton(getString(R.string.ok), (DialogInterface.OnClickListener) null).show();
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(getResources().getString(R.string.app_name)).setMessage(string);
            builder.create().show();
        }
    }

    public final void t(String str) {
        String name;
        TextView textView;
        int i10;
        int i11;
        boolean z9 = false;
        if (str != null && !str.isEmpty() && d.i(n0.c.class, str) != null) {
            name = str;
        } else {
            name = n0.c.values()[0].name();
        }
        this.W0 = (CardView) findViewById(R.id.blok_bez);
        n0.c cVar = (n0.c) d.i(n0.c.class, name);
        Objects.requireNonNull(cVar);
        n3.a(this);
        this.Z.setVisibility(8);
        this.f757a0.setVisibility(8);
        this.f760b0.setVisibility(8);
        m.w(this);
        this.f762c0.setVisibility(8);
        this.f764d0.setVisibility(8);
        m.u(this, false);
        switch (cVar.ordinal()) {
            case 0:
                m.l(this, false, false, false, false);
                m.t(this, false, false, false, false, false);
                m.n(this, false);
                m.q(this, false, false);
                m.o(this, false);
                m.r(this, false);
                m.s(this, false);
                m.v(this, false, false);
                this.Y0.setVisibility(8);
                this.M.setVisibility(8);
                this.N.setVisibility(8);
                this.Q.setVisibility(8);
                break;
            case 1:
                m.p(this);
                break;
            case 2:
                m.p(this);
                break;
            case 3:
                m.p(this);
                break;
            case 4:
                m.p(this);
                m.n(this, false);
                m.u(this, false);
                break;
            case 5:
                m.p(this);
                break;
            case 7:
                m.l(this, true, true, true, true);
                m.t(this, true, false, false, false, false);
                m.q(this, true, true);
                m.n(this, true);
                m.m(this, BezFunEnum.ID_CAR_SPD_LIMIT_WARN_SET, false);
                m.o(this, false);
                m.r(this, true);
                m.s(this, true);
                this.Y0.setVisibility(0);
                this.M.setVisibility(0);
                this.N.setVisibility(0);
                m.v(this, true, true);
                this.Q.setVisibility(0);
                m.u(this, true);
                break;
            case 8:
                m.l(this, true, false, false, false);
                m.t(this, true, true, false, false, false);
                m.n(this, false);
                m.m(this, BezFunEnum.ID_CAR_SPD_LIMIT_WARN_SET, false);
                m.q(this, false, false);
                m.o(this, false);
                this.Y0.setVisibility(0);
                this.M.setVisibility(0);
                m.r(this, true);
                m.s(this, true);
                this.N.setVisibility(0);
                m.v(this, true, true);
                this.Q.setVisibility(0);
                break;
            case 9:
            case 21:
                m.l(this, true, true, true, true);
                m.t(this, true, true, false, false, false);
                m.n(this, false);
                m.m(this, BezFunEnum.ID_CAR_SPD_LIMIT_WARN_SET, false);
                m.q(this, true, true);
                m.r(this, true);
                m.s(this, true);
                m.o(this, false);
                this.M.setVisibility(0);
                this.N.setVisibility(8);
                m.v(this, true, true);
                this.Q.setVisibility(0);
                this.Y0.setVisibility(0);
                break;
            case 10:
                m.l(this, true, true, true, true);
                m.t(this, true, true, false, false, false);
                m.n(this, false);
                m.m(this, BezFunEnum.ID_CAR_SPD_LIMIT_WARN_SET, false);
                m.q(this, true, true);
                m.o(this, true);
                m.r(this, true);
                m.s(this, true);
                this.M.setVisibility(0);
                this.N.setVisibility(8);
                m.v(this, true, true);
                this.Q.setVisibility(0);
                this.Y0.setVisibility(0);
                break;
            case 11:
                m.l(this, true, false, true, false);
                m.t(this, true, true, false, false, false);
                m.n(this, false);
                m.m(this, BezFunEnum.ID_CAR_SPD_LIMIT_WARN_SET, false);
                m.q(this, true, true);
                m.r(this, true);
                m.s(this, true);
                m.o(this, false);
                this.Y0.setVisibility(0);
                this.M.setVisibility(0);
                this.N.setVisibility(0);
                m.v(this, true, true);
                this.Q.setVisibility(0);
                break;
            case 12:
                m.l(this, false, false, true, false);
                m.t(this, false, false, false, false, false);
                m.n(this, false);
                m.m(this, BezFunEnum.ID_CAR_SPD_LIMIT_WARN_SET, false);
                m.q(this, false, false);
                m.r(this, false);
                m.s(this, false);
                m.o(this, false);
                this.Y0.setVisibility(8);
                this.M.setVisibility(0);
                this.N.setVisibility(8);
                m.v(this, true, false);
                this.Q.setVisibility(0);
                break;
            case 13:
                m.l(this, true, true, true, true);
                m.t(this, true, false, true, false, false);
                m.n(this, false);
                m.m(this, BezFunEnum.ID_CAR_SPD_LIMIT_WARN_SET, false);
                m.q(this, false, false);
                m.o(this, false);
                this.Y0.setVisibility(0);
                this.M.setVisibility(0);
                this.N.setVisibility(8);
                m.v(this, true, true);
                m.r(this, true);
                m.s(this, true);
                this.Q.setVisibility(0);
                break;
            case 14:
                m.l(this, true, true, true, true);
                m.t(this, true, false, true, false, false);
                m.n(this, false);
                m.m(this, BezFunEnum.ID_CAR_SPD_LIMIT_WARN_SET, false);
                m.o(this, false);
                m.r(this, true);
                m.s(this, true);
                m.q(this, false, false);
                this.Y0.setVisibility(0);
                this.M.setVisibility(0);
                this.N.setVisibility(8);
                m.v(this, true, true);
                this.Q.setVisibility(0);
                break;
            case 15:
                m.l(this, false, true, true, true);
                m.t(this, true, false, false, false, false);
                m.n(this, false);
                m.m(this, BezFunEnum.ID_CAR_SPD_LIMIT_WARN_SET, false);
                m.q(this, false, false);
                m.o(this, false);
                this.Y0.setVisibility(0);
                this.M.setVisibility(0);
                this.N.setVisibility(8);
                m.v(this, true, true);
                this.Q.setVisibility(0);
                m.r(this, true);
                m.s(this, true);
                break;
            case 16:
                m.l(this, true, true, true, true);
                m.t(this, true, false, false, false, true);
                m.n(this, false);
                m.m(this, BezFunEnum.ID_CAR_SPD_LIMIT_WARN_SET, false);
                m.q(this, false, false);
                m.o(this, false);
                m.u(this, false);
                m.r(this, true);
                m.s(this, true);
                this.Y0.setVisibility(0);
                this.M.setVisibility(0);
                this.N.setVisibility(8);
                m.v(this, true, true);
                this.Q.setVisibility(0);
                break;
            case 17:
                this.f764d0.setVisibility(0);
                m.l(this, true, true, false, false);
                m.t(this, true, false, false, false, false);
                this.Z.setVisibility(0);
                m.n(this, false);
                m.q(this, false, true);
                m.o(this, true);
                m.r(this, true);
                m.s(this, true);
                this.Y0.setVisibility(0);
                this.M.setVisibility(0);
                this.N.setVisibility(8);
                this.P.setVisibility(8);
                this.Q.setVisibility(0);
                break;
            case 18:
                m.l(this, false, true, false, false);
                m.t(this, true, false, false, false, false);
                this.Z.setVisibility(8);
                this.f757a0.setVisibility(0);
                m.n(this, false);
                m.q(this, false, true);
                m.o(this, false);
                m.r(this, true);
                m.s(this, true);
                this.Y0.setVisibility(0);
                this.M.setVisibility(0);
                this.N.setVisibility(8);
                this.P.setVisibility(8);
                this.Q.setVisibility(0);
                break;
            case 19:
                m.l(this, true, true, true, true);
                m.t(this, true, false, false, false, false);
                m.n(this, false);
                m.m(this, BezFunEnum.ID_CAR_SPD_LIMIT_WARN_SET, false);
                m.q(this, false, false);
                m.o(this, false);
                m.r(this, true);
                m.s(this, true);
                this.Y0.setVisibility(0);
                this.M.setVisibility(0);
                this.N.setVisibility(8);
                this.P.setVisibility(8);
                this.Q.setVisibility(0);
                break;
            case 20:
                m.l(this, true, false, false, false);
                m.t(this, false, false, false, false, false);
                m.n(this, false);
                m.q(this, false, false);
                m.o(this, false);
                m.r(this, true);
                m.s(this, true);
                this.Y0.setVisibility(8);
                this.M.setVisibility(8);
                this.N.setVisibility(8);
                m.v(this, false, false);
                this.Q.setVisibility(8);
                break;
        }
        View findViewById = findViewById(R.id.MainStartProHUD);
        if (findViewById != null && (textView = (TextView) findViewById.findViewById(R.id.MainLabel)) != null) {
            if (cVar == n0.c.B || cVar == n0.c.f4061x || cVar == n0.c.f4062y || cVar == n0.c.f4055o) {
                z9 = true;
            }
            if (z9) {
                i10 = R.string.item_hud;
            } else {
                i10 = R.string.dashboard_widgets_title;
            }
            textView.setText(i10);
            MaterialSwitch materialSwitch = (MaterialSwitch) findViewById.findViewById(R.id.sw_start_app_hud);
            if (materialSwitch != null) {
                if (z9) {
                    i11 = R.string.sw_HUD_Custom_On;
                } else {
                    i11 = R.string.dashboard_widgets_switch;
                }
                materialSwitch.setText(i11);
            }
        }
        H(cVar);
    }

    public final void u() {
        String loadString = b.o().loadString(m.h(new byte[]{-113, -80, -1, -33, -120, -45, 98, 10}, new byte[]{-51, -4, -86, ByteCompanionObject.MIN_VALUE, -58, -110, 47, 79}) + this.B0.getSelectedItem(), null);
        int i10 = 0;
        String[] strArr = {getString(R.string.blu_vod_not_set)};
        String[] strArr2 = m.c;
        String[] strArr3 = p3.f2001a;
        if (strArr2 != null) {
            String[] strArr4 = new String[strArr2.length + 1];
            System.arraycopy(strArr, 0, strArr4, 0, 1);
            System.arraycopy(strArr2, 0, strArr4, 1, strArr2.length);
            strArr = strArr4;
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_text, strArr);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown);
        this.C0.setAdapter((SpinnerAdapter) arrayAdapter);
        this.C0.setPrompt(m.h(new byte[]{-28, -8, 26, -38, 3}, new byte[]{-80, -111, 110, -74, 102, -109, -43, -55}));
        if (loadString != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= strArr.length) {
                    break;
                }
                if (loadString.equals(strArr[i11])) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
        }
        this.C0.setSelection(i10);
    }

    public int z() {
        return R.layout.activity_main2;
    }

    public void H(n0.c cVar) {
    }
}
