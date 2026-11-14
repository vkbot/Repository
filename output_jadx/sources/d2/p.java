package d2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f1755b;

    public p(ExecutorService executorService) {
        this.f1755b = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1755b.execute(new o(runnable, 0));
    }
}
