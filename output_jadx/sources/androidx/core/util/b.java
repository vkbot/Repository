package androidx.core.util;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f189b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f188a = i10;
        this.f189b = obj;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean equals;
        boolean lambda$negate$1;
        switch (this.f188a) {
            case 0:
                equals = this.f189b.equals(obj);
                return equals;
            default:
                lambda$negate$1 = ((Predicate) this.f189b).lambda$negate$1(obj);
                return lambda$negate$1;
        }
    }
}
