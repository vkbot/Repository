package y8;

import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class d implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f6649b;
    public final /* synthetic */ Ref.ObjectRef c;
    public final /* synthetic */ g d;

    public d(e eVar, Ref.ObjectRef objectRef, g gVar) {
        this.f6649b = eVar;
        this.c = objectRef;
        this.d = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
    @Override // y8.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof y8.c
            if (r0 == 0) goto L13
            r0 = r9
            y8.c r0 = (y8.c) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            y8.c r0 = new y8.c
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f6648b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r9)
            goto L62
        L29:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            j1.i.l(r8)
            r8 = 0
            return r8
        L30:
            kotlin.ResultKt.throwOnFailure(r9)
            y8.e r9 = r7.f6649b
            kotlin.jvm.functions.Function1 r2 = r9.c
            java.lang.Object r2 = r2.invoke(r8)
            kotlin.jvm.internal.Ref$ObjectRef r4 = r7.c
            T r5 = r4.element
            a9.w r6 = z8.b.f6880b
            if (r5 == r6) goto L55
            kotlin.jvm.functions.Function2 r9 = r9.d
            java.lang.Object r9 = r9.invoke(r5, r2)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L52
            goto L55
        L52:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L55:
            r4.element = r2
            r0.d = r3
            y8.g r9 = r7.d
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.d.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
