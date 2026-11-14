package b3;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public long f346a;
    public TimeInterpolator c = null;
    public int d = 0;
    public int e = 1;

    /* renamed from: b, reason: collision with root package name */
    public long f347b = 150;

    public f(long j10) {
        this.f346a = j10;
    }

    public final void a(ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.f346a);
        objectAnimator.setDuration(this.f347b);
        objectAnimator.setInterpolator(b());
        objectAnimator.setRepeatCount(this.d);
        objectAnimator.setRepeatMode(this.e);
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.c;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return a.f341b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f346a != fVar.f346a || this.f347b != fVar.f347b || this.d != fVar.d || this.e != fVar.e) {
            return false;
        }
        return b().getClass().equals(fVar.b().getClass());
    }

    public final int hashCode() {
        long j10 = this.f346a;
        long j11 = this.f347b;
        return ((((b().getClass().hashCode() + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(f.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f346a);
        sb.append(" duration: ");
        sb.append(this.f347b);
        sb.append(" interpolator: ");
        sb.append(b().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.d);
        sb.append(" repeatMode: ");
        return ai.onnxruntime.a.o(sb, "}\n", this.e);
    }
}
