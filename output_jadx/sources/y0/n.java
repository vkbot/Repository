package y0;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f6609a = new AtomicBoolean(false);

    public static void a() {
        f6609a.compareAndSet(false, true);
    }
}
