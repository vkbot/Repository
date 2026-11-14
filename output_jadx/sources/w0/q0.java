package w0;

import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class q0 extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public final List f6222a;

    /* renamed from: b, reason: collision with root package name */
    public final j0.c f6223b;

    public q0(FragmentActivity fragmentActivity, ArrayList arrayList) {
        this.f6222a = arrayList;
        this.f6223b = new j0.c(fragmentActivity);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f6222a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        p0 p0Var = (p0) viewHolder;
        o0 o0Var = (o0) this.f6222a.get(i10);
        EditText editText = p0Var.f6219a;
        Spinner spinner = p0Var.f6220b;
        CheckBox checkBox = p0Var.c;
        if (editText.getTag() instanceof TextWatcher) {
            editText.removeTextChangedListener((TextWatcher) editText.getTag());
        }
        editText.setText(o0Var.f6216a);
        e0.a1 a1Var = new e0.a1(3, o0Var);
        editText.addTextChangedListener(a1Var);
        editText.setTag(a1Var);
        checkBox.setOnCheckedChangeListener(null);
        checkBox.setChecked(o0Var.c);
        checkBox.setOnCheckedChangeListener(new t0.a(o0Var, 1));
        this.f6223b.n(spinner, o0Var.f6217b);
        spinner.setOnItemSelectedListener(new t0.b(o0Var, 1));
        p0Var.d.setOnClickListener(new androidx.navigation.ui.a(23, this, p0Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new p0(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_voice_command, viewGroup, false));
    }
}
