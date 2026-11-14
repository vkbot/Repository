package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h1 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f1572b = -1;
    public boolean c;
    public Iterator d;
    public final /* synthetic */ d1 e;

    public h1(d1 d1Var) {
        this.e = d1Var;
    }

    public final Iterator a() {
        if (this.d == null) {
            this.d = this.e.d.entrySet().iterator();
        }
        return this.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f1572b + 1;
        d1 d1Var = this.e;
        if (i10 < d1Var.c.size() || (!d1Var.d.isEmpty() && a().hasNext())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.c = true;
        int i10 = this.f1572b + 1;
        this.f1572b = i10;
        d1 d1Var = this.e;
        if (i10 < d1Var.c.size()) {
            return (Map.Entry) d1Var.c.get(this.f1572b);
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.c) {
            this.c = false;
            int i10 = d1.f1550h;
            d1 d1Var = this.e;
            d1Var.b();
            if (this.f1572b < d1Var.c.size()) {
                int i11 = this.f1572b;
                this.f1572b = i11 - 1;
                d1Var.g(i11);
                return;
            }
            a().remove();
            return;
        }
        j1.i.l("remove() was called before next()");
    }
}
