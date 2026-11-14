package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1307b;
    public final /* synthetic */ v c;
    public final /* synthetic */ n d;

    public /* synthetic */ f(n nVar, v vVar, int i10) {
        this.f1307b = i10;
        this.d = nVar;
        this.c = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1307b) {
            case 0:
                n nVar = this.d;
                int findLastVisibleItemPosition = ((LinearLayoutManager) nVar.f1318i.getLayoutManager()).findLastVisibleItemPosition() - 1;
                Calendar a10 = a0.a(this.c.f1354a.f1297b.f1345b);
                a10.add(2, findLastVisibleItemPosition);
                nVar.t(new r(a10));
                return;
            default:
                n nVar2 = this.d;
                int findFirstVisibleItemPosition = ((LinearLayoutManager) nVar2.f1318i.getLayoutManager()).findFirstVisibleItemPosition() + 1;
                Calendar a11 = a0.a(this.c.f1354a.f1297b.f1345b);
                a11.add(2, findFirstVisibleItemPosition);
                nVar2.t(new r(a11));
                return;
        }
    }
}
