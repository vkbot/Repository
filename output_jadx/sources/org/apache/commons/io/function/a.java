package org.apache.commons.io.function;

import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements IOBiConsumer, IOFunction, IOPredicate, IOTriConsumer, IOUnaryOperator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4838b;

    public /* synthetic */ a(int i10) {
        this.f4838b = i10;
    }

    @Override // org.apache.commons.io.function.IOBiConsumer
    public void accept(Object obj, Object obj2) {
        Constants.lambda$static$0(obj, obj2);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public Object apply(Object obj) {
        Object lambda$static$3;
        switch (this.f4838b) {
            case 1:
                lambda$static$3 = Constants.lambda$static$3(obj);
                return lambda$static$3;
            default:
                return IOUnaryOperator.p(obj);
        }
    }

    @Override // org.apache.commons.io.function.IOPredicate
    public boolean test(Object obj) {
        boolean lambda$static$4;
        boolean lambda$static$5;
        switch (this.f4838b) {
            case 2:
                lambda$static$4 = Constants.lambda$static$4(obj);
                return lambda$static$4;
            case 3:
                lambda$static$5 = Constants.lambda$static$5(obj);
                return lambda$static$5;
            default:
                return Objects.isNull(obj);
        }
    }

    @Override // org.apache.commons.io.function.IOTriConsumer
    public void accept(Object obj, Object obj2, Object obj3) {
        Constants.lambda$static$6(obj, obj2, obj3);
    }
}
