package z5;

import kotlin.UByte;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f extends g {
    public final g c;

    public f(g gVar) {
        super(gVar.f6860a, gVar.f6861b);
        this.c = gVar;
    }

    @Override // z5.g
    public final byte[] a() {
        byte[] a10 = this.c.a();
        int i10 = this.f6860a * this.f6861b;
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) (255 - (a10[i11] & UByte.MAX_VALUE));
        }
        return bArr;
    }

    @Override // z5.g
    public final byte[] b(int i10, byte[] bArr) {
        byte[] b10 = this.c.b(i10, bArr);
        for (int i11 = 0; i11 < this.f6860a; i11++) {
            b10[i11] = (byte) (255 - (b10[i11] & UByte.MAX_VALUE));
        }
        return b10;
    }

    @Override // z5.g
    public final boolean c() {
        return this.c.c();
    }

    @Override // z5.g
    public final g d() {
        return new f(this.c.d());
    }
}
