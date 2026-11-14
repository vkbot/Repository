package com.google.protobuf;

import java.util.Iterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m1 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public Iterator f1595b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1595b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f1595b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
