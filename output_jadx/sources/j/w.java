package j;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class w implements h.e {

    /* renamed from: b, reason: collision with root package name */
    public final Object f3074b;
    public final int c;
    public final int d;
    public final Class e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f3075f;

    /* renamed from: g, reason: collision with root package name */
    public final h.e f3076g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f3077h;

    /* renamed from: i, reason: collision with root package name */
    public final h.h f3078i;

    /* renamed from: j, reason: collision with root package name */
    public int f3079j;

    public w(Object obj, h.e eVar, int i10, int i11, Map map, Class cls, Class cls2, h.h hVar) {
        c0.g.c(obj, "Argument must not be null");
        this.f3074b = obj;
        this.f3076g = eVar;
        this.c = i10;
        this.d = i11;
        c0.g.c(map, "Argument must not be null");
        this.f3077h = map;
        c0.g.c(cls, "Resource class must not be null");
        this.e = cls;
        c0.g.c(cls2, "Transcode class must not be null");
        this.f3075f = cls2;
        c0.g.c(hVar, "Argument must not be null");
        this.f3078i = hVar;
    }

    @Override // h.e
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // h.e
    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f3074b.equals(wVar.f3074b) && this.f3076g.equals(wVar.f3076g) && this.d == wVar.d && this.c == wVar.c && this.f3077h.equals(wVar.f3077h) && this.e.equals(wVar.e) && this.f3075f.equals(wVar.f3075f) && this.f3078i.equals(wVar.f3078i)) {
                return true;
            }
        }
        return false;
    }

    @Override // h.e
    public final int hashCode() {
        if (this.f3079j == 0) {
            int hashCode = this.f3074b.hashCode();
            this.f3079j = hashCode;
            int hashCode2 = ((((this.f3076g.hashCode() + (hashCode * 31)) * 31) + this.c) * 31) + this.d;
            this.f3079j = hashCode2;
            int hashCode3 = this.f3077h.hashCode() + (hashCode2 * 31);
            this.f3079j = hashCode3;
            int hashCode4 = this.e.hashCode() + (hashCode3 * 31);
            this.f3079j = hashCode4;
            int hashCode5 = this.f3075f.hashCode() + (hashCode4 * 31);
            this.f3079j = hashCode5;
            this.f3079j = this.f3078i.f2525b.hashCode() + (hashCode5 * 31);
        }
        return this.f3079j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f3074b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f3075f + ", signature=" + this.f3076g + ", hashCode=" + this.f3079j + ", transformations=" + this.f3077h + ", options=" + this.f3078i + '}';
    }
}
