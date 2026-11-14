package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.BoolRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.example.navistart.R;
import g4.a;
import h3.e;
import h3.g;
import h3.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import s3.l;
import z3.a0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends e {
    public static final /* synthetic */ int r = 0;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f1266l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1267m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1268n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1269o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1270p;

    /* renamed from: q, reason: collision with root package name */
    public HashSet f1271q;

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet);
        this.f1266l = new LinkedHashSet();
        this.f1267m = false;
        this.f1271q = new HashSet();
        TypedArray d = l.d(getContext(), attributeSet, a3.a.f19p, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(d.getBoolean(7, false));
        this.f1270p = d.getResourceId(2, -1);
        this.f1269o = d.getBoolean(4, false);
        if (this.f2555g == null) {
            this.f2555g = a0.b(new z3.a(0.0f));
        }
        setEnabled(d.getBoolean(0, true));
        d.recycle();
        setImportantForAccessibility(1);
    }

    @NonNull
    private String getChildrenA11yClassName() {
        Class cls;
        if (this.f1268n) {
            cls = RadioButton.class;
        } else {
            cls = ToggleButton.class;
        }
        return cls.getName();
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && getChildAt(i11).getVisibility() != 8) {
                i10++;
            }
        }
        return i10;
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // h3.e, android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        f(materialButton.getId(), materialButton.f1255m);
        ViewCompat.setAccessibilityDelegate(materialButton, new g(this));
    }

    public final void f(int i10, boolean z9) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f1271q);
        if (z9 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f1268n && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else if (!z9 && hashSet.contains(Integer.valueOf(i10))) {
            if (!this.f1269o || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        } else {
            return;
        }
        g(hashSet);
    }

    public final void g(Set set) {
        HashSet hashSet = this.f1271q;
        this.f1271q = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = ((MaterialButton) getChildAt(i10)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f1267m = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f1267m = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                boolean contains2 = set.contains(Integer.valueOf(id));
                Iterator it = this.f1266l.iterator();
                while (it.hasNext()) {
                    ((h) it.next()).a(id, contains2);
                }
            }
        }
        invalidate();
    }

    @IdRes
    public int getCheckedButtonId() {
        if (this.f1268n && !this.f1271q.isEmpty()) {
            return ((Integer) this.f1271q.iterator().next()).intValue();
        }
        return -1;
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = ((MaterialButton) getChildAt(i10)).getId();
            if (this.f1271q.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f1270p;
        if (i10 != -1) {
            g(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f1268n) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        wrap.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, visibleButtonCount, false, i10));
    }

    public void setSelectionRequired(boolean z9) {
        this.f1269o = z9;
    }

    public void setSingleSelection(boolean z9) {
        if (this.f1268n != z9) {
            this.f1268n = z9;
            g(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(@BoolRes int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
