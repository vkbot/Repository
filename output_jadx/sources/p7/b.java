package p7;

import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final r7.i f5019b;
    public final /* synthetic */ c c;

    public b(c cVar, r7.i iVar) {
        this.c = cVar;
        this.f5019b = iVar;
    }

    public final void S(boolean z9, int i10, int i11) {
        if (z9) {
            this.c.f5028m++;
        }
        r7.i iVar = this.f5019b;
        synchronized (iVar) {
            if (!iVar.f5436f) {
                iVar.b(0, 8, (byte) 6, z9 ? (byte) 1 : (byte) 0);
                iVar.f5435b.writeInt(i10);
                iVar.f5435b.writeInt(i11);
                iVar.f5435b.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void V(int i10, r7.a aVar) {
        this.c.f5028m++;
        r7.i iVar = this.f5019b;
        synchronized (iVar) {
            if (!iVar.f5436f) {
                if (aVar.f5414b != -1) {
                    iVar.b(i10, 4, (byte) 3, (byte) 0);
                    iVar.f5435b.writeInt(aVar.f5414b);
                    iVar.f5435b.flush();
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void b(j.i iVar) {
        this.c.f5028m++;
        r7.i iVar2 = this.f5019b;
        synchronized (iVar2) {
            if (!iVar2.f5436f) {
                int i10 = iVar2.e;
                if ((iVar.f3015b & 32) != 0) {
                    i10 = ((int[]) iVar.c)[5];
                }
                iVar2.e = i10;
                iVar2.b(0, 0, (byte) 4, (byte) 1);
                iVar2.f5435b.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void c() {
        r7.i iVar = this.f5019b;
        synchronized (iVar) {
            try {
                if (!iVar.f5436f) {
                    Logger logger = r7.j.f5437a;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(">> CONNECTION " + r7.j.f5438b.d());
                    }
                    iVar.f5435b.write(r7.j.f5438b.k());
                    iVar.f5435b.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c0(j.i iVar) {
        int i10;
        r7.i iVar2 = this.f5019b;
        synchronized (iVar2) {
            try {
                if (!iVar2.f5436f) {
                    iVar2.b(0, Integer.bitCount(iVar.f3015b) * 6, (byte) 4, (byte) 0);
                    for (int i11 = 0; i11 < 10; i11++) {
                        if (iVar.b(i11)) {
                            if (i11 == 4) {
                                i10 = 3;
                            } else if (i11 == 7) {
                                i10 = 4;
                            } else {
                                i10 = i11;
                            }
                            iVar2.f5435b.writeShort(i10);
                            iVar2.f5435b.writeInt(((int[]) iVar.c)[i11]);
                        }
                    }
                    iVar2.f5435b.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5019b.close();
    }

    public final void d0(int i10, long j10) {
        r7.i iVar = this.f5019b;
        synchronized (iVar) {
            if (!iVar.f5436f) {
                if (j10 != 0 && j10 <= 2147483647L) {
                    iVar.b(i10, 4, (byte) 8, (byte) 0);
                    iVar.f5435b.writeInt((int) j10);
                    iVar.f5435b.flush();
                } else {
                    Locale locale = Locale.US;
                    throw new IllegalArgumentException("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10);
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void flush() {
        r7.i iVar = this.f5019b;
        synchronized (iVar) {
            if (!iVar.f5436f) {
                iVar.f5435b.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void y(r7.a aVar, byte[] bArr) {
        r7.i iVar = this.f5019b;
        synchronized (iVar) {
            try {
                if (!iVar.f5436f) {
                    if (aVar.f5414b != -1) {
                        iVar.b(0, bArr.length + 8, (byte) 7, (byte) 0);
                        iVar.f5435b.writeInt(0);
                        iVar.f5435b.writeInt(aVar.f5414b);
                        if (bArr.length > 0) {
                            iVar.f5435b.write(bArr);
                        }
                        iVar.f5435b.flush();
                    } else {
                        Locale locale = Locale.US;
                        throw new IllegalArgumentException("errorCode.httpCode == -1");
                    }
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
