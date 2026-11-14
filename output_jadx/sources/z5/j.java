package z5;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j extends g {
    public final byte[] c;
    public final int d;
    public final int e;

    public j(int i10, int i11, int i12, int i13, byte[] bArr) {
        super(i12, i13);
        if (i12 <= i10 && i13 <= i11) {
            this.c = bArr;
            this.d = i10;
            this.e = i11;
            return;
        }
        j1.i.k("Crop rectangle does not fit within image data.");
        throw null;
    }

    @Override // z5.g
    public final byte[] a() {
        byte[] bArr = this.c;
        int i10 = this.f6860a;
        int i11 = this.f6861b;
        int i12 = this.d;
        if (i10 == i12 && i11 == this.e) {
            return bArr;
        }
        int i13 = i10 * i11;
        byte[] bArr2 = new byte[i13];
        if (i10 == i12) {
            System.arraycopy(bArr, 0, bArr2, 0, i13);
            return bArr2;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            System.arraycopy(bArr, i14, bArr2, i15 * i10, i10);
            i14 += i12;
        }
        return bArr2;
    }

    @Override // z5.g
    public final byte[] b(int i10, byte[] bArr) {
        if (i10 >= 0 && i10 < this.f6861b) {
            int i11 = this.f6860a;
            if (bArr == null || bArr.length < i11) {
                bArr = new byte[i11];
            }
            System.arraycopy(this.c, i10 * this.d, bArr, 0, i11);
            return bArr;
        }
        j1.i.k("Requested row is outside the image: ".concat(String.valueOf(i10)));
        return null;
    }
}
