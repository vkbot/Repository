package r7;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import l9.a0;
import l9.g0;
import l9.j0;
import l9.l;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f implements g0 {

    /* renamed from: b, reason: collision with root package name */
    public final a0 f5429b;
    public int c;
    public byte d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f5430f;

    /* renamed from: g, reason: collision with root package name */
    public short f5431g;

    public f(a0 a0Var) {
        this.f5429b = a0Var;
    }

    @Override // l9.g0
    public final long read(l lVar, long j10) {
        int i10;
        int readInt;
        do {
            int i11 = this.f5430f;
            a0 a0Var = this.f5429b;
            if (i11 == 0) {
                a0Var.skip(this.f5431g);
                this.f5431g = (short) 0;
                if ((this.d & 4) == 0) {
                    i10 = this.e;
                    int a10 = j.a(a0Var);
                    this.f5430f = a10;
                    this.c = a10;
                    byte readByte = (byte) (a0Var.readByte() & UByte.MAX_VALUE);
                    this.d = (byte) (a0Var.readByte() & UByte.MAX_VALUE);
                    Logger logger = j.f5437a;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(g.a(true, this.e, this.c, readByte, this.d));
                    }
                    readInt = a0Var.readInt() & Integer.MAX_VALUE;
                    this.e = readInt;
                    if (readByte != 9) {
                        j.c("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                        throw null;
                    }
                }
            } else {
                long read = a0Var.read(lVar, Math.min(j10, i11));
                if (read != -1) {
                    this.f5430f -= (int) read;
                    return read;
                }
            }
            return -1L;
        } while (readInt == i10);
        j.c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // l9.g0
    public final j0 timeout() {
        return this.f5429b.f3558b.timeout();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
