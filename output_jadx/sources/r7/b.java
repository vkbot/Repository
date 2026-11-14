package r7;

import l9.o;
import okhttp3.internal.http2.Header;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {
    public static final o d;
    public static final o e;

    /* renamed from: f, reason: collision with root package name */
    public static final o f5415f;

    /* renamed from: g, reason: collision with root package name */
    public static final o f5416g;

    /* renamed from: h, reason: collision with root package name */
    public static final o f5417h;

    /* renamed from: a, reason: collision with root package name */
    public final o f5418a;

    /* renamed from: b, reason: collision with root package name */
    public final o f5419b;
    public final int c;

    static {
        o oVar = o.e;
        d = w7.c.k(Header.RESPONSE_STATUS_UTF8);
        e = w7.c.k(Header.TARGET_METHOD_UTF8);
        f5415f = w7.c.k(Header.TARGET_PATH_UTF8);
        f5416g = w7.c.k(Header.TARGET_SCHEME_UTF8);
        f5417h = w7.c.k(Header.TARGET_AUTHORITY_UTF8);
        w7.c.k(":host");
        w7.c.k(":version");
    }

    public b(o oVar, o oVar2) {
        this.f5418a = oVar;
        this.f5419b = oVar2;
        this.c = oVar2.c() + oVar.c() + 32;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f5418a.equals(bVar.f5418a) && this.f5419b.equals(bVar.f5419b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5419b.hashCode() + ((this.f5418a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return ai.onnxruntime.a.D(this.f5418a.l(), ": ", this.f5419b.l());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(o oVar, String str) {
        this(oVar, w7.c.k(str));
        o oVar2 = o.e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        this(w7.c.k(str), w7.c.k(str2));
        o oVar = o.e;
    }
}
