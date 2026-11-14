package h6;

import l9.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f2599a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2600b;

    public b(a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f2599a = aVar;
            int length = iArr.length;
            int i10 = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i10 < length && iArr[i10] == 0) {
                    i10++;
                }
                if (i10 == length) {
                    this.f2600b = new int[]{0};
                    return;
                }
                int i11 = length - i10;
                int[] iArr2 = new int[i11];
                this.f2600b = iArr2;
                System.arraycopy(iArr, i10, iArr2, 0, i11);
                return;
            }
            this.f2600b = iArr;
            return;
        }
        i.a();
        throw null;
    }

    public final b a(b bVar) {
        a aVar = bVar.f2599a;
        a aVar2 = this.f2599a;
        if (aVar2.equals(aVar)) {
            if (e()) {
                return bVar;
            }
            if (bVar.e()) {
                return this;
            }
            int[] iArr = bVar.f2600b;
            int[] iArr2 = this.f2600b;
            if (iArr2.length > iArr.length) {
                iArr2 = iArr;
                iArr = iArr2;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i10 = length; i10 < iArr.length; i10++) {
                iArr3[i10] = iArr2[i10 - length] ^ iArr[i10];
            }
            return new b(aVar2, iArr3);
        }
        j1.i.k("GenericGFPolys do not have same GenericGF field");
        return null;
    }

    public final int b(int i10) {
        if (i10 == 0) {
            return c(0);
        }
        int[] iArr = this.f2600b;
        if (i10 == 1) {
            int i11 = 0;
            for (int i12 : iArr) {
                a aVar = a.f2587h;
                i11 ^= i12;
            }
            return i11;
        }
        int i13 = iArr[0];
        int length = iArr.length;
        for (int i14 = 1; i14 < length; i14++) {
            i13 = this.f2599a.c(i10, i13) ^ iArr[i14];
        }
        return i13;
    }

    public final int c(int i10) {
        return this.f2600b[(r0.length - 1) - i10];
    }

    public final int d() {
        return this.f2600b.length - 1;
    }

    public final boolean e() {
        if (this.f2600b[0] != 0) {
            return false;
        }
        return true;
    }

    public final b f(int i10) {
        a aVar = this.f2599a;
        if (i10 == 0) {
            return aVar.c;
        }
        if (i10 == 1) {
            return this;
        }
        int[] iArr = this.f2600b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr2[i11] = aVar.c(iArr[i11], i10);
        }
        return new b(aVar, iArr2);
    }

    public final b g(b bVar) {
        a aVar = bVar.f2599a;
        a aVar2 = this.f2599a;
        if (aVar2.equals(aVar)) {
            if (!e() && !bVar.e()) {
                int[] iArr = this.f2600b;
                int length = iArr.length;
                int[] iArr2 = bVar.f2600b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = iArr[i10];
                    for (int i12 = 0; i12 < length2; i12++) {
                        int i13 = i10 + i12;
                        iArr3[i13] = iArr3[i13] ^ aVar2.c(i11, iArr2[i12]);
                    }
                }
                return new b(aVar2, iArr3);
            }
            return aVar2.c;
        }
        j1.i.k("GenericGFPolys do not have same GenericGF field");
        return null;
    }

    public final b h(int i10, int i11) {
        if (i10 >= 0) {
            a aVar = this.f2599a;
            if (i11 == 0) {
                return aVar.c;
            }
            int[] iArr = this.f2600b;
            int length = iArr.length;
            int[] iArr2 = new int[i10 + length];
            for (int i12 = 0; i12 < length; i12++) {
                iArr2[i12] = aVar.c(iArr[i12], i11);
            }
            return new b(aVar, iArr2);
        }
        i.a();
        return null;
    }

    public final String toString() {
        if (e()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(d() * 8);
        for (int d = d(); d >= 0; d--) {
            int c = c(d);
            if (c != 0) {
                if (c < 0) {
                    if (d == d()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (d == 0 || c != 1) {
                    a aVar = this.f2599a;
                    if (c != 0) {
                        int i10 = aVar.f2596b[c];
                        if (i10 == 0) {
                            sb.append('1');
                        } else if (i10 == 1) {
                            sb.append('a');
                        } else {
                            sb.append("a^");
                            sb.append(i10);
                        }
                    } else {
                        aVar.getClass();
                        i.a();
                        return null;
                    }
                }
                if (d != 0) {
                    if (d == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(d);
                    }
                }
            }
        }
        return sb.toString();
    }
}
