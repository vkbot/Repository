package org.apache.commons.io.function;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.Spliterators;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.apache.commons.io.IOExceptionList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public interface IOStream<T> extends IOBaseStream<T, IOStream<T>, Stream<T>> {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* renamed from: org.apache.commons.io.function.IOStream$1 */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Iterator<T> {
        T t = (T) IOStreams.NONE;
        final /* synthetic */ IOUnaryOperator val$f;
        final /* synthetic */ Object val$seed;

        public AnonymousClass1(Object obj, IOUnaryOperator iOUnaryOperator) {
            r1 = obj;
            r2 = iOUnaryOperator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return true;
        }

        @Override // java.util.Iterator
        public T next() {
            T apply;
            try {
                T t = this.t;
                if (t == IOStreams.NONE) {
                    apply = (T) r1;
                } else {
                    apply = r2.apply(t);
                }
                this.t = apply;
                return apply;
            } catch (IOException e) {
                NoSuchElementException noSuchElementException = new NoSuchElementException();
                noSuchElementException.initCause(e);
                throw noSuchElementException;
            }
        }
    }

    static <T> IOStream<T> adapt(Stream<T> stream) {
        return IOStreamAdapter.adapt(stream);
    }

    static <T> IOStream<T> empty() {
        return IOStreamAdapter.adapt(Stream.empty());
    }

    static <T> IOStream<T> iterate(T t, IOUnaryOperator<T> iOUnaryOperator) {
        Objects.requireNonNull(iOUnaryOperator);
        return adapt(StreamSupport.stream(Spliterators.spliteratorUnknownSize(new Iterator<T>() { // from class: org.apache.commons.io.function.IOStream.1
            T t = (T) IOStreams.NONE;
            final /* synthetic */ IOUnaryOperator val$f;
            final /* synthetic */ Object val$seed;

            public AnonymousClass1(Object t3, IOUnaryOperator iOUnaryOperator2) {
                r1 = t3;
                r2 = iOUnaryOperator2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return true;
            }

            @Override // java.util.Iterator
            public T next() {
                T apply;
                try {
                    T t3 = this.t;
                    if (t3 == IOStreams.NONE) {
                        apply = (T) r1;
                    } else {
                        apply = r2.apply(t3);
                    }
                    this.t = apply;
                    return apply;
                } catch (IOException e) {
                    NoSuchElementException noSuchElementException = new NoSuchElementException();
                    noSuchElementException.initCause(e);
                    throw noSuchElementException;
                }
            }
        }, 1040), false));
    }

    static /* synthetic */ Stream lambda$flatMap$6(IOFunction iOFunction, Object obj) {
        return ((IOStream) Erase.apply(iOFunction, obj)).unwrap();
    }

    static /* synthetic */ DoubleStream lambda$flatMapToDouble$7(IOFunction iOFunction, Object obj) {
        return (DoubleStream) Erase.apply(iOFunction, obj);
    }

    static /* synthetic */ IntStream lambda$flatMapToInt$8(IOFunction iOFunction, Object obj) {
        return (IntStream) Erase.apply(iOFunction, obj);
    }

    static /* synthetic */ LongStream lambda$flatMapToLong$9(IOFunction iOFunction, Object obj) {
        return (LongStream) Erase.apply(iOFunction, obj);
    }

    static /* synthetic */ void lambda$forAll$11(IOConsumer iOConsumer, AtomicReference atomicReference, BiFunction biFunction, AtomicInteger atomicInteger, Object obj) {
        try {
            iOConsumer.accept(obj);
        } catch (IOException e) {
            if (atomicReference.get() == null) {
                atomicReference.set(new ArrayList());
            }
            if (biFunction != null) {
                ((List) atomicReference.get()).add((IOException) biFunction.apply(Integer.valueOf(atomicInteger.get()), e));
            }
        }
        atomicInteger.incrementAndGet();
    }

    static /* synthetic */ Object lambda$reduce$21(IOBiFunction iOBiFunction, Object obj, Object obj2) {
        return Erase.apply(iOBiFunction, obj, obj2);
    }

    static <T> IOStream<T> of(Iterable<T> iterable) {
        if (iterable == null) {
            return empty();
        }
        return adapt(StreamSupport.stream(iterable.spliterator(), false));
    }

    default boolean allMatch(IOPredicate<? super T> iOPredicate) {
        return unwrap().allMatch(new x(iOPredicate, 3));
    }

    default boolean anyMatch(IOPredicate<? super T> iOPredicate) {
        return unwrap().anyMatch(new x(iOPredicate, 2));
    }

    default <R> R collect(IOSupplier<R> iOSupplier, IOBiConsumer<R, ? super T> iOBiConsumer, IOBiConsumer<R, R> iOBiConsumer2) {
        return (R) unwrap().collect(new z(iOSupplier, 0), new e(iOBiConsumer, 2), new e(iOBiConsumer2, 1));
    }

    default long count() {
        return unwrap().count();
    }

    default IOStream<T> distinct() {
        return adapt(unwrap().distinct());
    }

    default IOStream<T> filter(IOPredicate<? super T> iOPredicate) {
        return adapt(unwrap().filter(new x(iOPredicate, 1)));
    }

    default Optional<T> findAny() {
        return unwrap().findAny();
    }

    default Optional<T> findFirst() {
        return unwrap().findFirst();
    }

    default <R> IOStream<R> flatMap(IOFunction<? super T, ? extends IOStream<? extends R>> iOFunction) {
        return adapt(unwrap().flatMap(new n(iOFunction, 2)));
    }

    default DoubleStream flatMapToDouble(IOFunction<? super T, ? extends DoubleStream> iOFunction) {
        return unwrap().flatMapToDouble(new n(iOFunction, 5));
    }

    default IntStream flatMapToInt(IOFunction<? super T, ? extends IntStream> iOFunction) {
        return unwrap().flatMapToInt(new n(iOFunction, 3));
    }

    default LongStream flatMapToLong(IOFunction<? super T, ? extends LongStream> iOFunction) {
        return unwrap().flatMapToLong(new n(iOFunction, 4));
    }

    default void forAll(IOConsumer<T> iOConsumer, final BiFunction<Integer, IOException, IOException> biFunction) {
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicInteger atomicInteger = new AtomicInteger();
        final IOConsumer iOConsumer2 = IOStreams.toIOConsumer(iOConsumer);
        unwrap().forEach(new Consumer() { // from class: org.apache.commons.io.function.y
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                IOStream.lambda$forAll$11(IOConsumer.this, atomicReference, biFunction, atomicInteger, obj);
            }
        });
        IOExceptionList.checkEmpty((List) atomicReference.get(), null);
    }

    default void forEach(IOConsumer<? super T> iOConsumer) {
        unwrap().forEach(new a0(3, iOConsumer));
    }

    default void forEachOrdered(IOConsumer<? super T> iOConsumer) {
        unwrap().forEachOrdered(new a0(4, iOConsumer));
    }

    default IOStream<T> limit(long j10) {
        return adapt(unwrap().limit(j10));
    }

    default <R> IOStream<R> map(IOFunction<? super T, ? extends R> iOFunction) {
        return adapt(unwrap().map(new n(iOFunction, 1)));
    }

    default DoubleStream mapToDouble(ToDoubleFunction<? super T> toDoubleFunction) {
        return unwrap().mapToDouble(toDoubleFunction);
    }

    default IntStream mapToInt(ToIntFunction<? super T> toIntFunction) {
        return unwrap().mapToInt(toIntFunction);
    }

    default LongStream mapToLong(ToLongFunction<? super T> toLongFunction) {
        return unwrap().mapToLong(toLongFunction);
    }

    default Optional<T> max(IOComparator<? super T> iOComparator) {
        return unwrap().max(new k(iOComparator, 3));
    }

    default Optional<T> min(IOComparator<? super T> iOComparator) {
        return unwrap().min(new k(iOComparator, 2));
    }

    default boolean noneMatch(IOPredicate<? super T> iOPredicate) {
        return unwrap().noneMatch(new x(iOPredicate, 4));
    }

    default IOStream<T> peek(IOConsumer<? super T> iOConsumer) {
        return adapt(unwrap().peek(new a0(2, iOConsumer)));
    }

    default <U> U reduce(U u8, IOBiFunction<U, ? super T, U> iOBiFunction, IOBinaryOperator<U> iOBinaryOperator) {
        return (U) unwrap().reduce(u8, new g(iOBiFunction, 1), new h(iOBinaryOperator, 2));
    }

    default IOStream<T> skip(long j10) {
        return adapt(unwrap().skip(j10));
    }

    default IOStream<T> sorted(IOComparator<? super T> iOComparator) {
        return adapt(unwrap().sorted(new k(iOComparator, 1)));
    }

    default Object[] toArray() {
        return unwrap().toArray();
    }

    default <A> A[] toArray(IntFunction<A[]> intFunction) {
        return (A[]) unwrap().toArray(intFunction);
    }

    @SafeVarargs
    static <T> IOStream<T> of(T... tArr) {
        return (tArr == null || tArr.length == 0) ? empty() : adapt(Arrays.stream(tArr));
    }

    default IOStream<T> sorted() {
        return adapt(unwrap().sorted());
    }

    static <T> IOStream<T> of(T t) {
        return adapt(Stream.of(t));
    }

    default T reduce(T t, IOBinaryOperator<T> iOBinaryOperator) {
        return unwrap().reduce(t, new h(iOBinaryOperator, 3));
    }

    default Optional<T> reduce(IOBinaryOperator<T> iOBinaryOperator) {
        return unwrap().reduce(new h(iOBinaryOperator, 1));
    }

    default <R, A> R collect(Collector<? super T, A, R> collector) {
        return (R) unwrap().collect(collector);
    }

    default void forAll(IOConsumer<T> iOConsumer) {
        forAll(iOConsumer, new b0(2));
    }

    static /* synthetic */ IOException lambda$forAll$10(Integer num, IOException iOException) {
        return iOException;
    }
}
