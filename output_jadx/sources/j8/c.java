package j8;

import a9.w;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends a {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(x7.g gVar, Object obj, int i10) {
        super(gVar);
        this.c = i10;
        this.d = obj;
    }

    @Override // x7.g
    public final void d(x7.h hVar) {
        switch (this.c) {
            case 0:
                this.f3323b.c(new b(hVar, (w) this.d, 0));
                return;
            default:
                this.f3323b.c(new j(hVar, (e0.g) this.d));
                return;
        }
    }
}
