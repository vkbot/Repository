package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l extends RecyclerView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f1312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f1313b;

    public l(n nVar, v vVar) {
        this.f1313b = nVar;
        this.f1312a = vVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        int findLastVisibleItemPosition;
        b bVar = this.f1312a.f1354a;
        n nVar = this.f1313b;
        RecyclerView recyclerView2 = nVar.f1318i;
        if (i10 < 0) {
            findLastVisibleItemPosition = ((LinearLayoutManager) recyclerView2.getLayoutManager()).findFirstVisibleItemPosition();
        } else {
            findLastVisibleItemPosition = ((LinearLayoutManager) recyclerView2.getLayoutManager()).findLastVisibleItemPosition();
        }
        Calendar a10 = a0.a(bVar.f1297b.f1345b);
        a10.add(2, findLastVisibleItemPosition);
        r rVar = new r(a10);
        nVar.e = rVar;
        MaterialButton materialButton = nVar.f1323n;
        Calendar a11 = a0.a(bVar.f1297b.f1345b);
        a11.add(2, findLastVisibleItemPosition);
        a11.set(5, 1);
        Calendar a12 = a0.a(a11);
        a12.get(2);
        a12.get(1);
        a12.getMaximum(7);
        a12.getActualMaximum(5);
        a12.getTimeInMillis();
        long timeInMillis = a12.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = a0.f1296a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        materialButton.setText(instanceForSkeleton.format(new Date(timeInMillis)));
        nVar.v(bVar.f1297b.t(rVar));
    }
}
