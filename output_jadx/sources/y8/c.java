package y8;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class c extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6648b;
    public final /* synthetic */ d c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(continuation);
        this.c = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6648b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
