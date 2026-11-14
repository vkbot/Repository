package n7;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class u extends SocketAddress {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f4245f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final SocketAddress f4246b;
    public final InetSocketAddress c;
    public final String d;
    public final String e;

    public u(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        o4.b.i(inetSocketAddress, "proxyAddress");
        o4.b.i(inetSocketAddress2, "targetAddress");
        o4.b.l("The proxy address %s is not resolved", !inetSocketAddress.isUnresolved(), inetSocketAddress);
        this.f4246b = inetSocketAddress;
        this.c = inetSocketAddress2;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (!com.bumptech.glide.d.f(this.f4246b, uVar.f4246b) || !com.bumptech.glide.d.f(this.c, uVar.c) || !com.bumptech.glide.d.f(this.d, uVar.d) || !com.bumptech.glide.d.f(this.e, uVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4246b, this.c, this.d, this.e});
    }

    public final String toString() {
        boolean z9;
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(this.f4246b, "proxyAddr");
        t.c(this.c, "targetAddr");
        t.c(this.d, "username");
        if (this.e != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        t.d("hasPassword", z9);
        return t.toString();
    }
}
