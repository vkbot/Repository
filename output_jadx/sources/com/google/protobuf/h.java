package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h extends j {
    public final byte[] d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f1567f;

    /* renamed from: g, reason: collision with root package name */
    public int f1568g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1569h;

    /* renamed from: i, reason: collision with root package name */
    public int f1570i;

    /* renamed from: j, reason: collision with root package name */
    public int f1571j = Integer.MAX_VALUE;

    public h(byte[] bArr, int i10, int i11, boolean z9) {
        this.d = bArr;
        this.e = i11 + i10;
        this.f1568g = i10;
        this.f1569h = i10;
    }

    public final long A() {
        int i10 = this.f1568g;
        if (this.e - i10 >= 8) {
            this.f1568g = i10 + 8;
            byte[] bArr = this.d;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }
        throw d0.e();
    }

    public final int B() {
        int i10;
        int i11 = this.f1568g;
        int i12 = this.e;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.d;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f1568g = i13;
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
                this.f1568g = i14;
                return i10;
            }
        }
        return (int) D();
    }

    public final long C() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f1568g;
        int i11 = this.e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.d;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f1568g = i12;
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
                this.f1568g = i13;
                return j10;
            }
        }
        return D();
    }

    public final long D() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f1568g;
            if (i11 != this.e) {
                this.f1568g = i11 + 1;
                j10 |= (r3 & ByteCompanionObject.MAX_VALUE) << i10;
                if ((this.d[i11] & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j10;
                }
            } else {
                throw d0.e();
            }
        }
        throw d0.c();
    }

    public final void E() {
        int i10 = this.e + this.f1567f;
        this.e = i10;
        int i11 = i10 - this.f1569h;
        int i12 = this.f1571j;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.f1567f = i13;
            this.e = i10 - i13;
            return;
        }
        this.f1567f = 0;
    }

    public final void F(int i10) {
        if (i10 >= 0) {
            int i11 = this.e;
            int i12 = this.f1568g;
            if (i10 <= i11 - i12) {
                this.f1568g = i12 + i10;
                return;
            }
        }
        if (i10 < 0) {
            throw d0.d();
        }
        throw d0.e();
    }

    @Override // com.google.protobuf.j
    public final void a(int i10) {
        if (this.f1570i == i10) {
        } else {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.protobuf.j
    public final int b() {
        return this.f1568g - this.f1569h;
    }

    @Override // com.google.protobuf.j
    public final boolean c() {
        if (this.f1568g == this.e) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.j
    public final void e(int i10) {
        this.f1571j = i10;
        E();
    }

    @Override // com.google.protobuf.j
    public final int f(int i10) {
        if (i10 >= 0) {
            int b10 = b() + i10;
            if (b10 >= 0) {
                int i11 = this.f1571j;
                if (b10 <= i11) {
                    this.f1571j = b10;
                    E();
                    return i11;
                }
                throw d0.e();
            }
            throw new IOException("Failed to parse the message.");
        }
        throw d0.d();
    }

    @Override // com.google.protobuf.j
    public final boolean g() {
        if (C() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.j
    public final g h() {
        byte[] bArr;
        int B = B();
        byte[] bArr2 = this.d;
        if (B > 0) {
            int i10 = this.e;
            int i11 = this.f1568g;
            if (B <= i10 - i11) {
                g e = g.e(bArr2, i11, B);
                this.f1568g += B;
                return e;
            }
        }
        if (B == 0) {
            return g.d;
        }
        if (B > 0) {
            int i12 = this.e;
            int i13 = this.f1568g;
            if (B <= i12 - i13) {
                int i14 = B + i13;
                this.f1568g = i14;
                bArr = Arrays.copyOfRange(bArr2, i13, i14);
                g gVar = g.d;
                return new g(bArr);
            }
        }
        if (B <= 0) {
            if (B == 0) {
                bArr = b0.f1536b;
                g gVar2 = g.d;
                return new g(bArr);
            }
            throw d0.d();
        }
        throw d0.e();
    }

    @Override // com.google.protobuf.j
    public final double i() {
        return Double.longBitsToDouble(A());
    }

    @Override // com.google.protobuf.j
    public final int j() {
        return B();
    }

    @Override // com.google.protobuf.j
    public final int k() {
        return z();
    }

    @Override // com.google.protobuf.j
    public final long l() {
        return A();
    }

    @Override // com.google.protobuf.j
    public final float m() {
        return Float.intBitsToFloat(z());
    }

    @Override // com.google.protobuf.j
    public final int n() {
        return B();
    }

    @Override // com.google.protobuf.j
    public final long o() {
        return C();
    }

    @Override // com.google.protobuf.j
    public final int p() {
        return z();
    }

    @Override // com.google.protobuf.j
    public final long q() {
        return A();
    }

    @Override // com.google.protobuf.j
    public final int r() {
        int B = B();
        return (-(B & 1)) ^ (B >>> 1);
    }

    @Override // com.google.protobuf.j
    public final long s() {
        long C = C();
        return (-(C & 1)) ^ (C >>> 1);
    }

    @Override // com.google.protobuf.j
    public final String t() {
        int B = B();
        if (B > 0) {
            int i10 = this.e;
            int i11 = this.f1568g;
            if (B <= i10 - i11) {
                String str = new String(this.d, i11, B, b0.f1535a);
                this.f1568g += B;
                return str;
            }
        }
        if (B == 0) {
            return "";
        }
        if (B < 0) {
            throw d0.d();
        }
        throw d0.e();
    }

    @Override // com.google.protobuf.j
    public final String u() {
        int B = B();
        if (B > 0) {
            int i10 = this.e;
            int i11 = this.f1568g;
            if (B <= i10 - i11) {
                String a10 = v1.f1639a.a(this.d, i11, B);
                this.f1568g += B;
                return a10;
            }
        }
        if (B == 0) {
            return "";
        }
        if (B <= 0) {
            throw d0.d();
        }
        throw d0.e();
    }

    @Override // com.google.protobuf.j
    public final int v() {
        if (c()) {
            this.f1570i = 0;
            return 0;
        }
        int B = B();
        this.f1570i = B;
        if ((B >>> 3) != 0) {
            return B;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.protobuf.j
    public final int w() {
        return B();
    }

    @Override // com.google.protobuf.j
    public final long x() {
        return C();
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
                            F(4);
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
                F(B());
                return true;
            }
            F(8);
            return true;
        }
        int i13 = this.e - this.f1568g;
        byte[] bArr = this.d;
        if (i13 >= 10) {
            while (i12 < 10) {
                int i14 = this.f1568g;
                this.f1568g = i14 + 1;
                if (bArr[i14] < 0) {
                    i12++;
                }
            }
            throw d0.c();
        }
        while (i12 < 10) {
            int i15 = this.f1568g;
            if (i15 != this.e) {
                this.f1568g = i15 + 1;
                if (bArr[i15] < 0) {
                    i12++;
                }
            } else {
                throw d0.e();
            }
        }
        throw d0.c();
        return true;
    }

    public final int z() {
        int i10 = this.f1568g;
        if (this.e - i10 >= 4) {
            this.f1568g = i10 + 4;
            byte[] bArr = this.d;
            return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
        }
        throw d0.e();
    }
}
