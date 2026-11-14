package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class StepCurve extends Easing {
    private static final boolean DEBUG = false;
    MonotonicCurveFit mCurveFit;

    public StepCurve(String str) {
        this.mStr = str;
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i10 = 0;
        while (indexOf2 != -1) {
            dArr[i10] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i10++;
        }
        dArr[i10] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        this.mCurveFit = genSpline(Arrays.copyOf(dArr, i10 + 1));
    }

    private static MonotonicCurveFit genSpline(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            double d10 = dArr[i10];
            int i11 = i10 + length2;
            dArr2[i11][0] = d10;
            double d11 = i10 * d;
            dArr3[i11] = d11;
            if (i10 > 0) {
                int i12 = (length2 * 2) + i10;
                dArr2[i12][0] = d10 + 1.0d;
                dArr3[i12] = d11 + 1.0d;
                int i13 = i10 - 1;
                dArr2[i13][0] = (d10 - 1.0d) - d;
                dArr3[i13] = (d11 - 1.0d) - d;
            }
        }
        MonotonicCurveFit monotonicCurveFit = new MonotonicCurveFit(dArr3, dArr2);
        System.out.println(" 0 " + monotonicCurveFit.getPos(0.0d, 0));
        System.out.println(" 1 " + monotonicCurveFit.getPos(1.0d, 0));
        return monotonicCurveFit;
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d) {
        return this.mCurveFit.getPos(d, 0);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d) {
        return this.mCurveFit.getSlope(d, 0);
    }

    private static MonotonicCurveFit genSpline(String str) {
        String[] split = str.split("\\s+");
        int length = split.length;
        double[] dArr = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr[i10] = Double.parseDouble(split[i10]);
        }
        return genSpline(dArr);
    }
}
