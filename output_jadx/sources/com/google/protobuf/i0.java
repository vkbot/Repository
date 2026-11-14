package com.google.protobuf;

import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i0 extends j0 {
    @Override // com.google.protobuf.j0
    public final void a(Object obj, long j10) {
        b bVar = (b) ((a0) s1.c.i(obj, j10));
        if (bVar.f1534b) {
            bVar.f1534b = false;
        }
    }

    @Override // com.google.protobuf.j0
    public final void b(long j10, Object obj, Object obj2) {
        r1 r1Var = s1.c;
        a0 a0Var = (a0) r1Var.i(obj, j10);
        a0 a0Var2 = (a0) r1Var.i(obj2, j10);
        int size = a0Var.size();
        int size2 = a0Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((b) a0Var).f1534b) {
                a0Var = a0Var.c(size2 + size);
            }
            a0Var.addAll(a0Var2);
        }
        if (size > 0) {
            a0Var2 = a0Var;
        }
        s1.p(j10, obj, a0Var2);
    }

    @Override // com.google.protobuf.j0
    public final List c(Object obj, long j10) {
        int i10;
        a0 a0Var = (a0) s1.c.i(obj, j10);
        if (!((b) a0Var).f1534b) {
            int size = a0Var.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            a0 c = a0Var.c(i10);
            s1.p(j10, obj, c);
            return c;
        }
        return a0Var;
    }
}
