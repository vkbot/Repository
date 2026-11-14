package androidx.arch.core.executor;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f159b;

    public /* synthetic */ a(int i10) {
        this.f159b = i10;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f159b) {
            case 0:
                ArchTaskExecutor.a(runnable);
                return;
            case 1:
                ArchTaskExecutor.b(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
