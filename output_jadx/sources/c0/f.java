package c0;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f432b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f432b) {
            case 0:
                p.f().post(runnable);
                return;
            case 1:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
