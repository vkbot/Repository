package z2;

import a9.i;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f6731b;
    public final Object d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6730a = 0;
    public final Object c = new Object();

    public e(Executor executor, a aVar) {
        this.f6731b = executor;
        this.d = aVar;
    }

    @Override // z2.f
    public final void a(o7.a aVar) {
        switch (this.f6730a) {
            case 0:
                if (!aVar.e()) {
                    synchronized (this.c) {
                    }
                    this.f6731b.execute(new i(3, this, aVar));
                    return;
                }
                return;
            default:
                if (aVar.e()) {
                    synchronized (this.c) {
                    }
                    this.f6731b.execute(new i(4, this, aVar));
                    return;
                }
                return;
        }
    }

    public e(Executor executor, b bVar) {
        this.f6731b = executor;
        this.d = bVar;
    }
}
