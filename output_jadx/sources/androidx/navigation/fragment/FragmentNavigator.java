package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.NavigatorState;
import androidx.navigation.fragment.FragmentNavigator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import l9.i;
import y8.t;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Navigator.Name("fragment")
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 W2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004XWYZB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010#\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J'\u0010+\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b)\u0010*J\u001f\u0010.\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\fH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0002H\u0016¢\u0006\u0004\b0\u00101J1\u00105\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u001f2\b\u00104\u001a\u0004\u0018\u000103H\u0017¢\u0006\u0004\b5\u00106J1\u0010\u001a\u001a\u00020\u00132\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000f072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u00109J\u0017\u0010;\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u000fH\u0016¢\u0006\u0004\b;\u0010<J\u0011\u0010=\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00132\u0006\u0010-\u001a\u000203H\u0016¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010AR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010BR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010CR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001f0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR,\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\f0H0G8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020M0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR \u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f070S8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006["}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/FragmentNavigator$Destination;", "Landroid/content/Context;", "context", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "containerId", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;I)V", "level", "", "isLoggingEnabled", "(I)Z", "Landroidx/navigation/NavBackStackEntry;", "entry", "Landroidx/fragment/app/Fragment;", "fragment", "", "attachObservers", "(Landroidx/navigation/NavBackStackEntry;Landroidx/fragment/app/Fragment;)V", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "navigate", "(Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroidx/fragment/app/FragmentTransaction;", "createFragmentTransaction", "(Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavOptions;)Landroidx/fragment/app/FragmentTransaction;", "", "id", "isPop", "deduplicate", "addPendingOps", "(Ljava/lang/String;ZZ)V", "Landroidx/navigation/NavigatorState;", "state", "onAttach", "(Landroidx/navigation/NavigatorState;)V", "attachClearViewModel$navigation_fragment_release", "(Landroidx/fragment/app/Fragment;Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavigatorState;)V", "attachClearViewModel", "popUpTo", "savedState", "popBackStack", "(Landroidx/navigation/NavBackStackEntry;Z)V", "createDestination", "()Landroidx/navigation/fragment/FragmentNavigator$Destination;", "className", "Landroid/os/Bundle;", "args", "instantiateFragment", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/Fragment;", "", "entries", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "backStackEntry", "onLaunchSingleTop", "(Landroidx/navigation/NavBackStackEntry;)V", "onSaveState", "()Landroid/os/Bundle;", "onRestoreState", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "Landroidx/fragment/app/FragmentManager;", "I", "", "savedIds", "Ljava/util/Set;", "", "Lkotlin/Pair;", "pendingOps", "Ljava/util/List;", "getPendingOps$navigation_fragment_release", "()Ljava/util/List;", "Landroidx/lifecycle/LifecycleEventObserver;", "fragmentObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "Lkotlin/Function1;", "fragmentViewObserver", "Lkotlin/jvm/functions/Function1;", "Ly8/t;", "getBackStack$navigation_fragment_release", "()Ly8/t;", "backStack", "Companion", "ClearEntryStateViewModel", "Destination", "Extras", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,712:1\n31#2:713\n63#2,2:714\n766#3:716\n857#3,2:717\n1855#3,2:719\n518#3,7:721\n533#3,6:728\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n*L\n268#1:713\n268#1:714,2\n314#1:716\n314#1:717,2\n322#1:719,2\n99#1:721,7\n148#1:728,6\n*E\n"})
/* loaded from: classes.dex */
public class FragmentNavigator extends Navigator<Destination> {
    private static final Companion Companion = new Companion(null);
    private static final String KEY_SAVED_IDS = "androidx-nav-fragment:navigator:savedIds";
    private static final String TAG = "FragmentNavigator";
    private final int containerId;
    private final Context context;
    private final FragmentManager fragmentManager;
    private final LifecycleEventObserver fragmentObserver;
    private final Function1<NavBackStackEntry, LifecycleEventObserver> fragmentViewObserver;
    private final List<Pair<String, Boolean>> pendingOps;
    private final Set<String> savedIds;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0014R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$ClearEntryStateViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "completeTransition", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function0;", "", "getCompleteTransition", "()Ljava/lang/ref/WeakReference;", "setCompleteTransition", "(Ljava/lang/ref/WeakReference;)V", "onCleared", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class ClearEntryStateViewModel extends ViewModel {
        public WeakReference<Function0<Unit>> completeTransition;

