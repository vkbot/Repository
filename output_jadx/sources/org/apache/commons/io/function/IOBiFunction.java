package org.apache.commons.io.function;

import java.util.Objects;
import java.util.function.BiFunction;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@FunctionalInterface
/* loaded from: classes2.dex */
public interface IOBiFunction<T, U, R> {
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$andThen$0(IOFunction iOFunction, Object obj, Object obj2) {
        return iOFunction.apply(apply(obj, obj2));
    }

    /* synthetic */ default Object lambda$asBiFunction$1(Object obj, Object obj2) {
        return Uncheck.apply(this, obj, obj2);
    }

    default <V> IOBiFunction<T, U, V> andThen(final IOFunction<? super R, ? extends V> iOFunction) {
        Objects.requireNonNull(iOFunction);
        return new IOBiFunction() { // from class: org.apache.commons.io.function.f
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                Object lambda$andThen$0;
                lambda$andThen$0 = IOBiFunction.this.lambda$andThen$0(iOFunction, obj, obj2);
                return lambda$andThen$0;
            }
        };
    }

    R apply(T t, U u8);

    default BiFunction<T, U, R> asBiFunction() {
        return new g(this, 0);
    }
}
