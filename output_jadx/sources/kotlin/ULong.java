package kotlin;

import ai.onnxruntime.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ULongRange;
import kotlin.ranges.URangesKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@SinceKotlin(version = "1.5")
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 {2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001{B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b \u0010\u0018J\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b!\u0010\u001aJ\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\"\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b#\u0010\u001eJ\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b%\u0010\u0018J\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b&\u0010\u001aJ\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b'\u0010\u001cJ\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b(\u0010\u001eJ\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b*\u0010\u0018J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b+\u0010\u001aJ\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b,\u0010\u001cJ\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b-\u0010\u001eJ\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b/\u0010\u0018J\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b0\u0010\u001aJ\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b1\u0010\u001cJ\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b2\u0010\u001eJ\u0018\u00103\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b4\u0010\u0018J\u0018\u00103\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b5\u0010\u001aJ\u0018\u00103\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b6\u0010\u001cJ\u0018\u00103\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b7\u0010\u001eJ\u0018\u00108\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b9\u0010:J\u0018\u00108\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b;\u0010<J\u0018\u00108\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b=\u0010\u0013J\u0018\u00108\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b>\u0010\u001eJ\u0010\u0010?\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b@\u0010\u0005J\u0010\u0010A\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bB\u0010\u0005J\u0018\u0010C\u001a\u00020D2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bE\u0010FJ\u0018\u0010G\u001a\u00020D2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bH\u0010FJ\u0018\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\tH\u0087\f¢\u0006\u0004\bK\u0010\u001cJ\u0018\u0010L\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\tH\u0087\f¢\u0006\u0004\bM\u0010\u001cJ\u0018\u0010N\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bO\u0010\u001eJ\u0018\u0010P\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bQ\u0010\u001eJ\u0018\u0010R\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bS\u0010\u001eJ\u0010\u0010T\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bU\u0010\u0005J\u0010\u0010V\u001a\u00020WH\u0087\b¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020[H\u0087\b¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\tH\u0087\b¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bb\u0010\u0005J\u0010\u0010c\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\bd\u0010YJ\u0010\u0010e\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\bf\u0010]J\u0010\u0010g\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\bh\u0010`J\u0010\u0010i\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bj\u0010\u0005J\u0010\u0010k\u001a\u00020lH\u0087\b¢\u0006\u0004\bm\u0010nJ\u0010\u0010o\u001a\u00020pH\u0087\b¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020tH\u0016¢\u0006\u0004\bu\u0010vJ\u0013\u0010w\u001a\u00020x2\b\u0010\n\u001a\u0004\u0018\u00010yHÖ\u0003J\t\u0010z\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006|"}, d2 = {"Lkotlin/ULong;", "", "data", "", "constructor-impl", "(J)J", "getData$annotations", "()V", "compareTo", "", "other", "Lkotlin/UByte;", "compareTo-7apg3OU", "(JB)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(JS)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(JI)I", "compareTo-VKZWuLQ", "(JJ)I", "plus", "plus-7apg3OU", "(JB)J", "plus-xj2QHRw", "(JS)J", "plus-WZ4Q5Ns", "(JI)J", "plus-VKZWuLQ", "(JJ)J", "minus", "minus-7apg3OU", "minus-xj2QHRw", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "times", "times-7apg3OU", "times-xj2QHRw", "times-WZ4Q5Ns", "times-VKZWuLQ", "div", "div-7apg3OU", "div-xj2QHRw", "div-WZ4Q5Ns", "div-VKZWuLQ", "rem", "rem-7apg3OU", "rem-xj2QHRw", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "floorDiv", "floorDiv-7apg3OU", "floorDiv-xj2QHRw", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "mod", "mod-7apg3OU", "(JB)B", "mod-xj2QHRw", "(JS)S", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "inc", "inc-s-VKNKU", "dec", "dec-s-VKNKU", "rangeTo", "Lkotlin/ranges/ULongRange;", "rangeTo-VKZWuLQ", "(JJ)Lkotlin/ranges/ULongRange;", "rangeUntil", "rangeUntil-VKZWuLQ", "shl", "bitCount", "shl-s-VKNKU", "shr", "shr-s-VKNKU", "and", "and-VKZWuLQ", "or", "or-VKZWuLQ", "xor", "xor-VKZWuLQ", "inv", "inv-s-VKNKU", "toByte", "", "toByte-impl", "(J)B", "toShort", "", "toShort-impl", "(J)S", "toInt", "toInt-impl", "(J)I", "toLong", "toLong-impl", "toUByte", "toUByte-w2LRezQ", "toUShort", "toUShort-Mh2AYeg", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toFloat", "", "toFloat-impl", "(J)F", "toDouble", "", "toDouble-impl", "(J)D", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "equals", "", "", "hashCode", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes.dex */
public final class ULong implements Comparable<ULong> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long MAX_VALUE = -1;
    public static final long MIN_VALUE = 0;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;
    private final long data;

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ ULong(long j10) {
        this.data = j10;
    }

    @InlineOnly
    /* renamed from: and-VKZWuLQ */
    private static final long m262andVKZWuLQ(long j10, long j11) {
        return m269constructorimpl(j10 & j11);
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ ULong m263boximpl(long j10) {
        return new ULong(j10);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    private static final int m264compareTo7apg3OU(long j10, byte b10) {
        return Long.compare(j10 ^ Long.MIN_VALUE, m269constructorimpl(b10 & 255) ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    private int m265compareToVKZWuLQ(long j10) {
        return UnsignedKt.ulongCompare(getData(), j10);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns */
    private static final int m267compareToWZ4Q5Ns(long j10, int i10) {
        return Long.compare(j10 ^ Long.MIN_VALUE, m269constructorimpl(i10 & 4294967295L) ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw */
    private static final int m268compareToxj2QHRw(long j10, short s5) {
        return Long.compare(j10 ^ Long.MIN_VALUE, m269constructorimpl(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX) ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: dec-s-VKNKU */
    private static final long m270decsVKNKU(long j10) {
        return m269constructorimpl(j10 - 1);
    }

    @InlineOnly
    /* renamed from: div-7apg3OU */
    private static final long m271div7apg3OU(long j10, byte b10) {
        long m269constructorimpl = m269constructorimpl(b10 & 255);
        if (m269constructorimpl < 0) {
            if ((j10 ^ Long.MIN_VALUE) < (m269constructorimpl ^ Long.MIN_VALUE)) {
                return 0L;
            }
            return 1L;
        }
        if (j10 >= 0) {
            return j10 / m269constructorimpl;
        }
        int i10 = 1;
        long j11 = ((j10 >>> 1) / m269constructorimpl) << 1;
        if (((j10 - (j11 * m269constructorimpl)) ^ Long.MIN_VALUE) < (m269constructorimpl ^ Long.MIN_VALUE)) {
            i10 = 0;
        }
        return j11 + i10;
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ */
    private static final long m272divVKZWuLQ(long j10, long j11) {
        return UnsignedKt.m448ulongDivideeb3DHEI(j10, j11);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns */
    private static final long m273divWZ4Q5Ns(long j10, int i10) {
        long m269constructorimpl = m269constructorimpl(i10 & 4294967295L);
        if (m269constructorimpl < 0) {
            if ((j10 ^ Long.MIN_VALUE) < (m269constructorimpl ^ Long.MIN_VALUE)) {
                return 0L;
            }
            return 1L;
        }
        if (j10 >= 0) {
            return j10 / m269constructorimpl;
        }
        int i11 = 1;
        long j11 = ((j10 >>> 1) / m269constructorimpl) << 1;
        if (((j10 - (j11 * m269constructorimpl)) ^ Long.MIN_VALUE) < (m269constructorimpl ^ Long.MIN_VALUE)) {
            i11 = 0;
        }
        return j11 + i11;
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw */
    private static final long m274divxj2QHRw(long j10, short s5) {
        long m269constructorimpl = m269constructorimpl(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        if (m269constructorimpl < 0) {
            if ((j10 ^ Long.MIN_VALUE) < (m269constructorimpl ^ Long.MIN_VALUE)) {
                return 0L;
            }
            return 1L;
        }
        if (j10 >= 0) {
            return j10 / m269constructorimpl;
        }
        int i10 = 1;
        long j11 = ((j10 >>> 1) / m269constructorimpl) << 1;
        if (((j10 - (j11 * m269constructorimpl)) ^ Long.MIN_VALUE) < (m269constructorimpl ^ Long.MIN_VALUE)) {
            i10 = 0;
        }
        return j11 + i10;
    }

    /* renamed from: equals-impl */
    public static boolean m275equalsimpl(long j10, Object obj) {
        if (!(obj instanceof ULong) || j10 != ((ULong) obj).getData()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0 */
    public static final boolean m276equalsimpl0(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU */
    private static final long m277floorDiv7apg3OU(long j10, byte b10) {
        long m269constructorimpl = m269constructorimpl(b10 & 255);
        if (m269constructorimpl < 0) {
            if ((j10 ^ Long.MIN_VALUE) < (m269constructorimpl ^ Long.MIN_VALUE)) {
                return 0L;
            }
            return 1L;
        }
        if (j10 >= 0) {
            return j10 / m269constructorimpl;
        }
        int i10 = 1;
        long j11 = ((j10 >>> 1) / m269constructorimpl) << 1;
        if (((j10 - (j11 * m269constructorimpl)) ^ Long.MIN_VALUE) < (m269constructorimpl ^ Long.MIN_VALUE)) {
            i10 = 0;
        }
        return j11 + i10;
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ */
    private static final long m278floorDivVKZWuLQ(long j10, long j11) {
        if (j11 < 0) {
            if ((j10 ^ Long.MIN_VALUE) < (j11 ^ Long.MIN_VALUE)) {
                return 0L;
            }
            return 1L;
        }
        if (j10 >= 0) {
            return j10 / j11;
        }
        int i10 = 1;
        long j12 = ((j10 >>> 1) / j11) << 1;
        if (((j10 - (j12 * j11)) ^ Long.MIN_VALUE) < (j11 ^ Long.MIN_VALUE)) {
            i10 = 0;
        }
        return j12 + i10;
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns */
    private static final long m279floorDivWZ4Q5Ns(long j10, int i10) {
        long m269constructorimpl = m269constructorimpl(i10 & 4294967295L);
        if (m269constructorimpl < 0) {
            if ((j10 ^ Long.MIN_VALUE) < (m269constructorimpl ^ Long.MIN_VALUE)) {
                return 0L;
            }
            return 1L;
        }
        if (j10 >= 0) {
            return j10 / m269constructorimpl;
        }
        int i11 = 1;
        long j11 = ((j10 >>> 1) / m269constructorimpl) << 1;
        if (((j10 - (j11 * m269constructorimpl)) ^ Long.MIN_VALUE) < (m269constructorimpl ^ Long.MIN_VALUE)) {
            i11 = 0;
        }
        return j11 + i11;
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw */
    private static final long m280floorDivxj2QHRw(long j10, short s5) {
        long m269constructorimpl = m269constructorimpl(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        if (m269constructorimpl < 0) {
            if ((j10 ^ Long.MIN_VALUE) < (m269constructorimpl ^ Long.MIN_VALUE)) {
                return 0L;
            }
            return 1L;
        }
        if (j10 >= 0) {
            return j10 / m269constructorimpl;
        }
        int i10 = 1;
        long j11 = ((j10 >>> 1) / m269constructorimpl) << 1;
        if (((j10 - (j11 * m269constructorimpl)) ^ Long.MIN_VALUE) < (m269constructorimpl ^ Long.MIN_VALUE)) {
            i10 = 0;
        }
        return j11 + i10;
    }

    /* renamed from: hashCode-impl */
    public static int m281hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    @InlineOnly
    /* renamed from: inc-s-VKNKU */
    private static final long m282incsVKNKU(long j10) {
        return m269constructorimpl(j10 + 1);
    }

    @InlineOnly
    /* renamed from: inv-s-VKNKU */
    private static final long m283invsVKNKU(long j10) {
        return m269constructorimpl(~j10);
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU */
    private static final long m284minus7apg3OU(long j10, byte b10) {
        return m269constructorimpl(j10 - m269constructorimpl(b10 & 255));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ */
    private static final long m285minusVKZWuLQ(long j10, long j11) {
        return m269constructorimpl(j10 - j11);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns */
    private static final long m286minusWZ4Q5Ns(long j10, int i10) {
        return m269constructorimpl(j10 - m269constructorimpl(i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw */
    private static final long m287minusxj2QHRw(long j10, short s5) {
        return m269constructorimpl(j10 - m269constructorimpl(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if ((r8 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ r0)) goto L32;
     */
    @kotlin.internal.InlineOnly
    /* renamed from: mod-7apg3OU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final byte m288mod7apg3OU(long r8, byte r10) {
        /*
            long r0 = (long) r10
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = m269constructorimpl(r0)
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = -9223372036854775808
            if (r10 >= 0) goto L1a
            long r2 = r8 ^ r4
            long r4 = r4 ^ r0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 >= 0) goto L18
            goto L31
        L18:
            long r8 = r8 - r0
            goto L31
        L1a:
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 < 0) goto L20
            long r8 = r8 % r0
            goto L31
        L20:
            r10 = 1
            long r6 = r8 >>> r10
            long r6 = r6 / r0
            long r6 = r6 << r10
            long r6 = r6 * r0
            long r8 = r8 - r6
            long r6 = r8 ^ r4
            long r4 = r4 ^ r0
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 < 0) goto L2f
            goto L18
        L2f:
            r0 = r2
            goto L18
        L31:
            int r8 = (int) r8
            byte r8 = (byte) r8
            byte r8 = kotlin.UByte.m113constructorimpl(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ULong.m288mod7apg3OU(long, byte):byte");
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ */
    private static final long m289modVKZWuLQ(long j10, long j11) {
        if (j11 < 0) {
            if ((j10 ^ Long.MIN_VALUE) < (j11 ^ Long.MIN_VALUE)) {
                return j10;
            }
            return j10 - j11;
        }
        if (j10 >= 0) {
            return j10 % j11;
        }
        long j12 = j10 - ((((j10 >>> 1) / j11) << 1) * j11);
        if ((j12 ^ Long.MIN_VALUE) < (j11 ^ Long.MIN_VALUE)) {
            j11 = 0;
        }
        return j12 - j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if ((r8 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ r0)) goto L32;
     */
    @kotlin.internal.InlineOnly
    /* renamed from: mod-WZ4Q5Ns */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int m290modWZ4Q5Ns(long r8, int r10) {
        /*
            long r0 = (long) r10
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = m269constructorimpl(r0)
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = -9223372036854775808
            if (r10 >= 0) goto L1d
            long r2 = r8 ^ r4
            long r4 = r4 ^ r0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 >= 0) goto L1b
            goto L34
        L1b:
            long r8 = r8 - r0
            goto L34
        L1d:
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 < 0) goto L23
            long r8 = r8 % r0
            goto L34
        L23:
            r10 = 1
            long r6 = r8 >>> r10
            long r6 = r6 / r0
            long r6 = r6 << r10
            long r6 = r6 * r0
            long r8 = r8 - r6
            long r6 = r8 ^ r4
            long r4 = r4 ^ r0
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 < 0) goto L32
            goto L1b
        L32:
            r0 = r2
            goto L1b
        L34:
            int r8 = (int) r8
            int r8 = kotlin.UInt.m190constructorimpl(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ULong.m290modWZ4Q5Ns(long, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if ((r8 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ r0)) goto L32;
     */
    @kotlin.internal.InlineOnly
    /* renamed from: mod-xj2QHRw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final short m291modxj2QHRw(long r8, short r10) {
        /*
            long r0 = (long) r10
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = m269constructorimpl(r0)
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = -9223372036854775808
            if (r10 >= 0) goto L1b
            long r2 = r8 ^ r4
            long r4 = r4 ^ r0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 >= 0) goto L19
            goto L32
        L19:
            long r8 = r8 - r0
            goto L32
        L1b:
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 < 0) goto L21
            long r8 = r8 % r0
            goto L32
        L21:
            r10 = 1
            long r6 = r8 >>> r10
            long r6 = r6 / r0
            long r6 = r6 << r10
            long r6 = r6 * r0
            long r8 = r8 - r6
            long r6 = r8 ^ r4
            long r4 = r4 ^ r0
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 < 0) goto L30
            goto L19
        L30:
            r0 = r2
            goto L19
        L32:
            int r8 = (int) r8
            short r8 = (short) r8
            short r8 = kotlin.UShort.m376constructorimpl(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ULong.m291modxj2QHRw(long, short):short");
    }

    @InlineOnly
    /* renamed from: or-VKZWuLQ */
    private static final long m292orVKZWuLQ(long j10, long j11) {
        return m269constructorimpl(j10 | j11);
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU */
    private static final long m293plus7apg3OU(long j10, byte b10) {
        return m269constructorimpl(m269constructorimpl(b10 & 255) + j10);
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ */
    private static final long m294plusVKZWuLQ(long j10, long j11) {
        return m269constructorimpl(j10 + j11);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns */
    private static final long m295plusWZ4Q5Ns(long j10, int i10) {
        return m269constructorimpl(m269constructorimpl(i10 & 4294967295L) + j10);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw */
    private static final long m296plusxj2QHRw(long j10, short s5) {
        return m269constructorimpl(m269constructorimpl(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX) + j10);
    }

    @InlineOnly
    /* renamed from: rangeTo-VKZWuLQ */
    private static final ULongRange m297rangeToVKZWuLQ(long j10, long j11) {
        return new ULongRange(j10, j11, null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: rangeUntil-VKZWuLQ */
    private static final ULongRange m298rangeUntilVKZWuLQ(long j10, long j11) {
        return URangesKt.m1364untileb3DHEI(j10, j11);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU */
    private static final long m299rem7apg3OU(long j10, byte b10) {
        long m269constructorimpl = m269constructorimpl(b10 & 255);
        if (m269constructorimpl < 0) {
            if ((j10 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ m269constructorimpl)) {
                return j10;
            }
            return j10 - m269constructorimpl;
        }
        if (j10 >= 0) {
            return j10 % m269constructorimpl;
        }
        long j11 = j10 - ((((j10 >>> 1) / m269constructorimpl) << 1) * m269constructorimpl);
        if ((j11 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ m269constructorimpl)) {
            m269constructorimpl = 0;
        }
        return j11 - m269constructorimpl;
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ */
    private static final long m300remVKZWuLQ(long j10, long j11) {
        return UnsignedKt.m449ulongRemaindereb3DHEI(j10, j11);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns */
    private static final long m301remWZ4Q5Ns(long j10, int i10) {
        long m269constructorimpl = m269constructorimpl(i10 & 4294967295L);
        if (m269constructorimpl < 0) {
            if ((j10 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ m269constructorimpl)) {
                return j10;
            }
            return j10 - m269constructorimpl;
        }
        if (j10 >= 0) {
            return j10 % m269constructorimpl;
        }
        long j11 = j10 - ((((j10 >>> 1) / m269constructorimpl) << 1) * m269constructorimpl);
        if ((j11 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ m269constructorimpl)) {
            m269constructorimpl = 0;
        }
        return j11 - m269constructorimpl;
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw */
    private static final long m302remxj2QHRw(long j10, short s5) {
        long m269constructorimpl = m269constructorimpl(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        if (m269constructorimpl < 0) {
            if ((j10 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ m269constructorimpl)) {
                return j10;
            }
            return j10 - m269constructorimpl;
        }
        if (j10 >= 0) {
            return j10 % m269constructorimpl;
        }
        long j11 = j10 - ((((j10 >>> 1) / m269constructorimpl) << 1) * m269constructorimpl);
        if ((j11 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ m269constructorimpl)) {
            m269constructorimpl = 0;
        }
        return j11 - m269constructorimpl;
    }

    @InlineOnly
    /* renamed from: shl-s-VKNKU */
    private static final long m303shlsVKNKU(long j10, int i10) {
        return m269constructorimpl(j10 << i10);
    }

    @InlineOnly
    /* renamed from: shr-s-VKNKU */
    private static final long m304shrsVKNKU(long j10, int i10) {
        return m269constructorimpl(j10 >>> i10);
    }

    @InlineOnly
    /* renamed from: times-7apg3OU */
    private static final long m305times7apg3OU(long j10, byte b10) {
        return a.c(b10 & 255, j10);
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ */
    private static final long m306timesVKZWuLQ(long j10, long j11) {
        return m269constructorimpl(j10 * j11);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns */
    private static final long m307timesWZ4Q5Ns(long j10, int i10) {
        return a.c(i10 & 4294967295L, j10);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw */
    private static final long m308timesxj2QHRw(long j10, short s5) {
        return a.c(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX, j10);
    }

    @InlineOnly
    /* renamed from: toByte-impl */
    private static final byte m309toByteimpl(long j10) {
        return (byte) j10;
    }

    @InlineOnly
    /* renamed from: toDouble-impl */
    private static final double m310toDoubleimpl(long j10) {
        return UnsignedKt.ulongToDouble(j10);
    }

    @InlineOnly
    /* renamed from: toFloat-impl */
    private static final float m311toFloatimpl(long j10) {
        return (float) UnsignedKt.ulongToDouble(j10);
    }

    @InlineOnly
    /* renamed from: toInt-impl */
    private static final int m312toIntimpl(long j10) {
        return (int) j10;
    }

    @InlineOnly
    /* renamed from: toShort-impl */
    private static final short m314toShortimpl(long j10) {
        return (short) j10;
    }

    /* renamed from: toString-impl */
    public static String m315toStringimpl(long j10) {
        return UnsignedKt.ulongToString(j10, 10);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ */
    private static final byte m316toUBytew2LRezQ(long j10) {
        return UByte.m113constructorimpl((byte) j10);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA */
    private static final int m317toUIntpVg5ArA(long j10) {
        return UInt.m190constructorimpl((int) j10);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg */
    private static final short m319toUShortMh2AYeg(long j10) {
        return UShort.m376constructorimpl((short) j10);
    }

    @InlineOnly
    /* renamed from: xor-VKZWuLQ */
    private static final long m320xorVKZWuLQ(long j10, long j11) {
        return m269constructorimpl(j10 ^ j11);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedKt.ulongCompare(getData(), uLong.getData());
    }

    public boolean equals(Object other) {
        return m275equalsimpl(this.data, other);
    }

    public int hashCode() {
        return m281hashCodeimpl(this.data);
    }

    public String toString() {
        return m315toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: from getter */
    public final /* synthetic */ long getData() {
        return this.data;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/ULong$Companion;", "", "<init>", "()V", "MIN_VALUE", "Lkotlin/ULong;", "J", "MAX_VALUE", "SIZE_BYTES", "", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    private static int m266compareToVKZWuLQ(long j10, long j11) {
        return UnsignedKt.ulongCompare(j10, j11);
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl */
    public static long m269constructorimpl(long j10) {
        return j10;
    }

    @InlineOnly
    /* renamed from: toLong-impl */
    private static final long m313toLongimpl(long j10) {
        return j10;
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU */
    private static final long m318toULongsVKNKU(long j10) {
        return j10;
    }
}
