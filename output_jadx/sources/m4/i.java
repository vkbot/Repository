package m4;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* synthetic */ boolean a(Unsafe unsafe, m mVar, long j10, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(mVar, j10, obj, obj2)) {
            if (unsafe.getObject(mVar, j10) != obj) {
                return false;
            }
        }
        return true;
    }
}
