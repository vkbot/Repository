package n7;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f4211b = new i(new h(2), h.c);

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f4212a = new ConcurrentHashMap();

    public i(h... hVarArr) {
        for (h hVar : hVarArr) {
            this.f4212a.put(hVar.a(), hVar);
        }
    }
}
