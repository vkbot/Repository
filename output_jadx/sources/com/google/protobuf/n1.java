package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n1 extends AbstractList implements g0, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final f0 f1600b;

    public n1(f0 f0Var) {
        this.f1600b = f0Var;
    }

    @Override // com.google.protobuf.g0
    public final Object V(int i10) {
        return this.f1600b.c.get(i10);
    }

    @Override // com.google.protobuf.g0
    public final void b(g gVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f1600b.get(i10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, java.lang.Object, com.google.protobuf.m1] */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        ?? obj = new Object();
        obj.f1595b = this.f1600b.iterator();
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.l1, java.util.ListIterator, java.lang.Object] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        ?? obj = new Object();
        obj.f1590b = this.f1600b.listIterator(i10);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1600b.c.size();
    }

    @Override // com.google.protobuf.g0
    public final List y() {
        return Collections.unmodifiableList(this.f1600b.c);
    }

    @Override // com.google.protobuf.g0
    public final g0 S() {
        return this;
    }
}
