package org.apache.commons.io.function;

import java.util.function.BinaryOperator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements BinaryOperator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IOBinaryOperator f4856b;

    public /* synthetic */ h(IOBinaryOperator iOBinaryOperator, int i10) {
        this.f4855a = i10;
        this.f4856b = iOBinaryOperator;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Object apply;
        Object apply2;
        Object apply3;
        switch (this.f4855a) {
            case 0:
                return IOBinaryOperator.c(this.f4856b, obj, obj2);
            case 1:
                apply = Erase.apply(this.f4856b, obj, obj2);
                return apply;
            case 2:
                apply2 = Erase.apply(this.f4856b, obj, obj2);
                return apply2;
            default:
                apply3 = Erase.apply(this.f4856b, obj, obj2);
                return apply3;
        }
    }
}
