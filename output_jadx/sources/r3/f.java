package r3;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final FloatEvaluator f5373a = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f8, Object obj, Object obj2) {
        float floatValue = this.f5373a.evaluate(f8, (Number) obj, (Number) obj2).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
