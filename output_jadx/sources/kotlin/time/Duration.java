package kotlin.time;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import j1.i;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt__StringsKt;
import org.apache.commons.io.FilenameUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@SinceKotlin(version = "1.6")
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u0089\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0089\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b%\u0010(J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b*\u0010&J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b*\u0010(J\u0018\u0010)\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H\u0000¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\r¢\u0006\u0004\b2\u0010\u000fJ\r\u00103\u001a\u00020\r¢\u0006\u0004\b4\u0010\u000fJ\r\u00105\u001a\u00020\r¢\u0006\u0004\b6\u0010\u000fJ\r\u00107\u001a\u00020\r¢\u0006\u0004\b8\u0010\u000fJ\u0018\u0010;\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u009d\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2u\u0010@\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(D\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0AH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010JJ\u0088\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2`\u0010@\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0KH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010LJs\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2K\u0010@\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0MH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010NJ^\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?26\u0010@\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0OH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010PJ\u0015\u0010^\u001a\u00020'2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bb\u00100J\u0015\u0010c\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bd\u0010eJ\u000f\u0010t\u001a\u00020uH\u0016¢\u0006\u0004\bv\u0010wJA\u0010x\u001a\u00020y*\u00060zj\u0002`{2\u0006\u0010|\u001a\u00020\t2\u0006\u0010}\u001a\u00020\t2\u0006\u0010~\u001a\u00020\t2\u0006\u0010.\u001a\u00020u2\u0006\u0010\u007f\u001a\u00020\rH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J!\u0010t\u001a\u00020u2\u0006\u0010.\u001a\u00020\u00132\t\b\u0002\u0010\u0082\u0001\u001a\u00020\t¢\u0006\u0005\bv\u0010\u0083\u0001J\u000f\u0010\u0084\u0001\u001a\u00020u¢\u0006\u0005\b\u0085\u0001\u0010wJ\u0015\u0010\u0086\u0001\u001a\u00020\r2\t\u0010\u0019\u001a\u0005\u0018\u00010\u0087\u0001HÖ\u0003J\n\u0010\u0088\u0001\u001a\u00020\tHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0015\u0010\b\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u00109\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b:\u0010\u0005R\u001a\u0010Q\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bR\u0010S\u001a\u0004\bT\u0010\u000bR\u001a\u0010U\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bV\u0010S\u001a\u0004\bW\u0010\u000bR\u001a\u0010X\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bY\u0010S\u001a\u0004\bZ\u0010\u000bR\u001a\u0010[\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\\\u0010S\u001a\u0004\b]\u0010\u000bR\u0011\u0010f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bg\u0010\u0005R\u0011\u0010h\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bi\u0010\u0005R\u0011\u0010j\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bk\u0010\u0005R\u0011\u0010l\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bm\u0010\u0005R\u0011\u0010n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bo\u0010\u0005R\u0011\u0010p\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bq\u0010\u0005R\u0011\u0010r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bs\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008a\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "value", "getValue-impl", "unitDiscriminator", "", "getUnitDiscriminator-impl", "(J)I", "isInNanos", "", "isInNanos-impl", "(J)Z", "isInMillis", "isInMillis-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unaryMinus", "unaryMinus-UwyO8pc", "plus", "other", "plus-LRDsOJo", "(JJ)J", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "minus", "minus-LRDsOJo", "times", "scale", "times-UwyO8pc", "(JI)J", "", "(JD)J", "div", "div-UwyO8pc", "div-LRDsOJo", "(JJ)D", "truncateTo", "unit", "truncateTo-UwyO8pc$kotlin_stdlib", "(JLkotlin/time/DurationUnit;)J", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "isInfinite", "isInfinite-impl", "isFinite", "isFinite-impl", "absoluteValue", "getAbsoluteValue-UwyO8pc", "compareTo", "compareTo-LRDsOJo", "(JJ)I", "toComponents", ExifInterface.GPS_DIRECTION_TRUE, "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "hoursComponent", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "toDouble", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toLong", "toLong-impl", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeSeconds", "getInWholeSeconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "toIsoString", "toIsoString-impl", "equals", "", "hashCode", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1062:1\n37#1:1063\n37#1:1064\n37#1:1065\n37#1:1066\n37#1:1067\n500#1:1068\n517#1:1076\n170#2,6:1069\n1#3:1075\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n38#1:1063\n39#1:1064\n274#1:1065\n294#1:1066\n478#1:1067\n727#1:1068\n818#1:1076\n769#1:1069,6\n*E\n"})
/* loaded from: classes2.dex */
public final class Duration implements Comparable<Duration> {
    private final long rawValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long ZERO = m1419constructorimpl(0);
    private static final long INFINITE = DurationKt.access$durationOfMillis(DurationKt.MAX_MILLIS);
    private static final long NEG_INFINITE = DurationKt.access$durationOfMillis(-4611686018427387903L);

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0015\u00100\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0004\b5\u00103J\u0015\u00106\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0002\b7J\u0015\u00108\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0002\b9R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001bR\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001dR\u001f\u0010!\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u001f\u0010!\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001bR\u001f\u0010!\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001dR\u001f\u0010$\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u001f\u0010$\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001bR\u001f\u0010$\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001dR\u001f\u0010'\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0018R\u001f\u0010'\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u001bR\u001f\u0010'\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001dR\u001f\u0010*\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018R\u001f\u0010*\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001bR\u001f\u0010*\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010\u001dR\u001f\u0010-\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u0016\u001a\u0004\b/\u0010\u0018R\u001f\u0010-\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u001bR\u001f\u0010-\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u001d¨\u0006:"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "<init>", "()V", "ZERO", "Lkotlin/time/Duration;", "getZERO-UwyO8pc", "()J", "J", "INFINITE", "getINFINITE-UwyO8pc", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "convert", "", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "nanoseconds", "", "getNanoseconds-UwyO8pc$annotations", "(I)V", "getNanoseconds-UwyO8pc", "(I)J", "", "(J)V", "(J)J", "(D)V", "(D)J", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "days", "getDays-UwyO8pc$annotations", "getDays-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseOrNull", "parseOrNull-FghU774", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1467getDaysUwyO8pc(int i10) {
            return DurationKt.toDuration(i10, DurationUnit.DAYS);
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1473getHoursUwyO8pc(int i10) {
            return DurationKt.toDuration(i10, DurationUnit.HOURS);
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1479getMicrosecondsUwyO8pc(int i10) {
            return DurationKt.toDuration(i10, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1485getMillisecondsUwyO8pc(int i10) {
            return DurationKt.toDuration(i10, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1491getMinutesUwyO8pc(int i10) {
            return DurationKt.toDuration(i10, DurationUnit.MINUTES);
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1497getNanosecondsUwyO8pc(int i10) {
            return DurationKt.toDuration(i10, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1503getSecondsUwyO8pc(int i10) {
            return DurationKt.toDuration(i10, DurationUnit.SECONDS);
        }

        @ExperimentalTime
        public final double convert(double value, DurationUnit sourceUnit, DurationUnit targetUnit) {
            sourceUnit.getClass();
            targetUnit.getClass();
            return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(value, sourceUnit, targetUnit);
        }

        /* renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m1508getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m1509getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        /* renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m1510getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        /* renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m1511parseUwyO8pc(String value) {
            value.getClass();
            try {
                return DurationKt.access$parseDuration(value, false);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(ai.onnxruntime.a.m("Invalid duration string format: '", value, "'."), e);
            }
        }

        /* renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m1512parseIsoStringUwyO8pc(String value) {
            value.getClass();
            try {
                return DurationKt.access$parseDuration(value, true);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(ai.onnxruntime.a.m("Invalid ISO duration string format: '", value, "'."), e);
            }
        }

        /* renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final Duration m1513parseIsoStringOrNullFghU774(String value) {
            value.getClass();
            try {
                return Duration.m1417boximpl(DurationKt.access$parseDuration(value, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final Duration m1514parseOrNullFghU774(String value) {
            value.getClass();
            try {
                return Duration.m1417boximpl(DurationKt.access$parseDuration(value, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1470getDaysUwyO8pc$annotations(int i10) {
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1476getHoursUwyO8pc$annotations(int i10) {
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1482getMicrosecondsUwyO8pc$annotations(int i10) {
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1488getMillisecondsUwyO8pc$annotations(int i10) {
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1494getMinutesUwyO8pc$annotations(int i10) {
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1500getNanosecondsUwyO8pc$annotations(int i10) {
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1506getSecondsUwyO8pc$annotations(int i10) {
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1471getDaysUwyO8pc$annotations(long j10) {
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1477getHoursUwyO8pc$annotations(long j10) {
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1483getMicrosecondsUwyO8pc$annotations(long j10) {
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1489getMillisecondsUwyO8pc$annotations(long j10) {
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1495getMinutesUwyO8pc$annotations(long j10) {
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1501getNanosecondsUwyO8pc$annotations(long j10) {
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1507getSecondsUwyO8pc$annotations(long j10) {
        }

        private Companion() {
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1468getDaysUwyO8pc(long j10) {
            return DurationKt.toDuration(j10, DurationUnit.DAYS);
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1474getHoursUwyO8pc(long j10) {
            return DurationKt.toDuration(j10, DurationUnit.HOURS);
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1480getMicrosecondsUwyO8pc(long j10) {
            return DurationKt.toDuration(j10, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1486getMillisecondsUwyO8pc(long j10) {
            return DurationKt.toDuration(j10, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1492getMinutesUwyO8pc(long j10) {
            return DurationKt.toDuration(j10, DurationUnit.MINUTES);
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1498getNanosecondsUwyO8pc(long j10) {
            return DurationKt.toDuration(j10, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1504getSecondsUwyO8pc(long j10) {
            return DurationKt.toDuration(j10, DurationUnit.SECONDS);
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1466getDaysUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.DAYS);
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1472getHoursUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.HOURS);
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1478getMicrosecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1484getMillisecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1490getMinutesUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MINUTES);
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1496getNanosecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1502getSecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1469getDaysUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1475getHoursUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1481getMicrosecondsUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1487getMillisecondsUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1493getMinutesUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1499getNanosecondsUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1505getSecondsUwyO8pc$annotations(double d) {
        }
    }

    private /* synthetic */ Duration(long j10) {
        this.rawValue = j10;
    }

    /* renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m1415addValuesMixedRangesUwyO8pc(long j10, long j11, long j12) {
        long access$nanosToMillis = DurationKt.access$nanosToMillis(j12);
        long j13 = j11 + access$nanosToMillis;
        if (-4611686018426L <= j13 && j13 < 4611686018427L) {
            return DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(j13) + (j12 - DurationKt.access$millisToNanos(access$nanosToMillis)));
        }
        return DurationKt.access$durationOfMillis(RangesKt.coerceIn(j13, -4611686018427387903L, DurationKt.MAX_MILLIS));
    }

    /* renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m1416appendFractionalimpl(long j10, StringBuilder sb, int i10, int i11, int i12, String str, boolean z9) {
        String padStart;
        sb.append(i10);
        if (i11 != 0) {
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            padStart = StringsKt__StringsKt.padStart(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = padStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (padStart.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (!z9 && i15 < 3) {
                sb.append((CharSequence) padStart, 0, i15);
            } else {
                sb.append((CharSequence) padStart, 0, ((i13 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m1417boximpl(long j10) {
        return new Duration(j10);
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m1418compareToLRDsOJo(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 >= 0 && (((int) j12) & 1) != 0) {
            int i10 = (((int) j10) & 1) - (((int) j11) & 1);
            if (m1445isNegativeimpl(j10)) {
                return -i10;
            }
            return i10;
        }
        return Intrinsics.compare(j10, j11);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1419constructorimpl(long j10) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m1443isInNanosimpl(j10)) {
                long m1439getValueimpl = m1439getValueimpl(j10);
                if (-4611686018426999999L <= m1439getValueimpl && m1439getValueimpl < 4611686018427000000L) {
                    return j10;
                }
                i.e(ai.onnxruntime.a.n(new StringBuilder(), m1439getValueimpl(j10), " ns is out of nanoseconds range"));
                return 0L;
            }
            long m1439getValueimpl2 = m1439getValueimpl(j10);
            if (-4611686018427387903L <= m1439getValueimpl2 && m1439getValueimpl2 < 4611686018427387904L) {
                long m1439getValueimpl3 = m1439getValueimpl(j10);
                if (-4611686018426L <= m1439getValueimpl3) {
                    if (m1439getValueimpl3 >= 4611686018427L) {
                        return j10;
                    }
                    i.e(ai.onnxruntime.a.n(new StringBuilder(), m1439getValueimpl(j10), " ms is denormalized"));
                    return 0L;
                }
                return j10;
            }
            i.e(ai.onnxruntime.a.n(new StringBuilder(), m1439getValueimpl(j10), " ms is out of milliseconds range"));
            return 0L;
        }
        return j10;
    }

    /* renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m1420divLRDsOJo(long j10, long j11) {
        Comparable maxOf;
        maxOf = ComparisonsKt___ComparisonsJvmKt.maxOf(m1437getStorageUnitimpl(j10), m1437getStorageUnitimpl(j11));
        DurationUnit durationUnit = (DurationUnit) maxOf;
        return m1455toDoubleimpl(j10, durationUnit) / m1455toDoubleimpl(j11, durationUnit);
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m1422divUwyO8pc(long j10, int i10) {
        if (i10 == 0) {
            if (m1446isPositiveimpl(j10)) {
                return INFINITE;
            }
            if (m1445isNegativeimpl(j10)) {
                return NEG_INFINITE;
            }
            i.k("Dividing zero duration by zero yields an undefined result.");
            return 0L;
        }
        if (m1443isInNanosimpl(j10)) {
            return DurationKt.access$durationOfNanos(m1439getValueimpl(j10) / i10);
        }
        if (m1444isInfiniteimpl(j10)) {
            return m1450timesUwyO8pc(j10, MathKt.getSign(i10));
        }
        long j11 = i10;
        long m1439getValueimpl = m1439getValueimpl(j10) / j11;
        if (-4611686018426L <= m1439getValueimpl && m1439getValueimpl < 4611686018427L) {
            return DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(m1439getValueimpl) + (DurationKt.access$millisToNanos(m1439getValueimpl(j10) - (m1439getValueimpl * j11)) / j11));
        }
        return DurationKt.access$durationOfMillis(m1439getValueimpl);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1423equalsimpl(long j10, Object obj) {
        if (!(obj instanceof Duration) || j10 != ((Duration) obj).getRawValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1424equalsimpl0(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    /* renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m1425getAbsoluteValueUwyO8pc(long j10) {
        if (m1445isNegativeimpl(j10)) {
            return m1463unaryMinusUwyO8pc(j10);
        }
        return j10;
    }

    /* renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m1426getHoursComponentimpl(long j10) {
        if (m1444isInfiniteimpl(j10)) {
            return 0;
        }
        return (int) (m1428getInWholeHoursimpl(j10) % 24);
    }

    /* renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m1427getInWholeDaysimpl(long j10) {
        return m1458toLongimpl(j10, DurationUnit.DAYS);
    }

    /* renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m1428getInWholeHoursimpl(long j10) {
        return m1458toLongimpl(j10, DurationUnit.HOURS);
    }

    /* renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m1429getInWholeMicrosecondsimpl(long j10) {
        return m1458toLongimpl(j10, DurationUnit.MICROSECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m1430getInWholeMillisecondsimpl(long j10) {
        if (m1442isInMillisimpl(j10) && m1441isFiniteimpl(j10)) {
            return m1439getValueimpl(j10);
        }
        return m1458toLongimpl(j10, DurationUnit.MILLISECONDS);
    }

    /* renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m1431getInWholeMinutesimpl(long j10) {
        return m1458toLongimpl(j10, DurationUnit.MINUTES);
    }

    /* renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m1432getInWholeNanosecondsimpl(long j10) {
        long m1439getValueimpl = m1439getValueimpl(j10);
        if (m1443isInNanosimpl(j10)) {
            return m1439getValueimpl;
        }
        if (m1439getValueimpl > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (m1439getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return DurationKt.access$millisToNanos(m1439getValueimpl);
    }

    /* renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m1433getInWholeSecondsimpl(long j10) {
        return m1458toLongimpl(j10, DurationUnit.SECONDS);
    }

    /* renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m1434getMinutesComponentimpl(long j10) {
        if (m1444isInfiniteimpl(j10)) {
            return 0;
        }
        return (int) (m1431getInWholeMinutesimpl(j10) % 60);
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m1435getNanosecondsComponentimpl(long j10) {
        long m1439getValueimpl;
        if (m1444isInfiniteimpl(j10)) {
            return 0;
        }
        if (m1442isInMillisimpl(j10)) {
            m1439getValueimpl = DurationKt.access$millisToNanos(m1439getValueimpl(j10) % 1000);
        } else {
            m1439getValueimpl = m1439getValueimpl(j10) % 1000000000;
        }
        return (int) m1439getValueimpl;
    }

    /* renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m1436getSecondsComponentimpl(long j10) {
        if (m1444isInfiniteimpl(j10)) {
            return 0;
        }
        return (int) (m1433getInWholeSecondsimpl(j10) % 60);
    }

    /* renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m1437getStorageUnitimpl(long j10) {
        if (m1443isInNanosimpl(j10)) {
            return DurationUnit.NANOSECONDS;
        }
        return DurationUnit.MILLISECONDS;
    }

    /* renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m1438getUnitDiscriminatorimpl(long j10) {
        return ((int) j10) & 1;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    private static final long m1439getValueimpl(long j10) {
        return j10 >> 1;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1440hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m1441isFiniteimpl(long j10) {
        return !m1444isInfiniteimpl(j10);
    }

    /* renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m1442isInMillisimpl(long j10) {
        if ((((int) j10) & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m1443isInNanosimpl(long j10) {
        if ((((int) j10) & 1) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m1444isInfiniteimpl(long j10) {
        if (j10 != INFINITE && j10 != NEG_INFINITE) {
            return false;
        }
        return true;
    }

    /* renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m1445isNegativeimpl(long j10) {
        if (j10 < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m1446isPositiveimpl(long j10) {
        if (j10 > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m1447minusLRDsOJo(long j10, long j11) {
        return m1448plusLRDsOJo(j10, m1463unaryMinusUwyO8pc(j11));
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m1448plusLRDsOJo(long j10, long j11) {
        if (m1444isInfiniteimpl(j10)) {
            if (!m1441isFiniteimpl(j11) && (j11 ^ j10) < 0) {
                i.k("Summing infinite durations of different signs yields an undefined result.");
                return 0L;
            }
            return j10;
        }
        if (m1444isInfiniteimpl(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) == (((int) j11) & 1)) {
            long m1439getValueimpl = m1439getValueimpl(j10) + m1439getValueimpl(j11);
            if (m1443isInNanosimpl(j10)) {
                return DurationKt.access$durationOfNanosNormalized(m1439getValueimpl);
            }
            return DurationKt.access$durationOfMillisNormalized(m1439getValueimpl);
        }
        if (m1442isInMillisimpl(j10)) {
            return m1415addValuesMixedRangesUwyO8pc(j10, m1439getValueimpl(j10), m1439getValueimpl(j11));
        }
        return m1415addValuesMixedRangesUwyO8pc(j10, m1439getValueimpl(j11), m1439getValueimpl(j10));
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m1450timesUwyO8pc(long j10, int i10) {
        if (m1444isInfiniteimpl(j10)) {
            if (i10 != 0) {
                if (i10 > 0) {
                    return j10;
                }
                return m1463unaryMinusUwyO8pc(j10);
            }
            i.k("Multiplying infinite duration by zero yields an undefined result.");
            return 0L;
        }
        if (i10 == 0) {
            return ZERO;
        }
        long m1439getValueimpl = m1439getValueimpl(j10);
        long j11 = i10;
        long j12 = m1439getValueimpl * j11;
        if (m1443isInNanosimpl(j10)) {
            if (-2147483647L <= m1439getValueimpl && m1439getValueimpl < 2147483648L) {
                return DurationKt.access$durationOfNanos(j12);
            }
            if (j12 / j11 == m1439getValueimpl) {
                return DurationKt.access$durationOfNanosNormalized(j12);
            }
            long access$nanosToMillis = DurationKt.access$nanosToMillis(m1439getValueimpl);
            long j13 = access$nanosToMillis * j11;
            long access$nanosToMillis2 = DurationKt.access$nanosToMillis((m1439getValueimpl - DurationKt.access$millisToNanos(access$nanosToMillis)) * j11) + j13;
            if (j13 / j11 == access$nanosToMillis && (access$nanosToMillis2 ^ j13) >= 0) {
                return DurationKt.access$durationOfMillis(RangesKt.c(access$nanosToMillis2, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)));
            }
            if (MathKt.getSign(i10) * MathKt.getSign(m1439getValueimpl) > 0) {
                return INFINITE;
            }
            return NEG_INFINITE;
        }
        if (j12 / j11 == m1439getValueimpl) {
            return DurationKt.access$durationOfMillis(RangesKt.c(j12, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)));
        }
        if (MathKt.getSign(i10) * MathKt.getSign(m1439getValueimpl) > 0) {
            return INFINITE;
        }
        return NEG_INFINITE;
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1454toComponentsimpl(long j10, Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> function5) {
        function5.getClass();
        return function5.invoke(Long.valueOf(m1427getInWholeDaysimpl(j10)), Integer.valueOf(m1426getHoursComponentimpl(j10)), Integer.valueOf(m1434getMinutesComponentimpl(j10)), Integer.valueOf(m1436getSecondsComponentimpl(j10)), Integer.valueOf(m1435getNanosecondsComponentimpl(j10)));
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m1455toDoubleimpl(long j10, DurationUnit durationUnit) {
        durationUnit.getClass();
        if (j10 == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m1439getValueimpl(j10), m1437getStorageUnitimpl(j10), durationUnit);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m1456toIntimpl(long j10, DurationUnit durationUnit) {
        durationUnit.getClass();
        return (int) RangesKt.coerceIn(m1458toLongimpl(j10, durationUnit), -2147483648L, 2147483647L);
    }

    /* renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m1457toIsoStringimpl(long j10) {
        long j11;
        boolean z9;
        boolean z10;
        StringBuilder sb = new StringBuilder();
        if (m1445isNegativeimpl(j10)) {
            sb.append('-');
        }
        sb.append("PT");
        long m1425getAbsoluteValueUwyO8pc = m1425getAbsoluteValueUwyO8pc(j10);
        long m1428getInWholeHoursimpl = m1428getInWholeHoursimpl(m1425getAbsoluteValueUwyO8pc);
        int m1434getMinutesComponentimpl = m1434getMinutesComponentimpl(m1425getAbsoluteValueUwyO8pc);
        int m1436getSecondsComponentimpl = m1436getSecondsComponentimpl(m1425getAbsoluteValueUwyO8pc);
        int m1435getNanosecondsComponentimpl = m1435getNanosecondsComponentimpl(m1425getAbsoluteValueUwyO8pc);
        if (m1444isInfiniteimpl(j10)) {
            j11 = 9999999999999L;
        } else {
            j11 = m1428getInWholeHoursimpl;
        }
        boolean z11 = false;
        if (j11 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (m1436getSecondsComponentimpl == 0 && m1435getNanosecondsComponentimpl == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (m1434getMinutesComponentimpl != 0 || (z10 && z9)) {
            z11 = true;
        }
        if (z9) {
            sb.append(j11);
            sb.append('H');
        }
        if (z11) {
            sb.append(m1434getMinutesComponentimpl);
            sb.append('M');
        }
        if (z10 || (!z9 && !z11)) {
            m1416appendFractionalimpl(j10, sb, m1436getSecondsComponentimpl, m1435getNanosecondsComponentimpl, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        return sb.toString();
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m1458toLongimpl(long j10, DurationUnit durationUnit) {
        durationUnit.getClass();
        if (j10 == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j10 == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m1439getValueimpl(j10), m1437getStorageUnitimpl(j10), durationUnit);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1459toStringimpl(long j10) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == INFINITE) {
            return "Infinity";
        }
        if (j10 == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean m1445isNegativeimpl = m1445isNegativeimpl(j10);
        StringBuilder sb = new StringBuilder();
        if (m1445isNegativeimpl) {
            sb.append('-');
        }
        long m1425getAbsoluteValueUwyO8pc = m1425getAbsoluteValueUwyO8pc(j10);
        long m1427getInWholeDaysimpl = m1427getInWholeDaysimpl(m1425getAbsoluteValueUwyO8pc);
        int m1426getHoursComponentimpl = m1426getHoursComponentimpl(m1425getAbsoluteValueUwyO8pc);
        int m1434getMinutesComponentimpl = m1434getMinutesComponentimpl(m1425getAbsoluteValueUwyO8pc);
        int m1436getSecondsComponentimpl = m1436getSecondsComponentimpl(m1425getAbsoluteValueUwyO8pc);
        int m1435getNanosecondsComponentimpl = m1435getNanosecondsComponentimpl(m1425getAbsoluteValueUwyO8pc);
        int i10 = 0;
        if (m1427getInWholeDaysimpl != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (m1426getHoursComponentimpl != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (m1434getMinutesComponentimpl != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m1436getSecondsComponentimpl == 0 && m1435getNanosecondsComponentimpl == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z9) {
            sb.append(m1427getInWholeDaysimpl);
            sb.append('d');
            i10 = 1;
        }
        if (z10 || (z9 && (z11 || z12))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(m1426getHoursComponentimpl);
            sb.append('h');
            i10 = i11;
        }
        if (z11 || (z12 && (z10 || z9))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(m1434getMinutesComponentimpl);
            sb.append('m');
            i10 = i12;
        }
        if (z12) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            if (m1436getSecondsComponentimpl == 0 && !z9 && !z10 && !z11) {
                if (m1435getNanosecondsComponentimpl >= 1000000) {
                    m1416appendFractionalimpl(j10, sb, m1435getNanosecondsComponentimpl / DurationKt.NANOS_IN_MILLIS, m1435getNanosecondsComponentimpl % DurationKt.NANOS_IN_MILLIS, 6, "ms", false);
                } else if (m1435getNanosecondsComponentimpl >= 1000) {
                    m1416appendFractionalimpl(j10, sb, m1435getNanosecondsComponentimpl / 1000, m1435getNanosecondsComponentimpl % 1000, 3, "us", false);
                } else {
                    sb.append(m1435getNanosecondsComponentimpl);
                    sb.append("ns");
                }
            } else {
                m1416appendFractionalimpl(j10, sb, m1436getSecondsComponentimpl, m1435getNanosecondsComponentimpl, 9, "s", false);
            }
            i10 = i13;
        }
        if (m1445isNegativeimpl && i10 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m1461toStringimpl$default(long j10, DurationUnit durationUnit, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return m1460toStringimpl(j10, durationUnit, i10);
    }

    /* renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m1462truncateToUwyO8pc$kotlin_stdlib(long j10, DurationUnit durationUnit) {
        durationUnit.getClass();
        DurationUnit m1437getStorageUnitimpl = m1437getStorageUnitimpl(j10);
        if (durationUnit.compareTo(m1437getStorageUnitimpl) > 0 && !m1444isInfiniteimpl(j10)) {
            return DurationKt.toDuration(m1439getValueimpl(j10) - (m1439getValueimpl(j10) % DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, durationUnit, m1437getStorageUnitimpl)), m1437getStorageUnitimpl);
        }
        return j10;
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m1463unaryMinusUwyO8pc(long j10) {
        return DurationKt.access$durationOf(-m1439getValueimpl(j10), ((int) j10) & 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m1464compareToLRDsOJo(duration.getRawValue());
    }

    public boolean equals(Object other) {
        return m1423equalsimpl(this.rawValue, other);
    }

    public int hashCode() {
        return m1440hashCodeimpl(this.rawValue);
    }

    public String toString() {
        return m1459toStringimpl(this.rawValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m1464compareToLRDsOJo(long j10) {
        return m1418compareToLRDsOJo(this.rawValue, j10);
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1453toComponentsimpl(long j10, Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> function4) {
        function4.getClass();
        return function4.invoke(Long.valueOf(m1428getInWholeHoursimpl(j10)), Integer.valueOf(m1434getMinutesComponentimpl(j10)), Integer.valueOf(m1436getSecondsComponentimpl(j10)), Integer.valueOf(m1435getNanosecondsComponentimpl(j10)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1452toComponentsimpl(long j10, Function3<? super Long, ? super Integer, ? super Integer, ? extends T> function3) {
        function3.getClass();
        return function3.invoke(Long.valueOf(m1431getInWholeMinutesimpl(j10)), Integer.valueOf(m1436getSecondsComponentimpl(j10)), Integer.valueOf(m1435getNanosecondsComponentimpl(j10)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1451toComponentsimpl(long j10, Function2<? super Long, ? super Integer, ? extends T> function2) {
        function2.getClass();
        return function2.invoke(Long.valueOf(m1433getInWholeSecondsimpl(j10)), Integer.valueOf(m1435getNanosecondsComponentimpl(j10)));
    }

    @PublishedApi
    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m1421divUwyO8pc(long j10, double d) {
        int roundToInt = MathKt.roundToInt(d);
        if (roundToInt == d && roundToInt != 0) {
            return m1422divUwyO8pc(j10, roundToInt);
        }
        DurationUnit m1437getStorageUnitimpl = m1437getStorageUnitimpl(j10);
        return DurationKt.toDuration(m1455toDoubleimpl(j10, m1437getStorageUnitimpl) / d, m1437getStorageUnitimpl);
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m1449timesUwyO8pc(long j10, double d) {
        int roundToInt = MathKt.roundToInt(d);
        if (roundToInt == d) {
            return m1450timesUwyO8pc(j10, roundToInt);
        }
        DurationUnit m1437getStorageUnitimpl = m1437getStorageUnitimpl(j10);
        return DurationKt.toDuration(m1455toDoubleimpl(j10, m1437getStorageUnitimpl) * d, m1437getStorageUnitimpl);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static final String m1460toStringimpl(long j10, DurationUnit durationUnit, int i10) {
        durationUnit.getClass();
        if (i10 >= 0) {
            double m1455toDoubleimpl = m1455toDoubleimpl(j10, durationUnit);
            if (Double.isInfinite(m1455toDoubleimpl)) {
                return String.valueOf(m1455toDoubleimpl);
            }
            return DurationJvmKt.formatToExactDecimals(m1455toDoubleimpl, RangesKt.coerceAtMost(i10, 12)) + DurationUnitKt__DurationUnitKt.shortName(durationUnit);
        }
        l9.i.d(ai.onnxruntime.a.e(i10, "decimals must be not negative, but was "));
        return null;
    }
}
