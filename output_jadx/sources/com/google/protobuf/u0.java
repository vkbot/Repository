package com.google.protobuf;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class u0 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final a f1635a;

    /* renamed from: b, reason: collision with root package name */
    public final k1 f1636b;
    public final r c;

    public u0(k1 k1Var, r rVar, a aVar) {
        this.f1636b = k1Var;
        rVar.getClass();
        this.c = rVar;
        this.f1635a = aVar;
    }

    @Override // com.google.protobuf.b1
    public final void a(Object obj, l0 l0Var) {
        this.c.getClass();
        q.q(obj);
        throw null;
    }

    @Override // com.google.protobuf.b1
    public final void b(Object obj, Object obj2) {
        c1.j(this.f1636b, obj, obj2);
    }

    @Override // com.google.protobuf.b1
    public final void c(Object obj) {
        this.f1636b.getClass();
        j1 j1Var = ((y) obj).unknownFields;
        if (j1Var.e) {
            j1Var.e = false;
        }
        this.c.getClass();
        q.q(obj);
        throw null;
    }

    @Override // com.google.protobuf.b1
    public final boolean d(Object obj) {
        this.c.getClass();
        q.q(obj);
        throw null;
    }

    @Override // com.google.protobuf.b1
    public final int e(y yVar) {
        this.f1636b.getClass();
        return yVar.unknownFields.hashCode();
    }

    @Override // com.google.protobuf.b1
    public final int f(y yVar) {
        this.f1636b.getClass();
        j1 j1Var = yVar.unknownFields;
        int i10 = j1Var.d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < j1Var.f1584a; i12++) {
            int i13 = j1Var.f1585b[i12] >>> 3;
            g gVar = (g) j1Var.c[i12];
            int d = n.d(i13) + n.c(2) + (n.c(1) * 2);
            int c = n.c(3);
            int size = gVar.size();
            i11 += n.d(size) + size + c + d;
        }
        j1Var.d = i11;
        return i11;
    }

    @Override // com.google.protobuf.b1
    public final boolean g(y yVar, y yVar2) {
        this.f1636b.getClass();
        if (!yVar.unknownFields.equals(yVar2.unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.b1
    public final void h(Object obj, c3.i iVar, p pVar) {
        this.f1636b.getClass();
        k1.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.protobuf.b1
    public final y i() {
        a aVar = this.f1635a;
        if (aVar instanceof y) {
            return ((y) aVar).k();
        }
        return ((w) ((y) aVar).e(5)).b();
    }
}
