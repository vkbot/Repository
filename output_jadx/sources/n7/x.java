package n7;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class x {
    public static final Logger d = Logger.getLogger(x.class.getName());
    public static final x e = new x();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentSkipListMap f4253a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f4254b;
    public final ConcurrentHashMap c;

    public x() {
        new ConcurrentSkipListMap();
        this.f4253a = new ConcurrentSkipListMap();
        this.f4254b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }
}
