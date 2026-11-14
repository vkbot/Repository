package androidx.constraintlayout.core.motion.utils;

import ai.onnxruntime.a;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class StopLogicEngine implements StopEngine {
    private static final float EPSILON = 1.0E-5f;
    private boolean mBackwards = false;
    private boolean mDone = false;
    private float mLastPosition;
    private float mLastTime;
    private int mNumberOfStages;
    private float mStage1Duration;
    private float mStage1EndPosition;
    private float mStage1Velocity;
    private float mStage2Duration;
    private float mStage2EndPosition;
    private float mStage2Velocity;
    private float mStage3Duration;
    private float mStage3EndPosition;
    private float mStage3Velocity;
    private float mStartPosition;
    private String mType;

    private float calcY(float f8) {
        this.mDone = false;
        float f10 = this.mStage1Duration;
        if (f8 <= f10) {
            float f11 = this.mStage1Velocity;
            return ((((this.mStage2Velocity - f11) * f8) * f8) / (f10 * 2.0f)) + (f11 * f8);
        }
        int i10 = this.mNumberOfStages;
        if (i10 == 1) {
            return this.mStage1EndPosition;
        }
        float f12 = f8 - f10;
        float f13 = this.mStage2Duration;
        if (f12 < f13) {
            float f14 = this.mStage1EndPosition;
            float f15 = this.mStage2Velocity;
            return ((((this.mStage3Velocity - f15) * f12) * f12) / (f13 * 2.0f)) + (f15 * f12) + f14;
        }
        if (i10 == 2) {
            return this.mStage2EndPosition;
        }
        float f16 = f12 - f13;
        float f17 = this.mStage3Duration;
        if (f16 <= f17) {
            float f18 = this.mStage2EndPosition;
            float f19 = this.mStage3Velocity;
            return ((f19 * f16) + f18) - (((f19 * f16) * f16) / (f17 * 2.0f));
        }
        this.mDone = true;
        return this.mStage3EndPosition;
    }

    private void setup(float f8, float f10, float f11, float f12, float f13) {
        this.mDone = false;
        this.mStage3EndPosition = f10;
        if (f8 == 0.0f) {
            f8 = 1.0E-4f;
        }
        float f14 = f8 / f11;
        float f15 = (f14 * f8) / 2.0f;
        if (f8 < 0.0f) {
            float sqrt = (float) Math.sqrt((f10 - ((((-f8) / f11) * f8) / 2.0f)) * f11);
            if (sqrt < f12) {
                this.mType = "backward accelerate, decelerate";
                this.mNumberOfStages = 2;
                this.mStage1Velocity = f8;
                this.mStage2Velocity = sqrt;
                this.mStage3Velocity = 0.0f;
                float f16 = (sqrt - f8) / f11;
                this.mStage1Duration = f16;
                this.mStage2Duration = sqrt / f11;
                this.mStage1EndPosition = ((f8 + sqrt) * f16) / 2.0f;
                this.mStage2EndPosition = f10;
                this.mStage3EndPosition = f10;
                return;
            }
            this.mType = "backward accelerate cruse decelerate";
            this.mNumberOfStages = 3;
            this.mStage1Velocity = f8;
            this.mStage2Velocity = f12;
            this.mStage3Velocity = f12;
            float f17 = (f12 - f8) / f11;
            this.mStage1Duration = f17;
            float f18 = f12 / f11;
            this.mStage3Duration = f18;
            float f19 = ((f8 + f12) * f17) / 2.0f;
            float f20 = (f18 * f12) / 2.0f;
            this.mStage2Duration = ((f10 - f19) - f20) / f12;
            this.mStage1EndPosition = f19;
            this.mStage2EndPosition = f10 - f20;
            this.mStage3EndPosition = f10;
            return;
        }
        if (f15 >= f10) {
            this.mType = "hard stop";
            this.mNumberOfStages = 1;
            this.mStage1Velocity = f8;
            this.mStage2Velocity = 0.0f;
            this.mStage1EndPosition = f10;
            this.mStage1Duration = (2.0f * f10) / f8;
            return;
        }
        float f21 = f10 - f15;
        float f22 = f21 / f8;
        if (f22 + f14 < f13) {
            this.mType = "cruse decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f8;
            this.mStage2Velocity = f8;
            this.mStage3Velocity = 0.0f;
            this.mStage1EndPosition = f21;
            this.mStage2EndPosition = f10;
            this.mStage1Duration = f22;
            this.mStage2Duration = f14;
            return;
        }
        float sqrt2 = (float) Math.sqrt(((f8 * f8) / 2.0f) + (f11 * f10));
        float f23 = (sqrt2 - f8) / f11;
        this.mStage1Duration = f23;
        float f24 = sqrt2 / f11;
        this.mStage2Duration = f24;
        if (sqrt2 < f12) {
            this.mType = "accelerate decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f8;
            this.mStage2Velocity = sqrt2;
            this.mStage3Velocity = 0.0f;
            this.mStage1Duration = f23;
            this.mStage2Duration = f24;
            this.mStage1EndPosition = ((f8 + sqrt2) * f23) / 2.0f;
            this.mStage2EndPosition = f10;
            return;
        }
        this.mType = "accelerate cruse decelerate";
        this.mNumberOfStages = 3;
        this.mStage1Velocity = f8;
        this.mStage2Velocity = f12;
        this.mStage3Velocity = f12;
        float f25 = (f12 - f8) / f11;
        this.mStage1Duration = f25;
        float f26 = f12 / f11;
        this.mStage3Duration = f26;
        float f27 = ((f8 + f12) * f25) / 2.0f;
        float f28 = (f26 * f12) / 2.0f;
        this.mStage2Duration = ((f10 - f27) - f28) / f12;
        this.mStage1EndPosition = f27;
        this.mStage2EndPosition = f10 - f28;
        this.mStage3EndPosition = f10;
    }

    public void config(float f8, float f10, float f11, float f12, float f13, float f14) {
        boolean z9 = false;
        this.mDone = false;
        this.mStartPosition = f8;
        if (f8 > f10) {
            z9 = true;
        }
        this.mBackwards = z9;
        if (z9) {
            setup(-f11, f8 - f10, f13, f14, f12);
        } else {
            setup(f11, f10 - f8, f13, f14, f12);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f8) {
        String str2;
        StringBuilder w = a.w(a.p(a.w(str, " ===== "), this.mType, "\n"), str);
        if (this.mBackwards) {
            str2 = "backwards";
        } else {
            str2 = "forward ";
        }
        w.append(str2);
        w.append(" time = ");
        w.append(f8);
        w.append("  stages ");
        String str3 = a.o(w, "\n", this.mNumberOfStages) + str + " dur " + this.mStage1Duration + " vel " + this.mStage1Velocity + " pos " + this.mStage1EndPosition + "\n";
        if (this.mNumberOfStages > 1) {
            str3 = str3 + str + " dur " + this.mStage2Duration + " vel " + this.mStage2Velocity + " pos " + this.mStage2EndPosition + "\n";
        }
        if (this.mNumberOfStages > 2) {
            str3 = str3 + str + " dur " + this.mStage3Duration + " vel " + this.mStage3Velocity + " pos " + this.mStage3EndPosition + "\n";
        }
        float f10 = this.mStage1Duration;
        if (f8 <= f10) {
            return a.D(str3, str, "stage 0\n");
        }
        int i10 = this.mNumberOfStages;
        if (i10 == 1) {
            return a.D(str3, str, "end stage 0\n");
        }
        float f11 = f8 - f10;
        float f12 = this.mStage2Duration;
        if (f11 < f12) {
            return a.D(str3, str, " stage 1\n");
        }
        if (i10 == 2) {
            return a.D(str3, str, "end stage 1\n");
        }
        if (f11 - f12 < this.mStage3Duration) {
            return a.D(str3, str, " stage 2\n");
        }
        return a.D(str3, str, " end stage 2\n");
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f8) {
        float calcY = calcY(f8);
        this.mLastPosition = calcY;
        this.mLastTime = f8;
        boolean z9 = this.mBackwards;
        float f10 = this.mStartPosition;
        if (z9) {
            return f10 - calcY;
        }
        return f10 + calcY;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f8) {
        float f10;
        float f11;
        float f12 = this.mStage1Duration;
        if (f8 <= f12) {
            f10 = this.mStage1Velocity;
            f11 = this.mStage2Velocity;
        } else {
            int i10 = this.mNumberOfStages;
            if (i10 == 1) {
                return 0.0f;
            }
            f8 -= f12;
            f12 = this.mStage2Duration;
            if (f8 < f12) {
                f10 = this.mStage2Velocity;
                f11 = this.mStage3Velocity;
            } else {
                if (i10 == 2) {
                    return 0.0f;
                }
                float f13 = f8 - f12;
                float f14 = this.mStage3Duration;
                if (f13 >= f14) {
                    return 0.0f;
                }
                float f15 = this.mStage3Velocity;
                return f15 - ((f13 * f15) / f14);
            }
        }
        return (((f11 - f10) * f8) / f12) + f10;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        if (getVelocity() < EPSILON && Math.abs(this.mStage3EndPosition - this.mLastPosition) < EPSILON) {
            return true;
        }
        return false;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class Decelerate implements StopEngine {
        private float mAcceleration;
        private float mDestination;
        private boolean mDone = false;
        private float mDuration;
        private float mInitialPos;
        private float mInitialVelocity;
        private float mLastVelocity;

        public void config(float f8, float f10, float f11) {
            this.mDone = false;
            this.mDestination = f10;
            this.mInitialVelocity = f11;
            this.mInitialPos = f8;
            float f12 = (f10 - f8) / (f11 / 2.0f);
            this.mDuration = f12;
            this.mAcceleration = (-f11) / f12;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public String debug(String str, float f8) {
            return this.mDuration + " " + this.mLastVelocity;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getInterpolation(float f8) {
            if (f8 > this.mDuration) {
                this.mDone = true;
                return this.mDestination;
            }
            getVelocity(f8);
            return ((((this.mAcceleration * f8) / 2.0f) + this.mInitialVelocity) * f8) + this.mInitialPos;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getVelocity(float f8) {
            if (f8 > this.mDuration) {
                return 0.0f;
            }
            float f10 = (this.mAcceleration * f8) + this.mInitialVelocity;
            this.mLastVelocity = f10;
            return f10;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public boolean isStopped() {
            return this.mDone;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getVelocity() {
            return this.mLastVelocity;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        boolean z9 = this.mBackwards;
        float f8 = this.mLastTime;
        return z9 ? -getVelocity(f8) : getVelocity(f8);
    }
}
