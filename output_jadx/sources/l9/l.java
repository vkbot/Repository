package l9;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import okhttp3.internal.connection.RealConnection;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class l implements n, m, Cloneable, ByteChannel {

    /* renamed from: b, reason: collision with root package name */
    public b0 f3577b;
    public long c;

    @Override // l9.m
    public final /* bridge */ /* synthetic */ m A(String str) {
        u0(str);
        return this;
    }

    @Override // l9.n
    public final String D(Charset charset) {
        charset.getClass();
        return g0(this.c, charset);
    }

    @Override // l9.m
    public final long G(g0 g0Var) {
        g0Var.getClass();
        long j10 = 0;
        while (true) {
            long read = g0Var.read(this, 8192L);
            if (read != -1) {
                j10 += read;
            } else {
                return j10;
            }
        }
    }

    @Override // l9.m
    public final /* bridge */ /* synthetic */ m H(long j10) {
        o0(j10);
        return this;
    }

    @Override // l9.n
    public final o J() {
        return f(this.c);
    }

    @Override // l9.n
    public final String L() {
        return p(Long.MAX_VALUE);
    }

    @Override // l9.n
    public final int P(w wVar) {
        wVar.getClass();
        int c = m9.a.c(this, wVar, false);
        if (c == -1) {
            return -1;
        }
        skip(wVar.f3585b[c].c());
        return c;
    }

    @Override // l9.n
    public final boolean Q(long j10, o oVar) {
        oVar.getClass();
        int c = oVar.c();
        if (j10 >= 0 && c >= 0 && this.c - j10 >= c && oVar.c() >= c) {
            for (int i10 = 0; i10 < c; i10++) {
                if (V(i10 + j10) == oVar.f(i10)) {
                }
            }
            return true;
        }
        return false;
    }

    public final void S(long j10, l lVar, long j11) {
        lVar.getClass();
        long j12 = j10;
        b.d(this.c, j12, j11);
        if (j11 != 0) {
            lVar.c += j11;
            b0 b0Var = this.f3577b;
            while (true) {
                b0Var.getClass();
                long j13 = b0Var.c - b0Var.f3561b;
                if (j12 < j13) {
                    break;
                }
                j12 -= j13;
                b0Var = b0Var.f3562f;
            }
            b0 b0Var2 = b0Var;
            long j14 = j11;
            while (j14 > 0) {
                b0Var2.getClass();
                b0 c = b0Var2.c();
                int i10 = c.f3561b + ((int) j12);
                c.f3561b = i10;
                c.c = Math.min(i10 + ((int) j14), c.c);
                b0 b0Var3 = lVar.f3577b;
                if (b0Var3 == null) {
                    c.f3563g = c;
                    c.f3562f = c;
                    lVar.f3577b = c;
                } else {
                    b0 b0Var4 = b0Var3.f3563g;
                    b0Var4.getClass();
                    b0Var4.b(c);
                }
                j14 -= c.c - c.f3561b;
                b0Var2 = b0Var2.f3562f;
                j12 = 0;
            }
        }
    }

    public final byte V(long j10) {
        b.d(this.c, j10, 1L);
        b0 b0Var = this.f3577b;
        b0Var.getClass();
        long j11 = this.c;
        if (j11 - j10 < j10) {
            while (j11 > j10) {
                b0Var = b0Var.f3563g;
                b0Var.getClass();
                j11 -= b0Var.c - b0Var.f3561b;
            }
            return b0Var.f3560a[(int) ((b0Var.f3561b + j10) - j11)];
        }
        long j12 = 0;
        while (true) {
            int i10 = b0Var.c;
            int i11 = b0Var.f3561b;
            long j13 = (i10 - i11) + j12;
            if (j13 <= j10) {
                b0Var = b0Var.f3562f;
                b0Var.getClass();
                j12 = j13;
            } else {
                return b0Var.f3560a[(int) ((i11 + j10) - j12)];
            }
        }
    }

    @Override // l9.n
    public final void Y(long j10) {
        if (this.c >= j10) {
        } else {
            throw new EOFException();
        }
    }

    @Override // l9.m
    public final /* bridge */ /* synthetic */ m Z(long j10) {
        n0(j10);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9 A[EDGE_INSN: B:40:0x00a9->B:37:0x00a9 BREAK  A[LOOP:0: B:4:0x000c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, l9.l] */
    @Override // l9.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a0() {
        /*
            r15 = this;
            long r0 = r15.c
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb0
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            l9.b0 r7 = r15.f3577b
            r7.getClass()
            byte[] r8 = r7.f3560a
            int r9 = r7.f3561b
            int r10 = r7.c
        L17:
            if (r9 >= r10) goto L95
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L26
            r12 = 57
            if (r11 > r12) goto L26
            int r12 = r11 + (-48)
            goto L3b
        L26:
            r12 = 97
            if (r11 < r12) goto L31
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L31
            int r12 = r11 + (-87)
            goto L3b
        L31:
            r12 = 65
            if (r11 < r12) goto L66
            r12 = 70
            if (r11 > r12) goto L66
            int r12 = r11 + (-55)
        L3b:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4b
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L17
        L4b:
            l9.l r0 = new l9.l
            r0.<init>()
            r0.o0(r4)
            r0.m0(r11)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.h0()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L66:
            r6 = 1
            if (r1 == 0) goto L6a
            goto L95
        L6a:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            int r2 = r11 >> 4
            r2 = r2 & 15
            char[] r3 = m9.b.f3997a
            char r2 = r3[r2]
            r4 = r11 & 15
            char r3 = r3[r4]
            r4 = 2
            char[] r4 = new char[r4]
            r4[r0] = r2
            r4[r6] = r3
            java.lang.String r0 = kotlin.text.StringsKt.concatToString(r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L95:
            if (r9 != r10) goto La1
            l9.b0 r8 = r7.a()
            r15.f3577b = r8
            l9.c0.a(r7)
            goto La3
        La1:
            r7.f3561b = r9
        La3:
            if (r6 != 0) goto La9
            l9.b0 r7 = r15.f3577b
            if (r7 != 0) goto Lc
        La9:
            long r2 = r15.c
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.c = r2
            return r4
        Lb0:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.l.a0():long");
    }

    public final void b() {
        skip(this.c);
    }

    @Override // l9.n
    public final InputStream b0() {
        return new k(this, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l9.l] */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final l clone() {
        ?? obj = new Object();
        if (this.c == 0) {
            return obj;
        }
        b0 b0Var = this.f3577b;
        b0Var.getClass();
        b0 c = b0Var.c();
        obj.f3577b = c;
        c.f3563g = c;
        c.f3562f = c;
        for (b0 b0Var2 = b0Var.f3562f; b0Var2 != b0Var; b0Var2 = b0Var2.f3562f) {
            b0 b0Var3 = c.f3563g;
            b0Var3.getClass();
            b0Var2.getClass();
            b0Var3.b(b0Var2.c());
        }
        obj.c = this.c;
        return obj;
    }

    public final long c0(long j10, long j11, byte b10) {
        b0 b0Var;
        long j12 = 0;
        if (0 <= j10 && j10 <= j11) {
            long j13 = this.c;
            if (j11 > j13) {
                j11 = j13;
            }
            if (j10 != j11 && (b0Var = this.f3577b) != null) {
                if (j13 - j10 < j10) {
                    while (j13 > j10) {
                        b0Var = b0Var.f3563g;
                        b0Var.getClass();
                        j13 -= b0Var.c - b0Var.f3561b;
                    }
                    while (j13 < j11) {
                        byte[] bArr = b0Var.f3560a;
                        int min = (int) Math.min(b0Var.c, (b0Var.f3561b + j11) - j13);
                        for (int i10 = (int) ((b0Var.f3561b + j10) - j13); i10 < min; i10++) {
                            if (bArr[i10] == b10) {
                                return (i10 - b0Var.f3561b) + j13;
                            }
                        }
                        j13 += b0Var.c - b0Var.f3561b;
                        b0Var = b0Var.f3562f;
                        b0Var.getClass();
                        j10 = j13;
                    }
                    return -1L;
                }
                while (true) {
                    long j14 = (b0Var.c - b0Var.f3561b) + j12;
                    if (j14 > j10) {
                        break;
                    }
                    b0Var = b0Var.f3562f;
                    b0Var.getClass();
                    j12 = j14;
                }
                while (j12 < j11) {
                    byte[] bArr2 = b0Var.f3560a;
                    int min2 = (int) Math.min(b0Var.c, (b0Var.f3561b + j11) - j12);
                    for (int i11 = (int) ((b0Var.f3561b + j10) - j12); i11 < min2; i11++) {
                        if (bArr2[i11] == b10) {
                            return (i11 - b0Var.f3561b) + j12;
                        }
                    }
                    j12 += b0Var.c - b0Var.f3561b;
                    b0Var = b0Var.f3562f;
                    b0Var.getClass();
                    j10 = j12;
                }
                return -1L;
            }
            return -1L;
        }
        throw new IllegalArgumentException(("size=" + this.c + " fromIndex=" + j10 + " toIndex=" + j11).toString());
    }

    @Override // l9.n
    public final boolean d(long j10) {
        if (this.c >= j10) {
            return true;
        }
        return false;
    }

    public final long d0(o oVar) {
        int i10;
        int i11;
        oVar.getClass();
        oVar.getClass();
        b0 b0Var = this.f3577b;
        if (b0Var != null) {
            long j10 = this.c;
            long j11 = 0;
            if (j10 < 0) {
                while (j10 > 0) {
                    b0Var = b0Var.f3563g;
                    b0Var.getClass();
                    j10 -= b0Var.c - b0Var.f3561b;
                }
                if (oVar.c() == 2) {
                    byte f8 = oVar.f(0);
                    byte f10 = oVar.f(1);
                    while (j10 < this.c) {
                        byte[] bArr = b0Var.f3560a;
                        i10 = (int) ((b0Var.f3561b + j11) - j10);
                        int i12 = b0Var.c;
                        while (i10 < i12) {
                            byte b10 = bArr[i10];
                            if (b10 != f8 && b10 != f10) {
                                i10++;
                            }
                            i11 = b0Var.f3561b;
                        }
                        j11 = (b0Var.c - b0Var.f3561b) + j10;
                        b0Var = b0Var.f3562f;
                        b0Var.getClass();
                        j10 = j11;
                    }
                    return -1L;
                }
                byte[] e = oVar.e();
                while (j10 < this.c) {
                    byte[] bArr2 = b0Var.f3560a;
                    i10 = (int) ((b0Var.f3561b + j11) - j10);
                    int i13 = b0Var.c;
                    while (i10 < i13) {
                        byte b11 = bArr2[i10];
                        for (byte b12 : e) {
                            if (b11 == b12) {
                                i11 = b0Var.f3561b;
                            }
                        }
                        i10++;
                    }
                    j11 = (b0Var.c - b0Var.f3561b) + j10;
                    b0Var = b0Var.f3562f;
                    b0Var.getClass();
                    j10 = j11;
                }
                return -1L;
            }
            j10 = 0;
            while (true) {
                long j12 = (b0Var.c - b0Var.f3561b) + j10;
                if (j12 > 0) {
                    break;
                }
                b0Var = b0Var.f3562f;
                b0Var.getClass();
                j10 = j12;
            }
            if (oVar.c() == 2) {
                byte f11 = oVar.f(0);
                byte f12 = oVar.f(1);
                while (j10 < this.c) {
                    byte[] bArr3 = b0Var.f3560a;
                    i10 = (int) ((b0Var.f3561b + j11) - j10);
                    int i14 = b0Var.c;
                    while (i10 < i14) {
                        byte b13 = bArr3[i10];
                        if (b13 != f11 && b13 != f12) {
                            i10++;
                        }
                        i11 = b0Var.f3561b;
                    }
                    j11 = (b0Var.c - b0Var.f3561b) + j10;
                    b0Var = b0Var.f3562f;
                    b0Var.getClass();
                    j10 = j11;
                }
                return -1L;
            }
            byte[] e6 = oVar.e();
            while (j10 < this.c) {
                byte[] bArr4 = b0Var.f3560a;
                i10 = (int) ((b0Var.f3561b + j11) - j10);
                int i15 = b0Var.c;
                while (i10 < i15) {
                    byte b14 = bArr4[i10];
                    for (byte b15 : e6) {
                        if (b14 == b15) {
                            i11 = b0Var.f3561b;
                        }
                    }
                    i10++;
                }
                j11 = (b0Var.c - b0Var.f3561b) + j10;
                b0Var = b0Var.f3562f;
                b0Var.getClass();
                j10 = j11;
            }
            return -1L;
            return (i10 - i11) + j10;
        }
        return -1L;
    }

    public final j e0(j jVar) {
        jVar.getClass();
        byte[] bArr = m9.a.f3996a;
        jVar.getClass();
        if (jVar == b.f3559a) {
            jVar = new j();
        }
        if (jVar.f3572b == null) {
            jVar.f3572b = this;
            jVar.c = true;
            return jVar;
        }
        j1.i.l("already attached to a buffer");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        long j10 = this.c;
        l lVar = (l) obj;
        if (j10 != lVar.c) {
            return false;
        }
        if (j10 == 0) {
            return true;
        }
        b0 b0Var = this.f3577b;
        b0Var.getClass();
        b0 b0Var2 = lVar.f3577b;
        b0Var2.getClass();
        int i10 = b0Var.f3561b;
        int i11 = b0Var2.f3561b;
        long j11 = 0;
        while (j11 < this.c) {
            long min = Math.min(b0Var.c - i10, b0Var2.c - i11);
            long j12 = 0;
            while (j12 < min) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (b0Var.f3560a[i10] != b0Var2.f3560a[i11]) {
                    return false;
                }
                j12++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == b0Var.c) {
                b0Var = b0Var.f3562f;
                b0Var.getClass();
                i10 = b0Var.f3561b;
            }
            if (i11 == b0Var2.c) {
                b0Var2 = b0Var2.f3562f;
                b0Var2.getClass();
                i11 = b0Var2.f3561b;
            }
            j11 += min;
        }
        return true;
    }

    @Override // l9.n
    public final o f(long j10) {
        if (j10 >= 0 && j10 <= 2147483647L) {
            if (this.c >= j10) {
                if (j10 >= 4096) {
                    o j02 = j0((int) j10);
                    skip(j10);
                    return j02;
                }
                return new o(f0(j10));
            }
            throw new EOFException();
        }
        i.d(ai.onnxruntime.a.h(j10, "byteCount: "));
        return null;
    }

    public final byte[] f0(long j10) {
        if (j10 >= 0 && j10 <= 2147483647L) {
            if (this.c >= j10) {
                byte[] bArr = new byte[(int) j10];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        i.d(ai.onnxruntime.a.h(j10, "byteCount: "));
        return null;
    }

    public final String g0(long j10, Charset charset) {
        charset.getClass();
        if (j10 >= 0 && j10 <= 2147483647L) {
            if (this.c >= j10) {
                if (j10 == 0) {
                    return "";
                }
                b0 b0Var = this.f3577b;
                b0Var.getClass();
                int i10 = b0Var.f3561b;
                if (i10 + j10 > b0Var.c) {
                    return new String(f0(j10), charset);
                }
                int i11 = (int) j10;
                String str = new String(b0Var.f3560a, i10, i11, charset);
                int i12 = b0Var.f3561b + i11;
                b0Var.f3561b = i12;
                this.c -= j10;
                if (i12 == b0Var.c) {
                    this.f3577b = b0Var.a();
                    c0.a(b0Var);
                }
                return str;
            }
            throw new EOFException();
        }
        i.d(ai.onnxruntime.a.h(j10, "byteCount: "));
        return null;
    }

    public final String h0() {
        return g0(this.c, Charsets.UTF_8);
    }

    public final int hashCode() {
        b0 b0Var = this.f3577b;
        if (b0Var == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = b0Var.c;
            for (int i12 = b0Var.f3561b; i12 < i11; i12++) {
                i10 = (i10 * 31) + b0Var.f3560a[i12];
            }
            b0Var = b0Var.f3562f;
            b0Var.getClass();
        } while (b0Var != this.f3577b);
        return i10;
    }

    public final o i0() {
        long j10 = this.c;
        if (j10 <= 2147483647L) {
            return j0((int) j10);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.c).toString());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // l9.n
    public final byte[] j() {
        return f0(this.c);
    }

    public final o j0(int i10) {
        if (i10 == 0) {
            return o.e;
        }
        b.d(this.c, 0L, i10);
        b0 b0Var = this.f3577b;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            b0Var.getClass();
            int i14 = b0Var.c;
            int i15 = b0Var.f3561b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                b0Var = b0Var.f3562f;
            } else {
                j1.i.e("s.limit == s.pos");
                return null;
            }
        }
        byte[][] bArr = new byte[i13];
        int[] iArr = new int[i13 * 2];
        b0 b0Var2 = this.f3577b;
        int i16 = 0;
        while (i11 < i10) {
            b0Var2.getClass();
            bArr[i16] = b0Var2.f3560a;
            i11 += b0Var2.c - b0Var2.f3561b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = b0Var2.f3561b;
            b0Var2.d = true;
            i16++;
            b0Var2 = b0Var2.f3562f;
        }
        return new d0(bArr, iArr);
    }

    @Override // l9.n
    public final boolean k() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    public final b0 k0(int i10) {
        if (i10 >= 1 && i10 <= 8192) {
            b0 b0Var = this.f3577b;
            if (b0Var == null) {
                b0 b10 = c0.b();
                this.f3577b = b10;
                b10.f3563g = b10;
                b10.f3562f = b10;
                return b10;
            }
            b0 b0Var2 = b0Var.f3563g;
            b0Var2.getClass();
            if (b0Var2.c + i10 <= 8192 && b0Var2.e) {
                return b0Var2;
            }
            b0 b11 = c0.b();
            b0Var2.b(b11);
            return b11;
        }
        j1.i.k("unexpected capacity");
        return null;
    }

    public final void l0(o oVar) {
        oVar.getClass();
        oVar.m(oVar.c(), this);
    }

    public final void m0(int i10) {
        b0 k02 = k0(1);
        byte[] bArr = k02.f3560a;
        int i11 = k02.c;
        k02.c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.c++;
    }

    public final void n0(long j10) {
        boolean z9;
        if (j10 == 0) {
            m0(48);
            return;
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                u0("-9223372036854775808");
                return;
            }
            z9 = true;
        } else {
            z9 = false;
        }
        if (j10 < 100000000) {
            if (j10 < 10000) {
                if (j10 < 100) {
                    if (j10 >= 10) {
                        i10 = 2;
                    }
                } else if (j10 < 1000) {
                    i10 = 3;
                } else {
                    i10 = 4;
                }
            } else if (j10 < 1000000) {
                if (j10 < 100000) {
                    i10 = 5;
                } else {
                    i10 = 6;
                }
            } else if (j10 < 10000000) {
                i10 = 7;
            } else {
                i10 = 8;
            }
        } else if (j10 < 1000000000000L) {
            if (j10 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                if (j10 < 1000000000) {
                    i10 = 9;
                } else {
                    i10 = 10;
                }
            } else if (j10 < 100000000000L) {
                i10 = 11;
            } else {
                i10 = 12;
            }
        } else if (j10 < 1000000000000000L) {
            if (j10 < 10000000000000L) {
                i10 = 13;
            } else if (j10 < 100000000000000L) {
                i10 = 14;
            } else {
                i10 = 15;
            }
        } else if (j10 < 100000000000000000L) {
            if (j10 < 10000000000000000L) {
                i10 = 16;
            } else {
                i10 = 17;
            }
        } else if (j10 < 1000000000000000000L) {
            i10 = 18;
        } else {
            i10 = 19;
        }
        if (z9) {
            i10++;
        }
        b0 k02 = k0(i10);
        byte[] bArr = k02.f3560a;
        int i11 = k02.c + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = m9.a.f3996a[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z9) {
            bArr[i11 - 1] = 45;
        }
        k02.c += i10;
        this.c += i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
    
        r3 = r20.c - r2;
        r20.c = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
    
        if (r9 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        if (r2 >= r5) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ad, code lost:
    
        if (r3 == r18) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00af, code lost:
    
        if (r9 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        r2 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        r2 = ai.onnxruntime.a.w(r2, " but was 0x");
        r4 = V(r18);
        r6 = m9.b.f3997a;
        r5 = r6[(r4 >> 4) & 15];
        r4 = r6[r4 & 15];
        r1 = new char[2];
        r1[r16] = r5;
        r1[r17] = r4;
        r2.append(kotlin.text.StringsKt.concatToString(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e4, code lost:
    
        throw new java.lang.NumberFormatException(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b4, code lost:
    
        r2 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ea, code lost:
    
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00eb, code lost:
    
        if (r9 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ed, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ef, code lost:
    
        return -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a7, code lost:
    
        r5 = r17;
     */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, l9.l] */
    @Override // l9.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long o() {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.l.o():long");
    }

    public final void o0(long j10) {
        if (j10 == 0) {
            m0(48);
            return;
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
        b0 k02 = k0(i10);
        byte[] bArr = k02.f3560a;
        int i11 = k02.c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = m9.a.f3996a[(int) (15 & j10)];
            j10 >>>= 4;
        }
        k02.c += i10;
        this.c += i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, l9.l] */
    @Override // l9.n
    public final String p(long j10) {
        if (j10 >= 0) {
            long j11 = Long.MAX_VALUE;
            if (j10 != Long.MAX_VALUE) {
                j11 = j10 + 1;
            }
            long j12 = j11;
            long c02 = c0(0L, j12, (byte) 10);
            if (c02 != -1) {
                return m9.a.b(this, c02);
            }
            if (j12 < this.c && V(j12 - 1) == 13 && V(j12) == 10) {
                return m9.a.b(this, j12);
            }
            ?? obj = new Object();
            S(0L, obj, Math.min(32, this.c));
            throw new EOFException("\\n not found: limit=" + Math.min(this.c, j10) + " content=" + obj.f(obj.c).d() + Typography.ellipsis);
        }
        i.d(ai.onnxruntime.a.h(j10, "limit < 0: "));
        return null;
    }

    public final void p0(int i10) {
        b0 k02 = k0(4);
        byte[] bArr = k02.f3560a;
        int i11 = k02.c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        k02.c = i11 + 4;
        this.c += 4;
    }

    @Override // l9.n
    public final a0 peek() {
        return new a0(new y(this));
    }

    public final void q0(long j10) {
        b0 k02 = k0(8);
        byte[] bArr = k02.f3560a;
        int i10 = k02.c;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((j10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((j10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((j10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((j10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (j10 & 255);
        k02.c = i10 + 8;
        this.c += 8;
    }

    public final void r0(int i10) {
        b0 k02 = k0(2);
        byte[] bArr = k02.f3560a;
        int i11 = k02.c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        k02.c = i11 + 2;
        this.c += 2;
    }

    public final int read(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        b.d(bArr.length, i10, i11);
        b0 b0Var = this.f3577b;
        if (b0Var == null) {
            return -1;
        }
        int min = Math.min(i11, b0Var.c - b0Var.f3561b);
        byte[] bArr2 = b0Var.f3560a;
        int i12 = b0Var.f3561b;
        ArraysKt.copyInto(bArr2, bArr, i10, i12, i12 + min);
        int i13 = b0Var.f3561b + min;
        b0Var.f3561b = i13;
        this.c -= min;
        if (i13 == b0Var.c) {
            this.f3577b = b0Var.a();
            c0.a(b0Var);
        }
        return min;
    }

    @Override // l9.n
    public final byte readByte() {
        if (this.c != 0) {
            b0 b0Var = this.f3577b;
            b0Var.getClass();
            int i10 = b0Var.f3561b;
            int i11 = b0Var.c;
            int i12 = i10 + 1;
            byte b10 = b0Var.f3560a[i10];
            this.c--;
            if (i12 == i11) {
                this.f3577b = b0Var.a();
                c0.a(b0Var);
                return b10;
            }
            b0Var.f3561b = i12;
            return b10;
        }
        throw new EOFException();
    }

    @Override // l9.n
    public final void readFully(byte[] bArr) {
        bArr.getClass();
        int i10 = 0;
        while (i10 < bArr.length) {
            int read = read(bArr, i10, bArr.length - i10);
            if (read != -1) {
                i10 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // l9.n
    public final int readInt() {
        if (this.c >= 4) {
            b0 b0Var = this.f3577b;
            b0Var.getClass();
            int i10 = b0Var.f3561b;
            int i11 = b0Var.c;
            if (i11 - i10 < 4) {
                return ((readByte() & UByte.MAX_VALUE) << 24) | ((readByte() & UByte.MAX_VALUE) << 16) | ((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE);
            }
            byte[] bArr = b0Var.f3560a;
            int i12 = i10 + 3;
            int i13 = ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i10] & UByte.MAX_VALUE) << 24) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
            int i14 = i10 + 4;
            int i15 = (bArr[i12] & UByte.MAX_VALUE) | i13;
            this.c -= 4;
            if (i14 == i11) {
                this.f3577b = b0Var.a();
                c0.a(b0Var);
                return i15;
            }
            b0Var.f3561b = i14;
            return i15;
        }
        throw new EOFException();
    }

    @Override // l9.n
    public final long readLong() {
        if (this.c >= 8) {
            b0 b0Var = this.f3577b;
            b0Var.getClass();
            int i10 = b0Var.f3561b;
            int i11 = b0Var.c;
            if (i11 - i10 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = b0Var.f3560a;
            int i12 = i10 + 7;
            long j10 = ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
            int i13 = i10 + 8;
            long j11 = j10 | (bArr[i12] & 255);
            this.c -= 8;
            if (i13 == i11) {
                this.f3577b = b0Var.a();
                c0.a(b0Var);
                return j11;
            }
            b0Var.f3561b = i13;
            return j11;
        }
        throw new EOFException();
    }

    @Override // l9.n
    public final short readShort() {
        if (this.c >= 2) {
            b0 b0Var = this.f3577b;
            b0Var.getClass();
            int i10 = b0Var.f3561b;
            int i11 = b0Var.c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE));
            }
            byte[] bArr = b0Var.f3560a;
            int i12 = i10 + 1;
            int i13 = (bArr[i10] & UByte.MAX_VALUE) << 8;
            int i14 = i10 + 2;
            int i15 = (bArr[i12] & UByte.MAX_VALUE) | i13;
            this.c -= 2;
            if (i14 == i11) {
                this.f3577b = b0Var.a();
                c0.a(b0Var);
            } else {
                b0Var.f3561b = i14;
            }
            return (short) i15;
        }
        throw new EOFException();
    }

    public final void s0(String str, int i10, int i11, Charset charset) {
        if (i10 >= 0) {
            if (i11 >= i10) {
                if (i11 <= str.length()) {
                    if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
                        t0(i10, i11, str);
                        return;
                    }
                    byte[] bytes = str.substring(i10, i11).getBytes(charset);
                    bytes.getClass();
                    m1558write(bytes, 0, bytes.length);
                    return;
                }
                j1.i.i(ai.onnxruntime.a.q(i11, "endIndex > string.length: ", " > "), str.length());
                return;
            }
            i.d(ai.onnxruntime.a.g(i11, "endIndex < beginIndex: ", " < ", i10));
            return;
        }
        i.d(ai.onnxruntime.a.e(i10, "beginIndex < 0: "));
    }

    @Override // l9.n
    public final void skip(long j10) {
        while (j10 > 0) {
            b0 b0Var = this.f3577b;
            if (b0Var != null) {
                int min = (int) Math.min(j10, b0Var.c - b0Var.f3561b);
                long j11 = min;
                this.c -= j11;
                j10 -= j11;
                int i10 = b0Var.f3561b + min;
                b0Var.f3561b = i10;
                if (i10 == b0Var.c) {
                    this.f3577b = b0Var.a();
                    c0.a(b0Var);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // l9.n
    public final void t(l lVar, long j10) {
        lVar.getClass();
        long j11 = this.c;
        if (j11 >= j10) {
            lVar.write(this, j10);
        } else {
            lVar.write(this, j11);
            throw new EOFException();
        }
    }

    public final void t0(int i10, int i11, String str) {
        char charAt;
        char c;
        str.getClass();
        if (i10 >= 0) {
            if (i11 >= i10) {
                if (i11 <= str.length()) {
                    while (i10 < i11) {
                        char charAt2 = str.charAt(i10);
                        if (charAt2 < 128) {
                            b0 k02 = k0(1);
                            byte[] bArr = k02.f3560a;
                            int i12 = k02.c - i10;
                            int min = Math.min(i11, 8192 - i12);
                            int i13 = i10 + 1;
                            bArr[i10 + i12] = (byte) charAt2;
                            while (true) {
                                i10 = i13;
                                if (i10 >= min || (charAt = str.charAt(i10)) >= 128) {
                                    break;
                                }
                                i13 = i10 + 1;
                                bArr[i10 + i12] = (byte) charAt;
                            }
                            int i14 = k02.c;
                            int i15 = (i12 + i10) - i14;
                            k02.c = i14 + i15;
                            this.c += i15;
                        } else {
                            if (charAt2 < 2048) {
                                b0 k03 = k0(2);
                                byte[] bArr2 = k03.f3560a;
                                int i16 = k03.c;
                                bArr2[i16] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i16 + 1] = (byte) ((charAt2 & '?') | 128);
                                k03.c = i16 + 2;
                                this.c += 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i17 = i10 + 1;
                                if (i17 < i11) {
                                    c = str.charAt(i17);
                                } else {
                                    c = 0;
                                }
                                if (charAt2 <= 56319 && 56320 <= c && c < 57344) {
                                    int i18 = (((charAt2 & 1023) << 10) | (c & 1023)) + 65536;
                                    b0 k04 = k0(4);
                                    byte[] bArr3 = k04.f3560a;
                                    int i19 = k04.c;
                                    bArr3[i19] = (byte) ((i18 >> 18) | 240);
                                    bArr3[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                                    bArr3[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                                    bArr3[i19 + 3] = (byte) ((i18 & 63) | 128);
                                    k04.c = i19 + 4;
                                    this.c += 4;
                                    i10 += 2;
                                } else {
                                    m0(63);
                                    i10 = i17;
                                }
                            } else {
                                b0 k05 = k0(3);
                                byte[] bArr4 = k05.f3560a;
                                int i20 = k05.c;
                                bArr4[i20] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i20 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i20 + 2] = (byte) ((charAt2 & '?') | 128);
                                k05.c = i20 + 3;
                                this.c += 3;
                            }
                            i10++;
                        }
                    }
                    return;
                }
                j1.i.i(ai.onnxruntime.a.q(i11, "endIndex > string.length: ", " > "), str.length());
                return;
            }
            i.d(ai.onnxruntime.a.g(i11, "endIndex < beginIndex: ", " < ", i10));
            return;
        }
        i.d(ai.onnxruntime.a.e(i10, "beginIndex < 0: "));
    }

    @Override // l9.g0
    public final j0 timeout() {
        return j0.NONE;
    }

    public final String toString() {
        return i0().toString();
    }

    public final void u0(String str) {
        str.getClass();
        t0(0, str.length(), str);
    }

    public final void v0(int i10) {
        String str;
        if (i10 < 128) {
            m0(i10);
            return;
        }
        if (i10 < 2048) {
            b0 k02 = k0(2);
            byte[] bArr = k02.f3560a;
            int i11 = k02.c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            k02.c = i11 + 2;
            this.c += 2;
            return;
        }
        if (55296 <= i10 && i10 < 57344) {
            m0(63);
            return;
        }
        if (i10 < 65536) {
            b0 k03 = k0(3);
            byte[] bArr2 = k03.f3560a;
            int i12 = k03.c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            k03.c = i12 + 3;
            this.c += 3;
            return;
        }
        if (i10 <= 1114111) {
            b0 k04 = k0(4);
            byte[] bArr3 = k04.f3560a;
            int i13 = k04.c;
            bArr3[i13] = (byte) ((i10 >> 18) | 240);
            bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
            bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
            bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
            k04.c = i13 + 4;
            this.c += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i10 != 0) {
            char[] cArr = m9.b.f3997a;
            char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
            int i14 = 0;
            while (i14 < 8 && cArr2[i14] == '0') {
                i14++;
            }
            str = StringsKt.m(cArr2, i14);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // l9.m
    public final /* bridge */ /* synthetic */ m w(o oVar) {
        l0(oVar);
        return this;
    }

    @Override // l9.e0
    public final void write(l lVar, long j10) {
        b0 b0Var;
        b0 b10;
        int i10;
        lVar.getClass();
        if (lVar != this) {
            b.d(lVar.c, 0L, j10);
            while (j10 > 0) {
                b0 b0Var2 = lVar.f3577b;
                b0Var2.getClass();
                int i11 = b0Var2.c;
                b0 b0Var3 = lVar.f3577b;
                b0Var3.getClass();
                long j11 = i11 - b0Var3.f3561b;
                int i12 = 0;
                if (j10 < j11) {
                    b0 b0Var4 = this.f3577b;
                    if (b0Var4 != null) {
                        b0Var = b0Var4.f3563g;
                    } else {
                        b0Var = null;
                    }
                    if (b0Var != null && b0Var.e) {
                        long j12 = b0Var.c + j10;
                        if (b0Var.d) {
                            i10 = 0;
                        } else {
                            i10 = b0Var.f3561b;
                        }
                        if (j12 - i10 <= 8192) {
                            b0 b0Var5 = lVar.f3577b;
                            b0Var5.getClass();
                            b0Var5.d(b0Var, (int) j10);
                            lVar.c -= j10;
                            this.c += j10;
                            return;
                        }
                    }
                    b0 b0Var6 = lVar.f3577b;
                    b0Var6.getClass();
                    int i13 = (int) j10;
                    if (i13 > 0 && i13 <= b0Var6.c - b0Var6.f3561b) {
                        if (i13 >= 1024) {
                            b10 = b0Var6.c();
                        } else {
                            b10 = c0.b();
                            byte[] bArr = b0Var6.f3560a;
                            byte[] bArr2 = b10.f3560a;
                            int i14 = b0Var6.f3561b;
                            ArraysKt.o(bArr, bArr2, i14, i14 + i13);
                        }
                        b10.c = b10.f3561b + i13;
                        b0Var6.f3561b += i13;
                        b0 b0Var7 = b0Var6.f3563g;
                        b0Var7.getClass();
                        b0Var7.b(b10);
                        lVar.f3577b = b10;
                    } else {
                        j1.i.k("byteCount out of range");
                        return;
                    }
                }
                b0 b0Var8 = lVar.f3577b;
                b0Var8.getClass();
                long j13 = b0Var8.c - b0Var8.f3561b;
                lVar.f3577b = b0Var8.a();
                b0 b0Var9 = this.f3577b;
                if (b0Var9 == null) {
                    this.f3577b = b0Var8;
                    b0Var8.f3563g = b0Var8;
                    b0Var8.f3562f = b0Var8;
                } else {
                    b0 b0Var10 = b0Var9.f3563g;
                    b0Var10.getClass();
                    b0Var10.b(b0Var8);
                    b0 b0Var11 = b0Var8.f3563g;
                    if (b0Var11 != b0Var8) {
                        b0Var11.getClass();
                        if (b0Var11.e) {
                            int i15 = b0Var8.c - b0Var8.f3561b;
                            b0 b0Var12 = b0Var8.f3563g;
                            b0Var12.getClass();
                            int i16 = 8192 - b0Var12.c;
                            b0 b0Var13 = b0Var8.f3563g;
                            b0Var13.getClass();
                            if (!b0Var13.d) {
                                b0 b0Var14 = b0Var8.f3563g;
                                b0Var14.getClass();
                                i12 = b0Var14.f3561b;
                            }
                            if (i15 <= i16 + i12) {
                                b0 b0Var15 = b0Var8.f3563g;
                                b0Var15.getClass();
                                b0Var8.d(b0Var15, i15);
                                b0Var8.a();
                                c0.a(b0Var8);
                            }
                        }
                    } else {
                        j1.i.l("cannot compact");
                        return;
                    }
                }
                lVar.c -= j13;
                this.c += j13;
                j10 -= j13;
            }
            return;
        }
        j1.i.k("source == this");
    }

    @Override // l9.m
    public final /* bridge */ /* synthetic */ m writeByte(int i10) {
        m0(i10);
        return this;
    }

    @Override // l9.m
    public final /* bridge */ /* synthetic */ m writeInt(int i10) {
        p0(i10);
        return this;
    }

    @Override // l9.m
    public final /* bridge */ /* synthetic */ m writeShort(int i10) {
        r0(i10);
        return this;
    }

    public final long y() {
        long j10 = this.c;
        if (j10 == 0) {
            return 0L;
        }
        b0 b0Var = this.f3577b;
        b0Var.getClass();
        b0 b0Var2 = b0Var.f3563g;
        b0Var2.getClass();
        if (b0Var2.c < 8192 && b0Var2.e) {
            return j10 - (r3 - b0Var2.f3561b);
        }
        return j10;
    }

    @Override // l9.n
    public final l a() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, l9.e0
    public final void close() {
    }

    @Override // l9.m, l9.e0, java.io.Flushable
    public final void flush() {
    }

    @Override // l9.m
    public final m g() {
        return this;
    }

    @Override // l9.m
    public final m n() {
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        b0 b0Var = this.f3577b;
        if (b0Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), b0Var.c - b0Var.f3561b);
        byteBuffer.put(b0Var.f3560a, b0Var.f3561b, min);
        int i10 = b0Var.f3561b + min;
        b0Var.f3561b = i10;
        this.c -= min;
        if (i10 == b0Var.c) {
            this.f3577b = b0Var.a();
            c0.a(b0Var);
        }
        return min;
    }

    @Override // l9.g0
    public final long read(l lVar, long j10) {
        lVar.getClass();
        if (j10 >= 0) {
            long j11 = this.c;
            if (j11 == 0) {
                return -1L;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            lVar.write(this, j10);
            return j10;
        }
        i.d(ai.onnxruntime.a.h(j10, "byteCount < 0: "));
        return 0L;
    }

    @Override // l9.m
    public final /* bridge */ /* synthetic */ m write(byte[] bArr, int i10, int i11) {
        m1558write(bArr, i10, i11);
        return this;
    }

    @Override // l9.m
    public final m write(byte[] bArr) {
        bArr.getClass();
        m1558write(bArr, 0, bArr.length);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            b0 k02 = k0(1);
            int min = Math.min(i10, 8192 - k02.c);
            byteBuffer.get(k02.f3560a, k02.c, min);
            i10 -= min;
            k02.c += min;
        }
        this.c += remaining;
        return remaining;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m1558write(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        long j10 = i11;
        b.d(bArr.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            b0 k02 = k0(1);
            int min = Math.min(i12 - i10, 8192 - k02.c);
            int i13 = i10 + min;
            ArraysKt.copyInto(bArr, k02.f3560a, k02.c, i10, i13);
            k02.c += min;
            i10 = i13;
        }
        this.c += j10;
    }
}
