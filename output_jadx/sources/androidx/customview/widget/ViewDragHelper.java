package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import androidx.navigation.b;
import j1.i;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class ViewDragHelper {
    private static final int BASE_SETTLE_DURATION = 256;
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    private static final int EDGE_SIZE = 20;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "ViewDragHelper";
    private static final Interpolator sInterpolator = new Interpolator() { // from class: androidx.customview.widget.ViewDragHelper.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            float f10 = f8 - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    };
    private final Callback mCallback;
    private View mCapturedView;
    private final int mDefaultEdgeSize;
    private int mDragState;
    private int[] mEdgeDragsInProgress;
    private int[] mEdgeDragsLocked;
    private int mEdgeSize;
    private int[] mInitialEdgesTouched;
    private float[] mInitialMotionX;
    private float[] mInitialMotionY;
    private float[] mLastMotionX;
    private float[] mLastMotionY;
    private float mMaxVelocity;
    private float mMinVelocity;
    private final ViewGroup mParentView;
    private int mPointersDown;
    private boolean mReleaseInProgress;
    private OverScroller mScroller;
    private int mTouchSlop;
    private int mTrackingEdges;
    private VelocityTracker mVelocityTracker;
    private int mActivePointerId = -1;
    private final Runnable mSetIdleRunnable = new Runnable() { // from class: androidx.customview.widget.ViewDragHelper.2
        @Override // java.lang.Runnable
        public void run() {
            ViewDragHelper.this.setDragState(0);
        }
    };

    private ViewDragHelper(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull Callback callback) {
        if (viewGroup != null) {
            if (callback != null) {
                this.mParentView = viewGroup;
                this.mCallback = callback;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.mDefaultEdgeSize = i10;
                this.mEdgeSize = i10;
                this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
                this.mMaxVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                this.mMinVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                this.mScroller = new OverScroller(context, sInterpolator);
                return;
            }
            i.k("Callback may not be null");
            throw null;
        }
        i.k("Parent view may not be null");
        throw null;
    }

    private boolean checkNewEdgeDrag(float f8, float f10, int i10, int i11) {
        float abs = Math.abs(f8);
        float abs2 = Math.abs(f10);
        if ((this.mInitialEdgesTouched[i10] & i11) == i11 && (this.mTrackingEdges & i11) != 0 && (this.mEdgeDragsLocked[i10] & i11) != i11 && (this.mEdgeDragsInProgress[i10] & i11) != i11) {
            int i12 = this.mTouchSlop;
            if (abs > i12 || abs2 > i12) {
                if (abs < abs2 * 0.5f && this.mCallback.onEdgeLock(i11)) {
                    int[] iArr = this.mEdgeDragsLocked;
                    iArr[i10] = iArr[i10] | i11;
                    return false;
                }
                if ((this.mEdgeDragsInProgress[i10] & i11) == 0 && abs > this.mTouchSlop) {
                    return true;
                }
            }
        }
        return false;
    }

    private float clampMag(float f8, float f10, float f11) {
        float abs = Math.abs(f8);
        if (abs < f10) {
            return 0.0f;
        }
        if (abs > f11) {
            if (f8 > 0.0f) {
                return f11;
            }
            return -f11;
        }
        return f8;
    }

    private void clearMotionHistory(int i10) {
        if (this.mInitialMotionX != null && isPointerDown(i10)) {
            this.mInitialMotionX[i10] = 0.0f;
            this.mInitialMotionY[i10] = 0.0f;
            this.mLastMotionX[i10] = 0.0f;
            this.mLastMotionY[i10] = 0.0f;
            this.mInitialEdgesTouched[i10] = 0;
            this.mEdgeDragsInProgress[i10] = 0;
            this.mEdgeDragsLocked[i10] = 0;
            this.mPointersDown = (~(1 << i10)) & this.mPointersDown;
        }
    }

    private int computeAxisDuration(int i10, int i11, int i12) {
        int abs;
        if (i10 == 0) {
            return 0;
        }
        int width = this.mParentView.getWidth();
        float f8 = width / 2;
        float distanceInfluenceForSnapDuration = (distanceInfluenceForSnapDuration(Math.min(1.0f, Math.abs(i10) / width)) * f8) + f8;
        int abs2 = Math.abs(i11);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    private int computeSettleDuration(View view, int i10, int i11, int i12, int i13) {
        float f8;
        float f10;
        float f11;
        float f12;
        int clampMag = clampMag(i12, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int clampMag2 = clampMag(i13, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int abs = Math.abs(i10);
        int abs2 = Math.abs(i11);
        int abs3 = Math.abs(clampMag);
        int abs4 = Math.abs(clampMag2);
        int i14 = abs3 + abs4;
        int i15 = abs + abs2;
        if (clampMag != 0) {
            f8 = abs3;
            f10 = i14;
        } else {
            f8 = abs;
            f10 = i15;
        }
        float f13 = f8 / f10;
        if (clampMag2 != 0) {
            f11 = abs4;
            f12 = i14;
        } else {
            f11 = abs2;
            f12 = i15;
        }
        return (int) ((computeAxisDuration(i11, clampMag2, this.mCallback.getViewVerticalDragRange(view)) * (f11 / f12)) + (computeAxisDuration(i10, clampMag, this.mCallback.getViewHorizontalDragRange(view)) * f13));
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, float f8, @NonNull Callback callback) {
        ViewDragHelper create = create(viewGroup, callback);
        create.mTouchSlop = (int) ((1.0f / f8) * create.mTouchSlop);
        return create;
    }

    private void dispatchViewReleased(float f8, float f10) {
        this.mReleaseInProgress = true;
        this.mCallback.onViewReleased(this.mCapturedView, f8, f10);
        this.mReleaseInProgress = false;
        if (this.mDragState == 1) {
            setDragState(0);
        }
    }

    private float distanceInfluenceForSnapDuration(float f8) {
        return (float) Math.sin((f8 - 0.5f) * 0.47123894f);
    }

    private void dragTo(int i10, int i11, int i12, int i13) {
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        if (i12 != 0) {
            i10 = this.mCallback.clampViewPositionHorizontal(this.mCapturedView, i10, i12);
            ViewCompat.offsetLeftAndRight(this.mCapturedView, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.mCallback.clampViewPositionVertical(this.mCapturedView, i11, i13);
            ViewCompat.offsetTopAndBottom(this.mCapturedView, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.mCallback.onViewPositionChanged(this.mCapturedView, i14, i15, i14 - left, i15 - top);
    }

    private void ensureMotionHistorySizeForId(int i10) {
        float[] fArr = this.mInitialMotionX;
        if (fArr != null && fArr.length > i10) {
            return;
        }
        int i11 = i10 + 1;
        float[] fArr2 = new float[i11];
        float[] fArr3 = new float[i11];
        float[] fArr4 = new float[i11];
        float[] fArr5 = new float[i11];
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        if (fArr != null) {
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            float[] fArr6 = this.mInitialMotionY;
            System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
            float[] fArr7 = this.mLastMotionX;
            System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
            float[] fArr8 = this.mLastMotionY;
            System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
            int[] iArr4 = this.mInitialEdgesTouched;
            System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
            int[] iArr5 = this.mEdgeDragsInProgress;
            System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
            int[] iArr6 = this.mEdgeDragsLocked;
            System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
        }
        this.mInitialMotionX = fArr2;
        this.mInitialMotionY = fArr3;
        this.mLastMotionX = fArr4;
        this.mLastMotionY = fArr5;
        this.mInitialEdgesTouched = iArr;
        this.mEdgeDragsInProgress = iArr2;
        this.mEdgeDragsLocked = iArr3;
    }

    private boolean forceSettleCapturedViewAt(int i10, int i11, int i12, int i13) {
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.mScroller.abortAnimation();
            setDragState(0);
            return false;
        }
        this.mScroller.startScroll(left, top, i14, i15, computeSettleDuration(this.mCapturedView, i14, i15, i12, i13));
        setDragState(2);
        return true;
    }

    private int getEdgesTouched(int i10, int i11) {
        int i12;
        if (i10 < this.mParentView.getLeft() + this.mEdgeSize) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        if (i11 < this.mParentView.getTop() + this.mEdgeSize) {
            i12 |= 4;
        }
        if (i10 > this.mParentView.getRight() - this.mEdgeSize) {
            i12 |= 2;
        }
        if (i11 > this.mParentView.getBottom() - this.mEdgeSize) {
            return i12 | 8;
        }
        return i12;
    }

    private boolean isValidPointerForActionMove(int i10) {
        if (!isPointerDown(i10)) {
            Log.e(TAG, "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }

    private void releaseViewForPointerUp() {
        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxVelocity);
        dispatchViewReleased(clampMag(this.mVelocityTracker.getXVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity), clampMag(this.mVelocityTracker.getYVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.ViewDragHelper$Callback] */
    private void reportNewEdgeDrags(float f8, float f10, int i10) {
        boolean checkNewEdgeDrag = checkNewEdgeDrag(f8, f10, i10, 1);
        boolean z9 = checkNewEdgeDrag;
        if (checkNewEdgeDrag(f10, f8, i10, 4)) {
            z9 = (checkNewEdgeDrag ? 1 : 0) | 4;
        }
        boolean z10 = z9;
        if (checkNewEdgeDrag(f8, f10, i10, 2)) {
            z10 = (z9 ? 1 : 0) | 2;
        }
        ?? r02 = z10;
        if (checkNewEdgeDrag(f10, f8, i10, 8)) {
            r02 = (z10 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.mEdgeDragsInProgress;
            iArr[i10] = iArr[i10] | r02;
            this.mCallback.onEdgeDragStarted(r02, i10);
        }
    }

    private void saveInitialMotion(float f8, float f10, int i10) {
        ensureMotionHistorySizeForId(i10);
        float[] fArr = this.mInitialMotionX;
        this.mLastMotionX[i10] = f8;
        fArr[i10] = f8;
        float[] fArr2 = this.mInitialMotionY;
        this.mLastMotionY[i10] = f10;
        fArr2[i10] = f10;
        this.mInitialEdgesTouched[i10] = getEdgesTouched((int) f8, (int) f10);
        this.mPointersDown |= 1 << i10;
    }

    private void saveLastMotion(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (isValidPointerForActionMove(pointerId)) {
                float x9 = motionEvent.getX(i10);
                float y9 = motionEvent.getY(i10);
                this.mLastMotionX[pointerId] = x9;
                this.mLastMotionY[pointerId] = y9;
            }
        }
    }

    public void abort() {
        cancel();
        if (this.mDragState == 2) {
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            this.mScroller.abortAnimation();
            int currX2 = this.mScroller.getCurrX();
            int currY2 = this.mScroller.getCurrY();
            this.mCallback.onViewPositionChanged(this.mCapturedView, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        setDragState(0);
    }

    public boolean canScroll(@NonNull View view, boolean z9, int i10, int i11, int i12, int i13) {
        int i14;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i15 = i12 + scrollX;
                if (i15 >= childAt.getLeft() && i15 < childAt.getRight() && (i14 = i13 + scrollY) >= childAt.getTop() && i14 < childAt.getBottom() && canScroll(childAt, true, i10, i11, i15 - childAt.getLeft(), i14 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z9) {
            if (view.canScrollHorizontally(-i10) || view.canScrollVertically(-i11)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void cancel() {
        this.mActivePointerId = -1;
        clearMotionHistory();
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    public void captureChildView(@NonNull View view, int i10) {
        if (view.getParent() == this.mParentView) {
            this.mCapturedView = view;
            this.mActivePointerId = i10;
            this.mCallback.onViewCaptured(view, i10);
            setDragState(1);
            return;
        }
        b.x(this.mParentView, "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", ")");
    }

    public boolean checkTouchSlop(int i10, int i11) {
        boolean z9;
        boolean z10;
        if (!isPointerDown(i11)) {
            return false;
        }
        if ((i10 & 1) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((i10 & 2) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f8 = this.mLastMotionX[i11] - this.mInitialMotionX[i11];
        float f10 = this.mLastMotionY[i11] - this.mInitialMotionY[i11];
        if (z9 && z10) {
            float f11 = (f10 * f10) + (f8 * f8);
            int i12 = this.mTouchSlop;
            if (f11 <= i12 * i12) {
                return false;
            }
            return true;
        }
        if (z9) {
            if (Math.abs(f8) <= this.mTouchSlop) {
                return false;
            }
            return true;
        }
        if (!z10 || Math.abs(f10) <= this.mTouchSlop) {
            return false;
        }
        return true;
    }

    public boolean continueSettling(boolean z9) {
        if (this.mDragState == 2) {
            boolean computeScrollOffset = this.mScroller.computeScrollOffset();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            int left = currX - this.mCapturedView.getLeft();
            int top = currY - this.mCapturedView.getTop();
            if (left != 0) {
                ViewCompat.offsetLeftAndRight(this.mCapturedView, left);
            }
            if (top != 0) {
                ViewCompat.offsetTopAndBottom(this.mCapturedView, top);
            }
            if (left != 0 || top != 0) {
                this.mCallback.onViewPositionChanged(this.mCapturedView, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.mScroller.getFinalX() && currY == this.mScroller.getFinalY()) {
                this.mScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z9) {
                    this.mParentView.post(this.mSetIdleRunnable);
                } else {
                    setDragState(0);
                }
            }
        }
        if (this.mDragState != 2) {
            return false;
        }
        return true;
    }

    @Nullable
    public View findTopChildUnder(int i10, int i11) {
        for (int childCount = this.mParentView.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.mParentView.getChildAt(this.mCallback.getOrderedChildIndex(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void flingCapturedView(int i10, int i11, int i12, int i13) {
        if (this.mReleaseInProgress) {
            this.mScroller.fling(this.mCapturedView.getLeft(), this.mCapturedView.getTop(), (int) this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int) this.mVelocityTracker.getYVelocity(this.mActivePointerId), i10, i12, i11, i13);
            setDragState(2);
        } else {
            i.l("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
    }

    public int getActivePointerId() {
        return this.mActivePointerId;
    }

    @Nullable
    public View getCapturedView() {
        return this.mCapturedView;
    }

    @Px
    public int getDefaultEdgeSize() {
        return this.mDefaultEdgeSize;
    }

    @Px
    public int getEdgeSize() {
        return this.mEdgeSize;
    }

    public float getMinVelocity() {
        return this.mMinVelocity;
    }

    @Px
    public int getTouchSlop() {
        return this.mTouchSlop;
    }

    public int getViewDragState() {
        return this.mDragState;
    }

    public boolean isCapturedViewUnder(int i10, int i11) {
        return isViewUnder(this.mCapturedView, i10, i11);
    }

    public boolean isEdgeTouched(int i10) {
        int length = this.mInitialEdgesTouched.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (isEdgeTouched(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPointerDown(int i10) {
        if (((1 << i10) & this.mPointersDown) != 0) {
            return true;
        }
        return false;
    }

    public boolean isViewUnder(@Nullable View view, int i10, int i11) {
        if (view == null || i10 < view.getLeft() || i10 >= view.getRight() || i11 < view.getTop() || i11 >= view.getBottom()) {
            return false;
        }
        return true;
    }

    public void processTouchEvent(@NonNull MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cancel();
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.mDragState == 1 && pointerId == this.mActivePointerId) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i11 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i11);
                                            if (pointerId2 != this.mActivePointerId) {
                                                View findTopChildUnder = findTopChildUnder((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                                                View view = this.mCapturedView;
                                                if (findTopChildUnder == view && tryCaptureViewForDrag(view, pointerId2)) {
                                                    i10 = this.mActivePointerId;
                                                    break;
                                                }
                                            }
                                            i11++;
                                        } else {
                                            i10 = -1;
                                            break;
                                        }
                                    }
                                    if (i10 == -1) {
                                        releaseViewForPointerUp();
                                    }
                                }
                                clearMotionHistory(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x9 = motionEvent.getX(actionIndex);
                        float y9 = motionEvent.getY(actionIndex);
                        saveInitialMotion(x9, y9, pointerId3);
                        if (this.mDragState == 0) {
                            tryCaptureViewForDrag(findTopChildUnder((int) x9, (int) y9), pointerId3);
                            int i12 = this.mInitialEdgesTouched[pointerId3];
                            int i13 = this.mTrackingEdges;
                            if ((i12 & i13) != 0) {
                                this.mCallback.onEdgeTouched(i12 & i13, pointerId3);
                                return;
                            }
                            return;
                        }
                        if (isCapturedViewUnder((int) x9, (int) y9)) {
                            tryCaptureViewForDrag(this.mCapturedView, pointerId3);
                            return;
                        }
                        return;
                    }
                    if (this.mDragState == 1) {
                        dispatchViewReleased(0.0f, 0.0f);
                    }
                    cancel();
                    return;
                }
                if (this.mDragState == 1) {
                    if (isValidPointerForActionMove(this.mActivePointerId)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.mLastMotionX;
                        int i14 = this.mActivePointerId;
                        int i15 = (int) (x10 - fArr[i14]);
                        int i16 = (int) (y10 - this.mLastMotionY[i14]);
                        dragTo(this.mCapturedView.getLeft() + i15, this.mCapturedView.getTop() + i16, i15, i16);
                        saveLastMotion(motionEvent);
                        return;
                    }
                    return;
                }
                int pointerCount2 = motionEvent.getPointerCount();
                while (i11 < pointerCount2) {
                    int pointerId4 = motionEvent.getPointerId(i11);
                    if (isValidPointerForActionMove(pointerId4)) {
                        float x11 = motionEvent.getX(i11);
                        float y11 = motionEvent.getY(i11);
                        float f8 = x11 - this.mInitialMotionX[pointerId4];
                        float f10 = y11 - this.mInitialMotionY[pointerId4];
                        reportNewEdgeDrags(f8, f10, pointerId4);
                        if (this.mDragState != 1) {
                            View findTopChildUnder2 = findTopChildUnder((int) x11, (int) y11);
                            if (checkTouchSlop(findTopChildUnder2, f8, f10) && tryCaptureViewForDrag(findTopChildUnder2, pointerId4)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i11++;
                }
                saveLastMotion(motionEvent);
                return;
            }
            if (this.mDragState == 1) {
                releaseViewForPointerUp();
            }
            cancel();
            return;
        }
        float x12 = motionEvent.getX();
        float y12 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View findTopChildUnder3 = findTopChildUnder((int) x12, (int) y12);
        saveInitialMotion(x12, y12, pointerId5);
        tryCaptureViewForDrag(findTopChildUnder3, pointerId5);
        int i17 = this.mInitialEdgesTouched[pointerId5];
        int i18 = this.mTrackingEdges;
        if ((i17 & i18) != 0) {
            this.mCallback.onEdgeTouched(i17 & i18, pointerId5);
        }
    }

    public void setDragState(int i10) {
        this.mParentView.removeCallbacks(this.mSetIdleRunnable);
        if (this.mDragState != i10) {
            this.mDragState = i10;
            this.mCallback.onViewDragStateChanged(i10);
            if (this.mDragState == 0) {
                this.mCapturedView = null;
            }
        }
    }

    public void setEdgeSize(@IntRange(from = 0) @Px int i10) {
        this.mEdgeSize = i10;
    }

    public void setEdgeTrackingEnabled(int i10) {
        this.mTrackingEdges = i10;
    }

    public void setMinVelocity(float f8) {
        this.mMinVelocity = f8;
    }

    public boolean settleCapturedViewAt(int i10, int i11) {
        if (this.mReleaseInProgress) {
            return forceSettleCapturedViewAt(i10, i11, (int) this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int) this.mVelocityTracker.getYVelocity(this.mActivePointerId));
        }
        i.l("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
    
        if (r12 != r11) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean shouldInterceptTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ViewDragHelper.shouldInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean smoothSlideViewTo(@NonNull View view, int i10, int i11) {
        this.mCapturedView = view;
        this.mActivePointerId = -1;
        boolean forceSettleCapturedViewAt = forceSettleCapturedViewAt(i10, i11, 0, 0);
        if (!forceSettleCapturedViewAt && this.mDragState == 0 && this.mCapturedView != null) {
            this.mCapturedView = null;
        }
        return forceSettleCapturedViewAt;
    }

    public boolean tryCaptureViewForDrag(View view, int i10) {
        if (view == this.mCapturedView && this.mActivePointerId == i10) {
            return true;
        }
        if (view != null && this.mCallback.tryCaptureView(view, i10)) {
            this.mActivePointerId = i10;
            captureChildView(view, i10);
            return true;
        }
        return false;
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, @NonNull Callback callback) {
        return new ViewDragHelper(viewGroup.getContext(), viewGroup, callback);
    }

    public boolean isEdgeTouched(int i10, int i11) {
        return isPointerDown(i11) && (i10 & this.mInitialEdgesTouched[i11]) != 0;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static abstract class Callback {
        public int clampViewPositionHorizontal(@NonNull View view, int i10, int i11) {
            return 0;
        }

        public int clampViewPositionVertical(@NonNull View view, int i10, int i11) {
            return 0;
        }

        public int getViewHorizontalDragRange(@NonNull View view) {
            return 0;
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            return 0;
        }

        public boolean onEdgeLock(int i10) {
            return false;
        }

        public abstract boolean tryCaptureView(@NonNull View view, int i10);

        public int getOrderedChildIndex(int i10) {
            return i10;
        }

        public void onViewDragStateChanged(int i10) {
        }

        public void onEdgeDragStarted(int i10, int i11) {
        }

        public void onEdgeTouched(int i10, int i11) {
        }

        public void onViewCaptured(@NonNull View view, int i10) {
        }

        public void onViewReleased(@NonNull View view, float f8, float f10) {
        }

        public void onViewPositionChanged(@NonNull View view, int i10, int i11, @Px int i12, @Px int i13) {
        }
    }

    private int clampMag(int i10, int i11, int i12) {
        int abs = Math.abs(i10);
        if (abs < i11) {
            return 0;
        }
        return abs > i12 ? i10 > 0 ? i12 : -i12 : i10;
    }

    private void clearMotionHistory() {
        float[] fArr = this.mInitialMotionX;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.mInitialMotionY, 0.0f);
        Arrays.fill(this.mLastMotionX, 0.0f);
        Arrays.fill(this.mLastMotionY, 0.0f);
        Arrays.fill(this.mInitialEdgesTouched, 0);
        Arrays.fill(this.mEdgeDragsInProgress, 0);
        Arrays.fill(this.mEdgeDragsLocked, 0);
        this.mPointersDown = 0;
    }

    public boolean checkTouchSlop(int i10) {
        int length = this.mInitialMotionX.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (checkTouchSlop(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean checkTouchSlop(android.view.View r5, float r6, float r7) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            goto L47
        L4:
            androidx.customview.widget.ViewDragHelper$Callback r1 = r4.mCallback
            int r1 = r1.getViewHorizontalDragRange(r5)
            r2 = 1
            if (r1 <= 0) goto Lf
            r1 = r2
            goto L10
        Lf:
            r1 = r0
        L10:
            androidx.customview.widget.ViewDragHelper$Callback r3 = r4.mCallback
            int r5 = r3.getViewVerticalDragRange(r5)
            if (r5 <= 0) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r0
        L1b:
            if (r1 == 0) goto L2b
            if (r5 == 0) goto L2b
            float r6 = r6 * r6
            float r7 = r7 * r7
            float r7 = r7 + r6
            int r5 = r4.mTouchSlop
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 <= 0) goto L47
            goto L46
        L2b:
            if (r1 == 0) goto L39
            float r5 = java.lang.Math.abs(r6)
            int r6 = r4.mTouchSlop
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L47
            goto L46
        L39:
            if (r5 == 0) goto L47
            float r5 = java.lang.Math.abs(r7)
            int r6 = r4.mTouchSlop
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L47
        L46:
            return r2
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ViewDragHelper.checkTouchSlop(android.view.View, float, float):boolean");
    }
}
