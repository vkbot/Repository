package l9;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.text.Typography;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class a0 implements n {

    /* renamed from: b, reason: collision with root package name */
    public final g0 f3558b;
    public final l c;
    public boolean d;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, l9.l] */
    public a0(g0 g0Var) {
        g0Var.getClass();
        this.f3558b = g0Var;
        this.c = new Object();
    }

    @Override // l9.n
    public final String D(Charset charset) {
        charset.getClass();
        g0 g0Var = this.f3558b;
        l lVar = this.c;
        lVar.G(g0Var);
        return lVar.g0(lVar.c, charset);
    }

    @Override // l9.n
    public final o J() {
        g0 g0Var = this.f3558b;
        l lVar = this.c;
        lVar.G(g0Var);
        return lVar.f(lVar.c);
    }

    @Override // l9.n
    public final String L() {
        return p(Long.MAX_VALUE);
    }

    @Override // l9.n
    public final int P(w wVar) {
        wVar.getClass();
        if (this.d) {
            j1.i.l("closed");
            return 0;
        }
        while (true) {
            l lVar = this.c;
            int c = m9.a.c(lVar, wVar, true);
            if (c != -2) {
                if (c != -1) {
                    lVar.skip(wVar.f3585b[c].c());
                    return c;
                }
            } else if (this.f3558b.read(lVar, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // l9.n
    public final boolean Q(long j10, o oVar) {
        oVar.getClass();
        int c = oVar.c();
        if (!this.d) {
            if (c >= 0 && oVar.c() >= c) {
                for (int i10 = 0; i10 < c; i10++) {
                    long j11 = i10;
                    if (d(1 + j11) && this.c.V(j11) == oVar.f(i10)) {
                    }
                }
                return true;
            }
            return false;
        }
        j1.i.l("closed");
        return false;
    }

    @Override // l9.n
    public final void Y(long j10) {
        if (d(j10)) {
        } else {
            throw new EOFException();
        }
    }

    @Override // l9.n
    public final l a() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r1 = java.lang.Integer.toString(r2, kotlin.text.CharsKt.checkRadix(kotlin.text.CharsKt.checkRadix(16)));
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    @Override // l9.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a0() {
        /*
            r6 = this;
            r0 = 1
            r6.Y(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.d(r2)
            l9.l r3 = r6.c
            if (r2 == 0) goto L51
            long r4 = (long) r0
            byte r2 = r3.V(r4)
            r4 = 48
            if (r2 < r4) goto L1e
            r4 = 57
            if (r2 <= r4) goto L2f
        L1e:
            r4 = 97
            if (r2 < r4) goto L26
            r4 = 102(0x66, float:1.43E-43)
            if (r2 <= r4) goto L2f
        L26:
            r4 = 65
            if (r2 < r4) goto L31
            r4 = 70
            if (r2 <= r4) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L51
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            int r1 = kotlin.text.CharsKt.checkRadix(r1)
            int r1 = kotlin.text.CharsKt.checkRadix(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            r1.getClass()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L51:
            long r0 = r3.a0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.a0.a0():long");
    }

    public final long b(long j10, long j11, byte b10) {
        if (!this.d) {
            if (0 <= j11) {
                long j12 = 0;
                while (j12 < j11) {
                    l lVar = this.c;
                    long j13 = j11;
                    byte b11 = b10;
                    long c02 = lVar.c0(j12, j13, b11);
                    if (c02 != -1) {
                        return c02;
                    }
                    long j14 = lVar.c;
                    if (j14 >= j13 || this.f3558b.read(lVar, 8192L) == -1) {
                        break;
                    }
                    j12 = Math.max(j12, j14);
                    j11 = j13;
                    b10 = b11;
                }
                return -1L;
            }
            i.d(ai.onnxruntime.a.h(j11, "fromIndex=0 toIndex="));
            return 0L;
        }
        j1.i.l("closed");
        return 0L;
    }

    @Override // l9.n
    public final InputStream b0() {
        return new k(this, 1);
    }

    public final int c() {
        Y(4L);
        int readInt = this.c.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.d) {
            this.d = true;
            this.f3558b.close();
            this.c.b();
        }
    }

    @Override // l9.n
    public final boolean d(long j10) {
        l lVar;
        if (j10 >= 0) {
            if (this.d) {
                j1.i.l("closed");
                return false;
            }
            do {
                lVar = this.c;
                if (lVar.c >= j10) {
                    return true;
                }
            } while (this.f3558b.read(lVar, 8192L) != -1);
            return false;
        }
        i.d(ai.onnxruntime.a.h(j10, "byteCount < 0: "));
        return false;
    }

    @Override // l9.n
    public final o f(long j10) {
        Y(j10);
        return this.c.f(j10);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.d;
    }

    @Override // l9.n
    public final byte[] j() {
        g0 g0Var = this.f3558b;
        l lVar = this.c;
        lVar.G(g0Var);
        return lVar.f0(lVar.c);
    }

    @Override // l9.n
    public final boolean k() {
        if (!this.d) {
            l lVar = this.c;
            if (lVar.k() && this.f3558b.read(lVar, 8192L) == -1) {
                return true;
            }
            return false;
        }
        j1.i.l("closed");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r1 = java.lang.Integer.toString(r8, kotlin.text.CharsKt.checkRadix(kotlin.text.CharsKt.checkRadix(16)));
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        throw new java.lang.NumberFormatException("Expected a digit or '-' but was 0x".concat(r1));
     */
    @Override // l9.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long o() {
        /*
            r11 = this;
            r0 = 1
            r11.Y(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r11.d(r6)
            l9.l r9 = r11.c
            if (r8 == 0) goto L49
            byte r8 = r9.V(r4)
            r10 = 48
            if (r8 < r10) goto L1e
            r10 = 57
            if (r8 <= r10) goto L27
        L1e:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L29
            r5 = 45
            if (r8 == r5) goto L27
            goto L29
        L27:
            r4 = r6
            goto L8
        L29:
            if (r4 == 0) goto L2c
            goto L49
        L2c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            int r1 = kotlin.text.CharsKt.checkRadix(r1)
            int r1 = kotlin.text.CharsKt.checkRadix(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            r1.getClass()
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L49:
            long r0 = r9.o()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.a0.o():long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, l9.l] */
    @Override // l9.n
    public final String p(long j10) {
        long j11;
        if (j10 >= 0) {
            if (j10 == Long.MAX_VALUE) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10 + 1;
            }
            long b10 = b(0L, j11, (byte) 10);
            l lVar = this.c;
            if (b10 != -1) {
                return m9.a.b(lVar, b10);
            }
            if (j11 < Long.MAX_VALUE && d(j11) && lVar.V(j11 - 1) == 13 && d(j11 + 1) && lVar.V(j11) == 10) {
                return m9.a.b(lVar, j11);
            }
            ?? obj = new Object();
            lVar.S(0L, obj, Math.min(32, lVar.c));
            throw new EOFException("\\n not found: limit=" + Math.min(lVar.c, j10) + " content=" + obj.f(obj.c).d() + Typography.ellipsis);
        }
        i.d(ai.onnxruntime.a.h(j10, "limit < 0: "));
        return null;
    }

    @Override // l9.n
    public final a0 peek() {
        return new a0(new y(this));
    }

    @Override // l9.g0
    public final long read(l lVar, long j10) {
        lVar.getClass();
        if (j10 >= 0) {
            if (!this.d) {
                l lVar2 = this.c;
                if (lVar2.c == 0 && this.f3558b.read(lVar2, 8192L) == -1) {
                    return -1L;
                }
                return lVar2.read(lVar, Math.min(j10, lVar2.c));
            }
            j1.i.l("closed");
            return 0L;
        }
        i.d(ai.onnxruntime.a.h(j10, "byteCount < 0: "));
        return 0L;
    }

    @Override // l9.n
    public final byte readByte() {
        Y(1L);
        return this.c.readByte();
    }

    @Override // l9.n
    public final void readFully(byte[] bArr) {
        l lVar = this.c;
        bArr.getClass();
        try {
            Y(bArr.length);
            lVar.readFully(bArr);
        } catch (EOFException e) {
            int i10 = 0;
            while (true) {
                long j10 = lVar.c;
                if (j10 > 0) {
                    int read = lVar.read(bArr, i10, (int) j10);
                    if (read != -1) {
                        i10 += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    @Override // l9.n
    public final int readInt() {
        Y(4L);
        return this.c.readInt();
    }

    @Override // l9.n
    public final long readLong() {
        Y(8L);
        return this.c.readLong();
    }

    @Override // l9.n
    public final short readShort() {
        Y(2L);
        return this.c.readShort();
    }

    @Override // l9.n
    public final void skip(long j10) {
        if (!this.d) {
            while (j10 > 0) {
                l lVar = this.c;
                if (lVar.c == 0 && this.f3558b.read(lVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j10, lVar.c);
                lVar.skip(min);
                j10 -= min;
            }
            return;
        }
        j1.i.l("closed");
    }

    @Override // l9.n
    public final void t(l lVar, long j10) {
        l lVar2 = this.c;
        lVar.getClass();
        try {
            Y(j10);
            lVar2.t(lVar, j10);
        } catch (EOFException e) {
            lVar.G(lVar2);
            throw e;
        }
    }

    @Override // l9.g0
    public final j0 timeout() {
        return this.f3558b.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f3558b + ')';
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        l lVar = this.c;
        if (lVar.c == 0 && this.f3558b.read(lVar, 8192L) == -1) {
            return -1;
        }
        return lVar.read(byteBuffer);
    }
}
