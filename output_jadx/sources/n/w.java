package n;

import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class w implements r {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4040a;

    /* renamed from: b, reason: collision with root package name */
    public final Pools.Pool f4041b;

    public w(ArrayList arrayList, d0.d dVar) {
        this.f4040a = arrayList;
        this.f4041b = dVar;
    }

    @Override // n.r
    public final boolean a(Object obj) {
        ArrayList arrayList = this.f4040a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            if (((r) obj2).a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // n.r
    public final q b(Object obj, int i10, int i11, h.h hVar) {
        q b10;
        ArrayList arrayList = this.f4040a;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        h.e eVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            r rVar = (r) arrayList.get(i12);
            if (rVar.a(obj) && (b10 = rVar.b(obj, i10, i11, hVar)) != null) {
                eVar = b10.f4031a;
                arrayList2.add(b10.c);
            }
        }
        if (arrayList2.isEmpty() || eVar == null) {
            return null;
        }
        return new q(eVar, new v(arrayList2, this.f4041b));
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f4040a.toArray()) + '}';
    }
}
