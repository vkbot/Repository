package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.transition.Transition;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class ChangeBounds extends Transition {
    private static final Property<View, PointF> BOTTOM_RIGHT_ONLY_PROPERTY;
    private static final Property<ViewBounds, PointF> BOTTOM_RIGHT_PROPERTY;
    private static final Property<View, PointF> POSITION_PROPERTY;
    private static final Property<View, PointF> TOP_LEFT_ONLY_PROPERTY;
    private static final Property<ViewBounds, PointF> TOP_LEFT_PROPERTY;
    private boolean mResizeClip;
    private static final String PROPNAME_BOUNDS = "android:changeBounds:bounds";
    private static final String PROPNAME_CLIP = "android:changeBounds:clip";
    private static final String PROPNAME_PARENT = "android:changeBounds:parent";
    private static final String PROPNAME_WINDOW_X = "android:changeBounds:windowX";
    private static final String PROPNAME_WINDOW_Y = "android:changeBounds:windowY";
    private static final String[] sTransitionProperties = {PROPNAME_BOUNDS, PROPNAME_CLIP, PROPNAME_PARENT, PROPNAME_WINDOW_X, PROPNAME_WINDOW_Y};
    private static final RectEvaluator sRectEvaluator = new RectEvaluator();

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class SuppressLayoutListener extends TransitionListenerAdapter {
        boolean mCanceled = false;
        final ViewGroup mParent;

        public SuppressLayoutListener(@NonNull ViewGroup viewGroup) {
            this.mParent = viewGroup;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(@NonNull Transition transition) {
            ViewGroupUtils.suppressLayout(this.mParent, false);
            this.mCanceled = true;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
            if (!this.mCanceled) {
                ViewGroupUtils.suppressLayout(this.mParent, false);
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@NonNull Transition transition) {
            ViewGroupUtils.suppressLayout(this.mParent, false);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@NonNull Transition transition) {
            ViewGroupUtils.suppressLayout(this.mParent, true);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class ViewBounds {
        private int mBottom;
        private int mBottomRightCalls;
        private int mLeft;
        private int mRight;
        private int mTop;
        private int mTopLeftCalls;
        private final View mView;

        public ViewBounds(View view) {
            this.mView = view;
        }

        private void setLeftTopRightBottom() {
            ViewUtils.setLeftTopRightBottom(this.mView, this.mLeft, this.mTop, this.mRight, this.mBottom);
            this.mTopLeftCalls = 0;
            this.mBottomRightCalls = 0;
        }

        public void setBottomRight(PointF pointF) {
            this.mRight = Math.round(pointF.x);
            this.mBottom = Math.round(pointF.y);
            int i10 = this.mBottomRightCalls + 1;
            this.mBottomRightCalls = i10;
            if (this.mTopLeftCalls == i10) {
                setLeftTopRightBottom();
            }
        }

        public void setTopLeft(PointF pointF) {
            this.mLeft = Math.round(pointF.x);
            this.mTop = Math.round(pointF.y);
            int i10 = this.mTopLeftCalls + 1;
            this.mTopLeftCalls = i10;
            if (i10 == this.mBottomRightCalls) {
                setLeftTopRightBottom();
            }
        }
    }

    static {
        Class<PointF> cls = PointF.class;
        String str = "topLeft";
        TOP_LEFT_PROPERTY = new Property<ViewBounds, PointF>(cls, str) { // from class: androidx.transition.ChangeBounds.1
            @Override // android.util.Property
            public PointF get(ViewBounds viewBounds) {
                return null;
            }

            @Override // android.util.Property
            public void set(ViewBounds viewBounds, PointF pointF) {
                viewBounds.setTopLeft(pointF);
            }
        };
        String str2 = "bottomRight";
        BOTTOM_RIGHT_PROPERTY = new Property<ViewBounds, PointF>(cls, str2) { // from class: androidx.transition.ChangeBounds.2
            @Override // android.util.Property
            public PointF get(ViewBounds viewBounds) {
                return null;
            }

            @Override // android.util.Property
            public void set(ViewBounds viewBounds, PointF pointF) {
                viewBounds.setBottomRight(pointF);
            }
        };
        BOTTOM_RIGHT_ONLY_PROPERTY = new Property<View, PointF>(cls, str2) { // from class: androidx.transition.ChangeBounds.3
            @Override // android.util.Property
            public void set(View view, PointF pointF) {
                ViewUtils.setLeftTopRightBottom(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
            }

            @Override // android.util.Property
            public PointF get(View view) {
                return null;
            }
        };
        TOP_LEFT_ONLY_PROPERTY = new Property<View, PointF>(cls, str) { // from class: androidx.transition.ChangeBounds.4
            @Override // android.util.Property
            public void set(View view, PointF pointF) {
                ViewUtils.setLeftTopRightBottom(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
            }

            @Override // android.util.Property
            public PointF get(View view) {
                return null;
            }
        };
        POSITION_PROPERTY = new Property<View, PointF>(cls, "position") { // from class: androidx.transition.ChangeBounds.5
            @Override // android.util.Property
            public void set(View view, PointF pointF) {
                int round = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                ViewUtils.setLeftTopRightBottom(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
            }

            @Override // android.util.Property
            public PointF get(View view) {
                return null;
            }
        };
    }

    public ChangeBounds(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mResizeClip = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.CHANGE_BOUNDS);
        boolean namedBoolean = TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        setResizeClip(namedBoolean);
    }

    private void captureValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            transitionValues.values.put(PROPNAME_BOUNDS, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            transitionValues.values.put(PROPNAME_PARENT, transitionValues.view.getParent());
            if (this.mResizeClip) {
                transitionValues.values.put(PROPNAME_CLIP, view.getClipBounds());
            }
        }
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        Rect rect;
        captureValues(transitionValues);
        if (this.mResizeClip && (rect = (Rect) transitionValues.view.getTag(R.id.transition_clip)) != null) {
            transitionValues.values.put(PROPNAME_CLIP, rect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        int i10;
        int i11;
        int i12;
        int i13;
        ObjectAnimator ofPointF;
        boolean z9;
        int i14;
        Rect rect;
        int i15;
        Rect rect2;
        ObjectAnimator objectAnimator;
        Animator mergeAnimators;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        Map<String, Object> map = transitionValues.values;
        Map<String, Object> map2 = transitionValues2.values;
        ViewGroup viewGroup2 = (ViewGroup) map.get(PROPNAME_PARENT);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(PROPNAME_PARENT);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = transitionValues2.view;
        Rect rect3 = (Rect) transitionValues.values.get(PROPNAME_BOUNDS);
        Rect rect4 = (Rect) transitionValues2.values.get(PROPNAME_BOUNDS);
        int i16 = rect3.left;
        int i17 = rect4.left;
        int i18 = rect3.top;
        int i19 = rect4.top;
        int i20 = rect3.right;
        int i21 = rect4.right;
        int i22 = rect3.bottom;
        int i23 = rect4.bottom;
        int i24 = i20 - i16;
        int i25 = i22 - i18;
        int i26 = i21 - i17;
        int i27 = i23 - i19;
        Rect rect5 = (Rect) transitionValues.values.get(PROPNAME_CLIP);
        Rect rect6 = (Rect) transitionValues2.values.get(PROPNAME_CLIP);
        if ((i24 != 0 && i25 != 0) || (i26 != 0 && i27 != 0)) {
            if (i16 == i17 && i18 == i19) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            if (i20 != i21 || i22 != i23) {
                i10++;
            }
        } else {
            i10 = 0;
        }
        if ((rect5 != null && !rect5.equals(rect6)) || (rect5 == null && rect6 != null)) {
            i10++;
        }
        int i28 = i10;
        if (i28 <= 0) {
            return null;
        }
        if (!this.mResizeClip) {
            ViewUtils.setLeftTopRightBottom(view, i16, i18, i20, i22);
            if (i28 == 2) {
                if (i24 == i26 && i25 == i27) {
                    mergeAnimators = ObjectAnimatorUtils.ofPointF(view, POSITION_PROPERTY, getPathMotion().getPath(i16, i18, i17, i19));
                } else {
                    ViewBounds viewBounds = new ViewBounds(view);
                    ObjectAnimator ofPointF2 = ObjectAnimatorUtils.ofPointF(viewBounds, TOP_LEFT_PROPERTY, getPathMotion().getPath(i16, i18, i17, i19));
                    ObjectAnimator ofPointF3 = ObjectAnimatorUtils.ofPointF(viewBounds, BOTTOM_RIGHT_PROPERTY, getPathMotion().getPath(i20, i22, i21, i23));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ofPointF2, ofPointF3);
                    animatorSet.addListener(new AnimatorListenerAdapter(viewBounds) { // from class: androidx.transition.ChangeBounds.6
                        private final ViewBounds mViewBounds;
                        final /* synthetic */ ViewBounds val$viewBounds;

                        {
                            this.val$viewBounds = viewBounds;
                            this.mViewBounds = viewBounds;
                        }
                    });
                    mergeAnimators = animatorSet;
                }
            } else if (i16 == i17 && i18 == i19) {
                mergeAnimators = ObjectAnimatorUtils.ofPointF(view, BOTTOM_RIGHT_ONLY_PROPERTY, getPathMotion().getPath(i20, i22, i21, i23));
            } else {
                mergeAnimators = ObjectAnimatorUtils.ofPointF(view, TOP_LEFT_ONLY_PROPERTY, getPathMotion().getPath(i16, i18, i17, i19));
            }
        } else {
            ViewUtils.setLeftTopRightBottom(view, i16, i18, Math.max(i24, i26) + i16, i18 + Math.max(i25, i27));
            if (i16 == i17 && i18 == i19) {
                ofPointF = null;
                i11 = i23;
                i13 = i17;
                i12 = i21;
            } else {
                i11 = i23;
                i12 = i21;
                i13 = i17;
                ofPointF = ObjectAnimatorUtils.ofPointF(view, POSITION_PROPERTY, getPathMotion().getPath(i16, i18, i17, i19));
            }
            if (rect5 == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                i14 = 0;
                rect = new Rect(0, 0, i24, i25);
            } else {
                i14 = 0;
                rect = rect5;
            }
            if (rect6 == null) {
                i15 = 1;
            } else {
                i15 = i14;
            }
            if (i15 != 0) {
                rect2 = new Rect(i14, i14, i26, i27);
            } else {
                rect2 = rect6;
            }
            if (!rect.equals(rect2)) {
                view.setClipBounds(rect);
                objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", sRectEvaluator, rect, rect2);
                ClipListener clipListener = new ClipListener(view, rect, z9, rect2, i15, i16, i18, i20, i22, i13, i19, i12, i11);
                objectAnimator.addListener(clipListener);
                addListener(clipListener);
            } else {
                objectAnimator = null;
            }
            mergeAnimators = TransitionUtils.mergeAnimators(ofPointF, objectAnimator);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            ViewGroupUtils.suppressLayout(viewGroup4, true);
            getRootTransition().addListener(new SuppressLayoutListener(viewGroup4));
        }
        return mergeAnimators;
    }

    public boolean getResizeClip() {
        return this.mResizeClip;
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

    public void setResizeClip(boolean z9) {
        this.mResizeClip = z9;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class ClipListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private final int mEndBottom;
        private final Rect mEndClip;
        private final boolean mEndClipIsNull;
        private final int mEndLeft;
        private final int mEndRight;
        private final int mEndTop;
        private boolean mIsCanceled;
        private final int mStartBottom;
        private final Rect mStartClip;
        private final boolean mStartClipIsNull;
        private final int mStartLeft;
        private final int mStartRight;
        private final int mStartTop;
        private final View mView;

        public ClipListener(View view, Rect rect, boolean z9, Rect rect2, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.mView = view;
            this.mStartClip = rect;
            this.mStartClipIsNull = z9;
            this.mEndClip = rect2;
            this.mEndClipIsNull = z10;
            this.mStartLeft = i10;
            this.mStartTop = i11;
            this.mStartRight = i12;
            this.mStartBottom = i13;
            this.mEndLeft = i14;
            this.mEndTop = i15;
            this.mEndRight = i16;
            this.mEndBottom = i17;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z9) {
            if (this.mIsCanceled) {
                return;
            }
            Rect rect = null;
            if (z9) {
                if (!this.mStartClipIsNull) {
                    rect = this.mStartClip;
                }
            } else if (!this.mEndClipIsNull) {
                rect = this.mEndClip;
            }
            this.mView.setClipBounds(rect);
            View view = this.mView;
            if (z9) {
                ViewUtils.setLeftTopRightBottom(view, this.mStartLeft, this.mStartTop, this.mStartRight, this.mStartBottom);
            } else {
                ViewUtils.setLeftTopRightBottom(view, this.mEndLeft, this.mEndTop, this.mEndRight, this.mEndBottom);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z9) {
            int i10;
            int i11;
            Rect rect;
            int max = Math.max(this.mStartRight - this.mStartLeft, this.mEndRight - this.mEndLeft);
            int max2 = Math.max(this.mStartBottom - this.mStartTop, this.mEndBottom - this.mEndTop);
            if (z9) {
                i10 = this.mEndLeft;
            } else {
                i10 = this.mStartLeft;
            }
            if (z9) {
                i11 = this.mEndTop;
            } else {
                i11 = this.mStartTop;
            }
            ViewUtils.setLeftTopRightBottom(this.mView, i10, i11, max + i10, max2 + i11);
            if (z9) {
                rect = this.mEndClip;
            } else {
                rect = this.mStartClip;
            }
            this.mView.setClipBounds(rect);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(@NonNull Transition transition) {
            this.mIsCanceled = true;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@NonNull Transition transition) {
            Rect rect;
            this.mView.setTag(R.id.transition_clip, this.mView.getClipBounds());
            if (this.mEndClipIsNull) {
                rect = null;
            } else {
                rect = this.mEndClip;
            }
            this.mView.setClipBounds(rect);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@NonNull Transition transition) {
            Rect rect = (Rect) this.mView.getTag(R.id.transition_clip);
            this.mView.setTag(R.id.transition_clip, null);
            this.mView.setClipBounds(rect);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@NonNull Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }
    }

    public ChangeBounds() {
        this.mResizeClip = false;
    }
}
