package f5;

import java.util.HashSet;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f2274a;

    /* JADX WARN: Type inference failed for: r1v1, types: [f5.a0, java.lang.Object] */
    public final a0 a(p2.e eVar) {
        Object obj = this.f2274a;
        if (obj instanceof b0) {
            return ((b0) obj).a(eVar);
        }
        ?? obj2 = new Object();
        obj2.f2270a = new HashSet();
        ((t4.n) obj).a(new f(7, (Object) obj2, eVar));
        return obj2;
    }
}
