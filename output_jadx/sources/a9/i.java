package a9;

import android.os.StrictMode;
import android.util.Log;
import java.util.concurrent.Callable;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f75b;
    public Object c;
    public final /* synthetic */ Object d;

    public i(o7.a aVar, Callable callable) {
        this.f75b = 5;
        this.c = aVar;
        this.d = callable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.c).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.c = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        u4.i.f5880g.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.c), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.d     // Catch: java.lang.Throwable -> L58
            u4.i r2 = (u4.i) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.c     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.d     // Catch: java.lang.Throwable -> L20
            u4.i r0 = (u4.i) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.d     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L7d
        L22:
            long r6 = r0.e     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.e = r6     // Catch: java.lang.Throwable -> L20
            r0.d = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.d     // Catch: java.lang.Throwable -> L20
            u4.i r4 = (u4.i) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.c = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.d     // Catch: java.lang.Throwable -> L20
            u4.i r0 = (u4.i) r0     // Catch: java.lang.Throwable -> L20
            r0.d = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.c     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.c = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = u4.i.f5880g     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.c     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.c = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.i.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc;
        switch (this.f75b) {
            case 0:
                j jVar = (j) this.d;
                v8.t tVar = jVar.f77b;
                int i10 = 0;
                while (true) {
                    try {
                        ((Runnable) this.c).run();
                    } catch (Throwable th) {
                        v8.w.a(th, EmptyCoroutineContext.INSTANCE);
                    }
                    Runnable y9 = jVar.y();
                    if (y9 != null) {
                        this.c = y9;
                        i10++;
                        if (i10 >= 16 && tVar.isDispatchNeeded(jVar)) {
                            tVar.dispatch(jVar, this);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            case 1:
                m.c cVar = (m.c) this.d;
                if (cVar.e) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.c).run();
                    return;
                } catch (Throwable th2) {
                    cVar.d.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
                        return;
                    }
                    return;
                }
            case 2:
                try {
                    a();
                    return;
                } catch (Error e) {
                    synchronized (((u4.i) this.d).c) {
                        ((u4.i) this.d).d = 1;
                        throw e;
                    }
                }
            case 3:
                synchronized (((z2.e) this.d).c) {
                    z2.a aVar = (z2.a) ((z2.e) this.d).d;
                    o7.a aVar2 = (o7.a) this.c;
                    synchronized (aVar2.f4388b) {
                        exc = (Exception) aVar2.e;
                    }
                    r2.a.b(exc);
                    aVar.a(exc);
                }
                return;
            case 4:
                synchronized (((z2.e) this.d).c) {
                    ((z2.b) ((z2.e) this.d).d).c(((o7.a) this.c).d());
                }
                return;
            default:
                o7.a aVar3 = (o7.a) this.c;
                try {
                    aVar3.g(((Callable) this.d).call());
                    return;
                } catch (Exception e6) {
                    aVar3.f(e6);
                    return;
                } catch (Throwable th3) {
                    aVar3.f(new RuntimeException(th3));
                    return;
                }
        }
    }

    public String toString() {
        String str;
        switch (this.f75b) {
            case 2:
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((u4.i) this.d).d;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                str = "null";
                            } else {
                                str = "RUNNING";
                            }
                        } else {
                            str = "QUEUED";
                        }
                    } else {
                        str = "QUEUING";
                    }
                } else {
                    str = "IDLE";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i(int i10, Object obj, Object obj2) {
        this.f75b = i10;
        this.d = obj;
        this.c = obj2;
    }

    public i(u4.i iVar) {
        this.f75b = 2;
        this.d = iVar;
    }
}
