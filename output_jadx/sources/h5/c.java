package h5;

import a5.h;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c implements e5.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2585b;
    public final h c;

    public /* synthetic */ c(h hVar, int i10) {
        this.f2585b = i10;
        this.c = hVar;
    }

    @Override // t8.a
    public final Object get() {
        switch (this.f2585b) {
            case 0:
                Executor executor = (Executor) this.c.c;
                a.a.e(executor);
                return executor;
            case 1:
                Executor executor2 = (Executor) this.c.d;
                a.a.e(executor2);
                return executor2;
            default:
                Executor executor3 = (Executor) this.c.e;
                a.a.e(executor3);
                return executor3;
        }
    }
}
