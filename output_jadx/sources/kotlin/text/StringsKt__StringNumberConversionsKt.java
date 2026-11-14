package kotlin.text;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u001b\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u0002H\u0007¢\u0006\u0002\u0010\t\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\n\u001a\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005*\u00020\u0002H\u0007¢\u0006\u0002\u0010\f\u001a\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\r\u001a\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0010\u001a\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¨\u0006\u0015"}, d2 = {"toByteOrNull", "", "", "(Ljava/lang/String;)Ljava/lang/Byte;", "radix", "", "(Ljava/lang/String;I)Ljava/lang/Byte;", "toShortOrNull", "", "(Ljava/lang/String;)Ljava/lang/Short;", "(Ljava/lang/String;I)Ljava/lang/Short;", "toIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "(Ljava/lang/String;I)Ljava/lang/Integer;", "toLongOrNull", "", "(Ljava/lang/String;)Ljava/lang/Long;", "(Ljava/lang/String;I)Ljava/lang/Long;", "numberFormatError", "", "input", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, xs = "kotlin/text/StringsKt")
/* loaded from: classes2.dex */
public class StringsKt__StringNumberConversionsKt extends StringsKt__StringNumberConversionsJVMKt {
    public static final Void numberFormatError(String str) {
        str.getClass();
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    @SinceKotlin(version = "1.1")
    public static final Byte toByteOrNull(String str, int i10) {
        int intValue;
        str.getClass();
        Integer intOrNull = toIntOrNull(str, i10);
        if (intOrNull == null || (intValue = intOrNull.intValue()) < -128 || intValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) intValue);
    }

    @SinceKotlin(version = "1.1")
    public static final Integer toIntOrNull(String str, int i10) {
        boolean z9;
        int i11;
        int i12;
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char charAt = str.charAt(0);
        int i14 = -2147483647;
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            i11 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt != '+') {
                if (charAt != '-') {
                    return null;
                }
                i14 = Integer.MIN_VALUE;
                z9 = true;
            } else {
                z9 = false;
            }
        } else {
            z9 = false;
            i11 = 0;
        }
        int i15 = -59652323;
        while (i11 < length) {
            int digitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i11), i10);
            if (digitOf < 0) {
                return null;
            }
            if ((i13 < i15 && (i15 != -59652323 || i13 < (i15 = i14 / i10))) || (i12 = i13 * i10) < i14 + digitOf) {
                return null;
            }
            i13 = i12 - digitOf;
            i11++;
        }
        if (z9) {
            return Integer.valueOf(i13);
        }
        return Integer.valueOf(-i13);
    }

    @SinceKotlin(version = "1.1")
    public static final Long toLongOrNull(String str, int i10) {
        boolean z9;
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(i10);
        int length = str.length();
        Long l10 = null;
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char charAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            z9 = true;
            if (length == 1) {
                return null;
            }
            if (charAt != '+') {
                if (charAt != '-') {
                    return null;
                }
                j10 = Long.MIN_VALUE;
                i11 = 1;
            } else {
                z9 = false;
                i11 = 1;
            }
        } else {
            z9 = false;
        }
        long j11 = 0;
        long j12 = -256204778801521550L;
        while (i11 < length) {
            int digitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i11), i10);
            if (digitOf < 0) {
                return l10;
            }
            if (j11 < j12) {
                if (j12 == -256204778801521550L) {
                    j12 = j10 / i10;
                    if (j11 < j12) {
                        return l10;
                    }
                } else {
                    return l10;
                }
            }
            Long l11 = l10;
            int i12 = i11;
            long j13 = j11 * i10;
            long j14 = digitOf;
            if (j13 < j10 + j14) {
                return l11;
            }
            j11 = j13 - j14;
            i11 = i12 + 1;
            l10 = l11;
        }
        if (z9) {
            return Long.valueOf(j11);
        }
        return Long.valueOf(-j11);
    }

    @SinceKotlin(version = "1.1")
    public static final Short toShortOrNull(String str, int i10) {
        int intValue;
        str.getClass();
        Integer intOrNull = toIntOrNull(str, i10);
        if (intOrNull == null || (intValue = intOrNull.intValue()) < -32768 || intValue > 32767) {
            return null;
        }
        return Short.valueOf((short) intValue);
    }

    @SinceKotlin(version = "1.1")
    public static final Byte toByteOrNull(String str) {
        str.getClass();
        return toByteOrNull(str, 10);
    }

    @SinceKotlin(version = "1.1")
    public static final Short toShortOrNull(String str) {
        str.getClass();
        return toShortOrNull(str, 10);
    }

    @SinceKotlin(version = "1.1")
    public static Integer toIntOrNull(String str) {
        str.getClass();
        return toIntOrNull(str, 10);
    }

    @SinceKotlin(version = "1.1")
    public static Long toLongOrNull(String str) {
        str.getClass();
        return toLongOrNull(str, 10);
    }
}
