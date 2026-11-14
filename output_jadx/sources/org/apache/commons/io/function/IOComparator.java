package org.apache.commons.io.function;

import java.util.Comparator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@FunctionalInterface
/* loaded from: classes2.dex */
public interface IOComparator<T> {
    /* synthetic */ default int lambda$asComparator$0(Object obj, Object obj2) {
        return Uncheck.compare(this, obj, obj2);
    }

    default Comparator<T> asComparator() {
        return new k(this, 0);
    }

    int compare(T t, T t3);
}
