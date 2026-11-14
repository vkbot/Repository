package org.apache.commons.io.input;

import java.io.Reader;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class BoundedReader extends Reader {
    private static final int INVALID = -1;
    private int charsRead;
    private int markedAt = -1;
    private final int maxCharsFromTargetReader;
    private int readAheadLimit;
    private final Reader target;

    public BoundedReader(Reader reader, int i10) {
        this.target = reader;
        this.maxCharsFromTargetReader = i10;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.target.close();
    }

    @Override // java.io.Reader
    public void mark(int i10) {
        int i11 = this.charsRead;
        this.readAheadLimit = i10 - i11;
        this.markedAt = i11;
        this.target.mark(i10);
    }

    @Override // java.io.Reader
    public int read() {
        int i10 = this.charsRead;
        if (i10 >= this.maxCharsFromTargetReader) {
            return -1;
        }
        int i11 = this.markedAt;
        if (i11 >= 0 && i10 - i11 >= this.readAheadLimit) {
            return -1;
        }
        this.charsRead = i10 + 1;
        return this.target.read();
    }

    @Override // java.io.Reader
    public void reset() {
        this.charsRead = this.markedAt;
        this.target.reset();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) {
        IOUtils.checkFromIndexSize(cArr, i10, i11);
        for (int i12 = 0; i12 < i11; i12++) {
            int read = read();
            if (read == -1) {
                if (i12 == 0) {
                    return -1;
                }
                return i12;
            }
            cArr[i10 + i12] = (char) read;
        }
        return i11;
    }
}
