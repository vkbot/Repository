package u4;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import s1.x0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadFactory f5870f = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f5871b = new AtomicLong();
    public final String c;
    public final int d;
    public final StrictMode.ThreadPolicy e;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.c = str;
        this.d = i10;
        this.e = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f5870f.newThread(new x0(7, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.c + " Thread #" + this.f5871b.getAndIncrement());
        return newThread;
    }
}
