package androidx.navigation;

import android.content.Intent;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import b1.h;
import b1.u;
import com.example.navistart.APInAct;
import com.example.navistart.AutoVibVodActivity;
import com.example.navistart.MainActivity;
import com.example.navistart.home.WebLauncherActivity;
import com.example.navistart.mainview.HeatManSetView;
import com.example.navistart.mainview.OnOffButton;
import com.google.android.material.datepicker.p;
import e0.g2;
import e0.m;
import e4.l;
import e4.x;
import f0.e;
import java.util.Objects;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.n0;
import m0.n1;
import m0.s0;
import m0.w1;
import m0.y;
import s1.n;
import t1.g;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f236b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i10, Object obj) {
        this.f236b = i10;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f236b;
        int i11 = 0;
        Object obj = this.c;
        switch (i10) {
            case 0:
                Navigation.a((NavDirections) obj, view);
                return;
            case 1:
                ((h) obj).f292f.b();
                return;
            case 2:
                ((p) obj).t();
                throw null;
            case 3:
                String str = APInAct.f690f;
                ((APInAct) obj).finish();
                return;
            case 4:
                int i12 = AutoVibVodActivity.f715b;
                ((AutoVibVodActivity) obj).finish();
                return;
            case 5:
                String str2 = MainActivity.f750e1;
                ((AlertDialog) obj).dismiss();
                return;
            case 6:
                g2 g2Var = (g2) obj;
                g2Var.f1922g.run();
                g2Var.f1924i.dismiss();
                return;
            case 7:
                e4.d dVar = (e4.d) obj;
                EditText editText = dVar.f2125i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    dVar.p();
                    return;
                }
                return;
            case 8:
                ((l) obj).t();
                return;
            case 9:
                x xVar = (x) obj;
                EditText editText2 = xVar.f2199f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = xVar.f2199f;
                    if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        i11 = 1;
                    }
                    EditText editText4 = xVar.f2199f;
                    if (i11 != 0) {
                        editText4.setTransformationMethod(null);
                    } else {
                        editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        xVar.f2199f.setSelection(selectionEnd);
                    }
                    xVar.p();
                    return;
                }
                return;
            case 10:
                ((f0.a) obj).f2238b.b();
                return;
            case 11:
                ((f0.d) obj).f2241b.b();
                return;
            case 12:
                ((e) obj).f2242b.b();
                return;
            case 13:
                int i13 = f1.e.f2247q;
                ((f1.e) obj).requireActivity().finish();
                return;
            case 14:
                y yVar = (y) obj;
                if (yVar.getParentFragment() instanceof l0.a) {
                    ((l0.a) yVar.getParentFragment()).dismiss();
                    return;
                }
                FragmentActivity activity = yVar.getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            case 15:
                n0 n0Var = (n0) obj;
                String str3 = n0.f3795k;
                if (n0Var.getParentFragment() instanceof l0.a) {
                    ((l0.a) n0Var.getParentFragment()).dismiss();
                    return;
                } else {
                    if (n0Var.getActivity() != null) {
                        n0Var.getActivity().onBackPressed();
                        return;
                    }
                    return;
                }
            case 16:
                s0 s0Var = (s0) obj;
                if (s0Var.getParentFragment() instanceof l0.a) {
                    ((l0.a) s0Var.getParentFragment()).dismiss();
                    return;
                } else {
                    if (s0Var.getActivity() != null) {
                        s0Var.getActivity().onBackPressed();
                        return;
                    }
                    return;
                }
            case 17:
                w1 w1Var = (w1) obj;
                if (!u.q(w1Var.requireContext())) {
                    try {
                        w1Var.startActivity(new Intent(m.h(new byte[]{-83, 69, -94, -92, 93, -121, 104, 115, -65, 78, -78, -94, 91, ByteCompanionObject.MIN_VALUE, 107, 46, -30, 126, -107, -105, 117, -85, 83, 28, -113, 104, -125, -123, 97, -79, 95, 24, -104, ByteCompanionObject.MAX_VALUE, -113, -104, 117, -67}, new byte[]{-52, 43, -58, -42, 50, -18, 12, 93})));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 18:
                n nVar = (n) obj;
                nVar.j();
                Intent intent = new Intent(nVar.getContext(), (Class<?>) WebLauncherActivity.class);
                intent.putExtra(m.h(new byte[]{-16, 14, -113, 93, 123, -46, 86, 73, -15, 29, -126, 86, 86, -31, 68, 89, -21, 10, -125, 93, 67, -51}, new byte[]{-97, 126, -22, 51, 36, -66, 55, 60}), true);
                intent.addFlags(872415232);
                nVar.getContext().startActivity(intent);
                return;
            case 19:
                HeatManSetView heatManSetView = (HeatManSetView) obj;
                if (!Objects.equals(heatManSetView.f1023n, m.h(new byte[]{9, 58, 60, 60, 24, 59, 110, 83, 45}, new byte[]{65, 95, 93, 72, 79, 83, 11, 54})) && !Objects.equals(heatManSetView.f1023n, m.h(new byte[]{-17, -37, 76, 1, Base64.padSymbol, -90, -2, -46, -44, -42, 68, 16, 6, -85}, new byte[]{-89, -66, 45, 117, 106, -49, -112, -74})) && !Objects.equals(heatManSetView.f1023n, m.h(new byte[]{-61, 109, -52, -56, 22, 32, 5, 121, -4, 97, -61, -40, 43, 50}, new byte[]{-117, 8, -83, -68, 68, 69, 100, 11})) && !Objects.equals(heatManSetView.f1023n, m.h(new byte[]{51, -81, 75, 13, -5, 62, -82, -17, 19}, new byte[]{103, -58, 38, 104, -119, 118, -53, -114}))) {
                    int i14 = heatManSetView.f1021l;
                    if (i14 != 3) {
                        i11 = i14 + 1;
                    }
                    heatManSetView.f1021l = i11;
                } else {
                    if (heatManSetView.f1021l == 0) {
                        i11 = 1;
                    }
                    heatManSetView.f1021l = i11;
                }
                heatManSetView.setLevel(heatManSetView.f1021l);
                Runnable runnable = heatManSetView.f1026q;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 20:
                t1.h hVar = (t1.h) obj;
                g gVar = hVar.f5765k;
                if (gVar != null) {
                    boolean z9 = hVar.f5760f;
                    n1 n1Var = (n1) gVar;
                    t1.h hVar2 = n1Var.d;
                    if (hVar2 != null) {
                        hVar2.e.setImageResource(com.example.navistart.R.drawable.microphone_off);
                        hVar2.f5760f = false;
                        h0.b.a();
                        h0.b.q().a();
                    }
                    if (!z9) {
                        n1Var.d = hVar;
                        hVar.e.setImageResource(com.example.navistart.R.drawable.microphone_on);
                        hVar.f5760f = true;
                        h0.b.a();
                        h0.b.q().d();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                OnOffButton onOffButton = (OnOffButton) obj;
                if (OnOffButton.f1045g.booleanValue()) {
                    Runnable runnable2 = onOffButton.e;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                } else {
                    Runnable runnable3 = onOffButton.f1047f;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                }
                Boolean valueOf = Boolean.valueOf(!OnOffButton.f1045g.booleanValue());
                OnOffButton.f1045g = valueOf;
                onOffButton.setOnOff(valueOf);
                return;
            default:
                x0.c cVar = (x0.c) obj;
                if (cVar.c.d) {
                    cVar.e = !cVar.e;
                    cVar.k();
                    cVar.l();
                    return;
                }
                return;
        }
    }
}
