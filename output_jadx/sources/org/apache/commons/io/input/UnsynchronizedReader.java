package org.apache.commons.io.input;

import java.io.Reader;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class UnsynchronizedReader extends Reader {
    private static final int MAX_SKIP_BUFFER_SIZE = 8192;
    private boolean closed;
    private char[] skipBuffer;

    public void checkOpen() {
        Input.checkOpen(!isClosed());
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    public boolean isClosed() {
        return this.closed;
    }

    public void setClosed(boolean z9) {
        this.closed = z9;
    }

    @Override // java.io.Reader
    public long skip(long j10) {
        int read;
        if (j10 >= 0) {
            int min = (int) Math.min(j10, 8192L);
            char[] cArr = this.skipBuffer;
            if (cArr == null || cArr.length < min) {
                this.skipBuffer = new char[min];
            }
            long j11 = j10;
            while (j11 > 0 && (read = read(this.skipBuffer, 0, (int) Math.min(j11, min))) != -1) {
                j11 -= read;
            }
            return j10 - j11;
        }
        j1.i.k("skip value < 0");
        return 0L;
    }
}
