package m9;

import l9.d0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class c {
    public static final int a(d0 d0Var, int i10) {
        int i11;
        int[] iArr = d0Var.f3567g;
        int i12 = i10 + 1;
        int length = d0Var.f3566f.length;
        iArr.getClass();
        int i13 = length - 1;
        int i14 = 0;
        while (true) {
            if (i14 <= i13) {
                i11 = (i14 + i13) >>> 1;
                int i15 = iArr[i11];
                if (i15 < i12) {
                    i14 = i11 + 1;
                } else {
                    if (i15 <= i12) {
                        break;
                    }
                    i13 = i11 - 1;
                }
            } else {
                i11 = (-i14) - 1;
                break;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        return ~i11;
    }
}
