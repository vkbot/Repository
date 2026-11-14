package l9;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.UShort;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class t implements g0 {

    /* renamed from: b, reason: collision with root package name */
    public byte f3581b;
    public final a0 c;
    public final Inflater d;
    public final u e;

    /* renamed from: f, reason: collision with root package name */
    public final CRC32 f3582f;

    public t(g0 g0Var) {
        g0Var.getClass();
        a0 a0Var = new a0(g0Var);
        this.c = a0Var;
        Inflater inflater = new Inflater(true);
        this.d = inflater;
        this.e = new u(a0Var, inflater);
        this.f3582f = new CRC32();
    }

    public static void b(int i10, int i11, String str) {
        if (i11 == i10) {
        } else {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3)));
        }
    }

    public final void c(long j10, l lVar, long j11) {
        b0 b0Var = lVar.f3577b;
        b0Var.getClass();
        while (true) {
            int i10 = b0Var.c;
            int i11 = b0Var.f3561b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= i10 - i11;
            b0Var = b0Var.f3562f;
            b0Var.getClass();
        }
        while (j11 > 0) {
            int min = (int) Math.min(b0Var.c - r5, j11);
            this.f3582f.update(b0Var.f3560a, (int) (b0Var.f3561b + j10), min);
            j11 -= min;
            b0Var = b0Var.f3562f;
            b0Var.getClass();
            j10 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    @Override // l9.g0
    public final long read(l lVar, long j10) {
        boolean z9;
        long j11;
        t tVar = this;
        lVar.getClass();
        if (j10 >= 0) {
            if (j10 == 0) {
                return 0L;
            }
            byte b10 = tVar.f3581b;
            CRC32 crc32 = tVar.f3582f;
            a0 a0Var = tVar.c;
            if (b10 == 0) {
                a0Var.Y(10L);
                l lVar2 = a0Var.c;
                byte V = lVar2.V(3L);
                if (((V >> 1) & 1) == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    tVar.c(0L, lVar2, 10L);
                }
                b(8075, a0Var.readShort(), "ID1ID2");
                a0Var.skip(8L);
                if (((V >> 2) & 1) == 1) {
                    a0Var.Y(2L);
                    if (z9) {
                        c(0L, lVar2, 2L);
                    }
                    short readShort = lVar2.readShort();
                    long j12 = ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8))) & UShort.MAX_VALUE;
                    a0Var.Y(j12);
                    if (z9) {
                        c(0L, lVar2, j12);
                    }
                    a0Var.skip(j12);
                }
                if (((V >> 3) & 1) == 1) {
                    long b11 = a0Var.b(0L, Long.MAX_VALUE, (byte) 0);
                    if (b11 != -1) {
                        if (z9) {
                            j11 = 2;
                            c(0L, lVar2, b11 + 1);
                        } else {
                            j11 = 2;
                        }
                        a0Var.skip(b11 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    j11 = 2;
                }
                if (((V >> 4) & 1) == 1) {
                    long j13 = j11;
                    long b12 = a0Var.b(0L, Long.MAX_VALUE, (byte) 0);
                    if (b12 != -1) {
                        j11 = j13;
                        if (z9) {
                            tVar = this;
                            tVar.c(0L, lVar2, b12 + 1);
                        } else {
                            tVar = this;
                        }
                        a0Var.skip(b12 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    tVar = this;
                }
                if (z9) {
                    a0Var.Y(j11);
                    short readShort2 = lVar2.readShort();
                    b((short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                    crc32.reset();
                }
                tVar.f3581b = (byte) 1;
            }
            if (tVar.f3581b == 1) {
                long j14 = lVar.c;
                long read = tVar.e.read(lVar, j10);
                if (read != -1) {
                    tVar.c(j14, lVar, read);
                    return read;
                }
                tVar.f3581b = (byte) 2;
            }
            if (tVar.f3581b == 2) {
                b(a0Var.c(), (int) crc32.getValue(), "CRC");
                b(a0Var.c(), (int) tVar.d.getBytesWritten(), "ISIZE");
                tVar.f3581b = (byte) 3;
                if (!a0Var.k()) {
                    n0.b.A("gzip finished without exhausting source");
                    return 0L;
                }
            }
            return -1L;
        }
        i.d(ai.onnxruntime.a.h(j10, "byteCount < 0: "));
        return 0L;
    }

    @Override // l9.g0
    public final j0 timeout() {
        return this.c.f3558b.timeout();
    }
}
