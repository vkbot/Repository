package e0;

import android.content.Context;
import android.content.Intent;
import android.widget.CompoundButton;
import android.widget.EditText;
import com.example.navistart.AllWidgetServices;
import com.example.navistart.MainActivity;
import com.example.navistart.MockGPS.MockGpsService;
import com.example.navistart.ModernMainActivity;
import com.example.navistart.Si;
import com.example.navistart.UpdateActivity;
import com.example.navistart.cores.HFunEnum;
import com.example.navistart.punto;
import com.google.android.material.chip.Chip;
import com.woha.wifim.MainWifiManadger;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2025b;

    public /* synthetic */ s0(MainActivity mainActivity, HFunEnum hFunEnum) {
        this.f2024a = 1;
        this.f2025b = hFunEnum;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
        int i10 = 0;
        switch (this.f2024a) {
            case 0:
                String str = (String) this.f2025b;
                String str2 = MainActivity.f750e1;
                h0.b.o().saveBoolean(str, z9);
                return;
            case 1:
                HFunEnum hFunEnum = (HFunEnum) this.f2025b;
                String str3 = MainActivity.f750e1;
                h0.b.o().saveBoolean(hFunEnum.name(), z9);
                try {
                    h0.b.a();
                    h0.b.d().hybrid(hFunEnum, z9);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 2:
                ModernMainActivity modernMainActivity = (ModernMainActivity) this.f2025b;
                String str4 = ModernMainActivity.B1;
                h0.b.o().saveBoolean(m.h(new byte[]{-42, -66, 45, 49, 112, -83, 126, 84, -63, -84, 56, 32, 113, -83, 108, 83, -60, -87, 49, 49, 102}, new byte[]{-91, -53, 93, 84, 2, -14, 9, Base64.padSymbol}), z9);
                AllWidgetServices allWidgetServices = AllWidgetServices.f693g;
                if (allWidgetServices == null) {
                    AllWidgetServices.c(modernMainActivity);
                    return;
                } else {
                    allWidgetServices.f696b.post(new c(allWidgetServices, i10));
                    return;
                }
            case 3:
                UpdateActivity updateActivity = (UpdateActivity) this.f2025b;
                updateActivity.f936g.setEnabled(z9);
                updateActivity.f937h.setEnabled(z9);
                return;
            case 4:
                punto puntoVar = (punto) this.f2025b;
                String str5 = punto.r;
                h0.b.o().saveBoolean(m.h(new byte[]{58, 13, 94}, new byte[]{74, 105, 48, -36, 97, 95, -97, -36}), z9);
                puntoVar.f1072j.setEnabled(z9);
                puntoVar.f1074l.setEnabled(z9);
                puntoVar.s(z9);
                return;
            case 5:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) this.f2025b).f1280f;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z9);
                    return;
                }
                return;
            case 6:
                m0.m2 m2Var = (m0.m2) this.f2025b;
                String str6 = m0.m2.f3783m;
                boolean isChecked = m2Var.e.isChecked();
                EditText editText = m2Var.f3785f;
                if (isChecked) {
                    i10 = 8;
                }
                editText.setVisibility(i10);
                return;
            case 7:
                EditText editText2 = (EditText) this.f2025b;
                String str7 = MainWifiManadger.f1694v;
                if (z9) {
                    editText2.setInputType(145);
                } else {
                    editText2.setInputType(129);
                }
                editText2.setSelection(editText2.getText().length());
                return;
            case 8:
                q0.l lVar = (q0.l) this.f2025b;
                if (!lVar.f5214v && m.h(new byte[]{104, -45, -77, 115, -16, -57, 19, 67, 104}, new byte[]{24, -69, -36, 29, -107, -104, 114, 51}).equals(lVar.t)) {
                    MockGpsService.f823z = false;
                    try {
                        h0.b.o().saveBoolean(MockGpsService.f818s, MockGpsService.f823z);
                    } catch (Exception unused2) {
                    }
                    if (MockGpsService.t.get()) {
                        MockGpsService.n(lVar.requireContext(), lVar.x(), lVar.t, lVar.d.getText().toString());
                        return;
                    }
                    return;
                }
                return;
            case 9:
                u1.d dVar = (u1.d) this.f2025b;
                h0.b.o().saveBoolean(m.h(new byte[]{-65, -120, -54, 109, 4, ByteCompanionObject.MAX_VALUE, -93, -123, -93, -98, -59, 109, 21, 124, -93, -76}, new byte[]{-52, -8, -93, 50, 101, 19, -49, -38}), z9);
                if (z9) {
                    Si.a(dVar.requireContext());
                    return;
                }
                Context requireContext = dVar.requireContext();
                boolean z10 = Si.d;
                Context applicationContext = requireContext.getApplicationContext();
                applicationContext.stopService(new Intent(applicationContext, (Class<?>) Si.class));
                return;
            default:
                w0.v0 v0Var = (w0.v0) this.f2025b;
                v0Var.e.setEnabled(!z9);
                v0Var.f6246f = z9;
                return;
        }
    }

    public /* synthetic */ s0(int i10, Object obj) {
        this.f2024a = i10;
        this.f2025b = obj;
    }
}
