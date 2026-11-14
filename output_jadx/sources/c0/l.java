package c0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f440a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public final long f441b;
    public long c;

    public l(long j10) {
        this.f441b = j10;
    }

    public final synchronized Object a(Object obj) {
        Object obj2;
        k kVar = (k) this.f440a.get(obj);
        if (kVar != null) {
            obj2 = kVar.f438a;
        } else {
            obj2 = null;
        }
        return obj2;
    }

    public int b(Object obj) {
        return 1;
    }

    public final synchronized Object d(Object obj, Object obj2) {
        k kVar;
        int b10 = b(obj2);
        long j10 = b10;
        Object obj3 = null;
        if (j10 >= this.f441b) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.c += j10;
        }
        LinkedHashMap linkedHashMap = this.f440a;
        if (obj2 == null) {
            kVar = null;
        } else {
            kVar = new k(b10, obj2);
        }
        k kVar2 = (k) linkedHashMap.put(obj, kVar);
        if (kVar2 != null) {
            this.c -= kVar2.f439b;
            if (!kVar2.f438a.equals(obj2)) {
                c(obj, kVar2.f438a);
            }
        }
        e(this.f441b);
        if (kVar2 != null) {
            obj3 = kVar2.f438a;
        }
        return obj3;
    }

    public final synchronized void e(long j10) {
        while (this.c > j10) {
            Iterator it = this.f440a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            k kVar = (k) entry.getValue();
            this.c -= kVar.f439b;
            Object key = entry.getKey();
            it.remove();
            c(key, kVar.f438a);
        }
    }

    public void c(Object obj, Object obj2) {
    }
}
