package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class Oscillator {
    public static final int BOUNCE = 6;
    public static final int COS_WAVE = 5;
    public static final int CUSTOM = 7;
    public static final int REVERSE_SAW_WAVE = 4;
    public static final int SAW_WAVE = 3;
    public static final int SIN_WAVE = 0;
    public static final int SQUARE_WAVE = 1;
    public static String TAG = "Oscillator";
    public static final int TRIANGLE_WAVE = 2;
    double[] mArea;
    MonotonicCurveFit mCustomCurve;
    String mCustomType;
    int mType;
    float[] mPeriod = new float[0];
    double[] mPosition = new double[0];
    double mPI2 = 6.283185307179586d;
    private boolean mNormalized = false;

    public void addPoint(double d, float f8) {
        int length = this.mPeriod.length + 1;
        int binarySearch = Arrays.binarySearch(this.mPosition, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.mPosition = Arrays.copyOf(this.mPosition, length);
        this.mPeriod = Arrays.copyOf(this.mPeriod, length);
        this.mArea = new double[length];
        double[] dArr = this.mPosition;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.mPosition[binarySearch] = d;
        this.mPeriod[binarySearch] = f8;
        this.mNormalized = false;
    }

    public double getDP(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.mPosition, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        float[] fArr = this.mPeriod;
        float f8 = fArr[binarySearch];
        int i10 = binarySearch - 1;
        float f10 = fArr[i10];
        double d10 = f8 - f10;
        double[] dArr = this.mPosition;
        double d11 = dArr[binarySearch];
        double d12 = dArr[i10];
        double d13 = d10 / (d11 - d12);
        return (f10 - (d13 * d12)) + (d * d13);
    }

    public double getP(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.mPosition, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        float[] fArr = this.mPeriod;
        float f8 = fArr[binarySearch];
        int i10 = binarySearch - 1;
        float f10 = fArr[i10];
        double d10 = f8 - f10;
        double[] dArr = this.mPosition;
        double d11 = dArr[binarySearch];
        double d12 = dArr[i10];
        double d13 = d10 / (d11 - d12);
        return ((((d * d) - (d12 * d12)) * d13) / 2.0d) + ((d - d12) * (f10 - (d13 * d12))) + this.mArea[i10];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    public double getSlope(double d, double d10, double d11) {
        double d12;
        double signum;
        double p9 = getP(d) + d10;
        double dp = getDP(d) + d11;
        switch (this.mType) {
            case 1:
                return 0.0d;
            case 2:
                d12 = dp * 4.0d;
                signum = Math.signum((((p9 * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                return signum * d12;
            case 3:
                return dp * 2.0d;
            case 4:
                return (-dp) * 2.0d;
            case 5:
                double d13 = this.mPI2;
                return Math.sin(d13 * p9) * (-d13) * dp;
            case 6:
                return ((((p9 * 4.0d) + 2.0d) % 4.0d) - 2.0d) * dp * 4.0d;
            case 7:
                return this.mCustomCurve.getSlope(p9 % 1.0d, 0);
            default:
                double d14 = this.mPI2;
                d12 = dp * d14;
                signum = Math.cos(d14 * p9);
                return signum * d12;
        }
    }

    public double getValue(double d, double d10) {
        double abs;
        double p9 = getP(d) + d10;
        switch (this.mType) {
            case 1:
                return Math.signum(0.5d - (p9 % 1.0d));
            case 2:
                abs = Math.abs((((p9 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((p9 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((p9 * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos((d10 + p9) * this.mPI2);
            case 6:
                double abs2 = 1.0d - Math.abs(((p9 * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.mCustomCurve.getPos(p9 % 1.0d, 0);
            default:
                return Math.sin(this.mPI2 * p9);
        }
        return 1.0d - abs;
    }

    public void normalize() {
        double d = 0.0d;
        int i10 = 0;
        while (true) {
            if (i10 >= this.mPeriod.length) {
                break;
            }
            d += r6[i10];
            i10++;
        }
        double d10 = 0.0d;
        int i11 = 1;
        while (true) {
            float[] fArr = this.mPeriod;
            if (i11 >= fArr.length) {
                break;
            }
            int i12 = i11 - 1;
            float f8 = (fArr[i12] + fArr[i11]) / 2.0f;
            double[] dArr = this.mPosition;
            d10 += (dArr[i11] - dArr[i12]) * f8;
            i11++;
        }
        int i13 = 0;
        while (true) {
            float[] fArr2 = this.mPeriod;
            if (i13 >= fArr2.length) {
                break;
            }
            fArr2[i13] = fArr2[i13] * ((float) (d / d10));
            i13++;
        }
        this.mArea[0] = 0.0d;
        int i14 = 1;
        while (true) {
            float[] fArr3 = this.mPeriod;
            if (i14 < fArr3.length) {
                int i15 = i14 - 1;
                float f10 = (fArr3[i15] + fArr3[i14]) / 2.0f;
                double[] dArr2 = this.mPosition;
                double d11 = dArr2[i14] - dArr2[i15];
                double[] dArr3 = this.mArea;
                dArr3[i14] = (d11 * f10) + dArr3[i15];
                i14++;
            } else {
                this.mNormalized = true;
                return;
            }
        }
    }

    public void setType(int i10, String str) {
        this.mType = i10;
        this.mCustomType = str;
        if (str != null) {
            this.mCustomCurve = MonotonicCurveFit.buildWave(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.mPosition) + " period=" + Arrays.toString(this.mPeriod);
    }
}
