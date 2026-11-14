package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h0 extends j0 {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(int i10, long j10, Object obj) {
        List arrayList;
        List list = (List) s1.c.i(obj, j10);
        if (list.isEmpty()) {
            if (list instanceof g0) {
                arrayList = new f0(i10);
            } else {
                arrayList = new ArrayList(i10);
            }
            s1.p(j10, obj, arrayList);
            return arrayList;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i10);
            arrayList2.addAll(list);
            s1.p(j10, obj, arrayList2);
            return arrayList2;
        }
        if (list instanceof n1) {
            f0 f0Var = new f0(list.size() + i10);
            f0Var.addAll((n1) list);
            s1.p(j10, obj, f0Var);
            return f0Var;
        }
        return list;
    }

    @Override // com.google.protobuf.j0
    public final void a(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) s1.c.i(obj, j10);
        if (list instanceof g0) {
            unmodifiableList = ((g0) list).S();
        } else if (c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        s1.p(j10, obj, unmodifiableList);
    }

    @Override // com.google.protobuf.j0
    public final void b(long j10, Object obj, Object obj2) {
        List list = (List) s1.c.i(obj2, j10);
        List d = d(list.size(), j10, obj);
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        s1.p(j10, obj, list);
    }

    @Override // com.google.protobuf.j0
    public final List c(Object obj, long j10) {
        return d(10, j10, obj);
    }
}
