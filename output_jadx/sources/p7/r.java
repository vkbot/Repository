package p7;

import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.UByte;
import l9.b0;
import l9.c0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class r extends o7.c {

    /* renamed from: b, reason: collision with root package name */
    public final l9.l f5105b;

    public r(l9.l lVar) {
        this.f5105b = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l9.l] */
    @Override // o7.c
    public final o7.c S(int i10) {
        ?? obj = new Object();
        obj.write(this.f5105b, i10);
        return new r(obj);
    }

    @Override // o7.c
    public final void V(OutputStream outputStream, int i10) {
        long j10 = i10;
        outputStream.getClass();
        l9.l lVar = this.f5105b;
        l9.b.d(lVar.c, 0L, j10);
        b0 b0Var = lVar.f3577b;
        while (j10 > 0) {
            b0Var.getClass();
            int min = (int) Math.min(j10, b0Var.c - b0Var.f3561b);
            outputStream.write(b0Var.f3560a, b0Var.f3561b, min);
            int i11 = b0Var.f3561b + min;
            b0Var.f3561b = i11;
            long j11 = min;
            lVar.c -= j11;
            j10 -= j11;
            if (i11 == b0Var.c) {
                b0 a10 = b0Var.a();
                lVar.f3577b = a10;
                c0.a(b0Var);
                b0Var = a10;
            }
        }
    }

    @Override // o7.c
    public final void c0(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // o7.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5105b.b();
    }

    @Override // o7.c
    public final void d0(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            int read = this.f5105b.read(bArr, i10, i11);
            if (read != -1) {
                i11 -= read;
                i10 += read;
            } else {
                throw new IndexOutOfBoundsException(ai.onnxruntime.a.f(i11, "EOF trying to read ", " bytes"));
            }
        }
    }

    @Override // o7.c
    public final int e0() {
        try {
            return this.f5105b.readByte() & UByte.MAX_VALUE;
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // o7.c
    public final int f0() {
        return (int) this.f5105b.c;
    }

    @Override // o7.c
    public final void h0(int i10) {
        try {
            this.f5105b.skip(i10);
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }
}
