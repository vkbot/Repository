package androidx.constraintlayout.motion.widget;

import ai.onnxruntime.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MotionPaths implements Comparable<MotionPaths> {
    static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    static final int PERPENDICULAR = 1;
    static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    static String[] sNames = {"position", "x", "y", "width", "height", "pathRotate"};
    int mAnimateCircleAngleTo;
    int mAnimateRelativeTo;
    LinkedHashMap<String, ConstraintAttribute> mAttributes;
    float mHeight;
    Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mPosition;
    float mRelativeAngle;
    MotionController mRelativeToController;
    double[] mTempDelta;
    double[] mTempValue;
    float mTime;
    float mWidth;
    float mX;
    float mY;
    int mDrawPath = 0;
    float mPathRotate = Float.NaN;
    float mProgress = Float.NaN;

    public MotionPaths(int i10, int i11, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        int i12 = Key.UNSET;
        this.mPathMotionArc = i12;
        this.mAnimateRelativeTo = i12;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mAttributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (motionPaths.mAnimateRelativeTo != Key.UNSET) {
            initPolar(i10, i11, keyPosition, motionPaths, motionPaths2);
            return;
        }
        int i13 = keyPosition.mPositionType;
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    initCartesian(keyPosition, motionPaths, motionPaths2);
                    return;
                } else {
                    initAxis(keyPosition, motionPaths, motionPaths2);
                    return;
                }
            }
            initScreen(i10, i11, keyPosition, motionPaths, motionPaths2);
            return;
        }
        initPath(keyPosition, motionPaths, motionPaths2);
    }

    private boolean diff(float f8, float f10) {
        if (!Float.isNaN(f8) && !Float.isNaN(f10)) {
            if (Math.abs(f8 - f10) <= 1.0E-6f) {
                return false;
            }
            return true;
        }
        if (Float.isNaN(f8) == Float.isNaN(f10)) {
            return false;
        }
        return true;
    }

    private static float xRotate(float f8, float f10, float f11, float f12, float f13, float f14) {
        return (((f13 - f11) * f10) - ((f14 - f12) * f8)) + f11;
    }

    private static float yRotate(float f8, float f10, float f11, float f12, float f13, float f14) {
        return ((f14 - f12) * f10) + ((f13 - f11) * f8) + f12;
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateCircleAngleTo = motion.mAnimateCircleAngleTo;
        this.mProgress = constraint.propertySet.mProgress;
        this.mRelativeAngle = constraint.layout.circleAngle;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute != null && constraintAttribute.isContinuous()) {
                this.mAttributes.put(str, constraintAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull MotionPaths motionPaths) {
        return Float.compare(this.mPosition, motionPaths.mPosition);
    }

    public void configureRelativeTo(MotionController motionController) {
        motionController.getPos(this.mProgress);
    }

    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z9) {
        boolean diff = diff(this.mX, motionPaths.mX);
        boolean diff2 = diff(this.mY, motionPaths.mY);
        zArr[0] = zArr[0] | diff(this.mPosition, motionPaths.mPosition);
        boolean z10 = diff | diff2 | z9;
        zArr[1] = zArr[1] | z10;
        zArr[2] = z10 | zArr[2];
        zArr[3] = zArr[3] | diff(this.mWidth, motionPaths.mWidth);
        zArr[4] = diff(this.mHeight, motionPaths.mHeight) | zArr[4];
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.mPosition, this.mX, this.mY, this.mWidth, this.mHeight, this.mPathRotate};
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 < 6) {
                dArr[i10] = fArr[r1];
                i10++;
            }
        }
    }

    public void getBounds(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f8 = this.mWidth;
        float f10 = this.mHeight;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f11 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 != 3) {
                if (i12 == 4) {
                    f10 = f11;
                }
            } else {
                f8 = f11;
            }
        }
        fArr[i10] = f8;
        fArr[i10 + 1] = f10;
    }

    public void getCenter(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f8;
        float f10 = this.mX;
        float f11 = this.mY;
        float f12 = this.mWidth;
        float f13 = this.mHeight;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f18 = (float) dArr[i10];
            float f19 = (float) dArr2[i10];
            int i11 = iArr[i10];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            f13 = f18;
                            f17 = f19;
                        }
                    } else {
                        f12 = f18;
                        f15 = f19;
                    }
                } else {
                    f11 = f18;
                    f16 = f19;
                }
            } else {
                f10 = f18;
                f14 = f19;
            }
        }
        float f20 = (f15 / 2.0f) + f14;
        float f21 = (f17 / 2.0f) + f16;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motionController.getCenter(d, fArr3, fArr4);
            float f22 = fArr3[0];
            float f23 = fArr3[1];
            float f24 = fArr4[0];
            float f25 = fArr4[1];
            f8 = 2.0f;
            double d10 = f10;
            double d11 = f11;
            f10 = (float) (a.a(d11, d10, f22) - (f12 / 2.0f));
            f11 = (float) ((f23 - (Math.cos(d11) * d10)) - (f13 / 2.0f));
            double d12 = f14;
            double a10 = a.a(d11, d12, f24);
            double d13 = f16;
            float cos = (float) ((Math.cos(d11) * d13) + a10);
            f21 = (float) a.a(d11, d13, f25 - (Math.cos(d11) * d12));
            f20 = cos;
        } else {
            f8 = 2.0f;
        }
        fArr[0] = (f12 / f8) + f10 + 0.0f;
        fArr[1] = (f13 / f8) + f11 + 0.0f;
        fArr2[0] = f20;
        fArr2[1] = f21;
    }

    public void getCenterVelocity(double d, int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f8 = this.mX;
        float f10 = this.mY;
        float f11 = this.mWidth;
        float f12 = this.mHeight;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f13 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            f12 = f13;
                        }
                    } else {
                        f11 = f13;
                    }
                } else {
                    f10 = f13;
                }
            } else {
                f8 = f13;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d, fArr2, new float[2]);
            float f14 = fArr2[0];
            float f15 = fArr2[1];
            double d10 = f8;
            double d11 = f10;
            f8 = (float) (a.a(d11, d10, f14) - (f11 / 2.0f));
            f10 = (float) ((f15 - (Math.cos(d11) * d10)) - (f12 / 2.0f));
        }
        fArr[i10] = (f11 / 2.0f) + f8 + 0.0f;
        fArr[i10 + 1] = (f12 / 2.0f) + f10 + 0.0f;
    }

    public int getCustomData(String str, double[] dArr, int i10) {
        ConstraintAttribute constraintAttribute = this.mAttributes.get(str);
        int i11 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            dArr[i10] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        constraintAttribute.getValuesToInterpolate(new float[numberOfInterpolatedValues]);
        while (i11 < numberOfInterpolatedValues) {
            dArr[i10] = r2[i11];
            i11++;
            i10++;
        }
        return numberOfInterpolatedValues;
    }

    public int getCustomDataCount(String str) {
        ConstraintAttribute constraintAttribute = this.mAttributes.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.numberOfInterpolatedValues();
    }

    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f8 = this.mX;
        float f10 = this.mY;
        float f11 = this.mWidth;
        float f12 = this.mHeight;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f13 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            f12 = f13;
                        }
                    } else {
                        f11 = f13;
                    }
                } else {
                    f10 = f13;
                }
            } else {
                f8 = f13;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float centerX = motionController.getCenterX();
            float centerY = this.mRelativeToController.getCenterY();
            double d = f8;
            double d10 = f10;
            f8 = (float) (a.a(d10, d, centerX) - (f11 / 2.0f));
            f10 = (float) ((centerY - (Math.cos(d10) * d)) - (f12 / 2.0f));
        }
        float f14 = f11 + f8;
        float f15 = f12 + f10;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i10] = f8 + 0.0f;
        fArr[i10 + 1] = f10 + 0.0f;
        fArr[i10 + 2] = f14 + 0.0f;
        fArr[i10 + 3] = f10 + 0.0f;
        fArr[i10 + 4] = f14 + 0.0f;
        fArr[i10 + 5] = f15 + 0.0f;
        fArr[i10 + 6] = f8 + 0.0f;
        fArr[i10 + 7] = f15 + 0.0f;
    }

    public boolean hasCustomData(String str) {
        return this.mAttributes.containsKey(str);
    }

    public void initAxis(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f8;
        float f10;
        float f11;
        float f12;
        float f13 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f13;
        this.mDrawPath = keyPosition.mDrawPath;
        if (Float.isNaN(keyPosition.mPercentWidth)) {
            f8 = f13;
        } else {
            f8 = keyPosition.mPercentWidth;
        }
        if (Float.isNaN(keyPosition.mPercentHeight)) {
            f10 = f13;
        } else {
            f10 = keyPosition.mPercentHeight;
        }
        float f14 = motionPaths2.mWidth;
        float f15 = motionPaths.mWidth;
        float f16 = f14 - f15;
        float f17 = motionPaths2.mHeight;
        float f18 = motionPaths.mHeight;
        float f19 = f17 - f18;
        this.mPosition = this.mTime;
        float f20 = (f15 / 2.0f) + motionPaths.mX;
        float f21 = (f18 / 2.0f) + motionPaths.mY;
        float f22 = f13;
        float f23 = (f14 / 2.0f) + motionPaths2.mX;
        float f24 = (f17 / 2.0f) + motionPaths2.mY;
        if (f20 > f23) {
            f20 = f23;
            f23 = f20;
        }
        if (f21 <= f24) {
            f21 = f24;
            f24 = f21;
        }
        float f25 = f23 - f20;
        float f26 = f21 - f24;
        float f27 = (f16 * f8) / 2.0f;
        this.mX = (int) (((f25 * f22) + r13) - f27);
        float f28 = (f19 * f10) / 2.0f;
        this.mY = (int) (((f26 * f22) + r14) - f28);
        this.mWidth = (int) (f15 + r9);
        this.mHeight = (int) (f18 + r12);
        if (Float.isNaN(keyPosition.mPercentX)) {
            f11 = f22;
        } else {
            f11 = keyPosition.mPercentX;
        }
        float f29 = 0.0f;
        if (Float.isNaN(keyPosition.mAltPercentY)) {
            f12 = 0.0f;
        } else {
            f12 = keyPosition.mAltPercentY;
        }
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f22 = keyPosition.mPercentY;
        }
        if (!Float.isNaN(keyPosition.mAltPercentX)) {
            f29 = keyPosition.mAltPercentX;
        }
        this.mMode = 0;
        float f30 = f29 * f26;
        this.mX = (int) ((f30 + ((f11 * f25) + motionPaths.mX)) - f27);
        float f31 = f26 * f22;
        this.mY = (int) ((f31 + ((f25 * f12) + motionPaths.mY)) - f28);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initCartesian(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f8;
        float f10;
        float f11;
        float f12;
        float f13 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f13;
        this.mDrawPath = keyPosition.mDrawPath;
        if (Float.isNaN(keyPosition.mPercentWidth)) {
            f8 = f13;
        } else {
            f8 = keyPosition.mPercentWidth;
        }
        if (Float.isNaN(keyPosition.mPercentHeight)) {
            f10 = f13;
        } else {
            f10 = keyPosition.mPercentHeight;
        }
        float f14 = motionPaths2.mWidth;
        float f15 = motionPaths.mWidth;
        float f16 = f14 - f15;
        float f17 = motionPaths2.mHeight;
        float f18 = motionPaths.mHeight;
        float f19 = f17 - f18;
        this.mPosition = this.mTime;
        float f20 = motionPaths.mX;
        float f21 = motionPaths.mY;
        float f22 = f13;
        float f23 = ((f14 / 2.0f) + motionPaths2.mX) - ((f15 / 2.0f) + f20);
        float f24 = ((f17 / 2.0f) + motionPaths2.mY) - ((f18 / 2.0f) + f21);
        float f25 = (f16 * f8) / 2.0f;
        this.mX = (int) (((f23 * f22) + f20) - f25);
        float f26 = (f19 * f10) / 2.0f;
        this.mY = (int) (((f24 * f22) + f21) - f26);
        this.mWidth = (int) (f15 + r9);
        this.mHeight = (int) (f18 + r12);
        if (Float.isNaN(keyPosition.mPercentX)) {
            f11 = f22;
        } else {
            f11 = keyPosition.mPercentX;
        }
        float f27 = 0.0f;
        if (Float.isNaN(keyPosition.mAltPercentY)) {
            f12 = 0.0f;
        } else {
            f12 = keyPosition.mAltPercentY;
        }
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f22 = keyPosition.mPercentY;
        }
        if (!Float.isNaN(keyPosition.mAltPercentX)) {
            f27 = keyPosition.mAltPercentX;
        }
        this.mMode = 0;
        float f28 = f27 * f24;
        this.mX = (int) ((f28 + ((f11 * f23) + motionPaths.mX)) - f25);
        float f29 = f24 * f22;
        this.mY = (int) ((f29 + ((f23 * f12) + motionPaths.mY)) - f26);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initPath(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f8;
        float f10;
        float f11;
        float f12 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f12;
        this.mDrawPath = keyPosition.mDrawPath;
        if (Float.isNaN(keyPosition.mPercentWidth)) {
            f8 = f12;
        } else {
            f8 = keyPosition.mPercentWidth;
        }
        if (Float.isNaN(keyPosition.mPercentHeight)) {
            f10 = f12;
        } else {
            f10 = keyPosition.mPercentHeight;
        }
        float f13 = motionPaths2.mWidth - motionPaths.mWidth;
        float f14 = motionPaths2.mHeight - motionPaths.mHeight;
        this.mPosition = this.mTime;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            f12 = keyPosition.mPercentX;
        }
        float f15 = motionPaths.mX;
        float f16 = motionPaths.mWidth;
        float f17 = motionPaths.mY;
        float f18 = motionPaths.mHeight;
        float f19 = f12;
        float f20 = ((motionPaths2.mWidth / 2.0f) + motionPaths2.mX) - ((f16 / 2.0f) + f15);
        float f21 = ((motionPaths2.mHeight / 2.0f) + motionPaths2.mY) - ((f18 / 2.0f) + f17);
        float f22 = f20 * f19;
        float f23 = (f13 * f8) / 2.0f;
        this.mX = (int) ((f15 + f22) - f23);
        float f24 = f21 * f19;
        float f25 = (f14 * f10) / 2.0f;
        this.mY = (int) ((f17 + f24) - f25);
        this.mWidth = (int) (f16 + r7);
        this.mHeight = (int) (f18 + r8);
        if (Float.isNaN(keyPosition.mPercentY)) {
            f11 = 0.0f;
        } else {
            f11 = keyPosition.mPercentY;
        }
        this.mMode = 1;
        float f26 = (int) ((motionPaths.mX + f22) - f23);
        float f27 = (int) ((motionPaths.mY + f24) - f25);
        this.mX = f26 + ((-f21) * f11);
        this.mY = f27 + (f20 * f11);
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initPolar(int i10, int i11, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f8;
        float f10;
        float min;
        float f11;
        float f12;
        float f13 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f13;
        this.mDrawPath = keyPosition.mDrawPath;
        this.mMode = keyPosition.mPositionType;
        if (Float.isNaN(keyPosition.mPercentWidth)) {
            f8 = f13;
        } else {
            f8 = keyPosition.mPercentWidth;
        }
        if (Float.isNaN(keyPosition.mPercentHeight)) {
            f10 = f13;
        } else {
            f10 = keyPosition.mPercentHeight;
        }
        float f14 = motionPaths2.mWidth;
        float f15 = motionPaths.mWidth;
        float f16 = motionPaths2.mHeight;
        float f17 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        this.mWidth = (int) (((f14 - f15) * f8) + f15);
        this.mHeight = (int) (((f16 - f17) * f10) + f17);
        int i12 = keyPosition.mPositionType;
        float f18 = keyPosition.mPercentX;
        if (i12 != 2) {
            if (Float.isNaN(f18)) {
                f12 = f13;
            } else {
                f12 = keyPosition.mPercentX;
            }
            float f19 = motionPaths2.mX;
            float f20 = motionPaths.mX;
            this.mX = a.b(f19, f20, f12, f20);
            if (!Float.isNaN(keyPosition.mPercentY)) {
                f13 = keyPosition.mPercentY;
            }
            float f21 = motionPaths2.mY;
            float f22 = motionPaths.mY;
            this.mY = a.b(f21, f22, f13, f22);
        } else {
            if (Float.isNaN(f18)) {
                float f23 = motionPaths2.mX;
                float f24 = motionPaths.mX;
                min = a.b(f23, f24, f13, f24);
            } else {
                min = Math.min(f10, f8) * keyPosition.mPercentX;
            }
            this.mX = min;
            if (Float.isNaN(keyPosition.mPercentY)) {
                float f25 = motionPaths2.mY;
                float f26 = motionPaths.mY;
                f11 = a.b(f25, f26, f13, f26);
            } else {
                f11 = keyPosition.mPercentY;
            }
            this.mY = f11;
        }
        this.mAnimateRelativeTo = motionPaths.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initScreen(int i10, int i11, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f8;
        float f10;
        float f11 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f11;
        this.mDrawPath = keyPosition.mDrawPath;
        if (Float.isNaN(keyPosition.mPercentWidth)) {
            f8 = f11;
        } else {
            f8 = keyPosition.mPercentWidth;
        }
        if (Float.isNaN(keyPosition.mPercentHeight)) {
            f10 = f11;
        } else {
            f10 = keyPosition.mPercentHeight;
        }
        float f12 = motionPaths2.mWidth;
        float f13 = f12 - motionPaths.mWidth;
        float f14 = motionPaths2.mHeight;
        float f15 = f14 - motionPaths.mHeight;
        this.mPosition = this.mTime;
        float f16 = motionPaths.mX;
        float f17 = motionPaths.mY;
        float f18 = (f12 / 2.0f) + motionPaths2.mX;
        float f19 = (f14 / 2.0f) + motionPaths2.mY;
        float f20 = f13 * f8;
        this.mX = (int) ((((f18 - ((r8 / 2.0f) + f16)) * f11) + f16) - (f20 / 2.0f));
        float f21 = f15 * f10;
        this.mY = (int) ((((f19 - ((r11 / 2.0f) + f17)) * f11) + f17) - (f21 / 2.0f));
        this.mWidth = (int) (r8 + f20);
        this.mHeight = (int) (r11 + f21);
        this.mMode = 2;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            this.mX = (int) (keyPosition.mPercentX * (i10 - ((int) this.mWidth)));
        }
        if (!Float.isNaN(keyPosition.mPercentY)) {
            this.mY = (int) (keyPosition.mPercentY * (i11 - ((int) this.mHeight)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void setBounds(float f8, float f10, float f11, float f12) {
        this.mX = f8;
        this.mY = f10;
        this.mWidth = f11;
        this.mHeight = f12;
    }

    public void setDpDt(float f8, float f10, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f15 = (float) dArr[i10];
            double d = dArr2[i10];
            int i11 = iArr[i10];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            f14 = f15;
                        }
                    } else {
                        f12 = f15;
                    }
                } else {
                    f13 = f15;
                }
            } else {
                f11 = f15;
            }
        }
        float f16 = f11 - ((0.0f * f12) / 2.0f);
        float f17 = f13 - ((0.0f * f14) / 2.0f);
        fArr[0] = (((f12 * 1.0f) + f16) * f8) + ((1.0f - f8) * f16) + 0.0f;
        fArr[1] = (((f14 * 1.0f) + f17) * f10) + ((1.0f - f10) * f17) + 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setView(float f8, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z9) {
        float f10;
        float f11 = this.mX;
        float f12 = this.mY;
        float f13 = this.mWidth;
        float f14 = this.mHeight;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i10 = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i10];
            this.mTempDelta = new double[i10];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            double[] dArr4 = this.mTempValue;
            int i12 = iArr[i11];
            dArr4[i12] = dArr[i11];
            this.mTempDelta[i12] = dArr2[i11];
        }
        float f15 = Float.NaN;
        int i13 = 0;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        while (true) {
            double[] dArr5 = this.mTempValue;
            if (i13 >= dArr5.length) {
                break;
            }
            double d = 0.0d;
            if (Double.isNaN(dArr5[i13]) && (dArr3 == null || dArr3[i13] == 0.0d)) {
                f10 = f15;
            } else {
                if (dArr3 != null) {
                    d = dArr3[i13];
                }
                if (!Double.isNaN(this.mTempValue[i13])) {
                    d = this.mTempValue[i13] + d;
                }
                f10 = f15;
                float f20 = (float) d;
                float f21 = (float) this.mTempDelta[i13];
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 != 4) {
                                if (i13 == 5) {
                                    f15 = f20;
                                }
                            } else {
                                f15 = f10;
                                f19 = f21;
                                f14 = f20;
                            }
                        } else {
                            f15 = f10;
                            f18 = f21;
                            f13 = f20;
                        }
                    } else {
                        f15 = f10;
                        f17 = f21;
                        f12 = f20;
                    }
                } else {
                    f15 = f10;
                    f16 = f21;
                    f11 = f20;
                }
                i13++;
            }
            f15 = f10;
            i13++;
        }
        float f22 = f15;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motionController.getCenter(f8, fArr, fArr2);
            float f23 = fArr[0];
            float f24 = fArr[1];
            float f25 = fArr2[0];
            float f26 = fArr2[1];
            double d10 = f23;
            double d11 = f11;
            double d12 = f12;
            float a10 = (float) (a.a(d12, d11, d10) - (f13 / 2.0f));
            float cos = (float) ((f24 - (Math.cos(d12) * d11)) - (f14 / 2.0f));
            double d13 = f25;
            double d14 = f16;
            double d15 = f17;
            float cos2 = (float) ((Math.cos(d12) * d11 * d15) + a.a(d12, d14, d13));
            float sin = (float) ((Math.sin(d12) * d11 * d15) + (f26 - (Math.cos(d12) * d14)));
            if (dArr2.length >= 2) {
                dArr2[0] = cos2;
                dArr2[1] = sin;
            }
            if (!Float.isNaN(f22)) {
                view.setRotation((float) (Math.toDegrees(Math.atan2(sin, cos2)) + f22));
            }
            f11 = a10;
            f12 = cos;
        } else if (!Float.isNaN(f22)) {
            view.setRotation(f22 + ((float) Math.toDegrees(Math.atan2((f19 / 2.0f) + f17, (f18 / 2.0f) + f16))) + 0.0f);
        }
        if (view instanceof FloatLayout) {
            ((FloatLayout) view).layout(f11, f12, f13 + f11, f14 + f12);
            return;
        }
        float f27 = f11 + 0.5f;
        int i14 = (int) f27;
        float f28 = f12 + 0.5f;
        int i15 = (int) f28;
        int i16 = (int) (f27 + f13);
        int i17 = (int) (f28 + f14);
        int i18 = i16 - i14;
        int i19 = i17 - i15;
        if (i18 != view.getMeasuredWidth() || i19 != view.getMeasuredHeight() || z9) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i18, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i19, BasicMeasure.EXACTLY));
        }
        view.layout(i14, i15, i16, i17);
    }

    public void setupRelative(MotionController motionController, MotionPaths motionPaths) {
        double d = (((this.mWidth / 2.0f) + this.mX) - motionPaths.mX) - (motionPaths.mWidth / 2.0f);
        double d10 = (((this.mHeight / 2.0f) + this.mY) - motionPaths.mY) - (motionPaths.mHeight / 2.0f);
        this.mRelativeToController = motionController;
        this.mX = (float) Math.hypot(d10, d);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.mY = (float) (Math.atan2(d10, d) + 1.5707963267948966d);
        } else {
            this.mY = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    public MotionPaths() {
        int i10 = Key.UNSET;
        this.mPathMotionArc = i10;
        this.mAnimateRelativeTo = i10;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mAttributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    public void getCenter(double d, int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f8 = this.mX;
        float f10 = this.mY;
        float f11 = this.mWidth;
        float f12 = this.mHeight;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f13 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f8 = f13;
            } else if (i12 == 2) {
                f10 = f13;
            } else if (i12 == 3) {
                f11 = f13;
            } else if (i12 == 4) {
                f12 = f13;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d, fArr2, new float[2]);
            float f14 = fArr2[0];
            float f15 = fArr2[1];
            double d10 = f8;
            double d11 = f10;
            f8 = (float) (a.a(d11, d10, f14) - (f11 / 2.0f));
            f10 = (float) ((f15 - (Math.cos(d11) * d10)) - (f12 / 2.0f));
        }
        fArr[i10] = (f11 / 2.0f) + f8 + 0.0f;
        fArr[i10 + 1] = (f12 / 2.0f) + f10 + 0.0f;
    }
}
