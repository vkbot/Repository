package kotlin;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0087\b¢\u0006\u0004\b\b\u0010\u0004\u001a\u0014\u0010\t\u001a\u00020\u0002*\u00020\u0002H\u0087\b¢\u0006\u0004\b\n\u0010\u0004\u001a\u0014\u0010\u000b\u001a\u00020\u0002*\u00020\u0002H\u0087\b¢\u0006\u0004\b\f\u0010\u0004\u001a\u001c\u0010\r\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u0014\u0010\t\u001a\u00020\u0013*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u000b\u001a\u00020\u0013*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u001c\u0010\r\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010\u0011\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u001d\u0010\u001c\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u001eH\u0087\b¢\u0006\u0004\b\u001f\u0010 \u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u001eH\u0087\b¢\u0006\u0004\b!\u0010 \u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u001eH\u0087\b¢\u0006\u0004\b\"\u0010 \u001a\u0014\u0010\t\u001a\u00020\u001e*\u00020\u001eH\u0087\b¢\u0006\u0004\b#\u0010$\u001a\u0014\u0010\u000b\u001a\u00020\u001e*\u00020\u001eH\u0087\b¢\u0006\u0004\b%\u0010$\u001a\u001c\u0010\r\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b&\u0010'\u001a\u001c\u0010\u0011\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b(\u0010'\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020)H\u0087\b¢\u0006\u0004\b*\u0010+\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020)H\u0087\b¢\u0006\u0004\b,\u0010+\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020)H\u0087\b¢\u0006\u0004\b-\u0010+\u001a\u0014\u0010\t\u001a\u00020)*\u00020)H\u0087\b¢\u0006\u0004\b.\u0010/\u001a\u0014\u0010\u000b\u001a\u00020)*\u00020)H\u0087\b¢\u0006\u0004\b0\u0010/\u001a\u001c\u0010\r\u001a\u00020)*\u00020)2\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b1\u00102\u001a\u001c\u0010\u0011\u001a\u00020)*\u00020)2\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b3\u00102¨\u00064"}, d2 = {"countOneBits", "", "Lkotlin/UInt;", "countOneBits-WZ4Q5Ns", "(I)I", "countLeadingZeroBits", "countLeadingZeroBits-WZ4Q5Ns", "countTrailingZeroBits", "countTrailingZeroBits-WZ4Q5Ns", "takeHighestOneBit", "takeHighestOneBit-WZ4Q5Ns", "takeLowestOneBit", "takeLowestOneBit-WZ4Q5Ns", "rotateLeft", "bitCount", "rotateLeft-V7xB4Y4", "(II)I", "rotateRight", "rotateRight-V7xB4Y4", "Lkotlin/ULong;", "countOneBits-VKZWuLQ", "(J)I", "countLeadingZeroBits-VKZWuLQ", "countTrailingZeroBits-VKZWuLQ", "takeHighestOneBit-VKZWuLQ", "(J)J", "takeLowestOneBit-VKZWuLQ", "rotateLeft-JSWoG40", "(JI)J", "rotateRight-JSWoG40", "Lkotlin/UByte;", "countOneBits-7apg3OU", "(B)I", "countLeadingZeroBits-7apg3OU", "countTrailingZeroBits-7apg3OU", "takeHighestOneBit-7apg3OU", "(B)B", "takeLowestOneBit-7apg3OU", "rotateLeft-LxnNnR4", "(BI)B", "rotateRight-LxnNnR4", "Lkotlin/UShort;", "countOneBits-xj2QHRw", "(S)I", "countLeadingZeroBits-xj2QHRw", "countTrailingZeroBits-xj2QHRw", "takeHighestOneBit-xj2QHRw", "(S)S", "takeLowestOneBit-xj2QHRw", "rotateLeft-olVBNx4", "(SI)S", "rotateRight-olVBNx4", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "UNumbersKt")
/* loaded from: classes.dex */
public final class UNumbersKt {
    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countLeadingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m341countLeadingZeroBits7apg3OU(byte b10) {
        return Integer.numberOfLeadingZeros(b10 & UByte.MAX_VALUE) - 24;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countLeadingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m342countLeadingZeroBitsVKZWuLQ(long j10) {
        return Long.numberOfLeadingZeros(j10);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countLeadingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m343countLeadingZeroBitsWZ4Q5Ns(int i10) {
        return Integer.numberOfLeadingZeros(i10);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countLeadingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m344countLeadingZeroBitsxj2QHRw(short s5) {
        return Integer.numberOfLeadingZeros(s5 & UShort.MAX_VALUE) - 16;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countOneBits-7apg3OU, reason: not valid java name */
    private static final int m345countOneBits7apg3OU(byte b10) {
        return Integer.bitCount(UInt.m190constructorimpl(b10 & UByte.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countOneBits-VKZWuLQ, reason: not valid java name */
    private static final int m346countOneBitsVKZWuLQ(long j10) {
        return Long.bitCount(j10);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countOneBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m347countOneBitsWZ4Q5Ns(int i10) {
        return Integer.bitCount(i10);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countOneBits-xj2QHRw, reason: not valid java name */
    private static final int m348countOneBitsxj2QHRw(short s5) {
        return Integer.bitCount(UInt.m190constructorimpl(s5 & UShort.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countTrailingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m349countTrailingZeroBits7apg3OU(byte b10) {
        return Integer.numberOfTrailingZeros(b10 | UByte.MIN_VALUE);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countTrailingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m350countTrailingZeroBitsVKZWuLQ(long j10) {
        return Long.numberOfTrailingZeros(j10);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countTrailingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m351countTrailingZeroBitsWZ4Q5Ns(int i10) {
        return Integer.numberOfTrailingZeros(i10);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: countTrailingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m352countTrailingZeroBitsxj2QHRw(short s5) {
        return Integer.numberOfTrailingZeros(s5 | 65536);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateLeft-JSWoG40, reason: not valid java name */
    private static final long m353rotateLeftJSWoG40(long j10, int i10) {
        return ULong.m269constructorimpl(Long.rotateLeft(j10, i10));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateLeft-LxnNnR4, reason: not valid java name */
    private static final byte m354rotateLeftLxnNnR4(byte b10, int i10) {
        return UByte.m113constructorimpl(NumbersKt__NumbersKt.rotateLeft(b10, i10));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateLeft-V7xB4Y4, reason: not valid java name */
    private static final int m355rotateLeftV7xB4Y4(int i10, int i11) {
        return UInt.m190constructorimpl(Integer.rotateLeft(i10, i11));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateLeft-olVBNx4, reason: not valid java name */
    private static final short m356rotateLeftolVBNx4(short s5, int i10) {
        return UShort.m376constructorimpl(NumbersKt__NumbersKt.rotateLeft(s5, i10));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateRight-JSWoG40, reason: not valid java name */
    private static final long m357rotateRightJSWoG40(long j10, int i10) {
        return ULong.m269constructorimpl(Long.rotateRight(j10, i10));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateRight-LxnNnR4, reason: not valid java name */
    private static final byte m358rotateRightLxnNnR4(byte b10, int i10) {
        return UByte.m113constructorimpl(NumbersKt__NumbersKt.rotateRight(b10, i10));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateRight-V7xB4Y4, reason: not valid java name */
    private static final int m359rotateRightV7xB4Y4(int i10, int i11) {
        return UInt.m190constructorimpl(Integer.rotateRight(i10, i11));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* renamed from: rotateRight-olVBNx4, reason: not valid java name */
    private static final short m360rotateRightolVBNx4(short s5, int i10) {
        return UShort.m376constructorimpl(NumbersKt__NumbersKt.rotateRight(s5, i10));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeHighestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m361takeHighestOneBit7apg3OU(byte b10) {
        return UByte.m113constructorimpl((byte) Integer.highestOneBit(b10 & UByte.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeHighestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m362takeHighestOneBitVKZWuLQ(long j10) {
        return ULong.m269constructorimpl(Long.highestOneBit(j10));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeHighestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m363takeHighestOneBitWZ4Q5Ns(int i10) {
        return UInt.m190constructorimpl(Integer.highestOneBit(i10));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeHighestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m364takeHighestOneBitxj2QHRw(short s5) {
        return UShort.m376constructorimpl((short) Integer.highestOneBit(s5 & UShort.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeLowestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m365takeLowestOneBit7apg3OU(byte b10) {
        return UByte.m113constructorimpl((byte) Integer.lowestOneBit(b10 & UByte.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeLowestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m366takeLowestOneBitVKZWuLQ(long j10) {
        return ULong.m269constructorimpl(Long.lowestOneBit(j10));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeLowestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m367takeLowestOneBitWZ4Q5Ns(int i10) {
        return UInt.m190constructorimpl(Integer.lowestOneBit(i10));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: takeLowestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m368takeLowestOneBitxj2QHRw(short s5) {
        return UShort.m376constructorimpl((short) Integer.lowestOneBit(s5 & UShort.MAX_VALUE));
    }
}
