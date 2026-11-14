package y8;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import v8.z0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class p extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public q f6660b;
    public g c;
    public s d;
    public z0 e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6661f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f6662g;

    /* renamed from: h, reason: collision with root package name */
    public int f6663h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, Continuation continuation) {
        super(continuation);
        this.f6662g = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6661f = obj;
        this.f6663h |= Integer.MIN_VALUE;
        return q.h(this.f6662g, null, this);
    }
}
