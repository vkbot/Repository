package m0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import com.example.navistart.cores.LogcatRule;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class z0 extends l0.b {

    /* renamed from: m, reason: collision with root package name */
    public static final String f3905m = e0.m.h(new byte[]{-49, -5, 47, -80, -66, 109, -19, 7, -52, -16, 45, -80, -76, 107, -32, 13, -52, -6, 59}, new byte[]{-93, -108, 72, -17, -43, 8, -108, 100});

    /* renamed from: n, reason: collision with root package name */
    public static final String f3906n = e0.m.h(new byte[]{38, -28, 58, -87, 93, 34, -29, 10, 45, -22, 4, -82, 87, 60, -33, 9, 38, -24, 4, -95, 91, 54, -33, 9, 52, -24, 41, -68}, new byte[]{66, -115, 91, -59, 50, 69, -68, 102});
    public EditText d;
    public TextView e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f3908f;

    /* renamed from: g, reason: collision with root package name */
    public Button f3909g;

    /* renamed from: h, reason: collision with root package name */
    public RecyclerView f3910h;

    /* renamed from: i, reason: collision with root package name */
    public v0 f3911i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3912j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3914l;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3907b = new ArrayList();
    public final LinkedHashMap c = new LinkedHashMap();

    /* renamed from: k, reason: collision with root package name */
    public String f3913k = "";

    public static void t() {
        try {
            if (h0.b.a().j() != null) {
                h0.b.a().j().lo(f3906n, null, "\u0000");
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_log_keycode, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        boolean z9;
        FragmentActivity activity = getActivity();
        if (activity != null && activity.isChangingConfigurations()) {
            z9 = true;
        } else {
            z9 = false;
        }
        super.onDestroy();
        if (!this.f3914l && !z9) {
            this.f3914l = true;
            h0.b.x(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f3912j = false;
        this.f3913k = "";
        t();
        this.d = null;
        this.e = null;
        this.f3908f = null;
        this.f3909g = null;
        this.f3910h = null;
        this.f3911i = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.d = (EditText) view.findViewById(R.id.logKeycodeFilter);
        this.e = (TextView) view.findViewById(R.id.logKeycodeStatus);
        this.f3908f = (TextView) view.findViewById(R.id.logKeycodeEmpty);
        this.f3909g = (Button) view.findViewById(R.id.logKeycodeRecordButton);
        this.f3910h = (RecyclerView) view.findViewById(R.id.logKeycodeEvents);
        ArrayList arrayList = this.f3907b;
        arrayList.clear();
        LinkedHashMap linkedHashMap = this.c;
        linkedHashMap.clear();
        h0.b.a();
        ArrayList i10 = h0.b.f().i(f3905m);
        int size = i10.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = i10.get(i11);
            i11++;
            w0.o0 o0Var = (w0.o0) obj;
            LogcatRule fromStorageValue = LogcatRule.fromStorageValue(o0Var.f6216a);
            j0.e eVar = o0Var.f6217b;
            if (fromStorageValue != null && j0.f.d(eVar) && !linkedHashMap.containsKey(fromStorageValue.toStorageValue())) {
                t0 t0Var = new t0(fromStorageValue, eVar, true);
                arrayList.add(t0Var);
                linkedHashMap.put(fromStorageValue.toStorageValue(), t0Var);
            }
        }
        this.f3911i = new v0(arrayList, new androidx.fragment.app.h(20, this));
        this.f3910h.setLayoutManager(new LinearLayoutManager(requireContext()));
        this.f3910h.setAdapter(this.f3911i);
        final int i12 = 0;
        view.findViewById(R.id.logKeycodeBackButton).setOnClickListener(new View.OnClickListener(this) { // from class: m0.w0
            public final /* synthetic */ z0 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i12;
                z0 z0Var = this.c;
                switch (i13) {
                    case 0:
                        String str = z0.f3905m;
                        if (z0Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) z0Var.getParentFragment()).dismiss();
                            return;
                        }
                        FragmentActivity activity = z0Var.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    default:
                        String str2 = "";
                        if (z0Var.f3912j) {
                            z0Var.f3912j = false;
                            z0Var.f3913k = "";
                            z0.t();
                            z0Var.v();
                            return;
                        }
                        if (z0Var.d.getText() != null) {
                            str2 = z0Var.d.getText().toString().trim();
                        }
                        boolean isEmpty = str2.isEmpty();
                        EditText editText = z0Var.d;
                        if (isEmpty) {
                            editText.setError(z0Var.getString(R.string.log_keycode_filter_required));
                            return;
                        }
                        editText.setError(null);
                        try {
                            if (h0.b.a().j() == null) {
                                z0Var.e.setText(R.string.log_keycode_status_unavailable);
                            } else {
                                h0.b.a().j().lo(z0.f3906n, null, null);
                                z0Var.f3913k = str2;
                                z0Var.f3912j = true;
                                z0Var.v();
                            }
                            return;
                        } catch (Exception unused) {
                            z0Var.e.setText(R.string.log_keycode_status_unavailable);
                            return;
                        }
                }
            }
        });
        final int i13 = 1;
        this.f3909g.setOnClickListener(new View.OnClickListener(this) { // from class: m0.w0
            public final /* synthetic */ z0 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i132 = i13;
                z0 z0Var = this.c;
                switch (i132) {
                    case 0:
                        String str = z0.f3905m;
                        if (z0Var.getParentFragment() instanceof l0.a) {
                            ((l0.a) z0Var.getParentFragment()).dismiss();
                            return;
                        }
                        FragmentActivity activity = z0Var.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    default:
                        String str2 = "";
                        if (z0Var.f3912j) {
                            z0Var.f3912j = false;
                            z0Var.f3913k = "";
                            z0.t();
                            z0Var.v();
                            return;
                        }
                        if (z0Var.d.getText() != null) {
                            str2 = z0Var.d.getText().toString().trim();
                        }
                        boolean isEmpty = str2.isEmpty();
                        EditText editText = z0Var.d;
                        if (isEmpty) {
                            editText.setError(z0Var.getString(R.string.log_keycode_filter_required));
                            return;
                        }
                        editText.setError(null);
                        try {
                            if (h0.b.a().j() == null) {
                                z0Var.e.setText(R.string.log_keycode_status_unavailable);
                            } else {
                                h0.b.a().j().lo(z0.f3906n, null, null);
                                z0Var.f3913k = str2;
                                z0Var.f3912j = true;
                                z0Var.v();
                            }
                            return;
                        } catch (Exception unused) {
                            z0Var.e.setText(R.string.log_keycode_status_unavailable);
                            return;
                        }
                }
            }
        });
        v1.d.a().d().e.observe(getViewLifecycleOwner(), new x0(this, 0));
        v();
        u();
    }

    public final void u() {
        int i10;
        TextView textView = this.f3908f;
        if (textView != null) {
            if (this.f3907b.isEmpty()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView.setVisibility(i10);
        }
    }

    public final void v() {
        int i10;
        int i11;
        Button button = this.f3909g;
        if (button != null && this.e != null && this.d != null) {
            if (this.f3912j) {
                i10 = R.string.log_keycode_stop;
            } else {
                i10 = R.string.log_keycode_start;
            }
            button.setText(i10);
            TextView textView = this.e;
            if (this.f3912j) {
                i11 = R.string.log_keycode_status_recording;
            } else {
                i11 = R.string.log_keycode_status_stopped;
            }
            textView.setText(i11);
            this.d.setEnabled(!this.f3912j);
        }
    }
}
