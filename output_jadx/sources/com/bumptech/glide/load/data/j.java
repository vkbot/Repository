package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.UByte;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j extends FilterInputStream {
    public static final byte[] d = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
    public static final int e = 31;

    /* renamed from: b, reason: collision with root package name */
    public final byte f652b;
    public int c;

    public j(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 >= -1 && i10 <= 8) {
            this.f652b = (byte) i10;
        } else {
            j1.i.k(ai.onnxruntime.a.e(i10, "Cannot add invalid orientation: "));
            throw null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = this.c;
        int i14 = e;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f652b;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int min = Math.min(i14 - i13, i11);
            System.arraycopy(d, this.c - 2, bArr, i10, min);
            i12 = min;
        }
        if (i12 > 0) {
            this.c += i12;
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long skip = super.skip(j10);
        if (skip > 0) {
            this.c = (int) (this.c + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read;
        int i10;
        int i11 = this.c;
        if (i11 < 2 || i11 > (i10 = e)) {
            read = super.read();
        } else if (i11 == i10) {
            read = this.f652b;
        } else {
            read = d[i11 - 2] & UByte.MAX_VALUE;
        }
        if (read != -1) {
            this.c++;
        }
        return read;
    }
}
