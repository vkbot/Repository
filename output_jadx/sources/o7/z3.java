package o7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class z3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4798a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4799b;
    public final Collection c;
    public final Collection d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final c4 f4800f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4801g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4802h;

    public z3(List list, Collection collection, Collection collection2, c4 c4Var, boolean z9, boolean z10, boolean z11, int i10) {
        boolean z12;
        boolean z13;
        boolean z14;
        this.f4799b = list;
        o4.b.i(collection, "drainedSubstreams");
        this.c = collection;
        this.f4800f = c4Var;
        this.d = collection2;
        this.f4801g = z9;
        this.f4798a = z10;
        this.f4802h = z11;
        this.e = i10;
        if (z10 && list != null) {
            z12 = false;
        } else {
            z12 = true;
        }
        o4.b.m(z12, "passThrough should imply buffer is null");
        if (z10 && c4Var == null) {
            z13 = false;
        } else {
            z13 = true;
        }
        o4.b.m(z13, "passThrough should imply winningSubstream != null");
        if (z10 && ((collection.size() != 1 || !collection.contains(c4Var)) && (collection.size() != 0 || !c4Var.f4449b))) {
            z14 = false;
        } else {
            z14 = true;
        }
        o4.b.m(z14, "passThrough should imply winningSubstream is drained");
        o4.b.m((z9 && c4Var == null) ? false : true, "cancelled should imply committed");
    }

    public final z3 a(c4 c4Var) {
        boolean z9;
        Collection unmodifiableCollection;
        o4.b.m(!this.f4802h, "hedging frozen");
        if (this.f4800f == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "already committed");
        Collection collection = this.d;
        if (collection == null) {
            unmodifiableCollection = Collections.singleton(c4Var);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(c4Var);
            unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new z3(this.f4799b, this.c, unmodifiableCollection, this.f4800f, this.f4801g, this.f4798a, this.f4802h, this.e + 1);
    }

    public final z3 b(c4 c4Var) {
        ArrayList arrayList = new ArrayList(this.d);
        arrayList.remove(c4Var);
        return new z3(this.f4799b, this.c, Collections.unmodifiableCollection(arrayList), this.f4800f, this.f4801g, this.f4798a, this.f4802h, this.e);
    }

    public final z3 c(c4 c4Var, c4 c4Var2) {
        ArrayList arrayList = new ArrayList(this.d);
        arrayList.remove(c4Var);
        arrayList.add(c4Var2);
        return new z3(this.f4799b, this.c, Collections.unmodifiableCollection(arrayList), this.f4800f, this.f4801g, this.f4798a, this.f4802h, this.e);
    }

    public final z3 d(c4 c4Var) {
        c4Var.f4449b = true;
        Collection collection = this.c;
        if (collection.contains(c4Var)) {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.remove(c4Var);
            return new z3(this.f4799b, Collections.unmodifiableCollection(arrayList), this.d, this.f4800f, this.f4801g, this.f4798a, this.f4802h, this.e);
        }
        return this;
    }

    public final z3 e(c4 c4Var) {
        boolean z9;
        List list;
        boolean z10 = true;
        o4.b.m(!this.f4798a, "Already passThrough");
        boolean z11 = c4Var.f4449b;
        Collection collection = this.c;
        if (!z11) {
            if (collection.isEmpty()) {
                collection = Collections.singletonList(c4Var);
            } else {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.add(c4Var);
                collection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection2 = collection;
        c4 c4Var2 = this.f4800f;
        if (c4Var2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (c4Var2 != c4Var) {
                z10 = false;
            }
            o4.b.m(z10, "Another RPC attempt has already committed");
            list = null;
        } else {
            list = this.f4799b;
        }
        return new z3(list, collection2, this.d, this.f4800f, this.f4801g, z9, this.f4802h, this.e);
    }
}
