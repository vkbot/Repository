package i9;

import kotlin.UByte;
import kotlin.UByteArray;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class t1 extends i1 {
    public static final t1 c;

    /* JADX WARN: Type inference failed for: r0v0, types: [i9.i1, i9.t1] */
    static {
        UByte.INSTANCE.getClass();
        c = new i1(u1.f2950a);
    }

    @Override // i9.a
    public final int h(Object obj) {
        byte[] storage = ((UByteArray) obj).getStorage();
        storage.getClass();
        return UByteArray.m172getSizeimpl(storage);
    }

    @Override // i9.u, i9.a
    public final void k(h9.c cVar, int i10, Object obj) {
        s1 s1Var = (s1) obj;
        s1Var.getClass();
        byte m113constructorimpl = UByte.m113constructorimpl(cVar.decodeInlineElement(this.f2907b, i10).decodeByte());
        s1Var.b(s1Var.d() + 1);
        byte[] bArr = s1Var.f2943a;
        int i11 = s1Var.f2944b;
        s1Var.f2944b = i11 + 1;
        UByteArray.m176setVurrAj0(bArr, i11, m113constructorimpl);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, i9.s1] */
    @Override // i9.a
    public final Object l(Object obj) {
        byte[] storage = ((UByteArray) obj).getStorage();
        storage.getClass();
        ?? obj2 = new Object();
        obj2.f2943a = storage;
        obj2.f2944b = UByteArray.m172getSizeimpl(storage);
        obj2.b(10);
        return obj2;
    }

    @Override // i9.i1
    public final Object o() {
        return UByteArray.m164boximpl(UByteArray.m165constructorimpl(0));
    }

    @Override // i9.i1
    public final void p(h9.d dVar, Object obj, int i10) {
        byte[] storage = ((UByteArray) obj).getStorage();
        dVar.getClass();
        storage.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.encodeInlineElement(this.f2907b, i11).encodeByte(UByteArray.m171getw2LRezQ(storage, i11));
        }
    }
}
