package kotlin.sequences;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, d2 = {"kotlin/sequences/SequencesKt___SequencesKt$minus$2", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SequencesKt___SequencesKt$minus$2<T> implements Sequence<T> {
    final /* synthetic */ T[] $elements;
    final /* synthetic */ Sequence<T> $this_minus;

    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$minus$2(Sequence<? extends T> sequence, T[] tArr) {
        this.$this_minus = sequence;
        this.$elements = tArr;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return SequencesKt___SequencesKt.filterNot(this.$this_minus, new b(5, this.$elements)).iterator();
    }
}
