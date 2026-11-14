package com.google.protobuf;

import java.util.ListIterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l1 implements ListIterator {

    /* renamed from: b, reason: collision with root package name */
    public ListIterator f1590b;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f1590b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1590b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f1590b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1590b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f1590b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1590b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
