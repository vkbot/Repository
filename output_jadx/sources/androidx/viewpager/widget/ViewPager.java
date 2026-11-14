package androidx.viewpager.widget;

import ai.onnxruntime.a;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import j1.i;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private int mActivePointerId;
    PagerAdapter mAdapter;
    private List<OnAdapterChangeListener> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<ItemInfo> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private PagerObserver mObserver;
    private int mOffscreenPageLimit;
    private OnPageChangeListener mOnPageChangeListener;
    private List<OnPageChangeListener> mOnPageChangeListeners;
    private int mPageMargin;
    private PageTransformer mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final ItemInfo mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    private static final Comparator<ItemInfo> COMPARATOR = new Comparator<ItemInfo>() { // from class: androidx.viewpager.widget.ViewPager.1
        @Override // java.util.Comparator
        public int compare(ItemInfo itemInfo, ItemInfo itemInfo2) {
            return itemInfo.position - itemInfo2.position;
        }
    };
    private static final Interpolator sInterpolator = new Interpolator() { // from class: androidx.viewpager.widget.ViewPager.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            float f10 = f8 - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    };
    private static final ViewPositionComparator sPositionComparator = new ViewPositionComparator();

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface DecorView {
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class ItemInfo {
        Object object;
        float offset;
        int position;
        boolean scrolling;
        float widthFactor;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public class MyAccessibilityDelegate extends AccessibilityDelegateCompat {
        public MyAccessibilityDelegate() {
        }

        private boolean canScroll() {
            PagerAdapter pagerAdapter = ViewPager.this.mAdapter;
            if (pagerAdapter != null && pagerAdapter.getCount() > 1) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            PagerAdapter pagerAdapter;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(canScroll());
            if (accessibilityEvent.getEventType() == 4096 && (pagerAdapter = ViewPager.this.mAdapter) != null) {
                accessibilityEvent.setItemCount(pagerAdapter.getCount());
                accessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
                accessibilityEvent.setToIndex(ViewPager.this.mCurItem);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
            accessibilityNodeInfoCompat.setScrollable(canScroll());
            if (ViewPager.this.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            if (i10 != 4096) {
                if (i10 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.mCurItem - 1);
                return true;
            }
            if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.mCurItem + 1);
            return true;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public interface OnAdapterChangeListener {
        void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i10);

        void onPageScrolled(int i10, float f8, @Px int i11);

        void onPageSelected(int i10);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public interface PageTransformer {
        void transformPage(@NonNull View view, float f8);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public class PagerObserver extends DataSetObserver {
        public PagerObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.dataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class ViewPositionComparator implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z9 = layoutParams.isDecor;
            if (z9 != layoutParams2.isDecor) {
                if (z9) {
                    return 1;
                }
                return -1;
            }
            return layoutParams.position - layoutParams2.position;
        }
    }

    public ViewPager(@NonNull Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mTempItem = new ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new Runnable() { // from class: androidx.viewpager.widget.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }

    private void calculatePageOffsets(ItemInfo itemInfo, int i10, ItemInfo itemInfo2) {
        float f8;
        float f10;
        float f11;
        int i11;
        int i12;
        ItemInfo itemInfo3;
        ItemInfo itemInfo4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f8 = this.mPageMargin / clientWidth;
        } else {
            f8 = 0.0f;
        }
        if (itemInfo2 != null) {
            int i13 = itemInfo2.position;
            int i14 = itemInfo.position;
            if (i13 < i14) {
                float f12 = itemInfo2.offset + itemInfo2.widthFactor + f8;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= itemInfo.position && i16 < this.mItems.size()) {
                    ItemInfo itemInfo5 = this.mItems.get(i16);
                    while (true) {
                        itemInfo4 = itemInfo5;
                        if (i15 <= itemInfo4.position || i16 >= this.mItems.size() - 1) {
                            break;
                        }
                        i16++;
                        itemInfo5 = this.mItems.get(i16);
                    }
                    while (i15 < itemInfo4.position) {
                        f12 += this.mAdapter.getPageWidth(i15) + f8;
                        i15++;
                    }
                    itemInfo4.offset = f12;
                    f12 += itemInfo4.widthFactor + f8;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.mItems.size() - 1;
                float f13 = itemInfo2.offset;
                while (true) {
                    i13--;
                    if (i13 < itemInfo.position || size < 0) {
                        break;
                    }
                    ItemInfo itemInfo6 = this.mItems.get(size);
                    while (true) {
                        itemInfo3 = itemInfo6;
                        if (i13 >= itemInfo3.position || size <= 0) {
                            break;
                        }
                        size--;
                        itemInfo6 = this.mItems.get(size);
                    }
                    while (i13 > itemInfo3.position) {
                        f13 -= this.mAdapter.getPageWidth(i13) + f8;
                        i13--;
                    }
                    f13 -= itemInfo3.widthFactor + f8;
                    itemInfo3.offset = f13;
                }
            }
        }
        int size2 = this.mItems.size();
        float f14 = itemInfo.offset;
        int i17 = itemInfo.position;
        int i18 = i17 - 1;
        if (i17 == 0) {
            f10 = f14;
        } else {
            f10 = -3.4028235E38f;
        }
        this.mFirstOffset = f10;
        int i19 = count - 1;
        if (i17 == i19) {
            f11 = (itemInfo.widthFactor + f14) - 1.0f;
        } else {
            f11 = Float.MAX_VALUE;
        }
        this.mLastOffset = f11;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            ItemInfo itemInfo7 = this.mItems.get(i20);
            while (true) {
                i12 = itemInfo7.position;
                if (i18 <= i12) {
                    break;
                }
                f14 -= this.mAdapter.getPageWidth(i18) + f8;
                i18--;
            }
            f14 -= itemInfo7.widthFactor + f8;
            itemInfo7.offset = f14;
            if (i12 == 0) {
                this.mFirstOffset = f14;
            }
            i20--;
            i18--;
        }
        float f15 = itemInfo.offset + itemInfo.widthFactor + f8;
        int i21 = itemInfo.position + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            ItemInfo itemInfo8 = this.mItems.get(i22);
            while (true) {
                i11 = itemInfo8.position;
                if (i21 >= i11) {
                    break;
                }
                f15 += this.mAdapter.getPageWidth(i21) + f8;
                i21++;
            }
            if (i11 == i19) {
                this.mLastOffset = (itemInfo8.widthFactor + f15) - 1.0f;
            }
            itemInfo8.offset = f15;
            f15 += itemInfo8.widthFactor + f8;
            i22++;
            i21++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    private void completeScroll(boolean z9) {
        boolean z10;
        if (this.mScrollState == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i10 = 0; i10 < this.mItems.size(); i10++) {
            ItemInfo itemInfo = this.mItems.get(i10);
            if (itemInfo.scrolling) {
                itemInfo.scrolling = false;
                z10 = true;
            }
        }
        if (z10) {
            Runnable runnable = this.mEndScrollRunnable;
            if (z9) {
                ViewCompat.postOnAnimation(this, runnable);
            } else {
                runnable.run();
            }
        }
    }

    private int determineTargetPage(int i10, float f8, int i11, int i12) {
        float f10;
        if (Math.abs(i12) > this.mFlingDistance && Math.abs(i11) > this.mMinimumVelocity) {
            if (i11 <= 0) {
                i10++;
            }
        } else {
            if (i10 >= this.mCurItem) {
                f10 = 0.4f;
            } else {
                f10 = 0.6f;
            }
            i10 += (int) (f8 + f10);
        }
        if (this.mItems.size() > 0) {
            return Math.max(this.mItems.get(0).position, Math.min(i10, this.mItems.get(r4.size() - 1).position));
        }
        return i10;
    }

    private void dispatchOnPageScrolled(int i10, float f8, int i11) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i10, f8, i11);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i12);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrolled(i10, f8, i11);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrolled(i10, f8, i11);
        }
    }

    private void dispatchOnPageSelected(int i10) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i10);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i11);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageSelected(i10);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageSelected(i10);
        }
    }

    private void dispatchOnScrollStateChanged(int i10) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i10);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i11);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrollStateChanged(i10);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrollStateChanged(i10);
        }
    }

    private void enableLayers(boolean z9) {
        int i10;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (z9) {
                i10 = this.mPageTransformerLayerType;
            } else {
                i10 = 0;
            }
            getChildAt(i11).setLayerType(i10, null);
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private ItemInfo infoForCurrentScrollPosition() {
        float f8;
        float f10;
        int i10;
        int clientWidth = getClientWidth();
        float f11 = 0.0f;
        if (clientWidth > 0) {
            f8 = getScrollX() / clientWidth;
        } else {
            f8 = 0.0f;
        }
        if (clientWidth > 0) {
            f10 = this.mPageMargin / clientWidth;
        } else {
            f10 = 0.0f;
        }
        int i11 = 0;
        boolean z9 = true;
        ItemInfo itemInfo = null;
        int i12 = -1;
        float f12 = 0.0f;
        while (i11 < this.mItems.size()) {
            ItemInfo itemInfo2 = this.mItems.get(i11);
            if (!z9 && itemInfo2.position != (i10 = i12 + 1)) {
                itemInfo2 = this.mTempItem;
                itemInfo2.offset = f11 + f12 + f10;
                itemInfo2.position = i10;
                itemInfo2.widthFactor = this.mAdapter.getPageWidth(i10);
                i11--;
            }
            ItemInfo itemInfo3 = itemInfo2;
            f11 = itemInfo3.offset;
            float f13 = itemInfo3.widthFactor + f11 + f10;
            if (!z9 && f8 < f11) {
                break;
            }
            if (f8 >= f13 && i11 != this.mItems.size() - 1) {
                int i13 = itemInfo3.position;
                float f14 = itemInfo3.widthFactor;
                i11++;
                i12 = i13;
                f12 = f14;
                itemInfo = itemInfo3;
                z9 = false;
            } else {
                return itemInfo3;
            }
        }
        return itemInfo;
    }

    private static boolean isDecorView(@NonNull View view) {
        if (view.getClass().getAnnotation(DecorView.class) != null) {
            return true;
        }
        return false;
    }

    private boolean isGutterDrag(float f8, float f10) {
        if (f8 >= this.mGutterSize || f10 <= 0.0f) {
            if (f8 > getWidth() - this.mGutterSize && f10 < 0.0f) {
                return true;
            }
            return false;
        }
        return true;
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.mLastMotionX = motionEvent.getX(i10);
            this.mActivePointerId = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean pageScrolled(int i10) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            i.l("onPageScrolled did not call superclass implementation");
            return false;
        }
        ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
        int clientWidth = getClientWidth();
        int i11 = this.mPageMargin;
        int i12 = clientWidth + i11;
        float f8 = clientWidth;
        int i13 = infoForCurrentScrollPosition.position;
        float f10 = ((i10 / f8) - infoForCurrentScrollPosition.offset) / (infoForCurrentScrollPosition.widthFactor + (i11 / f8));
        this.mCalledSuper = false;
        onPageScrolled(i13, f10, (int) (i12 * f10));
        if (this.mCalledSuper) {
            return true;
        }
        i.l("onPageScrolled did not call superclass implementation");
        return false;
    }

    private boolean performDrag(float f8) {
        boolean z9;
        boolean z10;
        float f10 = this.mLastMotionX - f8;
        this.mLastMotionX = f8;
        float scrollX = getScrollX() + f10;
        float clientWidth = getClientWidth();
        float f11 = this.mFirstOffset * clientWidth;
        float f12 = this.mLastOffset * clientWidth;
        boolean z11 = false;
        ItemInfo itemInfo = this.mItems.get(0);
        ArrayList<ItemInfo> arrayList = this.mItems;
        ItemInfo itemInfo2 = arrayList.get(arrayList.size() - 1);
        if (itemInfo.position != 0) {
            f11 = itemInfo.offset * clientWidth;
            z9 = false;
        } else {
            z9 = true;
        }
        if (itemInfo2.position != this.mAdapter.getCount() - 1) {
            f12 = itemInfo2.offset * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (scrollX < f11) {
            if (z9) {
                this.mLeftEdge.onPull(Math.abs(f11 - scrollX) / clientWidth);
                z11 = true;
            }
            scrollX = f11;
        } else if (scrollX > f12) {
            if (z10) {
                this.mRightEdge.onPull(Math.abs(scrollX - f12) / clientWidth);
                z11 = true;
            }
            scrollX = f12;
        }
        int i10 = (int) scrollX;
        this.mLastMotionX = (scrollX - i10) + this.mLastMotionX;
        scrollTo(i10, getScrollY());
        pageScrolled(i10);
        return z11;
    }

    private void recomputeScrollPosition(int i10, int i11, int i12, int i13) {
        float f8;
        if (i11 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
            return;
        }
        ItemInfo infoForPosition = infoForPosition(this.mCurItem);
        if (infoForPosition != null) {
            f8 = Math.min(infoForPosition.offset, this.mLastOffset);
        } else {
            f8 = 0.0f;
        }
        int paddingLeft = (int) (f8 * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            completeScroll(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    private void removeNonDecorViews() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i10).getLayoutParams()).isDecor) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z9) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z9);
        }
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        if (!this.mLeftEdge.isFinished() && !this.mRightEdge.isFinished()) {
            return false;
        }
        return true;
    }

    private void scrollToItem(int i10, boolean z9, int i11, boolean z10) {
        int i12;
        ItemInfo infoForPosition = infoForPosition(i10);
        if (infoForPosition != null) {
            i12 = (int) (Math.max(this.mFirstOffset, Math.min(infoForPosition.offset, this.mLastOffset)) * getClientWidth());
        } else {
            i12 = 0;
        }
        if (z9) {
            smoothScrollTo(i12, 0, i11);
            if (z10) {
                dispatchOnPageSelected(i10);
                return;
            }
            return;
        }
        if (z10) {
            dispatchOnPageSelected(i10);
        }
        completeScroll(false);
        scrollTo(i12, 0);
        pageScrolled(i12);
    }

    private void setScrollingCacheEnabled(boolean z9) {
        if (this.mScrollingCacheEnabled != z9) {
            this.mScrollingCacheEnabled = z9;
        }
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.mDrawingOrderedChildren.add(getChildAt(i10));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        ItemInfo infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.position == this.mCurItem) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    public ItemInfo addNewItem(int i10, int i11) {
        ItemInfo itemInfo = new ItemInfo();
        itemInfo.position = i10;
        itemInfo.object = this.mAdapter.instantiateItem((ViewGroup) this, i10);
        itemInfo.widthFactor = this.mAdapter.getPageWidth(i10);
        if (i11 >= 0 && i11 < this.mItems.size()) {
            this.mItems.add(i11, itemInfo);
            return itemInfo;
        }
        this.mItems.add(itemInfo);
        return itemInfo;
    }

    public void addOnAdapterChangeListener(@NonNull OnAdapterChangeListener onAdapterChangeListener) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(onAdapterChangeListener);
    }

    public void addOnPageChangeListener(@NonNull OnPageChangeListener onPageChangeListener) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(onPageChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        ItemInfo infoForChild;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.position == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean isDecorView = layoutParams2.isDecor | isDecorView(view);
        layoutParams2.isDecor = isDecorView;
        if (this.mInLayout) {
            if (!isDecorView) {
                layoutParams2.needsMeasure = true;
                addViewInLayout(view, i10, layoutParams);
                return;
            } else {
                i.l("Cannot add pager decor view during layout");
                return;
            }
        }
        super.addView(view, i10, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean arrowScroll(int r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L9
        L7:
            r0 = r1
            goto L58
        L9:
            if (r0 == 0) goto L58
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r4) goto L16
            goto L58
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.String r0 = r2.concat(r0)
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L58:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto La8
            if (r1 == r0) goto La8
            if (r5 != r3) goto L88
            android.graphics.Rect r2 = r4.mTempRect
            android.graphics.Rect r2 = r4.getChildRectInPagerCoordinates(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.mTempRect
            android.graphics.Rect r3 = r4.getChildRectInPagerCoordinates(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L83
            if (r2 < r3) goto L83
            boolean r0 = r4.pageLeft()
            goto Lbf
        L83:
            boolean r0 = r1.requestFocus()
            goto Lbf
        L88:
            if (r5 != r2) goto Lb4
            android.graphics.Rect r2 = r4.mTempRect
            android.graphics.Rect r2 = r4.getChildRectInPagerCoordinates(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.mTempRect
            android.graphics.Rect r3 = r4.getChildRectInPagerCoordinates(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto La3
            if (r2 > r3) goto La3
            boolean r0 = r4.pageRight()
            goto Lbf
        La3:
            boolean r0 = r1.requestFocus()
            goto Lbf
        La8:
            if (r5 == r3) goto Lbb
            r0 = 1
            if (r5 != r0) goto Lae
            goto Lbb
        Lae:
            if (r5 == r2) goto Lb6
            r0 = 2
            if (r5 != r0) goto Lb4
            goto Lb6
        Lb4:
            r0 = 0
            goto Lbf
        Lb6:
            boolean r0 = r4.pageRight()
            goto Lbf
        Lbb:
            boolean r0 = r4.pageLeft()
        Lbf:
            if (r0 == 0) goto Lc8
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Lc8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.arrowScroll(int):boolean");
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
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
        if (z9 && view.canScrollHorizontally(-i10)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            if (scrollX <= ((int) (clientWidth * this.mFirstOffset))) {
                return false;
            }
            return true;
        }
        if (i10 <= 0 || scrollX >= ((int) (clientWidth * this.mLastOffset))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    public void clearOnPageChangeListeners() {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!pageScrolled(currX)) {
                    this.mScroller.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            ViewCompat.postInvalidateOnAnimation(this);
            return;
        }
        completeScroll(true);
    }

    public void dataSetChanged() {
        boolean z9;
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        if (this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i10 = this.mCurItem;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < this.mItems.size()) {
            ItemInfo itemInfo = this.mItems.get(i11);
            int itemPosition = this.mAdapter.getItemPosition(itemInfo.object);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i11);
                    i11--;
                    if (!z10) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z10 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
                    int i12 = this.mCurItem;
                    if (i12 == itemInfo.position) {
                        i10 = Math.max(0, Math.min(i12, count - 1));
                    }
                } else {
                    int i13 = itemInfo.position;
                    if (i13 != itemPosition) {
                        if (i13 == this.mCurItem) {
                            i10 = itemPosition;
                        }
                        itemInfo.position = itemPosition;
                    }
                }
                z9 = true;
            }
            i11++;
        }
        if (z10) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z9) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i14).getLayoutParams();
                if (!layoutParams.isDecor) {
                    layoutParams.widthFactor = 0.0f;
                }
            }
            setCurrentItemInternal(i10, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !executeKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ItemInfo infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.position == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public float distanceInfluenceForSnapDuration(float f8) {
        return (float) Math.sin((f8 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z9 = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (pagerAdapter = this.mAdapter) == null || pagerAdapter.getCount() <= 1)) {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        } else {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                z9 = this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                z9 |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z9) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public void endFakeDrag() {
        if (this.mFakeDragging) {
            if (this.mAdapter != null) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.position, ((scrollX / clientWidth) - infoForCurrentScrollPosition.offset) / infoForCurrentScrollPosition.widthFactor, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
            }
            endDrag();
            this.mFakeDragging = false;
            return;
        }
        i.l("No fake drag in progress. Call beginFakeDrag first.");
    }

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return arrowScroll(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return arrowScroll(1);
                        }
                        return false;
                    }
                    return false;
                }
                if (keyEvent.hasModifiers(2)) {
                    return pageRight();
                }
                return arrowScroll(66);
            }
            if (keyEvent.hasModifiers(2)) {
                return pageLeft();
            }
            return arrowScroll(17);
        }
        return false;
    }

    public void fakeDragBy(float f8) {
        if (this.mFakeDragging) {
            if (this.mAdapter == null) {
                return;
            }
            this.mLastMotionX += f8;
            float scrollX = getScrollX() - f8;
            float clientWidth = getClientWidth();
            float f10 = this.mFirstOffset * clientWidth;
            float f11 = this.mLastOffset * clientWidth;
            ItemInfo itemInfo = this.mItems.get(0);
            ItemInfo itemInfo2 = this.mItems.get(r4.size() - 1);
            if (itemInfo.position != 0) {
                f10 = itemInfo.offset * clientWidth;
            }
            if (itemInfo2.position != this.mAdapter.getCount() - 1) {
                f11 = itemInfo2.offset * clientWidth;
            }
            if (scrollX < f10) {
                scrollX = f10;
            } else if (scrollX > f11) {
                scrollX = f11;
            }
            int i10 = (int) scrollX;
            this.mLastMotionX = (scrollX - i10) + this.mLastMotionX;
            scrollTo(i10, getScrollY());
            pageScrolled(i10);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
            return;
        }
        i.l("No fake drag in progress. Call beginFakeDrag first.");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Nullable
    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.mDrawingOrder == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((LayoutParams) this.mDrawingOrderedChildren.get(i11).getLayoutParams()).childIndex;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public ItemInfo infoForAnyChild(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent != null && (parent instanceof View)) {
                    view = (View) parent;
                } else {
                    return null;
                }
            } else {
                return infoForChild(view);
            }
        }
    }

    public ItemInfo infoForChild(View view) {
        for (int i10 = 0; i10 < this.mItems.size(); i10++) {
            ItemInfo itemInfo = this.mItems.get(i10);
            if (this.mAdapter.isViewFromObject(view, itemInfo.object)) {
                return itemInfo;
            }
        }
        return null;
    }

    public ItemInfo infoForPosition(int i10) {
        for (int i11 = 0; i11 < this.mItems.size(); i11++) {
            ItemInfo itemInfo = this.mItems.get(i11);
            if (itemInfo.position == i10) {
                return itemInfo;
            }
        }
        return null;
    }

    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f8);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f8);
        this.mCloseEnough = (int) (2.0f * f8);
        this.mDefaultGutterSize = (int) (f8 * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new MyAccessibilityDelegate());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: androidx.viewpager.widget.ViewPager.4
            private final Rect mTempRect = new Rect();

            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat onApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                if (onApplyWindowInsets.isConsumed()) {
                    return onApplyWindowInsets;
                }
                Rect rect = this.mTempRect;
                rect.left = onApplyWindowInsets.getSystemWindowInsetLeft();
                rect.top = onApplyWindowInsets.getSystemWindowInsetTop();
                rect.right = onApplyWindowInsets.getSystemWindowInsetRight();
                rect.bottom = onApplyWindowInsets.getSystemWindowInsetBottom();
                int childCount = ViewPager.this.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    WindowInsetsCompat dispatchApplyWindowInsets = ViewCompat.dispatchApplyWindowInsets(ViewPager.this.getChildAt(i10), onApplyWindowInsets);
                    rect.left = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
                    rect.top = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
                    rect.right = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
                    rect.bottom = Math.min(dispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
                }
                return onApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        float f8;
        int i11;
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            int scrollX = getScrollX();
            float width = getWidth();
            float f10 = this.mPageMargin / width;
            int i12 = 0;
            ItemInfo itemInfo = this.mItems.get(0);
            float f11 = itemInfo.offset;
            int size = this.mItems.size();
            int i13 = itemInfo.position;
            int i14 = this.mItems.get(size - 1).position;
            while (i13 < i14) {
                while (true) {
                    i10 = itemInfo.position;
                    if (i13 <= i10 || i12 >= size) {
                        break;
                    }
                    i12++;
                    itemInfo = this.mItems.get(i12);
                }
                if (i13 == i10) {
                    float f12 = itemInfo.offset;
                    float f13 = itemInfo.widthFactor;
                    f8 = (f12 + f13) * width;
                    f11 = f12 + f13 + f10;
                } else {
                    float pageWidth = this.mAdapter.getPageWidth(i13);
                    f8 = (f11 + pageWidth) * width;
                    f11 = pageWidth + f10 + f11;
                }
                if (this.mPageMargin + f8 > scrollX) {
                    i11 = scrollX;
                    this.mMarginDrawable.setBounds(Math.round(f8), this.mTopPageBounds, Math.round(this.mPageMargin + f8), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                } else {
                    i11 = scrollX;
                }
                if (f8 <= i11 + r2) {
                    i13++;
                    scrollX = i11;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f8;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.mIsBeingDragged) {
                    return true;
                }
                if (this.mIsUnableToDrag) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        onSecondaryPointerUp(motionEvent);
                    }
                } else {
                    int i10 = this.mActivePointerId;
                    if (i10 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x9 = motionEvent.getX(findPointerIndex);
                        float f10 = x9 - this.mLastMotionX;
                        float abs = Math.abs(f10);
                        float y9 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y9 - this.mInitialMotionY);
                        if (f10 != 0.0f && !isGutterDrag(this.mLastMotionX, f10) && canScroll(this, false, (int) f10, (int) x9, (int) y9)) {
                            this.mLastMotionX = x9;
                            this.mLastMotionY = y9;
                            this.mIsUnableToDrag = true;
                            return false;
                        }
                        int i11 = this.mTouchSlop;
                        if (abs > i11 && abs * 0.5f > abs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            setScrollState(1);
                            float f11 = this.mInitialMotionX;
                            float f12 = this.mTouchSlop;
                            if (f10 > 0.0f) {
                                f8 = f11 + f12;
                            } else {
                                f8 = f11 - f12;
                            }
                            this.mLastMotionX = f8;
                            this.mLastMotionY = y9;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > i11) {
                            this.mIsUnableToDrag = true;
                        }
                        if (this.mIsBeingDragged && performDrag(x9)) {
                            ViewCompat.postInvalidateOnAnimation(this);
                        }
                    }
                }
            } else {
                float x10 = motionEvent.getX();
                this.mInitialMotionX = x10;
                this.mLastMotionX = x10;
                float y10 = motionEvent.getY();
                this.mInitialMotionY = y10;
                this.mLastMotionY = y10;
                this.mActivePointerId = motionEvent.getPointerId(0);
                this.mIsUnableToDrag = false;
                this.mIsScrollStarted = true;
                this.mScroller.computeScrollOffset();
                if (this.mScrollState == 2 && Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough) {
                    this.mScroller.abortAnimation();
                    this.mPopulatePending = false;
                    populate();
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                } else {
                    completeScroll(false);
                    this.mIsBeingDragged = false;
                }
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            return this.mIsBeingDragged;
        }
        resetTouch();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        boolean z9;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = BasicMeasure.EXACTLY;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.isDecor) {
                int i15 = layoutParams2.gravity;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                if (i17 != 48 && i17 != 80) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z9) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else if (z10) {
                    i12 = 1073741824;
                } else {
                    i12 = Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i20 != -2) {
                    if (i20 == -1) {
                        i20 = measuredHeight;
                    }
                } else {
                    i20 = measuredHeight;
                    i14 = i12;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z9) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, BasicMeasure.EXACTLY);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, BasicMeasure.EXACTLY);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.isDecor)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.widthFactor), BasicMeasure.EXACTLY), this.mChildHeightMeasureSpec);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPageScrolled(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.mDecorChildCount
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6c
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6c
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.isDecor
            if (r10 != 0) goto L2c
            goto L69
        L2c:
            int r9 = r9.gravity
            r9 = r9 & 7
            if (r9 == r2) goto L50
            r10 = 3
            if (r9 == r10) goto L4a
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5d
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
        L46:
            r11 = r9
            r9 = r3
            r3 = r11
            goto L5d
        L4a:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5d
        L50:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
            goto L46
        L5d:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L68
            r8.offsetLeftAndRight(r3)
        L68:
            r3 = r9
        L69:
            int r7 = r7 + 1
            goto L1b
        L6c:
            r12.dispatchOnPageScrolled(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$PageTransformer r13 = r12.mPageTransformer
            if (r13 == 0) goto La0
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7b:
            if (r1 >= r14) goto La0
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r0 = r0.isDecor
            if (r0 == 0) goto L8c
            goto L9d
        L8c:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$PageTransformer r3 = r12.mPageTransformer
            r3.transformPage(r15, r0)
        L9d:
            int r1 = r1 + 1
            goto L7b
        La0:
            r12.mCalledSuper = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onPageScrolled(int, float, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        ItemInfo infoForChild;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.position == this.mCurItem && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.adapterState, savedState.loader);
            setCurrentItemInternal(savedState.position, false, true);
        } else {
            this.mRestoredCurItem = savedState.position;
            this.mRestoredAdapterState = savedState.adapterState;
            this.mRestoredClassLoader = savedState.loader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.position = this.mCurItem;
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            savedState.adapterState = pagerAdapter.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.mPageMargin;
            recomputeScrollPosition(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        float f8;
        if (this.mFakeDragging) {
            return true;
        }
        boolean z9 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.mAdapter) == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                onSecondaryPointerUp(motionEvent);
                                this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.mLastMotionX = motionEvent.getX(actionIndex);
                            this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (this.mIsBeingDragged) {
                        scrollToItem(this.mCurItem, true, 0, false);
                        z9 = resetTouch();
                    }
                } else {
                    if (!this.mIsBeingDragged) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                        if (findPointerIndex == -1) {
                            z9 = resetTouch();
                        } else {
                            float x9 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x9 - this.mLastMotionX);
                            float y9 = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y9 - this.mLastMotionY);
                            if (abs > this.mTouchSlop && abs > abs2) {
                                this.mIsBeingDragged = true;
                                requestParentDisallowInterceptTouchEvent(true);
                                float f10 = this.mInitialMotionX;
                                float f11 = x9 - f10;
                                int i10 = this.mTouchSlop;
                                if (f11 > 0.0f) {
                                    f8 = f10 + i10;
                                } else {
                                    f8 = f10 - i10;
                                }
                                this.mLastMotionX = f8;
                                this.mLastMotionY = y9;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.mIsBeingDragged) {
                        z9 = performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                    }
                }
            } else if (this.mIsBeingDragged) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                ItemInfo infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                float f12 = clientWidth;
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.position, ((scrollX / f12) - infoForCurrentScrollPosition.offset) / (infoForCurrentScrollPosition.widthFactor + (this.mPageMargin / f12)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
                z9 = resetTouch();
            }
        } else {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            float x10 = motionEvent.getX();
            this.mInitialMotionX = x10;
            this.mLastMotionX = x10;
            float y10 = motionEvent.getY();
            this.mInitialMotionY = y10;
            this.mLastMotionY = y10;
            this.mActivePointerId = motionEvent.getPointerId(0);
        }
        if (z9) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        return true;
    }

    public boolean pageLeft() {
        int i10 = this.mCurItem;
        if (i10 > 0) {
            setCurrentItem(i10 - 1, true);
            return true;
        }
        return false;
    }

    public boolean pageRight() {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null && this.mCurItem < pagerAdapter.getCount() - 1) {
            setCurrentItem(this.mCurItem + 1, true);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r9 == r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void populate(int r18) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.populate(int):void");
    }

    public void removeOnAdapterChangeListener(@NonNull OnAdapterChangeListener onAdapterChangeListener) {
        List<OnAdapterChangeListener> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(onAdapterChangeListener);
        }
    }

    public void removeOnPageChangeListener(@NonNull OnPageChangeListener onPageChangeListener) {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(@Nullable PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.mAdapter;
        if (pagerAdapter2 != null) {
            pagerAdapter2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i10 = 0; i10 < this.mItems.size(); i10++) {
                ItemInfo itemInfo = this.mItems.get(i10);
                this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.mAdapter;
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (pagerAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new PagerObserver();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z9 = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z9) {
                populate();
            } else {
                requestLayout();
            }
        }
        List<OnAdapterChangeListener> list = this.mAdapterChangeListeners;
        if (list != null && !list.isEmpty()) {
            int size = this.mAdapterChangeListeners.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.mAdapterChangeListeners.get(i11).onAdapterChanged(this, pagerAdapter3, pagerAdapter);
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i10, !this.mFirstLayout, false);
    }

    public void setCurrentItemInternal(int i10, boolean z9, boolean z10, int i11) {
        PagerAdapter pagerAdapter = this.mAdapter;
        boolean z11 = false;
        if (pagerAdapter != null && pagerAdapter.getCount() > 0) {
            if (!z10 && this.mCurItem == i10 && this.mItems.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.mAdapter.getCount()) {
                i10 = this.mAdapter.getCount() - 1;
            }
            int i12 = this.mOffscreenPageLimit;
            int i13 = this.mCurItem;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.mItems.size(); i14++) {
                    this.mItems.get(i14).scrolling = true;
                }
            }
            if (this.mCurItem != i10) {
                z11 = true;
            }
            if (this.mFirstLayout) {
                this.mCurItem = i10;
                if (z11) {
                    dispatchOnPageSelected(i10);
                }
                requestLayout();
                return;
            }
            populate(i10);
            scrollToItem(i10, z9, i11, z11);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onPageChangeListener) {
        OnPageChangeListener onPageChangeListener2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = onPageChangeListener;
        return onPageChangeListener2;
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w(TAG, "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i10;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
    }

    public void setPageMargin(int i10) {
        int i11 = this.mPageMargin;
        this.mPageMargin = i10;
        int width = getWidth();
        recomputeScrollPosition(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        boolean z9;
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        if (drawable == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        setWillNotDraw(z9);
        invalidate();
    }

    public void setPageTransformer(boolean z9, @Nullable PageTransformer pageTransformer, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i11 = 1;
        if (pageTransformer != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.mPageTransformer != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.mPageTransformer = pageTransformer;
        setChildrenDrawingOrderEnabled(z10);
        if (z10) {
            if (z9) {
                i11 = 2;
            }
            this.mDrawingOrder = i11;
            this.mPageTransformerLayerType = i10;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z12) {
            populate();
        }
    }

    public void setScrollState(int i10) {
        boolean z9;
        if (this.mScrollState == i10) {
            return;
        }
        this.mScrollState = i10;
        if (this.mPageTransformer != null) {
            if (i10 != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            enableLayers(z9);
        }
        dispatchOnScrollStateChanged(i10);
    }

    public void smoothScrollTo(int i10, int i11, int i12) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            boolean z9 = this.mIsScrollStarted;
            Scroller scroller2 = this.mScroller;
            if (z9) {
                scrollX = scroller2.getCurrX();
            } else {
                scrollX = scroller2.getStartX();
            }
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f8 = clientWidth;
        float f10 = i16;
        float distanceInfluenceForSnapDuration = (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f8)) * f10) + f10;
        int abs2 = Math.abs(i12);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i14) / ((this.mAdapter.getPageWidth(this.mCurItem) * f8) + this.mPageMargin)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i13, scrollY, i14, i15, min);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.mMarginDrawable) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setCurrentItem(int i10, boolean z9) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i10, z9, false);
    }

    public void setPageMarginDrawable(@DrawableRes int i10) {
        setPageMarginDrawable(ContextCompat.getDrawable(getContext(), i10));
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f8, int i11) {
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {
        int childIndex;
        public int gravity;
        public boolean isDecor;
        boolean needsMeasure;
        int position;
        float widthFactor;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.widthFactor = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.gravity = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -1);
            this.widthFactor = 0.0f;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.viewpager.widget.ViewPager.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };
        Parcelable adapterState;
        ClassLoader loader;
        int position;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.position = parcel.readInt();
            this.adapterState = parcel.readParcelable(classLoader);
            this.loader = classLoader;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return a.o(sb, "}", this.position);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.position);
            parcel.writeParcelable(this.adapterState, i10);
        }

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setPageTransformer(boolean z9, @Nullable PageTransformer pageTransformer) {
        setPageTransformer(z9, pageTransformer, 2);
    }

    public ViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new Runnable() { // from class: androidx.viewpager.widget.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }

    public void setCurrentItemInternal(int i10, boolean z9, boolean z10) {
        setCurrentItemInternal(i10, z9, z10, 0);
    }

    public void smoothScrollTo(int i10, int i11) {
        smoothScrollTo(i10, i11, 0);
    }

    public void populate() {
        populate(this.mCurItem);
    }
}
