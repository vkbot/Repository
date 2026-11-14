package j;

import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3001a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3002b = new ArrayList();
    public com.bumptech.glide.e c;
    public Object d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f3003f;

    /* renamed from: g, reason: collision with root package name */
    public Class f3004g;

    /* renamed from: h, reason: collision with root package name */
    public c0.h f3005h;

    /* renamed from: i, reason: collision with root package name */
    public h.h f3006i;

    /* renamed from: j, reason: collision with root package name */
    public Map f3007j;

    /* renamed from: k, reason: collision with root package name */
    public Class f3008k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3009l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3010m;

    /* renamed from: n, reason: collision with root package name */
    public h.e f3011n;

    /* renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.h f3012o;

    /* renamed from: p, reason: collision with root package name */
    public m f3013p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3014q;
    public boolean r;

    public final ArrayList a() {
        boolean z9 = this.f3010m;
        ArrayList arrayList = this.f3002b;
        if (!z9) {
            this.f3010m = true;
            arrayList.clear();
            ArrayList b10 = b();
            int size = b10.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.q qVar = (n.q) b10.get(i10);
                h.e eVar = qVar.f4031a;
                List list = qVar.f4032b;
                if (!arrayList.contains(eVar)) {
                    arrayList.add(qVar.f4031a);
                }
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (!arrayList.contains(list.get(i11))) {
                        arrayList.add(list.get(i11));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z9 = this.f3009l;
        ArrayList arrayList = this.f3001a;
        if (!z9) {
            this.f3009l = true;
            arrayList.clear();
            List f8 = this.c.a().f(this.d);
            int size = f8.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.q b10 = ((n.r) f8.get(i10)).b(this.d, this.e, this.f3003f, this.f3006i);
                if (b10 != null) {
                    arrayList.add(b10);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b0 c(Class cls) {
        b0 b0Var;
        Class cls2;
        Class cls3;
        Class cls4;
        b0 b0Var2;
        b0 b0Var3;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z9;
        v.a aVar;
        boolean z10;
        Class cls5 = cls;
        com.bumptech.glide.j a10 = this.c.a();
        Class cls6 = this.f3004g;
        Class cls7 = this.f3008k;
        x.b bVar = a10.f635i;
        c0.n nVar = (c0.n) bVar.f6419b.getAndSet(null);
        c0.n nVar2 = nVar;
        if (nVar == null) {
            nVar2 = new Object();
        }
        nVar2.f443a = cls5;
        nVar2.f444b = cls6;
        nVar2.c = cls7;
        synchronized (bVar.f6418a) {
            b0Var = (b0) bVar.f6418a.get(nVar2);
        }
        bVar.f6419b.set(nVar2);
        a10.f635i.getClass();
        if (x.b.c.equals(b0Var)) {
            return null;
        }
        if (b0Var == null) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList u8 = a10.c.u(cls5, cls6);
            int size = u8.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                Class<?> cls8 = (Class) u8.get(i10);
                ArrayList e = a10.f632f.e(cls8, cls7);
                int size2 = e.size();
                int i12 = 0;
                while (i12 < size2) {
                    int i13 = i12 + 1;
                    Class cls9 = (Class) e.get(i12);
                    l.d dVar = a10.c;
                    synchronized (dVar) {
                        arrayList = new ArrayList();
                        ArrayList arrayList4 = (ArrayList) dVar.d;
                        int size3 = arrayList4.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj = arrayList4.get(i14);
                            int i15 = i14 + 1;
                            String str = (String) obj;
                            ArrayList arrayList5 = e;
                            List list = (List) ((HashMap) dVar.c).get(str);
                            if (list != null) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    x.c cVar = (x.c) it.next();
                                    Iterator it2 = it;
                                    if (cVar.f6420a.isAssignableFrom(cls5) && cls8.isAssignableFrom(cVar.f6421b)) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        arrayList.add(cVar.c);
                                    }
                                    it = it2;
                                }
                            }
                            e = arrayList5;
                            i14 = i15;
                        }
                        arrayList2 = e;
                    }
                    i7.i iVar = a10.f632f;
                    synchronized (iVar) {
                        if (cls9.isAssignableFrom(cls8)) {
                            aVar = v.c.c;
                        } else {
                            ArrayList arrayList6 = iVar.f2803b;
                            int size4 = arrayList6.size();
                            int i16 = 0;
                            while (i16 < size4) {
                                Object obj2 = arrayList6.get(i16);
                                i16++;
                                v.b bVar2 = (v.b) obj2;
                                ArrayList arrayList7 = arrayList6;
                                if (bVar2.f5907a.isAssignableFrom(cls8) && cls9.isAssignableFrom(bVar2.f5908b)) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (z9) {
                                    aVar = bVar2.c;
                                } else {
                                    cls5 = cls;
                                    arrayList6 = arrayList7;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                        }
                    }
                    arrayList3.add(new l(cls5, cls8, cls9, arrayList, aVar, a10.f636j));
                    cls5 = cls;
                    size2 = size2;
                    i12 = i13;
                    e = arrayList2;
                }
                cls5 = cls;
                i10 = i11;
            }
            if (arrayList3.isEmpty()) {
                cls2 = cls;
                cls3 = cls6;
                cls4 = cls7;
                b0Var2 = null;
            } else {
                cls2 = cls;
                cls3 = cls6;
                cls4 = cls7;
                b0Var2 = new b0(cls2, cls3, cls4, arrayList3, a10.f636j);
            }
            x.b bVar3 = a10.f635i;
            synchronized (bVar3.f6418a) {
                ArrayMap arrayMap = bVar3.f6418a;
                c0.n nVar3 = new c0.n(cls2, cls3, cls4);
                if (b0Var2 != null) {
                    b0Var3 = b0Var2;
                } else {
                    b0Var3 = x.b.c;
                }
                arrayMap.put(nVar3, b0Var3);
            }
            return b0Var2;
        }
        return b0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r1 = r5.f6417b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final h.b d(java.lang.Object r8) {
        /*
            r7 = this;
            com.bumptech.glide.e r0 = r7.c
            com.bumptech.glide.j r0 = r0.a()
            i7.i r0 = r0.f631b
            java.lang.Class r1 = r8.getClass()
            monitor-enter(r0)
            java.util.ArrayList r2 = r0.f2803b     // Catch: java.lang.Throwable -> L2a
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L2a
            r4 = 0
        L14:
            if (r4 >= r3) goto L2c
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> L2a
            int r4 = r4 + 1
            x.a r5 = (x.a) r5     // Catch: java.lang.Throwable -> L2a
            java.lang.Class r6 = r5.f6416a     // Catch: java.lang.Throwable -> L2a
            boolean r6 = r6.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L14
            h.b r1 = r5.f6417b     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r0)
            goto L2e
        L2a:
            r8 = move-exception
            goto L41
        L2c:
            monitor-exit(r0)
            r1 = 0
        L2e:
            if (r1 == 0) goto L31
            return r1
        L31:
            com.bumptech.glide.i r0 = new com.bumptech.glide.i
            java.lang.Class r8 = r8.getClass()
            java.lang.String r1 = "Failed to find source encoder for data class: "
            java.lang.String r8 = ai.onnxruntime.a.j(r8, r1)
            r0.<init>(r8)
            throw r0
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j.h.d(java.lang.Object):h.b");
    }

    public final h.l e(Class cls) {
        h.l lVar = (h.l) this.f3007j.get(cls);
        if (lVar == null) {
            Iterator it = this.f3007j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (h.l) entry.getValue();
                    break;
                }
            }
        }
        if (lVar == null) {
            if (this.f3007j.isEmpty() && this.f3014q) {
                androidx.navigation.b.p(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods.");
                return null;
            }
            return p.c.f4952b;
        }
        return lVar;
    }
}
