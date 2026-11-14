package j;

import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Pools.Pool f2973a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2974b;
    public final String c;

    public b0(Class cls, Class cls2, Class cls3, List list, Pools.Pool pool) {
        this.f2973a = pool;
        if (!list.isEmpty()) {
            this.f2974b = list;
            this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
            return;
        }
        j1.i.k("Must not be empty.");
        throw null;
    }

    public final d0 a(int i10, int i11, com.bumptech.glide.load.data.g gVar, h.h hVar, i iVar) {
        Pools.Pool pool = this.f2973a;
        Object acquire = pool.acquire();
        c0.g.c(acquire, "Argument must not be null");
        List list = (List) acquire;
        try {
            List list2 = this.f2974b;
            int size = list2.size();
            d0 d0Var = null;
            for (int i12 = 0; i12 < size; i12++) {
                try {
                    d0Var = ((l) list2.get(i12)).a(i10, i11, gVar, hVar, iVar);
                } catch (z e) {
                    list.add(e);
                }
                if (d0Var != null) {
                    break;
                }
            }
            if (d0Var != null) {
                return d0Var;
            }
            throw new z(this.c, new ArrayList(list));
        } finally {
            pool.release(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f2974b.toArray()) + '}';
    }
}
