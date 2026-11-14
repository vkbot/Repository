package m8;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k extends AtomicLong implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final String f3986b;
    public final int c;
    public final boolean d;

    public k(String str, int i10, boolean z9) {
        this.f3986b = str;
        this.c = i10;
        this.d = z9;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread;
        String str = this.f3986b + '-' + incrementAndGet();
        if (this.d) {
            thread = new m.a(str, runnable);
        } else {
            thread = new Thread(runnable, str);
        }
        thread.setPriority(this.c);
        thread.setDaemon(true);
        return thread;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return ai.onnxruntime.a.p(new StringBuilder("RxThreadFactory["), this.f3986b, "]");
    }

    public k(String str) {
        this(str, 5, false);
    }
}
