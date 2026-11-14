package z3;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f6783a;

    public l(float f8) {
        this.f6783a = f8;
    }

    @Override // z3.d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f6783a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && this.f6783a == ((l) obj).f6783a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6783a)});
    }

    public final String toString() {
        return ai.onnxruntime.a.o(new StringBuilder(), "%", (int) (this.f6783a * 100.0f));
    }
}
