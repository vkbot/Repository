package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.fragment.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class FragmentManager implements FragmentResultOwner {
    private static boolean DEBUG = false;
    private static final String EXTRA_CREATED_FILLIN_INTENT = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    private static final String FRAGMENT_KEY_PREFIX = "fragment_";
    private static final String FRAGMENT_MANAGER_STATE_KEY = "state";
    public static final int POP_BACK_STACK_INCLUSIVE = 1;
    private static final String RESULT_KEY_PREFIX = "result_";
    private static final String SAVED_STATE_KEY = "android:support:fragments";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String TAG = "FragmentManager";
    ArrayList<BackStackRecord> mBackStack;
    private ArrayList<OnBackStackChangedListener> mBackStackChangeListeners;
    private FragmentContainer mContainer;
    private ArrayList<Fragment> mCreatedMenus;
    private boolean mDestroyed;
    private boolean mExecutingActions;
    private boolean mHavePendingDeferredStart;
    private FragmentHostCallback<?> mHost;
    private boolean mNeedMenuInvalidate;
    private FragmentManagerViewModel mNonConfig;
    private OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final Consumer<Configuration> mOnConfigurationChangedListener;
    private final Consumer<MultiWindowModeChangedInfo> mOnMultiWindowModeChangedListener;
    private final Consumer<PictureInPictureModeChangedInfo> mOnPictureInPictureModeChangedListener;
    private final Consumer<Integer> mOnTrimMemoryListener;
    private Fragment mParent;

    @Nullable
    Fragment mPrimaryNav;
    private ActivityResultLauncher<String[]> mRequestPermissions;
    private ActivityResultLauncher<Intent> mStartActivityForResult;
    private ActivityResultLauncher<IntentSenderRequest> mStartIntentSenderForResult;
    private boolean mStateSaved;
    private boolean mStopped;
    private FragmentStrictMode.Policy mStrictModePolicy;
    private ArrayList<Fragment> mTmpAddedFragments;
    private ArrayList<Boolean> mTmpIsPop;
    private ArrayList<BackStackRecord> mTmpRecords;
    private final ArrayList<OpGenerator> mPendingActions = new ArrayList<>();
    private final FragmentStore mFragmentStore = new FragmentStore();
    private final FragmentLayoutInflaterFactory mLayoutInflaterFactory = new FragmentLayoutInflaterFactory(this);
    private final OnBackPressedCallback mOnBackPressedCallback = new OnBackPressedCallback(false) { // from class: androidx.fragment.app.FragmentManager.1
        public AnonymousClass1(boolean z9) {
            super(z9);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            FragmentManager.this.handleOnBackPressed();
        }
    };
    private final AtomicInteger mBackStackIndex = new AtomicInteger();
    private final Map<String, BackStackState> mBackStackStates = Collections.synchronizedMap(new HashMap());
    private final Map<String, Bundle> mResults = Collections.synchronizedMap(new HashMap());
    private final Map<String, LifecycleAwareResultListener> mResultListeners = Collections.synchronizedMap(new HashMap());
    private final FragmentLifecycleCallbacksDispatcher mLifecycleCallbacksDispatcher = new FragmentLifecycleCallbacksDispatcher(this);
    private final CopyOnWriteArrayList<FragmentOnAttachListener> mOnAttachListeners = new CopyOnWriteArrayList<>();
    private final MenuProvider mMenuProvider = new MenuProvider() { // from class: androidx.fragment.app.FragmentManager.2
        public AnonymousClass2() {
        }

        @Override // androidx.core.view.MenuProvider
        public void onCreateMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
            FragmentManager.this.dispatchCreateOptionsMenu(menu, menuInflater);
        }

        @Override // androidx.core.view.MenuProvider
        public void onMenuClosed(@NonNull Menu menu) {
            FragmentManager.this.dispatchOptionsMenuClosed(menu);
        }

        @Override // androidx.core.view.MenuProvider
        public boolean onMenuItemSelected(@NonNull MenuItem menuItem) {
            return FragmentManager.this.dispatchOptionsItemSelected(menuItem);
        }

        @Override // androidx.core.view.MenuProvider
        public void onPrepareMenu(@NonNull Menu menu) {
            FragmentManager.this.dispatchPrepareOptionsMenu(menu);
        }
    };
    int mCurState = -1;
    private FragmentFactory mFragmentFactory = null;
    private FragmentFactory mHostFragmentFactory = new FragmentFactory() { // from class: androidx.fragment.app.FragmentManager.3
        public AnonymousClass3() {
        }

        @Override // androidx.fragment.app.FragmentFactory
        @NonNull
        public Fragment instantiate(@NonNull ClassLoader classLoader, @NonNull String str) {
            return FragmentManager.this.getHost().instantiate(FragmentManager.this.getHost().getContext(), str, null);
        }
    };
    private SpecialEffectsControllerFactory mSpecialEffectsControllerFactory = null;
    private SpecialEffectsControllerFactory mDefaultSpecialEffectsControllerFactory = new SpecialEffectsControllerFactory() { // from class: androidx.fragment.app.FragmentManager.4
        public AnonymousClass4() {
        }

        @Override // androidx.fragment.app.SpecialEffectsControllerFactory
        @NonNull
        public SpecialEffectsController createController(@NonNull ViewGroup viewGroup) {
            return new DefaultSpecialEffectsController(viewGroup);
        }
    };
    ArrayDeque<LaunchedFragmentInfo> mLaunchedFragments = new ArrayDeque<>();
    private Runnable mExecCommit = new Runnable() { // from class: androidx.fragment.app.FragmentManager.5
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.execPendingActions(true);
        }
    };

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: androidx.fragment.app.FragmentManager$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends OnBackPressedCallback {
        public AnonymousClass1(boolean z9) {
            super(z9);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            FragmentManager.this.handleOnBackPressed();
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: androidx.fragment.app.FragmentManager$10 */
    /* loaded from: classes.dex */
    public class AnonymousClass10 implements ActivityResultCallback<Map<String, Boolean>> {
        public AnonymousClass10() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        public void onActivityResult(Map<String, Boolean> map) {
            int i10;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((Boolean) arrayList.get(i11)).booleanValue()) {
                    i10 = 0;
                } else {
                    i10 = -1;
                }
                iArr[i11] = i10;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.mLaunchedFragments.pollFirst();
            if (pollFirst == null) {
                Log.w(FragmentManager.TAG, "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.mWho;
            int i12 = pollFirst.mRequestCode;
            Fragment findFragmentByWho = FragmentManager.this.mFragmentStore.findFragmentByWho(str);
            if (findFragmentByWho == null) {
                Log.w(FragmentManager.TAG, "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            findFragmentByWho.onRequestPermissionsResult(i12, strArr, iArr);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: androidx.fragment.app.FragmentManager$2 */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements MenuProvider {
        public AnonymousClass2() {
        }

        @Override // androidx.core.view.MenuProvider
        public void onCreateMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
            FragmentManager.this.dispatchCreateOptionsMenu(menu, menuInflater);
        }

        @Override // androidx.core.view.MenuProvider
        public void onMenuClosed(@NonNull Menu menu) {
            FragmentManager.this.dispatchOptionsMenuClosed(menu);
        }

        @Override // androidx.core.view.MenuProvider
        public boolean onMenuItemSelected(@NonNull MenuItem menuItem) {
            return FragmentManager.this.dispatchOptionsItemSelected(menuItem);
        }

        @Override // androidx.core.view.MenuProvider
        public void onPrepareMenu(@NonNull Menu menu) {
            FragmentManager.this.dispatchPrepareOptionsMenu(menu);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: androidx.fragment.app.FragmentManager$3 */
    /* loaded from: classes.dex */
    public class AnonymousClass3 extends FragmentFactory {
        public AnonymousClass3() {
        }

        @Override // androidx.fragment.app.FragmentFactory
        @NonNull
        public Fragment instantiate(@NonNull ClassLoader classLoader, @NonNull String str) {
            return FragmentManager.this.getHost().instantiate(FragmentManager.this.getHost().getContext(), str, null);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: androidx.fragment.app.FragmentManager$4 */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements SpecialEffectsControllerFactory {
        public AnonymousClass4() {
        }

        @Override // androidx.fragment.app.SpecialEffectsControllerFactory
        @NonNull
        public SpecialEffectsController createController(@NonNull ViewGroup viewGroup) {
            return new DefaultSpecialEffectsController(viewGroup);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: androidx.fragment.app.FragmentManager$5 */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements Runnable {
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.execPendingActions(true);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: androidx.fragment.app.FragmentManager$6 */
    /* loaded from: classes.dex */
    public class AnonymousClass6 implements LifecycleEventObserver {
        final /* synthetic */ Lifecycle val$lifecycle;
        final /* synthetic */ FragmentResultListener val$listener;
        final /* synthetic */ String val$requestKey;

        public AnonymousClass6(String str, FragmentResultListener fragmentResultListener, Lifecycle lifecycle) {
            r2 = str;
            r3 = fragmentResultListener;
            r4 = lifecycle;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
            Bundle bundle;
            if (event == Lifecycle.Event.ON_START && (bundle = (Bundle) FragmentManager.this.mResults.get(r2)) != null) {
                r3.onFragmentResult(r2, bundle);
                FragmentManager.this.clearFragmentResult(r2);
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                r4.removeObserver(this);
                FragmentManager.this.mResultListeners.remove(r2);
            }
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: androidx.fragment.app.FragmentManager$7 */
    /* loaded from: classes.dex */
    public class AnonymousClass7 implements FragmentOnAttachListener {
        final /* synthetic */ Fragment val$parent;

        public AnonymousClass7(Fragment fragment) {
            r2 = fragment;
        }

        @Override // androidx.fragment.app.FragmentOnAttachListener
        public void onAttachFragment(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
            r2.onAttachFragment(fragment);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: androidx.fragment.app.FragmentManager$8 */
    /* loaded from: classes.dex */
    public class AnonymousClass8 implements ActivityResultCallback<ActivityResult> {
        public AnonymousClass8() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        public void onActivityResult(ActivityResult activityResult) {
            LaunchedFragmentInfo pollLast = FragmentManager.this.mLaunchedFragments.pollLast();
            if (pollLast == null) {
                Log.w(FragmentManager.TAG, "No Activities were started for result for " + this);
                return;
            }
            String str = pollLast.mWho;
            int i10 = pollLast.mRequestCode;
            Fragment findFragmentByWho = FragmentManager.this.mFragmentStore.findFragmentByWho(str);
            if (findFragmentByWho == null) {
                Log.w(FragmentManager.TAG, "Activity result delivered for unknown Fragment " + str);
                return;
            }
            findFragmentByWho.onActivityResult(i10, activityResult.getResultCode(), activityResult.getData());
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: androidx.fragment.app.FragmentManager$9 */
    /* loaded from: classes.dex */
    public class AnonymousClass9 implements ActivityResultCallback<ActivityResult> {
        public AnonymousClass9() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        public void onActivityResult(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.mLaunchedFragments.pollFirst();
            if (pollFirst == null) {
                Log.w(FragmentManager.TAG, "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.mWho;
            int i10 = pollFirst.mRequestCode;
            Fragment findFragmentByWho = FragmentManager.this.mFragmentStore.findFragmentByWho(str);
            if (findFragmentByWho == null) {
                Log.w(FragmentManager.TAG, "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            findFragmentByWho.onActivityResult(i10, activityResult.getResultCode(), activityResult.getData());
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public interface BackStackEntry {
        @Nullable
        @Deprecated
        CharSequence getBreadCrumbShortTitle();

        @StringRes
        @Deprecated
        int getBreadCrumbShortTitleRes();

        @Nullable
        @Deprecated
        CharSequence getBreadCrumbTitle();

        @StringRes
        @Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        @Nullable
        String getName();
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public class ClearBackStackState implements OpGenerator {
        private final String mName;

        public ClearBackStackState(@NonNull String str) {
            this.mName = str;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.clearBackStackState(arrayList, arrayList2, this.mName);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class FragmentIntentSenderContract extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @NonNull
        public Intent createIntent(@NonNull Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST);
            Intent fillInIntent = intentSenderRequest.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE)) != null) {
                intent.putExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundleExtra);
                fillInIntent.removeExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
                if (fillInIntent.getBooleanExtra(FragmentManager.EXTRA_CREATED_FILLIN_INTENT, false)) {
                    intentSenderRequest = new IntentSenderRequest.Builder(intentSenderRequest.getIntentSender()).setFillInIntent(null).setFlags(intentSenderRequest.getFlagsValues(), intentSenderRequest.getFlagsMask()).build();
                }
            }
            intent.putExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST, intentSenderRequest);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NonNull
        public ActivityResult parseResult(int i10, @Nullable Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class LifecycleAwareResultListener implements FragmentResultListener {
        private final Lifecycle mLifecycle;
        private final FragmentResultListener mListener;
        private final LifecycleEventObserver mObserver;

        public LifecycleAwareResultListener(@NonNull Lifecycle lifecycle, @NonNull FragmentResultListener fragmentResultListener, @NonNull LifecycleEventObserver lifecycleEventObserver) {
            this.mLifecycle = lifecycle;
            this.mListener = fragmentResultListener;
            this.mObserver = lifecycleEventObserver;
        }

        public boolean isAtLeast(Lifecycle.State state) {
            return this.mLifecycle.getState().isAtLeast(state);
        }

        @Override // androidx.fragment.app.FragmentResultListener
        public void onFragmentResult(@NonNull String str, @NonNull Bundle bundle) {
            this.mListener.onFragmentResult(str, bundle);
        }

        public void removeObserver() {
            this.mLifecycle.removeObserver(this.mObserver);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public interface OpGenerator {
        boolean generateOps(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public class PopBackStackState implements OpGenerator {
        final int mFlags;
        final int mId;
        final String mName;

        public PopBackStackState(@Nullable String str, int i10, int i11) {
            this.mName = str;
            this.mId = i10;
            this.mFlags = i11;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.mPrimaryNav;
            if (fragment != null && this.mId < 0 && this.mName == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
                return false;
            }
            return FragmentManager.this.popBackStackState(arrayList, arrayList2, this.mName, this.mId, this.mFlags);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public class RestoreBackStackState implements OpGenerator {
        private final String mName;

        public RestoreBackStackState(@NonNull String str) {
            this.mName = str;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.restoreBackStackState(arrayList, arrayList2, this.mName);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public class SaveBackStackState implements OpGenerator {
        private final String mName;

        public SaveBackStackState(@NonNull String str) {
            this.mName = str;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.saveBackStackState(arrayList, arrayList2, this.mName);
        }
    }

    public FragmentManager() {
        final int i10 = 0;
        this.mOnConfigurationChangedListener = new Consumer(this) { // from class: androidx.fragment.app.i
            public final /* synthetic */ FragmentManager c;

            {
                this.c = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.c.lambda$new$0((Configuration) obj);
                        return;
                    case 1:
                        this.c.lambda$new$1((Integer) obj);
                        return;
                    case 2:
                        this.c.lambda$new$2((MultiWindowModeChangedInfo) obj);
                        return;
                    default:
                        this.c.lambda$new$3((PictureInPictureModeChangedInfo) obj);
                        return;
                }
            }
        };
        final int i11 = 1;
        this.mOnTrimMemoryListener = new Consumer(this) { // from class: androidx.fragment.app.i
            public final /* synthetic */ FragmentManager c;

            {
                this.c = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.c.lambda$new$0((Configuration) obj);
                        return;
                    case 1:
                        this.c.lambda$new$1((Integer) obj);
                        return;
                    case 2:
                        this.c.lambda$new$2((MultiWindowModeChangedInfo) obj);
                        return;
                    default:
                        this.c.lambda$new$3((PictureInPictureModeChangedInfo) obj);
                        return;
                }
            }
        };
        final int i12 = 2;
        this.mOnMultiWindowModeChangedListener = new Consumer(this) { // from class: androidx.fragment.app.i
            public final /* synthetic */ FragmentManager c;

            {
                this.c = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        this.c.lambda$new$0((Configuration) obj);
                        return;
                    case 1:
                        this.c.lambda$new$1((Integer) obj);
                        return;
                    case 2:
                        this.c.lambda$new$2((MultiWindowModeChangedInfo) obj);
                        return;
                    default:
                        this.c.lambda$new$3((PictureInPictureModeChangedInfo) obj);
                        return;
                }
            }
        };
        final int i13 = 3;
        this.mOnPictureInPictureModeChangedListener = new Consumer(this) { // from class: androidx.fragment.app.i
            public final /* synthetic */ FragmentManager c;

            {
                this.c = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i13) {
                    case 0:
                        this.c.lambda$new$0((Configuration) obj);
                        return;
                    case 1:
                        this.c.lambda$new$1((Integer) obj);
                        return;
                    case 2:
                        this.c.lambda$new$2((MultiWindowModeChangedInfo) obj);
                        return;
                    default:
                        this.c.lambda$new$3((PictureInPictureModeChangedInfo) obj);
                        return;
                }
            }
        };
    }

    private void checkStateLoss() {
        if (!isStateSaved()) {
            return;
        }
        j1.i.l("Can not perform this action after onSaveInstanceState");
    }

    private void cleanupExec() {
        this.mExecutingActions = false;
        this.mTmpIsPop.clear();
        this.mTmpRecords.clear();
    }

    private void clearBackStackStateViewModels() {
        boolean z9;
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            z9 = this.mFragmentStore.getNonConfig().isCleared();
        } else if (fragmentHostCallback.getContext() instanceof Activity) {
            z9 = !((Activity) this.mHost.getContext()).isChangingConfigurations();
        } else {
            z9 = true;
        }
        if (z9) {
            Iterator<BackStackState> it = this.mBackStackStates.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().mFragments.iterator();
                while (it2.hasNext()) {
                    this.mFragmentStore.getNonConfig().clearNonConfigState(it2.next(), false);
                }
            }
        }
    }

    private Set<SpecialEffectsController> collectAllSpecialEffectsController() {
        HashSet hashSet = new HashSet();
        Iterator<FragmentStateManager> it = this.mFragmentStore.getActiveFragmentStateManagers().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().getFragment().mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.getOrCreateController(viewGroup, getSpecialEffectsControllerFactory()));
            }
        }
        return hashSet;
    }

    private Set<SpecialEffectsController> collectChangedControllers(@NonNull ArrayList<BackStackRecord> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            ArrayList<FragmentTransaction.Op> arrayList2 = arrayList.get(i10).mOps;
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                FragmentTransaction.Op op = arrayList2.get(i12);
                i12++;
                Fragment fragment = op.mFragment;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(SpecialEffectsController.getOrCreateController(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    private void dispatchParentPrimaryNavigationFragmentChanged(@Nullable Fragment fragment) {
        if (fragment != null && fragment.equals(findActiveFragment(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    private void dispatchStateChange(int i10) {
        try {
            this.mExecutingActions = true;
            this.mFragmentStore.dispatchStateChange(i10);
            moveToState(i10, false);
            Iterator<SpecialEffectsController> it = collectAllSpecialEffectsController().iterator();
            while (it.hasNext()) {
                it.next().forceCompleteAllOperations();
            }
            this.mExecutingActions = false;
            execPendingActions(true);
        } catch (Throwable th) {
            this.mExecutingActions = false;
            throw th;
        }
    }

    private void doPendingDeferredStart() {
        if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            startPendingDeferredFragments();
        }
    }

    @Deprecated
    public static void enableDebugLogging(boolean z9) {
        DEBUG = z9;
    }

    private void endAnimatingAwayFragments() {
        Iterator<SpecialEffectsController> it = collectAllSpecialEffectsController().iterator();
        while (it.hasNext()) {
            it.next().forceCompleteAllOperations();
        }
    }

    private void ensureExecReady(boolean z9) {
        if (!this.mExecutingActions) {
            if (this.mHost == null) {
                if (this.mDestroyed) {
                    j1.i.l("FragmentManager has been destroyed");
                    return;
                } else {
                    j1.i.l("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (Looper.myLooper() == this.mHost.getHandler().getLooper()) {
                if (!z9) {
                    checkStateLoss();
                }
                if (this.mTmpRecords == null) {
                    this.mTmpRecords = new ArrayList<>();
                    this.mTmpIsPop = new ArrayList<>();
                    return;
                }
                return;
            }
            j1.i.l("Must be called from main thread of fragment host");
            return;
        }
        j1.i.l("FragmentManager is already executing transactions");
    }

    private static void executeOps(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            BackStackRecord backStackRecord = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                backStackRecord.bumpBackStackNesting(-1);
                backStackRecord.executePopOps();
            } else {
                backStackRecord.bumpBackStackNesting(1);
                backStackRecord.executeOps();
            }
            i10++;
        }
    }

    private void executeOpsTogether(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i10, int i11) {
        ArrayList<OnBackStackChangedListener> arrayList3;
        boolean z9 = arrayList.get(i10).mReorderingAllowed;
        ArrayList<Fragment> arrayList4 = this.mTmpAddedFragments;
        if (arrayList4 == null) {
            this.mTmpAddedFragments = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.mTmpAddedFragments.addAll(this.mFragmentStore.getFragments());
        Fragment primaryNavigationFragment = getPrimaryNavigationFragment();
        boolean z10 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            BackStackRecord backStackRecord = arrayList.get(i12);
            boolean booleanValue = arrayList2.get(i12).booleanValue();
            ArrayList<Fragment> arrayList5 = this.mTmpAddedFragments;
            if (!booleanValue) {
                primaryNavigationFragment = backStackRecord.expandOps(arrayList5, primaryNavigationFragment);
            } else {
                primaryNavigationFragment = backStackRecord.trackAddedFragmentsInPop(arrayList5, primaryNavigationFragment);
            }
            if (!z10 && !backStackRecord.mAddToBackStack) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        this.mTmpAddedFragments.clear();
        if (!z9 && this.mCurState >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                ArrayList<FragmentTransaction.Op> arrayList6 = arrayList.get(i13).mOps;
                int size = arrayList6.size();
                int i14 = 0;
                while (i14 < size) {
                    FragmentTransaction.Op op = arrayList6.get(i14);
                    i14++;
                    Fragment fragment = op.mFragment;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.mFragmentStore.makeActive(createOrGetFragmentStateManager(fragment));
                    }
                }
            }
        }
        executeOps(arrayList, arrayList2, i10, i11);
        boolean booleanValue2 = arrayList2.get(i11 - 1).booleanValue();
        if (z10 && (arrayList3 = this.mBackStackChangeListeners) != null && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i15 = 0;
            while (i15 < size2) {
                BackStackRecord backStackRecord2 = arrayList.get(i15);
                i15++;
                linkedHashSet.addAll(fragmentsFromRecord(backStackRecord2));
            }
            ArrayList<OnBackStackChangedListener> arrayList7 = this.mBackStackChangeListeners;
            int size3 = arrayList7.size();
            int i16 = 0;
            while (i16 < size3) {
                OnBackStackChangedListener onBackStackChangedListener = arrayList7.get(i16);
                i16++;
                OnBackStackChangedListener onBackStackChangedListener2 = onBackStackChangedListener;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    onBackStackChangedListener2.onBackStackChangeStarted((Fragment) it.next(), booleanValue2);
                }
            }
            ArrayList<OnBackStackChangedListener> arrayList8 = this.mBackStackChangeListeners;
            int size4 = arrayList8.size();
            int i17 = 0;
            while (i17 < size4) {
                OnBackStackChangedListener onBackStackChangedListener3 = arrayList8.get(i17);
                i17++;
                OnBackStackChangedListener onBackStackChangedListener4 = onBackStackChangedListener3;
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    onBackStackChangedListener4.onBackStackChangeCommitted((Fragment) it2.next(), booleanValue2);
                }
            }
        }
        for (int i18 = i10; i18 < i11; i18++) {
            BackStackRecord backStackRecord3 = arrayList.get(i18);
            if (booleanValue2) {
                for (int size5 = backStackRecord3.mOps.size() - 1; size5 >= 0; size5--) {
                    Fragment fragment2 = backStackRecord3.mOps.get(size5).mFragment;
                    if (fragment2 != null) {
                        createOrGetFragmentStateManager(fragment2).moveToExpectedState();
                    }
                }
            } else {
                ArrayList<FragmentTransaction.Op> arrayList9 = backStackRecord3.mOps;
                int size6 = arrayList9.size();
                int i19 = 0;
                while (i19 < size6) {
                    FragmentTransaction.Op op2 = arrayList9.get(i19);
                    i19++;
                    Fragment fragment3 = op2.mFragment;
                    if (fragment3 != null) {
                        createOrGetFragmentStateManager(fragment3).moveToExpectedState();
                    }
                }
            }
        }
        moveToState(this.mCurState, true);
        for (SpecialEffectsController specialEffectsController : collectChangedControllers(arrayList, i10, i11)) {
            specialEffectsController.updateOperationDirection(booleanValue2);
            specialEffectsController.markPostponedState();
            specialEffectsController.executePendingOperations();
        }
        while (i10 < i11) {
            BackStackRecord backStackRecord4 = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue() && backStackRecord4.mIndex >= 0) {
                backStackRecord4.mIndex = -1;
            }
            backStackRecord4.runOnCommitRunnables();
            i10++;
        }
        if (z10) {
            reportBackStackChanged();
        }
    }

    private int findBackStackIndex(@Nullable String str, int i10, boolean z9) {
        ArrayList<BackStackRecord> arrayList = this.mBackStack;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z9) {
                return 0;
            }
            return this.mBackStack.size() - 1;
        }
        int size = this.mBackStack.size() - 1;
        while (size >= 0) {
            BackStackRecord backStackRecord = this.mBackStack.get(size);
            if ((str != null && str.equals(backStackRecord.getName())) || (i10 >= 0 && i10 == backStackRecord.mIndex)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (z9) {
            while (size > 0) {
                BackStackRecord backStackRecord2 = this.mBackStack.get(size - 1);
                if ((str == null || !str.equals(backStackRecord2.getName())) && (i10 < 0 || i10 != backStackRecord2.mIndex)) {
                    break;
                }
                size--;
            }
            return size;
        }
        if (size == this.mBackStack.size() - 1) {
            return -1;
        }
        return size + 1;
    }

    @NonNull
    public static <F extends Fragment> F findFragment(@NonNull View view) {
        F f8 = (F) findViewFragment(view);
        if (f8 != null) {
            return f8;
        }
        ai.onnxruntime.b.g(view, "View ", " does not have a Fragment set");
        return null;
    }

    @NonNull
    public static FragmentManager findFragmentManager(@NonNull View view) {
        FragmentActivity fragmentActivity;
        Fragment findViewFragment = findViewFragment(view);
        if (findViewFragment != null) {
            if (findViewFragment.isAdded()) {
                return findViewFragment.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + findViewFragment + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                fragmentActivity = null;
                break;
            }
        }
        if (fragmentActivity != null) {
            return fragmentActivity.getSupportFragmentManager();
        }
        ai.onnxruntime.b.g(view, "View ", " is not within a subclass of FragmentActivity.");
        return null;
    }

    @Nullable
    public static Fragment findViewFragment(@NonNull View view) {
        while (view != null) {
            Fragment viewFragment = getViewFragment(view);
            if (viewFragment != null) {
                return viewFragment;
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    private void forcePostponedTransactions() {
        Iterator<SpecialEffectsController> it = collectAllSpecialEffectsController().iterator();
        while (it.hasNext()) {
            it.next().forcePostponedExecutePendingOperations();
        }
    }

    private Set<Fragment> fragmentsFromRecord(@NonNull BackStackRecord backStackRecord) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < backStackRecord.mOps.size(); i10++) {
            Fragment fragment = backStackRecord.mOps.get(i10).mFragment;
            if (fragment != null && backStackRecord.mAddToBackStack) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    private boolean generateOpsForPendingActions(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        synchronized (this.mPendingActions) {
            int i10 = 0;
            if (this.mPendingActions.isEmpty()) {
                return false;
            }
            try {
                int size = this.mPendingActions.size();
                boolean z9 = false;
                while (true) {
                    ArrayList<OpGenerator> arrayList3 = this.mPendingActions;
                    if (i10 < size) {
                        z9 |= arrayList3.get(i10).generateOps(arrayList, arrayList2);
                        i10++;
                    } else {
                        arrayList3.clear();
                        this.mHost.getHandler().removeCallbacks(this.mExecCommit);
                        return z9;
                    }
                }
            } catch (Throwable th) {
                this.mPendingActions.clear();
                this.mHost.getHandler().removeCallbacks(this.mExecCommit);
                throw th;
            }
        }
    }

    @NonNull
    private FragmentManagerViewModel getChildNonConfig(@NonNull Fragment fragment) {
        return this.mNonConfig.getChildNonConfig(fragment);
    }

    private ViewGroup getFragmentContainer(@NonNull Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.mContainer.onHasView()) {
            View onFindViewById = this.mContainer.onFindViewById(fragment.mContainerId);
            if (onFindViewById instanceof ViewGroup) {
                return (ViewGroup) onFindViewById;
            }
        }
        return null;
    }

    @Nullable
    public static Fragment getViewFragment(@NonNull View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean isLoggingEnabled(int i10) {
        if (!DEBUG && !Log.isLoggable(TAG, i10)) {
            return false;
        }
        return true;
    }

    private boolean isMenuAvailable(@NonNull Fragment fragment) {
        if ((fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.checkForMenus()) {
            return true;
        }
        return false;
    }

    private boolean isParentAdded() {
        Fragment fragment = this.mParent;
        if (fragment == null) {
            return true;
        }
        if (fragment.isAdded() && this.mParent.getParentFragmentManager().isParentAdded()) {
            return true;
        }
        return false;
    }

    public /* synthetic */ void lambda$new$0(Configuration configuration) {
        if (isParentAdded()) {
            dispatchConfigurationChanged(configuration, false);
        }
    }

    public /* synthetic */ void lambda$new$1(Integer num) {
        if (isParentAdded() && num.intValue() == 80) {
            dispatchLowMemory(false);
        }
    }

    public /* synthetic */ void lambda$new$2(MultiWindowModeChangedInfo multiWindowModeChangedInfo) {
        if (isParentAdded()) {
            dispatchMultiWindowModeChanged(multiWindowModeChangedInfo.getIsInMultiWindowMode(), false);
        }
    }

    public /* synthetic */ void lambda$new$3(PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo) {
        if (isParentAdded()) {
            dispatchPictureInPictureModeChanged(pictureInPictureModeChangedInfo.getIsInPictureInPictureMode(), false);
        }
    }

    private boolean popBackStackImmediate(@Nullable String str, int i10, int i11) {
        execPendingActions(false);
        ensureExecReady(true);
        Fragment fragment = this.mPrimaryNav;
        if (fragment != null && i10 < 0 && str == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
            return true;
        }
        boolean popBackStackState = popBackStackState(this.mTmpRecords, this.mTmpIsPop, str, i10, i11);
        if (popBackStackState) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                cleanupExec();
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.burpActive();
        return popBackStackState;
    }

    private void removeRedundantOperationsAndExecute(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i10 < size) {
                    if (!arrayList.get(i10).mReorderingAllowed) {
                        if (i11 != i10) {
                            executeOpsTogether(arrayList, arrayList2, i11, i10);
                        }
                        i11 = i10 + 1;
                        if (arrayList2.get(i10).booleanValue()) {
                            while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).mReorderingAllowed) {
                                i11++;
                            }
                        }
                        executeOpsTogether(arrayList, arrayList2, i10, i11);
                        i10 = i11 - 1;
                    }
                    i10++;
                }
                if (i11 != size) {
                    executeOpsTogether(arrayList, arrayList2, i11, size);
                    return;
                }
                return;
            }
            j1.i.l("Internal error with the back stack records");
        }
    }

    private void reportBackStackChanged() {
        if (this.mBackStackChangeListeners != null) {
            for (int i10 = 0; i10 < this.mBackStackChangeListeners.size(); i10++) {
                this.mBackStackChangeListeners.get(i10).onBackStackChanged();
            }
        }
    }

    public static int reverseTransit(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 == 8194) {
            return FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        }
        if (i10 == 8197) {
            return FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN;
        }
        if (i10 == 4099) {
            return FragmentTransaction.TRANSIT_FRAGMENT_FADE;
        }
        if (i10 == 4100) {
            return FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_CLOSE;
        }
        return 0;
    }

    private void setVisibleRemovingFragment(@NonNull Fragment fragment) {
        ViewGroup fragmentContainer = getFragmentContainer(fragment);
        if (fragmentContainer != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (fragmentContainer.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    fragmentContainer.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) fragmentContainer.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    private void startPendingDeferredFragments() {
        Iterator<FragmentStateManager> it = this.mFragmentStore.getActiveFragmentStateManagers().iterator();
        while (it.hasNext()) {
            performPendingDeferredStart(it.next());
        }
    }

    private void throwException(RuntimeException runtimeException) {
        Log.e(TAG, runtimeException.getMessage());
        Log.e(TAG, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new LogWriter(TAG));
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback != null) {
            try {
                fragmentHostCallback.onDump("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e(TAG, "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e6) {
            Log.e(TAG, "Failed dumping state", e6);
            throw runtimeException;
        }
    }

    private void updateOnBackPressedCallbackEnabled() {
        synchronized (this.mPendingActions) {
            try {
                boolean z9 = true;
                if (!this.mPendingActions.isEmpty()) {
                    this.mOnBackPressedCallback.setEnabled(true);
                    return;
                }
                OnBackPressedCallback onBackPressedCallback = this.mOnBackPressedCallback;
                if (getBackStackEntryCount() <= 0 || !isPrimaryNavigation(this.mParent)) {
                    z9 = false;
                }
                onBackPressedCallback.setEnabled(z9);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addBackStackState(BackStackRecord backStackRecord) {
        if (this.mBackStack == null) {
            this.mBackStack = new ArrayList<>();
        }
        this.mBackStack.add(backStackRecord);
    }

    public FragmentStateManager addFragment(@NonNull Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.onFragmentReuse(fragment, str);
        }
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "add: " + fragment);
        }
        FragmentStateManager createOrGetFragmentStateManager = createOrGetFragmentStateManager(fragment);
        fragment.mFragmentManager = this;
        this.mFragmentStore.makeActive(createOrGetFragmentStateManager);
        if (!fragment.mDetached) {
            this.mFragmentStore.addFragment(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
        }
        return createOrGetFragmentStateManager;
    }

    public void addFragmentOnAttachListener(@NonNull FragmentOnAttachListener fragmentOnAttachListener) {
        this.mOnAttachListeners.add(fragmentOnAttachListener);
    }

    public void addOnBackStackChangedListener(@NonNull OnBackStackChangedListener onBackStackChangedListener) {
        if (this.mBackStackChangeListeners == null) {
            this.mBackStackChangeListeners = new ArrayList<>();
        }
        this.mBackStackChangeListeners.add(onBackStackChangedListener);
    }

    public void addRetainedFragment(@NonNull Fragment fragment) {
        this.mNonConfig.addRetainedFragment(fragment);
    }

    public int allocBackStackIndex() {
        return this.mBackStackIndex.getAndIncrement();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void attachController(@NonNull FragmentHostCallback<?> fragmentHostCallback, @NonNull FragmentContainer fragmentContainer, @Nullable Fragment fragment) {
        String str;
        if (this.mHost == null) {
            this.mHost = fragmentHostCallback;
            this.mContainer = fragmentContainer;
            this.mParent = fragment;
            if (fragment != null) {
                addFragmentOnAttachListener(new FragmentOnAttachListener() { // from class: androidx.fragment.app.FragmentManager.7
                    final /* synthetic */ Fragment val$parent;

                    public AnonymousClass7(Fragment fragment2) {
                        r2 = fragment2;
                    }

                    @Override // androidx.fragment.app.FragmentOnAttachListener
                    public void onAttachFragment(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment2) {
                        r2.onAttachFragment(fragment2);
                    }
                });
            } else if (fragmentHostCallback instanceof FragmentOnAttachListener) {
                addFragmentOnAttachListener((FragmentOnAttachListener) fragmentHostCallback);
            }
            if (this.mParent != null) {
                updateOnBackPressedCallbackEnabled();
            }
            if (fragmentHostCallback instanceof OnBackPressedDispatcherOwner) {
                OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) fragmentHostCallback;
                OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher();
                this.mOnBackPressedDispatcher = onBackPressedDispatcher;
                LifecycleOwner lifecycleOwner = onBackPressedDispatcherOwner;
                if (fragment2 != null) {
                    lifecycleOwner = fragment2;
                }
                onBackPressedDispatcher.addCallback(lifecycleOwner, this.mOnBackPressedCallback);
            }
            if (fragment2 != null) {
                this.mNonConfig = fragment2.mFragmentManager.getChildNonConfig(fragment2);
            } else if (fragmentHostCallback instanceof ViewModelStoreOwner) {
                this.mNonConfig = FragmentManagerViewModel.getInstance(((ViewModelStoreOwner) fragmentHostCallback).getViewModelStore());
            } else {
                this.mNonConfig = new FragmentManagerViewModel(false);
            }
            this.mNonConfig.setIsStateSaved(isStateSaved());
            this.mFragmentStore.setNonConfig(this.mNonConfig);
            Object obj = this.mHost;
            if ((obj instanceof SavedStateRegistryOwner) && fragment2 == null) {
                SavedStateRegistry savedStateRegistry = ((SavedStateRegistryOwner) obj).getSavedStateRegistry();
                savedStateRegistry.registerSavedStateProvider(SAVED_STATE_KEY, new e(1, this));
                Bundle consumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey(SAVED_STATE_KEY);
                if (consumeRestoredStateForKey != null) {
                    restoreSaveStateInternal(consumeRestoredStateForKey);
                }
            }
            Object obj2 = this.mHost;
            if (obj2 instanceof ActivityResultRegistryOwner) {
                ActivityResultRegistry activityResultRegistry = ((ActivityResultRegistryOwner) obj2).getActivityResultRegistry();
                if (fragment2 != null) {
                    str = ai.onnxruntime.a.p(new StringBuilder(), fragment2.mWho, ":");
                } else {
                    str = "";
                }
                String concat = "FragmentManager:".concat(str);
                this.mStartActivityForResult = activityResultRegistry.register(concat.concat("StartActivityForResult"), new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.8
                    public AnonymousClass8() {
                    }

                    @Override // androidx.activity.result.ActivityResultCallback
                    public void onActivityResult(ActivityResult activityResult) {
                        LaunchedFragmentInfo pollLast = FragmentManager.this.mLaunchedFragments.pollLast();
                        if (pollLast == null) {
                            Log.w(FragmentManager.TAG, "No Activities were started for result for " + this);
                            return;
                        }
                        String str2 = pollLast.mWho;
                        int i10 = pollLast.mRequestCode;
                        Fragment findFragmentByWho = FragmentManager.this.mFragmentStore.findFragmentByWho(str2);
                        if (findFragmentByWho == null) {
                            Log.w(FragmentManager.TAG, "Activity result delivered for unknown Fragment " + str2);
                            return;
                        }
                        findFragmentByWho.onActivityResult(i10, activityResult.getResultCode(), activityResult.getData());
                    }
                });
                this.mStartIntentSenderForResult = activityResultRegistry.register(concat.concat("StartIntentSenderForResult"), new FragmentIntentSenderContract(), new ActivityResultCallback<ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.9
                    public AnonymousClass9() {
                    }

                    @Override // androidx.activity.result.ActivityResultCallback
                    public void onActivityResult(ActivityResult activityResult) {
                        LaunchedFragmentInfo pollFirst = FragmentManager.this.mLaunchedFragments.pollFirst();
                        if (pollFirst == null) {
                            Log.w(FragmentManager.TAG, "No IntentSenders were started for " + this);
                            return;
                        }
                        String str2 = pollFirst.mWho;
                        int i10 = pollFirst.mRequestCode;
                        Fragment findFragmentByWho = FragmentManager.this.mFragmentStore.findFragmentByWho(str2);
                        if (findFragmentByWho == null) {
                            Log.w(FragmentManager.TAG, "Intent Sender result delivered for unknown Fragment " + str2);
                            return;
                        }
                        findFragmentByWho.onActivityResult(i10, activityResult.getResultCode(), activityResult.getData());
                    }
                });
                this.mRequestPermissions = activityResultRegistry.register(concat.concat("RequestPermissions"), new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback<Map<String, Boolean>>() { // from class: androidx.fragment.app.FragmentManager.10
                    public AnonymousClass10() {
                    }

                    @Override // androidx.activity.result.ActivityResultCallback
                    public void onActivityResult(Map<String, Boolean> map) {
                        int i10;
                        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                        ArrayList arrayList = new ArrayList(map.values());
                        int[] iArr = new int[arrayList.size()];
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            if (((Boolean) arrayList.get(i11)).booleanValue()) {
                                i10 = 0;
                            } else {
                                i10 = -1;
                            }
                            iArr[i11] = i10;
                        }
                        LaunchedFragmentInfo pollFirst = FragmentManager.this.mLaunchedFragments.pollFirst();
                        if (pollFirst == null) {
                            Log.w(FragmentManager.TAG, "No permissions were requested for " + this);
                            return;
                        }
                        String str2 = pollFirst.mWho;
                        int i12 = pollFirst.mRequestCode;
                        Fragment findFragmentByWho = FragmentManager.this.mFragmentStore.findFragmentByWho(str2);
                        if (findFragmentByWho == null) {
                            Log.w(FragmentManager.TAG, "Permission request result delivered for unknown Fragment " + str2);
                            return;
                        }
                        findFragmentByWho.onRequestPermissionsResult(i12, strArr, iArr);
                    }
                });
            }
            Object obj3 = this.mHost;
            if (obj3 instanceof OnConfigurationChangedProvider) {
                ((OnConfigurationChangedProvider) obj3).addOnConfigurationChangedListener(this.mOnConfigurationChangedListener);
            }
            Object obj4 = this.mHost;
            if (obj4 instanceof OnTrimMemoryProvider) {
                ((OnTrimMemoryProvider) obj4).addOnTrimMemoryListener(this.mOnTrimMemoryListener);
            }
            Object obj5 = this.mHost;
            if (obj5 instanceof OnMultiWindowModeChangedProvider) {
                ((OnMultiWindowModeChangedProvider) obj5).addOnMultiWindowModeChangedListener(this.mOnMultiWindowModeChangedListener);
            }
            Object obj6 = this.mHost;
            if (obj6 instanceof OnPictureInPictureModeChangedProvider) {
                ((OnPictureInPictureModeChangedProvider) obj6).addOnPictureInPictureModeChangedListener(this.mOnPictureInPictureModeChangedListener);
            }
            Object obj7 = this.mHost;
            if ((obj7 instanceof MenuHost) && fragment2 == null) {
                ((MenuHost) obj7).addMenuProvider(this.mMenuProvider);
                return;
            }
            return;
        }
        j1.i.l("Already attached");
    }

    public void attachFragment(@NonNull Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.mFragmentStore.addFragment(fragment);
                if (isLoggingEnabled(2)) {
                    Log.v(TAG, "add from attach: " + fragment);
                }
                if (isMenuAvailable(fragment)) {
                    this.mNeedMenuInvalidate = true;
                }
            }
        }
    }

    @NonNull
    public FragmentTransaction beginTransaction() {
        return new BackStackRecord(this);
    }

    public boolean checkForMenus() {
        boolean z9 = false;
        for (Fragment fragment : this.mFragmentStore.getActiveFragments()) {
            if (fragment != null) {
                z9 = isMenuAvailable(fragment);
            }
            if (z9) {
                return true;
            }
        }
        return false;
    }

    public void clearBackStack(@NonNull String str) {
        enqueueAction(new ClearBackStackState(str), false);
    }

    public boolean clearBackStackState(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2, @NonNull String str) {
        if (!restoreBackStackState(arrayList, arrayList2, str)) {
            return false;
        }
        return popBackStackState(arrayList, arrayList2, str, -1, 1);
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResult(@NonNull String str) {
        this.mResults.remove(str);
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "Clearing fragment result with key " + str);
        }
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResultListener(@NonNull String str) {
        LifecycleAwareResultListener remove = this.mResultListeners.remove(str);
        if (remove != null) {
            remove.removeObserver();
        }
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "Clearing FragmentResultListener for key " + str);
        }
    }

    @NonNull
    public FragmentStateManager createOrGetFragmentStateManager(@NonNull Fragment fragment) {
        FragmentStateManager fragmentStateManager = this.mFragmentStore.getFragmentStateManager(fragment.mWho);
        if (fragmentStateManager != null) {
            return fragmentStateManager;
        }
        FragmentStateManager fragmentStateManager2 = new FragmentStateManager(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment);
        fragmentStateManager2.restoreState(this.mHost.getContext().getClassLoader());
        fragmentStateManager2.setFragmentManagerState(this.mCurState);
        return fragmentStateManager2;
    }

    public void detachFragment(@NonNull Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "detach: " + fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (isLoggingEnabled(2)) {
                    Log.v(TAG, "remove from detach: " + fragment);
                }
                this.mFragmentStore.removeFragment(fragment);
                if (isMenuAvailable(fragment)) {
                    this.mNeedMenuInvalidate = true;
                }
                setVisibleRemovingFragment(fragment);
            }
        }
    }

    public void dispatchActivityCreated() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.setIsStateSaved(false);
        dispatchStateChange(4);
    }

    public void dispatchAttach() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.setIsStateSaved(false);
        dispatchStateChange(0);
    }

    public void dispatchConfigurationChanged(@NonNull Configuration configuration, boolean z9) {
        if (z9 && (this.mHost instanceof OnConfigurationChangedProvider)) {
            throwException(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z9) {
                    fragment.mChildFragmentManager.dispatchConfigurationChanged(configuration, true);
                }
            }
        }
    }

    public boolean dispatchContextItemSelected(@NonNull MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void dispatchCreate() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.setIsStateSaved(false);
        dispatchStateChange(1);
    }

    public boolean dispatchCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.mCurState < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z9 = false;
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null && isParentMenuVisible(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z9 = true;
            }
        }
        if (this.mCreatedMenus != null) {
            for (int i10 = 0; i10 < this.mCreatedMenus.size(); i10++) {
                Fragment fragment2 = this.mCreatedMenus.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.mCreatedMenus = arrayList;
        return z9;
    }

    public void dispatchDestroy() {
        this.mDestroyed = true;
        execPendingActions(true);
        endAnimatingAwayFragments();
        clearBackStackStateViewModels();
        dispatchStateChange(-1);
        Object obj = this.mHost;
        if (obj instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) obj).removeOnTrimMemoryListener(this.mOnTrimMemoryListener);
        }
        Object obj2 = this.mHost;
        if (obj2 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) obj2).removeOnConfigurationChangedListener(this.mOnConfigurationChangedListener);
        }
        Object obj3 = this.mHost;
        if (obj3 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj3).removeOnMultiWindowModeChangedListener(this.mOnMultiWindowModeChangedListener);
        }
        Object obj4 = this.mHost;
        if (obj4 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj4).removeOnPictureInPictureModeChangedListener(this.mOnPictureInPictureModeChangedListener);
        }
        Object obj5 = this.mHost;
        if ((obj5 instanceof MenuHost) && this.mParent == null) {
            ((MenuHost) obj5).removeMenuProvider(this.mMenuProvider);
        }
        this.mHost = null;
        this.mContainer = null;
        this.mParent = null;
        if (this.mOnBackPressedDispatcher != null) {
            this.mOnBackPressedCallback.remove();
            this.mOnBackPressedDispatcher = null;
        }
        ActivityResultLauncher<Intent> activityResultLauncher = this.mStartActivityForResult;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
            this.mStartIntentSenderForResult.unregister();
            this.mRequestPermissions.unregister();
        }
    }

    public void dispatchDestroyView() {
        dispatchStateChange(1);
    }

    public void dispatchLowMemory(boolean z9) {
        if (z9 && (this.mHost instanceof OnTrimMemoryProvider)) {
            throwException(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z9) {
                    fragment.mChildFragmentManager.dispatchLowMemory(true);
                }
            }
        }
    }

    public void dispatchMultiWindowModeChanged(boolean z9, boolean z10) {
        if (z10 && (this.mHost instanceof OnMultiWindowModeChangedProvider)) {
            throwException(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z9);
                if (z10) {
                    fragment.mChildFragmentManager.dispatchMultiWindowModeChanged(z9, true);
                }
            }
        }
    }

    public void dispatchOnAttachFragment(@NonNull Fragment fragment) {
        Iterator<FragmentOnAttachListener> it = this.mOnAttachListeners.iterator();
        while (it.hasNext()) {
            it.next().onAttachFragment(this, fragment);
        }
    }

    public void dispatchOnHiddenChanged() {
        for (Fragment fragment : this.mFragmentStore.getActiveFragments()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.dispatchOnHiddenChanged();
            }
        }
    }

    public boolean dispatchOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void dispatchOptionsMenuClosed(@NonNull Menu menu) {
        if (this.mCurState >= 1) {
            for (Fragment fragment : this.mFragmentStore.getFragments()) {
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    public void dispatchPause() {
        dispatchStateChange(5);
    }

    public void dispatchPictureInPictureModeChanged(boolean z9, boolean z10) {
        if (z10 && (this.mHost instanceof OnPictureInPictureModeChangedProvider)) {
            throwException(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z9);
                if (z10) {
                    fragment.mChildFragmentManager.dispatchPictureInPictureModeChanged(z9, true);
                }
            }
        }
    }

    public boolean dispatchPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z9 = false;
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.getFragments()) {
            if (fragment != null && isParentMenuVisible(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z9 = true;
            }
        }
        return z9;
    }

    public void dispatchPrimaryNavigationFragmentChanged() {
        updateOnBackPressedCallbackEnabled();
        dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
    }

    public void dispatchResume() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.setIsStateSaved(false);
        dispatchStateChange(7);
    }

    public void dispatchStart() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.setIsStateSaved(false);
        dispatchStateChange(5);
    }

    public void dispatchStop() {
        this.mStopped = true;
        this.mNonConfig.setIsStateSaved(true);
        dispatchStateChange(4);
    }

    public void dispatchViewCreated() {
        dispatchStateChange(2);
    }

    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        int size;
        int size2;
        String C = ai.onnxruntime.a.C(str, "    ");
        this.mFragmentStore.dump(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.mCreatedMenus;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                Fragment fragment = this.mCreatedMenus.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<BackStackRecord> arrayList2 = this.mBackStack;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                BackStackRecord backStackRecord = this.mBackStack.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(backStackRecord.toString());
                backStackRecord.dump(C, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.mBackStackIndex.get());
        synchronized (this.mPendingActions) {
            try {
                int size3 = this.mPendingActions.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        OpGenerator opGenerator = this.mPendingActions.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(opGenerator);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.mHost);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.mContainer);
        if (this.mParent != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.mParent);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.mCurState);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.mStateSaved);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.mDestroyed);
        if (this.mNeedMenuInvalidate) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.mNeedMenuInvalidate);
        }
    }

    public void enqueueAction(@NonNull OpGenerator opGenerator, boolean z9) {
        if (!z9) {
            if (this.mHost == null) {
                if (this.mDestroyed) {
                    j1.i.l("FragmentManager has been destroyed");
                    return;
                } else {
                    j1.i.l("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            checkStateLoss();
        }
        synchronized (this.mPendingActions) {
            try {
                if (this.mHost == null) {
                    if (z9) {
                    } else {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.mPendingActions.add(opGenerator);
                    scheduleCommit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean execPendingActions(boolean z9) {
        ensureExecReady(z9);
        boolean z10 = false;
        while (generateOpsForPendingActions(this.mTmpRecords, this.mTmpIsPop)) {
            z10 = true;
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                cleanupExec();
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.burpActive();
        return z10;
    }

    public void execSingleAction(@NonNull OpGenerator opGenerator, boolean z9) {
        if (z9 && (this.mHost == null || this.mDestroyed)) {
            return;
        }
        ensureExecReady(z9);
        if (opGenerator.generateOps(this.mTmpRecords, this.mTmpIsPop)) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                cleanupExec();
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.burpActive();
    }

    @MainThread
    public boolean executePendingTransactions() {
        boolean execPendingActions = execPendingActions(true);
        forcePostponedTransactions();
        return execPendingActions;
    }

    @Nullable
    public Fragment findActiveFragment(@NonNull String str) {
        return this.mFragmentStore.findActiveFragment(str);
    }

    @Nullable
    public Fragment findFragmentById(@IdRes int i10) {
        return this.mFragmentStore.findFragmentById(i10);
    }

    @Nullable
    public Fragment findFragmentByTag(@Nullable String str) {
        return this.mFragmentStore.findFragmentByTag(str);
    }

    public Fragment findFragmentByWho(@NonNull String str) {
        return this.mFragmentStore.findFragmentByWho(str);
    }

    public int getActiveFragmentCount() {
        return this.mFragmentStore.getActiveFragmentCount();
    }

    @NonNull
    public List<Fragment> getActiveFragments() {
        return this.mFragmentStore.getActiveFragments();
    }

    @NonNull
    public BackStackEntry getBackStackEntryAt(int i10) {
        return this.mBackStack.get(i10);
    }

    public int getBackStackEntryCount() {
        ArrayList<BackStackRecord> arrayList = this.mBackStack;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @NonNull
    public FragmentContainer getContainer() {
        return this.mContainer;
    }

    @Nullable
    public Fragment getFragment(@NonNull Bundle bundle, @NonNull String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment findActiveFragment = findActiveFragment(string);
        if (findActiveFragment == null) {
            throwException(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return findActiveFragment;
    }

    @NonNull
    public FragmentFactory getFragmentFactory() {
        FragmentFactory fragmentFactory = this.mFragmentFactory;
        if (fragmentFactory != null) {
            return fragmentFactory;
        }
        Fragment fragment = this.mParent;
        if (fragment != null) {
            return fragment.mFragmentManager.getFragmentFactory();
        }
        return this.mHostFragmentFactory;
    }

    @NonNull
    public FragmentStore getFragmentStore() {
        return this.mFragmentStore;
    }

    @NonNull
    public List<Fragment> getFragments() {
        return this.mFragmentStore.getFragments();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public FragmentHostCallback<?> getHost() {
        return this.mHost;
    }

    @NonNull
    public LayoutInflater.Factory2 getLayoutInflaterFactory() {
        return this.mLayoutInflaterFactory;
    }

    @NonNull
    public FragmentLifecycleCallbacksDispatcher getLifecycleCallbacksDispatcher() {
        return this.mLifecycleCallbacksDispatcher;
    }

    @Nullable
    public Fragment getParent() {
        return this.mParent;
    }

    @Nullable
    public Fragment getPrimaryNavigationFragment() {
        return this.mPrimaryNav;
    }

    @NonNull
    public SpecialEffectsControllerFactory getSpecialEffectsControllerFactory() {
        SpecialEffectsControllerFactory specialEffectsControllerFactory = this.mSpecialEffectsControllerFactory;
        if (specialEffectsControllerFactory != null) {
            return specialEffectsControllerFactory;
        }
        Fragment fragment = this.mParent;
        if (fragment != null) {
            return fragment.mFragmentManager.getSpecialEffectsControllerFactory();
        }
        return this.mDefaultSpecialEffectsControllerFactory;
    }

    @Nullable
    public FragmentStrictMode.Policy getStrictModePolicy() {
        return this.mStrictModePolicy;
    }

    @NonNull
    public ViewModelStore getViewModelStore(@NonNull Fragment fragment) {
        return this.mNonConfig.getViewModelStore(fragment);
    }

    public void handleOnBackPressed() {
        execPendingActions(true);
        if (this.mOnBackPressedCallback.getIsEnabled()) {
            popBackStackImmediate();
        } else {
            this.mOnBackPressedDispatcher.onBackPressed();
        }
    }

    public void hideFragment(@NonNull Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "hide: " + fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            setVisibleRemovingFragment(fragment);
        }
    }

    public void invalidateMenuForFragment(@NonNull Fragment fragment) {
        if (fragment.mAdded && isMenuAvailable(fragment)) {
            this.mNeedMenuInvalidate = true;
        }
    }

    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    public boolean isParentHidden(@Nullable Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    public boolean isParentMenuVisible(@Nullable Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public boolean isPrimaryNavigation(@Nullable Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragment.equals(fragmentManager.getPrimaryNavigationFragment()) && isPrimaryNavigation(fragmentManager.mParent)) {
            return true;
        }
        return false;
    }

    public boolean isStateAtLeast(int i10) {
        if (this.mCurState >= i10) {
            return true;
        }
        return false;
    }

    public boolean isStateSaved() {
        if (!this.mStateSaved && !this.mStopped) {
            return false;
        }
        return true;
    }

    public void launchRequestPermissions(@NonNull Fragment fragment, @NonNull String[] strArr, int i10) {
        if (this.mRequestPermissions != null) {
            this.mLaunchedFragments.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
            this.mRequestPermissions.launch(strArr);
            return;
        }
        this.mHost.onRequestPermissionsFromFragment(fragment, strArr, i10);
    }

    public void launchStartActivityForResult(@NonNull Fragment fragment, @NonNull Intent intent, int i10, @Nullable Bundle bundle) {
        if (this.mStartActivityForResult != null) {
            this.mLaunchedFragments.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
            if (bundle != null) {
                intent.putExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundle);
            }
            this.mStartActivityForResult.launch(intent);
            return;
        }
        this.mHost.onStartActivityFromFragment(fragment, intent, i10, bundle);
    }

    public void launchStartIntentSenderForResult(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i10, @Nullable Intent intent, int i11, int i12, int i13, @Nullable Bundle bundle) {
        if (this.mStartIntentSenderForResult != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent = new Intent();
                    intent.putExtra(EXTRA_CREATED_FILLIN_INTENT, true);
                }
                if (isLoggingEnabled(2)) {
                    Log.v(TAG, "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + fragment);
                }
                intent.putExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundle);
            }
            IntentSenderRequest build = new IntentSenderRequest.Builder(intentSender).setFillInIntent(intent).setFlags(i12, i11).build();
            this.mLaunchedFragments.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
            if (isLoggingEnabled(2)) {
                Log.v(TAG, "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.mStartIntentSenderForResult.launch(build);
            return;
        }
        this.mHost.onStartIntentSenderFromFragment(fragment, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public void moveToState(int i10, boolean z9) {
        FragmentHostCallback<?> fragmentHostCallback;
        if (this.mHost == null && i10 != -1) {
            j1.i.l("No activity");
            return;
        }
        if (z9 || i10 != this.mCurState) {
            this.mCurState = i10;
            this.mFragmentStore.moveToExpectedState();
            startPendingDeferredFragments();
            if (this.mNeedMenuInvalidate && (fragmentHostCallback = this.mHost) != null && this.mCurState == 7) {
                fragmentHostCallback.onSupportInvalidateOptionsMenu();
                this.mNeedMenuInvalidate = false;
            }
        }
    }

    public void noteStateNotSaved() {
        if (this.mHost != null) {
            this.mStateSaved = false;
            this.mStopped = false;
            this.mNonConfig.setIsStateSaved(false);
            for (Fragment fragment : this.mFragmentStore.getFragments()) {
                if (fragment != null) {
                    fragment.noteStateNotSaved();
                }
            }
        }
    }

    public void onContainerAvailable(@NonNull FragmentContainerView fragmentContainerView) {
        View view;
        for (FragmentStateManager fragmentStateManager : this.mFragmentStore.getActiveFragmentStateManagers()) {
            Fragment fragment = fragmentStateManager.getFragment();
            if (fragment.mContainerId == fragmentContainerView.getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = fragmentContainerView;
                fragmentStateManager.addViewToContainer();
            }
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public FragmentTransaction openTransaction() {
        return beginTransaction();
    }

    public void performPendingDeferredStart(@NonNull FragmentStateManager fragmentStateManager) {
        Fragment fragment = fragmentStateManager.getFragment();
        if (fragment.mDeferStart) {
            if (this.mExecutingActions) {
                this.mHavePendingDeferredStart = true;
            } else {
                fragment.mDeferStart = false;
                fragmentStateManager.moveToExpectedState();
            }
        }
    }

    public void popBackStack(int i10, int i11, boolean z9) {
        if (i10 >= 0) {
            enqueueAction(new PopBackStackState(null, i10, i11), z9);
        } else {
            j1.i.k(ai.onnxruntime.a.e(i10, "Bad id: "));
        }
    }

    public boolean popBackStackState(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2, @Nullable String str, int i10, int i11) {
        boolean z9;
        if ((i11 & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        int findBackStackIndex = findBackStackIndex(str, i10, z9);
        if (findBackStackIndex < 0) {
            return false;
        }
        for (int size = this.mBackStack.size() - 1; size >= findBackStackIndex; size--) {
            arrayList.add(this.mBackStack.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public void putFragment(@NonNull Bundle bundle, @NonNull String str, @NonNull Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            throwException(new IllegalStateException(ai.onnxruntime.a.k("Fragment ", fragment, " is not currently in the FragmentManager")));
        }
        bundle.putString(str, fragment.mWho);
    }

    public void registerFragmentLifecycleCallbacks(@NonNull FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z9) {
        this.mLifecycleCallbacksDispatcher.registerFragmentLifecycleCallbacks(fragmentLifecycleCallbacks, z9);
    }

    public void removeFragment(@NonNull Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean isInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && isInBackStack) {
            return;
        }
        this.mFragmentStore.removeFragment(fragment);
        if (isMenuAvailable(fragment)) {
            this.mNeedMenuInvalidate = true;
        }
        fragment.mRemoving = true;
        setVisibleRemovingFragment(fragment);
    }

    public void removeFragmentOnAttachListener(@NonNull FragmentOnAttachListener fragmentOnAttachListener) {
        this.mOnAttachListeners.remove(fragmentOnAttachListener);
    }

    public void removeOnBackStackChangedListener(@NonNull OnBackStackChangedListener onBackStackChangedListener) {
        ArrayList<OnBackStackChangedListener> arrayList = this.mBackStackChangeListeners;
        if (arrayList != null) {
            arrayList.remove(onBackStackChangedListener);
        }
    }

    public void removeRetainedFragment(@NonNull Fragment fragment) {
        this.mNonConfig.removeRetainedFragment(fragment);
    }

    public void restoreAllState(@Nullable Parcelable parcelable, @Nullable FragmentManagerNonConfig fragmentManagerNonConfig) {
        if (this.mHost instanceof ViewModelStoreOwner) {
            throwException(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.mNonConfig.restoreFromSnapshot(fragmentManagerNonConfig);
        restoreSaveStateInternal(parcelable);
    }

    public void restoreBackStack(@NonNull String str) {
        enqueueAction(new RestoreBackStackState(str), false);
    }

    public boolean restoreBackStackState(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2, @NonNull String str) {
        BackStackState remove = this.mBackStackStates.remove(str);
        if (remove == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            BackStackRecord backStackRecord = arrayList.get(i10);
            i10++;
            BackStackRecord backStackRecord2 = backStackRecord;
            if (backStackRecord2.mBeingSaved) {
                ArrayList<FragmentTransaction.Op> arrayList3 = backStackRecord2.mOps;
                int size2 = arrayList3.size();
                int i11 = 0;
                while (i11 < size2) {
                    FragmentTransaction.Op op = arrayList3.get(i11);
                    i11++;
                    Fragment fragment = op.mFragment;
                    if (fragment != null) {
                        hashMap.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        Iterator<BackStackRecord> it = remove.instantiate(this, hashMap).iterator();
        while (true) {
            boolean z9 = false;
            while (it.hasNext()) {
                if (it.next().generateOps(arrayList, arrayList2) || z9) {
                    z9 = true;
                }
            }
            return z9;
        }
    }

    public void restoreSaveState(@Nullable Parcelable parcelable) {
        if (this.mHost instanceof SavedStateRegistryOwner) {
            throwException(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        restoreSaveStateInternal(parcelable);
    }

    public void restoreSaveStateInternal(@Nullable Parcelable parcelable) {
        FragmentStateManager fragmentStateManager;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable != null) {
            Bundle bundle3 = (Bundle) parcelable;
            for (String str : bundle3.keySet()) {
                if (str.startsWith(RESULT_KEY_PREFIX) && (bundle2 = bundle3.getBundle(str)) != null) {
                    bundle2.setClassLoader(this.mHost.getContext().getClassLoader());
                    this.mResults.put(str.substring(7), bundle2);
                }
            }
            HashMap<String, Bundle> hashMap = new HashMap<>();
            for (String str2 : bundle3.keySet()) {
                if (str2.startsWith(FRAGMENT_KEY_PREFIX) && (bundle = bundle3.getBundle(str2)) != null) {
                    bundle.setClassLoader(this.mHost.getContext().getClassLoader());
                    hashMap.put(str2.substring(9), bundle);
                }
            }
            this.mFragmentStore.restoreSaveState(hashMap);
            FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable(FRAGMENT_MANAGER_STATE_KEY);
            if (fragmentManagerState == null) {
                return;
            }
            this.mFragmentStore.resetActiveFragments();
            ArrayList<String> arrayList = fragmentManagerState.mActive;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                String str3 = arrayList.get(i10);
                i10++;
                Bundle savedState = this.mFragmentStore.setSavedState(str3, null);
                if (savedState != null) {
                    Fragment findRetainedFragmentByWho = this.mNonConfig.findRetainedFragmentByWho(((FragmentState) savedState.getParcelable(FRAGMENT_MANAGER_STATE_KEY)).mWho);
                    if (findRetainedFragmentByWho != null) {
                        if (isLoggingEnabled(2)) {
                            Log.v(TAG, "restoreSaveState: re-attaching retained " + findRetainedFragmentByWho);
                        }
                        fragmentStateManager = new FragmentStateManager(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, findRetainedFragmentByWho, savedState);
                    } else {
                        fragmentStateManager = new FragmentStateManager(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, this.mHost.getContext().getClassLoader(), getFragmentFactory(), savedState);
                    }
                    Fragment fragment = fragmentStateManager.getFragment();
                    fragment.mSavedFragmentState = savedState;
                    fragment.mFragmentManager = this;
                    if (isLoggingEnabled(2)) {
                        Log.v(TAG, "restoreSaveState: active (" + fragment.mWho + "): " + fragment);
                    }
                    fragmentStateManager.restoreState(this.mHost.getContext().getClassLoader());
                    this.mFragmentStore.makeActive(fragmentStateManager);
                    fragmentStateManager.setFragmentManagerState(this.mCurState);
                }
            }
            for (Fragment fragment2 : this.mNonConfig.getRetainedFragments()) {
                if (!this.mFragmentStore.containsActiveFragment(fragment2.mWho)) {
                    if (isLoggingEnabled(2)) {
                        Log.v(TAG, "Discarding retained Fragment " + fragment2 + " that was not found in the set of active Fragments " + fragmentManagerState.mActive);
                    }
                    this.mNonConfig.removeRetainedFragment(fragment2);
                    fragment2.mFragmentManager = this;
                    FragmentStateManager fragmentStateManager2 = new FragmentStateManager(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment2);
                    fragmentStateManager2.setFragmentManagerState(1);
                    fragmentStateManager2.moveToExpectedState();
                    fragment2.mRemoving = true;
                    fragmentStateManager2.moveToExpectedState();
                }
            }
            this.mFragmentStore.restoreAddedFragments(fragmentManagerState.mAdded);
            if (fragmentManagerState.mBackStack != null) {
                this.mBackStack = new ArrayList<>(fragmentManagerState.mBackStack.length);
                int i11 = 0;
                while (true) {
                    BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.mBackStack;
                    if (i11 >= backStackRecordStateArr.length) {
                        break;
                    }
                    BackStackRecord instantiate = backStackRecordStateArr[i11].instantiate(this);
                    if (isLoggingEnabled(2)) {
                        StringBuilder q8 = ai.onnxruntime.a.q(i11, "restoreAllState: back stack #", " (index ");
                        q8.append(instantiate.mIndex);
                        q8.append("): ");
                        q8.append(instantiate);
                        Log.v(TAG, q8.toString());
                        PrintWriter printWriter = new PrintWriter(new LogWriter(TAG));
                        instantiate.dump("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.mBackStack.add(instantiate);
                    i11++;
                }
            } else {
                this.mBackStack = null;
            }
            this.mBackStackIndex.set(fragmentManagerState.mBackStackIndex);
            String str4 = fragmentManagerState.mPrimaryNavActiveWho;
            if (str4 != null) {
                Fragment findActiveFragment = findActiveFragment(str4);
                this.mPrimaryNav = findActiveFragment;
                dispatchParentPrimaryNavigationFragmentChanged(findActiveFragment);
            }
            ArrayList<String> arrayList2 = fragmentManagerState.mBackStackStateKeys;
            if (arrayList2 != null) {
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    this.mBackStackStates.put(arrayList2.get(i12), fragmentManagerState.mBackStackStates.get(i12));
                }
            }
            this.mLaunchedFragments = new ArrayDeque<>(fragmentManagerState.mLaunchedFragments);
        }
    }

    @Deprecated
    public FragmentManagerNonConfig retainNonConfig() {
        if (this.mHost instanceof ViewModelStoreOwner) {
            throwException(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.mNonConfig.getSnapshot();
    }

    public Parcelable saveAllState() {
        if (this.mHost instanceof SavedStateRegistryOwner) {
            throwException(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        Bundle lambda$attachController$4 = lambda$attachController$4();
        if (lambda$attachController$4.isEmpty()) {
            return null;
        }
        return lambda$attachController$4;
    }

    @NonNull
    /* renamed from: saveAllStateInternal */
    public Bundle lambda$attachController$4() {
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle = new Bundle();
        forcePostponedTransactions();
        endAnimatingAwayFragments();
        execPendingActions(true);
        this.mStateSaved = true;
        this.mNonConfig.setIsStateSaved(true);
        ArrayList<String> saveActiveFragments = this.mFragmentStore.saveActiveFragments();
        HashMap<String, Bundle> allSavedState = this.mFragmentStore.getAllSavedState();
        if (allSavedState.isEmpty()) {
            if (isLoggingEnabled(2)) {
                Log.v(TAG, "saveAllState: no fragments!");
                return bundle;
            }
        } else {
            ArrayList<String> saveAddedFragments = this.mFragmentStore.saveAddedFragments();
            ArrayList<BackStackRecord> arrayList = this.mBackStack;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i10 = 0; i10 < size; i10++) {
                    backStackRecordStateArr[i10] = new BackStackRecordState(this.mBackStack.get(i10));
                    if (isLoggingEnabled(2)) {
                        StringBuilder q8 = ai.onnxruntime.a.q(i10, "saveAllState: adding back stack #", ": ");
                        q8.append(this.mBackStack.get(i10));
                        Log.v(TAG, q8.toString());
                    }
                }
            } else {
                backStackRecordStateArr = null;
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.mActive = saveActiveFragments;
            fragmentManagerState.mAdded = saveAddedFragments;
            fragmentManagerState.mBackStack = backStackRecordStateArr;
            fragmentManagerState.mBackStackIndex = this.mBackStackIndex.get();
            Fragment fragment = this.mPrimaryNav;
            if (fragment != null) {
                fragmentManagerState.mPrimaryNavActiveWho = fragment.mWho;
            }
            fragmentManagerState.mBackStackStateKeys.addAll(this.mBackStackStates.keySet());
            fragmentManagerState.mBackStackStates.addAll(this.mBackStackStates.values());
            fragmentManagerState.mLaunchedFragments = new ArrayList<>(this.mLaunchedFragments);
            bundle.putParcelable(FRAGMENT_MANAGER_STATE_KEY, fragmentManagerState);
            for (String str : this.mResults.keySet()) {
                bundle.putBundle(ai.onnxruntime.a.l(RESULT_KEY_PREFIX, str), this.mResults.get(str));
            }
            for (String str2 : allSavedState.keySet()) {
                bundle.putBundle(ai.onnxruntime.a.l(FRAGMENT_KEY_PREFIX, str2), allSavedState.get(str2));
            }
        }
        return bundle;
    }

    public void saveBackStack(@NonNull String str) {
        enqueueAction(new SaveBackStackState(str), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r4 != 8) goto L122;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean saveBackStackState(@androidx.annotation.NonNull java.util.ArrayList<androidx.fragment.app.BackStackRecord> r19, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r20, @androidx.annotation.NonNull java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.saveBackStackState(java.util.ArrayList, java.util.ArrayList, java.lang.String):boolean");
    }

    @Nullable
    public Fragment.SavedState saveFragmentInstanceState(@NonNull Fragment fragment) {
        FragmentStateManager fragmentStateManager = this.mFragmentStore.getFragmentStateManager(fragment.mWho);
        if (fragmentStateManager == null || !fragmentStateManager.getFragment().equals(fragment)) {
            throwException(new IllegalStateException(ai.onnxruntime.a.k("Fragment ", fragment, " is not currently in the FragmentManager")));
        }
        return fragmentStateManager.saveInstanceState();
    }

    public void scheduleCommit() {
        synchronized (this.mPendingActions) {
            try {
                if (this.mPendingActions.size() == 1) {
                    this.mHost.getHandler().removeCallbacks(this.mExecCommit);
                    this.mHost.getHandler().post(this.mExecCommit);
                    updateOnBackPressedCallbackEnabled();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setExitAnimationOrder(@NonNull Fragment fragment, boolean z9) {
        ViewGroup fragmentContainer = getFragmentContainer(fragment);
        if (fragmentContainer != null && (fragmentContainer instanceof FragmentContainerView)) {
            ((FragmentContainerView) fragmentContainer).setDrawDisappearingViewsLast(!z9);
        }
    }

    public void setFragmentFactory(@NonNull FragmentFactory fragmentFactory) {
        this.mFragmentFactory = fragmentFactory;
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResult(@NonNull String str, @NonNull Bundle bundle) {
        LifecycleAwareResultListener lifecycleAwareResultListener = this.mResultListeners.get(str);
        if (lifecycleAwareResultListener != null && lifecycleAwareResultListener.isAtLeast(Lifecycle.State.STARTED)) {
            lifecycleAwareResultListener.onFragmentResult(str, bundle);
        } else {
            this.mResults.put(str, bundle);
        }
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResultListener(@NonNull String str, @NonNull LifecycleOwner lifecycleOwner, @NonNull FragmentResultListener fragmentResultListener) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            return;
        }
        AnonymousClass6 anonymousClass6 = new LifecycleEventObserver() { // from class: androidx.fragment.app.FragmentManager.6
            final /* synthetic */ Lifecycle val$lifecycle;
            final /* synthetic */ FragmentResultListener val$listener;
            final /* synthetic */ String val$requestKey;

            public AnonymousClass6(String str2, FragmentResultListener fragmentResultListener2, Lifecycle lifecycle2) {
                r2 = str2;
                r3 = fragmentResultListener2;
                r4 = lifecycle2;
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner2, @NonNull Lifecycle.Event event) {
                Bundle bundle;
                if (event == Lifecycle.Event.ON_START && (bundle = (Bundle) FragmentManager.this.mResults.get(r2)) != null) {
                    r3.onFragmentResult(r2, bundle);
                    FragmentManager.this.clearFragmentResult(r2);
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    r4.removeObserver(this);
                    FragmentManager.this.mResultListeners.remove(r2);
                }
            }
        };
        LifecycleAwareResultListener put = this.mResultListeners.put(str2, new LifecycleAwareResultListener(lifecycle2, fragmentResultListener2, anonymousClass6));
        if (put != null) {
            put.removeObserver();
        }
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "Setting FragmentResultListener with key " + str2 + " lifecycleOwner " + lifecycle2 + " and listener " + fragmentResultListener2);
        }
        lifecycle2.addObserver(anonymousClass6);
    }

    public void setMaxLifecycle(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        if (fragment.equals(findActiveFragment(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
        } else {
            androidx.navigation.b.v("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
        }
    }

    public void setPrimaryNavigationFragment(@Nullable Fragment fragment) {
        if (fragment != null && (!fragment.equals(findActiveFragment(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            androidx.navigation.b.v("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
            return;
        }
        Fragment fragment2 = this.mPrimaryNav;
        this.mPrimaryNav = fragment;
        dispatchParentPrimaryNavigationFragmentChanged(fragment2);
        dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
    }

    public void setSpecialEffectsControllerFactory(@NonNull SpecialEffectsControllerFactory specialEffectsControllerFactory) {
        this.mSpecialEffectsControllerFactory = specialEffectsControllerFactory;
    }

    public void setStrictModePolicy(@Nullable FragmentStrictMode.Policy policy) {
        this.mStrictModePolicy = policy;
    }

    public void showFragment(@NonNull Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.mParent;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.mParent)));
            sb.append("}");
        } else {
            FragmentHostCallback<?> fragmentHostCallback = this.mHost;
            if (fragmentHostCallback != null) {
                sb.append(fragmentHostCallback.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.mHost)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public void unregisterFragmentLifecycleCallbacks(@NonNull FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        this.mLifecycleCallbacksDispatcher.unregisterFragmentLifecycleCallbacks(fragmentLifecycleCallbacks);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new Parcelable.Creator<LaunchedFragmentInfo>() { // from class: androidx.fragment.app.FragmentManager.LaunchedFragmentInfo.1
            @Override // android.os.Parcelable.Creator
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public LaunchedFragmentInfo[] newArray(int i10) {
                return new LaunchedFragmentInfo[i10];
            }
        };
        int mRequestCode;
        String mWho;

        public LaunchedFragmentInfo(@NonNull Parcel parcel) {
            this.mWho = parcel.readString();
            this.mRequestCode = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.mWho);
            parcel.writeInt(this.mRequestCode);
        }

        /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
        /* renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$1 */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public LaunchedFragmentInfo[] newArray(int i10) {
                return new LaunchedFragmentInfo[i10];
            }
        }

        public LaunchedFragmentInfo(@NonNull String str, int i10) {
            this.mWho = str;
            this.mRequestCode = i10;
        }
    }

    public void popBackStack(@Nullable String str, int i10) {
        enqueueAction(new PopBackStackState(str, -1, i10), false);
    }

    public void popBackStack(int i10, int i11) {
        popBackStack(i10, i11, false);
    }

    public void popBackStack() {
        enqueueAction(new PopBackStackState(null, -1, 0), false);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static abstract class FragmentLifecycleCallbacks {
        public void onFragmentDestroyed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentDetached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentPaused(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentResumed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentStarted(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentStopped(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentViewDestroyed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        @Deprecated
        public void onFragmentActivityCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void onFragmentAttached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void onFragmentCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void onFragmentPreAttached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void onFragmentPreCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void onFragmentSaveInstanceState(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Bundle bundle) {
        }

        public void onFragmentViewCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle) {
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public interface OnBackStackChangedListener {
        @MainThread
        void onBackStackChanged();

        @MainThread
        default void onBackStackChangeCommitted(@NonNull Fragment fragment, boolean z9) {
        }

        @MainThread
        default void onBackStackChangeStarted(@NonNull Fragment fragment, boolean z9) {
        }
    }

    @MainThread
    public boolean popBackStackImmediate(@Nullable String str, int i10) {
        return popBackStackImmediate(str, -1, i10);
    }

    public boolean popBackStackImmediate(int i10, int i11) {
        if (i10 >= 0) {
            return popBackStackImmediate(null, i10, i11);
        }
        j1.i.k(ai.onnxruntime.a.e(i10, "Bad id: "));
        return false;
    }

    @MainThread
    public boolean popBackStackImmediate() {
        return popBackStackImmediate(null, -1, 0);
    }
}
