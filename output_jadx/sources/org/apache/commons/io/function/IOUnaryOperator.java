package org.apache.commons.io.function;

import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@FunctionalInterface
/* loaded from: classes2.dex */
public interface IOUnaryOperator<T> extends IOFunction<T, T> {
    static <T> IOUnaryOperator<T> identity() {
        return new a(6);
    }

    /* synthetic */ default Object lambda$asUnaryOperator$1(Object obj) {
        return Uncheck.apply(this, obj);
    }

    default UnaryOperator<T> asUnaryOperator() {
        return new UnaryOperator() { // from class: org.apache.commons.io.function.c0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object lambda$asUnaryOperator$1;
                lambda$asUnaryOperator$1 = IOUnaryOperator.this.lambda$asUnaryOperator$1(obj);
                return lambda$asUnaryOperator$1;
            }
        };
    }

    static /* synthetic */ Object lambda$identity$0(Object obj) {
        return obj;
    }
}
