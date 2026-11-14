package x8;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c extends FunctionReferenceImpl implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f6517b = new FunctionReferenceImpl(2, d.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        k kVar = (k) obj2;
        k kVar2 = d.f6518a;
        b bVar = kVar.f6538f;
        bVar.getClass();
        return new k(longValue, kVar, bVar, 0);
    }
}
