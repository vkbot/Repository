package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final h f628b;
    public static final h c;
    public static final h d;
    public static final h e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h[] f629f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.bumptech.glide.h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.bumptech.glide.h] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.bumptech.glide.h] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.bumptech.glide.h] */
    static {
        ?? r02 = new Enum("IMMEDIATE", 0);
        f628b = r02;
        ?? r1 = new Enum("HIGH", 1);
        c = r1;
        ?? r22 = new Enum("NORMAL", 2);
        d = r22;
        ?? r32 = new Enum("LOW", 3);
        e = r32;
        f629f = new h[]{r02, r1, r22, r32};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f629f.clone();
    }
}
