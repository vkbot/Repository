package androidx.navigation.fragment;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavigatorState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/LifecycleEventObserver;", "entry", "Landroidx/navigation/NavBackStackEntry;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class FragmentNavigator$fragmentViewObserver$1 extends Lambda implements Function1<NavBackStackEntry, LifecycleEventObserver> {
    final /* synthetic */ FragmentNavigator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentNavigator$fragmentViewObserver$1(FragmentNavigator fragmentNavigator) {
        super(1);
        this.this$0 = fragmentNavigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(FragmentNavigator fragmentNavigator, NavBackStackEntry navBackStackEntry, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        boolean isLoggingEnabled;
        NavigatorState state;
        NavigatorState state2;
        boolean isLoggingEnabled2;
        NavigatorState state3;
        fragmentNavigator.getClass();
        navBackStackEntry.getClass();
        lifecycleOwner.getClass();
        event.getClass();
        if (event == Lifecycle.Event.ON_RESUME) {
            state2 = fragmentNavigator.getState();
            if (((List) state2.getBackStack().getValue()).contains(navBackStackEntry)) {
                isLoggingEnabled2 = fragmentNavigator.isLoggingEnabled(2);
                if (isLoggingEnabled2) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + lifecycleOwner + " view lifecycle reaching RESUMED");
                }
                state3 = fragmentNavigator.getState();
                state3.markTransitionComplete(navBackStackEntry);
            }
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            isLoggingEnabled = fragmentNavigator.isLoggingEnabled(2);
            if (isLoggingEnabled) {
                Log.v("FragmentNavigator", "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + lifecycleOwner + " view lifecycle reaching DESTROYED");
            }
            state = fragmentNavigator.getState();
            state.markTransitionComplete(navBackStackEntry);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final LifecycleEventObserver invoke(final NavBackStackEntry navBackStackEntry) {
        navBackStackEntry.getClass();
        final FragmentNavigator fragmentNavigator = this.this$0;
        return new LifecycleEventObserver() { // from class: androidx.navigation.fragment.d
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                FragmentNavigator$fragmentViewObserver$1.invoke$lambda$0(FragmentNavigator.this, navBackStackEntry, lifecycleOwner, event);
            }
        };
    }
}
