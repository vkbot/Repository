package kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.time.ComparableTimeMark;
import kotlin.time.TimeSource;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH$J\b\u0010\u000f\u001a\u00020\tH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "unit", "Lkotlin/time/DurationUnit;", "<init>", "(Lkotlin/time/DurationUnit;)V", "getUnit", "()Lkotlin/time/DurationUnit;", "read", "", "zero", "getZero", "()J", "zero$delegate", "Lkotlin/Lazy;", "adjustedRead", "markNow", "Lkotlin/time/ComparableTimeMark;", "LongTimeMark", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@WasExperimental(markerClass = {ExperimentalTime.class})
/* loaded from: classes2.dex */
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {
    private final DurationUnit unit;

    /* renamed from: zero$delegate, reason: from kotlin metadata */
    private final Lazy zero;

    public AbstractLongTimeSource(DurationUnit durationUnit) {
        durationUnit.getClass();
        this.unit = durationUnit;
        this.zero = LazyKt.lazy(new Function0() { // from class: kotlin.time.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                long read;
                read = AbstractLongTimeSource.this.read();
                return Long.valueOf(read);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long adjustedRead() {
        return read() - getZero();
    }

    private final long getZero() {
        return ((Number) this.zero.getValue()).longValue();
    }

    public final DurationUnit getUnit() {
        return this.unit;
    }

    @Override // kotlin.time.TimeSource
    public ComparableTimeMark markNow() {
        return new LongTimeMark(adjustedRead(), this, Duration.INSTANCE.m1510getZEROUwyO8pc(), null);
    }

    public abstract long read();

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u001d"}, d2 = {"Lkotlin/time/AbstractLongTimeSource$LongTimeMark;", "Lkotlin/time/ComparableTimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractLongTimeSource;", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/time/Duration;", "<init>", "(JLkotlin/time/AbstractLongTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "elapsedNow", "elapsedNow-UwyO8pc", "()J", "plus", TypedValues.TransitionType.S_DURATION, "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "minus", "other", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "equals", "", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,210:1\n80#2:211\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n67#1:211\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class LongTimeMark implements ComparableTimeMark {
        private final long offset;
        private final long startedAt;
        private final AbstractLongTimeSource timeSource;

        private LongTimeMark(long j10, AbstractLongTimeSource abstractLongTimeSource, long j11) {
            abstractLongTimeSource.getClass();
            this.startedAt = j10;
            this.timeSource = abstractLongTimeSource;
            this.offset = j11;
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: elapsedNow-UwyO8pc */
        public long mo1409elapsedNowUwyO8pc() {
            return Duration.m1447minusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.timeSource.adjustedRead(), this.startedAt, this.timeSource.getUnit()), this.offset);
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(Object other) {
            if ((other instanceof LongTimeMark) && Intrinsics.areEqual(this.timeSource, ((LongTimeMark) other).timeSource) && Duration.m1424equalsimpl0(mo1411minusUwyO8pc((ComparableTimeMark) other), Duration.INSTANCE.m1510getZEROUwyO8pc())) {
                return true;
            }
            return false;
        }

        @Override // kotlin.time.TimeMark
        public boolean hasNotPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasNotPassedNow(this);
        }

        @Override // kotlin.time.TimeMark
        public boolean hasPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasPassedNow(this);
        }

        @Override // kotlin.time.ComparableTimeMark
        public int hashCode() {
            return Long.hashCode(this.startedAt) + (Duration.m1440hashCodeimpl(this.offset) * 37);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: minus-LRDsOJo */
        public ComparableTimeMark mo1410minusLRDsOJo(long j10) {
            return ComparableTimeMark.DefaultImpls.m1414minusLRDsOJo(this, j10);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* renamed from: minus-UwyO8pc */
        public long mo1411minusUwyO8pc(ComparableTimeMark other) {
            other.getClass();
            if (other instanceof LongTimeMark) {
                LongTimeMark longTimeMark = (LongTimeMark) other;
                if (Intrinsics.areEqual(this.timeSource, longTimeMark.timeSource)) {
                    return Duration.m1448plusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.startedAt, longTimeMark.startedAt, this.timeSource.getUnit()), Duration.m1447minusLRDsOJo(this.offset, longTimeMark.offset));
                }
            }
            androidx.navigation.b.v("Subtracting or comparing time marks from different time sources is not possible: ", this, " and ", other);
            return 0L;
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: plus-LRDsOJo */
        public ComparableTimeMark mo1412plusLRDsOJo(long duration) {
            DurationUnit unit = this.timeSource.getUnit();
            if (Duration.m1444isInfiniteimpl(duration)) {
                return new LongTimeMark(LongSaturatedMathKt.m1521saturatingAddNuflL3o(this.startedAt, unit, duration), this.timeSource, Duration.INSTANCE.m1510getZEROUwyO8pc(), null);
            }
            long m1462truncateToUwyO8pc$kotlin_stdlib = Duration.m1462truncateToUwyO8pc$kotlin_stdlib(duration, unit);
            long m1448plusLRDsOJo = Duration.m1448plusLRDsOJo(Duration.m1447minusLRDsOJo(duration, m1462truncateToUwyO8pc$kotlin_stdlib), this.offset);
            long m1521saturatingAddNuflL3o = LongSaturatedMathKt.m1521saturatingAddNuflL3o(this.startedAt, unit, m1462truncateToUwyO8pc$kotlin_stdlib);
            long m1462truncateToUwyO8pc$kotlin_stdlib2 = Duration.m1462truncateToUwyO8pc$kotlin_stdlib(m1448plusLRDsOJo, unit);
            long m1521saturatingAddNuflL3o2 = LongSaturatedMathKt.m1521saturatingAddNuflL3o(m1521saturatingAddNuflL3o, unit, m1462truncateToUwyO8pc$kotlin_stdlib2);
            long m1447minusLRDsOJo = Duration.m1447minusLRDsOJo(m1448plusLRDsOJo, m1462truncateToUwyO8pc$kotlin_stdlib2);
            long m1432getInWholeNanosecondsimpl = Duration.m1432getInWholeNanosecondsimpl(m1447minusLRDsOJo);
            if (m1521saturatingAddNuflL3o2 != 0 && m1432getInWholeNanosecondsimpl != 0 && (m1521saturatingAddNuflL3o2 ^ m1432getInWholeNanosecondsimpl) < 0) {
                long duration2 = DurationKt.toDuration(MathKt.getSign(m1432getInWholeNanosecondsimpl), unit);
                m1521saturatingAddNuflL3o2 = LongSaturatedMathKt.m1521saturatingAddNuflL3o(m1521saturatingAddNuflL3o2, unit, duration2);
                m1447minusLRDsOJo = Duration.m1447minusLRDsOJo(m1447minusLRDsOJo, duration2);
            }
            if ((1 | (m1521saturatingAddNuflL3o2 - 1)) == Long.MAX_VALUE) {
                m1447minusLRDsOJo = Duration.INSTANCE.m1510getZEROUwyO8pc();
            }
            return new LongTimeMark(m1521saturatingAddNuflL3o2, this.timeSource, m1447minusLRDsOJo, null);
        }

        public String toString() {
            return "LongTimeMark(" + this.startedAt + DurationUnitKt__DurationUnitKt.shortName(this.timeSource.getUnit()) + " + " + ((Object) Duration.m1459toStringimpl(this.offset)) + ", " + this.timeSource + ')';
        }

        @Override // java.lang.Comparable
        public int compareTo(ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        public /* synthetic */ LongTimeMark(long j10, AbstractLongTimeSource abstractLongTimeSource, long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, abstractLongTimeSource, j11);
        }
    }
}
