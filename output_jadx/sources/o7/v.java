package o7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public static final v f4733b;
    public static final v c;
    public static final v d;
    public static final v e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ v[] f4734f;

    /* JADX WARN: Type inference failed for: r0v0, types: [o7.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o7.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [o7.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [o7.v, java.lang.Enum] */
    static {
        ?? r02 = new Enum("PROCESSED", 0);
        f4733b = r02;
        ?? r1 = new Enum("REFUSED", 1);
        c = r1;
        ?? r22 = new Enum("DROPPED", 2);
        d = r22;
        ?? r32 = new Enum("MISCARRIED", 3);
        e = r32;
        f4734f = new v[]{r02, r1, r22, r32};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f4734f.clone();
    }
}
