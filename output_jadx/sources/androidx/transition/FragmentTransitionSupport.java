package androidx.transition;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransitionImpl;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class FragmentTransitionSupport extends FragmentTransitionImpl {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: androidx.transition.FragmentTransitionSupport$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends Transition.EpicenterCallback {
        final /* synthetic */ Rect val$epicenter;

        public AnonymousClass1(Rect rect) {
            r2 = rect;
        }

        @Override // androidx.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(@NonNull Transition transition) {
            return r2;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: androidx.transition.FragmentTransitionSupport$3 */
    /* loaded from: classes.dex */
    public class AnonymousClass3 extends TransitionListenerAdapter {
        final /* synthetic */ Object val$enterTransition;
        final /* synthetic */ ArrayList val$enteringViews;
        final /* synthetic */ Object val$exitTransition;
        final /* synthetic */ ArrayList val$exitingViews;
        final /* synthetic */ Object val$sharedElementTransition;
        final /* synthetic */ ArrayList val$sharedElementsIn;

        public AnonymousClass3(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            r2 = obj;
            r3 = arrayList;
            r4 = obj2;
            r5 = arrayList2;
            r6 = obj3;
            r7 = arrayList3;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
            transition.removeListener(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@NonNull Transition transition) {
            Object obj = r2;
            if (obj != null) {
                FragmentTransitionSupport.this.replaceTargets(obj, r3, null);
            }
            Object obj2 = r4;
            if (obj2 != null) {
                FragmentTransitionSupport.this.replaceTargets(obj2, r5, null);
            }
            Object obj3 = r6;
            if (obj3 != null) {
                FragmentTransitionSupport.this.replaceTargets(obj3, r7, null);
            }
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: androidx.transition.FragmentTransitionSupport$5 */
    /* loaded from: classes.dex */
    public class AnonymousClass5 extends Transition.EpicenterCallback {
        final /* synthetic */ Rect val$epicenter;

        public AnonymousClass5(Rect rect) {
            r2 = rect;
        }

        @Override // androidx.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(@NonNull Transition transition) {
            Rect rect = r2;
            if (rect != null && !rect.isEmpty()) {
                return r2;
            }
            return null;
        }
    }

    public static /* synthetic */ void a(Runnable runnable, Transition transition, Runnable runnable2) {
        lambda$setListenerForTransitionEnd$0(runnable, transition, runnable2);
    }

    private static boolean hasSimpleTarget(Transition transition) {
        if (FragmentTransitionImpl.isNullOrEmpty(transition.getTargetIds()) && FragmentTransitionImpl.isNullOrEmpty(transition.getTargetNames()) && FragmentTransitionImpl.isNullOrEmpty(transition.getTargetTypes())) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void lambda$setListenerForTransitionEnd$0(Runnable runnable, Transition transition, Runnable runnable2) {
        if (runnable == null) {
            transition.cancel();
            runnable2.run();
        } else {
            runnable.run();
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void addTarget(@NonNull Object obj, @NonNull View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void addTargets(@NonNull Object obj, @NonNull ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i10 = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i10 < transitionCount) {
                    addTargets(transitionSet.getTransitionAt(i10), arrayList);
                    i10++;
                }
                return;
            }
            if (!hasSimpleTarget(transition) && FragmentTransitionImpl.isNullOrEmpty(transition.getTargets())) {
                int size = arrayList.size();
                while (i10 < size) {
                    transition.addTarget(arrayList.get(i10));
                    i10++;
                }
            }
        }
    }

    public void animateToEnd(@NonNull Object obj) {
        ((TransitionSeekController) obj).animateToEnd();
    }

    public void animateToStart(@NonNull Object obj, @NonNull Runnable runnable) {
        ((TransitionSeekController) obj).animateToStart(runnable);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void beginDelayedTransition(@NonNull ViewGroup viewGroup, @Nullable Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public boolean canHandle(@NonNull Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    @Nullable
    public Object cloneTransition(@Nullable Object obj) {
        if (obj != null) {
            return ((Transition) obj).mo82clone();
        }
        return null;
    }

    @Nullable
    public Object controlDelayedTransition(@NonNull ViewGroup viewGroup, @NonNull Object obj) {
        return TransitionManager.controlDelayedTransition(viewGroup, (Transition) obj);
    }

    public boolean isSeekingSupported(@NonNull Object obj) {
        boolean isSeekingSupported = ((Transition) obj).isSeekingSupported();
        if (!isSeekingSupported) {
            Log.v(FragmentManager.TAG, "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return isSeekingSupported;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    @Nullable
    public Object mergeTransitionsInSequence(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    @NonNull
    public Object mergeTransitionsTogether(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void removeTarget(@NonNull Object obj, @NonNull View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void replaceTargets(@NonNull Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int size;
        Transition transition = (Transition) obj;
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                replaceTargets(transitionSet.getTransitionAt(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (!hasSimpleTarget(transition)) {
            List<View> targets = transition.getTargets();
            if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i10 < size) {
                    transition.addTarget(arrayList2.get(i10));
                    i10++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    transition.removeTarget(arrayList.get(size2));
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void scheduleHideFragmentView(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: androidx.transition.FragmentTransitionSupport.2
            final /* synthetic */ ArrayList val$exitingViews;
            final /* synthetic */ View val$fragmentView;

            public AnonymousClass2(View view2, ArrayList arrayList2) {
                r2 = view2;
                r3 = arrayList2;
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(@NonNull Transition transition) {
                transition.removeListener(this);
                r2.setVisibility(8);
                int size = r3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((View) r3.get(i10)).setVisibility(0);
                }
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionStart(@NonNull Transition transition) {
                transition.removeListener(this);
                transition.addListener(this);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionCancel(@NonNull Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionPause(@NonNull Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionResume(@NonNull Transition transition) {
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void scheduleRemoveTargets(@NonNull Object obj, @Nullable Object obj2, @Nullable ArrayList<View> arrayList, @Nullable Object obj3, @Nullable ArrayList<View> arrayList2, @Nullable Object obj4, @Nullable ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new TransitionListenerAdapter() { // from class: androidx.transition.FragmentTransitionSupport.3
            final /* synthetic */ Object val$enterTransition;
            final /* synthetic */ ArrayList val$enteringViews;
            final /* synthetic */ Object val$exitTransition;
            final /* synthetic */ ArrayList val$exitingViews;
            final /* synthetic */ Object val$sharedElementTransition;
            final /* synthetic */ ArrayList val$sharedElementsIn;

            public AnonymousClass3(Object obj22, ArrayList arrayList4, Object obj32, ArrayList arrayList22, Object obj42, ArrayList arrayList32) {
                r2 = obj22;
                r3 = arrayList4;
                r4 = obj32;
                r5 = arrayList22;
                r6 = obj42;
                r7 = arrayList32;
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(@NonNull Transition transition) {
                transition.removeListener(this);
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionStart(@NonNull Transition transition) {
                Object obj5 = r2;
                if (obj5 != null) {
                    FragmentTransitionSupport.this.replaceTargets(obj5, r3, null);
                }
                Object obj22 = r4;
                if (obj22 != null) {
                    FragmentTransitionSupport.this.replaceTargets(obj22, r5, null);
                }
                Object obj32 = r6;
                if (obj32 != null) {
                    FragmentTransitionSupport.this.replaceTargets(obj32, r7, null);
                }
            }
        });
    }

    public void setCurrentPlayTime(@NonNull Object obj, float f8) {
        TransitionSeekController transitionSeekController = (TransitionSeekController) obj;
        if (transitionSeekController.isReady()) {
            long durationMillis = f8 * ((float) transitionSeekController.getDurationMillis());
            if (durationMillis == 0) {
                durationMillis = 1;
            }
            if (durationMillis == transitionSeekController.getDurationMillis()) {
                durationMillis = transitionSeekController.getDurationMillis() - 1;
            }
            transitionSeekController.setCurrentPlayTimeMillis(durationMillis);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setEpicenter(@NonNull Object obj, @Nullable View view) {
        if (view != null) {
            Rect rect = new Rect();
            getBoundsOnScreen(view, rect);
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: androidx.transition.FragmentTransitionSupport.1
                final /* synthetic */ Rect val$epicenter;

                public AnonymousClass1(Rect rect2) {
                    r2 = rect2;
                }

                @Override // androidx.transition.Transition.EpicenterCallback
                public Rect onGetEpicenter(@NonNull Transition transition) {
                    return r2;
                }
            });
        }
    }

    public void setListenerForTransitionEnd(@NonNull Fragment fragment, @NonNull Object obj, @NonNull CancellationSignal cancellationSignal, @Nullable Runnable runnable, @NonNull Runnable runnable2) {
        Transition transition = (Transition) obj;
        cancellationSignal.setOnCancelListener(new a(runnable, transition, runnable2));
        transition.addListener(new Transition.TransitionListener() { // from class: androidx.transition.FragmentTransitionSupport.4
            final /* synthetic */ Runnable val$transitionCompleteRunnable;

            public AnonymousClass4(Runnable runnable22) {
                r2 = runnable22;
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(@NonNull Transition transition2) {
                r2.run();
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionCancel(@NonNull Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionPause(@NonNull Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionResume(@NonNull Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionStart(@NonNull Transition transition2) {
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setSharedElementTargets(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            FragmentTransitionImpl.bfsAddViewChildren(targets, arrayList.get(i10));
        }
        targets.add(view);
        arrayList.add(view);
        addTargets(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void swapSharedElementTargets(@Nullable Object obj, @Nullable ArrayList<View> arrayList, @Nullable ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            replaceTargets(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    @Nullable
    public Object wrapTransitionInSet(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setListenerForTransitionEnd(@NonNull Fragment fragment, @NonNull Object obj, @NonNull CancellationSignal cancellationSignal, @NonNull Runnable runnable) {
        setListenerForTransitionEnd(fragment, obj, cancellationSignal, null, runnable);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: androidx.transition.FragmentTransitionSupport$2 */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Transition.TransitionListener {
        final /* synthetic */ ArrayList val$exitingViews;
        final /* synthetic */ View val$fragmentView;

        public AnonymousClass2(View view2, ArrayList arrayList2) {
            r2 = view2;
            r3 = arrayList2;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
            transition.removeListener(this);
            r2.setVisibility(8);
            int size = r3.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) r3.get(i10)).setVisibility(0);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@NonNull Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@NonNull Transition transition) {
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: androidx.transition.FragmentTransitionSupport$4 */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements Transition.TransitionListener {
        final /* synthetic */ Runnable val$transitionCompleteRunnable;

        public AnonymousClass4(Runnable runnable22) {
            r2 = runnable22;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition2) {
            r2.run();
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(@NonNull Transition transition2) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@NonNull Transition transition2) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@NonNull Transition transition2) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@NonNull Transition transition2) {
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setEpicenter(@NonNull Object obj, @NonNull Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: androidx.transition.FragmentTransitionSupport.5
                final /* synthetic */ Rect val$epicenter;

                public AnonymousClass5(Rect rect2) {
                    r2 = rect2;
                }

                @Override // androidx.transition.Transition.EpicenterCallback
                public Rect onGetEpicenter(@NonNull Transition transition) {
                    Rect rect2 = r2;
                    if (rect2 != null && !rect2.isEmpty()) {
                        return r2;
                    }
                    return null;
                }
            });
        }
    }

    public boolean isSeekingSupported() {
        return true;
    }
}
