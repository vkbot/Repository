package b7;

import kotlin.UByte;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public int f421a;

    /* renamed from: b, reason: collision with root package name */
    public int f422b;
    public final byte[] c;

    public /* synthetic */ s(byte[] bArr, int i10, int i11) {
        this.c = bArr;
        this.f421a = i10;
        this.f422b = i11;
    }

    public int a() {
        return ((this.c.length - this.f421a) * 8) - this.f422b;
    }

    public int b(int i10) {
        if (i10 > 0 && i10 <= 32 && i10 <= a()) {
            int i11 = this.f422b;
            int i12 = 0;
            byte[] bArr = this.c;
            if (i11 > 0) {
                int i13 = 8 - i11;
                int min = Math.min(i10, i13);
                int i14 = i13 - min;
                int i15 = this.f421a;
                int i16 = (((255 >> (8 - min)) << i14) & bArr[i15]) >> i14;
                i10 -= min;
                int i17 = this.f422b + min;
                this.f422b = i17;
                if (i17 == 8) {
                    this.f422b = 0;
                    this.f421a = i15 + 1;
                }
                i12 = i16;
            }
            if (i10 > 0) {
                while (i10 >= 8) {
                    int i18 = i12 << 8;
                    int i19 = this.f421a;
                    int i20 = i18 | (bArr[i19] & UByte.MAX_VALUE);
                    this.f421a = i19 + 1;
                    i10 -= 8;
                    i12 = i20;
                }
                if (i10 > 0) {
                    int i21 = 8 - i10;
                    int i22 = ((bArr[this.f421a] & ((255 >> i21) << i21)) >> i21) | (i12 << i10);
                    this.f422b += i10;
                    return i22;
                }
            }
            return i12;
        }
        j1.i.k(String.valueOf(i10));
        return 0;
    }

    public s(byte[] bArr) {
        this.c = bArr;
    }
}
