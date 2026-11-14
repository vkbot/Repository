package m0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.example.navistart.R;
import com.example.navistart.Transport.TransportService;
import com.google.android.material.materialswitch.MaterialSwitch;
import e0.s3;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m2 extends l0.b {

    /* renamed from: m, reason: collision with root package name */
    public static final String f3783m = e0.m.h(new byte[]{-27, 45, -88, 73, -118, -89, -108, 71}, new byte[]{ByteCompanionObject.MIN_VALUE, 64, -54, 44, -18, -61, -15, 35});

    /* renamed from: b, reason: collision with root package name */
    public final SecureRandom f3784b = new SecureRandom();
    public final Handler c = new Handler(Looper.getMainLooper());
    public final com.bumptech.glide.m d = new com.bumptech.glide.m(8, this);
    public MaterialSwitch e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f3785f;

    /* renamed from: g, reason: collision with root package name */
    public Spinner f3786g;

    /* renamed from: h, reason: collision with root package name */
    public EditText f3787h;

    /* renamed from: i, reason: collision with root package name */
    public View f3788i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f3789j;

    /* renamed from: k, reason: collision with root package name */
    public Button f3790k;

    /* renamed from: l, reason: collision with root package name */
    public Button f3791l;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z9;
        int i10;
        int i11;
        int i12;
        final int i13 = 1;
        final int i14 = 0;
        if (getArguments() != null && getArguments().getBoolean(f3783m, false)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i10 = R.layout.fragment_transport_settings_content;
        } else {
            i10 = R.layout.fragment_transport_settings;
        }
        View inflate = layoutInflater.inflate(i10, viewGroup, false);
        this.e = (MaterialSwitch) inflate.findViewById(R.id.transportAutomaticWifi);
        this.f3785f = (EditText) inflate.findViewById(R.id.transportHost);
        this.f3786g = (Spinner) inflate.findViewById(R.id.transportBluetoothDevice);
        this.f3787h = (EditText) inflate.findViewById(R.id.transportToken);
        this.f3788i = inflate.findViewById(R.id.transportStatusIndicator);
        this.f3789j = (TextView) inflate.findViewById(R.id.transportStatusText);
        this.f3787h.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        View findViewById = inflate.findViewById(R.id.transportBack);
        if (z9) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        findViewById.setVisibility(i11);
        findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: m0.l2
            public final /* synthetic */ m2 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                s3 s3Var;
                switch (i14) {
                    case 0:
                        m2 m2Var = this.c;
                        String str2 = m2.f3783m;
                        if (m2Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) m2Var.getParentFragment()).dismiss();
                            return;
                        } else {
                            if (m2Var.getActivity() != null) {
                                m2Var.getActivity().onBackPressed();
                                return;
                            }
                            return;
                        }
                    case 1:
                        m2 m2Var2 = this.c;
                        String str3 = m2.f3783m;
                        y0.g.d(m2Var2.requireContext());
                        m2Var2.t();
                        y5.k.w(R.string.transport_started, m2Var2.requireContext());
                        return;
                    case 2:
                        m2 m2Var3 = this.c;
                        String str4 = m2.f3783m;
                        Context requireContext = m2Var3.requireContext();
                        CopyOnWriteArrayList copyOnWriteArrayList = y0.g.f6591a;
                        requireContext.getApplicationContext().stopService(new Intent(requireContext.getApplicationContext(), (Class<?>) TransportService.class));
                        m2Var3.t();
                        y5.k.w(R.string.transport_stopped, m2Var3.requireContext());
                        return;
                    case 3:
                        m2 m2Var4 = this.c;
                        m2Var4.f3787h.setText(String.format(Locale.US, e0.m.h(new byte[]{-124, 16, 105, 58}, new byte[]{-95, 32, 80, 94, 17, -107, 36, 25}), Integer.valueOf(m2Var4.f3784b.nextInt(1000000000))));
                        return;
                    default:
                        m2 m2Var5 = this.c;
                        String trim = m2Var5.f3785f.getText().toString().trim();
                        String trim2 = m2Var5.f3787h.getText().toString().trim();
                        if (!m2Var5.e.isChecked() && (trim.isEmpty() || !Patterns.IP_ADDRESS.matcher(trim).matches())) {
                            m2Var5.f3785f.setError(m2Var5.getString(R.string.transport_invalid_ip));
                            return;
                        }
                        if (!y0.m.b(trim2)) {
                            m2Var5.f3787h.setError(m2Var5.getString(R.string.transport_invalid_token));
                            return;
                        }
                        if (m2Var5.f3786g.getSelectedItemPosition() > 0) {
                            str = String.valueOf(m2Var5.f3786g.getSelectedItem());
                        } else {
                            str = "";
                        }
                        Context requireContext2 = m2Var5.requireContext();
                        boolean isChecked = m2Var5.e.isChecked();
                        if (!y0.m.d(trim2).isEmpty() && !y0.m.b(trim2)) {
                            j1.i.k(e0.m.h(new byte[]{-33, -69, 1, -68, -4, 126, 77, 16, -1, -23, 20, -67, -28, 107, 76, 66, -26, -68, 19, -90, -81, 109, 77, 12, -1, -88, 9, -68, -81, 107, 90, 3, -24, -67, 12, -85, -81, 55, 2, 6, -30, -82, 9, -90, -4}, new byte[]{-117, -55, 96, -46, -113, 14, 34, 98}));
                            return;
                        }
                        y0.m.c(requireContext2).edit().putBoolean(y0.m.f6606b, isChecked).putString(y0.m.c, y0.m.d(trim)).putInt(y0.m.d, 8897).putString(y0.m.e, str.trim()).putString(y0.m.f6607f, y0.m.d(trim2)).apply();
                        y0.n.f6609a.set(false);
                        TransportService transportService = TransportService.f921z;
                        if (transportService != null && (s3Var = transportService.f929l) != null) {
                            s3Var.e();
                        }
                        y5.k.w(R.string.transport_settings_saved, m2Var5.requireContext());
                        return;
                }
            }
        });
        ImageView imageView = (ImageView) inflate.findViewById(R.id.transportPhoneAppQr);
        Bitmap h2 = e3.d.h(360, getString(R.string.mock_gps_phone_app_url));
        if (h2 != null) {
            imageView.setImageBitmap(h2);
        }
        this.e.setChecked(y0.m.c(requireContext()).getBoolean(y0.m.f6606b, true));
        this.f3785f.setText(y0.m.d(y0.m.c(requireContext()).getString(y0.m.c, "")));
        this.f3787h.setText(y0.m.a(requireContext()));
        this.e.setOnCheckedChangeListener(new e0.s0(6, this));
        boolean isChecked = this.e.isChecked();
        EditText editText = this.f3785f;
        if (!isChecked) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        editText.setVisibility(i12);
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(R.string.transport_device_not_selected));
        String d = y0.m.d(y0.m.c(requireContext()).getString(y0.m.e, ""));
        if (!d.trim().isEmpty()) {
            arrayList.add(d.trim());
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && (Build.VERSION.SDK_INT < 31 || requireContext().checkSelfPermission(e0.m.h(new byte[]{66, 111, 25, -18, -51, 116, 105, 109, 83, 100, 15, -15, -53, 110, 126, 42, 76, 111, 83, -34, -18, 72, 72, 23, 108, 78, 41, -44, -3, 94, 66, 13, 109, 68, 62, -56}, new byte[]{35, 1, 125, -100, -94, 29, 13, 67})) == 0)) {
            try {
                Iterator<BluetoothDevice> it = defaultAdapter.getBondedDevices().iterator();
                while (it.hasNext()) {
                    String name = it.next().getName();
                    if (name != null && !name.trim().isEmpty() && !arrayList.contains(name.trim())) {
                        arrayList.add(name.trim());
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        final int i15 = 2;
        if (arrayList.size() > 2) {
            Collections.sort(arrayList.subList(1, arrayList.size()), String.CASE_INSENSITIVE_ORDER);
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), R.layout.spinner_text, arrayList);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown);
        this.f3786g.setAdapter((SpinnerAdapter) arrayAdapter);
        this.f3786g.setSelection(Math.max(arrayList.indexOf(d), 0));
        this.f3790k = (Button) inflate.findViewById(R.id.transportStart);
        this.f3791l = (Button) inflate.findViewById(R.id.transportStop);
        t();
        this.f3790k.setOnClickListener(new View.OnClickListener(this) { // from class: m0.l2
            public final /* synthetic */ m2 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                s3 s3Var;
                switch (i13) {
                    case 0:
                        m2 m2Var = this.c;
                        String str2 = m2.f3783m;
                        if (m2Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) m2Var.getParentFragment()).dismiss();
                            return;
                        } else {
                            if (m2Var.getActivity() != null) {
                                m2Var.getActivity().onBackPressed();
                                return;
                            }
                            return;
                        }
                    case 1:
                        m2 m2Var2 = this.c;
                        String str3 = m2.f3783m;
                        y0.g.d(m2Var2.requireContext());
                        m2Var2.t();
                        y5.k.w(R.string.transport_started, m2Var2.requireContext());
                        return;
                    case 2:
                        m2 m2Var3 = this.c;
                        String str4 = m2.f3783m;
                        Context requireContext = m2Var3.requireContext();
                        CopyOnWriteArrayList copyOnWriteArrayList = y0.g.f6591a;
                        requireContext.getApplicationContext().stopService(new Intent(requireContext.getApplicationContext(), (Class<?>) TransportService.class));
                        m2Var3.t();
                        y5.k.w(R.string.transport_stopped, m2Var3.requireContext());
                        return;
                    case 3:
                        m2 m2Var4 = this.c;
                        m2Var4.f3787h.setText(String.format(Locale.US, e0.m.h(new byte[]{-124, 16, 105, 58}, new byte[]{-95, 32, 80, 94, 17, -107, 36, 25}), Integer.valueOf(m2Var4.f3784b.nextInt(1000000000))));
                        return;
                    default:
                        m2 m2Var5 = this.c;
                        String trim = m2Var5.f3785f.getText().toString().trim();
                        String trim2 = m2Var5.f3787h.getText().toString().trim();
                        if (!m2Var5.e.isChecked() && (trim.isEmpty() || !Patterns.IP_ADDRESS.matcher(trim).matches())) {
                            m2Var5.f3785f.setError(m2Var5.getString(R.string.transport_invalid_ip));
                            return;
                        }
                        if (!y0.m.b(trim2)) {
                            m2Var5.f3787h.setError(m2Var5.getString(R.string.transport_invalid_token));
                            return;
                        }
                        if (m2Var5.f3786g.getSelectedItemPosition() > 0) {
                            str = String.valueOf(m2Var5.f3786g.getSelectedItem());
                        } else {
                            str = "";
                        }
                        Context requireContext2 = m2Var5.requireContext();
                        boolean isChecked2 = m2Var5.e.isChecked();
                        if (!y0.m.d(trim2).isEmpty() && !y0.m.b(trim2)) {
                            j1.i.k(e0.m.h(new byte[]{-33, -69, 1, -68, -4, 126, 77, 16, -1, -23, 20, -67, -28, 107, 76, 66, -26, -68, 19, -90, -81, 109, 77, 12, -1, -88, 9, -68, -81, 107, 90, 3, -24, -67, 12, -85, -81, 55, 2, 6, -30, -82, 9, -90, -4}, new byte[]{-117, -55, 96, -46, -113, 14, 34, 98}));
                            return;
                        }
                        y0.m.c(requireContext2).edit().putBoolean(y0.m.f6606b, isChecked2).putString(y0.m.c, y0.m.d(trim)).putInt(y0.m.d, 8897).putString(y0.m.e, str.trim()).putString(y0.m.f6607f, y0.m.d(trim2)).apply();
                        y0.n.f6609a.set(false);
                        TransportService transportService = TransportService.f921z;
                        if (transportService != null && (s3Var = transportService.f929l) != null) {
                            s3Var.e();
                        }
                        y5.k.w(R.string.transport_settings_saved, m2Var5.requireContext());
                        return;
                }
            }
        });
        this.f3791l.setOnClickListener(new View.OnClickListener(this) { // from class: m0.l2
            public final /* synthetic */ m2 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                s3 s3Var;
                switch (i15) {
                    case 0:
                        m2 m2Var = this.c;
                        String str2 = m2.f3783m;
                        if (m2Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) m2Var.getParentFragment()).dismiss();
                            return;
                        } else {
                            if (m2Var.getActivity() != null) {
                                m2Var.getActivity().onBackPressed();
                                return;
                            }
                            return;
                        }
                    case 1:
                        m2 m2Var2 = this.c;
                        String str3 = m2.f3783m;
                        y0.g.d(m2Var2.requireContext());
                        m2Var2.t();
                        y5.k.w(R.string.transport_started, m2Var2.requireContext());
                        return;
                    case 2:
                        m2 m2Var3 = this.c;
                        String str4 = m2.f3783m;
                        Context requireContext = m2Var3.requireContext();
                        CopyOnWriteArrayList copyOnWriteArrayList = y0.g.f6591a;
                        requireContext.getApplicationContext().stopService(new Intent(requireContext.getApplicationContext(), (Class<?>) TransportService.class));
                        m2Var3.t();
                        y5.k.w(R.string.transport_stopped, m2Var3.requireContext());
                        return;
                    case 3:
                        m2 m2Var4 = this.c;
                        m2Var4.f3787h.setText(String.format(Locale.US, e0.m.h(new byte[]{-124, 16, 105, 58}, new byte[]{-95, 32, 80, 94, 17, -107, 36, 25}), Integer.valueOf(m2Var4.f3784b.nextInt(1000000000))));
                        return;
                    default:
                        m2 m2Var5 = this.c;
                        String trim = m2Var5.f3785f.getText().toString().trim();
                        String trim2 = m2Var5.f3787h.getText().toString().trim();
                        if (!m2Var5.e.isChecked() && (trim.isEmpty() || !Patterns.IP_ADDRESS.matcher(trim).matches())) {
                            m2Var5.f3785f.setError(m2Var5.getString(R.string.transport_invalid_ip));
                            return;
                        }
                        if (!y0.m.b(trim2)) {
                            m2Var5.f3787h.setError(m2Var5.getString(R.string.transport_invalid_token));
                            return;
                        }
                        if (m2Var5.f3786g.getSelectedItemPosition() > 0) {
                            str = String.valueOf(m2Var5.f3786g.getSelectedItem());
                        } else {
                            str = "";
                        }
                        Context requireContext2 = m2Var5.requireContext();
                        boolean isChecked2 = m2Var5.e.isChecked();
                        if (!y0.m.d(trim2).isEmpty() && !y0.m.b(trim2)) {
                            j1.i.k(e0.m.h(new byte[]{-33, -69, 1, -68, -4, 126, 77, 16, -1, -23, 20, -67, -28, 107, 76, 66, -26, -68, 19, -90, -81, 109, 77, 12, -1, -88, 9, -68, -81, 107, 90, 3, -24, -67, 12, -85, -81, 55, 2, 6, -30, -82, 9, -90, -4}, new byte[]{-117, -55, 96, -46, -113, 14, 34, 98}));
                            return;
                        }
                        y0.m.c(requireContext2).edit().putBoolean(y0.m.f6606b, isChecked2).putString(y0.m.c, y0.m.d(trim)).putInt(y0.m.d, 8897).putString(y0.m.e, str.trim()).putString(y0.m.f6607f, y0.m.d(trim2)).apply();
                        y0.n.f6609a.set(false);
                        TransportService transportService = TransportService.f921z;
                        if (transportService != null && (s3Var = transportService.f929l) != null) {
                            s3Var.e();
                        }
                        y5.k.w(R.string.transport_settings_saved, m2Var5.requireContext());
                        return;
                }
            }
        });
        final int i16 = 3;
        inflate.findViewById(R.id.transportGenerateToken).setOnClickListener(new View.OnClickListener(this) { // from class: m0.l2
            public final /* synthetic */ m2 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                s3 s3Var;
                switch (i16) {
                    case 0:
                        m2 m2Var = this.c;
                        String str2 = m2.f3783m;
                        if (m2Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) m2Var.getParentFragment()).dismiss();
                            return;
                        } else {
                            if (m2Var.getActivity() != null) {
                                m2Var.getActivity().onBackPressed();
                                return;
                            }
                            return;
                        }
                    case 1:
                        m2 m2Var2 = this.c;
                        String str3 = m2.f3783m;
                        y0.g.d(m2Var2.requireContext());
                        m2Var2.t();
                        y5.k.w(R.string.transport_started, m2Var2.requireContext());
                        return;
                    case 2:
                        m2 m2Var3 = this.c;
                        String str4 = m2.f3783m;
                        Context requireContext = m2Var3.requireContext();
                        CopyOnWriteArrayList copyOnWriteArrayList = y0.g.f6591a;
                        requireContext.getApplicationContext().stopService(new Intent(requireContext.getApplicationContext(), (Class<?>) TransportService.class));
                        m2Var3.t();
                        y5.k.w(R.string.transport_stopped, m2Var3.requireContext());
                        return;
                    case 3:
                        m2 m2Var4 = this.c;
                        m2Var4.f3787h.setText(String.format(Locale.US, e0.m.h(new byte[]{-124, 16, 105, 58}, new byte[]{-95, 32, 80, 94, 17, -107, 36, 25}), Integer.valueOf(m2Var4.f3784b.nextInt(1000000000))));
                        return;
                    default:
                        m2 m2Var5 = this.c;
                        String trim = m2Var5.f3785f.getText().toString().trim();
                        String trim2 = m2Var5.f3787h.getText().toString().trim();
                        if (!m2Var5.e.isChecked() && (trim.isEmpty() || !Patterns.IP_ADDRESS.matcher(trim).matches())) {
                            m2Var5.f3785f.setError(m2Var5.getString(R.string.transport_invalid_ip));
                            return;
                        }
                        if (!y0.m.b(trim2)) {
                            m2Var5.f3787h.setError(m2Var5.getString(R.string.transport_invalid_token));
                            return;
                        }
                        if (m2Var5.f3786g.getSelectedItemPosition() > 0) {
                            str = String.valueOf(m2Var5.f3786g.getSelectedItem());
                        } else {
                            str = "";
                        }
                        Context requireContext2 = m2Var5.requireContext();
                        boolean isChecked2 = m2Var5.e.isChecked();
                        if (!y0.m.d(trim2).isEmpty() && !y0.m.b(trim2)) {
                            j1.i.k(e0.m.h(new byte[]{-33, -69, 1, -68, -4, 126, 77, 16, -1, -23, 20, -67, -28, 107, 76, 66, -26, -68, 19, -90, -81, 109, 77, 12, -1, -88, 9, -68, -81, 107, 90, 3, -24, -67, 12, -85, -81, 55, 2, 6, -30, -82, 9, -90, -4}, new byte[]{-117, -55, 96, -46, -113, 14, 34, 98}));
                            return;
                        }
                        y0.m.c(requireContext2).edit().putBoolean(y0.m.f6606b, isChecked2).putString(y0.m.c, y0.m.d(trim)).putInt(y0.m.d, 8897).putString(y0.m.e, str.trim()).putString(y0.m.f6607f, y0.m.d(trim2)).apply();
                        y0.n.f6609a.set(false);
                        TransportService transportService = TransportService.f921z;
                        if (transportService != null && (s3Var = transportService.f929l) != null) {
                            s3Var.e();
                        }
                        y5.k.w(R.string.transport_settings_saved, m2Var5.requireContext());
                        return;
                }
            }
        });
        final int i17 = 4;
        inflate.findViewById(R.id.transportSave).setOnClickListener(new View.OnClickListener(this) { // from class: m0.l2
            public final /* synthetic */ m2 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                s3 s3Var;
                switch (i17) {
                    case 0:
                        m2 m2Var = this.c;
                        String str2 = m2.f3783m;
                        if (m2Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) m2Var.getParentFragment()).dismiss();
                            return;
                        } else {
                            if (m2Var.getActivity() != null) {
                                m2Var.getActivity().onBackPressed();
                                return;
                            }
                            return;
                        }
                    case 1:
                        m2 m2Var2 = this.c;
                        String str3 = m2.f3783m;
                        y0.g.d(m2Var2.requireContext());
                        m2Var2.t();
                        y5.k.w(R.string.transport_started, m2Var2.requireContext());
                        return;
                    case 2:
                        m2 m2Var3 = this.c;
                        String str4 = m2.f3783m;
                        Context requireContext = m2Var3.requireContext();
                        CopyOnWriteArrayList copyOnWriteArrayList = y0.g.f6591a;
                        requireContext.getApplicationContext().stopService(new Intent(requireContext.getApplicationContext(), (Class<?>) TransportService.class));
                        m2Var3.t();
                        y5.k.w(R.string.transport_stopped, m2Var3.requireContext());
                        return;
                    case 3:
                        m2 m2Var4 = this.c;
                        m2Var4.f3787h.setText(String.format(Locale.US, e0.m.h(new byte[]{-124, 16, 105, 58}, new byte[]{-95, 32, 80, 94, 17, -107, 36, 25}), Integer.valueOf(m2Var4.f3784b.nextInt(1000000000))));
                        return;
                    default:
                        m2 m2Var5 = this.c;
                        String trim = m2Var5.f3785f.getText().toString().trim();
                        String trim2 = m2Var5.f3787h.getText().toString().trim();
                        if (!m2Var5.e.isChecked() && (trim.isEmpty() || !Patterns.IP_ADDRESS.matcher(trim).matches())) {
                            m2Var5.f3785f.setError(m2Var5.getString(R.string.transport_invalid_ip));
                            return;
                        }
                        if (!y0.m.b(trim2)) {
                            m2Var5.f3787h.setError(m2Var5.getString(R.string.transport_invalid_token));
                            return;
                        }
                        if (m2Var5.f3786g.getSelectedItemPosition() > 0) {
                            str = String.valueOf(m2Var5.f3786g.getSelectedItem());
                        } else {
                            str = "";
                        }
                        Context requireContext2 = m2Var5.requireContext();
                        boolean isChecked2 = m2Var5.e.isChecked();
                        if (!y0.m.d(trim2).isEmpty() && !y0.m.b(trim2)) {
                            j1.i.k(e0.m.h(new byte[]{-33, -69, 1, -68, -4, 126, 77, 16, -1, -23, 20, -67, -28, 107, 76, 66, -26, -68, 19, -90, -81, 109, 77, 12, -1, -88, 9, -68, -81, 107, 90, 3, -24, -67, 12, -85, -81, 55, 2, 6, -30, -82, 9, -90, -4}, new byte[]{-117, -55, 96, -46, -113, 14, 34, 98}));
                            return;
                        }
                        y0.m.c(requireContext2).edit().putBoolean(y0.m.f6606b, isChecked2).putString(y0.m.c, y0.m.d(trim)).putInt(y0.m.d, 8897).putString(y0.m.e, str.trim()).putString(y0.m.f6607f, y0.m.d(trim2)).apply();
                        y0.n.f6609a.set(false);
                        TransportService transportService = TransportService.f921z;
                        if (transportService != null && (s3Var = transportService.f929l) != null) {
                            s3Var.e();
                        }
                        y5.k.w(R.string.transport_settings_saved, m2Var5.requireContext());
                        return;
                }
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        this.c.removeCallbacks(this.d);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.d.run();
    }

    public final void t() {
        if (this.f3789j != null && this.f3788i != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = y0.g.f6591a;
            boolean z9 = TransportService.w.get();
            if (TransportService.f919x.get()) {
                this.f3789j.setText(getString(R.string.transport_connected_via, TransportService.f920y));
                this.f3788i.setBackgroundResource(R.drawable.mock_gps_status_online);
            } else {
                TextView textView = this.f3789j;
                if (z9) {
                    textView.setText(R.string.transport_waiting_for_phone);
                    this.f3788i.setBackgroundResource(R.drawable.mock_gps_status_waiting);
                } else {
                    textView.setText(R.string.transport_not_started);
                    this.f3788i.setBackgroundResource(R.drawable.mock_gps_status_offline);
                }
            }
            this.f3790k.setEnabled(!z9);
            this.f3791l.setEnabled(z9);
        }
    }
}
