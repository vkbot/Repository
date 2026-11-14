package x7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class g {
    public final void c(h hVar) {
        try {
            d(hVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            com.bumptech.glide.d.v(th);
            a.a.s(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void d(h hVar);
}
