package m8;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d extends x7.k {

    /* renamed from: b, reason: collision with root package name */
    public static final b f3975b;
    public static final k c;
    public static final int d;
    public static final c e;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f3976a;

    /* JADX WARN: Type inference failed for: r0v3, types: [m8.c, m8.j] */
    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        d = availableProcessors;
        ?? jVar = new j(new k("RxComputationShutdown"));
        e = jVar;
        jVar.dispose();
        k kVar = new k("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        c = kVar;
        b bVar = new b(0, kVar);
        f3975b = bVar;
        for (c cVar : bVar.f3974b) {
            cVar.dispose();
        }
    }

    public d() {
        b bVar = f3975b;
        AtomicReference atomicReference = new AtomicReference(bVar);
        this.f3976a = atomicReference;
        b bVar2 = new b(d, c);
        while (!atomicReference.compareAndSet(bVar, bVar2)) {
            if (atomicReference.get() != bVar) {
                c[] cVarArr = bVar2.f3974b;
                for (c cVar : cVarArr) {
                    cVar.dispose();
                }
                return;
            }
        }
    }

    @Override // x7.k
    public final x7.j a() {
        c cVar;
        b bVar = (b) this.f3976a.get();
        int i10 = bVar.f3973a;
        if (i10 == 0) {
            cVar = e;
        } else {
            c[] cVarArr = bVar.f3974b;
            long j10 = bVar.c;
            bVar.c = 1 + j10;
            cVar = cVarArr[(int) (j10 % i10)];
        }
        return new a(cVar);
    }

    @Override // x7.k
    public final z7.a c(i8.p pVar) {
        c cVar;
        b bVar = (b) this.f3976a.get();
        int i10 = bVar.f3973a;
        if (i10 == 0) {
            cVar = e;
        } else {
            c[] cVarArr = bVar.f3974b;
            long j10 = bVar.c;
            bVar.c = 1 + j10;
            cVar = cVarArr[(int) (j10 % i10)];
        }
        cVar.getClass();
        l lVar = new l(pVar);
        try {
            lVar.a(cVar.f3985b.submit(lVar));
            return lVar;
        } catch (RejectedExecutionException e6) {
            a.a.s(e6);
            return c8.b.f578b;
        }
    }
}
