package org.apache.commons.io.function;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@FunctionalInterface
/* loaded from: classes2.dex */
public interface IORunnable {
    /* synthetic */ default void lambda$asRunnable$0() {
        Uncheck.run(this);
    }

    static IORunnable noop() {
        return Constants.IO_RUNNABLE;
    }

    default Runnable asRunnable() {
        return new d(this, 1);
    }

    void run();
}
