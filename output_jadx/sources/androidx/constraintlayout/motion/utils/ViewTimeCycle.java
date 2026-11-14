package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class ViewTimeCycle extends TimeCycleSplineSet {
    private static final String TAG = "ViewTimeCycle";

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class AlphaSet extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j10, KeyCache keyCache) {
            view.setAlpha(get(f8, j10, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class ElevationSet extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j10, KeyCache keyCache) {
            view.setElevation(get(f8, j10, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class PathRotate extends ViewTimeCycle {
        public boolean setPathRotate(View view, KeyCache keyCache, float f8, long j10, double d, double d10) {
            view.setRotation(get(f8, j10, view, keyCache) + ((float) Math.toDegrees(Math.atan2(d10, d))));
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j10, KeyCache keyCache) {
            return this.mContinue;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class ProgressSet extends ViewTimeCycle {
        boolean mNoMethod = false;

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j10, KeyCache keyCache) {
            ProgressSet progressSet;
            Method method;
            if (view instanceof MotionLayout) {
                progressSet = this;
                ((MotionLayout) view).setProgress(get(f8, j10, view, keyCache));
            } else {
                progressSet = this;
                if (progressSet.mNoMethod) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    progressSet.mNoMethod = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(progressSet.get(f8, j10, view, keyCache)));
                    } catch (IllegalAccessException e) {
                        Log.e(ViewTimeCycle.TAG, "unable to setProgress", e);
                    } catch (InvocationTargetException e6) {
                        Log.e(ViewTimeCycle.TAG, "unable to setProgress", e6);
                    }
                }
            }
            return progressSet.mContinue;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class RotationSet extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j10, KeyCache keyCache) {
            view.setRotation(get(f8, j10, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class RotationXset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j10, KeyCache keyCache) {
            view.setRotationX(get(f8, j10, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class RotationYset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j10, KeyCache keyCache) {
            view.setRotationY(get(f8, j10, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class ScaleXset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j10, KeyCache keyCache) {
            view.setScaleX(get(f8, j10, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class ScaleYset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j10, KeyCache keyCache) {
            view.setScaleY(get(f8, j10, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class TranslationXset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j10, KeyCache keyCache) {
            view.setTranslationX(get(f8, j10, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class TranslationYset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j10, KeyCache keyCache) {
            view.setTranslationY(get(f8, j10, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class TranslationZset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j10, KeyCache keyCache) {
            view.setTranslationZ(get(f8, j10, view, keyCache));
            return this.mContinue;
        }
    }

    public static ViewTimeCycle makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x009c. Please report as an issue. */
    public static ViewTimeCycle makeSpline(String str, long j10) {
        ViewTimeCycle rotationXset;
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
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(Key.ROTATION)) {
                    c = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
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
        }
        switch (c) {
            case 0:
                rotationXset = new RotationXset();
                rotationXset.setStartTime(j10);
                return rotationXset;
            case 1:
                rotationXset = new RotationYset();
                rotationXset.setStartTime(j10);
                return rotationXset;
            case 2:
                rotationXset = new TranslationXset();
                rotationXset.setStartTime(j10);
                return rotationXset;
            case 3:
                rotationXset = new TranslationYset();
                rotationXset.setStartTime(j10);
                return rotationXset;
            case 4:
                rotationXset = new TranslationZset();
                rotationXset.setStartTime(j10);
                return rotationXset;
            case 5:
                rotationXset = new ProgressSet();
                rotationXset.setStartTime(j10);
                return rotationXset;
            case 6:
                rotationXset = new ScaleXset();
                rotationXset.setStartTime(j10);
                return rotationXset;
            case 7:
                rotationXset = new ScaleYset();
                rotationXset.setStartTime(j10);
                return rotationXset;
            case '\b':
                rotationXset = new RotationSet();
                rotationXset.setStartTime(j10);
                return rotationXset;
            case '\t':
                rotationXset = new ElevationSet();
                rotationXset.setStartTime(j10);
                return rotationXset;
            case '\n':
                rotationXset = new PathRotate();
                rotationXset.setStartTime(j10);
                return rotationXset;
            case 11:
                rotationXset = new AlphaSet();
                rotationXset.setStartTime(j10);
                return rotationXset;
            default:
                return null;
        }
    }

    public float get(float f8, long j10, View view, KeyCache keyCache) {
        boolean z9;
        this.mCurveFit.getPos(f8, this.mCache);
        float[] fArr = this.mCache;
        float f10 = fArr[1];
        if (f10 == 0.0f) {
            this.mContinue = false;
            return fArr[2];
        }
        if (Float.isNaN(this.mLastCycle)) {
            float floatValue = keyCache.getFloatValue(view, this.mType, 0);
            this.mLastCycle = floatValue;
            if (Float.isNaN(floatValue)) {
                this.mLastCycle = 0.0f;
            }
        }
        float f11 = (float) (((((j10 - this.mLastTime) * 1.0E-9d) * f10) + this.mLastCycle) % 1.0d);
        this.mLastCycle = f11;
        keyCache.setFloatValue(view, this.mType, 0, f11);
        this.mLastTime = j10;
        float f12 = this.mCache[0];
        float calcWave = (calcWave(this.mLastCycle) * f12) + this.mCache[2];
        if (f12 == 0.0f && f10 == 0.0f) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.mContinue = z9;
        return calcWave;
    }

    public abstract boolean setProperty(View view, float f8, long j10, KeyCache keyCache);

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class CustomSet extends ViewTimeCycle {
        String mAttributeName;
        SparseArray<ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;
        SparseArray<float[]> mWaveProperties = new SparseArray<>();

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = sparseArray;
        }

        public void setPoint(int i10, ConstraintAttribute constraintAttribute, float f8, int i11, float f10) {
            this.mConstraintAttributeList.append(i10, constraintAttribute);
            this.mWaveProperties.append(i10, new float[]{f8, f10});
            this.mWaveShape = Math.max(this.mWaveShape, i11);
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j10, KeyCache keyCache) {
            boolean z9;
            this.mCurveFit.getPos(f8, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f10 = fArr[fArr.length - 2];
            float f11 = fArr[fArr.length - 1];
            long j11 = j10 - this.mLastTime;
            if (Float.isNaN(this.mLastCycle)) {
                float floatValue = keyCache.getFloatValue(view, this.mAttributeName, 0);
                this.mLastCycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.mLastCycle = 0.0f;
                }
            }
            float f12 = (float) ((((j11 * 1.0E-9d) * f10) + this.mLastCycle) % 1.0d);
            this.mLastCycle = f12;
            this.mLastTime = j10;
            float calcWave = calcWave(f12);
            this.mContinue = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.mCache;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.mContinue;
                float f13 = this.mTempValues[i10];
                if (f13 != 0.0d) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.mContinue = z10 | z9;
                fArr2[i10] = (f13 * calcWave) + f11;
                i10++;
            }
            CustomSupport.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), view, this.mCache);
            if (f10 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i10) {
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i11 = numberOfInterpolatedValues + 2;
            this.mTempValues = new float[i11];
            this.mCache = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i11);
            for (int i12 = 0; i12 < size; i12++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i12);
                ConstraintAttribute valueAt = this.mConstraintAttributeList.valueAt(i12);
                float[] valueAt2 = this.mWaveProperties.valueAt(i12);
                dArr[i12] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.mTempValues);
                int i13 = 0;
                while (true) {
                    if (i13 < this.mTempValues.length) {
                        dArr2[i12][i13] = r8[i13];
                        i13++;
                    }
                }
                double[] dArr3 = dArr2[i12];
                dArr3[numberOfInterpolatedValues] = valueAt2[0];
                dArr3[numberOfInterpolatedValues + 1] = valueAt2[1];
            }
            this.mCurveFit = CurveFit.get(i10, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i10, float f8, float f10, int i11, float f11) {
            throw new RuntimeException("Wrong call for custom attribute");
        }
    }
}
