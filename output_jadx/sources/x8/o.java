package x8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class o {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(x8.q r4, kotlin.jvm.functions.Function0 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof x8.n
            if (r0 == 0) goto L13
            r0 = r6
            x8.n r0 = (x8.n) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            x8.n r0 = new x8.n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f6541b
            r5 = r4
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2e
            goto L71
        L2e:
            r4 = move-exception
            goto L77
        L30:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            j1.i.l(r4)
            r4 = 0
            return r4
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.get$context()
            v8.y0 r2 = v8.y0.f6058b
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r2)
            if (r6 != r4) goto L7b
            r0.f6541b = r5     // Catch: java.lang.Throwable -> L2e
            r0.d = r3     // Catch: java.lang.Throwable -> L2e
            v8.e r6 = new v8.e     // Catch: java.lang.Throwable -> L2e
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r3, r2)     // Catch: java.lang.Throwable -> L2e
            r6.r()     // Catch: java.lang.Throwable -> L2e
            d9.h r2 = new d9.h     // Catch: java.lang.Throwable -> L2e
            r3 = 6
            r2.<init>(r3, r6)     // Catch: java.lang.Throwable -> L2e
            x8.g r4 = (x8.g) r4     // Catch: java.lang.Throwable -> L2e
            r4.M(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r6.q()     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L2e
            if (r4 != r6) goto L6e
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L2e
        L6e:
            if (r4 != r1) goto L71
            return r1
        L71:
            r5.invoke()
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L77:
            r5.invoke()
            throw r4
        L7b:
            java.lang.String r4 = "awaitClose() can only be invoked from the producer context"
            j1.i.l(r4)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.o.a(x8.q, kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
