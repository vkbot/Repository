package org.apache.commons.io.input;

import java.io.InputStream;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class ClosedInputStream extends InputStream {

    @Deprecated
    public static final ClosedInputStream CLOSED_INPUT_STREAM;
    public static final ClosedInputStream INSTANCE;

    static {
        ClosedInputStream closedInputStream = new ClosedInputStream();
        INSTANCE = closedInputStream;
        CLOSED_INPUT_STREAM = closedInputStream;
    }

    public static InputStream ifNull(InputStream inputStream) {
        if (inputStream != null) {
            return inputStream;
        }
        return INSTANCE;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        IOUtils.checkFromIndexSize(bArr, i10, i11);
        if (i11 == 0) {
            return 0;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read() {
        return -1;
    }
}
