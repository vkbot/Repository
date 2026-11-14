package o7;

import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class v4 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f4756a = Logger.getLogger(v4.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f4757b = "-bin".getBytes(i4.b.f2770a);

    public static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i10 = length; i10 < bArr.length; i10++) {
            if (bArr[i10] != bArr2[i10 - length]) {
                return false;
            }
        }
        return true;
    }
}
