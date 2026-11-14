package c0;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import q.x;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends InputStream {
    public static final ArrayDeque d;

    /* renamed from: b, reason: collision with root package name */
    public x f431b;
    public IOException c;

    static {
        char[] cArr = p.f446a;
        d = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f431b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f431b.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f431b.mark(i10);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f431b.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.f431b.read();
        } catch (IOException e) {
            this.c = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f431b.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        try {
            return this.f431b.skip(j10);
        } catch (IOException e) {
            this.c = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.f431b.read(bArr);
        } catch (IOException e) {
            this.c = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f431b.read(bArr, i10, i11);
        } catch (IOException e) {
            this.c = e;
            throw e;
        }
    }
}
