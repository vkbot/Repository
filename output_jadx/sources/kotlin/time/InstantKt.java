package kotlin.time;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Typography;
import kotlin.time.InstantParseResult;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.net.nntp.NNTPReply;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\u0006\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003\u001a\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0003\u001a'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082\b\u001a'\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082\b\u001a\u0010\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u0015H\u0000\u001a\u0014\u0010'\u001a\u00020\u0015*\u00020\u00152\u0006\u0010%\u001a\u00020\u0001H\u0002\u001a\u0014\u0010-\u001a\u00020\u0012*\u00020\u00102\u0006\u0010.\u001a\u00020\u0015H\u0002\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0000\u0010\u0005\"\u001f\u0010\u0006\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0006\u0010\u0005\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0015X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"isDistantPast", "", "Lkotlin/time/Instant;", "isDistantPast$annotations", "(Lkotlin/time/Instant;)V", "(Lkotlin/time/Instant;)Z", "isDistantFuture", "isDistantFuture$annotations", "DISTANT_PAST_SECONDS", "", "DISTANT_FUTURE_SECONDS", "MIN_SECOND", "MAX_SECOND", "parseIso", "Lkotlin/time/InstantParseResult;", "isoString", "", "formatIso", "", "instant", "DAYS_PER_CYCLE", "", "DAYS_0000_TO_1970", "safeAddOrElse", "a", "b", "action", "Lkotlin/Function0;", "", "safeMultiplyOrElse", "SECONDS_PER_HOUR", "SECONDS_PER_MINUTE", "HOURS_PER_DAY", "SECONDS_PER_DAY", "NANOS_PER_SECOND", "NANOS_PER_MILLI", "MILLIS_PER_SECOND", "isLeapYear", "year", "monthLength", "POWERS_OF_TEN", "", "asciiDigitPositionsInIsoStringAfterYear", "colonsInIsoOffsetString", "asciiDigitsInIsoOffsetString", "truncateForErrorMessage", "maxLength", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlin/time/InstantKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Instant.kt\nkotlin/time/UnboundLocalDateTime\n*L\n1#1,864:1\n1#2:865\n479#3,28:866\n*S KotlinDebug\n*F\n+ 1 Instant.kt\nkotlin/time/InstantKt\n*L\n689#1:866,28\n*E\n"})
/* loaded from: classes2.dex */
public final class InstantKt {
    private static final int DAYS_0000_TO_1970 = 719528;
    private static final int DAYS_PER_CYCLE = 146097;
    private static final long DISTANT_FUTURE_SECONDS = 3093527980800L;
    private static final long DISTANT_PAST_SECONDS = -3217862419201L;
    private static final int HOURS_PER_DAY = 24;
    private static final long MAX_SECOND = 31556889864403199L;
    private static final int MILLIS_PER_SECOND = 1000;
    private static final long MIN_SECOND = -31557014167219200L;
    private static final int NANOS_PER_MILLI = 1000000;
    public static final int NANOS_PER_SECOND = 1000000000;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int[] POWERS_OF_TEN = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    private static final int[] asciiDigitPositionsInIsoStringAfterYear = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    private static final int[] colonsInIsoOffsetString = {3, 6};
    private static final int[] asciiDigitsInIsoOffsetString = {1, 2, 4, 5, 7, 8};

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalTime
    public static final String formatIso(Instant instant) {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        UnboundLocalDateTime fromInstant = UnboundLocalDateTime.INSTANCE.fromInstant(instant);
        int year = fromInstant.getYear();
        int i10 = 0;
        if (Math.abs(year) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (year >= 0) {
                sb2.append(year + 10000);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(year - 10000);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append((CharSequence) sb2);
        } else {
            if (year >= 10000) {
                sb.append('+');
            }
            sb.append(year);
        }
        sb.append('-');
        formatIso$lambda$13$appendTwoDigits(sb, sb, fromInstant.getMonth());
        sb.append('-');
        formatIso$lambda$13$appendTwoDigits(sb, sb, fromInstant.getDay());
        sb.append('T');
        formatIso$lambda$13$appendTwoDigits(sb, sb, fromInstant.getHour());
        sb.append(':');
        formatIso$lambda$13$appendTwoDigits(sb, sb, fromInstant.getMinute());
        sb.append(':');
        formatIso$lambda$13$appendTwoDigits(sb, sb, fromInstant.getSecond());
        if (fromInstant.getNanosecond() != 0) {
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            while (true) {
                int nanosecond = fromInstant.getNanosecond();
                iArr = POWERS_OF_TEN;
                int i11 = i10 + 1;
                if (nanosecond % iArr[i11] != 0) {
                    break;
                }
                i10 = i11;
            }
            int i12 = i10 - (i10 % 3);
            String valueOf = String.valueOf((fromInstant.getNanosecond() / iArr[i12]) + iArr[9 - i12]);
            valueOf.getClass();
            sb.append(valueOf.substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }

    private static final void formatIso$lambda$13$appendTwoDigits(Appendable appendable, StringBuilder sb, int i10) {
        if (i10 < 10) {
            appendable.append('0');
        }
        sb.append(i10);
    }

    private static final boolean isDistantFuture(Instant instant) {
        instant.getClass();
        if (instant.compareTo(Instant.INSTANCE.getDISTANT_FUTURE()) >= 0) {
            return true;
        }
        return false;
    }

    private static final boolean isDistantPast(Instant instant) {
        instant.getClass();
        if (instant.compareTo(Instant.INSTANCE.getDISTANT_PAST()) <= 0) {
            return true;
        }
        return false;
    }

    public static final boolean isLeapYear(int i10) {
        if ((i10 & 3) == 0) {
            if (i10 % 100 != 0 || i10 % NNTPReply.SERVICE_DISCONTINUED == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static final int monthLength(int i10, boolean z9) {
        if (i10 != 2) {
            if (i10 != 4 && i10 != 6 && i10 != 9 && i10 != 11) {
                return 31;
            }
            return 30;
        }
        if (z9) {
            return 29;
        }
        return 28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalTime
    public static final InstantParseResult parseIso(CharSequence charSequence) {
        int i10;
        int i11;
        int i12;
        int i13;
        char charAt;
        char charAt2;
        if (charSequence.length() == 0) {
            return new InstantParseResult.Failure("An empty string is not a valid Instant", charSequence);
        }
        char charAt3 = charSequence.charAt(0);
        if (charAt3 == '+' || charAt3 == '-') {
            i10 = 1;
        } else {
            i10 = 0;
            charAt3 = ' ';
        }
        int i14 = 0;
        int i15 = i10;
        while (i15 < charSequence.length() && '0' <= (charAt2 = charSequence.charAt(i15)) && charAt2 < ':') {
            i14 = (i14 * 10) + (charSequence.charAt(i15) - '0');
            i15++;
        }
        int i16 = i15 - i10;
        if (i16 > 10) {
            return parseIso$parseFailure(charSequence, ai.onnxruntime.a.f(i16, "Expected at most 10 digits for the year number, got ", " digits"));
        }
        if (i16 == 10 && Intrinsics.compare((int) charSequence.charAt(i10), 50) >= 0) {
            return parseIso$parseFailure(charSequence, ai.onnxruntime.a.f(i16, "Expected at most 9 digits for the year number or year 1000000000, got ", " digits"));
        }
        if (i16 < 4) {
            return parseIso$parseFailure(charSequence, ai.onnxruntime.a.f(i16, "The year number must be padded to 4 digits, got ", " digits"));
        }
        if (charAt3 == '+' && i16 == 4) {
            return parseIso$parseFailure(charSequence, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
        }
        if (charAt3 == ' ' && i16 != 4) {
            return parseIso$parseFailure(charSequence, "A '+' or '-' sign is required for year numbers longer than 4 digits");
        }
        if (charAt3 == '-') {
            i14 = -i14;
        }
        int i17 = i14;
        int i18 = i15 + 16;
        if (charSequence.length() < i18) {
            return parseIso$parseFailure(charSequence, "The input string is too short");
        }
        final int i19 = 0;
        InstantParseResult.Failure parseIso$expect = parseIso$expect(charSequence, "'-'", i15, new Function1() { // from class: kotlin.time.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean parseIso$lambda$0;
                int i20 = i19;
                char charValue = ((Character) obj).charValue();
                switch (i20) {
                    case 0:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$0(charValue);
                        break;
                    case 1:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$2(charValue);
                        break;
                    case 2:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$4(charValue);
                        break;
                    case 3:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$6(charValue);
                        break;
                    case 4:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$8(charValue);
                        break;
                    default:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$10(charValue);
                        break;
                }
                return Boolean.valueOf(parseIso$lambda$0);
            }
        });
        if (parseIso$expect != null) {
            return parseIso$expect;
        }
        final int i20 = 1;
        InstantParseResult.Failure parseIso$expect2 = parseIso$expect(charSequence, "'-'", i15 + 3, new Function1() { // from class: kotlin.time.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean parseIso$lambda$0;
                int i202 = i20;
                char charValue = ((Character) obj).charValue();
                switch (i202) {
                    case 0:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$0(charValue);
                        break;
                    case 1:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$2(charValue);
                        break;
                    case 2:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$4(charValue);
                        break;
                    case 3:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$6(charValue);
                        break;
                    case 4:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$8(charValue);
                        break;
                    default:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$10(charValue);
                        break;
                }
                return Boolean.valueOf(parseIso$lambda$0);
            }
        });
        if (parseIso$expect2 != null) {
            return parseIso$expect2;
        }
        final int i21 = 2;
        InstantParseResult.Failure parseIso$expect3 = parseIso$expect(charSequence, "'T' or 't'", i15 + 6, new Function1() { // from class: kotlin.time.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean parseIso$lambda$0;
                int i202 = i21;
                char charValue = ((Character) obj).charValue();
                switch (i202) {
                    case 0:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$0(charValue);
                        break;
                    case 1:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$2(charValue);
                        break;
                    case 2:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$4(charValue);
                        break;
                    case 3:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$6(charValue);
                        break;
                    case 4:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$8(charValue);
                        break;
                    default:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$10(charValue);
                        break;
                }
                return Boolean.valueOf(parseIso$lambda$0);
            }
        });
        if (parseIso$expect3 != null) {
            return parseIso$expect3;
        }
        final int i22 = 3;
        InstantParseResult.Failure parseIso$expect4 = parseIso$expect(charSequence, "':'", i15 + 9, new Function1() { // from class: kotlin.time.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean parseIso$lambda$0;
                int i202 = i22;
                char charValue = ((Character) obj).charValue();
                switch (i202) {
                    case 0:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$0(charValue);
                        break;
                    case 1:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$2(charValue);
                        break;
                    case 2:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$4(charValue);
                        break;
                    case 3:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$6(charValue);
                        break;
                    case 4:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$8(charValue);
                        break;
                    default:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$10(charValue);
                        break;
                }
                return Boolean.valueOf(parseIso$lambda$0);
            }
        });
        if (parseIso$expect4 != null) {
            return parseIso$expect4;
        }
        final int i23 = 4;
        InstantParseResult.Failure parseIso$expect5 = parseIso$expect(charSequence, "':'", i15 + 12, new Function1() { // from class: kotlin.time.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean parseIso$lambda$0;
                int i202 = i23;
                char charValue = ((Character) obj).charValue();
                switch (i202) {
                    case 0:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$0(charValue);
                        break;
                    case 1:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$2(charValue);
                        break;
                    case 2:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$4(charValue);
                        break;
                    case 3:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$6(charValue);
                        break;
                    case 4:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$8(charValue);
                        break;
                    default:
                        parseIso$lambda$0 = InstantKt.parseIso$lambda$10(charValue);
                        break;
                }
                return Boolean.valueOf(parseIso$lambda$0);
            }
        });
        if (parseIso$expect5 != null) {
            return parseIso$expect5;
        }
        for (int i24 : asciiDigitPositionsInIsoStringAfterYear) {
            final int i25 = 5;
            InstantParseResult.Failure parseIso$expect6 = parseIso$expect(charSequence, "an ASCII digit", i24 + i15, new Function1() { // from class: kotlin.time.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean parseIso$lambda$0;
                    int i202 = i25;
                    char charValue = ((Character) obj).charValue();
                    switch (i202) {
                        case 0:
                            parseIso$lambda$0 = InstantKt.parseIso$lambda$0(charValue);
                            break;
                        case 1:
                            parseIso$lambda$0 = InstantKt.parseIso$lambda$2(charValue);
                            break;
                        case 2:
                            parseIso$lambda$0 = InstantKt.parseIso$lambda$4(charValue);
                            break;
                        case 3:
                            parseIso$lambda$0 = InstantKt.parseIso$lambda$6(charValue);
                            break;
                        case 4:
                            parseIso$lambda$0 = InstantKt.parseIso$lambda$8(charValue);
                            break;
                        default:
                            parseIso$lambda$0 = InstantKt.parseIso$lambda$10(charValue);
                            break;
                    }
                    return Boolean.valueOf(parseIso$lambda$0);
                }
            });
            if (parseIso$expect6 != null) {
                return parseIso$expect6;
            }
        }
        int parseIso$twoDigitNumber = parseIso$twoDigitNumber(charSequence, i15 + 1);
        int parseIso$twoDigitNumber2 = parseIso$twoDigitNumber(charSequence, i15 + 4);
        int parseIso$twoDigitNumber3 = parseIso$twoDigitNumber(charSequence, i15 + 7);
        int parseIso$twoDigitNumber4 = parseIso$twoDigitNumber(charSequence, i15 + 10);
        int parseIso$twoDigitNumber5 = parseIso$twoDigitNumber(charSequence, i15 + 13);
        int i26 = i15 + 15;
        if (charSequence.charAt(i26) == '.') {
            i26 = i18;
            int i27 = 0;
            while (i26 < charSequence.length() && '0' <= (charAt = charSequence.charAt(i26)) && charAt < ':') {
                i27 = (i27 * 10) + (charSequence.charAt(i26) - '0');
                i26++;
            }
            int i28 = i26 - i18;
            if (1 <= i28 && i28 < 10) {
                i11 = i27 * POWERS_OF_TEN[9 - i28];
            } else {
                return parseIso$parseFailure(charSequence, ai.onnxruntime.a.f(i28, "1..9 digits are supported for the fraction of the second, got ", " digits"));
            }
        } else {
            i11 = 0;
        }
        if (i26 >= charSequence.length()) {
            return parseIso$parseFailure(charSequence, "The UTC offset at the end of the string is missing");
        }
        char charAt4 = charSequence.charAt(i26);
        if (charAt4 != '+' && charAt4 != '-') {
            if (charAt4 != 'Z' && charAt4 != 'z') {
                return parseIso$parseFailure(charSequence, "Expected the UTC offset at position " + i26 + ", got '" + charAt4 + '\'');
            }
            int i29 = i26 + 1;
            if (charSequence.length() != i29) {
                return parseIso$parseFailure(charSequence, ai.onnxruntime.a.e(i29, "Extra text after the instant at position "));
            }
            i13 = 0;
            i12 = 3;
        } else {
            int length = charSequence.length() - i26;
            if (length > 9) {
                return parseIso$parseFailure(charSequence, ai.onnxruntime.a.p(new StringBuilder("The UTC offset string \""), truncateForErrorMessage(charSequence.subSequence(i26, charSequence.length()).toString(), 16), "\" is too long"));
            }
            if (length % 3 != 0) {
                return parseIso$parseFailure(charSequence, "Invalid UTC offset string \"" + charSequence.subSequence(i26, charSequence.length()).toString() + Typography.quote);
            }
            for (int i30 : colonsInIsoOffsetString) {
                int i31 = i26 + i30;
                if (i31 >= charSequence.length()) {
                    break;
                }
                if (charSequence.charAt(i31) != ':') {
                    StringBuilder q8 = ai.onnxruntime.a.q(i31, "Expected ':' at index ", ", got '");
                    q8.append(charSequence.charAt(i31));
                    q8.append('\'');
                    return parseIso$parseFailure(charSequence, q8.toString());
                }
            }
            int[] iArr = asciiDigitsInIsoOffsetString;
            int length2 = iArr.length;
            int i32 = 0;
            while (i32 < length2) {
                int i33 = iArr[i32] + i26;
                if (i33 >= charSequence.length()) {
                    break;
                }
                char charAt5 = charSequence.charAt(i33);
                int[] iArr2 = iArr;
                if ('0' > charAt5 || charAt5 >= ':') {
                    StringBuilder q9 = ai.onnxruntime.a.q(i33, "Expected an ASCII digit at index ", ", got '");
                    q9.append(charSequence.charAt(i33));
                    q9.append('\'');
                    return parseIso$parseFailure(charSequence, q9.toString());
                }
                i32++;
                iArr = iArr2;
            }
            int parseIso$twoDigitNumber6 = parseIso$twoDigitNumber(charSequence, i26 + 1);
            i12 = 3;
            int parseIso$twoDigitNumber7 = length > 3 ? parseIso$twoDigitNumber(charSequence, i26 + 4) : 0;
            int parseIso$twoDigitNumber8 = length > 6 ? parseIso$twoDigitNumber(charSequence, i26 + 7) : 0;
            if (parseIso$twoDigitNumber7 > 59) {
                return parseIso$parseFailure(charSequence, ai.onnxruntime.a.e(parseIso$twoDigitNumber7, "Expected offset-minute-of-hour in 0..59, got "));
            }
            if (parseIso$twoDigitNumber8 > 59) {
                return parseIso$parseFailure(charSequence, ai.onnxruntime.a.e(parseIso$twoDigitNumber8, "Expected offset-second-of-minute in 0..59, got "));
            }
            if (parseIso$twoDigitNumber6 > 17 && (parseIso$twoDigitNumber6 != 18 || parseIso$twoDigitNumber7 != 0 || parseIso$twoDigitNumber8 != 0)) {
                return parseIso$parseFailure(charSequence, "Expected an offset in -18:00..+18:00, got " + charSequence.subSequence(i26, charSequence.length()).toString());
            }
            i13 = (charAt4 == '-' ? -1 : 1) * ((parseIso$twoDigitNumber7 * SECONDS_PER_MINUTE) + (parseIso$twoDigitNumber6 * SECONDS_PER_HOUR) + parseIso$twoDigitNumber8);
        }
        if (1 <= parseIso$twoDigitNumber && parseIso$twoDigitNumber < 13) {
            if (1 > parseIso$twoDigitNumber2 || parseIso$twoDigitNumber2 > monthLength(parseIso$twoDigitNumber, isLeapYear(i17))) {
                StringBuilder v9 = ai.onnxruntime.a.v("Expected a valid day-of-month for month ", parseIso$twoDigitNumber, i17, " of year ", ", got ");
                v9.append(parseIso$twoDigitNumber2);
                return parseIso$parseFailure(charSequence, v9.toString());
            }
            if (parseIso$twoDigitNumber3 > 23) {
                return parseIso$parseFailure(charSequence, ai.onnxruntime.a.e(parseIso$twoDigitNumber3, "Expected hour in 0..23, got "));
            }
            if (parseIso$twoDigitNumber4 > 59) {
                return parseIso$parseFailure(charSequence, ai.onnxruntime.a.e(parseIso$twoDigitNumber4, "Expected minute-of-hour in 0..59, got "));
            }
            if (parseIso$twoDigitNumber5 > 59) {
                return parseIso$parseFailure(charSequence, ai.onnxruntime.a.e(parseIso$twoDigitNumber5, "Expected second-of-minute in 0..59, got "));
            }
            UnboundLocalDateTime unboundLocalDateTime = new UnboundLocalDateTime(i17, parseIso$twoDigitNumber, parseIso$twoDigitNumber2, parseIso$twoDigitNumber3, parseIso$twoDigitNumber4, parseIso$twoDigitNumber5, i11);
            long year = unboundLocalDateTime.getYear();
            long j10 = 365 * year;
            long month = (year >= 0 ? ((year + 399) / NNTPReply.SERVICE_DISCONTINUED) + (((i12 + year) / 4) - ((99 + year) / 100)) + j10 : j10 - ((year / (-400)) + ((year / (-4)) - (year / (-100))))) + (((unboundLocalDateTime.getMonth() * 367) - 362) / 12) + (unboundLocalDateTime.getDay() - 1);
            if (unboundLocalDateTime.getMonth() > 2) {
                month = !isLeapYear(unboundLocalDateTime.getYear()) ? month - 2 : (-1) + month;
            }
            return new InstantParseResult.Success((((month - DAYS_0000_TO_1970) * SECONDS_PER_DAY) + (((unboundLocalDateTime.getMinute() * SECONDS_PER_MINUTE) + (unboundLocalDateTime.getHour() * SECONDS_PER_HOUR)) + unboundLocalDateTime.getSecond())) - i13, unboundLocalDateTime.getNanosecond());
        }
        return parseIso$parseFailure(charSequence, ai.onnxruntime.a.e(parseIso$twoDigitNumber, "Expected a month number in 1..12, got "));
    }

    private static final InstantParseResult.Failure parseIso$expect(CharSequence charSequence, String str, int i10, Function1<? super Character, Boolean> function1) {
        char charAt = charSequence.charAt(i10);
        if (function1.invoke(Character.valueOf(charAt)).booleanValue()) {
            return null;
        }
        return parseIso$parseFailure(charSequence, "Expected " + str + ", but got '" + charAt + "' at position " + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$0(char c) {
        if (c == '-') {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$10(char c) {
        if ('0' > c || c >= ':') {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$2(char c) {
        if (c == '-') {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$4(char c) {
        if (c != 'T' && c != 't') {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$6(char c) {
        if (c == ':') {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseIso$lambda$8(char c) {
        if (c == ':') {
            return true;
        }
        return false;
    }

    private static final InstantParseResult.Failure parseIso$parseFailure(CharSequence charSequence, String str) {
        StringBuilder w = ai.onnxruntime.a.w(str, " when parsing an Instant from \"");
        w.append(truncateForErrorMessage(charSequence, 64));
        w.append(Typography.quote);
        return new InstantParseResult.Failure(w.toString(), charSequence);
    }

    private static final int parseIso$twoDigitNumber(CharSequence charSequence, int i10) {
        return (charSequence.charAt(i10 + 1) - '0') + ((charSequence.charAt(i10) - '0') * 10);
    }

    private static final long safeAddOrElse(long j10, long j11, Function0 function0) {
        long j12 = j10 + j11;
        if ((j10 ^ j12) < 0 && (j10 ^ j11) >= 0) {
            function0.invoke();
            throw new KotlinNothingValueException();
        }
        return j12;
    }

    private static final long safeMultiplyOrElse(long j10, long j11, Function0 function0) {
        if (j11 == 1) {
            return j10;
        }
        if (j10 == 1) {
            return j11;
        }
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        long j12 = j10 * j11;
        if (j12 / j11 == j10 && ((j10 != Long.MIN_VALUE || j11 != -1) && (j11 != Long.MIN_VALUE || j10 != -1))) {
            return j12;
        }
        function0.invoke();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String truncateForErrorMessage(CharSequence charSequence, int i10) {
        if (charSequence.length() <= i10) {
            return charSequence.toString();
        }
        return charSequence.subSequence(0, i10).toString() + "...";
    }

    @SinceKotlin(version = "2.1")
    @InlineOnly
    @ExperimentalTime
    public static /* synthetic */ void isDistantFuture$annotations(Instant instant) {
    }

    @SinceKotlin(version = "2.1")
    @InlineOnly
    @ExperimentalTime
    public static /* synthetic */ void isDistantPast$annotations(Instant instant) {
    }
}
