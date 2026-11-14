package m0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class q1 extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public final List f3837a;

    /* renamed from: b, reason: collision with root package name */
    public final j0.c f3838b;
    public androidx.fragment.app.h c;
    public f5.j d;
    public int e = -1;

    public q1(FragmentActivity fragmentActivity, ArrayList arrayList) {
        this.f3837a = arrayList;
        this.f3838b = new j0.c(fragmentActivity);
    }

    public final void a(int i10) {
        int i11 = this.e;
        this.e = i10;
        if (i11 != -1) {
            notifyItemChanged(i11);
        }
        int i12 = this.e;
        if (i12 != -1) {
            notifyItemChanged(i12);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f3837a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        String trim;
        boolean z9;
        final p1 p1Var = (p1) viewHolder;
        w0.o0 o0Var = (w0.o0) this.f3837a.get(i10);
        String str = o0Var.f6216a;
        if (str == null) {
            trim = "";
        } else {
            trim = str.trim();
        }
        final int i11 = 0;
        final int i12 = 1;
        if (i10 == this.e) {
            z9 = true;
        } else {
            z9 = false;
        }
        Button button = p1Var.f3829a;
        Spinner spinner = p1Var.f3830b;
        CheckBox checkBox = p1Var.c;
        button.setActivated(z9);
        if (z9) {
            button.setText(e0.m.h(new byte[]{-84, 34, -99, 35, -68, -126, 42, 89, -84, 7, -100, 17, -68, -127, -38, 53, -58, 111, -16, 67, -46, -28, 69, 53, -58, 110, -50, -67, 66, 26}, new byte[]{124, -65, 77, -109, 108, 52, -6, -27}));
        } else if (trim.length() == 0) {
            button.setText(e0.m.h(new byte[]{18, -82, -45, 4, -61, 110, 44, 8, 18, -116, -45, 13, -62, 83, -35, 88, 120, -20, -65, 95, -83, 15, 66, 88, 120, -19, -127}, new byte[]{-62, 60, 2, -113, 19, -33, -3, -120}));
        } else {
            button.setText(trim);
        }
        button.setOnClickListener(new View.OnClickListener(this) { // from class: m0.o1
            public final /* synthetic */ q1 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                androidx.fragment.app.h hVar;
                e0 e0Var;
                ArrayList arrayList;
                int i13 = i11;
                p1 p1Var2 = p1Var;
                q1 q1Var = this.c;
                switch (i13) {
                    case 0:
                        int adapterPosition = p1Var2.getAdapterPosition();
                        if (adapterPosition != -1 && (hVar = q1Var.c) != null && (arrayList = (e0Var = (e0) hVar.c).f3661n) != null && adapterPosition >= 0 && adapterPosition < arrayList.size()) {
                            e0Var.f3665s = adapterPosition;
                            q1 q1Var2 = e0Var.f3660m;
                            if (q1Var2 != null) {
                                q1Var2.a(adapterPosition);
                            }
                            TextView textView = e0Var.f3655h;
                            if (textView != null) {
                                textView.setText(e0.m.h(new byte[]{3, -88, -8, 38, -95, 103, -56, -124, 3, -115, -7, 20, -95, 100, 56, -24, 110, -28, -85, 70, -57, 1, -91, -23, 80, -28, -90, -74, -95, 107, -56, -123, 3, -117, -8, 41, -95, 107, -55, -69, -13, -27, -107, 70, -63, -15, -56, -121, 3, -123, -8, 43, -95, 100, -56, -125, 3, -115}, new byte[]{-45, 53, 40, -106, 113, -47, 24, 56}));
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        List list = q1Var.f3837a;
                        int adapterPosition2 = p1Var2.getAdapterPosition();
                        if (adapterPosition2 != -1) {
                            list.remove(adapterPosition2);
                            q1Var.notifyItemRemoved(adapterPosition2);
                            q1Var.notifyItemRangeChanged(adapterPosition2, list.size());
                            f5.j jVar = q1Var.d;
                            if (jVar != null) {
                                jVar.run();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        checkBox.setOnCheckedChangeListener(null);
        checkBox.setChecked(o0Var.c);
        checkBox.setOnCheckedChangeListener(new e0.c3(2, this, o0Var));
        spinner.setOnItemSelectedListener(null);
        this.f3838b.n(spinner, o0Var.f6217b);
        spinner.setOnItemSelectedListener(new e0.d1(3, this, o0Var));
        p1Var.d.setOnClickListener(new View.OnClickListener(this) { // from class: m0.o1
            public final /* synthetic */ q1 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                androidx.fragment.app.h hVar;
                e0 e0Var;
                ArrayList arrayList;
                int i13 = i12;
                p1 p1Var2 = p1Var;
                q1 q1Var = this.c;
                switch (i13) {
                    case 0:
                        int adapterPosition = p1Var2.getAdapterPosition();
                        if (adapterPosition != -1 && (hVar = q1Var.c) != null && (arrayList = (e0Var = (e0) hVar.c).f3661n) != null && adapterPosition >= 0 && adapterPosition < arrayList.size()) {
                            e0Var.f3665s = adapterPosition;
                            q1 q1Var2 = e0Var.f3660m;
                            if (q1Var2 != null) {
                                q1Var2.a(adapterPosition);
                            }
                            TextView textView = e0Var.f3655h;
                            if (textView != null) {
                                textView.setText(e0.m.h(new byte[]{3, -88, -8, 38, -95, 103, -56, -124, 3, -115, -7, 20, -95, 100, 56, -24, 110, -28, -85, 70, -57, 1, -91, -23, 80, -28, -90, -74, -95, 107, -56, -123, 3, -117, -8, 41, -95, 107, -55, -69, -13, -27, -107, 70, -63, -15, -56, -121, 3, -123, -8, 43, -95, 100, -56, -125, 3, -115}, new byte[]{-45, 53, 40, -106, 113, -47, 24, 56}));
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        List list = q1Var.f3837a;
                        int adapterPosition2 = p1Var2.getAdapterPosition();
                        if (adapterPosition2 != -1) {
                            list.remove(adapterPosition2);
                            q1Var.notifyItemRemoved(adapterPosition2);
                            q1Var.notifyItemRangeChanged(adapterPosition2, list.size());
                            f5.j jVar = q1Var.d;
                            if (jVar != null) {
                                jVar.run();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new p1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_physical_button_command, viewGroup, false));
    }
}
