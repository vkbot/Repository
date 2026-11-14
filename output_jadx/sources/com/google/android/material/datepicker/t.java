package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f1351b;
    public final /* synthetic */ v c;

    public t(v vVar, MaterialCalendarGridView materialCalendarGridView) {
        this.c = vVar;
        this.f1351b = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        MaterialCalendarGridView materialCalendarGridView = this.f1351b;
        s a10 = materialCalendarGridView.a();
        if (i10 >= a10.a() && i10 <= a10.c()) {
            if (materialCalendarGridView.a().getItem(i10).longValue() < this.c.f1355b.f1310a.d.d.f1305b) {
            } else {
                throw null;
            }
        }
    }
}
