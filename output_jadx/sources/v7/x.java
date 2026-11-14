package v7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import n7.f0;
import n7.f1;
import n7.g0;
import n7.h0;
import n7.j0;
import n7.k0;
import o7.f3;
import o7.t1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class x extends j0 {

    /* renamed from: m, reason: collision with root package name */
    public static final Logger f5996m = Logger.getLogger(x.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public final n7.e f5998g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5999h;

    /* renamed from: j, reason: collision with root package name */
    public n7.j f6001j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f6002k;

    /* renamed from: l, reason: collision with root package name */
    public h0 f6003l;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f5997f = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final f3 f6000i = new f3();

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, n7.h0] */
    public x(n7.e eVar) {
        this.f5998g = eVar;
        f5996m.log(Level.FINE, "Created");
        this.f6002k = new AtomicInteger(new Random().nextInt());
        this.f6003l = new Object();
    }

    @Override // n7.j0
    public final f1 a(g0 g0Var) {
        try {
            this.f5999h = true;
            l.d g10 = g(g0Var);
            f1 f1Var = (f1) g10.c;
            if (!f1Var.f()) {
                return f1Var;
            }
            j();
            for (i iVar : (List) g10.d) {
                iVar.f5959b.f();
                iVar.d = n7.j.f4215f;
                f5996m.log(Level.FINE, "Child balancer {0} deleted", iVar.f5958a);
            }
            return f1Var;
        } finally {
            this.f5999h = false;
        }
    }

    @Override // n7.j0
    public final void c(f1 f1Var) {
        if (this.f6001j != n7.j.c) {
            this.f5998g.D(n7.j.d, new t1(f0.a(f1Var)));
        }
    }

    @Override // n7.j0
    public final void f() {
        Level level = Level.FINE;
        Logger logger = f5996m;
        logger.log(level, "Shutdown");
        LinkedHashMap linkedHashMap = this.f5997f;
        for (i iVar : linkedHashMap.values()) {
            iVar.f5959b.f();
            iVar.d = n7.j.f4215f;
            logger.log(Level.FINE, "Child balancer {0} deleted", iVar.f5958a);
        }
        linkedHashMap.clear();
    }

    public final l.d g(g0 g0Var) {
        LinkedHashMap linkedHashMap;
        j4.e i10;
        j jVar;
        n7.r rVar;
        Level level = Level.FINE;
        Logger logger = f5996m;
        logger.log(level, "Received resolution result: {0}", g0Var);
        HashMap hashMap = new HashMap();
        List list = g0Var.f4206a;
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedHashMap = this.f5997f;
            if (!hasNext) {
                break;
            }
            j jVar2 = new j((n7.r) it.next());
            i iVar = (i) linkedHashMap.get(jVar2);
            if (iVar != null) {
                hashMap.put(jVar2, iVar);
            } else {
                hashMap.put(jVar2, new i(this, jVar2, this.f6000i, new t1(f0.e)));
            }
        }
        int i11 = 19;
        Object obj = null;
        if (hashMap.isEmpty()) {
            f1 h2 = f1.f4201m.h("NameResolver returned no usable address. " + g0Var);
            c(h2);
            return new l.d(i11, h2, obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            Object key = entry.getKey();
            k0 k0Var = ((i) entry.getValue()).c;
            ((i) entry.getValue()).getClass();
            if (!linkedHashMap.containsKey(key)) {
                linkedHashMap.put(key, (i) entry.getValue());
            } else {
                i iVar2 = (i) linkedHashMap.get(key);
                if (iVar2.f5960f) {
                    iVar2.f5960f = false;
                }
            }
            i iVar3 = (i) linkedHashMap.get(key);
            if (key instanceof n7.r) {
                jVar = new j((n7.r) key);
            } else {
                o4.b.d("key is wrong type", key instanceof j);
                jVar = (j) key;
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    rVar = (n7.r) it2.next();
                    if (jVar.equals(new j(rVar))) {
                        break;
                    }
                } else {
                    rVar = null;
                    break;
                }
            }
            o4.b.i(rVar, key + " no longer present in load balancer children");
            n7.b bVar = n7.b.f4157b;
            List singletonList = Collections.singletonList(rVar);
            n7.b bVar2 = n7.b.f4157b;
            Boolean bool = Boolean.TRUE;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(j0.e, bool);
            for (Map.Entry entry2 : bVar2.f4158a.entrySet()) {
                if (!identityHashMap.containsKey(entry2.getKey())) {
                    identityHashMap.put((n7.a) entry2.getKey(), entry2.getValue());
                }
            }
            g0 g0Var2 = new g0(singletonList, new n7.b(identityHashMap), null);
            ((i) linkedHashMap.get(key)).getClass();
            if (!iVar3.f5960f) {
                iVar3.f5959b.d(g0Var2);
            }
        }
        ArrayList arrayList = new ArrayList();
        Collection keySet = linkedHashMap.keySet();
        j4.c cVar = j4.e.c;
        if (keySet instanceof j4.a) {
            i10 = ((j4.a) keySet).a();
            if (i10.h()) {
                Object[] array = i10.toArray(j4.a.f3266b);
                i10 = j4.e.i(array.length, array);
            }
        } else {
            Object[] array2 = keySet.toArray();
            int length = array2.length;
            for (int i12 = 0; i12 < length; i12++) {
                if (array2[i12] == null) {
                    n0.b.n(ai.onnxruntime.a.e(i12, "at index "));
                    return null;
                }
            }
            i10 = j4.e.i(array2.length, array2);
        }
        j4.c listIterator = i10.listIterator(0);
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            if (!hashMap.containsKey(next)) {
                i iVar4 = (i) linkedHashMap.get(next);
                j jVar3 = iVar4.f5958a;
                if (!iVar4.f5960f) {
                    iVar4.f5961g.f5997f.remove(jVar3);
                    iVar4.f5960f = true;
                    logger.log(Level.FINE, "Child balancer {0} deactivated", jVar3);
                }
                arrayList.add(iVar4);
            }
        }
        return new l.d(i11, f1.e, arrayList);
    }

    public final w h(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((i) it.next()).e);
        }
        return new w(arrayList, this.f6002k);
    }

    public final void i(n7.j jVar, h0 h0Var) {
        if (jVar == this.f6001j && h0Var.equals(this.f6003l)) {
            return;
        }
        this.f5998g.D(jVar, h0Var);
        this.f6001j = jVar;
        this.f6003l = h0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, n7.h0] */
    public final void j() {
        n7.j jVar;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = this.f5997f;
        Iterator it = linkedHashMap.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            jVar = n7.j.c;
            if (!hasNext) {
                break;
            }
            i iVar = (i) it.next();
            if (!iVar.f5960f && iVar.d == jVar) {
                arrayList.add(iVar);
            }
        }
        if (arrayList.isEmpty()) {
            Iterator it2 = linkedHashMap.values().iterator();
            while (it2.hasNext()) {
                n7.j jVar2 = ((i) it2.next()).d;
                n7.j jVar3 = n7.j.f4214b;
                if (jVar2 == jVar3 || jVar2 == n7.j.e) {
                    i(jVar3, new Object());
                    return;
                }
            }
            i(n7.j.d, h(linkedHashMap.values()));
            return;
        }
        i(jVar, h(arrayList));
    }
}
