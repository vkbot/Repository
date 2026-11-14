package kotlin;

import ai.onnxruntime.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@SinceKotlin(version = "1.5")
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 s2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001sB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0017\u0010\fJ\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u0018\u0010\u000fJ\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0019\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001d\u0010\fJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u001e\u0010\u000fJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u001f\u0010\u0012J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b \u0010\u001bJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\"\u0010\fJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b#\u0010\u000fJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b$\u0010\u0012J\u0018\u0010!\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b%\u0010\u001bJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b'\u0010\fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b(\u0010\u000fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b)\u0010\u0012J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b*\u0010\u001bJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b,\u0010\fJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b-\u0010\u000fJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b.\u0010\u0012J\u0018\u0010+\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b/\u0010\u001bJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b1\u0010\fJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\b¢\u0006\u0004\b2\u0010\u000fJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b3\u0010\u0012J\u0018\u00100\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b4\u0010\u001bJ\u0018\u00105\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b6\u00107J\u0018\u00105\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\rH\u0087\b¢\u0006\u0004\b8\u00109J\u0018\u00105\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b:\u0010\u0012J\u0018\u00105\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b;\u0010\u001bJ\u0010\u0010<\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b=\u0010\u0005J\u0010\u0010>\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b?\u0010\u0005J\u0018\u0010@\u001a\u00020A2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bB\u0010CJ\u0018\u0010D\u001a\u00020A2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bE\u0010CJ\u0018\u0010F\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bG\u00107J\u0018\u0010H\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bI\u00107J\u0018\u0010J\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bK\u00107J\u0010\u0010L\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bM\u0010\u0005J\u0010\u0010N\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bO\u0010\u0005J\u0010\u0010P\u001a\u00020QH\u0087\b¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\tH\u0087\b¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020XH\u0087\b¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\\\u0010\u0005J\u0010\u0010]\u001a\u00020\rH\u0087\b¢\u0006\u0004\b^\u0010SJ\u0010\u0010_\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b`\u0010VJ\u0010\u0010a\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\bb\u0010ZJ\u0010\u0010c\u001a\u00020dH\u0087\b¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020hH\u0087\b¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020lH\u0016¢\u0006\u0004\bm\u0010nJ\u0013\u0010o\u001a\u00020p2\b\u0010\n\u001a\u0004\u0018\u00010qHÖ\u0003J\t\u0010r\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006t"}, d2 = {"Lkotlin/UByte;", "", "data", "", "constructor-impl", "(B)B", "getData$annotations", "()V", "compareTo", "", "other", "compareTo-7apg3OU", "(BB)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(BS)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(BI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(BJ)I", "plus", "plus-7apg3OU", "plus-xj2QHRw", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "(BJ)J", "minus", "minus-7apg3OU", "minus-xj2QHRw", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "times", "times-7apg3OU", "times-xj2QHRw", "times-WZ4Q5Ns", "times-VKZWuLQ", "div", "div-7apg3OU", "div-xj2QHRw", "div-WZ4Q5Ns", "div-VKZWuLQ", "rem", "rem-7apg3OU", "rem-xj2QHRw", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "floorDiv", "floorDiv-7apg3OU", "floorDiv-xj2QHRw", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "mod", "mod-7apg3OU", "(BB)B", "mod-xj2QHRw", "(BS)S", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "inc", "inc-w2LRezQ", "dec", "dec-w2LRezQ", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-7apg3OU", "(BB)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-7apg3OU", "and", "and-7apg3OU", "or", "or-7apg3OU", "xor", "xor-7apg3OU", "inv", "inv-w2LRezQ", "toByte", "toByte-impl", "toShort", "", "toShort-impl", "(B)S", "toInt", "toInt-impl", "(B)I", "toLong", "", "toLong-impl", "(B)J", "toUByte", "toUByte-w2LRezQ", "toUShort", "toUShort-Mh2AYeg", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toFloat", "", "toFloat-impl", "(B)F", "toDouble", "", "toDouble-impl", "(B)D", "toString", "", "toString-impl", "(B)Ljava/lang/String;", "equals", "", "", "hashCode", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes.dex */
public final class UByte implements Comparable<UByte> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    private final byte data;

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ UByte(byte b10) {
        this.data = b10;
    }

    @InlineOnly
    /* renamed from: and-7apg3OU */
    private static final byte m106and7apg3OU(byte b10, byte b11) {
        return m113constructorimpl((byte) (b10 & b11));
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ UByte m107boximpl(byte b10) {
        return new UByte(b10);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    private int m108compareTo7apg3OU(byte b10) {
        return Intrinsics.compare(getData() & MAX_VALUE, b10 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    private static final int m110compareToVKZWuLQ(byte b10, long j10) {
        return Long.compare(ULong.m269constructorimpl(b10 & 255) ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns */
    private static final int m111compareToWZ4Q5Ns(byte b10, int i10) {
        return Integer.compare(UInt.m190constructorimpl(b10 & MAX_VALUE) ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw */
    private static final int m112compareToxj2QHRw(byte b10, short s5) {
        return Intrinsics.compare(b10 & MAX_VALUE, s5 & UShort.MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: dec-w2LRezQ */
    private static final byte m114decw2LRezQ(byte b10) {
        return m113constructorimpl((byte) (b10 - 1));
    }

    @InlineOnly
    /* renamed from: div-7apg3OU */
    private static final int m115div7apg3OU(byte b10, byte b11) {
        return (int) ((UInt.m190constructorimpl(b10 & MAX_VALUE) & 4294967295L) / (UInt.m190constructorimpl(b11 & MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ */
    private static final long m116divVKZWuLQ(byte b10, long j10) {
        long m269constructorimpl = ULong.m269constructorimpl(b10 & 255);
        if (j10 < 0) {
            if ((m269constructorimpl ^ Long.MIN_VALUE) < (j10 ^ Long.MIN_VALUE)) {
                return 0L;
            }
            return 1L;
        }
        if (m269constructorimpl >= 0) {
            return m269constructorimpl / j10;
        }
        int i10 = 1;
        long j11 = ((m269constructorimpl >>> 1) / j10) << 1;
        if (((m269constructorimpl - (j11 * j10)) ^ Long.MIN_VALUE) < (j10 ^ Long.MIN_VALUE)) {
            i10 = 0;
        }
        return j11 + i10;
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns */
    private static final int m117divWZ4Q5Ns(byte b10, int i10) {
        return (int) ((UInt.m190constructorimpl(b10 & MAX_VALUE) & 4294967295L) / (i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw */
    private static final int m118divxj2QHRw(byte b10, short s5) {
        return (int) ((UInt.m190constructorimpl(b10 & MAX_VALUE) & 4294967295L) / (UInt.m190constructorimpl(s5 & UShort.MAX_VALUE) & 4294967295L));
    }

    /* renamed from: equals-impl */
    public static boolean m119equalsimpl(byte b10, Object obj) {
        if (!(obj instanceof UByte) || b10 != ((UByte) obj).getData()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0 */
    public static final boolean m120equalsimpl0(byte b10, byte b11) {
        if (b10 == b11) {
            return true;
        }
        return false;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU */
    private static final int m121floorDiv7apg3OU(byte b10, byte b11) {
        return (int) ((UInt.m190constructorimpl(b10 & MAX_VALUE) & 4294967295L) / (UInt.m190constructorimpl(b11 & MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ */
    private static final long m122floorDivVKZWuLQ(byte b10, long j10) {
        long m269constructorimpl = ULong.m269constructorimpl(b10 & 255);
        if (j10 < 0) {
            if ((m269constructorimpl ^ Long.MIN_VALUE) < (j10 ^ Long.MIN_VALUE)) {
                return 0L;
            }
            return 1L;
        }
        if (m269constructorimpl >= 0) {
            return m269constructorimpl / j10;
        }
        int i10 = 1;
        long j11 = ((m269constructorimpl >>> 1) / j10) << 1;
        if (((m269constructorimpl - (j11 * j10)) ^ Long.MIN_VALUE) < (j10 ^ Long.MIN_VALUE)) {
            i10 = 0;
        }
        return j11 + i10;
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns */
    private static final int m123floorDivWZ4Q5Ns(byte b10, int i10) {
        return (int) ((UInt.m190constructorimpl(b10 & MAX_VALUE) & 4294967295L) / (i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw */
    private static final int m124floorDivxj2QHRw(byte b10, short s5) {
        return (int) ((UInt.m190constructorimpl(b10 & MAX_VALUE) & 4294967295L) / (UInt.m190constructorimpl(s5 & UShort.MAX_VALUE) & 4294967295L));
    }

    /* renamed from: hashCode-impl */
    public static int m125hashCodeimpl(byte b10) {
        return Byte.hashCode(b10);
    }

    @InlineOnly
    /* renamed from: inc-w2LRezQ */
    private static final byte m126incw2LRezQ(byte b10) {
        return m113constructorimpl((byte) (b10 + 1));
    }

    @InlineOnly
    /* renamed from: inv-w2LRezQ */
    private static final byte m127invw2LRezQ(byte b10) {
        return m113constructorimpl((byte) (~b10));
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU */
    private static final int m128minus7apg3OU(byte b10, byte b11) {
        return UInt.m190constructorimpl(UInt.m190constructorimpl(b10 & MAX_VALUE) - UInt.m190constructorimpl(b11 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ */
    private static final long m129minusVKZWuLQ(byte b10, long j10) {
        return ULong.m269constructorimpl(ULong.m269constructorimpl(b10 & 255) - j10);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns */
    private static final int m130minusWZ4Q5Ns(byte b10, int i10) {
        return UInt.m190constructorimpl(UInt.m190constructorimpl(b10 & MAX_VALUE) - i10);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw */
    private static final int m131minusxj2QHRw(byte b10, short s5) {
        return UInt.m190constructorimpl(UInt.m190constructorimpl(b10 & MAX_VALUE) - UInt.m190constructorimpl(s5 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU */
    private static final byte m132mod7apg3OU(byte b10, byte b11) {
        return m113constructorimpl((byte) ((UInt.m190constructorimpl(b10 & MAX_VALUE) & 4294967295L) % (UInt.m190constructorimpl(b11 & MAX_VALUE) & 4294967295L)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ */
    private static final long m133modVKZWuLQ(byte b10, long j10) {
        long m269constructorimpl = ULong.m269constructorimpl(b10 & 255);
        if (j10 < 0) {
            if ((m269constructorimpl ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ j10)) {
                return m269constructorimpl;
            }
            return m269constructorimpl - j10;
        }
        if (m269constructorimpl >= 0) {
            return m269constructorimpl % j10;
        }
        long j11 = m269constructorimpl - ((((m269constructorimpl >>> 1) / j10) << 1) * j10);
        if ((j11 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ j10)) {
            j10 = 0;
        }
        return j11 - j10;
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns */
    private static final int m134modWZ4Q5Ns(byte b10, int i10) {
        return (int) ((UInt.m190constructorimpl(b10 & MAX_VALUE) & 4294967295L) % (i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw */
    private static final short m135modxj2QHRw(byte b10, short s5) {
        return UShort.m376constructorimpl((short) ((UInt.m190constructorimpl(b10 & MAX_VALUE) & 4294967295L) % (UInt.m190constructorimpl(s5 & UShort.MAX_VALUE) & 4294967295L)));
    }

    @InlineOnly
    /* renamed from: or-7apg3OU */
    private static final byte m136or7apg3OU(byte b10, byte b11) {
        return m113constructorimpl((byte) (b10 | b11));
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU */
    private static final int m137plus7apg3OU(byte b10, byte b11) {
        return UInt.m190constructorimpl(UInt.m190constructorimpl(b11 & MAX_VALUE) + UInt.m190constructorimpl(b10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ */
    private static final long m138plusVKZWuLQ(byte b10, long j10) {
        return ULong.m269constructorimpl(ULong.m269constructorimpl(b10 & 255) + j10);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns */
    private static final int m139plusWZ4Q5Ns(byte b10, int i10) {
        return UInt.m190constructorimpl(UInt.m190constructorimpl(b10 & MAX_VALUE) + i10);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw */
    private static final int m140plusxj2QHRw(byte b10, short s5) {
        return UInt.m190constructorimpl(UInt.m190constructorimpl(s5 & UShort.MAX_VALUE) + UInt.m190constructorimpl(b10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rangeTo-7apg3OU */
    private static final UIntRange m141rangeTo7apg3OU(byte b10, byte b11) {
        return new UIntRange(UInt.m190constructorimpl(b10 & MAX_VALUE), UInt.m190constructorimpl(b11 & MAX_VALUE), null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: rangeUntil-7apg3OU */
    private static final UIntRange m142rangeUntil7apg3OU(byte b10, byte b11) {
        return URangesKt.m1362untilJ1ME1BU(UInt.m190constructorimpl(b10 & MAX_VALUE), UInt.m190constructorimpl(b11 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU */
    private static final int m143rem7apg3OU(byte b10, byte b11) {
        return (int) ((UInt.m190constructorimpl(b10 & MAX_VALUE) & 4294967295L) % (UInt.m190constructorimpl(b11 & MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ */
    private static final long m144remVKZWuLQ(byte b10, long j10) {
        long m269constructorimpl = ULong.m269constructorimpl(b10 & 255);
        if (j10 < 0) {
            if ((m269constructorimpl ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ j10)) {
                return m269constructorimpl;
            }
            return m269constructorimpl - j10;
        }
        if (m269constructorimpl >= 0) {
            return m269constructorimpl % j10;
        }
        long j11 = m269constructorimpl - ((((m269constructorimpl >>> 1) / j10) << 1) * j10);
        if ((j11 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ j10)) {
            j10 = 0;
        }
        return j11 - j10;
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns */
    private static final int m145remWZ4Q5Ns(byte b10, int i10) {
        return (int) ((UInt.m190constructorimpl(b10 & MAX_VALUE) & 4294967295L) % (i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw */
    private static final int m146remxj2QHRw(byte b10, short s5) {
        return (int) ((UInt.m190constructorimpl(b10 & MAX_VALUE) & 4294967295L) % (UInt.m190constructorimpl(s5 & UShort.MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: times-7apg3OU */
    private static final int m147times7apg3OU(byte b10, byte b11) {
        return UInt.m190constructorimpl(UInt.m190constructorimpl(b11 & MAX_VALUE) * UInt.m190constructorimpl(b10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ */
    private static final long m148timesVKZWuLQ(byte b10, long j10) {
        return a.c(b10 & 255, j10);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns */
    private static final int m149timesWZ4Q5Ns(byte b10, int i10) {
        return UInt.m190constructorimpl(UInt.m190constructorimpl(b10 & MAX_VALUE) * i10);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw */
    private static final int m150timesxj2QHRw(byte b10, short s5) {
        return UInt.m190constructorimpl(UInt.m190constructorimpl(s5 & UShort.MAX_VALUE) * UInt.m190constructorimpl(b10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: toDouble-impl */
    private static final double m152toDoubleimpl(byte b10) {
        return UnsignedKt.uintToDouble(b10 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toFloat-impl */
    private static final float m153toFloatimpl(byte b10) {
        return (float) UnsignedKt.uintToDouble(b10 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toInt-impl */
    private static final int m154toIntimpl(byte b10) {
        return b10 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toLong-impl */
    private static final long m155toLongimpl(byte b10) {
        return b10 & 255;
    }

    @InlineOnly
    /* renamed from: toShort-impl */
    private static final short m156toShortimpl(byte b10) {
        return (short) (b10 & 255);
    }

    /* renamed from: toString-impl */
    public static String m157toStringimpl(byte b10) {
        return String.valueOf(b10 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA */
    private static final int m159toUIntpVg5ArA(byte b10) {
        return UInt.m190constructorimpl(b10 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU */
    private static final long m160toULongsVKNKU(byte b10) {
        return ULong.m269constructorimpl(b10 & 255);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg */
    private static final short m161toUShortMh2AYeg(byte b10) {
        return UShort.m376constructorimpl((short) (b10 & 255));
    }

    @InlineOnly
    /* renamed from: xor-7apg3OU */
    private static final byte m162xor7apg3OU(byte b10, byte b11) {
        return m113constructorimpl((byte) (b10 ^ b11));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.compare(getData() & MAX_VALUE, uByte.getData() & MAX_VALUE);
    }

    public boolean equals(Object other) {
        return m119equalsimpl(this.data, other);
    }

    public int hashCode() {
        return m125hashCodeimpl(this.data);
    }

    public String toString() {
        return m157toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: from getter */
    public final /* synthetic */ byte getData() {
        return this.data;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/UByte$Companion;", "", "<init>", "()V", "MIN_VALUE", "Lkotlin/UByte;", "B", "MAX_VALUE", "SIZE_BYTES", "", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    private static int m109compareTo7apg3OU(byte b10, byte b11) {
        return Intrinsics.compare(b10 & MAX_VALUE, b11 & MAX_VALUE);
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl */
    public static byte m113constructorimpl(byte b10) {
        return b10;
    }

    @InlineOnly
    /* renamed from: toByte-impl */
    private static final byte m151toByteimpl(byte b10) {
        return b10;
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ */
    private static final byte m158toUBytew2LRezQ(byte b10) {
        return b10;
    }
}
