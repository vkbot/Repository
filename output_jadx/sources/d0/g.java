package d0;

import androidx.core.util.Pools;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final w7.c f1712a = new w7.c(3);

    public static d a(int i10, c cVar) {
        return new d(new Pools.SynchronizedPool(i10), cVar, f1712a);
    }
}
