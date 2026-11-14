package h3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.example.navistart.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import m0.e1;
import n.p;
import org.xmlpull.v1.XmlPullParserException;
import s3.l;
import z3.a0;
import z3.b0;
import z3.c0;
import z3.d0;
import z3.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class e extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2553b;
    public final ArrayList c;
    public final r5.c d;
    public final d e;

    /* renamed from: f, reason: collision with root package name */
    public Integer[] f2554f;

    /* renamed from: g, reason: collision with root package name */
    public a0 f2555g;

    /* renamed from: h, reason: collision with root package name */
    public b0 f2556h;

    /* renamed from: i, reason: collision with root package name */
    public int f2557i;

    /* renamed from: j, reason: collision with root package name */
    public d0 f2558j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2559k;

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, z3.d0] */
    public e(Context context, AttributeSet attributeSet) {
        super(g4.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        a0 b10;
        int next;
        XmlResourceParser xml;
        ?? obj;
        AttributeSet asAttributeSet;
        int next2;
        d0 d0Var;
        this.f2553b = new ArrayList();
        this.c = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.d = new r5.c(13, materialButtonToggleGroup);
        this.e = new d(0, materialButtonToggleGroup);
        this.f2559k = true;
        Context context2 = getContext();
        TypedArray d = l.d(context2, attributeSet, a3.a.f18o, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (d.hasValue(2)) {
            int resourceId = d.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        obj = new Object();
                        obj.c = new int[10];
                        obj.d = new p[10];
                        asAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
                if (next2 == 2) {
                    if (xml.getName().equals("selector")) {
                        obj.a(context2, xml, asAttributeSet, context2.getTheme());
                    }
                    xml.close();
                    d0Var = obj;
                    this.f2558j = d0Var;
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            }
            d0Var = null;
            this.f2558j = d0Var;
        }
        if (d.hasValue(4)) {
            b0 b11 = b0.b(context2, d, 4);
            this.f2556h = b11;
            if (b11 == null) {
                e1 e1Var = new e1(o.a(context2, d.getResourceId(4, 0), d.getResourceId(5, 0)).a());
                this.f2556h = e1Var.f3671b != 0 ? new b0(e1Var) : null;
            }
        }
        if (d.hasValue(3)) {
            z3.a aVar = new z3.a(0.0f);
            int resourceId2 = d.getResourceId(3, 0);
            if (resourceId2 == 0) {
                b10 = a0.b(o.d(d, 3, aVar));
            } else if (!context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                b10 = a0.b(o.d(d, 3, aVar));
            } else {
                try {
                    XmlResourceParser xml2 = context2.getResources().getXml(resourceId2);
                    try {
                        b10 = new a0();
                        AttributeSet asAttributeSet2 = Xml.asAttributeSet(xml2);
                        do {
                            next = xml2.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next == 2) {
                            if (xml2.getName().equals("selector")) {
                                b10.d(context2, xml2, asAttributeSet2, context2.getTheme());
                            }
                            xml2.close();
                        } else {
                            throw new XmlPullParserException("No start tag found");
                        }
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    b10 = a0.b(aVar);
                }
            }
            this.f2555g = b10;
        }
        this.f2557i = d.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(d.getBoolean(0, true));
        d.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (c(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int i10;
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i11 = firstVisibleChildIndex + 1; i11 < getChildCount(); i11++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i11);
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i11 - 1);
                if (this.f2557i <= 0) {
                    i10 = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                    i10 = 0;
                }
                ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    layoutParams.setMarginEnd(0);
                    layoutParams.setMarginStart(this.f2557i - i10);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = this.f2557i - i10;
                    layoutParams.setMarginStart(0);
                }
                materialButton.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                } else {
                    layoutParams3.setMarginEnd(0);
                    layoutParams3.setMarginStart(0);
                    layoutParams3.leftMargin = 0;
                    layoutParams3.rightMargin = 0;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.f2559k = true;
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.d);
        this.f2553b.add(materialButton.getShapeAppearanceModel());
        this.c.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        int i10;
        MaterialButton materialButton;
        MaterialButton materialButton2;
        int allowedWidthDecrease;
        float max;
        if (this.f2558j != null && getChildCount() != 0) {
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i11 = Integer.MAX_VALUE;
            for (int i12 = firstVisibleChildIndex; i12 <= lastVisibleChildIndex; i12++) {
                if (c(i12)) {
                    int i13 = 0;
                    if (c(i12) && this.f2558j != null) {
                        MaterialButton materialButton3 = (MaterialButton) getChildAt(i12);
                        d0 d0Var = this.f2558j;
                        int width = materialButton3.getWidth();
                        int i14 = -width;
                        for (int i15 = 0; i15 < d0Var.f6745a; i15++) {
                            c0 c0Var = (c0) d0Var.d[i15].c;
                            int i16 = c0Var.f6743a;
                            float f8 = c0Var.f6744b;
                            if (i16 == 2) {
                                max = Math.max(i14, f8);
                            } else if (i16 == 1) {
                                max = Math.max(i14, width * f8);
                            }
                            i14 = (int) max;
                        }
                        int max2 = Math.max(0, i14);
                        int i17 = i12 - 1;
                        while (true) {
                            materialButton = null;
                            if (i17 >= 0) {
                                if (c(i17)) {
                                    materialButton2 = (MaterialButton) getChildAt(i17);
                                    break;
                                }
                                i17--;
                            } else {
                                materialButton2 = null;
                                break;
                            }
                        }
                        if (materialButton2 == null) {
                            allowedWidthDecrease = 0;
                        } else {
                            allowedWidthDecrease = materialButton2.getAllowedWidthDecrease();
                        }
                        int childCount = getChildCount();
                        int i18 = i12 + 1;
                        while (true) {
                            if (i18 >= childCount) {
                                break;
                            }
                            if (c(i18)) {
                                materialButton = (MaterialButton) getChildAt(i18);
                                break;
                            }
                            i18++;
                        }
                        if (materialButton != null) {
                            i13 = materialButton.getAllowedWidthDecrease();
                        }
                        i13 = Math.min(max2, allowedWidthDecrease + i13);
                    }
                    if (i12 != firstVisibleChildIndex && i12 != lastVisibleChildIndex) {
                        i13 /= 2;
                    }
                    i11 = Math.min(i11, i13);
                }
            }
            for (int i19 = firstVisibleChildIndex; i19 <= lastVisibleChildIndex; i19++) {
                if (c(i19)) {
                    ((MaterialButton) getChildAt(i19)).setSizeChange(this.f2558j);
                    MaterialButton materialButton4 = (MaterialButton) getChildAt(i19);
                    if (i19 != firstVisibleChildIndex && i19 != lastVisibleChildIndex) {
                        i10 = i11 * 2;
                    } else {
                        i10 = i11;
                    }
                    materialButton4.setWidthChangeMax(i10);
                }
            }
        }
    }

    public final boolean c(int i10) {
        if (getChildAt(i10).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void d() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            LinearLayout.LayoutParams layoutParams = materialButton.t;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.t = null;
                materialButton.f1259q = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.e);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put((MaterialButton) getChildAt(i10), Integer.valueOf(i10));
        }
        this.f2554f = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [m0.e1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [z3.o[], java.io.Serializable] */
    public final void e() {
        boolean z9;
        boolean z10;
        e1 e1Var;
        boolean z11;
        boolean z12;
        int i10;
        b0 b0Var;
        if ((this.f2555g != null || this.f2556h != null) && this.f2559k) {
            this.f2559k = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            for (int i11 = 0; i11 < childCount; i11++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i11);
                if (materialButton.getVisibility() != 8) {
                    if (i11 == firstVisibleChildIndex) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (i11 == lastVisibleChildIndex) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b0 b0Var2 = this.f2556h;
                    if (b0Var2 == null || (!z9 && !z10)) {
                        b0Var2 = (b0) this.c.get(i11);
                    }
                    if (b0Var2 == null) {
                        e1Var = new e1((o) this.f2553b.get(i11));
                    } else {
                        ?? obj = new Object();
                        int i12 = b0Var2.f6737a;
                        obj.f3671b = i12;
                        obj.c = b0Var2.f6738b;
                        int[][] iArr = b0Var2.c;
                        int[][] iArr2 = new int[iArr.length];
                        obj.d = iArr2;
                        o[] oVarArr = b0Var2.d;
                        obj.e = new o[oVarArr.length];
                        System.arraycopy(iArr, 0, iArr2, 0, i12);
                        System.arraycopy(oVarArr, 0, (o[]) obj.e, 0, obj.f3671b);
                        obj.f3672f = b0Var2.e;
                        obj.f3673g = b0Var2.f6739f;
                        obj.f3674h = b0Var2.f6740g;
                        obj.f3675i = b0Var2.f6741h;
                        e1Var = obj;
                    }
                    if (getOrientation() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (getLayoutDirection() == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z11) {
                        if (z9) {
                            i10 = 5;
                        } else {
                            i10 = 0;
                        }
                        if (z10) {
                            i10 |= 10;
                        }
                        if (z12) {
                            i10 = ((i10 & 10) >> 1) | ((i10 & 5) << 1);
                        }
                    } else {
                        if (z9) {
                            i10 = 3;
                        } else {
                            i10 = 0;
                        }
                        if (z10) {
                            i10 |= 12;
                        }
                    }
                    int i13 = ~i10;
                    a0 a0Var = this.f2555g;
                    if ((i13 | 1) == i13) {
                        e1Var.f3672f = a0Var;
                    }
                    if ((i13 | 2) == i13) {
                        e1Var.f3673g = a0Var;
                    }
                    if ((i13 | 4) == i13) {
                        e1Var.f3674h = a0Var;
                    }
                    if ((i13 | 8) == i13) {
                        e1Var.f3675i = a0Var;
                    }
                    if (e1Var.f3671b == 0) {
                        b0Var = null;
                    } else {
                        b0Var = new b0(e1Var);
                    }
                    if (b0Var.d()) {
                        materialButton.setStateListShapeAppearanceModel(b0Var);
                    } else {
                        materialButton.setShapeAppearanceModel(b0Var.c());
                    }
                }
            }
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public d0 getButtonSizeChange() {
        return this.f2558j;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f2554f;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i11;
    }

    @NonNull
    public z3.d getInnerCornerSize() {
        return this.f2555g.f6734b;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public a0 getInnerCornerSizeStateList() {
        return this.f2555g;
    }

    @Nullable
    public o getShapeAppearance() {
        b0 b0Var = this.f2556h;
        if (b0Var == null) {
            return null;
        }
        return b0Var.c();
    }

    @Px
    public int getSpacing() {
        return this.f2557i;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public b0 getStateListShapeAppearance() {
        return this.f2556h;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        if (z9) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        e();
        a();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f2553b.remove(indexOfChild);
            this.c.remove(indexOfChild);
        }
        this.f2559k = true;
        e();
        d();
        a();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setButtonSizeChange(@NonNull d0 d0Var) {
        if (this.f2558j != d0Var) {
            this.f2558j = d0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setEnabled(z9);
        }
    }

    public void setInnerCornerSize(@NonNull z3.d dVar) {
        this.f2555g = a0.b(dVar);
        this.f2559k = true;
        e();
        invalidate();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInnerCornerSizeStateList(@NonNull a0 a0Var) {
        this.f2555g = a0Var;
        this.f2559k = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (getOrientation() != i10) {
            this.f2559k = true;
        }
        super.setOrientation(i10);
    }

    public void setShapeAppearance(@Nullable o oVar) {
        b0 b0Var;
        e1 e1Var = new e1(oVar);
        if (e1Var.f3671b == 0) {
            b0Var = null;
        } else {
            b0Var = new b0(e1Var);
        }
        this.f2556h = b0Var;
        this.f2559k = true;
        e();
        invalidate();
    }

    public void setSpacing(@Px int i10) {
        this.f2557i = i10;
        invalidate();
        requestLayout();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStateListShapeAppearance(@Nullable b0 b0Var) {
        this.f2556h = b0Var;
        this.f2559k = true;
        e();
        invalidate();
    }
}
