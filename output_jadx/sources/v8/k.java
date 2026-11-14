package v8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.Volatile;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f6036b = AtomicIntegerFieldUpdater.newUpdater(k.class, "_handled");

    @Volatile
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f6037a;

    public k(boolean z9, Throwable th) {
        this.f6037a = th;
        this._handled = z9 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f6037a + ']';
    }
}
