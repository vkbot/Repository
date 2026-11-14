package q;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class x extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public volatile byte[] f5160b;
    public int c;
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f5161f;

    /* renamed from: g, reason: collision with root package name */
    public final k.g f5162g;

    public x(InputStream inputStream, k.g gVar) {
        super(inputStream);
        this.e = -1;
        this.f5162g = gVar;
        this.f5160b = (byte[]) gVar.c(65536, byte[].class);
    }

    public static void y() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f5160b != null && inputStream != null) {
        } else {
            y();
            throw null;
        }
        return (this.c - this.f5161f) + inputStream.available();
    }

    public final int b(InputStream inputStream, byte[] bArr) {
        int i10 = this.e;
        if (i10 != -1) {
            int i11 = this.f5161f - i10;
            int i12 = this.d;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f5162g.c(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f5160b = bArr2;
                    this.f5162g.g(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f5161f - this.e;
                this.f5161f = i13;
                this.e = 0;
                this.c = 0;
                int read = inputStream.read(bArr, i13, bArr.length - i13);
                int i14 = this.f5161f;
                if (read > 0) {
                    i14 += read;
                }
                this.c = i14;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.e = -1;
            this.f5161f = 0;
            this.c = read2;
        }
        return read2;
    }

    public final synchronized void c() {
        if (this.f5160b != null) {
            this.f5162g.g(this.f5160b);
            this.f5160b = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5160b != null) {
            this.f5162g.g(this.f5160b);
            this.f5160b = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        this.d = Math.max(this.d, i10);
        this.e = this.f5161f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f5160b;
        if (bArr2 != null) {
            if (i11 == 0) {
                return 0;
            }
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i14 = this.f5161f;
                int i15 = this.c;
                if (i14 < i15) {
                    int i16 = i15 - i14;
                    if (i16 >= i11) {
                        i16 = i11;
                    }
                    System.arraycopy(bArr2, i14, bArr, i10, i16);
                    this.f5161f += i16;
                    if (i16 != i11 && inputStream.available() != 0) {
                        i10 += i16;
                        i12 = i11 - i16;
                    } else {
                        return i16;
                    }
                } else {
                    i12 = i11;
                }
                while (true) {
                    int i17 = -1;
                    if (this.e == -1 && i12 >= bArr2.length) {
                        i13 = inputStream.read(bArr, i10, i12);
                        if (i13 == -1) {
                            if (i12 != i11) {
                                i17 = i11 - i12;
                            }
                            return i17;
                        }
                    } else {
                        if (b(inputStream, bArr2) == -1) {
                            if (i12 != i11) {
                                i17 = i11 - i12;
                            }
                            return i17;
                        }
                        if (bArr2 != this.f5160b && (bArr2 = this.f5160b) == null) {
                            y();
                            throw null;
                        }
                        int i18 = this.c;
                        int i19 = this.f5161f;
                        i13 = i18 - i19;
                        if (i13 >= i12) {
                            i13 = i12;
                        }
                        System.arraycopy(bArr2, i19, bArr, i10, i13);
                        this.f5161f += i13;
                    }
                    i12 -= i13;
                    if (i12 == 0) {
                        return i11;
                    }
                    if (inputStream.available() == 0) {
                        return i11 - i12;
                    }
                    i10 += i13;
                }
            } else {
                y();
                throw null;
            }
        } else {
            y();
            throw null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f5160b != null) {
            int i10 = this.e;
            if (-1 != i10) {
                this.f5161f = i10;
            } else {
                throw new IOException("Mark has been invalidated, pos: " + this.f5161f + " markLimit: " + this.d);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f5160b;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i10 = this.c;
                int i11 = this.f5161f;
                if (i10 - i11 >= j10) {
                    this.f5161f = (int) (i11 + j10);
                    return j10;
                }
                long j11 = i10 - i11;
                this.f5161f = i10;
                if (this.e != -1 && j10 <= this.d) {
                    if (b(inputStream, bArr) == -1) {
                        return j11;
                    }
                    int i12 = this.c;
                    int i13 = this.f5161f;
                    if (i12 - i13 >= j10 - j11) {
                        this.f5161f = (int) ((i13 + j10) - j11);
                        return j10;
                    }
                    long j12 = (j11 + i12) - i13;
                    this.f5161f = i12;
                    return j12;
                }
                long skip = inputStream.skip(j10 - j11);
                if (skip > 0) {
                    this.e = -1;
                }
                return j11 + skip;
            }
            y();
            throw null;
        }
        y();
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f5160b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f5161f >= this.c && b(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.f5160b && (bArr = this.f5160b) == null) {
                y();
                throw null;
            }
            int i10 = this.c;
            int i11 = this.f5161f;
            if (i10 - i11 <= 0) {
                return -1;
            }
            this.f5161f = i11 + 1;
            return bArr[i11] & UByte.MAX_VALUE;
        }
        y();
        throw null;
    }
}
