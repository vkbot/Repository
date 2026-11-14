package androidx.constraintlayout.core.motion.utils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class SpringStopEngine implements StopEngine {
    private static final double UNSET = Double.MAX_VALUE;
    private float mLastTime;
    private double mLastVelocity;
    private float mMass;
    private float mPos;
    private double mStiffness;
    private float mStopThreshold;
    private double mTargetPos;
    private float mV;
    double mDamping = 0.5d;
    private boolean mInitialized = false;
    private int mBoundaryMode = 0;

    private void compute(double d) {
        if (d > 0.0d) {
            double d10 = this.mStiffness;
            double d11 = this.mDamping;
            int sqrt = (int) ((9.0d / ((Math.sqrt(d10 / this.mMass) * d) * 4.0d)) + 1.0d);
            double d12 = d / sqrt;
            int i10 = 0;
            while (i10 < sqrt) {
                float f8 = this.mPos;
                double d13 = this.mTargetPos;
                float f10 = this.mV;
                double d14 = d10;
                double d15 = ((-d10) * (f8 - d13)) - (f10 * d11);
                float f11 = this.mMass;
                double d16 = d11;
                double d17 = (((d15 / f11) * d12) / 2.0d) + f10;
                double d18 = ((((-((((d12 * d17) / 2.0d) + f8) - d13)) * d14) - (d17 * d16)) / f11) * d12;
                double d19 = (d18 / 2.0d) + f10;
                float f12 = f10 + ((float) d18);
                this.mV = f12;
                float f13 = f8 + ((float) (d19 * d12));
                this.mPos = f13;
                int i11 = this.mBoundaryMode;
                if (i11 > 0) {
                    if (f13 < 0.0f && (i11 & 1) == 1) {
                        this.mPos = -f13;
                        this.mV = -f12;
                    }
                    float f14 = this.mPos;
                    if (f14 > 1.0f && (i11 & 2) == 2) {
                        this.mPos = 2.0f - f14;
                        this.mV = -this.mV;
                    }
                }
                i10++;
                d10 = d14;
                d11 = d16;
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f8) {
        return null;
    }

    public float getAcceleration() {
        return ((float) (((-this.mStiffness) * (this.mPos - this.mTargetPos)) - (this.mDamping * this.mV))) / this.mMass;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f8) {
        compute(f8 - this.mLastTime);
        this.mLastTime = f8;
        if (isStopped()) {
            this.mPos = (float) this.mTargetPos;
        }
        return this.mPos;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f8) {
        return this.mV;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        double d = this.mPos - this.mTargetPos;
        double d10 = this.mStiffness;
        double d11 = this.mV;
        if (Math.sqrt((((d10 * d) * d) + ((d11 * d11) * this.mMass)) / d10) <= this.mStopThreshold) {
            return true;
        }
        return false;
    }

    public void log(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ";
        System.out.println(str2 + str);
    }

    public void springConfig(float f8, float f10, float f11, float f12, float f13, float f14, float f15, int i10) {
        this.mTargetPos = f10;
        this.mDamping = f14;
        this.mInitialized = false;
        this.mPos = f8;
        this.mLastVelocity = f11;
        this.mStiffness = f13;
        this.mMass = f12;
        this.mStopThreshold = f15;
        this.mBoundaryMode = i10;
        this.mLastTime = 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return 0.0f;
    }
}
