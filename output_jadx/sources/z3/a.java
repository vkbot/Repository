package z3;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f6732a;

    public a(float f8) {
        this.f6732a = f8;
    }

    @Override // z3.d
    public final float a(RectF rectF) {
        return this.f6732a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f6732a == ((a) obj).f6732a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6732a)});
    }

    public final String toString() {
        return this.f6732a + "px";
    }
}
