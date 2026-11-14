package i9;

import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class p0 extends i1 {
    public static final p0 c;

    /* JADX WARN: Type inference failed for: r0v0, types: [i9.i1, i9.p0] */
    static {
        LongCompanionObject.INSTANCE.getClass();
        c = new i1(q0.f2934a);
    }

    @Override // i9.a
    public final int h(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // i9.u, i9.a
    public final void k(h9.c cVar, int i10, Object obj) {
        o0 o0Var = (o0) obj;
        o0Var.getClass();
        long decodeLongElement = cVar.decodeLongElement(this.f2907b, i10);
        o0Var.b(o0Var.d() + 1);
        long[] jArr = o0Var.f2928a;
        int i11 = o0Var.f2929b;
        o0Var.f2929b = i11 + 1;
        jArr[i11] = decodeLongElement;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, i9.o0] */
    @Override // i9.a
    public final Object l(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        ?? obj2 = new Object();
        obj2.f2928a = jArr;
        obj2.f2929b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // i9.i1
    public final Object o() {
        return new long[0];
    }

    @Override // i9.i1
    public final void p(h9.d dVar, Object obj, int i10) {
        long[] jArr = (long[]) obj;
        dVar.getClass();
        jArr.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.encodeLongElement(this.f2907b, i11, jArr[i11]);
        }
    }
}
