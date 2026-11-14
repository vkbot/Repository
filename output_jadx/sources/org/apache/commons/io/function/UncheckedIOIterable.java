package org.apache.commons.io.function;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
final class UncheckedIOIterable<E> implements Iterable<E> {
    private final IOIterable<E> delegate;

    public UncheckedIOIterable(IOIterable<E> iOIterable) {
        Objects.requireNonNull(iOIterable, "delegate");
        this.delegate = iOIterable;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return new UncheckedIOIterator(this.delegate.iterator());
    }
}
