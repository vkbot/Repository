package a2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f6b;
    public static final b c;
    public static final b d;
    public static final /* synthetic */ b[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, a2.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, a2.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, a2.b] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f6b = r02;
        ?? r1 = new Enum("VERY_LOW", 1);
        c = r1;
        ?? r22 = new Enum("HIGHEST", 2);
        d = r22;
        e = new b[]{r02, r1, r22};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) e.clone();
    }
}
