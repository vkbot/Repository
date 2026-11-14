package a9;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlin.sequences.SequencesKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final List f69a;

    static {
        try {
            f69a = SequencesKt.toList(SequencesKt.asSequence(Arrays.asList(new w8.b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
