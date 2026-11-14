package q7;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g extends k {
    public final a5.h e;

    /* renamed from: f, reason: collision with root package name */
    public final a5.h f5317f;

    /* renamed from: g, reason: collision with root package name */
    public final a5.h f5318g;

    /* renamed from: h, reason: collision with root package name */
    public final a5.h f5319h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5320i;

    public g(a5.h hVar, a5.h hVar2, a5.h hVar3, a5.h hVar4, Provider provider, int i10) {
        super(provider);
        this.e = hVar;
        this.f5317f = hVar2;
        this.f5318g = hVar3;
        this.f5319h = hVar4;
        this.f5320i = i10;
    }

    @Override // q7.k
    public final void c(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.e.q(sSLSocket, Boolean.TRUE);
            this.f5317f.q(sSLSocket, str);
        }
        Class<?> cls = sSLSocket.getClass();
        a5.h hVar = this.f5319h;
        if (hVar.n(cls) != null) {
            hVar.r(sSLSocket, k.b(list));
        }
    }

    @Override // q7.k
    public final String d(SSLSocket sSLSocket) {
        byte[] bArr;
        Class<?> cls = sSLSocket.getClass();
        a5.h hVar = this.f5318g;
        if (hVar.n(cls) == null || (bArr = (byte[]) hVar.r(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, n.f5338b);
    }

    @Override // q7.k
    public final int e() {
        return this.f5320i;
    }
}
