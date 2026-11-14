package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;
import java.util.Calendar;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class v extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    public final b f1354a;

    /* renamed from: b, reason: collision with root package name */
    public final i f1355b;
    public final int c;

    public v(ContextThemeWrapper contextThemeWrapper, b bVar, i iVar) {
        int i10;
        r rVar = bVar.f1297b;
        r rVar2 = bVar.c;
        r rVar3 = bVar.e;
        if (rVar.f1345b.compareTo(rVar3.f1345b) <= 0) {
            if (rVar3.f1345b.compareTo(rVar2.f1345b) <= 0) {
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * s.e;
                if (p.v(android.R.attr.windowFullscreen, contextThemeWrapper)) {
                    i10 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i10 = 0;
                }
                this.c = dimensionPixelSize + i10;
                this.f1354a = bVar;
                this.f1355b = iVar;
                setHasStableIds(true);
                return;
            }
            j1.i.k("currentPage cannot be after lastPage");
            throw null;
        }
        j1.i.k("firstPage cannot be after currentPage");
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f1354a.f1300h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i10) {
        Calendar a10 = a0.a(this.f1354a.f1297b.f1345b);
        a10.add(2, i10);
        a10.set(5, 1);
        Calendar a11 = a0.a(a10);
        a11.get(2);
        a11.get(1);
        a11.getMaximum(7);
        a11.getActualMaximum(5);
        a11.getTimeInMillis();
        return a11.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        u uVar = (u) viewHolder;
        b bVar = this.f1354a;
        Calendar a10 = a0.a(bVar.f1297b.f1345b);
        a10.add(2, i10);
        r rVar = new r(a10);
        uVar.f1352a.setText(rVar.s());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) uVar.f1353b.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() != null && rVar.equals(materialCalendarGridView.a().f1350b)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.a().getClass();
            throw null;
        }
        new s(rVar, bVar);
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (p.v(android.R.attr.windowFullscreen, viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.c));
            return new u(linearLayout, true);
        }
        return new u(linearLayout, false);
    }
}
