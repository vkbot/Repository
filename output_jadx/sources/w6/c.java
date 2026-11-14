package w6;

import com.bumptech.glide.g;
import l9.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {
    public static final int[][] c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a, reason: collision with root package name */
    public final int f6396a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f6397b;

    public c(int i10) {
        int i11 = (i10 >> 3) & 3;
        if (i11 >= 0 && i11 < 4) {
            this.f6396a = b.f6395a[i11];
            this.f6397b = (byte) (i10 & 7);
        } else {
            i.a();
            throw null;
        }
    }

    public static c a(int i10, int i11) {
        int bitCount;
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        for (int i14 = 0; i14 < 32; i14++) {
            int[] iArr = c[i14];
            int i15 = iArr[0];
            if (i15 != i10 && i15 != i11) {
                int bitCount2 = Integer.bitCount(i10 ^ i15);
                if (bitCount2 < i12) {
                    i13 = iArr[1];
                    i12 = bitCount2;
                }
                if (i10 != i11 && (bitCount = Integer.bitCount(i15 ^ i11)) < i12) {
                    i13 = iArr[1];
                    i12 = bitCount;
                }
            } else {
                return new c(iArr[1]);
            }
        }
        if (i12 <= 3) {
            return new c(i13);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f6396a == cVar.f6396a && this.f6397b == cVar.f6397b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (g.c(this.f6396a) << 3) | this.f6397b;
    }
}
