package y1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f6610b = {new Enum("NoIndicator", 0), new Enum("NormalIndicator", 1), new Enum("NormalSmallIndicator", 2), new Enum("TriangleIndicator", 3), new Enum("SpindleIndicator", 4), new Enum("LineIndicator", 5), new Enum("HalfLineIndicator", 6), new Enum("QuarterLineIndicator", 7), new Enum("KiteIndicator", 8), new Enum("NeedleIndicator", 9)};

    /* JADX INFO: Fake field, exist only in values array */
    a EF5;

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f6610b.clone();
    }
}
