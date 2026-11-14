package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3439b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i10, Object obj) {
        this.f3439b = i10;
        this.c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int nullsLast$lambda$4$ComparisonsKt__ComparisonsKt;
        int nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt;
        int compareBy$lambda$0$ComparisonsKt__ComparisonsKt;
        switch (this.f3439b) {
            case 0:
                nullsLast$lambda$4$ComparisonsKt__ComparisonsKt = ComparisonsKt__ComparisonsKt.nullsLast$lambda$4$ComparisonsKt__ComparisonsKt((Comparator) this.c, obj, obj2);
                return nullsLast$lambda$4$ComparisonsKt__ComparisonsKt;
            case 1:
                nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt = ComparisonsKt__ComparisonsKt.nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt((Comparator) this.c, obj, obj2);
                return nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt;
            default:
                compareBy$lambda$0$ComparisonsKt__ComparisonsKt = ComparisonsKt__ComparisonsKt.compareBy$lambda$0$ComparisonsKt__ComparisonsKt((Function1[]) this.c, obj, obj2);
                return compareBy$lambda$0$ComparisonsKt__ComparisonsKt;
        }
    }
}
