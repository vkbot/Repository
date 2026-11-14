package c2;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public static final x f507b;
    public static final /* synthetic */ x[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c2.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c2.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Enum, c2.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, c2.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, c2.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, c2.x, java.lang.Object] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f507b = r02;
        ?? r1 = new Enum("UNMETERED_ONLY", 1);
        ?? r22 = new Enum("UNMETERED_OR_DAILY", 2);
        ?? r32 = new Enum("FAST_IF_RADIO_AWAKE", 3);
        ?? r42 = new Enum("NEVER", 4);
        ?? r52 = new Enum("UNRECOGNIZED", 5);
        c = new x[]{r02, r1, r22, r32, r42, r52};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r02);
        sparseArray.put(1, r1);
        sparseArray.put(2, r22);
        sparseArray.put(3, r32);
        sparseArray.put(4, r42);
        sparseArray.put(-1, r52);
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) c.clone();
    }
}
