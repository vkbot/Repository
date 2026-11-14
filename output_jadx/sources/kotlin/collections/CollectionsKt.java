package kotlin.collections;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

@Metadata(d1 = {"kotlin/collections/CollectionsKt__CollectionsJVMKt", "kotlin/collections/CollectionsKt__CollectionsKt", "kotlin/collections/CollectionsKt__IterablesKt", "kotlin/collections/CollectionsKt__IteratorsJVMKt", "kotlin/collections/CollectionsKt__IteratorsKt", "kotlin/collections/CollectionsKt__MutableCollectionsJVMKt", "kotlin/collections/CollectionsKt__MutableCollectionsKt", "kotlin/collections/CollectionsKt__ReversedViewsKt", "kotlin/collections/CollectionsKt___CollectionsJvmKt", "kotlin/collections/CollectionsKt___CollectionsKt"}, k = 4, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX)
/* loaded from: classes.dex */
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    private CollectionsKt() {
    }

    public static /* bridge */ /* synthetic */ void c(Collection collection, Iterable iterable) {
        CollectionsKt__MutableCollectionsKt.addAll(collection, iterable);
    }

    public static /* bridge */ /* synthetic */ void d(Collection collection, Sequence sequence) {
        CollectionsKt__MutableCollectionsKt.addAll(collection, sequence);
    }

    public static /* bridge */ /* synthetic */ Appendable k(String str, List list, StringBuilder sb) {
        return CollectionsKt___CollectionsKt.joinTo$default(list, sb, str, null, null, 0, null, null, 124, null);
    }

    public static /* bridge */ /* synthetic */ String l(Iterable iterable, String str, String str2, String str3, Function1 function1, int i10) {
        return CollectionsKt___CollectionsKt.joinToString$default(iterable, str, str2, str3, 0, null, function1, i10, null);
    }

    public static /* bridge */ /* synthetic */ Comparable n(ArrayList arrayList) {
        return CollectionsKt___CollectionsKt.minOrNull((Iterable) arrayList);
    }

    public static /* bridge */ /* synthetic */ void r(Set set, Function1 function1) {
        CollectionsKt__MutableCollectionsKt.retainAll(set, function1);
    }

    public static /* bridge */ /* synthetic */ Object s(Collection collection) {
        return CollectionsKt___CollectionsKt.single(collection);
    }
}
