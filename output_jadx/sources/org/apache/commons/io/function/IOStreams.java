package org.apache.commons.io.function;

import java.io.IOException;
import java.util.function.BiFunction;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class IOStreams {
    static final Object NONE = new Object();

    private IOStreams() {
    }

    public static <T> void forAll(Stream<T> stream, IOConsumer<T> iOConsumer, BiFunction<Integer, IOException, IOException> biFunction) {
        IOStream.adapt(stream).forAll(iOConsumer, new b0(1));
    }

    public static <T> void forEach(Stream<T> stream, IOConsumer<T> iOConsumer) {
        of(stream).forEach(new a0(0, toIOConsumer(iOConsumer)));
    }

    public static <T> Stream<T> of(Iterable<T> iterable) {
        if (iterable == null) {
            return Stream.empty();
        }
        return StreamSupport.stream(iterable.spliterator(), false);
    }

    public static <T> IOConsumer<T> toIOConsumer(IOConsumer<T> iOConsumer) {
        if (iOConsumer != null) {
            return iOConsumer;
        }
        return IOConsumer.noop();
    }

    public static <T> void forAll(Stream<T> stream, IOConsumer<T> iOConsumer) {
        forAll(stream, iOConsumer, new b0(0));
    }

    public static <T> Stream<T> of(Stream<T> stream) {
        return stream == null ? Stream.empty() : stream;
    }

    @SafeVarargs
    public static <T> Stream<T> of(T... tArr) {
        return tArr == null ? Stream.empty() : Stream.of((Object[]) tArr);
    }

    public static /* synthetic */ IOException lambda$forAll$0(Integer num, IOException iOException) {
        return iOException;
    }
}
