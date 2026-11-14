package m4;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class g {
    public static /* synthetic */ boolean a(Unsafe unsafe, m mVar, long j10, l lVar, l lVar2) {
        while (!unsafe.compareAndSwapObject(mVar, j10, lVar, lVar2)) {
            if (unsafe.getObject(mVar, j10) != lVar) {
                return false;
            }
        }
        return true;
    }
}
