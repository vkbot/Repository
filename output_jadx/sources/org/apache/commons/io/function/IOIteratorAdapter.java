package org.apache.commons.io.function;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class IOIteratorAdapter<E> implements IOIterator<E> {
    private final Iterator<E> delegate;

    private IOIteratorAdapter(Iterator<E> it) {
        Objects.requireNonNull(it, "delegate");
        this.delegate = it;
    }

    public static <E> IOIteratorAdapter<E> adapt(Iterator<E> it) {
        return new IOIteratorAdapter<>(it);
    }

    @Override // org.apache.commons.io.function.IOIterator
    public boolean hasNext() {
        return this.delegate.hasNext();
    }

    @Override // org.apache.commons.io.function.IOIterator
    public E next() {
        return this.delegate.next();
    }

    @Override // org.apache.commons.io.function.IOIterator
    public Iterator<E> unwrap() {
        return this.delegate;
    }
}
