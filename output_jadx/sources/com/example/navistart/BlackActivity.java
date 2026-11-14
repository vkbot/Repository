package com.example.navistart;

import android.R;
import android.app.Activity;
import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetManager;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import b1.h;
import com.example.navistart.BlackActivity;
import com.example.navistart.cores.HUDMassageObj;
import com.google.protobuf.q;
import e0.m;
import e0.p3;
import e0.x1;
import f0.c;
import h0.b;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.a0;
import u0.a;
import v1.d;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class BlackActivity extends AppCompatActivity implements c {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f716g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f717b = Boolean.TRUE;
    public Float c = null;
    public View d;
    public AppWidgetHost e;

    /* renamed from: f, reason: collision with root package name */
    public h f718f;

    public static Boolean s() {
        StringBuilder sb = new StringBuilder();
        a o5 = b.o();
        byte[] bArr = m.f1973j;
        String[] strArr = p3.f2001a;
        q.s(bArr, o5, "", sb);
        q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        String g10 = q.g(sb, x1.f2066q);
        a o9 = b.o();
        byte[] bArr2 = m.f1969f;
        if (q.w(bArr2, o9, "", g10)) {
            boolean z9 = true;
            if (q.d(Long.MAX_VALUE, b.a().j()) >= Long.parseLong(new String(q.x(new byte[]{45}, new byte[]{29, 118, -46, 44, 99, 60, 29, 81}, b.o(), q.h(m.f1970g, b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            return Boolean.valueOf(z9);
        }
        return Boolean.FALSE;
    }

    public static void t(Activity activity) {
        activity.requestWindowFeature(1);
        activity.getWindow().setFlags(1024, 1024);
        activity.getWindow().setBackgroundDrawableResource(R.color.transparent);
        activity.getWindow().setFormat(-3);
        activity.getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    @Override // f0.c
    public final void c() {
        l0.a.t(a0.class, null).show(getSupportFragmentManager(), m.h(new byte[]{13, 117, 32, -94, -117, 19, -2, -35, 7}, new byte[]{96, 12, ByteCompanionObject.MAX_VALUE, -58, -30, 114, -110, -78}));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_NaviStart_AppCompat);
        super.onCreate(bundle);
        if (this.c == null) {
            this.c = Float.valueOf(getWindow().getAttributes().screenBrightness);
        }
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.screenBrightness = 0.01f;
        getWindow().setAttributes(attributes);
        if (boot.b(this) && this.f717b.booleanValue()) {
            throw null;
        }
        t(this);
        setContentView(R.layout.blackactivity);
        this.e = new AppWidgetHost(this, 1024);
        AppWidgetManager.getInstance(this);
        this.d = findViewById(R.id.dimOverlay);
        this.d.setAlpha(b.o().loadInt(m.h(new byte[]{3, 112, -23, -88, 87, -51, -71, 17, 32, 118, -28, -69, 100, -36, -78, 63, 54, 116, -19, -71, 83, -62, -81, 35, 56}, new byte[]{76, 6, -116, -38, 59, -84, -64, 80}), 100) / 100.0f);
        String loadString = b.o().loadString(m.h(new byte[]{ByteCompanionObject.MIN_VALUE, 122, -4, -27, 101, 51, -32, -44, -127, 122, -14, -27, 101, 52, -15, -63, -91, 123, -8, -24, 122}, new byte[]{-62, 22, -99, -122, 14, 114, -125, -96}), null);
        f0.b bVar = f0.b.e;
        if (loadString != null) {
            try {
                bVar = f0.b.valueOf(loadString);
            } catch (IllegalArgumentException unused) {
            }
        }
        final int i10 = 0;
        d.a().d().f5923a.observe(this, new Observer(this) { // from class: e0.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlackActivity f1957b;

            {
                this.f1957b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i11 = i10;
                boolean z9 = false;
                BlackActivity blackActivity = this.f1957b;
                switch (i11) {
                    case 0:
                        Integer num = (Integer) obj;
                        int i12 = BlackActivity.f716g;
                        if (num != null) {
                            int intValue = num.intValue();
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.d(intValue);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Integer num2 = (Integer) obj;
                        int i13 = BlackActivity.f716g;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.l(intValue2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        k7.b bVar2 = (k7.b) obj;
                        int i14 = BlackActivity.f716g;
                        if (bVar2 != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar2.f3426b);
                            String i15 = com.google.protobuf.q.i(new byte[]{113, -42}, new byte[]{-77, 102, 63, -45, 43, 72, 122, 106}, sb);
                            int i16 = bVar2.d;
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (z9 & BlackActivity.s().booleanValue()) {
                                blackActivity.f718f.g(i16, i15);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        if (hUDMassageObj != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.o(hUDMassageObj);
                                return;
                            }
                            return;
                        }
                        int i17 = BlackActivity.f716g;
                        return;
                    case 4:
                        String str = (String) obj;
                        if (str != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.f(str);
                                return;
                            }
                            return;
                        }
                        int i18 = BlackActivity.f716g;
                        return;
                    case 5:
                        s0.a aVar = (s0.a) obj;
                        if (aVar != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.k(aVar);
                                return;
                            }
                            return;
                        }
                        int i19 = BlackActivity.f716g;
                        return;
                    default:
                        Location location = (Location) obj;
                        if (location != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.e.i(location);
                                return;
                            }
                            return;
                        }
                        int i20 = BlackActivity.f716g;
                        return;
                }
            }
        });
        final int i11 = 1;
        d.a().d().f5924b.observe(this, new Observer(this) { // from class: e0.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlackActivity f1957b;

            {
                this.f1957b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i112 = i11;
                boolean z9 = false;
                BlackActivity blackActivity = this.f1957b;
                switch (i112) {
                    case 0:
                        Integer num = (Integer) obj;
                        int i12 = BlackActivity.f716g;
                        if (num != null) {
                            int intValue = num.intValue();
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.d(intValue);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Integer num2 = (Integer) obj;
                        int i13 = BlackActivity.f716g;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.l(intValue2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        k7.b bVar2 = (k7.b) obj;
                        int i14 = BlackActivity.f716g;
                        if (bVar2 != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar2.f3426b);
                            String i15 = com.google.protobuf.q.i(new byte[]{113, -42}, new byte[]{-77, 102, 63, -45, 43, 72, 122, 106}, sb);
                            int i16 = bVar2.d;
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (z9 & BlackActivity.s().booleanValue()) {
                                blackActivity.f718f.g(i16, i15);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        if (hUDMassageObj != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.o(hUDMassageObj);
                                return;
                            }
                            return;
                        }
                        int i17 = BlackActivity.f716g;
                        return;
                    case 4:
                        String str = (String) obj;
                        if (str != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.f(str);
                                return;
                            }
                            return;
                        }
                        int i18 = BlackActivity.f716g;
                        return;
                    case 5:
                        s0.a aVar = (s0.a) obj;
                        if (aVar != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.k(aVar);
                                return;
                            }
                            return;
                        }
                        int i19 = BlackActivity.f716g;
                        return;
                    default:
                        Location location = (Location) obj;
                        if (location != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.e.i(location);
                                return;
                            }
                            return;
                        }
                        int i20 = BlackActivity.f716g;
                        return;
                }
            }
        });
        final int i12 = 2;
        d.a().d().c.observe(this, new Observer(this) { // from class: e0.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlackActivity f1957b;

            {
                this.f1957b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i112 = i12;
                boolean z9 = false;
                BlackActivity blackActivity = this.f1957b;
                switch (i112) {
                    case 0:
                        Integer num = (Integer) obj;
                        int i122 = BlackActivity.f716g;
                        if (num != null) {
                            int intValue = num.intValue();
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.d(intValue);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Integer num2 = (Integer) obj;
                        int i13 = BlackActivity.f716g;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.l(intValue2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        k7.b bVar2 = (k7.b) obj;
                        int i14 = BlackActivity.f716g;
                        if (bVar2 != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar2.f3426b);
                            String i15 = com.google.protobuf.q.i(new byte[]{113, -42}, new byte[]{-77, 102, 63, -45, 43, 72, 122, 106}, sb);
                            int i16 = bVar2.d;
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (z9 & BlackActivity.s().booleanValue()) {
                                blackActivity.f718f.g(i16, i15);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        if (hUDMassageObj != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.o(hUDMassageObj);
                                return;
                            }
                            return;
                        }
                        int i17 = BlackActivity.f716g;
                        return;
                    case 4:
                        String str = (String) obj;
                        if (str != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.f(str);
                                return;
                            }
                            return;
                        }
                        int i18 = BlackActivity.f716g;
                        return;
                    case 5:
                        s0.a aVar = (s0.a) obj;
                        if (aVar != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.k(aVar);
                                return;
                            }
                            return;
                        }
                        int i19 = BlackActivity.f716g;
                        return;
                    default:
                        Location location = (Location) obj;
                        if (location != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.e.i(location);
                                return;
                            }
                            return;
                        }
                        int i20 = BlackActivity.f716g;
                        return;
                }
            }
        });
        final int i13 = 3;
        d.a().d().d.observe(this, new Observer(this) { // from class: e0.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlackActivity f1957b;

            {
                this.f1957b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i112 = i13;
                boolean z9 = false;
                BlackActivity blackActivity = this.f1957b;
                switch (i112) {
                    case 0:
                        Integer num = (Integer) obj;
                        int i122 = BlackActivity.f716g;
                        if (num != null) {
                            int intValue = num.intValue();
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.d(intValue);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Integer num2 = (Integer) obj;
                        int i132 = BlackActivity.f716g;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.l(intValue2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        k7.b bVar2 = (k7.b) obj;
                        int i14 = BlackActivity.f716g;
                        if (bVar2 != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar2.f3426b);
                            String i15 = com.google.protobuf.q.i(new byte[]{113, -42}, new byte[]{-77, 102, 63, -45, 43, 72, 122, 106}, sb);
                            int i16 = bVar2.d;
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (z9 & BlackActivity.s().booleanValue()) {
                                blackActivity.f718f.g(i16, i15);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        if (hUDMassageObj != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.o(hUDMassageObj);
                                return;
                            }
                            return;
                        }
                        int i17 = BlackActivity.f716g;
                        return;
                    case 4:
                        String str = (String) obj;
                        if (str != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.f(str);
                                return;
                            }
                            return;
                        }
                        int i18 = BlackActivity.f716g;
                        return;
                    case 5:
                        s0.a aVar = (s0.a) obj;
                        if (aVar != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.k(aVar);
                                return;
                            }
                            return;
                        }
                        int i19 = BlackActivity.f716g;
                        return;
                    default:
                        Location location = (Location) obj;
                        if (location != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.e.i(location);
                                return;
                            }
                            return;
                        }
                        int i20 = BlackActivity.f716g;
                        return;
                }
            }
        });
        final int i14 = 4;
        d.a().d().e.observe(this, new Observer(this) { // from class: e0.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlackActivity f1957b;

            {
                this.f1957b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i112 = i14;
                boolean z9 = false;
                BlackActivity blackActivity = this.f1957b;
                switch (i112) {
                    case 0:
                        Integer num = (Integer) obj;
                        int i122 = BlackActivity.f716g;
                        if (num != null) {
                            int intValue = num.intValue();
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.d(intValue);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Integer num2 = (Integer) obj;
                        int i132 = BlackActivity.f716g;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.l(intValue2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        k7.b bVar2 = (k7.b) obj;
                        int i142 = BlackActivity.f716g;
                        if (bVar2 != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar2.f3426b);
                            String i15 = com.google.protobuf.q.i(new byte[]{113, -42}, new byte[]{-77, 102, 63, -45, 43, 72, 122, 106}, sb);
                            int i16 = bVar2.d;
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (z9 & BlackActivity.s().booleanValue()) {
                                blackActivity.f718f.g(i16, i15);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        if (hUDMassageObj != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.o(hUDMassageObj);
                                return;
                            }
                            return;
                        }
                        int i17 = BlackActivity.f716g;
                        return;
                    case 4:
                        String str = (String) obj;
                        if (str != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.f(str);
                                return;
                            }
                            return;
                        }
                        int i18 = BlackActivity.f716g;
                        return;
                    case 5:
                        s0.a aVar = (s0.a) obj;
                        if (aVar != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.k(aVar);
                                return;
                            }
                            return;
                        }
                        int i19 = BlackActivity.f716g;
                        return;
                    default:
                        Location location = (Location) obj;
                        if (location != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.e.i(location);
                                return;
                            }
                            return;
                        }
                        int i20 = BlackActivity.f716g;
                        return;
                }
            }
        });
        final int i15 = 5;
        d.a().d().f5925f.observe(this, new Observer(this) { // from class: e0.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlackActivity f1957b;

            {
                this.f1957b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i112 = i15;
                boolean z9 = false;
                BlackActivity blackActivity = this.f1957b;
                switch (i112) {
                    case 0:
                        Integer num = (Integer) obj;
                        int i122 = BlackActivity.f716g;
                        if (num != null) {
                            int intValue = num.intValue();
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.d(intValue);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Integer num2 = (Integer) obj;
                        int i132 = BlackActivity.f716g;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.l(intValue2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        k7.b bVar2 = (k7.b) obj;
                        int i142 = BlackActivity.f716g;
                        if (bVar2 != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar2.f3426b);
                            String i152 = com.google.protobuf.q.i(new byte[]{113, -42}, new byte[]{-77, 102, 63, -45, 43, 72, 122, 106}, sb);
                            int i16 = bVar2.d;
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (z9 & BlackActivity.s().booleanValue()) {
                                blackActivity.f718f.g(i16, i152);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        if (hUDMassageObj != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.o(hUDMassageObj);
                                return;
                            }
                            return;
                        }
                        int i17 = BlackActivity.f716g;
                        return;
                    case 4:
                        String str = (String) obj;
                        if (str != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.f(str);
                                return;
                            }
                            return;
                        }
                        int i18 = BlackActivity.f716g;
                        return;
                    case 5:
                        s0.a aVar = (s0.a) obj;
                        if (aVar != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.k(aVar);
                                return;
                            }
                            return;
                        }
                        int i19 = BlackActivity.f716g;
                        return;
                    default:
                        Location location = (Location) obj;
                        if (location != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.e.i(location);
                                return;
                            }
                            return;
                        }
                        int i20 = BlackActivity.f716g;
                        return;
                }
            }
        });
        final int i16 = 6;
        d.a().d().f5926g.observe(this, new Observer(this) { // from class: e0.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlackActivity f1957b;

            {
                this.f1957b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i112 = i16;
                boolean z9 = false;
                BlackActivity blackActivity = this.f1957b;
                switch (i112) {
                    case 0:
                        Integer num = (Integer) obj;
                        int i122 = BlackActivity.f716g;
                        if (num != null) {
                            int intValue = num.intValue();
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.d(intValue);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Integer num2 = (Integer) obj;
                        int i132 = BlackActivity.f716g;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.l(intValue2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        k7.b bVar2 = (k7.b) obj;
                        int i142 = BlackActivity.f716g;
                        if (bVar2 != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar2.f3426b);
                            String i152 = com.google.protobuf.q.i(new byte[]{113, -42}, new byte[]{-77, 102, 63, -45, 43, 72, 122, 106}, sb);
                            int i162 = bVar2.d;
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (z9 & BlackActivity.s().booleanValue()) {
                                blackActivity.f718f.g(i162, i152);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        if (hUDMassageObj != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.o(hUDMassageObj);
                                return;
                            }
                            return;
                        }
                        int i17 = BlackActivity.f716g;
                        return;
                    case 4:
                        String str = (String) obj;
                        if (str != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.f(str);
                                return;
                            }
                            return;
                        }
                        int i18 = BlackActivity.f716g;
                        return;
                    case 5:
                        s0.a aVar = (s0.a) obj;
                        if (aVar != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.k(aVar);
                                return;
                            }
                            return;
                        }
                        int i19 = BlackActivity.f716g;
                        return;
                    default:
                        Location location = (Location) obj;
                        if (location != null) {
                            if (blackActivity.f718f != null) {
                                z9 = true;
                            }
                            if (BlackActivity.s().booleanValue() & z9) {
                                blackActivity.f718f.e.i(location);
                                return;
                            }
                            return;
                        }
                        int i20 = BlackActivity.f716g;
                        return;
                }
            }
        });
        u(bVar);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.c != null) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.screenBrightness = this.c.floatValue();
            getWindow().setAttributes(attributes);
            this.c = null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.e.startListening();
    }

    public final void u(f0.b bVar) {
        this.f718f = null;
        if (bVar == f0.b.d) {
            String h2 = m.h(new byte[]{-12, 92, 51, -103, -80, -91, -48, 39, -45, 64, 7, -120, -112, -103, -61, 43, -46}, new byte[]{-71, 37, 100, -4, -46, -11, -94, 72});
            String h10 = m.h(new byte[]{-61, 105, -91, -38, 91, -54, 9, -50, -28, 117, -111, -53, 123, -10, 26, -62, -27, 79, -95, -38, 77, -18, 18, -49, -23, 99, -83, -12, 92, -29}, new byte[]{-114, 16, -14, -65, 57, -102, 123, -95});
            String h11 = m.h(new byte[]{126, -93, -107, 95, -16, 101, 12, 85, 109, -93, -111, 97, -25, 101, 25, 105, 113}, new byte[]{26, -58, -13, 62, -123, 9, 120, 10});
            h hVar = new h();
            Bundle bundle = new Bundle();
            bundle.putString(h.f288g, h2);
            bundle.putString(h.f289h, h10);
            bundle.putString(h.f290i, h11);
            hVar.setArguments(bundle);
            this.f718f = hVar;
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, hVar).commit();
            return;
        }
        try {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, (Fragment) bVar.c.newInstance()).commit();
        } catch (IllegalAccessException | InstantiationException e) {
            n0.b.w(e);
        }
    }
}
