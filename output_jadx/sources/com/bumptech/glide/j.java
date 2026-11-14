package com.bumptech.glide;

import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import n.r;
import n.s;
import n.t;
import n.u;
import n.x;
import n.z;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final u f630a;

    /* renamed from: b, reason: collision with root package name */
    public final i7.i f631b;
    public final l.d c;
    public final i7.i d;
    public final com.bumptech.glide.load.data.i e;

    /* renamed from: f, reason: collision with root package name */
    public final i7.i f632f;

    /* renamed from: g, reason: collision with root package name */
    public final i7.i f633g;

    /* renamed from: h, reason: collision with root package name */
    public final l.d f634h = new l.d(21);

    /* renamed from: i, reason: collision with root package name */
    public final x.b f635i = new x.b();

    /* renamed from: j, reason: collision with root package name */
    public final d0.d f636j;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, d0.c] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, d0.f] */
    public j() {
        d0.d dVar = new d0.d(new Pools.SynchronizedPool(20), new Object(), new Object());
        this.f636j = dVar;
        this.f630a = new u(dVar);
        this.f631b = new i7.i(4);
        this.c = new l.d(22);
        this.d = new i7.i(6);
        this.e = new com.bumptech.glide.load.data.i();
        this.f632f = new i7.i(3);
        this.f633g = new i7.i(5);
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        l.d dVar2 = this.c;
        synchronized (dVar2) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) dVar2.d);
                ((ArrayList) dVar2.d).clear();
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((ArrayList) dVar2.d).add((String) obj);
                }
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    String str = (String) obj2;
                    if (!arrayList.contains(str)) {
                        ((ArrayList) dVar2.d).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, h.b bVar) {
        i7.i iVar = this.f631b;
        synchronized (iVar) {
            iVar.f2803b.add(new x.a(cls, bVar));
        }
    }

    public final void b(Class cls, h.k kVar) {
        i7.i iVar = this.d;
        synchronized (iVar) {
            iVar.f2803b.add(new x.d(cls, kVar));
        }
    }

    public final void c(Class cls, Class cls2, s sVar) {
        u uVar = this.f630a;
        synchronized (uVar) {
            z zVar = uVar.f4034a;
            synchronized (zVar) {
                try {
                    x xVar = new x(cls, cls2, sVar);
                    ArrayList arrayList = zVar.f4045a;
                    arrayList.add(arrayList.size(), xVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            uVar.f4035b.f626a.clear();
        }
    }

    public final void d(String str, Class cls, Class cls2, h.j jVar) {
        l.d dVar = this.c;
        synchronized (dVar) {
            dVar.t(str).add(new x.c(cls, cls2, jVar));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        i7.i iVar = this.f633g;
        synchronized (iVar) {
            arrayList = iVar.f2803b;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new RuntimeException("Failed to find image header parser.");
    }

    public final List f(Object obj) {
        List list;
        u uVar = this.f630a;
        uVar.getClass();
        Class<?> cls = obj.getClass();
        synchronized (uVar) {
            t tVar = (t) uVar.f4035b.f626a.get(cls);
            if (tVar == null) {
                list = null;
            } else {
                list = tVar.f4033a;
            }
            if (list == null) {
                list = Collections.unmodifiableList(uVar.f4034a.a(cls));
                if (((t) uVar.f4035b.f626a.put(cls, new t(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List list2 = Collections.EMPTY_LIST;
            boolean z9 = true;
            for (int i10 = 0; i10 < size; i10++) {
                r rVar = (r) list.get(i10);
                if (rVar.a(obj)) {
                    if (z9) {
                        list2 = new ArrayList(size - i10);
                        z9 = false;
                    }
                    list2.add(rVar);
                }
            }
            if (!list2.isEmpty()) {
                return list2;
            }
            throw new RuntimeException("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }
        throw new RuntimeException("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
    }

    public final com.bumptech.glide.load.data.g g(Object obj) {
        com.bumptech.glide.load.data.g b10;
        com.bumptech.glide.load.data.i iVar = this.e;
        synchronized (iVar) {
            try {
                c0.g.b(obj);
                com.bumptech.glide.load.data.f fVar = (com.bumptech.glide.load.data.f) ((HashMap) iVar.c).get(obj.getClass());
                if (fVar == null) {
                    Iterator it = ((HashMap) iVar.c).values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.bumptech.glide.load.data.f fVar2 = (com.bumptech.glide.load.data.f) it.next();
                        if (fVar2.a().isAssignableFrom(obj.getClass())) {
                            fVar = fVar2;
                            break;
                        }
                    }
                }
                if (fVar == null) {
                    fVar = com.bumptech.glide.load.data.i.d;
                }
                b10 = fVar.b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return b10;
    }

    public final void h(com.bumptech.glide.load.data.f fVar) {
        com.bumptech.glide.load.data.i iVar = this.e;
        synchronized (iVar) {
            ((HashMap) iVar.c).put(fVar.a(), fVar);
        }
    }

    public final void i(Class cls, Class cls2, v.a aVar) {
        i7.i iVar = this.f632f;
        synchronized (iVar) {
            iVar.f2803b.add(new v.b(cls, cls2, aVar));
        }
    }
}
