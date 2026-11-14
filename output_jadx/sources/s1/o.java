package s1;

import kotlin.jvm.internal.ByteCompanionObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final o f5575b;
    public static final o c;
    public static final o d;
    public static final o e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ o[] f5576f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, s1.o] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Enum, s1.o] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Enum, s1.o] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, s1.o] */
    static {
        ?? r02 = new Enum(e0.m.h(new byte[]{-66, 43, -51, -7}, new byte[]{-14, 110, -117, -83, -20, -100, 48, -95}), 0);
        f5575b = r02;
        ?? r1 = new Enum(e0.m.h(new byte[]{-18, -47, 14, ByteCompanionObject.MAX_VALUE, -89}, new byte[]{-68, -104, 73, 55, -13, 4, -95, 85}), 1);
        c = r1;
        ?? r32 = new Enum(e0.m.h(new byte[]{-7, -52, -100}, new byte[]{-83, -125, -52, 87, 23, 104, -13, -23}), 2);
        d = r32;
        ?? r52 = new Enum(e0.m.h(new byte[]{102, -2, 43, -11, -65, -69}, new byte[]{36, -79, ByteCompanionObject.MAX_VALUE, -95, -16, -10, 45, 80}), 3);
        e = r52;
        f5576f = new o[]{r02, r1, r32, r52};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f5576f.clone();
    }
}
