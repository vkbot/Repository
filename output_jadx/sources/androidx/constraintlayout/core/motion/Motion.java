package androidx.constraintlayout.core.motion;

import ai.onnxruntime.a;
import androidx.constraintlayout.core.motion.key.MotionKey;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyTrigger;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.DifferentialInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.core.motion.utils.ViewState;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class Motion implements TypedValues {
    static final int BOUNCE = 4;
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final int INTERPOLATOR_UNDEFINED = -3;
    static final int LINEAR = 3;
    static final int OVERSHOOT = 5;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int ROTATION_LEFT = 2;
    public static final int ROTATION_RIGHT = 1;
    private static final int SPLINE_STRING = -1;
    private static final String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    private CurveFit mArcSpline;
    private int[] mAttributeInterpolatorCount;
    private String[] mAttributeNames;
    String[] mAttributeTable;
    private HashMap<String, SplineSet> mAttributesMap;
    String mConstraintTag;
    float mCurrentCenterX;
    float mCurrentCenterY;
    private HashMap<String, KeyCycleOscillator> mCycleMap;
    public String mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private MotionKeyTrigger[] mKeyTriggers;
    Motion mRelativeMotion;
    private CurveFit[] mSpline;
    private HashMap<String, TimeCycleSplineSet> mTimeCycleAttributesMap;
    MotionWidget mView;
    Rect mTempRect = new Rect();
    private int mCurveFitType = 0;
    private MotionPaths mStartMotionPath = new MotionPaths();
    private MotionPaths mEndMotionPath = new MotionPaths();
    private MotionConstrainedPoint mStartPoint = new MotionConstrainedPoint();
    private MotionConstrainedPoint mEndPoint = new MotionConstrainedPoint();
    float mMotionStagger = Float.NaN;
    float mStaggerOffset = 0.0f;
    float mStaggerScale = 1.0f;
    private int mMaxDimension = 4;
    private float[] mValuesBuff = new float[4];
    private ArrayList<MotionPaths> mMotionPaths = new ArrayList<>();
    private float[] mVelocity = new float[1];
    private ArrayList<MotionKey> mKeyList = new ArrayList<>();
    private int mPathMotionArc = -1;
    private int mTransformPivotTarget = -1;
    private MotionWidget mTransformPivotView = null;
    private int mQuantizeMotionSteps = -1;
    private float mQuantizeMotionPhase = Float.NaN;
    private DifferentialInterpolator mQuantizeMotionInterpolator = null;
    private boolean mNoMovement = false;

    public Motion(MotionWidget motionWidget) {
        setView(motionWidget);
    }

    private float getAdjustedPosition(float f8, float[] fArr) {
        float f10 = 0.0f;
        float f11 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.mStaggerScale;
            if (f12 != 1.0d) {
                float f13 = this.mStaggerOffset;
                if (f8 < f13) {
                    f8 = 0.0f;
                }
                if (f8 > f13 && f8 < 1.0d) {
                    f8 = Math.min((f8 - f13) * f12, 1.0f);
                }
            }
        }
        Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        ArrayList<MotionPaths> arrayList = this.mMotionPaths;
        int size = arrayList.size();
        float f14 = Float.NaN;
        int i10 = 0;
        while (i10 < size) {
            MotionPaths motionPaths = arrayList.get(i10);
            i10++;
            MotionPaths motionPaths2 = motionPaths;
            Easing easing2 = motionPaths2.mKeyFrameEasing;
            if (easing2 != null) {
                float f15 = motionPaths2.mTime;
                if (f15 < f8) {
                    easing = easing2;
                    f10 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = motionPaths2.mTime;
                }
            }
        }
        if (easing != null) {
            if (!Float.isNaN(f14)) {
                f11 = f14;
            }
            float f16 = f11 - f10;
            double d = (f8 - f10) / f16;
            f8 = (((float) easing.get(d)) * f16) + f10;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d);
            }
        }
        return f8;
    }

    private static DifferentialInterpolator getInterpolator(int i10, String str, int i11) {
        if (i10 != -1) {
            return null;
        }
        final Easing interpolator = Easing.getInterpolator(str);
        return new DifferentialInterpolator() { // from class: androidx.constraintlayout.core.motion.Motion.1
            float mX;

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getInterpolation(float f8) {
                this.mX = f8;
                return (float) Easing.this.get(f8);
            }

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getVelocity() {
                return (float) Easing.this.getDiff(this.mX);
            }
        };
    }

    private float getPreCycleDistance() {
        float[] fArr = new float[2];
        float f8 = 1.0f / 99;
        double d = 0.0d;
        double d10 = 0.0d;
        int i10 = 0;
        float f10 = 0.0f;
        while (i10 < 100) {
            float f11 = i10 * f8;
            double d11 = f11;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            ArrayList<MotionPaths> arrayList = this.mMotionPaths;
            int size = arrayList.size();
            float f12 = Float.NaN;
            int i11 = 0;
            float f13 = 0.0f;
            while (i11 < size) {
                MotionPaths motionPaths = arrayList.get(i11);
                i11++;
                MotionPaths motionPaths2 = motionPaths;
                float f14 = f8;
                Easing easing2 = motionPaths2.mKeyFrameEasing;
                if (easing2 != null) {
                    float f15 = motionPaths2.mTime;
                    if (f15 < f11) {
                        f13 = f15;
                        easing = easing2;
                    } else if (Float.isNaN(f12)) {
                        f12 = motionPaths2.mTime;
                    }
                }
                f8 = f14;
            }
            float f16 = f8;
            if (easing != null) {
                if (Float.isNaN(f12)) {
                    f12 = 1.0f;
                }
                d11 = (((float) easing.get((f11 - f13) / r17)) * (f12 - f13)) + f13;
            }
            double d12 = d11;
            this.mSpline[0].getPos(d12, this.mInterpolateData);
            int i12 = i10;
            this.mStartMotionPath.getCenter(d12, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            if (i12 > 0) {
                f10 += (float) Math.hypot(d10 - fArr[1], d - fArr[0]);
            }
            d = fArr[0];
            d10 = fArr[1];
            i10 = i12 + 1;
            f8 = f16;
        }
        return f10;
    }

    private void insertKey(MotionPaths motionPaths) {
        ArrayList<MotionPaths> arrayList = this.mMotionPaths;
        int size = arrayList.size();
        MotionPaths motionPaths2 = null;
        int i10 = 0;
        while (i10 < size) {
            MotionPaths motionPaths3 = arrayList.get(i10);
            i10++;
            MotionPaths motionPaths4 = motionPaths3;
            if (motionPaths.mPosition == motionPaths4.mPosition) {
                motionPaths2 = motionPaths4;
            }
        }
        if (motionPaths2 != null) {
            this.mMotionPaths.remove(motionPaths2);
        }
        if (Collections.binarySearch(this.mMotionPaths, motionPaths) == 0) {
            Utils.loge(TAG, " KeyPath position \"" + motionPaths.mPosition + "\" outside of range");
        }
        this.mMotionPaths.add((-r0) - 1, motionPaths);
    }

    private void readView(MotionPaths motionPaths) {
        motionPaths.setBounds(this.mView.getX(), this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    private void setupRelative() {
        Motion motion = this.mRelativeMotion;
        if (motion == null) {
            return;
        }
        this.mStartMotionPath.setupRelative(motion, motion.mStartMotionPath);
        MotionPaths motionPaths = this.mEndMotionPath;
        Motion motion2 = this.mRelativeMotion;
        motionPaths.setupRelative(motion2, motion2.mEndMotionPath);
    }

    public void addKey(MotionKey motionKey) {
        this.mKeyList.add(motionKey);
    }

    public void addKeys(ArrayList<MotionKey> arrayList) {
        this.mKeyList.addAll(arrayList);
    }

    public void buildBounds(float[] fArr, int i10) {
        float f8 = 1.0f;
        float f10 = 1.0f / (i10 - 1);
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, KeyCycleOscillator> hashMap3 = this.mCycleMap;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, KeyCycleOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            hashMap4.get("translationY");
        }
        int i11 = 0;
        while (i11 < i10) {
            float f11 = i11 * f10;
            float f12 = this.mStaggerScale;
            float f13 = 0.0f;
            if (f12 != f8) {
                float f14 = this.mStaggerOffset;
                if (f11 < f14) {
                    f11 = 0.0f;
                }
                if (f11 > f14 && f11 < 1.0d) {
                    f11 = Math.min((f11 - f14) * f12, f8);
                }
            }
            double d = f11;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            ArrayList<MotionPaths> arrayList = this.mMotionPaths;
            int size = arrayList.size();
            float f15 = Float.NaN;
            int i12 = 0;
            while (i12 < size) {
                MotionPaths motionPaths = arrayList.get(i12);
                i12++;
                MotionPaths motionPaths2 = motionPaths;
                Easing easing2 = motionPaths2.mKeyFrameEasing;
                if (easing2 != null) {
                    float f16 = motionPaths2.mTime;
                    if (f16 < f11) {
                        easing = easing2;
                        f13 = f16;
                    } else if (Float.isNaN(f15)) {
                        f15 = motionPaths2.mTime;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                d = (((float) easing.get((f11 - f13) / r13)) * (f15 - f13)) + f13;
            }
            this.mSpline[0].getPos(d, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d, dArr);
                }
            }
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i11 * 2);
            i11++;
            f8 = 1.0f;
        }
    }

    public int buildKeyBounds(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            ArrayList<MotionPaths> arrayList = this.mMotionPaths;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                MotionPaths motionPaths = arrayList.get(i11);
                i11++;
                iArr[i10] = motionPaths.mMode;
                i10++;
            }
        }
        int i12 = 0;
        for (double d : timePoints) {
            this.mSpline[0].getPos(d, this.mInterpolateData);
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i12);
            i12 += 2;
        }
        return i12 / 2;
    }

    public int buildKeyFrames(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            ArrayList<MotionPaths> arrayList = this.mMotionPaths;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                MotionPaths motionPaths = arrayList.get(i11);
                i11++;
                iArr[i10] = motionPaths.mMode;
                i10++;
            }
        }
        if (iArr2 != null) {
            ArrayList<MotionPaths> arrayList2 = this.mMotionPaths;
            int size2 = arrayList2.size();
            int i12 = 0;
            int i13 = 0;
            while (i13 < size2) {
                MotionPaths motionPaths2 = arrayList2.get(i13);
                i13++;
                iArr2[i12] = (int) (motionPaths2.mPosition * 100.0f);
                i12++;
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < timePoints.length; i15++) {
            this.mSpline[0].getPos(timePoints[i15], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i15], this.mInterpolateVariables, this.mInterpolateData, fArr, i14);
            i14 += 2;
        }
        return i14 / 2;
    }

    public void buildPath(float[] fArr, int i10) {
        SplineSet splineSet;
        SplineSet splineSet2;
        KeyCycleOscillator keyCycleOscillator;
        int i11 = i10;
        float f8 = 1.0f;
        float f10 = 1.0f / (i11 - 1);
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        KeyCycleOscillator keyCycleOscillator2 = null;
        if (hashMap == null) {
            splineSet = null;
        } else {
            splineSet = hashMap.get("translationX");
        }
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        if (hashMap2 == null) {
            splineSet2 = null;
        } else {
            splineSet2 = hashMap2.get("translationY");
        }
        HashMap<String, KeyCycleOscillator> hashMap3 = this.mCycleMap;
        if (hashMap3 == null) {
            keyCycleOscillator = null;
        } else {
            keyCycleOscillator = hashMap3.get("translationX");
        }
        HashMap<String, KeyCycleOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            keyCycleOscillator2 = hashMap4.get("translationY");
        }
        int i12 = 0;
        while (i12 < i11) {
            float f11 = i12 * f10;
            float f12 = this.mStaggerScale;
            float f13 = 0.0f;
            if (f12 != f8) {
                float f14 = this.mStaggerOffset;
                if (f11 < f14) {
                    f11 = 0.0f;
                }
                if (f11 > f14 && f11 < 1.0d) {
                    f11 = Math.min((f11 - f14) * f12, f8);
                }
            }
            double d = f11;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            ArrayList<MotionPaths> arrayList = this.mMotionPaths;
            int size = arrayList.size();
            float f15 = Float.NaN;
            int i13 = 0;
            while (i13 < size) {
                MotionPaths motionPaths = arrayList.get(i13);
                i13++;
                MotionPaths motionPaths2 = motionPaths;
                float f16 = f10;
                Easing easing2 = motionPaths2.mKeyFrameEasing;
                if (easing2 != null) {
                    float f17 = motionPaths2.mTime;
                    if (f17 < f11) {
                        f13 = f17;
                        easing = easing2;
                    } else if (Float.isNaN(f15)) {
                        f15 = motionPaths2.mTime;
                    }
                }
                f10 = f16;
            }
            float f18 = f10;
            if (easing != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                d = (((float) easing.get((f11 - f13) / r17)) * (f15 - f13)) + f13;
            }
            this.mSpline[0].getPos(d, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d, dArr);
                }
            }
            int i14 = i12 * 2;
            this.mStartMotionPath.getCenter(d, this.mInterpolateVariables, this.mInterpolateData, fArr, i14);
            if (keyCycleOscillator != null) {
                fArr[i14] = keyCycleOscillator.get(f11) + fArr[i14];
            } else if (splineSet != null) {
                fArr[i14] = splineSet.get(f11) + fArr[i14];
            }
            if (keyCycleOscillator2 != null) {
                int i15 = i14 + 1;
                fArr[i15] = keyCycleOscillator2.get(f11) + fArr[i15];
            } else if (splineSet2 != null) {
                int i16 = i14 + 1;
                fArr[i16] = splineSet2.get(f11) + fArr[i16];
            }
            i12++;
            i11 = i10;
            f10 = f18;
            f8 = 1.0f;
        }
    }

    public void buildRect(float f8, float[] fArr, int i10) {
        this.mSpline[0].getPos(getAdjustedPosition(f8, null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i10);
    }

    public void buildRectangles(float[] fArr, int i10) {
        float f8 = 1.0f / (i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            this.mSpline[0].getPos(getAdjustedPosition(i11 * f8, null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i11 * 8);
        }
    }

    public String getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    public int getAttributeValues(String str, float[] fArr, int i10) {
        SplineSet splineSet = this.mAttributesMap.get(str);
        if (splineSet == null) {
            return -1;
        }
        for (int i11 = 0; i11 < fArr.length; i11++) {
            fArr[i11] = splineSet.get(i11 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void getCenter(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.mSpline[0].getPos(d, dArr);
        this.mSpline[0].getSlope(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.mStartMotionPath.getCenter(d, this.mInterpolateVariables, dArr, fArr, dArr2, fArr2);
    }

    public float getCenterX() {
        return this.mCurrentCenterX;
    }

    public float getCenterY() {
        return this.mCurrentCenterY;
    }

    public void getDpDt(float f8, float f10, float f11, float[] fArr) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(f8, this.mVelocity);
        CurveFit[] curveFitArr = this.mSpline;
        int i10 = 0;
        if (curveFitArr != null) {
            double d = adjustedPosition;
            curveFitArr[0].getSlope(d, this.mInterpolateVelocity);
            this.mSpline[0].getPos(d, this.mInterpolateData);
            float f12 = this.mVelocity[0];
            while (true) {
                dArr = this.mInterpolateVelocity;
                if (i10 >= dArr.length) {
                    break;
                }
                dArr[i10] = dArr[i10] * f12;
                i10++;
            }
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr2 = this.mInterpolateData;
                if (dArr2.length > 0) {
                    curveFit.getPos(d, dArr2);
                    this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
                    this.mStartMotionPath.setDpDt(f10, f11, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
                    return;
                }
                return;
            }
            this.mStartMotionPath.setDpDt(f10, f11, fArr, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        MotionPaths motionPaths = this.mEndMotionPath;
        float f13 = motionPaths.mX;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f14 = f13 - motionPaths2.mX;
        float f15 = motionPaths.mY - motionPaths2.mY;
        float f16 = motionPaths.mWidth - motionPaths2.mWidth;
        float f17 = (motionPaths.mHeight - motionPaths2.mHeight) + f15;
        fArr[0] = ((f16 + f14) * f10) + ((1.0f - f10) * f14);
        fArr[1] = (f17 * f11) + ((1.0f - f11) * f15);
    }

    public int getDrawPath() {
        int i10 = this.mStartMotionPath.mDrawPath;
        ArrayList<MotionPaths> arrayList = this.mMotionPaths;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            MotionPaths motionPaths = arrayList.get(i11);
            i11++;
            i10 = Math.max(i10, motionPaths.mDrawPath);
        }
        return Math.max(i10, this.mEndMotionPath.mDrawPath);
    }

    public float getFinalHeight() {
        return this.mEndMotionPath.mHeight;
    }

    public float getFinalWidth() {
        return this.mEndMotionPath.mWidth;
    }

    public float getFinalX() {
        return this.mEndMotionPath.mX;
    }

    public float getFinalY() {
        return this.mEndMotionPath.mY;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return 0;
    }

    public MotionPaths getKeyFrame(int i10) {
        return this.mMotionPaths.get(i10);
    }

    public int getKeyFrameInfo(int i10, int[] iArr) {
        float[] fArr = new float[2];
        ArrayList<MotionKey> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            int i14 = i11 + 1;
            MotionKey motionKey = arrayList.get(i11);
            int i15 = motionKey.mType;
            if (i15 == i10 || i10 != -1) {
                iArr[i13] = 0;
                iArr[i13 + 1] = i15;
                int i16 = motionKey.mFramePosition;
                iArr[i13 + 2] = i16;
                double d = i16 / 100.0f;
                this.mSpline[0].getPos(d, this.mInterpolateData);
                this.mStartMotionPath.getCenter(d, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                iArr[i13 + 3] = Float.floatToIntBits(fArr[0]);
                int i17 = i13 + 4;
                iArr[i17] = Float.floatToIntBits(fArr[1]);
                if (motionKey instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
                    iArr[i13 + 5] = motionKeyPosition.mPositionType;
                    iArr[i13 + 6] = Float.floatToIntBits(motionKeyPosition.mPercentX);
                    i17 = i13 + 7;
                    iArr[i17] = Float.floatToIntBits(motionKeyPosition.mPercentY);
                }
                int i18 = i17 + 1;
                iArr[i13] = i18 - i13;
                i12++;
                i13 = i18;
            }
            i11 = i14;
        }
        return i12;
    }

    public float getKeyFrameParameter(int i10, float f8, float f10) {
        MotionPaths motionPaths = this.mEndMotionPath;
        float f11 = motionPaths.mX;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f12 = motionPaths2.mX;
        float f13 = f11 - f12;
        float f14 = motionPaths.mY;
        float f15 = motionPaths2.mY;
        float f16 = f14 - f15;
        float f17 = (motionPaths2.mWidth / 2.0f) + f12;
        float f18 = (motionPaths2.mHeight / 2.0f) + f15;
        float hypot = (float) Math.hypot(f13, f16);
        if (hypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f19 = f8 - f17;
        float f20 = f10 - f18;
        if (((float) Math.hypot(f19, f20)) == 0.0f) {
            return 0.0f;
        }
        float f21 = (f20 * f16) + (f19 * f13);
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return 0.0f;
                            }
                            return f20 / f16;
                        }
                        return f19 / f16;
                    }
                    return f20 / f13;
                }
                return f19 / f13;
            }
            return (float) Math.sqrt((hypot * hypot) - (f21 * f21));
        }
        return f21 / hypot;
    }

    public int getKeyFramePositions(int[] iArr, float[] fArr) {
        ArrayList<MotionKey> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            int i13 = i11 + 1;
            MotionKey motionKey = arrayList.get(i11);
            int i14 = motionKey.mFramePosition;
            iArr[i10] = (motionKey.mType * 1000) + i14;
            double d = i14 / 100.0f;
            this.mSpline[0].getPos(d, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d, this.mInterpolateVariables, this.mInterpolateData, fArr, i12);
            i12 += 2;
            i11 = i13;
            i10++;
        }
        return i10;
    }

    public float getMotionStagger() {
        return this.mMotionStagger;
    }

    public double[] getPos(double d) {
        this.mSpline[0].getPos(d, this.mInterpolateData);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                curveFit.getPos(d, dArr);
            }
        }
        return this.mInterpolateData;
    }

    public MotionKeyPosition getPositionKeyframe(int i10, int i11, float f8, float f10) {
        int i12;
        int i13;
        float f11;
        float f12;
        FloatRect floatRect = new FloatRect();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f13 = motionPaths.mX;
        floatRect.left = f13;
        float f14 = motionPaths.mY;
        floatRect.top = f14;
        floatRect.right = f13 + motionPaths.mWidth;
        floatRect.bottom = f14 + motionPaths.mHeight;
        FloatRect floatRect2 = new FloatRect();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f15 = motionPaths2.mX;
        floatRect2.left = f15;
        float f16 = motionPaths2.mY;
        floatRect2.top = f16;
        floatRect2.right = f15 + motionPaths2.mWidth;
        floatRect2.bottom = f16 + motionPaths2.mHeight;
        ArrayList<MotionKey> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            int i15 = i14 + 1;
            MotionKey motionKey = arrayList.get(i14);
            if (motionKey instanceof MotionKeyPosition) {
                MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
                i12 = i10;
                i13 = i11;
                f11 = f8;
                f12 = f10;
                if (motionKeyPosition.intersects(i12, i13, floatRect, floatRect2, f11, f12)) {
                    return motionKeyPosition;
                }
            } else {
                i12 = i10;
                i13 = i11;
                f11 = f8;
                f12 = f10;
            }
            i10 = i12;
            i11 = i13;
            f8 = f11;
            f10 = f12;
            i14 = i15;
        }
        return null;
    }

    public void getPostLayoutDvDp(float f8, int i10, int i11, float f10, float f11, float[] fArr) {
        SplineSet splineSet;
        SplineSet splineSet2;
        SplineSet splineSet3;
        SplineSet splineSet4;
        SplineSet splineSet5;
        KeyCycleOscillator keyCycleOscillator;
        KeyCycleOscillator keyCycleOscillator2;
        KeyCycleOscillator keyCycleOscillator3;
        KeyCycleOscillator keyCycleOscillator4;
        float adjustedPosition = getAdjustedPosition(f8, this.mVelocity);
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        KeyCycleOscillator keyCycleOscillator5 = null;
        if (hashMap == null) {
            splineSet = null;
        } else {
            splineSet = hashMap.get("translationX");
        }
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        if (hashMap2 == null) {
            splineSet2 = null;
        } else {
            splineSet2 = hashMap2.get("translationY");
        }
        HashMap<String, SplineSet> hashMap3 = this.mAttributesMap;
        if (hashMap3 == null) {
            splineSet3 = null;
        } else {
            splineSet3 = hashMap3.get("rotationZ");
        }
        HashMap<String, SplineSet> hashMap4 = this.mAttributesMap;
        if (hashMap4 == null) {
            splineSet4 = null;
        } else {
            splineSet4 = hashMap4.get("scaleX");
        }
        HashMap<String, SplineSet> hashMap5 = this.mAttributesMap;
        if (hashMap5 == null) {
            splineSet5 = null;
        } else {
            splineSet5 = hashMap5.get("scaleY");
        }
        HashMap<String, KeyCycleOscillator> hashMap6 = this.mCycleMap;
        if (hashMap6 == null) {
            keyCycleOscillator = null;
        } else {
            keyCycleOscillator = hashMap6.get("translationX");
        }
        HashMap<String, KeyCycleOscillator> hashMap7 = this.mCycleMap;
        if (hashMap7 == null) {
            keyCycleOscillator2 = null;
        } else {
            keyCycleOscillator2 = hashMap7.get("translationY");
        }
        HashMap<String, KeyCycleOscillator> hashMap8 = this.mCycleMap;
        if (hashMap8 == null) {
            keyCycleOscillator3 = null;
        } else {
            keyCycleOscillator3 = hashMap8.get("rotationZ");
        }
        HashMap<String, KeyCycleOscillator> hashMap9 = this.mCycleMap;
        if (hashMap9 == null) {
            keyCycleOscillator4 = null;
        } else {
            keyCycleOscillator4 = hashMap9.get("scaleX");
        }
        HashMap<String, KeyCycleOscillator> hashMap10 = this.mCycleMap;
        if (hashMap10 != null) {
            keyCycleOscillator5 = hashMap10.get("scaleY");
        }
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
        velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
        velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(keyCycleOscillator4, keyCycleOscillator5, adjustedPosition);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                double d = adjustedPosition;
                curveFit.getPos(d, dArr);
                this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(f10, f11, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(f10, f11, i10, i11, fArr);
            return;
        }
        int i12 = 0;
        if (this.mSpline != null) {
            double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.mVelocity);
            this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
            this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
            float f12 = this.mVelocity[0];
            while (true) {
                double[] dArr2 = this.mInterpolateVelocity;
                if (i12 < dArr2.length) {
                    dArr2[i12] = dArr2[i12] * f12;
                    i12++;
                } else {
                    this.mStartMotionPath.setDpDt(f10, f11, fArr, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                    velocityMatrix.applyTransform(f10, f11, i10, i11, fArr);
                    return;
                }
            }
        } else {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f13 = motionPaths.mX;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f14 = f13 - motionPaths2.mX;
            float f15 = motionPaths.mY - motionPaths2.mY;
            float f16 = motionPaths.mWidth - motionPaths2.mWidth;
            float f17 = f15 + (motionPaths.mHeight - motionPaths2.mHeight);
            fArr[0] = ((f16 + f14) * f10) + ((1.0f - f10) * f14);
            fArr[1] = (f17 * f11) + ((1.0f - f11) * f15);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
            velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
            velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(keyCycleOscillator4, keyCycleOscillator5, adjustedPosition);
            velocityMatrix.applyTransform(f10, f11, i10, i11, fArr);
        }
    }

    public float getStartHeight() {
        return this.mStartMotionPath.mHeight;
    }

    public float getStartWidth() {
        return this.mStartMotionPath.mWidth;
    }

    public float getStartX() {
        return this.mStartMotionPath.mX;
    }

    public float getStartY() {
        return this.mStartMotionPath.mY;
    }

    public int getTransformPivotTarget() {
        return this.mTransformPivotTarget;
    }

    public MotionWidget getView() {
        return this.mView;
    }

    public boolean interpolate(MotionWidget motionWidget, float f8, long j10, KeyCache keyCache) {
        float f10;
        MotionWidget motionWidget2 = motionWidget;
        float adjustedPosition = getAdjustedPosition(f8, null);
        int i10 = this.mQuantizeMotionSteps;
        if (i10 != -1) {
            float f11 = 1.0f / i10;
            float floor = ((float) Math.floor(adjustedPosition / f11)) * f11;
            float f12 = (adjustedPosition % f11) / f11;
            if (!Float.isNaN(this.mQuantizeMotionPhase)) {
                f12 = (f12 + this.mQuantizeMotionPhase) % 1.0f;
            }
            DifferentialInterpolator differentialInterpolator = this.mQuantizeMotionInterpolator;
            if (differentialInterpolator != null) {
                f10 = differentialInterpolator.getInterpolation(f12);
            } else if (f12 > 0.5d) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            adjustedPosition = (f10 * f11) + floor;
        }
        float f13 = adjustedPosition;
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            Iterator<SplineSet> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(motionWidget2, f13);
            }
        }
        CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d = f13;
            curveFitArr[0].getPos(d, this.mInterpolateData);
            this.mSpline[0].getSlope(d, this.mInterpolateVelocity);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d, dArr);
                    this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
                }
            }
            if (!this.mNoMovement) {
                this.mStartMotionPath.setView(f13, motionWidget2, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null);
                f13 = f13;
                motionWidget2 = motionWidget2;
            }
            if (this.mTransformPivotTarget != -1) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = motionWidget2.getParent().findViewById(this.mTransformPivotTarget);
                }
                if (this.mTransformPivotView != null) {
                    float bottom = (this.mTransformPivotView.getBottom() + r1.getTop()) / 2.0f;
                    float right = (this.mTransformPivotView.getRight() + this.mTransformPivotView.getLeft()) / 2.0f;
                    if (motionWidget2.getRight() - motionWidget2.getLeft() > 0 && motionWidget2.getBottom() - motionWidget2.getTop() > 0) {
                        motionWidget2.setPivotX(right - motionWidget2.getLeft());
                        motionWidget2.setPivotY(bottom - motionWidget2.getTop());
                    }
                }
            }
            int i11 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i11 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i11].getPos(d, this.mValuesBuff);
                this.mStartMotionPath.mCustomAttributes.get(this.mAttributeNames[i11 - 1]).setInterpolatedValue(motionWidget2, this.mValuesBuff);
                i11++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
            if (motionConstrainedPoint.mVisibilityMode == 0) {
                if (f13 <= 0.0f) {
                    motionWidget2.setVisibility(motionConstrainedPoint.mVisibility);
                } else {
                    MotionConstrainedPoint motionConstrainedPoint2 = this.mEndPoint;
                    if (f13 >= 1.0f) {
                        motionWidget2.setVisibility(motionConstrainedPoint2.mVisibility);
                    } else if (motionConstrainedPoint2.mVisibility != motionConstrainedPoint.mVisibility) {
                        motionWidget2.setVisibility(4);
                    }
                }
            }
            if (this.mKeyTriggers != null) {
                int i12 = 0;
                while (true) {
                    MotionKeyTrigger[] motionKeyTriggerArr = this.mKeyTriggers;
                    if (i12 >= motionKeyTriggerArr.length) {
                        break;
                    }
                    motionKeyTriggerArr[i12].conditionallyFire(f13, motionWidget2);
                    i12++;
                }
            }
        } else {
            MotionPaths motionPaths = this.mStartMotionPath;
            float f14 = motionPaths.mX;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float b10 = a.b(motionPaths2.mX, f14, f13, f14);
            float f15 = motionPaths.mY;
            float b11 = a.b(motionPaths2.mY, f15, f13, f15);
            float f16 = motionPaths.mWidth;
            float b12 = a.b(motionPaths2.mWidth, f16, f13, f16);
            float f17 = motionPaths.mHeight;
            float f18 = b10 + 0.5f;
            float f19 = b11 + 0.5f;
            motionWidget2.layout((int) f18, (int) f19, (int) (f18 + b12), (int) (f19 + a.b(motionPaths2.mHeight, f17, f13, f17)));
        }
        HashMap<String, KeyCycleOscillator> hashMap2 = this.mCycleMap;
        if (hashMap2 != null) {
            for (KeyCycleOscillator keyCycleOscillator : hashMap2.values()) {
                if (keyCycleOscillator instanceof KeyCycleOscillator.PathRotateSet) {
                    double[] dArr2 = this.mInterpolateVelocity;
                    ((KeyCycleOscillator.PathRotateSet) keyCycleOscillator).setPathRotate(motionWidget2, f13, dArr2[0], dArr2[1]);
                } else {
                    keyCycleOscillator.setProperty(motionWidget2, f13);
                }
            }
        }
        return false;
    }

    public String name() {
        return this.mView.getName();
    }

    public void positionKeyframe(MotionWidget motionWidget, MotionKeyPosition motionKeyPosition, float f8, float f10, String[] strArr, float[] fArr) {
        FloatRect floatRect = new FloatRect();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f11 = motionPaths.mX;
        floatRect.left = f11;
        float f12 = motionPaths.mY;
        floatRect.top = f12;
        floatRect.right = f11 + motionPaths.mWidth;
        floatRect.bottom = f12 + motionPaths.mHeight;
        FloatRect floatRect2 = new FloatRect();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f13 = motionPaths2.mX;
        floatRect2.left = f13;
        float f14 = motionPaths2.mY;
        floatRect2.top = f14;
        floatRect2.right = f13 + motionPaths2.mWidth;
        floatRect2.bottom = f14 + motionPaths2.mHeight;
        motionKeyPosition.positionAttributes(motionWidget, floatRect, floatRect2, f8, f10, strArr, fArr);
    }

    public void rotate(Rect rect, Rect rect2, int i10, int i11, int i12) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                    int i13 = rect.left + rect.right;
                    rect2.left = i11 - ((rect.width() + (rect.bottom + rect.top)) / 2);
                    rect2.top = (i13 - rect.height()) / 2;
                    rect2.right = rect.width() + rect2.left;
                    rect2.bottom = rect.height() + rect2.top;
                    return;
                }
                int i14 = rect.left + rect.right;
                rect2.left = ((rect.height() / 2) + rect.top) - (i14 / 2);
                rect2.top = i12 - ((rect.height() + i14) / 2);
                rect2.right = rect.width() + rect2.left;
                rect2.bottom = rect.height() + rect2.top;
                return;
            }
            int i15 = rect.left + rect.right;
            rect2.left = i11 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i15 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        int i16 = rect.left + rect.right;
        rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
        rect2.top = i12 - ((rect.height() + i16) / 2);
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public void setBothStates(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        this.mNoMovement = true;
        motionPaths.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mEndMotionPath.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mStartPoint.setState(motionWidget);
        this.mEndPoint.setState(motionWidget);
    }

    public void setDrawPath(int i10) {
        this.mStartMotionPath.mDrawPath = i10;
    }

    public void setEnd(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mEndMotionPath;
        motionPaths.mTime = 1.0f;
        motionPaths.mPosition = 1.0f;
        readView(motionPaths);
        this.mEndMotionPath.setBounds(motionWidget.getLeft(), motionWidget.getTop(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mEndMotionPath.applyParameters(motionWidget);
        this.mEndPoint.setState(motionWidget);
    }

    public void setIdString(String str) {
        this.mId = str;
        this.mStartMotionPath.mId = str;
    }

    public void setPathMotionArc(int i10) {
        this.mPathMotionArc = i10;
    }

    public void setStaggerOffset(float f8) {
        this.mStaggerOffset = f8;
    }

    public void setStaggerScale(float f8) {
        this.mStaggerScale = f8;
    }

    public void setStart(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        motionPaths.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mStartMotionPath.applyParameters(motionWidget);
        this.mStartPoint.setState(motionWidget);
        TypedBundle motionProperties = motionWidget.getWidgetFrame().getMotionProperties();
        if (motionProperties != null) {
            motionProperties.applyDelta(this);
        }
    }

    public void setStartState(ViewState viewState, MotionWidget motionWidget, int i10, int i11, int i12) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        Rect rect = new Rect();
        if (i10 != 1) {
            if (i10 == 2) {
                int i13 = viewState.left + viewState.right;
                rect.left = i12 - ((viewState.width() + (viewState.top + viewState.bottom)) / 2);
                rect.top = (i13 - viewState.height()) / 2;
                rect.right = viewState.width() + rect.left;
                rect.bottom = viewState.height() + rect.top;
            }
        } else {
            int i14 = viewState.left + viewState.right;
            rect.left = ((viewState.top + viewState.bottom) - viewState.width()) / 2;
            rect.top = i11 - ((viewState.height() + i14) / 2);
            rect.right = viewState.width() + rect.left;
            rect.bottom = viewState.height() + rect.top;
        }
        this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mStartPoint.setState(rect, motionWidget, i10, viewState.rotation);
    }

    public void setTransformPivotTarget(int i10) {
        this.mTransformPivotTarget = i10;
        this.mTransformPivotView = null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, String str) {
        if (705 != i10 && 611 != i10) {
            if (605 != i10) {
                return false;
            }
            this.mStartMotionPath.mAnimateRelativeTo = str;
            return true;
        }
        this.mQuantizeMotionInterpolator = getInterpolator(-1, str, 0);
        return true;
    }

    public void setView(MotionWidget motionWidget) {
        this.mView = motionWidget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setup(int i10, int i11, float f8, long j10) {
        ArrayList arrayList;
        HashSet<String> hashSet;
        HashSet<String> hashSet2;
        int i12;
        String[] strArr;
        boolean z9;
        int i13;
        int i14;
        CustomVariable customVariable;
        int i15;
        SplineSet makeSpline;
        CustomVariable customVariable2;
        int i16;
        Integer num;
        HashSet<String> hashSet3;
        HashSet<String> hashSet4;
        int i17;
        SplineSet makeSpline2;
        CustomVariable customVariable3;
        new HashSet();
        HashSet<String> hashSet5 = new HashSet<>();
        HashSet<String> hashSet6 = new HashSet<>();
        HashSet<String> hashSet7 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        setupRelative();
        int i18 = this.mPathMotionArc;
        if (i18 != -1) {
            MotionPaths motionPaths = this.mStartMotionPath;
            if (motionPaths.mPathMotionArc == -1) {
                motionPaths.mPathMotionArc = i18;
            }
        }
        this.mStartPoint.different(this.mEndPoint, hashSet6);
        ArrayList<MotionKey> arrayList2 = this.mKeyList;
        int i19 = 0;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i20 = 0;
            arrayList = null;
            while (i20 < size) {
                MotionKey motionKey = arrayList2.get(i20);
                i20++;
                MotionKey motionKey2 = motionKey;
                if (motionKey2 instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey2;
                    insertKey(new MotionPaths(i10, i11, motionKeyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i21 = motionKeyPosition.mCurveFit;
                    if (i21 != -1) {
                        this.mCurveFitType = i21;
                    }
                } else if (motionKey2 instanceof MotionKeyCycle) {
                    motionKey2.getAttributeNames(hashSet7);
                } else if (motionKey2 instanceof MotionKeyTimeCycle) {
                    motionKey2.getAttributeNames(hashSet5);
                } else if (motionKey2 instanceof MotionKeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((MotionKeyTrigger) motionKey2);
                } else {
                    motionKey2.setInterpolation(hashMap);
                    motionKey2.getAttributeNames(hashSet6);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.mKeyTriggers = (MotionKeyTrigger[]) arrayList.toArray(new MotionKeyTrigger[0]);
        }
        int i22 = 1;
        if (!hashSet6.isEmpty()) {
            this.mAttributesMap = new HashMap<>();
            Iterator<String> it = hashSet6.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.startsWith("CUSTOM,")) {
                    KeyFrameArray.CustomVar customVar = new KeyFrameArray.CustomVar();
                    String str = next.split(",")[i22];
                    i17 = i22;
                    ArrayList<MotionKey> arrayList3 = this.mKeyList;
                    int size2 = arrayList3.size();
                    while (i19 < size2) {
                        MotionKey motionKey3 = arrayList3.get(i19);
                        i19++;
                        HashSet<String> hashSet8 = hashSet5;
                        MotionKey motionKey4 = motionKey3;
                        HashSet<String> hashSet9 = hashSet7;
                        HashMap<String, CustomVariable> hashMap2 = motionKey4.mCustom;
                        if (hashMap2 != null && (customVariable3 = hashMap2.get(str)) != null) {
                            customVar.append(motionKey4.mFramePosition, customVariable3);
                        }
                        hashSet7 = hashSet9;
                        hashSet5 = hashSet8;
                    }
                    hashSet3 = hashSet5;
                    hashSet4 = hashSet7;
                    makeSpline2 = SplineSet.makeCustomSplineSet(next, customVar);
                } else {
                    hashSet3 = hashSet5;
                    hashSet4 = hashSet7;
                    i17 = i22;
                    makeSpline2 = SplineSet.makeSpline(next, j10);
                }
                if (makeSpline2 != null) {
                    makeSpline2.setType(next);
                    this.mAttributesMap.put(next, makeSpline2);
                }
                i22 = i17;
                hashSet7 = hashSet4;
                hashSet5 = hashSet3;
                i19 = 0;
            }
            hashSet = hashSet5;
            hashSet2 = hashSet7;
            i12 = i22;
            ArrayList<MotionKey> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                int size3 = arrayList4.size();
                int i23 = 0;
                while (i23 < size3) {
                    MotionKey motionKey5 = arrayList4.get(i23);
                    i23++;
                    MotionKey motionKey6 = motionKey5;
                    if (motionKey6 instanceof MotionKeyAttributes) {
                        motionKey6.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (String str2 : this.mAttributesMap.keySet()) {
                if (hashMap.containsKey(str2) && (num = hashMap.get(str2)) != null) {
                    i16 = num.intValue();
                } else {
                    i16 = 0;
                }
                SplineSet splineSet = this.mAttributesMap.get(str2);
                if (splineSet != null) {
                    splineSet.setup(i16);
                }
            }
        } else {
            hashSet = hashSet5;
            hashSet2 = hashSet7;
            i12 = 1;
        }
        if (!hashSet.isEmpty()) {
            if (this.mTimeCycleAttributesMap == null) {
                this.mTimeCycleAttributesMap = new HashMap<>();
            }
            Iterator<String> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (!this.mTimeCycleAttributesMap.containsKey(next2)) {
                    if (next2.startsWith("CUSTOM,")) {
                        KeyFrameArray.CustomVar customVar2 = new KeyFrameArray.CustomVar();
                        String str3 = next2.split(",")[i12];
                        ArrayList<MotionKey> arrayList5 = this.mKeyList;
                        int size4 = arrayList5.size();
                        int i24 = 0;
                        while (i24 < size4) {
                            MotionKey motionKey7 = arrayList5.get(i24);
                            i24++;
                            MotionKey motionKey8 = motionKey7;
                            HashMap<String, CustomVariable> hashMap3 = motionKey8.mCustom;
                            if (hashMap3 != null && (customVariable2 = hashMap3.get(str3)) != null) {
                                customVar2.append(motionKey8.mFramePosition, customVariable2);
                            }
                        }
                        makeSpline = SplineSet.makeCustomSplineSet(next2, customVar2);
                    } else {
                        makeSpline = SplineSet.makeSpline(next2, j10);
                    }
                    if (makeSpline != null) {
                        makeSpline.setType(next2);
                    }
                }
            }
            ArrayList<MotionKey> arrayList6 = this.mKeyList;
            if (arrayList6 != null) {
                int size5 = arrayList6.size();
                int i25 = 0;
                while (i25 < size5) {
                    MotionKey motionKey9 = arrayList6.get(i25);
                    i25++;
                    MotionKey motionKey10 = motionKey9;
                    if (motionKey10 instanceof MotionKeyTimeCycle) {
                        ((MotionKeyTimeCycle) motionKey10).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (String str4 : this.mTimeCycleAttributesMap.keySet()) {
                if (hashMap.containsKey(str4)) {
                    i15 = hashMap.get(str4).intValue();
                } else {
                    i15 = 0;
                }
                this.mTimeCycleAttributesMap.get(str4).setup(i15);
            }
        }
        int size6 = this.mMotionPaths.size();
        int i26 = size6 + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i26];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size6 + 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == MotionKey.UNSET) {
            this.mCurveFitType = 0;
        }
        ArrayList<MotionPaths> arrayList7 = this.mMotionPaths;
        int size7 = arrayList7.size();
        int i27 = i12;
        int i28 = 0;
        while (i28 < size7) {
            MotionPaths motionPaths2 = arrayList7.get(i28);
            i28++;
            motionPathsArr[i27] = motionPaths2;
            i27++;
        }
        HashSet hashSet10 = new HashSet();
        for (String str5 : this.mEndMotionPath.mCustomAttributes.keySet()) {
            if (this.mStartMotionPath.mCustomAttributes.containsKey(str5)) {
                if (!hashSet6.contains("CUSTOM," + str5)) {
                    hashSet10.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet10.toArray(new String[0]);
        this.mAttributeNames = strArr2;
        this.mAttributeInterpolatorCount = new int[strArr2.length];
        int i29 = 0;
        while (true) {
            strArr = this.mAttributeNames;
            if (i29 >= strArr.length) {
                break;
            }
            String str6 = strArr[i29];
            this.mAttributeInterpolatorCount[i29] = 0;
            int i30 = 0;
            while (true) {
                if (i30 >= i26) {
                    break;
                }
                if (motionPathsArr[i30].mCustomAttributes.containsKey(str6) && (customVariable = motionPathsArr[i30].mCustomAttributes.get(str6)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i29] = customVariable.numberOfInterpolatedValues() + iArr[i29];
                    break;
                }
                i30++;
            }
            i29++;
        }
        if (motionPathsArr[0].mPathMotionArc != -1) {
            z9 = i12;
        } else {
            z9 = 0;
        }
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i31 = i12; i31 < i26; i31++) {
            motionPathsArr[i31].different(motionPathsArr[i31 - 1], zArr, this.mAttributeNames, z9);
        }
        int i32 = 0;
        for (int i33 = i12; i33 < length; i33++) {
            if (zArr[i33]) {
                i32++;
            }
        }
        this.mInterpolateVariables = new int[i32];
        int i34 = 2;
        int max = Math.max(2, i32);
        this.mInterpolateData = new double[max];
        this.mInterpolateVelocity = new double[max];
        int i35 = 0;
        for (int i36 = i12; i36 < length; i36++) {
            if (zArr[i36]) {
                this.mInterpolateVariables[i35] = i36;
                i35++;
            }
        }
        int[] iArr2 = new int[2];
        iArr2[i12] = this.mInterpolateVariables.length;
        iArr2[0] = i26;
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i26];
        for (int i37 = 0; i37 < i26; i37++) {
            motionPathsArr[i37].fillStandard(dArr[i37], this.mInterpolateVariables);
            dArr2[i37] = motionPathsArr[i37].mTime;
        }
        int i38 = 0;
        while (true) {
            int[] iArr3 = this.mInterpolateVariables;
            if (i38 >= iArr3.length) {
                break;
            }
            if (iArr3[i38] < MotionPaths.sNames.length) {
                String p9 = a.p(new StringBuilder(), MotionPaths.sNames[this.mInterpolateVariables[i38]], " [");
                for (int i39 = 0; i39 < i26; i39++) {
                    StringBuilder u8 = a.u(p9);
                    u8.append(dArr[i39][i38]);
                    p9 = u8.toString();
                }
            }
            i38++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i40 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i40 >= strArr3.length) {
                break;
            }
            String str7 = strArr3[i40];
            int i41 = 0;
            int i42 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i41 < i26) {
                if (motionPathsArr[i41].hasCustomData(str7)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i26];
                        int[] iArr4 = new int[i34];
                        iArr4[i12] = motionPathsArr[i41].getCustomDataCount(str7);
                        i14 = 0;
                        iArr4[0] = i26;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) cls, iArr4);
                    } else {
                        i14 = 0;
                    }
                    MotionPaths motionPaths3 = motionPathsArr[i41];
                    i13 = i40;
                    dArr3[i42] = motionPaths3.mTime;
                    motionPaths3.getCustomData(str7, dArr4[i42], i14);
                    i42++;
                } else {
                    i13 = i40;
                }
                i41++;
                i40 = i13;
                i34 = 2;
            }
            int i43 = i40 + 1;
            this.mSpline[i43] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr3, i42), (double[][]) Arrays.copyOf(dArr4, i42));
            i40 = i43;
            i34 = 2;
        }
        int i44 = 0;
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != -1) {
            int[] iArr5 = new int[i26];
            double[] dArr5 = new double[i26];
            int[] iArr6 = new int[2];
            iArr6[i12] = 2;
            iArr6[0] = i26;
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
            for (int i45 = 0; i45 < i26; i45++) {
                iArr5[i45] = motionPathsArr[i45].mPathMotionArc;
                dArr5[i45] = r6.mTime;
                double[] dArr7 = dArr6[i45];
                dArr7[0] = r6.mX;
                dArr7[i12] = r6.mY;
            }
            i44 = 0;
            this.mArcSpline = CurveFit.getArc(iArr5, dArr5, dArr6);
        }
        this.mCycleMap = new HashMap<>();
        if (this.mKeyList != null) {
            Iterator<String> it3 = hashSet2.iterator();
            float f10 = Float.NaN;
            while (it3.hasNext()) {
                String next3 = it3.next();
                KeyCycleOscillator makeWidgetCycle = KeyCycleOscillator.makeWidgetCycle(next3);
                if (makeWidgetCycle != null) {
                    if (makeWidgetCycle.variesByPath() && Float.isNaN(f10)) {
                        f10 = getPreCycleDistance();
                    }
                    makeWidgetCycle.setType(next3);
                    this.mCycleMap.put(next3, makeWidgetCycle);
                }
            }
            ArrayList<MotionKey> arrayList8 = this.mKeyList;
            int size8 = arrayList8.size();
            int i46 = i44;
            while (i46 < size8) {
                MotionKey motionKey11 = arrayList8.get(i46);
                i46++;
                MotionKey motionKey12 = motionKey11;
                if (motionKey12 instanceof MotionKeyCycle) {
                    ((MotionKeyCycle) motionKey12).addCycleValues(this.mCycleMap);
                }
            }
            Iterator<KeyCycleOscillator> it4 = this.mCycleMap.values().iterator();
            while (it4.hasNext()) {
                it4.next().setup(f10);
            }
        }
    }

    public String toString() {
        return " start: x: " + this.mStartMotionPath.mX + " y: " + this.mStartMotionPath.mY + " end: x: " + this.mEndMotionPath.mX + " y: " + this.mEndMotionPath.mY;
    }

    public void endTrigger(boolean z9) {
    }

    public void setupRelative(Motion motion) {
        this.mRelativeMotion = motion;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, int i11) {
        if (i10 == 509) {
            setPathMotionArc(i11);
            return true;
        }
        if (i10 != 610) {
            return i10 == 704;
        }
        this.mQuantizeMotionSteps = i11;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, float f8) {
        if (602 == i10) {
            this.mQuantizeMotionPhase = f8;
            return true;
        }
        if (600 != i10) {
            return false;
        }
        this.mMotionStagger = f8;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, boolean z9) {
        return false;
    }
}
