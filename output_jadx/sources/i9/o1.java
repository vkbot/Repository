package i9;

import kotlin.jvm.internal.ShortCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class o1 extends i1 {
    public static final o1 c;

    /* JADX WARN: Type inference failed for: r0v0, types: [i9.o1, i9.i1] */
    static {
        ShortCompanionObject.INSTANCE.getClass();
        c = new i1(p1.f2932a);
    }

    @Override // i9.a
    public final int h(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // i9.u, i9.a
    public final void k(h9.c cVar, int i10, Object obj) {
        n1 n1Var = (n1) obj;
        n1Var.getClass();
        short decodeShortElement = cVar.decodeShortElement(this.f2907b, i10);
        n1Var.b(n1Var.d() + 1);
        short[] sArr = n1Var.f2926a;
        int i11 = n1Var.f2927b;
        n1Var.f2927b = i11 + 1;
        sArr[i11] = decodeShortElement;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i9.n1, java.lang.Object] */
    @Override // i9.a
    public final Object l(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        ?? obj2 = new Object();
        obj2.f2926a = sArr;
        obj2.f2927b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // i9.i1
    public final Object o() {
        return new short[0];
    }

    @Override // i9.i1
    public final void p(h9.d dVar, Object obj, int i10) {
        short[] sArr = (short[]) obj;
        dVar.getClass();
        sArr.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.encodeShortElement(this.f2907b, i11, sArr[i11]);
        }
    }
}
