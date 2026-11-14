package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class TouchResponse {
    public static final int COMPLETE_MODE_CONTINUOUS_VELOCITY = 0;
    public static final int COMPLETE_MODE_SPRING = 1;
    private static final boolean DEBUG = false;
    private static final float EPSILON = 1.0E-7f;
    static final int FLAG_DISABLE_POST_SCROLL = 1;
    static final int FLAG_DISABLE_SCROLL = 2;
    static final int FLAG_SUPPORT_SCROLL_UP = 4;
    private static final int SEC_TO_MILLISECONDS = 1000;
    private static final int SIDE_BOTTOM = 3;
    private static final int SIDE_END = 6;
    private static final int SIDE_LEFT = 1;
    private static final int SIDE_MIDDLE = 4;
    private static final int SIDE_RIGHT = 2;
    private static final int SIDE_START = 5;
    private static final int SIDE_TOP = 0;
    private static final String TAG = "TouchResponse";
    private static final int TOUCH_DOWN = 1;
    private static final int TOUCH_END = 5;
    private static final int TOUCH_LEFT = 2;
    private static final int TOUCH_RIGHT = 3;
    private static final int TOUCH_START = 4;
    private static final int TOUCH_UP = 0;
    private float[] mAnchorDpDt;
    private int mAutoCompleteMode;
    private float mDragScale;
    private boolean mDragStarted;
    private float mDragThreshold;
    private int mFlags;
    boolean mIsRotateMode;
    private float mLastTouchX;
    private float mLastTouchY;
    private int mLimitBoundsTo;
    private float mMaxAcceleration;
    private float mMaxVelocity;
    private final MotionLayout mMotionLayout;
    private boolean mMoveWhenScrollAtTop;
    private int mOnTouchUp;
    float mRotateCenterX;
    float mRotateCenterY;
    private int mRotationCenterId;
    private int mSpringBoundary;
    private float mSpringDamping;
    private float mSpringMass;
    private float mSpringStiffness;
    private float mSpringStopThreshold;
    private int[] mTempLoc;
    private int mTouchAnchorId;
    private int mTouchAnchorSide;
    private float mTouchAnchorX;
    private float mTouchAnchorY;
    private float mTouchDirectionX;
    private float mTouchDirectionY;
    private int mTouchRegionId;
    private int mTouchSide;
    private static final float[][] TOUCH_SIDES = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] TOUCH_DIRECTION = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    public TouchResponse(MotionLayout motionLayout, OnSwipe onSwipe) {
        this.mTouchAnchorSide = 0;
        this.mTouchSide = 0;
        this.mOnTouchUp = 0;
        this.mTouchAnchorId = -1;
        this.mTouchRegionId = -1;
        this.mLimitBoundsTo = -1;
        this.mTouchAnchorY = 0.5f;
        this.mTouchAnchorX = 0.5f;
        this.mRotateCenterX = 0.5f;
        this.mRotateCenterY = 0.5f;
        this.mRotationCenterId = -1;
        this.mIsRotateMode = false;
        this.mTouchDirectionX = 0.0f;
        this.mTouchDirectionY = 1.0f;
        this.mDragStarted = false;
        this.mAnchorDpDt = new float[2];
        this.mTempLoc = new int[2];
        this.mMaxVelocity = 4.0f;
        this.mMaxAcceleration = 1.2f;
        this.mMoveWhenScrollAtTop = true;
        this.mDragScale = 1.0f;
        this.mFlags = 0;
        this.mDragThreshold = 10.0f;
        this.mSpringDamping = 10.0f;
        this.mSpringMass = 1.0f;
        this.mSpringStiffness = Float.NaN;
        this.mSpringStopThreshold = Float.NaN;
        this.mSpringBoundary = 0;
        this.mAutoCompleteMode = 0;
        this.mMotionLayout = motionLayout;
        this.mTouchAnchorId = onSwipe.getTouchAnchorId();
        int touchAnchorSide = onSwipe.getTouchAnchorSide();
        this.mTouchAnchorSide = touchAnchorSide;
        if (touchAnchorSide != -1) {
            float[] fArr = TOUCH_SIDES[touchAnchorSide];
            this.mTouchAnchorX = fArr[0];
            this.mTouchAnchorY = fArr[1];
        }
        int dragDirection = onSwipe.getDragDirection();
        this.mTouchSide = dragDirection;
        float[][] fArr2 = TOUCH_DIRECTION;
        if (dragDirection < fArr2.length) {
            float[] fArr3 = fArr2[dragDirection];
            this.mTouchDirectionX = fArr3[0];
            this.mTouchDirectionY = fArr3[1];
        } else {
            this.mTouchDirectionY = Float.NaN;
            this.mTouchDirectionX = Float.NaN;
            this.mIsRotateMode = true;
        }
        this.mMaxVelocity = onSwipe.getMaxVelocity();
        this.mMaxAcceleration = onSwipe.getMaxAcceleration();
        this.mMoveWhenScrollAtTop = onSwipe.getMoveWhenScrollAtTop();
        this.mDragScale = onSwipe.getDragScale();
        this.mDragThreshold = onSwipe.getDragThreshold();
        this.mTouchRegionId = onSwipe.getTouchRegionId();
        this.mOnTouchUp = onSwipe.getOnTouchUp();
        this.mFlags = onSwipe.getNestedScrollFlags();
        this.mLimitBoundsTo = onSwipe.getLimitBoundsTo();
        this.mRotationCenterId = onSwipe.getRotationCenterId();
        this.mSpringBoundary = onSwipe.getSpringBoundary();
        this.mSpringDamping = onSwipe.getSpringDamping();
        this.mSpringMass = onSwipe.getSpringMass();
        this.mSpringStiffness = onSwipe.getSpringStiffness();
        this.mSpringStopThreshold = onSwipe.getSpringStopThreshold();
        this.mAutoCompleteMode = onSwipe.getAutoCompleteMode();
    }

    private void fill(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index == R.styleable.OnSwipe_touchAnchorId) {
                this.mTouchAnchorId = typedArray.getResourceId(index, this.mTouchAnchorId);
            } else if (index == R.styleable.OnSwipe_touchAnchorSide) {
                int i11 = typedArray.getInt(index, this.mTouchAnchorSide);
                this.mTouchAnchorSide = i11;
                float[] fArr = TOUCH_SIDES[i11];
                this.mTouchAnchorX = fArr[0];
                this.mTouchAnchorY = fArr[1];
            } else if (index == R.styleable.OnSwipe_dragDirection) {
                int i12 = typedArray.getInt(index, this.mTouchSide);
                this.mTouchSide = i12;
                float[][] fArr2 = TOUCH_DIRECTION;
                if (i12 < fArr2.length) {
                    float[] fArr3 = fArr2[i12];
                    this.mTouchDirectionX = fArr3[0];
                    this.mTouchDirectionY = fArr3[1];
                } else {
                    this.mTouchDirectionY = Float.NaN;
                    this.mTouchDirectionX = Float.NaN;
                    this.mIsRotateMode = true;
                }
            } else if (index == R.styleable.OnSwipe_maxVelocity) {
                this.mMaxVelocity = typedArray.getFloat(index, this.mMaxVelocity);
            } else if (index == R.styleable.OnSwipe_maxAcceleration) {
                this.mMaxAcceleration = typedArray.getFloat(index, this.mMaxAcceleration);
            } else if (index == R.styleable.OnSwipe_moveWhenScrollAtTop) {
                this.mMoveWhenScrollAtTop = typedArray.getBoolean(index, this.mMoveWhenScrollAtTop);
            } else if (index == R.styleable.OnSwipe_dragScale) {
                this.mDragScale = typedArray.getFloat(index, this.mDragScale);
            } else if (index == R.styleable.OnSwipe_dragThreshold) {
                this.mDragThreshold = typedArray.getFloat(index, this.mDragThreshold);
            } else if (index == R.styleable.OnSwipe_touchRegionId) {
                this.mTouchRegionId = typedArray.getResourceId(index, this.mTouchRegionId);
            } else if (index == R.styleable.OnSwipe_onTouchUp) {
                this.mOnTouchUp = typedArray.getInt(index, this.mOnTouchUp);
            } else if (index == R.styleable.OnSwipe_nestedScrollFlags) {
                this.mFlags = typedArray.getInteger(index, 0);
            } else if (index == R.styleable.OnSwipe_limitBoundsTo) {
                this.mLimitBoundsTo = typedArray.getResourceId(index, 0);
            } else if (index == R.styleable.OnSwipe_rotationCenterId) {
                this.mRotationCenterId = typedArray.getResourceId(index, this.mRotationCenterId);
            } else if (index == R.styleable.OnSwipe_springDamping) {
                this.mSpringDamping = typedArray.getFloat(index, this.mSpringDamping);
            } else if (index == R.styleable.OnSwipe_springMass) {
                this.mSpringMass = typedArray.getFloat(index, this.mSpringMass);
            } else if (index == R.styleable.OnSwipe_springStiffness) {
                this.mSpringStiffness = typedArray.getFloat(index, this.mSpringStiffness);
            } else if (index == R.styleable.OnSwipe_springStopThreshold) {
                this.mSpringStopThreshold = typedArray.getFloat(index, this.mSpringStopThreshold);
            } else if (index == R.styleable.OnSwipe_springBoundary) {
                this.mSpringBoundary = typedArray.getInt(index, this.mSpringBoundary);
            } else if (index == R.styleable.OnSwipe_autoCompleteMode) {
                this.mAutoCompleteMode = typedArray.getInt(index, this.mAutoCompleteMode);
            }
        }
    }

    private void fillFromAttributeList(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OnSwipe);
        fill(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public float dot(float f8, float f10) {
        return (f10 * this.mTouchDirectionY) + (f8 * this.mTouchDirectionX);
    }

    public int getAnchorId() {
        return this.mTouchAnchorId;
    }

    public int getAutoCompleteMode() {
        return this.mAutoCompleteMode;
    }

    public int getFlags() {
        return this.mFlags;
    }

    public RectF getLimitBoundsTo(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i10 = this.mLimitBoundsTo;
        if (i10 == -1 || (findViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public int getLimitBoundsToId() {
        return this.mLimitBoundsTo;
    }

    public float getMaxAcceleration() {
        return this.mMaxAcceleration;
    }

    public float getMaxVelocity() {
        return this.mMaxVelocity;
    }

    public boolean getMoveWhenScrollAtTop() {
        return this.mMoveWhenScrollAtTop;
    }

    public float getProgressDirection(float f8, float f10) {
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, this.mMotionLayout.getProgress(), this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f11 = this.mTouchDirectionX;
        float[] fArr = this.mAnchorDpDt;
        if (f11 != 0.0f) {
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f8 * f11) / fArr[0];
        }
        if (fArr[1] == 0.0f) {
            fArr[1] = 1.0E-7f;
        }
        return (f10 * this.mTouchDirectionY) / fArr[1];
    }

    public int getSpringBoundary() {
        return this.mSpringBoundary;
    }

    public float getSpringDamping() {
        return this.mSpringDamping;
    }

    public float getSpringMass() {
        return this.mSpringMass;
    }

    public float getSpringStiffness() {
        return this.mSpringStiffness;
    }

    public float getSpringStopThreshold() {
        return this.mSpringStopThreshold;
    }

    public RectF getTouchRegion(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i10 = this.mTouchRegionId;
        if (i10 == -1 || (findViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public int getTouchRegionId() {
        return this.mTouchRegionId;
    }

    public boolean isDragStarted() {
        return this.mDragStarted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    public void processTouchEvent(MotionEvent motionEvent, MotionLayout.MotionTracker motionTracker, int i10, MotionScene motionScene) {
        char c;
        float f8;
        float f10;
        int i11;
        float f11;
        ?? r23;
        float f12;
        ?? r24;
        float f13;
        boolean z9;
        float f14;
        if (this.mIsRotateMode) {
            processTouchRotateEvent(motionEvent, motionTracker, i10, motionScene);
            return;
        }
        motionTracker.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float rawY = motionEvent.getRawY() - this.mLastTouchY;
                    float rawX = motionEvent.getRawX() - this.mLastTouchX;
                    if (Math.abs((this.mTouchDirectionY * rawY) + (this.mTouchDirectionX * rawX)) > this.mDragThreshold || this.mDragStarted) {
                        float progress = this.mMotionLayout.getProgress();
                        if (!this.mDragStarted) {
                            this.mDragStarted = true;
                            this.mMotionLayout.setProgress(progress);
                        }
                        int i12 = this.mTouchAnchorId;
                        MotionLayout motionLayout = this.mMotionLayout;
                        if (i12 != -1) {
                            r23 = 1;
                            r24 = 0;
                            f12 = progress;
                            motionLayout.getAnchorDpDt(i12, f12, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
                        } else {
                            r23 = 1;
                            f12 = progress;
                            r24 = 0;
                            float min = Math.min(motionLayout.getWidth(), this.mMotionLayout.getHeight());
                            float[] fArr = this.mAnchorDpDt;
                            fArr[1] = this.mTouchDirectionY * min;
                            fArr[0] = min * this.mTouchDirectionX;
                        }
                        float f15 = this.mTouchDirectionX;
                        float[] fArr2 = this.mAnchorDpDt;
                        if (Math.abs(((this.mTouchDirectionY * fArr2[r23]) + (f15 * fArr2[r24])) * this.mDragScale) < 0.01d) {
                            float[] fArr3 = this.mAnchorDpDt;
                            fArr3[r24] = 0.01f;
                            fArr3[r23] = 0.01f;
                        }
                        float f16 = this.mTouchDirectionX;
                        float[] fArr4 = this.mAnchorDpDt;
                        if (f16 != 0.0f) {
                            f13 = rawX / fArr4[r24];
                        } else {
                            f13 = rawY / fArr4[r23];
                        }
                        float max = Math.max(Math.min(f12 + f13, 1.0f), 0.0f);
                        if (this.mOnTouchUp == 6) {
                            max = Math.max(max, 0.01f);
                        }
                        if (this.mOnTouchUp == 7) {
                            max = Math.min(max, 0.99f);
                        }
                        float progress2 = this.mMotionLayout.getProgress();
                        if (max != progress2) {
                            if (progress2 == 0.0f || progress2 == 1.0f) {
                                MotionLayout motionLayout2 = this.mMotionLayout;
                                if (progress2 == 0.0f) {
                                    z9 = r23;
                                } else {
                                    z9 = r24;
                                }
                                motionLayout2.endTrigger(z9);
                            }
                            this.mMotionLayout.setProgress(max);
                            motionTracker.computeCurrentVelocity(1000);
                            float xVelocity = motionTracker.getXVelocity();
                            float yVelocity = motionTracker.getYVelocity();
                            float f17 = this.mTouchDirectionX;
                            float[] fArr5 = this.mAnchorDpDt;
                            if (f17 != 0.0f) {
                                f14 = xVelocity / fArr5[r24];
                            } else {
                                f14 = yVelocity / fArr5[r23];
                            }
                            this.mMotionLayout.mLastVelocity = f14;
                        } else {
                            this.mMotionLayout.mLastVelocity = 0.0f;
                        }
                        this.mLastTouchX = motionEvent.getRawX();
                        this.mLastTouchY = motionEvent.getRawY();
                        return;
                    }
                    return;
                }
                return;
            }
            this.mDragStarted = false;
            motionTracker.computeCurrentVelocity(1000);
            float xVelocity2 = motionTracker.getXVelocity();
            float yVelocity2 = motionTracker.getYVelocity();
            float progress3 = this.mMotionLayout.getProgress();
            int i13 = this.mTouchAnchorId;
            MotionLayout motionLayout3 = this.mMotionLayout;
            if (i13 != -1) {
                motionLayout3.getAnchorDpDt(i13, progress3, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
                c = 0;
            } else {
                float min2 = Math.min(motionLayout3.getWidth(), this.mMotionLayout.getHeight());
                float[] fArr6 = this.mAnchorDpDt;
                fArr6[1] = this.mTouchDirectionY * min2;
                c = 0;
                fArr6[0] = min2 * this.mTouchDirectionX;
            }
            float f18 = this.mTouchDirectionX;
            float[] fArr7 = this.mAnchorDpDt;
            float f19 = fArr7[c];
            float f20 = fArr7[1];
            if (f18 != 0.0f) {
                f8 = xVelocity2 / f19;
            } else {
                f8 = yVelocity2 / f20;
            }
            if (!Float.isNaN(f8)) {
                f10 = (f8 / 3.0f) + progress3;
            } else {
                f10 = progress3;
            }
            if (f10 != 0.0f && f10 != 1.0f && (i11 = this.mOnTouchUp) != 3) {
                if (f10 < 0.5d) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                if (i11 == 6) {
                    if (progress3 + f8 < 0.0f) {
                        f8 = Math.abs(f8);
                    }
                    f11 = 1.0f;
                }
                if (this.mOnTouchUp == 7) {
                    if (progress3 + f8 > 1.0f) {
                        f8 = -Math.abs(f8);
                    }
                    f11 = 0.0f;
                }
                this.mMotionLayout.touchAnimateTo(this.mOnTouchUp, f11, f8);
                if (0.0f >= progress3 || 1.0f <= progress3) {
                    this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
                    return;
                }
                return;
            }
            if (0.0f < f10 && 1.0f > f10) {
                return;
            }
            this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
            return;
        }
        this.mLastTouchX = motionEvent.getRawX();
        this.mLastTouchY = motionEvent.getRawY();
        this.mDragStarted = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0290  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void processTouchRotateEvent(android.view.MotionEvent r24, androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker r25, int r26, androidx.constraintlayout.motion.widget.MotionScene r27) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.TouchResponse.processTouchRotateEvent(android.view.MotionEvent, androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker, int, androidx.constraintlayout.motion.widget.MotionScene):void");
    }

    public void scrollMove(float f8, float f10) {
        float f11;
        float progress = this.mMotionLayout.getProgress();
        if (!this.mDragStarted) {
            this.mDragStarted = true;
            this.mMotionLayout.setProgress(progress);
        }
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f12 = this.mTouchDirectionX;
        float[] fArr = this.mAnchorDpDt;
        if (Math.abs((this.mTouchDirectionY * fArr[1]) + (f12 * fArr[0])) < 0.01d) {
            float[] fArr2 = this.mAnchorDpDt;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f13 = this.mTouchDirectionX;
        if (f13 != 0.0f) {
            f11 = (f8 * f13) / this.mAnchorDpDt[0];
        } else {
            f11 = (f10 * this.mTouchDirectionY) / this.mAnchorDpDt[1];
        }
        float max = Math.max(Math.min(progress + f11, 1.0f), 0.0f);
        if (max != this.mMotionLayout.getProgress()) {
            this.mMotionLayout.setProgress(max);
        }
    }

    public void scrollUp(float f8, float f10) {
        float f11;
        int i10;
        this.mDragStarted = false;
        float progress = this.mMotionLayout.getProgress();
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f12 = this.mTouchDirectionX;
        float[] fArr = this.mAnchorDpDt;
        float f13 = fArr[0];
        float f14 = this.mTouchDirectionY;
        float f15 = fArr[1];
        float f16 = 0.0f;
        if (f12 != 0.0f) {
            f11 = (f8 * f12) / f13;
        } else {
            f11 = (f10 * f14) / f15;
        }
        if (!Float.isNaN(f11)) {
            progress += f11 / 3.0f;
        }
        if (progress != 0.0f && progress != 1.0f && (i10 = this.mOnTouchUp) != 3) {
            MotionLayout motionLayout = this.mMotionLayout;
            if (progress >= 0.5d) {
                f16 = 1.0f;
            }
            motionLayout.touchAnimateTo(i10, f16, f11);
        }
    }

    public void setAnchorId(int i10) {
        this.mTouchAnchorId = i10;
    }

    public void setAutoCompleteMode(int i10) {
        this.mAutoCompleteMode = i10;
    }

    public void setDown(float f8, float f10) {
        this.mLastTouchX = f8;
        this.mLastTouchY = f10;
    }

    public void setMaxAcceleration(float f8) {
        this.mMaxAcceleration = f8;
    }

    public void setMaxVelocity(float f8) {
        this.mMaxVelocity = f8;
    }

    public void setRTL(boolean z9) {
        if (z9) {
            float[][] fArr = TOUCH_DIRECTION;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = TOUCH_SIDES;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = TOUCH_DIRECTION;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = TOUCH_SIDES;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = TOUCH_SIDES[this.mTouchAnchorSide];
        this.mTouchAnchorX = fArr5[0];
        this.mTouchAnchorY = fArr5[1];
        int i10 = this.mTouchSide;
        float[][] fArr6 = TOUCH_DIRECTION;
        if (i10 >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i10];
        this.mTouchDirectionX = fArr7[0];
        this.mTouchDirectionY = fArr7[1];
    }

    public void setTouchAnchorLocation(float f8, float f10) {
        this.mTouchAnchorX = f8;
        this.mTouchAnchorY = f10;
    }

    public void setTouchUpMode(int i10) {
        this.mOnTouchUp = i10;
    }

    public void setUpTouchEvent(float f8, float f10) {
        this.mLastTouchX = f8;
        this.mLastTouchY = f10;
        this.mDragStarted = false;
    }

    public void setupTouch() {
        View view;
        int i10 = this.mTouchAnchorId;
        if (i10 != -1) {
            view = this.mMotionLayout.findViewById(i10);
            if (view == null) {
                Log.e(TAG, "cannot find TouchAnchorId @id/" + Debug.getName(this.mMotionLayout.getContext(), this.mTouchAnchorId));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new View.OnTouchListener() { // from class: androidx.constraintlayout.motion.widget.TouchResponse.1
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    return false;
                }
            });
            nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: androidx.constraintlayout.motion.widget.TouchResponse.2
                @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
                public void onScrollChange(NestedScrollView nestedScrollView2, int i11, int i12, int i13, int i14) {
                }
            });
        }
    }

    public String toString() {
        if (Float.isNaN(this.mTouchDirectionX)) {
            return Key.ROTATION;
        }
        return this.mTouchDirectionX + " , " + this.mTouchDirectionY;
    }

    public TouchResponse(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.mTouchAnchorSide = 0;
        this.mTouchSide = 0;
        this.mOnTouchUp = 0;
        this.mTouchAnchorId = -1;
        this.mTouchRegionId = -1;
        this.mLimitBoundsTo = -1;
        this.mTouchAnchorY = 0.5f;
        this.mTouchAnchorX = 0.5f;
        this.mRotateCenterX = 0.5f;
        this.mRotateCenterY = 0.5f;
        this.mRotationCenterId = -1;
        this.mIsRotateMode = false;
        this.mTouchDirectionX = 0.0f;
        this.mTouchDirectionY = 1.0f;
        this.mDragStarted = false;
        this.mAnchorDpDt = new float[2];
        this.mTempLoc = new int[2];
        this.mMaxVelocity = 4.0f;
        this.mMaxAcceleration = 1.2f;
        this.mMoveWhenScrollAtTop = true;
        this.mDragScale = 1.0f;
        this.mFlags = 0;
        this.mDragThreshold = 10.0f;
        this.mSpringDamping = 10.0f;
        this.mSpringMass = 1.0f;
        this.mSpringStiffness = Float.NaN;
        this.mSpringStopThreshold = Float.NaN;
        this.mSpringBoundary = 0;
        this.mAutoCompleteMode = 0;
        this.mMotionLayout = motionLayout;
        fillFromAttributeList(context, Xml.asAttributeSet(xmlPullParser));
    }
}
