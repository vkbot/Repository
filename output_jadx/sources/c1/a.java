package c1;

import e0.m;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f448b;
    public static final a c;
    public static final a d;
    public static final /* synthetic */ a[] e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c1.a] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Enum, c1.a] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Enum, c1.a] */
    static {
        ?? r02 = new Enum(m.h(new byte[]{78, 11, -121, -46}, new byte[]{29, 78, -55, -122, -109, -19, 93, -77}), 0);
        f448b = r02;
        ?? r1 = new Enum(m.h(new byte[]{101, 90, -106, -114, 88, -120, 117, -46, 103, 84, ByteCompanionObject.MIN_VALUE, -99, 92}, new byte[]{43, 21, -62, -47, 25, -34, 52, -101}), 1);
        c = r1;
        ?? r32 = new Enum(m.h(new byte[]{-66, 90, -22, -58, 88, 94, -27, 67, -95, 81, -25, -49, 84, 67, -1, 79, -86}, new byte[]{-18, 31, -72, -117, 17, 13, -74, 10}), 2);
        d = r32;
        e = new a[]{r02, r1, r32};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) e.clone();
    }
}
