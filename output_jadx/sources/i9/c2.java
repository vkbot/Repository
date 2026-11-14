package i9;

import kotlin.UShort;
import kotlin.UShortArray;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class c2 extends i1 {
    public static final c2 c;

    /* JADX WARN: Type inference failed for: r0v0, types: [i9.i1, i9.c2] */
    static {
        UShort.INSTANCE.getClass();
        c = new i1(d2.f2881a);
    }

    @Override // i9.a
    public final int h(Object obj) {
        short[] storage = ((UShortArray) obj).getStorage();
        storage.getClass();
        return UShortArray.m435getSizeimpl(storage);
    }

    @Override // i9.u, i9.a
    public final void k(h9.c cVar, int i10, Object obj) {
        b2 b2Var = (b2) obj;
        b2Var.getClass();
        short m376constructorimpl = UShort.m376constructorimpl(cVar.decodeInlineElement(this.f2907b, i10).decodeShort());
        b2Var.b(b2Var.d() + 1);
        short[] sArr = b2Var.f2872a;
        int i11 = b2Var.f2873b;
        b2Var.f2873b = i11 + 1;
        UShortArray.m439set01HTLdE(sArr, i11, m376constructorimpl);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, i9.b2] */
    @Override // i9.a
    public final Object l(Object obj) {
        short[] storage = ((UShortArray) obj).getStorage();
        storage.getClass();
        ?? obj2 = new Object();
        obj2.f2872a = storage;
        obj2.f2873b = UShortArray.m435getSizeimpl(storage);
        obj2.b(10);
        return obj2;
    }

    @Override // i9.i1
    public final Object o() {
        return UShortArray.m427boximpl(UShortArray.m428constructorimpl(0));
    }

    @Override // i9.i1
    public final void p(h9.d dVar, Object obj, int i10) {
        short[] storage = ((UShortArray) obj).getStorage();
        dVar.getClass();
        storage.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.encodeInlineElement(this.f2907b, i11).encodeShort(UShortArray.m434getMh2AYeg(storage, i11));
        }
    }
}
