package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.navistart.R;
import java.util.Calendar;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class s extends BaseAdapter {
    public static final int e = a0.c(null).getMaximum(4);

    /* renamed from: f, reason: collision with root package name */
    public static final int f1349f = (a0.c(null).getMaximum(7) + a0.c(null).getMaximum(5)) - 1;

    /* renamed from: b, reason: collision with root package name */
    public final r f1350b;
    public c c;
    public final b d;

    public s(r rVar, b bVar) {
        this.f1350b = rVar;
        this.d = bVar;
        throw null;
    }

    public final int a() {
        int i10 = this.d.f1298f;
        r rVar = this.f1350b;
        Calendar calendar = rVar.f1345b;
        int i11 = calendar.get(7);
        if (i10 <= 0) {
            i10 = calendar.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        if (i12 < 0) {
            return i12 + rVar.e;
        }
        return i12;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i10) {
        if (i10 >= a() && i10 <= c()) {
            int a10 = (i10 - a()) + 1;
            Calendar a11 = a0.a(this.f1350b.f1345b);
            a11.set(5, a10);
            return Long.valueOf(a11.getTimeInMillis());
        }
        return null;
    }

    public final int c() {
        return (a() + this.f1350b.f1346f) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f1349f;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10 / this.f1350b.e;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.c == null) {
            this.c = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a10 = i10 - a();
        if (a10 >= 0) {
            r rVar = this.f1350b;
            if (a10 < rVar.f1346f) {
                textView.setTag(rVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(a10 + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i10) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                a0.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i10) == null) {
            textView.getContext();
            a0.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
