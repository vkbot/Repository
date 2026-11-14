package androidx.constraintlayout.core.widgets.analyzer;

import ai.onnxruntime.a;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class RunGroup {
    public static final int BASELINE = 2;
    public static final int END = 1;
    public static final int START = 0;
    public static int index;
    int mDirection;
    WidgetRun mFirstRun;
    int mGroupIndex;
    WidgetRun mLastRun;
    public int position = 0;
    public boolean dual = false;
    ArrayList<WidgetRun> mRuns = new ArrayList<>();

    public RunGroup(WidgetRun widgetRun, int i10) {
        this.mFirstRun = null;
        this.mLastRun = null;
        int i11 = index;
        this.mGroupIndex = i11;
        index = i11 + 1;
        this.mFirstRun = widgetRun;
        this.mLastRun = widgetRun;
        this.mDirection = i10;
    }

    private boolean defineTerminalWidget(WidgetRun widgetRun, int i10) {
        DependencyNode dependencyNode;
        WidgetRun widgetRun2;
        DependencyNode dependencyNode2;
        WidgetRun widgetRun3;
        if (!widgetRun.mWidget.isTerminalWidget[i10]) {
            return false;
        }
        for (Dependency dependency : widgetRun.start.mDependencies) {
            if ((dependency instanceof DependencyNode) && (widgetRun3 = (dependencyNode2 = (DependencyNode) dependency).mRun) != widgetRun && dependencyNode2 == widgetRun3.start) {
                if (widgetRun instanceof ChainRun) {
                    ArrayList<WidgetRun> arrayList = ((ChainRun) widgetRun).mWidgets;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        WidgetRun widgetRun4 = arrayList.get(i11);
                        i11++;
                        defineTerminalWidget(widgetRun4, i10);
                    }
                } else if (!(widgetRun instanceof HelperReferences)) {
                    widgetRun.mWidget.isTerminalWidget[i10] = false;
                }
                defineTerminalWidget(dependencyNode2.mRun, i10);
            }
        }
        for (Dependency dependency2 : widgetRun.end.mDependencies) {
            if ((dependency2 instanceof DependencyNode) && (widgetRun2 = (dependencyNode = (DependencyNode) dependency2).mRun) != widgetRun && dependencyNode == widgetRun2.start) {
                if (widgetRun instanceof ChainRun) {
                    ArrayList<WidgetRun> arrayList2 = ((ChainRun) widgetRun).mWidgets;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        WidgetRun widgetRun5 = arrayList2.get(i12);
                        i12++;
                        defineTerminalWidget(widgetRun5, i10);
                    }
                } else if (!(widgetRun instanceof HelperReferences)) {
                    widgetRun.mWidget.isTerminalWidget[i10] = false;
                }
                defineTerminalWidget(dependencyNode.mRun, i10);
            }
        }
        return false;
    }

    private long traverseEnd(DependencyNode dependencyNode, long j10) {
        WidgetRun widgetRun = dependencyNode.mRun;
        if (widgetRun instanceof HelperReferences) {
            return j10;
        }
        int size = dependencyNode.mDependencies.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            Dependency dependency = dependencyNode.mDependencies.get(i10);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.mRun != widgetRun) {
                    j11 = Math.min(j11, traverseEnd(dependencyNode2, dependencyNode2.mMargin + j10));
                }
            }
        }
        if (dependencyNode == widgetRun.end) {
            long wrapDimension = j10 - widgetRun.getWrapDimension();
            return Math.min(Math.min(j11, traverseEnd(widgetRun.start, wrapDimension)), wrapDimension - widgetRun.start.mMargin);
        }
        return j11;
    }

    private long traverseStart(DependencyNode dependencyNode, long j10) {
        WidgetRun widgetRun = dependencyNode.mRun;
        if (widgetRun instanceof HelperReferences) {
            return j10;
        }
        int size = dependencyNode.mDependencies.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            Dependency dependency = dependencyNode.mDependencies.get(i10);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.mRun != widgetRun) {
                    j11 = Math.max(j11, traverseStart(dependencyNode2, dependencyNode2.mMargin + j10));
                }
            }
        }
        if (dependencyNode == widgetRun.start) {
            long wrapDimension = j10 + widgetRun.getWrapDimension();
            return Math.max(Math.max(j11, traverseStart(widgetRun.end, wrapDimension)), wrapDimension - widgetRun.end.mMargin);
        }
        return j11;
    }

    public void add(WidgetRun widgetRun) {
        this.mRuns.add(widgetRun);
        this.mLastRun = widgetRun;
    }

    public long computeWrapSize(ConstraintWidgetContainer constraintWidgetContainer, int i10) {
        WidgetRun widgetRun;
        WidgetRun widgetRun2;
        WidgetRun widgetRun3 = this.mFirstRun;
        long j10 = 0;
        if (widgetRun3 instanceof ChainRun) {
            if (((ChainRun) widgetRun3).orientation != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(widgetRun3 instanceof HorizontalWidgetRun)) {
                return 0L;
            }
        } else if (!(widgetRun3 instanceof VerticalWidgetRun)) {
            return 0L;
        }
        if (i10 == 0) {
            widgetRun = constraintWidgetContainer.mHorizontalRun;
        } else {
            widgetRun = constraintWidgetContainer.mVerticalRun;
        }
        DependencyNode dependencyNode = widgetRun.start;
        if (i10 == 0) {
            widgetRun2 = constraintWidgetContainer.mHorizontalRun;
        } else {
            widgetRun2 = constraintWidgetContainer.mVerticalRun;
        }
        DependencyNode dependencyNode2 = widgetRun2.end;
        boolean contains = widgetRun3.start.mTargets.contains(dependencyNode);
        boolean contains2 = this.mFirstRun.end.mTargets.contains(dependencyNode2);
        long wrapDimension = this.mFirstRun.getWrapDimension();
        if (contains && contains2) {
            long traverseStart = traverseStart(this.mFirstRun.start, 0L);
            long traverseEnd = traverseEnd(this.mFirstRun.end, 0L);
            long j11 = traverseStart - wrapDimension;
            WidgetRun widgetRun4 = this.mFirstRun;
            int i11 = widgetRun4.end.mMargin;
            if (j11 >= (-i11)) {
                j11 += i11;
            }
            int i12 = widgetRun4.start.mMargin;
            long j12 = ((-traverseEnd) - wrapDimension) - i12;
            if (j12 >= i12) {
                j12 -= i12;
            }
            float biasPercent = widgetRun4.mWidget.getBiasPercent(i10);
            if (biasPercent > 0.0f) {
                j10 = (((float) j11) / (1.0f - biasPercent)) + (((float) j12) / biasPercent);
            }
            float f8 = (float) j10;
            long b10 = (f8 * biasPercent) + 0.5f + wrapDimension + a.b(1.0f, biasPercent, f8, 0.5f);
            WidgetRun widgetRun5 = this.mFirstRun;
            return (widgetRun5.start.mMargin + b10) - widgetRun5.end.mMargin;
        }
        if (contains) {
            return Math.max(traverseStart(this.mFirstRun.start, r12.mMargin), this.mFirstRun.start.mMargin + wrapDimension);
        }
        WidgetRun widgetRun6 = this.mFirstRun;
        if (contains2) {
            return Math.max(-traverseEnd(widgetRun6.end, r12.mMargin), (-this.mFirstRun.end.mMargin) + wrapDimension);
        }
        return (widgetRun6.getWrapDimension() + widgetRun6.start.mMargin) - this.mFirstRun.end.mMargin;
    }

    public void defineTerminalWidgets(boolean z9, boolean z10) {
        if (z9) {
            WidgetRun widgetRun = this.mFirstRun;
            if (widgetRun instanceof HorizontalWidgetRun) {
                defineTerminalWidget(widgetRun, 0);
            }
        }
        if (z10) {
            WidgetRun widgetRun2 = this.mFirstRun;
            if (widgetRun2 instanceof VerticalWidgetRun) {
                defineTerminalWidget(widgetRun2, 1);
            }
        }
    }
}
