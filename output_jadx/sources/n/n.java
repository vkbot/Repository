package n;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n extends c0.l {
    @Override // c0.l
    public final void c(Object obj, Object obj2) {
        o oVar = (o) obj;
        oVar.getClass();
        ArrayDeque arrayDeque = o.f4028b;
        synchronized (arrayDeque) {
            arrayDeque.offer(oVar);
        }
    }
}
