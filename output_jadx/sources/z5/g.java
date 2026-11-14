package z5;

import kotlin.UByte;
import org.apache.commons.io.FilenameUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f6860a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6861b;

    public g(int i10, int i11) {
        this.f6860a = i10;
        this.f6861b = i11;
    }

    public abstract byte[] a();

    public abstract byte[] b(int i10, byte[] bArr);

    public boolean c() {
        return false;
    }

    public g d() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        char c;
        int i10 = this.f6860a;
        byte[] bArr = new byte[i10];
        int i11 = this.f6861b;
        StringBuilder sb = new StringBuilder((i10 + 1) * i11);
        for (int i12 = 0; i12 < i11; i12++) {
            bArr = b(i12, bArr);
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = bArr[i13] & UByte.MAX_VALUE;
                if (i14 < 64) {
                    c = '#';
                } else if (i14 < 128) {
                    c = '+';
                } else if (i14 < 192) {
                    c = FilenameUtils.EXTENSION_SEPARATOR;
                } else {
                    c = ' ';
                }
                sb.append(c);
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
