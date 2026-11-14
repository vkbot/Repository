package kotlin.ranges;

import androidx.constraintlayout.widget.ConstraintLayout;
import j1.i;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/IntProgression;", "", "", "start", "endInclusive", "step", "<init>", "(III)V", "first", "getFirst", "()I", "last", "getLast", "getStep", "iterator", "Lkotlin/collections/IntIterator;", "isEmpty", "", "equals", "other", "", "hashCode", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public class IntProgression implements Iterable<Integer>, KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int first;
    private final int last;
    private final int step;

    public IntProgression(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.first = i10;
                this.last = ProgressionUtilKt.getProgressionLastElement(i10, i11, i12);
                this.step = i12;
                return;
            }
            i.k("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        i.k("Step must be non-zero.");
        throw null;
    }

    public boolean equals(Object other) {
        if (other instanceof IntProgression) {
            if (!isEmpty() || !((IntProgression) other).isEmpty()) {
                IntProgression intProgression = (IntProgression) other;
                if (this.first == intProgression.first && this.last == intProgression.last && this.step == intProgression.step) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int getFirst() {
        return this.first;
    }

    public final int getLast() {
        return this.last;
    }

    public final int getStep() {
        return this.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.first * 31) + this.last) * 31) + this.step;
    }

    public boolean isEmpty() {
        int i10 = this.step;
        int i11 = this.first;
        if (i10 > 0) {
            if (i11 <= this.last) {
                return false;
            }
            return true;
        }
        if (i11 >= this.last) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new IntProgressionIterator(this.first, this.last, this.step);
    }

    public String toString() {
        StringBuilder sb;
        int i10;
        int i11 = this.step;
        int i12 = this.first;
        if (i11 > 0) {
            sb = new StringBuilder();
            sb.append(i12);
            sb.append("..");
            sb.append(this.last);
            sb.append(" step ");
            i10 = this.step;
        } else {
            sb = new StringBuilder();
            sb.append(i12);
            sb.append(" downTo ");
            sb.append(this.last);
            sb.append(" step ");
            i10 = -this.step;
        }
        sb.append(i10);
        return sb.toString();
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lkotlin/ranges/IntProgression$Companion;", "", "<init>", "()V", "fromClosedRange", "Lkotlin/ranges/IntProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntProgression fromClosedRange(int rangeStart, int rangeEnd, int step) {
            return new IntProgression(rangeStart, rangeEnd, step);
        }

        private Companion() {
        }
    }
}
