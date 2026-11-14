package kotlin.ranges;

import ai.onnxruntime.b;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import j1.i;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.URandomKt;
import kotlin.ranges.UIntProgression;
import kotlin.ranges.ULongProgression;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\u0005H\u0007\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\u0004*\u00020\u0005H\u0007\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u000bH\u0087\b¢\u0006\u0002\u0010\f\u001a\u0012\u0010\n\u001a\u00020\u0004*\u00020\rH\u0087\b¢\u0006\u0002\u0010\u000e\u001a\u0019\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\n\u001a\u00020\u0004*\u00020\r2\u0006\u0010\n\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u000bH\u0087\b\u001a\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0004*\u00020\rH\u0087\b\u001a\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000fH\u0007\u001a\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0004*\u00020\r2\u0006\u0010\n\u001a\u00020\u000fH\u0007\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0087\n¢\u0006\u0002\b\u0016\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0087\n¢\u0006\u0002\b\u0017\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b \u0010!\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\"H\u0087\u0002¢\u0006\u0004\b#\u0010$\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\r2\u0006\u0010\u0018\u001a\u00020\"H\u0087\u0002¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010'\u001a\u00020\u0002*\u00020\u00192\u0006\u0010(\u001a\u00020\u0019H\u0087\u0004¢\u0006\u0004\b)\u0010*\u001a\u001c\u0010'\u001a\u00020\u0002*\u00020\u00012\u0006\u0010(\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\b+\u0010,\u001a\u001c\u0010'\u001a\u00020\u0005*\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0087\u0004¢\u0006\u0004\b-\u0010.\u001a\u001c\u0010'\u001a\u00020\u0002*\u00020\"2\u0006\u0010(\u001a\u00020\"H\u0087\u0004¢\u0006\u0004\b/\u00100\u001a\f\u00101\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\f\u00101\u001a\u00020\u0005*\u00020\u0005H\u0007\u001a\u0015\u00102\u001a\u00020\u0002*\u00020\u00022\u0006\u00102\u001a\u000203H\u0087\u0004\u001a\u0015\u00102\u001a\u00020\u0005*\u00020\u00052\u0006\u00102\u001a\u000204H\u0087\u0004\u001a\u001c\u00105\u001a\u00020\u000b*\u00020\u00192\u0006\u0010(\u001a\u00020\u0019H\u0087\u0004¢\u0006\u0004\b6\u00107\u001a\u001c\u00105\u001a\u00020\u000b*\u00020\u00012\u0006\u0010(\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\b8\u00109\u001a\u001c\u00105\u001a\u00020\r*\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0087\u0004¢\u0006\u0004\b:\u0010;\u001a\u001c\u00105\u001a\u00020\u000b*\u00020\"2\u0006\u0010(\u001a\u00020\"H\u0087\u0004¢\u0006\u0004\b<\u0010=\u001a\u001b\u0010>\u001a\u00020\u0001*\u00020\u00012\u0006\u0010?\u001a\u00020\u0001H\u0007¢\u0006\u0004\b@\u0010A\u001a\u001b\u0010>\u001a\u00020\u0004*\u00020\u00042\u0006\u0010?\u001a\u00020\u0004H\u0007¢\u0006\u0004\bB\u0010C\u001a\u001b\u0010>\u001a\u00020\u0019*\u00020\u00192\u0006\u0010?\u001a\u00020\u0019H\u0007¢\u0006\u0004\bD\u0010E\u001a\u001b\u0010>\u001a\u00020\"*\u00020\"2\u0006\u0010?\u001a\u00020\"H\u0007¢\u0006\u0004\bF\u0010G\u001a\u001b\u0010H\u001a\u00020\u0001*\u00020\u00012\u0006\u0010I\u001a\u00020\u0001H\u0007¢\u0006\u0004\bJ\u0010A\u001a\u001b\u0010H\u001a\u00020\u0004*\u00020\u00042\u0006\u0010I\u001a\u00020\u0004H\u0007¢\u0006\u0004\bK\u0010C\u001a\u001b\u0010H\u001a\u00020\u0019*\u00020\u00192\u0006\u0010I\u001a\u00020\u0019H\u0007¢\u0006\u0004\bL\u0010E\u001a\u001b\u0010H\u001a\u00020\"*\u00020\"2\u0006\u0010I\u001a\u00020\"H\u0007¢\u0006\u0004\bM\u0010G\u001a#\u0010N\u001a\u00020\u0001*\u00020\u00012\u0006\u0010?\u001a\u00020\u00012\u0006\u0010I\u001a\u00020\u0001H\u0007¢\u0006\u0004\bO\u0010P\u001a#\u0010N\u001a\u00020\u0004*\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0004H\u0007¢\u0006\u0004\bQ\u0010R\u001a#\u0010N\u001a\u00020\u0019*\u00020\u00192\u0006\u0010?\u001a\u00020\u00192\u0006\u0010I\u001a\u00020\u0019H\u0007¢\u0006\u0004\bS\u0010T\u001a#\u0010N\u001a\u00020\"*\u00020\"2\u0006\u0010?\u001a\u00020\"2\u0006\u0010I\u001a\u00020\"H\u0007¢\u0006\u0004\bU\u0010V\u001a!\u0010N\u001a\u00020\u0001*\u00020\u00012\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00010XH\u0007¢\u0006\u0004\bY\u0010Z\u001a!\u0010N\u001a\u00020\u0004*\u00020\u00042\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00040XH\u0007¢\u0006\u0004\b[\u0010\\¨\u0006]"}, d2 = {"first", "Lkotlin/UInt;", "Lkotlin/ranges/UIntProgression;", "(Lkotlin/ranges/UIntProgression;)I", "Lkotlin/ULong;", "Lkotlin/ranges/ULongProgression;", "(Lkotlin/ranges/ULongProgression;)J", "firstOrNull", "last", "lastOrNull", "random", "Lkotlin/ranges/UIntRange;", "(Lkotlin/ranges/UIntRange;)I", "Lkotlin/ranges/ULongRange;", "(Lkotlin/ranges/ULongRange;)J", "Lkotlin/random/Random;", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)I", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)J", "randomOrNull", "contains", "", "element", "contains-biwQdVI", "contains-GYNo2lE", "value", "Lkotlin/UByte;", "contains-68kG9v0", "(Lkotlin/ranges/UIntRange;B)Z", "contains-ULb-yJY", "(Lkotlin/ranges/ULongRange;B)Z", "contains-Gab390E", "(Lkotlin/ranges/ULongRange;I)Z", "contains-fz5IDCE", "(Lkotlin/ranges/UIntRange;J)Z", "Lkotlin/UShort;", "contains-ZsK3CEQ", "(Lkotlin/ranges/UIntRange;S)Z", "contains-uhHAxoY", "(Lkotlin/ranges/ULongRange;S)Z", "downTo", TypedValues.TransitionType.S_TO, "downTo-Kr8caGY", "(BB)Lkotlin/ranges/UIntProgression;", "downTo-J1ME1BU", "(II)Lkotlin/ranges/UIntProgression;", "downTo-eb3DHEI", "(JJ)Lkotlin/ranges/ULongProgression;", "downTo-5PvTz6A", "(SS)Lkotlin/ranges/UIntProgression;", "reversed", "step", "", "", "until", "until-Kr8caGY", "(BB)Lkotlin/ranges/UIntRange;", "until-J1ME1BU", "(II)Lkotlin/ranges/UIntRange;", "until-eb3DHEI", "(JJ)Lkotlin/ranges/ULongRange;", "until-5PvTz6A", "(SS)Lkotlin/ranges/UIntRange;", "coerceAtLeast", "minimumValue", "coerceAtLeast-J1ME1BU", "(II)I", "coerceAtLeast-eb3DHEI", "(JJ)J", "coerceAtLeast-Kr8caGY", "(BB)B", "coerceAtLeast-5PvTz6A", "(SS)S", "coerceAtMost", "maximumValue", "coerceAtMost-J1ME1BU", "coerceAtMost-eb3DHEI", "coerceAtMost-Kr8caGY", "coerceAtMost-5PvTz6A", "coerceIn", "coerceIn-WZ9TVnA", "(III)I", "coerceIn-sambcqE", "(JJJ)J", "coerceIn-b33U2AM", "(BBB)B", "coerceIn-VKSA0NQ", "(SSS)S", "range", "Lkotlin/ranges/ClosedRange;", "coerceIn-wuiCnnA", "(ILkotlin/ranges/ClosedRange;)I", "coerceIn-JPwROB0", "(JLkotlin/ranges/ClosedRange;)J", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, xs = "kotlin/ranges/URangesKt")
/* loaded from: classes.dex */
public class URangesKt___URangesKt {
    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtLeast-5PvTz6A, reason: not valid java name */
    public static final short m1335coerceAtLeast5PvTz6A(short s5, short s9) {
        if (Intrinsics.compare(s5 & UShort.MAX_VALUE, 65535 & s9) < 0) {
            return s9;
        }
        return s5;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtLeast-J1ME1BU, reason: not valid java name */
    public static final int m1336coerceAtLeastJ1ME1BU(int i10, int i11) {
        if (Integer.compare(i10 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i11) < 0) {
            return i11;
        }
        return i10;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtLeast-Kr8caGY, reason: not valid java name */
    public static final byte m1337coerceAtLeastKr8caGY(byte b10, byte b11) {
        if (Intrinsics.compare(b10 & UByte.MAX_VALUE, b11 & UByte.MAX_VALUE) < 0) {
            return b11;
        }
        return b10;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtLeast-eb3DHEI, reason: not valid java name */
    public static final long m1338coerceAtLeasteb3DHEI(long j10, long j11) {
        if (Long.compare(j10 ^ Long.MIN_VALUE, Long.MIN_VALUE ^ j11) < 0) {
            return j11;
        }
        return j10;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtMost-5PvTz6A, reason: not valid java name */
    public static final short m1339coerceAtMost5PvTz6A(short s5, short s9) {
        if (Intrinsics.compare(s5 & UShort.MAX_VALUE, 65535 & s9) > 0) {
            return s9;
        }
        return s5;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtMost-J1ME1BU, reason: not valid java name */
    public static final int m1340coerceAtMostJ1ME1BU(int i10, int i11) {
        if (Integer.compare(i10 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i11) > 0) {
            return i11;
        }
        return i10;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtMost-Kr8caGY, reason: not valid java name */
    public static final byte m1341coerceAtMostKr8caGY(byte b10, byte b11) {
        if (Intrinsics.compare(b10 & UByte.MAX_VALUE, b11 & UByte.MAX_VALUE) > 0) {
            return b11;
        }
        return b10;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceAtMost-eb3DHEI, reason: not valid java name */
    public static final long m1342coerceAtMosteb3DHEI(long j10, long j11) {
        if (Long.compare(j10 ^ Long.MIN_VALUE, Long.MIN_VALUE ^ j11) > 0) {
            return j11;
        }
        return j10;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-JPwROB0, reason: not valid java name */
    public static final long m1343coerceInJPwROB0(long j10, ClosedRange<ULong> closedRange) {
        closedRange.getClass();
        if (closedRange instanceof ClosedFloatingPointRange) {
            return ((ULong) RangesKt___RangesKt.coerceIn(ULong.m263boximpl(j10), (ClosedFloatingPointRange<ULong>) closedRange)).getData();
        }
        if (!closedRange.isEmpty()) {
            long j11 = j10 ^ Long.MIN_VALUE;
            if (Long.compare(j11, closedRange.getStart().getData() ^ Long.MIN_VALUE) < 0) {
                return closedRange.getStart().getData();
            }
            if (Long.compare(j11, closedRange.getEndInclusive().getData() ^ Long.MIN_VALUE) > 0) {
                return closedRange.getEndInclusive().getData();
            }
            return j10;
        }
        i.f(closedRange, "Cannot coerce value to an empty range: ");
        return 0L;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-VKSA0NQ, reason: not valid java name */
    public static final short m1344coerceInVKSA0NQ(short s5, short s9, short s10) {
        int i10 = s9 & UShort.MAX_VALUE;
        int i11 = s10 & UShort.MAX_VALUE;
        if (Intrinsics.compare(i10, i11) <= 0) {
            int i12 = 65535 & s5;
            if (Intrinsics.compare(i12, i10) < 0) {
                return s9;
            }
            if (Intrinsics.compare(i12, i11) > 0) {
                return s10;
            }
            return s5;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append((Object) UShort.m420toStringimpl(s10));
        i.j(sb, UShort.m420toStringimpl(s9));
        return (short) 0;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-WZ9TVnA, reason: not valid java name */
    public static final int m1345coerceInWZ9TVnA(int i10, int i11, int i12) {
        int i13 = i11 ^ Integer.MIN_VALUE;
        int i14 = i12 ^ Integer.MIN_VALUE;
        if (Integer.compare(i13, i14) <= 0) {
            int i15 = Integer.MIN_VALUE ^ i10;
            if (Integer.compare(i15, i13) < 0) {
                return i11;
            }
            if (Integer.compare(i15, i14) > 0) {
                return i12;
            }
            return i10;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append((Object) UInt.m236toStringimpl(i12));
        i.j(sb, UInt.m236toStringimpl(i11));
        return 0;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-b33U2AM, reason: not valid java name */
    public static final byte m1346coerceInb33U2AM(byte b10, byte b11, byte b12) {
        int i10 = b11 & UByte.MAX_VALUE;
        int i11 = b12 & UByte.MAX_VALUE;
        if (Intrinsics.compare(i10, i11) <= 0) {
            int i12 = b10 & UByte.MAX_VALUE;
            if (Intrinsics.compare(i12, i10) < 0) {
                return b11;
            }
            if (Intrinsics.compare(i12, i11) > 0) {
                return b12;
            }
            return b10;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append((Object) UByte.m157toStringimpl(b12));
        i.j(sb, UByte.m157toStringimpl(b11));
        return (byte) 0;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-sambcqE, reason: not valid java name */
    public static final long m1347coerceInsambcqE(long j10, long j11, long j12) {
        long j13 = j11 ^ Long.MIN_VALUE;
        long j14 = j12 ^ Long.MIN_VALUE;
        if (Long.compare(j13, j14) <= 0) {
            long j15 = Long.MIN_VALUE ^ j10;
            if (Long.compare(j15, j13) < 0) {
                return j11;
            }
            if (Long.compare(j15, j14) > 0) {
                return j12;
            }
            return j10;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append((Object) ULong.m315toStringimpl(j12));
        i.j(sb, ULong.m315toStringimpl(j11));
        return 0L;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: coerceIn-wuiCnnA, reason: not valid java name */
    public static final int m1348coerceInwuiCnnA(int i10, ClosedRange<UInt> closedRange) {
        closedRange.getClass();
        if (closedRange instanceof ClosedFloatingPointRange) {
            return ((UInt) RangesKt___RangesKt.coerceIn(UInt.m184boximpl(i10), (ClosedFloatingPointRange<UInt>) closedRange)).getData();
        }
        if (!closedRange.isEmpty()) {
            int i11 = i10 ^ Integer.MIN_VALUE;
            if (Integer.compare(i11, closedRange.getStart().getData() ^ Integer.MIN_VALUE) < 0) {
                return closedRange.getStart().getData();
            }
            if (Integer.compare(i11, closedRange.getEndInclusive().getData() ^ Integer.MIN_VALUE) > 0) {
                return closedRange.getEndInclusive().getData();
            }
            return i10;
        }
        i.f(closedRange, "Cannot coerce value to an empty range: ");
        return 0;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-68kG9v0, reason: not valid java name */
    public static final boolean m1349contains68kG9v0(UIntRange uIntRange, byte b10) {
        uIntRange.getClass();
        return uIntRange.m1322containsWZ4Q5Ns(UInt.m190constructorimpl(b10 & UByte.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: contains-GYNo2lE, reason: not valid java name */
    private static final boolean m1350containsGYNo2lE(ULongRange uLongRange, ULong uLong) {
        uLongRange.getClass();
        if (uLong != null && uLongRange.m1331containsVKZWuLQ(uLong.getData())) {
            return true;
        }
        return false;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-Gab390E, reason: not valid java name */
    public static final boolean m1351containsGab390E(ULongRange uLongRange, int i10) {
        uLongRange.getClass();
        return uLongRange.m1331containsVKZWuLQ(ULong.m269constructorimpl(i10 & 4294967295L));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-ULb-yJY, reason: not valid java name */
    public static final boolean m1352containsULbyJY(ULongRange uLongRange, byte b10) {
        uLongRange.getClass();
        return uLongRange.m1331containsVKZWuLQ(ULong.m269constructorimpl(b10 & 255));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-ZsK3CEQ, reason: not valid java name */
    public static final boolean m1353containsZsK3CEQ(UIntRange uIntRange, short s5) {
        uIntRange.getClass();
        return uIntRange.m1322containsWZ4Q5Ns(UInt.m190constructorimpl(s5 & UShort.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: contains-biwQdVI, reason: not valid java name */
    private static final boolean m1354containsbiwQdVI(UIntRange uIntRange, UInt uInt) {
        uIntRange.getClass();
        if (uInt != null && uIntRange.m1322containsWZ4Q5Ns(uInt.getData())) {
            return true;
        }
        return false;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-fz5IDCE, reason: not valid java name */
    public static final boolean m1355containsfz5IDCE(UIntRange uIntRange, long j10) {
        uIntRange.getClass();
        if (ULong.m269constructorimpl(j10 >>> 32) == 0 && uIntRange.m1322containsWZ4Q5Ns(UInt.m190constructorimpl((int) j10))) {
            return true;
        }
        return false;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: contains-uhHAxoY, reason: not valid java name */
    public static final boolean m1356containsuhHAxoY(ULongRange uLongRange, short s5) {
        uLongRange.getClass();
        return uLongRange.m1331containsVKZWuLQ(ULong.m269constructorimpl(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: downTo-5PvTz6A, reason: not valid java name */
    public static final UIntProgression m1357downTo5PvTz6A(short s5, short s9) {
        return UIntProgression.INSTANCE.m1319fromClosedRangeNkh28Cs(UInt.m190constructorimpl(s5 & UShort.MAX_VALUE), UInt.m190constructorimpl(s9 & UShort.MAX_VALUE), -1);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: downTo-J1ME1BU, reason: not valid java name */
    public static final UIntProgression m1358downToJ1ME1BU(int i10, int i11) {
        return UIntProgression.INSTANCE.m1319fromClosedRangeNkh28Cs(i10, i11, -1);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: downTo-Kr8caGY, reason: not valid java name */
    public static final UIntProgression m1359downToKr8caGY(byte b10, byte b11) {
        return UIntProgression.INSTANCE.m1319fromClosedRangeNkh28Cs(UInt.m190constructorimpl(b10 & UByte.MAX_VALUE), UInt.m190constructorimpl(b11 & UByte.MAX_VALUE), -1);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: downTo-eb3DHEI, reason: not valid java name */
    public static final ULongProgression m1360downToeb3DHEI(long j10, long j11) {
        return ULongProgression.INSTANCE.m1328fromClosedRange7ftBX0g(j10, j11, -1L);
    }

    @SinceKotlin(version = "1.7")
    public static final long first(ULongProgression uLongProgression) {
        uLongProgression.getClass();
        if (!uLongProgression.isEmpty()) {
            return uLongProgression.getFirst();
        }
        b.r(uLongProgression, "Progression ", " is empty.");
        return 0L;
    }

    @SinceKotlin(version = "1.7")
    public static final UInt firstOrNull(UIntProgression uIntProgression) {
        uIntProgression.getClass();
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.m184boximpl(uIntProgression.getFirst());
    }

    @SinceKotlin(version = "1.7")
    public static final long last(ULongProgression uLongProgression) {
        uLongProgression.getClass();
        if (!uLongProgression.isEmpty()) {
            return uLongProgression.getLast();
        }
        b.r(uLongProgression, "Progression ", " is empty.");
        return 0L;
    }

    @SinceKotlin(version = "1.7")
    public static final UInt lastOrNull(UIntProgression uIntProgression) {
        uIntProgression.getClass();
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.m184boximpl(uIntProgression.getLast());
    }

    @SinceKotlin(version = "1.5")
    public static final long random(ULongRange uLongRange, Random random) {
        uLongRange.getClass();
        random.getClass();
        try {
            return URandomKt.nextULong(random, uLongRange);
        } catch (IllegalArgumentException e) {
            i.g(e.getMessage());
            return 0L;
        }
    }

    @SinceKotlin(version = "1.5")
    public static final UInt randomOrNull(UIntRange uIntRange, Random random) {
        uIntRange.getClass();
        random.getClass();
        if (uIntRange.isEmpty()) {
            return null;
        }
        return UInt.m184boximpl(URandomKt.nextUInt(random, uIntRange));
    }

    @SinceKotlin(version = "1.5")
    public static final UIntProgression reversed(UIntProgression uIntProgression) {
        uIntProgression.getClass();
        return UIntProgression.INSTANCE.m1319fromClosedRangeNkh28Cs(uIntProgression.getLast(), uIntProgression.getFirst(), -uIntProgression.getStep());
    }

    @SinceKotlin(version = "1.5")
    public static final ULongProgression step(ULongProgression uLongProgression, long j10) {
        boolean z9;
        uLongProgression.getClass();
        if (j10 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        RangesKt__RangesKt.checkStepIsPositive(z9, Long.valueOf(j10));
        ULongProgression.Companion companion = ULongProgression.INSTANCE;
        long first = uLongProgression.getFirst();
        long last = uLongProgression.getLast();
        if (uLongProgression.getStep() <= 0) {
            j10 = -j10;
        }
        return companion.m1328fromClosedRange7ftBX0g(first, last, j10);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: until-5PvTz6A, reason: not valid java name */
    public static final UIntRange m1361until5PvTz6A(short s5, short s9) {
        if (Intrinsics.compare(s9 & UShort.MAX_VALUE, 0) <= 0) {
            return UIntRange.INSTANCE.getEMPTY();
        }
        return new UIntRange(UInt.m190constructorimpl(s5 & UShort.MAX_VALUE), UInt.m190constructorimpl(UInt.m190constructorimpl(r3) - 1), null);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: until-J1ME1BU, reason: not valid java name */
    public static UIntRange m1362untilJ1ME1BU(int i10, int i11) {
        if (Integer.compare(i11 ^ Integer.MIN_VALUE, Integer.MIN_VALUE) <= 0) {
            return UIntRange.INSTANCE.getEMPTY();
        }
        return new UIntRange(i10, UInt.m190constructorimpl(i11 - 1), null);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: until-Kr8caGY, reason: not valid java name */
    public static final UIntRange m1363untilKr8caGY(byte b10, byte b11) {
        if (Intrinsics.compare(b11 & UByte.MAX_VALUE, 0) <= 0) {
            return UIntRange.INSTANCE.getEMPTY();
        }
        return new UIntRange(UInt.m190constructorimpl(b10 & UByte.MAX_VALUE), UInt.m190constructorimpl(UInt.m190constructorimpl(r3) - 1), null);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: until-eb3DHEI, reason: not valid java name */
    public static ULongRange m1364untileb3DHEI(long j10, long j11) {
        if (Long.compare(j11 ^ Long.MIN_VALUE, Long.MIN_VALUE) <= 0) {
            return ULongRange.INSTANCE.getEMPTY();
        }
        return new ULongRange(j10, ULong.m269constructorimpl(j11 - ULong.m269constructorimpl(1 & 4294967295L)), null);
    }

    @SinceKotlin(version = "1.7")
    public static final ULong firstOrNull(ULongProgression uLongProgression) {
        uLongProgression.getClass();
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.m263boximpl(uLongProgression.getFirst());
    }

    @SinceKotlin(version = "1.7")
    public static final ULong lastOrNull(ULongProgression uLongProgression) {
        uLongProgression.getClass();
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.m263boximpl(uLongProgression.getLast());
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long random(ULongRange uLongRange) {
        uLongRange.getClass();
        return random(uLongRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.5")
    public static final int random(UIntRange uIntRange, Random random) {
        uIntRange.getClass();
        random.getClass();
        try {
            return URandomKt.nextUInt(random, uIntRange);
        } catch (IllegalArgumentException e) {
            i.g(e.getMessage());
            return 0;
        }
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final ULong randomOrNull(ULongRange uLongRange) {
        uLongRange.getClass();
        return randomOrNull(uLongRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.5")
    public static final ULongProgression reversed(ULongProgression uLongProgression) {
        uLongProgression.getClass();
        return ULongProgression.INSTANCE.m1328fromClosedRange7ftBX0g(uLongProgression.getLast(), uLongProgression.getFirst(), -uLongProgression.getStep());
    }

    @SinceKotlin(version = "1.7")
    public static final int first(UIntProgression uIntProgression) {
        uIntProgression.getClass();
        if (!uIntProgression.isEmpty()) {
            return uIntProgression.getFirst();
        }
        b.r(uIntProgression, "Progression ", " is empty.");
        return 0;
    }

    @SinceKotlin(version = "1.7")
    public static final int last(UIntProgression uIntProgression) {
        uIntProgression.getClass();
        if (!uIntProgression.isEmpty()) {
            return uIntProgression.getLast();
        }
        b.r(uIntProgression, "Progression ", " is empty.");
        return 0;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final UInt randomOrNull(UIntRange uIntRange) {
        uIntRange.getClass();
        return randomOrNull(uIntRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int random(UIntRange uIntRange) {
        uIntRange.getClass();
        return random(uIntRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.5")
    public static final ULong randomOrNull(ULongRange uLongRange, Random random) {
        uLongRange.getClass();
        random.getClass();
        if (uLongRange.isEmpty()) {
            return null;
        }
        return ULong.m263boximpl(URandomKt.nextULong(random, uLongRange));
    }

    @SinceKotlin(version = "1.5")
    public static final UIntProgression step(UIntProgression uIntProgression, int i10) {
        uIntProgression.getClass();
        RangesKt__RangesKt.checkStepIsPositive(i10 > 0, Integer.valueOf(i10));
        UIntProgression.Companion companion = UIntProgression.INSTANCE;
        int first = uIntProgression.getFirst();
        int last = uIntProgression.getLast();
        if (uIntProgression.getStep() <= 0) {
            i10 = -i10;
        }
        return companion.m1319fromClosedRangeNkh28Cs(first, last, i10);
    }
}
