package n7;

import androidx.core.app.NotificationCompat;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final f1 f4259a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4260b;

    public y0(f1 f1Var) {
        this.f4260b = null;
        o4.b.i(f1Var, NotificationCompat.CATEGORY_STATUS);
        this.f4259a = f1Var;
        o4.b.e("cannot use OK status: %s", !f1Var.f(), f1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass()) {
            y0 y0Var = (y0) obj;
            if (com.bumptech.glide.d.f(this.f4259a, y0Var.f4259a) && com.bumptech.glide.d.f(this.f4260b, y0Var.f4260b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4259a, this.f4260b});
    }

    public final String toString() {
        Object obj = this.f4260b;
        if (obj != null) {
            com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
            t.c(obj, "config");
            return t.toString();
        }
        com.bumptech.glide.manager.s t3 = com.bumptech.glide.c.t(this);
        t3.c(this.f4259a, "error");
        return t3.toString();
    }

    public y0(Object obj) {
        this.f4260b = obj;
        this.f4259a = null;
    }
}
