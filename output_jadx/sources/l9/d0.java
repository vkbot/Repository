package l9;

import java.security.MessageDigest;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class d0 extends o {

    /* renamed from: f, reason: collision with root package name */
    public final transient byte[][] f3566f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int[] f3567g;

    public d0(byte[][] bArr, int[] iArr) {
        super(o.e.f3578b);
        this.f3566f = bArr;
        this.f3567g = iArr;
    }

    @Override // l9.o
    public final String a() {
        return new o(k()).a();
    }

    @Override // l9.o
    public final o b(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f3566f;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f3567g;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            messageDigest.update(bArr[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new o(digest);
    }

    @Override // l9.o
    public final int c() {
        return this.f3567g[this.f3566f.length - 1];
    }

    @Override // l9.o
    public final String d() {
        return new o(k()).d();
    }

    @Override // l9.o
    public final byte[] e() {
        return k();
    }

    @Override // l9.o
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof o) {
                o oVar = (o) obj;
                if (oVar.c() == c() && i(oVar, c())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // l9.o
    public final byte f(int i10) {
        int i11;
        byte[][] bArr = this.f3566f;
        int length = bArr.length - 1;
        int[] iArr = this.f3567g;
        b.d(iArr[length], i10, 1L);
        int a10 = m9.c.a(this, i10);
        if (a10 == 0) {
            i11 = 0;
        } else {
            i11 = iArr[a10 - 1];
        }
        return bArr[a10][(i10 - i11) + iArr[bArr.length + a10]];
    }

    @Override // l9.o
    public final boolean h(int i10, int i11, int i12, byte[] bArr) {
        int i13;
        bArr.getClass();
        if (i10 >= 0 && i10 <= c() - i12 && i11 >= 0 && i11 <= bArr.length - i12) {
            int i14 = i12 + i10;
            int a10 = m9.c.a(this, i10);
            while (i10 < i14) {
                int[] iArr = this.f3567g;
                if (a10 == 0) {
                    i13 = 0;
                } else {
                    i13 = iArr[a10 - 1];
                }
                int i15 = iArr[a10] - i13;
                byte[][] bArr2 = this.f3566f;
                int i16 = iArr[bArr2.length + a10];
                int min = Math.min(i14, i15 + i13) - i10;
                int i17 = (i10 - i13) + i16;
                byte[] bArr3 = bArr2[a10];
                bArr3.getClass();
                for (int i18 = 0; i18 < min; i18++) {
                    if (bArr3[i18 + i17] == bArr[i18 + i11]) {
                    }
                }
                i11 += min;
                i10 += min;
                a10++;
            }
            return true;
        }
        return false;
    }

    @Override // l9.o
    public final int hashCode() {
        int i10 = this.c;
        if (i10 != 0) {
            return i10;
        }
        byte[][] bArr = this.f3566f;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            int[] iArr = this.f3567g;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            byte[] bArr2 = bArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr2[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.c = i12;
        return i12;
    }

    @Override // l9.o
    public final boolean i(o oVar, int i10) {
        int i11;
        oVar.getClass();
        if (c() - i10 >= 0) {
            int a10 = m9.c.a(this, 0);
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                int[] iArr = this.f3567g;
                if (a10 == 0) {
                    i11 = 0;
                } else {
                    i11 = iArr[a10 - 1];
                }
                int i14 = iArr[a10] - i11;
                byte[][] bArr = this.f3566f;
                int i15 = iArr[bArr.length + a10];
                int min = Math.min(i10, i14 + i11) - i12;
                if (oVar.h(i13, (i12 - i11) + i15, min, bArr[a10])) {
                    i13 += min;
                    i12 += min;
                    a10++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // l9.o
    public final o j() {
        return new o(k()).j();
    }

    @Override // l9.o
    public final byte[] k() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.f3566f;
        int length = bArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f3567g;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            ArraysKt.copyInto(bArr2[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // l9.o
    public final void m(int i10, l lVar) {
        int i11;
        int a10 = m9.c.a(this, 0);
        int i12 = 0;
        while (i12 < i10) {
            int[] iArr = this.f3567g;
            if (a10 == 0) {
                i11 = 0;
            } else {
                i11 = iArr[a10 - 1];
            }
            int i13 = iArr[a10] - i11;
            byte[][] bArr = this.f3566f;
            int i14 = iArr[bArr.length + a10];
            int min = Math.min(i10, i13 + i11) - i12;
            int i15 = (i12 - i11) + i14;
            b0 b0Var = new b0(bArr[a10], i15, i15 + min, true, false);
            b0 b0Var2 = lVar.f3577b;
            if (b0Var2 == null) {
                b0Var.f3563g = b0Var;
                b0Var.f3562f = b0Var;
                lVar.f3577b = b0Var;
            } else {
                b0 b0Var3 = b0Var2.f3563g;
                b0Var3.getClass();
                b0Var3.b(b0Var);
            }
            i12 += min;
            a10++;
        }
        lVar.c += i10;
    }

    @Override // l9.o
    public final String toString() {
        return new o(k()).toString();
    }
}
