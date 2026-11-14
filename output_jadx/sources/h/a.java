package h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f2520b;
    public static final a c;
    public static final a d;
    public static final /* synthetic */ a[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, h.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, h.a] */
    static {
        ?? r02 = new Enum("PREFER_ARGB_8888", 0);
        f2520b = r02;
        ?? r1 = new Enum("PREFER_RGB_565", 1);
        c = r1;
        e = new a[]{r02, r1};
        d = r02;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) e.clone();
    }
}
