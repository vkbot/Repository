package w0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f6065b;
    public static final b c;
    public static final b d;
    public static final /* synthetic */ b[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, w0.b] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Enum, w0.b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, w0.b] */
    static {
        ?? r02 = new Enum(e0.m.h(new byte[]{120, 106, -81}, new byte[]{55, 44, -23, 107, 33, -22, -19, 69}), 0);
        f6065b = r02;
        ?? r1 = new Enum(e0.m.h(new byte[]{30, -85}, new byte[]{81, -27, -41, -22, 31, -36, 104, -113}), 1);
        c = r1;
        ?? r42 = new Enum(e0.m.h(new byte[]{12, -11, 113, 74, -112}, new byte[]{74, -70, 50, 31, -61, -111, 58, -77}), 2);
        d = r42;
        e = new b[]{r02, r1, r42};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) e.clone();
    }
}
