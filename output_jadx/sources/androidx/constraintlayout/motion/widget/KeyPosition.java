package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class KeyPosition extends KeyPositionBase {
    public static final String DRAWPATH = "drawPath";
    static final int KEY_TYPE = 2;
    static final String NAME = "KeyPosition";
    public static final String PERCENT_HEIGHT = "percentHeight";
    public static final String PERCENT_WIDTH = "percentWidth";
    public static final String PERCENT_X = "percentX";
    public static final String PERCENT_Y = "percentY";
    public static final String SIZE_PERCENT = "sizePercent";
    private static final String TAG = "KeyPosition";
    public static final String TRANSITION_EASING = "transitionEasing";
    public static final int TYPE_AXIS = 3;
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    String mTransitionEasing = null;
    int mPathMotionArc = Key.UNSET;
    int mDrawPath = 0;
    float mPercentWidth = Float.NaN;
    float mPercentHeight = Float.NaN;
    float mPercentX = Float.NaN;
    float mPercentY = Float.NaN;
    float mAltPercentX = Float.NaN;
    float mAltPercentY = Float.NaN;
    int mPositionType = 0;
    private float mCalculatedPositionX = Float.NaN;
    private float mCalculatedPositionY = Float.NaN;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class Loader {
        private static final int CURVE_FIT = 4;
        private static final int DRAW_PATH = 5;
        private static final int FRAME_POSITION = 2;
        private static final int PATH_MOTION_ARC = 10;
        private static final int PERCENT_HEIGHT = 12;
        private static final int PERCENT_WIDTH = 11;
        private static final int PERCENT_X = 6;
        private static final int PERCENT_Y = 7;
        private static final int SIZE_PERCENT = 8;
        private static final int TARGET_ID = 1;
        private static final int TRANSITION_EASING = 3;
        private static final int TYPE = 9;
        private static SparseIntArray sAttrMap;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sAttrMap = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyPosition_motionTarget, 1);
            sAttrMap.append(R.styleable.KeyPosition_framePosition, 2);
            sAttrMap.append(R.styleable.KeyPosition_transitionEasing, 3);
            sAttrMap.append(R.styleable.KeyPosition_curveFit, 4);
            sAttrMap.append(R.styleable.KeyPosition_drawPath, 5);
            sAttrMap.append(R.styleable.KeyPosition_percentX, 6);
            sAttrMap.append(R.styleable.KeyPosition_percentY, 7);
            sAttrMap.append(R.styleable.KeyPosition_keyPositionType, 9);
            sAttrMap.append(R.styleable.KeyPosition_sizePercent, 8);
            sAttrMap.append(R.styleable.KeyPosition_percentWidth, 11);
            sAttrMap.append(R.styleable.KeyPosition_percentHeight, 12);
            sAttrMap.append(R.styleable.KeyPosition_pathMotionArc, 10);
        }

        private Loader() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void read(KeyPosition keyPosition, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (sAttrMap.get(index)) {
                    case 1:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            int resourceId = typedArray.getResourceId(index, keyPosition.mTargetId);
                            keyPosition.mTargetId = resourceId;
                            if (resourceId == -1) {
                                keyPosition.mTargetString = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            keyPosition.mTargetString = typedArray.getString(index);
                            break;
                        } else {
                            keyPosition.mTargetId = typedArray.getResourceId(index, keyPosition.mTargetId);
                            break;
                        }
                    case 2:
                        keyPosition.mFramePosition = typedArray.getInt(index, keyPosition.mFramePosition);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            keyPosition.mTransitionEasing = typedArray.getString(index);
                            break;
                        } else {
                            keyPosition.mTransitionEasing = Easing.NAMED_EASING[typedArray.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        keyPosition.mCurveFit = typedArray.getInteger(index, keyPosition.mCurveFit);
                        break;
                    case 5:
                        keyPosition.mDrawPath = typedArray.getInt(index, keyPosition.mDrawPath);
                        break;
                    case 6:
                        keyPosition.mPercentX = typedArray.getFloat(index, keyPosition.mPercentX);
                        break;
                    case 7:
                        keyPosition.mPercentY = typedArray.getFloat(index, keyPosition.mPercentY);
                        break;
                    case 8:
                        float f8 = typedArray.getFloat(index, keyPosition.mPercentHeight);
                        keyPosition.mPercentWidth = f8;
                        keyPosition.mPercentHeight = f8;
                        break;
                    case 9:
                        keyPosition.mPositionType = typedArray.getInt(index, keyPosition.mPositionType);
                        break;
                    case 10:
                        keyPosition.mPathMotionArc = typedArray.getInt(index, keyPosition.mPathMotionArc);
                        break;
                    case 11:
                        keyPosition.mPercentWidth = typedArray.getFloat(index, keyPosition.mPercentWidth);
                        break;
                    case 12:
                        keyPosition.mPercentHeight = typedArray.getFloat(index, keyPosition.mPercentHeight);
                        break;
                    default:
                        Log.e(TypedValues.PositionType.NAME, "unused attribute 0x" + Integer.toHexString(index) + "   " + sAttrMap.get(index));
                        break;
                }
            }
            if (keyPosition.mFramePosition == -1) {
                Log.e(TypedValues.PositionType.NAME, "no frame position");
            }
        }
    }

    public KeyPosition() {
        this.mType = 2;
    }

    private void calcCartesianPosition(float f8, float f10, float f11, float f12) {
        float f13;
        float f14;
        float f15;
        float f16 = f11 - f8;
        float f17 = f12 - f10;
        float f18 = 0.0f;
        if (Float.isNaN(this.mPercentX)) {
            f13 = 0.0f;
        } else {
            f13 = this.mPercentX;
        }
        if (Float.isNaN(this.mAltPercentY)) {
            f14 = 0.0f;
        } else {
            f14 = this.mAltPercentY;
        }
        if (Float.isNaN(this.mPercentY)) {
            f15 = 0.0f;
        } else {
            f15 = this.mPercentY;
        }
        if (!Float.isNaN(this.mAltPercentX)) {
            f18 = this.mAltPercentX;
        }
        this.mCalculatedPositionX = (int) ((f18 * f17) + (f13 * f16) + f8);
        this.mCalculatedPositionY = (int) ((f17 * f15) + (f16 * f14) + f10);
    }

    private void calcPathPosition(float f8, float f10, float f11, float f12) {
        float f13 = f11 - f8;
        float f14 = f12 - f10;
        float f15 = this.mPercentX;
        float f16 = (f13 * f15) + f8;
        float f17 = this.mPercentY;
        this.mCalculatedPositionX = ((-f14) * f17) + f16;
        this.mCalculatedPositionY = (f13 * f17) + (f14 * f15) + f10;
    }

    private void calcScreenPosition(int i10, int i11) {
        float f8 = this.mPercentX;
        float f10 = 0;
        this.mCalculatedPositionX = (i10 * f8) + f10;
        this.mCalculatedPositionY = (i11 * f8) + f10;
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public void calcPosition(int i10, int i11, float f8, float f10, float f11, float f12) {
        int i12 = this.mPositionType;
        if (i12 != 1) {
            if (i12 != 2) {
                calcCartesianPosition(f8, f10, f11, f12);
                return;
            } else {
                calcScreenPosition(i10, i11);
                return;
            }
        }
        calcPathPosition(f8, f10, f11, f12);
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* renamed from: clone */
    public Key mo29clone() {
        return new KeyPosition().copy(this);
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key) {
        super.copy(key);
        KeyPosition keyPosition = (KeyPosition) key;
        this.mTransitionEasing = keyPosition.mTransitionEasing;
        this.mPathMotionArc = keyPosition.mPathMotionArc;
        this.mDrawPath = keyPosition.mDrawPath;
        this.mPercentWidth = keyPosition.mPercentWidth;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = keyPosition.mPercentX;
        this.mPercentY = keyPosition.mPercentY;
        this.mAltPercentX = keyPosition.mAltPercentX;
        this.mAltPercentY = keyPosition.mAltPercentY;
        this.mCalculatedPositionX = keyPosition.mCalculatedPositionX;
        this.mCalculatedPositionY = keyPosition.mCalculatedPositionY;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public float getPositionX() {
        return this.mCalculatedPositionX;
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public float getPositionY() {
        return this.mCalculatedPositionY;
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public boolean intersects(int i10, int i11, RectF rectF, RectF rectF2, float f8, float f10) {
        calcPosition(i10, i11, rectF.centerX(), rectF.centerY(), rectF2.centerX(), rectF2.centerY());
        if (Math.abs(f8 - this.mCalculatedPositionX) < 20.0f && Math.abs(f10 - this.mCalculatedPositionY) < 20.0f) {
            return true;
        }
        return false;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attributeSet) {
        Loader.read(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyPosition));
    }

    @Override // androidx.constraintlayout.motion.widget.KeyPositionBase
    public void positionAttributes(View view, RectF rectF, RectF rectF2, float f8, float f10, String[] strArr, float[] fArr) {
        int i10 = this.mPositionType;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    positionCartAttributes(rectF, rectF2, f8, f10, strArr, fArr);
                    return;
                } else {
                    positionAxisAttributes(rectF, rectF2, f8, f10, strArr, fArr);
                    return;
                }
            }
            positionScreenAttributes(view, rectF, rectF2, f8, f10, strArr, fArr);
            return;
        }
        positionPathAttributes(rectF, rectF2, f8, f10, strArr, fArr);
    }

    public void positionAxisAttributes(RectF rectF, RectF rectF2, float f8, float f10, String[] strArr, float[] fArr) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX();
        float centerY2 = rectF2.centerY();
        if (centerX > centerX2) {
            centerX2 = centerX;
            centerX = centerX2;
        }
        if (centerY <= centerY2) {
            centerY2 = centerY;
            centerY = centerY2;
        }
        float f11 = centerX2 - centerX;
        float f12 = centerY - centerY2;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = (f8 - centerX) / f11;
                fArr[1] = (f10 - centerY2) / f12;
                return;
            } else {
                fArr[1] = (f8 - centerX) / f11;
                fArr[0] = (f10 - centerY2) / f12;
                return;
            }
        }
        strArr[0] = "percentX";
        fArr[0] = (f8 - centerX) / f11;
        strArr[1] = "percentY";
        fArr[1] = (f10 - centerY2) / f12;
    }

    public void positionCartAttributes(RectF rectF, RectF rectF2, float f8, float f10, String[] strArr, float[] fArr) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX() - centerX;
        float centerY2 = rectF2.centerY() - centerY;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = (f8 - centerX) / centerX2;
                fArr[1] = (f10 - centerY) / centerY2;
                return;
            } else {
                fArr[1] = (f8 - centerX) / centerX2;
                fArr[0] = (f10 - centerY) / centerY2;
                return;
            }
        }
        strArr[0] = "percentX";
        fArr[0] = (f8 - centerX) / centerX2;
        strArr[1] = "percentY";
        fArr[1] = (f10 - centerY) / centerY2;
    }

    public void positionPathAttributes(RectF rectF, RectF rectF2, float f8, float f10, String[] strArr, float[] fArr) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX() - centerX;
        float centerY2 = rectF2.centerY() - centerY;
        float hypot = (float) Math.hypot(centerX2, centerY2);
        if (hypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f11 = centerX2 / hypot;
        float f12 = centerY2 / hypot;
        float f13 = f10 - centerY;
        float f14 = f8 - centerX;
        float f15 = ((f11 * f13) - (f14 * f12)) / hypot;
        float f16 = ((f12 * f13) + (f11 * f14)) / hypot;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f16;
                fArr[1] = f15;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f16;
        fArr[1] = f15;
    }

    public void positionScreenAttributes(View view, RectF rectF, RectF rectF2, float f8, float f10, String[] strArr, float[] fArr) {
        rectF.centerX();
        rectF.centerY();
        rectF2.centerX();
        rectF2.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f8 / width;
                fArr[1] = f10 / height;
                return;
            } else {
                fArr[1] = f8 / width;
                fArr[0] = f10 / height;
                return;
            }
        }
        strArr[0] = "percentX";
        fArr[0] = f8 / width;
        strArr[1] = "percentY";
        fArr[1] = f10 / height;
    }

    public void setType(int i10) {
        this.mPositionType = i10;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(String str, Object obj) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 0;
                    break;
                }
                break;
            case -1127236479:
                if (str.equals("percentWidth")) {
                    c = 1;
                    break;
                }
                break;
            case -1017587252:
                if (str.equals("percentHeight")) {
                    c = 2;
                    break;
                }
                break;
            case -827014263:
                if (str.equals("drawPath")) {
                    c = 3;
                    break;
                }
                break;
            case -200259324:
                if (str.equals("sizePercent")) {
                    c = 4;
                    break;
                }
                break;
            case 428090547:
                if (str.equals("percentX")) {
                    c = 5;
                    break;
                }
                break;
            case 428090548:
                if (str.equals("percentY")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mTransitionEasing = obj.toString();
                return;
            case 1:
                this.mPercentWidth = toFloat(obj);
                return;
            case 2:
                this.mPercentHeight = toFloat(obj);
                return;
            case 3:
                this.mDrawPath = toInt(obj);
                return;
            case 4:
                float f8 = toFloat(obj);
                this.mPercentWidth = f8;
                this.mPercentHeight = f8;
                return;
            case 5:
                this.mPercentX = toFloat(obj);
                return;
            case 6:
                this.mPercentY = toFloat(obj);
                return;
            default:
                return;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> hashMap) {
    }
}
