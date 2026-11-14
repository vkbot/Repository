package q5;

import d2.h;
import java.util.concurrent.Executor;
import s4.b;
import s4.d;
import t4.c;
import t4.p;
import v8.s0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements c {
    public static final a c = new a(0);
    public static final a d = new a(1);
    public static final a e = new a(2);

    /* renamed from: f, reason: collision with root package name */
    public static final a f5284f = new a(3);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5285b;

    public /* synthetic */ a(int i10) {
        this.f5285b = i10;
    }

    @Override // t4.c
    public final Object a(h hVar) {
        switch (this.f5285b) {
            case 0:
                Object h2 = hVar.h(new p(s4.a.class, Executor.class));
                h2.getClass();
                return new s0((Executor) h2);
            case 1:
                Object h10 = hVar.h(new p(s4.c.class, Executor.class));
                h10.getClass();
                return new s0((Executor) h10);
            case 2:
                Object h11 = hVar.h(new p(b.class, Executor.class));
                h11.getClass();
                return new s0((Executor) h11);
            default:
                Object h12 = hVar.h(new p(d.class, Executor.class));
                h12.getClass();
                return new s0((Executor) h12);
        }
    }
}
