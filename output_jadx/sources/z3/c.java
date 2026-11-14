package z3;

import android.graphics.RectF;
import androidx.core.math.MathUtils;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f6742a;

    public c(float f8) {
        this.f6742a = f8;
    }

    @Override // z3.d
    public final float a(RectF rectF) {
        return MathUtils.clamp(this.f6742a, 0.0f, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && this.f6742a == ((c) obj).f6742a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6742a)});
    }
}
