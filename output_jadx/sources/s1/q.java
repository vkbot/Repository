package s1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final q f5581b;
    public static final q c;
    public static final /* synthetic */ q[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, s1.q] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, s1.q] */
    static {
        ?? r02 = new Enum(e0.m.h(new byte[]{-64, -71, -10, -25}, new byte[]{-121, -21, -65, -93, 57, -127, 29, -13}), 0);
        f5581b = r02;
        ?? r22 = new Enum(e0.m.h(new byte[]{73, 118, -117, -116}, new byte[]{5, 63, -59, -55, 76, -85, 122, 66}), 1);
        c = r22;
        d = new q[]{r02, r22};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) d.clone();
    }
}
