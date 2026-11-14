package i9;

import androidx.navigation.serialization.RouteDecoder;
import java.util.Iterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class a implements e9.b {
    @Override // e9.a
    public Object c(RouteDecoder routeDecoder) {
        return i(routeDecoder);
    }

    public abstract Object d();

    public abstract int e(Object obj);

    public abstract void f(int i10, Object obj);

    public abstract Iterator g(Object obj);

    public abstract int h(Object obj);

    public final Object i(RouteDecoder routeDecoder) {
        Object d = d();
        int e = e(d);
        h9.c beginStructure = routeDecoder.beginStructure(a());
        if (!beginStructure.decodeSequentially()) {
            while (true) {
                int decodeElementIndex = beginStructure.decodeElementIndex(a());
                if (decodeElementIndex == -1) {
                    break;
                }
                k(beginStructure, decodeElementIndex + e, d);
            }
        } else {
            int decodeCollectionSize = beginStructure.decodeCollectionSize(a());
            f(decodeCollectionSize, d);
            j(beginStructure, d, e, decodeCollectionSize);
        }
        beginStructure.endStructure(a());
        return m(d);
    }

    public abstract void j(h9.c cVar, Object obj, int i10, int i11);

    public abstract void k(h9.c cVar, int i10, Object obj);

    public abstract Object l(Object obj);

    public abstract Object m(Object obj);
}
