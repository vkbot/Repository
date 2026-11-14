package n7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f4170b;
    public static final c1 c;
    public static final /* synthetic */ c1[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, n7.c1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, n7.c1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, n7.c1] */
    static {
        ?? r02 = new Enum("NONE", 0);
        f4170b = r02;
        ?? r1 = new Enum("INTEGRITY", 1);
        ?? r22 = new Enum("PRIVACY_AND_INTEGRITY", 2);
        c = r22;
        d = new c1[]{r02, r1, r22};
    }

    public static c1 valueOf(String str) {
        return (c1) Enum.valueOf(c1.class, str);
    }

    public static c1[] values() {
        return (c1[]) d.clone();
    }
}
