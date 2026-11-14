package com.google.protobuf;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k extends n {
    public final byte[] d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public int f1586f;

    public k(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) >= 0) {
                this.d = bArr;
                this.f1586f = i10;
                this.e = i12;
                return;
            }
            n0.b.v("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)});
            throw null;
        }
        n0.b.n("buffer");
        throw null;
    }

    @Override // com.google.protobuf.n
    public final void A(long j10) {
        boolean z9 = n.c;
        byte[] bArr = this.d;
        if (!z9 || B() < 10) {
            while (true) {
                long j11 = j10 & (-128);
                int i10 = this.f1586f;
                if (j11 == 0) {
                    this.f1586f = i10 + 1;
                    bArr[i10] = (byte) j10;
                    return;
                } else {
                    try {
                        this.f1586f = i10 + 1;
                        bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                        j10 >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1586f), Integer.valueOf(this.e), 1), e);
                    }
                }
                throw new l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1586f), Integer.valueOf(this.e), 1), e);
            }
        }
        while (true) {
            long j12 = j10 & (-128);
            int i11 = this.f1586f;
            if (j12 == 0) {
                this.f1586f = i11 + 1;
                s1.k(bArr, i11, (byte) j10);
                return;
            } else {
                this.f1586f = i11 + 1;
                s1.k(bArr, i11, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
        }
    }

    public final int B() {
        return this.e - this.f1586f;
    }

    public final void C(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, i10, this.d, this.f1586f, i11);
            this.f1586f += i11;
        } catch (IndexOutOfBoundsException e) {
            throw new l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1586f), Integer.valueOf(this.e), Integer.valueOf(i11)), e);
        }
    }

    @Override // com.google.protobuf.n
    public final void g(byte b10) {
        try {
            byte[] bArr = this.d;
            int i10 = this.f1586f;
            this.f1586f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e) {
            throw new l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1586f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.google.protobuf.n
    public final void h(int i10, boolean z9) {
        w(i10, 0);
        g(z9 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.n
    public final void i(int i10, byte[] bArr) {
        y(i10);
        C(bArr, 0, i10);
    }

    @Override // com.google.protobuf.n
    public final void j(int i10, g gVar) {
        w(i10, 2);
        k(gVar);
    }

    @Override // com.google.protobuf.n
    public final void k(g gVar) {
        y(gVar.size());
        r(gVar.c, gVar.f(), gVar.size());
    }

    @Override // com.google.protobuf.n
    public final void l(int i10, int i11) {
        w(i10, 5);
        m(i11);
    }

    @Override // com.google.protobuf.n
    public final void m(int i10) {
        try {
            byte[] bArr = this.d;
            int i11 = this.f1586f;
            int i12 = i11 + 1;
            this.f1586f = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f1586f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f1586f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f1586f = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1586f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.google.protobuf.n
    public final void n(int i10, long j10) {
        w(i10, 1);
        o(j10);
    }

    @Override // com.google.protobuf.n
    public final void o(long j10) {
        try {
            byte[] bArr = this.d;
            int i10 = this.f1586f;
            int i11 = i10 + 1;
            this.f1586f = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i10 + 2;
            this.f1586f = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i10 + 3;
            this.f1586f = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i10 + 4;
            this.f1586f = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i10 + 5;
            this.f1586f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f1586f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f1586f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f1586f = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1586f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.google.protobuf.n
    public final void p(int i10, int i11) {
        w(i10, 0);
        q(i11);
    }

    @Override // com.google.protobuf.n
    public final void q(int i10) {
        if (i10 >= 0) {
            y(i10);
        } else {
            A(i10);
        }
    }

    @Override // com.google.protobuf.n
    public final void r(byte[] bArr, int i10, int i11) {
        C(bArr, i10, i11);
    }

    @Override // com.google.protobuf.n
    public final void s(int i10, a aVar, b1 b1Var) {
        w(i10, 2);
        y(aVar.a(b1Var));
        b1Var.a(aVar, this.f1597a);
    }

    @Override // com.google.protobuf.n
    public final void t(a aVar) {
        y(((y) aVar).a(null));
        aVar.c(this);
    }

    @Override // com.google.protobuf.n
    public final void u(int i10, String str) {
        w(i10, 2);
        v(str);
    }

    @Override // com.google.protobuf.n
    public final void v(String str) {
        int i10 = this.f1586f;
        try {
            int d = n.d(str.length() * 3);
            int d10 = n.d(str.length());
            byte[] bArr = this.d;
            if (d10 == d) {
                int i11 = i10 + d10;
                this.f1586f = i11;
                int b10 = v1.f1639a.b(str, bArr, i11, B());
                this.f1586f = i10;
                y((b10 - i10) - d10);
                this.f1586f = b10;
                return;
            }
            y(v1.b(str));
            this.f1586f = v1.f1639a.b(str, bArr, this.f1586f, B());
        } catch (u1 e) {
            this.f1586f = i10;
            f(str, e);
        } catch (IndexOutOfBoundsException e6) {
            throw new l(e6);
        }
    }

    @Override // com.google.protobuf.n
    public final void w(int i10, int i11) {
        y((i10 << 3) | i11);
    }

    @Override // com.google.protobuf.n
    public final void x(int i10, int i11) {
        w(i10, 0);
        y(i11);
    }

    @Override // com.google.protobuf.n
    public final void y(int i10) {
        while (true) {
            int i11 = i10 & (-128);
            int i12 = this.f1586f;
            byte[] bArr = this.d;
            if (i11 == 0) {
                this.f1586f = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            } else {
                try {
                    this.f1586f = i12 + 1;
                    bArr[i12] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1586f), Integer.valueOf(this.e), 1), e);
                }
            }
            throw new l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f1586f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.google.protobuf.n
    public final void z(int i10, long j10) {
        w(i10, 0);
        A(j10);
    }
}
