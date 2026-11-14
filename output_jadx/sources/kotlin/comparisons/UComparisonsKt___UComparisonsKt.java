package kotlin.comparisons;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a(\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a(\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a(\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0087\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0018\u001a\u00020\u0019\"\u00020\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\n\u0010\u0018\u001a\u00020\u001c\"\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\n\u0010\u0018\u001a\u00020\u001f\"\u00020\tH\u0007¢\u0006\u0004\b \u0010!\u001a#\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\n\u0010\u0018\u001a\u00020\"\"\u00020\fH\u0007¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b&\u0010\u0005\u001a\u001f\u0010%\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b'\u0010\b\u001a\u001f\u0010%\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b(\u0010\u000b\u001a\u001f\u0010%\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0007¢\u0006\u0004\b)\u0010\u000e\u001a(\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b*\u0010\u0011\u001a(\u0010%\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b+\u0010\u0013\u001a(\u0010%\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0087\b¢\u0006\u0004\b,\u0010\u0015\u001a(\u0010%\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0087\b¢\u0006\u0004\b-\u0010\u0017\u001a#\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0018\u001a\u00020\u0019\"\u00020\u0001H\u0007¢\u0006\u0004\b.\u0010\u001b\u001a#\u0010%\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\n\u0010\u0018\u001a\u00020\u001c\"\u00020\u0006H\u0007¢\u0006\u0004\b/\u0010\u001e\u001a#\u0010%\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\n\u0010\u0018\u001a\u00020\u001f\"\u00020\tH\u0007¢\u0006\u0004\b0\u0010!\u001a#\u0010%\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\n\u0010\u0018\u001a\u00020\"\"\u00020\fH\u0007¢\u0006\u0004\b1\u0010$¨\u00062"}, d2 = {"maxOf", "Lkotlin/UInt;", "a", "b", "maxOf-J1ME1BU", "(II)I", "Lkotlin/ULong;", "maxOf-eb3DHEI", "(JJ)J", "Lkotlin/UByte;", "maxOf-Kr8caGY", "(BB)B", "Lkotlin/UShort;", "maxOf-5PvTz6A", "(SS)S", "c", "maxOf-WZ9TVnA", "(III)I", "maxOf-sambcqE", "(JJJ)J", "maxOf-b33U2AM", "(BBB)B", "maxOf-VKSA0NQ", "(SSS)S", "other", "Lkotlin/UIntArray;", "maxOf-Md2H83M", "(I[I)I", "Lkotlin/ULongArray;", "maxOf-R03FKyM", "(J[J)J", "Lkotlin/UByteArray;", "maxOf-Wr6uiD8", "(B[B)B", "Lkotlin/UShortArray;", "maxOf-t1qELG4", "(S[S)S", "minOf", "minOf-J1ME1BU", "minOf-eb3DHEI", "minOf-Kr8caGY", "minOf-5PvTz6A", "minOf-WZ9TVnA", "minOf-sambcqE", "minOf-b33U2AM", "minOf-VKSA0NQ", "minOf-Md2H83M", "minOf-R03FKyM", "minOf-Wr6uiD8", "minOf-t1qELG4", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, xs = "kotlin/comparisons/UComparisonsKt")
/* loaded from: classes.dex */
public class UComparisonsKt___UComparisonsKt {
    @SinceKotlin(version = "1.5")
    /* renamed from: maxOf-5PvTz6A, reason: not valid java name */
    public static final short m1275maxOf5PvTz6A(short s5, short s9) {
        if (Intrinsics.compare(s5 & UShort.MAX_VALUE, 65535 & s9) >= 0) {
            return s5;
        }
        return s9;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: maxOf-J1ME1BU, reason: not valid java name */
    public static int m1276maxOfJ1ME1BU(int i10, int i11) {
        if (Integer.compare(i10 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i11) >= 0) {
            return i10;
        }
        return i11;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: maxOf-Kr8caGY, reason: not valid java name */
    public static final byte m1277maxOfKr8caGY(byte b10, byte b11) {
        if (Intrinsics.compare(b10 & UByte.MAX_VALUE, b11 & UByte.MAX_VALUE) >= 0) {
            return b10;
        }
        return b11;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-Md2H83M, reason: not valid java name */
    public static final int m1278maxOfMd2H83M(int i10, int... iArr) {
        iArr.getClass();
        int m251getSizeimpl = UIntArray.m251getSizeimpl(iArr);
        for (int i11 = 0; i11 < m251getSizeimpl; i11++) {
            i10 = m1276maxOfJ1ME1BU(i10, UIntArray.m250getpVg5ArA(iArr, i11));
        }
        return i10;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-R03FKyM, reason: not valid java name */
    public static final long m1279maxOfR03FKyM(long j10, long... jArr) {
        jArr.getClass();
        int m330getSizeimpl = ULongArray.m330getSizeimpl(jArr);
        for (int i10 = 0; i10 < m330getSizeimpl; i10++) {
            j10 = m1284maxOfeb3DHEI(j10, ULongArray.m329getsVKNKU(jArr, i10));
        }
        return j10;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: maxOf-VKSA0NQ, reason: not valid java name */
    private static final short m1280maxOfVKSA0NQ(short s5, short s9, short s10) {
        return m1275maxOf5PvTz6A(s5, m1275maxOf5PvTz6A(s9, s10));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: maxOf-WZ9TVnA, reason: not valid java name */
    private static final int m1281maxOfWZ9TVnA(int i10, int i11, int i12) {
        return m1276maxOfJ1ME1BU(i10, m1276maxOfJ1ME1BU(i11, i12));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-Wr6uiD8, reason: not valid java name */
    public static final byte m1282maxOfWr6uiD8(byte b10, byte... bArr) {
        bArr.getClass();
        int m172getSizeimpl = UByteArray.m172getSizeimpl(bArr);
        for (int i10 = 0; i10 < m172getSizeimpl; i10++) {
            b10 = m1277maxOfKr8caGY(b10, UByteArray.m171getw2LRezQ(bArr, i10));
        }
        return b10;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: maxOf-b33U2AM, reason: not valid java name */
    private static final byte m1283maxOfb33U2AM(byte b10, byte b11, byte b12) {
        return m1277maxOfKr8caGY(b10, m1277maxOfKr8caGY(b11, b12));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: maxOf-eb3DHEI, reason: not valid java name */
    public static long m1284maxOfeb3DHEI(long j10, long j11) {
        if (Long.compare(j10 ^ Long.MIN_VALUE, Long.MIN_VALUE ^ j11) >= 0) {
            return j10;
        }
        return j11;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: maxOf-sambcqE, reason: not valid java name */
    private static final long m1285maxOfsambcqE(long j10, long j11, long j12) {
        return m1284maxOfeb3DHEI(j10, m1284maxOfeb3DHEI(j11, j12));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-t1qELG4, reason: not valid java name */
    public static final short m1286maxOft1qELG4(short s5, short... sArr) {
        sArr.getClass();
        int m435getSizeimpl = UShortArray.m435getSizeimpl(sArr);
        for (int i10 = 0; i10 < m435getSizeimpl; i10++) {
            s5 = m1275maxOf5PvTz6A(s5, UShortArray.m434getMh2AYeg(sArr, i10));
        }
        return s5;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: minOf-5PvTz6A, reason: not valid java name */
    public static final short m1287minOf5PvTz6A(short s5, short s9) {
        if (Intrinsics.compare(s5 & UShort.MAX_VALUE, 65535 & s9) <= 0) {
            return s5;
        }
        return s9;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: minOf-J1ME1BU, reason: not valid java name */
    public static int m1288minOfJ1ME1BU(int i10, int i11) {
        if (Integer.compare(i10 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i11) <= 0) {
            return i10;
        }
        return i11;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: minOf-Kr8caGY, reason: not valid java name */
    public static final byte m1289minOfKr8caGY(byte b10, byte b11) {
        if (Intrinsics.compare(b10 & UByte.MAX_VALUE, b11 & UByte.MAX_VALUE) <= 0) {
            return b10;
        }
        return b11;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-Md2H83M, reason: not valid java name */
    public static final int m1290minOfMd2H83M(int i10, int... iArr) {
        iArr.getClass();
        int m251getSizeimpl = UIntArray.m251getSizeimpl(iArr);
        for (int i11 = 0; i11 < m251getSizeimpl; i11++) {
            i10 = m1288minOfJ1ME1BU(i10, UIntArray.m250getpVg5ArA(iArr, i11));
        }
        return i10;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-R03FKyM, reason: not valid java name */
    public static final long m1291minOfR03FKyM(long j10, long... jArr) {
        jArr.getClass();
        int m330getSizeimpl = ULongArray.m330getSizeimpl(jArr);
        for (int i10 = 0; i10 < m330getSizeimpl; i10++) {
            j10 = m1296minOfeb3DHEI(j10, ULongArray.m329getsVKNKU(jArr, i10));
        }
        return j10;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: minOf-VKSA0NQ, reason: not valid java name */
    private static final short m1292minOfVKSA0NQ(short s5, short s9, short s10) {
        return m1287minOf5PvTz6A(s5, m1287minOf5PvTz6A(s9, s10));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: minOf-WZ9TVnA, reason: not valid java name */
    private static final int m1293minOfWZ9TVnA(int i10, int i11, int i12) {
        return m1288minOfJ1ME1BU(i10, m1288minOfJ1ME1BU(i11, i12));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-Wr6uiD8, reason: not valid java name */
    public static final byte m1294minOfWr6uiD8(byte b10, byte... bArr) {
        bArr.getClass();
        int m172getSizeimpl = UByteArray.m172getSizeimpl(bArr);
        for (int i10 = 0; i10 < m172getSizeimpl; i10++) {
            b10 = m1289minOfKr8caGY(b10, UByteArray.m171getw2LRezQ(bArr, i10));
        }
        return b10;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: minOf-b33U2AM, reason: not valid java name */
    private static final byte m1295minOfb33U2AM(byte b10, byte b11, byte b12) {
        return m1289minOfKr8caGY(b10, m1289minOfKr8caGY(b11, b12));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: minOf-eb3DHEI, reason: not valid java name */
    public static long m1296minOfeb3DHEI(long j10, long j11) {
        if (Long.compare(j10 ^ Long.MIN_VALUE, Long.MIN_VALUE ^ j11) <= 0) {
            return j10;
        }
        return j11;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: minOf-sambcqE, reason: not valid java name */
    private static final long m1297minOfsambcqE(long j10, long j11, long j12) {
        return m1296minOfeb3DHEI(j10, m1296minOfeb3DHEI(j11, j12));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-t1qELG4, reason: not valid java name */
    public static final short m1298minOft1qELG4(short s5, short... sArr) {
        sArr.getClass();
        int m435getSizeimpl = UShortArray.m435getSizeimpl(sArr);
        for (int i10 = 0; i10 < m435getSizeimpl; i10++) {
            s5 = m1287minOf5PvTz6A(s5, UShortArray.m434getMh2AYeg(sArr, i10));
        }
        return s5;
    }
}
