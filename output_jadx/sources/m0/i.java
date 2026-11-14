package m0;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.example.navistart.DPups;
import com.example.navistart.R;
import e0.p3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class i extends l0.b {

    /* renamed from: b, reason: collision with root package name */
    public Spinner f3726b;
    public Button c;
    public TextView d;
    public GradientDrawable e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3727f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final Handler f3728g = new Handler(Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    public boolean f3729h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3730i;

    /* renamed from: j, reason: collision with root package name */
    public volatile int f3731j;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ApplicationInfo applicationInfo;
        String charSequence;
        final int i10 = 0;
        View inflate = layoutInflater.inflate(R.layout.fragment_app_permission_grant, viewGroup, false);
        final int i11 = 1;
        this.f3731j++;
        Button button = (Button) inflate.findViewById(R.id.permissionGrantBackButton);
        this.f3726b = (Spinner) inflate.findViewById(R.id.permissionGrantAppSpinner);
        this.c = (Button) inflate.findViewById(R.id.permissionGrantButton);
        this.d = (TextView) inflate.findViewById(R.id.permissionGrantStatus);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.e = gradientDrawable;
        gradientDrawable.setShape(1);
        this.e.setStroke(Math.max(1, Math.round(getResources().getDisplayMetrics().density)), 1728053247);
        inflate.findViewById(R.id.permissionGrantAccessIndicator).setBackground(this.e);
        button.setOnClickListener(new View.OnClickListener(this) { // from class: m0.a
            public final /* synthetic */ i c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String message;
                Boolean bool;
                boolean z9;
                switch (i10) {
                    case 0:
                        i iVar = this.c;
                        if (iVar.getParentFragment() instanceof l0.a) {
                            ((l0.a) iVar.getParentFragment()).dismiss();
                            return;
                        }
                        FragmentActivity activity = iVar.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    default:
                        i iVar2 = this.c;
                        if (!iVar2.f3730i) {
                            if (iVar2.f3729h) {
                                h hVar = (h) iVar2.f3726b.getSelectedItem();
                                if (hVar != null) {
                                    Context applicationContext = iVar2.requireContext().getApplicationContext();
                                    int i12 = iVar2.f3731j;
                                    iVar2.f3730i = true;
                                    iVar2.f3726b.setEnabled(false);
                                    iVar2.u();
                                    iVar2.d.setText(R.string.app_permission_grant_running);
                                    e0.w.c(-1, e0.m.h(new byte[]{54, ByteCompanionObject.MIN_VALUE, -13, 22, -106, -94, -83, -104, 4, -125, -22, 41, -99, -105, -78, -112, 25, -124}, new byte[]{119, -16, -125, 70, -13, -48, -64, -15})).execute(new j2.d(iVar2, applicationContext, i12, hVar, 1));
                                    return;
                                }
                                return;
                            }
                            if (!iVar2.t()) {
                                StringBuilder sb = new StringBuilder();
                                u0.a o5 = h0.b.o();
                                byte[] bArr = e0.m.f1973j;
                                String[] strArr = p3.f2001a;
                                com.google.protobuf.q.s(bArr, o5, "", sb);
                                com.google.protobuf.q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
                                String g10 = com.google.protobuf.q.g(sb, e0.x1.f2066q);
                                u0.a o9 = h0.b.o();
                                byte[] bArr2 = e0.m.f1969f;
                                if (com.google.protobuf.q.w(bArr2, o9, "", g10)) {
                                    if (com.google.protobuf.q.d(Long.MAX_VALUE, h0.b.a().j()) < Long.parseLong(new String(com.google.protobuf.q.x(new byte[]{3}, new byte[]{51, 59, 11, 110, 83, -16, -120, -111}, h0.b.o(), com.google.protobuf.q.h(e0.m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    bool = Boolean.valueOf(z9);
                                } else {
                                    bool = Boolean.FALSE;
                                }
                                if (!bool.booleanValue()) {
                                    iVar2.u();
                                    return;
                                }
                            }
                            h hVar2 = (h) iVar2.f3726b.getSelectedItem();
                            if (hVar2 == null) {
                                y5.k.w(R.string.app_permission_grant_no_apps, iVar2.requireContext());
                                return;
                            }
                            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) iVar2.requireContext().getSystemService(e0.m.h(new byte[]{-11, 32, 0, -112, -29, -29, 50, 85, -2, 41, 31, -102, -7}, new byte[]{-111, 69, 118, -7, ByteCompanionObject.MIN_VALUE, -122, 109, 37}));
                            if (devicePolicyManager != null) {
                                PackageManager packageManager = iVar2.requireContext().getPackageManager();
                                ComponentName componentName = new ComponentName(iVar2.requireContext(), (Class<?>) DPups.class);
                                try {
                                    String[] strArr2 = packageManager.getPackageInfo(hVar2.f3709b, 4096).requestedPermissions;
                                    if (strArr2 != null && strArr2.length != 0) {
                                        int i13 = 0;
                                        int i14 = 0;
                                        int i15 = 0;
                                        for (String str : strArr2) {
                                            if (!TextUtils.isEmpty(str)) {
                                                try {
                                                    if ((packageManager.getPermissionInfo(str, 0).protectionLevel & 15) == 1) {
                                                        try {
                                                            if (devicePolicyManager.setPermissionGrantState(componentName, hVar2.f3709b, str, 1)) {
                                                                i13++;
                                                            }
                                                        } catch (Exception unused) {
                                                        }
                                                        i14++;
                                                    }
                                                } catch (Exception unused2) {
                                                }
                                                i15++;
                                            }
                                        }
                                        iVar2.d.setText(String.format(Locale.ROOT, iVar2.getString(R.string.app_permission_grant_result), hVar2.f3708a, Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15)));
                                        return;
                                    }
                                    iVar2.d.setText(R.string.app_permission_grant_no_requested_permissions);
                                    return;
                                } catch (Exception e) {
                                    TextView textView = iVar2.d;
                                    if (e.getMessage() == null) {
                                        message = iVar2.getString(R.string.app_permission_grant_error);
                                    } else {
                                        message = e.getMessage();
                                    }
                                    textView.setText(message);
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: m0.a
            public final /* synthetic */ i c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String message;
                Boolean bool;
                boolean z9;
                switch (i11) {
                    case 0:
                        i iVar = this.c;
                        if (iVar.getParentFragment() instanceof l0.a) {
                            ((l0.a) iVar.getParentFragment()).dismiss();
                            return;
                        }
                        FragmentActivity activity = iVar.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    default:
                        i iVar2 = this.c;
                        if (!iVar2.f3730i) {
                            if (iVar2.f3729h) {
                                h hVar = (h) iVar2.f3726b.getSelectedItem();
                                if (hVar != null) {
                                    Context applicationContext = iVar2.requireContext().getApplicationContext();
                                    int i12 = iVar2.f3731j;
                                    iVar2.f3730i = true;
                                    iVar2.f3726b.setEnabled(false);
                                    iVar2.u();
                                    iVar2.d.setText(R.string.app_permission_grant_running);
                                    e0.w.c(-1, e0.m.h(new byte[]{54, ByteCompanionObject.MIN_VALUE, -13, 22, -106, -94, -83, -104, 4, -125, -22, 41, -99, -105, -78, -112, 25, -124}, new byte[]{119, -16, -125, 70, -13, -48, -64, -15})).execute(new j2.d(iVar2, applicationContext, i12, hVar, 1));
                                    return;
                                }
                                return;
                            }
                            if (!iVar2.t()) {
                                StringBuilder sb = new StringBuilder();
                                u0.a o5 = h0.b.o();
                                byte[] bArr = e0.m.f1973j;
                                String[] strArr = p3.f2001a;
                                com.google.protobuf.q.s(bArr, o5, "", sb);
                                com.google.protobuf.q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
                                String g10 = com.google.protobuf.q.g(sb, e0.x1.f2066q);
                                u0.a o9 = h0.b.o();
                                byte[] bArr2 = e0.m.f1969f;
                                if (com.google.protobuf.q.w(bArr2, o9, "", g10)) {
                                    if (com.google.protobuf.q.d(Long.MAX_VALUE, h0.b.a().j()) < Long.parseLong(new String(com.google.protobuf.q.x(new byte[]{3}, new byte[]{51, 59, 11, 110, 83, -16, -120, -111}, h0.b.o(), com.google.protobuf.q.h(e0.m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    bool = Boolean.valueOf(z9);
                                } else {
                                    bool = Boolean.FALSE;
                                }
                                if (!bool.booleanValue()) {
                                    iVar2.u();
                                    return;
                                }
                            }
                            h hVar2 = (h) iVar2.f3726b.getSelectedItem();
                            if (hVar2 == null) {
                                y5.k.w(R.string.app_permission_grant_no_apps, iVar2.requireContext());
                                return;
                            }
                            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) iVar2.requireContext().getSystemService(e0.m.h(new byte[]{-11, 32, 0, -112, -29, -29, 50, 85, -2, 41, 31, -102, -7}, new byte[]{-111, 69, 118, -7, ByteCompanionObject.MIN_VALUE, -122, 109, 37}));
                            if (devicePolicyManager != null) {
                                PackageManager packageManager = iVar2.requireContext().getPackageManager();
                                ComponentName componentName = new ComponentName(iVar2.requireContext(), (Class<?>) DPups.class);
                                try {
                                    String[] strArr2 = packageManager.getPackageInfo(hVar2.f3709b, 4096).requestedPermissions;
                                    if (strArr2 != null && strArr2.length != 0) {
                                        int i13 = 0;
                                        int i14 = 0;
                                        int i15 = 0;
                                        for (String str : strArr2) {
                                            if (!TextUtils.isEmpty(str)) {
                                                try {
                                                    if ((packageManager.getPermissionInfo(str, 0).protectionLevel & 15) == 1) {
                                                        try {
                                                            if (devicePolicyManager.setPermissionGrantState(componentName, hVar2.f3709b, str, 1)) {
                                                                i13++;
                                                            }
                                                        } catch (Exception unused) {
                                                        }
                                                        i14++;
                                                    }
                                                } catch (Exception unused2) {
                                                }
                                                i15++;
                                            }
                                        }
                                        iVar2.d.setText(String.format(Locale.ROOT, iVar2.getString(R.string.app_permission_grant_result), hVar2.f3708a, Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15)));
                                        return;
                                    }
                                    iVar2.d.setText(R.string.app_permission_grant_no_requested_permissions);
                                    return;
                                } catch (Exception e) {
                                    TextView textView = iVar2.d;
                                    if (e.getMessage() == null) {
                                        message = iVar2.getString(R.string.app_permission_grant_error);
                                    } else {
                                        message = e.getMessage();
                                    }
                                    textView.setText(message);
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                }
            }
        });
        PackageManager packageManager = requireContext().getPackageManager();
        ArrayList arrayList = this.f3727f;
        arrayList.clear();
        try {
            for (PackageInfo packageInfo : packageManager.getInstalledPackages(4096)) {
                if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 0 && !TextUtils.equals(packageInfo.packageName, requireContext().getPackageName())) {
                    CharSequence loadLabel = applicationInfo.loadLabel(packageManager);
                    if (loadLabel == null) {
                        charSequence = packageInfo.packageName;
                    } else {
                        charSequence = loadLabel.toString();
                    }
                    arrayList.add(new h(charSequence, packageInfo.packageName));
                }
            }
        } catch (Exception unused) {
        }
        Collections.sort(arrayList, new androidx.constraintlayout.core.utils.a(7));
        this.f3726b.setAdapter((SpinnerAdapter) new g(this, requireContext()));
        u();
        Context applicationContext = requireContext().getApplicationContext();
        int i12 = this.f3731j;
        this.f3730i = true;
        u();
        e0.w.c(-1, e0.m.h(new byte[]{84, -35, -33, -118, -77, 109, 20, 94, 102, -34, -58, -75, -72, 88, 11, 86, 123, -39}, new byte[]{21, -83, -81, -38, -42, 31, 121, 55})).execute(new androidx.activity.f(this, applicationContext, i12, 4));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f3731j++;
        this.f3730i = false;
        this.f3729h = false;
        this.f3726b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        u();
    }

    public final boolean t() {
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) requireContext().getSystemService(e0.m.h(new byte[]{-34, 28, -92, -7, 30, -110, -109, 35, -43, 21, -69, -13, 4}, new byte[]{-70, 121, -46, -112, 125, -9, -52, 83}));
        if (devicePolicyManager != null && devicePolicyManager.isDeviceOwnerApp(requireContext().getPackageName())) {
            return true;
        }
        return false;
    }

    public final void u() {
        int i10;
        boolean t = t();
        GradientDrawable gradientDrawable = this.e;
        if (this.f3729h) {
            i10 = -11751600;
        } else if (t) {
            i10 = -16121;
        } else {
            i10 = -1092784;
        }
        gradientDrawable.setColor(i10);
        if (this.f3730i) {
            this.c.setEnabled(false);
            return;
        }
        if (!this.f3729h && !t) {
            this.c.setEnabled(false);
            this.c.setAlpha(0.55f);
            this.c.setText(R.string.app_permission_grant_no_device_owner);
            this.d.setText(R.string.app_permission_grant_no_device_owner);
            return;
        }
        boolean isEmpty = this.f3727f.isEmpty();
        Button button = this.c;
        if (isEmpty) {
            button.setEnabled(false);
            this.c.setAlpha(0.55f);
            this.c.setText(R.string.app_permission_grant_no_apps);
            this.d.setText(R.string.app_permission_grant_no_apps);
            return;
        }
        button.setEnabled(true);
        this.c.setAlpha(1.0f);
        this.c.setText(R.string.app_permission_grant_all);
        this.d.setText("");
    }
}
