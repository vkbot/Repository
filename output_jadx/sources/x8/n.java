package x8;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class n extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public Object f6541b;
    public /* synthetic */ Object c;
    public int d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return o.a(null, null, this);
    }
}
