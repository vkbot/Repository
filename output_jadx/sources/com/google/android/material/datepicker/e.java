package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.navistart.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends BaseAdapter {
    public static final int e;

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f1306b;
    public final int c;
    public final int d;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 26) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        e = i10;
    }

    public e() {
        Calendar c = a0.c(null);
        this.f1306b = c;
        this.c = c.getMaximum(7);
        this.d = c.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.c;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        int i11 = this.c;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.d;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i11 = i10 + this.d;
        int i12 = this.c;
        if (i11 > i12) {
            i11 -= i12;
        }
        Calendar calendar = this.f1306b;
        calendar.set(7, i11);
        textView.setText(calendar.getDisplayName(7, e, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i10) {
        Calendar c = a0.c(null);
        this.f1306b = c;
        this.c = c.getMaximum(7);
        this.d = i10;
    }
}
