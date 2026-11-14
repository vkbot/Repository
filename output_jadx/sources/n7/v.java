package n7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public static final v f4247b;
    public static final v c;
    public static final v d;
    public static final /* synthetic */ v[] e;

    /* JADX INFO: Fake field, exist only in values array */
    v EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [n7.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [n7.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [n7.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [n7.v, java.lang.Enum] */
    static {
        ?? r02 = new Enum("CT_UNKNOWN", 0);
        ?? r1 = new Enum("CT_INFO", 1);
        f4247b = r1;
        ?? r22 = new Enum("CT_WARNING", 2);
        c = r22;
        ?? r32 = new Enum("CT_ERROR", 3);
        d = r32;
        e = new v[]{r02, r1, r22, r32};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) e.clone();
    }
}
