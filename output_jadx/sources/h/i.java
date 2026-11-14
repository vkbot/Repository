package h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f2526b;
    public static final /* synthetic */ i[] c;

    /* JADX INFO: Fake field, exist only in values array */
    i EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [h.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [h.i, java.lang.Enum] */
    static {
        ?? r02 = new Enum("SRGB", 0);
        ?? r1 = new Enum("DISPLAY_P3", 1);
        f2526b = r1;
        c = new i[]{r02, r1};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) c.clone();
    }
}
