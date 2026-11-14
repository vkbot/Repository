package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3442b;

    public /* synthetic */ b(int i10) {
        this.f3442b = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3442b) {
            case 0:
                return CombinedContext.a((String) obj, (CoroutineContext.Element) obj2);
            default:
                return CoroutineContext.DefaultImpls.a((CoroutineContext) obj, (CoroutineContext.Element) obj2);
        }
    }
}
