package y0;

import e0.d2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6588b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i10, Object obj) {
        this.f6588b = i10;
        this.c = obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.f6588b) {
            case 0:
                g.f6591a.remove((f) this.c);
                return;
            default:
                g.f6592b.remove((d2) this.c);
                return;
        }
    }
}
