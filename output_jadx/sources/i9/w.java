package i9;

import kotlin.jvm.internal.DoubleCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class w extends i1 {
    public static final w c;

    /* JADX WARN: Type inference failed for: r0v0, types: [i9.i1, i9.w] */
    static {
        DoubleCompanionObject.INSTANCE.getClass();
        c = new i1(x.f2957a);
    }

    @Override // i9.a
    public final int h(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // i9.u, i9.a
    public final void k(h9.c cVar, int i10, Object obj) {
        v vVar = (v) obj;
        vVar.getClass();
        double decodeDoubleElement = cVar.decodeDoubleElement(this.f2907b, i10);
        vVar.b(vVar.d() + 1);
        double[] dArr = vVar.f2952a;
        int i11 = vVar.f2953b;
        vVar.f2953b = i11 + 1;
        dArr[i11] = decodeDoubleElement;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i9.v, java.lang.Object] */
    @Override // i9.a
    public final Object l(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        ?? obj2 = new Object();
        obj2.f2952a = dArr;
        obj2.f2953b = dArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // i9.i1
    public final Object o() {
        return new double[0];
    }

    @Override // i9.i1
    public final void p(h9.d dVar, Object obj, int i10) {
        double[] dArr = (double[]) obj;
        dVar.getClass();
        dArr.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.encodeDoubleElement(this.f2907b, i11, dArr[i11]);
        }
    }
}
