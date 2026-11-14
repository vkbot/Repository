package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import o7.n0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class n<S> extends w {
    public int c;
    public b d;
    public r e;

    /* renamed from: f, reason: collision with root package name */
    public int f1315f;

    /* renamed from: g, reason: collision with root package name */
    public c f1316g;

    /* renamed from: h, reason: collision with root package name */
    public RecyclerView f1317h;

    /* renamed from: i, reason: collision with root package name */
    public RecyclerView f1318i;

    /* renamed from: j, reason: collision with root package name */
    public View f1319j;

    /* renamed from: k, reason: collision with root package name */
    public View f1320k;

    /* renamed from: l, reason: collision with root package name */
    public View f1321l;

    /* renamed from: m, reason: collision with root package name */
    public View f1322m;

    /* renamed from: n, reason: collision with root package name */
    public MaterialButton f1323n;

    /* renamed from: o, reason: collision with root package name */
    public AccessibilityManager f1324o;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.c = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") == null) {
            this.d = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.e = (r) bundle.getParcelable("CURRENT_MONTH_KEY");
                return;
            } else {
                n0.b.a();
                return;
            }
        }
        n0.b.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        e eVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.c);
        this.f1316g = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f1324o = (AccessibilityManager) requireContext().getSystemService("accessibility");
        r rVar = this.d.f1297b;
        if (p.v(R.attr.windowFullscreen, contextThemeWrapper)) {
            i10 = com.example.navistart.R.layout.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = com.example.navistart.R.layout.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View inflate = cloneInContext.inflate(i10, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.example.navistart.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.example.navistart.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.example.navistart.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.example.navistart.R.dimen.mtrl_calendar_days_of_week_height);
        int i12 = s.e;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.example.navistart.R.dimen.mtrl_calendar_month_vertical_padding) * (i12 - 1)) + (resources.getDimensionPixelSize(com.example.navistart.R.dimen.mtrl_calendar_day_height) * i12) + resources.getDimensionPixelOffset(com.example.navistart.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.example.navistart.R.id.mtrl_calendar_days_of_week);
        ViewCompat.setAccessibilityDelegate(gridView, new g(0));
        int i13 = this.d.f1298f;
        if (i13 > 0) {
            eVar = new e(i13);
        } else {
            eVar = new e();
        }
        gridView.setAdapter((ListAdapter) eVar);
        gridView.setNumColumns(rVar.e);
        gridView.setEnabled(false);
        this.f1318i = (RecyclerView) inflate.findViewById(com.example.navistart.R.id.mtrl_calendar_months);
        this.f1318i.setLayoutManager(new h(this, getContext(), i11, i11));
        this.f1318i.setTag("MONTHS_VIEW_GROUP_TAG");
        v vVar = new v(contextThemeWrapper, this.d, new i(this));
        this.f1318i.setAdapter(vVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.example.navistart.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(com.example.navistart.R.id.mtrl_calendar_year_selector_frame);
        this.f1317h = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f1317h.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f1317h.setAdapter(new c0(this));
            RecyclerView recyclerView2 = this.f1317h;
            RecyclerView.ItemDecoration itemDecoration = new RecyclerView.ItemDecoration();
            a0.c(null);
            a0.c(null);
            recyclerView2.addItemDecoration(itemDecoration);
        }
        View findViewById = inflate.findViewById(com.example.navistart.R.id.month_navigation_fragment_toggle);
        b bVar = vVar.f1354a;
        if (findViewById != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.example.navistart.R.id.month_navigation_fragment_toggle);
            this.f1323n = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ViewCompat.setAccessibilityDelegate(this.f1323n, new k(this));
            View findViewById2 = inflate.findViewById(com.example.navistart.R.id.month_navigation_previous);
            this.f1319j = findViewById2;
            findViewById2.setTag("NAVIGATION_PREV_TAG");
            View findViewById3 = inflate.findViewById(com.example.navistart.R.id.month_navigation_next);
            this.f1320k = findViewById3;
            findViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.f1321l = inflate.findViewById(com.example.navistart.R.id.mtrl_calendar_year_selector_frame);
            this.f1322m = inflate.findViewById(com.example.navistart.R.id.mtrl_calendar_day_selector_frame);
            u(1);
            this.f1323n.setText(this.e.s());
            this.f1318i.addOnScrollListener(new l(this, vVar));
            this.f1323n.setOnClickListener(new m(0, this));
            this.f1320k.setOnClickListener(new f(this, vVar, 1));
            this.f1319j.setOnClickListener(new f(this, vVar, 0));
            v(bVar.f1297b.t(this.e));
        }
        if (!p.v(R.attr.windowFullscreen, contextThemeWrapper)) {
            new PagerSnapHelper().attachToRecyclerView(this.f1318i);
        }
        this.f1318i.scrollToPosition(bVar.f1297b.t(this.e));
        ViewCompat.setAccessibilityDelegate(this.f1318i, new g(1));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.c);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.d);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.e);
    }

    public final void t(r rVar) {
        boolean z9;
        v vVar = (v) this.f1318i.getAdapter();
        int t = vVar.f1354a.f1297b.t(rVar);
        AccessibilityManager accessibilityManager = this.f1324o;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            this.e = rVar;
            this.f1318i.scrollToPosition(t);
        } else {
            int t3 = t - vVar.f1354a.f1297b.t(this.e);
            boolean z10 = false;
            if (Math.abs(t3) > 3) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (t3 > 0) {
                z10 = true;
            }
            this.e = rVar;
            if (z9 && z10) {
                this.f1318i.scrollToPosition(t - 3);
                this.f1318i.post(new n0(this, t, 2));
            } else {
                RecyclerView recyclerView = this.f1318i;
                if (z9) {
                    recyclerView.scrollToPosition(t + 3);
                    this.f1318i.post(new n0(this, t, 2));
                } else {
                    recyclerView.post(new n0(this, t, 2));
                }
            }
        }
        v(t);
    }

    public final void u(int i10) {
        this.f1315f = i10;
        if (i10 == 2) {
            this.f1317h.getLayoutManager().scrollToPosition(this.e.d - ((c0) this.f1317h.getAdapter()).f1304a.d.f1297b.d);
            this.f1321l.setVisibility(0);
            this.f1322m.setVisibility(8);
            this.f1319j.setVisibility(8);
            this.f1320k.setVisibility(8);
            return;
        }
        if (i10 == 1) {
            this.f1321l.setVisibility(8);
            this.f1322m.setVisibility(0);
            this.f1319j.setVisibility(0);
            this.f1320k.setVisibility(0);
            t(this.e);
        }
    }

    public final void v(int i10) {
        boolean z9;
        View view = this.f1320k;
        boolean z10 = false;
        if (i10 + 1 < this.f1318i.getAdapter().getItemCount()) {
            z9 = true;
        } else {
            z9 = false;
        }
        view.setEnabled(z9);
        View view2 = this.f1319j;
        if (i10 - 1 >= 0) {
            z10 = true;
        }
        view2.setEnabled(z10);
    }
}
