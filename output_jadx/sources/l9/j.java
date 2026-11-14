package l9;

import java.io.Closeable;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class j implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public l f3572b;
    public boolean c;
    public b0 d;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f3573f;
    public long e = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f3574g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f3575h = -1;

    public final void b(long j10) {
        l lVar = this.f3572b;
        if (lVar != null) {
            if (this.c) {
                long j11 = lVar.c;
                if (j10 <= j11) {
                    if (j10 >= 0) {
                        long j12 = j11 - j10;
                        while (true) {
                            if (j12 <= 0) {
                                break;
                            }
                            b0 b0Var = lVar.f3577b;
                            b0Var.getClass();
                            b0 b0Var2 = b0Var.f3563g;
                            b0Var2.getClass();
                            int i10 = b0Var2.c;
                            long j13 = i10 - b0Var2.f3561b;
                            if (j13 <= j12) {
                                lVar.f3577b = b0Var2.a();
                                c0.a(b0Var2);
                                j12 -= j13;
                            } else {
                                b0Var2.c = i10 - ((int) j12);
                                break;
                            }
                        }
                        this.d = null;
                        this.e = j10;
                        this.f3573f = null;
                        this.f3574g = -1;
                        this.f3575h = -1;
                    } else {
                        i.d(ai.onnxruntime.a.h(j10, "newSize < 0: "));
                        return;
                    }
                } else if (j10 > j11) {
                    long j14 = j10 - j11;
                    int i11 = 1;
                    boolean z9 = true;
                    for (long j15 = 0; j14 > j15; j15 = 0) {
                        b0 k02 = lVar.k0(i11);
                        int min = (int) Math.min(j14, 8192 - k02.c);
                        int i12 = k02.c + min;
                        k02.c = i12;
                        j14 -= min;
                        if (z9) {
                            this.d = k02;
                            this.e = j11;
                            this.f3573f = k02.f3560a;
                            this.f3574g = i12 - min;
                            this.f3575h = i12;
                            z9 = false;
                        }
                        i11 = 1;
                    }
                }
                lVar.c = j10;
                return;
            }
            j1.i.l("resizeBuffer() only permitted for read/write buffers");
            return;
        }
        j1.i.l("not attached to a buffer");
    }

    public final int c(long j10) {
        l lVar = this.f3572b;
        if (lVar != null) {
            if (j10 >= -1) {
                long j11 = lVar.c;
                if (j10 <= j11) {
                    if (j10 != -1 && j10 != j11) {
                        b0 b0Var = lVar.f3577b;
                        b0 b0Var2 = this.d;
                        long j12 = 0;
                        if (b0Var2 != null) {
                            long j13 = this.e - (this.f3574g - b0Var2.f3561b);
                            if (j13 > j10) {
                                b0Var2 = b0Var;
                                b0Var = b0Var2;
                                j11 = j13;
                            } else {
                                j12 = j13;
                            }
                        } else {
                            b0Var2 = b0Var;
                        }
                        if (j11 - j10 > j10 - j12) {
                            while (true) {
                                b0Var2.getClass();
                                long j14 = (b0Var2.c - b0Var2.f3561b) + j12;
                                if (j10 < j14) {
                                    break;
                                }
                                b0Var2 = b0Var2.f3562f;
                                j12 = j14;
                            }
                        } else {
                            while (j11 > j10) {
                                b0Var.getClass();
                                b0Var = b0Var.f3563g;
                                b0Var.getClass();
                                j11 -= b0Var.c - b0Var.f3561b;
                            }
                            b0Var2 = b0Var;
                            j12 = j11;
                        }
                        if (this.c) {
                            b0Var2.getClass();
                            if (b0Var2.d) {
                                byte[] bArr = b0Var2.f3560a;
                                b0 b0Var3 = new b0(Arrays.copyOf(bArr, bArr.length), b0Var2.f3561b, b0Var2.c, false, true);
                                if (lVar.f3577b == b0Var2) {
                                    lVar.f3577b = b0Var3;
                                }
                                b0Var2.b(b0Var3);
                                b0 b0Var4 = b0Var3.f3563g;
                                b0Var4.getClass();
                                b0Var4.a();
                                b0Var2 = b0Var3;
                            }
                        }
                        this.d = b0Var2;
                        this.e = j10;
                        b0Var2.getClass();
                        this.f3573f = b0Var2.f3560a;
                        int i10 = b0Var2.f3561b + ((int) (j10 - j12));
                        this.f3574g = i10;
                        int i11 = b0Var2.c;
                        this.f3575h = i11;
                        return i11 - i10;
                    }
                    this.d = null;
                    this.e = j10;
                    this.f3573f = null;
                    this.f3574g = -1;
                    this.f3575h = -1;
                    return -1;
                }
            }
            throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + lVar.c);
        }
        j1.i.l("not attached to a buffer");
        return 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3572b != null) {
            this.f3572b = null;
            this.d = null;
            this.e = -1L;
            this.f3573f = null;
            this.f3574g = -1;
            this.f3575h = -1;
            return;
        }
        j1.i.l("not attached to a buffer");
    }
}
