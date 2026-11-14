package t4;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import s1.x0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e implements b, w4.a {

    /* renamed from: h, reason: collision with root package name */
    public static final d f5800h = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5801a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5802b;
    public final HashMap c;
    public final HashSet d;
    public final j e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f5803f;

    /* renamed from: g, reason: collision with root package name */
    public final w7.c f5804g;

    public e(ArrayList arrayList, ArrayList arrayList2, w7.c cVar) {
        u4.j jVar = u4.j.f5883b;
        this.f5801a = new HashMap();
        this.f5802b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.f5803f = new AtomicReference();
        j jVar2 = new j();
        this.e = jVar2;
        this.f5804g = cVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(a.c(jVar2, j.class, b5.b.class, b5.a.class));
        int i10 = 0;
        arrayList3.add(a.c(this, w4.a.class, new Class[0]));
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            a aVar = (a) obj;
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((k5.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f5804g.m(componentRegistrar));
                        it.remove();
                    }
                } catch (k e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((a) it2.next()).f5796b.toArray();
                int length = array.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        Object obj3 = array[i13];
                        if (obj3.toString().contains("v8.t")) {
                            if (this.d.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.d.add(obj3.toString());
                        }
                        i13++;
                    }
                }
            }
            if (this.f5801a.isEmpty()) {
                o4.b.p(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f5801a.keySet());
                arrayList6.addAll(arrayList3);
                o4.b.p(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                a aVar2 = (a) obj4;
                this.f5801a.put(aVar2, new l(new c5.b(2, this, aVar2)));
            }
            arrayList5.addAll(k(arrayList3));
            arrayList5.addAll(l());
            j();
        }
        int size4 = arrayList5.size();
        while (i10 < size4) {
            Object obj5 = arrayList5.get(i10);
            i10++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f5803f.get();
        if (bool != null) {
            i(this.f5801a, bool.booleanValue());
        }
    }

    @Override // t4.b
    public final n a(p pVar) {
        k5.b g10 = g(pVar);
        if (g10 == null) {
            return new n(n.c, n.d);
        }
        if (g10 instanceof n) {
            return (n) g10;
        }
        return new n(null, g10);
    }

    @Override // t4.b
    public final synchronized k5.b f(p pVar) {
        m mVar = (m) this.c.get(pVar);
        if (mVar != null) {
            return mVar;
        }
        return f5800h;
    }

    @Override // t4.b
    public final synchronized k5.b g(p pVar) {
        e3.d.c(pVar, "Null interface requested.");
        return (k5.b) this.f5802b.get(pVar);
    }

    public final void i(HashMap hashMap, boolean z9) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            a aVar = (a) entry.getKey();
            k5.b bVar = (k5.b) entry.getValue();
            int i10 = aVar.d;
            if (i10 == 1 || (i10 == 2 && z9)) {
                bVar.get();
            }
        }
        j jVar = this.e;
        synchronized (jVar) {
            try {
                arrayDeque = jVar.f5812b;
                if (arrayDeque != null) {
                    jVar.f5812b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw com.bumptech.glide.g.b(it);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, t4.m] */
    public final void j() {
        boolean z9;
        HashMap hashMap = this.f5802b;
        HashMap hashMap2 = this.c;
        for (a aVar : this.f5801a.keySet()) {
            for (h hVar : aVar.c) {
                if (hVar.f5810b == 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                p pVar = hVar.f5809a;
                if (z9 && !hashMap2.containsKey(pVar)) {
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.f5816b = null;
                    obj.f5815a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.f5815a.addAll(set);
                    hashMap2.put(pVar, obj);
                } else if (hashMap.containsKey(pVar)) {
                    continue;
                } else {
                    int i10 = hVar.f5810b;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            hashMap.put(pVar, new n(n.c, n.d));
                        }
                    } else {
                        throw new a8.a("Unsatisfied dependency for component " + aVar + ": " + pVar, 4);
                    }
                }
            }
        }
    }

    public final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (aVar.e == 0) {
                k5.b bVar = (k5.b) this.f5801a.get(aVar);
                for (p pVar : aVar.f5796b) {
                    HashMap hashMap = this.f5802b;
                    if (!hashMap.containsKey(pVar)) {
                        hashMap.put(pVar, bVar);
                    } else {
                        arrayList2.add(new x0(5, (n) ((k5.b) hashMap.get(pVar)), bVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, t4.m] */
    public final ArrayList l() {
        HashMap hashMap = this.c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f5801a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.e != 0) {
                k5.b bVar = (k5.b) entry.getValue();
                for (p pVar : aVar.f5796b) {
                    if (!hashMap2.containsKey(pVar)) {
                        hashMap2.put(pVar, new HashSet());
                    }
                    ((Set) hashMap2.get(pVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (!hashMap.containsKey(entry2.getKey())) {
                p pVar2 = (p) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                ?? obj = new Object();
                obj.f5816b = null;
                obj.f5815a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f5815a.addAll(set);
                hashMap.put(pVar2, obj);
            } else {
                m mVar = (m) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new x0(6, mVar, (k5.b) it.next()));
                }
            }
        }
        return arrayList;
    }
}
