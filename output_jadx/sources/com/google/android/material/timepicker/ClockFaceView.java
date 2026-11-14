package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.example.navistart.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
class ClockFaceView extends g implements e {
    public final ClockHandView e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f1488f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f1489g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f1490h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseArray f1491i;

    /* renamed from: j, reason: collision with root package name */
    public final c f1492j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f1493k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f1494l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1495m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1496n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1497o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1498p;

    /* renamed from: q, reason: collision with root package name */
    public final String[] f1499q;
    public float r;

    /* renamed from: s, reason: collision with root package name */
    public final ColorStateList f1500s;

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1488f = new Rect();
        this.f1489g = new RectF();
        this.f1490h = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f1491i = sparseArray;
        this.f1494l = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a3.a.f10g, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a10 = w3.c.a(context, obtainStyledAttributes, 1);
        this.f1500s = a10;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.e = clockHandView;
        this.f1495m = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = a10.getColorForState(new int[]{android.R.attr.state_selected}, a10.getDefaultColor());
        this.f1493k = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.d.add(this);
        int defaultColor = AppCompatResources.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList a11 = w3.c.a(context, obtainStyledAttributes, 0);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        obtainStyledAttributes.recycle();
        this.f1492j = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f1499q = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z9 = false;
        for (int i10 = 0; i10 < Math.max(this.f1499q.length, size); i10++) {
            TextView textView = (TextView) sparseArray.get(i10);
            if (i10 >= this.f1499q.length) {
                removeView(textView);
                sparseArray.remove(i10);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i10, textView);
                    addView(textView);
                }
                textView.setText(this.f1499q[i10]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i10));
                int i11 = (i10 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i11));
                z9 = i11 > 1 ? true : z9;
                ViewCompat.setAccessibilityDelegate(textView, this.f1492j);
                textView.setTextColor(this.f1500s);
            }
        }
        ClockHandView clockHandView2 = this.e;
        if (clockHandView2.c && !z9) {
            clockHandView2.f1511n = 1;
        }
        clockHandView2.c = z9;
        clockHandView2.invalidate();
        this.f1496n = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f1497o = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f1498p = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.g
    public final void a() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i11 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!hashMap.containsKey(i11)) {
                    hashMap.put(i11, new ArrayList());
                }
                ((List) hashMap.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int intValue = ((Integer) entry.getKey()).intValue();
            int i12 = this.c;
            if (intValue == 2) {
                i12 = Math.round(i12 * 0.66f);
            }
            Iterator it = list.iterator();
            float f8 = 0.0f;
            while (it.hasNext()) {
                constraintSet.constrainCircle(((View) it.next()).getId(), R.id.circle_center, i12, f8);
                f8 += 360.0f / list.size();
            }
        }
        constraintSet.applyTo(this);
        int i13 = 0;
        while (true) {
            SparseArray sparseArray = this.f1491i;
            if (i13 < sparseArray.size()) {
                ((TextView) sparseArray.get(i13)).setVisibility(0);
                i13++;
            } else {
                return;
            }
        }
    }

    public final void b() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        boolean z9;
        RadialGradient radialGradient;
        RectF rectF2 = this.e.f1505h;
        float f8 = Float.MAX_VALUE;
        TextView textView = null;
        int i10 = 0;
        while (true) {
            sparseArray = this.f1491i;
            int size = sparseArray.size();
            rect = this.f1488f;
            rectF = this.f1489g;
            if (i10 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f8) {
                    textView = textView2;
                    f8 = height;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            TextView textView3 = (TextView) sparseArray.get(i11);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                textView3.setSelected(z9);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f1490h);
                rectF.inset(r8.left, r8.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f1493k, this.f1494l, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.f1499q.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        b();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f1498p / Math.max(Math.max(this.f1496n / displayMetrics.heightPixels, this.f1497o / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, BasicMeasure.EXACTLY);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
