package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import androidx.slidingpanelayout.widget.FoldingFeatureObserver;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup implements Openable {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.slidingpanelayout.widget.SlidingPaneLayout";
    public static final int LOCK_MODE_LOCKED = 3;
    public static final int LOCK_MODE_LOCKED_CLOSED = 2;
    public static final int LOCK_MODE_LOCKED_OPEN = 1;
    public static final int LOCK_MODE_UNLOCKED = 0;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final String TAG = "SlidingPaneLayout";
    private static boolean sEdgeSizeUsingSystemGestureInsets;
    private boolean mCanSlide;
    private int mCoveredFadeColor;
    private boolean mDisplayListReflectionLoaded;
    final ViewDragHelper mDragHelper;
    private boolean mFirstLayout;
    FoldingFeature mFoldingFeature;
    private FoldingFeatureObserver mFoldingFeatureObserver;
    private Method mGetDisplayList;
    private float mInitialMotionX;
    private float mInitialMotionY;
    boolean mIsUnableToDrag;
    private int mLockMode;
    private FoldingFeatureObserver.OnFoldingFeatureChangeListener mOnFoldingFeatureChangeListener;

    @Nullable
    private PanelSlideListener mPanelSlideListener;
    private final List<PanelSlideListener> mPanelSlideListeners;
    private int mParallaxBy;
    private float mParallaxOffset;
    final ArrayList<DisableLayerRunnable> mPostedRunnables;
    boolean mPreservedOpenState;
    private Field mRecreateDisplayList;
    private Drawable mShadowDrawableLeft;
    private Drawable mShadowDrawableRight;
    float mSlideOffset;
    int mSlideRange;
    View mSlideableView;
    private int mSliderFadeColor;
    private final Rect mTmpRect;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public class AccessibilityDelegate extends AccessibilityDelegateCompat {
        private final Rect mTmpRect = new Rect();

        public AccessibilityDelegate() {
        }

        private void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2) {
            Rect rect = this.mTmpRect;
            accessibilityNodeInfoCompat2.getBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setVisibleToUser(accessibilityNodeInfoCompat2.isVisibleToUser());
            accessibilityNodeInfoCompat.setPackageName(accessibilityNodeInfoCompat2.getPackageName());
            accessibilityNodeInfoCompat.setClassName(accessibilityNodeInfoCompat2.getClassName());
            accessibilityNodeInfoCompat.setContentDescription(accessibilityNodeInfoCompat2.getContentDescription());
            accessibilityNodeInfoCompat.setEnabled(accessibilityNodeInfoCompat2.isEnabled());
            accessibilityNodeInfoCompat.setClickable(accessibilityNodeInfoCompat2.isClickable());
            accessibilityNodeInfoCompat.setFocusable(accessibilityNodeInfoCompat2.isFocusable());
            accessibilityNodeInfoCompat.setFocused(accessibilityNodeInfoCompat2.isFocused());
            accessibilityNodeInfoCompat.setAccessibilityFocused(accessibilityNodeInfoCompat2.isAccessibilityFocused());
            accessibilityNodeInfoCompat.setSelected(accessibilityNodeInfoCompat2.isSelected());
            accessibilityNodeInfoCompat.setLongClickable(accessibilityNodeInfoCompat2.isLongClickable());
            accessibilityNodeInfoCompat.addAction(accessibilityNodeInfoCompat2.getActions());
            accessibilityNodeInfoCompat.setMovementGranularities(accessibilityNodeInfoCompat2.getMovementGranularities());
        }

        public boolean filter(View view) {
            return SlidingPaneLayout.this.isDimmed(view);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.ACCESSIBILITY_CLASS_NAME);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
            super.onInitializeAccessibilityNodeInfo(view, obtain);
            copyNodeInfoNoChildren(accessibilityNodeInfoCompat, obtain);
            obtain.recycle();
            accessibilityNodeInfoCompat.setClassName(SlidingPaneLayout.ACCESSIBILITY_CLASS_NAME);
            accessibilityNodeInfoCompat.setSource(view);
            Object parentForAccessibility = ViewCompat.getParentForAccessibility(view);
            if (parentForAccessibility instanceof View) {
                accessibilityNodeInfoCompat.setParent((View) parentForAccessibility);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i10);
                if (!filter(childAt) && childAt.getVisibility() == 0) {
                    ViewCompat.setImportantForAccessibility(childAt, 1);
                    accessibilityNodeInfoCompat.addChild(childAt);
                }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!filter(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public class DisableLayerRunnable implements Runnable {
        final View mChildView;

        public DisableLayerRunnable(View view) {
            this.mChildView = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mChildView.getParent() == SlidingPaneLayout.this) {
                this.mChildView.setLayerType(0, null);
                SlidingPaneLayout.this.invalidateChildRegion(this.mChildView);
            }
            SlidingPaneLayout.this.mPostedRunnables.remove(this);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public class DragHelperCallback extends ViewDragHelper.Callback {
        public DragHelperCallback() {
        }

        private boolean isDraggable() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.mIsUnableToDrag || slidingPaneLayout.getLockMode() == 3) {
                return false;
            }
            if (SlidingPaneLayout.this.isOpen() && SlidingPaneLayout.this.getLockMode() == 1) {
                return false;
            }
            if (!SlidingPaneLayout.this.isOpen() && SlidingPaneLayout.this.getLockMode() == 2) {
                return false;
            }
            return true;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i10, int i11) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.mSlideableView.getLayoutParams();
            boolean isLayoutRtlSupport = SlidingPaneLayout.this.isLayoutRtlSupport();
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (isLayoutRtlSupport) {
                int width = slidingPaneLayout.getWidth() - (SlidingPaneLayout.this.mSlideableView.getWidth() + (SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
                return Math.max(Math.min(i10, width), width - SlidingPaneLayout.this.mSlideRange);
            }
            int paddingLeft = slidingPaneLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            return Math.min(Math.max(i10, paddingLeft), SlidingPaneLayout.this.mSlideRange + paddingLeft);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            return SlidingPaneLayout.this.mSlideRange;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int i10, int i11) {
            if (!isDraggable()) {
                return;
            }
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.mDragHelper.captureChildView(slidingPaneLayout.mSlideableView, i11);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeTouched(int i10, int i11) {
            if (!isDraggable()) {
                return;
            }
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.mDragHelper.captureChildView(slidingPaneLayout.mSlideableView, i11);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(View view, int i10) {
            SlidingPaneLayout.this.setAllChildrenVisible();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i10) {
            if (SlidingPaneLayout.this.mDragHelper.getViewDragState() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.mSlideOffset == 1.0f) {
                    slidingPaneLayout.updateObscuredViewsVisibility(slidingPaneLayout.mSlideableView);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.dispatchOnPanelClosed(slidingPaneLayout2.mSlideableView);
                    SlidingPaneLayout.this.mPreservedOpenState = false;
                    return;
                }
                slidingPaneLayout.dispatchOnPanelOpened(slidingPaneLayout.mSlideableView);
                SlidingPaneLayout.this.mPreservedOpenState = true;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
            SlidingPaneLayout.this.onPanelDragged(i10);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f8, float f10) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            boolean isLayoutRtlSupport = SlidingPaneLayout.this.isLayoutRtlSupport();
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (isLayoutRtlSupport) {
                int paddingRight = slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f8 < 0.0f || (f8 == 0.0f && SlidingPaneLayout.this.mSlideOffset > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.mSlideRange;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.mSlideableView.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + slidingPaneLayout.getPaddingLeft();
                if (f8 > 0.0f || (f8 == 0.0f && SlidingPaneLayout.this.mSlideOffset > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.mSlideRange;
                }
            }
            SlidingPaneLayout.this.mDragHelper.settleCapturedViewAt(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i10) {
            if (!isDraggable()) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).slideable;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public interface PanelSlideListener {
        void onPanelClosed(@NonNull View view);

        void onPanelOpened(@NonNull View view);

        void onPanelSlide(@NonNull View view, float f8);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class TouchBlocker extends FrameLayout {
        public TouchBlocker(View view) {
            super(view.getContext());
            addView(view);
        }

        @Override // android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        boolean z9;
        if (Build.VERSION.SDK_INT >= 29) {
            z9 = true;
        } else {
            z9 = false;
        }
        sEdgeSizeUsingSystemGestureInsets = z9;
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mSliderFadeColor = 0;
        this.mSlideOffset = 1.0f;
        this.mPanelSlideListeners = new CopyOnWriteArrayList();
        this.mFirstLayout = true;
        this.mTmpRect = new Rect();
        this.mPostedRunnables = new ArrayList<>();
        this.mOnFoldingFeatureChangeListener = new FoldingFeatureObserver.OnFoldingFeatureChangeListener() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout.1
            @Override // androidx.slidingpanelayout.widget.FoldingFeatureObserver.OnFoldingFeatureChangeListener
            public void onFoldingFeatureChange(@NonNull FoldingFeature foldingFeature) {
                SlidingPaneLayout.this.mFoldingFeature = foldingFeature;
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(300L);
                changeBounds.setInterpolator(PathInterpolatorCompat.create(0.2f, 0.0f, 0.0f, 1.0f));
                TransitionManager.beginDelayedTransition(SlidingPaneLayout.this, changeBounds);
                SlidingPaneLayout.this.requestLayout();
            }
        };
        float f8 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegate());
        ViewCompat.setImportantForAccessibility(this, 1);
        ViewDragHelper create = ViewDragHelper.create(this, 0.5f, new DragHelperCallback());
        this.mDragHelper = create;
        create.setMinVelocity(f8 * 400.0f);
        setFoldingFeatureObserver(new FoldingFeatureObserver(WindowInfoTracker.getOrCreate(context), ContextCompat.getMainExecutor(context)));
    }

    private boolean closePane(int i10) {
        if (!this.mCanSlide) {
            this.mPreservedOpenState = false;
        }
        if (!this.mFirstLayout && !smoothSlideTo(1.0f, i10)) {
            return false;
        }
        this.mPreservedOpenState = false;
        return true;
    }

    @Nullable
    private static Activity getActivityOrNull(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private static Rect getFoldBoundsInView(@NonNull FoldingFeature foldingFeature, View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        Rect rect = new Rect(i10, iArr[1], view.getWidth() + i10, view.getWidth() + iArr[1]);
        Rect rect2 = new Rect(foldingFeature.getBounds());
        boolean intersect = rect2.intersect(rect);
        if ((rect2.width() == 0 && rect2.height() == 0) || !intersect) {
            return null;
        }
        rect2.offset(-iArr[0], -iArr[1]);
        return rect2;
    }

    private static int getMinimumWidth(View view) {
        if (view instanceof TouchBlocker) {
            return ViewCompat.getMinimumWidth(((TouchBlocker) view).getChildAt(0));
        }
        return ViewCompat.getMinimumWidth(view);
    }

    private Insets getSystemGestureInsets() {
        WindowInsetsCompat rootWindowInsets;
        if (sEdgeSizeUsingSystemGestureInsets && (rootWindowInsets = ViewCompat.getRootWindowInsets(this)) != null) {
            return rootWindowInsets.getSystemGestureInsets();
        }
        return null;
    }

    private static int measureChildHeight(@NonNull View view, int i10, int i11) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) layoutParams).width == 0 && layoutParams.weight > 0.0f) {
            return ViewGroup.getChildMeasureSpec(i10, i11, ((ViewGroup.MarginLayoutParams) layoutParams).height);
        }
        return View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), BasicMeasure.EXACTLY);
    }

    private boolean openPane(int i10) {
        if (!this.mCanSlide) {
            this.mPreservedOpenState = true;
        }
        if (!this.mFirstLayout && !smoothSlideTo(0.0f, i10)) {
            return false;
        }
        this.mPreservedOpenState = true;
        return true;
    }

    private void parallaxOtherViews(float f8) {
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != this.mSlideableView) {
                float f10 = 1.0f - this.mParallaxOffset;
                int i11 = this.mParallaxBy;
                this.mParallaxOffset = f8;
                int i12 = ((int) (f10 * i11)) - ((int) ((1.0f - f8) * i11));
                if (isLayoutRtlSupport) {
                    i12 = -i12;
                }
                childAt.offsetLeftAndRight(i12);
            }
        }
    }

    private void setFoldingFeatureObserver(FoldingFeatureObserver foldingFeatureObserver) {
        this.mFoldingFeatureObserver = foldingFeatureObserver;
        foldingFeatureObserver.setOnFoldingFeatureChangeListener(this.mOnFoldingFeatureChangeListener);
    }

    private ArrayList<Rect> splitViewPositions() {
        Rect foldBoundsInView;
        FoldingFeature foldingFeature = this.mFoldingFeature;
        if (foldingFeature == null || !foldingFeature.isSeparating() || this.mFoldingFeature.getBounds().left == 0 || this.mFoldingFeature.getBounds().top != 0 || (foldBoundsInView = getFoldBoundsInView(this.mFoldingFeature, this)) == null) {
            return null;
        }
        Rect rect = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), foldBoundsInView.left), getHeight() - getPaddingBottom());
        int width = getWidth() - getPaddingRight();
        return new ArrayList<>(Arrays.asList(rect, new Rect(Math.min(width, foldBoundsInView.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
    }

    private static boolean viewIsOpaque(View view) {
        if (view.isOpaque()) {
            return true;
        }
        return false;
    }

    public void addPanelSlideListener(@NonNull PanelSlideListener panelSlideListener) {
        this.mPanelSlideListeners.add(panelSlideListener);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i10, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new TouchBlocker(view), i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    public boolean canScroll(View view, boolean z9, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && canScroll(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z9) {
            if (!isLayoutRtlSupport()) {
                i10 = -i10;
            }
            if (view.canScrollHorizontally(i10)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Deprecated
    public boolean canSlide() {
        return this.mCanSlide;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // androidx.customview.widget.Openable
    public void close() {
        closePane();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mDragHelper.continueSettling(true)) {
            if (!this.mCanSlide) {
                this.mDragHelper.abort();
            } else {
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }
    }

    public void dispatchOnPanelClosed(@NonNull View view) {
        Iterator<PanelSlideListener> it = this.mPanelSlideListeners.iterator();
        while (it.hasNext()) {
            it.next().onPanelClosed(view);
        }
        sendAccessibilityEvent(32);
    }

    public void dispatchOnPanelOpened(@NonNull View view) {
        Iterator<PanelSlideListener> it = this.mPanelSlideListeners.iterator();
        while (it.hasNext()) {
            it.next().onPanelOpened(view);
        }
        sendAccessibilityEvent(32);
    }

    public void dispatchOnPanelSlide(@NonNull View view) {
        Iterator<PanelSlideListener> it = this.mPanelSlideListeners.iterator();
        while (it.hasNext()) {
            it.next().onPanelSlide(view, this.mSlideOffset);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        View view;
        int i10;
        int i11;
        super.draw(canvas);
        if (isLayoutRtlSupport()) {
            drawable = this.mShadowDrawableRight;
        } else {
            drawable = this.mShadowDrawableLeft;
        }
        if (getChildCount() > 1) {
            view = getChildAt(1);
        } else {
            view = null;
        }
        if (view != null && drawable != null) {
            int top = view.getTop();
            int bottom = view.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (isLayoutRtlSupport()) {
                i11 = view.getRight();
                i10 = intrinsicWidth + i11;
            } else {
                int left = view.getLeft();
                int i12 = left - intrinsicWidth;
                i10 = left;
                i11 = i12;
            }
            drawable.setBounds(i11, top, i10, bottom);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean isLayoutRtlSupport = isLayoutRtlSupport() ^ isOpen();
        ViewDragHelper viewDragHelper = this.mDragHelper;
        if (isLayoutRtlSupport) {
            viewDragHelper.setEdgeTrackingEnabled(1);
            Insets systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                ViewDragHelper viewDragHelper2 = this.mDragHelper;
                viewDragHelper2.setEdgeSize(Math.max(viewDragHelper2.getDefaultEdgeSize(), systemGestureInsets.left));
            }
        } else {
            viewDragHelper.setEdgeTrackingEnabled(2);
            Insets systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                ViewDragHelper viewDragHelper3 = this.mDragHelper;
                viewDragHelper3.setEdgeSize(Math.max(viewDragHelper3.getDefaultEdgeSize(), systemGestureInsets2.right));
            }
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.mCanSlide && !layoutParams.slideable && this.mSlideableView != null) {
            canvas.getClipBounds(this.mTmpRect);
            boolean isLayoutRtlSupport2 = isLayoutRtlSupport();
            Rect rect = this.mTmpRect;
            if (isLayoutRtlSupport2) {
                rect.left = Math.max(rect.left, this.mSlideableView.getRight());
            } else {
                rect.right = Math.min(rect.right, this.mSlideableView.getLeft());
            }
            canvas.clipRect(this.mTmpRect);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @ColorInt
    @Deprecated
    public int getCoveredFadeColor() {
        return this.mCoveredFadeColor;
    }

    public final int getLockMode() {
        return this.mLockMode;
    }

    @Px
    public int getParallaxDistance() {
        return this.mParallaxBy;
    }

    @ColorInt
    @Deprecated
    public int getSliderFadeColor() {
        return this.mSliderFadeColor;
    }

    public void invalidateChildRegion(View view) {
        ViewCompat.setLayerPaint(view, ((LayoutParams) view.getLayoutParams()).dimPaint);
    }

    public boolean isDimmed(View view) {
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.mCanSlide || !layoutParams.dimWhenOffset || this.mSlideOffset <= 0.0f) {
            return false;
        }
        return true;
    }

    public boolean isLayoutRtlSupport() {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.customview.widget.Openable
    public boolean isOpen() {
        if (this.mCanSlide && this.mSlideOffset != 0.0f) {
            return false;
        }
        return true;
    }

    public boolean isSlideable() {
        return this.mCanSlide;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Activity activityOrNull;
        super.onAttachedToWindow();
        this.mFirstLayout = true;
        if (this.mFoldingFeatureObserver != null && (activityOrNull = getActivityOrNull(getContext())) != null) {
            this.mFoldingFeatureObserver.registerLayoutStateChangeCallback(activityOrNull);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
        FoldingFeatureObserver foldingFeatureObserver = this.mFoldingFeatureObserver;
        if (foldingFeatureObserver != null) {
            foldingFeatureObserver.unregisterLayoutStateChangeCallback();
        }
        int size = this.mPostedRunnables.size();
        int i10 = 0;
        while (true) {
            ArrayList<DisableLayerRunnable> arrayList = this.mPostedRunnables;
            if (i10 < size) {
                arrayList.get(i10).run();
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.mCanSlide && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.mPreservedOpenState = this.mDragHelper.isViewUnder(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.mCanSlide && (!this.mIsUnableToDrag || actionMasked == 0)) {
            if (actionMasked != 3 && actionMasked != 1) {
                if (actionMasked != 0) {
                    if (actionMasked == 2) {
                        float x9 = motionEvent.getX();
                        float y9 = motionEvent.getY();
                        float abs = Math.abs(x9 - this.mInitialMotionX);
                        float abs2 = Math.abs(y9 - this.mInitialMotionY);
                        if (abs > this.mDragHelper.getTouchSlop() && abs2 > abs) {
                            this.mDragHelper.cancel();
                            this.mIsUnableToDrag = true;
                            return false;
                        }
                    }
                } else {
                    this.mIsUnableToDrag = false;
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    this.mInitialMotionX = x10;
                    this.mInitialMotionY = y10;
                    if (this.mDragHelper.isViewUnder(this.mSlideableView, (int) x10, (int) y10) && isDimmed(this.mSlideableView)) {
                        z9 = true;
                        if (!this.mDragHelper.shouldInterceptTouchEvent(motionEvent) || z9) {
                            return true;
                        }
                        return false;
                    }
                }
                z9 = false;
                if (!this.mDragHelper.shouldInterceptTouchEvent(motionEvent)) {
                }
                return true;
            }
            this.mDragHelper.cancel();
            return false;
        }
        this.mDragHelper.cancel();
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (((android.view.ViewGroup.MarginLayoutParams) r7).width == 0) goto L18;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r20, int r21) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    public void onPanelDragged(int i10) {
        int paddingLeft;
        int i11;
        if (this.mSlideableView == null) {
            this.mSlideOffset = 0.0f;
            return;
        }
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        LayoutParams layoutParams = (LayoutParams) this.mSlideableView.getLayoutParams();
        int width = this.mSlideableView.getWidth();
        if (isLayoutRtlSupport) {
            i10 = (getWidth() - i10) - width;
        }
        if (isLayoutRtlSupport) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (isLayoutRtlSupport) {
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        }
        float f8 = (i10 - (paddingLeft + i11)) / this.mSlideRange;
        this.mSlideOffset = f8;
        if (this.mParallaxBy != 0) {
            parallaxOtherViews(f8);
        }
        dispatchOnPanelSlide(this.mSlideableView);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.isOpen) {
            openPane();
        } else {
            closePane();
        }
        this.mPreservedOpenState = savedState.isOpen;
        setLockMode(savedState.mLockMode);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z9;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (isSlideable()) {
            z9 = isOpen();
        } else {
            z9 = this.mPreservedOpenState;
        }
        savedState.isOpen = z9;
        savedState.mLockMode = this.mLockMode;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            this.mFirstLayout = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mCanSlide) {
            return super.onTouchEvent(motionEvent);
        }
        this.mDragHelper.processTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 && isDimmed(this.mSlideableView)) {
                float x9 = motionEvent.getX();
                float y9 = motionEvent.getY();
                float f8 = x9 - this.mInitialMotionX;
                float f10 = y9 - this.mInitialMotionY;
                int touchSlop = this.mDragHelper.getTouchSlop();
                if ((f10 * f10) + (f8 * f8) < touchSlop * touchSlop && this.mDragHelper.isViewUnder(this.mSlideableView, (int) x9, (int) y9)) {
                    closePane(0);
                }
            }
            return true;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        this.mInitialMotionX = x10;
        this.mInitialMotionY = y10;
        return true;
    }

    @Override // androidx.customview.widget.Openable
    public void open() {
        openPane();
    }

    public void removePanelSlideListener(@NonNull PanelSlideListener panelSlideListener) {
        this.mPanelSlideListeners.remove(panelSlideListener);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@NonNull View view) {
        if (view.getParent() instanceof TouchBlocker) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        boolean z9;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.mCanSlide) {
            if (view == this.mSlideableView) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.mPreservedOpenState = z9;
        }
    }

    public void setAllChildrenVisible() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Deprecated
    public void setCoveredFadeColor(@ColorInt int i10) {
        this.mCoveredFadeColor = i10;
    }

    public final void setLockMode(int i10) {
        this.mLockMode = i10;
    }

    @Deprecated
    public void setPanelSlideListener(@Nullable PanelSlideListener panelSlideListener) {
        PanelSlideListener panelSlideListener2 = this.mPanelSlideListener;
        if (panelSlideListener2 != null) {
            removePanelSlideListener(panelSlideListener2);
        }
        if (panelSlideListener != null) {
            addPanelSlideListener(panelSlideListener);
        }
        this.mPanelSlideListener = panelSlideListener;
    }

    public void setParallaxDistance(@Px int i10) {
        this.mParallaxBy = i10;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@Nullable Drawable drawable) {
        this.mShadowDrawableLeft = drawable;
    }

    public void setShadowDrawableRight(@Nullable Drawable drawable) {
        this.mShadowDrawableRight = drawable;
    }

    @Deprecated
    public void setShadowResource(@DrawableRes int i10) {
        setShadowDrawableLeft(getResources().getDrawable(i10));
    }

    public void setShadowResourceLeft(int i10) {
        setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), i10));
    }

    public void setShadowResourceRight(int i10) {
        setShadowDrawableRight(ContextCompat.getDrawable(getContext(), i10));
    }

    @Deprecated
    public void setSliderFadeColor(@ColorInt int i10) {
        this.mSliderFadeColor = i10;
    }

    @Deprecated
    public void smoothSlideClosed() {
        closePane();
    }

    @Deprecated
    public void smoothSlideOpen() {
        openPane();
    }

    public boolean smoothSlideTo(float f8, int i10) {
        int paddingLeft;
        if (!this.mCanSlide) {
            return false;
        }
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        LayoutParams layoutParams = (LayoutParams) this.mSlideableView.getLayoutParams();
        if (isLayoutRtlSupport) {
            int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            paddingLeft = (int) (getWidth() - (((f8 * this.mSlideRange) + paddingRight) + this.mSlideableView.getWidth()));
        } else {
            paddingLeft = (int) ((f8 * this.mSlideRange) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
        }
        ViewDragHelper viewDragHelper = this.mDragHelper;
        View view = this.mSlideableView;
        if (!viewDragHelper.smoothSlideViewTo(view, paddingLeft, view.getTop())) {
            return false;
        }
        setAllChildrenVisible();
        ViewCompat.postInvalidateOnAnimation(this);
        return true;
    }

    public void updateObscuredViewsVisibility(View view) {
        int paddingLeft;
        int width;
        int i10;
        int i11;
        int i12;
        int i13;
        View childAt;
        int i14;
        int i15;
        boolean z9;
        int i16;
        View view2 = view;
        boolean isLayoutRtlSupport = isLayoutRtlSupport();
        if (isLayoutRtlSupport) {
            paddingLeft = getWidth() - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (isLayoutRtlSupport) {
            width = getPaddingLeft();
        } else {
            width = getWidth() - getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 != null && viewIsOpaque(view2)) {
            i10 = view2.getLeft();
            i11 = view2.getRight();
            i12 = view2.getTop();
            i13 = view2.getBottom();
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        int childCount = getChildCount();
        int i17 = 0;
        while (i17 < childCount && (childAt = getChildAt(i17)) != view2) {
            if (childAt.getVisibility() == 8) {
                z9 = isLayoutRtlSupport;
            } else {
                if (isLayoutRtlSupport) {
                    i14 = width;
                } else {
                    i14 = paddingLeft;
                }
                int max = Math.max(i14, childAt.getLeft());
                int max2 = Math.max(paddingTop, childAt.getTop());
                if (isLayoutRtlSupport) {
                    i15 = paddingLeft;
                } else {
                    i15 = width;
                }
                z9 = isLayoutRtlSupport;
                int min = Math.min(i15, childAt.getRight());
                int min2 = Math.min(height, childAt.getBottom());
                if (max >= i10 && max2 >= i12 && min <= i11 && min2 <= i13) {
                    i16 = 4;
                } else {
                    i16 = 0;
                }
                childAt.setVisibility(i16);
            }
            i17++;
            view2 = view;
            isLayoutRtlSupport = z9;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        boolean isOpen;
        int mLockMode;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z9;
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.isOpen = z9;
            this.mLockMode = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.isOpen ? 1 : 0);
            parcel.writeInt(this.mLockMode);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class SimplePanelSlideListener implements PanelSlideListener {
        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelClosed(@NonNull View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelOpened(@NonNull View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelSlide(@NonNull View view, float f8) {
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int[] ATTRS = {R.attr.layout_weight};
        Paint dimPaint;
        boolean dimWhenOffset;
        boolean slideable;
        public float weight;

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.weight = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ATTRS);
            this.weight = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.weight = 0.0f;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.weight = 0.0f;
            this.weight = layoutParams.weight;
        }

        public LayoutParams() {
            super(-1, -1);
            this.weight = 0.0f;
        }
    }

    public boolean openPane() {
        return openPane(0);
    }

    public boolean closePane() {
        return closePane(0);
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(@NonNull Context context) {
        this(context, null);
    }
}
