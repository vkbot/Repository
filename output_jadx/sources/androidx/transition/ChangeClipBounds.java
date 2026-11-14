package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.Transition;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class ChangeClipBounds extends Transition {
    private static final String PROPNAME_BOUNDS = "android:clipBounds:bounds";
    private static final String PROPNAME_CLIP = "android:clipBounds:clip";
    private static final String[] sTransitionProperties = {PROPNAME_CLIP};
    static final Rect NULL_SENTINEL = new Rect();

    public ChangeClipBounds() {
    }

    private void captureValues(TransitionValues transitionValues, boolean z9) {
        Rect rect;
        View view = transitionValues.view;
        if (view.getVisibility() != 8) {
            Rect rect2 = null;
            if (z9) {
                rect = (Rect) view.getTag(R.id.transition_clip);
            } else {
                rect = null;
            }
            if (rect == null) {
                rect = view.getClipBounds();
            }
            if (rect != NULL_SENTINEL) {
                rect2 = rect;
            }
            transitionValues.values.put(PROPNAME_CLIP, rect2);
            if (rect2 == null) {
                transitionValues.values.put(PROPNAME_BOUNDS, new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        captureValues(transitionValues, false);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        captureValues(transitionValues, true);
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        Rect rect;
        Rect rect2;
        if (transitionValues == null || transitionValues2 == null || !transitionValues.values.containsKey(PROPNAME_CLIP) || !transitionValues2.values.containsKey(PROPNAME_CLIP)) {
            return null;
        }
        Rect rect3 = (Rect) transitionValues.values.get(PROPNAME_CLIP);
        Rect rect4 = (Rect) transitionValues2.values.get(PROPNAME_CLIP);
        if (rect3 == null && rect4 == null) {
            return null;
        }
        if (rect3 == null) {
            rect = (Rect) transitionValues.values.get(PROPNAME_BOUNDS);
        } else {
            rect = rect3;
        }
        if (rect4 == null) {
            rect2 = (Rect) transitionValues2.values.get(PROPNAME_BOUNDS);
        } else {
            rect2 = rect4;
        }
        if (rect.equals(rect2)) {
            return null;
        }
        transitionValues2.view.setClipBounds(rect3);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(transitionValues2.view, (Property<View, V>) ViewUtils.CLIP_BOUNDS, (TypeEvaluator) new RectEvaluator(new Rect()), (Object[]) new Rect[]{rect, rect2});
        Listener listener = new Listener(transitionValues2.view, rect3, rect4);
        ofObject.addListener(listener);
        addListener(listener);
        return ofObject;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    public ChangeClipBounds(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class Listener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private final Rect mEnd;
        private final Rect mStart;
        private final View mView;

        public Listener(View view, Rect rect, Rect rect2) {
            this.mView = view;
            this.mStart = rect;
            this.mEnd = rect2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z9) {
            View view = this.mView;
            if (!z9) {
                view.setClipBounds(this.mEnd);
            } else {
                view.setClipBounds(this.mStart);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@NonNull Transition transition) {
            Rect clipBounds = this.mView.getClipBounds();
            if (clipBounds == null) {
                clipBounds = ChangeClipBounds.NULL_SENTINEL;
            }
            this.mView.setTag(R.id.transition_clip, clipBounds);
            this.mView.setClipBounds(this.mEnd);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@NonNull Transition transition) {
            this.mView.setClipBounds((Rect) this.mView.getTag(R.id.transition_clip));
            this.mView.setTag(R.id.transition_clip, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@NonNull Transition transition) {
        }
    }
}
