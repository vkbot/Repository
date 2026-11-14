package i9;

import androidx.navigation.serialization.RouteDecoder;
import java.util.Iterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class i1 extends u {

    /* renamed from: b, reason: collision with root package name */
    public final h1 f2907b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(e9.b bVar) {
        super(bVar);
        bVar.getClass();
        this.f2907b = new h1(bVar.a());
    }

    @Override // e9.h, e9.a
    public final g9.e a() {
        return this.f2907b;
    }

    @Override // i9.u, e9.h
    public final void b(h9.b bVar, Object obj) {
        int h2 = h(obj);
        h1 h1Var = this.f2907b;
        h9.d beginCollection = bVar.beginCollection(h1Var, h2);
        p(beginCollection, obj, h2);
        beginCollection.endStructure(h1Var);
    }

    @Override // i9.a, e9.a
    public final Object c(RouteDecoder routeDecoder) {
        return i(routeDecoder);
    }

    @Override // i9.a
    public final Object d() {
        return (g1) l(o());
    }

    @Override // i9.a
    public final int e(Object obj) {
        g1 g1Var = (g1) obj;
        g1Var.getClass();
        return g1Var.d();
    }

    @Override // i9.a
    public final void f(int i10, Object obj) {
        g1 g1Var = (g1) obj;
        g1Var.getClass();
        g1Var.b(i10);
    }

    @Override // i9.a
    public final Iterator g(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // i9.a
    public final Object m(Object obj) {
        g1 g1Var = (g1) obj;
        g1Var.getClass();
        return g1Var.a();
    }

    @Override // i9.u
    public final void n(int i10, Object obj, Object obj2) {
        ((g1) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object o();

    public abstract void p(h9.d dVar, Object obj, int i10);
}
