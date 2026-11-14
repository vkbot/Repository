package i9;

import kotlin.ULong;
import kotlin.ULongArray;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class z1 extends i1 {
    public static final z1 c;

    /* JADX WARN: Type inference failed for: r0v0, types: [i9.i1, i9.z1] */
    static {
        ULong.INSTANCE.getClass();
        c = new i1(a2.f2866a);
    }

    @Override // i9.a
    public final int h(Object obj) {
        long[] storage = ((ULongArray) obj).getStorage();
        storage.getClass();
        return ULongArray.m330getSizeimpl(storage);
    }

    @Override // i9.u, i9.a
    public final void k(h9.c cVar, int i10, Object obj) {
        y1 y1Var = (y1) obj;
        y1Var.getClass();
        long m269constructorimpl = ULong.m269constructorimpl(cVar.decodeInlineElement(this.f2907b, i10).decodeLong());
        y1Var.b(y1Var.d() + 1);
        long[] jArr = y1Var.f2966a;
        int i11 = y1Var.f2967b;
        y1Var.f2967b = i11 + 1;
        ULongArray.m334setk8EXiF4(jArr, i11, m269constructorimpl);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i9.y1, java.lang.Object] */
    @Override // i9.a
    public final Object l(Object obj) {
        long[] storage = ((ULongArray) obj).getStorage();
        storage.getClass();
        ?? obj2 = new Object();
        obj2.f2966a = storage;
        obj2.f2967b = ULongArray.m330getSizeimpl(storage);
        obj2.b(10);
        return obj2;
    }

    @Override // i9.i1
    public final Object o() {
        return ULongArray.m322boximpl(ULongArray.m323constructorimpl(0));
    }

    @Override // i9.i1
    public final void p(h9.d dVar, Object obj, int i10) {
        long[] storage = ((ULongArray) obj).getStorage();
        dVar.getClass();
        storage.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.encodeInlineElement(this.f2907b, i11).encodeLong(ULongArray.m329getsVKNKU(storage, i11));
        }
    }
}
