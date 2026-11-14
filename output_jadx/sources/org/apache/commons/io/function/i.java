package org.apache.commons.io.function;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements IOBinaryOperator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IOComparator f4858b;

    public /* synthetic */ i(IOComparator iOComparator, int i10) {
        this.f4857a = i10;
        this.f4858b = iOComparator;
    }

    @Override // org.apache.commons.io.function.IOBiFunction
    public final Object apply(Object obj, Object obj2) {
        Object lambda$maxBy$0;
        Object lambda$minBy$1;
        switch (this.f4857a) {
            case 0:
                lambda$maxBy$0 = IOBinaryOperator.lambda$maxBy$0(this.f4858b, obj, obj2);
                return lambda$maxBy$0;
            default:
                lambda$minBy$1 = IOBinaryOperator.lambda$minBy$1(this.f4858b, obj, obj2);
                return lambda$minBy$1;
        }
    }
}
