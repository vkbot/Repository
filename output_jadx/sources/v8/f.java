package v8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.Volatile;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class f extends k {
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(f.class, "_resumed");

    @Volatile
    private volatile int _resumed;

    public f(e eVar, Throwable th, boolean z9) {
        super(z9, th);
        this._resumed = 0;
    }
}
