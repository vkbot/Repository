package i9;

import kotlin.UInt;
import kotlin.UIntArray;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class w1 extends i1 {
    public static final w1 c;

    /* JADX WARN: Type inference failed for: r0v0, types: [i9.i1, i9.w1] */
    static {
        UInt.INSTANCE.getClass();
        c = new i1(x1.f2961a);
    }

    @Override // i9.a
    public final int h(Object obj) {
        int[] storage = ((UIntArray) obj).getStorage();
        storage.getClass();
        return UIntArray.m251getSizeimpl(storage);
    }

    @Override // i9.u, i9.a
    public final void k(h9.c cVar, int i10, Object obj) {
        v1 v1Var = (v1) obj;
        v1Var.getClass();
        int m190constructorimpl = UInt.m190constructorimpl(cVar.decodeInlineElement(this.f2907b, i10).decodeInt());
        v1Var.b(v1Var.d() + 1);
        int[] iArr = v1Var.f2955a;
        int i11 = v1Var.f2956b;
        v1Var.f2956b = i11 + 1;
        UIntArray.m255setVXSXFK8(iArr, i11, m190constructorimpl);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, i9.v1] */
    @Override // i9.a
    public final Object l(Object obj) {
        int[] storage = ((UIntArray) obj).getStorage();
        storage.getClass();
        ?? obj2 = new Object();
        obj2.f2955a = storage;
        obj2.f2956b = UIntArray.m251getSizeimpl(storage);
        obj2.b(10);
        return obj2;
    }

    @Override // i9.i1
    public final Object o() {
        return UIntArray.m243boximpl(UIntArray.m244constructorimpl(0));
    }

    @Override // i9.i1
    public final void p(h9.d dVar, Object obj, int i10) {
        int[] storage = ((UIntArray) obj).getStorage();
        dVar.getClass();
        storage.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.encodeInlineElement(this.f2907b, i11).encodeInt(UIntArray.m250getpVg5ArA(storage, i11));
        }
    }
}
