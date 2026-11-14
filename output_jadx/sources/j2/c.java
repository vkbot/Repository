package j2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f3245b;
    public static final c c;
    public static final c d;
    public static final /* synthetic */ c[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j2.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j2.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j2.c] */
    static {
        ?? r02 = new Enum("NETWORK_UNMETERED", 0);
        f3245b = r02;
        ?? r1 = new Enum("DEVICE_IDLE", 1);
        c = r1;
        ?? r22 = new Enum("DEVICE_CHARGING", 2);
        d = r22;
        e = new c[]{r02, r1, r22};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) e.clone();
    }
}
