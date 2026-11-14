package androidx.slidingpanelayout.widget;

import android.app.Activity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import c9.d;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import v8.a;
import v8.c1;
import v8.h0;
import v8.q;
import v8.s0;
import v8.y0;
import v8.z0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;", "", "Landroidx/window/layout/WindowInfoTracker;", "windowInfoTracker", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Landroidx/window/layout/WindowInfoTracker;Ljava/util/concurrent/Executor;)V", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfo", "Landroidx/window/layout/FoldingFeature;", "getFoldingFeature", "(Landroidx/window/layout/WindowLayoutInfo;)Landroidx/window/layout/FoldingFeature;", "Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;", "onFoldingFeatureChangeListener", "", "setOnFoldingFeatureChangeListener", "(Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;)V", "Landroid/app/Activity;", "activity", "registerLayoutStateChangeCallback", "(Landroid/app/Activity;)V", "unregisterLayoutStateChangeCallback", "()V", "Landroidx/window/layout/WindowInfoTracker;", "Ljava/util/concurrent/Executor;", "Lv8/z0;", "job", "Lv8/z0;", "Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;", "OnFoldingFeatureChangeListener", "slidingpanelayout_release"}, k = 1, mv = {1, 6, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class FoldingFeatureObserver {
    private final Executor executor;
    private z0 job;
    private OnFoldingFeatureChangeListener onFoldingFeatureChangeListener;
    private final WindowInfoTracker windowInfoTracker;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;", "", "onFoldingFeatureChange", "", "foldingFeature", "Landroidx/window/layout/FoldingFeature;", "slidingpanelayout_release"}, k = 1, mv = {1, 6, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public interface OnFoldingFeatureChangeListener {
        void onFoldingFeatureChange(FoldingFeature foldingFeature);
    }

    public FoldingFeatureObserver(WindowInfoTracker windowInfoTracker, Executor executor) {
        windowInfoTracker.getClass();
        executor.getClass();
        this.windowInfoTracker = windowInfoTracker;
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FoldingFeature getFoldingFeature(WindowLayoutInfo windowLayoutInfo) {
        Object obj;
        Iterator<T> it = windowLayoutInfo.getDisplayFeatures().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((DisplayFeature) obj) instanceof FoldingFeature) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (!(obj instanceof FoldingFeature)) {
            return null;
        }
        return (FoldingFeature) obj;
    }

    public final void registerLayoutStateChangeCallback(Activity activity) {
        activity.getClass();
        z0 z0Var = this.job;
        EmptyCoroutineContext emptyCoroutineContext = null;
        if (z0Var != null) {
            z0Var.c(null);
        }
        CoroutineContext s0Var = new s0(this.executor);
        if (s0Var.get(y0.f6058b) == null) {
            s0Var = s0Var.plus(new c1());
        }
        FoldingFeatureObserver$registerLayoutStateChangeCallback$1 foldingFeatureObserver$registerLayoutStateChangeCallback$1 = new FoldingFeatureObserver$registerLayoutStateChangeCallback$1(this, activity, null);
        if ((3 & 1) != 0) {
            emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext a10 = q.a(s0Var, emptyCoroutineContext, true);
        d dVar = h0.f6029a;
        if (a10 != dVar && a10.get(ContinuationInterceptor.INSTANCE) == null) {
            a10 = a10.plus(dVar);
        }
        a aVar = new a(a10, true);
        aVar.L(1, aVar, foldingFeatureObserver$registerLayoutStateChangeCallback$1);
        this.job = aVar;
    }

    public final void setOnFoldingFeatureChangeListener(OnFoldingFeatureChangeListener onFoldingFeatureChangeListener) {
        onFoldingFeatureChangeListener.getClass();
        this.onFoldingFeatureChangeListener = onFoldingFeatureChangeListener;
    }

    public final void unregisterLayoutStateChangeCallback() {
        z0 z0Var = this.job;
        if (z0Var == null) {
            return;
        }
        z0Var.c(null);
    }
}
