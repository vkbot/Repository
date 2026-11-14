package p7;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements Closeable {
    public static final Logger e = Logger.getLogger(n.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final n f5030b;
    public final b c;
    public final l.d d;

    public d(n nVar, b bVar) {
        Level level = Level.FINE;
        this.d = new l.d(6);
        this.f5030b = nVar;
        this.c = bVar;
    }

    public final void S(int i10, r7.a aVar) {
        this.d.E(2, i10, aVar);
        try {
            this.c.V(i10, aVar);
        } catch (IOException e6) {
            this.f5030b.n(e6);
        }
    }

    public final void V(int i10, long j10) {
        this.d.G(j10, 2, i10);
        try {
            this.c.d0(i10, j10);
        } catch (IOException e6) {
            this.f5030b.n(e6);
        }
    }

    public final void b(boolean z9, int i10, l9.l lVar, int i11) {
        byte b10;
        l.d dVar = this.d;
        lVar.getClass();
        dVar.B(2, i10, lVar, i11, z9);
        try {
            r7.i iVar = this.c.f5019b;
            synchronized (iVar) {
                if (!iVar.f5436f) {
                    if (z9) {
                        b10 = (byte) 1;
                    } else {
                        b10 = 0;
                    }
                    iVar.b(i10, i11, (byte) 0, b10);
                    if (i11 > 0) {
                        iVar.f5435b.write(lVar, i11);
                    }
                } else {
                    throw new IOException("closed");
                }
            }
        } catch (IOException e6) {
            this.f5030b.n(e6);
        }
    }

    public final void c(r7.a aVar, byte[] bArr) {
        b bVar = this.c;
        this.d.C(2, 0, aVar, l9.o.g(bArr));
        try {
            bVar.y(aVar, bArr);
            bVar.flush();
        } catch (IOException e6) {
            this.f5030b.n(e6);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Level level;
        try {
            this.c.close();
        } catch (IOException e6) {
            if (e6.getClass().equals(IOException.class)) {
                level = Level.FINE;
            } else {
                level = Level.INFO;
            }
            e.log(level, "Failed closing connection", (Throwable) e6);
        }
    }

    public final void flush() {
        try {
            this.c.flush();
        } catch (IOException e6) {
            this.f5030b.n(e6);
        }
    }

    public final void y(boolean z9, int i10, int i11) {
        l.d dVar = this.d;
        if (z9) {
            long j10 = (4294967295L & i11) | (i10 << 32);
            if (dVar.z()) {
                ((Logger) dVar.c).log((Level) dVar.d, "OUTBOUND PING: ack=true bytes=" + j10);
            }
        } else {
            dVar.D(2, (4294967295L & i11) | (i10 << 32));
        }
        try {
            this.c.S(z9, i10, i11);
        } catch (IOException e6) {
            this.f5030b.n(e6);
        }
    }
}
