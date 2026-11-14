package m0;

import java.util.Map;
import java.util.function.ToLongFunction;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class r1 implements ToLongFunction {
    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return ((Long) ((Map.Entry) obj).getValue()).longValue();
    }
}
