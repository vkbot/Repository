package d5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final k f1832b;
    public static final k c;
    public static final k d;
    public static final k e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k[] f1833f;

    /* JADX WARN: Type inference failed for: r0v0, types: [d5.k, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [d5.k, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [d5.k, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [d5.k, java.lang.Enum] */
    static {
        ?? r02 = new Enum("UNKNOWN_DISMISS_TYPE", 0);
        f1832b = r02;
        ?? r1 = new Enum("AUTO", 1);
        c = r1;
        ?? r22 = new Enum("CLICK", 2);
        d = r22;
        ?? r32 = new Enum("SWIPE", 3);
        e = r32;
        f1833f = new k[]{r02, r1, r22, r32};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f1833f.clone();
    }
}
