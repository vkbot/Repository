package e2;

import com.bumptech.glide.g;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2098a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2099b;

    public a(int i10, long j10) {
        if (i10 != 0) {
            this.f2098a = i10;
            this.f2099b = j10;
        } else {
            n0.b.n("Null status");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (g.a(this.f2098a, aVar.f2098a) && this.f2099b == aVar.f2099b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = (g.c(this.f2098a) ^ 1000003) * 1000003;
        long j10 = this.f2099b;
        return c ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i10 = this.f2098a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        str = "null";
                    } else {
                        str = "INVALID_PAYLOAD";
                    }
                } else {
                    str = "FATAL_ERROR";
                }
            } else {
                str = "TRANSIENT_ERROR";
            }
        } else {
            str = "OK";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        return ai.onnxruntime.a.n(sb, this.f2099b, "}");
    }
}
