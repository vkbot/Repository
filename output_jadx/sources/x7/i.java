package x7;

import i8.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i implements z7.a, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final p f6508b;
    public final j c;
    public Thread d;

    public i(p pVar, j jVar) {
        this.f6508b = pVar;
        this.c = jVar;
    }

    @Override // z7.a
    public final void dispose() {
        if (this.d == Thread.currentThread()) {
            j jVar = this.c;
            if (jVar instanceof m8.j) {
                m8.j jVar2 = (m8.j) jVar;
                if (!jVar2.c) {
                    jVar2.c = true;
                    jVar2.f3985b.shutdown();
                    return;
                }
                return;
            }
        }
        this.c.dispose();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d = Thread.currentThread();
        try {
            this.f6508b.run();
        } finally {
            dispose();
            this.d = null;
        }
    }
}
