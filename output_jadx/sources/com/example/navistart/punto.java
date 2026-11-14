package com.example.navistart;

import a4.g;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Patterns;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.internal.view.SupportMenu;
import c7.e;
import com.example.navistart.PermActivity;
import com.example.navistart.R;
import com.example.navistart.UpdateActivity;
import com.example.navistart.punto;
import com.woha.wifim.MainWifiManadger;
import e0.f0;
import e0.g0;
import e0.j2;
import e0.m;
import e0.s0;
import e0.s3;
import e0.w;
import e0.x1;
import e0.z2;
import h0.b;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import kotlin.UByte;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class punto extends AppCompatActivity {
    public static Boolean t;

    /* renamed from: u, reason: collision with root package name */
    public static String f1065u;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1067b;
    public punto c;
    public TextView e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1068f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f1069g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f1070h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f1071i;

    /* renamed from: j, reason: collision with root package name */
    public EditText f1072j;

    /* renamed from: k, reason: collision with root package name */
    public EditText f1073k;

    /* renamed from: l, reason: collision with root package name */
    public Button f1074l;

    /* renamed from: m, reason: collision with root package name */
    public Button f1075m;

    /* renamed from: n, reason: collision with root package name */
    public Button f1076n;

    /* renamed from: o, reason: collision with root package name */
    public ImageView f1077o;

    /* renamed from: p, reason: collision with root package name */
    public Switch f1078p;
    public static final String r = m.h(new byte[]{-98, 37, 38, 54, -67, 16, 45, -75, -96, 34, 46, 49}, new byte[]{-1, 82, 71, 95, -55, 121, 67, -46});

    /* renamed from: s, reason: collision with root package name */
    public static String f1064s = m.h(new byte[]{49}, new byte[]{1, 100, 43, 60, -114, 64, -66, 32});

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f1066v = {106, 99, 97, 114, 116, 111, 111, 108, 115, 46, 114, 117, 47, 111, 116, 112, 47, 107, 117, 46, 112, 104, 112};
    public static final byte[] w = {106, 99, 97, 114, 116, 111, 111, 108, 115, 46, 114, 117};
    public final Handler d = new Handler(Looper.getMainLooper());

    /* renamed from: q, reason: collision with root package name */
    public final AlphaAnimation f1079q = new AlphaAnimation(0.0f, 1.0f);

    public static String t(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), m.h(new byte[]{87, 22, -19, 19, 32, 88, -78, -14, 95, 28}, new byte[]{54, 120, -119, 97, 79, 49, -42, -83}));
    }

    public static String w(String str) {
        try {
            byte[] digest = MessageDigest.getInstance(m.h(new byte[]{20, -21, 29, -108, -89, -14, -26}, new byte[]{71, -93, 92, -71, -110, -61, -44, -76})).digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b10 : digest) {
                sb.append(Integer.toString((b10 & UByte.MAX_VALUE) + 256, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(m.x(context));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f0 f0Var;
        super.onCreate(bundle);
        final int i10 = 1;
        AppCompatDelegate.setDefaultNightMode(1);
        getWindow().setStatusBarColor(getColor(R.color.modern_background));
        getWindow().setNavigationBarColor(getColor(R.color.modern_background));
        final int i11 = 0;
        getWindow().getDecorView().setSystemUiVisibility(0);
        this.c = this;
        String str = z2.f2092a;
        f1065u = new String(f1066v);
        try {
            b.a();
            b.r().Ping(m.h(new byte[]{102, -15, -62, 0, Base64.padSymbol, 94, -112, -70, 110, -5}, new byte[]{7, -97, -90, 114, 82, 55, -12, -27}));
        } catch (SecurityException unused) {
        }
        setContentView(R.layout.sing);
        final int i12 = 2;
        t = Boolean.valueOf(b.o().loadBoolean(m.h(new byte[]{-81, 45}, new byte[]{-50, 88, -108, 46, -69, 123, 118, 51}), false));
        this.e = (TextView) findViewById(R.id.textView20);
        this.f1068f = (TextView) findViewById(R.id.textView22);
        this.f1069g = (TextView) findViewById(R.id.textView23);
        this.f1070h = (TextView) findViewById(R.id.textView24);
        this.e.setText(t(this.c));
        this.f1072j = (EditText) findViewById(R.id.editTextTextEmailAddress);
        this.f1073k = (EditText) findViewById(R.id.editTextNumber);
        this.f1074l = (Button) findViewById(R.id.button9);
        this.f1075m = (Button) findViewById(R.id.button10);
        this.f1076n = (Button) findViewById(R.id.button11);
        this.f1078p = (Switch) findViewById(R.id.switch17);
        this.f1077o = (ImageView) findViewById(R.id.imageView7);
        this.f1071i = (TextView) findViewById(R.id.networkErrorText);
        Button button = (Button) findViewById(R.id.button_lang);
        String str2 = g0.f1916a;
        String loadString = b.o().loadString(g0.f1916a, Locale.getDefault().getLanguage());
        f0[] values = f0.values();
        int length = values.length;
        int i13 = 0;
        while (true) {
            if (i13 < length) {
                f0Var = values[i13];
                f0Var.getClass();
                if (f0Var.c.equals(loadString)) {
                    break;
                } else {
                    i13++;
                }
            } else {
                f0Var = f0.d;
                break;
            }
        }
        String str3 = f0Var.f1910b;
        if ("".equals(str3)) {
            str3 = getResources().getString(R.string.AppLangDefault);
        }
        button.setText(str3);
        button.setOnClickListener(new View.OnClickListener(this) { // from class: e0.q3
            public final /* synthetic */ punto c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean matches;
                int i14 = i12;
                int i15 = 0;
                punto puntoVar = this.c;
                switch (i14) {
                    case 0:
                        String str4 = punto.r;
                        puntoVar.u(new s3(h0.b.o().loadString(m.h(new byte[]{-90, -37, ByteCompanionObject.MIN_VALUE}, new byte[]{-53, -82, -14, -46, 67, -116, -115, 54}), m.h(new byte[]{ByteCompanionObject.MAX_VALUE}, new byte[]{78, 46, 113, 76, 42, 23, -11, -119})), punto.t(puntoVar.c), punto.w(x1.f2066q), puntoVar.f1073k.getText().toString(), m.h(new byte[]{26, 121}, new byte[]{106, 15, 106, 69, -69, -7, 105, 23}), 0));
                        puntoVar.f1073k.setVisibility(0);
                        return;
                    case 1:
                        String str5 = punto.r;
                        punto.t = Boolean.FALSE;
                        h0.b.o().saveBoolean(m.h(new byte[]{-47, -27}, new byte[]{-80, -112, -8, -123, -56, 113, -15, 15}), punto.t.booleanValue());
                        h0.b.o().saveString(m.h(new byte[]{-71, -118, 45}, new byte[]{-44, -1, 95, 86, -43, 77, 113, -93}), "");
                        puntoVar.x();
                        return;
                    case 2:
                        String str6 = punto.r;
                        String str7 = g0.f1916a;
                        f0[] values2 = f0.values();
                        AlertDialog.Builder builder = new AlertDialog.Builder(puntoVar);
                        builder.setTitle(m.h(new byte[]{-13, 69, -92, -85, -83, -1, 25, 63, -47, 67, -84, -79, -65, -3, 92}, new byte[]{-80, 45, -53, -60, -34, -102, 57, 83}));
                        String[] strArr = new String[values2.length];
                        for (int i16 = 0; i16 < values2.length; i16++) {
                            String str8 = values2[i16].f1910b;
                            strArr[i16] = str8;
                            if ("".equals(str8)) {
                                strArr[i16] = puntoVar.getResources().getString(R.string.AppLangDefault);
                            }
                        }
                        builder.setItems(strArr, new e0(i15, puntoVar, values2));
                        builder.show();
                        return;
                    case 3:
                        String str9 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar, (Class<?>) UpdateActivity.class), null);
                        return;
                    case 4:
                        String str10 = punto.r;
                        puntoVar.finish();
                        return;
                    case 5:
                        String str11 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar, (Class<?>) PermActivity.class), null);
                        return;
                    case 6:
                        String str12 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar.c, (Class<?>) MainWifiManadger.class), null);
                        return;
                    default:
                        String obj = puntoVar.f1072j.getText().toString();
                        if (obj == null) {
                            matches = false;
                        } else {
                            matches = Patterns.EMAIL_ADDRESS.matcher(obj).matches();
                        }
                        if (matches) {
                            y5.k.w(R.string.put_auth_mail_send, puntoVar.getApplicationContext());
                            String obj2 = puntoVar.f1072j.getText().toString();
                            puntoVar.u(new s3(obj2, punto.t(puntoVar.c), punto.w(x1.f2066q), "", m.h(new byte[]{64, -27}, new byte[]{54, -120, 123, 71, 40, -63, -85, 56}), 0));
                            h0.b.o().saveString(punto.t(puntoVar.c), obj2);
                            puntoVar.v(true);
                            puntoVar.f1073k.requestFocus();
                            puntoVar.f1074l.setEnabled(false);
                            new r3(puntoVar).start();
                            return;
                        }
                        y5.k.w(R.string.put_auth_mail, puntoVar.getApplicationContext());
                        return;
                }
            }
        });
        final int i14 = 3;
        ((Button) findViewById(R.id.b_start_act_app_sett)).setOnClickListener(new View.OnClickListener(this) { // from class: e0.q3
            public final /* synthetic */ punto c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean matches;
                int i142 = i14;
                int i15 = 0;
                punto puntoVar = this.c;
                switch (i142) {
                    case 0:
                        String str4 = punto.r;
                        puntoVar.u(new s3(h0.b.o().loadString(m.h(new byte[]{-90, -37, ByteCompanionObject.MIN_VALUE}, new byte[]{-53, -82, -14, -46, 67, -116, -115, 54}), m.h(new byte[]{ByteCompanionObject.MAX_VALUE}, new byte[]{78, 46, 113, 76, 42, 23, -11, -119})), punto.t(puntoVar.c), punto.w(x1.f2066q), puntoVar.f1073k.getText().toString(), m.h(new byte[]{26, 121}, new byte[]{106, 15, 106, 69, -69, -7, 105, 23}), 0));
                        puntoVar.f1073k.setVisibility(0);
                        return;
                    case 1:
                        String str5 = punto.r;
                        punto.t = Boolean.FALSE;
                        h0.b.o().saveBoolean(m.h(new byte[]{-47, -27}, new byte[]{-80, -112, -8, -123, -56, 113, -15, 15}), punto.t.booleanValue());
                        h0.b.o().saveString(m.h(new byte[]{-71, -118, 45}, new byte[]{-44, -1, 95, 86, -43, 77, 113, -93}), "");
                        puntoVar.x();
                        return;
                    case 2:
                        String str6 = punto.r;
                        String str7 = g0.f1916a;
                        f0[] values2 = f0.values();
                        AlertDialog.Builder builder = new AlertDialog.Builder(puntoVar);
                        builder.setTitle(m.h(new byte[]{-13, 69, -92, -85, -83, -1, 25, 63, -47, 67, -84, -79, -65, -3, 92}, new byte[]{-80, 45, -53, -60, -34, -102, 57, 83}));
                        String[] strArr = new String[values2.length];
                        for (int i16 = 0; i16 < values2.length; i16++) {
                            String str8 = values2[i16].f1910b;
                            strArr[i16] = str8;
                            if ("".equals(str8)) {
                                strArr[i16] = puntoVar.getResources().getString(R.string.AppLangDefault);
                            }
                        }
                        builder.setItems(strArr, new e0(i15, puntoVar, values2));
                        builder.show();
                        return;
                    case 3:
                        String str9 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar, (Class<?>) UpdateActivity.class), null);
                        return;
                    case 4:
                        String str10 = punto.r;
                        puntoVar.finish();
                        return;
                    case 5:
                        String str11 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar, (Class<?>) PermActivity.class), null);
                        return;
                    case 6:
                        String str12 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar.c, (Class<?>) MainWifiManadger.class), null);
                        return;
                    default:
                        String obj = puntoVar.f1072j.getText().toString();
                        if (obj == null) {
                            matches = false;
                        } else {
                            matches = Patterns.EMAIL_ADDRESS.matcher(obj).matches();
                        }
                        if (matches) {
                            y5.k.w(R.string.put_auth_mail_send, puntoVar.getApplicationContext());
                            String obj2 = puntoVar.f1072j.getText().toString();
                            puntoVar.u(new s3(obj2, punto.t(puntoVar.c), punto.w(x1.f2066q), "", m.h(new byte[]{64, -27}, new byte[]{54, -120, 123, 71, 40, -63, -85, 56}), 0));
                            h0.b.o().saveString(punto.t(puntoVar.c), obj2);
                            puntoVar.v(true);
                            puntoVar.f1073k.requestFocus();
                            puntoVar.f1074l.setEnabled(false);
                            new r3(puntoVar).start();
                            return;
                        }
                        y5.k.w(R.string.put_auth_mail, puntoVar.getApplicationContext());
                        return;
                }
            }
        });
        boolean loadBoolean = b.o().loadBoolean(m.h(new byte[]{-124, -65, 105}, new byte[]{-12, -37, 7, -119, 48, 96, 76, 108}), false);
        this.f1078p.setChecked(loadBoolean);
        this.f1072j.setEnabled(loadBoolean);
        this.f1074l.setEnabled(loadBoolean);
        final int i15 = 4;
        ((Button) findViewById(R.id.button29)).setOnClickListener(new View.OnClickListener(this) { // from class: e0.q3
            public final /* synthetic */ punto c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean matches;
                int i142 = i15;
                int i152 = 0;
                punto puntoVar = this.c;
                switch (i142) {
                    case 0:
                        String str4 = punto.r;
                        puntoVar.u(new s3(h0.b.o().loadString(m.h(new byte[]{-90, -37, ByteCompanionObject.MIN_VALUE}, new byte[]{-53, -82, -14, -46, 67, -116, -115, 54}), m.h(new byte[]{ByteCompanionObject.MAX_VALUE}, new byte[]{78, 46, 113, 76, 42, 23, -11, -119})), punto.t(puntoVar.c), punto.w(x1.f2066q), puntoVar.f1073k.getText().toString(), m.h(new byte[]{26, 121}, new byte[]{106, 15, 106, 69, -69, -7, 105, 23}), 0));
                        puntoVar.f1073k.setVisibility(0);
                        return;
                    case 1:
                        String str5 = punto.r;
                        punto.t = Boolean.FALSE;
                        h0.b.o().saveBoolean(m.h(new byte[]{-47, -27}, new byte[]{-80, -112, -8, -123, -56, 113, -15, 15}), punto.t.booleanValue());
                        h0.b.o().saveString(m.h(new byte[]{-71, -118, 45}, new byte[]{-44, -1, 95, 86, -43, 77, 113, -93}), "");
                        puntoVar.x();
                        return;
                    case 2:
                        String str6 = punto.r;
                        String str7 = g0.f1916a;
                        f0[] values2 = f0.values();
                        AlertDialog.Builder builder = new AlertDialog.Builder(puntoVar);
                        builder.setTitle(m.h(new byte[]{-13, 69, -92, -85, -83, -1, 25, 63, -47, 67, -84, -79, -65, -3, 92}, new byte[]{-80, 45, -53, -60, -34, -102, 57, 83}));
                        String[] strArr = new String[values2.length];
                        for (int i16 = 0; i16 < values2.length; i16++) {
                            String str8 = values2[i16].f1910b;
                            strArr[i16] = str8;
                            if ("".equals(str8)) {
                                strArr[i16] = puntoVar.getResources().getString(R.string.AppLangDefault);
                            }
                        }
                        builder.setItems(strArr, new e0(i152, puntoVar, values2));
                        builder.show();
                        return;
                    case 3:
                        String str9 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar, (Class<?>) UpdateActivity.class), null);
                        return;
                    case 4:
                        String str10 = punto.r;
                        puntoVar.finish();
                        return;
                    case 5:
                        String str11 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar, (Class<?>) PermActivity.class), null);
                        return;
                    case 6:
                        String str12 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar.c, (Class<?>) MainWifiManadger.class), null);
                        return;
                    default:
                        String obj = puntoVar.f1072j.getText().toString();
                        if (obj == null) {
                            matches = false;
                        } else {
                            matches = Patterns.EMAIL_ADDRESS.matcher(obj).matches();
                        }
                        if (matches) {
                            y5.k.w(R.string.put_auth_mail_send, puntoVar.getApplicationContext());
                            String obj2 = puntoVar.f1072j.getText().toString();
                            puntoVar.u(new s3(obj2, punto.t(puntoVar.c), punto.w(x1.f2066q), "", m.h(new byte[]{64, -27}, new byte[]{54, -120, 123, 71, 40, -63, -85, 56}), 0));
                            h0.b.o().saveString(punto.t(puntoVar.c), obj2);
                            puntoVar.v(true);
                            puntoVar.f1073k.requestFocus();
                            puntoVar.f1074l.setEnabled(false);
                            new r3(puntoVar).start();
                            return;
                        }
                        y5.k.w(R.string.put_auth_mail, puntoVar.getApplicationContext());
                        return;
                }
            }
        });
        final int i16 = 5;
        findViewById(R.id.b_start_act_app_perm).setOnClickListener(new View.OnClickListener(this) { // from class: e0.q3
            public final /* synthetic */ punto c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean matches;
                int i142 = i16;
                int i152 = 0;
                punto puntoVar = this.c;
                switch (i142) {
                    case 0:
                        String str4 = punto.r;
                        puntoVar.u(new s3(h0.b.o().loadString(m.h(new byte[]{-90, -37, ByteCompanionObject.MIN_VALUE}, new byte[]{-53, -82, -14, -46, 67, -116, -115, 54}), m.h(new byte[]{ByteCompanionObject.MAX_VALUE}, new byte[]{78, 46, 113, 76, 42, 23, -11, -119})), punto.t(puntoVar.c), punto.w(x1.f2066q), puntoVar.f1073k.getText().toString(), m.h(new byte[]{26, 121}, new byte[]{106, 15, 106, 69, -69, -7, 105, 23}), 0));
                        puntoVar.f1073k.setVisibility(0);
                        return;
                    case 1:
                        String str5 = punto.r;
                        punto.t = Boolean.FALSE;
                        h0.b.o().saveBoolean(m.h(new byte[]{-47, -27}, new byte[]{-80, -112, -8, -123, -56, 113, -15, 15}), punto.t.booleanValue());
                        h0.b.o().saveString(m.h(new byte[]{-71, -118, 45}, new byte[]{-44, -1, 95, 86, -43, 77, 113, -93}), "");
                        puntoVar.x();
                        return;
                    case 2:
                        String str6 = punto.r;
                        String str7 = g0.f1916a;
                        f0[] values2 = f0.values();
                        AlertDialog.Builder builder = new AlertDialog.Builder(puntoVar);
                        builder.setTitle(m.h(new byte[]{-13, 69, -92, -85, -83, -1, 25, 63, -47, 67, -84, -79, -65, -3, 92}, new byte[]{-80, 45, -53, -60, -34, -102, 57, 83}));
                        String[] strArr = new String[values2.length];
                        for (int i162 = 0; i162 < values2.length; i162++) {
                            String str8 = values2[i162].f1910b;
                            strArr[i162] = str8;
                            if ("".equals(str8)) {
                                strArr[i162] = puntoVar.getResources().getString(R.string.AppLangDefault);
                            }
                        }
                        builder.setItems(strArr, new e0(i152, puntoVar, values2));
                        builder.show();
                        return;
                    case 3:
                        String str9 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar, (Class<?>) UpdateActivity.class), null);
                        return;
                    case 4:
                        String str10 = punto.r;
                        puntoVar.finish();
                        return;
                    case 5:
                        String str11 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar, (Class<?>) PermActivity.class), null);
                        return;
                    case 6:
                        String str12 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar.c, (Class<?>) MainWifiManadger.class), null);
                        return;
                    default:
                        String obj = puntoVar.f1072j.getText().toString();
                        if (obj == null) {
                            matches = false;
                        } else {
                            matches = Patterns.EMAIL_ADDRESS.matcher(obj).matches();
                        }
                        if (matches) {
                            y5.k.w(R.string.put_auth_mail_send, puntoVar.getApplicationContext());
                            String obj2 = puntoVar.f1072j.getText().toString();
                            puntoVar.u(new s3(obj2, punto.t(puntoVar.c), punto.w(x1.f2066q), "", m.h(new byte[]{64, -27}, new byte[]{54, -120, 123, 71, 40, -63, -85, 56}), 0));
                            h0.b.o().saveString(punto.t(puntoVar.c), obj2);
                            puntoVar.v(true);
                            puntoVar.f1073k.requestFocus();
                            puntoVar.f1074l.setEnabled(false);
                            new r3(puntoVar).start();
                            return;
                        }
                        y5.k.w(R.string.put_auth_mail, puntoVar.getApplicationContext());
                        return;
                }
            }
        });
        if (t.booleanValue()) {
            this.f1072j.setVisibility(8);
            this.f1074l.setVisibility(8);
            this.f1076n.setVisibility(8);
            v(false);
            this.f1068f.setText(getResources().getString(R.string.auth_ok) + b.o().loadString(t(this.c), ""));
            this.f1076n.setVisibility(0);
            this.f1070h.setVisibility(0);
            this.f1078p.setEnabled(false);
        } else {
            x();
        }
        if (!t.booleanValue() && bundle != null) {
            v(bundle.getBoolean(r, false));
        }
        AlphaAnimation alphaAnimation = this.f1079q;
        alphaAnimation.setDuration(500L);
        alphaAnimation.setRepeatMode(2);
        alphaAnimation.setRepeatCount(-1);
        s(loadBoolean);
        this.f1078p.setOnCheckedChangeListener(new s0(i15, this));
        final int i17 = 6;
        ((Button) findViewById(R.id.button19)).setOnClickListener(new View.OnClickListener(this) { // from class: e0.q3
            public final /* synthetic */ punto c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean matches;
                int i142 = i17;
                int i152 = 0;
                punto puntoVar = this.c;
                switch (i142) {
                    case 0:
                        String str4 = punto.r;
                        puntoVar.u(new s3(h0.b.o().loadString(m.h(new byte[]{-90, -37, ByteCompanionObject.MIN_VALUE}, new byte[]{-53, -82, -14, -46, 67, -116, -115, 54}), m.h(new byte[]{ByteCompanionObject.MAX_VALUE}, new byte[]{78, 46, 113, 76, 42, 23, -11, -119})), punto.t(puntoVar.c), punto.w(x1.f2066q), puntoVar.f1073k.getText().toString(), m.h(new byte[]{26, 121}, new byte[]{106, 15, 106, 69, -69, -7, 105, 23}), 0));
                        puntoVar.f1073k.setVisibility(0);
                        return;
                    case 1:
                        String str5 = punto.r;
                        punto.t = Boolean.FALSE;
                        h0.b.o().saveBoolean(m.h(new byte[]{-47, -27}, new byte[]{-80, -112, -8, -123, -56, 113, -15, 15}), punto.t.booleanValue());
                        h0.b.o().saveString(m.h(new byte[]{-71, -118, 45}, new byte[]{-44, -1, 95, 86, -43, 77, 113, -93}), "");
                        puntoVar.x();
                        return;
                    case 2:
                        String str6 = punto.r;
                        String str7 = g0.f1916a;
                        f0[] values2 = f0.values();
                        AlertDialog.Builder builder = new AlertDialog.Builder(puntoVar);
                        builder.setTitle(m.h(new byte[]{-13, 69, -92, -85, -83, -1, 25, 63, -47, 67, -84, -79, -65, -3, 92}, new byte[]{-80, 45, -53, -60, -34, -102, 57, 83}));
                        String[] strArr = new String[values2.length];
                        for (int i162 = 0; i162 < values2.length; i162++) {
                            String str8 = values2[i162].f1910b;
                            strArr[i162] = str8;
                            if ("".equals(str8)) {
                                strArr[i162] = puntoVar.getResources().getString(R.string.AppLangDefault);
                            }
                        }
                        builder.setItems(strArr, new e0(i152, puntoVar, values2));
                        builder.show();
                        return;
                    case 3:
                        String str9 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar, (Class<?>) UpdateActivity.class), null);
                        return;
                    case 4:
                        String str10 = punto.r;
                        puntoVar.finish();
                        return;
                    case 5:
                        String str11 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar, (Class<?>) PermActivity.class), null);
                        return;
                    case 6:
                        String str12 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar.c, (Class<?>) MainWifiManadger.class), null);
                        return;
                    default:
                        String obj = puntoVar.f1072j.getText().toString();
                        if (obj == null) {
                            matches = false;
                        } else {
                            matches = Patterns.EMAIL_ADDRESS.matcher(obj).matches();
                        }
                        if (matches) {
                            y5.k.w(R.string.put_auth_mail_send, puntoVar.getApplicationContext());
                            String obj2 = puntoVar.f1072j.getText().toString();
                            puntoVar.u(new s3(obj2, punto.t(puntoVar.c), punto.w(x1.f2066q), "", m.h(new byte[]{64, -27}, new byte[]{54, -120, 123, 71, 40, -63, -85, 56}), 0));
                            h0.b.o().saveString(punto.t(puntoVar.c), obj2);
                            puntoVar.v(true);
                            puntoVar.f1073k.requestFocus();
                            puntoVar.f1074l.setEnabled(false);
                            new r3(puntoVar).start();
                            return;
                        }
                        y5.k.w(R.string.put_auth_mail, puntoVar.getApplicationContext());
                        return;
                }
            }
        });
        final int i18 = 7;
        this.f1074l.setOnClickListener(new View.OnClickListener(this) { // from class: e0.q3
            public final /* synthetic */ punto c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean matches;
                int i142 = i18;
                int i152 = 0;
                punto puntoVar = this.c;
                switch (i142) {
                    case 0:
                        String str4 = punto.r;
                        puntoVar.u(new s3(h0.b.o().loadString(m.h(new byte[]{-90, -37, ByteCompanionObject.MIN_VALUE}, new byte[]{-53, -82, -14, -46, 67, -116, -115, 54}), m.h(new byte[]{ByteCompanionObject.MAX_VALUE}, new byte[]{78, 46, 113, 76, 42, 23, -11, -119})), punto.t(puntoVar.c), punto.w(x1.f2066q), puntoVar.f1073k.getText().toString(), m.h(new byte[]{26, 121}, new byte[]{106, 15, 106, 69, -69, -7, 105, 23}), 0));
                        puntoVar.f1073k.setVisibility(0);
                        return;
                    case 1:
                        String str5 = punto.r;
                        punto.t = Boolean.FALSE;
                        h0.b.o().saveBoolean(m.h(new byte[]{-47, -27}, new byte[]{-80, -112, -8, -123, -56, 113, -15, 15}), punto.t.booleanValue());
                        h0.b.o().saveString(m.h(new byte[]{-71, -118, 45}, new byte[]{-44, -1, 95, 86, -43, 77, 113, -93}), "");
                        puntoVar.x();
                        return;
                    case 2:
                        String str6 = punto.r;
                        String str7 = g0.f1916a;
                        f0[] values2 = f0.values();
                        AlertDialog.Builder builder = new AlertDialog.Builder(puntoVar);
                        builder.setTitle(m.h(new byte[]{-13, 69, -92, -85, -83, -1, 25, 63, -47, 67, -84, -79, -65, -3, 92}, new byte[]{-80, 45, -53, -60, -34, -102, 57, 83}));
                        String[] strArr = new String[values2.length];
                        for (int i162 = 0; i162 < values2.length; i162++) {
                            String str8 = values2[i162].f1910b;
                            strArr[i162] = str8;
                            if ("".equals(str8)) {
                                strArr[i162] = puntoVar.getResources().getString(R.string.AppLangDefault);
                            }
                        }
                        builder.setItems(strArr, new e0(i152, puntoVar, values2));
                        builder.show();
                        return;
                    case 3:
                        String str9 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar, (Class<?>) UpdateActivity.class), null);
                        return;
                    case 4:
                        String str10 = punto.r;
                        puntoVar.finish();
                        return;
                    case 5:
                        String str11 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar, (Class<?>) PermActivity.class), null);
                        return;
                    case 6:
                        String str12 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar.c, (Class<?>) MainWifiManadger.class), null);
                        return;
                    default:
                        String obj = puntoVar.f1072j.getText().toString();
                        if (obj == null) {
                            matches = false;
                        } else {
                            matches = Patterns.EMAIL_ADDRESS.matcher(obj).matches();
                        }
                        if (matches) {
                            y5.k.w(R.string.put_auth_mail_send, puntoVar.getApplicationContext());
                            String obj2 = puntoVar.f1072j.getText().toString();
                            puntoVar.u(new s3(obj2, punto.t(puntoVar.c), punto.w(x1.f2066q), "", m.h(new byte[]{64, -27}, new byte[]{54, -120, 123, 71, 40, -63, -85, 56}), 0));
                            h0.b.o().saveString(punto.t(puntoVar.c), obj2);
                            puntoVar.v(true);
                            puntoVar.f1073k.requestFocus();
                            puntoVar.f1074l.setEnabled(false);
                            new r3(puntoVar).start();
                            return;
                        }
                        y5.k.w(R.string.put_auth_mail, puntoVar.getApplicationContext());
                        return;
                }
            }
        });
        this.f1075m.setOnClickListener(new View.OnClickListener(this) { // from class: e0.q3
            public final /* synthetic */ punto c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean matches;
                int i142 = i11;
                int i152 = 0;
                punto puntoVar = this.c;
                switch (i142) {
                    case 0:
                        String str4 = punto.r;
                        puntoVar.u(new s3(h0.b.o().loadString(m.h(new byte[]{-90, -37, ByteCompanionObject.MIN_VALUE}, new byte[]{-53, -82, -14, -46, 67, -116, -115, 54}), m.h(new byte[]{ByteCompanionObject.MAX_VALUE}, new byte[]{78, 46, 113, 76, 42, 23, -11, -119})), punto.t(puntoVar.c), punto.w(x1.f2066q), puntoVar.f1073k.getText().toString(), m.h(new byte[]{26, 121}, new byte[]{106, 15, 106, 69, -69, -7, 105, 23}), 0));
                        puntoVar.f1073k.setVisibility(0);
                        return;
                    case 1:
                        String str5 = punto.r;
                        punto.t = Boolean.FALSE;
                        h0.b.o().saveBoolean(m.h(new byte[]{-47, -27}, new byte[]{-80, -112, -8, -123, -56, 113, -15, 15}), punto.t.booleanValue());
                        h0.b.o().saveString(m.h(new byte[]{-71, -118, 45}, new byte[]{-44, -1, 95, 86, -43, 77, 113, -93}), "");
                        puntoVar.x();
                        return;
                    case 2:
                        String str6 = punto.r;
                        String str7 = g0.f1916a;
                        f0[] values2 = f0.values();
                        AlertDialog.Builder builder = new AlertDialog.Builder(puntoVar);
                        builder.setTitle(m.h(new byte[]{-13, 69, -92, -85, -83, -1, 25, 63, -47, 67, -84, -79, -65, -3, 92}, new byte[]{-80, 45, -53, -60, -34, -102, 57, 83}));
                        String[] strArr = new String[values2.length];
                        for (int i162 = 0; i162 < values2.length; i162++) {
                            String str8 = values2[i162].f1910b;
                            strArr[i162] = str8;
                            if ("".equals(str8)) {
                                strArr[i162] = puntoVar.getResources().getString(R.string.AppLangDefault);
                            }
                        }
                        builder.setItems(strArr, new e0(i152, puntoVar, values2));
                        builder.show();
                        return;
                    case 3:
                        String str9 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar, (Class<?>) UpdateActivity.class), null);
                        return;
                    case 4:
                        String str10 = punto.r;
                        puntoVar.finish();
                        return;
                    case 5:
                        String str11 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar, (Class<?>) PermActivity.class), null);
                        return;
                    case 6:
                        String str12 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar.c, (Class<?>) MainWifiManadger.class), null);
                        return;
                    default:
                        String obj = puntoVar.f1072j.getText().toString();
                        if (obj == null) {
                            matches = false;
                        } else {
                            matches = Patterns.EMAIL_ADDRESS.matcher(obj).matches();
                        }
                        if (matches) {
                            y5.k.w(R.string.put_auth_mail_send, puntoVar.getApplicationContext());
                            String obj2 = puntoVar.f1072j.getText().toString();
                            puntoVar.u(new s3(obj2, punto.t(puntoVar.c), punto.w(x1.f2066q), "", m.h(new byte[]{64, -27}, new byte[]{54, -120, 123, 71, 40, -63, -85, 56}), 0));
                            h0.b.o().saveString(punto.t(puntoVar.c), obj2);
                            puntoVar.v(true);
                            puntoVar.f1073k.requestFocus();
                            puntoVar.f1074l.setEnabled(false);
                            new r3(puntoVar).start();
                            return;
                        }
                        y5.k.w(R.string.put_auth_mail, puntoVar.getApplicationContext());
                        return;
                }
            }
        });
        this.f1076n.setOnClickListener(new View.OnClickListener(this) { // from class: e0.q3
            public final /* synthetic */ punto c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean matches;
                int i142 = i10;
                int i152 = 0;
                punto puntoVar = this.c;
                switch (i142) {
                    case 0:
                        String str4 = punto.r;
                        puntoVar.u(new s3(h0.b.o().loadString(m.h(new byte[]{-90, -37, ByteCompanionObject.MIN_VALUE}, new byte[]{-53, -82, -14, -46, 67, -116, -115, 54}), m.h(new byte[]{ByteCompanionObject.MAX_VALUE}, new byte[]{78, 46, 113, 76, 42, 23, -11, -119})), punto.t(puntoVar.c), punto.w(x1.f2066q), puntoVar.f1073k.getText().toString(), m.h(new byte[]{26, 121}, new byte[]{106, 15, 106, 69, -69, -7, 105, 23}), 0));
                        puntoVar.f1073k.setVisibility(0);
                        return;
                    case 1:
                        String str5 = punto.r;
                        punto.t = Boolean.FALSE;
                        h0.b.o().saveBoolean(m.h(new byte[]{-47, -27}, new byte[]{-80, -112, -8, -123, -56, 113, -15, 15}), punto.t.booleanValue());
                        h0.b.o().saveString(m.h(new byte[]{-71, -118, 45}, new byte[]{-44, -1, 95, 86, -43, 77, 113, -93}), "");
                        puntoVar.x();
                        return;
                    case 2:
                        String str6 = punto.r;
                        String str7 = g0.f1916a;
                        f0[] values2 = f0.values();
                        AlertDialog.Builder builder = new AlertDialog.Builder(puntoVar);
                        builder.setTitle(m.h(new byte[]{-13, 69, -92, -85, -83, -1, 25, 63, -47, 67, -84, -79, -65, -3, 92}, new byte[]{-80, 45, -53, -60, -34, -102, 57, 83}));
                        String[] strArr = new String[values2.length];
                        for (int i162 = 0; i162 < values2.length; i162++) {
                            String str8 = values2[i162].f1910b;
                            strArr[i162] = str8;
                            if ("".equals(str8)) {
                                strArr[i162] = puntoVar.getResources().getString(R.string.AppLangDefault);
                            }
                        }
                        builder.setItems(strArr, new e0(i152, puntoVar, values2));
                        builder.show();
                        return;
                    case 3:
                        String str9 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar, (Class<?>) UpdateActivity.class), null);
                        return;
                    case 4:
                        String str10 = punto.r;
                        puntoVar.finish();
                        return;
                    case 5:
                        String str11 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar, (Class<?>) PermActivity.class), null);
                        return;
                    case 6:
                        String str12 = punto.r;
                        y5.k.u(puntoVar, new Intent(puntoVar.c, (Class<?>) MainWifiManadger.class), null);
                        return;
                    default:
                        String obj = puntoVar.f1072j.getText().toString();
                        if (obj == null) {
                            matches = false;
                        } else {
                            matches = Patterns.EMAIL_ADDRESS.matcher(obj).matches();
                        }
                        if (matches) {
                            y5.k.w(R.string.put_auth_mail_send, puntoVar.getApplicationContext());
                            String obj2 = puntoVar.f1072j.getText().toString();
                            puntoVar.u(new s3(obj2, punto.t(puntoVar.c), punto.w(x1.f2066q), "", m.h(new byte[]{64, -27}, new byte[]{54, -120, 123, 71, 40, -63, -85, 56}), 0));
                            h0.b.o().saveString(punto.t(puntoVar.c), obj2);
                            puntoVar.v(true);
                            puntoVar.f1073k.requestFocus();
                            puntoVar.f1074l.setEnabled(false);
                            new r3(puntoVar).start();
                            return;
                        }
                        y5.k.w(R.string.put_auth_mail, puntoVar.getApplicationContext());
                        return;
                }
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        String str = MainActivity.f750e1;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = MainActivity.f750e1;
        v(this.f1067b);
        boolean z9 = false;
        if (!f1064s.equals(m.h(new byte[]{-76}, new byte[]{-124, 46, -31, 93, -53, 121, -73, 109}))) {
            Long valueOf = Long.valueOf((Long.parseLong(new String(android.util.Base64.decode(f1064s, 0))) - b.a().j().l(Long.MAX_VALUE).longValue()) / 86400);
            if (valueOf.intValue() > 0) {
                int intValue = valueOf.intValue();
                this.f1070h.setText(getResources().getString(R.string.lic_day_val) + String.valueOf(intValue) + getResources().getString(R.string.lic_day));
            } else {
                this.f1070h.setText(this.c.getResources().getString(R.string.punto_lic_null));
            }
        }
        this.d.post(new e(this, z9, 5));
        u(new s3(b.o().loadString(m.h(new byte[]{-109, -90, -55}, new byte[]{-2, -45, -69, -104, 39, -54, 6, -55}), ""), t(this.c), w(x1.f2066q), "", m.h(new byte[]{100, 124}, new byte[]{18, 25, 43, 62, -90, 26, 18, 15}), 0));
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(r, this.f1067b);
        super.onSaveInstanceState(bundle);
    }

    public final void s(boolean z9) {
        Switch r02 = this.f1078p;
        if (!z9) {
            Drawable thumbDrawable = r02.getThumbDrawable();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            thumbDrawable.setColorFilter(-1, mode);
            this.f1078p.getTrackDrawable().setColorFilter(SupportMenu.CATEGORY_MASK, mode);
            this.f1078p.startAnimation(this.f1079q);
            return;
        }
        r02.getThumbDrawable().clearColorFilter();
        this.f1078p.getTrackDrawable().clearColorFilter();
        this.f1078p.clearAnimation();
    }

    public final void u(s3 s3Var) {
        w.c(-1, m.h(new byte[]{-113, -117, -29, -103, 86}, new byte[]{-1, -2, -115, -19, 57, 4, -70, -14})).execute(new j2(6, this, s3Var));
    }

    public final void v(boolean z9) {
        int i10;
        this.f1067b = z9;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f1073k.setVisibility(i10);
        this.f1075m.setVisibility(i10);
        this.f1069g.setVisibility(i10);
        if (z9) {
            this.f1073k.post(new g(24, this));
        }
    }

    public final void x() {
        this.f1072j.setVisibility(0);
        this.f1074l.setVisibility(0);
        this.f1076n.setVisibility(8);
        v(false);
        this.f1068f.setText(getResources().getString(R.string.auth_mail));
        this.f1070h.setVisibility(8);
        this.f1078p.setEnabled(true);
    }
}
