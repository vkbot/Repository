package o7;

import java.io.IOException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class d0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4452b;
    public final Object c;

    public /* synthetic */ d0(int i10, Object obj) {
        this.f4452b = i10;
        this.c = obj;
    }

    public abstract void a();

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4452b) {
            case 0:
                n7.n nVar = (n7.n) this.c;
                n7.n a10 = nVar.a();
                try {
                    b();
                    return;
                } finally {
                    nVar.c(a10);
                }
            default:
                p7.c cVar = (p7.c) this.c;
                try {
                    if (cVar.f5025j != null) {
                        a();
                        return;
                    }
                    throw new IOException("Unable to perform write due to unavailable sink.");
                } catch (Exception e) {
                    cVar.e.n(e);
                    return;
                }
        }
    }
}
