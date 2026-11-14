package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class z0 extends b implements RandomAccess {
    public static final z0 e = new z0(0, new Object[0], false);
    public Object[] c;
    public int d;

    public z0(int i10, Object[] objArr, boolean z9) {
        super(z9);
        this.c = objArr;
        this.d = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.d)) {
            Object[] objArr = this.c;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.c, i10, objArr2, i10 + 1, this.d - i10);
                this.c = objArr2;
            }
            this.c[i10] = obj;
            this.d++;
            ((AbstractList) this).modCount++;
            return;
        }
        kotlin.text.b.a(ai.onnxruntime.a.q(i10, "Index:", ", Size:"), this.d);
    }

    @Override // com.google.protobuf.a0
    public final a0 c(int i10) {
        if (i10 >= this.d) {
            return new z0(this.d, Arrays.copyOf(this.c, i10), true);
        }
        l9.i.a();
        return null;
    }

    public final void d(int i10) {
        if (i10 >= 0 && i10 < this.d) {
            return;
        }
        kotlin.text.b.a(ai.onnxruntime.a.q(i10, "Index:", ", Size:"), this.d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        d(i10);
        return this.c[i10];
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        d(i10);
        Object[] objArr = this.c;
        Object obj = objArr[i10];
        if (i10 < this.d - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        d(i10);
        Object[] objArr = this.c;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i10 = this.d;
        Object[] objArr = this.c;
        if (i10 == objArr.length) {
            this.c = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.c;
        int i11 = this.d;
        this.d = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
