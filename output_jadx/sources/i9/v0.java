package i9;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile SoftReference f2954a;

    public final synchronized Object a(Function0 function0) {
        Object obj = this.f2954a.get();
        if (obj != null) {
            return obj;
        }
        Object invoke = function0.invoke();
        this.f2954a = new SoftReference(invoke);
        return invoke;
    }
}
