package com.google.android.material.datepicker;

import android.animation.AnimatorSet;
import android.os.Handler;
import android.view.View;
import com.example.navistart.R;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1314b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(int i10, Object obj) {
        this.f1314b = i10;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1314b) {
            case 0:
                n nVar = (n) this.c;
                int i10 = nVar.f1315f;
                if (i10 == 2) {
                    nVar.u(1);
                    nVar.f1318i.announceForAccessibility(nVar.getString(R.string.mtrl_picker_toggled_to_day_selection));
                    return;
                } else {
                    if (i10 == 1) {
                        nVar.u(2);
                        nVar.f1317h.announceForAccessibility(nVar.getString(R.string.mtrl_picker_toggled_to_year_selection));
                        return;
                    }
                    return;
                }
            case 1:
                ((Runnable) this.c).run();
                return;
            case 2:
                FloatingActionButton floatingActionButton = (FloatingActionButton) this.c;
                View.OnClickListener onClickListener = floatingActionButton.f1093q;
                if (onClickListener != null) {
                    onClickListener.onClick(floatingActionButton);
                    return;
                }
                return;
            default:
                FloatingActionMenu floatingActionMenu = (FloatingActionMenu) this.c;
                boolean z9 = floatingActionMenu.M;
                boolean z10 = floatingActionMenu.f1116k;
                if (z10) {
                    floatingActionMenu.a(z9);
                    return;
                }
                Handler handler = floatingActionMenu.f1119m;
                if (!z10) {
                    if (floatingActionMenu.f1109g0 != 0) {
                        floatingActionMenu.f1105e0.start();
                    }
                    if (floatingActionMenu.T) {
                        AnimatorSet animatorSet = floatingActionMenu.d;
                        if (animatorSet != null) {
                            animatorSet.start();
                        } else {
                            floatingActionMenu.c.cancel();
                            floatingActionMenu.f1101b.start();
                        }
                    }
                    floatingActionMenu.f1118l = true;
                    int i11 = 0;
                    int i12 = 0;
                    for (int childCount = floatingActionMenu.getChildCount() - 1; childCount >= 0; childCount--) {
                        View childAt = floatingActionMenu.getChildAt(childCount);
                        if ((childAt instanceof FloatingActionButton) && childAt.getVisibility() != 8) {
                            i11++;
                            handler.postDelayed(new z1.g(floatingActionMenu, (FloatingActionButton) childAt, z9, 0), i12);
                            i12 += floatingActionMenu.J;
                        }
                    }
                    handler.postDelayed(new z1.h(floatingActionMenu, 0), (i11 + 1) * floatingActionMenu.J);
                    return;
                }
                return;
        }
    }
}
