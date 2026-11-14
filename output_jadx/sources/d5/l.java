package d5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f1834b;
    public static final l c;
    public static final l d;
    public static final l e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ l[] f1835f;

    /* JADX WARN: Type inference failed for: r0v0, types: [d5.l, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [d5.l, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [d5.l, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [d5.l, java.lang.Enum] */
    static {
        ?? r02 = new Enum("UNSPECIFIED_RENDER_ERROR", 0);
        f1834b = r02;
        ?? r1 = new Enum("IMAGE_FETCH_ERROR", 1);
        c = r1;
        ?? r22 = new Enum("IMAGE_DISPLAY_ERROR", 2);
        d = r22;
        ?? r32 = new Enum("IMAGE_UNSUPPORTED_FORMAT", 3);
        e = r32;
        f1835f = new l[]{r02, r1, r22, r32};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f1835f.clone();
    }
}
