package org.apache.commons.net.io;

import java.io.BufferedReader;
import java.io.Reader;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class DotTerminatedMessageReader extends BufferedReader {
    private static final char CR = '\r';
    private static final int DOT = 46;
    private static final char LF = '\n';
    private boolean atBeginning;
    private boolean eof;
    private boolean seenCR;

    public DotTerminatedMessageReader(Reader reader) {
        super(reader);
        this.atBeginning = true;
        this.eof = false;
    }

    @Override // java.io.BufferedReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (((BufferedReader) this).lock) {
            try {
                if (!this.eof) {
                    do {
                    } while (read() != -1);
                }
                this.eof = true;
                this.atBeginning = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public int read() {
        synchronized (((BufferedReader) this).lock) {
            try {
                if (this.eof) {
                    return -1;
                }
                int read = super.read();
                if (read == -1) {
                    this.eof = true;
                    return -1;
                }
                if (this.atBeginning) {
                    this.atBeginning = false;
                    if (read == 46) {
                        mark(2);
                        int read2 = super.read();
                        if (read2 != -1) {
                            if (read2 != 13) {
                                if (read2 == 46) {
                                    return read2;
                                }
                            } else {
                                int read3 = super.read();
                                if (read3 == -1) {
                                    reset();
                                    return 46;
                                }
                                if (read3 == 10) {
                                    this.atBeginning = true;
                                    this.eof = true;
                                    return -1;
                                }
                            }
                            reset();
                            return 46;
                        }
                        this.eof = true;
                        return 46;
                    }
                }
                if (this.seenCR) {
                    this.seenCR = false;
                    if (read == 10) {
                        this.atBeginning = true;
                    }
                }
                if (read == 13) {
                    this.seenCR = true;
                }
                return read;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.BufferedReader
    public String readLine() {
        StringBuilder sb = new StringBuilder();
        synchronized (((BufferedReader) this).lock) {
            while (true) {
                try {
                    int read = read();
                    if (read != -1) {
                        if (read == 10 && this.atBeginning) {
                            return sb.substring(0, sb.length() - 1);
                        }
                        sb.append((char) read);
                    } else {
                        String sb2 = sb.toString();
                        if (sb2.isEmpty()) {
                            return null;
                        }
                        return sb2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr) {
        return read(cArr, 0, cArr.length);
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public int read(char[] cArr, int i10, int i11) {
        int i12;
        if (i11 < 1) {
            return 0;
        }
        synchronized (((BufferedReader) this).lock) {
            try {
                int read = read();
                if (read == -1) {
                    return -1;
                }
                int i13 = i10;
                while (true) {
                    i12 = i13 + 1;
                    cArr[i13] = (char) read;
                    i11--;
                    if (i11 <= 0 || (read = read()) == -1) {
                        break;
                    }
                    i13 = i12;
                }
                return i12 - i10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
