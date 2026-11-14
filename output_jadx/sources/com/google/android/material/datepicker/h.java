package com.google.android.material.datepicker;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h extends y {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1309b;
    public final /* synthetic */ n c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, Context context, int i10, int i11) {
        super(context, i10, false);
        this.c = nVar;
        this.f1309b = i11;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
        n nVar = this.c;
        RecyclerView recyclerView = nVar.f1318i;
        if (this.f1309b == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = nVar.f1318i.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = nVar.f1318i.getHeight();
        }
    }
}
