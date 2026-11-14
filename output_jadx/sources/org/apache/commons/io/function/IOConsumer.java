package org.apache.commons.io.function;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Stream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@FunctionalInterface
/* loaded from: classes2.dex */
public interface IOConsumer<T> {
    public static final IOConsumer<?> NOOP_IO_CONSUMER = new Object();

    static <T> void forAll(IOConsumer<T> iOConsumer, Stream<T> stream) {
        IOStreams.forAll(stream, iOConsumer, new b0(1));
    }

    static <T> void forEach(Iterable<T> iterable, IOConsumer<T> iOConsumer) {
        IOStreams.forEach(IOStreams.of(iterable), iOConsumer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$1(IOConsumer iOConsumer, Object obj) {
        accept(obj);
        iOConsumer.accept(obj);
    }

    /* synthetic */ default void lambda$asConsumer$2(Object obj) {
        Uncheck.accept(this, obj);
    }

    static <T> IOConsumer<T> noop() {
        return (IOConsumer<T>) NOOP_IO_CONSUMER;
    }

    void accept(T t);

    default IOConsumer<T> andThen(IOConsumer<? super T> iOConsumer) {
        Objects.requireNonNull(iOConsumer, "after");
        return new l(0, this, iOConsumer);
    }

    default Consumer<T> asConsumer() {
        return new a0(1, this);
    }

    static <T> void forEach(Stream<T> stream, IOConsumer<T> iOConsumer) {
        IOStreams.forEach(stream, iOConsumer);
    }

    static <T> void forEach(T[] tArr, IOConsumer<T> iOConsumer) {
        IOStreams.forEach(IOStreams.of(tArr), iOConsumer);
    }

    static <T> void forAll(IOConsumer<T> iOConsumer, Iterable<T> iterable) {
        IOStreams.forAll(IOStreams.of(iterable), iOConsumer);
    }

    @SafeVarargs
    static <T> void forAll(IOConsumer<T> iOConsumer, T... tArr) {
        IOStreams.forAll(IOStreams.of(tArr), iOConsumer);
    }

    static /* synthetic */ void lambda$static$0(Object obj) {
    }
}
