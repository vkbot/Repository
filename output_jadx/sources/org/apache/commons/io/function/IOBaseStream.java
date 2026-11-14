package org.apache.commons.io.function;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;
import org.apache.commons.io.function.IOBaseStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public interface IOBaseStream<T, S extends IOBaseStream<T, S, B>, B extends BaseStream<T, B>> extends Closeable {
    default BaseStream<T, B> asBaseStream() {
        return new UncheckedIOBaseStream(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        unwrap().close();
    }

    default boolean isParallel() {
        return unwrap().isParallel();
    }

    default IOIterator<T> iterator() {
        return IOIteratorAdapter.adapt((Iterator) unwrap().iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    default S onClose(IORunnable iORunnable) {
        return (S) wrap(unwrap().onClose(new d(iORunnable, 0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    default S parallel() {
        if (isParallel()) {
            return this;
        }
        return (S) wrap(unwrap().parallel());
    }

    /* JADX WARN: Multi-variable type inference failed */
    default S sequential() {
        if (isParallel()) {
            return (S) wrap(unwrap().sequential());
        }
        return this;
    }

    default IOSpliterator<T> spliterator() {
        return IOSpliteratorAdapter.adapt((Spliterator) unwrap().spliterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    default S unordered() {
        return (S) wrap(unwrap().unordered());
    }

    B unwrap();

    S wrap(B b10);
}
