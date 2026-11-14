package o7;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e {
    public static final Logger c = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final String f4462a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f4463b;

    public e(long j10) {
        boolean z9;
        AtomicLong atomicLong = new AtomicLong();
        this.f4463b = atomicLong;
        if (j10 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.d("value must be positive", z9);
        this.f4462a = "keepalive time nanos";
        atomicLong.set(j10);
    }
}
