package s6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5715a = new HashMap();

    public final int[] a() {
        ArrayList arrayList = new ArrayList();
        int i10 = -1;
        for (Map.Entry entry : this.f5715a.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > i10) {
                i10 = ((Integer) entry.getValue()).intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (((Integer) entry.getValue()).intValue() == i10) {
                arrayList.add(entry.getKey());
            }
        }
        return r6.a.a(arrayList);
    }

    public final void b(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.f5715a;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            num = 0;
        }
        hashMap.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() + 1));
    }
}
