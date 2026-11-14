package y8;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import v8.z0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class u extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public v f6674b;
    public g c;
    public w d;
    public z0 e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6675f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6676g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v f6677h;

    /* renamed from: i, reason: collision with root package name */
    public int f6678i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, Continuation continuation) {
        super(continuation);
        this.f6677h = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6676g = obj;
        this.f6678i |= Integer.MIN_VALUE;
        return this.f6677h.collect(null, this);
    }
}
