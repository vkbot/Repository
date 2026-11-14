package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class BasicMeasure {
    public static final int AT_MOST = Integer.MIN_VALUE;
    private static final boolean DEBUG = false;
    private static final boolean DO_NOT_USE = false;
    public static final int EXACTLY = 1073741824;
    public static final int FIXED = -3;
    public static final int MATCH_PARENT = -1;
    private static final int MODE_SHIFT = 30;
    public static final int UNSPECIFIED = 0;
    public static final int WRAP_CONTENT = -2;
    private ConstraintWidgetContainer mConstraintWidgetContainer;
    private final ArrayList<ConstraintWidget> mVariableDimensionsWidgets = new ArrayList<>();
    private Measure mMeasure = new Measure();

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class Measure {
        public static int SELF_DIMENSIONS = 0;
        public static int TRY_GIVEN_DIMENSIONS = 1;
        public static int USE_GIVEN_DIMENSIONS = 2;
        public ConstraintWidget.DimensionBehaviour horizontalBehavior;
        public int horizontalDimension;
        public int measureStrategy;
        public int measuredBaseline;
        public boolean measuredHasBaseline;
        public int measuredHeight;
        public boolean measuredNeedsSolverPass;
        public int measuredWidth;
        public ConstraintWidget.DimensionBehaviour verticalBehavior;
        public int verticalDimension;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public interface Measurer {
        void didMeasures();

        void measure(ConstraintWidget constraintWidget, Measure measure);
    }

    public BasicMeasure(ConstraintWidgetContainer constraintWidgetContainer) {
        this.mConstraintWidgetContainer = constraintWidgetContainer;
    }

    private boolean measure(Measurer measurer, ConstraintWidget constraintWidget, int i10) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        this.mMeasure.horizontalBehavior = constraintWidget.getHorizontalDimensionBehaviour();
        this.mMeasure.verticalBehavior = constraintWidget.getVerticalDimensionBehaviour();
        this.mMeasure.horizontalDimension = constraintWidget.getWidth();
        this.mMeasure.verticalDimension = constraintWidget.getHeight();
        Measure measure = this.mMeasure;
        measure.measuredNeedsSolverPass = false;
        measure.measureStrategy = i10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.horizontalBehavior;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour == dimensionBehaviour2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (measure.verticalBehavior == dimensionBehaviour2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 && constraintWidget.mDimensionRatio > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && constraintWidget.mDimensionRatio > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && constraintWidget.mResolvedMatchConstraintDefault[0] == 4) {
            measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z12 && constraintWidget.mResolvedMatchConstraintDefault[1] == 4) {
            measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        measurer.measure(constraintWidget, measure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
        Measure measure2 = this.mMeasure;
        measure2.measureStrategy = Measure.SELF_DIMENSIONS;
        return measure2.measuredNeedsSolverPass;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
    
        if (r8 != r9) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0095, code lost:
    
        if (r5.mDimensionRatio <= 0.0f) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void measureChildren(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r13) {
        /*
            r12 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r13.mChildren
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.optimizeFor(r1)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r2 = r13.getMeasurer()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto Lb0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r5 = r13.mChildren
            java.lang.Object r5 = r5.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r6 == 0) goto L22
            goto Lac
        L22:
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r6 == 0) goto L28
            goto Lac
        L28:
            boolean r6 = r5.isInVirtualLayout()
            if (r6 == 0) goto L30
            goto Lac
        L30:
            if (r1 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r6 = r5.mHorizontalRun
            if (r6 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r7 = r5.mVerticalRun
            if (r7 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r6.mDimension
            boolean r6 = r6.resolved
            if (r6 == 0) goto L48
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency r6 = r7.mDimension
            boolean r6 = r6.resolved
            if (r6 == 0) goto L48
            goto Lac
        L48:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r5.getDimensionBehaviour(r3)
            r7 = 1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r5.getDimensionBehaviour(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r9) goto L61
            int r10 = r5.mMatchConstraintDefaultWidth
            if (r10 == r7) goto L61
            if (r8 != r9) goto L61
            int r10 = r5.mMatchConstraintDefaultHeight
            if (r10 == r7) goto L61
            r10 = r7
            goto L62
        L61:
            r10 = r3
        L62:
            if (r10 != 0) goto L98
            boolean r11 = r13.optimizeFor(r7)
            if (r11 == 0) goto L98
            boolean r11 = r5 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
            if (r11 != 0) goto L98
            if (r6 != r9) goto L7d
            int r11 = r5.mMatchConstraintDefaultWidth
            if (r11 != 0) goto L7d
            if (r8 == r9) goto L7d
            boolean r11 = r5.isInHorizontalChain()
            if (r11 != 0) goto L7d
            r10 = r7
        L7d:
            if (r8 != r9) goto L8c
            int r11 = r5.mMatchConstraintDefaultHeight
            if (r11 != 0) goto L8c
            if (r6 == r9) goto L8c
            boolean r11 = r5.isInHorizontalChain()
            if (r11 != 0) goto L8c
            r10 = r7
        L8c:
            if (r6 == r9) goto L90
            if (r8 != r9) goto L98
        L90:
            float r6 = r5.mDimensionRatio
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L98
            goto L99
        L98:
            r7 = r10
        L99:
            if (r7 == 0) goto L9c
            goto Lac
        L9c:
            int r6 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS
            r12.measure(r2, r5, r6)
            androidx.constraintlayout.core.Metrics r5 = r13.mMetrics
            if (r5 == 0) goto Lac
            long r6 = r5.measuredWidgets
            r8 = 1
            long r6 = r6 + r8
            r5.measuredWidgets = r6
        Lac:
            int r4 = r4 + 1
            goto L12
        Lb0:
            r2.didMeasures()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.measureChildren(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer):void");
    }

    private void solveLinearSystem(ConstraintWidgetContainer constraintWidgetContainer, String str, int i10, int i11, int i12) {
        long j10;
        if (constraintWidgetContainer.mMetrics != null) {
            j10 = System.nanoTime();
        } else {
            j10 = 0;
        }
        int minWidth = constraintWidgetContainer.getMinWidth();
        int minHeight = constraintWidgetContainer.getMinHeight();
        constraintWidgetContainer.setMinWidth(0);
        constraintWidgetContainer.setMinHeight(0);
        constraintWidgetContainer.setWidth(i11);
        constraintWidgetContainer.setHeight(i12);
        constraintWidgetContainer.setMinWidth(minWidth);
        constraintWidgetContainer.setMinHeight(minHeight);
        this.mConstraintWidgetContainer.setPass(i10);
        this.mConstraintWidgetContainer.layout();
        if (constraintWidgetContainer.mMetrics != null) {
            long nanoTime = System.nanoTime();
            Metrics metrics = constraintWidgetContainer.mMetrics;
            metrics.mSolverPasses++;
            metrics.measuresLayoutDuration = (nanoTime - j10) + metrics.measuresLayoutDuration;
        }
    }

    public long solverMeasure(ConstraintWidgetContainer constraintWidgetContainer, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z9;
        boolean z10;
        long j10;
        boolean z11;
        int i19;
        int i20;
        int i21;
        long j11;
        boolean z12;
        boolean z13;
        int i22;
        long j12;
        int i23;
        int i24;
        boolean z14;
        boolean z15;
        boolean z16;
        Metrics metrics;
        boolean z17;
        boolean z18;
        boolean z19;
        BasicMeasure basicMeasure = this;
        ConstraintWidgetContainer constraintWidgetContainer2 = constraintWidgetContainer;
        Measurer measurer = constraintWidgetContainer2.getMeasurer();
        int size = constraintWidgetContainer2.mChildren.size();
        int width = constraintWidgetContainer2.getWidth();
        int height = constraintWidgetContainer2.getHeight();
        boolean enabled = Optimizer.enabled(i10, 128);
        if (!enabled && !Optimizer.enabled(i10, 64)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            for (int i25 = 0; i25 < size; i25++) {
                ConstraintWidget constraintWidget = constraintWidgetContainer2.mChildren.get(i25);
                ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (horizontalDimensionBehaviour == dimensionBehaviour) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (constraintWidget.getVerticalDimensionBehaviour() == dimensionBehaviour) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (z17 && z18 && constraintWidget.getDimensionRatio() > 0.0f) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if ((constraintWidget.isInHorizontalChain() && z19) || ((constraintWidget.isInVerticalChain() && z19) || (constraintWidget instanceof VirtualLayout) || constraintWidget.isInHorizontalChain() || constraintWidget.isInVerticalChain())) {
                    z9 = false;
                    break;
                }
            }
        }
        if (z9 && (metrics = LinearSystem.sMetrics) != null) {
            metrics.measures++;
        }
        if ((i13 == 1073741824 && i15 == 1073741824) || enabled) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z20 = z9 & z10;
        int i26 = 2;
        if (z20) {
            j10 = 1;
            int min = Math.min(constraintWidgetContainer2.getMaxWidth(), i14);
            int min2 = Math.min(constraintWidgetContainer2.getMaxHeight(), i16);
            if (i13 == 1073741824 && constraintWidgetContainer2.getWidth() != min) {
                constraintWidgetContainer2.setWidth(min);
                constraintWidgetContainer2.invalidateGraph();
            }
            if (i15 == 1073741824 && constraintWidgetContainer2.getHeight() != min2) {
                constraintWidgetContainer2.setHeight(min2);
                constraintWidgetContainer2.invalidateGraph();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                z11 = constraintWidgetContainer2.directMeasure(enabled);
                i19 = 2;
            } else {
                boolean directMeasureSetup = constraintWidgetContainer2.directMeasureSetup(enabled);
                if (i13 == 1073741824) {
                    directMeasureSetup &= constraintWidgetContainer2.directMeasureWithOrientation(enabled, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    z11 = constraintWidgetContainer2.directMeasureWithOrientation(enabled, 1) & directMeasureSetup;
                    i19++;
                } else {
                    z11 = directMeasureSetup;
                }
            }
            if (z11) {
                if (i13 == 1073741824) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (i15 == 1073741824) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                constraintWidgetContainer2.updateFromRuns(z15, z16);
            }
        } else {
            j10 = 1;
            z11 = false;
            i19 = 0;
        }
        long j13 = 0;
        if (!z11 || i19 != 2) {
            int optimizationLevel = constraintWidgetContainer2.getOptimizationLevel();
            if (size > 0) {
                measureChildren(constraintWidgetContainer);
            }
            if (constraintWidgetContainer2.mMetrics != null) {
                j13 = System.nanoTime();
            }
            updateHierarchy(constraintWidgetContainer);
            int size2 = basicMeasure.mVariableDimensionsWidgets.size();
            if (size > 0) {
                basicMeasure.solveLinearSystem(constraintWidgetContainer2, "First pass", 0, width, height);
                i20 = width;
                i21 = height;
            } else {
                i20 = width;
                i21 = height;
            }
            if (size2 > 0) {
                ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour2 = constraintWidgetContainer2.getHorizontalDimensionBehaviour();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (horizontalDimensionBehaviour2 == dimensionBehaviour2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (constraintWidgetContainer2.getVerticalDimensionBehaviour() == dimensionBehaviour2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                int max = Math.max(constraintWidgetContainer2.getWidth(), basicMeasure.mConstraintWidgetContainer.getMinWidth());
                int max2 = Math.max(constraintWidgetContainer2.getHeight(), basicMeasure.mConstraintWidgetContainer.getMinHeight());
                int i27 = 0;
                boolean z21 = false;
                while (i27 < size2) {
                    ConstraintWidget constraintWidget2 = basicMeasure.mVariableDimensionsWidgets.get(i27);
                    boolean z22 = z20;
                    if (!(constraintWidget2 instanceof VirtualLayout)) {
                        j12 = j13;
                        i23 = i20;
                        i24 = i21;
                    } else {
                        int width2 = constraintWidget2.getWidth();
                        j12 = j13;
                        int height2 = constraintWidget2.getHeight();
                        boolean measure = z21 | basicMeasure.measure(measurer, constraintWidget2, Measure.TRY_GIVEN_DIMENSIONS);
                        Metrics metrics2 = constraintWidgetContainer2.mMetrics;
                        i23 = i20;
                        i24 = i21;
                        if (metrics2 != null) {
                            metrics2.measuredMatchWidgets += j10;
                        }
                        int width3 = constraintWidget2.getWidth();
                        int height3 = constraintWidget2.getHeight();
                        if (width3 != width2) {
                            constraintWidget2.setWidth(width3);
                            if (z12 && constraintWidget2.getRight() > max) {
                                max = Math.max(max, constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin() + constraintWidget2.getRight());
                            }
                            z14 = true;
                        } else {
                            z14 = measure;
                        }
                        if (height3 != height2) {
                            constraintWidget2.setHeight(height3);
                            if (z13 && constraintWidget2.getBottom() > max2) {
                                max2 = Math.max(max2, constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin() + constraintWidget2.getBottom());
                            }
                            z14 = true;
                        }
                        z21 = z14 | ((VirtualLayout) constraintWidget2).needSolverPass();
                    }
                    i27++;
                    i20 = i23;
                    i21 = i24;
                    z20 = z22;
                    j13 = j12;
                    i26 = 2;
                }
                boolean z23 = z20;
                j11 = j13;
                int i28 = i20;
                int i29 = i21;
                int i30 = i26;
                int i31 = 0;
                while (true) {
                    if (i31 >= i30) {
                        break;
                    }
                    int i32 = 0;
                    while (i32 < size2) {
                        ConstraintWidget constraintWidget3 = basicMeasure.mVariableDimensionsWidgets.get(i32);
                        if (((constraintWidget3 instanceof Helper) && !(constraintWidget3 instanceof VirtualLayout)) || (constraintWidget3 instanceof Guideline) || constraintWidget3.getVisibility() == 8 || ((z23 && constraintWidget3.mHorizontalRun.mDimension.resolved && constraintWidget3.mVerticalRun.mDimension.resolved) || (constraintWidget3 instanceof VirtualLayout))) {
                            i22 = i31;
                        } else {
                            int width4 = constraintWidget3.getWidth();
                            int height4 = constraintWidget3.getHeight();
                            int baselineDistance = constraintWidget3.getBaselineDistance();
                            int i33 = Measure.TRY_GIVEN_DIMENSIONS;
                            if (i31 == 1) {
                                i33 = Measure.USE_GIVEN_DIMENSIONS;
                            }
                            boolean measure2 = z21 | basicMeasure.measure(measurer, constraintWidget3, i33);
                            Metrics metrics3 = constraintWidgetContainer2.mMetrics;
                            i22 = i31;
                            if (metrics3 != null) {
                                metrics3.measuredMatchWidgets += j10;
                            }
                            int width5 = constraintWidget3.getWidth();
                            int height5 = constraintWidget3.getHeight();
                            if (width5 != width4) {
                                constraintWidget3.setWidth(width5);
                                if (z12 && constraintWidget3.getRight() > max) {
                                    max = Math.max(max, constraintWidget3.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin() + constraintWidget3.getRight());
                                }
                                measure2 = true;
                            }
                            if (height5 != height4) {
                                constraintWidget3.setHeight(height5);
                                if (z13 && constraintWidget3.getBottom() > max2) {
                                    max2 = Math.max(max2, constraintWidget3.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin() + constraintWidget3.getBottom());
                                }
                                measure2 = true;
                            }
                            if (constraintWidget3.hasBaseline() && baselineDistance != constraintWidget3.getBaselineDistance()) {
                                z21 = true;
                            } else {
                                z21 = measure2;
                            }
                        }
                        i32++;
                        basicMeasure = this;
                        constraintWidgetContainer2 = constraintWidgetContainer;
                        i31 = i22;
                    }
                    int i34 = i31;
                    if (z21) {
                        i31 = i34 + 1;
                        solveLinearSystem(constraintWidgetContainer, "intermediate pass", i31, i28, i29);
                        basicMeasure = this;
                        constraintWidgetContainer2 = constraintWidgetContainer;
                        i30 = 2;
                        z21 = false;
                    } else {
                        constraintWidgetContainer2 = constraintWidgetContainer;
                        break;
                    }
                }
            } else {
                j11 = j13;
            }
            constraintWidgetContainer2.setOptimizationLevel(optimizationLevel);
            j13 = j11;
        }
        if (constraintWidgetContainer2.mMetrics != null) {
            return System.nanoTime() - j13;
        }
        return j13;
    }

    public void updateHierarchy(ConstraintWidgetContainer constraintWidgetContainer) {
        this.mVariableDimensionsWidgets.clear();
        int size = constraintWidgetContainer.mChildren.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i10);
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (horizontalDimensionBehaviour == dimensionBehaviour || constraintWidget.getVerticalDimensionBehaviour() == dimensionBehaviour) {
                this.mVariableDimensionsWidgets.add(constraintWidget);
            }
        }
        constraintWidgetContainer.invalidateGraph();
    }
}
