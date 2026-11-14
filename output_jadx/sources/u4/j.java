package u4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final j f5883b;
    public static final Handler c;
    public static final /* synthetic */ j[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, u4.j] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f5883b = r02;
        d = new j[]{r02};
        c = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) d.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c.post(runnable);
    }
}
