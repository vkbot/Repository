package v8;

import kotlin.Result;
import kotlin.ResultKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class m {
    public static final Object a(Object obj) {
        if (obj instanceof k) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m95constructorimpl(ResultKt.createFailure(((k) obj).f6037a));
        }
        return Result.m95constructorimpl(obj);
    }
}
