package v8;

import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class f0 extends c9.h {
    public int d;

    public f0(int i10) {
        super(0L, c9.k.f603g);
        this.d = i10;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract Continuation e();

    public Throwable f(Object obj) {
        k kVar;
        if (obj instanceof k) {
            kVar = (k) obj;
        } else {
            kVar = null;
        }
        if (kVar == null) {
            return null;
        }
        return kVar.f6037a;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            ExceptionsKt.addSuppressed(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        th.getClass();
        w.a(new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), e().get$context());
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        r6 = (v8.z0) r6.get(v8.y0.f6058b);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r12 = this;
            c9.i r0 = r12.c
            kotlin.coroutines.Continuation r1 = r12.e()     // Catch: java.lang.Throwable -> L21
            r1.getClass()     // Catch: java.lang.Throwable -> L21
            a9.h r1 = (a9.h) r1     // Catch: java.lang.Throwable -> L21
            kotlin.coroutines.Continuation r2 = r1.f72f     // Catch: java.lang.Throwable -> L21
            java.lang.Object r1 = r1.f74h     // Catch: java.lang.Throwable -> L21
            kotlin.coroutines.CoroutineContext r3 = r2.get$context()     // Catch: java.lang.Throwable -> L21
            java.lang.Object r1 = a9.b0.b(r3, r1)     // Catch: java.lang.Throwable -> L21
            a9.w r4 = a9.b0.f61a     // Catch: java.lang.Throwable -> L21
            r5 = 0
            if (r1 == r4) goto L24
            v8.s1 r4 = v8.q.b(r2, r3, r1)     // Catch: java.lang.Throwable -> L21
            goto L25
        L21:
            r1 = move-exception
            goto Lbd
        L24:
            r4 = r5
        L25:
            kotlin.coroutines.CoroutineContext r6 = r2.get$context()     // Catch: java.lang.Throwable -> L48
            java.lang.Object r7 = r12.j()     // Catch: java.lang.Throwable -> L48
            java.lang.Throwable r8 = r12.f(r7)     // Catch: java.lang.Throwable -> L48
            if (r8 != 0) goto L4a
            int r9 = r12.d     // Catch: java.lang.Throwable -> L48
            r10 = 1
            if (r9 == r10) goto L3d
            r11 = 2
            if (r9 != r11) goto L3c
            goto L3d
        L3c:
            r10 = 0
        L3d:
            if (r10 == 0) goto L4a
            v8.y0 r9 = v8.y0.f6058b     // Catch: java.lang.Throwable -> L48
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r9)     // Catch: java.lang.Throwable -> L48
            v8.z0 r6 = (v8.z0) r6     // Catch: java.lang.Throwable -> L48
            goto L4b
        L48:
            r2 = move-exception
            goto Lb1
        L4a:
            r6 = r5
        L4b:
            if (r6 == 0) goto L6a
            boolean r9 = r6.b()     // Catch: java.lang.Throwable -> L48
            if (r9 != 0) goto L6a
            v8.h1 r6 = (v8.h1) r6     // Catch: java.lang.Throwable -> L48
            java.util.concurrent.CancellationException r6 = r6.s()     // Catch: java.lang.Throwable -> L48
            r12.c(r7, r6)     // Catch: java.lang.Throwable -> L48
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L48
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r6)     // Catch: java.lang.Throwable -> L48
            java.lang.Object r6 = kotlin.Result.m95constructorimpl(r6)     // Catch: java.lang.Throwable -> L48
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L48
            goto L87
        L6a:
            if (r8 == 0) goto L7a
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L48
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r8)     // Catch: java.lang.Throwable -> L48
            java.lang.Object r6 = kotlin.Result.m95constructorimpl(r6)     // Catch: java.lang.Throwable -> L48
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L48
            goto L87
        L7a:
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L48
            java.lang.Object r6 = r12.h(r7)     // Catch: java.lang.Throwable -> L48
            java.lang.Object r6 = kotlin.Result.m95constructorimpl(r6)     // Catch: java.lang.Throwable -> L48
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L48
        L87:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L91
            boolean r2 = r4.M()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L94
        L91:
            a9.b0.a(r3, r1)     // Catch: java.lang.Throwable -> L21
        L94:
            r0.getClass()     // Catch: java.lang.Throwable -> L9e
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r0 = kotlin.Result.m95constructorimpl(r0)     // Catch: java.lang.Throwable -> L9e
            goto La9
        L9e:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m95constructorimpl(r0)
        La9:
            java.lang.Throwable r0 = kotlin.Result.m98exceptionOrNullimpl(r0)
            r12.i(r5, r0)
            goto Ldb
        Lb1:
            if (r4 == 0) goto Lb9
            boolean r4 = r4.M()     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto Lbc
        Lb9:
            a9.b0.a(r3, r1)     // Catch: java.lang.Throwable -> L21
        Lbc:
            throw r2     // Catch: java.lang.Throwable -> L21
        Lbd:
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> Lc9
            r0.getClass()     // Catch: java.lang.Throwable -> Lc9
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r0 = kotlin.Result.m95constructorimpl(r0)     // Catch: java.lang.Throwable -> Lc9
            goto Ld4
        Lc9:
            r0 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m95constructorimpl(r0)
        Ld4:
            java.lang.Throwable r0 = kotlin.Result.m98exceptionOrNullimpl(r0)
            r12.i(r1, r0)
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.f0.run():void");
    }

    public Object h(Object obj) {
        return obj;
    }
}
