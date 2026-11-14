package o8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements e8.d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f4804b;
    public static final /* synthetic */ d[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, o8.d] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f4804b = r02;
        c = new d[]{r02};
    }

    public static void a(x7.d dVar) {
        dVar.f(f4804b);
        dVar.a();
    }

    public static void b(Throwable th, x7.d dVar) {
        dVar.f(f4804b);
        dVar.onError(th);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) c.clone();
    }

    @Override // n9.b
    public final void d(long j10) {
        f.c(j10);
    }

    @Override // e8.c
    public final int h(int i10) {
        return 2;
    }

    @Override // e8.g
    public final boolean isEmpty() {
        return true;
    }

    @Override // e8.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // e8.g
    public final Object poll() {
        return null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }

    @Override // n9.b
    public final void cancel() {
    }

    @Override // e8.g
    public final void clear() {
    }
}
