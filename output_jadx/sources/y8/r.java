package y8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final a9.w f6670a = new a9.w("NO_VALUE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final a9.w f6671b = new a9.w("NONE", 0);
    public static final a9.w c = new a9.w("PENDING", 0);

    public static final v a(Object obj) {
        if (obj == null) {
            obj = z8.b.f6880b;
        }
        return new v(obj);
    }

    public static final void b(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #1 {all -> 0x0038, blocks: (B:12:0x0031, B:14:0x005a, B:20:0x006e, B:22:0x0076, B:32:0x0049, B:34:0x0050), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation, y8.h] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [y8.g] */
    /* JADX WARN: Type inference failed for: r2v3, types: [x8.a] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r8v5, types: [x8.f] */
    /* JADX WARN: Type inference failed for: r8v6, types: [x8.f] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0088 -> B:13:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(y8.g r7, x8.p r8, boolean r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            boolean r0 = r10 instanceof y8.h
            if (r0 == 0) goto L13
            r0 = r10
            y8.h r0 = (y8.h) r0
            int r1 = r0.f6653g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6653g = r1
            goto L18
        L13:
            y8.h r0 = new y8.h
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f6652f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6653g
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L41
            if (r2 != r4) goto L3a
            boolean r9 = r0.e
            x8.a r7 = r0.d
            x8.f r8 = r0.c
            y8.g r2 = r0.f6651b
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r6 = r2
            r2 = r7
            r7 = r6
            goto L5a
        L38:
            r7 = move-exception
            goto L93
        L3a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            j1.i.l(r7)
            r7 = 0
            return r7
        L41:
            boolean r9 = r0.e
            x8.a r7 = r0.d
            x8.f r8 = r0.c
            y8.g r2 = r0.f6651b
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L38
            goto L6e
        L4d:
            kotlin.ResultKt.throwOnFailure(r10)
            x8.b r10 = r8.e     // Catch: java.lang.Throwable -> L38
            r10.getClass()     // Catch: java.lang.Throwable -> L38
            x8.a r2 = new x8.a     // Catch: java.lang.Throwable -> L38
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L38
        L5a:
            r0.f6651b = r7     // Catch: java.lang.Throwable -> L38
            r0.c = r8     // Catch: java.lang.Throwable -> L38
            r0.d = r2     // Catch: java.lang.Throwable -> L38
            r0.e = r9     // Catch: java.lang.Throwable -> L38
            r0.f6653g = r5     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.c(r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L6b
            goto L8a
        L6b:
            r6 = r2
            r2 = r7
            r7 = r6
        L6e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L38
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r10 == 0) goto L8b
            java.lang.Object r10 = r7.d()     // Catch: java.lang.Throwable -> L38
            r0.f6651b = r2     // Catch: java.lang.Throwable -> L38
            r0.c = r8     // Catch: java.lang.Throwable -> L38
            r0.d = r7     // Catch: java.lang.Throwable -> L38
            r0.e = r9     // Catch: java.lang.Throwable -> L38
            r0.f6653g = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
        L8a:
            return r1
        L8b:
            if (r9 == 0) goto L90
            r8.c(r3)
        L90:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L93:
            throw r7     // Catch: java.lang.Throwable -> L94
        L94:
            r10 = move-exception
            if (r9 == 0) goto Lad
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L9e
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L9e:
            if (r3 != 0) goto Laa
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r3.<init>(r9)
            r3.initCause(r7)
        Laa:
            r8.c(r3)
        Lad:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.r.c(y8.g, x8.p, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
