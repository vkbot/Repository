package y8;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class b extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public x8.q f6647b;
    public /* synthetic */ Object c;
    public final /* synthetic */ l.d d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l.d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.k(null, this);
    }
}
