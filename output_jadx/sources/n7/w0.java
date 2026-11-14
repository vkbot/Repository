package n7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: b, reason: collision with root package name */
    public static final w0 f4252b;
    public static final w0 c;
    public static final /* synthetic */ w0[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, n7.w0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, n7.w0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, n7.w0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, n7.w0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, n7.w0] */
    static {
        ?? r02 = new Enum("UNARY", 0);
        f4252b = r02;
        ?? r1 = new Enum("CLIENT_STREAMING", 1);
        ?? r22 = new Enum("SERVER_STREAMING", 2);
        c = r22;
        d = new w0[]{r02, r1, r22, new Enum("BIDI_STREAMING", 3), new Enum("UNKNOWN", 4)};
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) d.clone();
    }
}
