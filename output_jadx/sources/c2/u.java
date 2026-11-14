package c2;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static final SparseArray f505b;
    public static final /* synthetic */ u[] c;

    /* JADX INFO: Fake field, exist only in values array */
    u EF1;

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Enum, java.lang.Object, c2.u] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Enum, java.lang.Object, c2.u] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Enum, java.lang.Object, c2.u] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Enum, java.lang.Object, c2.u] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Enum, java.lang.Object, c2.u] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Enum, java.lang.Object, c2.u] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Enum, java.lang.Object, c2.u] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Enum, java.lang.Object, c2.u] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, java.lang.Object, c2.u] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Enum, java.lang.Object, c2.u] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Enum, java.lang.Object, c2.u] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Enum, java.lang.Object, c2.u] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Enum, java.lang.Object, c2.u] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Enum, c2.u] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, java.lang.Object, c2.u] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, java.lang.Object, c2.u] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, java.lang.Object, c2.u] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, java.lang.Object, c2.u] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, java.lang.Object, c2.u] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, java.lang.Object, c2.u] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, java.lang.Object, c2.u] */
    static {
        ?? r1 = new Enum("UNKNOWN_MOBILE_SUBTYPE", 0);
        ?? r22 = new Enum("GPRS", 1);
        ?? r32 = new Enum("EDGE", 2);
        ?? r42 = new Enum("UMTS", 3);
        ?? r52 = new Enum("CDMA", 4);
        ?? r62 = new Enum("EVDO_0", 5);
        ?? r72 = new Enum("EVDO_A", 6);
        ?? r82 = new Enum("RTT", 7);
        ?? r9 = new Enum("HSDPA", 8);
        ?? r10 = new Enum("HSUPA", 9);
        ?? r11 = new Enum("HSPA", 10);
        ?? r12 = new Enum("IDEN", 11);
        ?? r13 = new Enum("EVDO_B", 12);
        ?? r14 = new Enum("LTE", 13);
        ?? r15 = new Enum("EHRPD", 14);
        ?? r02 = new Enum("HSPAP", 15);
        ?? r16 = new Enum("GSM", 16);
        ?? r23 = new Enum("TD_SCDMA", 17);
        ?? r03 = new Enum("IWLAN", 18);
        ?? r17 = new Enum("LTE_CA", 19);
        c = new u[]{r1, r22, r32, r42, r52, r62, r72, r82, r9, r10, r11, r12, r13, r14, r15, r02, r16, r23, r03, r17, new Enum("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f505b = sparseArray;
        sparseArray.put(0, r1);
        sparseArray.put(1, r22);
        sparseArray.put(2, r32);
        sparseArray.put(3, r42);
        sparseArray.put(4, r52);
        sparseArray.put(5, r62);
        sparseArray.put(6, r72);
        sparseArray.put(7, r82);
        sparseArray.put(8, r9);
        sparseArray.put(9, r10);
        sparseArray.put(10, r11);
        sparseArray.put(11, r12);
        sparseArray.put(12, r13);
        sparseArray.put(13, r14);
        sparseArray.put(14, r15);
        sparseArray.put(15, r02);
        sparseArray.put(16, r16);
        sparseArray.put(17, r23);
        sparseArray.put(18, r03);
        sparseArray.put(19, r17);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) c.clone();
    }
}
