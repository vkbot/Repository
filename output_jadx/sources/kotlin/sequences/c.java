package kotlin.sequences;

import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3461b;

    public /* synthetic */ c(int i10) {
        this.f3461b = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object filterIndexed$lambda$3$SequencesKt___SequencesKt;
        boolean filterNotNull$lambda$5$SequencesKt___SequencesKt;
        Object distinct$lambda$13$SequencesKt___SequencesKt;
        switch (this.f3461b) {
            case 0:
                return SequencesKt__SequencesKt.e((Sequence) obj);
            case 1:
                return SequencesKt__SequencesKt.d((Iterable) obj);
            case 2:
                return SequencesKt__SequencesKt.a(obj);
            case 3:
                filterIndexed$lambda$3$SequencesKt___SequencesKt = SequencesKt___SequencesKt.filterIndexed$lambda$3$SequencesKt___SequencesKt((IndexedValue) obj);
                return filterIndexed$lambda$3$SequencesKt___SequencesKt;
            case 4:
                filterNotNull$lambda$5$SequencesKt___SequencesKt = SequencesKt___SequencesKt.filterNotNull$lambda$5$SequencesKt___SequencesKt(obj);
                return Boolean.valueOf(filterNotNull$lambda$5$SequencesKt___SequencesKt);
            default:
                distinct$lambda$13$SequencesKt___SequencesKt = SequencesKt___SequencesKt.distinct$lambda$13$SequencesKt___SequencesKt(obj);
                return distinct$lambda$13$SequencesKt___SequencesKt;
        }
    }
}
