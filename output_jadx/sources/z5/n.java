package z5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final n f6867b;
    public static final n c;
    public static final n d;
    public static final n e;

    /* renamed from: f, reason: collision with root package name */
    public static final n f6868f;

    /* renamed from: g, reason: collision with root package name */
    public static final n f6869g;

    /* renamed from: h, reason: collision with root package name */
    public static final n f6870h;

    /* renamed from: i, reason: collision with root package name */
    public static final n f6871i;

    /* renamed from: j, reason: collision with root package name */
    public static final n f6872j;

    /* renamed from: k, reason: collision with root package name */
    public static final n f6873k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ n[] f6874l;

    /* JADX INFO: Fake field, exist only in values array */
    n EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [z5.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r10v2, types: [z5.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [z5.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [z5.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [z5.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [z5.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [z5.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [z5.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v2, types: [z5.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v2, types: [z5.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v2, types: [z5.n, java.lang.Enum] */
    static {
        ?? r02 = new Enum("OTHER", 0);
        ?? r1 = new Enum("ORIENTATION", 1);
        f6867b = r1;
        ?? r22 = new Enum("BYTE_SEGMENTS", 2);
        c = r22;
        ?? r32 = new Enum("ERROR_CORRECTION_LEVEL", 3);
        d = r32;
        ?? r42 = new Enum("ISSUE_NUMBER", 4);
        e = r42;
        ?? r52 = new Enum("SUGGESTED_PRICE", 5);
        f6868f = r52;
        ?? r62 = new Enum("POSSIBLE_COUNTRY", 6);
        f6869g = r62;
        ?? r72 = new Enum("UPC_EAN_EXTENSION", 7);
        f6870h = r72;
        ?? r82 = new Enum("PDF417_EXTRA_METADATA", 8);
        f6871i = r82;
        ?? r9 = new Enum("STRUCTURED_APPEND_SEQUENCE", 9);
        f6872j = r9;
        ?? r10 = new Enum("STRUCTURED_APPEND_PARITY", 10);
        f6873k = r10;
        f6874l = new n[]{r02, r1, r22, r32, r42, r52, r62, r72, r82, r9, r10};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f6874l.clone();
    }
}
