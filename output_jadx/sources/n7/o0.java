package n7;

import java.util.Comparator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        n0 n0Var = (n0) obj2;
        ((p7.i) ((n0) obj)).getClass();
        int i11 = 3;
        try {
            Class.forName("android.app.Application", false, p7.i.class.getClassLoader());
            i10 = 8;
        } catch (Exception unused) {
            i10 = 3;
        }
        ((p7.i) n0Var).getClass();
        try {
            Class.forName("android.app.Application", false, p7.i.class.getClassLoader());
            i11 = 8;
        } catch (Exception unused2) {
        }
        return i10 - i11;
    }
}
