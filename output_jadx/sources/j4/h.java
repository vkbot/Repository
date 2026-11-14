package j4;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h extends q {

    /* renamed from: b, reason: collision with root package name */
    public boolean f3273b;
    public final /* synthetic */ Object c;

    public h(Object obj) {
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f3273b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f3273b) {
            this.f3273b = true;
            return this.c;
        }
        n0.b.x();
        return null;
    }
}
