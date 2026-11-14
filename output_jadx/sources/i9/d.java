package i9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class d extends u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2878b;
    public final n0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e9.b bVar, int i10) {
        super(bVar);
        this.f2878b = i10;
        bVar.getClass();
        switch (i10) {
            case 1:
                super(bVar);
                g9.e a10 = bVar.a();
                a10.getClass();
                this.c = new c(a10, 2);
                return;
            case 2:
                super(bVar);
                g9.e a11 = bVar.a();
                a11.getClass();
                this.c = new c(a11, 3);
                return;
            default:
                g9.e a12 = bVar.a();
                a12.getClass();
                this.c = new c(a12, 1);
                return;
        }
    }

    @Override // e9.h, e9.a
    public final g9.e a() {
        switch (this.f2878b) {
            case 0:
                return (c) this.c;
            case 1:
                return (c) this.c;
            default:
                return (c) this.c;
        }
    }

    @Override // i9.a
    public final Object d() {
        switch (this.f2878b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // i9.a
    public final int e(Object obj) {
        switch (this.f2878b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet.size();
        }
    }

    @Override // i9.a
    public final void f(int i10, Object obj) {
        switch (this.f2878b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.ensureCapacity(i10);
                return;
            case 1:
                ((HashSet) obj).getClass();
                return;
            default:
                ((LinkedHashSet) obj).getClass();
                return;
        }
    }

    @Override // i9.a
    public final Iterator g(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // i9.a
    public final int h(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // i9.a
    public final Object l(Object obj) {
        switch (this.f2878b) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    @Override // i9.a
    public final Object m(Object obj) {
        switch (this.f2878b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet;
        }
    }

    @Override // i9.u
    public final void n(int i10, Object obj, Object obj2) {
        switch (this.f2878b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.add(i10, obj2);
                return;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                hashSet.add(obj2);
                return;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                linkedHashSet.add(obj2);
                return;
        }
    }
}
