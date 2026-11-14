package m4;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static /* synthetic */ boolean a(Unsafe unsafe, m mVar, long j10, d dVar, d dVar2) {
        while (!unsafe.compareAndSwapObject(mVar, j10, dVar, dVar2)) {
            if (unsafe.getObject(mVar, j10) != dVar) {
                return false;
            }
        }
        return true;
    }
}
