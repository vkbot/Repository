package org.apache.commons.net.io;

import java.io.FilterInputStream;
import java.io.InputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class ToNetASCIIInputStream extends FilterInputStream {
    private static final int LAST_WAS_CR = 1;
    private static final int LAST_WAS_NL = 2;
    private static final int NOTHING_SPECIAL = 0;
    private int status;

    public ToNetASCIIInputStream(InputStream inputStream) {
        super(inputStream);
        this.status = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int available = ((FilterInputStream) this).in.available();
        if (this.status == 2) {
            return available + 1;
        }
        return available;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = 1;
        if (i11 < 1) {
            return 0;
        }
        int available = available();
        if (i11 > available) {
            i11 = available;
        }
        if (i11 >= 1) {
            i13 = i11;
        }
        int read = read();
        if (read == -1) {
            return -1;
        }
        int i14 = i10;
        while (true) {
            i12 = i14 + 1;
            bArr[i14] = (byte) read;
            i13--;
            if (i13 <= 0 || (read = read()) == -1) {
                break;
            }
            i14 = i12;
        }
        return i12 - i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.status == 2) {
            this.status = 0;
            return 10;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != 10) {
            if (read == 13) {
                this.status = 1;
                return 13;
            }
        } else if (this.status != 1) {
            this.status = 2;
            return 13;
        }
        this.status = 0;
        return read;
    }
}
