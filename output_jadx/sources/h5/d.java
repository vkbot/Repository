package h5;

import com.google.protobuf.q;
import e0.g;
import f5.w;
import h8.l;
import h8.p0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements e5.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2586b;
    public final r5.c c;

    public /* synthetic */ d(r5.c cVar, int i10) {
        this.f2586b = i10;
        this.c = cVar;
    }

    @Override // t8.a
    public final Object get() {
        int i10 = this.f2586b;
        r5.c cVar = this.c;
        switch (i10) {
            case 0:
                g gVar = new g(cVar);
                int i11 = x7.b.f6507b;
                q.p(3, "mode is null");
                p0 c = new l(0, gVar).c();
                c.f();
                return c;
            default:
                return (w) cVar.c;
        }
    }
}
