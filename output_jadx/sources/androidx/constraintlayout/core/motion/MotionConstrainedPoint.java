package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.Utils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {
    static final int CARTESIAN = 2;
    public static final boolean DEBUG = false;
    static final int PERPENDICULAR = 1;
    public static final String TAG = "MotionPaths";
    static String[] sNames = {"position", "x", "y", "width", "height", "pathRotate"};
    private float mHeight;
    private Easing mKeyFrameEasing;
    private float mPosition;
    int mVisibility;
    private float mWidth;
    private float mX;
    private float mY;
    private float mAlpha = 1.0f;
    int mVisibilityMode = 0;
    private boolean mApplyElevation = false;
    private float mElevation = 0.0f;
    private float mRotation = 0.0f;
    private float mRotationX = 0.0f;
    public float rotationY = 0.0f;
    private float mScaleX = 1.0f;
    private float mScaleY = 1.0f;
    private float mPivotX = Float.NaN;
    private float mPivotY = Float.NaN;
    private float mTranslationX = 0.0f;
    private float mTranslationY = 0.0f;
    private float mTranslationZ = 0.0f;
    private int mDrawPath = 0;
    private float mPathRotate = Float.NaN;
    private float mProgress = Float.NaN;
    private int mAnimateRelativeTo = -1;
    LinkedHashMap<String, CustomVariable> mCustomVariable = new LinkedHashMap<>();
    int mMode = 0;
    double[] mTempValue = new double[18];
    double[] mTempDelta = new double[18];

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

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0023. Please report as an issue. */
    public void addValues(HashMap<String, SplineSet> hashMap, int i10) {
        for (String str : hashMap.keySet()) {
            SplineSet splineSet = hashMap.get(str);
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c = 6;
                        break;
                    }
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        c = 7;
                        break;
                    }
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c = 11;
                        break;
                    }
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        c = '\f';
                        break;
                    }
                    break;
            }
            float f8 = 1.0f;
            float f10 = 0.0f;
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.mRotationX)) {
                        f10 = this.mRotationX;
                    }
                    splineSet.setPoint(i10, f10);
                    break;
                case 1:
                    if (!Float.isNaN(this.rotationY)) {
                        f10 = this.rotationY;
                    }
                    splineSet.setPoint(i10, f10);
                    break;
                case 2:
                    if (!Float.isNaN(this.mRotation)) {
                        f10 = this.mRotation;
                    }
                    splineSet.setPoint(i10, f10);
                    break;
                case 3:
                    if (!Float.isNaN(this.mTranslationX)) {
                        f10 = this.mTranslationX;
                    }
                    splineSet.setPoint(i10, f10);
                    break;
                case 4:
                    if (!Float.isNaN(this.mTranslationY)) {
                        f10 = this.mTranslationY;
                    }
                    splineSet.setPoint(i10, f10);
                    break;
                case 5:
                    if (!Float.isNaN(this.mTranslationZ)) {
                        f10 = this.mTranslationZ;
                    }
                    splineSet.setPoint(i10, f10);
                    break;
                case 6:
                    if (!Float.isNaN(this.mProgress)) {
                        f10 = this.mProgress;
                    }
                    splineSet.setPoint(i10, f10);
                    break;
                case 7:
                    if (!Float.isNaN(this.mPivotX)) {
                        f10 = this.mPivotX;
                    }
                    splineSet.setPoint(i10, f10);
                    break;
                case '\b':
                    if (!Float.isNaN(this.mPivotY)) {
                        f10 = this.mPivotY;
                    }
                    splineSet.setPoint(i10, f10);
                    break;
                case '\t':
                    if (!Float.isNaN(this.mScaleX)) {
                        f8 = this.mScaleX;
                    }
                    splineSet.setPoint(i10, f8);
                    break;
                case '\n':
                    if (!Float.isNaN(this.mScaleY)) {
                        f8 = this.mScaleY;
                    }
                    splineSet.setPoint(i10, f8);
                    break;
                case 11:
                    if (!Float.isNaN(this.mAlpha)) {
                        f8 = this.mAlpha;
                    }
                    splineSet.setPoint(i10, f8);
                    break;
                case '\f':
                    if (!Float.isNaN(this.mPathRotate)) {
                        f10 = this.mPathRotate;
                    }
                    splineSet.setPoint(i10, f10);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.mCustomVariable.containsKey(str2)) {
                            CustomVariable customVariable = this.mCustomVariable.get(str2);
                            if (splineSet instanceof SplineSet.CustomSpline) {
                                ((SplineSet.CustomSpline) splineSet).setPoint(i10, customVariable);
                                break;
                            } else {
                                Utils.loge("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i10 + ", value" + customVariable.getValueToInterpolate() + splineSet);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        Utils.loge("MotionPaths", "UNKNOWN spline ".concat(str));
                        break;
                    }
            }
        }
    }

    public void applyParameters(MotionWidget motionWidget) {
        float alpha;
        this.mVisibility = motionWidget.getVisibility();
        if (motionWidget.getVisibility() != 4) {
            alpha = 0.0f;
        } else {
            alpha = motionWidget.getAlpha();
        }
        this.mAlpha = alpha;
        this.mApplyElevation = false;
        this.mRotation = motionWidget.getRotationZ();
        this.mRotationX = motionWidget.getRotationX();
        this.rotationY = motionWidget.getRotationY();
        this.mScaleX = motionWidget.getScaleX();
        this.mScaleY = motionWidget.getScaleY();
        this.mPivotX = motionWidget.getPivotX();
        this.mPivotY = motionWidget.getPivotY();
        this.mTranslationX = motionWidget.getTranslationX();
        this.mTranslationY = motionWidget.getTranslationY();
        this.mTranslationZ = motionWidget.getTranslationZ();
        for (String str : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.mCustomVariable.put(str, customAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
        return Float.compare(this.mPosition, motionConstrainedPoint.mPosition);
    }

    public void different(MotionConstrainedPoint motionConstrainedPoint, HashSet<String> hashSet) {
        if (diff(this.mAlpha, motionConstrainedPoint.mAlpha)) {
            hashSet.add("alpha");
        }
        if (diff(this.mElevation, motionConstrainedPoint.mElevation)) {
            hashSet.add("translationZ");
        }
        int i10 = this.mVisibility;
        int i11 = motionConstrainedPoint.mVisibility;
        if (i10 != i11 && this.mVisibilityMode == 0 && (i10 == 4 || i11 == 4)) {
            hashSet.add("alpha");
        }
        if (diff(this.mRotation, motionConstrainedPoint.mRotation)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.mPathRotate) || !Float.isNaN(motionConstrainedPoint.mPathRotate)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.mProgress) || !Float.isNaN(motionConstrainedPoint.mProgress)) {
            hashSet.add("progress");
        }
        if (diff(this.mRotationX, motionConstrainedPoint.mRotationX)) {
            hashSet.add("rotationX");
        }
        if (diff(this.rotationY, motionConstrainedPoint.rotationY)) {
            hashSet.add("rotationY");
        }
        if (diff(this.mPivotX, motionConstrainedPoint.mPivotX)) {
            hashSet.add("pivotX");
        }
        if (diff(this.mPivotY, motionConstrainedPoint.mPivotY)) {
            hashSet.add("pivotY");
        }
        if (diff(this.mScaleX, motionConstrainedPoint.mScaleX)) {
            hashSet.add("scaleX");
        }
        if (diff(this.mScaleY, motionConstrainedPoint.mScaleY)) {
            hashSet.add("scaleY");
        }
        if (diff(this.mTranslationX, motionConstrainedPoint.mTranslationX)) {
            hashSet.add("translationX");
        }
        if (diff(this.mTranslationY, motionConstrainedPoint.mTranslationY)) {
            hashSet.add("translationY");
        }
        if (diff(this.mTranslationZ, motionConstrainedPoint.mTranslationZ)) {
            hashSet.add("translationZ");
        }
        if (diff(this.mElevation, motionConstrainedPoint.mElevation)) {
            hashSet.add("elevation");
        }
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        int i10 = 0;
        float[] fArr = {this.mPosition, this.mX, this.mY, this.mWidth, this.mHeight, this.mAlpha, this.mElevation, this.mRotation, this.mRotationX, this.rotationY, this.mScaleX, this.mScaleY, this.mPivotX, this.mPivotY, this.mTranslationX, this.mTranslationY, this.mTranslationZ, this.mPathRotate};
        for (int i11 : iArr) {
            if (i11 < 18) {
                dArr[i10] = fArr[r4];
                i10++;
            }
        }
    }

    public int getCustomData(String str, double[] dArr, int i10) {
        CustomVariable customVariable = this.mCustomVariable.get(str);
        if (customVariable.numberOfInterpolatedValues() == 1) {
            dArr[i10] = customVariable.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
        customVariable.getValuesToInterpolate(new float[numberOfInterpolatedValues]);
        int i11 = 0;
        while (i11 < numberOfInterpolatedValues) {
            dArr[i10] = r1[i11];
            i11++;
            i10++;
        }
        return numberOfInterpolatedValues;
    }

    public int getCustomDataCount(String str) {
        return this.mCustomVariable.get(str).numberOfInterpolatedValues();
    }

    public boolean hasCustomData(String str) {
        return this.mCustomVariable.containsKey(str);
    }

    public void setBounds(float f8, float f10, float f11, float f12) {
        this.mX = f8;
        this.mY = f10;
        this.mWidth = f11;
        this.mHeight = f12;
    }

    public void setState(Rect rect, MotionWidget motionWidget, int i10, float f8) {
        setBounds(rect.left, rect.top, rect.width(), rect.height());
        applyParameters(motionWidget);
        this.mPivotX = Float.NaN;
        this.mPivotY = Float.NaN;
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            this.mRotation = f8 + 90.0f;
            return;
        }
        this.mRotation = f8 - 90.0f;
    }

    public void setState(MotionWidget motionWidget) {
        setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        applyParameters(motionWidget);
    }

    public void different(MotionConstrainedPoint motionConstrainedPoint, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | diff(this.mPosition, motionConstrainedPoint.mPosition);
        zArr[1] = zArr[1] | diff(this.mX, motionConstrainedPoint.mX);
        zArr[2] = zArr[2] | diff(this.mY, motionConstrainedPoint.mY);
        zArr[3] = zArr[3] | diff(this.mWidth, motionConstrainedPoint.mWidth);
        zArr[4] = diff(this.mHeight, motionConstrainedPoint.mHeight) | zArr[4];
    }
}
