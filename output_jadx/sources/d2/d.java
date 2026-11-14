package d2;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements x4.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1732a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final x4.c f1733b;
    public static final x4.c c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, d2.d] */
    static {
        a5.a aVar = new a5.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(a5.d.class, aVar);
        f1733b = new x4.c("logSource", Collections.unmodifiableMap(new HashMap(hashMap)));
        a5.a aVar2 = new a5.a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(a5.d.class, aVar2);
        c = new x4.c("logEventDropped", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // x4.a
    public final void a(Object obj, Object obj2) {
        g2.e eVar = (g2.e) obj;
        x4.e eVar2 = (x4.e) obj2;
        eVar2.d(f1733b, eVar.f2436a);
        eVar2.d(c, eVar.f2437b);
    }
}
