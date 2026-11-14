package i9;

import kotlin.jvm.internal.BooleanCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class f extends i1 {
    public static final f c;

    /* JADX WARN: Type inference failed for: r0v0, types: [i9.i1, i9.f] */
    static {
        BooleanCompanionObject.INSTANCE.getClass();
        c = new i1(g.f2900a);
    }

    @Override // i9.a
    public final int h(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // i9.u, i9.a
    public final void k(h9.c cVar, int i10, Object obj) {
        e eVar = (e) obj;
        eVar.getClass();
        boolean decodeBooleanElement = cVar.decodeBooleanElement(this.f2907b, i10);
        eVar.b(eVar.d() + 1);
        boolean[] zArr = eVar.f2883a;
        int i11 = eVar.f2884b;
        eVar.f2884b = i11 + 1;
        zArr[i11] = decodeBooleanElement;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i9.e, java.lang.Object] */
    @Override // i9.a
    public final Object l(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        ?? obj2 = new Object();
        obj2.f2883a = zArr;
        obj2.f2884b = zArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // i9.i1
    public final Object o() {
        return new boolean[0];
    }

    @Override // i9.i1
    public final void p(h9.d dVar, Object obj, int i10) {
        boolean[] zArr = (boolean[]) obj;
        dVar.getClass();
        zArr.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.encodeBooleanElement(this.f2907b, i11, zArr[i11]);
        }
    }
}
