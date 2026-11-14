package p7;

import java.util.EnumSet;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;
import n7.m1;
import o7.g2;
import o7.u2;
import o7.w4;
import o7.y0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h extends n7.e {

    /* renamed from: n, reason: collision with root package name */
    public static final q7.c f5046n;

    /* renamed from: o, reason: collision with root package name */
    public static final n.p f5047o;

    /* renamed from: b, reason: collision with root package name */
    public final g2 f5048b;

    /* renamed from: f, reason: collision with root package name */
    public SSLSocketFactory f5049f;
    public final u2 c = w4.e;
    public final n.p d = f5047o;
    public final n.p e = new n.p(5, y0.f4789q);

    /* renamed from: g, reason: collision with root package name */
    public final q7.c f5050g = f5046n;

    /* renamed from: h, reason: collision with root package name */
    public final int f5051h = 1;

    /* renamed from: i, reason: collision with root package name */
    public final long f5052i = Long.MAX_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public final long f5053j = y0.f4784l;

    /* renamed from: k, reason: collision with root package name */
    public final int f5054k = 65535;

    /* renamed from: l, reason: collision with root package name */
    public final int f5055l = 4194304;

    /* renamed from: m, reason: collision with root package name */
    public final int f5056m = Integer.MAX_VALUE;

    static {
        Logger.getLogger(h.class.getName());
        q7.b bVar = new q7.b(q7.c.e);
        bVar.a(q7.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, q7.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, q7.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, q7.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, q7.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, q7.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        bVar.b(q7.m.TLS_1_2);
        if (bVar.f5306a) {
            bVar.d = true;
            f5046n = new q7.c(bVar);
            f5047o = new n.p(5, new z3.f(15));
            EnumSet.of(m1.f4228b, m1.c);
            return;
        }
        j1.i.l("no TLS extensions for cleartext connections");
    }

    public h(String str) {
        this.f5048b = new g2(str, new f(this), new f(this));
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(this.f5048b, "delegate");
        return t.toString();
    }
}
