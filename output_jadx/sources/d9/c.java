package d9;

import a9.u;
import a9.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import v8.u1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class c implements v8.d, u1 {

    /* renamed from: b, reason: collision with root package name */
    public final v8.e f1860b;
    public final /* synthetic */ e c;

    public c(e eVar, v8.e eVar2) {
        this.c = eVar;
        this.f1860b = eVar2;
    }

    @Override // v8.d
    public final w a(Object obj, Function1 function1) {
        e eVar = this.c;
        b bVar = new b(eVar, this, 1);
        w a10 = this.f1860b.a((Unit) obj, bVar);
        if (a10 != null) {
            e.f1862g.set(eVar, null);
        }
        return a10;
    }

    @Override // v8.u1
    public final void b(u uVar, int i10) {
        this.f1860b.b(uVar, i10);
    }

    @Override // v8.d
    public final void d(Object obj, Function1 function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f1862g;
        e eVar = this.c;
        atomicReferenceFieldUpdater.set(eVar, null);
        b bVar = new b(eVar, this, 0);
        this.f1860b.d((Unit) obj, bVar);
    }

    @Override // v8.d
    public final void g(Object obj) {
        this.f1860b.g(obj);
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final CoroutineContext get$context() {
        return this.f1860b.f6020f;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.f1860b.resumeWith(obj);
    }
}
