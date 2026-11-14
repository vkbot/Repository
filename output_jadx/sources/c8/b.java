package c8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements e8.b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f578b;
    public static final /* synthetic */ b[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c8.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c8.b] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f578b = r02;
        c = new b[]{r02, new Enum("NEVER", 1)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) c.clone();
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

    @Override // e8.g
    public final void clear() {
    }

    @Override // z7.a
    public final void dispose() {
    }
}
