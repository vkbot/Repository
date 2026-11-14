package d2;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements x4.d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1726a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final x4.c f1727b;
    public static final x4.c c;
    public static final x4.c d;
    public static final x4.c e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, d2.a] */
    static {
        a5.a aVar = new a5.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(a5.d.class, aVar);
        f1727b = new x4.c("window", Collections.unmodifiableMap(new HashMap(hashMap)));
        a5.a aVar2 = new a5.a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(a5.d.class, aVar2);
        c = new x4.c("logSourceMetrics", Collections.unmodifiableMap(new HashMap(hashMap2)));
        a5.a aVar3 = new a5.a(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(a5.d.class, aVar3);
        d = new x4.c("globalMetrics", Collections.unmodifiableMap(new HashMap(hashMap3)));
        a5.a aVar4 = new a5.a(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(a5.d.class, aVar4);
        e = new x4.c("appNamespace", Collections.unmodifiableMap(new HashMap(hashMap4)));
    }

    @Override // x4.a
    public final void a(Object obj, Object obj2) {
        g2.a aVar = (g2.a) obj;
        x4.e eVar = (x4.e) obj2;
        eVar.d(f1727b, aVar.f2425a);
        eVar.d(c, aVar.f2426b);
        eVar.d(d, aVar.c);
        eVar.d(e, aVar.d);
    }
}
