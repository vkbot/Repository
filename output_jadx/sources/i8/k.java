package i8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k extends a {
    public final /* synthetic */ int c;
    public final b8.c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(x7.e eVar, b8.c cVar, int i10) {
        super(eVar);
        this.c = i10;
        this.d = cVar;
    }

    @Override // x7.e
    public final void d(x7.f fVar) {
        switch (this.c) {
            case 0:
                this.f2843b.c(new j(fVar, this.d));
                return;
            default:
                this.f2843b.c(new g8.c(fVar, this.d, 1));
                return;
        }
    }
}
