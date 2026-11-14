package i9;

import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class k0 extends i1 {
    public static final k0 c;

    /* JADX WARN: Type inference failed for: r0v0, types: [i9.k0, i9.i1] */
    static {
        IntCompanionObject.INSTANCE.getClass();
        c = new i1(l0.f2916a);
    }

    @Override // i9.a
    public final int h(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // i9.u, i9.a
    public final void k(h9.c cVar, int i10, Object obj) {
        j0 j0Var = (j0) obj;
        j0Var.getClass();
        int decodeIntElement = cVar.decodeIntElement(this.f2907b, i10);
        j0Var.b(j0Var.d() + 1);
        int[] iArr = j0Var.f2910a;
        int i11 = j0Var.f2911b;
        j0Var.f2911b = i11 + 1;
        iArr[i11] = decodeIntElement;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i9.j0, java.lang.Object] */
    @Override // i9.a
    public final Object l(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        ?? obj2 = new Object();
        obj2.f2910a = iArr;
        obj2.f2911b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // i9.i1
    public final Object o() {
        return new int[0];
    }

    @Override // i9.i1
    public final void p(h9.d dVar, Object obj, int i10) {
        int[] iArr = (int[]) obj;
        dVar.getClass();
        iArr.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.encodeIntElement(this.f2907b, i11, iArr[i11]);
        }
    }
}
