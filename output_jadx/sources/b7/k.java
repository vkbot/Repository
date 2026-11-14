package b7;

import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class k implements z5.p {

    /* renamed from: a, reason: collision with root package name */
    public final z5.h f408a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f409b = new ArrayList();

    public k(z5.h hVar) {
        this.f408a = hVar;
    }

    @Override // z5.p
    public final void a(z5.o oVar) {
        this.f409b.add(oVar);
    }

    public z5.b b(z5.j jVar) {
        return new z5.b(new f6.e(jVar));
    }
}
