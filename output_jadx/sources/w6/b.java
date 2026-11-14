package w6;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f6395a = {2, 1, 4, 3};

    public static boolean a(int i10, int i11, int i12) {
        switch (i10) {
            case 1:
                if (((i11 + i12) & 1) == 0) {
                    return true;
                }
                return false;
            case 2:
                if ((i11 & 1) == 0) {
                    return true;
                }
                return false;
            case 3:
                if (i12 % 3 == 0) {
                    return true;
                }
                return false;
            case 4:
                if ((i11 + i12) % 3 == 0) {
                    return true;
                }
                return false;
            case 5:
                if ((((i12 / 3) + (i11 / 2)) & 1) == 0) {
                    return true;
                }
                return false;
            case 6:
                if ((i11 * i12) % 6 == 0) {
                    return true;
                }
                return false;
            case 7:
                if ((i11 * i12) % 6 < 3) {
                    return true;
                }
                return false;
            default:
                if (((((i11 * i12) % 3) + i11 + i12) & 1) == 0) {
                    return true;
                }
                return false;
        }
    }
}
