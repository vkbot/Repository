package n6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import z5.l;
import z5.m;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g extends h {
    public static final h[] c = new h[0];
    public static final k[] d = new k[0];

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4144a;

    /* renamed from: b, reason: collision with root package name */
    public final h[] f4145b;

    public g(Map map, int i10) {
        Collection collection;
        Collection collection2;
        boolean z9;
        this.f4144a = i10;
        switch (i10) {
            case 1:
                if (map == null) {
                    collection = null;
                } else {
                    collection = (Collection) map.get(z5.d.d);
                }
                ArrayList arrayList = new ArrayList();
                if (collection != null) {
                    if (collection.contains(z5.a.f6839i)) {
                        arrayList.add(new e(0));
                    } else if (collection.contains(z5.a.f6846p)) {
                        arrayList.add(new e(3));
                    }
                    if (collection.contains(z5.a.f6838h)) {
                        arrayList.add(new e(2));
                    }
                    if (collection.contains(z5.a.f6847q)) {
                        arrayList.add(new e(1));
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(new e(0));
                    arrayList.add(new e(2));
                    arrayList.add(new e(1));
                }
                this.f4145b = (k[]) arrayList.toArray(d);
                return;
            default:
                if (map == null) {
                    collection2 = null;
                } else {
                    collection2 = (Collection) map.get(z5.d.d);
                }
                if (map != null && map.get(z5.d.f6853h) != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ArrayList arrayList2 = new ArrayList();
                if (collection2 != null) {
                    if (collection2.contains(z5.a.f6839i) || collection2.contains(z5.a.f6846p) || collection2.contains(z5.a.f6838h) || collection2.contains(z5.a.f6847q)) {
                        arrayList2.add(new g(map, 1));
                    }
                    if (collection2.contains(z5.a.d)) {
                        arrayList2.add(new c(z9));
                    }
                    if (collection2.contains(z5.a.e)) {
                        arrayList2.add(new d());
                    }
                    if (collection2.contains(z5.a.f6836f)) {
                        arrayList2.add(new Object());
                    }
                    if (collection2.contains(z5.a.f6840j)) {
                        arrayList2.add(new f());
                    }
                    if (collection2.contains(z5.a.c)) {
                        arrayList2.add(new a());
                    }
                    if (collection2.contains(z5.a.f6844n)) {
                        arrayList2.add(new o6.e());
                    }
                    if (collection2.contains(z5.a.f6845o)) {
                        arrayList2.add(new p6.c());
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(new g(map, 1));
                    arrayList2.add(new c(false));
                    arrayList2.add(new a());
                    arrayList2.add(new d());
                    arrayList2.add(new Object());
                    arrayList2.add(new f());
                    arrayList2.add(new o6.e());
                    arrayList2.add(new p6.c());
                }
                this.f4145b = (h[]) arrayList2.toArray(c);
                return;
        }
    }

    @Override // n6.h
    public final m b(int i10, f6.a aVar, Map map) {
        boolean z9;
        Collection collection;
        boolean z10;
        switch (this.f4144a) {
            case 0:
                for (h hVar : this.f4145b) {
                    try {
                        return hVar.b(i10, aVar, map);
                    } catch (l unused) {
                    }
                }
                throw z5.i.d;
            default:
                int[] m10 = k.m(aVar);
                for (k kVar : (k[]) this.f4145b) {
                    try {
                        m k6 = kVar.k(i10, aVar, m10, map);
                        if (k6.d == z5.a.f6839i && k6.f6865a.charAt(0) == '0') {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (map == null) {
                            collection = null;
                        } else {
                            collection = (Collection) map.get(z5.d.d);
                        }
                        z5.a aVar2 = z5.a.f6846p;
                        if (collection != null && !collection.contains(aVar2)) {
                            z10 = false;
                            if (!z9 && z10) {
                                m mVar = new m(k6.f6865a.substring(1), k6.f6866b, k6.c, aVar2);
                                mVar.a(k6.e);
                                return mVar;
                            }
                        }
                        z10 = true;
                        return !z9 ? k6 : k6;
                    } catch (l unused2) {
                    }
                }
                throw z5.i.d;
        }
    }

    @Override // n6.h, z5.k
    public final void reset() {
        switch (this.f4144a) {
            case 0:
                for (h hVar : this.f4145b) {
                    hVar.reset();
                }
                return;
            default:
                for (k kVar : (k[]) this.f4145b) {
                    kVar.getClass();
                }
                return;
        }
    }
}
