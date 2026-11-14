package org.apache.commons.net.util;

import java.io.IOException;
import java.security.GeneralSecurityException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class SSLContextUtils {
    private SSLContextUtils() {
    }

    public static SSLContext createSSLContext(String str, KeyManager keyManager, TrustManager trustManager) {
        KeyManager[] keyManagerArr;
        TrustManager[] trustManagerArr = null;
        if (keyManager == null) {
            keyManagerArr = null;
        } else {
            keyManagerArr = new KeyManager[]{keyManager};
        }
        if (trustManager != null) {
            trustManagerArr = new TrustManager[]{trustManager};
        }
        return createSSLContext(str, keyManagerArr, trustManagerArr);
    }

    public static SSLContext createSSLContext(String str, KeyManager[] keyManagerArr, TrustManager[] trustManagerArr) {
        try {
            SSLContext sSLContext = SSLContext.getInstance(str);
            sSLContext.init(keyManagerArr, trustManagerArr, null);
            return sSLContext;
        } catch (GeneralSecurityException e) {
            throw new IOException("Could not initialize SSL context", e);
        }
    }
}
