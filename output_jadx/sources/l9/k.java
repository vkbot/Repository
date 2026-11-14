package l9;

import java.io.InputStream;
import kotlin.UByte;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class k extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3576b;
    public final /* synthetic */ n c;

    public /* synthetic */ k(n nVar, int i10) {
        this.f3576b = i10;
        this.c = nVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.f3576b) {
            case 0:
                return (int) Math.min(((l) this.c).c, Integer.MAX_VALUE);
            default:
                a0 a0Var = (a0) this.c;
                if (!a0Var.d) {
                    return (int) Math.min(a0Var.c.c, Integer.MAX_VALUE);
                }
                n0.b.A("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3576b) {
            case 0:
                return;
            default:
                ((a0) this.c).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f3576b) {
            case 0:
                l lVar = (l) this.c;
                if (lVar.c > 0) {
                    return lVar.readByte() & UByte.MAX_VALUE;
                }
                return -1;
            default:
                a0 a0Var = (a0) this.c;
                l lVar2 = a0Var.c;
                if (!a0Var.d) {
                    if (lVar2.c == 0 && a0Var.f3558b.read(lVar2, 8192L) == -1) {
                        return -1;
                    }
                    return lVar2.readByte() & UByte.MAX_VALUE;
                }
                n0.b.A("closed");
                return 0;
        }
    }

    public final String toString() {
        switch (this.f3576b) {
            case 0:
                return ((l) this.c) + ".inputStream()";
            default:
                return ((a0) this.c) + ".inputStream()";
        }
    }

    private final void b() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f3576b;
        bArr.getClass();
        switch (i12) {
            case 0:
                return ((l) this.c).read(bArr, i10, i11);
            default:
                a0 a0Var = (a0) this.c;
                l lVar = a0Var.c;
                if (!a0Var.d) {
                    b.d(bArr.length, i10, i11);
                    if (lVar.c == 0 && a0Var.f3558b.read(lVar, 8192L) == -1) {
                        return -1;
                    }
                    return lVar.read(bArr, i10, i11);
                }
                n0.b.A("closed");
                return 0;
        }
    }
}
