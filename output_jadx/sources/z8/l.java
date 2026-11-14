package z8;

import a9.t;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import v8.h1;
import v8.y0;
import v8.z0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class l extends Lambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f6890b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar) {
        super(2);
        this.f6890b = iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        int intValue = ((Number) obj).intValue();
        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
        CoroutineContext.Key<?> key = element.getKey();
        CoroutineContext.Element element2 = this.f6890b.c.get(key);
        if (key != y0.f6058b) {
            if (element != element2) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = intValue + 1;
            }
            return Integer.valueOf(i10);
        }
        z0 z0Var = (z0) element2;
        z0 z0Var2 = (z0) element;
        while (true) {
            if (z0Var2 == null) {
                z0Var2 = null;
                break;
            }
            if (z0Var2 == z0Var || !(z0Var2 instanceof t)) {
                break;
            }
            v8.h hVar = (v8.h) h1.c.get((h1) z0Var2);
            if (hVar != null) {
                z0Var2 = hVar.getParent();
            } else {
                z0Var2 = null;
            }
        }
        if (z0Var2 == z0Var) {
            if (z0Var != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + z0Var2 + ", expected child of " + z0Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
