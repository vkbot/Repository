package kotlin.collections;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u000b\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0010\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0015\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort-Aa5vz7o", "([SII)V", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "quickSort-oBK06Vg", "([III)V", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "quickSort--nroSd4", "([JII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-Aa5vz7o", "sortArray-oBK06Vg", "sortArray--nroSd4", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m550partitionnroSd4(long[] jArr, int i10, int i11) {
        long j10;
        long m329getsVKNKU = ULongArray.m329getsVKNKU(jArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                j10 = m329getsVKNKU ^ Long.MIN_VALUE;
                if (Long.compare(ULongArray.m329getsVKNKU(jArr, i10) ^ Long.MIN_VALUE, j10) >= 0) {
                    break;
                }
                i10++;
            }
            while (Long.compare(ULongArray.m329getsVKNKU(jArr, i11) ^ Long.MIN_VALUE, j10) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                long m329getsVKNKU2 = ULongArray.m329getsVKNKU(jArr, i10);
                ULongArray.m334setk8EXiF4(jArr, i10, ULongArray.m329getsVKNKU(jArr, i11));
                ULongArray.m334setk8EXiF4(jArr, i11, m329getsVKNKU2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m551partition4UcCI2c(byte[] bArr, int i10, int i11) {
        int i12;
        byte m171getw2LRezQ = UByteArray.m171getw2LRezQ(bArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                int m171getw2LRezQ2 = UByteArray.m171getw2LRezQ(bArr, i10) & UByte.MAX_VALUE;
                i12 = m171getw2LRezQ & UByte.MAX_VALUE;
                if (Intrinsics.compare(m171getw2LRezQ2, i12) >= 0) {
                    break;
                }
                i10++;
            }
            while (Intrinsics.compare(UByteArray.m171getw2LRezQ(bArr, i11) & UByte.MAX_VALUE, i12) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                byte m171getw2LRezQ3 = UByteArray.m171getw2LRezQ(bArr, i10);
                UByteArray.m176setVurrAj0(bArr, i10, UByteArray.m171getw2LRezQ(bArr, i11));
                UByteArray.m176setVurrAj0(bArr, i11, m171getw2LRezQ3);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m552partitionAa5vz7o(short[] sArr, int i10, int i11) {
        int i12;
        short m434getMh2AYeg = UShortArray.m434getMh2AYeg(sArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                int m434getMh2AYeg2 = UShortArray.m434getMh2AYeg(sArr, i10) & UShort.MAX_VALUE;
                i12 = m434getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(m434getMh2AYeg2, i12) >= 0) {
                    break;
                }
                i10++;
            }
            while (Intrinsics.compare(UShortArray.m434getMh2AYeg(sArr, i11) & UShort.MAX_VALUE, i12) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                short m434getMh2AYeg3 = UShortArray.m434getMh2AYeg(sArr, i10);
                UShortArray.m439set01HTLdE(sArr, i10, UShortArray.m434getMh2AYeg(sArr, i11));
                UShortArray.m439set01HTLdE(sArr, i11, m434getMh2AYeg3);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m553partitionoBK06Vg(int[] iArr, int i10, int i11) {
        int i12;
        int m250getpVg5ArA = UIntArray.m250getpVg5ArA(iArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                i12 = m250getpVg5ArA ^ Integer.MIN_VALUE;
                if (Integer.compare(UIntArray.m250getpVg5ArA(iArr, i10) ^ Integer.MIN_VALUE, i12) >= 0) {
                    break;
                }
                i10++;
            }
            while (Integer.compare(UIntArray.m250getpVg5ArA(iArr, i11) ^ Integer.MIN_VALUE, i12) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                int m250getpVg5ArA2 = UIntArray.m250getpVg5ArA(iArr, i10);
                UIntArray.m255setVXSXFK8(iArr, i10, UIntArray.m250getpVg5ArA(iArr, i11));
                UIntArray.m255setVXSXFK8(iArr, i11, m250getpVg5ArA2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m554quickSortnroSd4(long[] jArr, int i10, int i11) {
        int m550partitionnroSd4 = m550partitionnroSd4(jArr, i10, i11);
        int i12 = m550partitionnroSd4 - 1;
        if (i10 < i12) {
            m554quickSortnroSd4(jArr, i10, i12);
        }
        if (m550partitionnroSd4 < i11) {
            m554quickSortnroSd4(jArr, m550partitionnroSd4, i11);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m555quickSort4UcCI2c(byte[] bArr, int i10, int i11) {
        int m551partition4UcCI2c = m551partition4UcCI2c(bArr, i10, i11);
        int i12 = m551partition4UcCI2c - 1;
        if (i10 < i12) {
            m555quickSort4UcCI2c(bArr, i10, i12);
        }
        if (m551partition4UcCI2c < i11) {
            m555quickSort4UcCI2c(bArr, m551partition4UcCI2c, i11);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m556quickSortAa5vz7o(short[] sArr, int i10, int i11) {
        int m552partitionAa5vz7o = m552partitionAa5vz7o(sArr, i10, i11);
        int i12 = m552partitionAa5vz7o - 1;
        if (i10 < i12) {
            m556quickSortAa5vz7o(sArr, i10, i12);
        }
        if (m552partitionAa5vz7o < i11) {
            m556quickSortAa5vz7o(sArr, m552partitionAa5vz7o, i11);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m557quickSortoBK06Vg(int[] iArr, int i10, int i11) {
        int m553partitionoBK06Vg = m553partitionoBK06Vg(iArr, i10, i11);
        int i12 = m553partitionoBK06Vg - 1;
        if (i10 < i12) {
            m557quickSortoBK06Vg(iArr, i10, i12);
        }
        if (m553partitionoBK06Vg < i11) {
            m557quickSortoBK06Vg(iArr, m553partitionoBK06Vg, i11);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m558sortArraynroSd4(long[] jArr, int i10, int i11) {
        jArr.getClass();
        m554quickSortnroSd4(jArr, i10, i11 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m559sortArray4UcCI2c(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        m555quickSort4UcCI2c(bArr, i10, i11 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m560sortArrayAa5vz7o(short[] sArr, int i10, int i11) {
        sArr.getClass();
        m556quickSortAa5vz7o(sArr, i10, i11 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m561sortArrayoBK06Vg(int[] iArr, int i10, int i11) {
        iArr.getClass();
        m557quickSortoBK06Vg(iArr, i10, i11 - 1);
    }
}
