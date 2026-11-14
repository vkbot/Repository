package com.google.protobuf;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class w implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public final y f1640b;
    public y c;

    public w(y yVar) {
        this.f1640b = yVar;
        if (!yVar.i()) {
            this.c = yVar.k();
        } else {
            j1.i.k("Default instance must be immutable.");
            throw null;
        }
    }

    public static void d(Object obj, Object obj2) {
        y0 y0Var = y0.c;
        y0Var.getClass();
        y0Var.a(obj.getClass()).b(obj, obj2);
    }

    public final y a() {
        y b10 = b();
        b10.getClass();
        if (y.h(b10, true)) {
            return b10;
        }
        throw new i1();
    }

    public final y b() {
        boolean i10 = this.c.i();
        y yVar = this.c;
        if (!i10) {
            return yVar;
        }
        yVar.getClass();
        y0 y0Var = y0.c;
        y0Var.getClass();
        y0Var.a(yVar.getClass()).c(yVar);
        yVar.j();
        return this.c;
    }

    public final void c() {
        if (!this.c.i()) {
            y k6 = this.f1640b.k();
            d(k6, this.c);
            this.c = k6;
        }
    }

    public final Object clone() {
        w wVar = (w) this.f1640b.e(5);
        wVar.c = b();
        return wVar;
    }
}
