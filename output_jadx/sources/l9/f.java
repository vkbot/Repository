package l9;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class f implements g0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3569b = 1;
    public final Object c;
    public final Object d;

    public f(InputStream inputStream, j0 j0Var) {
        inputStream.getClass();
        j0Var.getClass();
        this.c = inputStream;
        this.d = j0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = this.f3569b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                g gVar = (g) obj;
                g0 g0Var = (g0) this.d;
                gVar.enter();
                try {
                    g0Var.close();
                    Unit unit = Unit.INSTANCE;
                    if (!gVar.exit()) {
                        return;
                    } else {
                        throw gVar.access$newTimeoutException(null);
                    }
                } catch (IOException e) {
                    if (!gVar.exit()) {
                        throw e;
                    }
                    throw gVar.access$newTimeoutException(e);
                } finally {
                    gVar.exit();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // l9.g0
    public final long read(l lVar, long j10) {
        int i10 = this.f3569b;
        lVar.getClass();
        switch (i10) {
            case 0:
                g gVar = (g) this.c;
                g0 g0Var = (g0) this.d;
                gVar.enter();
                try {
                    long read = g0Var.read(lVar, j10);
                    if (!gVar.exit()) {
                        return read;
                    }
                    throw gVar.access$newTimeoutException(null);
                } catch (IOException e) {
                    if (!gVar.exit()) {
                        throw e;
                    }
                    throw gVar.access$newTimeoutException(e);
                } finally {
                    gVar.exit();
                }
            default:
                if (j10 == 0) {
                    return 0L;
                }
                if (j10 >= 0) {
                    try {
                        ((j0) this.d).throwIfReached();
                        b0 k02 = lVar.k0(1);
                        int read2 = ((InputStream) this.c).read(k02.f3560a, k02.c, (int) Math.min(j10, 8192 - k02.c));
                        if (read2 == -1) {
                            if (k02.f3561b == k02.c) {
                                lVar.f3577b = k02.a();
                                c0.a(k02);
                            }
                            return -1L;
                        }
                        k02.c += read2;
                        long j11 = read2;
                        lVar.c += j11;
                        return j11;
                    } catch (AssertionError e6) {
                        if (b.e(e6)) {
                            throw new IOException(e6);
                        }
                        throw e6;
                    }
                }
                i.d(ai.onnxruntime.a.h(j10, "byteCount < 0: "));
                return 0L;
        }
    }

    @Override // l9.g0
    public final j0 timeout() {
        switch (this.f3569b) {
            case 0:
                return (g) this.c;
            default:
                return (j0) this.d;
        }
    }

    public final String toString() {
        switch (this.f3569b) {
            case 0:
                return "AsyncTimeout.source(" + ((g0) this.d) + ')';
            default:
                return "source(" + ((InputStream) this.c) + ')';
        }
    }

    public f(g gVar, g0 g0Var) {
        this.c = gVar;
        this.d = g0Var;
    }
}
