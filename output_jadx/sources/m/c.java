package m;

import a9.i;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final b f3592b;
    public final String c;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f3593f = new AtomicInteger();
    public final d d = d.f3594a;

    public c(b bVar, String str, boolean z9) {
        this.f3592b = bVar;
        this.c = str;
        this.e = z9;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        i iVar = new i(1, this, runnable);
        this.f3592b.getClass();
        a aVar = new a(iVar);
        aVar.setName("glide-" + this.c + "-thread-" + this.f3593f.getAndIncrement());
        return aVar;
    }
}
