package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.ViewCompat;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1293b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a0.c(null);
        if (p.v(R.attr.windowFullscreen, getContext())) {
            setNextFocusLeftId(com.example.navistart.R.id.cancel_button);
            setNextFocusRightId(com.example.navistart.R.id.confirm_button);
        }
        this.f1293b = p.v(com.example.navistart.R.attr.nestedScrollable, getContext());
        ViewCompat.setAccessibilityDelegate(this, new g(2));
    }

    public final s a() {
        return (s) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (s) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((s) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        s sVar = (s) super.getAdapter();
        sVar.getClass();
        int max = Math.max(sVar.a(), getFirstVisiblePosition());
        int min = Math.min(sVar.c(), getLastVisiblePosition());
        sVar.getItem(max);
        sVar.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z9, int i10, Rect rect) {
        if (z9) {
            if (i10 == 33) {
                setSelection(((s) super.getAdapter()).c());
                return;
            } else if (i10 == 130) {
                setSelection(((s) super.getAdapter()).a());
                return;
            } else {
                super.onFocusChanged(true, i10, rect);
                return;
            }
        }
        super.onFocusChanged(false, i10, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= ((s) super.getAdapter()).a() && selectedItemPosition <= ((s) super.getAdapter()).c())) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(((s) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f1293b) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(ViewCompat.MEASURED_SIZE_MASK, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof s) {
            super.setAdapter(listAdapter);
        } else {
            n0.b.v("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), s.class.getCanonicalName()});
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i10) {
        if (i10 < ((s) super.getAdapter()).a()) {
            super.setSelection(((s) super.getAdapter()).a());
        } else {
            super.setSelection(i10);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (s) super.getAdapter();
    }
}
