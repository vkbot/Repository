package q7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {
    public static final c e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5308a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f5309b;
    public final String[] c;
    public final boolean d;

    static {
        a[] aVarArr = {a.TLS_AES_128_GCM_SHA256, a.TLS_AES_256_GCM_SHA384, a.TLS_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_AES_128_GCM_SHA256, a.TLS_RSA_WITH_AES_256_GCM_SHA384, a.TLS_RSA_WITH_AES_128_CBC_SHA, a.TLS_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        b bVar = new b(true);
        bVar.a(aVarArr);
        m mVar = m.TLS_1_3;
        m mVar2 = m.TLS_1_2;
        bVar.b(mVar, mVar2);
        bVar.d = true;
        c cVar = new c(bVar);
        e = cVar;
        m[] mVarArr = {mVar, mVar2, m.TLS_1_1, m.TLS_1_0};
        boolean z9 = cVar.f5308a;
        if (z9) {
            if (mVarArr.length != 0) {
                String[] strArr = new String[mVarArr.length];
                for (int i10 = 0; i10 < mVarArr.length; i10++) {
                    strArr[i10] = mVarArr[i10].f5336b;
                }
                if (z9) {
                    return;
                }
                j1.i.l("no TLS extensions for cleartext connections");
                return;
            }
            j1.i.k("At least one TlsVersion is required");
            return;
        }
        j1.i.l("no TLS versions for cleartext connections");
    }

    public c(b bVar) {
        this.f5308a = bVar.f5306a;
        this.f5309b = bVar.f5307b;
        this.c = bVar.c;
        this.d = bVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (obj != this) {
                c cVar = (c) obj;
                boolean z9 = cVar.f5308a;
                boolean z10 = this.f5308a;
                if (z10 == z9) {
                    if (z10) {
                        if (!Arrays.equals(this.f5309b, cVar.f5309b) || !Arrays.equals(this.c, cVar.c) || this.d != cVar.d) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f5308a) {
            return ((((527 + Arrays.hashCode(this.f5309b)) * 31) + Arrays.hashCode(this.c)) * 31) + (!this.d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List unmodifiableList;
        a valueOf;
        String obj;
        m mVar;
        if (this.f5308a) {
            String[] strArr = this.f5309b;
            if (strArr == null) {
                unmodifiableList = null;
            } else {
                a[] aVarArr = new a[strArr.length];
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    String str = strArr[i10];
                    if (str.startsWith("SSL_")) {
                        valueOf = a.valueOf("TLS_".concat(str.substring(4)));
                    } else {
                        valueOf = a.valueOf(str);
                    }
                    aVarArr[i10] = valueOf;
                }
                String[] strArr2 = n.f5337a;
                unmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) aVarArr.clone()));
            }
            if (unmodifiableList == null) {
                obj = "[use default]";
            } else {
                obj = unmodifiableList.toString();
            }
            StringBuilder x9 = ai.onnxruntime.a.x("ConnectionSpec(cipherSuites=", obj, ", tlsVersions=");
            String[] strArr3 = this.c;
            m[] mVarArr = new m[strArr3.length];
            for (int i11 = 0; i11 < strArr3.length; i11++) {
                String str2 = strArr3[i11];
                if ("TLSv1.3".equals(str2)) {
                    mVar = m.TLS_1_3;
                } else if ("TLSv1.2".equals(str2)) {
                    mVar = m.TLS_1_2;
                } else if ("TLSv1.1".equals(str2)) {
                    mVar = m.TLS_1_1;
                } else if ("TLSv1".equals(str2)) {
                    mVar = m.TLS_1_0;
                } else if ("SSLv3".equals(str2)) {
                    mVar = m.SSL_3_0;
                } else {
                    j1.i.k(ai.onnxruntime.a.l("Unexpected TLS version: ", str2));
                    return null;
                }
                mVarArr[i11] = mVar;
            }
            String[] strArr4 = n.f5337a;
            x9.append(Collections.unmodifiableList(Arrays.asList((Object[]) mVarArr.clone())));
            x9.append(", supportsTlsExtensions=");
            x9.append(this.d);
            x9.append(")");
            return x9.toString();
        }
        return "ConnectionSpec()";
    }
}
