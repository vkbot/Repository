package c0;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f427b;
    public int c = -1;

    public a(ByteBuffer byteBuffer) {
        this.f427b = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f427b.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i10) {
        this.c = this.f427b.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        ByteBuffer byteBuffer = this.f427b;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i11, byteBuffer.remaining());
        byteBuffer.get(bArr, i10, min);
        return min;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i10 = this.c;
        if (i10 != -1) {
            this.f427b.position(i10);
        } else {
            throw new IOException("Cannot reset to unset mark position");
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        ByteBuffer byteBuffer = this.f427b;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long min = Math.min(j10, byteBuffer.remaining());
        byteBuffer.position((int) (byteBuffer.position() + min));
        return min;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f427b;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & UByte.MAX_VALUE;
        }
        return -1;
    }
}
