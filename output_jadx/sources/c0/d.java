package c0;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public final long f430b;
    public int c;

    public d(InputStream inputStream, long j10) {
        super(inputStream);
        this.f430b = j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f430b - this.c, ((FilterInputStream) this).in.available());
    }

    public final void b(int i10) {
        int i11 = this.c;
        if (i10 >= 0) {
            this.c = i11 + i10;
            return;
        }
        long j10 = this.f430b;
        if (j10 - i11 <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j10 + ", but read: " + this.c);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int read;
        int i10;
        read = super.read();
        if (read >= 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        b(i10);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) {
        int read;
        read = super.read(bArr, i10, i11);
        b(read);
        return read;
    }
}
