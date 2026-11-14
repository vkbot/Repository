package p7;

import o7.d0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends d0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i10) {
        super(1, cVar);
        this.d = i10;
        switch (i10) {
            case 1:
                this.e = cVar;
                super(1, cVar);
                w7.b.b();
                return;
            default:
                this.e = cVar;
                w7.b.b();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l9.l] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, l9.l] */
    @Override // o7.d0
    public final void a() {
        c cVar;
        int i10;
        c cVar2;
        switch (this.d) {
            case 0:
                ?? obj = new Object();
                w7.b.c();
                try {
                    w7.a aVar = w7.b.f6413a;
                    aVar.getClass();
                    synchronized (this.e.f5020b) {
                        l9.l lVar = this.e.c;
                        obj.write(lVar, lVar.y());
                        cVar = this.e;
                        cVar.f5022g = false;
                        i10 = cVar.f5029n;
                    }
                    cVar.f5025j.write(obj, obj.c);
                    synchronized (this.e.f5020b) {
                        this.e.f5029n -= i10;
                    }
                    aVar.getClass();
                    return;
                } catch (Throwable th) {
                    try {
                        w7.b.f6413a.getClass();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                ?? obj2 = new Object();
                w7.b.c();
                try {
                    w7.a aVar2 = w7.b.f6413a;
                    aVar2.getClass();
                    synchronized (this.e.f5020b) {
                        l9.l lVar2 = this.e.c;
                        obj2.write(lVar2, lVar2.c);
                        cVar2 = this.e;
                        cVar2.f5023h = false;
                    }
                    cVar2.f5025j.write(obj2, obj2.c);
                    this.e.f5025j.flush();
                    aVar2.getClass();
                    return;
                } catch (Throwable th3) {
                    try {
                        w7.b.f6413a.getClass();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
        }
    }
}
