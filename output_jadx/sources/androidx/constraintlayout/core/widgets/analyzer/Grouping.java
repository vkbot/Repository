package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class Grouping {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_GROUPING = false;
    private static final boolean FORCE_USE = true;

    public static WidgetGroup findDependents(ConstraintWidget constraintWidget, int i10, ArrayList<WidgetGroup> arrayList, WidgetGroup widgetGroup) {
        int i11;
        int findGroupInDependents;
        if (i10 == 0) {
            i11 = constraintWidget.horizontalGroup;
        } else {
            i11 = constraintWidget.verticalGroup;
        }
        int i12 = 0;
        if (i11 != -1 && (widgetGroup == null || i11 != widgetGroup.getId())) {
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    break;
                }
                WidgetGroup widgetGroup2 = arrayList.get(i13);
                if (widgetGroup2.getId() == i11) {
                    if (widgetGroup != null) {
                        widgetGroup.moveTo(i10, widgetGroup2);
                        arrayList.remove(widgetGroup);
                    }
                    widgetGroup = widgetGroup2;
                } else {
                    i13++;
                }
            }
        } else if (i11 != -1) {
            return widgetGroup;
        }
        if (widgetGroup == null) {
            if ((constraintWidget instanceof HelperWidget) && (findGroupInDependents = ((HelperWidget) constraintWidget).findGroupInDependents(i10)) != -1) {
                int i14 = 0;
                while (true) {
                    if (i14 >= arrayList.size()) {
                        break;
                    }
                    WidgetGroup widgetGroup3 = arrayList.get(i14);
                    if (widgetGroup3.getId() == findGroupInDependents) {
                        widgetGroup = widgetGroup3;
                        break;
                    }
                    i14++;
                }
            }
            if (widgetGroup == null) {
                widgetGroup = new WidgetGroup(i10);
            }
            arrayList.add(widgetGroup);
        }
        if (widgetGroup.add(constraintWidget)) {
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                ConstraintAnchor anchor = guideline.getAnchor();
                if (guideline.getOrientation() == 0) {
                    i12 = 1;
                }
                anchor.findDependents(i12, arrayList, widgetGroup);
            }
            if (i10 == 0) {
                constraintWidget.horizontalGroup = widgetGroup.getId();
                constraintWidget.mLeft.findDependents(i10, arrayList, widgetGroup);
                constraintWidget.mRight.findDependents(i10, arrayList, widgetGroup);
            } else {
                constraintWidget.verticalGroup = widgetGroup.getId();
                constraintWidget.mTop.findDependents(i10, arrayList, widgetGroup);
                constraintWidget.mBaseline.findDependents(i10, arrayList, widgetGroup);
                constraintWidget.mBottom.findDependents(i10, arrayList, widgetGroup);
            }
            constraintWidget.mCenter.findDependents(i10, arrayList, widgetGroup);
        }
        return widgetGroup;
    }

    private static WidgetGroup findGroup(ArrayList<WidgetGroup> arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            WidgetGroup widgetGroup = arrayList.get(i11);
            if (i10 == widgetGroup.getId()) {
                return widgetGroup;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0392 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x038e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean simpleSolvingPass(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r17, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer r18) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.Grouping.simpleSolvingPass(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer):boolean");
    }

    public static boolean validInGroup(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        boolean z9;
        boolean z10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour3 != dimensionBehaviour7 && dimensionBehaviour3 != (dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour3 != ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour == dimensionBehaviour6)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (dimensionBehaviour4 != dimensionBehaviour7 && dimensionBehaviour4 != (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour4 != ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour2 == dimensionBehaviour5)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z9 || z10) {
            return true;
        }
        return false;
    }
}
