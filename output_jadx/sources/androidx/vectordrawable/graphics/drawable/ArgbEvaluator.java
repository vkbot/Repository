package androidx.vectordrawable.graphics.drawable;

import ai.onnxruntime.a;
import android.animation.TypeEvaluator;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ArgbEvaluator implements TypeEvaluator {
    private static final ArgbEvaluator sInstance = new ArgbEvaluator();

    public static ArgbEvaluator getInstance() {
        return sInstance;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f8, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f10 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float f11 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float b10 = a.b(f11, f10, f8, f10);
        float b11 = a.b(pow4, pow, f8, pow);
        float b12 = a.b(pow5, pow2, f8, pow2);
        float b13 = a.b(pow6, pow3, f8, pow3);
        float pow7 = ((float) Math.pow(b11, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(b12, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(b13, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(b10 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
