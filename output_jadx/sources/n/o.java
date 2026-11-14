package n;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayDeque f4028b;

    /* renamed from: a, reason: collision with root package name */
    public Object f4029a;

    static {
        char[] cArr = c0.p.f446a;
        f4028b = new ArrayDeque(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o a(Object obj) {
        o oVar;
        o oVar2;
        ArrayDeque arrayDeque = f4028b;
        synchronized (arrayDeque) {
            oVar = (o) arrayDeque.poll();
            oVar2 = oVar;
        }
        if (oVar == null) {
            oVar2 = new Object();
        }
        oVar2.f4029a = obj;
        return oVar2;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o) && this.f4029a.equals(((o) obj).f4029a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4029a.hashCode();
    }
}
