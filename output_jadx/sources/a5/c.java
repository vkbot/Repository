package a5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f39b;
    public static final /* synthetic */ c[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, a5.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, a5.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, a5.c] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f39b = r02;
        c = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) c.clone();
    }
}
