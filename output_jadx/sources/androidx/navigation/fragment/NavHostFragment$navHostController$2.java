package androidx.navigation.fragment;

import android.content.Context;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.NavHostController;
import androidx.savedstate.SavedStateRegistry;
import j1.i;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/navigation/NavHostController;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class NavHostFragment$navHostController$2 extends Lambda implements Function0<NavHostController> {
    final /* synthetic */ NavHostFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostFragment$navHostController$2(NavHostFragment navHostFragment) {
        super(0);
        this.this$0 = navHostFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle invoke$lambda$5$lambda$2(NavHostController navHostController) {
        navHostController.getClass();
        Bundle saveState = navHostController.saveState();
        if (saveState == null) {
            Bundle bundle = Bundle.EMPTY;
            bundle.getClass();
            return bundle;
        }
        return saveState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle invoke$lambda$5$lambda$4(NavHostFragment navHostFragment) {
        int i10;
        int i11;
        navHostFragment.getClass();
        i10 = navHostFragment.graphId;
        if (i10 != 0) {
            i11 = navHostFragment.graphId;
            return BundleKt.bundleOf(TuplesKt.to(NavHostFragment.KEY_GRAPH_ID, Integer.valueOf(i11)));
        }
        Bundle bundle = Bundle.EMPTY;
        bundle.getClass();
        return bundle;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final NavHostController invoke() {
        int i10;
        int i11;
        Bundle bundle;
        int i12;
        Context context = this.this$0.getContext();
        if (context != null) {
            final NavHostController navHostController = new NavHostController(context);
            final NavHostFragment navHostFragment = this.this$0;
            navHostController.setLifecycleOwner(navHostFragment);
            ViewModelStore viewModelStore = navHostFragment.getViewModelStore();
            viewModelStore.getClass();
            navHostController.setViewModelStore(viewModelStore);
            navHostFragment.onCreateNavHostController(navHostController);
            Bundle consumeRestoredStateForKey = navHostFragment.getSavedStateRegistry().consumeRestoredStateForKey("android-support-nav:fragment:navControllerState");
            if (consumeRestoredStateForKey != null) {
                navHostController.restoreState(consumeRestoredStateForKey);
            }
            final int i13 = 0;
            navHostFragment.getSavedStateRegistry().registerSavedStateProvider("android-support-nav:fragment:navControllerState", new SavedStateRegistry.SavedStateProvider() { // from class: androidx.navigation.fragment.e
                @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                public final Bundle saveState() {
                    Bundle invoke$lambda$5$lambda$2;
                    Bundle invoke$lambda$5$lambda$4;
                    switch (i13) {
                        case 0:
                            invoke$lambda$5$lambda$2 = NavHostFragment$navHostController$2.invoke$lambda$5$lambda$2((NavHostController) navHostController);
                            return invoke$lambda$5$lambda$2;
                        default:
                            invoke$lambda$5$lambda$4 = NavHostFragment$navHostController$2.invoke$lambda$5$lambda$4((NavHostFragment) navHostController);
                            return invoke$lambda$5$lambda$4;
                    }
                }
            });
            Bundle consumeRestoredStateForKey2 = navHostFragment.getSavedStateRegistry().consumeRestoredStateForKey(NavHostFragment.KEY_GRAPH_ID);
            if (consumeRestoredStateForKey2 != null) {
                navHostFragment.graphId = consumeRestoredStateForKey2.getInt(NavHostFragment.KEY_GRAPH_ID);
            }
            final int i14 = 1;
            navHostFragment.getSavedStateRegistry().registerSavedStateProvider(NavHostFragment.KEY_GRAPH_ID, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.navigation.fragment.e
                @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                public final Bundle saveState() {
                    Bundle invoke$lambda$5$lambda$2;
                    Bundle invoke$lambda$5$lambda$4;
                    switch (i14) {
                        case 0:
                            invoke$lambda$5$lambda$2 = NavHostFragment$navHostController$2.invoke$lambda$5$lambda$2((NavHostController) navHostFragment);
                            return invoke$lambda$5$lambda$2;
                        default:
                            invoke$lambda$5$lambda$4 = NavHostFragment$navHostController$2.invoke$lambda$5$lambda$4((NavHostFragment) navHostFragment);
                            return invoke$lambda$5$lambda$4;
                    }
                }
            });
            i10 = navHostFragment.graphId;
            if (i10 != 0) {
                i12 = navHostFragment.graphId;
                navHostController.setGraph(i12);
                return navHostController;
            }
            Bundle arguments = navHostFragment.getArguments();
            if (arguments != null) {
                i11 = arguments.getInt(NavHostFragment.KEY_GRAPH_ID);
            } else {
                i11 = 0;
            }
            if (arguments != null) {
                bundle = arguments.getBundle(NavHostFragment.KEY_START_DESTINATION_ARGS);
            } else {
                bundle = null;
            }
            if (i11 != 0) {
                navHostController.setGraph(i11, bundle);
            }
            return navHostController;
        }
        i.l("NavController cannot be created before the fragment is attached");
        return null;
    }
}
