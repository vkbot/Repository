package org.apache.commons.io.input;

import java.io.Reader;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class UnsynchronizedBufferedReader extends UnsynchronizedReader {
    private static final char NUL = 0;
    private char[] buf;
    private int end;
    private final Reader in;
    private int mark;
    private int markLimit;
    private int pos;

    public UnsynchronizedBufferedReader(Reader reader, int i10) {
        this.mark = -1;
        this.markLimit = -1;
        if (i10 > 0) {
            this.in = reader;
            this.buf = new char[i10];
        } else {
            j1.i.k("size <= 0");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int fillBuf() {
        /*
            r6 = this;
            int r0 = r6.mark
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L50
            int r3 = r6.pos
            int r3 = r3 - r0
            int r4 = r6.markLimit
            if (r3 < r4) goto Le
            goto L50
        Le:
            if (r0 != 0) goto L25
            char[] r3 = r6.buf
            int r5 = r3.length
            if (r4 <= r5) goto L25
            int r0 = r3.length
            int r0 = r0 * 2
            if (r0 <= r4) goto L1b
            goto L1c
        L1b:
            r4 = r0
        L1c:
            char[] r0 = new char[r4]
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r1, r0, r1, r4)
            r6.buf = r0
            goto L3c
        L25:
            if (r0 <= 0) goto L3c
            char[] r3 = r6.buf
            int r4 = r3.length
            int r4 = r4 - r0
            java.lang.System.arraycopy(r3, r0, r3, r1, r4)
            int r0 = r6.pos
            int r3 = r6.mark
            int r0 = r0 - r3
            r6.pos = r0
            int r0 = r6.end
            int r0 = r0 - r3
            r6.end = r0
            r6.mark = r1
        L3c:
            java.io.Reader r0 = r6.in
            char[] r1 = r6.buf
            int r3 = r6.pos
            int r4 = r1.length
            int r4 = r4 - r3
            int r0 = r0.read(r1, r3, r4)
            if (r0 == r2) goto L4f
            int r1 = r6.end
            int r1 = r1 + r0
            r6.end = r1
        L4f:
            return r0
        L50:
            java.io.Reader r0 = r6.in
            char[] r3 = r6.buf
            int r4 = r3.length
            int r0 = r0.read(r3, r1, r4)
            if (r0 <= 0) goto L61
            r6.mark = r2
            r6.pos = r1
            r6.end = r0
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.UnsynchronizedBufferedReader.fillBuf():int");
    }

    public final void chompNewline() {
        if (this.pos != this.end || fillBuf() != -1) {
            char[] cArr = this.buf;
            int i10 = this.pos;
            if (cArr[i10] == '\n') {
                this.pos = i10 + 1;
            }
        }
    }

    @Override // org.apache.commons.io.input.UnsynchronizedReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!isClosed()) {
            this.in.close();
            this.buf = null;
            super.close();
        }
    }

    @Override // java.io.Reader
    public void mark(int i10) {
        if (i10 >= 0) {
            checkOpen();
            this.markLimit = i10;
            this.mark = this.pos;
            return;
        }
        l9.i.a();
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    public int peek(char[] cArr) {
        int length = cArr.length;
        mark(length);
        int read = read(cArr, 0, length);
        reset();
        return read;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) {
        checkOpen();
        IOUtils.checkFromIndexSize(cArr, i10, i11);
        if (i11 == 0) {
            return 0;
        }
        int i12 = i11;
        while (true) {
            if (i12 <= 0) {
                break;
            }
            int i13 = this.end;
            int i14 = this.pos;
            int i15 = i13 - i14;
            if (i15 > 0) {
                if (i15 >= i12) {
                    i15 = i12;
                }
                System.arraycopy(this.buf, i14, cArr, i10, i15);
                this.pos += i15;
                i10 += i15;
                i12 -= i15;
            }
            if (i12 == 0 || (i12 < i11 && !this.in.ready())) {
                break;
            }
            int i16 = this.mark;
            if ((i16 == -1 || this.pos - i16 >= this.markLimit) && i12 >= this.buf.length) {
                int read = this.in.read(cArr, i10, i12);
                if (read > 0) {
                    i12 -= read;
                    this.mark = -1;
                }
            } else if (fillBuf() == -1) {
                break;
            }
        }
        int i17 = i11 - i12;
        if (i17 <= 0 && i17 != i11) {
            return -1;
        }
        return i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c6, code lost:
    
        r4 = r9.buf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c8, code lost:
    
        if (r1 != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d1, code lost:
    
        r0.append(r4, r9.pos, (r7 - r8) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ca, code lost:
    
        r8 = r9.pos;
        r0.append(r4, r8, r7 - r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String readLine() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.UnsynchronizedBufferedReader.readLine():java.lang.String");
    }

    @Override // java.io.Reader
    public boolean ready() {
        checkOpen();
        if (this.end - this.pos <= 0 && !this.in.ready()) {
            return false;
        }
        return true;
    }

    @Override // java.io.Reader
    public void reset() {
        checkOpen();
        int i10 = this.mark;
        if (i10 != -1) {
            this.pos = i10;
        } else {
            n0.b.A("mark == -1");
        }
    }

    @Override // org.apache.commons.io.input.UnsynchronizedReader, java.io.Reader
    public long skip(long j10) {
        if (j10 >= 0) {
            checkOpen();
            if (j10 < 1) {
                return 0L;
            }
            int i10 = this.end;
            int i11 = this.pos;
            if (i10 - i11 >= j10) {
                this.pos = Math.toIntExact(j10) + i11;
                return j10;
            }
            long j11 = i10 - i11;
            this.pos = i10;
            while (j11 < j10) {
                if (fillBuf() == -1) {
                    return j11;
                }
                int i12 = this.end;
                int i13 = this.pos;
                long j12 = j10 - j11;
                if (i12 - i13 >= j12) {
                    this.pos = Math.toIntExact(j12) + i13;
                    return j10;
                }
                j11 += i12 - i13;
                this.pos = i12;
            }
            return j10;
        }
        l9.i.a();
        return 0L;
    }

    public int peek() {
        mark(1);
        int read = read();
        reset();
        return read;
    }

    public UnsynchronizedBufferedReader(Reader reader) {
        this(reader, 8192);
    }

    @Override // java.io.Reader
    public int read() {
        checkOpen();
        if (this.pos >= this.end && fillBuf() == -1) {
            return -1;
        }
        char[] cArr = this.buf;
        int i10 = this.pos;
        this.pos = i10 + 1;
        return cArr[i10];
    }
}
