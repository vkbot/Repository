package org.apache.commons.io.input;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class NullReader extends Reader {
    public static final NullReader INSTANCE = new NullReader();
    private boolean eof;
    private long mark;
    private final boolean markSupported;
    private long position;
    private long readLimit;
    private final long size;
    private final boolean throwEofException;

    public NullReader(long j10, boolean z9, boolean z10) {
        this.mark = -1L;
        this.size = j10;
        this.markSupported = z9;
        this.throwEofException = z10;
    }

    private int doEndOfFile() {
        this.eof = true;
        if (!this.throwEofException) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.eof = false;
        this.position = 0L;
        this.mark = -1L;
    }

    public long getPosition() {
        return this.position;
    }

    public long getSize() {
        return this.size;
    }

    @Override // java.io.Reader
    public synchronized void mark(int i10) {
        if (this.markSupported) {
            this.mark = this.position;
            this.readLimit = i10;
        } else {
            throw UnsupportedOperationExceptions.mark();
        }
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return this.markSupported;
    }

    public int processChar() {
        return 0;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) {
        IOUtils.checkFromIndexSize(cArr, i10, i11);
        if (i11 == 0) {
            return 0;
        }
        if (!this.eof) {
            long j10 = this.position;
            long j11 = this.size;
            if (j10 == j11) {
                return doEndOfFile();
            }
            long j12 = j10 + i11;
            this.position = j12;
            if (j12 > j11) {
                i11 -= (int) (j12 - j11);
                this.position = j11;
            }
            processChars(cArr, i10, i11);
            return i11;
        }
        n0.b.A("Read after end of file");
        return 0;
    }

    @Override // java.io.Reader
    public synchronized void reset() {
        if (this.markSupported) {
            long j10 = this.mark;
            if (j10 >= 0) {
                if (this.position <= this.readLimit + j10) {
                    this.position = j10;
                    this.eof = false;
                } else {
                    throw new IOException("Marked position [" + this.mark + "] is no longer valid - passed the read limit [" + this.readLimit + "]");
                }
            } else {
                throw new IOException("No position has been marked");
            }
        } else {
            throw UnsupportedOperationExceptions.reset();
        }
    }

    @Override // java.io.Reader
    public long skip(long j10) {
        if (!this.eof) {
            long j11 = this.position;
            long j12 = this.size;
            if (j11 == j12) {
                return doEndOfFile();
            }
            long j13 = j11 + j10;
            this.position = j13;
            if (j13 > j12) {
                long j14 = j10 - (j13 - j12);
                this.position = j12;
                return j14;
            }
            return j10;
        }
        n0.b.A("Skip after end of file");
        return 0L;
    }

    public NullReader(long j10) {
        this(j10, true, false);
    }

    public NullReader() {
        this(0L, true, false);
    }

    @Override // java.io.Reader
    public int read(char[] cArr) {
        return read(cArr, 0, cArr.length);
    }

    @Override // java.io.Reader
    public int read() {
        if (!this.eof) {
            long j10 = this.position;
            if (j10 == this.size) {
                return doEndOfFile();
            }
            this.position = j10 + 1;
            return processChar();
        }
        n0.b.A("Read after end of file");
        return 0;
    }

    public void processChars(char[] cArr, int i10, int i11) {
    }
}
