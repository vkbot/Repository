package f6;

import j1.i;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public final int f2343b;
    public final int c;
    public final int d;
    public final int[] e;

    public b(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            this.f2343b = i10;
            this.c = i11;
            int i12 = (i10 + 31) / 32;
            this.d = i12;
            this.e = new int[i12 * i11];
            return;
        }
        i.k("Both dimensions must be greater than 0");
        throw null;
    }

    public final void a(int i10, int i11) {
        int i12 = (i10 / 32) + (i11 * this.d);
        int[] iArr = this.e;
        iArr[i12] = (1 << (i10 & 31)) ^ iArr[i12];
    }

    public final boolean b(int i10, int i11) {
        if (((this.e[(i10 / 32) + (i11 * this.d)] >>> (i10 & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int[] c() {
        int[] iArr = this.e;
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i10 = this.d;
        int i11 = length / i10;
        int i12 = (length % i10) << 5;
        int i13 = iArr[length];
        int i14 = 31;
        while ((i13 >>> i14) == 0) {
            i14--;
        }
        return new int[]{i12 + i14, i11};
    }

    public final Object clone() {
        return new b(this.f2343b, this.c, this.d, (int[]) this.e.clone());
    }

    public final a d(a aVar, int i10) {
        int i11 = aVar.c;
        int i12 = this.f2343b;
        if (i11 < i12) {
            aVar = new a(i12);
        } else {
            int length = aVar.f2342b.length;
            for (int i13 = 0; i13 < length; i13++) {
                aVar.f2342b[i13] = 0;
            }
        }
        int i14 = this.d;
        int i15 = i10 * i14;
        for (int i16 = 0; i16 < i14; i16++) {
            aVar.f2342b[(i16 << 5) / 32] = this.e[i15 + i16];
        }
        return aVar;
    }

    public final int[] e() {
        int[] iArr;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            iArr = this.e;
            if (i11 >= iArr.length || iArr[i11] != 0) {
                break;
            }
            i11++;
        }
        if (i11 == iArr.length) {
            return null;
        }
        int i12 = this.d;
        int i13 = i11 / i12;
        int i14 = (i11 % i12) << 5;
        while ((iArr[i11] << (31 - i10)) == 0) {
            i10++;
        }
        return new int[]{i14 + i10, i13};
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f2343b == bVar.f2343b && this.c == bVar.c && this.d == bVar.d && Arrays.equals(this.e, bVar.e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(int i10, int i11) {
        int i12 = (i10 / 32) + (i11 * this.d);
        int[] iArr = this.e;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public final void g(int i10, int i11, int i12, int i13) {
        if (i11 >= 0 && i10 >= 0) {
            if (i13 > 0 && i12 > 0) {
                int i14 = i12 + i10;
                int i15 = i13 + i11;
                if (i15 <= this.c && i14 <= this.f2343b) {
                    while (i11 < i15) {
                        int i16 = this.d * i11;
                        for (int i17 = i10; i17 < i14; i17++) {
                            int i18 = (i17 / 32) + i16;
                            int[] iArr = this.e;
                            iArr[i18] = iArr[i18] | (1 << (i17 & 31));
                        }
                        i11++;
                    }
                    return;
                }
                i.k("The region must fit inside the matrix");
                return;
            }
            i.k("Height and width must be at least 1");
            return;
        }
        i.k("Left and top must be nonnegative");
    }

    public final int hashCode() {
        int i10 = this.f2343b;
        return Arrays.hashCode(this.e) + (((((((i10 * 31) + i10) * 31) + this.c) * 31) + this.d) * 31);
    }

    public final String toString() {
        String str;
        int i10 = this.f2343b;
        int i11 = this.c;
        StringBuilder sb = new StringBuilder((i10 + 1) * i11);
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i10; i13++) {
                if (b(i13, i12)) {
                    str = "X ";
                } else {
                    str = "  ";
                }
                sb.append(str);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public b(int i10, int i11, int i12, int[] iArr) {
        this.f2343b = i10;
        this.c = i11;
        this.d = i12;
        this.e = iArr;
    }
}
