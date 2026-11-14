package org.apache.commons.io;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
final class UncheckedIOExceptions {
    private UncheckedIOExceptions() {
    }

    public static UncheckedIOException create(Object obj) {
        String objects = Objects.toString(obj);
        return new UncheckedIOException(objects, new IOException(objects));
    }

    public static UncheckedIOException wrap(IOException iOException, Object obj) {
        return new UncheckedIOException(Objects.toString(obj), iOException);
    }
}
