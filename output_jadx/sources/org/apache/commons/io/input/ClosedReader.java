package org.apache.commons.io.input;

import java.io.Reader;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class ClosedReader extends Reader {

    @Deprecated
    public static final ClosedReader CLOSED_READER;
    public static final ClosedReader INSTANCE;

    static {
        ClosedReader closedReader = new ClosedReader();
        INSTANCE = closedReader;
        CLOSED_READER = closedReader;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) {
        IOUtils.checkFromIndexSize(cArr, i10, i11);
        if (i11 == 0) {
            return 0;
        }
        return -1;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
