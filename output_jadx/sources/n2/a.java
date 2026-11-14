package n2;

import a2.b;
import android.util.SparseArray;
import j1.i;
import java.util.HashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f4120a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f4121b;

    static {
        HashMap hashMap = new HashMap();
        f4121b = hashMap;
        hashMap.put(b.f6b, 0);
        hashMap.put(b.c, 1);
        hashMap.put(b.d, 2);
        for (b bVar : hashMap.keySet()) {
            f4120a.append(((Integer) f4121b.get(bVar)).intValue(), bVar);
        }
    }

    public static int a(b bVar) {
        Integer num = (Integer) f4121b.get(bVar);
        if (num != null) {
            return num.intValue();
        }
        ai.onnxruntime.b.q(bVar, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static b b(int i10) {
        b bVar = (b) f4120a.get(i10);
        if (bVar != null) {
            return bVar;
        }
        i.k(ai.onnxruntime.a.e(i10, "Unknown Priority for value "));
        return null;
    }
}
