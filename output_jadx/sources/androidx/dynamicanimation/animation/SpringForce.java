package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.dynamicanimation.animation.DynamicAnimation;
import j1.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class SpringForce implements Force {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;
    private static final double UNSET = Double.MAX_VALUE;
    private static final double VELOCITY_THRESHOLD_MULTIPLIER = 62.5d;
    private double mDampedFreq;
    double mDampingRatio;
    private double mFinalPosition;
    private double mGammaMinus;
    private double mGammaPlus;
    private boolean mInitialized;
    private final DynamicAnimation.MassState mMassState;
    double mNaturalFreq;
    private double mValueThreshold;
    private double mVelocityThreshold;

    public SpringForce(float f8) {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = Double.MAX_VALUE;
        this.mMassState = new DynamicAnimation.MassState();
        this.mFinalPosition = f8;
    }

    private void init() {
        if (this.mInitialized) {
            return;
        }
        if (this.mFinalPosition != Double.MAX_VALUE) {
            double d = this.mDampingRatio;
            if (d > 1.0d) {
                double d10 = this.mNaturalFreq;
                this.mGammaPlus = (Math.sqrt((d * d) - 1.0d) * d10) + ((-d) * d10);
                double d11 = this.mDampingRatio;
                double d12 = this.mNaturalFreq;
                this.mGammaMinus = ((-d11) * d12) - (Math.sqrt((d11 * d11) - 1.0d) * d12);
            } else if (d >= 0.0d && d < 1.0d) {
                this.mDampedFreq = Math.sqrt(1.0d - (d * d)) * this.mNaturalFreq;
            }
            this.mInitialized = true;
            return;
        }
        i.l("Error: Final position of the spring must be set before the animation starts");
    }

    @Override // androidx.dynamicanimation.animation.Force
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public float getAcceleration(float f8, float f10) {
        float finalPosition = f8 - getFinalPosition();
        double d = this.mNaturalFreq;
        return (float) (((-(d * d)) * finalPosition) - (((d * 2.0d) * this.mDampingRatio) * f10));
    }

    public float getDampingRatio() {
        return (float) this.mDampingRatio;
    }

    public float getFinalPosition() {
        return (float) this.mFinalPosition;
    }

    public float getStiffness() {
        double d = this.mNaturalFreq;
        return (float) (d * d);
    }

    @Override // androidx.dynamicanimation.animation.Force
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean isAtEquilibrium(float f8, float f10) {
        if (Math.abs(f10) < this.mVelocityThreshold && Math.abs(f8 - getFinalPosition()) < this.mValueThreshold) {
            return true;
        }
        return false;
    }

    public SpringForce setDampingRatio(@FloatRange(from = 0.0d) float f8) {
        if (f8 >= 0.0f) {
            this.mDampingRatio = f8;
            this.mInitialized = false;
            return this;
        }
        i.k("Damping ratio must be non-negative");
        return null;
    }

    public SpringForce setFinalPosition(float f8) {
        this.mFinalPosition = f8;
        return this;
    }

    public SpringForce setStiffness(@FloatRange(from = 0.0d, fromInclusive = false) float f8) {
        if (f8 > 0.0f) {
            this.mNaturalFreq = Math.sqrt(f8);
            this.mInitialized = false;
            return this;
        }
        i.k("Spring stiffness constant must be positive.");
        return null;
    }

    public void setValueThreshold(double d) {
        double abs = Math.abs(d);
        this.mValueThreshold = abs;
        this.mVelocityThreshold = abs * VELOCITY_THRESHOLD_MULTIPLIER;
    }

    public DynamicAnimation.MassState updateValues(double d, double d10, long j10) {
        double sin;
        double cos;
        init();
        double d11 = j10 / 1000.0d;
        double d12 = d - this.mFinalPosition;
        double d13 = this.mDampingRatio;
        if (d13 > 1.0d) {
            double d14 = this.mGammaMinus;
            double d15 = this.mGammaPlus;
            double d16 = d12 - (((d14 * d12) - d10) / (d14 - d15));
            double d17 = ((d12 * d14) - d10) / (d14 - d15);
            sin = (Math.pow(2.718281828459045d, this.mGammaPlus * d11) * d17) + (Math.pow(2.718281828459045d, d14 * d11) * d16);
            double d18 = this.mGammaMinus;
            double pow = Math.pow(2.718281828459045d, d18 * d11) * d16 * d18;
            double d19 = this.mGammaPlus;
            cos = (Math.pow(2.718281828459045d, d19 * d11) * d17 * d19) + pow;
        } else if (d13 == 1.0d) {
            double d20 = this.mNaturalFreq;
            double d21 = (d20 * d12) + d10;
            double d22 = (d21 * d11) + d12;
            double pow2 = Math.pow(2.718281828459045d, (-d20) * d11) * d22;
            double pow3 = Math.pow(2.718281828459045d, (-this.mNaturalFreq) * d11) * d22;
            double d23 = this.mNaturalFreq;
            cos = (Math.pow(2.718281828459045d, (-d23) * d11) * d21) + (pow3 * (-d23));
            sin = pow2;
        } else {
            double d24 = 1.0d / this.mDampedFreq;
            double d25 = this.mNaturalFreq;
            double d26 = ((d13 * d25 * d12) + d10) * d24;
            sin = ((Math.sin(this.mDampedFreq * d11) * d26) + (Math.cos(this.mDampedFreq * d11) * d12)) * Math.pow(2.718281828459045d, (-d13) * d25 * d11);
            double d27 = this.mNaturalFreq;
            double d28 = this.mDampingRatio;
            double d29 = (-d27) * sin * d28;
            double pow4 = Math.pow(2.718281828459045d, (-d28) * d27 * d11);
            double d30 = this.mDampedFreq;
            double sin2 = Math.sin(d30 * d11) * (-d30) * d12;
            double d31 = this.mDampedFreq;
            cos = (((Math.cos(d31 * d11) * d26 * d31) + sin2) * pow4) + d29;
        }
        DynamicAnimation.MassState massState = this.mMassState;
        massState.mValue = (float) (sin + this.mFinalPosition);
        massState.mVelocity = (float) cos;
        return massState;
    }

    public SpringForce() {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = Double.MAX_VALUE;
        this.mMassState = new DynamicAnimation.MassState();
    }
}
