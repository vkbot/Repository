package org.apache.commons.io.function;

import java.util.stream.Stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class IOStreamAdapter<T> extends IOBaseStreamAdapter<T, IOStream<T>, Stream<T>> implements IOStream<T> {
    private IOStreamAdapter(Stream<T> stream) {
        super(stream);
    }

    public static <T> IOStream<T> adapt(Stream<T> stream) {
        if (stream != null) {
            return new IOStreamAdapter(stream);
        }
        return IOStream.empty();
    }

    @Override // org.apache.commons.io.function.IOBaseStream
    public IOStream<T> wrap(Stream<T> stream) {
        if (unwrap() == stream) {
            return this;
        }
        return adapt(stream);
    }
}
