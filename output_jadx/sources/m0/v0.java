package m0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class v0 extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public final List f3880a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.fragment.app.h f3881b;

    public v0(ArrayList arrayList, androidx.fragment.app.h hVar) {
        this.f3880a = arrayList;
        this.f3881b = hVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f3880a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        String str;
        u0 u0Var = (u0) viewHolder;
        t0 t0Var = (t0) this.f3880a.get(i10);
        TextView textView = u0Var.f3868a;
        TextView textView2 = u0Var.f3869b;
        textView.setText(t0Var.f3858a.toDisplayValue());
        j0.e eVar = t0Var.f3859b;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f3099i;
        }
        if (t0Var.c && str != null && !str.trim().isEmpty()) {
            textView2.setText(u0Var.itemView.getContext().getString(R.string.log_keycode_saved_action_value, str));
        } else {
            textView2.setText(R.string.log_keycode_action_empty);
        }
        u0Var.itemView.setOnClickListener(new androidx.navigation.ui.a(10, this, u0Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new u0(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_log_keycode_event, viewGroup, false));
    }
}
