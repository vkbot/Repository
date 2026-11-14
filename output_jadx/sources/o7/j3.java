package o7;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import kotlin.UByte;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j3 extends c {

    /* renamed from: b, reason: collision with root package name */
    public int f4563b;
    public final int c;
    public final byte[] d;
    public int e = -1;

    public j3(byte[] bArr, int i10, int i11) {
        boolean z9;
        boolean z10;
        if (i10 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.d("offset must be >= 0", z9);
        if (i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        o4.b.d("length must be >= 0", z10);
        int i12 = i11 + i10;
        o4.b.d("offset + length exceeds array boundary", i12 <= bArr.length);
        this.d = bArr;
        this.f4563b = i10;
        this.c = i12;
    }

    @Override // o7.c
    public final c S(int i10) {
        b(i10);
        int i11 = this.f4563b;
        this.f4563b = i11 + i10;
        return new j3(this.d, i11, i10);
    }

    @Override // o7.c
    public final void V(OutputStream outputStream, int i10) {
        b(i10);
        outputStream.write(this.d, this.f4563b, i10);
        this.f4563b += i10;
    }

    @Override // o7.c
    public final void c() {
        this.e = this.f4563b;
    }

    @Override // o7.c
    public final void c0(ByteBuffer byteBuffer) {
        o4.b.i(byteBuffer, "dest");
        int remaining = byteBuffer.remaining();
        b(remaining);
        byteBuffer.put(this.d, this.f4563b, remaining);
        this.f4563b += remaining;
    }

    @Override // o7.c
    public final void d0(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.d, this.f4563b, bArr, i10, i11);
        this.f4563b += i11;
    }

    @Override // o7.c
    public final int e0() {
        b(1);
        int i10 = this.f4563b;
        this.f4563b = i10 + 1;
        return this.d[i10] & UByte.MAX_VALUE;
    }

    @Override // o7.c
    public final int f0() {
        return this.c - this.f4563b;
    }

    @Override // o7.c
    public final void g0() {
        int i10 = this.e;
        if (i10 != -1) {
            this.f4563b = i10;
            return;
        }
        throw new InvalidMarkException();
    }

    @Override // o7.c
    public final void h0(int i10) {
        b(i10);
        this.f4563b += i10;
    }
}
