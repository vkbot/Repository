package androidx.dynamicanimation.animation;

import android.util.AndroidRuntimeException;
import androidx.annotation.MainThread;
import androidx.dynamicanimation.animation.DynamicAnimation;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class SpringAnimation extends DynamicAnimation<SpringAnimation> {
    private static final float UNSET = Float.MAX_VALUE;
    private boolean mEndRequested;
    private float mPendingPosition;
    private SpringForce mSpring;

    public SpringAnimation(FloatValueHolder floatValueHolder, float f8) {
        super(floatValueHolder);
        this.mSpring = null;
        this.mPendingPosition = Float.MAX_VALUE;
        this.mEndRequested = false;
        this.mSpring = new SpringForce(f8);
    }

    private void sanityCheck() {
        SpringForce springForce = this.mSpring;
        if (springForce != null) {
            double finalPosition = springForce.getFinalPosition();
            if (finalPosition <= this.mMaxValue) {
                if (finalPosition >= this.mMinValue) {
                    return;
                }
                androidx.navigation.b.g("Final position of the spring cannot be less than the min value.");
                return;
            }
            androidx.navigation.b.g("Final position of the spring cannot be greater than the max value.");
            return;
        }
        androidx.navigation.b.g("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    public void animateToFinalPosition(float f8) {
        if (isRunning()) {
            this.mPendingPosition = f8;
            return;
        }
        if (this.mSpring == null) {
            this.mSpring = new SpringForce(f8);
        }
        this.mSpring.setFinalPosition(f8);
        start();
    }

    public boolean canSkipToEnd() {
        if (this.mSpring.mDampingRatio > 0.0d) {
            return true;
        }
        return false;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    @MainThread
    public void cancel() {
        super.cancel();
        float f8 = this.mPendingPosition;
        if (f8 != Float.MAX_VALUE) {
            SpringForce springForce = this.mSpring;
            if (springForce == null) {
                this.mSpring = new SpringForce(f8);
            } else {
                springForce.setFinalPosition(f8);
            }
            this.mPendingPosition = Float.MAX_VALUE;
        }
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public float getAcceleration(float f8, float f10) {
        return this.mSpring.getAcceleration(f8, f10);
    }

    public SpringForce getSpring() {
        return this.mSpring;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public boolean isAtEquilibrium(float f8, float f10) {
        return this.mSpring.isAtEquilibrium(f8, f10);
    }

    public SpringAnimation setSpring(SpringForce springForce) {
        this.mSpring = springForce;
        return this;
    }

    public void skipToEnd() {
        if (canSkipToEnd()) {
            if (getAnimationHandler().isCurrentThread()) {
                if (this.mRunning) {
                    this.mEndRequested = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        androidx.navigation.b.g("Spring animations can only come to an end when there is damping");
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    @MainThread
    public void start() {
        sanityCheck();
        this.mSpring.setValueThreshold(getValueThreshold());
        super.start();
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public boolean updateValueAndVelocity(long j10) {
        boolean z9 = this.mEndRequested;
        float f8 = this.mPendingPosition;
        if (z9) {
            if (f8 != Float.MAX_VALUE) {
                this.mSpring.setFinalPosition(f8);
                this.mPendingPosition = Float.MAX_VALUE;
            }
            this.mValue = this.mSpring.getFinalPosition();
            this.mVelocity = 0.0f;
            this.mEndRequested = false;
            return true;
        }
        SpringForce springForce = this.mSpring;
        if (f8 != Float.MAX_VALUE) {
            long j11 = j10 / 2;
            DynamicAnimation.MassState updateValues = springForce.updateValues(this.mValue, this.mVelocity, j11);
            this.mSpring.setFinalPosition(this.mPendingPosition);
            this.mPendingPosition = Float.MAX_VALUE;
            DynamicAnimation.MassState updateValues2 = this.mSpring.updateValues(updateValues.mValue, updateValues.mVelocity, j11);
            this.mValue = updateValues2.mValue;
            this.mVelocity = updateValues2.mVelocity;
        } else {
            DynamicAnimation.MassState updateValues3 = springForce.updateValues(this.mValue, this.mVelocity, j10);
            this.mValue = updateValues3.mValue;
            this.mVelocity = updateValues3.mVelocity;
        }
        float max = Math.max(this.mValue, this.mMinValue);
        this.mValue = max;
        float min = Math.min(max, this.mMaxValue);
        this.mValue = min;
        if (!isAtEquilibrium(min, this.mVelocity)) {
            return false;
        }
        this.mValue = this.mSpring.getFinalPosition();
        this.mVelocity = 0.0f;
        return true;
    }

    public SpringAnimation(FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        this.mSpring = null;
        this.mPendingPosition = Float.MAX_VALUE;
        this.mEndRequested = false;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public void setValueThreshold(float f8) {
    }

    public <K> SpringAnimation(K k6, FloatPropertyCompat<K> floatPropertyCompat) {
        super(k6, floatPropertyCompat);
        this.mSpring = null;
        this.mPendingPosition = Float.MAX_VALUE;
        this.mEndRequested = false;
    }

    public <K> SpringAnimation(K k6, FloatPropertyCompat<K> floatPropertyCompat, float f8) {
        super(k6, floatPropertyCompat);
        this.mSpring = null;
        this.mPendingPosition = Float.MAX_VALUE;
        this.mEndRequested = false;
        this.mSpring = new SpringForce(f8);
    }
}
