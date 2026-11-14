package h8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f implements n9.b {

    /* renamed from: b, reason: collision with root package name */
    public final x7.d f2661b;
    public final Object c;
    public boolean d;

    public f(Object obj, x7.d dVar) {
        this.c = obj;
        this.f2661b = dVar;
    }

    @Override // n9.b
    public final void d(long j10) {
        if (j10 > 0 && !this.d) {
            this.d = true;
            Object obj = this.c;
            x7.d dVar = this.f2661b;
            dVar.e(obj);
            dVar.a();
        }
    }

    @Override // n9.b
    public final void cancel() {
    }
}
