package u7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f5901b;
    public static final /* synthetic */ b[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [u7.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [u7.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [u7.b, java.lang.Enum] */
    static {
        ?? r02 = new Enum("BLOCKING", 0);
        f5901b = r02;
        c = new b[]{r02, new Enum("FUTURE", 1), new Enum("ASYNC", 2)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) c.clone();
    }
}
