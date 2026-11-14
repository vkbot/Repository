package y8;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class a extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public z8.i f6646b;
    public /* synthetic */ Object c;
    public final /* synthetic */ n.p d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n.p pVar, Continuation continuation) {
        super(continuation);
        this.d = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.collect(null, this);
    }
}
