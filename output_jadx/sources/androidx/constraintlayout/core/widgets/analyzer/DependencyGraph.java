package androidx.constraintlayout.core.widgets.analyzer;

import ai.onnxruntime.a;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class DependencyGraph {
    private static final boolean DEBUG = false;
    private static final boolean USE_GROUPS = true;
    private ConstraintWidgetContainer mContainer;
    private ConstraintWidgetContainer mWidgetcontainer;
    private boolean mNeedBuildGraph = true;
    private boolean mNeedRedoMeasures = true;
    private ArrayList<WidgetRun> mRuns = new ArrayList<>();
    private ArrayList<RunGroup> mRunGroups = new ArrayList<>();
    private BasicMeasure.Measurer mMeasurer = null;
    private BasicMeasure.Measure mMeasure = new BasicMeasure.Measure();
    ArrayList<RunGroup> mGroups = new ArrayList<>();

    public DependencyGraph(ConstraintWidgetContainer constraintWidgetContainer) {
        this.mWidgetcontainer = constraintWidgetContainer;
        this.mContainer = constraintWidgetContainer;
    }

    private void applyGroup(DependencyNode dependencyNode, int i10, int i11, DependencyNode dependencyNode2, ArrayList<RunGroup> arrayList, RunGroup runGroup) {
        int i12;
        DependencyNode dependencyNode3;
        ArrayList<RunGroup> arrayList2;
        WidgetRun widgetRun = dependencyNode.mRun;
        if (widgetRun.mRunGroup == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.mWidgetcontainer;
            if (widgetRun != constraintWidgetContainer.mHorizontalRun && widgetRun != constraintWidgetContainer.mVerticalRun) {
                if (runGroup == null) {
                    runGroup = new RunGroup(widgetRun, i11);
                    arrayList.add(runGroup);
                }
                RunGroup runGroup2 = runGroup;
                widgetRun.mRunGroup = runGroup2;
                runGroup2.add(widgetRun);
                for (Dependency dependency : widgetRun.start.mDependencies) {
                    if (dependency instanceof DependencyNode) {
                        i12 = i10;
                        dependencyNode3 = dependencyNode2;
                        arrayList2 = arrayList;
                        applyGroup((DependencyNode) dependency, i12, 0, dependencyNode3, arrayList2, runGroup2);
                    } else {
                        i12 = i10;
                        dependencyNode3 = dependencyNode2;
                        arrayList2 = arrayList;
                    }
                    i10 = i12;
                    dependencyNode2 = dependencyNode3;
                    arrayList = arrayList2;
                }
                int i13 = i10;
                DependencyNode dependencyNode4 = dependencyNode2;
                ArrayList<RunGroup> arrayList3 = arrayList;
                for (Dependency dependency2 : widgetRun.end.mDependencies) {
                    if (dependency2 instanceof DependencyNode) {
                        applyGroup((DependencyNode) dependency2, i13, 1, dependencyNode4, arrayList3, runGroup2);
                    }
                }
                if (i13 == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                    for (Dependency dependency3 : ((VerticalWidgetRun) widgetRun).baseline.mDependencies) {
                        if (dependency3 instanceof DependencyNode) {
                            applyGroup((DependencyNode) dependency3, i13, 2, dependencyNode4, arrayList3, runGroup2);
                        }
                    }
                }
                for (DependencyNode dependencyNode5 : widgetRun.start.mTargets) {
                    if (dependencyNode5 == dependencyNode4) {
                        runGroup2.dual = true;
                    }
                    applyGroup(dependencyNode5, i13, 0, dependencyNode4, arrayList3, runGroup2);
                }
                for (DependencyNode dependencyNode6 : widgetRun.end.mTargets) {
                    if (dependencyNode6 == dependencyNode4) {
                        runGroup2.dual = true;
                    }
                    applyGroup(dependencyNode6, i13, 1, dependencyNode4, arrayList3, runGroup2);
                }
                if (i13 == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                    Iterator<DependencyNode> it = ((VerticalWidgetRun) widgetRun).baseline.mTargets.iterator();
                    while (it.hasNext()) {
                        applyGroup(it.next(), i13, 2, dependencyNode4, arrayList3, runGroup2);
                    }
                }
            }
        }
    }

    private boolean basicMeasureWidgets(ConstraintWidgetContainer constraintWidgetContainer) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        float f8;
        float f10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ArrayList<ConstraintWidget> arrayList = constraintWidgetContainer.mChildren;
        int size = arrayList.size();
        char c = 0;
        int i11 = 0;
        while (i11 < size) {
            ConstraintWidget constraintWidget = arrayList.get(i11);
            i11++;
            ConstraintWidget constraintWidget2 = constraintWidget;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget2.mListDimensionBehaviors;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[c == true ? 1 : 0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = dimensionBehaviourArr[1];
            if (constraintWidget2.getVisibility() == 8) {
                constraintWidget2.measured = true;
            } else {
                if (constraintWidget2.mMatchConstraintPercentWidth < 1.0f && dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget2.mMatchConstraintDefaultWidth = 2;
                }
                if (constraintWidget2.mMatchConstraintPercentHeight < 1.0f && dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget2.mMatchConstraintDefaultHeight = 2;
                }
                if (constraintWidget2.getDimensionRatio() > 0.0f) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour6 == dimensionBehaviour8 && (dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget2.mMatchConstraintDefaultWidth = 3;
                    } else if (dimensionBehaviour7 == dimensionBehaviour8 && (dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget2.mMatchConstraintDefaultHeight = 3;
                    } else if (dimensionBehaviour6 == dimensionBehaviour8 && dimensionBehaviour7 == dimensionBehaviour8) {
                        if (constraintWidget2.mMatchConstraintDefaultWidth == 0) {
                            constraintWidget2.mMatchConstraintDefaultWidth = 3;
                        }
                        if (constraintWidget2.mMatchConstraintDefaultHeight == 0) {
                            constraintWidget2.mMatchConstraintDefaultHeight = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour6 == dimensionBehaviour9 && constraintWidget2.mMatchConstraintDefaultWidth == 1 && (constraintWidget2.mLeft.mTarget == null || constraintWidget2.mRight.mTarget == null)) {
                    dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                if (dimensionBehaviour7 == dimensionBehaviour9 && constraintWidget2.mMatchConstraintDefaultHeight == 1 && (constraintWidget2.mTop.mTarget == null || constraintWidget2.mBottom.mTarget == null)) {
                    dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                HorizontalWidgetRun horizontalWidgetRun = constraintWidget2.mHorizontalRun;
                horizontalWidgetRun.mDimensionBehavior = dimensionBehaviour6;
                int i12 = constraintWidget2.mMatchConstraintDefaultWidth;
                horizontalWidgetRun.matchConstraintsType = i12;
                VerticalWidgetRun verticalWidgetRun = constraintWidget2.mVerticalRun;
                verticalWidgetRun.mDimensionBehavior = dimensionBehaviour7;
                int i13 = constraintWidget2.mMatchConstraintDefaultHeight;
                verticalWidgetRun.matchConstraintsType = i13;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                char c10 = c == true ? 1 : 0;
                if ((dimensionBehaviour6 == dimensionBehaviour10 || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour7 == dimensionBehaviour10 || dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = dimensionBehaviour7;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = dimensionBehaviour6;
                    int width = constraintWidget2.getWidth();
                    if (dimensionBehaviour12 == dimensionBehaviour10) {
                        width = (constraintWidgetContainer.getWidth() - constraintWidget2.mLeft.mMargin) - constraintWidget2.mRight.mMargin;
                        dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    int i14 = width;
                    int height = constraintWidget2.getHeight();
                    if (dimensionBehaviour11 == dimensionBehaviour10) {
                        height = (constraintWidgetContainer.getHeight() - constraintWidget2.mTop.mMargin) - constraintWidget2.mBottom.mMargin;
                        dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    measure(constraintWidget2, dimensionBehaviour12, i14, dimensionBehaviour11, height);
                    constraintWidget2.mHorizontalRun.mDimension.resolve(constraintWidget2.getWidth());
                    constraintWidget2.mVerticalRun.mDimension.resolve(constraintWidget2.getHeight());
                    constraintWidget2.measured = true;
                } else {
                    if (dimensionBehaviour6 == dimensionBehaviour9) {
                        dimensionBehaviour2 = dimensionBehaviour9;
                        f10 = 0.5f;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        f8 = 1.0f;
                        if (dimensionBehaviour7 != dimensionBehaviour13 && dimensionBehaviour7 != ConstraintWidget.DimensionBehaviour.FIXED) {
                            dimensionBehaviour = dimensionBehaviour7;
                            i10 = 3;
                        } else if (i12 == 3) {
                            if (dimensionBehaviour7 == dimensionBehaviour13) {
                                measure(constraintWidget2, dimensionBehaviour13, 0, dimensionBehaviour13, 0);
                            }
                            int height2 = constraintWidget2.getHeight();
                            int i15 = (int) ((height2 * constraintWidget2.mDimensionRatio) + 0.5f);
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = ConstraintWidget.DimensionBehaviour.FIXED;
                            measure(constraintWidget2, dimensionBehaviour14, i15, dimensionBehaviour14, height2);
                            constraintWidget2.mHorizontalRun.mDimension.resolve(constraintWidget2.getWidth());
                            constraintWidget2.mVerticalRun.mDimension.resolve(constraintWidget2.getHeight());
                            constraintWidget2.measured = true;
                        } else if (i12 == 1) {
                            measure(constraintWidget2, dimensionBehaviour13, 0, dimensionBehaviour7, 0);
                            constraintWidget2.mHorizontalRun.mDimension.wrapValue = constraintWidget2.getWidth();
                        } else {
                            dimensionBehaviour = dimensionBehaviour7;
                            i10 = 3;
                            if (i12 == 2) {
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = constraintWidgetContainer.mListDimensionBehaviors[c10];
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = ConstraintWidget.DimensionBehaviour.FIXED;
                                if (dimensionBehaviour15 == dimensionBehaviour16 || dimensionBehaviour15 == dimensionBehaviour10) {
                                    measure(constraintWidget2, dimensionBehaviour16, (int) ((constraintWidget2.mMatchConstraintPercentWidth * constraintWidgetContainer.getWidth()) + 0.5f), dimensionBehaviour, constraintWidget2.getHeight());
                                    constraintWidget2.mHorizontalRun.mDimension.resolve(constraintWidget2.getWidth());
                                    constraintWidget2.mVerticalRun.mDimension.resolve(constraintWidget2.getHeight());
                                    constraintWidget2.measured = true;
                                }
                            } else {
                                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.mListAnchors;
                                if (constraintAnchorArr[c10].mTarget == null || constraintAnchorArr[1].mTarget == null) {
                                    measure(constraintWidget2, dimensionBehaviour13, 0, dimensionBehaviour, 0);
                                    constraintWidget2.mHorizontalRun.mDimension.resolve(constraintWidget2.getWidth());
                                    constraintWidget2.mVerticalRun.mDimension.resolve(constraintWidget2.getHeight());
                                    constraintWidget2.measured = true;
                                }
                            }
                        }
                    } else {
                        dimensionBehaviour = dimensionBehaviour7;
                        i10 = 3;
                        dimensionBehaviour2 = dimensionBehaviour9;
                        f8 = 1.0f;
                        f10 = 0.5f;
                    }
                    if (dimensionBehaviour != dimensionBehaviour2 || (dimensionBehaviour6 != (dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && dimensionBehaviour6 != ConstraintWidget.DimensionBehaviour.FIXED)) {
                        dimensionBehaviour3 = dimensionBehaviour6;
                    } else if (i13 == i10) {
                        if (dimensionBehaviour6 == dimensionBehaviour4) {
                            measure(constraintWidget2, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                        }
                        int width2 = constraintWidget2.getWidth();
                        float f11 = constraintWidget2.mDimensionRatio;
                        if (constraintWidget2.getDimensionRatioSide() == -1) {
                            f11 = f8 / f11;
                        }
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = ConstraintWidget.DimensionBehaviour.FIXED;
                        measure(constraintWidget2, dimensionBehaviour17, width2, dimensionBehaviour17, (int) ((width2 * f11) + f10));
                        constraintWidget2.mHorizontalRun.mDimension.resolve(constraintWidget2.getWidth());
                        constraintWidget2.mVerticalRun.mDimension.resolve(constraintWidget2.getHeight());
                        constraintWidget2.measured = true;
                    } else if (i13 == 1) {
                        measure(constraintWidget2, dimensionBehaviour6, 0, dimensionBehaviour4, 0);
                        constraintWidget2.mVerticalRun.mDimension.wrapValue = constraintWidget2.getHeight();
                    } else {
                        dimensionBehaviour3 = dimensionBehaviour6;
                        if (i13 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = constraintWidgetContainer.mListDimensionBehaviors[1];
                            dimensionBehaviour5 = dimensionBehaviour;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour18 == dimensionBehaviour19 || dimensionBehaviour18 == dimensionBehaviour10) {
                                measure(constraintWidget2, dimensionBehaviour3, constraintWidget2.getWidth(), dimensionBehaviour19, (int) ((constraintWidget2.mMatchConstraintPercentHeight * constraintWidgetContainer.getHeight()) + f10));
                                constraintWidget2.mHorizontalRun.mDimension.resolve(constraintWidget2.getWidth());
                                constraintWidget2.mVerticalRun.mDimension.resolve(constraintWidget2.getHeight());
                                constraintWidget2.measured = true;
                            }
                            dimensionBehaviour = dimensionBehaviour5;
                        } else {
                            dimensionBehaviour5 = dimensionBehaviour;
                            ConstraintAnchor[] constraintAnchorArr2 = constraintWidget2.mListAnchors;
                            if (constraintAnchorArr2[2].mTarget == null || constraintAnchorArr2[i10].mTarget == null) {
                                measure(constraintWidget2, dimensionBehaviour4, 0, dimensionBehaviour5, 0);
                                constraintWidget2.mHorizontalRun.mDimension.resolve(constraintWidget2.getWidth());
                                constraintWidget2.mVerticalRun.mDimension.resolve(constraintWidget2.getHeight());
                                constraintWidget2.measured = true;
                            }
                            dimensionBehaviour = dimensionBehaviour5;
                        }
                    }
                    if (dimensionBehaviour3 == dimensionBehaviour2 && dimensionBehaviour == dimensionBehaviour2) {
                        if (i12 != 1 && i13 != 1) {
                            if (i13 == 2 && i12 == 2) {
                                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidgetContainer.mListDimensionBehaviors;
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = dimensionBehaviourArr2[c10];
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour21 = ConstraintWidget.DimensionBehaviour.FIXED;
                                if (dimensionBehaviour20 == dimensionBehaviour21 && dimensionBehaviourArr2[1] == dimensionBehaviour21) {
                                    measure(constraintWidget2, dimensionBehaviour21, (int) ((constraintWidget2.mMatchConstraintPercentWidth * constraintWidgetContainer.getWidth()) + f10), dimensionBehaviour21, (int) ((constraintWidget2.mMatchConstraintPercentHeight * constraintWidgetContainer.getHeight()) + f10));
                                    constraintWidget2.mHorizontalRun.mDimension.resolve(constraintWidget2.getWidth());
                                    constraintWidget2.mVerticalRun.mDimension.resolve(constraintWidget2.getHeight());
                                    constraintWidget2.measured = true;
                                }
                            }
                        } else {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour22 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            measure(constraintWidget2, dimensionBehaviour22, 0, dimensionBehaviour22, 0);
                            constraintWidget2.mHorizontalRun.mDimension.wrapValue = constraintWidget2.getWidth();
                            constraintWidget2.mVerticalRun.mDimension.wrapValue = constraintWidget2.getHeight();
                        }
                    }
                }
                c = c10;
            }
        }
        return c == true ? 1 : 0;
    }

    private int computeWrap(ConstraintWidgetContainer constraintWidgetContainer, int i10) {
        int size = this.mGroups.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j10 = Math.max(j10, this.mGroups.get(i11).computeWrapSize(constraintWidgetContainer, i10));
        }
        return (int) j10;
    }

    private void displayGraph() {
        ArrayList<WidgetRun> arrayList = this.mRuns;
        int size = arrayList.size();
        String str = "digraph {\n";
        int i10 = 0;
        while (i10 < size) {
            WidgetRun widgetRun = arrayList.get(i10);
            i10++;
            str = generateDisplayGraph(widgetRun, str);
        }
        String C = a.C(str, "\n}\n");
        System.out.println("content:<<\n" + C + "\n>>");
    }

    private void findGroup(WidgetRun widgetRun, int i10, ArrayList<RunGroup> arrayList) {
        for (Dependency dependency : widgetRun.start.mDependencies) {
            if (dependency instanceof DependencyNode) {
                applyGroup((DependencyNode) dependency, i10, 0, widgetRun.end, arrayList, null);
            } else if (dependency instanceof WidgetRun) {
                applyGroup(((WidgetRun) dependency).start, i10, 0, widgetRun.end, arrayList, null);
            }
        }
        for (Dependency dependency2 : widgetRun.end.mDependencies) {
            if (dependency2 instanceof DependencyNode) {
                applyGroup((DependencyNode) dependency2, i10, 1, widgetRun.start, arrayList, null);
            } else if (dependency2 instanceof WidgetRun) {
                applyGroup(((WidgetRun) dependency2).end, i10, 1, widgetRun.start, arrayList, null);
            }
        }
        int i11 = i10;
        if (i11 == 1) {
            for (Dependency dependency3 : ((VerticalWidgetRun) widgetRun).baseline.mDependencies) {
                if (dependency3 instanceof DependencyNode) {
                    applyGroup((DependencyNode) dependency3, i11, 2, null, arrayList, null);
                }
                i11 = i10;
            }
        }
    }

    private String generateChainDisplayGraph(ChainRun chainRun, String str) {
        int i10 = chainRun.orientation;
        StringBuilder sb = new StringBuilder("subgraph cluster_");
        sb.append(chainRun.mWidget.getDebugName());
        if (i10 == 0) {
            sb.append("_h");
        } else {
            sb.append("_v");
        }
        sb.append(" {\n");
        ArrayList<WidgetRun> arrayList = chainRun.mWidgets;
        int size = arrayList.size();
        String str2 = "";
        int i11 = 0;
        while (i11 < size) {
            WidgetRun widgetRun = arrayList.get(i11);
            i11++;
            WidgetRun widgetRun2 = widgetRun;
            sb.append(widgetRun2.mWidget.getDebugName());
            if (i10 == 0) {
                sb.append("_HORIZONTAL");
            } else {
                sb.append("_VERTICAL");
            }
            sb.append(";\n");
            str2 = generateDisplayGraph(widgetRun2, str2);
        }
        sb.append("}\n");
        return str + str2 + ((Object) sb);
    }

    private String generateDisplayGraph(WidgetRun widgetRun, String str) {
        boolean z9;
        DependencyNode dependencyNode = widgetRun.start;
        DependencyNode dependencyNode2 = widgetRun.end;
        StringBuilder sb = new StringBuilder(str);
        if (!(widgetRun instanceof HelperReferences) && dependencyNode.mDependencies.isEmpty() && dependencyNode2.mDependencies.isEmpty() && dependencyNode.mTargets.isEmpty() && dependencyNode2.mTargets.isEmpty()) {
            return str;
        }
        sb.append(nodeDefinition(widgetRun));
        boolean isCenteredConnection = isCenteredConnection(dependencyNode, dependencyNode2);
        String generateDisplayNode = generateDisplayNode(dependencyNode2, isCenteredConnection, generateDisplayNode(dependencyNode, isCenteredConnection, str));
        boolean z10 = widgetRun instanceof VerticalWidgetRun;
        if (z10) {
            generateDisplayNode = generateDisplayNode(((VerticalWidgetRun) widgetRun).baseline, isCenteredConnection, generateDisplayNode);
        }
        if (!(widgetRun instanceof HorizontalWidgetRun) && (!((z9 = widgetRun instanceof ChainRun)) || ((ChainRun) widgetRun).orientation != 0)) {
            if (z10 || (z9 && ((ChainRun) widgetRun).orientation == 1)) {
                ConstraintWidget.DimensionBehaviour verticalDimensionBehaviour = widgetRun.mWidget.getVerticalDimensionBehaviour();
                if (verticalDimensionBehaviour != ConstraintWidget.DimensionBehaviour.FIXED && verticalDimensionBehaviour != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    if (verticalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun.mWidget.getDimensionRatio() > 0.0f) {
                        sb.append("\n");
                        sb.append(widgetRun.mWidget.getDebugName());
                        sb.append("_VERTICAL -> ");
                        sb.append(widgetRun.mWidget.getDebugName());
                        sb.append("_HORIZONTAL;\n");
                    }
                } else if (!dependencyNode.mTargets.isEmpty() && dependencyNode2.mTargets.isEmpty()) {
                    sb.append("\n");
                    sb.append(dependencyNode2.name());
                    sb.append(" -> ");
                    sb.append(dependencyNode.name());
                    sb.append("\n");
                } else if (dependencyNode.mTargets.isEmpty() && !dependencyNode2.mTargets.isEmpty()) {
                    sb.append("\n");
                    sb.append(dependencyNode.name());
                    sb.append(" -> ");
                    sb.append(dependencyNode2.name());
                    sb.append("\n");
                }
            }
        } else {
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = widgetRun.mWidget.getHorizontalDimensionBehaviour();
            if (horizontalDimensionBehaviour != ConstraintWidget.DimensionBehaviour.FIXED && horizontalDimensionBehaviour != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                if (horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun.mWidget.getDimensionRatio() > 0.0f) {
                    sb.append("\n");
                    sb.append(widgetRun.mWidget.getDebugName());
                    sb.append("_HORIZONTAL -> ");
                    sb.append(widgetRun.mWidget.getDebugName());
                    sb.append("_VERTICAL;\n");
                }
            } else if (!dependencyNode.mTargets.isEmpty() && dependencyNode2.mTargets.isEmpty()) {
                sb.append("\n");
                sb.append(dependencyNode2.name());
                sb.append(" -> ");
                sb.append(dependencyNode.name());
                sb.append("\n");
            } else if (dependencyNode.mTargets.isEmpty() && !dependencyNode2.mTargets.isEmpty()) {
                sb.append("\n");
                sb.append(dependencyNode.name());
                sb.append(" -> ");
                sb.append(dependencyNode2.name());
                sb.append("\n");
            }
        }
        if (widgetRun instanceof ChainRun) {
            return generateChainDisplayGraph((ChainRun) widgetRun, generateDisplayNode);
        }
        return sb.toString();
    }

    private String generateDisplayNode(DependencyNode dependencyNode, boolean z9, String str) {
        StringBuilder sb = new StringBuilder(str);
        for (DependencyNode dependencyNode2 : dependencyNode.mTargets) {
            StringBuilder w = a.w("\n" + dependencyNode.name(), " -> ");
            w.append(dependencyNode2.name());
            String sb2 = w.toString();
            if (dependencyNode.mMargin > 0 || z9 || (dependencyNode.mRun instanceof HelperReferences)) {
                String concat = sb2.concat("[");
                if (dependencyNode.mMargin > 0) {
                    concat = a.o(a.w(concat, "label=\""), "\"", dependencyNode.mMargin);
                    if (z9) {
                        concat = concat.concat(",");
                    }
                }
                if (z9) {
                    concat = concat.concat(" style=dashed ");
                }
                if (dependencyNode.mRun instanceof HelperReferences) {
                    concat = concat.concat(" style=bold,color=gray ");
                }
                sb2 = concat.concat("]");
            }
            sb.append(sb2.concat("\n"));
        }
        return sb.toString();
    }

    private boolean isCenteredConnection(DependencyNode dependencyNode, DependencyNode dependencyNode2) {
        Iterator<DependencyNode> it = dependencyNode.mTargets.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next() != dependencyNode2) {
                i10++;
            }
        }
        Iterator<DependencyNode> it2 = dependencyNode2.mTargets.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            if (it2.next() != dependencyNode) {
                i11++;
            }
        }
        if (i10 <= 0 || i11 <= 0) {
            return false;
        }
        return true;
    }

    private void measure(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i10, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i11) {
        BasicMeasure.Measure measure = this.mMeasure;
        measure.horizontalBehavior = dimensionBehaviour;
        measure.verticalBehavior = dimensionBehaviour2;
        measure.horizontalDimension = i10;
        measure.verticalDimension = i11;
        this.mMeasurer.measure(constraintWidget, measure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
    }

    private String nodeDefinition(WidgetRun widgetRun) {
        ConstraintWidget.DimensionBehaviour verticalDimensionBehaviour;
        boolean z9 = widgetRun instanceof VerticalWidgetRun;
        String debugName = widgetRun.mWidget.getDebugName();
        StringBuilder sb = new StringBuilder(debugName);
        ConstraintWidget constraintWidget = widgetRun.mWidget;
        if (!z9) {
            verticalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
        } else {
            verticalDimensionBehaviour = constraintWidget.getVerticalDimensionBehaviour();
        }
        RunGroup runGroup = widgetRun.mRunGroup;
        if (!z9) {
            sb.append("_HORIZONTAL");
        } else {
            sb.append("_VERTICAL");
        }
        sb.append(" [shape=none, label=<<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">  <TR>");
        if (!z9) {
            sb.append("    <TD ");
            if (widgetRun.start.resolved) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"LEFT\" BORDER=\"1\">L</TD>");
        } else {
            sb.append("    <TD ");
            if (widgetRun.start.resolved) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"TOP\" BORDER=\"1\">T</TD>");
        }
        sb.append("    <TD BORDER=\"1\" ");
        boolean z10 = widgetRun.mDimension.resolved;
        if (z10 && !widgetRun.mWidget.measured) {
            sb.append(" BGCOLOR=\"green\" ");
        } else if (z10) {
            sb.append(" BGCOLOR=\"lightgray\" ");
        } else if (widgetRun.mWidget.measured) {
            sb.append(" BGCOLOR=\"yellow\" ");
        }
        if (verticalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            sb.append("style=\"dashed\"");
        }
        sb.append(">");
        sb.append(debugName);
        if (runGroup != null) {
            sb.append(" [");
            sb.append(runGroup.mGroupIndex + 1);
            sb.append("/");
            sb.append(RunGroup.index);
            sb.append("]");
        }
        sb.append(" </TD>");
        if (!z9) {
            sb.append("    <TD ");
            if (widgetRun.end.resolved) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"RIGHT\" BORDER=\"1\">R</TD>");
        } else {
            sb.append("    <TD ");
            if (((VerticalWidgetRun) widgetRun).baseline.resolved) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"BASELINE\" BORDER=\"1\">b</TD>    <TD ");
            if (widgetRun.end.resolved) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"BOTTOM\" BORDER=\"1\">B</TD>");
        }
        sb.append("  </TR></TABLE>>];\n");
        return sb.toString();
    }

    public void buildGraph(ArrayList<WidgetRun> arrayList) {
        arrayList.clear();
        this.mContainer.mHorizontalRun.clear();
        this.mContainer.mVerticalRun.clear();
        arrayList.add(this.mContainer.mHorizontalRun);
        arrayList.add(this.mContainer.mVerticalRun);
        ArrayList<ConstraintWidget> arrayList2 = this.mContainer.mChildren;
        int size = arrayList2.size();
        HashSet hashSet = null;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            ConstraintWidget constraintWidget = arrayList2.get(i11);
            i11++;
            ConstraintWidget constraintWidget2 = constraintWidget;
            if (constraintWidget2 instanceof Guideline) {
                arrayList.add(new GuidelineReference(constraintWidget2));
            } else {
                if (constraintWidget2.isInHorizontalChain()) {
                    if (constraintWidget2.horizontalChainRun == null) {
                        constraintWidget2.horizontalChainRun = new ChainRun(constraintWidget2, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget2.horizontalChainRun);
                } else {
                    arrayList.add(constraintWidget2.mHorizontalRun);
                }
                if (constraintWidget2.isInVerticalChain()) {
                    if (constraintWidget2.verticalChainRun == null) {
                        constraintWidget2.verticalChainRun = new ChainRun(constraintWidget2, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget2.verticalChainRun);
                } else {
                    arrayList.add(constraintWidget2.mVerticalRun);
                }
                if (constraintWidget2 instanceof HelperWidget) {
                    arrayList.add(new HelperReferences(constraintWidget2));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            WidgetRun widgetRun = arrayList.get(i12);
            i12++;
            widgetRun.clear();
        }
        int size3 = arrayList.size();
        while (i10 < size3) {
            WidgetRun widgetRun2 = arrayList.get(i10);
            i10++;
            WidgetRun widgetRun3 = widgetRun2;
            if (widgetRun3.mWidget != this.mContainer) {
                widgetRun3.apply();
            }
        }
    }

    public void defineTerminalWidgets(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2) {
        boolean z9;
        boolean z10;
        if (this.mNeedBuildGraph) {
            buildGraph();
            ArrayList<ConstraintWidget> arrayList = this.mWidgetcontainer.mChildren;
            int size = arrayList.size();
            boolean z11 = false;
            int i10 = 0;
            while (i10 < size) {
                ConstraintWidget constraintWidget = arrayList.get(i10);
                i10++;
                ConstraintWidget constraintWidget2 = constraintWidget;
                boolean[] zArr = constraintWidget2.isTerminalWidget;
                zArr[0] = true;
                zArr[1] = true;
                if (constraintWidget2 instanceof Barrier) {
                    z11 = true;
                }
            }
            if (!z11) {
                ArrayList<RunGroup> arrayList2 = this.mGroups;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    RunGroup runGroup = arrayList2.get(i11);
                    i11++;
                    RunGroup runGroup2 = runGroup;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    runGroup2.defineTerminalWidgets(z9, z10);
                }
            }
        }
    }

    public boolean directMeasure(boolean z9) {
        boolean z10;
        boolean z11 = false;
        if (this.mNeedBuildGraph || this.mNeedRedoMeasures) {
            ArrayList<ConstraintWidget> arrayList = this.mWidgetcontainer.mChildren;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                ConstraintWidget constraintWidget = arrayList.get(i10);
                i10++;
                ConstraintWidget constraintWidget2 = constraintWidget;
                constraintWidget2.ensureWidgetRuns();
                constraintWidget2.measured = false;
                constraintWidget2.mHorizontalRun.reset();
                constraintWidget2.mVerticalRun.reset();
            }
            this.mWidgetcontainer.ensureWidgetRuns();
            ConstraintWidgetContainer constraintWidgetContainer = this.mWidgetcontainer;
            constraintWidgetContainer.measured = false;
            constraintWidgetContainer.mHorizontalRun.reset();
            this.mWidgetcontainer.mVerticalRun.reset();
            this.mNeedRedoMeasures = false;
        }
        if (basicMeasureWidgets(this.mContainer)) {
            return false;
        }
        this.mWidgetcontainer.setX(0);
        this.mWidgetcontainer.setY(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.mWidgetcontainer.getDimensionBehaviour(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.mWidgetcontainer.getDimensionBehaviour(1);
        if (this.mNeedBuildGraph) {
            buildGraph();
        }
        int x9 = this.mWidgetcontainer.getX();
        int y9 = this.mWidgetcontainer.getY();
        this.mWidgetcontainer.mHorizontalRun.start.resolve(x9);
        this.mWidgetcontainer.mVerticalRun.start.resolve(y9);
        measureWidgets();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour == dimensionBehaviour3 || dimensionBehaviour2 == dimensionBehaviour3) {
            if (z9) {
                ArrayList<WidgetRun> arrayList2 = this.mRuns;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    WidgetRun widgetRun = arrayList2.get(i11);
                    i11++;
                    if (!widgetRun.supportsWrapComputation()) {
                        z9 = false;
                        break;
                    }
                }
            }
            if (z9 && dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.mWidgetcontainer.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer2 = this.mWidgetcontainer;
                constraintWidgetContainer2.setWidth(computeWrap(constraintWidgetContainer2, 0));
                ConstraintWidgetContainer constraintWidgetContainer3 = this.mWidgetcontainer;
                constraintWidgetContainer3.mHorizontalRun.mDimension.resolve(constraintWidgetContainer3.getWidth());
            }
            if (z9 && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.mWidgetcontainer.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer4 = this.mWidgetcontainer;
                constraintWidgetContainer4.setHeight(computeWrap(constraintWidgetContainer4, 1));
                ConstraintWidgetContainer constraintWidgetContainer5 = this.mWidgetcontainer;
                constraintWidgetContainer5.mVerticalRun.mDimension.resolve(constraintWidgetContainer5.getHeight());
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer6 = this.mWidgetcontainer;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidgetContainer6.mListDimensionBehaviors[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour4 != dimensionBehaviour5 && dimensionBehaviour4 != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            z10 = false;
        } else {
            int width = constraintWidgetContainer6.getWidth() + x9;
            this.mWidgetcontainer.mHorizontalRun.end.resolve(width);
            this.mWidgetcontainer.mHorizontalRun.mDimension.resolve(width - x9);
            measureWidgets();
            ConstraintWidgetContainer constraintWidgetContainer7 = this.mWidgetcontainer;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = constraintWidgetContainer7.mListDimensionBehaviors[1];
            if (dimensionBehaviour6 == dimensionBehaviour5 || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int height = constraintWidgetContainer7.getHeight() + y9;
                this.mWidgetcontainer.mVerticalRun.end.resolve(height);
                this.mWidgetcontainer.mVerticalRun.mDimension.resolve(height - y9);
            }
            measureWidgets();
            z10 = true;
        }
        ArrayList<WidgetRun> arrayList3 = this.mRuns;
        int size3 = arrayList3.size();
        int i12 = 0;
        while (i12 < size3) {
            WidgetRun widgetRun2 = arrayList3.get(i12);
            i12++;
            WidgetRun widgetRun3 = widgetRun2;
            if (widgetRun3.mWidget != this.mWidgetcontainer || widgetRun3.mResolved) {
                widgetRun3.applyToWidget();
            }
        }
        ArrayList<WidgetRun> arrayList4 = this.mRuns;
        int size4 = arrayList4.size();
        int i13 = 0;
        while (true) {
            if (i13 < size4) {
                WidgetRun widgetRun4 = arrayList4.get(i13);
                i13++;
                WidgetRun widgetRun5 = widgetRun4;
                if (z10 || widgetRun5.mWidget != this.mWidgetcontainer) {
                    if (!widgetRun5.start.resolved) {
                        break;
                    }
                    if (!widgetRun5.end.resolved) {
                        if (!(widgetRun5 instanceof GuidelineReference)) {
                            break;
                        }
                    }
                    if (!widgetRun5.mDimension.resolved && !(widgetRun5 instanceof ChainRun) && !(widgetRun5 instanceof GuidelineReference)) {
                        break;
                    }
                }
            } else {
                z11 = true;
                break;
            }
        }
        this.mWidgetcontainer.setHorizontalDimensionBehaviour(dimensionBehaviour);
        this.mWidgetcontainer.setVerticalDimensionBehaviour(dimensionBehaviour2);
        return z11;
    }

    public boolean directMeasureSetup(boolean z9) {
        if (this.mNeedBuildGraph) {
            ArrayList<ConstraintWidget> arrayList = this.mWidgetcontainer.mChildren;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                ConstraintWidget constraintWidget = arrayList.get(i10);
                i10++;
                ConstraintWidget constraintWidget2 = constraintWidget;
                constraintWidget2.ensureWidgetRuns();
                constraintWidget2.measured = false;
                HorizontalWidgetRun horizontalWidgetRun = constraintWidget2.mHorizontalRun;
                horizontalWidgetRun.mDimension.resolved = false;
                horizontalWidgetRun.mResolved = false;
                horizontalWidgetRun.reset();
                VerticalWidgetRun verticalWidgetRun = constraintWidget2.mVerticalRun;
                verticalWidgetRun.mDimension.resolved = false;
                verticalWidgetRun.mResolved = false;
                verticalWidgetRun.reset();
            }
            this.mWidgetcontainer.ensureWidgetRuns();
            ConstraintWidgetContainer constraintWidgetContainer = this.mWidgetcontainer;
            constraintWidgetContainer.measured = false;
            HorizontalWidgetRun horizontalWidgetRun2 = constraintWidgetContainer.mHorizontalRun;
            horizontalWidgetRun2.mDimension.resolved = false;
            horizontalWidgetRun2.mResolved = false;
            horizontalWidgetRun2.reset();
            VerticalWidgetRun verticalWidgetRun2 = this.mWidgetcontainer.mVerticalRun;
            verticalWidgetRun2.mDimension.resolved = false;
            verticalWidgetRun2.mResolved = false;
            verticalWidgetRun2.reset();
            buildGraph();
        }
        if (basicMeasureWidgets(this.mContainer)) {
            return false;
        }
        this.mWidgetcontainer.setX(0);
        this.mWidgetcontainer.setY(0);
        this.mWidgetcontainer.mHorizontalRun.start.resolve(0);
        this.mWidgetcontainer.mVerticalRun.start.resolve(0);
        return true;
    }

    public boolean directMeasureWithOrientation(boolean z9, int i10) {
        boolean z10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z11 = false;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.mWidgetcontainer.getDimensionBehaviour(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = this.mWidgetcontainer.getDimensionBehaviour(1);
        int x9 = this.mWidgetcontainer.getX();
        int y9 = this.mWidgetcontainer.getY();
        if (z9 && (dimensionBehaviour2 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour3 == dimensionBehaviour)) {
            ArrayList<WidgetRun> arrayList = this.mRuns;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                WidgetRun widgetRun = arrayList.get(i11);
                i11++;
                WidgetRun widgetRun2 = widgetRun;
                if (widgetRun2.orientation == i10 && !widgetRun2.supportsWrapComputation()) {
                    z9 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z9 && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    this.mWidgetcontainer.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                    ConstraintWidgetContainer constraintWidgetContainer = this.mWidgetcontainer;
                    constraintWidgetContainer.setWidth(computeWrap(constraintWidgetContainer, 0));
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.mWidgetcontainer;
                    constraintWidgetContainer2.mHorizontalRun.mDimension.resolve(constraintWidgetContainer2.getWidth());
                }
            } else if (z9 && dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.mWidgetcontainer.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer3 = this.mWidgetcontainer;
                constraintWidgetContainer3.setHeight(computeWrap(constraintWidgetContainer3, 1));
                ConstraintWidgetContainer constraintWidgetContainer4 = this.mWidgetcontainer;
                constraintWidgetContainer4.mVerticalRun.mDimension.resolve(constraintWidgetContainer4.getHeight());
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer5 = this.mWidgetcontainer;
        if (i10 == 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidgetContainer5.mListDimensionBehaviors[0];
            if (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int width = constraintWidgetContainer5.getWidth() + x9;
                this.mWidgetcontainer.mHorizontalRun.end.resolve(width);
                this.mWidgetcontainer.mHorizontalRun.mDimension.resolve(width - x9);
                z10 = true;
            }
            z10 = false;
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = constraintWidgetContainer5.mListDimensionBehaviors[1];
            if (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int height = constraintWidgetContainer5.getHeight() + y9;
                this.mWidgetcontainer.mVerticalRun.end.resolve(height);
                this.mWidgetcontainer.mVerticalRun.mDimension.resolve(height - y9);
                z10 = true;
            }
            z10 = false;
        }
        measureWidgets();
        ArrayList<WidgetRun> arrayList2 = this.mRuns;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            WidgetRun widgetRun3 = arrayList2.get(i12);
            i12++;
            WidgetRun widgetRun4 = widgetRun3;
            if (widgetRun4.orientation == i10 && (widgetRun4.mWidget != this.mWidgetcontainer || widgetRun4.mResolved)) {
                widgetRun4.applyToWidget();
            }
        }
        ArrayList<WidgetRun> arrayList3 = this.mRuns;
        int size3 = arrayList3.size();
        int i13 = 0;
        while (true) {
            if (i13 < size3) {
                WidgetRun widgetRun5 = arrayList3.get(i13);
                i13++;
                WidgetRun widgetRun6 = widgetRun5;
                if (widgetRun6.orientation == i10 && (z10 || widgetRun6.mWidget != this.mWidgetcontainer)) {
                    if (!widgetRun6.start.resolved) {
                        break;
                    }
                    if (!widgetRun6.end.resolved) {
                        break;
                    }
                    if (!(widgetRun6 instanceof ChainRun) && !widgetRun6.mDimension.resolved) {
                        break;
                    }
                }
            } else {
                z11 = true;
                break;
            }
        }
        this.mWidgetcontainer.setHorizontalDimensionBehaviour(dimensionBehaviour2);
        this.mWidgetcontainer.setVerticalDimensionBehaviour(dimensionBehaviour3);
        return z11;
    }

    public void invalidateGraph() {
        this.mNeedBuildGraph = true;
    }

    public void invalidateMeasures() {
        this.mNeedRedoMeasures = true;
    }

    public void measureWidgets() {
        boolean z9;
        boolean z10;
        DimensionDependency dimensionDependency;
        ArrayList<ConstraintWidget> arrayList = this.mWidgetcontainer.mChildren;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            ConstraintWidget constraintWidget = arrayList.get(i10);
            i10++;
            ConstraintWidget constraintWidget2 = constraintWidget;
            if (!constraintWidget2.measured) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget2.mListDimensionBehaviors;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i11 = constraintWidget2.mMatchConstraintDefaultWidth;
                int i12 = constraintWidget2.mMatchConstraintDefaultHeight;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour != dimensionBehaviour3 && (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || i11 != 1)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (dimensionBehaviour2 != dimensionBehaviour3 && (dimensionBehaviour2 != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || i12 != 1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                DimensionDependency dimensionDependency2 = constraintWidget2.mHorizontalRun.mDimension;
                boolean z11 = dimensionDependency2.resolved;
                DimensionDependency dimensionDependency3 = constraintWidget2.mVerticalRun.mDimension;
                boolean z12 = dimensionDependency3.resolved;
                if (z11 && z12) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    measure(constraintWidget2, dimensionBehaviour4, dimensionDependency2.value, dimensionBehaviour4, dimensionDependency3.value);
                    constraintWidget2.measured = true;
                } else if (z11 && z10) {
                    measure(constraintWidget2, ConstraintWidget.DimensionBehaviour.FIXED, dimensionDependency2.value, dimensionBehaviour3, dimensionDependency3.value);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    VerticalWidgetRun verticalWidgetRun = constraintWidget2.mVerticalRun;
                    if (dimensionBehaviour2 == dimensionBehaviour5) {
                        verticalWidgetRun.mDimension.wrapValue = constraintWidget2.getHeight();
                    } else {
                        verticalWidgetRun.mDimension.resolve(constraintWidget2.getHeight());
                        constraintWidget2.measured = true;
                    }
                } else if (z12 && z9) {
                    measure(constraintWidget2, dimensionBehaviour3, dimensionDependency2.value, ConstraintWidget.DimensionBehaviour.FIXED, dimensionDependency3.value);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    HorizontalWidgetRun horizontalWidgetRun = constraintWidget2.mHorizontalRun;
                    if (dimensionBehaviour == dimensionBehaviour6) {
                        horizontalWidgetRun.mDimension.wrapValue = constraintWidget2.getWidth();
                    } else {
                        horizontalWidgetRun.mDimension.resolve(constraintWidget2.getWidth());
                        constraintWidget2.measured = true;
                    }
                }
                if (constraintWidget2.measured && (dimensionDependency = constraintWidget2.mVerticalRun.mBaselineDimension) != null) {
                    dimensionDependency.resolve(constraintWidget2.getBaselineDistance());
                }
            }
        }
    }

    public void setMeasurer(BasicMeasure.Measurer measurer) {
        this.mMeasurer = measurer;
    }

    public void buildGraph() {
        buildGraph(this.mRuns);
        this.mGroups.clear();
        RunGroup.index = 0;
        findGroup(this.mWidgetcontainer.mHorizontalRun, 0, this.mGroups);
        findGroup(this.mWidgetcontainer.mVerticalRun, 1, this.mGroups);
        this.mNeedBuildGraph = false;
    }
}
