package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f0 extends b implements g0, RandomAccess {
    public final List c;

    static {
        new f0();
    }

    public f0() {
        super(false);
        this.c = Collections.EMPTY_LIST;
    }

    @Override // com.google.protobuf.g0
    public final g0 S() {
        if (this.f1534b) {
            return new n1(this);
        }
        return this;
    }

    @Override // com.google.protobuf.g0
    public final Object V(int i10) {
        return this.c.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        a();
        this.c.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        a();
        if (collection instanceof g0) {
            collection = ((g0) collection).y();
        }
        boolean addAll = this.c.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.g0
    public final void b(g gVar) {
        a();
        this.c.add(gVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.a0
    public final a0 c(int i10) {
        List list = this.c;
        if (i10 >= list.size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(list);
            return new f0(arrayList);
        }
        l9.i.a();
        return null;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        String str;
        List list = this.c;
        Object obj = list.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            Charset charset = b0.f1535a;
            if (gVar.size() == 0) {
                str = "";
            } else {
                str = new String(gVar.c, gVar.f(), gVar.size(), charset);
            }
            int f8 = gVar.f();
            if (v1.f1639a.e(gVar.c, f8, gVar.size() + f8) == 0) {
                list.set(i10, str);
            }
            return str;
        }
        byte[] bArr = (byte[]) obj;
        String str2 = new String(bArr, b0.f1535a);
        if (v1.f1639a.e(bArr, 0, bArr.length) == 0) {
            list.set(i10, str2);
        }
        return str2;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        Object remove = this.c.remove(i10);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof g) {
            g gVar = (g) remove;
            Charset charset = b0.f1535a;
            if (gVar.size() == 0) {
                return "";
            }
            return new String(gVar.c, gVar.f(), gVar.size(), charset);
        }
        return new String((byte[]) remove, b0.f1535a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        Object obj2 = this.c.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof g) {
            g gVar = (g) obj2;
            Charset charset = b0.f1535a;
            if (gVar.size() == 0) {
                return "";
            }
            return new String(gVar.c, gVar.f(), gVar.size(), charset);
        }
        return new String((byte[]) obj2, b0.f1535a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // com.google.protobuf.g0
    public final List y() {
        return Collections.unmodifiableList(this.c);
    }

    public f0(ArrayList arrayList) {
        super(true);
        this.c = arrayList;
    }

    public f0(int i10) {
        this(new ArrayList(i10));
    }

    @Override // com.google.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.c.size(), collection);
    }
}
