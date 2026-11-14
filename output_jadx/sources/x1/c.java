package x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f6491b;
    public static final c c;
    public static final /* synthetic */ c[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, x1.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, x1.c] */
    static {
        ?? r02 = new Enum("ROUND", 0);
        f6491b = r02;
        ?? r1 = new Enum("BUTT", 1);
        c = r1;
        d = new c[]{r02, r1};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
