package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.navigation.NavBackStackEntry;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import j1.i;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 V2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003VWXB\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bBQ\b\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0015J\u0013\u0010I\u001a\u00020B2\b\u0010J\u001a\u0004\u0018\u00010KH\u0096\u0002J\u0010\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020OH\u0007J\b\u0010P\u001a\u00020QH\u0016J\u0010\u0010R\u001a\u00020M2\u0006\u0010S\u001a\u00020\u0007H\u0007J\b\u0010T\u001a\u00020\u0013H\u0016J\b\u0010U\u001a\u00020MH\u0007R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001c\u0010\u000b\u001a\u00020\f@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R&\u00103\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u00108\u001a\u0002098GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u001f\u001a\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u000e\u0010A\u001a\u00020BX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010E\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Landroidx/navigation/NavBackStackEntry;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "Landroidx/savedstate/SavedStateRegistryOwner;", "entry", "arguments", "Landroid/os/Bundle;", "(Landroidx/navigation/NavBackStackEntry;Landroid/os/Bundle;)V", "context", "Landroid/content/Context;", "destination", "Landroidx/navigation/NavDestination;", "immutableArgs", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "viewModelStoreProvider", "Landroidx/navigation/NavViewModelStoreProvider;", "id", "", "savedState", "(Landroid/content/Context;Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/lifecycle/Lifecycle$State;Landroidx/navigation/NavViewModelStoreProvider;Ljava/lang/String;Landroid/os/Bundle;)V", "_lifecycle", "Landroidx/lifecycle/LifecycleRegistry;", "getArguments", "()Landroid/os/Bundle;", "defaultFactory", "Landroidx/lifecycle/SavedStateViewModelFactory;", "getDefaultFactory", "()Landroidx/lifecycle/SavedStateViewModelFactory;", "defaultFactory$delegate", "Lkotlin/Lazy;", "defaultViewModelCreationExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultViewModelProviderFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "getDestination", "()Landroidx/navigation/NavDestination;", "setDestination", "(Landroidx/navigation/NavDestination;)V", "getId", "()Ljava/lang/String;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "maxState", "maxLifecycle", "getMaxLifecycle", "()Landroidx/lifecycle/Lifecycle$State;", "setMaxLifecycle", "(Landroidx/lifecycle/Lifecycle$State;)V", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle$delegate", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistryAttached", "", "savedStateRegistryController", "Landroidx/savedstate/SavedStateRegistryController;", "viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "equals", "other", "", "handleLifecycleEvent", "", NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "hashCode", "", "saveState", "outBundle", "toString", "updateState", "Companion", "NavResultSavedStateFactory", "SavedStateViewModel", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavBackStackEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,309:1\n1#2:310\n1726#3,3:311\n1855#3,2:314\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntry\n*L\n256#1:311,3\n265#1:314,2\n*E\n"})
/* loaded from: classes.dex */
public final class NavBackStackEntry implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private LifecycleRegistry _lifecycle;
    private final Context context;

    /* renamed from: defaultFactory$delegate, reason: from kotlin metadata */
    private final Lazy defaultFactory;
    private final ViewModelProvider.Factory defaultViewModelProviderFactory;
    private NavDestination destination;
    private Lifecycle.State hostLifecycleState;
    private final String id;
    private final Bundle immutableArgs;
    private Lifecycle.State maxLifecycle;
    private final Bundle savedState;

    /* renamed from: savedStateHandle$delegate, reason: from kotlin metadata */
    private final Lazy savedStateHandle;
    private boolean savedStateRegistryAttached;
    private final SavedStateRegistryController savedStateRegistryController;
    private final NavViewModelStoreProvider viewModelStoreProvider;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J5\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/navigation/NavBackStackEntry$NavResultSavedStateFactory;", "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "key", "", "modelClass", "Ljava/lang/Class;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class NavResultSavedStateFactory extends AbstractSavedStateViewModelFactory {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavResultSavedStateFactory(SavedStateRegistryOwner savedStateRegistryOwner) {
            super(savedStateRegistryOwner, null);
            savedStateRegistryOwner.getClass();
        }

        @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
        public <T extends ViewModel> T create(String key, Class<T> modelClass, SavedStateHandle handle) {
            key.getClass();
            modelClass.getClass();
            handle.getClass();
            return new SavedStateViewModel(handle);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/navigation/NavBackStackEntry$SavedStateViewModel;", "Landroidx/lifecycle/ViewModel;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "getHandle", "()Landroidx/lifecycle/SavedStateHandle;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class SavedStateViewModel extends ViewModel {
        private final SavedStateHandle handle;

        public SavedStateViewModel(SavedStateHandle savedStateHandle) {
            savedStateHandle.getClass();
            this.handle = savedStateHandle;
        }

        public final SavedStateHandle getHandle() {
            return this.handle;
        }
    }

    private NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2) {
        this.context = context;
        this.destination = navDestination;
        this.immutableArgs = bundle;
        this.hostLifecycleState = state;
        this.viewModelStoreProvider = navViewModelStoreProvider;
        this.id = str;
        this.savedState = bundle2;
        this._lifecycle = new LifecycleRegistry(this);
        this.savedStateRegistryController = SavedStateRegistryController.INSTANCE.create(this);
        this.defaultFactory = LazyKt.lazy(new Function0<SavedStateViewModelFactory>() { // from class: androidx.navigation.NavBackStackEntry$defaultFactory$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SavedStateViewModelFactory invoke() {
                Context context2;
                Context context3;
                context2 = NavBackStackEntry.this.context;
                Application application = null;
                if (context2 != null) {
                    context3 = context2.getApplicationContext();
                } else {
                    context3 = null;
                }
                if (context3 instanceof Application) {
                    application = (Application) context3;
                }
                NavBackStackEntry navBackStackEntry = NavBackStackEntry.this;
                return new SavedStateViewModelFactory(application, navBackStackEntry, navBackStackEntry.getArguments());
            }
        });
        this.savedStateHandle = LazyKt.lazy(new Function0<SavedStateHandle>() { // from class: androidx.navigation.NavBackStackEntry$savedStateHandle$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SavedStateHandle invoke() {
                boolean z9;
                z9 = NavBackStackEntry.this.savedStateRegistryAttached;
                if (z9) {
                    if (NavBackStackEntry.this.getLifecycle().getState() != Lifecycle.State.DESTROYED) {
                        return ((NavBackStackEntry.SavedStateViewModel) new ViewModelProvider(NavBackStackEntry.this, new NavBackStackEntry.NavResultSavedStateFactory(NavBackStackEntry.this)).get(NavBackStackEntry.SavedStateViewModel.class)).getHandle();
                    }
                    i.l("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                    return null;
                }
                i.l("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                return null;
            }
        });
        this.maxLifecycle = Lifecycle.State.INITIALIZED;
        this.defaultViewModelProviderFactory = getDefaultFactory();
    }

    private final SavedStateViewModelFactory getDefaultFactory() {
        return (SavedStateViewModelFactory) this.defaultFactory.getValue();
    }

    public boolean equals(Object other) {
        Set<String> keySet;
        Object obj;
        if (other != null && (other instanceof NavBackStackEntry)) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) other;
            if (Intrinsics.areEqual(this.id, navBackStackEntry.id) && Intrinsics.areEqual(this.destination, navBackStackEntry.destination) && Intrinsics.areEqual(getLifecycle(), navBackStackEntry.getLifecycle()) && Intrinsics.areEqual(getSavedStateRegistry(), navBackStackEntry.getSavedStateRegistry())) {
                if (!Intrinsics.areEqual(this.immutableArgs, navBackStackEntry.immutableArgs)) {
                    Bundle bundle = this.immutableArgs;
                    if (bundle != null && (keySet = bundle.keySet()) != null) {
                        if (!keySet.isEmpty()) {
                            for (String str : keySet) {
                                Object obj2 = this.immutableArgs.get(str);
                                Bundle bundle2 = navBackStackEntry.immutableArgs;
                                if (bundle2 != null) {
                                    obj = bundle2.get(str);
                                } else {
                                    obj = null;
                                }
                                if (!Intrinsics.areEqual(obj2, obj)) {
                                }
                            }
                            return true;
                        }
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final Bundle getArguments() {
        if (this.immutableArgs == null) {
            return null;
        }
        return new Bundle(this.immutableArgs);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public CreationExtras getDefaultViewModelCreationExtras() {
        Object obj;
        Application application = null;
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(null, 1, null);
        Context context = this.context;
        if (context != null) {
            obj = context.getApplicationContext();
        } else {
            obj = null;
        }
        if (obj instanceof Application) {
            application = (Application) obj;
        }
        if (application != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, arguments);
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.defaultViewModelProviderFactory;
    }

    public final NavDestination getDestination() {
        return this.destination;
    }

    public final String getId() {
        return this.id;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this._lifecycle;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Lifecycle.State getMaxLifecycle() {
        return this.maxLifecycle;
    }

    @MainThread
    public final SavedStateHandle getSavedStateHandle() {
        return (SavedStateHandle) this.savedStateHandle.getValue();
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        if (this.savedStateRegistryAttached) {
            if (getLifecycle().getState() != Lifecycle.State.DESTROYED) {
                NavViewModelStoreProvider navViewModelStoreProvider = this.viewModelStoreProvider;
                if (navViewModelStoreProvider != null) {
                    return navViewModelStoreProvider.getViewModelStore(this.id);
                }
                i.l("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
                return null;
            }
            i.l("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        i.l("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void handleLifecycleEvent(Lifecycle.Event r1) {
        r1.getClass();
        this.hostLifecycleState = r1.getTargetState();
        updateState();
    }

    public int hashCode() {
        Set<String> keySet;
        int i10;
        int hashCode = this.destination.hashCode() + (this.id.hashCode() * 31);
        Bundle bundle = this.immutableArgs;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i11 = hashCode * 31;
                Object obj = this.immutableArgs.get((String) it.next());
                if (obj != null) {
                    i10 = obj.hashCode();
                } else {
                    i10 = 0;
                }
                hashCode = i11 + i10;
            }
        }
        return getSavedStateRegistry().hashCode() + ((getLifecycle().hashCode() + (hashCode * 31)) * 31);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void saveState(Bundle outBundle) {
        outBundle.getClass();
        this.savedStateRegistryController.performSave(outBundle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setDestination(NavDestination navDestination) {
        navDestination.getClass();
        this.destination = navDestination;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setMaxLifecycle(Lifecycle.State state) {
        state.getClass();
        this.maxLifecycle = state;
        updateState();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavBackStackEntry");
        sb.append("(" + this.id + ')');
        sb.append(" destination=");
        sb.append(this.destination);
        return sb.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void updateState() {
        if (!this.savedStateRegistryAttached) {
            this.savedStateRegistryController.performAttach();
            this.savedStateRegistryAttached = true;
            if (this.viewModelStoreProvider != null) {
                SavedStateHandleSupport.enableSavedStateHandles(this);
            }
            this.savedStateRegistryController.performRestore(this.savedState);
        }
        int ordinal = this.hostLifecycleState.ordinal();
        int ordinal2 = this.maxLifecycle.ordinal();
        LifecycleRegistry lifecycleRegistry = this._lifecycle;
        if (ordinal < ordinal2) {
            lifecycleRegistry.setCurrentState(this.hostLifecycleState);
        } else {
            lifecycleRegistry.setCurrentState(this.maxLifecycle);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JR\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u0012"}, d2 = {"Landroidx/navigation/NavBackStackEntry$Companion;", "", "()V", "create", "Landroidx/navigation/NavBackStackEntry;", "context", "Landroid/content/Context;", "destination", "Landroidx/navigation/NavDestination;", "arguments", "Landroid/os/Bundle;", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "viewModelStoreProvider", "Landroidx/navigation/NavViewModelStoreProvider;", "id", "", "savedState", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ NavBackStackEntry create$default(Companion companion, Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                bundle = null;
            }
            if ((i10 & 8) != 0) {
                state = Lifecycle.State.CREATED;
            }
            if ((i10 & 16) != 0) {
                navViewModelStoreProvider = null;
            }
            if ((i10 & 32) != 0) {
                str = UUID.randomUUID().toString();
                str.getClass();
            }
            if ((i10 & 64) != 0) {
                bundle2 = null;
            }
            return companion.create(context, navDestination, bundle, state, navViewModelStoreProvider, str, bundle2);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final NavBackStackEntry create(Context context, NavDestination destination, Bundle arguments, Lifecycle.State hostLifecycleState, NavViewModelStoreProvider viewModelStoreProvider, String id, Bundle savedState) {
            destination.getClass();
            hostLifecycleState.getClass();
            id.getClass();
            return new NavBackStackEntry(context, destination, arguments, hostLifecycleState, viewModelStoreProvider, id, savedState, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, navDestination, bundle, state, navViewModelStoreProvider, str, bundle2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ NavBackStackEntry(android.content.Context r2, androidx.navigation.NavDestination r3, android.os.Bundle r4, androidx.lifecycle.Lifecycle.State r5, androidx.navigation.NavViewModelStoreProvider r6, java.lang.String r7, android.os.Bundle r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 4
            r0 = 0
            if (r10 == 0) goto L6
            r4 = r0
        L6:
            r10 = r9 & 8
            if (r10 == 0) goto Lc
            androidx.lifecycle.Lifecycle$State r5 = androidx.lifecycle.Lifecycle.State.CREATED
        Lc:
            r10 = r9 & 16
            if (r10 == 0) goto L11
            r6 = r0
        L11:
            r10 = r9 & 32
            if (r10 == 0) goto L20
            java.util.UUID r7 = java.util.UUID.randomUUID()
            java.lang.String r7 = r7.toString()
            r7.getClass()
        L20:
            r9 = r9 & 64
            if (r9 == 0) goto L2d
            r9 = r0
        L25:
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            goto L2f
        L2d:
            r9 = r8
            goto L25
        L2f:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavBackStackEntry.<init>(android.content.Context, androidx.navigation.NavDestination, android.os.Bundle, androidx.lifecycle.Lifecycle$State, androidx.navigation.NavViewModelStoreProvider, java.lang.String, android.os.Bundle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public /* synthetic */ NavBackStackEntry(NavBackStackEntry navBackStackEntry, Bundle bundle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(navBackStackEntry, (i10 & 2) != 0 ? navBackStackEntry.getArguments() : bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavBackStackEntry(NavBackStackEntry navBackStackEntry, Bundle bundle) {
        this(navBackStackEntry.context, navBackStackEntry.destination, bundle, navBackStackEntry.hostLifecycleState, navBackStackEntry.viewModelStoreProvider, navBackStackEntry.id, navBackStackEntry.savedState);
        navBackStackEntry.getClass();
        this.hostLifecycleState = navBackStackEntry.hostLifecycleState;
        setMaxLifecycle(navBackStackEntry.maxLifecycle);
    }
}
