package i9;

import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class i extends i1 {
    public static final i c;

    /* JADX WARN: Type inference failed for: r0v0, types: [i9.i1, i9.i] */
    static {
        ByteCompanionObject.INSTANCE.getClass();
        c = new i1(j.f2908a);
    }

    @Override // i9.a
    public final int h(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // i9.u, i9.a
    public final void k(h9.c cVar, int i10, Object obj) {
        h hVar = (h) obj;
        hVar.getClass();
        byte decodeByteElement = cVar.decodeByteElement(this.f2907b, i10);
        hVar.b(hVar.d() + 1);
        byte[] bArr = hVar.f2902a;
        int i11 = hVar.f2903b;
        hVar.f2903b = i11 + 1;
        bArr[i11] = decodeByteElement;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, i9.h] */
    @Override // i9.a
    public final Object l(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        ?? obj2 = new Object();
        obj2.f2902a = bArr;
        obj2.f2903b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // i9.i1
    public final Object o() {
        return new byte[0];
    }

    @Override // i9.i1
    public final void p(h9.d dVar, Object obj, int i10) {
        byte[] bArr = (byte[]) obj;
        dVar.getClass();
        bArr.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.encodeByteElement(this.f2907b, i11, bArr[i11]);
        }
    }
}
