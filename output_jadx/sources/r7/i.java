package r7;

import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import l9.l;
import l9.o;
import l9.z;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final z f5435b;
    public final l c;
    public final d d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5436f;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, l9.l] */
    public i(z zVar) {
        this.f5435b = zVar;
        ?? obj = new Object();
        this.c = obj;
        this.d = new d(obj);
        this.e = 16384;
    }

    public final void b(int i10, int i11, byte b10, byte b11) {
        Logger logger = j.f5437a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(g.a(false, i10, i11, b10, b11));
        }
        int i12 = this.e;
        if (i11 <= i12) {
            if ((Integer.MIN_VALUE & i10) == 0) {
                z zVar = this.f5435b;
                zVar.writeByte((i11 >>> 16) & 255);
                zVar.writeByte((i11 >>> 8) & 255);
                zVar.writeByte(i11 & 255);
                zVar.writeByte(b10 & UByte.MAX_VALUE);
                zVar.writeByte(b11 & UByte.MAX_VALUE);
                zVar.writeInt(i10 & Integer.MAX_VALUE);
                return;
            }
            Locale locale = Locale.US;
            j1.i.k(ai.onnxruntime.a.e(i10, "reserved bit set: "));
            return;
        }
        Locale locale2 = Locale.US;
        j1.i.k(ai.onnxruntime.a.g(i12, "FRAME_SIZE_ERROR length > ", ": ", i11));
    }

    public final void c(boolean z9, int i10, List list) {
        byte b10;
        byte b11;
        int i11;
        int i12;
        if (!this.f5436f) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                b bVar = (b) list.get(i13);
                o j10 = bVar.f5418a.j();
                o oVar = bVar.f5419b;
                Integer num = (Integer) e.c.get(j10);
                if (num != null) {
                    int intValue = num.intValue();
                    i12 = intValue + 1;
                    if (i12 >= 2 && i12 <= 7) {
                        b[] bVarArr = e.f5428b;
                        if (bVarArr[intValue].f5419b.equals(oVar)) {
                            i11 = i12;
                        } else if (bVarArr[i12].f5419b.equals(oVar)) {
                            i12 = intValue + 2;
                            i11 = i12;
                        }
                    }
                    i11 = i12;
                    i12 = -1;
                } else {
                    i11 = -1;
                    i12 = -1;
                }
                d dVar = this.d;
                if (i12 == -1) {
                    int i14 = dVar.d + 1;
                    while (true) {
                        b[] bVarArr2 = dVar.f5426b;
                        if (i14 >= bVarArr2.length) {
                            break;
                        }
                        if (bVarArr2[i14].f5418a.equals(j10)) {
                            if (dVar.f5426b[i14].f5419b.equals(oVar)) {
                                i12 = (i14 - dVar.d) + e.f5428b.length;
                                break;
                            } else if (i11 == -1) {
                                i11 = (i14 - dVar.d) + e.f5428b.length;
                            }
                        }
                        i14++;
                    }
                }
                if (i12 != -1) {
                    dVar.c(i12, 127, 128);
                } else if (i11 == -1) {
                    dVar.f5425a.m0(64);
                    dVar.b(j10);
                    dVar.b(oVar);
                    dVar.a(bVar);
                } else {
                    o oVar2 = e.f5427a;
                    j10.getClass();
                    oVar2.getClass();
                    if (j10.i(oVar2, oVar2.c()) && !b.f5417h.equals(j10)) {
                        dVar.c(i11, 15, 0);
                        dVar.b(oVar);
                    } else {
                        dVar.c(i11, 63, 64);
                        dVar.b(oVar);
                        dVar.a(bVar);
                    }
                }
            }
            l lVar = this.c;
            long j11 = lVar.c;
            int min = (int) Math.min(this.e, j11);
            long j12 = min;
            if (j11 == j12) {
                b10 = 4;
            } else {
                b10 = 0;
            }
            if (z9) {
                b10 = (byte) (b10 | 1);
            }
            b(i10, min, (byte) 1, b10);
            z zVar = this.f5435b;
            zVar.write(lVar, j12);
            if (j11 > j12) {
                long j13 = j11 - j12;
                while (j13 > 0) {
                    int min2 = (int) Math.min(this.e, j13);
                    long j14 = min2;
                    j13 -= j14;
                    if (j13 == 0) {
                        b11 = 4;
                    } else {
                        b11 = 0;
                    }
                    b(i10, min2, (byte) 9, b11);
                    zVar.write(lVar, j14);
                }
                return;
            }
            return;
        }
        n0.b.A("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f5436f = true;
        this.f5435b.close();
    }
}
