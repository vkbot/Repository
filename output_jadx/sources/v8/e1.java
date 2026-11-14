package v8;

import kotlin.Unit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class e1 extends d1 {

    /* renamed from: f, reason: collision with root package name */
    public final h1 f6022f;

    /* renamed from: g, reason: collision with root package name */
    public final f1 f6023g;

    /* renamed from: h, reason: collision with root package name */
    public final i f6024h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f6025i;

    public e1(h1 h1Var, f1 f1Var, i iVar, Object obj) {
        this.f6022f = h1Var;
        this.f6023g = f1Var;
        this.f6024h = iVar;
        this.f6025i = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        r0.i(r0.r(r1, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000c, code lost:
    
        if (r7 != null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (v8.x0.a(r7.f6032f, new v8.e1(r0, r1, r7, r2), 1) == v8.k1.f6039b) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        r7 = v8.h1.C(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r7 != null) goto L13;
     */
    @Override // v8.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.Throwable r7) {
        /*
            r6 = this;
            v8.i r7 = r6.f6024h
            v8.i r7 = v8.h1.C(r7)
            v8.h1 r0 = r6.f6022f
            v8.f1 r1 = r6.f6023g
            java.lang.Object r2 = r6.f6025i
            if (r7 == 0) goto L25
        Le:
            v8.h1 r3 = r7.f6032f
            v8.e1 r4 = new v8.e1
            r4.<init>(r0, r1, r7, r2)
            r5 = 1
            v8.i0 r3 = v8.x0.a(r3, r4, r5)
            v8.k1 r4 = v8.k1.f6039b
            if (r3 == r4) goto L1f
            return
        L1f:
            v8.i r7 = v8.h1.C(r7)
            if (r7 != 0) goto Le
        L25:
            java.lang.Object r7 = r0.r(r1, r2)
            r0.i(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.e1.j(java.lang.Throwable):void");
    }
}
