package t0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Spinner;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import java.util.ArrayList;
import java.util.List;
import w0.o0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public final List f5744a;

    /* renamed from: b, reason: collision with root package name */
    public final j0.c f5745b;

    public d(FragmentActivity fragmentActivity, ArrayList arrayList) {
        this.f5744a = arrayList;
        this.f5745b = new j0.c(fragmentActivity);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f5744a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        c cVar = (c) viewHolder;
        o0 o0Var = (o0) this.f5744a.get(i10);
        cVar.f5743b.setOnCheckedChangeListener(null);
        CheckBox checkBox = cVar.f5743b;
        checkBox.setChecked(o0Var.c);
        checkBox.setOnCheckedChangeListener(new a(o0Var, 0));
        Spinner spinner = cVar.f5742a;
        this.f5745b.n(spinner, o0Var.f6217b);
        spinner.setOnItemSelectedListener(new b(o0Var, 0));
        cVar.c.setOnClickListener(new androidx.navigation.ui.a(20, this, cVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_run_app_more_command, viewGroup, false));
    }
}
