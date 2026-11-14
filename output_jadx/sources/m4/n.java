package m4;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final n f3932b;
    public static final /* synthetic */ n[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, m4.n] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f3932b = r02;
        c = new n[]{r02};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
