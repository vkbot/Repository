package org.apache.commons.io.function;

import java.util.Objects;
import java.util.function.Predicate;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@FunctionalInterface
/* loaded from: classes2.dex */
public interface IOPredicate<T> {
    static <T> IOPredicate<T> alwaysFalse() {
        return (IOPredicate<T>) Constants.IO_PREDICATE_FALSE;
    }

    static <T> IOPredicate<T> alwaysTrue() {
        return (IOPredicate<T>) Constants.IO_PREDICATE_TRUE;
    }

    static <T> IOPredicate<T> isEqual(Object obj) {
        if (obj == null) {
            return new a(5);
        }
        return new v(1, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$and$1(IOPredicate iOPredicate, Object obj) {
        if (test(obj) && iOPredicate.test(obj)) {
            return true;
        }
        return false;
    }

    /* synthetic */ default boolean lambda$asPredicate$2(Object obj) {
        return Uncheck.test(this, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$negate$3(Object obj) {
        return !test(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$or$4(IOPredicate iOPredicate, Object obj) {
        if (!test(obj) && !iOPredicate.test(obj)) {
            return false;
        }
        return true;
    }

    default IOPredicate<T> and(IOPredicate<? super T> iOPredicate) {
        Objects.requireNonNull(iOPredicate);
        return new w(this, iOPredicate, 1);
    }

    default Predicate<T> asPredicate() {
        return new x(this, 0);
    }

    default IOPredicate<T> negate() {
        return new v(0, this);
    }

    default IOPredicate<T> or(IOPredicate<? super T> iOPredicate) {
        Objects.requireNonNull(iOPredicate);
        return new w(this, iOPredicate, 0);
    }

    boolean test(T t);
}
