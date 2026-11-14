package l9;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class z implements m {

    /* renamed from: b, reason: collision with root package name */
    public final e0 f3590b;
    public final l c;
    public boolean d;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, l9.l] */
    public z(e0 e0Var) {
        e0Var.getClass();
        this.f3590b = e0Var;
        this.c = new Object();
    }

    @Override // l9.m
    public final m A(String str) {
        str.getClass();
        if (!this.d) {
            this.c.u0(str);
            n();
            return this;
        }
        j1.i.l("closed");
        return null;
    }

    @Override // l9.m
    public final long G(g0 g0Var) {
        long j10 = 0;
        while (true) {
            long read = ((f) g0Var).read(this.c, 8192L);
            if (read != -1) {
                j10 += read;
                n();
            } else {
                return j10;
            }
        }
    }

    @Override // l9.m
    public final m H(long j10) {
        if (!this.d) {
            this.c.o0(j10);
            n();
            return this;
        }
        j1.i.l("closed");
        return null;
    }

    @Override // l9.m
    public final m Z(long j10) {
        if (!this.d) {
            this.c.n0(j10);
            n();
            return this;
        }
        j1.i.l("closed");
        return null;
    }

    @Override // l9.m
    public final l a() {
        return this.c;
    }

    @Override // l9.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e0 e0Var = this.f3590b;
        if (!this.d) {
            try {
                l lVar = this.c;
                long j10 = lVar.c;
                if (j10 > 0) {
                    e0Var.write(lVar, j10);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                e0Var.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.d = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // l9.m, l9.e0, java.io.Flushable
    public final void flush() {
        if (!this.d) {
            l lVar = this.c;
            long j10 = lVar.c;
            e0 e0Var = this.f3590b;
            if (j10 > 0) {
                e0Var.write(lVar, j10);
            }
            e0Var.flush();
            return;
        }
        j1.i.l("closed");
    }

    @Override // l9.m
    public final m g() {
        if (!this.d) {
            l lVar = this.c;
            long j10 = lVar.c;
            if (j10 > 0) {
                this.f3590b.write(lVar, j10);
            }
            return this;
        }
        j1.i.l("closed");
        return null;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.d;
    }

    @Override // l9.m
    public final m n() {
        if (!this.d) {
            l lVar = this.c;
            long y9 = lVar.y();
            if (y9 > 0) {
                this.f3590b.write(lVar, y9);
            }
            return this;
        }
        j1.i.l("closed");
        return null;
    }

    @Override // l9.e0
    public final j0 timeout() {
        return this.f3590b.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f3590b + ')';
    }

    @Override // l9.m
    public final m w(o oVar) {
        oVar.getClass();
        if (!this.d) {
            this.c.l0(oVar);
            n();
            return this;
        }
        j1.i.l("closed");
        return null;
    }

    @Override // l9.m
    public final m write(byte[] bArr) {
        bArr.getClass();
        if (!this.d) {
            this.c.m1558write(bArr, 0, bArr.length);
            n();
            return this;
        }
        j1.i.l("closed");
        return null;
    }

    @Override // l9.m
    public final m writeByte(int i10) {
        if (!this.d) {
            this.c.m0(i10);
            n();
            return this;
        }
        j1.i.l("closed");
        return null;
    }

    @Override // l9.m
    public final m writeInt(int i10) {
        if (!this.d) {
            this.c.p0(i10);
            n();
            return this;
        }
        j1.i.l("closed");
        return null;
    }

    @Override // l9.m
    public final m writeShort(int i10) {
        if (!this.d) {
            this.c.r0(i10);
            n();
            return this;
        }
        j1.i.l("closed");
        return null;
    }

    @Override // l9.e0
    public final void write(l lVar, long j10) {
        lVar.getClass();
        if (!this.d) {
            this.c.write(lVar, j10);
            n();
        } else {
            j1.i.l("closed");
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.d) {
            int write = this.c.write(byteBuffer);
            n();
            return write;
        }
        j1.i.l("closed");
        return 0;
    }

    @Override // l9.m
    public final m write(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        if (!this.d) {
            this.c.m1558write(bArr, i10, i11);
            n();
            return this;
        }
        j1.i.l("closed");
        return null;
    }
}
