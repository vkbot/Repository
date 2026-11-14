package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MotionKeyPosition extends MotionKey {
    static final int KEY_TYPE = 2;
    static final String NAME = "KeyPosition";
    protected static final float SELECTION_SLOPE = 20.0f;
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    public float mAltPercentX;
    public float mAltPercentY;
    private float mCalculatedPositionX;
    private float mCalculatedPositionY;
    public int mCurveFit;
    public int mDrawPath;
    public int mPathMotionArc;
    public float mPercentHeight;
    public float mPercentWidth;
    public float mPercentX;
    public float mPercentY;
    public int mPositionType;
    public String mTransitionEasing;

    public MotionKeyPosition() {
        int i10 = MotionKey.UNSET;
        this.mCurveFit = i10;
        this.mTransitionEasing = null;
        this.mPathMotionArc = i10;
        this.mDrawPath = 0;
        this.mPercentWidth = Float.NaN;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = Float.NaN;
        this.mPercentY = Float.NaN;
        this.mAltPercentX = Float.NaN;
        this.mAltPercentY = Float.NaN;
        this.mPositionType = 0;
        this.mCalculatedPositionX = Float.NaN;
        this.mCalculatedPositionY = Float.NaN;
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

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public MotionKey mo27clone() {
        return new MotionKeyPosition().copy(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey copy(MotionKey motionKey) {
        super.copy(motionKey);
        MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
        this.mTransitionEasing = motionKeyPosition.mTransitionEasing;
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        this.mPercentWidth = motionKeyPosition.mPercentWidth;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = motionKeyPosition.mPercentX;
        this.mPercentY = motionKeyPosition.mPercentY;
        this.mAltPercentX = motionKeyPosition.mAltPercentX;
        this.mAltPercentY = motionKeyPosition.mAltPercentY;
        this.mCalculatedPositionX = motionKeyPosition.mCalculatedPositionX;
        this.mCalculatedPositionY = motionKeyPosition.mCalculatedPositionY;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return TypedValues.PositionType.getId(str);
    }

    public float getPositionX() {
        return this.mCalculatedPositionX;
    }

    public float getPositionY() {
        return this.mCalculatedPositionY;
    }

    public boolean intersects(int i10, int i11, FloatRect floatRect, FloatRect floatRect2, float f8, float f10) {
        calcPosition(i10, i11, floatRect.centerX(), floatRect.centerY(), floatRect2.centerX(), floatRect2.centerY());
        if (Math.abs(f8 - this.mCalculatedPositionX) < SELECTION_SLOPE && Math.abs(f10 - this.mCalculatedPositionY) < SELECTION_SLOPE) {
            return true;
        }
        return false;
    }

    public void positionAttributes(MotionWidget motionWidget, FloatRect floatRect, FloatRect floatRect2, float f8, float f10, String[] strArr, float[] fArr) {
        int i10 = this.mPositionType;
        if (i10 != 1) {
            if (i10 != 2) {
                positionCartAttributes(floatRect, floatRect2, f8, f10, strArr, fArr);
                return;
            } else {
                positionScreenAttributes(motionWidget, floatRect, floatRect2, f8, f10, strArr, fArr);
                return;
            }
        }
        positionPathAttributes(floatRect, floatRect2, f8, f10, strArr, fArr);
    }

    public void positionCartAttributes(FloatRect floatRect, FloatRect floatRect2, float f8, float f10, String[] strArr, float[] fArr) {
        float centerX = floatRect.centerX();
        float centerY = floatRect.centerY();
        float centerX2 = floatRect2.centerX() - centerX;
        float centerY2 = floatRect2.centerY() - centerY;
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

    public void positionPathAttributes(FloatRect floatRect, FloatRect floatRect2, float f8, float f10, String[] strArr, float[] fArr) {
        float centerX = floatRect.centerX();
        float centerY = floatRect.centerY();
        float centerX2 = floatRect2.centerX() - centerX;
        float centerY2 = floatRect2.centerY() - centerY;
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

    public void positionScreenAttributes(MotionWidget motionWidget, FloatRect floatRect, FloatRect floatRect2, float f8, float f10, String[] strArr, float[] fArr) {
        floatRect.centerX();
        floatRect.centerY();
        floatRect2.centerX();
        floatRect2.centerY();
        MotionWidget parent = motionWidget.getParent();
        int width = parent.getWidth();
        int height = parent.getHeight();
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

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, float f8) {
        switch (i10) {
            case 503:
                this.mPercentWidth = f8;
                return true;
            case 504:
                this.mPercentHeight = f8;
                return true;
            case TypedValues.PositionType.TYPE_SIZE_PERCENT /* 505 */:
                this.mPercentWidth = f8;
                this.mPercentHeight = f8;
                return true;
            case TypedValues.PositionType.TYPE_PERCENT_X /* 506 */:
                this.mPercentX = f8;
                return true;
            case TypedValues.PositionType.TYPE_PERCENT_Y /* 507 */:
                this.mPercentY = f8;
                return true;
            default:
                return super.setValue(i10, f8);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> hashMap) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, int i11) {
        if (i10 == 100) {
            this.mFramePosition = i11;
            return true;
        }
        if (i10 == 508) {
            this.mCurveFit = i11;
            return true;
        }
        if (i10 != 510) {
            return super.setValue(i10, i11);
        }
        this.mPositionType = i11;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, String str) {
        if (i10 != 501) {
            return super.setValue(i10, str);
        }
        this.mTransitionEasing = str.toString();
        return true;
    }
}
