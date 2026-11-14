package y8;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class h extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public g f6651b;
    public x8.f c;
    public x8.a d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6652f;

    /* renamed from: g, reason: collision with root package name */
    public int f6653g;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6652f = obj;
        this.f6653g |= Integer.MIN_VALUE;
        return r.c(null, null, false, this);
    }
}
