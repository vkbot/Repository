package d2;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements x4.d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1728a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final x4.c f1729b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, d2.b] */
    static {
        a5.a aVar = new a5.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(a5.d.class, aVar);
        f1729b = new x4.c("storageMetrics", Collections.unmodifiableMap(new HashMap(hashMap)));
    }

    @Override // x4.a
    public final void a(Object obj, Object obj2) {
        ((x4.e) obj2).d(f1729b, ((g2.b) obj).f2427a);
    }
}
