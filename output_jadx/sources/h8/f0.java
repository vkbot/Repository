package h8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f0 implements b8.b {

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f2662b;
    public static final /* synthetic */ f0[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, h8.f0] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f2662b = r02;
        c = new f0[]{r02};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) c.clone();
    }

    @Override // b8.b
    public final void accept(Object obj) {
        ((n9.b) obj).d(Long.MAX_VALUE);
    }
}
