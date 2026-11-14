package androidx.constraintlayout.motion.widget;

import ai.onnxruntime.a;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MotionController {
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
    private HashMap<String, ViewSpline> mAttributesMap;
    String mConstraintTag;
    float mCurrentCenterX;
    float mCurrentCenterY;
    private HashMap<String, ViewOscillator> mCycleMap;
    int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private KeyTrigger[] mKeyTriggers;
    private boolean mNoMovement;
    private int mPathMotionArc;
    private Interpolator mQuantizeMotionInterpolator;
    private float mQuantizeMotionPhase;
    private int mQuantizeMotionSteps;
    private CurveFit[] mSpline;
    private HashMap<String, ViewTimeCycle> mTimeCycleAttributesMap;
    private int mTransformPivotTarget;
    private View mTransformPivotView;
    View mView;
    Rect mTempRect = new Rect();
    boolean mForceMeasure = false;
    private int mCurveFitType = -1;
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
    private ArrayList<Key> mKeyList = new ArrayList<>();

    public MotionController(View view) {
        int i10 = Key.UNSET;
        this.mPathMotionArc = i10;
        this.mTransformPivotTarget = i10;
        this.mTransformPivotView = null;
        this.mQuantizeMotionSteps = i10;
        this.mQuantizeMotionPhase = Float.NaN;
        this.mQuantizeMotionInterpolator = null;
        this.mNoMovement = false;
        setView(view);
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

    private static Interpolator getInterpolator(Context context, int i10, String str, int i11) {
        if (i10 != -2) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    return null;
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            final Easing interpolator = Easing.getInterpolator(str);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionController.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f8) {
                    return (float) Easing.this.get(f8);
                }
            };
        }
        return AnimationUtils.loadInterpolator(context, i11);
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
        if (Collections.binarySearch(this.mMotionPaths, motionPaths) == 0) {
            Log.e(TAG, " KeyPath position \"" + motionPaths.mPosition + "\" outside of range");
        }
        this.mMotionPaths.add((-r0) - 1, motionPaths);
    }

    private void readView(MotionPaths motionPaths) {
        motionPaths.setBounds((int) this.mView.getX(), (int) this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    public void addKey(Key key) {
        this.mKeyList.add(key);
    }

    public void addKeys(ArrayList<Key> arrayList) {
        this.mKeyList.addAll(arrayList);
    }

    public void buildBounds(float[] fArr, int i10) {
        float f8 = 1.0f;
        float f10 = 1.0f / (i10 - 1);
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, ViewSpline> hashMap2 = this.mAttributesMap;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, ViewOscillator> hashMap3 = this.mCycleMap;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, ViewOscillator> hashMap4 = this.mCycleMap;
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

    public int buildKeyFrames(float[] fArr, int[] iArr) {
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
        for (int i13 = 0; i13 < timePoints.length; i13++) {
            this.mSpline[0].getPos(timePoints[i13], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i13], this.mInterpolateVariables, this.mInterpolateData, fArr, i12);
            i12 += 2;
        }
        return i12 / 2;
    }

    public void buildPath(float[] fArr, int i10) {
        ViewSpline viewSpline;
        ViewSpline viewSpline2;
        ViewOscillator viewOscillator;
        int i11 = i10;
        float f8 = 1.0f;
        float f10 = 1.0f / (i11 - 1);
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        ViewOscillator viewOscillator2 = null;
        if (hashMap == null) {
            viewSpline = null;
        } else {
            viewSpline = hashMap.get("translationX");
        }
        HashMap<String, ViewSpline> hashMap2 = this.mAttributesMap;
        if (hashMap2 == null) {
            viewSpline2 = null;
        } else {
            viewSpline2 = hashMap2.get("translationY");
        }
        HashMap<String, ViewOscillator> hashMap3 = this.mCycleMap;
        if (hashMap3 == null) {
            viewOscillator = null;
        } else {
            viewOscillator = hashMap3.get("translationX");
        }
        HashMap<String, ViewOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            viewOscillator2 = hashMap4.get("translationY");
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
            if (viewOscillator != null) {
                fArr[i14] = viewOscillator.get(f11) + fArr[i14];
            } else if (viewSpline != null) {
                fArr[i14] = viewSpline.get(f11) + fArr[i14];
            }
            if (viewOscillator2 != null) {
                int i15 = i14 + 1;
                fArr[i15] = viewOscillator2.get(f11) + fArr[i15];
            } else if (viewSpline2 != null) {
                int i16 = i14 + 1;
                fArr[i16] = viewSpline2.get(f11) + fArr[i16];
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

    public void endTrigger(boolean z9) {
        float f8;
        if ("button".equals(Debug.getName(this.mView)) && this.mKeyTriggers != null) {
            int i10 = 0;
            while (true) {
                KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
                if (i10 < keyTriggerArr.length) {
                    KeyTrigger keyTrigger = keyTriggerArr[i10];
                    if (z9) {
                        f8 = -100.0f;
                    } else {
                        f8 = 100.0f;
                    }
                    keyTrigger.conditionallyFire(f8, this.mView);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public int getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    public int getAttributeValues(String str, float[] fArr, int i10) {
        ViewSpline viewSpline = this.mAttributesMap.get(str);
        if (viewSpline == null) {
            return -1;
        }
        for (int i11 = 0; i11 < fArr.length; i11++) {
            fArr[i11] = viewSpline.get(i11 / (fArr.length - 1));
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

    public MotionPaths getKeyFrame(int i10) {
        return this.mMotionPaths.get(i10);
    }

    public int getKeyFrameInfo(int i10, int[] iArr) {
        float[] fArr = new float[2];
        ArrayList<Key> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            int i14 = i11 + 1;
            Key key = arrayList.get(i11);
            int i15 = key.mType;
            if (i15 == i10 || i10 != -1) {
                iArr[i13] = 0;
                iArr[i13 + 1] = i15;
                int i16 = key.mFramePosition;
                iArr[i13 + 2] = i16;
                double d = i16 / 100.0f;
                this.mSpline[0].getPos(d, this.mInterpolateData);
                this.mStartMotionPath.getCenter(d, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                iArr[i13 + 3] = Float.floatToIntBits(fArr[0]);
                int i17 = i13 + 4;
                iArr[i17] = Float.floatToIntBits(fArr[1]);
                if (key instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) key;
                    iArr[i13 + 5] = keyPosition.mPositionType;
                    iArr[i13 + 6] = Float.floatToIntBits(keyPosition.mPercentX);
                    i17 = i13 + 7;
                    iArr[i17] = Float.floatToIntBits(keyPosition.mPercentY);
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
        ArrayList<Key> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            int i13 = i11 + 1;
            Key key = arrayList.get(i11);
            int i14 = key.mFramePosition;
            iArr[i10] = (key.mType * 1000) + i14;
            double d = i14 / 100.0f;
            this.mSpline[0].getPos(d, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d, this.mInterpolateVariables, this.mInterpolateData, fArr, i12);
            i12 += 2;
            i11 = i13;
            i10++;
        }
        return i10;
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

    public KeyPositionBase getPositionKeyframe(int i10, int i11, float f8, float f10) {
        int i12;
        int i13;
        float f11;
        float f12;
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f13 = motionPaths.mX;
        rectF.left = f13;
        float f14 = motionPaths.mY;
        rectF.top = f14;
        rectF.right = f13 + motionPaths.mWidth;
        rectF.bottom = f14 + motionPaths.mHeight;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f15 = motionPaths2.mX;
        rectF2.left = f15;
        float f16 = motionPaths2.mY;
        rectF2.top = f16;
        rectF2.right = f15 + motionPaths2.mWidth;
        rectF2.bottom = f16 + motionPaths2.mHeight;
        ArrayList<Key> arrayList = this.mKeyList;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            int i15 = i14 + 1;
            Key key = arrayList.get(i14);
            if (key instanceof KeyPositionBase) {
                KeyPositionBase keyPositionBase = (KeyPositionBase) key;
                i12 = i10;
                i13 = i11;
                f11 = f8;
                f12 = f10;
                if (keyPositionBase.intersects(i12, i13, rectF, rectF2, f11, f12)) {
                    return keyPositionBase;
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
        ViewSpline viewSpline;
        ViewSpline viewSpline2;
        ViewSpline viewSpline3;
        ViewSpline viewSpline4;
        ViewSpline viewSpline5;
        ViewOscillator viewOscillator;
        ViewOscillator viewOscillator2;
        ViewOscillator viewOscillator3;
        ViewOscillator viewOscillator4;
        float adjustedPosition = getAdjustedPosition(f8, this.mVelocity);
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        ViewOscillator viewOscillator5 = null;
        if (hashMap == null) {
            viewSpline = null;
        } else {
            viewSpline = hashMap.get("translationX");
        }
        HashMap<String, ViewSpline> hashMap2 = this.mAttributesMap;
        if (hashMap2 == null) {
            viewSpline2 = null;
        } else {
            viewSpline2 = hashMap2.get("translationY");
        }
        HashMap<String, ViewSpline> hashMap3 = this.mAttributesMap;
        if (hashMap3 == null) {
            viewSpline3 = null;
        } else {
            viewSpline3 = hashMap3.get(Key.ROTATION);
        }
        HashMap<String, ViewSpline> hashMap4 = this.mAttributesMap;
        if (hashMap4 == null) {
            viewSpline4 = null;
        } else {
            viewSpline4 = hashMap4.get("scaleX");
        }
        HashMap<String, ViewSpline> hashMap5 = this.mAttributesMap;
        if (hashMap5 == null) {
            viewSpline5 = null;
        } else {
            viewSpline5 = hashMap5.get("scaleY");
        }
        HashMap<String, ViewOscillator> hashMap6 = this.mCycleMap;
        if (hashMap6 == null) {
            viewOscillator = null;
        } else {
            viewOscillator = hashMap6.get("translationX");
        }
        HashMap<String, ViewOscillator> hashMap7 = this.mCycleMap;
        if (hashMap7 == null) {
            viewOscillator2 = null;
        } else {
            viewOscillator2 = hashMap7.get("translationY");
        }
        HashMap<String, ViewOscillator> hashMap8 = this.mCycleMap;
        if (hashMap8 == null) {
            viewOscillator3 = null;
        } else {
            viewOscillator3 = hashMap8.get(Key.ROTATION);
        }
        HashMap<String, ViewOscillator> hashMap9 = this.mCycleMap;
        if (hashMap9 == null) {
            viewOscillator4 = null;
        } else {
            viewOscillator4 = hashMap9.get("scaleX");
        }
        HashMap<String, ViewOscillator> hashMap10 = this.mCycleMap;
        if (hashMap10 != null) {
            viewOscillator5 = hashMap10.get("scaleY");
        }
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(viewSpline3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, adjustedPosition);
        velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, adjustedPosition);
        velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator5, adjustedPosition);
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
            velocityMatrix.setRotationVelocity(viewSpline3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, adjustedPosition);
            velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator5, adjustedPosition);
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

    public View getView() {
        return this.mView;
    }

    public boolean interpolate(View view, float f8, long j10, KeyCache keyCache) {
        ViewTimeCycle.PathRotate pathRotate;
        boolean z9;
        View view2;
        View view3;
        float f10;
        float f11;
        double d;
        float f12;
        View view4 = view;
        float adjustedPosition = getAdjustedPosition(f8, null);
        int i10 = this.mQuantizeMotionSteps;
        if (i10 != Key.UNSET) {
            float f13 = 1.0f / i10;
            float floor = ((float) Math.floor(adjustedPosition / f13)) * f13;
            float f14 = (adjustedPosition % f13) / f13;
            if (!Float.isNaN(this.mQuantizeMotionPhase)) {
                f14 = (f14 + this.mQuantizeMotionPhase) % 1.0f;
            }
            Interpolator interpolator = this.mQuantizeMotionInterpolator;
            if (interpolator != null) {
                f12 = interpolator.getInterpolation(f14);
            } else if (f14 > 0.5d) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            adjustedPosition = (f12 * f13) + floor;
        }
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            Iterator<ViewSpline> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(view4, adjustedPosition);
            }
        }
        HashMap<String, ViewTimeCycle> hashMap2 = this.mTimeCycleAttributesMap;
        if (hashMap2 != null) {
            ViewTimeCycle.PathRotate pathRotate2 = null;
            boolean z10 = false;
            for (ViewTimeCycle viewTimeCycle : hashMap2.values()) {
                if (viewTimeCycle instanceof ViewTimeCycle.PathRotate) {
                    pathRotate2 = (ViewTimeCycle.PathRotate) viewTimeCycle;
                } else {
                    z10 |= viewTimeCycle.setProperty(view4, adjustedPosition, j10, keyCache);
                    view4 = view;
                }
            }
            z9 = z10;
            pathRotate = pathRotate2;
        } else {
            pathRotate = null;
            z9 = false;
        }
        CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d10 = adjustedPosition;
            curveFitArr[0].getPos(d10, this.mInterpolateData);
            this.mSpline[0].getSlope(d10, this.mInterpolateVelocity);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d10, dArr);
                    this.mArcSpline.getSlope(d10, this.mInterpolateVelocity);
                }
            }
            if (!this.mNoMovement) {
                float f15 = adjustedPosition;
                f10 = 1.0f;
                d = d10;
                f11 = 0.0f;
                this.mStartMotionPath.setView(f15, view, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null, this.mForceMeasure);
                adjustedPosition = f15;
                view3 = view;
                this.mForceMeasure = false;
            } else {
                view3 = view;
                f10 = 1.0f;
                f11 = 0.0f;
                d = d10;
            }
            if (this.mTransformPivotTarget != Key.UNSET) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = ((View) view3.getParent()).findViewById(this.mTransformPivotTarget);
                }
                if (this.mTransformPivotView != null) {
                    float bottom = (this.mTransformPivotView.getBottom() + r1.getTop()) / 2.0f;
                    float right = (this.mTransformPivotView.getRight() + this.mTransformPivotView.getLeft()) / 2.0f;
                    if (view3.getRight() - view3.getLeft() > 0 && view3.getBottom() - view3.getTop() > 0) {
                        view3.setPivotX(right - view3.getLeft());
                        view3.setPivotY(bottom - view3.getTop());
                    }
                }
            }
            HashMap<String, ViewSpline> hashMap3 = this.mAttributesMap;
            if (hashMap3 != null) {
                for (ViewSpline viewSpline : hashMap3.values()) {
                    if (viewSpline instanceof ViewSpline.PathRotate) {
                        double[] dArr2 = this.mInterpolateVelocity;
                        if (dArr2.length > 1) {
                            ((ViewSpline.PathRotate) viewSpline).setPathRotate(view3, adjustedPosition, dArr2[0], dArr2[1]);
                        }
                    }
                    view3 = view;
                }
            }
            if (pathRotate != null) {
                double[] dArr3 = this.mInterpolateVelocity;
                view2 = view;
                float f16 = adjustedPosition;
                adjustedPosition = f16;
                z9 |= pathRotate.setPathRotate(view2, keyCache, f16, j10, dArr3[0], dArr3[1]);
            } else {
                view2 = view;
            }
            int i11 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i11 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i11].getPos(d, this.mValuesBuff);
                CustomSupport.setInterpolatedValue(this.mStartMotionPath.mAttributes.get(this.mAttributeNames[i11 - 1]), view2, this.mValuesBuff);
                i11++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
            if (motionConstrainedPoint.mVisibilityMode == 0) {
                if (adjustedPosition <= f11) {
                    view2.setVisibility(motionConstrainedPoint.mVisibility);
                } else {
                    MotionConstrainedPoint motionConstrainedPoint2 = this.mEndPoint;
                    if (adjustedPosition >= f10) {
                        view2.setVisibility(motionConstrainedPoint2.mVisibility);
                    } else if (motionConstrainedPoint2.mVisibility != motionConstrainedPoint.mVisibility) {
                        view2.setVisibility(0);
                    }
                }
            }
            if (this.mKeyTriggers != null) {
                int i12 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
                    if (i12 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i12].conditionallyFire(adjustedPosition, view2);
                    i12++;
                }
            }
        } else {
            view2 = view;
            MotionPaths motionPaths = this.mStartMotionPath;
            float f17 = motionPaths.mX;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float b10 = a.b(motionPaths2.mX, f17, adjustedPosition, f17);
            float f18 = motionPaths.mY;
            float b11 = a.b(motionPaths2.mY, f18, adjustedPosition, f18);
            float f19 = motionPaths.mWidth;
            float f20 = motionPaths2.mWidth;
            float b12 = a.b(f20, f19, adjustedPosition, f19);
            float f21 = motionPaths.mHeight;
            float f22 = motionPaths2.mHeight;
            float f23 = b10 + 0.5f;
            int i13 = (int) f23;
            float f24 = b11 + 0.5f;
            int i14 = (int) f24;
            int i15 = (int) (f23 + b12);
            int b13 = (int) (f24 + a.b(f22, f21, adjustedPosition, f21));
            int i16 = i15 - i13;
            int i17 = b13 - i14;
            if (f20 != f19 || f22 != f21 || this.mForceMeasure) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i16, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i17, BasicMeasure.EXACTLY));
                this.mForceMeasure = false;
            }
            view2.layout(i13, i14, i15, b13);
        }
        HashMap<String, ViewOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            for (ViewOscillator viewOscillator : hashMap4.values()) {
                if (viewOscillator instanceof ViewOscillator.PathRotateSet) {
                    double[] dArr4 = this.mInterpolateVelocity;
                    ((ViewOscillator.PathRotateSet) viewOscillator).setPathRotate(view2, adjustedPosition, dArr4[0], dArr4[1]);
                } else {
                    viewOscillator.setProperty(view2, adjustedPosition);
                }
            }
        }
        return z9;
    }

    public String name() {
        return this.mView.getContext().getResources().getResourceEntryName(this.mView.getId());
    }

    public void positionKeyframe(View view, KeyPositionBase keyPositionBase, float f8, float f10, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f11 = motionPaths.mX;
        rectF.left = f11;
        float f12 = motionPaths.mY;
        rectF.top = f12;
        rectF.right = f11 + motionPaths.mWidth;
        rectF.bottom = f12 + motionPaths.mHeight;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f13 = motionPaths2.mX;
        rectF2.left = f13;
        float f14 = motionPaths2.mY;
        rectF2.top = f14;
        rectF2.right = f13 + motionPaths2.mWidth;
        rectF2.bottom = f14 + motionPaths2.mHeight;
        keyPositionBase.positionAttributes(view, rectF, rectF2, f8, f10, strArr, fArr);
    }

    public void remeasure() {
        this.mForceMeasure = true;
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

    public void setBothStates(View view) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        this.mNoMovement = true;
        motionPaths.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mEndMotionPath.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
        this.mEndPoint.setState(view);
    }

    public void setDrawPath(int i10) {
        this.mStartMotionPath.mDrawPath = i10;
    }

    public void setEndState(Rect rect, ConstraintSet constraintSet, int i10, int i11) {
        MotionController motionController;
        int i12 = constraintSet.mRotate;
        if (i12 != 0) {
            motionController = this;
            motionController.rotate(rect, this.mTempRect, i12, i10, i11);
            rect = motionController.mTempRect;
        } else {
            motionController = this;
        }
        MotionPaths motionPaths = motionController.mEndMotionPath;
        motionPaths.mTime = 1.0f;
        motionPaths.mPosition = 1.0f;
        readView(motionPaths);
        motionController.mEndMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        motionController.mEndMotionPath.applyParameters(constraintSet.getParameters(motionController.mId));
        motionController.mEndPoint.setState(rect, constraintSet, i12, motionController.mId);
    }

    public void setPathMotionArc(int i10) {
        this.mPathMotionArc = i10;
    }

    public void setStartCurrentState(View view) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        motionPaths.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
    }

    public void setStartState(ViewState viewState, View view, int i10, int i11, int i12) {
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
        this.mStartPoint.setState(rect, view, i10, viewState.rotation);
    }

    public void setTransformPivotTarget(int i10) {
        this.mTransformPivotTarget = i10;
        this.mTransformPivotView = null;
    }

    public void setView(View view) {
        this.mView = view;
        this.mId = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.mConstraintTag = ((ConstraintLayout.LayoutParams) layoutParams).getConstraintTag();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setup(int i10, int i11, float f8, long j10) {
        ArrayList arrayList;
        int i12;
        String[] strArr;
        boolean z9;
        int i13;
        int i14;
        ConstraintAttribute constraintAttribute;
        int i15;
        ViewTimeCycle makeSpline;
        ConstraintAttribute constraintAttribute2;
        int i16;
        Integer num;
        int i17;
        ViewSpline makeSpline2;
        ConstraintAttribute constraintAttribute3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i18 = this.mPathMotionArc;
        if (i18 != Key.UNSET) {
            this.mStartMotionPath.mPathMotionArc = i18;
        }
        this.mStartPoint.different(this.mEndPoint, hashSet2);
        ArrayList<Key> arrayList2 = this.mKeyList;
        int i19 = 0;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i20 = 0;
            arrayList = null;
            while (i20 < size) {
                Key key = arrayList2.get(i20);
                i20++;
                Key key2 = key;
                if (key2 instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) key2;
                    insertKey(new MotionPaths(i10, i11, keyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i21 = keyPosition.mCurveFit;
                    if (i21 != Key.UNSET) {
                        this.mCurveFitType = i21;
                    }
                } else if (key2 instanceof KeyCycle) {
                    key2.getAttributeNames(hashSet3);
                } else if (key2 instanceof KeyTimeCycle) {
                    key2.getAttributeNames(hashSet);
                } else if (key2 instanceof KeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((KeyTrigger) key2);
                } else {
                    key2.setInterpolation(hashMap);
                    key2.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.mKeyTriggers = (KeyTrigger[]) arrayList.toArray(new KeyTrigger[0]);
        }
        int i22 = 1;
        if (!hashSet2.isEmpty()) {
            this.mAttributesMap = new HashMap<>();
            Iterator<String> it = hashSet2.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next.split(",")[i22];
                    ArrayList<Key> arrayList3 = this.mKeyList;
                    int size2 = arrayList3.size();
                    int i23 = i19;
                    while (i23 < size2) {
                        Key key3 = arrayList3.get(i23);
                        i23++;
                        int i24 = i22;
                        Key key4 = key3;
                        HashMap<String, ConstraintAttribute> hashMap2 = key4.mCustomConstraints;
                        if (hashMap2 != null && (constraintAttribute3 = hashMap2.get(str)) != null) {
                            sparseArray.append(key4.mFramePosition, constraintAttribute3);
                        }
                        i22 = i24;
                    }
                    i17 = i22;
                    makeSpline2 = ViewSpline.makeCustomSpline(next, (SparseArray<ConstraintAttribute>) sparseArray);
                } else {
                    i17 = i22;
                    makeSpline2 = ViewSpline.makeSpline(next);
                }
                if (makeSpline2 != null) {
                    makeSpline2.setType(next);
                    this.mAttributesMap.put(next, makeSpline2);
                }
                i22 = i17;
                i19 = 0;
            }
            i12 = i22;
            ArrayList<Key> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                int size3 = arrayList4.size();
                int i25 = 0;
                while (i25 < size3) {
                    Key key5 = arrayList4.get(i25);
                    i25++;
                    Key key6 = key5;
                    if (key6 instanceof KeyAttributes) {
                        key6.addValues(this.mAttributesMap);
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
                ViewSpline viewSpline = this.mAttributesMap.get(str2);
                if (viewSpline != null) {
                    viewSpline.setup(i16);
                }
            }
        } else {
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
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next2.split(",")[i12];
                        ArrayList<Key> arrayList5 = this.mKeyList;
                        int size4 = arrayList5.size();
                        int i26 = 0;
                        while (i26 < size4) {
                            Key key7 = arrayList5.get(i26);
                            i26++;
                            Key key8 = key7;
                            HashMap<String, ConstraintAttribute> hashMap3 = key8.mCustomConstraints;
                            if (hashMap3 != null && (constraintAttribute2 = hashMap3.get(str3)) != null) {
                                sparseArray2.append(key8.mFramePosition, constraintAttribute2);
                            }
                        }
                        makeSpline = ViewTimeCycle.makeCustomSpline(next2, sparseArray2);
                    } else {
                        makeSpline = ViewTimeCycle.makeSpline(next2, j10);
                    }
                    if (makeSpline != null) {
                        makeSpline.setType(next2);
                        this.mTimeCycleAttributesMap.put(next2, makeSpline);
                    }
                }
            }
            ArrayList<Key> arrayList6 = this.mKeyList;
            if (arrayList6 != null) {
                int size5 = arrayList6.size();
                int i27 = 0;
                while (i27 < size5) {
                    Key key9 = arrayList6.get(i27);
                    i27++;
                    Key key10 = key9;
                    if (key10 instanceof KeyTimeCycle) {
                        ((KeyTimeCycle) key10).addTimeValues(this.mTimeCycleAttributesMap);
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
        int i28 = size6 + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i28];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size6 + 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == -1) {
            this.mCurveFitType = 0;
        }
        ArrayList<MotionPaths> arrayList7 = this.mMotionPaths;
        int size7 = arrayList7.size();
        int i29 = i12;
        int i30 = 0;
        while (i30 < size7) {
            MotionPaths motionPaths = arrayList7.get(i30);
            i30++;
            motionPathsArr[i29] = motionPaths;
            i29++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.mEndMotionPath.mAttributes.keySet()) {
            if (this.mStartMotionPath.mAttributes.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.mAttributeNames = strArr2;
        this.mAttributeInterpolatorCount = new int[strArr2.length];
        int i31 = 0;
        while (true) {
            strArr = this.mAttributeNames;
            if (i31 >= strArr.length) {
                break;
            }
            String str6 = strArr[i31];
            this.mAttributeInterpolatorCount[i31] = 0;
            int i32 = 0;
            while (true) {
                if (i32 >= i28) {
                    break;
                }
                if (motionPathsArr[i32].mAttributes.containsKey(str6) && (constraintAttribute = motionPathsArr[i32].mAttributes.get(str6)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i31] = constraintAttribute.numberOfInterpolatedValues() + iArr[i31];
                    break;
                }
                i32++;
            }
            i31++;
        }
        if (motionPathsArr[0].mPathMotionArc != Key.UNSET) {
            z9 = i12;
        } else {
            z9 = 0;
        }
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i33 = i12; i33 < i28; i33++) {
            motionPathsArr[i33].different(motionPathsArr[i33 - 1], zArr, this.mAttributeNames, z9);
        }
        int i34 = 0;
        for (int i35 = i12; i35 < length; i35++) {
            if (zArr[i35]) {
                i34++;
            }
        }
        this.mInterpolateVariables = new int[i34];
        int i36 = 2;
        int max = Math.max(2, i34);
        this.mInterpolateData = new double[max];
        this.mInterpolateVelocity = new double[max];
        int i37 = 0;
        for (int i38 = i12; i38 < length; i38++) {
            if (zArr[i38]) {
                this.mInterpolateVariables[i37] = i38;
                i37++;
            }
        }
        int[] iArr2 = new int[2];
        iArr2[i12] = this.mInterpolateVariables.length;
        iArr2[0] = i28;
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i28];
        for (int i39 = 0; i39 < i28; i39++) {
            motionPathsArr[i39].fillStandard(dArr[i39], this.mInterpolateVariables);
            dArr2[i39] = motionPathsArr[i39].mTime;
        }
        int i40 = 0;
        while (true) {
            int[] iArr3 = this.mInterpolateVariables;
            if (i40 >= iArr3.length) {
                break;
            }
            if (iArr3[i40] < MotionPaths.sNames.length) {
                String p9 = a.p(new StringBuilder(), MotionPaths.sNames[this.mInterpolateVariables[i40]], " [");
                for (int i41 = 0; i41 < i28; i41++) {
                    StringBuilder u8 = a.u(p9);
                    u8.append(dArr[i41][i40]);
                    p9 = u8.toString();
                }
            }
            i40++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i42 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i42 >= strArr3.length) {
                break;
            }
            String str7 = strArr3[i42];
            int i43 = 0;
            int i44 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i43 < i28) {
                if (motionPathsArr[i43].hasCustomData(str7)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i28];
                        int[] iArr4 = new int[i36];
                        iArr4[i12] = motionPathsArr[i43].getCustomDataCount(str7);
                        i14 = 0;
                        iArr4[0] = i28;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) cls, iArr4);
                    } else {
                        i14 = 0;
                    }
                    MotionPaths motionPaths2 = motionPathsArr[i43];
                    i13 = i42;
                    dArr3[i44] = motionPaths2.mTime;
                    motionPaths2.getCustomData(str7, dArr4[i44], i14);
                    i44++;
                } else {
                    i13 = i42;
                }
                i43++;
                i42 = i13;
                i36 = 2;
            }
            int i45 = i42 + 1;
            this.mSpline[i45] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr3, i44), (double[][]) Arrays.copyOf(dArr4, i44));
            i42 = i45;
            i36 = 2;
        }
        int i46 = 0;
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != Key.UNSET) {
            int[] iArr5 = new int[i28];
            double[] dArr5 = new double[i28];
            int[] iArr6 = new int[2];
            iArr6[i12] = 2;
            iArr6[0] = i28;
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
            for (int i47 = 0; i47 < i28; i47++) {
                iArr5[i47] = motionPathsArr[i47].mPathMotionArc;
                dArr5[i47] = r8.mTime;
                double[] dArr7 = dArr6[i47];
                dArr7[0] = r8.mX;
                dArr7[i12] = r8.mY;
            }
            i46 = 0;
            this.mArcSpline = CurveFit.getArc(iArr5, dArr5, dArr6);
        }
        this.mCycleMap = new HashMap<>();
        if (this.mKeyList != null) {
            Iterator<String> it3 = hashSet3.iterator();
            float f10 = Float.NaN;
            while (it3.hasNext()) {
                String next3 = it3.next();
                ViewOscillator makeSpline3 = ViewOscillator.makeSpline(next3);
                if (makeSpline3 != null) {
                    if (makeSpline3.variesByPath() && Float.isNaN(f10)) {
                        f10 = getPreCycleDistance();
                    }
                    makeSpline3.setType(next3);
                    this.mCycleMap.put(next3, makeSpline3);
                }
            }
            ArrayList<Key> arrayList8 = this.mKeyList;
            int size8 = arrayList8.size();
            int i48 = i46;
            while (i48 < size8) {
                Key key11 = arrayList8.get(i48);
                i48++;
                Key key12 = key11;
                if (key12 instanceof KeyCycle) {
                    ((KeyCycle) key12).addCycleValues(this.mCycleMap);
                }
            }
            Iterator<ViewOscillator> it4 = this.mCycleMap.values().iterator();
            while (it4.hasNext()) {
                it4.next().setup(f10);
            }
        }
    }

    public void setupRelative(MotionController motionController) {
        this.mStartMotionPath.setupRelative(motionController, motionController.mStartMotionPath);
        this.mEndMotionPath.setupRelative(motionController, motionController.mEndMotionPath);
    }

    public String toString() {
        return " start: x: " + this.mStartMotionPath.mX + " y: " + this.mStartMotionPath.mY + " end: x: " + this.mEndMotionPath.mX + " y: " + this.mEndMotionPath.mY;
    }

    public void setStartState(Rect rect, ConstraintSet constraintSet, int i10, int i11) {
        MotionController motionController;
        Rect rect2;
        int i12 = constraintSet.mRotate;
        if (i12 != 0) {
            motionController = this;
            rect2 = rect;
            motionController.rotate(rect2, this.mTempRect, i12, i10, i11);
        } else {
            motionController = this;
            rect2 = rect;
        }
        MotionPaths motionPaths = motionController.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        readView(motionPaths);
        motionController.mStartMotionPath.setBounds(rect2.left, rect2.top, rect2.width(), rect2.height());
        ConstraintSet.Constraint parameters = constraintSet.getParameters(motionController.mId);
        motionController.mStartMotionPath.applyParameters(parameters);
        motionController.mMotionStagger = parameters.motion.mMotionStagger;
        motionController.mStartPoint.setState(rect2, constraintSet, i12, motionController.mId);
        motionController.mTransformPivotTarget = parameters.transform.transformPivotTarget;
        ConstraintSet.Motion motion = parameters.motion;
        motionController.mQuantizeMotionSteps = motion.mQuantizeMotionSteps;
        motionController.mQuantizeMotionPhase = motion.mQuantizeMotionPhase;
        Context context = motionController.mView.getContext();
        ConstraintSet.Motion motion2 = parameters.motion;
        motionController.mQuantizeMotionInterpolator = getInterpolator(context, motion2.mQuantizeInterpolatorType, motion2.mQuantizeInterpolatorString, motion2.mQuantizeInterpolatorID);
    }
}
