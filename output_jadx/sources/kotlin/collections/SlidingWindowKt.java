package kotlin.collections;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import l9.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aD\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u0006\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001aH\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\r\"\u0004\b\u0000\u0010\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\b0\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0000¨\u0006\u000f"}, d2 = {"checkWindowSizeStep", "", "size", "", "step", "windowedSequence", "Lkotlin/sequences/Sequence;", "", ExifInterface.GPS_DIRECTION_TRUE, "partialWindows", "", "reuseBuffer", "windowedIterator", "", "iterator", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SlidingWindowKt {
    public static final void checkWindowSizeStep(int i10, int i11) {
        String f8;
        if (i10 > 0 && i11 > 0) {
            return;
        }
        if (i10 != i11) {
            f8 = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
        } else {
            f8 = ai.onnxruntime.a.f(i10, "size ", " must be greater than zero.");
        }
        i.d(f8);
    }

    public static final <T> Iterator<List<T>> windowedIterator(Iterator<? extends T> it, int i10, int i11, boolean z9, boolean z10) {
        it.getClass();
        if (!it.hasNext()) {
            return EmptyIterator.INSTANCE;
        }
        return SequencesKt.iterator(new SlidingWindowKt$windowedIterator$1(i10, i11, it, z10, z9, null));
    }

    public static final <T> Sequence<List<T>> windowedSequence(final Sequence<? extends T> sequence, final int i10, final int i11, final boolean z9, final boolean z10) {
        sequence.getClass();
        checkWindowSizeStep(i10, i11);
        return new Sequence<List<? extends T>>() { // from class: kotlin.collections.SlidingWindowKt$windowedSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<List<? extends T>> iterator() {
                return SlidingWindowKt.windowedIterator(Sequence.this.iterator(), i10, i11, z9, z10);
            }
        };
    }
}
