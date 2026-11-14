package kotlin;

import ai.onnxruntime.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@SinceKotlin(version = "1.5")
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 x2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001xB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0012H\u0087\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u0016\u0010\fJ\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u0017\u0010\u000fJ\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0018\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0012H\u0087\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u001c\u0010\fJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u001d\u0010\u000fJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001e\u0010\u0011J\u0018\u0010\u001b\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0012H\u0087\n¢\u0006\u0004\b\u001f\u0010\u001aJ\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0087\n¢\u0006\u0004\b!\u0010\fJ\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\"\u0010\u000fJ\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b#\u0010\u0011J\u0018\u0010 \u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0012H\u0087\n¢\u0006\u0004\b$\u0010\u001aJ\u0018\u0010%\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0087\n¢\u0006\u0004\b&\u0010\fJ\u0018\u0010%\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b'\u0010\u000fJ\u0018\u0010%\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b(\u0010\u0011J\u0018\u0010%\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0012H\u0087\n¢\u0006\u0004\b)\u0010\u001aJ\u0018\u0010*\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0087\n¢\u0006\u0004\b+\u0010\fJ\u0018\u0010*\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b,\u0010\u000fJ\u0018\u0010*\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b-\u0010\u0011J\u0018\u0010*\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0012H\u0087\n¢\u0006\u0004\b.\u0010\u001aJ\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0087\b¢\u0006\u0004\b0\u0010\fJ\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\b¢\u0006\u0004\b1\u0010\u000fJ\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b2\u0010\u0011J\u0018\u0010/\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0012H\u0087\b¢\u0006\u0004\b3\u0010\u001aJ\u0018\u00104\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0087\b¢\u0006\u0004\b5\u00106J\u0018\u00104\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\rH\u0087\b¢\u0006\u0004\b7\u00108J\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b9\u0010\u0011J\u0018\u00104\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0012H\u0087\b¢\u0006\u0004\b:\u0010\u001aJ\u0010\u0010;\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b<\u0010\u0005J\u0010\u0010=\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b>\u0010\u0005J\u0018\u0010?\u001a\u00020@2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bA\u0010BJ\u0018\u0010C\u001a\u00020@2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bD\u0010BJ\u0018\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0003H\u0087\f¢\u0006\u0004\bG\u0010\u0011J\u0018\u0010H\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0003H\u0087\f¢\u0006\u0004\bI\u0010\u0011J\u0018\u0010J\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bK\u0010\u0011J\u0018\u0010L\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bM\u0010\u0011J\u0018\u0010N\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bO\u0010\u0011J\u0010\u0010P\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bQ\u0010\u0005J\u0010\u0010R\u001a\u00020SH\u0087\b¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020WH\u0087\b¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b[\u0010\u0005J\u0010\u0010\\\u001a\u00020]H\u0087\b¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\nH\u0087\b¢\u0006\u0004\ba\u0010UJ\u0010\u0010b\u001a\u00020\rH\u0087\b¢\u0006\u0004\bc\u0010YJ\u0010\u0010d\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\be\u0010\u0005J\u0010\u0010f\u001a\u00020\u0012H\u0087\b¢\u0006\u0004\bg\u0010_J\u0010\u0010h\u001a\u00020iH\u0087\b¢\u0006\u0004\bj\u0010kJ\u0010\u0010l\u001a\u00020mH\u0087\b¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020qH\u0016¢\u0006\u0004\br\u0010sJ\u0013\u0010t\u001a\u00020u2\b\u0010\t\u001a\u0004\u0018\u00010vHÖ\u0003J\t\u0010w\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006y"}, d2 = {"Lkotlin/UInt;", "", "data", "", "constructor-impl", "(I)I", "getData$annotations", "()V", "compareTo", "other", "Lkotlin/UByte;", "compareTo-7apg3OU", "(IB)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(IS)I", "compareTo-WZ4Q5Ns", "(II)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(IJ)I", "plus", "plus-7apg3OU", "plus-xj2QHRw", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "(IJ)J", "minus", "minus-7apg3OU", "minus-xj2QHRw", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "times", "times-7apg3OU", "times-xj2QHRw", "times-WZ4Q5Ns", "times-VKZWuLQ", "div", "div-7apg3OU", "div-xj2QHRw", "div-WZ4Q5Ns", "div-VKZWuLQ", "rem", "rem-7apg3OU", "rem-xj2QHRw", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "floorDiv", "floorDiv-7apg3OU", "floorDiv-xj2QHRw", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "mod", "mod-7apg3OU", "(IB)B", "mod-xj2QHRw", "(IS)S", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "inc", "inc-pVg5ArA", "dec", "dec-pVg5ArA", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-WZ4Q5Ns", "(II)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-WZ4Q5Ns", "shl", "bitCount", "shl-pVg5ArA", "shr", "shr-pVg5ArA", "and", "and-WZ4Q5Ns", "or", "or-WZ4Q5Ns", "xor", "xor-WZ4Q5Ns", "inv", "inv-pVg5ArA", "toByte", "", "toByte-impl", "(I)B", "toShort", "", "toShort-impl", "(I)S", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(I)J", "toUByte", "toUByte-w2LRezQ", "toUShort", "toUShort-Mh2AYeg", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toFloat", "", "toFloat-impl", "(I)F", "toDouble", "", "toDouble-impl", "(I)D", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "equals", "", "", "hashCode", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes.dex */
public final class UInt implements Comparable<UInt> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int MAX_VALUE = -1;
    public static final int MIN_VALUE = 0;
    public static final int SIZE_BITS = 32;
    public static final int SIZE_BYTES = 4;
    private final int data;

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ UInt(int i10) {
        this.data = i10;
    }

    @InlineOnly
    /* renamed from: and-WZ4Q5Ns */
    private static final int m183andWZ4Q5Ns(int i10, int i11) {
        return m190constructorimpl(i10 & i11);
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ UInt m184boximpl(int i10) {
        return new UInt(i10);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    private static final int m185compareTo7apg3OU(int i10, byte b10) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, m190constructorimpl(b10 & UByte.MAX_VALUE) ^ Integer.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    private static final int m186compareToVKZWuLQ(int i10, long j10) {
        return Long.compare(ULong.m269constructorimpl(i10 & 4294967295L) ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns */
    private int m187compareToWZ4Q5Ns(int i10) {
        return UnsignedKt.uintCompare(getData(), i10);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw */
    private static final int m189compareToxj2QHRw(int i10, short s5) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, m190constructorimpl(s5 & UShort.MAX_VALUE) ^ Integer.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: dec-pVg5ArA */
    private static final int m191decpVg5ArA(int i10) {
        return m190constructorimpl(i10 - 1);
    }

    @InlineOnly
    /* renamed from: div-7apg3OU */
    private static final int m192div7apg3OU(int i10, byte b10) {
        return (int) ((i10 & 4294967295L) / (m190constructorimpl(b10 & UByte.MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ */
    private static final long m193divVKZWuLQ(int i10, long j10) {
        long m269constructorimpl = ULong.m269constructorimpl(i10 & 4294967295L);
        if (j10 < 0) {
            if ((m269constructorimpl ^ Long.MIN_VALUE) < (j10 ^ Long.MIN_VALUE)) {
                return 0L;
            }
            return 1L;
        }
        if (m269constructorimpl >= 0) {
            return m269constructorimpl / j10;
        }
        int i11 = 1;
        long j11 = ((m269constructorimpl >>> 1) / j10) << 1;
        if (((m269constructorimpl - (j11 * j10)) ^ Long.MIN_VALUE) < (j10 ^ Long.MIN_VALUE)) {
            i11 = 0;
        }
        return j11 + i11;
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns */
    private static final int m194divWZ4Q5Ns(int i10, int i11) {
        return UnsignedKt.m446uintDivideJ1ME1BU(i10, i11);
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw */
    private static final int m195divxj2QHRw(int i10, short s5) {
        return (int) ((i10 & 4294967295L) / (m190constructorimpl(s5 & UShort.MAX_VALUE) & 4294967295L));
    }

    /* renamed from: equals-impl */
    public static boolean m196equalsimpl(int i10, Object obj) {
        if (!(obj instanceof UInt) || i10 != ((UInt) obj).getData()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0 */
    public static final boolean m197equalsimpl0(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU */
    private static final int m198floorDiv7apg3OU(int i10, byte b10) {
        return (int) ((i10 & 4294967295L) / (m190constructorimpl(b10 & UByte.MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ */
    private static final long m199floorDivVKZWuLQ(int i10, long j10) {
        long m269constructorimpl = ULong.m269constructorimpl(i10 & 4294967295L);
        if (j10 < 0) {
            if ((m269constructorimpl ^ Long.MIN_VALUE) < (j10 ^ Long.MIN_VALUE)) {
                return 0L;
            }
            return 1L;
        }
        if (m269constructorimpl >= 0) {
            return m269constructorimpl / j10;
        }
        int i11 = 1;
        long j11 = ((m269constructorimpl >>> 1) / j10) << 1;
        if (((m269constructorimpl - (j11 * j10)) ^ Long.MIN_VALUE) < (j10 ^ Long.MIN_VALUE)) {
            i11 = 0;
        }
        return j11 + i11;
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns */
    private static final int m200floorDivWZ4Q5Ns(int i10, int i11) {
        return (int) ((i10 & 4294967295L) / (i11 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw */
    private static final int m201floorDivxj2QHRw(int i10, short s5) {
        return (int) ((i10 & 4294967295L) / (m190constructorimpl(s5 & UShort.MAX_VALUE) & 4294967295L));
    }

    /* renamed from: hashCode-impl */
    public static int m202hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    @InlineOnly
    /* renamed from: inc-pVg5ArA */
    private static final int m203incpVg5ArA(int i10) {
        return m190constructorimpl(i10 + 1);
    }

    @InlineOnly
    /* renamed from: inv-pVg5ArA */
    private static final int m204invpVg5ArA(int i10) {
        return m190constructorimpl(~i10);
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU */
    private static final int m205minus7apg3OU(int i10, byte b10) {
        return m190constructorimpl(i10 - m190constructorimpl(b10 & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ */
    private static final long m206minusVKZWuLQ(int i10, long j10) {
        return ULong.m269constructorimpl(ULong.m269constructorimpl(i10 & 4294967295L) - j10);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns */
    private static final int m207minusWZ4Q5Ns(int i10, int i11) {
        return m190constructorimpl(i10 - i11);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw */
    private static final int m208minusxj2QHRw(int i10, short s5) {
        return m190constructorimpl(i10 - m190constructorimpl(s5 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU */
    private static final byte m209mod7apg3OU(int i10, byte b10) {
        return UByte.m113constructorimpl((byte) ((i10 & 4294967295L) % (m190constructorimpl(b10 & UByte.MAX_VALUE) & 4294967295L)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ */
    private static final long m210modVKZWuLQ(int i10, long j10) {
        long m269constructorimpl = ULong.m269constructorimpl(i10 & 4294967295L);
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
    private static final int m211modWZ4Q5Ns(int i10, int i11) {
        return (int) ((i10 & 4294967295L) % (i11 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw */
    private static final short m212modxj2QHRw(int i10, short s5) {
        return UShort.m376constructorimpl((short) ((i10 & 4294967295L) % (m190constructorimpl(s5 & UShort.MAX_VALUE) & 4294967295L)));
    }

    @InlineOnly
    /* renamed from: or-WZ4Q5Ns */
    private static final int m213orWZ4Q5Ns(int i10, int i11) {
        return m190constructorimpl(i10 | i11);
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU */
    private static final int m214plus7apg3OU(int i10, byte b10) {
        return m190constructorimpl(m190constructorimpl(b10 & UByte.MAX_VALUE) + i10);
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ */
    private static final long m215plusVKZWuLQ(int i10, long j10) {
        return ULong.m269constructorimpl(ULong.m269constructorimpl(i10 & 4294967295L) + j10);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns */
    private static final int m216plusWZ4Q5Ns(int i10, int i11) {
        return m190constructorimpl(i10 + i11);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw */
    private static final int m217plusxj2QHRw(int i10, short s5) {
        return m190constructorimpl(m190constructorimpl(s5 & UShort.MAX_VALUE) + i10);
    }

    @InlineOnly
    /* renamed from: rangeTo-WZ4Q5Ns */
    private static final UIntRange m218rangeToWZ4Q5Ns(int i10, int i11) {
        return new UIntRange(i10, i11, null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: rangeUntil-WZ4Q5Ns */
    private static final UIntRange m219rangeUntilWZ4Q5Ns(int i10, int i11) {
        return URangesKt.m1362untilJ1ME1BU(i10, i11);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU */
    private static final int m220rem7apg3OU(int i10, byte b10) {
        return (int) ((i10 & 4294967295L) % (m190constructorimpl(b10 & UByte.MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ */
    private static final long m221remVKZWuLQ(int i10, long j10) {
        long m269constructorimpl = ULong.m269constructorimpl(i10 & 4294967295L);
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
    private static final int m222remWZ4Q5Ns(int i10, int i11) {
        return UnsignedKt.m447uintRemainderJ1ME1BU(i10, i11);
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw */
    private static final int m223remxj2QHRw(int i10, short s5) {
        return (int) ((i10 & 4294967295L) % (m190constructorimpl(s5 & UShort.MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: shl-pVg5ArA */
    private static final int m224shlpVg5ArA(int i10, int i11) {
        return m190constructorimpl(i10 << i11);
    }

    @InlineOnly
    /* renamed from: shr-pVg5ArA */
    private static final int m225shrpVg5ArA(int i10, int i11) {
        return m190constructorimpl(i10 >>> i11);
    }

    @InlineOnly
    /* renamed from: times-7apg3OU */
    private static final int m226times7apg3OU(int i10, byte b10) {
        return m190constructorimpl(m190constructorimpl(b10 & UByte.MAX_VALUE) * i10);
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ */
    private static final long m227timesVKZWuLQ(int i10, long j10) {
        return a.c(i10 & 4294967295L, j10);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns */
    private static final int m228timesWZ4Q5Ns(int i10, int i11) {
        return m190constructorimpl(i10 * i11);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw */
    private static final int m229timesxj2QHRw(int i10, short s5) {
        return m190constructorimpl(m190constructorimpl(s5 & UShort.MAX_VALUE) * i10);
    }

    @InlineOnly
    /* renamed from: toByte-impl */
    private static final byte m230toByteimpl(int i10) {
        return (byte) i10;
    }

    @InlineOnly
    /* renamed from: toDouble-impl */
    private static final double m231toDoubleimpl(int i10) {
        return UnsignedKt.uintToDouble(i10);
    }

    @InlineOnly
    /* renamed from: toFloat-impl */
    private static final float m232toFloatimpl(int i10) {
        return (float) UnsignedKt.uintToDouble(i10);
    }

    @InlineOnly
    /* renamed from: toLong-impl */
    private static final long m234toLongimpl(int i10) {
        return i10 & 4294967295L;
    }

    @InlineOnly
    /* renamed from: toShort-impl */
    private static final short m235toShortimpl(int i10) {
        return (short) i10;
    }

    /* renamed from: toString-impl */
    public static String m236toStringimpl(int i10) {
        return String.valueOf(i10 & 4294967295L);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ */
    private static final byte m237toUBytew2LRezQ(int i10) {
        return UByte.m113constructorimpl((byte) i10);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU */
    private static final long m239toULongsVKNKU(int i10) {
        return ULong.m269constructorimpl(i10 & 4294967295L);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg */
    private static final short m240toUShortMh2AYeg(int i10) {
        return UShort.m376constructorimpl((short) i10);
    }

    @InlineOnly
    /* renamed from: xor-WZ4Q5Ns */
    private static final int m241xorWZ4Q5Ns(int i10, int i11) {
        return m190constructorimpl(i10 ^ i11);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UInt uInt) {
        return UnsignedKt.uintCompare(getData(), uInt.getData());
    }

    public boolean equals(Object other) {
        return m196equalsimpl(this.data, other);
    }

    public int hashCode() {
        return m202hashCodeimpl(this.data);
    }

    public String toString() {
        return m236toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: from getter */
    public final /* synthetic */ int getData() {
        return this.data;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/UInt$Companion;", "", "<init>", "()V", "MIN_VALUE", "Lkotlin/UInt;", "I", "MAX_VALUE", "SIZE_BYTES", "", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns */
    private static int m188compareToWZ4Q5Ns(int i10, int i11) {
        return UnsignedKt.uintCompare(i10, i11);
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl */
    public static int m190constructorimpl(int i10) {
        return i10;
    }

    @InlineOnly
    /* renamed from: toInt-impl */
    private static final int m233toIntimpl(int i10) {
        return i10;
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA */
    private static final int m238toUIntpVg5ArA(int i10) {
        return i10;
    }
}
