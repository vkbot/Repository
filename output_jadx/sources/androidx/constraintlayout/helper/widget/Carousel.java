package androidx.constraintlayout.helper.widget;

import a4.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class Carousel extends MotionHelper {
    private static final boolean DEBUG = false;
    private static final String TAG = "Carousel";
    public static final int TOUCH_UP_CARRY_ON = 2;
    public static final int TOUCH_UP_IMMEDIATE_STOP = 1;
    private Adapter mAdapter;
    private int mAnimateTargetDelay;
    private int mBackwardTransition;
    private float mDampening;
    private int mEmptyViewBehavior;
    private int mFirstViewReference;
    private int mForwardTransition;
    private int mIndex;
    private boolean mInfiniteCarousel;
    int mLastStartId;
    private final ArrayList<View> mList;
    private MotionLayout mMotionLayout;
    private int mNextState;
    private int mPreviousIndex;
    private int mPreviousState;
    private int mStartIndex;
    private int mTargetIndex;
    private int mTouchUpMode;
    Runnable mUpdateRunnable;
    private float mVelocityThreshold;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: androidx.constraintlayout.helper.widget.Carousel$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {

        /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
        /* renamed from: androidx.constraintlayout.helper.widget.Carousel$1$1 */
        /* loaded from: classes.dex */
        public class RunnableC00001 implements Runnable {
            final /* synthetic */ float val$v;

            public RunnableC00001(float f8) {
                r2 = f8;
            }

            @Override // java.lang.Runnable
            public void run() {
                Carousel.this.mMotionLayout.touchAnimateTo(5, 1.0f, r2);
            }
        }

        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Carousel.this.mMotionLayout.setProgress(0.0f);
            Carousel.this.updateItems();
            Carousel.this.mAdapter.onNewItem(Carousel.this.mIndex);
            float velocity = Carousel.this.mMotionLayout.getVelocity();
            if (Carousel.this.mTouchUpMode == 2 && velocity > Carousel.this.mVelocityThreshold && Carousel.this.mIndex < Carousel.this.mAdapter.count() - 1) {
                float f8 = Carousel.this.mDampening * velocity;
                if (Carousel.this.mIndex != 0 || Carousel.this.mPreviousIndex <= Carousel.this.mIndex) {
                    if (Carousel.this.mIndex != Carousel.this.mAdapter.count() - 1 || Carousel.this.mPreviousIndex >= Carousel.this.mIndex) {
                        Carousel.this.mMotionLayout.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                            final /* synthetic */ float val$v;

                            public RunnableC00001(float f82) {
                                r2 = f82;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                Carousel.this.mMotionLayout.touchAnimateTo(5, 1.0f, r2);
                            }
                        });
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public interface Adapter {
        int count();

        void onNewItem(int i10);

        void populate(View view, int i10);
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAdapter = null;
        this.mList = new ArrayList<>();
        this.mPreviousIndex = 0;
        this.mIndex = 0;
        this.mFirstViewReference = -1;
        this.mInfiniteCarousel = false;
        this.mBackwardTransition = -1;
        this.mForwardTransition = -1;
        this.mPreviousState = -1;
        this.mNextState = -1;
        this.mDampening = 0.9f;
        this.mStartIndex = 0;
        this.mEmptyViewBehavior = 4;
        this.mTouchUpMode = 1;
        this.mVelocityThreshold = 2.0f;
        this.mTargetIndex = -1;
        this.mAnimateTargetDelay = 200;
        this.mLastStartId = -1;
        this.mUpdateRunnable = new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1

            /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
            /* renamed from: androidx.constraintlayout.helper.widget.Carousel$1$1 */
            /* loaded from: classes.dex */
            public class RunnableC00001 implements Runnable {
                final /* synthetic */ float val$v;

                public RunnableC00001(float f82) {
                    r2 = f82;
                }

                @Override // java.lang.Runnable
                public void run() {
                    Carousel.this.mMotionLayout.touchAnimateTo(5, 1.0f, r2);
                }
            }

            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Carousel.this.mMotionLayout.setProgress(0.0f);
                Carousel.this.updateItems();
                Carousel.this.mAdapter.onNewItem(Carousel.this.mIndex);
                float velocity = Carousel.this.mMotionLayout.getVelocity();
                if (Carousel.this.mTouchUpMode == 2 && velocity > Carousel.this.mVelocityThreshold && Carousel.this.mIndex < Carousel.this.mAdapter.count() - 1) {
                    float f82 = Carousel.this.mDampening * velocity;
                    if (Carousel.this.mIndex != 0 || Carousel.this.mPreviousIndex <= Carousel.this.mIndex) {
                        if (Carousel.this.mIndex != Carousel.this.mAdapter.count() - 1 || Carousel.this.mPreviousIndex >= Carousel.this.mIndex) {
                            Carousel.this.mMotionLayout.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                                final /* synthetic */ float val$v;

                                public RunnableC00001(float f822) {
                                    r2 = f822;
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    Carousel.this.mMotionLayout.touchAnimateTo(5, 1.0f, r2);
                                }
                            });
                        }
                    }
                }
            }
        };
        init(context, attributeSet);
    }

    private void enableAllTransitions(boolean z9) {
        ArrayList<MotionScene.Transition> definedTransitions = this.mMotionLayout.getDefinedTransitions();
        int size = definedTransitions.size();
        int i10 = 0;
        while (i10 < size) {
            MotionScene.Transition transition = definedTransitions.get(i10);
            i10++;
            transition.setEnabled(z9);
        }
    }

    private boolean enableTransition(int i10, boolean z9) {
        MotionLayout motionLayout;
        MotionScene.Transition transition;
        if (i10 == -1 || (motionLayout = this.mMotionLayout) == null || (transition = motionLayout.getTransition(i10)) == null || z9 == transition.isEnabled()) {
            return false;
        }
        transition.setEnabled(z9);
        return true;
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Carousel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.Carousel_carousel_firstView) {
                    this.mFirstViewReference = obtainStyledAttributes.getResourceId(index, this.mFirstViewReference);
                } else if (index == R.styleable.Carousel_carousel_backwardTransition) {
                    this.mBackwardTransition = obtainStyledAttributes.getResourceId(index, this.mBackwardTransition);
                } else if (index == R.styleable.Carousel_carousel_forwardTransition) {
                    this.mForwardTransition = obtainStyledAttributes.getResourceId(index, this.mForwardTransition);
                } else if (index == R.styleable.Carousel_carousel_emptyViewsBehavior) {
                    this.mEmptyViewBehavior = obtainStyledAttributes.getInt(index, this.mEmptyViewBehavior);
                } else if (index == R.styleable.Carousel_carousel_previousState) {
                    this.mPreviousState = obtainStyledAttributes.getResourceId(index, this.mPreviousState);
                } else if (index == R.styleable.Carousel_carousel_nextState) {
                    this.mNextState = obtainStyledAttributes.getResourceId(index, this.mNextState);
                } else if (index == R.styleable.Carousel_carousel_touchUp_dampeningFactor) {
                    this.mDampening = obtainStyledAttributes.getFloat(index, this.mDampening);
                } else if (index == R.styleable.Carousel_carousel_touchUpMode) {
                    this.mTouchUpMode = obtainStyledAttributes.getInt(index, this.mTouchUpMode);
                } else if (index == R.styleable.Carousel_carousel_touchUp_velocityThreshold) {
                    this.mVelocityThreshold = obtainStyledAttributes.getFloat(index, this.mVelocityThreshold);
                } else if (index == R.styleable.Carousel_carousel_infinite) {
                    this.mInfiniteCarousel = obtainStyledAttributes.getBoolean(index, this.mInfiniteCarousel);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ void lambda$updateItems$0() {
        this.mMotionLayout.setTransitionDuration(this.mAnimateTargetDelay);
        int i10 = this.mTargetIndex;
        int i11 = this.mIndex;
        MotionLayout motionLayout = this.mMotionLayout;
        if (i10 < i11) {
            motionLayout.transitionToState(this.mPreviousState, this.mAnimateTargetDelay);
        } else {
            motionLayout.transitionToState(this.mNextState, this.mAnimateTargetDelay);
        }
    }

    public void updateItems() {
        Adapter adapter = this.mAdapter;
        if (adapter != null && this.mMotionLayout != null && adapter.count() != 0) {
            int size = this.mList.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.mList.get(i10);
                int i11 = (this.mIndex + i10) - this.mStartIndex;
                if (this.mInfiniteCarousel) {
                    if (i11 < 0) {
                        int i12 = this.mEmptyViewBehavior;
                        if (i12 != 4) {
                            updateViewVisibility(view, i12);
                        } else {
                            updateViewVisibility(view, 0);
                        }
                        int count = i11 % this.mAdapter.count();
                        Adapter adapter2 = this.mAdapter;
                        if (count == 0) {
                            adapter2.populate(view, 0);
                        } else {
                            adapter2.populate(view, (i11 % this.mAdapter.count()) + adapter2.count());
                        }
                    } else if (i11 >= this.mAdapter.count()) {
                        if (i11 == this.mAdapter.count()) {
                            i11 = 0;
                        } else if (i11 > this.mAdapter.count()) {
                            i11 %= this.mAdapter.count();
                        }
                        int i13 = this.mEmptyViewBehavior;
                        if (i13 != 4) {
                            updateViewVisibility(view, i13);
                        } else {
                            updateViewVisibility(view, 0);
                        }
                        this.mAdapter.populate(view, i11);
                    } else {
                        updateViewVisibility(view, 0);
                        this.mAdapter.populate(view, i11);
                    }
                } else if (i11 < 0) {
                    updateViewVisibility(view, this.mEmptyViewBehavior);
                } else if (i11 >= this.mAdapter.count()) {
                    updateViewVisibility(view, this.mEmptyViewBehavior);
                } else {
                    updateViewVisibility(view, 0);
                    this.mAdapter.populate(view, i11);
                }
            }
            int i14 = this.mTargetIndex;
            if (i14 != -1 && i14 != this.mIndex) {
                this.mMotionLayout.post(new g(1, this));
            } else if (i14 == this.mIndex) {
                this.mTargetIndex = -1;
            }
            if (this.mBackwardTransition != -1 && this.mForwardTransition != -1) {
                if (this.mInfiniteCarousel) {
                    return;
                }
                int count2 = this.mAdapter.count();
                int i15 = this.mIndex;
                int i16 = this.mBackwardTransition;
                if (i15 == 0) {
                    enableTransition(i16, false);
                } else {
                    enableTransition(i16, true);
                    this.mMotionLayout.setTransition(this.mBackwardTransition);
                }
                int i17 = this.mIndex;
                int i18 = count2 - 1;
                int i19 = this.mForwardTransition;
                if (i17 == i18) {
                    enableTransition(i19, false);
                    return;
                } else {
                    enableTransition(i19, true);
                    this.mMotionLayout.setTransition(this.mForwardTransition);
                    return;
                }
            }
            Log.w(TAG, "No backward or forward transitions defined for Carousel!");
        }
    }

    private boolean updateViewVisibility(int i10, View view, int i11) {
        ConstraintSet.Constraint constraint;
        ConstraintSet constraintSet = this.mMotionLayout.getConstraintSet(i10);
        if (constraintSet == null || (constraint = constraintSet.getConstraint(view.getId())) == null) {
            return false;
        }
        constraint.propertySet.mVisibilityMode = 1;
        view.setVisibility(i11);
        return true;
    }

    public int getCount() {
        Adapter adapter = this.mAdapter;
        if (adapter != null) {
            return adapter.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.mIndex;
    }

    public boolean isInfinite() {
        return this.mInfiniteCarousel;
    }

    public void jumpToIndex(int i10) {
        this.mIndex = Math.max(0, Math.min(getCount() - 1, i10));
        refresh();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            this.mList.clear();
            for (int i10 = 0; i10 < this.mCount; i10++) {
                int i11 = this.mIds[i10];
                View viewById = motionLayout.getViewById(i11);
                if (this.mFirstViewReference == i11) {
                    this.mStartIndex = i10;
                }
                this.mList.add(viewById);
            }
            this.mMotionLayout = motionLayout;
            if (this.mTouchUpMode == 2) {
                MotionScene.Transition transition = motionLayout.getTransition(this.mForwardTransition);
                if (transition != null) {
                    transition.setOnTouchUp(5);
                }
                MotionScene.Transition transition2 = this.mMotionLayout.getTransition(this.mBackwardTransition);
                if (transition2 != null) {
                    transition2.setOnTouchUp(5);
                }
            }
            updateItems();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mList.clear();
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionChange(MotionLayout motionLayout, int i10, int i11, float f8) {
        this.mLastStartId = i10;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionCompleted(MotionLayout motionLayout, int i10) {
        int i11 = this.mIndex;
        this.mPreviousIndex = i11;
        if (i10 == this.mNextState) {
            this.mIndex = i11 + 1;
        } else if (i10 == this.mPreviousState) {
            this.mIndex = i11 - 1;
        }
        boolean z9 = this.mInfiniteCarousel;
        int i12 = this.mIndex;
        if (z9) {
            if (i12 >= this.mAdapter.count()) {
                this.mIndex = 0;
            }
            if (this.mIndex < 0) {
                this.mIndex = this.mAdapter.count() - 1;
            }
        } else {
            if (i12 >= this.mAdapter.count()) {
                this.mIndex = this.mAdapter.count() - 1;
            }
            if (this.mIndex < 0) {
                this.mIndex = 0;
            }
        }
        if (this.mPreviousIndex != this.mIndex) {
            this.mMotionLayout.post(this.mUpdateRunnable);
        }
    }

    public void refresh() {
        int size = this.mList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = this.mList.get(i10);
            if (this.mAdapter.count() == 0) {
                updateViewVisibility(view, this.mEmptyViewBehavior);
            } else {
                updateViewVisibility(view, 0);
            }
        }
        this.mMotionLayout.rebuildScene();
        updateItems();
    }

    public void setAdapter(Adapter adapter) {
        this.mAdapter = adapter;
    }

    public void setInfinite(boolean z9) {
        this.mInfiniteCarousel = z9;
    }

    public void transitionToIndex(int i10, int i11) {
        this.mTargetIndex = Math.max(0, Math.min(getCount() - 1, i10));
        int max = Math.max(0, i11);
        this.mAnimateTargetDelay = max;
        this.mMotionLayout.setTransitionDuration(max);
        int i12 = this.mIndex;
        MotionLayout motionLayout = this.mMotionLayout;
        if (i10 < i12) {
            motionLayout.transitionToState(this.mPreviousState, this.mAnimateTargetDelay);
        } else {
            motionLayout.transitionToState(this.mNextState, this.mAnimateTargetDelay);
        }
    }

    private boolean updateViewVisibility(View view, int i10) {
        MotionLayout motionLayout = this.mMotionLayout;
        if (motionLayout == null) {
            return false;
        }
        boolean z9 = false;
        for (int i11 : motionLayout.getConstraintSetIds()) {
            z9 |= updateViewVisibility(i11, view, i10);
        }
        return z9;
    }

    public Carousel(Context context) {
        super(context);
        this.mAdapter = null;
        this.mList = new ArrayList<>();
        this.mPreviousIndex = 0;
        this.mIndex = 0;
        this.mFirstViewReference = -1;
        this.mInfiniteCarousel = false;
        this.mBackwardTransition = -1;
        this.mForwardTransition = -1;
        this.mPreviousState = -1;
        this.mNextState = -1;
        this.mDampening = 0.9f;
        this.mStartIndex = 0;
        this.mEmptyViewBehavior = 4;
        this.mTouchUpMode = 1;
        this.mVelocityThreshold = 2.0f;
        this.mTargetIndex = -1;
        this.mAnimateTargetDelay = 200;
        this.mLastStartId = -1;
        this.mUpdateRunnable = new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1

            /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
            /* renamed from: androidx.constraintlayout.helper.widget.Carousel$1$1 */
            /* loaded from: classes.dex */
            public class RunnableC00001 implements Runnable {
                final /* synthetic */ float val$v;

                public RunnableC00001(float f822) {
                    r2 = f822;
                }

                @Override // java.lang.Runnable
                public void run() {
                    Carousel.this.mMotionLayout.touchAnimateTo(5, 1.0f, r2);
                }
            }

            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Carousel.this.mMotionLayout.setProgress(0.0f);
                Carousel.this.updateItems();
                Carousel.this.mAdapter.onNewItem(Carousel.this.mIndex);
                float velocity = Carousel.this.mMotionLayout.getVelocity();
                if (Carousel.this.mTouchUpMode == 2 && velocity > Carousel.this.mVelocityThreshold && Carousel.this.mIndex < Carousel.this.mAdapter.count() - 1) {
                    float f822 = Carousel.this.mDampening * velocity;
                    if (Carousel.this.mIndex != 0 || Carousel.this.mPreviousIndex <= Carousel.this.mIndex) {
                        if (Carousel.this.mIndex != Carousel.this.mAdapter.count() - 1 || Carousel.this.mPreviousIndex >= Carousel.this.mIndex) {
                            Carousel.this.mMotionLayout.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                                final /* synthetic */ float val$v;

                                public RunnableC00001(float f8222) {
                                    r2 = f8222;
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    Carousel.this.mMotionLayout.touchAnimateTo(5, 1.0f, r2);
                                }
                            });
                        }
                    }
                }
            }
        };
    }

    public Carousel(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mAdapter = null;
        this.mList = new ArrayList<>();
        this.mPreviousIndex = 0;
        this.mIndex = 0;
        this.mFirstViewReference = -1;
        this.mInfiniteCarousel = false;
        this.mBackwardTransition = -1;
        this.mForwardTransition = -1;
        this.mPreviousState = -1;
        this.mNextState = -1;
        this.mDampening = 0.9f;
        this.mStartIndex = 0;
        this.mEmptyViewBehavior = 4;
        this.mTouchUpMode = 1;
        this.mVelocityThreshold = 2.0f;
        this.mTargetIndex = -1;
        this.mAnimateTargetDelay = 200;
        this.mLastStartId = -1;
        this.mUpdateRunnable = new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1

            /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
            /* renamed from: androidx.constraintlayout.helper.widget.Carousel$1$1 */
            /* loaded from: classes.dex */
            public class RunnableC00001 implements Runnable {
                final /* synthetic */ float val$v;

                public RunnableC00001(float f8222) {
                    r2 = f8222;
                }

                @Override // java.lang.Runnable
                public void run() {
                    Carousel.this.mMotionLayout.touchAnimateTo(5, 1.0f, r2);
                }
            }

            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Carousel.this.mMotionLayout.setProgress(0.0f);
                Carousel.this.updateItems();
                Carousel.this.mAdapter.onNewItem(Carousel.this.mIndex);
                float velocity = Carousel.this.mMotionLayout.getVelocity();
                if (Carousel.this.mTouchUpMode == 2 && velocity > Carousel.this.mVelocityThreshold && Carousel.this.mIndex < Carousel.this.mAdapter.count() - 1) {
                    float f8222 = Carousel.this.mDampening * velocity;
                    if (Carousel.this.mIndex != 0 || Carousel.this.mPreviousIndex <= Carousel.this.mIndex) {
                        if (Carousel.this.mIndex != Carousel.this.mAdapter.count() - 1 || Carousel.this.mPreviousIndex >= Carousel.this.mIndex) {
                            Carousel.this.mMotionLayout.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                                final /* synthetic */ float val$v;

                                public RunnableC00001(float f82222) {
                                    r2 = f82222;
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    Carousel.this.mMotionLayout.touchAnimateTo(5, 1.0f, r2);
                                }
                            });
                        }
                    }
                }
            }
        };
        init(context, attributeSet);
    }
}
