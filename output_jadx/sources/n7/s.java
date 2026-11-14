package n7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class s extends t {
    @Override // n7.t
    public void a(String str, Throwable th) {
        r().a(str, th);
    }

    @Override // n7.t
    public final void g() {
        r().g();
    }

    @Override // n7.t
    public final void k() {
        r().k();
    }

    @Override // n7.t
    public final void m(y5.g gVar) {
        r().m(gVar);
    }

    public abstract t r();

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(r(), "delegate");
        return t.toString();
    }
}
