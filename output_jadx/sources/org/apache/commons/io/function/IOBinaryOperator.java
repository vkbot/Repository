package org.apache.commons.io.function;

import java.util.Objects;
import java.util.function.BinaryOperator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@FunctionalInterface
/* loaded from: classes2.dex */
public interface IOBinaryOperator<T> extends IOBiFunction<T, T, T> {
    /* synthetic */ default Object lambda$asBinaryOperator$2(Object obj, Object obj2) {
        return Uncheck.apply(this, obj, obj2);
    }

    static /* synthetic */ Object lambda$maxBy$0(IOComparator iOComparator, Object obj, Object obj2) {
        if (iOComparator.compare(obj, obj2) >= 0) {
            return obj;
        }
        return obj2;
    }

    static /* synthetic */ Object lambda$minBy$1(IOComparator iOComparator, Object obj, Object obj2) {
        if (iOComparator.compare(obj, obj2) <= 0) {
            return obj;
        }
        return obj2;
    }

    static <T> IOBinaryOperator<T> maxBy(IOComparator<? super T> iOComparator) {
        Objects.requireNonNull(iOComparator);
        return new i(iOComparator, 0);
    }

    static <T> IOBinaryOperator<T> minBy(IOComparator<? super T> iOComparator) {
        Objects.requireNonNull(iOComparator);
        return new i(iOComparator, 1);
    }

    default BinaryOperator<T> asBinaryOperator() {
        return new h(this, 0);
    }
}
