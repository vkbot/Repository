package m0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class y1 extends l0.b {
    public static final String e = e0.m.h(new byte[]{-113, -7, -69, 121, 8, -48, -3, 100, -112, -29, -89, 67, 54, -45, -24, 79, -119, -27, -69, 65, 26}, new byte[]{-3, -116, -43, 38, 105, -96, -115, 59});

    /* renamed from: f, reason: collision with root package name */
    public static final String f3900f = e0.m.h(new byte[]{43, 24, 69, 89, 57, -58, -32, -32, 52, 2, 89, 99, 7, -59, -11, -53, 45, 4, 69, 97, 43, -23, -44, -6, 21, 44, 114}, new byte[]{89, 109, 43, 6, 88, -74, -112, -65});

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f3901b;
    public t0.d c;
    public ArrayList d;

    static {
        e0.m.h(new byte[]{-45, -28, -10, -21, 90, -91, 65, -97, -48, -29, -10, -12, 64, -71, 123}, new byte[]{-96, -109, -87, -103, 47, -53, 30, -2});
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11 = 0;
        View inflate = layoutInflater.inflate(R.layout.run_app_more_settings_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recyclerVoiceCommands);
        this.f3901b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        h0.b.a();
        this.d = h0.b.f().i(e);
        t0.d dVar = new t0.d(requireActivity(), this.d);
        this.c = dVar;
        this.f3901b.setAdapter(dVar);
        final int i12 = 0;
        inflate.findViewById(R.id.btnAddCommand).setOnClickListener(new View.OnClickListener(this) { // from class: m0.x1
            public final /* synthetic */ y1 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i12;
                y1 y1Var = this.c;
                switch (i13) {
                    case 0:
                        y1Var.d.add(new w0.o0("", j0.e.c(n0.d.e, y1Var.requireActivity()), true, true));
                        y1Var.c.notifyItemInserted(y1Var.d.size() - 1);
                        return;
                    default:
                        String str = y1.e;
                        h0.b.a();
                        j0.c f8 = h0.b.f();
                        ArrayList arrayList = y1Var.d;
                        String str2 = y1.e;
                        f8.getClass();
                        j0.c.l(str2, arrayList);
                        l0.a aVar = (l0.a) y1Var.getParentFragment();
                        if (aVar != null) {
                            aVar.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.about_run_app_more_delay);
        TextView textView = (TextView) inflate.findViewById(R.id.textView_about_run_app_more_delay);
        u0.a o5 = h0.b.o();
        String str = f3900f;
        int loadInt = o5.loadInt(str, 1);
        int i13 = loadInt - 1;
        if (i13 >= 0) {
            i11 = i13;
        }
        if (i11 > 19) {
            i10 = 19;
        } else {
            i10 = i11;
        }
        seekBar.post(new i7.t(seekBar, i10, textView, loadInt, 1));
        seekBar.setMax(19);
        final int i14 = 1;
        seekBar.setOnSeekBarChangeListener(new i7.u(textView, str, 1));
        inflate.findViewById(R.id.btnSave).setOnClickListener(new View.OnClickListener(this) { // from class: m0.x1
            public final /* synthetic */ y1 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = i14;
                y1 y1Var = this.c;
                switch (i132) {
                    case 0:
                        y1Var.d.add(new w0.o0("", j0.e.c(n0.d.e, y1Var.requireActivity()), true, true));
                        y1Var.c.notifyItemInserted(y1Var.d.size() - 1);
                        return;
                    default:
                        String str2 = y1.e;
                        h0.b.a();
                        j0.c f8 = h0.b.f();
                        ArrayList arrayList = y1Var.d;
                        String str22 = y1.e;
                        f8.getClass();
                        j0.c.l(str22, arrayList);
                        l0.a aVar = (l0.a) y1Var.getParentFragment();
                        if (aVar != null) {
                            aVar.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        return inflate;
    }
}
