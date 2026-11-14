package f6;

import j1.i;
import java.util.Arrays;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.commons.io.FilenameUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public int[] f2342b;
    public int c;

    public a(int i10) {
        this.c = i10;
        this.f2342b = new int[(i10 + 31) / 32];
    }

    public final void a(boolean z9) {
        c(this.c + 1);
        if (z9) {
            int[] iArr = this.f2342b;
            int i10 = this.c;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.c++;
    }

    public final void b(int i10, int i11) {
        if (i11 >= 0 && i11 <= 32) {
            c(this.c + i11);
            while (i11 > 0) {
                boolean z9 = true;
                if (((i10 >> (i11 - 1)) & 1) != 1) {
                    z9 = false;
                }
                a(z9);
                i11--;
            }
            return;
        }
        i.k("Num bits must be between 0 and 32");
    }

    public final void c(int i10) {
        int[] iArr = this.f2342b;
        if (i10 > (iArr.length << 5)) {
            int[] iArr2 = new int[(i10 + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f2342b = iArr2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, f6.a] */
    public final Object clone() {
        int[] iArr = (int[]) this.f2342b.clone();
        int i10 = this.c;
        ?? obj = new Object();
        obj.f2342b = iArr;
        obj.c = i10;
        return obj;
    }

    public final boolean d(int i10) {
        if (((1 << (i10 & 31)) & this.f2342b[i10 / 32]) != 0) {
            return true;
        }
        return false;
    }

    public final int e(int i10) {
        int i11 = this.c;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & this.f2342b[i12];
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f2342b;
            if (i12 == iArr.length) {
                return this.c;
            }
            i13 = iArr[i12];
        }
        return Math.min(Integer.numberOfTrailingZeros(i13) + (i12 << 5), this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.c != aVar.c || !Arrays.equals(this.f2342b, aVar.f2342b)) {
            return false;
        }
        return true;
    }

    public final int f(int i10) {
        int i11 = this.c;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & (~this.f2342b[i12]);
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f2342b;
            if (i12 == iArr.length) {
                return this.c;
            }
            i13 = ~iArr[i12];
        }
        return Math.min(Integer.numberOfTrailingZeros(i13) + (i12 << 5), this.c);
    }

    public final int g() {
        return (this.c + 7) / 8;
    }

    public final boolean h(int i10, int i11) {
        int i12;
        if (i11 >= i10 && i10 >= 0 && i11 <= this.c) {
            if (i11 != i10) {
                int i13 = i11 - 1;
                int i14 = i10 / 32;
                int i15 = i13 / 32;
                for (int i16 = i14; i16 <= i15; i16++) {
                    int i17 = 31;
                    if (i16 > i14) {
                        i12 = 0;
                    } else {
                        i12 = i10 & 31;
                    }
                    if (i16 >= i15) {
                        i17 = 31 & i13;
                    }
                    if ((((2 << i17) - (1 << i12)) & this.f2342b[i16]) != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
        l9.i.a();
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2342b) + (this.c * 31);
    }

    public final void i() {
        int[] iArr = new int[this.f2342b.length];
        int i10 = (this.c - 1) / 32;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = this.f2342b[i12];
            long j11 = ((j10 & 1431655765) << 1) | ((j10 >> 1) & 1431655765);
            long j12 = ((j11 & 858993459) << 2) | ((j11 >> 2) & 858993459);
            long j13 = ((j12 & 252645135) << 4) | ((j12 >> 4) & 252645135);
            long j14 = ((j13 & 16711935) << 8) | ((j13 >> 8) & 16711935);
            iArr[i10 - i12] = (int) (((j14 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((j14 >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        }
        int i13 = this.c;
        int i14 = i11 << 5;
        if (i13 != i14) {
            int i15 = i14 - i13;
            int i16 = iArr[0] >>> i15;
            for (int i17 = 1; i17 < i11; i17++) {
                int i18 = iArr[i17];
                iArr[i17 - 1] = i16 | (i18 << (32 - i15));
                i16 = i18 >>> i15;
            }
            iArr[i10] = i16;
        }
        this.f2342b = iArr;
    }

    public final void j(int i10) {
        int[] iArr = this.f2342b;
        int i11 = i10 / 32;
        iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
    }

    public final String toString() {
        char c;
        int i10 = this.c;
        StringBuilder sb = new StringBuilder((i10 / 8) + i10 + 1);
        for (int i11 = 0; i11 < this.c; i11++) {
            if ((i11 & 7) == 0) {
                sb.append(' ');
            }
            if (d(i11)) {
                c = 'X';
            } else {
                c = FilenameUtils.EXTENSION_SEPARATOR;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public a() {
        this.c = 0;
        this.f2342b = new int[1];
    }
}
