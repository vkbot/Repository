package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
class RectEvaluator implements TypeEvaluator<Rect> {
    private Rect mRect;

    public RectEvaluator(Rect rect) {
        this.mRect = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f8, Rect rect, Rect rect2) {
        int i10 = rect.left + ((int) ((rect2.left - r0) * f8));
        int i11 = rect.top + ((int) ((rect2.top - r1) * f8));
        int i12 = rect.right + ((int) ((rect2.right - r2) * f8));
        int i13 = rect.bottom + ((int) ((rect2.bottom - r6) * f8));
        Rect rect3 = this.mRect;
        if (rect3 == null) {
            return new Rect(i10, i11, i12, i13);
        }
        rect3.set(i10, i11, i12, i13);
        return this.mRect;
    }

    public RectEvaluator() {
    }
}
