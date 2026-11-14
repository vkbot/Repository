package y8;

import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import v8.j0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class q extends z8.a implements l, f {
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6664f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f6665g;

    /* renamed from: h, reason: collision with root package name */
    public long f6666h;

    /* renamed from: i, reason: collision with root package name */
    public long f6667i;

    /* renamed from: j, reason: collision with root package name */
    public int f6668j;

    /* renamed from: k, reason: collision with root package name */
    public int f6669k;

    public q(int i10, int i11) {
        this.e = i10;
        this.f6664f = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        if (r8 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        if (r8.b() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        throw ((v8.h1) r8).s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        r0.f6660b = r5;
        r0.c = r2;
        r0.d = r9;
        r0.e = r8;
        r0.f6663h = 3;
        r5 = r5;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
    
        if (r2.emit(r10, r0) != r1) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:14:0x0033, B:18:0x007a, B:20:0x0082, B:29:0x0095, B:32:0x009c, B:33:0x00a2, B:35:0x00a3, B:40:0x004c), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093 A[EDGE_INSN: B:27:0x0093->B:28:0x0093 BREAK  A[LOOP:0: B:18:0x007a->B:26:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r5v1, types: [z8.a] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [y8.q] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [y8.g] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [z8.c] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [y8.s] */
    /* JADX WARN: Type inference failed for: r9v8, types: [y8.s] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b1 -> B:15:0x0036). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object h(y8.q r8, y8.g r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof y8.p
            if (r0 == 0) goto L13
            r0 = r10
            y8.p r0 = (y8.p) r0
            int r1 = r0.f6663h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6663h = r1
            goto L18
        L13:
            y8.p r0 = new y8.p
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f6661f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6663h
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5f
            r8 = 1
            if (r2 == r8) goto L50
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3d
            v8.z0 r8 = r0.e
            y8.s r9 = r0.d
            y8.g r2 = r0.c
            y8.q r5 = r0.f6660b
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L3a
        L36:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L77
        L3a:
            r8 = move-exception
            goto Lb7
        L3d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            j1.i.l(r8)
            r8 = 0
            return r8
        L44:
            v8.z0 r8 = r0.e
            y8.s r9 = r0.d
            y8.g r2 = r0.c
            y8.q r5 = r0.f6660b
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L3a
            goto L7a
        L50:
            y8.s r9 = r0.d
            y8.g r8 = r0.c
            y8.q r2 = r0.f6660b
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L5c
            r10 = r8
            r8 = r2
            goto L6b
        L5c:
            r8 = move-exception
            r5 = r2
            goto Lb7
        L5f:
            kotlin.ResultKt.throwOnFailure(r10)
            z8.c r10 = r8.a()
            y8.s r10 = (y8.s) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6b:
            kotlin.coroutines.CoroutineContext r2 = r0.get$context()     // Catch: java.lang.Throwable -> Lb4
            v8.y0 r5 = v8.y0.f6058b     // Catch: java.lang.Throwable -> Lb4
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Lb4
            v8.z0 r2 = (v8.z0) r2     // Catch: java.lang.Throwable -> Lb4
        L77:
            r5 = r8
            r8 = r2
            r2 = r10
        L7a:
            java.lang.Object r10 = r5.p(r9)     // Catch: java.lang.Throwable -> L3a
            a9.w r6 = y8.r.f6670a     // Catch: java.lang.Throwable -> L3a
            if (r10 != r6) goto L93
            r0.f6660b = r5     // Catch: java.lang.Throwable -> L3a
            r0.c = r2     // Catch: java.lang.Throwable -> L3a
            r0.d = r9     // Catch: java.lang.Throwable -> L3a
            r0.e = r8     // Catch: java.lang.Throwable -> L3a
            r0.f6663h = r4     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r10 = r5.f(r9, r0)     // Catch: java.lang.Throwable -> L3a
            if (r10 != r1) goto L7a
            goto Lb3
        L93:
            if (r8 == 0) goto La3
            boolean r6 = r8.b()     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto L9c
            goto La3
        L9c:
            v8.h1 r8 = (v8.h1) r8     // Catch: java.lang.Throwable -> L3a
            java.util.concurrent.CancellationException r8 = r8.s()     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        La3:
            r0.f6660b = r5     // Catch: java.lang.Throwable -> L3a
            r0.c = r2     // Catch: java.lang.Throwable -> L3a
            r0.d = r9     // Catch: java.lang.Throwable -> L3a
            r0.e = r8     // Catch: java.lang.Throwable -> L3a
            r0.f6663h = r3     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L3a
            if (r10 != r1) goto L36
        Lb3:
            return r1
        Lb4:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb7:
            r5.e(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.q.h(y8.q, y8.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // y8.l
    public final boolean b(Object obj) {
        int i10;
        boolean z9;
        Continuation[] continuationArr = z8.b.f6879a;
        synchronized (this) {
            if (n(obj)) {
                continuationArr = k(continuationArr);
                z9 = true;
            } else {
                z9 = false;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m95constructorimpl(Unit.INSTANCE));
            }
        }
        return z9;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y8.s, java.lang.Object, z8.c] */
    @Override // z8.a
    public final z8.c c() {
        ?? obj = new Object();
        obj.f6672a = -1L;
        return obj;
    }

    @Override // y8.f
    public final Object collect(g gVar, Continuation continuation) {
        return h(this, gVar, continuation);
    }

    @Override // z8.a
    public final z8.c[] d() {
        return new s[2];
    }

    @Override // y8.g
    public final Object emit(Object obj, Continuation continuation) {
        Throwable th;
        Continuation[] k6;
        o oVar;
        if (b(obj)) {
            return Unit.INSTANCE;
        }
        v8.e eVar = new v8.e(1, IntrinsicsKt.intercepted(continuation));
        eVar.r();
        Continuation[] continuationArr = z8.b.f6879a;
        synchronized (this) {
            try {
                if (n(obj)) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        eVar.resumeWith(Result.m95constructorimpl(Unit.INSTANCE));
                        k6 = k(continuationArr);
                        oVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        oVar = new o(this, l() + this.f6668j + this.f6669k, obj, eVar);
                        j(oVar);
                        this.f6669k++;
                        if (this.e == 0) {
                            continuationArr = k(continuationArr);
                        }
                        k6 = continuationArr;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (oVar != null) {
                    eVar.t(new j0(0, oVar));
                }
                for (Continuation continuation2 : k6) {
                    if (continuation2 != null) {
                        Result.Companion companion2 = Result.INSTANCE;
                        continuation2.resumeWith(Result.m95constructorimpl(Unit.INSTANCE));
                    }
                }
                Object q8 = eVar.q();
                if (q8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                if (q8 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    q8 = Unit.INSTANCE;
                }
                if (q8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return q8;
                }
                return Unit.INSTANCE;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final Object f(s sVar, p pVar) {
        v8.e eVar = new v8.e(1, IntrinsicsKt.intercepted(pVar));
        eVar.r();
        synchronized (this) {
            try {
                if (o(sVar) < 0) {
                    sVar.f6673b = eVar;
                } else {
                    Result.Companion companion = Result.INSTANCE;
                    eVar.resumeWith(Result.m95constructorimpl(Unit.INSTANCE));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object q8 = eVar.q();
        if (q8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(pVar);
        }
        if (q8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return q8;
        }
        return Unit.INSTANCE;
    }

    public final void g() {
        if (this.e != 0 || this.f6669k > 1) {
            Object[] objArr = this.f6665g;
            objArr.getClass();
            while (this.f6669k > 0) {
                long l10 = l();
                int i10 = this.f6668j;
                int i11 = this.f6669k;
                if (objArr[((int) ((l10 + (i10 + i11)) - 1)) & (objArr.length - 1)] == r.f6670a) {
                    this.f6669k = i11 - 1;
                    r.b(objArr, l() + this.f6668j + this.f6669k, null);
                } else {
                    return;
                }
            }
        }
    }

    public final void i() {
        z8.c[] cVarArr;
        Object[] objArr = this.f6665g;
        objArr.getClass();
        r.b(objArr, l(), null);
        this.f6668j--;
        long l10 = l() + 1;
        if (this.f6666h < l10) {
            this.f6666h = l10;
        }
        if (this.f6667i < l10) {
            if (this.c != 0 && (cVarArr = this.f6878b) != null) {
                for (z8.c cVar : cVarArr) {
                    if (cVar != null) {
                        s sVar = (s) cVar;
                        long j10 = sVar.f6672a;
                        if (j10 >= 0 && j10 < l10) {
                            sVar.f6672a = l10;
                        }
                    }
                }
            }
            this.f6667i = l10;
        }
    }

    public final void j(Object obj) {
        int i10 = this.f6668j + this.f6669k;
        Object[] objArr = this.f6665g;
        if (objArr == null) {
            objArr = m(0, 2, null);
        } else if (i10 >= objArr.length) {
            objArr = m(i10, objArr.length * 2, objArr);
        }
        r.b(objArr, l() + i10, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Continuation[] k(Continuation[] continuationArr) {
        z8.c[] cVarArr;
        s sVar;
        v8.e eVar;
        int length = continuationArr.length;
        if (this.c != 0 && (cVarArr = this.f6878b) != null) {
            int length2 = cVarArr.length;
            int i10 = 0;
            continuationArr = continuationArr;
            while (i10 < length2) {
                z8.c cVar = cVarArr[i10];
                if (cVar != null && (eVar = (sVar = (s) cVar).f6673b) != null && o(sVar) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        continuationArr = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                    }
                    continuationArr[length] = eVar;
                    sVar.f6673b = null;
                    length++;
                }
                i10++;
                continuationArr = continuationArr;
            }
        }
        return continuationArr;
    }

    public final long l() {
        return Math.min(this.f6667i, this.f6666h);
    }

    public final Object[] m(int i10, int i11, Object[] objArr) {
        if (i11 > 0) {
            Object[] objArr2 = new Object[i11];
            this.f6665g = objArr2;
            if (objArr != null) {
                long l10 = l();
                for (int i12 = 0; i12 < i10; i12++) {
                    long j10 = i12 + l10;
                    r.b(objArr2, j10, objArr[((int) j10) & (objArr.length - 1)]);
                }
            }
            return objArr2;
        }
        j1.i.l("Buffer size overflow");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r1 != 2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.c
            r9 = 1
            if (r1 != 0) goto L1d
            r12.j(r13)
            int r1 = r12.f6668j
            int r1 = r1 + r9
            r12.f6668j = r1
            if (r1 <= r9) goto L12
            r12.i()
        L12:
            long r1 = r12.l()
            int r3 = r12.f6668j
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.f6667i = r1
            return r9
        L1d:
            int r1 = r12.f6668j
            int r2 = r12.e
            if (r1 < r2) goto L39
            long r3 = r12.f6667i
            long r5 = r12.f6666h
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L39
            int r1 = r12.f6664f
            int r1 = com.bumptech.glide.g.c(r1)
            if (r1 == 0) goto L37
            r3 = 2
            if (r1 == r3) goto L71
            goto L39
        L37:
            r1 = 0
            return r1
        L39:
            r12.j(r13)
            int r1 = r12.f6668j
            int r1 = r1 + r9
            r12.f6668j = r1
            if (r1 <= r2) goto L46
            r12.i()
        L46:
            long r1 = r12.l()
            int r3 = r12.f6668j
            long r3 = (long) r3
            long r1 = r1 + r3
            long r3 = r12.f6666h
            long r1 = r1 - r3
            int r1 = (int) r1
            if (r1 <= r9) goto L71
            r1 = 1
            long r1 = r1 + r3
            long r3 = r12.f6667i
            long r5 = r12.l()
            int r7 = r12.f6668j
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.l()
            int r10 = r12.f6668j
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.f6669k
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.q(r1, r3, r5, r7)
        L71:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.q.n(java.lang.Object):boolean");
    }

    public final long o(s sVar) {
        long j10 = sVar.f6672a;
        if (j10 >= l() + this.f6668j) {
            if (this.e > 0 || j10 > l() || this.f6669k == 0) {
                return -1L;
            }
            return j10;
        }
        return j10;
    }

    public final Object p(s sVar) {
        Object obj;
        Continuation[] continuationArr = z8.b.f6879a;
        synchronized (this) {
            try {
                long o5 = o(sVar);
                if (o5 < 0) {
                    obj = r.f6670a;
                } else {
                    long j10 = sVar.f6672a;
                    Object[] objArr = this.f6665g;
                    objArr.getClass();
                    Object obj2 = objArr[((int) o5) & (objArr.length - 1)];
                    if (obj2 instanceof o) {
                        obj2 = ((o) obj2).d;
                    }
                    sVar.f6672a = o5 + 1;
                    Object obj3 = obj2;
                    continuationArr = r(j10);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m95constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    public final void q(long j10, long j11, long j12, long j13) {
        long min = Math.min(j11, j10);
        for (long l10 = l(); l10 < min; l10++) {
            Object[] objArr = this.f6665g;
            objArr.getClass();
            r.b(objArr, l10, null);
        }
        this.f6666h = j10;
        this.f6667i = j11;
        this.f6668j = (int) (j12 - min);
        this.f6669k = (int) (j13 - j12);
    }

    public final Continuation[] r(long j10) {
        long j11;
        long j12;
        int i10;
        Continuation[] continuationArr;
        long j13;
        Continuation[] continuationArr2;
        z8.c[] cVarArr;
        a9.w wVar = r.f6670a;
        Continuation[] continuationArr3 = z8.b.f6879a;
        if (j10 <= this.f6667i) {
            long l10 = l();
            long j14 = this.f6668j + l10;
            int i11 = this.e;
            if (i11 == 0 && this.f6669k > 0) {
                j14++;
            }
            if (this.c != 0 && (cVarArr = this.f6878b) != null) {
                for (z8.c cVar : cVarArr) {
                    if (cVar != null) {
                        long j15 = ((s) cVar).f6672a;
                        if (j15 >= 0 && j15 < j14) {
                            j14 = j15;
                        }
                    }
                }
            }
            if (j14 > this.f6667i) {
                long l11 = l() + this.f6668j;
                int i12 = this.c;
                int i13 = this.f6669k;
                if (i12 > 0) {
                    j11 = 1;
                    i13 = Math.min(i13, i11 - ((int) (l11 - j14)));
                } else {
                    j11 = 1;
                }
                long j16 = this.f6669k + l11;
                if (i13 > 0) {
                    Continuation[] continuationArr4 = new Continuation[i13];
                    Object[] objArr = this.f6665g;
                    objArr.getClass();
                    int i14 = 0;
                    long j17 = l11;
                    i10 = 1;
                    while (true) {
                        if (l11 < j16) {
                            continuationArr2 = continuationArr4;
                            Object obj = objArr[((int) l11) & (objArr.length - 1)];
                            if (obj != wVar) {
                                obj.getClass();
                                o oVar = (o) obj;
                                j12 = l10;
                                int i15 = i14 + 1;
                                continuationArr2[i14] = oVar.e;
                                r.b(objArr, l11, wVar);
                                r.b(objArr, j17, oVar.d);
                                j17 += j11;
                                if (i15 >= i13) {
                                    break;
                                }
                                i14 = i15;
                            } else {
                                j12 = l10;
                            }
                            l11 += j11;
                            continuationArr4 = continuationArr2;
                            l10 = j12;
                        } else {
                            continuationArr2 = continuationArr4;
                            j12 = l10;
                            break;
                        }
                    }
                    l11 = j17;
                    continuationArr = continuationArr2;
                } else {
                    j12 = l10;
                    i10 = 1;
                    continuationArr = continuationArr3;
                }
                int i16 = (int) (l11 - j12);
                if (this.c == 0) {
                    j13 = l11;
                } else {
                    j13 = j14;
                }
                int i17 = i10;
                long max = Math.max(this.f6666h, l11 - Math.min(i17, i16));
                if (i11 == 0 && max < j16) {
                    Object[] objArr2 = this.f6665g;
                    objArr2.getClass();
                    if (Intrinsics.areEqual(objArr2[((int) max) & (objArr2.length - i17)], wVar)) {
                        l11 += j11;
                        max += j11;
                    }
                }
                q(max, j13, l11, j16);
                g();
                if (continuationArr.length == 0) {
                    return continuationArr;
                }
                return k(continuationArr);
            }
        }
        return continuationArr3;
    }
}
