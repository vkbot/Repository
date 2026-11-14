package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f1535a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f1536b;

    static {
        Charset.forName("US-ASCII");
        f1535a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f1536b = bArr;
        ByteBuffer.wrap(bArr);
        j.d(bArr, 0, 0, false);
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        n0.b.n(str);
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
