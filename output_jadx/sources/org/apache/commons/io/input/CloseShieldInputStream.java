package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.io.InputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class CloseShieldInputStream extends ProxyInputStream {
    @Deprecated
    public CloseShieldInputStream(InputStream inputStream) {
        super(inputStream);
    }

    public static InputStream systemIn(InputStream inputStream) {
        if (inputStream == System.in) {
            return wrap(inputStream);
        }
        return inputStream;
    }

    public static CloseShieldInputStream wrap(InputStream inputStream) {
        return new CloseShieldInputStream(inputStream);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterInputStream) this).in = ClosedInputStream.INSTANCE;
    }
}
