package n7;

import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f4250a;

    /* renamed from: b, reason: collision with root package name */
    public final v f4251b;
    public final long c;
    public final z d;

    public w(String str, v vVar, long j10, o7.k1 k1Var) {
        this.f4250a = str;
        this.f4251b = vVar;
        this.c = j10;
        this.d = k1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (com.bumptech.glide.d.f(this.f4250a, wVar.f4250a) && com.bumptech.glide.d.f(this.f4251b, wVar.f4251b) && this.c == wVar.c && com.bumptech.glide.d.f(null, null) && com.bumptech.glide.d.f(this.d, wVar.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4250a, this.f4251b, Long.valueOf(this.c), null, this.d});
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(this.f4250a, "description");
        t.c(this.f4251b, "severity");
        t.b(this.c, "timestampNanos");
        t.c(null, "channelRef");
        t.c(this.d, "subchannelRef");
        return t.toString();
    }
}
