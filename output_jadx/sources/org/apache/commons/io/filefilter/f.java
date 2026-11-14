package org.apache.commons.io.filefilter;

import java.nio.file.PathMatcher;
import java.time.Duration;
import java.time.Instant;
import java.util.Base64;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class f {
    public static /* bridge */ /* synthetic */ String d(Base64.Encoder encoder, byte[] bArr) {
        return encoder.encodeToString(bArr);
    }

    public static /* bridge */ /* synthetic */ PathMatcher f(Object obj) {
        return (PathMatcher) obj;
    }

    public static /* bridge */ /* synthetic */ Duration j(Object obj) {
        return (Duration) obj;
    }

    public static /* bridge */ /* synthetic */ Instant m(Object obj) {
        return (Instant) obj;
    }

    public static /* bridge */ /* synthetic */ Base64.Decoder p() {
        return Base64.getDecoder();
    }

    public static /* bridge */ /* synthetic */ Base64.Encoder q() {
        return Base64.getEncoder();
    }

    public static /* bridge */ /* synthetic */ byte[] u(Base64.Decoder decoder, String str) {
        return decoder.decode(str);
    }
}
