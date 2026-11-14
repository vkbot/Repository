package o8;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f implements n9.b {

    /* renamed from: b, reason: collision with root package name */
    public static final f f4806b;
    public static final /* synthetic */ f[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [o8.f, java.lang.Enum] */
    static {
        ?? r02 = new Enum("CANCELLED", 0);
        f4806b = r02;
        c = new f[]{r02};
    }

    public static void a(AtomicReference atomicReference) {
        n9.b bVar;
        n9.b bVar2 = (n9.b) atomicReference.get();
        f fVar = f4806b;
        if (bVar2 != fVar && (bVar = (n9.b) atomicReference.getAndSet(fVar)) != fVar && bVar != null) {
            bVar.cancel();
        }
    }

    public static boolean b(AtomicReference atomicReference, n9.b bVar) {
        d8.b.a(bVar, "s is null");
        while (!atomicReference.compareAndSet(null, bVar)) {
            if (atomicReference.get() != null) {
                bVar.cancel();
                if (atomicReference.get() != f4806b) {
                    a.a.s(new IllegalStateException("Subscription already set!"));
                    return false;
                }
                return false;
            }
        }
        return true;
    }

    public static boolean c(long j10) {
        if (j10 <= 0) {
            a.a.s(new IllegalArgumentException(ai.onnxruntime.a.h(j10, "n > 0 required but it was ")));
            return false;
        }
        return true;
    }

    public static boolean e(n9.b bVar, n9.b bVar2) {
        if (bVar2 == null) {
            a.a.s(new NullPointerException("next is null"));
            return false;
        }
        if (bVar != null) {
            bVar2.cancel();
            a.a.s(new IllegalStateException("Subscription already set!"));
            return false;
        }
        return true;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) c.clone();
    }

    @Override // n9.b
    public final void cancel() {
    }

    @Override // n9.b
    public final void d(long j10) {
    }
}
