package com.google.protobuf;

import java.util.Iterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f1548b = 0;
    public final int c;
    public final /* synthetic */ g d;

    public d(g gVar) {
        this.d = gVar;
        this.c = gVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1548b < this.c) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f1548b;
        if (i10 < this.c) {
            this.f1548b = i10 + 1;
            return Byte.valueOf(this.d.g(i10));
        }
        n0.b.x();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
