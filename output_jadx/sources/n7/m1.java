package n7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: b, reason: collision with root package name */
    public static final m1 f4228b;
    public static final m1 c;
    public static final /* synthetic */ m1[] d;

    /* JADX INFO: Fake field, exist only in values array */
    m1 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, n7.m1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, n7.m1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, n7.m1] */
    static {
        ?? r02 = new Enum("FAKE", 0);
        ?? r1 = new Enum("MTLS", 1);
        f4228b = r1;
        ?? r22 = new Enum("CUSTOM_MANAGERS", 2);
        c = r22;
        d = new m1[]{r02, r1, r22};
    }

    public static m1 valueOf(String str) {
        return (m1) Enum.valueOf(m1.class, str);
    }

    public static m1[] values() {
        return (m1[]) d.clone();
    }
}
