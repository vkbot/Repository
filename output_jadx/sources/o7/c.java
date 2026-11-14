package o7;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class c implements Closeable {
    public abstract c S(int i10);

    public abstract void V(OutputStream outputStream, int i10);

    public final void b(int i10) {
        if (f0() >= i10) {
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public abstract void c0(ByteBuffer byteBuffer);

    public abstract void d0(byte[] bArr, int i10, int i11);

    public abstract int e0();

    public abstract int f0();

    public void g0() {
        throw new UnsupportedOperationException();
    }

    public abstract void h0(int i10);

    public boolean y() {
        return this instanceof j3;
    }

    public void c() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
