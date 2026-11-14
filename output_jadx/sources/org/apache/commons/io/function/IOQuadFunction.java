package org.apache.commons.io.function;

import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@FunctionalInterface
/* loaded from: classes2.dex */
public interface IOQuadFunction<T, U, V, W, R> {
    static /* synthetic */ Object g(IOQuadFunction iOQuadFunction, IOFunction iOFunction, Object obj, Object obj2, Object obj3, Object obj4) {
        return iOQuadFunction.lambda$andThen$0(iOFunction, obj, obj2, obj3, obj4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$andThen$0(IOFunction iOFunction, Object obj, Object obj2, Object obj3, Object obj4) {
        return iOFunction.apply(apply(obj, obj2, obj3, obj4));
    }

    default <X> IOQuadFunction<T, U, V, W, X> andThen(IOFunction<? super R, ? extends X> iOFunction) {
        Objects.requireNonNull(iOFunction);
        return new f5.f(21, this, iOFunction);
    }

    R apply(T t, U u8, V v9, W w);
}
