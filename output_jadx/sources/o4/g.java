package o4;

import java.util.concurrent.Executor;
import t4.p;
import v8.s0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g implements t4.c {
    public static final g c = new g(0);
    public static final g d = new g(1);
    public static final g e = new g(2);

    /* renamed from: f, reason: collision with root package name */
    public static final g f4365f = new g(3);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4366b;

    public /* synthetic */ g(int i10) {
        this.f4366b = i10;
    }

    @Override // t4.c
    public final Object a(d2.h hVar) {
        switch (this.f4366b) {
            case 0:
                Object h2 = hVar.h(new p(s4.a.class, Executor.class));
                h2.getClass();
                return new s0((Executor) h2);
            case 1:
                Object h10 = hVar.h(new p(s4.c.class, Executor.class));
                h10.getClass();
                return new s0((Executor) h10);
            case 2:
                Object h11 = hVar.h(new p(s4.b.class, Executor.class));
                h11.getClass();
                return new s0((Executor) h11);
            default:
                Object h12 = hVar.h(new p(s4.d.class, Executor.class));
                h12.getClass();
                return new s0((Executor) h12);
        }
    }
}
