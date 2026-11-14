package t4;

import f5.b0;
import java.util.Set;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public interface b {
    n a(p pVar);

    default Object b(Class cls) {
        return h(p.a(cls));
    }

    default k5.b c(Class cls) {
        return g(p.a(cls));
    }

    default n d() {
        return a(p.a(b0.class));
    }

    default Set e(p pVar) {
        return (Set) f(pVar).get();
    }

    k5.b f(p pVar);

    k5.b g(p pVar);

    default Object h(p pVar) {
        k5.b g10 = g(pVar);
        if (g10 == null) {
            return null;
        }
        return g10.get();
    }
}
