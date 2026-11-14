package v8;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class r extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final r f6047b = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CoroutineContext.Element element = (CoroutineContext.Element) obj;
        if (element instanceof t) {
            return (t) element;
        }
        return null;
    }
}
