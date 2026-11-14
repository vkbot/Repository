package org.apache.commons.io.function;

import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@FunctionalInterface
/* loaded from: classes2.dex */
public interface IOTriConsumer<T, U, V> {
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$0(IOTriConsumer iOTriConsumer, Object obj, Object obj2, Object obj3) {
        accept(obj, obj2, obj3);
        iOTriConsumer.accept(obj, obj2, obj3);
    }

    static /* synthetic */ void n(IOTriConsumer iOTriConsumer, IOTriConsumer iOTriConsumer2, Object obj, Object obj2, Object obj3) {
        iOTriConsumer.lambda$andThen$0(iOTriConsumer2, obj, obj2, obj3);
    }

    static <T, U, V> IOTriConsumer<T, U, V> noop() {
        return Constants.IO_TRI_CONSUMER;
    }

    void accept(T t, U u8, V v9);

    default IOTriConsumer<T, U, V> andThen(IOTriConsumer<? super T, ? super U, ? super V> iOTriConsumer) {
        Objects.requireNonNull(iOTriConsumer);
        return new f5.f(22, this, iOTriConsumer);
    }
}
