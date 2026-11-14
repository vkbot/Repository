package h8;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i extends h {
    public final /* synthetic */ int d = 1;
    public Throwable e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f2676f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicInteger f2677g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2678h;

    public i(x7.d dVar, int i10) {
        super(dVar);
        this.f2678h = new l8.b(i10);
        this.f2677g = new AtomicInteger();
    }

    @Override // h8.h
    public final void c() {
        switch (this.d) {
            case 0:
                g();
                return;
            default:
                g();
                return;
        }
    }

    @Override // h8.h
    public final void e() {
        switch (this.d) {
            case 0:
                if (this.f2677g.getAndIncrement() == 0) {
                    ((l8.b) this.f2678h).clear();
                    return;
                }
                return;
            default:
                if (this.f2677g.getAndIncrement() == 0) {
                    ((AtomicReference) this.f2678h).lazySet(null);
                    return;
                }
                return;
        }
    }

    @Override // h8.h
    public final boolean f(Throwable th) {
        switch (this.d) {
            case 0:
                if (!this.f2676f && !this.c.c()) {
                    this.e = th;
                    this.f2676f = true;
                    g();
                    return true;
                }
                return false;
            default:
                if (!this.f2676f && !this.c.c()) {
                    this.e = th;
                    this.f2676f = true;
                    g();
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r9 != r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (r17.c.c() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        r5 = r17.f2676f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        if (r2.get() != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        if (r5 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (r12 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        r1 = r17.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
    
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0079, code lost:
    
        b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
    
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0064, code lost:
    
        r2.lazySet(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0083, code lost:
    
        if (r9 == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0085, code lost:
    
        e3.d.p(r17, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0088, code lost:
    
        r4 = r17.f2677g.addAndGet(-r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.i.g():void");
    }

    public i(x7.d dVar) {
        super(dVar);
        this.f2678h = new AtomicReference();
        this.f2677g = new AtomicInteger();
    }
}
