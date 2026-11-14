package ai.onnxruntime.providers;

import java.util.Map;
import java.util.function.Function;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String lambda$getOptionsString$0;
        lambda$getOptionsString$0 = StringConfigProviderOptions.lambda$getOptionsString$0((Map.Entry) obj);
        return lambda$getOptionsString$0;
    }
}
