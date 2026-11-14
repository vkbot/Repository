package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class HelperReferences extends WidgetRun {
    public HelperReferences(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    private void addDependency(DependencyNode dependencyNode) {
        this.start.mDependencies.add(dependencyNode);
        dependencyNode.mTargets.add(this.start);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void apply() {
        ConstraintWidget constraintWidget = this.mWidget;
        if (constraintWidget instanceof Barrier) {
            this.start.delegateToWidgetRun = true;
            Barrier barrier = (Barrier) constraintWidget;
            int barrierType = barrier.getBarrierType();
            boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
            int i10 = 0;
            if (barrierType != 0) {
                if (barrierType != 1) {
                    if (barrierType != 2) {
                        if (barrierType == 3) {
                            this.start.mType = DependencyNode.Type.BOTTOM;
                            while (i10 < barrier.mWidgetsCount) {
                                ConstraintWidget constraintWidget2 = barrier.mWidgets[i10];
                                if (allowsGoneWidget || constraintWidget2.getVisibility() != 8) {
                                    DependencyNode dependencyNode = constraintWidget2.mVerticalRun.end;
                                    dependencyNode.mDependencies.add(this.start);
                                    this.start.mTargets.add(dependencyNode);
                                }
                                i10++;
                            }
                            addDependency(this.mWidget.mVerticalRun.start);
                            addDependency(this.mWidget.mVerticalRun.end);
                            return;
                        }
                        return;
                    }
                    this.start.mType = DependencyNode.Type.TOP;
                    while (i10 < barrier.mWidgetsCount) {
                        ConstraintWidget constraintWidget3 = barrier.mWidgets[i10];
                        if (allowsGoneWidget || constraintWidget3.getVisibility() != 8) {
                            DependencyNode dependencyNode2 = constraintWidget3.mVerticalRun.start;
                            dependencyNode2.mDependencies.add(this.start);
                            this.start.mTargets.add(dependencyNode2);
                        }
                        i10++;
                    }
                    addDependency(this.mWidget.mVerticalRun.start);
                    addDependency(this.mWidget.mVerticalRun.end);
                    return;
                }
                this.start.mType = DependencyNode.Type.RIGHT;
                while (i10 < barrier.mWidgetsCount) {
                    ConstraintWidget constraintWidget4 = barrier.mWidgets[i10];
                    if (allowsGoneWidget || constraintWidget4.getVisibility() != 8) {
                        DependencyNode dependencyNode3 = constraintWidget4.mHorizontalRun.end;
                        dependencyNode3.mDependencies.add(this.start);
                        this.start.mTargets.add(dependencyNode3);
                    }
                    i10++;
                }
                addDependency(this.mWidget.mHorizontalRun.start);
                addDependency(this.mWidget.mHorizontalRun.end);
                return;
            }
            this.start.mType = DependencyNode.Type.LEFT;
            while (i10 < barrier.mWidgetsCount) {
                ConstraintWidget constraintWidget5 = barrier.mWidgets[i10];
                if (allowsGoneWidget || constraintWidget5.getVisibility() != 8) {
                    DependencyNode dependencyNode4 = constraintWidget5.mHorizontalRun.start;
                    dependencyNode4.mDependencies.add(this.start);
                    this.start.mTargets.add(dependencyNode4);
                }
                i10++;
            }
            addDependency(this.mWidget.mHorizontalRun.start);
            addDependency(this.mWidget.mHorizontalRun.end);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        ConstraintWidget constraintWidget = this.mWidget;
        if (constraintWidget instanceof Barrier) {
            int barrierType = ((Barrier) constraintWidget).getBarrierType();
            if (barrierType != 0 && barrierType != 1) {
                this.mWidget.setY(this.start.value);
            } else {
                this.mWidget.setX(this.start.value);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void clear() {
        this.mRunGroup = null;
        this.start.clear();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void reset() {
        this.start.resolved = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean supportsWrapComputation() {
        return false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        Barrier barrier = (Barrier) this.mWidget;
        int barrierType = barrier.getBarrierType();
        Iterator<DependencyNode> it = this.start.mTargets.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = it.next().value;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (barrierType != 0 && barrierType != 2) {
            this.start.resolve(barrier.getMargin() + i10);
        } else {
            this.start.resolve(barrier.getMargin() + i11);
        }
    }
}
