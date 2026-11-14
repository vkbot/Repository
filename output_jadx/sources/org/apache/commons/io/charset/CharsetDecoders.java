package org.apache.commons.io.charset;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class CharsetDecoders {
    private CharsetDecoders() {
    }

    public static CharsetDecoder toCharsetDecoder(CharsetDecoder charsetDecoder) {
        if (charsetDecoder != null) {
            return charsetDecoder;
        }
        return Charset.defaultCharset().newDecoder();
    }
}
