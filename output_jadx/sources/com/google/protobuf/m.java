package com.google.protobuf;

import java.io.OutputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m extends n {
    public final byte[] d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public int f1591f;

    /* renamed from: g, reason: collision with root package name */
    public final OutputStream f1592g;

    public m(OutputStream outputStream, int i10) {
        if (i10 >= 0) {
            int max = Math.max(i10, 20);
            this.d = new byte[max];
            this.e = max;
            if (outputStream != null) {
                this.f1592g = outputStream;
                return;
            } else {
                n0.b.n("out");
                throw null;
            }
        }
        j1.i.k("bufferSize must be >= 0");
        throw null;
    }

    @Override // com.google.protobuf.n
    public final void A(long j10) {
        H(10);
        F(j10);
    }

    public final void B(int i10) {
        int i11 = this.f1591f;
        int i12 = i11 + 1;
        this.f1591f = i12;
        byte[] bArr = this.d;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i11 + 2;
        this.f1591f = i13;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i11 + 3;
        this.f1591f = i14;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.f1591f = i11 + 4;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
    }

    public final void C(long j10) {
        int i10 = this.f1591f;
        int i11 = i10 + 1;
        this.f1591f = i11;
        byte[] bArr = this.d;
        bArr[i10] = (byte) (j10 & 255);
        int i12 = i10 + 2;
        this.f1591f = i12;
        bArr[i11] = (byte) ((j10 >> 8) & 255);
        int i13 = i10 + 3;
        this.f1591f = i13;
        bArr[i12] = (byte) ((j10 >> 16) & 255);
        int i14 = i10 + 4;
        this.f1591f = i14;
        bArr[i13] = (byte) (255 & (j10 >> 24));
        int i15 = i10 + 5;
        this.f1591f = i15;
        bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
        int i16 = i10 + 6;
        this.f1591f = i16;
        bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
        int i17 = i10 + 7;
        this.f1591f = i17;
        bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
        this.f1591f = i10 + 8;
        bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
    }

    public final void D(int i10, int i11) {
        E((i10 << 3) | i11);
    }

    public final void E(int i10) {
        boolean z9 = n.c;
        byte[] bArr = this.d;
        if (z9) {
            while (true) {
                int i11 = i10 & (-128);
                int i12 = this.f1591f;
                if (i11 == 0) {
                    this.f1591f = i12 + 1;
                    s1.k(bArr, i12, (byte) i10);
                    return;
                } else {
                    this.f1591f = i12 + 1;
                    s1.k(bArr, i12, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
            }
        } else {
            while (true) {
                int i13 = i10 & (-128);
                int i14 = this.f1591f;
                if (i13 == 0) {
                    this.f1591f = i14 + 1;
                    bArr[i14] = (byte) i10;
                    return;
                } else {
                    this.f1591f = i14 + 1;
                    bArr[i14] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                }
            }
        }
    }

    public final void F(long j10) {
        boolean z9 = n.c;
        byte[] bArr = this.d;
        if (z9) {
            while (true) {
                long j11 = j10 & (-128);
                int i10 = this.f1591f;
                if (j11 == 0) {
                    this.f1591f = i10 + 1;
                    s1.k(bArr, i10, (byte) j10);
                    return;
                } else {
                    this.f1591f = i10 + 1;
                    s1.k(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
            }
        } else {
            while (true) {
                long j12 = j10 & (-128);
                int i11 = this.f1591f;
                if (j12 == 0) {
                    this.f1591f = i11 + 1;
                    bArr[i11] = (byte) j10;
                    return;
                } else {
                    this.f1591f = i11 + 1;
                    bArr[i11] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                }
            }
        }
    }

    public final void G() {
        this.f1592g.write(this.d, 0, this.f1591f);
        this.f1591f = 0;
    }

    public final void H(int i10) {
        if (this.e - this.f1591f < i10) {
            G();
        }
    }

    public final void I(byte[] bArr, int i10, int i11) {
        int i12 = this.f1591f;
        int i13 = this.e;
        int i14 = i13 - i12;
        byte[] bArr2 = this.d;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f1591f += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f1591f = i13;
        G();
        if (i16 <= i13) {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f1591f = i16;
        } else {
            this.f1592g.write(bArr, i15, i16);
        }
    }

    @Override // com.google.protobuf.n
    public final void g(byte b10) {
        if (this.f1591f == this.e) {
            G();
        }
        int i10 = this.f1591f;
        this.f1591f = i10 + 1;
        this.d[i10] = b10;
    }

    @Override // com.google.protobuf.n
    public final void h(int i10, boolean z9) {
        H(11);
        D(i10, 0);
        byte b10 = z9 ? (byte) 1 : (byte) 0;
        int i11 = this.f1591f;
        this.f1591f = i11 + 1;
        this.d[i11] = b10;
    }

    @Override // com.google.protobuf.n
    public final void i(int i10, byte[] bArr) {
        y(i10);
        I(bArr, 0, i10);
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
        H(14);
        D(i10, 5);
        B(i11);
    }

    @Override // com.google.protobuf.n
    public final void m(int i10) {
        H(4);
        B(i10);
    }

    @Override // com.google.protobuf.n
    public final void n(int i10, long j10) {
        H(18);
        D(i10, 1);
        C(j10);
    }

    @Override // com.google.protobuf.n
    public final void o(long j10) {
        H(8);
        C(j10);
    }

    @Override // com.google.protobuf.n
    public final void p(int i10, int i11) {
        H(20);
        D(i10, 0);
        if (i11 >= 0) {
            E(i11);
        } else {
            F(i11);
        }
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
        I(bArr, i10, i11);
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
        try {
            int length = str.length() * 3;
            int d = n.d(length);
            int i10 = d + length;
            int i11 = this.e;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int b10 = v1.f1639a.b(str, bArr, 0, length);
                y(b10);
                I(bArr, 0, b10);
                return;
            }
            if (i10 > i11 - this.f1591f) {
                G();
            }
            int d10 = n.d(str.length());
            int i12 = this.f1591f;
            byte[] bArr2 = this.d;
            try {
                if (d10 == d) {
                    int i13 = i12 + d10;
                    this.f1591f = i13;
                    int b11 = v1.f1639a.b(str, bArr2, i13, i11 - i13);
                    this.f1591f = i12;
                    E((b11 - i12) - d10);
                    this.f1591f = b11;
                } else {
                    int b12 = v1.b(str);
                    E(b12);
                    this.f1591f = v1.f1639a.b(str, bArr2, this.f1591f, b12);
                }
            } catch (u1 e) {
                this.f1591f = i12;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e6) {
                throw new l(e6);
            }
        } catch (u1 e10) {
            f(str, e10);
        }
    }

    @Override // com.google.protobuf.n
    public final void w(int i10, int i11) {
        y((i10 << 3) | i11);
    }

    @Override // com.google.protobuf.n
    public final void x(int i10, int i11) {
        H(20);
        D(i10, 0);
        E(i11);
    }

    @Override // com.google.protobuf.n
    public final void y(int i10) {
        H(5);
        E(i10);
    }

    @Override // com.google.protobuf.n
    public final void z(int i10, long j10) {
        H(20);
        D(i10, 0);
        F(j10);
    }
}
