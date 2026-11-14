package kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import j1.i;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m1300differenceModuloWZ9TVnA(int i10, int i11, int i12) {
        long j10 = i12 & 4294967295L;
        int i13 = (int) ((i10 & 4294967295L) % j10);
        int i14 = (int) ((i11 & 4294967295L) % j10);
        int compare = Integer.compare(i13 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i14);
        int m190constructorimpl = UInt.m190constructorimpl(i13 - i14);
        if (compare >= 0) {
            return m190constructorimpl;
        }
        return UInt.m190constructorimpl(m190constructorimpl + i12);
    }

    /* renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m1301differenceModulosambcqE(long j10, long j11, long j12) {
        long j13;
        long j14 = 0;
        if (j12 < 0) {
            if ((j10 ^ Long.MIN_VALUE) >= (j12 ^ Long.MIN_VALUE)) {
                j10 -= j12;
            }
        } else if (j10 >= 0) {
            j10 %= j12;
        } else {
            long j15 = j10 - ((((j10 >>> 1) / j12) << 1) * j12);
            if ((j15 ^ Long.MIN_VALUE) >= (j12 ^ Long.MIN_VALUE)) {
                j13 = j12;
            } else {
                j13 = 0;
            }
            j10 = j15 - j13;
        }
        if (j12 < 0) {
            if ((j11 ^ Long.MIN_VALUE) >= (j12 ^ Long.MIN_VALUE)) {
                j11 -= j12;
            }
        } else if (j11 >= 0) {
            j11 %= j12;
        } else {
            long j16 = j11 - ((((j11 >>> 1) / j12) << 1) * j12);
            if ((j16 ^ Long.MIN_VALUE) >= (j12 ^ Long.MIN_VALUE)) {
                j14 = j12;
            }
            j11 = j16 - j14;
        }
        int compare = Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
        long m269constructorimpl = ULong.m269constructorimpl(j10 - j11);
        if (compare >= 0) {
            return m269constructorimpl;
        }
        return ULong.m269constructorimpl(m269constructorimpl + j12);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m1302getProgressionLastElement7ftBX0g(long j10, long j11, long j12) {
        if (j12 > 0) {
            if (Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) >= 0) {
                return j11;
            }
            return ULong.m269constructorimpl(j11 - m1301differenceModulosambcqE(j11, j10, ULong.m269constructorimpl(j12)));
        }
        if (j12 < 0) {
            if (Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) <= 0) {
                return j11;
            }
            return ULong.m269constructorimpl(j11 + m1301differenceModulosambcqE(j10, j11, ULong.m269constructorimpl(-j12)));
        }
        i.k("Step is zero.");
        return 0L;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m1303getProgressionLastElementNkh28Cs(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (Integer.compare(i10 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i11) < 0) {
                return UInt.m190constructorimpl(i11 - m1300differenceModuloWZ9TVnA(i11, i10, UInt.m190constructorimpl(i12)));
            }
        } else if (i12 < 0) {
            if (Integer.compare(i10 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i11) > 0) {
                return UInt.m190constructorimpl(i11 + m1300differenceModuloWZ9TVnA(i10, i11, UInt.m190constructorimpl(-i12)));
            }
        } else {
            i.k("Step is zero.");
            return 0;
        }
        return i11;
    }
}
