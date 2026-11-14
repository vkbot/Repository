package c9;

import a9.x;
import java.util.concurrent.TimeUnit;
import kotlin.ranges.RangesKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f600a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f601b;
    public static final int c;
    public static final int d;
    public static final long e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f602f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f603g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f604h;

    static {
        String str;
        int i10 = x.f89a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f600a = str;
        f601b = a9.a.h(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        c = a9.a.i(RangesKt.coerceAtLeast(x.f89a, 2), 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = a9.a.i(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(a9.a.h(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f602f = f.f596a;
        f603g = new i(0);
        f604h = new i(1);
    }
}
