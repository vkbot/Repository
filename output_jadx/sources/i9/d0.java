package i9;

import kotlin.jvm.internal.FloatCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class d0 extends i1 {
    public static final d0 c;

    /* JADX WARN: Type inference failed for: r0v0, types: [i9.i1, i9.d0] */
    static {
        FloatCompanionObject.INSTANCE.getClass();
        c = new i1(e0.f2885a);
    }

    @Override // i9.a
    public final int h(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // i9.u, i9.a
    public final void k(h9.c cVar, int i10, Object obj) {
        c0 c0Var = (c0) obj;
        c0Var.getClass();
        float decodeFloatElement = cVar.decodeFloatElement(this.f2907b, i10);
        c0Var.b(c0Var.d() + 1);
        float[] fArr = c0Var.f2875a;
        int i11 = c0Var.f2876b;
        c0Var.f2876b = i11 + 1;
        fArr[i11] = decodeFloatElement;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i9.c0, java.lang.Object] */
    @Override // i9.a
    public final Object l(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        ?? obj2 = new Object();
        obj2.f2875a = fArr;
        obj2.f2876b = fArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // i9.i1
    public final Object o() {
        return new float[0];
    }

    @Override // i9.i1
    public final void p(h9.d dVar, Object obj, int i10) {
        float[] fArr = (float[]) obj;
        dVar.getClass();
        fArr.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.encodeFloatElement(this.f2907b, i11, fArr[i11]);
        }
    }
}