        public final WeakReference<Function0<Unit>> getCompleteTransition() {
            WeakReference<Function0<Unit>> weakReference = this.completeTransition;
            if (weakReference != null) {
                return weakReference;
            }
            Intrinsics.throwUninitializedPropertyAccessException("completeTransition");
            return null;
        }

        @Override // androidx.lifecycle.ViewModel
        public void onCleared() {
            super.onCleared();
            Function0<Unit> function0 = getCompleteTransition().get();
            if (function0 != null) {
                function0.invoke();
            }
        }

        public final void setCompleteTransition(WeakReference<Function0<Unit>> weakReference) {
            weakReference.getClass();
            this.completeTransition = weakReference;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\fB\u001b\b\u0000\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\bj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Extras;", "Landroidx/navigation/Navigator$Extras;", "sharedElements", "", "Landroid/view/View;", "", "(Ljava/util/Map;)V", "_sharedElements", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "getSharedElements", "()Ljava/util/Map;", "Builder", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class Extras implements Navigator.Extras {
        private final LinkedHashMap<View, String> _sharedElements;

        /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0006J\u001a\u0010\u000b\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\rJ\u0006\u0010\u000e\u001a\u00020\u000fR*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Extras$Builder;", "", "()V", "_sharedElements", "Ljava/util/LinkedHashMap;", "Landroid/view/View;", "", "Lkotlin/collections/LinkedHashMap;", "addSharedElement", "sharedElement", "name", "addSharedElements", "sharedElements", "", "build", "Landroidx/navigation/fragment/FragmentNavigator$Extras;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        /* loaded from: classes.dex */
        public static final class Builder {
            private final LinkedHashMap<View, String> _sharedElements = new LinkedHashMap<>();

            public final Builder addSharedElement(View sharedElement, String name) {
                sharedElement.getClass();
                name.getClass();
                this._sharedElements.put(sharedElement, name);
                return this;
            }

            public final Builder addSharedElements(Map<View, String> sharedElements) {
                sharedElements.getClass();
                for (Map.Entry<View, String> entry : sharedElements.entrySet()) {
                    addSharedElement(entry.getKey(), entry.getValue());
                }
                return this;
            }

            public final Extras build() {
                return new Extras(this._sharedElements);
            }
        }

        public Extras(Map<View, String> map) {
            map.getClass();
            LinkedHashMap<View, String> linkedHashMap = new LinkedHashMap<>();
            this._sharedElements = linkedHashMap;
            linkedHashMap.putAll(map);
        }

        public final Map<View, String> getSharedElements() {
            return MapsKt.toMap(this._sharedElements);
        }
    }

