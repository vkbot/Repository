package i9;

import kotlin.jvm.internal.CharCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class o extends i1 {
    public static final o c;

    /* JADX WARN: Type inference failed for: r0v0, types: [i9.o, i9.i1] */
    static {
        CharCompanionObject.INSTANCE.getClass();
        c = new i1(p.f2930a);
    }

    @Override // i9.a
    public final int h(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // i9.u, i9.a
    public final void k(h9.c cVar, int i10, Object obj) {
        n nVar = (n) obj;
        nVar.getClass();
        char decodeCharElement = cVar.decodeCharElement(this.f2907b, i10);
        nVar.b(nVar.d() + 1);
        char[] cArr = nVar.f2923a;
        int i11 = nVar.f2924b;
        nVar.f2924b = i11 + 1;
        cArr[i11] = decodeCharElement;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i9.n, java.lang.Object] */
    @Override // i9.a
    public final Object l(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        ?? obj2 = new Object();
        obj2.f2923a = cArr;
        obj2.f2924b = cArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // i9.i1
    public final Object o() {
        return new char[0];
    }

    @Override // i9.i1
    public final void p(h9.d dVar, Object obj, int i10) {
        char[] cArr = (char[]) obj;
        dVar.getClass();
        cArr.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.encodeCharElement(this.f2907b, i11, cArr[i11]);
        }
    }
}
