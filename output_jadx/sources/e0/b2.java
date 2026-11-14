package e0;

import kotlin.jvm.internal.ByteCompanionObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: b, reason: collision with root package name */
    public static final b2 f1890b;
    public static final b2 c;
    public static final /* synthetic */ b2[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e0.b2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Enum, e0.b2] */
    static {
        ?? r02 = new Enum(m.h(new byte[]{-103, -115, ByteCompanionObject.MIN_VALUE, 35}, new byte[]{-47, -56, -63, 119, 119, -25, -32, -111}), 0);
        f1890b = r02;
        ?? r1 = new Enum(m.h(new byte[]{106, 112, 19, -77, -78}, new byte[]{41, 63, 92, -1, -9, -124, 63, -58}), 1);
        c = r1;
        d = new b2[]{r02, r1};
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) d.clone();
    }
}
