package m0;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.navistart.DialogUni.Fragmenti.MaxHeightRecyclerView;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n0 extends l0.b {

    /* renamed from: k, reason: collision with root package name */
    public static final String f3795k = e0.m.h(new byte[]{-124, 68, 57, -114, 103, 63, -63, 58, -89, 95, 20, -110, 100, 47}, new byte[]{-62, 49, 85, -30, 20, 92, -77, 95});

    /* renamed from: b, reason: collision with root package name */
    public final Handler f3796b = new Handler(Looper.getMainLooper());
    public volatile int c;
    public boolean d;
    public String e;

    /* renamed from: f, reason: collision with root package name */
    public MaxHeightRecyclerView f3797f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f3798g;

    /* renamed from: h, reason: collision with root package name */
    public View f3799h;

    /* renamed from: i, reason: collision with root package name */
    public View f3800i;

    /* renamed from: j, reason: collision with root package name */
    public m0 f3801j;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_fullscreen_apps, viewGroup, false);
        this.c++;
        this.d = false;
        float f8 = getResources().getDisplayMetrics().density;
        inflate.setLayoutParams(new ViewGroup.LayoutParams(Math.min((int) (600.0f * f8), Math.max(1, getResources().getDisplayMetrics().widthPixels - ((int) (64.0f * f8)))), -2));
        MaxHeightRecyclerView maxHeightRecyclerView = (MaxHeightRecyclerView) inflate.findViewById(R.id.fullscreenApps);
        this.f3797f = maxHeightRecyclerView;
        maxHeightRecyclerView.setMaxHeight(Math.max((int) (96.0f * f8), Math.min((int) (480.0f * f8), getResources().getDisplayMetrics().heightPixels - ((int) (f8 * 240.0f)))));
        this.f3797f.setLayoutManager(new LinearLayoutManager(requireContext()));
        this.f3798g = (TextView) inflate.findViewById(R.id.fullscreenStatus);
        this.f3799h = inflate.findViewById(R.id.fullscreenProgress);
        this.f3800i = inflate.findViewById(R.id.fullscreenDescription);
        m0 m0Var = new m0(this);
        this.f3801j = m0Var;
        this.f3797f.setAdapter(m0Var);
        inflate.findViewById(R.id.fullscreenBack).setOnClickListener(new androidx.navigation.c(15, this));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.c++;
        this.f3796b.removeCallbacksAndMessages(null);
        MaxHeightRecyclerView maxHeightRecyclerView = this.f3797f;
        if (maxHeightRecyclerView != null) {
            maxHeightRecyclerView.setAdapter(null);
        }
        this.f3797f = null;
        this.f3798g = null;
        this.f3799h = null;
        this.f3800i = null;
        this.f3801j = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.d && this.f3797f != null) {
            this.d = true;
            int i10 = this.c;
            Context applicationContext = requireContext().getApplicationContext();
            this.f3799h.setVisibility(0);
            this.f3798g.setVisibility(0);
            this.f3798g.setText(R.string.fullscreen_apps_loading);
            this.f3797f.setVisibility(8);
            this.f3800i.setVisibility(8);
            e0.w.c(-1, f3795k).execute(new androidx.activity.f(this, applicationContext, i10, 6));
        }
    }

    public final boolean t(int i10) {
        if (i10 == this.c && isAdded() && this.f3797f != null) {
            return true;
        }
        return false;
    }

    public final void u(int i10) {
        if (!t(i10)) {
            return;
        }
        this.d = false;
        this.f3797f.setVisibility(8);
        this.f3800i.setVisibility(8);
        this.f3799h.setVisibility(8);
        this.f3798g.setVisibility(0);
        this.f3798g.setText(R.string.fullscreen_apps_incompatible);
    }
}
