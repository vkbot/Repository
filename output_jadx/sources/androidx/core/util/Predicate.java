package androidx.core.util;

import androidx.core.content.d;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public interface Predicate<T> {
    static <T> Predicate<T> isEqual(Object obj) {
        if (obj == null) {
            return new d(11);
        }
        return new b(0, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$and$0(Predicate predicate, Object obj) {
        if (test(obj) && predicate.test(obj)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$negate$1(Object obj) {
        return !test(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$or$2(Predicate predicate, Object obj) {
        if (!test(obj) && !predicate.test(obj)) {
            return false;
        }
        return true;
    }

    static <T> Predicate<T> not(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return predicate.negate();
    }

    default Predicate<T> and(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new a(this, predicate, 1);
    }

    default Predicate<T> negate() {
        return new b(1, this);
    }

    default Predicate<T> or(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new a(this, predicate, 0);
    }

    boolean test(T t);
}
