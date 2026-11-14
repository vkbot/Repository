package org.apache.commons.io.function;

import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@FunctionalInterface
/* loaded from: classes2.dex */
public interface IOTriFunction<T, U, V, R> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$andThen$0(IOFunction iOFunction, Object obj, Object obj2, Object obj3) {
        return iOFunction.apply(apply(obj, obj2, obj3));
    }

    default <W> IOTriFunction<T, U, V, W> andThen(IOFunction<? super R, ? extends W> iOFunction) {
        Objects.requireNonNull(iOFunction);
        return new f5.f(23, this, iOFunction);
    }

    R apply(T t, U u8, V v9);
}
