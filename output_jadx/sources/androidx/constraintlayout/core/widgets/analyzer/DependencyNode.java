package androidx.constraintlayout.core.widgets.analyzer;

import ai.onnxruntime.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class DependencyNode implements Dependency {
    int mMargin;
    WidgetRun mRun;
    public int value;
    public Dependency updateDelegate = null;
    public boolean delegateToWidgetRun = false;
    public boolean readyToSolve = false;
    Type mType = Type.UNKNOWN;
    int mMarginFactor = 1;
    DimensionDependency mMarginDependency = null;
    public boolean resolved = false;
    List<Dependency> mDependencies = new ArrayList();
    List<DependencyNode> mTargets = new ArrayList();

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.mRun = widgetRun;
    }

    public void addDependency(Dependency dependency) {
        this.mDependencies.add(dependency);
        if (this.resolved) {
            dependency.update(dependency);
        }
    }

    public void clear() {
        this.mTargets.clear();
        this.mDependencies.clear();
        this.resolved = false;
        this.value = 0;
        this.readyToSolve = false;
        this.delegateToWidgetRun = false;
    }

    public String name() {
        String C;
        String debugName = this.mRun.mWidget.getDebugName();
        Type type = this.mType;
        if (type != Type.LEFT && type != Type.RIGHT) {
            C = a.C(debugName, "_VERTICAL");
        } else {
            C = a.C(debugName, "_HORIZONTAL");
        }
        StringBuilder w = a.w(C, ":");
        w.append(this.mType.name());
        return w.toString();
    }

    public void resolve(int i10) {
        if (!this.resolved) {
            this.resolved = true;
            this.value = i10;
            for (Dependency dependency : this.mDependencies) {
                dependency.update(dependency);
            }
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.mRun.mWidget.getDebugName());
        sb.append(":");
        sb.append(this.mType);
        sb.append("(");
        if (this.resolved) {
            obj = Integer.valueOf(this.value);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.mTargets.size());
        sb.append(":d=");
        sb.append(this.mDependencies.size());
        sb.append(">");
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        Iterator<DependencyNode> it = this.mTargets.iterator();
        while (it.hasNext()) {
            if (!it.next().resolved) {
                return;
            }
        }
        this.readyToSolve = true;
        Dependency dependency2 = this.updateDelegate;
        if (dependency2 != null) {
            dependency2.update(this);
        }
        if (this.delegateToWidgetRun) {
            this.mRun.update(this);
            return;
        }
        DependencyNode dependencyNode = null;
        int i10 = 0;
        for (DependencyNode dependencyNode2 : this.mTargets) {
            if (!(dependencyNode2 instanceof DimensionDependency)) {
                i10++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i10 == 1 && dependencyNode.resolved) {
            DimensionDependency dimensionDependency = this.mMarginDependency;
            if (dimensionDependency != null) {
                if (dimensionDependency.resolved) {
                    this.mMargin = this.mMarginFactor * dimensionDependency.value;
                } else {
                    return;
                }
            }
            resolve(dependencyNode.value + this.mMargin);
        }
        Dependency dependency3 = this.updateDelegate;
        if (dependency3 != null) {
            dependency3.update(this);
        }
    }
}
