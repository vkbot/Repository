package kotlin.text;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\u0010\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\f\n\u0002\b\u000e\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u000f\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\u0001H\u0087\b\u001a\r\u0010\t\u001a\u00020\u0002*\u00020\u0001H\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\n\u001a\u00020\u0005*\u00020\u0001H\u0087\b\u001a\u0015\u0010\n\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\u000b\u001a\u00020\u0004*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\f\u001a\u00020\u0006*\u00020\u0001H\u0087\b\u001a\u0015\u0010\f\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\r\u001a\u00020\u000e*\u00020\u0001H\u0087\b\u001a\r\u0010\u000f\u001a\u00020\u0010*\u00020\u0001H\u0087\b\u001a\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0012\u001a\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0016*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0015\u001a\u00020\u0016*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u000e\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u0001H\u0007\u001a\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\r\u0010\u0018\u001a\u00020\u0019*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0018\u001a\u00020\u0019*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0087\b\u001a\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u0001H\u0007\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0007\u001a4\u0010\u001d\u001a\u0004\u0018\u0001H\u001e\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\u001f\u001a\u00020\u00012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\u001e0!H\u0082\b¢\u0006\u0004\b\"\u0010#\u001a\u0015\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0001H\u0002¢\u0006\u0002\b&\u001a \u0010'\u001a\u0004\u0018\u00010\u00012\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004H\u0083\b¢\u0006\u0002\b*\u001a\u0012\u0010+\u001a\u00020\b*\u00020,H\u0083\b¢\u0006\u0002\b-\u001a\u0012\u0010.\u001a\u00020\b*\u00020,H\u0083\b¢\u0006\u0002\b/\u001a\u0012\u00100\u001a\u00020\u0004*\u00020,H\u0083\b¢\u0006\u0002\b1\u001a6\u00102\u001a\u00020\u0004*\u00020\u00012\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b0!H\u0083\b¢\u0006\u0002\b4\u001a6\u00105\u001a\u00020\u0004*\u00020\u00012\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b0!H\u0083\b¢\u0006\u0002\b6\u001a>\u00107\u001a\u00020\u0004*\u00020\u00012\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u00108\u001a\u00020\b2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b0!H\u0083\b¢\u0006\u0002\b9¨\u0006:"}, d2 = {"toString", "", "", "radix", "", "", "", "toBoolean", "", "toByte", "toShort", "toInt", "toLong", "toFloat", "", "toDouble", "", "toFloatOrNull", "(Ljava/lang/String;)Ljava/lang/Float;", "toDoubleOrNull", "(Ljava/lang/String;)Ljava/lang/Double;", "toBigInteger", "Ljava/math/BigInteger;", "toBigIntegerOrNull", "toBigDecimal", "Ljava/math/BigDecimal;", "mathContext", "Ljava/math/MathContext;", "toBigDecimalOrNull", "screenFloatValue", ExifInterface.GPS_DIRECTION_TRUE, "str", "parse", "Lkotlin/Function1;", "screenFloatValue$StringsKt__StringNumberConversionsJVMKt", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "isValidFloat", "s", "isValidFloat$StringsKt__StringNumberConversionsJVMKt", "guessNamedFloatConstant", "start", "endInclusive", "guessNamedFloatConstant$StringsKt__StringNumberConversionsJVMKt", "isAsciiDigit", "", "isAsciiDigit$StringsKt__StringNumberConversionsJVMKt", "isHexLetter", "isHexLetter$StringsKt__StringNumberConversionsJVMKt", "asciiLetterToLowerCaseCode", "asciiLetterToLowerCaseCode$StringsKt__StringNumberConversionsJVMKt", "advanceWhile", "predicate", "advanceWhile$StringsKt__StringNumberConversionsJVMKt", "backtrackWhile", "backtrackWhile$StringsKt__StringNumberConversionsJVMKt", "advanceAndValidateMantissa", "hexFormat", "advanceAndValidateMantissa$StringsKt__StringNumberConversionsJVMKt", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, xs = "kotlin/text/StringsKt")
@SourceDebugExtension({"SMAP\nStringNumberConversionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n267#1,7:513\n267#1,7:520\n267#1,7:527\n267#1,7:534\n1#2:541\n*S KotlinDebug\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n166#1:513,7\n173#1:520,7\n253#1:527,7\n264#1:534,7\n*E\n"})
/* loaded from: classes2.dex */
class StringsKt__StringNumberConversionsJVMKt extends StringsKt__StringBuilderKt {
    @InlineOnly
    private static final int advanceAndValidateMantissa$StringsKt__StringNumberConversionsJVMKt(String str, int i10, int i11, boolean z9, Function1<? super Character, Boolean> function1) {
        boolean z10;
        boolean z11;
        String str2;
        int i12 = i10;
        while (i12 <= i11 && function1.invoke(Character.valueOf(str.charAt(i12))).booleanValue()) {
            i12++;
        }
        if (i10 != i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 > i11) {
            if (z9) {
                return -1;
            }
            return i12;
        }
        if (str.charAt(i12) == '.') {
            int i13 = i12 + 1;
            int i14 = i13;
            while (i14 <= i11 && function1.invoke(Character.valueOf(str.charAt(i14))).booleanValue()) {
                i14++;
            }
            if (i13 != i14) {
                z11 = true;
            } else {
                z11 = false;
            }
            i12 = i14;
        } else {
            z11 = false;
        }
        if (!z10 && !z11) {
            if (z9) {
                return -1;
            }
            if (i11 == i12 + 2) {
                str2 = "NaN";
            } else if (i11 == i12 + 7) {
                str2 = "Infinity";
            } else {
                str2 = null;
            }
            if (str2 == null || StringsKt__StringsKt.indexOf((CharSequence) str, str2, i12, false) != i12) {
                return -1;
            }
            return i11 + 1;
        }
        return i12;
    }

