package c2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final q f504b;
    public static final /* synthetic */ q[] c;

    /* JADX INFO: Fake field, exist only in values array */
    q EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c2.q] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c2.q] */
    static {
        ?? r02 = new Enum("UNKNOWN", 0);
        ?? r1 = new Enum("ANDROID_FIREBASE", 1);
        f504b = r1;
        c = new q[]{r02, r1};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) c.clone();
    }
}
