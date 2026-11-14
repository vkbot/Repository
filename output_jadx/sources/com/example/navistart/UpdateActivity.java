package com.example.navistart;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.example.navistart.UpdateActivity;
import e0.k0;
import e0.m;
import e0.p3;
import e0.q;
import e0.s0;
import e0.y2;
import e0.z2;
import h0.b;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class UpdateActivity extends AppCompatActivity {

    /* renamed from: l, reason: collision with root package name */
    public static final String f933l = m.h(new byte[]{-111, 19, -115, 30, -60, -125, 78, -123, -101, 28, -115, 48, -63, -87, 78, -127}, new byte[]{-14, ByteCompanionObject.MAX_VALUE, -24, ByteCompanionObject.MAX_VALUE, -74, -57, 43, -13});

    /* renamed from: b, reason: collision with root package name */
    public TextView f934b;
    public Button c;
    public Button d;
    public Button e;

    /* renamed from: f, reason: collision with root package name */
    public Button f935f;

    /* renamed from: g, reason: collision with root package name */
    public Button f936g;

    /* renamed from: h, reason: collision with root package name */
    public Button f937h;

    /* renamed from: i, reason: collision with root package name */
    public Switch f938i;

    /* renamed from: j, reason: collision with root package name */
    public int f939j;

    /* renamed from: k, reason: collision with root package name */
    public final Handler f940k;

    public UpdateActivity() {
        p3.b(2);
        p3.b(4);
        p3.a(6);
        p3.a(0);
        m.h(new byte[]{90}, new byte[]{116, 0, 21, 31, -35, 44, 37, 82});
        p3.c(5);
        p3.c(7);
        this.f939j = 0;
        this.f940k = new Handler(Looper.getMainLooper());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(m.x(context));
        Log.d(m.h(new byte[]{-10, -116, -125, 106, -40}, new byte[]{-94, -34, -62, 41, -99, 126, -82, 59}), m.h(new byte[]{-126, -53, -93, 121, -49, 10, 111, 58, -29, -55, -75, ByteCompanionObject.MAX_VALUE, -52, 23, 59, 55, -84, -120, -92, 100, -40, 17, 111, 121, -29}, new byte[]{-61, -88, -41, 16, -71, 99, 27, 67}).concat(getClass().getSimpleName()));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.modern_background));
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.modern_background));
        final int i10 = 0;
        getWindow().getDecorView().setSystemUiVisibility(0);
        setContentView(R.layout.activity_update);
        ((Button) findViewById(R.id.button28)).setOnClickListener(new View.OnClickListener(this) { // from class: e0.v2
            public final /* synthetic */ UpdateActivity c;

            {
                this.c = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:92:0x0269, code lost:
            
                if (r0.isEmpty() == false) goto L72;
             */
            /* JADX WARN: Code restructure failed: missing block: B:94:0x026c, code lost:
            
                r6 = new java.lang.StringBuilder();
                r6.append(r0);
                r0 = new byte[1];
                r0[r16] = 55;
                r6.append(e0.m.h(r0, new byte[]{13, 42, -127, kotlin.jvm.internal.ByteCompanionObject.MIN_VALUE, -4, -26, 59, -41}));
                r6.append(r4.flattenToString());
                r0 = r6.toString();
             */
            /* JADX WARN: Removed duplicated region for block: B:56:0x01b5  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x01d2  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x03a5  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x03dc  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r18) {
                /*
                    Method dump skipped, instructions count: 1664
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: e0.v2.onClick(android.view.View):void");
            }
        });
        byte[] bArr = punto.w;
        String str2 = z2.f2092a;
        new String(bArr);
        final int i11 = 8;
        if (getIntent().getBooleanExtra(m.h(new byte[]{76, 42, -104, -67, 6, 35, 12, -100, 94, 42, -100}, new byte[]{63, 94, -7, -49, 114, 118, 124, -8}), false)) {
            setContentView(R.layout.activity_update2);
            final int i12 = 5;
            ((Button) findViewById(R.id.button28)).setOnClickListener(new View.OnClickListener(this) { // from class: e0.v2
                public final /* synthetic */ UpdateActivity c;

                {
                    this.c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                        	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        */
                    /*
                        Method dump skipped, instructions count: 1664
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: e0.v2.onClick(android.view.View):void");
                }
            });
            t();
            return;
        }
        this.f934b = (TextView) findViewById(R.id.currentVersionTextView);
        this.c = (Button) findViewById(R.id.updateButton);
        this.d = (Button) findViewById(R.id.updateButton2);
        final int i13 = 6;
        findViewById(R.id.launcherShortcutsButton).setOnClickListener(new View.OnClickListener(this) { // from class: e0.v2
            public final /* synthetic */ UpdateActivity c;

            {
                this.c = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r18) {
                /*
                    Method dump skipped, instructions count: 1664
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: e0.v2.onClick(android.view.View):void");
            }
        });
        this.f935f = (Button) findViewById(R.id.resetAndUpdateButton);
        this.f936g = (Button) findViewById(R.id.clearDataButton);
        Button button = (Button) findViewById(R.id.button_testNS_install);
        this.e = button;
        final int i14 = 7;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: e0.v2
            public final /* synthetic */ UpdateActivity c;

            {
                this.c = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r18) {
                /*
                    Method dump skipped, instructions count: 1664
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: e0.v2.onClick(android.view.View):void");
            }
        });
        Switch r62 = (Switch) findViewById(R.id.switch22);
        this.f938i = r62;
        r62.setChecked(b.o().loadBoolean(m.h(new byte[]{-69, 31, 38, -32, 71, -89, -40, 76, -87, 44, 46, -19, 95, -116, -51, 79, -75, 44, 48, -22, 66, -89, -49, 79, -80, 16, 44}, new byte[]{-39, 115, 71, -125, 44, -8, -84, 35}), false));
        this.f938i.setOnCheckedChangeListener(new k0(29));
        final int i15 = 3;
        ((Switch) findViewById(R.id.switch16)).setOnCheckedChangeListener(new s0(i15, this));
        try {
            str = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "";
        }
        this.f934b.setText(getString(R.string.update_current_version, str));
        this.f934b.setOnClickListener(new View.OnClickListener(this) { // from class: e0.v2
            public final /* synthetic */ UpdateActivity c;

            {
                this.c = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r18) {
                /*
                    Method dump skipped, instructions count: 1664
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: e0.v2.onClick(android.view.View):void");
            }
        });
        final int i16 = 9;
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: e0.v2
            public final /* synthetic */ UpdateActivity c;

            {
                this.c = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r18) {
                /*
                    Method dump skipped, instructions count: 1664
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: e0.v2.onClick(android.view.View):void");
            }
        });
        final int i17 = 1;
        this.d.setOnClickListener(new View.OnClickListener(this) { // from class: e0.v2
            public final /* synthetic */ UpdateActivity c;

            {
                this.c = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r18) {
                /*
                    Method dump skipped, instructions count: 1664
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: e0.v2.onClick(android.view.View):void");
            }
        });
        final int i18 = 2;
        this.f935f.setOnClickListener(new View.OnClickListener(this) { // from class: e0.v2
            public final /* synthetic */ UpdateActivity c;

            {
                this.c = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r18) {
                /*
                    Method dump skipped, instructions count: 1664
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: e0.v2.onClick(android.view.View):void");
            }
        });
        this.f936g.setOnClickListener(new View.OnClickListener(this) { // from class: e0.v2
            public final /* synthetic */ UpdateActivity c;

            {
                this.c = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r18) {
                /*
                    Method dump skipped, instructions count: 1664
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: e0.v2.onClick(android.view.View):void");
            }
        });
        Button button2 = (Button) findViewById(R.id.DelAppButton);
        this.f937h = button2;
        final int i19 = 4;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: e0.v2
            public final /* synthetic */ UpdateActivity c;

            {
                this.c = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View r18) {
                /*
                    Method dump skipped, instructions count: 1664
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: e0.v2.onClick(android.view.View):void");
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f940k.removeCallbacksAndMessages(null);
        q.f2002f = true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Button button = this.f935f;
        if (button != null) {
            button.setEnabled(b.o().loadBoolean(m.h(new byte[]{14, -102, -56, -56, -105}, new byte[]{74, -54, -67, -72, -28, -127, 57, 42}), false));
        }
        q.f2002f = false;
    }

    public final void s(String str) {
        String str2 = f933l;
        try {
            Log.e(str2, str + m.h(new byte[]{-73, 31}, new byte[]{-115, 63, -19, ByteCompanionObject.MAX_VALUE, 46, 17, -90, 82}) + m.d(this, str2).a());
        } catch (Exception e) {
            Log.e(str2, str.concat(m.h(new byte[]{110, 11, 94, 20, 114, 22, -6, -8, 116, 95, 87, 85, 120, 22, -6, -3, 38, 11, 124, 16, 109, 19, -4, -7, 116, 100, 79, 27, 126, 8}, new byte[]{84, 43, 56, 117, 27, 122, -97, -100})), e);
        }
    }

    public final void t() {
        new y2(m.h(new byte[]{29, 67, -17, -18, -75, Base64.padSymbol, 44, 23, 68, 84, -7, -10, -1, Base64.padSymbol, 47, 2}, new byte[]{105, 38, -100, -102, -102, 92, 92, 103}), this);
    }
}
