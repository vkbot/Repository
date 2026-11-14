package com.google.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d1 extends AbstractMap {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f1550h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f1551b;
    public List c = Collections.EMPTY_LIST;
    public Map d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public volatile u5.c f1552f;

    /* renamed from: g, reason: collision with root package name */
    public Map f1553g;

    public d1(int i10) {
        this.f1551b = i10;
        Map map = Collections.EMPTY_MAP;
        this.d = map;
        this.f1553g = map;
    }

    public final int a(Comparable comparable) {
        int i10;
        int size = this.c.size();
        int i11 = size - 1;
        if (i11 >= 0) {
            int compareTo = comparable.compareTo(((g1) this.c.get(i11)).f1566b);
            if (compareTo > 0) {
                i10 = size + 1;
                return -i10;
            }
            if (compareTo == 0) {
                return i11;
            }
        }
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int compareTo2 = comparable.compareTo(((g1) this.c.get(i13)).f1566b);
            if (compareTo2 < 0) {
                i11 = i13 - 1;
            } else if (compareTo2 > 0) {
                i12 = i13 + 1;
            } else {
                return i13;
            }
        }
        i10 = i12 + 1;
        return -i10;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        androidx.navigation.b.a();
    }

    public final Map.Entry c(int i10) {
        return (Map.Entry) this.c.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
        if (!this.d.isEmpty()) {
            this.d.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.d.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Iterable d() {
        if (this.d.isEmpty()) {
            return t1.c;
        }
        return this.d.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.d.isEmpty() && !(this.d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.d = treeMap;
            this.f1553g = treeMap.descendingMap();
        }
        return (SortedMap) this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f1552f == null) {
            this.f1552f = new u5.c(this, 2);
        }
        return this.f1552f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof d1)) {
                return super.equals(obj);
            }
            d1 d1Var = (d1) obj;
            int size = size();
            if (size == d1Var.size()) {
                int size2 = this.c.size();
                if (size2 != d1Var.c.size()) {
                    return ((AbstractSet) entrySet()).equals(d1Var.entrySet());
                }
                for (int i10 = 0; i10 < size2; i10++) {
                    if (c(i10).equals(d1Var.c(i10))) {
                    }
                }
                if (size2 != size) {
                    return this.d.equals(d1Var.d);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a10 = a(comparable);
        if (a10 >= 0) {
            return ((g1) this.c.get(a10)).setValue(obj);
        }
        b();
        boolean isEmpty = this.c.isEmpty();
        int i10 = this.f1551b;
        if (isEmpty && !(this.c instanceof ArrayList)) {
            this.c = new ArrayList(i10);
        }
        int i11 = -(a10 + 1);
        if (i11 >= i10) {
            return e().put(comparable, obj);
        }
        if (this.c.size() == i10) {
            g1 g1Var = (g1) this.c.remove(i10 - 1);
            e().put(g1Var.f1566b, g1Var.c);
        }
        this.c.add(i11, new g1(this, comparable, obj));
        return null;
    }

    public final Object g(int i10) {
        b();
        Object obj = ((g1) this.c.remove(i10)).c;
        if (!this.d.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new g1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return ((g1) this.c.get(a10)).c;
        }
        return this.d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.c.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((g1) this.c.get(i11)).hashCode();
        }
        if (this.d.size() > 0) {
            return this.d.hashCode() + i10;
        }
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return g(a10);
        }
        if (this.d.isEmpty()) {
            return null;
        }
        return this.d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d.size() + this.c.size();
    }
}
