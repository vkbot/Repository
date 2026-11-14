package v8;

import kotlin.Unit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class i extends b1 implements h {

    /* renamed from: f, reason: collision with root package name */
    public final h1 f6032f;

    public i(h1 h1Var) {
        this.f6032f = h1Var;
    }

    @Override // v8.h
    public final boolean a(Throwable th) {
        return i().o(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return Unit.INSTANCE;
    }

    @Override // v8.d1
    public final void j(Throwable th) {
        this.f6032f.k(i());
    }
}
