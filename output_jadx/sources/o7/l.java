package o7;

import java.net.SocketAddress;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l implements z {

    /* renamed from: b, reason: collision with root package name */
    public final p7.g f4597b;

    public l(p7.g gVar, x1 x1Var) {
        this.f4597b = gVar;
    }

    @Override // o7.z
    public final c0 I(SocketAddress socketAddress, y yVar, j1 j1Var) {
        return new k(this, this.f4597b.I(socketAddress, yVar, j1Var), yVar.f4774a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4597b.close();
    }
}
