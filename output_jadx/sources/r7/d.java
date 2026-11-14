package r7;

import java.util.Arrays;
import l9.l;
import l9.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final l f5425a;
    public int c;
    public int e;

    /* renamed from: b, reason: collision with root package name */
    public b[] f5426b = new b[8];
    public int d = 7;

    public d(l lVar) {
        this.f5425a = lVar;
    }

    public final void a(b bVar) {
        int i10;
        int i11 = bVar.c;
        if (i11 > 4096) {
            Arrays.fill(this.f5426b, (Object) null);
            this.d = this.f5426b.length - 1;
            this.c = 0;
            this.e = 0;
            return;
        }
        int i12 = (this.e + i11) - 4096;
        if (i12 > 0) {
            int length = this.f5426b.length - 1;
            int i13 = 0;
            while (true) {
                i10 = this.d;
                if (length < i10 || i12 <= 0) {
                    break;
                }
                int i14 = this.f5426b[length].c;
                i12 -= i14;
                this.e -= i14;
                this.c--;
                i13++;
                length--;
            }
            b[] bVarArr = this.f5426b;
            int i15 = i10 + 1;
            System.arraycopy(bVarArr, i15, bVarArr, i15 + i13, this.c);
            this.d += i13;
        }
        int i16 = this.c + 1;
        b[] bVarArr2 = this.f5426b;
        if (i16 > bVarArr2.length) {
            b[] bVarArr3 = new b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.d = this.f5426b.length - 1;
            this.f5426b = bVarArr3;
        }
        int i17 = this.d;
        this.d = i17 - 1;
        this.f5426b[i17] = bVar;
        this.c++;
        this.e += i11;
    }

    public final void b(o oVar) {
        c(oVar.c(), 127, 0);
        this.f5425a.l0(oVar);
    }

    public final void c(int i10, int i11, int i12) {
        l lVar = this.f5425a;
        if (i10 < i11) {
            lVar.m0(i10 | i12);
            return;
        }
        lVar.m0(i12 | i11);
        int i13 = i10 - i11;
        while (i13 >= 128) {
            lVar.m0(128 | (i13 & 127));
            i13 >>>= 7;
        }
        lVar.m0(i13);
    }
}
