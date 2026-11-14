package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.NavigatorState;
import j1.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import y8.t;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Navigator.Name("dialog")
@Metadata(d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001/\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00029:B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u0013\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\u0013\u0010\"J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010\u0014J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00103\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0015028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001c058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006;"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "Landroid/content/Context;", "context", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)V", "", "popUpToIndex", "Landroidx/navigation/NavBackStackEntry;", "popUpTo", "", "savedState", "", "popWithTransition", "(ILandroidx/navigation/NavBackStackEntry;Z)V", "entry", "navigate", "(Landroidx/navigation/NavBackStackEntry;)V", "Landroidx/fragment/app/DialogFragment;", "createDialogFragment", "(Landroidx/navigation/NavBackStackEntry;)Landroidx/fragment/app/DialogFragment;", "popBackStack", "(Landroidx/navigation/NavBackStackEntry;Z)V", "createDestination", "()Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "backStackEntry", "onLaunchSingleTop", "Landroidx/navigation/NavigatorState;", "state", "onAttach", "(Landroidx/navigation/NavigatorState;)V", "Landroid/content/Context;", "Landroidx/fragment/app/FragmentManager;", "", "", "restoredTagsAwaitingAttach", "Ljava/util/Set;", "androidx/navigation/fragment/DialogFragmentNavigator$observer$1", "observer", "Landroidx/navigation/fragment/DialogFragmentNavigator$observer$1;", "", "transitioningFragments", "Ljava/util/Map;", "Ly8/t;", "getBackStack$navigation_fragment_release", "()Ly8/t;", "backStack", "Companion", "Destination", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class DialogFragmentNavigator extends Navigator<Destination> {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "DialogFragmentNavigator";
    private final Context context;
    private final FragmentManager fragmentManager;
    private final DialogFragmentNavigator$observer$1 observer;
    private final Set<String> restoredTagsAwaitingAttach;
    private final Map<String, DialogFragment> transitioningFragments;

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.navigation.fragment.DialogFragmentNavigator$observer$1] */
    public DialogFragmentNavigator(Context context, FragmentManager fragmentManager) {
        context.getClass();
        fragmentManager.getClass();
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.restoredTagsAwaitingAttach = new LinkedHashSet();
        this.observer = new LifecycleEventObserver() { // from class: androidx.navigation.fragment.DialogFragmentNavigator$observer$1

            /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            /* loaded from: classes.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    try {
                        iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                NavigatorState state;
                NavigatorState state2;
                NavigatorState state3;
                NavigatorState state4;
                int i10;
                NavigatorState state5;
                NavigatorState state6;
                source.getClass();
                event.getClass();
                int i11 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                if (i11 != 1) {
                    Object obj = null;
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                DialogFragment dialogFragment = (DialogFragment) source;
                                state5 = DialogFragmentNavigator.this.getState();
                                for (Object obj2 : (Iterable) state5.getTransitionsInProgress().getValue()) {
                                    if (Intrinsics.areEqual(((NavBackStackEntry) obj2).getId(), dialogFragment.getTag())) {
                                        obj = obj2;
                                    }
                                }
                                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                                if (navBackStackEntry != null) {
                                    state6 = DialogFragmentNavigator.this.getState();
                                    state6.markTransitionComplete(navBackStackEntry);
                                }
                                dialogFragment.getLifecycle().removeObserver(this);
                                return;
                            }
                            return;
                        }
                        DialogFragment dialogFragment2 = (DialogFragment) source;
                        if (!dialogFragment2.requireDialog().isShowing()) {
                            state4 = DialogFragmentNavigator.this.getState();
                            List list = (List) state4.getBackStack().getValue();
                            ListIterator listIterator = list.listIterator(list.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    if (Intrinsics.areEqual(((NavBackStackEntry) listIterator.previous()).getId(), dialogFragment2.getTag())) {
                                        i10 = listIterator.nextIndex();
                                        break;
                                    }
                                } else {
                                    i10 = -1;
                                    break;
                                }
                            }
                            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt.getOrNull(list, i10);
                            if (!Intrinsics.areEqual(CollectionsKt.lastOrNull(list), navBackStackEntry2)) {
                                Log.i("DialogFragmentNavigator", "Dialog " + dialogFragment2 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                            }
                            if (navBackStackEntry2 != null) {
                                DialogFragmentNavigator.this.popWithTransition(i10, navBackStackEntry2, false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    DialogFragment dialogFragment3 = (DialogFragment) source;
                    state2 = DialogFragmentNavigator.this.getState();
                    for (Object obj3 : (Iterable) state2.getTransitionsInProgress().getValue()) {
                        if (Intrinsics.areEqual(((NavBackStackEntry) obj3).getId(), dialogFragment3.getTag())) {
                            obj = obj3;
                        }
                    }
                    NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj;
                    if (navBackStackEntry3 != null) {
                        state3 = DialogFragmentNavigator.this.getState();
                        state3.markTransitionComplete(navBackStackEntry3);
                        return;
                    }
                    return;
                }
                DialogFragment dialogFragment4 = (DialogFragment) source;
                state = DialogFragmentNavigator.this.getState();
                Iterable iterable = (Iterable) state.getBackStack().getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(((NavBackStackEntry) it.next()).getId(), dialogFragment4.getTag())) {
                            return;
                        }
                    }
                }
                dialogFragment4.dismiss();
            }
        };
        this.transitioningFragments = new LinkedHashMap();
    }

    private final DialogFragment createDialogFragment(NavBackStackEntry entry) {
        NavDestination destination = entry.getDestination();
        destination.getClass();
        Destination destination2 = (Destination) destination;
        String className = destination2.getClassName();
        if (className.charAt(0) == '.') {
            className = this.context.getPackageName() + className;
        }
        Fragment instantiate = this.fragmentManager.getFragmentFactory().instantiate(this.context.getClassLoader(), className);
        instantiate.getClass();
        if (DialogFragment.class.isAssignableFrom(instantiate.getClass())) {
            DialogFragment dialogFragment = (DialogFragment) instantiate;
            dialogFragment.setArguments(entry.getArguments());
            dialogFragment.getLifecycle().addObserver(this.observer);
            this.transitioningFragments.put(entry.getId(), dialogFragment);
            return dialogFragment;
        }
        ai.onnxruntime.b.v(destination2.getClassName(), "Dialog destination ", " is not an instance of DialogFragment");
        return null;
    }

    private final void navigate(NavBackStackEntry entry) {
        createDialogFragment(entry).show(this.fragmentManager, entry.getId());
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.lastOrNull((List) getState().getBackStack().getValue());
        boolean contains = CollectionsKt.contains((Iterable) getState().getTransitionsInProgress().getValue(), navBackStackEntry);
        getState().pushWithTransition(entry);
        if (navBackStackEntry != null && !contains) {
            getState().markTransitionComplete(navBackStackEntry);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$1(DialogFragmentNavigator dialogFragmentNavigator, FragmentManager fragmentManager, Fragment fragment) {
        dialogFragmentNavigator.getClass();
        fragmentManager.getClass();
        fragment.getClass();
        Set<String> set = dialogFragmentNavigator.restoredTagsAwaitingAttach;
        if (TypeIntrinsics.asMutableCollection(set).remove(fragment.getTag())) {
            fragment.getLifecycle().addObserver(dialogFragmentNavigator.observer);
        }
        Map<String, DialogFragment> map = dialogFragmentNavigator.transitioningFragments;
        TypeIntrinsics.asMutableMap(map).remove(fragment.getTag());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void popWithTransition(int popUpToIndex, NavBackStackEntry popUpTo, boolean savedState) {
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.getOrNull((List) getState().getBackStack().getValue(), popUpToIndex - 1);
        boolean contains = CollectionsKt.contains((Iterable) getState().getTransitionsInProgress().getValue(), navBackStackEntry);
        getState().popWithTransition(popUpTo, savedState);
        if (navBackStackEntry != null && !contains) {
            getState().markTransitionComplete(navBackStackEntry);
        }
    }

    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this);
    }

    public final t getBackStack$navigation_fragment_release() {
        return getState().getBackStack();
    }

    @Override // androidx.navigation.Navigator
    public void onAttach(NavigatorState state) {
        Lifecycle lifecycle;
        state.getClass();
        super.onAttach(state);
        for (NavBackStackEntry navBackStackEntry : (List) state.getBackStack().getValue()) {
            DialogFragment dialogFragment = (DialogFragment) this.fragmentManager.findFragmentByTag(navBackStackEntry.getId());
            if (dialogFragment != null && (lifecycle = dialogFragment.getLifecycle()) != null) {
                lifecycle.addObserver(this.observer);
            } else {
                this.restoredTagsAwaitingAttach.add(navBackStackEntry.getId());
            }
        }
        this.fragmentManager.addFragmentOnAttachListener(new FragmentOnAttachListener() { // from class: androidx.navigation.fragment.a
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
                DialogFragmentNavigator.onAttach$lambda$1(DialogFragmentNavigator.this, fragmentManager, fragment);
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
        DialogFragment dialogFragment = this.transitioningFragments.get(backStackEntry.getId());
        if (dialogFragment == null) {
            Fragment findFragmentByTag = this.fragmentManager.findFragmentByTag(backStackEntry.getId());
            if (findFragmentByTag instanceof DialogFragment) {
                dialogFragment = (DialogFragment) findFragmentByTag;
            } else {
                dialogFragment = null;
            }
        }
        if (dialogFragment != null) {
            dialogFragment.getLifecycle().removeObserver(this.observer);
            dialogFragment.dismiss();
        }
        createDialogFragment(backStackEntry).show(this.fragmentManager, backStackEntry.getId());
        getState().onLaunchSingleTopWithTransition(backStackEntry);
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
        Iterator it = CollectionsKt.reversed(list.subList(indexOf, list.size())).iterator();
        while (it.hasNext()) {
            Fragment findFragmentByTag = this.fragmentManager.findFragmentByTag(((NavBackStackEntry) it.next()).getId());
            if (findFragmentByTag != null) {
                ((DialogFragment) findFragmentByTag).dismiss();
            }
        }
        popWithTransition(indexOf, popUpTo, savedState);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigator$Companion;", "", "()V", "TAG", "", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0015\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/FloatingWindow;", "navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "(Landroidx/navigation/NavigatorProvider;)V", "fragmentNavigator", "Landroidx/navigation/Navigator;", "(Landroidx/navigation/Navigator;)V", "_className", "", "className", "getClassName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "onInflate", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "setClassName", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @NavDestination.ClassType(DialogFragment.class)
    @SourceDebugExtension({"SMAP\nDialogFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogFragmentNavigator.kt\nandroidx/navigation/fragment/DialogFragmentNavigator$Destination\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,319:1\n1#2:320\n232#3,3:321\n*S KotlinDebug\n*F\n+ 1 DialogFragmentNavigator.kt\nandroidx/navigation/fragment/DialogFragmentNavigator$Destination\n*L\n283#1:321,3\n*E\n"})
    /* loaded from: classes.dex */
    public static class Destination extends NavDestination implements FloatingWindow {
        private String _className;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Destination(NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(DialogFragmentNavigator.class));
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
            i.l("DialogFragment class was not set");
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
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, R.styleable.DialogFragmentNavigator);
            obtainAttributes.getClass();
            String string = obtainAttributes.getString(R.styleable.DialogFragmentNavigator_android_name);
            if (string != null) {
                setClassName(string);
            }
            obtainAttributes.recycle();
        }

        public final Destination setClassName(String className) {
            className.getClass();
            this._className = className;
            return this;
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
            navigate(it.next());
        }
    }
}