    public FragmentNavigator(Context context, FragmentManager fragmentManager, int i10) {
        context.getClass();
        fragmentManager.getClass();
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.containerId = i10;
        this.savedIds = new LinkedHashSet();
        this.pendingOps = new ArrayList();
        this.fragmentObserver = new LifecycleEventObserver() { // from class: androidx.navigation.fragment.b
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                FragmentNavigator.fragmentObserver$lambda$1(FragmentNavigator.this, lifecycleOwner, event);
            }
        };
        this.fragmentViewObserver = new FragmentNavigator$fragmentViewObserver$1(this);
    }

    private final void addPendingOps(final String id, boolean isPop, boolean deduplicate) {
        if (deduplicate) {
            CollectionsKt__MutableCollectionsKt.removeAll((List) this.pendingOps, (Function1) new Function1<Pair<? extends String, ? extends Boolean>, Boolean>() { // from class: androidx.navigation.fragment.FragmentNavigator$addPendingOps$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Boolean invoke2(Pair<String, Boolean> pair) {
                    pair.getClass();
                    return Boolean.valueOf(Intrinsics.areEqual(pair.getFirst(), id));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends String, ? extends Boolean> pair) {
                    return invoke2((Pair<String, Boolean>) pair);
                }
            });
        }
        this.pendingOps.add(TuplesKt.to(id, Boolean.valueOf(isPop)));
    }

    public static /* synthetic */ void addPendingOps$default(FragmentNavigator fragmentNavigator, String str, boolean z9, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z9 = false;
            }
            if ((i10 & 4) != 0) {
                z10 = true;
            }
            fragmentNavigator.addPendingOps(str, z9, z10);
            return;
        }
        androidx.navigation.b.g("Super calls with default arguments not supported in this target, function: addPendingOps");
    }

    private final void attachObservers(final NavBackStackEntry entry, final Fragment fragment) {
        fragment.getViewLifecycleOwnerLiveData().observe(fragment, new FragmentNavigator$sam$androidx_lifecycle_Observer$0(new Function1<LifecycleOwner, Unit>() { // from class: androidx.navigation.fragment.FragmentNavigator$attachObservers$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LifecycleOwner lifecycleOwner) {
                Function1 function1;
                List<Pair<String, Boolean>> pendingOps$navigation_fragment_release = FragmentNavigator.this.getPendingOps$navigation_fragment_release();
                Fragment fragment2 = fragment;
                boolean z9 = false;
                if (pendingOps$navigation_fragment_release == null || !pendingOps$navigation_fragment_release.isEmpty()) {
                    Iterator<T> it = pendingOps$navigation_fragment_release.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (Intrinsics.areEqual(((Pair) it.next()).getFirst(), fragment2.getTag())) {
                            z9 = true;
                            break;
                        }
                    }
                }
                if (lifecycleOwner != null && !z9) {
                    Lifecycle lifecycle = fragment.getViewLifecycleOwner().getLifecycle();
                    if (lifecycle.getState().isAtLeast(Lifecycle.State.CREATED)) {
                        function1 = FragmentNavigator.this.fragmentViewObserver;
                        lifecycle.addObserver((LifecycleObserver) function1.invoke(entry));
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LifecycleOwner lifecycleOwner) {
                invoke2(lifecycleOwner);
                return Unit.INSTANCE;
            }
        }));
        fragment.getLifecycle().addObserver(this.fragmentObserver);
    }

    private final FragmentTransaction createFragmentTransaction(NavBackStackEntry entry, NavOptions navOptions) {
        int i10;
        int i11;
        int i12;
        int i13;
        NavDestination destination = entry.getDestination();
        destination.getClass();
        Bundle arguments = entry.getArguments();
        String className = ((Destination) destination).getClassName();
        int i14 = 0;
        if (className.charAt(0) == '.') {
            className = this.context.getPackageName() + className;
        }
        Fragment instantiate = this.fragmentManager.getFragmentFactory().instantiate(this.context.getClassLoader(), className);
        instantiate.getClass();
        instantiate.setArguments(arguments);
        FragmentTransaction beginTransaction = this.fragmentManager.beginTransaction();
        beginTransaction.getClass();
        if (navOptions != null) {
            i10 = navOptions.getEnterAnim();
        } else {
            i10 = -1;
        }
        if (navOptions != null) {
            i11 = navOptions.getExitAnim();
        } else {
            i11 = -1;
        }
        if (navOptions != null) {
            i12 = navOptions.getPopEnterAnim();
        } else {
            i12 = -1;
        }
        if (navOptions != null) {
            i13 = navOptions.getPopExitAnim();
        } else {
            i13 = -1;
        }
        if (i10 != -1 || i11 != -1 || i12 != -1 || i13 != -1) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i11 == -1) {
                i11 = 0;
            }
            if (i12 == -1) {
                i12 = 0;
            }
            if (i13 != -1) {
                i14 = i13;
            }
            beginTransaction.setCustomAnimations(i10, i11, i12, i14);
        }
        beginTransaction.replace(this.containerId, instantiate, entry.getId());
        beginTransaction.setPrimaryNavigationFragment(instantiate);
        beginTransaction.setReorderingAllowed(true);
        return beginTransaction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fragmentObserver$lambda$1(FragmentNavigator fragmentNavigator, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        fragmentNavigator.getClass();
        lifecycleOwner.getClass();
        event.getClass();
        if (event == Lifecycle.Event.ON_DESTROY) {
            Fragment fragment = (Fragment) lifecycleOwner;
            Object obj = null;
            for (Object obj2 : (Iterable) fragmentNavigator.getState().getTransitionsInProgress().getValue()) {
                if (Intrinsics.areEqual(((NavBackStackEntry) obj2).getId(), fragment.getTag())) {
                    obj = obj2;
                }
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            if (navBackStackEntry != null) {
                if (fragmentNavigator.isLoggingEnabled(2)) {
                    Log.v(TAG, "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + lifecycleOwner + " lifecycle reaching DESTROYED");
                }
                fragmentNavigator.getState().markTransitionComplete(navBackStackEntry);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLoggingEnabled(int level) {
        if (!Log.isLoggable(FragmentManager.TAG, level) && !Log.isLoggable(TAG, level)) {
            return false;
        }
        return true;
    }

    private final void navigate(NavBackStackEntry entry, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        boolean isEmpty = ((List) getState().getBackStack().getValue()).isEmpty();
        if (navOptions != null && !isEmpty && navOptions.getRestoreState() && this.savedIds.remove(entry.getId())) {
            this.fragmentManager.restoreBackStack(entry.getId());
            getState().pushWithTransition(entry);
            return;
        }
        FragmentTransaction createFragmentTransaction = createFragmentTransaction(entry, navOptions);
        if (!isEmpty) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.lastOrNull((List) getState().getBackStack().getValue());
            if (navBackStackEntry != null) {
                addPendingOps$default(this, navBackStackEntry.getId(), false, false, 6, null);
            }
            addPendingOps$default(this, entry.getId(), false, false, 6, null);
            createFragmentTransaction.addToBackStack(entry.getId());
        }
        if (navigatorExtras instanceof Extras) {
            for (Map.Entry<View, String> entry2 : ((Extras) navigatorExtras).getSharedElements().entrySet()) {
                createFragmentTransaction.addSharedElement(entry2.getKey(), entry2.getValue());
            }
        }
        createFragmentTransaction.commit();
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "Calling pushWithTransition via navigate() on entry " + entry);
        }
        getState().pushWithTransition(entry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$3(NavigatorState navigatorState, FragmentNavigator fragmentNavigator, FragmentManager fragmentManager, Fragment fragment) {
        Object obj;
        navigatorState.getClass();
        fragmentNavigator.getClass();
        fragmentManager.getClass();
        fragment.getClass();
        List list = (List) navigatorState.getBackStack().getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (Intrinsics.areEqual(((NavBackStackEntry) obj).getId(), fragment.getTag())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        if (fragmentNavigator.isLoggingEnabled(2)) {
            Log.v(TAG, "Attaching fragment " + fragment + " associated with entry " + navBackStackEntry + " to FragmentManager " + fragmentNavigator.fragmentManager);
        }
        if (navBackStackEntry != null) {
            fragmentNavigator.attachObservers(navBackStackEntry, fragment);
            fragmentNavigator.attachClearViewModel$navigation_fragment_release(fragment, navBackStackEntry, navigatorState);
        }
    }

    public final void attachClearViewModel$navigation_fragment_release(final Fragment fragment, final NavBackStackEntry entry, final NavigatorState state) {
        fragment.getClass();
        entry.getClass();
        state.getClass();
        ViewModelStore viewModelStore = fragment.getViewModelStore();
        viewModelStore.getClass();
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(ClearEntryStateViewModel.class), new Function1<CreationExtras, ClearEntryStateViewModel>() { // from class: androidx.navigation.fragment.FragmentNavigator$attachClearViewModel$viewModel$1$1
            @Override // kotlin.jvm.functions.Function1
            public final FragmentNavigator.ClearEntryStateViewModel invoke(CreationExtras creationExtras) {
                creationExtras.getClass();
                return new FragmentNavigator.ClearEntryStateViewModel();
            }
        });
        ((ClearEntryStateViewModel) new ViewModelProvider(viewModelStore, initializerViewModelFactoryBuilder.build(), CreationExtras.Empty.INSTANCE).get(ClearEntryStateViewModel.class)).setCompleteTransition(new WeakReference<>(new Function0<Unit>() { // from class: androidx.navigation.fragment.FragmentNavigator$attachClearViewModel$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                boolean isLoggingEnabled;
                NavigatorState navigatorState = state;
                FragmentNavigator fragmentNavigator = this;
                Fragment fragment2 = fragment;
                for (NavBackStackEntry navBackStackEntry : (Iterable) navigatorState.getTransitionsInProgress().getValue()) {
                    isLoggingEnabled = fragmentNavigator.isLoggingEnabled(2);
                    if (isLoggingEnabled) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + fragment2 + " viewmodel being cleared");
                    }
                    navigatorState.markTransitionComplete(navBackStackEntry);
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this);
    }

    public final t getBackStack$navigation_fragment_release() {
        return getState().getBackStack();
    }

    public final List<Pair<String, Boolean>> getPendingOps$navigation_fragment_release() {
        return this.pendingOps;
    }

    @Deprecated(message = "Set a custom {@link androidx.fragment.app.FragmentFactory} via\n      {@link FragmentManager#setFragmentFactory(FragmentFactory)} to control\n      instantiation of Fragments.")
    public Fragment instantiateFragment(Context context, FragmentManager fragmentManager, String className, Bundle args) {
        context.getClass();
        fragmentManager.getClass();
        className.getClass();
        Fragment instantiate = fragmentManager.getFragmentFactory().instantiate(context.getClassLoader(), className);
        instantiate.getClass();
        return instantiate;
    }

    @Override // androidx.navigation.Navigator
    public void onAttach(final NavigatorState state) {
        state.getClass();
        super.onAttach(state);
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "onAttach");
        }
        this.fragmentManager.addFragmentOnAttachListener(new FragmentOnAttachListener() { // from class: androidx.navigation.fragment.c
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
                FragmentNavigator.onAttach$lambda$3(NavigatorState.this, this, fragmentManager, fragment);
            }
        });
        this.fragmentManager.addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() { // from class: androidx.navigation.fragment.FragmentNavigator$onAttach$2
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public void onBackStackChangeCommitted(Fragment fragment, boolean pop) {
                Object obj;
                Object obj2;
                boolean z9;
                boolean isLoggingEnabled;
                boolean isLoggingEnabled2;
                fragment.getClass();
                List plus = CollectionsKt.plus((Collection) NavigatorState.this.getBackStack().getValue(), (Iterable) NavigatorState.this.getTransitionsInProgress().getValue());
                ListIterator listIterator = plus.listIterator(plus.size());
                while (true) {
                    obj = null;
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (Intrinsics.areEqual(((NavBackStackEntry) obj2).getId(), fragment.getTag())) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj2;
                boolean z10 = true;
                if (pop && this.getPendingOps$navigation_fragment_release().isEmpty() && fragment.isRemoving()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                Iterator<T> it = this.getPendingOps$navigation_fragment_release().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.areEqual(((Pair) next).getFirst(), fragment.getTag())) {
                        obj = next;
                        break;
                    }
                }
                Pair pair = (Pair) obj;
                if (pair != null) {
                    this.getPendingOps$navigation_fragment_release().remove(pair);
                }
                if (!z9) {
                    isLoggingEnabled2 = this.isLoggingEnabled(2);
                    if (isLoggingEnabled2) {
                        Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + navBackStackEntry);
                    }
                }
                if (pair == null || !((Boolean) pair.getSecond()).booleanValue()) {
                    z10 = false;
                }
                if (!pop && !z10 && navBackStackEntry == null) {
                    i.d(ai.onnxruntime.a.k("The fragment ", fragment, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."));
                    return;
                }
                if (navBackStackEntry != null) {
                    this.attachClearViewModel$navigation_fragment_release(fragment, navBackStackEntry, NavigatorState.this);
                    if (z9) {
                        isLoggingEnabled = this.isLoggingEnabled(2);
                        if (isLoggingEnabled) {
                            Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " popping associated entry " + navBackStackEntry + " via system back");
                        }
                        NavigatorState.this.popWithTransition(navBackStackEntry, false);
                    }
                }
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public void onBackStackChangeStarted(Fragment fragment, boolean pop) {
                Object obj;
                boolean isLoggingEnabled;
                fragment.getClass();
                if (pop) {
                    List list = (List) NavigatorState.this.getBackStack().getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj = listIterator.previous();
                            if (Intrinsics.areEqual(((NavBackStackEntry) obj).getId(), fragment.getTag())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                    isLoggingEnabled = this.isLoggingEnabled(2);
                    if (isLoggingEnabled) {
                        Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + navBackStackEntry);
                    }
                    if (navBackStackEntry != null) {
                        NavigatorState.this.prepareForTransition(navBackStackEntry);
                    }
                }
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public void onBackStackChanged() {
            }
        });
    }

    @Override // androidx.navigation.Navigator
    public void onLaunchSingleTop(NavBackStackEntry backStackEntry) {
        backStackEntry.getClass();
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        FragmentTransaction createFragmentTransaction = createFragmentTransaction(backStackEntry, null);
        List list = (List) getState().getBackStack().getValue();
        if (list.size() > 1) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.getOrNull(list, CollectionsKt.getLastIndex(list) - 1);
            if (navBackStackEntry != null) {
                addPendingOps$default(this, navBackStackEntry.getId(), false, false, 6, null);
            }
            addPendingOps$default(this, backStackEntry.getId(), true, false, 4, null);
            this.fragmentManager.popBackStack(backStackEntry.getId(), 1);
            addPendingOps$default(this, backStackEntry.getId(), false, false, 2, null);
            createFragmentTransaction.addToBackStack(backStackEntry.getId());
        }
        createFragmentTransaction.commit();
        getState().onLaunchSingleTop(backStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public void onRestoreState(Bundle savedState) {
        savedState.getClass();
        ArrayList<String> stringArrayList = savedState.getStringArrayList(KEY_SAVED_IDS);
        if (stringArrayList != null) {
            this.savedIds.clear();
            CollectionsKt__MutableCollectionsKt.addAll(this.savedIds, stringArrayList);
        }
    }

    @Override // androidx.navigation.Navigator
    public Bundle onSaveState() {
        if (this.savedIds.isEmpty()) {
            return null;
        }
        return BundleKt.bundleOf(TuplesKt.to(KEY_SAVED_IDS, new ArrayList(this.savedIds)));
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(NavBackStackEntry popUpTo, boolean savedState) {
        popUpTo.getClass();
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) getState().getBackStack().getValue();
        int indexOf = list.indexOf(popUpTo);
        List subList = list.subList(indexOf, list.size());
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.first(list);
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt.getOrNull(list, indexOf - 1);
        if (navBackStackEntry2 != null) {
            addPendingOps$default(this, navBackStackEntry2.getId(), false, false, 6, null);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : subList) {
            NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj;
            if (SequencesKt.contains(SequencesKt.map(CollectionsKt.asSequence(this.pendingOps), new Function1<Pair<? extends String, ? extends Boolean>, String>() { // from class: androidx.navigation.fragment.FragmentNavigator$popBackStack$1$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String invoke2(Pair<String, Boolean> pair) {
                    pair.getClass();
                    return pair.getFirst();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ String invoke(Pair<? extends String, ? extends Boolean> pair) {
                    return invoke2((Pair<String, Boolean>) pair);
                }
            }), navBackStackEntry3.getId()) || !Intrinsics.areEqual(navBackStackEntry3.getId(), navBackStackEntry.getId())) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            addPendingOps$default(this, ((NavBackStackEntry) arrayList.get(i10)).getId(), true, false, 4, null);
        }
        if (savedState) {
            for (NavBackStackEntry navBackStackEntry4 : CollectionsKt.reversed(subList)) {
                if (Intrinsics.areEqual(navBackStackEntry4, navBackStackEntry)) {
                    Log.i(TAG, "FragmentManager cannot save the state of the initial destination " + navBackStackEntry4);
                } else {
                    this.fragmentManager.saveBackStack(navBackStackEntry4.getId());
                    this.savedIds.add(navBackStackEntry4.getId());
                }
            }
        } else {
            this.fragmentManager.popBackStack(popUpTo.getId(), 1);
        }
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "Calling popWithTransition via popBackStack() on entry " + popUpTo + " with savedState " + savedState);
        }
        getState().popWithTransition(popUpTo, savedState);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Companion;", "", "()V", "KEY_SAVED_IDS", "", "TAG", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\b\u0010\u001a\u001a\u00020\tH\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Destination;", "Landroidx/navigation/NavDestination;", "navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "(Landroidx/navigation/NavigatorProvider;)V", "fragmentNavigator", "Landroidx/navigation/Navigator;", "(Landroidx/navigation/Navigator;)V", "_className", "", "className", "getClassName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "onInflate", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "setClassName", "toString", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @NavDestination.ClassType(Fragment.class)
    @SourceDebugExtension({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$Destination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,712:1\n232#2,3:713\n1#3:716\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$Destination\n*L\n570#1:713,3\n*E\n"})
    /* loaded from: classes.dex */
    public static class Destination extends NavDestination {
        private String _className;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Destination(NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(FragmentNavigator.class));
            navigatorProvider.getClass();
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other != null && (other instanceof Destination) && super.equals(other) && Intrinsics.areEqual(this._className, ((Destination) other)._className)) {
                return true;
            }
            return false;
        }

        public final String getClassName() {
            String str = this._className;
            if (str != null) {
                str.getClass();
                return str;
            }
            j1.i.l("Fragment class was not set");
            return null;
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int i10;
            int hashCode = super.hashCode() * 31;
            String str = this._className;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            return hashCode + i10;
        }

        @Override // androidx.navigation.NavDestination
        @CallSuper
        public void onInflate(Context context, AttributeSet attrs) {
            context.getClass();
            attrs.getClass();
            super.onInflate(context, attrs);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, R.styleable.FragmentNavigator);
            obtainAttributes.getClass();
            String string = obtainAttributes.getString(R.styleable.FragmentNavigator_android_name);
            if (string != null) {
                setClassName(string);
            }
            Unit unit = Unit.INSTANCE;
            obtainAttributes.recycle();
        }

        public final Destination setClassName(String className) {
            className.getClass();
            this._className = className;
            return this;
        }

        @Override // androidx.navigation.NavDestination
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this._className;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            return sb.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(Navigator<? extends Destination> navigator) {
            super(navigator);
            navigator.getClass();
        }
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> entries, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        entries.getClass();
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator<NavBackStackEntry> it = entries.iterator();
        while (it.hasNext()) {
            navigate(it.next(), navOptions, navigatorExtras);
        }
    }
}
