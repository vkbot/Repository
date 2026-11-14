package n7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final j f4214b;
    public static final j c;
    public static final j d;
    public static final j e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f4215f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ j[] f4216g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, n7.j] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, n7.j] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, n7.j] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, n7.j] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, n7.j] */
    static {
        ?? r02 = new Enum("CONNECTING", 0);
        f4214b = r02;
        ?? r1 = new Enum("READY", 1);
        c = r1;
        ?? r22 = new Enum("TRANSIENT_FAILURE", 2);
        d = r22;
        ?? r32 = new Enum("IDLE", 3);
        e = r32;
        ?? r42 = new Enum("SHUTDOWN", 4);
        f4215f = r42;
        f4216g = new j[]{r02, r1, r22, r32, r42};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f4216g.clone();
    }
}
