package kotlin.sequences;

import java.util.Collection;
import java.util.List;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3460b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f3460b = i10;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object generateSequence$lambda$5$SequencesKt__SequencesKt;
        Object requireNoNulls$lambda$16$SequencesKt___SequencesKt;
        boolean filterIndexed$lambda$2$SequencesKt___SequencesKt;
        Object onEach$lambda$14$SequencesKt___SequencesKt;
        switch (this.f3460b) {
            case 0:
                generateSequence$lambda$5$SequencesKt__SequencesKt = SequencesKt__SequencesKt.generateSequence$lambda$5$SequencesKt__SequencesKt((Function0) this.c, obj);
                return generateSequence$lambda$5$SequencesKt__SequencesKt;
            case 1:
                return Boolean.valueOf(SequencesKt___SequencesJvmKt.f((Class) this.c, obj));
            case 2:
                requireNoNulls$lambda$16$SequencesKt___SequencesKt = SequencesKt___SequencesKt.requireNoNulls$lambda$16$SequencesKt___SequencesKt((Sequence) this.c, obj);
                return requireNoNulls$lambda$16$SequencesKt___SequencesKt;
            case 3:
                filterIndexed$lambda$2$SequencesKt___SequencesKt = SequencesKt___SequencesKt.filterIndexed$lambda$2$SequencesKt___SequencesKt((Function2) this.c, (IndexedValue) obj);
                return Boolean.valueOf(filterIndexed$lambda$2$SequencesKt___SequencesKt);
            case 4:
                onEach$lambda$14$SequencesKt___SequencesKt = SequencesKt___SequencesKt.onEach$lambda$14$SequencesKt___SequencesKt((Function1) this.c, obj);
                return onEach$lambda$14$SequencesKt___SequencesKt;
            case 5:
                return Boolean.valueOf(SequencesKt___SequencesKt$minus$2.a((Object[]) this.c, obj));
            case 6:
                return Boolean.valueOf(SequencesKt___SequencesKt$minus$3.a((Collection) this.c, obj));
            default:
                return Boolean.valueOf(SequencesKt___SequencesKt$minus$4.a((List) this.c, obj));
        }
    }
}
