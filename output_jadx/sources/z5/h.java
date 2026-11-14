package z5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h implements k {
    public static final k[] c = new k[0];

    /* renamed from: a, reason: collision with root package name */
    public Map f6862a;

    /* renamed from: b, reason: collision with root package name */
    public k[] f6863b;

    @Override // z5.k
    public final m a(b bVar, Map map) {
        c(map);
        return b(bVar);
    }

    public final m b(b bVar) {
        k[] kVarArr = this.f6863b;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                try {
                    return kVar.a(bVar, this.f6862a);
                } catch (l unused) {
                }
            }
        }
        throw i.d;
    }

    public final void c(Map map) {
        boolean z9;
        Collection collection;
        this.f6862a = map;
        boolean z10 = false;
        if (map != null && map.containsKey(d.e)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(d.d);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(a.f6846p) || collection.contains(a.f6847q) || collection.contains(a.f6839i) || collection.contains(a.f6838h) || collection.contains(a.c) || collection.contains(a.d) || collection.contains(a.e) || collection.contains(a.f6836f) || collection.contains(a.f6840j) || collection.contains(a.f6844n) || collection.contains(a.f6845o)) {
                z10 = true;
            }
            if (z10 && !z9) {
                arrayList.add(new n6.g(map, 0));
            }
            if (collection.contains(a.f6843m)) {
                arrayList.add(new v6.a());
            }
            if (collection.contains(a.f6837g)) {
                arrayList.add(new i6.a());
            }
            if (collection.contains(a.f6835b)) {
                arrayList.add(new Object());
            }
            if (collection.contains(a.f6842l)) {
                arrayList.add(new Object());
            }
            if (collection.contains(a.f6841k)) {
                arrayList.add(new l6.a());
            }
            if (z10 && z9) {
                arrayList.add(new n6.g(map, 0));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z9) {
                arrayList.add(new n6.g(map, 0));
            }
            arrayList.add(new v6.a());
            arrayList.add(new i6.a());
            arrayList.add(new Object());
            arrayList.add(new Object());
            arrayList.add(new l6.a());
            if (z9) {
                arrayList.add(new n6.g(map, 0));
            }
        }
        this.f6863b = (k[]) arrayList.toArray(c);
    }

    @Override // z5.k
    public final void reset() {
        k[] kVarArr = this.f6863b;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                kVar.reset();
            }
        }
    }
}
