package q0;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentTransaction;
import com.example.navistart.MockGPS.MockGpsService;
import com.example.navistart.R;
import e0.s0;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.m2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class l extends l0.b {
    public EditText d;
    public EditText e;

    /* renamed from: f, reason: collision with root package name */
    public RadioGroup f5200f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f5201g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f5202h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f5203i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f5204j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f5205k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f5206l;

    /* renamed from: m, reason: collision with root package name */
    public View f5207m;

    /* renamed from: n, reason: collision with root package name */
    public View f5208n;

    /* renamed from: o, reason: collision with root package name */
    public View f5209o;

    /* renamed from: p, reason: collision with root package name */
    public View f5210p;

    /* renamed from: q, reason: collision with root package name */
    public CheckBox f5211q;
    public TextView r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f5212s;

    /* renamed from: u, reason: collision with root package name */
    public String f5213u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5214v;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f5199b = new Handler(Looper.getMainLooper());
    public final com.bumptech.glide.m c = new com.bumptech.glide.m(26, this);
    public String t = e0.m.h(new byte[]{83, 63, 26, -58, 69, 11, -103, -73, 83}, new byte[]{35, 87, 117, -88, 32, 84, -8, -57});

    public static int v(String str) {
        if (e0.m.h(new byte[]{23, 88, -11, 4, -99, -17, 115, 35, 21, 90, -39, 50, -127, -7}, new byte[]{112, 40, -122, 91, -18, -118, 1, 85}).equals(str)) {
            return R.id.mockGpsSourceIosServer;
        }
        if (e0.m.h(new byte[]{-88, 122, 55}, new byte[]{-35, 9, 85, 119, 93, -99, 62, -113}).equals(str)) {
            return R.id.mockGpsSourceUsb;
        }
        if (e0.m.h(new byte[]{38, -76, 58, 78, 44}, new byte[]{75, -37, 94, 43, 65, -34, -13, -48}).equals(str)) {
            return R.id.mockGpsSourceModem;
        }
        return R.id.mockGpsSourcePhoneApp;
    }

    public static String w(String str) {
        if (e0.m.h(new byte[]{-55, 104, -111, -78, 50, -92, -85, -110, -55}, new byte[]{-71, 0, -2, -36, 87, -5, -54, -30}).equals(str)) {
            return e0.m.h(new byte[]{31, -62, -69, -38, -99, 21, -75, -54, 31}, new byte[]{111, -86, -44, -76, -8, 74, -44, -70});
        }
        if (e0.m.h(new byte[]{106, -33, 107, 4, 118, 120, -7, -81, 104, -35, 71, 50, 106, 110}, new byte[]{13, -81, 24, 91, 5, 29, -117, -39}).equals(str)) {
            return e0.m.h(new byte[]{46, 1, -96, 90, 50, -93, -25, -4, 44, 3, -116, 108, 46, -75}, new byte[]{73, 113, -45, 5, 65, -58, -107, -118});
        }
        if (e0.m.h(new byte[]{-46, 93, 16}, new byte[]{-89, 46, 114, -91, 81, 24, 48, -84}).equals(str)) {
            return e0.m.h(new byte[]{81, 94, 105}, new byte[]{36, 45, 11, 109, 94, -122, -30, 59});
        }
        if (e0.m.h(new byte[]{-14, -89, 43, -115, 46}, new byte[]{-97, -56, 79, -24, 67, -30, -86, 124}).equals(str)) {
            return e0.m.h(new byte[]{-17, 22, 50, 23, -46}, new byte[]{-126, 121, 86, 114, -65, 73, -102, 92});
        }
        return e0.m.h(new byte[]{-41, 87, ByteCompanionObject.MIN_VALUE, -30, -6, 58, 46, 12, -41}, new byte[]{-89, 63, -17, -116, -97, 101, 79, 124});
    }

    public static void y(int i10, View view) {
        View findViewById = view.findViewById(i10);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_mock_gps_test, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        this.f5199b.removeCallbacks(this.c);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.c.run();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        g d;
        super.onViewCreated(view, bundle);
        MockGpsService.b(requireContext());
        this.d = (EditText) view.findViewById(R.id.mockGpsHost);
        this.e = (EditText) view.findViewById(R.id.mockGpsPort);
        this.f5200f = (RadioGroup) view.findViewById(R.id.mockGpsSourceTabs);
        this.f5201g = (TextView) view.findViewById(R.id.mockGpsSourceDetails);
        this.f5202h = (TextView) view.findViewById(R.id.mockGpsServiceStatus);
        this.f5203i = (TextView) view.findViewById(R.id.mockGpsTargetStatus);
        this.f5204j = (TextView) view.findViewById(R.id.mockGpsConnectionStatus);
        this.f5205k = (TextView) view.findViewById(R.id.mockGpsSubstitutionStatus);
        this.f5206l = (TextView) view.findViewById(R.id.mockGpsPacketStatus);
        this.f5207m = view.findViewById(R.id.mockGpsConnectionIndicator);
        this.f5208n = view.findViewById(R.id.mockGpsSubstitutionIndicator);
        this.f5209o = view.findViewById(R.id.mockGpsTransportContainer);
        this.f5210p = view.findViewById(R.id.mockGpsIosAppBlock);
        this.f5211q = (CheckBox) view.findViewById(R.id.mockGpsAutoFallback);
        this.r = (TextView) view.findViewById(R.id.mockGpsSystemSatellites);
        this.f5212s = (TextView) view.findViewById(R.id.mockGpsSystemGnssAge);
        ImageView imageView = (ImageView) view.findViewById(R.id.mockGpsIosAppQr);
        Bitmap h2 = e3.d.h(360, getString(R.string.mock_gps_ios_app_url));
        if (h2 != null) {
            imageView.setImageBitmap(h2);
        }
        y(R.id.mockGpsSourcePhoneApp, view);
        y(R.id.mockGpsSourceIosServer, view);
        y(R.id.mockGpsSourceUsb, view);
        y(R.id.mockGpsSourceModem, view);
        final int i10 = 1;
        if (getChildFragmentManager().findFragmentByTag(e0.m.h(new byte[]{85, 40, 37, 73, -11, 51, 8, 48, 85, 5, 55, 66, -14, 55, 14, 44, 70, 41}, new byte[]{33, 90, 68, 39, -122, 67, 103, 66})) == null) {
            FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
            m2 m2Var = new m2();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean(m2.f3783m, true);
            m2Var.setArguments(bundle2);
            beginTransaction.replace(R.id.mockGpsTransportContainer, m2Var, e0.m.h(new byte[]{ByteCompanionObject.MIN_VALUE, 11, -83, 119, 68, 88, 57, -40, ByteCompanionObject.MIN_VALUE, 38, -65, 124, 67, 92, 63, -60, -109, 10}, new byte[]{-12, 121, -52, 25, 55, 40, 86, -86})).commit();
        }
        Context requireContext = requireContext();
        if (MockGpsService.t.get()) {
            d = new g(MockGpsService.w, MockGpsService.f821x, MockGpsService.f822y);
        } else {
            d = MockGpsService.d(requireContext);
        }
        String w = w(d.f5193b);
        this.t = w;
        this.f5200f.check(v(w));
        u(true);
        t(d);
        final int i11 = 0;
        this.f5200f.setOnCheckedChangeListener(new i(0, this));
        this.f5211q.setOnCheckedChangeListener(new s0(8, this));
        Button button = (Button) view.findViewById(R.id.mockGpsStartButton);
        Button button2 = (Button) view.findViewById(R.id.mockGpsStopButton);
        Button button3 = (Button) view.findViewById(R.id.mockGpsCloseButton);
        button.setOnClickListener(new View.OnClickListener(this) { // from class: q0.j
            public final /* synthetic */ l c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        l lVar = this.c;
                        Context requireContext2 = lVar.requireContext();
                        String str = lVar.t;
                        String obj = lVar.d.getText().toString();
                        int x9 = lVar.x();
                        lVar.f5211q.isChecked();
                        MockGpsService.n(requireContext2, x9, str, obj);
                        lVar.z();
                        return;
                    case 1:
                        l lVar2 = this.c;
                        Context requireContext3 = lVar2.requireContext();
                        MockGpsService.b(requireContext3);
                        requireContext3.stopService(new Intent(requireContext3, (Class<?>) MockGpsService.class));
                        lVar2.z();
                        return;
                    default:
                        l lVar3 = this.c;
                        if (lVar3.getParentFragment() instanceof l0.a) {
                            ((l0.a) lVar3.getParentFragment()).dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: q0.j
            public final /* synthetic */ l c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        l lVar = this.c;
                        Context requireContext2 = lVar.requireContext();
                        String str = lVar.t;
                        String obj = lVar.d.getText().toString();
                        int x9 = lVar.x();
                        lVar.f5211q.isChecked();
                        MockGpsService.n(requireContext2, x9, str, obj);
                        lVar.z();
                        return;
                    case 1:
                        l lVar2 = this.c;
                        Context requireContext3 = lVar2.requireContext();
                        MockGpsService.b(requireContext3);
                        requireContext3.stopService(new Intent(requireContext3, (Class<?>) MockGpsService.class));
                        lVar2.z();
                        return;
                    default:
                        l lVar3 = this.c;
                        if (lVar3.getParentFragment() instanceof l0.a) {
                            ((l0.a) lVar3.getParentFragment()).dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        final int i12 = 2;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: q0.j
            public final /* synthetic */ l c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        l lVar = this.c;
                        Context requireContext2 = lVar.requireContext();
                        String str = lVar.t;
                        String obj = lVar.d.getText().toString();
                        int x9 = lVar.x();
                        lVar.f5211q.isChecked();
                        MockGpsService.n(requireContext2, x9, str, obj);
                        lVar.z();
                        return;
                    case 1:
                        l lVar2 = this.c;
                        Context requireContext3 = lVar2.requireContext();
                        MockGpsService.b(requireContext3);
                        requireContext3.stopService(new Intent(requireContext3, (Class<?>) MockGpsService.class));
                        lVar2.z();
                        return;
                    default:
                        l lVar3 = this.c;
                        if (lVar3.getParentFragment() instanceof l0.a) {
                            ((l0.a) lVar3.getParentFragment()).dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        z();
    }

    public final void t(g gVar) {
        String str;
        int i10 = gVar.d;
        String str2 = gVar.c;
        StringBuilder sb = new StringBuilder();
        sb.append(gVar.f5193b);
        sb.append(e0.m.h(new byte[]{-115}, new byte[]{-15, -7, 72, -89, 102, 113, 18, -10}));
        if (str2 == null) {
            str = "";
        } else {
            str = str2;
        }
        sb.append(str);
        com.google.protobuf.q.t(new byte[]{89}, new byte[]{37, 81, -91, -33, -74, -57, -89, -51}, sb, i10);
        sb.append(e0.m.h(new byte[]{117}, new byte[]{9, 69, -107, 119, -76, 101, 69, -99}));
        sb.append(false);
        String sb2 = sb.toString();
        if (sb2.equals(this.f5213u)) {
            return;
        }
        EditText editText = this.d;
        if (str2 == null) {
            str2 = "";
        }
        editText.setText(str2);
        this.e.setText(String.valueOf(i10));
        this.f5214v = true;
        this.f5211q.setChecked(false);
        this.f5214v = false;
        this.f5213u = sb2;
    }

    public final void u(boolean z9) {
        k kVar;
        int i10;
        int i11;
        int i12;
        String str = this.t;
        int i13 = 8;
        if (e0.m.h(new byte[]{49, 75, 95, -57, -50, 10, 79, -10, 51, 73, 115, -15, -46, 28}, new byte[]{86, 59, 44, -104, -67, 111, Base64.padSymbol, ByteCompanionObject.MIN_VALUE}).equals(str)) {
            kVar = new k(8887, getString(R.string.mock_gps_ios_details), getString(R.string.mock_gps_hint_ios_ip), getString(R.string.mock_gps_hint_ios_port), true);
        } else if (e0.m.h(new byte[]{123, -86, 49}, new byte[]{14, -39, 83, -80, 64, -115, 53, 120}).equals(str)) {
            kVar = new k(460800, getString(R.string.mock_gps_usb_details), getString(R.string.mock_gps_hint_usb_device_auto), getString(R.string.mock_gps_hint_usb_speed), false);
        } else if (e0.m.h(new byte[]{26, 49, 3, -7, -102}, new byte[]{119, 94, 103, -100, -9, -67, -6, -11}).equals(str)) {
            kVar = new k(11010, getString(R.string.mock_gps_modem_details), getString(R.string.mock_gps_hint_modem_ip), getString(R.string.mock_gps_hint_modem_port), true);
        } else {
            kVar = new k(8887, getString(R.string.mock_gps_phone_details), getString(R.string.mock_gps_hint_access_point_ip), getString(R.string.mock_gps_hint_phone_port), true);
        }
        this.f5201g.setText(kVar.f5197a);
        this.d.setHint(kVar.f5198b);
        this.d.setEnabled(kVar.e);
        this.e.setHint(kVar.c);
        String trim = this.e.getText().toString().trim();
        if (!z9) {
            this.d.setText("");
        }
        if (!z9 || trim.isEmpty()) {
            this.e.setText(String.valueOf(kVar.d));
        }
        boolean equals = e0.m.h(new byte[]{12, -100, 66, -12, -94, 40, 30, -88, 12}, new byte[]{124, -12, 45, -102, -57, 119, ByteCompanionObject.MAX_VALUE, -40}).equals(this.t);
        View view = this.f5209o;
        if (equals) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view.setVisibility(i10);
        View view2 = this.f5210p;
        if (e0.m.h(new byte[]{-60, -93, -73, 71, -44, 104, -72, -77, -58, -95, -101, 113, -56, 126}, new byte[]{-93, -45, -60, 24, -89, 13, -54, -59}).equals(this.t)) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view2.setVisibility(i11);
        this.f5211q.setVisibility(8);
        this.r.setVisibility(8);
        this.f5212s.setVisibility(8);
        EditText editText = this.d;
        if (equals) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        editText.setVisibility(i12);
        EditText editText2 = this.e;
        if (!equals) {
            i13 = 0;
        }
        editText2.setVisibility(i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r3 <= 65535) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int x() {
        /*
            r6 = this;
            r0 = 3
            r1 = 5
            r2 = 8
            android.widget.EditText r3 = r6.e     // Catch: java.lang.NumberFormatException -> L5b
            android.text.Editable r3 = r3.getText()     // Catch: java.lang.NumberFormatException -> L5b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.NumberFormatException -> L5b
            java.lang.String r3 = r3.trim()     // Catch: java.lang.NumberFormatException -> L5b
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L5b
            byte[] r4 = new byte[r0]     // Catch: java.lang.NumberFormatException -> L5b
            r4 = {x00a6: FILL_ARRAY_DATA , data: [21, -114, -119} // fill-array     // Catch: java.lang.NumberFormatException -> L5b
            byte[] r5 = new byte[r2]     // Catch: java.lang.NumberFormatException -> L5b
            r5 = {x00ac: FILL_ARRAY_DATA , data: [96, -3, -21, -18, -43, -40, 125, 127} // fill-array     // Catch: java.lang.NumberFormatException -> L5b
            java.lang.String r4 = e0.m.h(r4, r5)     // Catch: java.lang.NumberFormatException -> L5b
            java.lang.String r5 = r6.t     // Catch: java.lang.NumberFormatException -> L5b
            boolean r4 = r4.equals(r5)     // Catch: java.lang.NumberFormatException -> L5b
            if (r4 == 0) goto L36
            r0 = 1200(0x4b0, float:1.682E-42)
            if (r3 < r0) goto L71
            r0 = 921600(0xe1000, float:1.291437E-39)
            if (r3 > r0) goto L71
            goto L5a
        L36:
            byte[] r4 = new byte[r1]     // Catch: java.lang.NumberFormatException -> L5b
            r4 = {x00b4: FILL_ARRAY_DATA , data: [5, -72, -31, -115, 92} // fill-array     // Catch: java.lang.NumberFormatException -> L5b
            byte[] r5 = new byte[r2]     // Catch: java.lang.NumberFormatException -> L5b
            r5 = {x00bc: FILL_ARRAY_DATA , data: [104, -41, -123, -24, 49, 29, 33, -69} // fill-array     // Catch: java.lang.NumberFormatException -> L5b
            java.lang.String r4 = e0.m.h(r4, r5)     // Catch: java.lang.NumberFormatException -> L5b
            java.lang.String r5 = r6.t     // Catch: java.lang.NumberFormatException -> L5b
            boolean r4 = r4.equals(r5)     // Catch: java.lang.NumberFormatException -> L5b
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r4 == 0) goto L56
            r0 = 1024(0x400, float:1.435E-42)
            if (r3 < r0) goto L8b
            if (r3 > r5) goto L8b
            goto L5a
        L56:
            if (r3 <= 0) goto L5b
            if (r3 > r5) goto L5b
        L5a:
            return r3
        L5b:
            byte[] r0 = new byte[r0]
            r0 = {x00c4: FILL_ARRAY_DATA , data: [-82, 16, 49} // fill-array
            byte[] r3 = new byte[r2]
            r3 = {x00ca: FILL_ARRAY_DATA , data: [-37, 99, 83, -69, 19, -29, -64, -127} // fill-array
            java.lang.String r0 = e0.m.h(r0, r3)
            java.lang.String r3 = r6.t
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L75
        L71:
            r0 = 460800(0x70800, float:6.45718E-40)
            return r0
        L75:
            byte[] r0 = new byte[r1]
            r0 = {x00d2: FILL_ARRAY_DATA , data: [84, 72, 13, 26, 11} // fill-array
            byte[] r1 = new byte[r2]
            r1 = {x00da: FILL_ARRAY_DATA , data: [57, 39, 105, 127, 102, -32, 76, 112} // fill-array
            java.lang.String r0 = e0.m.h(r0, r1)
            java.lang.String r1 = r6.t
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8e
        L8b:
            r0 = 11010(0x2b02, float:1.5428E-41)
            return r0
        L8e:
            r0 = 14
            byte[] r0 = new byte[r0]
            r0 = {x00e2: FILL_ARRAY_DATA , data: [5, 112, 68, -108, -82, 14, 47, 113, 7, 114, 104, -94, -78, 24} // fill-array
            byte[] r1 = new byte[r2]
            r1 = {x00ee: FILL_ARRAY_DATA , data: [98, 0, 55, -53, -35, 107, 93, 7} // fill-array
            java.lang.String r0 = e0.m.h(r0, r1)
            java.lang.String r1 = r6.t
            r0.equals(r1)
            r0 = 8887(0x22b7, float:1.2453E-41)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.l.x():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00af, code lost:
    
        if (r2.isEmpty() == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z() {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.l.z():void");
    }
}
