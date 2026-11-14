package org.apache.commons.io.function;

import java.util.function.Supplier;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@FunctionalInterface
/* loaded from: classes2.dex */
public interface IOSupplier<T> {
    default Supplier<T> asSupplier() {
        return new z(this, 1);
    }

    T get();

    default T getUnchecked() {
        return (T) Uncheck.get(this);
    }
}
