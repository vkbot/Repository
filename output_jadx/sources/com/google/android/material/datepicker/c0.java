package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import java.util.Locale;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c0 extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public final n f1304a;

    public c0(n nVar) {
        this.f1304a = nVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f1304a.d.f1299g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        String format;
        b0 b0Var = (b0) viewHolder;
        n nVar = this.f1304a;
        int i11 = nVar.d.f1297b.d + i10;
        b0Var.f1301a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
        TextView textView = b0Var.f1301a;
        Context context = textView.getContext();
        if (a0.b().get(1) == i11) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i11));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i11));
        }
        textView.setContentDescription(format);
        c cVar = nVar.f1316g;
        if (a0.b().get(1) == i11) {
            p2.e eVar = cVar.f1303b;
        } else {
            p2.e eVar2 = cVar.f1302a;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
