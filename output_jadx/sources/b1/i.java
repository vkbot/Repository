package b1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f293b;
    public final /* synthetic */ l c;
    public final /* synthetic */ String d;

    public /* synthetic */ i(l lVar, String str, int i10) {
        this.f293b = i10;
        this.c = lVar;
        this.d = str;
    }

    @Override // b1.k
    public final String run() {
        switch (this.f293b) {
            case 0:
                return this.c.i(this.d);
            default:
                return this.c.j(this.d);
        }
    }
}
