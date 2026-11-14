package w0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import com.example.navistart.Si;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.io.encoding.Base64;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class v0 extends l0.b {

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f6245b;
    public q0 c;
    public ArrayList d;
    public EditText e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6246f;

    /* renamed from: g, reason: collision with root package name */
    public Spinner f6247g;

    /* renamed from: h, reason: collision with root package name */
    public Button f6248h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f6249i;

    /* renamed from: j, reason: collision with root package name */
    public RadioGroup f6250j;

    /* renamed from: k, reason: collision with root package name */
    public Button f6251k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f6252l;

    /* renamed from: m, reason: collision with root package name */
    public final ExecutorService f6253m = Executors.newSingleThreadExecutor();

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        final int i11 = 0;
        View inflate = layoutInflater.inflate(R.layout.fragment_voice_command_settings, viewGroup, false);
        this.e = (EditText) inflate.findViewById(R.id.editActivationPhrase);
        Switch r62 = (Switch) inflate.findViewById(R.id.spi_aktivate_sw);
        boolean loadBoolean = h0.b.o().loadBoolean(e0.m.h(new byte[]{-82, 46, 23, 78, 85, -116, 82, -80, -85, 63, 10, 116, 107, -108, 81, -122, -114, 9}, new byte[]{-35, 94, 126, 17, 52, -25, 38, -39}), false);
        this.f6246f = loadBoolean;
        r62.setChecked(loadBoolean);
        final int i12 = 1;
        this.e.setEnabled(!this.f6246f);
        r62.setOnCheckedChangeListener(new e0.s0(10, this));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recyclerVoiceCommands);
        this.f6245b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        EditText editText = this.e;
        h0.b.a();
        h0.b.f().getClass();
        editText.setText(j0.c.f());
        h0.b.a();
        this.d = h0.b.f().i(j0.c.e);
        q0 q0Var = new q0(requireActivity(), this.d);
        this.c = q0Var;
        this.f6245b.setAdapter(q0Var);
        inflate.findViewById(R.id.btnAddCommand).setOnClickListener(new View.OnClickListener(this) { // from class: w0.t0
            public final /* synthetic */ v0 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z zVar;
                k1 k1Var;
                int i13 = i11;
                v0 v0Var = this.c;
                switch (i13) {
                    case 0:
                        v0Var.d.add(new o0("", j0.e.c(n0.d.e, v0Var.requireActivity()), true, true));
                        v0Var.c.notifyItemInserted(v0Var.d.size() - 1);
                        return;
                    case 1:
                        h0.b.a();
                        j0.c f8 = h0.b.f();
                        String obj = v0Var.e.getText().toString();
                        f8.getClass();
                        h0.b.o().saveString(j0.c.d, obj);
                        h0.b.a();
                        j0.c f10 = h0.b.f();
                        ArrayList arrayList = v0Var.d;
                        String str = j0.c.e;
                        f10.getClass();
                        j0.c.l(str, arrayList);
                        h0.b.o().saveBoolean(e0.m.h(new byte[]{29, -73, -70, 117, -123, 98, -113, 19, 24, -90, -89, 79, -69, 122, -116, 37, Base64.padSymbol, -112}, new byte[]{110, -57, -45, 42, -28, 9, -5, 122}), v0Var.f6246f);
                        Si.a(v0Var.requireContext());
                        l0.a aVar = (l0.a) v0Var.getParentFragment();
                        if (aVar != null) {
                            aVar.dismiss();
                            return;
                        }
                        return;
                    case 2:
                        Context applicationContext = v0Var.requireContext().getApplicationContext();
                        if (v0Var.f6250j.getCheckedRadioButtonId() == R.id.radioVoiceEngineSimple) {
                            a0.h(applicationContext, z.f6297b);
                            v0Var.u();
                            return;
                        }
                        if (v0Var.f6250j.getCheckedRadioButtonId() == R.id.radioVoiceEngineFree) {
                            zVar = z.d;
                        } else {
                            zVar = z.c;
                        }
                        if (a.f(applicationContext)) {
                            a0.h(applicationContext, zVar);
                            v0Var.u();
                            return;
                        } else {
                            v0Var.t(false);
                            v0Var.f6252l.setText(v0Var.getString(R.string.voice_engine_loading, 0));
                            v0Var.f6253m.execute(new b1.n(v0Var, applicationContext, zVar, 16));
                            return;
                        }
                    default:
                        int selectedItemPosition = v0Var.f6247g.getSelectedItemPosition();
                        k1[] values = k1.values();
                        if (selectedItemPosition >= 0 && selectedItemPosition < values.length) {
                            k1Var = values[selectedItemPosition];
                        } else {
                            k1Var = null;
                        }
                        if (k1Var != null) {
                            Context applicationContext2 = v0Var.requireContext().getApplicationContext();
                            v0Var.f6248h.setEnabled(false);
                            v0Var.f6247g.setEnabled(false);
                            v0Var.f6249i.setText(v0Var.getString(R.string.vosk_model_loading, 0));
                            v0Var.f6253m.execute(new b1.n(v0Var, applicationContext2, k1Var, 15));
                            return;
                        }
                        return;
                }
            }
        });
        inflate.findViewById(R.id.btnSave).setOnClickListener(new View.OnClickListener(this) { // from class: w0.t0
            public final /* synthetic */ v0 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z zVar;
                k1 k1Var;
                int i13 = i12;
                v0 v0Var = this.c;
                switch (i13) {
                    case 0:
                        v0Var.d.add(new o0("", j0.e.c(n0.d.e, v0Var.requireActivity()), true, true));
                        v0Var.c.notifyItemInserted(v0Var.d.size() - 1);
                        return;
                    case 1:
                        h0.b.a();
                        j0.c f8 = h0.b.f();
                        String obj = v0Var.e.getText().toString();
                        f8.getClass();
                        h0.b.o().saveString(j0.c.d, obj);
                        h0.b.a();
                        j0.c f10 = h0.b.f();
                        ArrayList arrayList = v0Var.d;
                        String str = j0.c.e;
                        f10.getClass();
                        j0.c.l(str, arrayList);
                        h0.b.o().saveBoolean(e0.m.h(new byte[]{29, -73, -70, 117, -123, 98, -113, 19, 24, -90, -89, 79, -69, 122, -116, 37, Base64.padSymbol, -112}, new byte[]{110, -57, -45, 42, -28, 9, -5, 122}), v0Var.f6246f);
                        Si.a(v0Var.requireContext());
                        l0.a aVar = (l0.a) v0Var.getParentFragment();
                        if (aVar != null) {
                            aVar.dismiss();
                            return;
                        }
                        return;
                    case 2:
                        Context applicationContext = v0Var.requireContext().getApplicationContext();
                        if (v0Var.f6250j.getCheckedRadioButtonId() == R.id.radioVoiceEngineSimple) {
                            a0.h(applicationContext, z.f6297b);
                            v0Var.u();
                            return;
                        }
                        if (v0Var.f6250j.getCheckedRadioButtonId() == R.id.radioVoiceEngineFree) {
                            zVar = z.d;
                        } else {
                            zVar = z.c;
                        }
                        if (a.f(applicationContext)) {
                            a0.h(applicationContext, zVar);
                            v0Var.u();
                            return;
                        } else {
                            v0Var.t(false);
                            v0Var.f6252l.setText(v0Var.getString(R.string.voice_engine_loading, 0));
                            v0Var.f6253m.execute(new b1.n(v0Var, applicationContext, zVar, 16));
                            return;
                        }
                    default:
                        int selectedItemPosition = v0Var.f6247g.getSelectedItemPosition();
                        k1[] values = k1.values();
                        if (selectedItemPosition >= 0 && selectedItemPosition < values.length) {
                            k1Var = values[selectedItemPosition];
                        } else {
                            k1Var = null;
                        }
                        if (k1Var != null) {
                            Context applicationContext2 = v0Var.requireContext().getApplicationContext();
                            v0Var.f6248h.setEnabled(false);
                            v0Var.f6247g.setEnabled(false);
                            v0Var.f6249i.setText(v0Var.getString(R.string.vosk_model_loading, 0));
                            v0Var.f6253m.execute(new b1.n(v0Var, applicationContext2, k1Var, 15));
                            return;
                        }
                        return;
                }
            }
        });
        this.f6250j = (RadioGroup) inflate.findViewById(R.id.radioVoiceEngine);
        this.f6251k = (Button) inflate.findViewById(R.id.btnApplyVoiceEngine);
        this.f6252l = (TextView) inflate.findViewById(R.id.textVoiceEngineStatus);
        boolean f8 = a.f(requireContext());
        z d = a0.d();
        RadioGroup radioGroup = this.f6250j;
        if (f8 && d == z.d) {
            i10 = R.id.radioVoiceEngineFree;
        } else if (f8 && d == z.c) {
            i10 = R.id.radioVoiceEngineAdvanced;
        } else {
            i10 = R.id.radioVoiceEngineSimple;
        }
        radioGroup.check(i10);
        u();
        final int i13 = 2;
        this.f6251k.setOnClickListener(new View.OnClickListener(this) { // from class: w0.t0
            public final /* synthetic */ v0 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z zVar;
                k1 k1Var;
                int i132 = i13;
                v0 v0Var = this.c;
                switch (i132) {
                    case 0:
                        v0Var.d.add(new o0("", j0.e.c(n0.d.e, v0Var.requireActivity()), true, true));
                        v0Var.c.notifyItemInserted(v0Var.d.size() - 1);
                        return;
                    case 1:
                        h0.b.a();
                        j0.c f82 = h0.b.f();
                        String obj = v0Var.e.getText().toString();
                        f82.getClass();
                        h0.b.o().saveString(j0.c.d, obj);
                        h0.b.a();
                        j0.c f10 = h0.b.f();
                        ArrayList arrayList = v0Var.d;
                        String str = j0.c.e;
                        f10.getClass();
                        j0.c.l(str, arrayList);
                        h0.b.o().saveBoolean(e0.m.h(new byte[]{29, -73, -70, 117, -123, 98, -113, 19, 24, -90, -89, 79, -69, 122, -116, 37, Base64.padSymbol, -112}, new byte[]{110, -57, -45, 42, -28, 9, -5, 122}), v0Var.f6246f);
                        Si.a(v0Var.requireContext());
                        l0.a aVar = (l0.a) v0Var.getParentFragment();
                        if (aVar != null) {
                            aVar.dismiss();
                            return;
                        }
                        return;
                    case 2:
                        Context applicationContext = v0Var.requireContext().getApplicationContext();
                        if (v0Var.f6250j.getCheckedRadioButtonId() == R.id.radioVoiceEngineSimple) {
                            a0.h(applicationContext, z.f6297b);
                            v0Var.u();
                            return;
                        }
                        if (v0Var.f6250j.getCheckedRadioButtonId() == R.id.radioVoiceEngineFree) {
                            zVar = z.d;
                        } else {
                            zVar = z.c;
                        }
                        if (a.f(applicationContext)) {
                            a0.h(applicationContext, zVar);
                            v0Var.u();
                            return;
                        } else {
                            v0Var.t(false);
                            v0Var.f6252l.setText(v0Var.getString(R.string.voice_engine_loading, 0));
                            v0Var.f6253m.execute(new b1.n(v0Var, applicationContext, zVar, 16));
                            return;
                        }
                    default:
                        int selectedItemPosition = v0Var.f6247g.getSelectedItemPosition();
                        k1[] values = k1.values();
                        if (selectedItemPosition >= 0 && selectedItemPosition < values.length) {
                            k1Var = values[selectedItemPosition];
                        } else {
                            k1Var = null;
                        }
                        if (k1Var != null) {
                            Context applicationContext2 = v0Var.requireContext().getApplicationContext();
                            v0Var.f6248h.setEnabled(false);
                            v0Var.f6247g.setEnabled(false);
                            v0Var.f6249i.setText(v0Var.getString(R.string.vosk_model_loading, 0));
                            v0Var.f6253m.execute(new b1.n(v0Var, applicationContext2, k1Var, 15));
                            return;
                        }
                        return;
                }
            }
        });
        this.f6247g = (Spinner) inflate.findViewById(R.id.spinnerVoskLanguage);
        this.f6248h = (Button) inflate.findViewById(R.id.btnApplyVoskLanguage);
        this.f6249i = (TextView) inflate.findViewById(R.id.textVoskModelStatus);
        k1[] values = k1.values();
        String[] strArr = new String[values.length];
        while (i11 < values.length) {
            strArr[i11] = requireContext().getString(values[i11].f6155b);
            i11++;
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, strArr);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.f6247g.setAdapter((SpinnerAdapter) arrayAdapter);
        try {
            this.f6247g.setSelection(k1.valueOf(h0.b.o().loadString(e0.m.h(new byte[]{80, -103, -4, 94, -52, -126, 10, 83, 65, -125, -18, 82, -10, -79, 6, 82, 66, -109, -29}, new byte[]{38, -10, -113, 53, -109, -18, 107, Base64.padSymbol}), k1.e.name())).ordinal());
        } catch (IllegalArgumentException unused) {
            this.f6247g.setSelection(k1.e.ordinal());
        }
        final int i14 = 3;
        this.f6248h.setOnClickListener(new View.OnClickListener(this) { // from class: w0.t0
            public final /* synthetic */ v0 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z zVar;
                k1 k1Var;
                int i132 = i14;
                v0 v0Var = this.c;
                switch (i132) {
                    case 0:
                        v0Var.d.add(new o0("", j0.e.c(n0.d.e, v0Var.requireActivity()), true, true));
                        v0Var.c.notifyItemInserted(v0Var.d.size() - 1);
                        return;
                    case 1:
                        h0.b.a();
                        j0.c f82 = h0.b.f();
                        String obj = v0Var.e.getText().toString();
                        f82.getClass();
                        h0.b.o().saveString(j0.c.d, obj);
                        h0.b.a();
                        j0.c f10 = h0.b.f();
                        ArrayList arrayList = v0Var.d;
                        String str = j0.c.e;
                        f10.getClass();
                        j0.c.l(str, arrayList);
                        h0.b.o().saveBoolean(e0.m.h(new byte[]{29, -73, -70, 117, -123, 98, -113, 19, 24, -90, -89, 79, -69, 122, -116, 37, Base64.padSymbol, -112}, new byte[]{110, -57, -45, 42, -28, 9, -5, 122}), v0Var.f6246f);
                        Si.a(v0Var.requireContext());
                        l0.a aVar = (l0.a) v0Var.getParentFragment();
                        if (aVar != null) {
                            aVar.dismiss();
                            return;
                        }
                        return;
                    case 2:
                        Context applicationContext = v0Var.requireContext().getApplicationContext();
                        if (v0Var.f6250j.getCheckedRadioButtonId() == R.id.radioVoiceEngineSimple) {
                            a0.h(applicationContext, z.f6297b);
                            v0Var.u();
                            return;
                        }
                        if (v0Var.f6250j.getCheckedRadioButtonId() == R.id.radioVoiceEngineFree) {
                            zVar = z.d;
                        } else {
                            zVar = z.c;
                        }
                        if (a.f(applicationContext)) {
                            a0.h(applicationContext, zVar);
                            v0Var.u();
                            return;
                        } else {
                            v0Var.t(false);
                            v0Var.f6252l.setText(v0Var.getString(R.string.voice_engine_loading, 0));
                            v0Var.f6253m.execute(new b1.n(v0Var, applicationContext, zVar, 16));
                            return;
                        }
                    default:
                        int selectedItemPosition = v0Var.f6247g.getSelectedItemPosition();
                        k1[] values2 = k1.values();
                        if (selectedItemPosition >= 0 && selectedItemPosition < values2.length) {
                            k1Var = values2[selectedItemPosition];
                        } else {
                            k1Var = null;
                        }
                        if (k1Var != null) {
                            Context applicationContext2 = v0Var.requireContext().getApplicationContext();
                            v0Var.f6248h.setEnabled(false);
                            v0Var.f6247g.setEnabled(false);
                            v0Var.f6249i.setText(v0Var.getString(R.string.vosk_model_loading, 0));
                            v0Var.f6253m.execute(new b1.n(v0Var, applicationContext2, k1Var, 15));
                            return;
                        }
                        return;
                }
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f6253m.shutdownNow();
        super.onDestroy();
    }

    public final void t(boolean z9) {
        this.f6250j.setEnabled(z9);
        for (int i10 = 0; i10 < this.f6250j.getChildCount(); i10++) {
            this.f6250j.getChildAt(i10).setEnabled(z9);
        }
        this.f6251k.setEnabled(z9);
    }

    public final void u() {
        boolean z9;
        int i10;
        boolean f8 = a.f(requireContext());
        if (f8 && a0.d() == z.d) {
            this.f6252l.setText(R.string.voice_engine_free_active);
            return;
        }
        if (a0.d() == z.c && f8) {
            z9 = true;
        } else {
            z9 = false;
        }
        TextView textView = this.f6252l;
        if (z9) {
            i10 = R.string.voice_engine_advanced_active;
        } else if (f8) {
            i10 = R.string.voice_engine_advanced_available;
        } else {
            i10 = R.string.voice_engine_simple_active;
        }
        textView.setText(i10);
    }
}
