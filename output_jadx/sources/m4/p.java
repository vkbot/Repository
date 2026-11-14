package m4;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadFactory f3933b;
    public final /* synthetic */ String c;
    public final /* synthetic */ AtomicLong d;
    public final /* synthetic */ Boolean e;

    public p(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool) {
        this.f3933b = threadFactory;
        this.c = str;
        this.d = atomicLong;
        this.e = bool;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f3933b.newThread(runnable);
        Objects.requireNonNull(newThread);
        AtomicLong atomicLong = this.d;
        Objects.requireNonNull(atomicLong);
        newThread.setName(String.format(Locale.ROOT, this.c, Long.valueOf(atomicLong.getAndIncrement())));
        Boolean bool = this.e;
        if (bool != null) {
            newThread.setDaemon(bool.booleanValue());
        }
        return newThread;
    }
}