    @InlineOnly
    private static final int advanceWhile$StringsKt__StringNumberConversionsJVMKt(String str, int i10, int i11, Function1<? super Character, Boolean> function1) {
        while (i10 <= i11 && function1.invoke(Character.valueOf(str.charAt(i10))).booleanValue()) {
            i10++;
        }
        return i10;
    }

    @InlineOnly
    private static final int asciiLetterToLowerCaseCode$StringsKt__StringNumberConversionsJVMKt(char c) {
        return c | ' ';
    }

    @InlineOnly
    private static final int backtrackWhile$StringsKt__StringNumberConversionsJVMKt(String str, int i10, int i11, Function1<? super Character, Boolean> function1) {
        while (i11 > i10 && function1.invoke(Character.valueOf(str.charAt(i11))).booleanValue()) {
            i11--;
        }
        return i11;
    }

    @InlineOnly
    private static final String guessNamedFloatConstant$StringsKt__StringNumberConversionsJVMKt(int i10, int i11) {
        if (i11 == i10 + 2) {
            return "NaN";
        }
        if (i11 == i10 + 7) {
            return "Infinity";
        }
        return null;
    }

    @InlineOnly
    private static final boolean isAsciiDigit$StringsKt__StringNumberConversionsJVMKt(char c) {
        if (((c - '0') & 65535) < 10) {
            return true;
        }
        return false;
    }

    @InlineOnly
    private static final boolean isHexLetter$StringsKt__StringNumberConversionsJVMKt(char c) {
        if ((((c | ' ') - 97) & 65535) < 6) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean isValidFloat$StringsKt__StringNumberConversionsJVMKt(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt__StringNumberConversionsJVMKt.isValidFloat$StringsKt__StringNumberConversionsJVMKt(java.lang.String):boolean");
    }

    private static final <T> T screenFloatValue$StringsKt__StringNumberConversionsJVMKt(String str, Function1<? super String, ? extends T> function1) {
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return function1.invoke(str);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(String str, MathContext mathContext) {
        str.getClass();
        mathContext.getClass();
        return new BigDecimal(str, mathContext);
    }

    @SinceKotlin(version = "1.2")
    public static final BigDecimal toBigDecimalOrNull(String str, MathContext mathContext) {
        str.getClass();
        mathContext.getClass();
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return new BigDecimal(str, mathContext);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger toBigInteger(String str, int i10) {
        str.getClass();
        return new BigInteger(str, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @SinceKotlin(version = "1.2")
    public static final BigInteger toBigIntegerOrNull(String str, int i10) {
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        if (length != 1) {
            if (str.charAt(0) == '-') {
                i11 = 1;
            }
            while (i11 < length) {
                if (CharsKt__CharJVMKt.digitOf(str.charAt(i11), i10) < 0) {
                    return null;
                }
                i11++;
            }
        } else if (CharsKt__CharJVMKt.digitOf(str.charAt(0), i10) < 0) {
            return null;
        }
        return new BigInteger(str, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final boolean toBoolean(String str) {
        return Boolean.parseBoolean(str);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte toByte(String str, int i10) {
        str.getClass();
        return Byte.parseByte(str, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @InlineOnly
    private static final double toDouble(String str) {
        str.getClass();
        return Double.parseDouble(str);
    }

    @SinceKotlin(version = "1.1")
    public static final Double toDoubleOrNull(String str) {
        str.getClass();
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @InlineOnly
    private static final float toFloat(String str) {
        str.getClass();
        return Float.parseFloat(str);
    }

    @SinceKotlin(version = "1.1")
    public static final Float toFloatOrNull(String str) {
        str.getClass();
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int toInt(String str, int i10) {
        str.getClass();
        return Integer.parseInt(str, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long toLong(String str, int i10) {
        str.getClass();
        return Long.parseLong(str, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short toShort(String str, int i10) {
        str.getClass();
        return Short.parseShort(str, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(byte b10, int i10) {
        String num = Integer.toString(b10, CharsKt__CharJVMKt.checkRadix(i10));
        num.getClass();
        return num;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(String str) {
        str.getClass();
        return new BigDecimal(str);
    }

    @InlineOnly
    private static final byte toByte(String str) {
        str.getClass();
        return Byte.parseByte(str);
    }

    @InlineOnly
    private static final int toInt(String str) {
        str.getClass();
        return Integer.parseInt(str);
    }

    @InlineOnly
    private static final long toLong(String str) {
        str.getClass();
        return Long.parseLong(str);
    }

    @InlineOnly
    private static final short toShort(String str) {
        str.getClass();
        return Short.parseShort(str);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(short s5, int i10) {
        String num = Integer.toString(s5, CharsKt__CharJVMKt.checkRadix(i10));
        num.getClass();
        return num;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger toBigInteger(String str) {
        str.getClass();
        return new BigInteger(str);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(int i10, int i11) {
        String num = Integer.toString(i10, CharsKt__CharJVMKt.checkRadix(i11));
        num.getClass();
        return num;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(long j10, int i10) {
        String l10 = Long.toString(j10, CharsKt__CharJVMKt.checkRadix(i10));
        l10.getClass();
        return l10;
    }

    @SinceKotlin(version = "1.2")
    public static final BigDecimal toBigDecimalOrNull(String str) {
        str.getClass();
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return new BigDecimal(str);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @SinceKotlin(version = "1.2")
    public static final BigInteger toBigIntegerOrNull(String str) {
        str.getClass();
        return toBigIntegerOrNull(str, 10);
    }
}
