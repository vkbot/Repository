package m0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m0 extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3780a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f3781b;

    public m0(n0 n0Var) {
        this.f3781b = n0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f3780a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        l0 l0Var = (l0) viewHolder;
        k0 k0Var = (k0) this.f3780a.get(i10);
        l0Var.f3772a.setImageDrawable(k0Var.c);
        TextView textView = l0Var.f3773b;
        String str = k0Var.f3759b;
        textView.setText(str);
        CheckBox checkBox = l0Var.c;
        checkBox.setOnCheckedChangeListener(null);
        n0 n0Var = this.f3781b;
        checkBox.setChecked(o4.b.y(n0Var.e, k0Var.f3758a));
        boolean z9 = true;
        checkBox.setEnabled(!n0Var.d);
        checkBox.setContentDescription(n0Var.getString(R.string.fullscreen_apps_toggle_named, str));
        checkBox.setOnCheckedChangeListener(new e0.c3(1, this, k0Var));
        Button button = l0Var.d;
        if (n0Var.d || !k0Var.d) {
            z9 = false;
        }
        button.setEnabled(z9);
        button.setContentDescription(n0Var.getString(R.string.fullscreen_apps_launch_named, str));
        button.setOnClickListener(new androidx.navigation.ui.a(9, this, k0Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new l0(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_fullscreen_app, viewGroup, false));
    }
}
