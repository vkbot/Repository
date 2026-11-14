package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i extends j {
    public final InputStream d;
    public final byte[] e;

    /* renamed from: f, reason: collision with root package name */
    public int f1573f;

    /* renamed from: g, reason: collision with root package name */
    public int f1574g;

    /* renamed from: h, reason: collision with root package name */
    public int f1575h;

    /* renamed from: i, reason: collision with root package name */
    public int f1576i;

    /* renamed from: j, reason: collision with root package name */
    public int f1577j;

    /* renamed from: k, reason: collision with root package name */
    public int f1578k = Integer.MAX_VALUE;

    public i(InputStream inputStream) {
        b0.a(inputStream, "input");
        this.d = inputStream;
        this.e = new byte[4096];
        this.f1573f = 0;
        this.f1575h = 0;
        this.f1577j = 0;
    }

    public final byte[] A(int i10) {
        if (i10 == 0) {
            return b0.f1536b;
        }
        if (i10 >= 0) {
            int i11 = this.f1577j;
            int i12 = this.f1575h;
            int i13 = i11 + i12 + i10;
            if (i13 - Integer.MAX_VALUE <= 0) {
                int i14 = this.f1578k;
                if (i13 <= i14) {
                    int i15 = this.f1573f - i12;
                    int i16 = i10 - i15;
                    InputStream inputStream = this.d;
                    if (i16 >= 4096) {
                        try {
                            if (i16 > inputStream.available()) {
                                return null;
                            }
                        } catch (d0 e) {
                            e.f1549b = true;
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i10];
                    System.arraycopy(this.e, this.f1575h, bArr, 0, i15);
                    this.f1577j += this.f1573f;
                    this.f1575h = 0;
                    this.f1573f = 0;
                    while (i15 < i10) {
                        try {
                            int read = inputStream.read(bArr, i15, i10 - i15);
                            if (read != -1) {
                                this.f1577j += read;
                                i15 += read;
                            } else {
                                throw d0.e();
                            }
                        } catch (d0 e6) {
                            e6.f1549b = true;
                            throw e6;
                        }
                    }
                    return bArr;
                }
                J((i14 - i11) - i12);
                throw d0.e();
            }
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw d0.d();
    }

    public final ArrayList B(int i10) {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int min = Math.min(i10, 4096);
            byte[] bArr = new byte[min];
            int i11 = 0;
            while (i11 < min) {
                int read = this.d.read(bArr, i11, min - i11);
                if (read != -1) {
                    this.f1577j += read;
                    i11 += read;
                } else {
                    throw d0.e();
                }
            }
            i10 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int C() {
        int i10 = this.f1575h;
        if (this.f1573f - i10 < 4) {
            I(4);
            i10 = this.f1575h;
        }
        this.f1575h = i10 + 4;
        byte[] bArr = this.e;
        return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
    }

    public final long D() {
        int i10 = this.f1575h;
        if (this.f1573f - i10 < 8) {
            I(8);
            i10 = this.f1575h;
        }
        this.f1575h = i10 + 8;
        byte[] bArr = this.e;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final int E() {
        int i10;
        int i11 = this.f1575h;
        int i12 = this.f1573f;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.e;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f1575h = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f1575h = i14;
                return i10;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f1575h;
        int i11 = this.f1573f;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.e;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f1575h = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j10 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j10 = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            j13 = (-2080896) ^ i18;
                        } else {
                            long j14 = i18;
                            i13 = i10 + 5;
                            long j15 = j14 ^ (bArr[i17] << 28);
                            if (j15 >= 0) {
                                j12 = 266354560;
                            } else {
                                i17 = i10 + 6;
                                long j16 = j15 ^ (bArr[i13] << 35);
                                if (j16 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j15 = j16 ^ (bArr[i17] << 42);
                                    if (j15 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i17 = i10 + 8;
                                        j16 = j15 ^ (bArr[i13] << 49);
                                        if (j16 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j17 = (j16 ^ (bArr[i17] << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                int i19 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i19;
                                                }
                                            }
                                            j10 = j17;
                                        }
                                    }
                                }
                                j13 = j11 ^ j16;
                            }
                            j10 = j12 ^ j15;
                        }
                        i13 = i17;
                        j10 = j13;
                    }
                }
                this.f1575h = i13;
                return j10;
            }
        }
        return G();
    }

    public final long G() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f1575h == this.f1573f) {
                I(1);
            }
            int i11 = this.f1575h;
            this.f1575h = i11 + 1;
            j10 |= (r3 & ByteCompanionObject.MAX_VALUE) << i10;
            if ((this.e[i11] & ByteCompanionObject.MIN_VALUE) == 0) {
                return j10;
            }
        }
        throw d0.c();
    }

    public final void H() {
        int i10 = this.f1573f + this.f1574g;
        this.f1573f = i10;
        int i11 = this.f1577j + i10;
        int i12 = this.f1578k;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.f1574g = i13;
            this.f1573f = i10 - i13;
            return;
        }
        this.f1574g = 0;
    }

    public final void I(int i10) {
        if (!K(i10)) {
            if (i10 > (Integer.MAX_VALUE - this.f1577j) - this.f1575h) {
                throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw d0.e();
        }
    }

    public final void J(int i10) {
        int i11 = this.f1573f;
        int i12 = this.f1575h;
        if (i10 <= i11 - i12 && i10 >= 0) {
            this.f1575h = i12 + i10;
            return;
        }
        InputStream inputStream = this.d;
        if (i10 >= 0) {
            int i13 = this.f1577j;
            int i14 = i13 + i12;
            int i15 = i14 + i10;
            int i16 = this.f1578k;
            if (i15 <= i16) {
                this.f1577j = i14;
                int i17 = i11 - i12;
                this.f1573f = 0;
                this.f1575h = 0;
                while (i17 < i10) {
                    long j10 = i10 - i17;
                    try {
                        try {
                            long skip = inputStream.skip(j10);
                            if (skip >= 0 && skip <= j10) {
                                if (skip == 0) {
                                    break;
                                } else {
                                    i17 += (int) skip;
                                }
                            } else {
                                throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (d0 e) {
                            e.f1549b = true;
                            throw e;
                        }
                    } catch (Throwable th) {
                        this.f1577j += i17;
                        H();
                        throw th;
                    }
                }
                this.f1577j += i17;
                H();
                if (i17 < i10) {
                    int i18 = this.f1573f;
                    int i19 = i18 - this.f1575h;
                    this.f1575h = i18;
                    I(1);
                    while (true) {
                        int i20 = i10 - i19;
                        int i21 = this.f1573f;
                        if (i20 > i21) {
                            i19 += i21;
                            this.f1575h = i21;
                            I(1);
                        } else {
                            this.f1575h = i20;
                            return;
                        }
                    }
                }
            } else {
                J((i16 - i13) - i12);
                throw d0.e();
            }
        } else {
            throw d0.d();
        }
    }

    public final boolean K(int i10) {
        InputStream inputStream = this.d;
        int i11 = this.f1575h;
        int i12 = i11 + i10;
        int i13 = this.f1573f;
        if (i12 > i13) {
            int i14 = this.f1577j;
            if (i10 <= (Integer.MAX_VALUE - i14) - i11 && i14 + i11 + i10 <= this.f1578k) {
                byte[] bArr = this.e;
                if (i11 > 0) {
                    if (i13 > i11) {
                        System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                    }
                    this.f1577j += i11;
                    this.f1573f -= i11;
                    this.f1575h = 0;
                }
                int i15 = this.f1573f;
                try {
                    int read = inputStream.read(bArr, i15, Math.min(bArr.length - i15, (Integer.MAX_VALUE - this.f1577j) - i15));
                    if (read != 0 && read >= -1 && read <= bArr.length) {
                        if (read > 0) {
                            this.f1573f += read;
                            H();
                            if (this.f1573f >= i10) {
                                return true;
                            }
                            return K(i10);
                        }
                    } else {
                        throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                    }
                } catch (d0 e) {
                    e.f1549b = true;
                    throw e;
                }
            }
            return false;
        }
        j1.i.l(ai.onnxruntime.a.f(i10, "refillBuffer() called when ", " bytes were already available in buffer"));
        return false;
    }

    @Override // com.google.protobuf.j
    public final void a(int i10) {
        if (this.f1576i == i10) {
        } else {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.protobuf.j
    public final int b() {
        return this.f1577j + this.f1575h;
    }

    @Override // com.google.protobuf.j
    public final boolean c() {
        if (this.f1575h == this.f1573f && !K(1)) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.j
    public final void e(int i10) {
        this.f1578k = i10;
        H();
    }

    @Override // com.google.protobuf.j
    public final int f(int i10) {
        if (i10 >= 0) {
            int i11 = this.f1577j + this.f1575h + i10;
            int i12 = this.f1578k;
            if (i11 <= i12) {
                this.f1578k = i11;
                H();
                return i12;
            }
            throw d0.e();
        }
        throw d0.d();
    }

    @Override // com.google.protobuf.j
    public final boolean g() {
        if (F() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.j
    public final g h() {
        int E = E();
        int i10 = this.f1573f;
        int i11 = this.f1575h;
        int i12 = i10 - i11;
        byte[] bArr = this.e;
        if (E <= i12 && E > 0) {
            g e = g.e(bArr, i11, E);
            this.f1575h += E;
            return e;
        }
        if (E == 0) {
            return g.d;
        }
        byte[] A = A(E);
        if (A != null) {
            return g.e(A, 0, A.length);
        }
        int i13 = this.f1575h;
        int i14 = this.f1573f;
        int i15 = i14 - i13;
        this.f1577j += i14;
        this.f1575h = 0;
        this.f1573f = 0;
        ArrayList B = B(E - i15);
        byte[] bArr2 = new byte[E];
        System.arraycopy(bArr, i13, bArr2, 0, i15);
        int size = B.size();
        int i16 = 0;
        while (i16 < size) {
            Object obj = B.get(i16);
            i16++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, i15, bArr3.length);
            i15 += bArr3.length;
        }
        g gVar = g.d;
        return new g(bArr2);
    }

    @Override // com.google.protobuf.j
    public final double i() {
        return Double.longBitsToDouble(D());
    }

    @Override // com.google.protobuf.j
    public final int j() {
        return E();
    }

    @Override // com.google.protobuf.j
    public final int k() {
        return C();
    }

    @Override // com.google.protobuf.j
    public final long l() {
        return D();
    }

    @Override // com.google.protobuf.j
    public final float m() {
        return Float.intBitsToFloat(C());
    }

    @Override // com.google.protobuf.j
    public final int n() {
        return E();
    }

    @Override // com.google.protobuf.j
    public final long o() {
        return F();
    }

    @Override // com.google.protobuf.j
    public final int p() {
        return C();
    }

    @Override // com.google.protobuf.j
    public final long q() {
        return D();
    }

    @Override // com.google.protobuf.j
    public final int r() {
        int E = E();
        return (-(E & 1)) ^ (E >>> 1);
    }

    @Override // com.google.protobuf.j
    public final long s() {
        long F = F();
        return (-(F & 1)) ^ (F >>> 1);
    }

    @Override // com.google.protobuf.j
    public final String t() {
        int E = E();
        byte[] bArr = this.e;
        if (E > 0) {
            int i10 = this.f1573f;
            int i11 = this.f1575h;
            if (E <= i10 - i11) {
                String str = new String(bArr, i11, E, b0.f1535a);
                this.f1575h += E;
                return str;
            }
        }
        if (E == 0) {
            return "";
        }
        if (E <= this.f1573f) {
            I(E);
            String str2 = new String(bArr, this.f1575h, E, b0.f1535a);
            this.f1575h += E;
            return str2;
        }
        return new String(z(E), b0.f1535a);
    }

    @Override // com.google.protobuf.j
    public final String u() {
        int E = E();
        int i10 = this.f1575h;
        int i11 = this.f1573f;
        int i12 = i11 - i10;
        byte[] bArr = this.e;
        if (E <= i12 && E > 0) {
            this.f1575h = i10 + E;
        } else {
            if (E == 0) {
                return "";
            }
            i10 = 0;
            if (E <= i11) {
                I(E);
                this.f1575h = E;
            } else {
                bArr = z(E);
            }
        }
        return v1.f1639a.a(bArr, i10, E);
    }

    @Override // com.google.protobuf.j
    public final int v() {
        if (c()) {
            this.f1576i = 0;
            return 0;
        }
        int E = E();
        this.f1576i = E;
        if ((E >>> 3) != 0) {
            return E;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.protobuf.j
    public final int w() {
        return E();
    }

    @Override // com.google.protobuf.j
    public final long x() {
        return F();
    }

    @Override // com.google.protobuf.j
    public final boolean y(int i10) {
        int v9;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return false;
                        }
                        if (i11 == 5) {
                            J(4);
                            return true;
                        }
                        throw d0.b();
                    }
                    do {
                        v9 = v();
                        if (v9 == 0) {
                            break;
                        }
                    } while (y(v9));
                    a(((i10 >>> 3) << 3) | 4);
                    return true;
                }
                J(E());
                return true;
            }
            J(8);
            return true;
        }
        int i13 = this.f1573f - this.f1575h;
        byte[] bArr = this.e;
        if (i13 >= 10) {
            while (i12 < 10) {
                int i14 = this.f1575h;
                this.f1575h = i14 + 1;
                if (bArr[i14] < 0) {
                    i12++;
                }
            }
            throw d0.c();
        }
        while (i12 < 10) {
            if (this.f1575h == this.f1573f) {
                I(1);
            }
            int i15 = this.f1575h;
            this.f1575h = i15 + 1;
            if (bArr[i15] < 0) {
                i12++;
            }
        }
        throw d0.c();
        return true;
    }

    public final byte[] z(int i10) {
        byte[] A = A(i10);
        if (A != null) {
            return A;
        }
        int i11 = this.f1575h;
        int i12 = this.f1573f;
        int i13 = i12 - i11;
        this.f1577j += i12;
        this.f1575h = 0;
        this.f1573f = 0;
        ArrayList B = B(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.e, i11, bArr, 0, i13);
        int size = B.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = B.get(i14);
            i14++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
            i13 += bArr2.length;
        }
        return bArr;
    }
}
