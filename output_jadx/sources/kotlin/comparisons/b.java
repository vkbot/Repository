package kotlin.comparisons;

import java.util.Comparator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3440b;
    public final /* synthetic */ Comparator c;
    public final /* synthetic */ Comparator d;

    public /* synthetic */ b(Comparator comparator, Comparator comparator2, int i10) {
        this.f3440b = i10;
        this.c = comparator;
        this.d = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3440b) {
            case 0:
                return ComparisonsKt__ComparisonsKt.b(this.c, this.d, obj, obj2);
            default:
                return ComparisonsKt__ComparisonsKt.d(this.c, this.d, obj, obj2);
        }
    }
}
