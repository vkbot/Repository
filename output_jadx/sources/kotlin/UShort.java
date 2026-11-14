package kotlin;

import ai.onnxruntime.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@SinceKotlin(version = "1.5")
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 s2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001sB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\u0017\u0010\rJ\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0018\u0010\u000fJ\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0019\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\u001d\u0010\rJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001e\u0010\u000fJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u001f\u0010\u0012J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b \u0010\u001bJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\"\u0010\rJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b#\u0010\u000fJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b$\u0010\u0012J\u0018\u0010!\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b%\u0010\u001bJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b'\u0010\rJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b(\u0010\u000fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b)\u0010\u0012J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b*\u0010\u001bJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b,\u0010\rJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b-\u0010\u000fJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b.\u0010\u0012J\u0018\u0010+\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b/\u0010\u001bJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b1\u0010\rJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b2\u0010\u000fJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b3\u0010\u0012J\u0018\u00100\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b4\u0010\u001bJ\u0018\u00105\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b6\u00107J\u0018\u00105\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b8\u00109J\u0018\u00105\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b:\u0010\u0012J\u0018\u00105\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b;\u0010\u001bJ\u0010\u0010<\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b=\u0010\u0005J\u0010\u0010>\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b?\u0010\u0005J\u0018\u0010@\u001a\u00020A2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bB\u0010CJ\u0018\u0010D\u001a\u00020A2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bE\u0010CJ\u0018\u0010F\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bG\u00109J\u0018\u0010H\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bI\u00109J\u0018\u0010J\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bK\u00109J\u0010\u0010L\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bM\u0010\u0005J\u0010\u0010N\u001a\u00020OH\u0087\b¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bS\u0010\u0005J\u0010\u0010T\u001a\u00020\tH\u0087\b¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020XH\u0087\b¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b\\\u0010QJ\u0010\u0010]\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b^\u0010\u0005J\u0010\u0010_\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b`\u0010VJ\u0010\u0010a\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\bb\u0010ZJ\u0010\u0010c\u001a\u00020dH\u0087\b¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020hH\u0087\b¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020lH\u0016¢\u0006\u0004\bm\u0010nJ\u0013\u0010o\u001a\u00020p2\b\u0010\n\u001a\u0004\u0018\u00010qHÖ\u0003J\t\u0010r\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006t"}, d2 = {"Lkotlin/UShort;", "", "data", "", "constructor-impl", "(S)S", "getData$annotations", "()V", "compareTo", "", "other", "Lkotlin/UByte;", "compareTo-7apg3OU", "(SB)I", "compareTo-xj2QHRw", "(SS)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(SI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(SJ)I", "plus", "plus-7apg3OU", "plus-xj2QHRw", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "(SJ)J", "minus", "minus-7apg3OU", "minus-xj2QHRw", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "times", "times-7apg3OU", "times-xj2QHRw", "times-WZ4Q5Ns", "times-VKZWuLQ", "div", "div-7apg3OU", "div-xj2QHRw", "div-WZ4Q5Ns", "div-VKZWuLQ", "rem", "rem-7apg3OU", "rem-xj2QHRw", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "floorDiv", "floorDiv-7apg3OU", "floorDiv-xj2QHRw", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "mod", "mod-7apg3OU", "(SB)B", "mod-xj2QHRw", "(SS)S", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "inc", "inc-Mh2AYeg", "dec", "dec-Mh2AYeg", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-xj2QHRw", "(SS)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-xj2QHRw", "and", "and-xj2QHRw", "or", "or-xj2QHRw", "xor", "xor-xj2QHRw", "inv", "inv-Mh2AYeg", "toByte", "", "toByte-impl", "(S)B", "toShort", "toShort-impl", "toInt", "toInt-impl", "(S)I", "toLong", "", "toLong-impl", "(S)J", "toUByte", "toUByte-w2LRezQ", "toUShort", "toUShort-Mh2AYeg", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toFloat", "", "toFloat-impl", "(S)F", "toDouble", "", "toDouble-impl", "(S)D", "toString", "", "toString-impl", "(S)Ljava/lang/String;", "equals", "", "", "hashCode", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes.dex */
public final class UShort implements Comparable<UShort> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;
    private final short data;

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ UShort(short s5) {
        this.data = s5;
    }

    @InlineOnly
    /* renamed from: and-xj2QHRw */
    private static final short m369andxj2QHRw(short s5, short s9) {
        return m376constructorimpl((short) (s5 & s9));
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ UShort m370boximpl(short s5) {
        return new UShort(s5);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    private static final int m371compareTo7apg3OU(short s5, byte b10) {
        return Intrinsics.compare(s5 & MAX_VALUE, b10 & UByte.MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    private static final int m372compareToVKZWuLQ(short s5, long j10) {
        return Long.compare(ULong.m269constructorimpl(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX) ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns */
    private static final int m373compareToWZ4Q5Ns(short s5, int i10) {
        return Integer.compare(UInt.m190constructorimpl(s5 & MAX_VALUE) ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw */
    private int m374compareToxj2QHRw(short s5) {
        return Intrinsics.compare(getData() & MAX_VALUE, s5 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: dec-Mh2AYeg */
    private static final short m377decMh2AYeg(short s5) {
        return m376constructorimpl((short) (s5 - 1));
    }

    @InlineOnly
    /* renamed from: div-7apg3OU */
    private static final int m378div7apg3OU(short s5, byte b10) {
        return (int) ((UInt.m190constructorimpl(s5 & MAX_VALUE) & 4294967295L) / (UInt.m190constructorimpl(b10 & UByte.MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ */
    private static final long m379divVKZWuLQ(short s5, long j10) {
        long m269constructorimpl = ULong.m269constructorimpl(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX);
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
    private static final int m380divWZ4Q5Ns(short s5, int i10) {
        return (int) ((UInt.m190constructorimpl(s5 & MAX_VALUE) & 4294967295L) / (i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw */
    private static final int m381divxj2QHRw(short s5, short s9) {
        return (int) ((UInt.m190constructorimpl(s5 & MAX_VALUE) & 4294967295L) / (UInt.m190constructorimpl(s9 & MAX_VALUE) & 4294967295L));
    }

    /* renamed from: equals-impl */
    public static boolean m382equalsimpl(short s5, Object obj) {
        if (!(obj instanceof UShort) || s5 != ((UShort) obj).getData()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0 */
    public static final boolean m383equalsimpl0(short s5, short s9) {
        if (s5 == s9) {
            return true;
        }
        return false;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU */
    private static final int m384floorDiv7apg3OU(short s5, byte b10) {
        return (int) ((UInt.m190constructorimpl(s5 & MAX_VALUE) & 4294967295L) / (UInt.m190constructorimpl(b10 & UByte.MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ */
    private static final long m385floorDivVKZWuLQ(short s5, long j10) {
        long m269constructorimpl = ULong.m269constructorimpl(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX);
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
    private static final int m386floorDivWZ4Q5Ns(short s5, int i10) {
        return (int) ((UInt.m190constructorimpl(s5 & MAX_VALUE) & 4294967295L) / (i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw */
    private static final int m387floorDivxj2QHRw(short s5, short s9) {
        return (int) ((UInt.m190constructorimpl(s5 & MAX_VALUE) & 4294967295L) / (UInt.m190constructorimpl(s9 & MAX_VALUE) & 4294967295L));
    }

    /* renamed from: hashCode-impl */
    public static int m388hashCodeimpl(short s5) {
        return Short.hashCode(s5);
    }

    @InlineOnly
    /* renamed from: inc-Mh2AYeg */
    private static final short m389incMh2AYeg(short s5) {
        return m376constructorimpl((short) (s5 + 1));
    }

    @InlineOnly
    /* renamed from: inv-Mh2AYeg */
    private static final short m390invMh2AYeg(short s5) {
        return m376constructorimpl((short) (~s5));
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU */
    private static final int m391minus7apg3OU(short s5, byte b10) {
        return UInt.m190constructorimpl(UInt.m190constructorimpl(s5 & MAX_VALUE) - UInt.m190constructorimpl(b10 & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ */
    private static final long m392minusVKZWuLQ(short s5, long j10) {
        return ULong.m269constructorimpl(ULong.m269constructorimpl(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX) - j10);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns */
    private static final int m393minusWZ4Q5Ns(short s5, int i10) {
        return UInt.m190constructorimpl(UInt.m190constructorimpl(s5 & MAX_VALUE) - i10);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw */
    private static final int m394minusxj2QHRw(short s5, short s9) {
        return UInt.m190constructorimpl(UInt.m190constructorimpl(s5 & MAX_VALUE) - UInt.m190constructorimpl(s9 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU */
    private static final byte m395mod7apg3OU(short s5, byte b10) {
        return UByte.m113constructorimpl((byte) ((UInt.m190constructorimpl(s5 & MAX_VALUE) & 4294967295L) % (UInt.m190constructorimpl(b10 & UByte.MAX_VALUE) & 4294967295L)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ */
    private static final long m396modVKZWuLQ(short s5, long j10) {
        long m269constructorimpl = ULong.m269constructorimpl(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX);
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
    private static final int m397modWZ4Q5Ns(short s5, int i10) {
        return (int) ((UInt.m190constructorimpl(s5 & MAX_VALUE) & 4294967295L) % (i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw */
    private static final short m398modxj2QHRw(short s5, short s9) {
        return m376constructorimpl((short) ((UInt.m190constructorimpl(s5 & MAX_VALUE) & 4294967295L) % (UInt.m190constructorimpl(s9 & MAX_VALUE) & 4294967295L)));
    }

    @InlineOnly
    /* renamed from: or-xj2QHRw */
    private static final short m399orxj2QHRw(short s5, short s9) {
        return m376constructorimpl((short) (s5 | s9));
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU */
    private static final int m400plus7apg3OU(short s5, byte b10) {
        return UInt.m190constructorimpl(UInt.m190constructorimpl(b10 & UByte.MAX_VALUE) + UInt.m190constructorimpl(s5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ */
    private static final long m401plusVKZWuLQ(short s5, long j10) {
        return ULong.m269constructorimpl(ULong.m269constructorimpl(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX) + j10);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns */
    private static final int m402plusWZ4Q5Ns(short s5, int i10) {
        return UInt.m190constructorimpl(UInt.m190constructorimpl(s5 & MAX_VALUE) + i10);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw */
    private static final int m403plusxj2QHRw(short s5, short s9) {
        return UInt.m190constructorimpl(UInt.m190constructorimpl(s9 & MAX_VALUE) + UInt.m190constructorimpl(s5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rangeTo-xj2QHRw */
    private static final UIntRange m404rangeToxj2QHRw(short s5, short s9) {
        return new UIntRange(UInt.m190constructorimpl(s5 & MAX_VALUE), UInt.m190constructorimpl(s9 & MAX_VALUE), null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: rangeUntil-xj2QHRw */
    private static final UIntRange m405rangeUntilxj2QHRw(short s5, short s9) {
        return URangesKt.m1362untilJ1ME1BU(UInt.m190constructorimpl(s5 & MAX_VALUE), UInt.m190constructorimpl(s9 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU */
    private static final int m406rem7apg3OU(short s5, byte b10) {
        return (int) ((UInt.m190constructorimpl(s5 & MAX_VALUE) & 4294967295L) % (UInt.m190constructorimpl(b10 & UByte.MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ */
    private static final long m407remVKZWuLQ(short s5, long j10) {
        long m269constructorimpl = ULong.m269constructorimpl(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX);
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
    private static final int m408remWZ4Q5Ns(short s5, int i10) {
        return (int) ((UInt.m190constructorimpl(s5 & MAX_VALUE) & 4294967295L) % (i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw */
    private static final int m409remxj2QHRw(short s5, short s9) {
        return (int) ((UInt.m190constructorimpl(s5 & MAX_VALUE) & 4294967295L) % (UInt.m190constructorimpl(s9 & MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: times-7apg3OU */
    private static final int m410times7apg3OU(short s5, byte b10) {
        return UInt.m190constructorimpl(UInt.m190constructorimpl(b10 & UByte.MAX_VALUE) * UInt.m190constructorimpl(s5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ */
    private static final long m411timesVKZWuLQ(short s5, long j10) {
        return a.c(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX, j10);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns */
    private static final int m412timesWZ4Q5Ns(short s5, int i10) {
        return UInt.m190constructorimpl(UInt.m190constructorimpl(s5 & MAX_VALUE) * i10);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw */
    private static final int m413timesxj2QHRw(short s5, short s9) {
        return UInt.m190constructorimpl(UInt.m190constructorimpl(s9 & MAX_VALUE) * UInt.m190constructorimpl(s5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: toByte-impl */
    private static final byte m414toByteimpl(short s5) {
        return (byte) s5;
    }

    @InlineOnly
    /* renamed from: toDouble-impl */
    private static final double m415toDoubleimpl(short s5) {
        return UnsignedKt.uintToDouble(s5 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toFloat-impl */
    private static final float m416toFloatimpl(short s5) {
        return (float) UnsignedKt.uintToDouble(s5 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toInt-impl */
    private static final int m417toIntimpl(short s5) {
        return s5 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toLong-impl */
    private static final long m418toLongimpl(short s5) {
        return s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX;
    }

    /* renamed from: toString-impl */
    public static String m420toStringimpl(short s5) {
        return String.valueOf(s5 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ */
    private static final byte m421toUBytew2LRezQ(short s5) {
        return UByte.m113constructorimpl((byte) s5);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA */
    private static final int m422toUIntpVg5ArA(short s5) {
        return UInt.m190constructorimpl(s5 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU */
    private static final long m423toULongsVKNKU(short s5) {
        return ULong.m269constructorimpl(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    @InlineOnly
    /* renamed from: xor-xj2QHRw */
    private static final short m425xorxj2QHRw(short s5, short s9) {
        return m376constructorimpl((short) (s5 ^ s9));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.compare(getData() & MAX_VALUE, uShort.getData() & MAX_VALUE);
    }

    public boolean equals(Object other) {
        return m382equalsimpl(this.data, other);
    }

    public int hashCode() {
        return m388hashCodeimpl(this.data);
    }

    public String toString() {
        return m420toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: from getter */
    public final /* synthetic */ short getData() {
        return this.data;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/UShort$Companion;", "", "<init>", "()V", "MIN_VALUE", "Lkotlin/UShort;", ExifInterface.LATITUDE_SOUTH, "MAX_VALUE", "SIZE_BYTES", "", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw */
    private static int m375compareToxj2QHRw(short s5, short s9) {
        return Intrinsics.compare(s5 & MAX_VALUE, s9 & MAX_VALUE);
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl */
    public static short m376constructorimpl(short s5) {
        return s5;
    }

    @InlineOnly
    /* renamed from: toShort-impl */
    private static final short m419toShortimpl(short s5) {
        return s5;
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg */
    private static final short m424toUShortMh2AYeg(short s5) {
        return s5;
    }
}
