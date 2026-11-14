package org.apache.commons.io.function;

import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Function {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4863b;
    public final /* synthetic */ IOFunction c;

    public /* synthetic */ n(IOFunction iOFunction, int i10) {
        this.f4863b = i10;
        this.c = iOFunction;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object apply;
        Stream lambda$flatMap$6;
        IntStream lambda$flatMapToInt$8;
        LongStream lambda$flatMapToLong$9;
        DoubleStream lambda$flatMapToDouble$7;
        switch (this.f4863b) {
            case 0:
                return IOFunction.h(this.c, obj);
            case 1:
                apply = Erase.apply(this.c, obj);
                return apply;
            case 2:
                lambda$flatMap$6 = IOStream.lambda$flatMap$6(this.c, obj);
                return lambda$flatMap$6;
            case 3:
                lambda$flatMapToInt$8 = IOStream.lambda$flatMapToInt$8(this.c, obj);
                return lambda$flatMapToInt$8;
            case 4:
                lambda$flatMapToLong$9 = IOStream.lambda$flatMapToLong$9(this.c, obj);
                return lambda$flatMapToLong$9;
            default:
                lambda$flatMapToDouble$7 = IOStream.lambda$flatMapToDouble$7(this.c, obj);
                return lambda$flatMapToDouble$7;
        }
    }
}
