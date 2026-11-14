package d2;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c implements x4.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1730a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final x4.c f1731b;
    public static final x4.c c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, d2.c] */
    static {
        a5.a aVar = new a5.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(a5.d.class, aVar);
        f1731b = new x4.c("eventsDroppedCount", Collections.unmodifiableMap(new HashMap(hashMap)));
        a5.a aVar2 = new a5.a(3);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(a5.d.class, aVar2);
        c = new x4.c("reason", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // x4.a
    public final void a(Object obj, Object obj2) {
        g2.d dVar = (g2.d) obj;
        x4.e eVar = (x4.e) obj2;
        eVar.a(f1731b, dVar.f2434a);
        eVar.d(c, dVar.f2435b);
    }
}
