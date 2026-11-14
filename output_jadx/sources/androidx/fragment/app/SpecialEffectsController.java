package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import androidx.fragment.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.io.FilenameUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000 *2\u00020\u0001:\u0003*+,B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0016\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J#\u0010\u001a\u001a\u00020\u000f2\u0011\u0010\u001b\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\bH&J\u0006\u0010\u001f\u001a\u00020\u000fJ\u0012\u0010 \u001a\u0004\u0018\u00010\f2\u0006\u0010!\u001a\u00020\"H\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010\f2\u0006\u0010!\u001a\u00020\"H\u0002J\u0006\u0010$\u001a\u00020\u000fJ\u0006\u0010%\u001a\u00020\u000fJ\u0010\u0010&\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010'\u001a\u00020\u000fJ\b\u0010(\u001a\u00020\u000fH\u0002J\u000e\u0010)\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController;", "", "container", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "getContainer", "()Landroid/view/ViewGroup;", "isContainerPostponed", "", "operationDirectionIsPop", "pendingOperations", "", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "runningOperations", "enqueue", "", "finalState", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "lifecycleImpact", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "fragmentStateManager", "Landroidx/fragment/app/FragmentStateManager;", "enqueueAdd", "enqueueHide", "enqueueRemove", "enqueueShow", "executeOperations", "operations", "", "Lkotlin/jvm/JvmSuppressWildcards;", "isPop", "executePendingOperations", "findPendingOperation", "fragment", "Landroidx/fragment/app/Fragment;", "findRunningOperation", "forceCompleteAllOperations", "forcePostponedExecutePendingOperations", "getAwaitingCompletionLifecycleImpact", "markPostponedState", "updateFinalState", "updateOperationDirection", "Companion", "FragmentStateManagerOperation", "Operation", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n288#2,2:711\n288#2,2:713\n533#2,6:715\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n*L\n69#1:711,2\n75#1:713,2\n166#1:715,6\n*E\n"})
/* loaded from: classes.dex */
public abstract class SpecialEffectsController {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ViewGroup container;
    private boolean isContainerPostponed;
    private boolean operationDirectionIsPop;
    private final List<Operation> pendingOperations;
    private final List<Operation> runningOperations;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "finalState", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "lifecycleImpact", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "fragmentStateManager", "Landroidx/fragment/app/FragmentStateManager;", "cancellationSignal", "Landroidx/core/os/CancellationSignal;", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/FragmentStateManager;Landroidx/core/os/CancellationSignal;)V", "complete", "", "onStart", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class FragmentStateManagerOperation extends Operation {
        private final FragmentStateManager fragmentStateManager;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public FragmentStateManagerOperation(androidx.fragment.app.SpecialEffectsController.Operation.State r2, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r3, androidx.fragment.app.FragmentStateManager r4, androidx.core.os.CancellationSignal r5) {
            /*
                r1 = this;
                r2.getClass()
                r3.getClass()
                r4.getClass()
                r5.getClass()
                androidx.fragment.app.Fragment r0 = r4.getFragment()
                r0.getClass()
                r1.<init>(r2, r3, r0, r5)
                r1.fragmentStateManager = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.SpecialEffectsController.FragmentStateManagerOperation.<init>(androidx.fragment.app.SpecialEffectsController$Operation$State, androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact, androidx.fragment.app.FragmentStateManager, androidx.core.os.CancellationSignal):void");
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void complete() {
            super.complete();
            this.fragmentStateManager.moveToExpectedState();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void onStart() {
            if (getLifecycleImpact() == Operation.LifecycleImpact.ADDING) {
                Fragment fragment = this.fragmentStateManager.getFragment();
                fragment.getClass();
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                View requireView = getFragment().requireView();
                requireView.getClass();
                if (requireView.getParent() == null) {
                    this.fragmentStateManager.addViewToContainer();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
                return;
            }
            if (getLifecycleImpact() == Operation.LifecycleImpact.REMOVING) {
                Fragment fragment2 = this.fragmentStateManager.getFragment();
                fragment2.getClass();
                View requireView2 = fragment2.requireView();
                requireView2.getClass();
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + fragment2);
                }
                requireView2.clearFocus();
            }
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[Operation.LifecycleImpact.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SpecialEffectsController(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.container = viewGroup;
        this.pendingOperations = new ArrayList();
        this.runningOperations = new ArrayList();
    }

    private final void enqueue(Operation.State finalState, Operation.LifecycleImpact lifecycleImpact, FragmentStateManager fragmentStateManager) {
        synchronized (this.pendingOperations) {
            CancellationSignal cancellationSignal = new CancellationSignal();
            Fragment fragment = fragmentStateManager.getFragment();
            fragment.getClass();
            Operation findPendingOperation = findPendingOperation(fragment);
            if (findPendingOperation != null) {
                findPendingOperation.mergeWith(finalState, lifecycleImpact);
                return;
            }
            FragmentStateManagerOperation fragmentStateManagerOperation = new FragmentStateManagerOperation(finalState, lifecycleImpact, fragmentStateManager, cancellationSignal);
            this.pendingOperations.add(fragmentStateManagerOperation);
            fragmentStateManagerOperation.addCompletionListener(new j(this, fragmentStateManagerOperation, 0));
            fragmentStateManagerOperation.addCompletionListener(new j(this, fragmentStateManagerOperation, 1));
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final void enqueue$lambda$4$lambda$2(SpecialEffectsController specialEffectsController, FragmentStateManagerOperation fragmentStateManagerOperation) {
        specialEffectsController.getClass();
        fragmentStateManagerOperation.getClass();
        if (specialEffectsController.pendingOperations.contains(fragmentStateManagerOperation)) {
            Operation.State finalState = fragmentStateManagerOperation.getFinalState();
            View view = fragmentStateManagerOperation.getFragment().mView;
            view.getClass();
            finalState.applyState(view);
        }
    }

    public static final void enqueue$lambda$4$lambda$3(SpecialEffectsController specialEffectsController, FragmentStateManagerOperation fragmentStateManagerOperation) {
        specialEffectsController.getClass();
        fragmentStateManagerOperation.getClass();
        specialEffectsController.pendingOperations.remove(fragmentStateManagerOperation);
        specialEffectsController.runningOperations.remove(fragmentStateManagerOperation);
    }

    private final Operation findPendingOperation(Fragment fragment) {
        Object obj;
        Iterator<T> it = this.pendingOperations.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Operation operation = (Operation) obj;
                if (Intrinsics.areEqual(operation.getFragment(), fragment) && !operation.getIsCanceled()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Operation) obj;
    }

    private final Operation findRunningOperation(Fragment fragment) {
        Object obj;
        Iterator<T> it = this.runningOperations.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Operation operation = (Operation) obj;
                if (Intrinsics.areEqual(operation.getFragment(), fragment) && !operation.getIsCanceled()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Operation) obj;
    }

    @JvmStatic
    public static final SpecialEffectsController getOrCreateController(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return INSTANCE.getOrCreateController(viewGroup, fragmentManager);
    }

    private final void updateFinalState() {
        for (Operation operation : this.pendingOperations) {
            if (operation.getLifecycleImpact() == Operation.LifecycleImpact.ADDING) {
                View requireView = operation.getFragment().requireView();
                requireView.getClass();
                operation.mergeWith(Operation.State.INSTANCE.from(requireView.getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    public final void enqueueAdd(Operation.State finalState, FragmentStateManager fragmentStateManager) {
        finalState.getClass();
        fragmentStateManager.getClass();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(finalState, Operation.LifecycleImpact.ADDING, fragmentStateManager);
    }

    public final void enqueueHide(FragmentStateManager fragmentStateManager) {
        fragmentStateManager.getClass();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.GONE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void enqueueRemove(FragmentStateManager fragmentStateManager) {
        fragmentStateManager.getClass();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, fragmentStateManager);
    }

    public final void enqueueShow(FragmentStateManager fragmentStateManager) {
        fragmentStateManager.getClass();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public abstract void executeOperations(List<Operation> operations, boolean isPop);

    public final void executePendingOperations() {
        if (this.isContainerPostponed) {
            return;
        }
        if (!ViewCompat.isAttachedToWindow(this.container)) {
            forceCompleteAllOperations();
            this.operationDirectionIsPop = false;
            return;
        }
        synchronized (this.pendingOperations) {
            try {
                if (!this.pendingOperations.isEmpty()) {
                    List<Operation> mutableList = CollectionsKt.toMutableList((Collection) this.runningOperations);
                    this.runningOperations.clear();
                    for (Operation operation : mutableList) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "SpecialEffectsController: Cancelling operation " + operation);
                        }
                        operation.cancel();
                        if (!operation.getIsComplete()) {
                            this.runningOperations.add(operation);
                        }
                    }
                    updateFinalState();
                    List<Operation> mutableList2 = CollectionsKt.toMutableList((Collection) this.pendingOperations);
                    this.pendingOperations.clear();
                    this.runningOperations.addAll(mutableList2);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator<Operation> it = mutableList2.iterator();
                    while (it.hasNext()) {
                        it.next().onStart();
                    }
                    executeOperations(mutableList2, this.operationDirectionIsPop);
                    this.operationDirectionIsPop = false;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void forceCompleteAllOperations() {
        String str;
        String str2;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = ViewCompat.isAttachedToWindow(this.container);
        synchronized (this.pendingOperations) {
            try {
                updateFinalState();
                Iterator<Operation> it = this.pendingOperations.iterator();
                while (it.hasNext()) {
                    it.next().onStart();
                }
                for (Operation operation : CollectionsKt.toMutableList((Collection) this.runningOperations)) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.container + " is not attached to window. ";
                        }
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: " + str2 + "Cancelling running operation " + operation);
                    }
                    operation.cancel();
                }
                for (Operation operation2 : CollectionsKt.toMutableList((Collection) this.pendingOperations)) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.container + " is not attached to window. ";
                        }
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: " + str + "Cancelling pending operation " + operation2);
                    }
                    operation2.cancel();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void forcePostponedExecutePendingOperations() {
        if (this.isContainerPostponed) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "SpecialEffectsController: Forcing postponed operations");
            }
            this.isContainerPostponed = false;
            executePendingOperations();
        }
    }

    public final Operation.LifecycleImpact getAwaitingCompletionLifecycleImpact(FragmentStateManager fragmentStateManager) {
        Operation.LifecycleImpact lifecycleImpact;
        int i10;
        fragmentStateManager.getClass();
        Fragment fragment = fragmentStateManager.getFragment();
        fragment.getClass();
        Operation findPendingOperation = findPendingOperation(fragment);
        Operation.LifecycleImpact lifecycleImpact2 = null;
        if (findPendingOperation != null) {
            lifecycleImpact = findPendingOperation.getLifecycleImpact();
        } else {
            lifecycleImpact = null;
        }
        Operation findRunningOperation = findRunningOperation(fragment);
        if (findRunningOperation != null) {
            lifecycleImpact2 = findRunningOperation.getLifecycleImpact();
        }
        if (lifecycleImpact == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
        }
        if (i10 != -1 && i10 != 1) {
            return lifecycleImpact;
        }
        return lifecycleImpact2;
    }

    public final ViewGroup getContainer() {
        return this.container;
    }

    public final void markPostponedState() {
        Fragment fragment;
        Operation operation;
        boolean z9;
        synchronized (this.pendingOperations) {
            try {
                updateFinalState();
                List<Operation> list = this.pendingOperations;
                ListIterator<Operation> listIterator = list.listIterator(list.size());
                while (true) {
                    fragment = null;
                    if (listIterator.hasPrevious()) {
                        operation = listIterator.previous();
                        Operation operation2 = operation;
                        Operation.State.Companion companion = Operation.State.INSTANCE;
                        View view = operation2.getFragment().mView;
                        view.getClass();
                        Operation.State asOperationState = companion.asOperationState(view);
                        Operation.State finalState = operation2.getFinalState();
                        Operation.State state = Operation.State.VISIBLE;
                        if (finalState == state && asOperationState != state) {
                            break;
                        }
                    } else {
                        operation = null;
                        break;
                    }
                }
                Operation operation3 = operation;
                if (operation3 != null) {
                    fragment = operation3.getFragment();
                }
                if (fragment != null) {
                    z9 = fragment.isPostponed();
                } else {
                    z9 = false;
                }
                this.isContainerPostponed = z9;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void updateOperationDirection(boolean isPop) {
        this.operationDirectionIsPop = isPop;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0002+,B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\rJ\u0006\u0010\"\u001a\u00020 J\b\u0010#\u001a\u00020 H\u0017J\u000e\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\tJ\u000e\u0010&\u001a\u00020 2\u0006\u0010%\u001a\u00020\tJ\u0016\u0010'\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010(\u001a\u00020 H\u0016J\b\u0010)\u001a\u00020*H\u0016R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation;", "", "finalState", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "lifecycleImpact", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "fragment", "Landroidx/fragment/app/Fragment;", "cancellationSignal", "Landroidx/core/os/CancellationSignal;", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/Fragment;Landroidx/core/os/CancellationSignal;)V", "completionListeners", "", "Ljava/lang/Runnable;", "getFinalState", "()Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "setFinalState", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "<set-?>", "", "isCanceled", "()Z", "isComplete", "getLifecycleImpact", "()Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "setLifecycleImpact", "(Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;)V", "specialEffectsSignals", "", "addCompletionListener", "", "listener", "cancel", "complete", "completeSpecialEffect", "signal", "markStartedSpecialEffect", "mergeWith", "onStart", "toString", "", "LifecycleImpact", "State", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n1855#2,2:711\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n*L\n607#1:711,2\n*E\n"})
    /* loaded from: classes.dex */
    public static class Operation {
        private final List<Runnable> completionListeners;
        private State finalState;
        private final Fragment fragment;
        private boolean isCanceled;
        private boolean isComplete;
        private LifecycleImpact lifecycleImpact;
        private final Set<CancellationSignal> specialEffectsSignals;

        /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "", "(Ljava/lang/String;I)V", "NONE", "ADDING", "REMOVING", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        /* loaded from: classes.dex */
        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        /* loaded from: classes.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LifecycleImpact.values().length];
                try {
                    iArr[LifecycleImpact.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LifecycleImpact.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LifecycleImpact.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Operation(State state, LifecycleImpact lifecycleImpact, Fragment fragment, CancellationSignal cancellationSignal) {
            state.getClass();
            lifecycleImpact.getClass();
            fragment.getClass();
            cancellationSignal.getClass();
            this.finalState = state;
            this.lifecycleImpact = lifecycleImpact;
            this.fragment = fragment;
            this.completionListeners = new ArrayList();
            this.specialEffectsSignals = new LinkedHashSet();
            cancellationSignal.setOnCancelListener(new h(1, this));
        }

        public static final void _init_$lambda$0(Operation operation) {
            operation.getClass();
            operation.cancel();
        }

        public final void addCompletionListener(Runnable listener) {
            listener.getClass();
            this.completionListeners.add(listener);
        }

        public final void cancel() {
            if (!this.isCanceled) {
                this.isCanceled = true;
                if (this.specialEffectsSignals.isEmpty()) {
                    complete();
                    return;
                }
                Iterator it = CollectionsKt.toMutableSet(this.specialEffectsSignals).iterator();
                while (it.hasNext()) {
                    ((CancellationSignal) it.next()).cancel();
                }
            }
        }

        @CallSuper
        public void complete() {
            if (!this.isComplete) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: " + this + " has called complete.");
                }
                this.isComplete = true;
                Iterator<T> it = this.completionListeners.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }

        public final void completeSpecialEffect(CancellationSignal signal) {
            signal.getClass();
            if (this.specialEffectsSignals.remove(signal) && this.specialEffectsSignals.isEmpty()) {
                complete();
            }
        }

        public final State getFinalState() {
            return this.finalState;
        }

        public final Fragment getFragment() {
            return this.fragment;
        }

        public final LifecycleImpact getLifecycleImpact() {
            return this.lifecycleImpact;
        }

        /* renamed from: isCanceled, reason: from getter */
        public final boolean getIsCanceled() {
            return this.isCanceled;
        }

        /* renamed from: isComplete, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        public final void markStartedSpecialEffect(CancellationSignal signal) {
            signal.getClass();
            onStart();
            this.specialEffectsSignals.add(signal);
        }

        public final void mergeWith(State finalState, LifecycleImpact lifecycleImpact) {
            finalState.getClass();
            lifecycleImpact.getClass();
            int i10 = WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3 && this.finalState != State.REMOVED) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> " + finalState + FilenameUtils.EXTENSION_SEPARATOR);
                        }
                        this.finalState = finalState;
                        return;
                    }
                    return;
                }
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> REMOVED. mLifecycleImpact  = " + this.lifecycleImpact + " to REMOVING.");
                }
                this.finalState = State.REMOVED;
                this.lifecycleImpact = LifecycleImpact.REMOVING;
                return;
            }
            if (this.finalState == State.REMOVED) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.lifecycleImpact + " to ADDING.");
                }
                this.finalState = State.VISIBLE;
                this.lifecycleImpact = LifecycleImpact.ADDING;
            }
        }

        public final void setFinalState(State state) {
            state.getClass();
            this.finalState = state;
        }

        public final void setLifecycleImpact(LifecycleImpact lifecycleImpact) {
            lifecycleImpact.getClass();
            this.lifecycleImpact = lifecycleImpact;
        }

        public String toString() {
            StringBuilder x9 = ai.onnxruntime.a.x("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            x9.append(this.finalState);
            x9.append(" lifecycleImpact = ");
            x9.append(this.lifecycleImpact);
            x9.append(" fragment = ");
            x9.append(this.fragment);
            x9.append('}');
            return x9.toString();
        }

        /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "", "(Ljava/lang/String;I)V", "applyState", "", "view", "Landroid/view/View;", "REMOVED", "VISIBLE", "GONE", "INVISIBLE", "Companion", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        /* loaded from: classes.dex */
        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            /* loaded from: classes.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @JvmStatic
            public static final State from(int i10) {
                return INSTANCE.from(i10);
            }

            public final void applyState(View view) {
                ViewGroup viewGroup;
                view.getClass();
                int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                                }
                                view.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        view.setVisibility(8);
                        return;
                    }
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }

            /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\n\u0010\u0007\u001a\u00020\u0004*\u00020\b¨\u0006\t"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;", "", "()V", TypedValues.TransitionType.S_FROM, "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "visibility", "", "asOperationState", "Landroid/view/View;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            /* loaded from: classes.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final State asOperationState(View view) {
                    view.getClass();
                    if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                        return State.INVISIBLE;
                    }
                    return from(view.getVisibility());
                }

                @JvmStatic
                public final State from(int i10) {
                    if (i10 != 0) {
                        if (i10 != 4) {
                            if (i10 == 8) {
                                return State.GONE;
                            }
                            j1.i.k(ai.onnxruntime.a.e(i10, "Unknown visibility "));
                            return null;
                        }
                        return State.INVISIBLE;
                    }
                    return State.VISIBLE;
                }

                private Companion() {
                }
            }
        }

        public void onStart() {
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Companion;", "", "()V", "getOrCreateController", "Landroidx/fragment/app/SpecialEffectsController;", "container", "Landroid/view/ViewGroup;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "factory", "Landroidx/fragment/app/SpecialEffectsControllerFactory;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final SpecialEffectsController getOrCreateController(ViewGroup container, SpecialEffectsControllerFactory factory) {
            container.getClass();
            factory.getClass();
            Object tag = container.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof SpecialEffectsController) {
                return (SpecialEffectsController) tag;
            }
            SpecialEffectsController createController = factory.createController(container);
            createController.getClass();
            container.setTag(R.id.special_effects_controller_view_tag, createController);
            return createController;
        }

        private Companion() {
        }

        @JvmStatic
        public final SpecialEffectsController getOrCreateController(ViewGroup container, FragmentManager fragmentManager) {
            container.getClass();
            fragmentManager.getClass();
            SpecialEffectsControllerFactory specialEffectsControllerFactory = fragmentManager.getSpecialEffectsControllerFactory();
            specialEffectsControllerFactory.getClass();
            return getOrCreateController(container, specialEffectsControllerFactory);
        }
    }

    @JvmStatic
    public static final SpecialEffectsController getOrCreateController(ViewGroup viewGroup, SpecialEffectsControllerFactory specialEffectsControllerFactory) {
        return INSTANCE.getOrCreateController(viewGroup, specialEffectsControllerFactory);
    }
}
