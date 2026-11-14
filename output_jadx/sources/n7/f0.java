package n7;

import androidx.core.app.NotificationCompat;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f0 {
    public static final f0 e = new f0(null, null, f1.e, false);

    /* renamed from: a, reason: collision with root package name */
    public final t f4192a;

    /* renamed from: b, reason: collision with root package name */
    public final g f4193b;
    public final f1 c;
    public final boolean d;

    public f0(t tVar, g gVar, f1 f1Var, boolean z9) {
        this.f4192a = tVar;
        this.f4193b = gVar;
        o4.b.i(f1Var, NotificationCompat.CATEGORY_STATUS);
        this.c = f1Var;
        this.d = z9;
    }

    public static f0 a(f1 f1Var) {
        o4.b.d("error status shouldn't be OK", !f1Var.f());
        return new f0(null, null, f1Var, false);
    }

    public static f0 b(t tVar, v7.r rVar) {
        o4.b.i(tVar, "subchannel");
        return new f0(tVar, rVar, f1.e, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            if (com.bumptech.glide.d.f(this.f4192a, f0Var.f4192a) && com.bumptech.glide.d.f(this.c, f0Var.c) && com.bumptech.glide.d.f(this.f4193b, f0Var.f4193b) && this.d == f0Var.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4192a, this.c, this.f4193b, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(this.f4192a, "subchannel");
        t.c(this.f4193b, "streamTracerFactory");
        t.c(this.c, NotificationCompat.CATEGORY_STATUS);
        t.d("drop", this.d);
        return t.toString();
    }
}
